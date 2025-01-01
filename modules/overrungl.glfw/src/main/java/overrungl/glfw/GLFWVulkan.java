/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

package overrungl.glfw;

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The GLFW Vulkan binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWVulkan {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwInitVulkanLoader`.
        public static final MethodHandle MH_glfwInitVulkanLoader = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwInitVulkanLoader", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetInstanceProcAddress`.
        public static final MethodHandle MH_glfwGetInstanceProcAddress = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetInstanceProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetPhysicalDevicePresentationSupport`.
        public static final MethodHandle MH_glfwGetPhysicalDevicePresentationSupport = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetPhysicalDevicePresentationSupport", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateWindowSurface`.
        public static final MethodHandle MH_glfwCreateWindowSurface = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwCreateWindowSurface", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    //endregion

    ///Sets the desired Vulkan `vkGetInstanceProcAddr` function.
    ///
    ///This function sets the `vkGetInstanceProcAddr` function that GLFW will use for all
    ///Vulkan related entry point queries.
    ///
    ///This feature is mostly useful on macOS, if your copy of the Vulkan loader is in
    ///a location where GLFW cannot find it through dynamic loading, or if you are still
    ///using the static library version of the loader.
    ///
    ///If set to `NULL`, GLFW will try to load the Vulkan loader dynamically by its standard
    ///name and get this function from there.  This is the default behavior.
    ///
    ///The standard name of the loader is `vulkan-1.dll` on Windows, `libvulkan.so.1` on
    ///Linux and other Unix-like systems and `libvulkan.1.dylib` on macOS.  If your code is
    ///also loading it via these names then you probably don't need to use this function.
    ///
    ///The function address you set is never reset by GLFW, but it only takes effect during
    ///initialization.  Once GLFW has been initialized, any updates will be ignored until the
    ///library is terminated and initialized again.
    ///
    ///@param loader The address of the function to use, or `NULL`.
    ///
    ///Loader function signature
    ///```c
    ///PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* name)
    ///```
    ///For more information about this function, see the
    ///[Vulkan Registry](https://www.khronos.org/registry/vulkan/).
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][GLFW#glfwInit()].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see GLFW#glfwInit() glfwInit
    public static void glfwInitVulkanLoader(@CType("PFN_vkGetInstanceProcAddr") java.lang.foreign.MemorySegment loader) {
        try {
            Handles.MH_glfwInitVulkanLoader.invokeExact(loader);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    ///Returns the address of the specified Vulkan instance function.
    ///
    ///This function returns the address of the specified Vulkan core or extension
    ///function for the specified instance.  If instance is set to `NULL` it can
    ///return any function exported from the Vulkan loader, including at least the
    ///following functions:
    ///- `vkEnumerateInstanceExtensionProperties`
    ///- `vkEnumerateInstanceLayerProperties`
    ///- `vkCreateInstance`
    ///- `vkGetInstanceProcAddr`
    ///
    ///If Vulkan is not available on the machine, this function returns `NULL` and
    ///generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()]
    ///to check whether Vulkan is at least minimally available.
    ///
    ///This function is equivalent to calling `vkGetInstanceProcAddr` with
    ///a platform-specific query of the Vulkan loader as a fallback.
    ///
    ///@param instance The Vulkan instance to query, or `NULL` to retrieve
    ///functions related to instance creation.
    ///@param procname The ASCII encoded name of the function.
    ///@return The address of the function, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
    ///[GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE].
    ///
    ///@glfw.pointer_lifetime The returned function pointer is valid until the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    public static @CType("GLFWvkproc") java.lang.foreign.MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("const char*") java.lang.foreign.MemorySegment procname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(instance, procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    ///Returns the address of the specified Vulkan instance function.
    ///
    ///This function returns the address of the specified Vulkan core or extension
    ///function for the specified instance.  If instance is set to `NULL` it can
    ///return any function exported from the Vulkan loader, including at least the
    ///following functions:
    ///- `vkEnumerateInstanceExtensionProperties`
    ///- `vkEnumerateInstanceLayerProperties`
    ///- `vkCreateInstance`
    ///- `vkGetInstanceProcAddr`
    ///
    ///If Vulkan is not available on the machine, this function returns `NULL` and
    ///generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()]
    ///to check whether Vulkan is at least minimally available.
    ///
    ///This function is equivalent to calling `vkGetInstanceProcAddr` with
    ///a platform-specific query of the Vulkan loader as a fallback.
    ///
    ///@param instance The Vulkan instance to query, or `NULL` to retrieve
    ///functions related to instance creation.
    ///@param procname The ASCII encoded name of the function.
    ///@return The address of the function, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
    ///[GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE].
    ///
    ///@glfw.pointer_lifetime The returned function pointer is valid until the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    public static @CType("GLFWvkproc") java.lang.foreign.MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("const char*") java.lang.String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(instance, Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    ///Returns whether the specified queue family can present images.
    ///
    ///This function returns whether the specified queue family of the specified
    ///physical device supports presentation to the platform GLFW was built for.
    ///
    ///If Vulkan or the required window surface creation instance extensions are
    ///not available on the machine, or if the specified instance was not created
    ///with the required extensions, this function returns `GLFW_FALSE` and
    ///generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()]
    ///to check whether Vulkan is at least minimally available and
    ///[glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] to check what instance extensions are
    ///required.
    ///
    ///@param instance The instance that the physical device belongs to.
    ///@param device The physical device that the queue family belongs to.
    ///@param queuefamily The index of the queue family to query.
    ///@return `GLFW_TRUE` if the queue family supports presentation, or
    ///`GLFW_FALSE` otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
    ///[GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __macOS:__ This function currently always returns `GLFW_TRUE`, as the
    ///`VK_MVK_macos_surface` and `VK_EXT_metal_surface` extensions do not provide
    ///a `vkGetPhysicalDevice*PresentationSupport` type function.
    ///
    ///@glfw.thread_safety This function may be called from any thread.  For
    ///synchronization details of Vulkan objects, see the Vulkan specification.
    public static @CType("int") boolean glfwGetPhysicalDevicePresentationSupport(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("VkPhysicalDevice") java.lang.foreign.MemorySegment device, @CType("uint32_t") int queuefamily) {
        try {
            return (int) Handles.MH_glfwGetPhysicalDevicePresentationSupport.invokeExact(instance, device, queuefamily) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPhysicalDevicePresentationSupport", e); }
    }

    ///Creates a Vulkan surface for the specified window.
    ///
    ///This function creates a Vulkan surface for the specified window.
    ///
    ///If the Vulkan loader or at least one minimally functional ICD were not found,
    ///this function returns `VK_ERROR_INITIALIZATION_FAILED` and generates a
    ///[GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()] to check whether
    ///Vulkan is at least minimally available.
    ///
    ///If the required window surface creation instance extensions are not
    ///available or if the specified instance was not created with these extensions
    ///enabled, this function returns `VK_ERROR_EXTENSION_NOT_PRESENT` and
    ///generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call
    ///[glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] to check what instance extensions are
    ///required.
    ///
    ///The window surface cannot be shared with another API so the window must
    ///have been created with the client api hint
    ///set to `GLFW_NO_API` otherwise it generates a [GLFW_INVALID_VALUE][GLFW#GLFW_INVALID_VALUE] error
    ///and returns `VK_ERROR_NATIVE_WINDOW_IN_USE_KHR`.
    ///
    ///The window surface must be destroyed before the specified Vulkan instance.
    ///It is the responsibility of the caller to destroy the window surface.  GLFW
    ///does not destroy it for you.  Call `vkDestroySurfaceKHR` to destroy the
    ///surface.
    ///
    ///@param instance The Vulkan instance to create the surface in.
    ///@param window The window to create the surface for.
    ///@param allocator The allocator to use, or `NULL` to use the default
    ///allocator.
    ///@param surface Where to store the handle of the surface.  This is set
    ///to `VK_NULL_HANDLE` if an error occurred.
    ///@return `VK_SUCCESS` if successful, or a Vulkan error code if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
    ///[GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE], [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR] and [GLFW_INVALID_VALUE][GLFW#GLFW_INVALID_VALUE]
    ///
    ///@glfw.remark If an error occurs before the creation call is made, GLFW returns
    ///the Vulkan error code most appropriate for the error.  Appropriate use of
    ///[glfwVulkanSupported][GLFW#glfwVulkanSupported()] and [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] should
    ///eliminate almost all occurrences of these errors.
    ///- __macOS:__ GLFW prefers the `VK_EXT_metal_surface` extension, with the
    ///    `VK_MVK_macos_surface` extension as a fallback.  The name of the selected
    ///    extension, if any, is included in the array returned by
    ///    [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)].
    ///
    ///    This function creates and sets a `CAMetalLayer` instance for
    ///    the window content view, which is required for MoltenVK to function.
    ///- __X11:__ By default GLFW prefers the `VK_KHR_xcb_surface` extension,
    ///    with the `VK_KHR_xlib_surface` extension as a fallback.  You can make
    ///    `VK_KHR_xlib_surface` the preferred extension by setting the
    ///    [GLFW_X11_XCB_VULKAN_SURFACE][GLFW#GLFW_X11_XCB_VULKAN_SURFACE] init
    ///    hint.  The name of the selected extension, if any, is included in the array
    ///    returned by [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  For
    ///synchronization details of Vulkan objects, see the Vulkan specification.
    ///
    ///@see GLFW#glfwGetRequiredInstanceExtensions(MemorySegment) glfwGetRequiredInstanceExtensions
    public static @CType("VkResult") int glfwCreateWindowSurface(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const VkAllocationCallbacks*") java.lang.foreign.MemorySegment allocator, @Out @CType("VkSurfaceKHR*") java.lang.foreign.MemorySegment surface) {
        try {
            return (int) Handles.MH_glfwCreateWindowSurface.invokeExact(instance, window, allocator, surface);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindowSurface", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWVulkan() {
    }
}
