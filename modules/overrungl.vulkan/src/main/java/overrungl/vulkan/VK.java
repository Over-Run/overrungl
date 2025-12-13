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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.vulkan;

import org.lwjgl.system.Configuration;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;
import java.util.Objects;

/**
 * This class loads the Vulkan library into the JVM process.
 *
 * @author squid233
 * @see VKLoadFunc
 * @since 0.1.0
 */
public final class VK {
    private static VKLoadFunc loadFunc;
    private static GlobalCommands globalCommands;

    private VK() {
    }

    /// Loads Vulkan with LWJGL 3.
    ///
    /// @param func unused
    public static void create(VKLoadFunc func) {
        create();
    }

    /// Loads Vulkan with LWJGL 3.
    ///
    /// @since 0.3.0
    public static void create() {
        if (Configuration.VULKAN_EXPLICIT_INIT.get(false)) {
            org.lwjgl.vulkan.VK.create();
        }
        loadFunc = (_, name) ->
            MemorySegment.ofAddress(org.lwjgl.vulkan.VK.getFunctionProvider()
                .getFunctionAddress(Objects.requireNonNull(MemoryUtil.nativeString(name))));
        globalCommands = new GlobalCommands(loadFunc);
    }

    /// Removes loaded functions.
    ///
    /// If you don't need to reload Vulkan functions with other [VKLoadFunc],
    /// you can ignore this method since it doesn't release any resource.
    public static void destroy() {
        if (loadFunc == null) return;
        loadFunc = null;
        globalCommands = null;
    }

    /// {@return the function from which Vulkan function is acquired}
    public static VKLoadFunc functionLookup() {
        return loadFunc;
    }

    /// Global commands that do not require a dispatchable handle to be passed.
    public static final class GlobalCommands {
        public final MemorySegment PFN_vkGetInstanceProcAddr;
        public final MemorySegment PFN_vkCreateInstance;
        public final MemorySegment PFN_vkEnumerateInstanceExtensionProperties;
        public final MemorySegment PFN_vkEnumerateInstanceLayerProperties;
        public final MemorySegment PFN_vkEnumerateInstanceVersion;

        private GlobalCommands(VKLoadFunc func) {
            PFN_vkGetInstanceProcAddr = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
            if (MemoryUtil.isNullPointer(PFN_vkGetInstanceProcAddr)) {
                throw exception("vkGetInstanceProcAddr");
            }
            PFN_vkCreateInstance = getFunctionAddress("vkCreateInstance");
            PFN_vkEnumerateInstanceExtensionProperties = getFunctionAddress("vkEnumerateInstanceExtensionProperties");
            PFN_vkEnumerateInstanceLayerProperties = getFunctionAddress("vkEnumerateInstanceLayerProperties");
            PFN_vkEnumerateInstanceVersion = getFunctionAddress("vkEnumerateInstanceVersion", false);
        }

        private static IllegalArgumentException exception(String name) {
            return new IllegalArgumentException("A critical function " + name + " is missing. Make sure that Vulkan is available.");
        }

        private MemorySegment getFunctionAddress(String name) {
            return getFunctionAddress(name, true);
        }

        private MemorySegment getFunctionAddress(String name, boolean required) {
            MemorySegment segment;
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                segment = (MemorySegment) VK10.Handles.MH_vkGetInstanceProcAddr.invokeExact(
                    PFN_vkGetInstanceProcAddr,
                    MemorySegment.NULL,
                    stack.allocateFrom(name)
                );
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            if (MemoryUtil.isNullPointer(segment) && required) {
                throw exception(name);
            }
            return segment;
        }
    }

    /// {@return instance of [GlobalCommands]}
    public static GlobalCommands globalCommands() {
        return Objects.requireNonNull(globalCommands, "Global commands are not loaded; call VK::create first");
    }
}
