/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.demo.vulkan;

import overrungl.demo.util.IOUtil;
import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWVidMode;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;
import overrungl.vulkan.*;
import overrungl.vulkan.khr.VKKHRSwapchain;
import overrungl.vulkan.khr.struct.VkPresentInfoKHR;
import overrungl.vulkan.khr.struct.VkSurfaceCapabilitiesKHR;
import overrungl.vulkan.khr.struct.VkSurfaceFormatKHR;
import overrungl.vulkan.khr.struct.VkSwapchainCreateInfoKHR;
import overrungl.vulkan.struct.*;
import overrungl.vulkan.union.VkClearColorValue;
import overrungl.vulkan.union.VkClearValue;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.*;

import static overrungl.glfw.GLFW.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK11.vkEnumerateInstanceVersion;
import static overrungl.vulkan.khr.VKKHRSurface.*;
import static overrungl.vulkan.khr.VKKHRSwapchain.*;

/**
 * @author squid233
 * @since 0.1.0
 */
public class VulkanDemo {
    private static final boolean ENABLE_VALIDATION_LAYERS = true;
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private MemorySegment window = MemorySegment.NULL;
    private VkInstance instance = null;
    private VkPhysicalDevice physicalDevice = null;
    private VkDevice device = null;
    private int graphicsQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    private VkQueue graphicsQueue = null;
    private long surface = VK_NULL_HANDLE;
    private int swapChainImageFormat = 0;
    private int swapChainWidth = 0;
    private int swapChainHeight = 0;
    private long swapChain = VK_NULL_HANDLE;
    private final List<Long> swapChainImages = new ArrayList<>();
    private final List<Long> swapChainImageViews = new ArrayList<>();
    private long renderPass = VK_NULL_HANDLE;
    private final List<Long> framebuffers = new ArrayList<>();
    private long pipelineLayout = VK_NULL_HANDLE;
    private long graphicsPipeline = VK_NULL_HANDLE;
    private long commandPool = VK_NULL_HANDLE;
    private VkCommandBuffer commandBuffer = null;
    private long imageAvailableSemaphore = VK_NULL_HANDLE;
    private long renderFinishedSemaphore = VK_NULL_HANDLE;
    private long inFlightFence = VK_NULL_HANDLE;

    private void init() {
        if (!glfwInit()) {
            throw new IllegalStateException("failed to initialize GLFW");
        }

        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);
        GLFWVidMode videoMode = GLFWVidMode.ofNative(glfwGetVideoMode(glfwGetPrimaryMonitor()));
        if (videoMode != null) {
            glfwWindowHint(GLFW_POSITION_X, (videoMode.width() - WIDTH) / 2);
            glfwWindowHint(GLFW_POSITION_Y, (videoMode.height() - HEIGHT) / 2);
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            window = glfwCreateWindow(WIDTH, HEIGHT, stack.allocateFrom("vulkan-test"), MemorySegment.NULL, MemorySegment.NULL);
        }
        if (MemoryUtil.isNullPointer(window)) {
            throw new IllegalStateException("failed to create window");
        }

        initVulkan();
    }

    private void initVulkan() {
        VK.create(GLFW::glfwGetInstanceProcAddress);
        createInstance();
        pickPhysicalDevice();
        createDevice();
        createSurface();
        createSwapChain();
        createRenderPass();
        createFramebuffer();
        createPipelineLayout();
        createGraphicsPipeline();
        createCommandPool();
        createCommandBuffer();
        createSync();
    }

    private void createInstance() {
        int instanceVersion;
        if (MemoryUtil.isNullPointer(VK.globalCommands().PFN_vkEnumerateInstanceVersion)) {
            instanceVersion = VK_API_VERSION_1_0;
        } else {
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                MemorySegment p = stack.allocate(ValueLayout.JAVA_INT);
                vkEnumerateInstanceVersion(p);
                instanceVersion = p.get(ValueLayout.JAVA_INT, 0);
            }
        }
        System.out.println("Instance version: " + versionString(instanceVersion));
        System.out.println();


        String[] instanceLayerNames;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
            vkEnumerateInstanceLayerProperties(pCount, MemorySegment.NULL);
            int count = pCount.get(ValueLayout.JAVA_INT, 0);
            instanceLayerNames = new String[count + 1];

            var properties = VkLayerProperties.alloc(stack, count);
            vkEnumerateInstanceLayerProperties(pCount, properties.segment());
            System.out.println("===== Instance layer properties =====");
            for (int i = 0; i < count; i++) {
                String layerName = MemoryUtil.nativeString(properties.layerNameAt(i));
                instanceLayerNames[i + 1] = layerName;
                printLayerProperty(properties, i);
            }
            System.out.println();
        }


        for (String layerName : instanceLayerNames) {
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                MemorySegment pLayerName = MemoryUtil.allocString(stack, layerName);
                MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
                vkEnumerateInstanceExtensionProperties(pLayerName, pCount, MemorySegment.NULL);
                int count = pCount.get(ValueLayout.JAVA_INT, 0);

                var properties = VkExtensionProperties.alloc(stack, count);
                vkEnumerateInstanceExtensionProperties(pLayerName, pCount, properties.segment());
                System.out.println("===== Instance extension properties for layer " + layerName + " =====");
                printExtensionProperties(properties, count);
                System.out.println();

            }
        }


        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pExtCount = stack.allocate(ValueLayout.JAVA_INT);
            MemorySegment extensions = glfwGetRequiredInstanceExtensions(pExtCount);

            VkInstanceCreateInfo createInfo = VkInstanceCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
                .pApplicationInfo(VkApplicationInfo.alloc(stack)
                    .sType(VK_STRUCTURE_TYPE_APPLICATION_INFO)
                    .pApplicationName(stack.allocateFrom("vulkan-test"))
                    .applicationVersion(VK_MAKE_API_VERSION(0, 0, 0, 1))
                    .pEngineName(stack.allocateFrom("No Engine"))
                    .engineVersion(VK_MAKE_API_VERSION(0, 0, 0, 1))
                    .apiVersion(instanceVersion == VK_API_VERSION_1_0 ? VK_API_VERSION_1_0 : VK_API_VERSION_1_4)
                    .segment())
                .enabledLayerCount(ENABLE_VALIDATION_LAYERS ? 1 : 0)
                .ppEnabledLayerNames(ENABLE_VALIDATION_LAYERS ? stack.addresses(stack.allocateFrom("VK_LAYER_KHRONOS_validation")) : MemorySegment.NULL)
                .enabledExtensionCount(pExtCount.get(ValueLayout.JAVA_INT, 0))
                .ppEnabledExtensionNames(extensions);
            MemorySegment p = stack.allocate(ValueLayout.ADDRESS);
            check(vkCreateInstance(createInfo.segment(), MemorySegment.NULL, p), "failed to create instance");
            instance = new VkInstance(p.get(ValueLayout.ADDRESS, 0));
        }
    }

    private void pickPhysicalDevice() {
        VkPhysicalDevice[] physicalDevices;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pDeviceCount = stack.allocate(ValueLayout.JAVA_INT);
            vkEnumeratePhysicalDevices(instance, pDeviceCount, MemorySegment.NULL);
            int count = pDeviceCount.get(ValueLayout.JAVA_INT, 0);

            MemorySegment pDevices = stack.allocate(ValueLayout.ADDRESS, count);
            vkEnumeratePhysicalDevices(instance, pDeviceCount, pDevices);
            physicalDevices = new VkPhysicalDevice[count];

            for (int i = 0; i < count; i++) {
                physicalDevices[i] = new VkPhysicalDevice(pDevices.getAtIndex(ValueLayout.ADDRESS, i), instance);
            }
        }
        if (physicalDevices.length == 0) {
            throw new IllegalStateException("failed to enumerate physical devices");
        }


        for (VkPhysicalDevice physicalDevice : physicalDevices) {
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                var properties = VkPhysicalDeviceProperties.alloc(stack);
                vkGetPhysicalDeviceProperties(physicalDevice, properties.segment());
                int apiVersion = properties.apiVersion();
                int driverVersion = properties.driverVersion();
                int vendorID = properties.vendorID();
                int deviceID = properties.deviceID();
                int deviceType = properties.deviceType();
                String deviceName = MemoryUtil.nativeString(properties.deviceName());
                UUID pipelineCacheUUID = UUID.nameUUIDFromBytes(MemoryUtil.asByteArray(properties.pipelineCacheUUID()));

                System.out.println("===== Physical device properties for handle 0x" + Long.toHexString(physicalDevice.segment().address()) + " =====");
                System.out.println("API version: " + versionString(apiVersion));
                System.out.println("Driver version: " + versionString(driverVersion));
                System.out.println("Vendor ID: " + vendorID);
                System.out.println("Device ID: " + deviceID);
                System.out.println("Device type: " + switch (deviceType) {
                    case VK_PHYSICAL_DEVICE_TYPE_OTHER -> "Other";
                    case VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU -> "Integrated GPU";
                    case VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU -> "Discrete GPU";
                    case VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU -> "Virtual GPU";
                    case VK_PHYSICAL_DEVICE_TYPE_CPU -> "CPU";
                    default -> "Unknown type " + deviceType;
                });
                System.out.println("Device name: " + deviceName);
                System.out.println("Pipeline Cache UUID: " + pipelineCacheUUID);
                System.out.println();
            }
        }


        Map<MemorySegment, String[]> physicalDeviceLayerNames = HashMap.newHashMap(physicalDevices.length);
        for (VkPhysicalDevice physicalDevice : physicalDevices) {
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
                vkEnumerateDeviceLayerProperties(physicalDevice, pCount, MemorySegment.NULL);
                int count = pCount.get(ValueLayout.JAVA_INT, 0);

                var properties = VkLayerProperties.alloc(stack, count);
                vkEnumerateDeviceLayerProperties(physicalDevice, pCount, properties.segment());

                System.out.println("===== Physical device layer properties for handle 0x" + Long.toHexString(physicalDevice.segment().address()) + " =====");
                String[] array = new String[count + 1];
                physicalDeviceLayerNames.put(physicalDevice.segment(), array);
                for (int i = 0; i < count; i++) {
                    String layerName = MemoryUtil.nativeString(properties.layerNameAt(i));
                    array[i + 1] = layerName;
                    printLayerProperty(properties, i);
                }
                System.out.println();
            }
        }


        for (VkPhysicalDevice physicalDevice : physicalDevices) {
            for (String layerName : physicalDeviceLayerNames.get(physicalDevice.segment())) {
                try (MemoryStack stack = MemoryStack.pushLocal()) {
                    MemorySegment pLayerName = MemoryUtil.allocString(stack, layerName);
                    MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
                    vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, pCount, MemorySegment.NULL);
                    int count = pCount.get(ValueLayout.JAVA_INT, 0);

                    var properties = VkExtensionProperties.alloc(stack, count);
                    vkEnumerateDeviceExtensionProperties(physicalDevice, pLayerName, pCount, properties.segment());
                    System.out.println("===== Physical device extension properties for handle 0x" + Long.toHexString(physicalDevice.segment().address()) + " layer " + layerName + " =====");
                    printExtensionProperties(properties, count);
                    System.out.println();
                }
            }
        }

        // let's select the first physical device.
        physicalDevice = physicalDevices[0];
    }

    private void createDevice() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pCount, MemorySegment.NULL);
            int count = pCount.get(ValueLayout.JAVA_INT, 0);

            var properties = VkQueueFamilyProperties.alloc(stack, count);
            vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pCount, properties.segment());
            for (int i = 0; i < count; i++) {
                if ((properties.queueFlagsAt(i) & VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsQueueFamilyIndex = i;
                    break;
                }
            }
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            String[] extensionNames = {VKKHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME};

            var createInfo = VkDeviceCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO)
                .queueCreateInfoCount(1)
                .pQueueCreateInfos(VkDeviceQueueCreateInfo.alloc(stack)
                    .sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO)
                    .queueFamilyIndex(graphicsQueueFamilyIndex)
                    .queueCount(1)
                    .pQueuePriorities(stack.floats(1.0f))
                    .segment())
                .enabledLayerCount(0)
                .enabledExtensionCount(extensionNames.length)
                .ppEnabledExtensionNames(MemoryUtil.allocArray(stack, extensionNames));
            MemorySegment pDevice = stack.allocate(ValueLayout.ADDRESS);
            check(vkCreateDevice(physicalDevice, createInfo.segment(), MemorySegment.NULL, pDevice), "failed to create device");
            device = new VkDevice(pDevice.get(ValueLayout.ADDRESS, 0), physicalDevice);
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment p = stack.allocate(ValueLayout.ADDRESS);
            vkGetDeviceQueue(device, graphicsQueueFamilyIndex, 0, p);
            graphicsQueue = new VkQueue(p.get(ValueLayout.ADDRESS, 0), device);
        }
    }

    private void createSurface() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(glfwCreateWindowSurface(instance.segment(), window, MemorySegment.NULL, p), "failed to create surface");
            surface = p.get(ValueLayout.JAVA_LONG, 0);
        }
    }

    private void createSwapChain() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var surfaceCapabilities = VkSurfaceCapabilitiesKHR.alloc(stack);
            vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, surfaceCapabilities.segment());

            MemorySegment pSurfaceFormatCount = stack.allocate(ValueLayout.JAVA_INT);
            vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, MemorySegment.NULL);
            int surfaceFormatCount = pSurfaceFormatCount.get(ValueLayout.JAVA_INT, 0);

            var surfaceFormats = VkSurfaceFormatKHR.alloc(stack, surfaceFormatCount);
            vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, surfaceFormats.segment());

            int imageFormat = -1;
            int imageColorSpace = -1;
            for (int i = 0; i < surfaceFormatCount; i++) {
                if (surfaceFormats.colorSpaceAt(i) == VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) {
                    imageFormat = surfaceFormats.formatAt(i);
                    imageColorSpace = surfaceFormats.colorSpaceAt(i);
                    break;
                }
            }
            if (imageFormat == -1 || imageColorSpace == -1) {
                imageFormat = surfaceFormats.formatAt(0);
                imageColorSpace = surfaceFormats.colorSpaceAt(0);
            }
            swapChainImageFormat = imageFormat;

            int imageCount = surfaceCapabilities.minImageCount();
            if (surfaceCapabilities.maxImageCount() > surfaceCapabilities.minImageCount()) {
                imageCount++;
            }

            var imageExtent = VkExtent2D.alloc(stack);
            glfwGetFramebufferSize(window, imageExtent.segment(), imageExtent.segment().asSlice(4));
            swapChainWidth = imageExtent.width();
            swapChainHeight = imageExtent.height();

            int compositeAlpha = VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
            if ((surfaceCapabilities.supportedCompositeAlpha() & VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR) != 0) {
                compositeAlpha = VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;
            } else {
                for (int i = 0; i < 4; i++) {
                    int value = surfaceCapabilities.supportedCompositeAlpha() & (1 << i);
                    if (value != 0) {
                        compositeAlpha = value;
                        break;
                    }
                }
            }

            var createInfo = VkSwapchainCreateInfoKHR.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR)
                .surface(surface)
                .minImageCount(imageCount)
                .imageFormat(imageFormat)
                .imageColorSpace(imageColorSpace)
                .imageExtent(imageExtent.segment())
                .imageArrayLayers(1)
                .imageUsage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT)
                .imageSharingMode(VK_SHARING_MODE_EXCLUSIVE)
                .queueFamilyIndexCount(0)
                .pQueueFamilyIndices(stack.ints(graphicsQueueFamilyIndex))
                .preTransform(surfaceCapabilities.currentTransform())
                .compositeAlpha(compositeAlpha)
                .presentMode(VK_PRESENT_MODE_FIFO_KHR)
                .clipped(VK_TRUE);
            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateSwapchainKHR(device, createInfo.segment(), MemorySegment.NULL, p), "failed to create swap chain");
            swapChain = p.get(ValueLayout.JAVA_LONG, 0);
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pCount = stack.allocate(ValueLayout.JAVA_INT);
            vkGetSwapchainImagesKHR(device, swapChain, pCount, MemorySegment.NULL);
            int count = pCount.get(ValueLayout.JAVA_INT, 0);

            MemorySegment pImages = stack.allocate(ValueLayout.JAVA_LONG, count);
            vkGetSwapchainImagesKHR(device, swapChain, pCount, pImages);
            for (int i = 0; i < count; i++) {
                swapChainImages.add(pImages.getAtIndex(ValueLayout.JAVA_LONG, i));
            }
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            for (Long image : swapChainImages) {
                var createInfo = VkImageViewCreateInfo.alloc(stack)
                    .sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
                    .image(image)
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(swapChainImageFormat)
                    .components(VkComponentMapping.alloc(stack).segment())
                    .subresourceRange(VkImageSubresourceRange.alloc(stack)
                        .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1)
                        .segment());
                MemorySegment pView = stack.allocate(ValueLayout.JAVA_LONG);
                vkCreateImageView(device, createInfo.segment(), MemorySegment.NULL, pView);
                swapChainImageViews.add(pView.get(ValueLayout.JAVA_LONG, 0));
            }
        }
    }

    private void createRenderPass() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var createInfo = VkRenderPassCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO)
                .attachmentCount(1)
                .pAttachments(VkAttachmentDescription.alloc(stack)
                    .format(swapChainImageFormat)
                    .samples(VK_SAMPLE_COUNT_1_BIT)
                    .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                    .storeOp(VK_ATTACHMENT_STORE_OP_STORE)
                    .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
                    .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                    .initialLayout(VK_IMAGE_LAYOUT_UNDEFINED)
                    .finalLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR)
                    .segment())
                .subpassCount(1)
                .pSubpasses(VkSubpassDescription.alloc(stack)
                    .pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS)
                    .colorAttachmentCount(1)
                    .pColorAttachments(VkAttachmentReference.alloc(stack)
                        .attachment(0)
                        .layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                        .segment())
                    .segment());
            MemorySegment pRp = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateRenderPass(device, createInfo.segment(), MemorySegment.NULL, pRp), "failed to create render pass");
            renderPass = pRp.get(ValueLayout.JAVA_LONG, 0);
        }
    }

    private void createFramebuffer() {
        for (Long imageView : swapChainImageViews) {
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                var createInfo = VkFramebufferCreateInfo.alloc(stack)
                    .sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO)
                    .renderPass(renderPass)
                    .attachmentCount(1)
                    .pAttachments(stack.longs(imageView))
                    .width(swapChainWidth)
                    .height(swapChainHeight)
                    .layers(1);
                MemorySegment pFb = stack.allocate(ValueLayout.JAVA_LONG);
                check(vkCreateFramebuffer(device, createInfo.segment(), MemorySegment.NULL, pFb), "failed to create framebuffer");
                framebuffers.add(pFb.get(ValueLayout.JAVA_LONG, 0));
            }
        }
    }

    private void createPipelineLayout() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var createInfo = VkPipelineLayoutCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreatePipelineLayout(device, createInfo.segment(), MemorySegment.NULL, p), "failed to create pipeline layout");
            pipelineLayout = p.get(ValueLayout.JAVA_LONG, 0);
        }
    }

    private long createShaderModule(String filename) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment code = IOUtil.ioResourceToSegment(arena, filename);
            var createInfo = VkShaderModuleCreateInfo.alloc(arena)
                .sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO)
                .codeSize(code.byteSize())
                .pCode(code);
            MemorySegment p = arena.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateShaderModule(device, createInfo.segment(), MemorySegment.NULL, p), "failed to create shader module from " + filename);
            return p.get(ValueLayout.JAVA_LONG, 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createGraphicsPipeline() {
        long vertexShader = createShaderModule("vk/vert.spv");
        long fragmentShader = createShaderModule("vk/frag.spv");

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment main = stack.allocateFrom("main");

            var stages = VkPipelineShaderStageCreateInfo.alloc(stack, 2)
                .sTypeAt(0, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                .stageAt(0, VK_SHADER_STAGE_VERTEX_BIT)
                .moduleAt(0, vertexShader)
                .pNameAt(0, main)
                .sTypeAt(1, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                .stageAt(1, VK_SHADER_STAGE_FRAGMENT_BIT)
                .moduleAt(1, fragmentShader)
                .pNameAt(1, main);

            var vertexInputState = VkPipelineVertexInputStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO)
                .vertexBindingDescriptionCount(0)
                .vertexAttributeDescriptionCount(0);

            var inputAssemblyState = VkPipelineInputAssemblyStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO)
                .topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST)
                .primitiveRestartEnable(VK_FALSE);

            var viewportState = VkPipelineViewportStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO)
                .viewportCount(1)
                .scissorCount(1);

            var rasterizationState = VkPipelineRasterizationStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO)
                .depthClampEnable(VK_FALSE)
                .rasterizerDiscardEnable(VK_FALSE)
                .polygonMode(VK_POLYGON_MODE_FILL)
                .cullMode(VK_CULL_MODE_BACK_BIT)
                .frontFace(VK_FRONT_FACE_COUNTER_CLOCKWISE)
                .depthBiasEnable(VK_FALSE)
                .lineWidth(1.0f);

            var multisampleState = VkPipelineMultisampleStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO)
                .rasterizationSamples(VK_SAMPLE_COUNT_1_BIT)
                .sampleShadingEnable(VK_FALSE)
                .alphaToCoverageEnable(VK_FALSE)
                .alphaToOneEnable(VK_FALSE);

            var colorBlendState = VkPipelineColorBlendStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO)
                .logicOpEnable(VK_FALSE)
                .attachmentCount(1)
                .pAttachments(VkPipelineColorBlendAttachmentState.alloc(stack)
                    .blendEnable(VK_FALSE)
                    .colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT)
                    .segment());

            var dynamicState = VkPipelineDynamicStateCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO)
                .dynamicStateCount(2)
                .pDynamicStates(stack.ints(VK_DYNAMIC_STATE_VIEWPORT, VK_DYNAMIC_STATE_SCISSOR));

            var createInfo = VkGraphicsPipelineCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO)
                .stageCount(2)
                .pStages(stages.segment())
                .pVertexInputState(vertexInputState.segment())
                .pInputAssemblyState(inputAssemblyState.segment())
                .pTessellationState(MemorySegment.NULL)
                .pViewportState(viewportState.segment())
                .pRasterizationState(rasterizationState.segment())
                .pMultisampleState(multisampleState.segment())
                .pDepthStencilState(MemorySegment.NULL)
                .pColorBlendState(colorBlendState.segment())
                .pDynamicState(dynamicState.segment())
                .layout(pipelineLayout)
                .renderPass(renderPass)
                .subpass(0);
            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateGraphicsPipelines(device, VK_NULL_HANDLE, 1, createInfo.segment(), MemorySegment.NULL, p), "failed to create graphics pipeline");
            graphicsPipeline = p.get(ValueLayout.JAVA_LONG, 0);
        } finally {
            vkDestroyShaderModule(device, vertexShader, MemorySegment.NULL);
            vkDestroyShaderModule(device, fragmentShader, MemorySegment.NULL);
        }
    }

    private void createCommandPool() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var createInfo = VkCommandPoolCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO)
                .flags(VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT)
                .queueFamilyIndex(graphicsQueueFamilyIndex);
            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateCommandPool(device, createInfo.segment(), MemorySegment.NULL, p), "failed to create command pool");
            commandPool = p.get(ValueLayout.JAVA_LONG, 0);
        }
    }

    private void createCommandBuffer() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var createInfo = VkCommandBufferAllocateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO)
                .commandPool(commandPool)
                .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                .commandBufferCount(1);
            MemorySegment p = stack.allocate(ValueLayout.ADDRESS);
            check(vkAllocateCommandBuffers(device, createInfo.segment(), p), "failed to allocate command buffer");
            commandBuffer = new VkCommandBuffer(p.get(ValueLayout.ADDRESS, 0), device);
        }
    }

    private void createSync() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var semaphoreCreateInfo = VkSemaphoreCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);
            var fenceCreateInfo = VkFenceCreateInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);

            MemorySegment p = stack.allocate(ValueLayout.JAVA_LONG);
            check(vkCreateSemaphore(device, semaphoreCreateInfo.segment(), MemorySegment.NULL, p), "failed to create image available semaphore");
            imageAvailableSemaphore = p.get(ValueLayout.JAVA_LONG, 0);

            check(vkCreateSemaphore(device, semaphoreCreateInfo.segment(), MemorySegment.NULL, p), "failed to create render finished semaphore");
            renderFinishedSemaphore = p.get(ValueLayout.JAVA_LONG, 0);

            check(vkCreateFence(device, fenceCreateInfo.segment(), MemorySegment.NULL, p), "failed to create in flight fence");
            inFlightFence = p.get(ValueLayout.JAVA_LONG, 0);
        }
    }

    private void run() {
        while (!glfwWindowShouldClose(window)) {
            if (glfwGetWindowAttrib(window, GLFW_ICONIFIED) == GLFW_TRUE) {
                glfwWaitEvents();
            }
            glfwPollEvents();
            render();
        }
        vkDeviceWaitIdle(device);
    }

    private void render() {
        int imageIndex;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment p = stack.allocate(ValueLayout.JAVA_INT);
            check(vkAcquireNextImageKHR(device, swapChain, -1, imageAvailableSemaphore, VK_NULL_HANDLE, p), "failed to acquire next image");
            imageIndex = p.get(ValueLayout.JAVA_INT, 0);
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var beginInfo = VkCommandBufferBeginInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO)
                .flags(VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);
            check(vkBeginCommandBuffer(commandBuffer, beginInfo.segment()), "failed to begin command buffer");
        }
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var beginInfo = VkRenderPassBeginInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO)
                .renderPass(renderPass)
                .framebuffer(framebuffers.get(imageIndex))
                .renderArea(VkRect2D.alloc(stack)
                    .offset(VkOffset2D.alloc(stack).segment())
                    .extent(VkExtent2D.alloc(stack).width(swapChainWidth).height(swapChainHeight).segment())
                    .segment())
                .clearValueCount(1)
                .pClearValues(VkClearValue.alloc(stack)
                    .color(VkClearColorValue.alloc(stack)
                        .float32(stack.floats(0.0f, 0.0f, 0.0f, 1.0f))
                        .segment())
                    .segment());
            vkCmdBeginRenderPass(commandBuffer, beginInfo.segment(), VK_SUBPASS_CONTENTS_INLINE);
        }
        vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, graphicsPipeline);
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var viewport = VkViewport.alloc(stack)
                .x(0.0f)
                .y(0.0f)
                .width(swapChainWidth)
                .height(swapChainHeight)
                .minDepth(0.0f)
                .maxDepth(1.0f);
            var scissor = VkRect2D.alloc(stack)
                .offset(VkOffset2D.alloc(stack).segment())
                .extent(VkExtent2D.alloc(stack).width(swapChainWidth).height(swapChainHeight).segment());
            vkCmdSetViewport(commandBuffer, 0, 1, viewport.segment());
            vkCmdSetScissor(commandBuffer, 0, 1, scissor.segment());
        }
        vkCmdDraw(commandBuffer, 3, 1, 0, 0);
        vkCmdEndRenderPass(commandBuffer);
        check(vkEndCommandBuffer(commandBuffer), "failed to end command buffer");

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var submitInfo = VkSubmitInfo.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_SUBMIT_INFO)
                .waitSemaphoreCount(1)
                .pWaitSemaphores(stack.longs(imageAvailableSemaphore))
                .pWaitDstStageMask(stack.ints(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT))
                .commandBufferCount(1)
                .pCommandBuffers(stack.addresses(commandBuffer.segment()))
                .signalSemaphoreCount(1)
                .pSignalSemaphores(stack.longs(renderFinishedSemaphore));
            check(vkQueueSubmit(graphicsQueue, 1, submitInfo.segment(), inFlightFence), "failed to submit command buffer to graphics queue");
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var presentInfo = VkPresentInfoKHR.alloc(stack)
                .sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR)
                .waitSemaphoreCount(1)
                .pWaitSemaphores(stack.longs(renderFinishedSemaphore))
                .swapchainCount(1)
                .pSwapchains(stack.longs(swapChain))
                .pImageIndices(stack.ints(imageIndex));
            check(vkQueuePresentKHR(graphicsQueue, presentInfo.segment()), "failed to present graphics queue");
        }

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pFences = stack.longs(inFlightFence);
            vkWaitForFences(device, 1, pFences, VK_TRUE, -1);
            vkResetFences(device, 1, pFences);
        }
    }

    private void dispose() {
        if (device != null) {
            vkDestroyFence(device, inFlightFence, MemorySegment.NULL);
            vkDestroySemaphore(device, renderFinishedSemaphore, MemorySegment.NULL);
            vkDestroySemaphore(device, imageAvailableSemaphore, MemorySegment.NULL);
            vkDestroyCommandPool(device, commandPool, MemorySegment.NULL);
            vkDestroyPipeline(device, graphicsPipeline, MemorySegment.NULL);
            vkDestroyPipelineLayout(device, pipelineLayout, MemorySegment.NULL);
            for (Long framebuffer : framebuffers) {
                vkDestroyFramebuffer(device, framebuffer, MemorySegment.NULL);
            }
            vkDestroyRenderPass(device, renderPass, MemorySegment.NULL);
            for (Long imageView : swapChainImageViews) {
                vkDestroyImageView(device, imageView, MemorySegment.NULL);
            }
            vkDestroySwapchainKHR(device, swapChain, MemorySegment.NULL);
            vkDestroySurfaceKHR(instance, surface, MemorySegment.NULL);
            vkDestroyDevice(device, MemorySegment.NULL);
        }
        if (instance != null) {
            vkDestroyInstance(instance, MemorySegment.NULL);
        }

        glfwDestroyWindow(window);
        glfwTerminate();
    }

    public static void main(String[] args) {
        VulkanDemo app = new VulkanDemo();
        try {
            app.init();
            app.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            app.dispose();
        }
    }

    private static void check(int result, String message) {
        if (result != VK_SUCCESS) {
            throw new IllegalStateException(result + ": " + message);
        }
    }

    private static String versionString(int version) {
        return VK_API_VERSION_MAJOR(version) + "." + VK_API_VERSION_MINOR(version) + "." + VK_API_VERSION_PATCH(version);
    }

    private static void printLayerProperty(VkLayerProperties.Buffer properties, int i) {
        String layerName = MemoryUtil.nativeString(properties.layerNameAt(i));
        int specVersion = properties.specVersionAt(i);
        int implementationVersion = properties.implementationVersionAt(i);
        String description = MemoryUtil.nativeString(properties.descriptionAt(i));
        System.out.println("==========");
        System.out.println("Layer name: " + layerName);
        System.out.println("Spec version: " + versionString(specVersion));
        System.out.println("Implementation version: " + versionString(implementationVersion));
        System.out.println("Description: " + description);
    }

    private static void printExtensionProperties(VkExtensionProperties.Buffer properties, int count) {
        for (int i = 0; i < count; i++) {
            String extensionName = MemoryUtil.nativeString(properties.extensionNameAt(i));
            int specVersion = properties.specVersionAt(i);
            System.out.println(extensionName + ": " + specVersion);
        }
    }
}
