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

import overrungl.glfw.GLFW;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;
import overrungl.vulkan.VK;
import overrungl.vulkan.VkInstance;
import overrungl.vulkan.VkPhysicalDevice;
import overrungl.vulkan.struct.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static overrungl.glfw.GLFW.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK11.vkEnumerateInstanceVersion;

/**
 * @author squid233
 * @since 0.1.0
 */
public class VulkanDemo {
    public static void main(String[] args) {
        if (!glfwInit()) {
            throw new IllegalStateException("failed to initialize GLFW");
        }
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        MemorySegment window;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            window = glfwCreateWindow(640, 480, stack.allocateFrom("vulkan-test"), MemorySegment.NULL, MemorySegment.NULL);
        }
        if (MemoryUtil.isNullPointer(window)) {
            throw new IllegalStateException("failed to create window");
        }

        VK.create(GLFW::glfwGetInstanceProcAddress);


        int instanceVersion;
        if (MemoryUtil.isNullPointer(VK.functionLookup().invoke(MemorySegment.NULL, "vkEnumerateInstanceVersion"))) {
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


        VkInstance instance;
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
                .enabledLayerCount(0)
                .ppEnabledLayerNames(MemorySegment.NULL)
                .enabledExtensionCount(pExtCount.get(ValueLayout.JAVA_INT, 0))
                .ppEnabledExtensionNames(extensions);
            MemorySegment p = stack.allocate(ValueLayout.ADDRESS);
            if (vkCreateInstance(createInfo.segment(), MemorySegment.NULL, p) != VK_SUCCESS) {
                throw new IllegalStateException("failed to create instance");
            }
            instance = new VkInstance(p.get(ValueLayout.ADDRESS, 0));
        }


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


        vkDestroyInstance(instance, MemorySegment.NULL);

        glfwDestroyWindow(window);
        glfwTerminate();
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
