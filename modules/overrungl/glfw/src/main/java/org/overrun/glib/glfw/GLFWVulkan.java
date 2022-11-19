/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;

import static org.overrun.glib.glfw.Handles.*;

/**
 * The GLFW Vulkan binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWVulkan {
    static {
        create();
    }

    /**
     * constructor
     */
    protected GLFWVulkan() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Returns the address of the specified Vulkan instance function.
     * <p>
     * This function returns the address of the specified Vulkan core or extension
     * function for the specified instance.  If instance is set to {@link MemoryAddress#NULL NULL} it can
     * return any function exported from the Vulkan loader, including at least the
     * following functions:
     *
     * <ul>
     *     <li>{@code vkEnumerateInstanceExtensionProperties}</li>
     *     <li>{@code vkEnumerateInstanceLayerProperties}</li>
     *     <li>{@code vkCreateInstance}</li>
     *     <li>{@code vkGetInstanceProcAddr}</li>
     * </ul>
     * <p>
     *  If Vulkan is not available on the machine, this function returns {@link MemoryAddress#NULL NULL} and
     *  generates a {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE} error.  Call {@link GLFW#vulkanSupported vulkanSupported}
     *  to check whether Vulkan is at least minimally available.
     * <p>
     *  This function is equivalent to calling {@code vkGetInstanceProcAddr} with
     *  a platform-specific query of the Vulkan loader as a fallback.
     * <!-- todo don't leave a blank line -->
     *  @param instance The Vulkan instance to query, or {@link MemoryAddress#NULL NULL} to retrieve
     *  functions related to instance creation.
     *  @param procName The ASCII encoded name of the function.
     *  @return The address of the function, or {@link MemoryAddress#NULL NULL} if an
     *  <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     *  @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED NOT_INITIALIZED} and
     *  {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE}.
     *  @glfw.pointer_lifetime The returned function pointer is valid until the library
     *  is terminated.
     *  @glfw.thread_safety This function may be called from any thread.
     */
    public static MemoryAddress nglfwGetInstanceProcAddress(Addressable instance, Addressable procName) {
        try {
            return (MemoryAddress) glfwGetInstanceProcAddress.invokeExact(instance, procName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the address of the specified Vulkan instance function.
     *
     * @param session  The memory session to allocate function name string.
     * @param instance The Vulkan instance to query, or {@link MemoryAddress#NULL NULL} to retrieve
     *                 functions related to instance creation.
     * @param procName The ASCII encoded name of the function.
     * @return The address of the function, or {@link MemoryAddress#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #nglfwGetInstanceProcAddress(Addressable, Addressable) nglfwGetInstanceProcAddress
     */
    public static MemoryAddress glfwGetInstanceProcAddress(MemorySession session, Addressable instance, String procName) {
        return nglfwGetInstanceProcAddress(instance, session.allocateUtf8String(procName));
    }

    /**
     * Returns whether the specified queue family can present images.
     * <p>
     * This function returns whether the specified queue family of the specified
     * physical device supports presentation to the platform GLFW was built for.
     * <p>
     * If Vulkan or the required window surface creation instance extensions are
     * not available on the machine, or if the specified instance was not created
     * with the required extensions, this function returns {@code false} and
     * generates a {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE} error.  Call
     * {@link GLFW#vulkanSupported vulkanSupported} to check whether Vulkan is
     * at least minimally available and {@link GLFW#ngetRequiredInstanceExtensions getRequiredInstanceExtensions}
     * to check what instance extensions are required.
     *
     * @param instance    The instance that the physical device belongs to.
     * @param device      The physical device that the queue family belongs to.
     * @param queueFamily The index of the queue family to query.
     * @return {@code true} if the queue family supports presentation, or
     * {@code false} otherwise.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED NOT_INITIALIZED},
     * {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE} and {@link GLFW#PLATFORM_ERROR PLATFORM_ERROR}.
     * @glfw.remark <b>macOS:</b> This function currently always returns {@code true}, as the
     * {@code VK_MVK_macos_surface} and {@code VK_EXT_metal_surface} extensions do not provide
     * a {@code vkGetPhysicalDevice*PresentationSupport} type function.
     * @glfw.thread_safety This function may be called from any thread.  For
     * synchronization details of Vulkan objects, see the Vulkan specification.
     */
    public static boolean glfwGetPhysicalDevicePresentationSupport(Addressable instance, Addressable device, int queueFamily) {
        try {
            return (int) glfwGetPhysicalDevicePresentationSupport.invokeExact(instance, device, queueFamily) != GLFW.FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Creates a Vulkan surface for the specified window.
     * <p>
     * This function creates a Vulkan surface for the specified window.
     * <p>
     * If the Vulkan loader or at least one minimally functional ICD were not found,
     * this function returns {@code VK_ERROR_INITIALIZATION_FAILED} and generates a
     * {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE} error.  Call {@link GLFW#vulkanSupported() vulkanSupported}
     * to check whether Vulkan is at least minimally available.
     * <p>
     * If the required window surface creation instance extensions are not
     * available or if the specified instance was not created with these extensions
     * enabled, this function returns {@code VK_ERROR_EXTENSION_NOT_PRESENT} and
     * generates a {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE} error.  Call
     * {@link GLFW#ngetRequiredInstanceExtensions getRequiredInstanceExtensions} to check
     * what instance extensions are required.
     * <p>
     * The window surface cannot be shared with another API so the window must
     * have been created with the {@link GLFW#CLIENT_API client api hint}
     * set to {@code NO_API} otherwise it generates a {@link GLFW#INVALID_VALUE INVALID_VALUE} error
     * and returns {@code VK_ERROR_NATIVE_WINDOW_IN_USE_KHR}.
     * <p>
     * The window surface must be destroyed before the specified Vulkan instance.
     * It is the responsibility of the caller to destroy the window surface.  GLFW
     * does not destroy it for you.  Call {@code vkDestroySurfaceKHR} to destroy the
     * surface.
     *
     * @param instance  The Vulkan instance to create the surface in.
     * @param window    The window to create the surface for.
     * @param allocator The allocator to use, or {@link MemoryAddress#NULL NULL} to use the default
     *                  allocator.
     * @param surface   Where to store the handle of the surface.  This is set
     *                  to {@code VK_NULL_HANDLE} if an error occurred.
     * @return {@code VK_SUCCESS} if successful, or a Vulkan error code if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED NOT_INITIALIZED},
     * {@link GLFW#API_UNAVAILABLE API_UNAVAILABLE}, {@link GLFW#PLATFORM_ERROR PLATFORM_ERROR}
     * and {@link GLFW#INVALID_VALUE INVALID_VALUE}.
     * @glfw.remark If an error occurs before the creation call is made, GLFW returns
     * the Vulkan error code most appropriate for the error.  Appropriate use of
     * {@link GLFW#vulkanSupported() vulkanSupported} and
     * {@link GLFW#ngetRequiredInstanceExtensions(Addressable) getRequiredInstanceExtensions} should
     * eliminate almost all occurrences of these errors.
     * <p>
     * <b>macOS:</b> GLFW prefers the {@code VK_EXT_metal_surface} extension, with the
     * {@code VK_MVK_macos_surface} extension as a fallback.  The name of the selected
     * extension, if any, is included in the array returned by
     * {@link GLFW#ngetRequiredInstanceExtensions(Addressable) getRequiredInstanceExtensions}.
     * <p>
     * <b>macOS:</b> This function creates and sets a {@code CAMetalLayer} instance for
     * the window content view, which is required for MoltenVK to function.
     * @glfw.thread_safety This function may be called from any thread.  For
     * synchronization details of Vulkan objects, see the Vulkan specification.
     * @see GLFW#ngetRequiredInstanceExtensions(Addressable) getRequiredInstanceExtensions
     */
    public static int nglfwCreateWindowSurface(Addressable instance, Addressable window, Addressable allocator, Addressable surface) {
        try {
            return (int) glfwCreateWindowSurface.invokeExact(instance, window, allocator, surface);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Creates a Vulkan surface for the specified window.
     *
     * @param instance  The Vulkan instance to create the surface in.
     * @param window    The window to create the surface for.
     * @param allocator The allocator to use, or {@link MemoryAddress#NULL NULL} to use the default
     *                  allocator.
     * @param surface   Where to store the handle of the surface.  This is set
     *                  to {@code VK_NULL_HANDLE} if an error occurred.
     * @return {@code VK_SUCCESS} if successful, or a Vulkan error code if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #nglfwCreateWindowSurface(Addressable, Addressable, Addressable, Addressable) nglfwCreateWindowSurface
     */
    public static int glfwCreateWindowSurface(Addressable instance, Addressable window, Addressable allocator, long[] surface) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pSurface = stack.calloc(ValueLayout.JAVA_LONG);
            int result = nglfwCreateWindowSurface(instance, window, allocator, pSurface);
            surface[0] = pSurface.get(ValueLayout.JAVA_LONG, 0);
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }
}
