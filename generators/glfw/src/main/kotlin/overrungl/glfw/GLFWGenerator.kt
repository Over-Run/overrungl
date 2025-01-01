/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.glfw

import com.palantir.javapoet.TypeName
import overrungl.gen.*

val glfwPackage = "overrungl.glfw"
val glfwLookup = "GLFWInternal.lookup"

val glfw_boolean = CustomTypeSpec(
    carrier = TypeName.INT,
    javaType = TypeName.BOOLEAN,
    processor = object : ValueProcessor {
        override fun marshal(context: ProcessorContext) {
            val builder = context.builder
            context.action(builder)
            builder.append(" ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE")
        }

        override fun unmarshal(context: ProcessorContext) {
            val builder = context.builder
            context.action(builder)
            builder.append(" != GLFW.GLFW_FALSE")
        }

        override fun copy(context: ProcessorContext) {
            TODO("Not yet implemented")
        }
    },
    layout = jint.layout,
    cType = "int"
)
val GLFWmonitor_ptr = address c "GLFWmonitor*"
val GLFWwindow_ptr = address c "GLFWwindow*"
val GLFWcursor_ptr = address c "GLFWcursor*"

fun main() {
    //region Upcall
    val GLFWallocatefun = Upcall(
        glfwPackage,
        "GLFWAllocateFun",
        javadoc = """
            The function pointer type for memory allocation callbacks.

            This is the function pointer type for memory allocation callbacks.  A memory
            allocation callback function has the following signature:
            ```java
            MemorySegment function_name(long size, MemorySegment user)
            ```

            @see GLFWAllocator
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void_ptr,
            size_t("size"),
            void_ptr("user"),
            javadoc = """
                This function must return either a memory block at least `size` bytes long,
                or `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
                failures gracefully yet.

                This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
                flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
                longer flagged as initialized.

                Any memory allocated via this function will be deallocated via the same allocator
                during library termination or earlier.

                Any memory allocated via this function must be suitably aligned for any object type.
                If you are using C99 or earlier, this alignment is platform-dependent but will be the
                same as what `malloc` provides.  If you are using C11 or later, this is the value of
                `alignof(max_align_t)`.

                The size will always be greater than zero.  Allocations of size zero are filtered out
                before reaching the custom allocator.

                If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].

                This function must not call any GLFW function.

                @param size The minimum size, in bytes, of the memory block.
                @param user The user-defined pointer from the allocator.
                @return The address of the newly allocated memory block, or `NULL` if an
                error occurred.

                @glfw.pointer_lifetime The returned memory block must be valid at least until it
                is deallocated.

                @glfw.reentrancy This function should not call any GLFW function.

                @glfw.thread_safety This function must support being called from any thread that calls GLFW
                functions.
            """.trimIndent()
        )
    }.pointerType c "GLFWallocatefun"

    val GLFWreallocatefun = Upcall(
        glfwPackage,
        "GLFWReallocateFun",
        javadoc = """
            The function pointer type for memory reallocation callbacks.

            This is the function pointer type for memory reallocation callbacks.
            A memory reallocation callback function has the following signature:
            ```java
            MemorySegment function_name(MemorySegment block, long size, MemorySegment user)
            ```

            @see GLFWAllocator
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void_ptr,
            void_ptr("block"),
            size_t("size"),
            void_ptr("user"),
            javadoc = """
                This function must return a memory block at least `size` bytes long, or
                `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
                failures gracefully yet.

                This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
                flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
                longer flagged as initialized.

                Any memory allocated via this function will be deallocated via the same allocator
                during library termination or earlier.

                Any memory allocated via this function must be suitably aligned for any object type.
                If you are using C99 or earlier, this alignment is platform-dependent but will be the
                same as what `realloc` provides.  If you are using C11 or later, this is the value of
                `alignof(max_align_t)`.

                The block address will never be `NULL` and the size will always be greater than zero.
                Reallocations of a block to size zero are converted into deallocations before reaching
                the custom allocator.  Reallocations of `NULL` to a non-zero size are converted into
                regular allocations before reaching the custom allocator.

                If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].

                This function must not call any GLFW function.

                @param block The address of the memory block to reallocate.
                @param size The new minimum size, in bytes, of the memory block.
                @param user The user-defined pointer from the allocator.
                @return The address of the newly allocated or resized memory block, or
                `NULL` if an error occurred.

                @glfw.pointer_lifetime The returned memory block must be valid at least until it
                is deallocated.

                @glfw.reentrancy This function should not call any GLFW function.

                @glfw.thread_safety This function must support being called from any thread that calls GLFW
                functions.
            """.trimIndent()
        )
    }.pointerType c "GLFWreallocatefun"

    val GLFWdeallocatefun = Upcall(
        glfwPackage,
        "GLFWDeallocateFun",
        javadoc = """
            The function pointer type for memory deallocation callbacks.

            This is the function pointer type for memory deallocation callbacks.
            A memory deallocation callback function has the following signature:
            ```java
            void function_name(MemorySegment block, MemorySegment user)
            ```

            @see GLFWAllocator
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            void_ptr("block"),
            void_ptr("user"),
            javadoc = """
                This function may deallocate the specified memory block.  This memory block
                will have been allocated with the same allocator.

                This function must support being called during [glfwInit][GLFW#glfwInit()] but before the library is
                flagged as initialized, as well as during [glfwTerminate][GLFW#glfwTerminate()] after the library is no
                longer flagged as initialized.

                The block address will never be `NULL`.  Deallocations of `NULL` are filtered out
                before reaching the custom allocator.

                If this function returns `NULL`, GLFW will emit [GLFW_OUT_OF_MEMORY][GLFW#GLFW_OUT_OF_MEMORY].

                This function must not call any GLFW function.

                @param block The address of the memory block to deallocate.
                @param user The user-defined pointer from the allocator.

                @glfw.pointer_lifetime The specified memory block will not be accessed by GLFW
                after this function is called.

                @glfw.reentrancy This function should not call any GLFW function.

                @glfw.thread_safety This function must support being called from any thread that calls GLFW
                functions.
            """.trimIndent()
        )
    }.pointerType c "GLFWdeallocatefun"

    val GLFWerrorfun = Upcall(
        glfwPackage,
        "GLFWErrorFun",
        javadoc = """
            The function pointer type for error callbacks.

            This is the function pointer type for error callbacks.  An error callback
            function has the following signature:
            ```java
            void callback_name(int error_code, String description)
            ```

            @see GLFW#glfwSetErrorCallback(MemorySegment)
        """.trimIndent()
    ) {
        val doc = """
            Invoke

            @param error_code An error code.  Future releases may add
            more error codes.
            @param description A UTF-8 encoded string describing the error.

            @glfw.pointer_lifetime The error description string is valid until the callback
            function returns.
        """.trimIndent()
        interfaceMethod = "invoke"(
            void,
            int("error_code"),
            const_char_ptr("description"),
            javadoc = doc
        )
        targetMethod = "invoke"(
            void,
            int("error_code"),
            const_char_ptr("description"),
            javadoc = doc,
            overload = "invoke"
        )
    }.pointerType c "GLFWerrorfun"

    val GLFWwindowposfun = Upcall(
        glfwPackage,
        "GLFWWindowPosFun",
        javadoc = """
            The function pointer type for window position callbacks.

            This is the function pointer type for window position callbacks.  A window
            position callback function has the following signature:
            ```java
            void callback_name(MemorySegment window, int xpos, int ypos)
            ```

            @see GLFW#glfwSetWindowPosCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("xpos"),
            int("ypos"),
            javadoc = """
                Invoke

                @param window The window that was moved.
                @param xpos The new x-coordinate, in screen coordinates, of the
                upper-left corner of the content area of the window.
                @param ypos The new y-coordinate, in screen coordinates, of the
                upper-left corner of the content area of the window.
            """.trimIndent()
        )
    }.pointerType c "GLFWwindowposfun"

    val GLFWwindowsizefun = Upcall(
        glfwPackage,
        "GLFWWindowSizeFun",
        javadoc = """
            The function pointer type for window size callbacks.

            This is the function pointer type for window size callbacks.  A window size
            callback function has the following signature:
            ```java
            void callback_name(MemorySegment window, int width, int height)
            ```

            @see GLFW#glfwSetWindowSizeCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("width"),
            int("height"),
            javadoc = """
                Invoke

                @param window The window that was resized.
                @param width The new width, in screen coordinates, of the window.
                @param height The new height, in screen coordinates, of the window.
            """.trimIndent()
        )
    }.pointerType c "GLFWwindowsizefun"

    val GLFWwindowclosefun = Upcall(
        glfwPackage,
        "GLFWWindowCloseFun",
        javadoc = """
            The function pointer type for window close callbacks.

            This is the function pointer type for window close callbacks.  A window
            close callback function has the following signature:
            ```java
            void function_name(MemorySegment window)
            ```

            @see GLFW#glfwSetWindowCloseCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            javadoc = """
                Invoke

                @param window The window that the user attempted to close.
            """.trimIndent()
        )
    }.pointerType c "GLFWwindowclosefun"

    val GLFWwindowrefreshfun = Upcall(
        glfwPackage,
        "GLFWWindowRefreshFun",
        javadoc = """
            The function pointer type for window content refresh callbacks.

            This is the function pointer type for window content refresh callbacks.
            A window content refresh callback function has the following signature:
            ```java
            void function_name(MemorySegment window);
            ```

            @see GLFW#glfwSetWindowRefreshCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            javadoc = """
                Invoke

                @param window The window whose content needs to be refreshed.
            """.trimIndent()
        )
    }.pointerType c "GLFWwindowrefreshfun"

    val GLFWwindowfocusfun = Upcall(
        glfwPackage,
        "GLFWWindowFocusFun",
        javadoc = """
            The function pointer type for window focus callbacks.

            This is the function pointer type for window focus callbacks.  A window
            focus callback function has the following signature:
            ```java
            void function_name(MemorySegment window, boolean focused)
            ```

            @see GLFW#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        interfaceMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("focused"),
            javadoc = """
                Invoke

                @param window The window that gained or lost input focus.
                @param focused `true` if the window was given input focus, or
                `false` if it lost it.
            """.trimIndent()
        )
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("focused"),
            javadoc = """
                Invoke

                @param window The window that gained or lost input focus.
                @param focused `GLFW_TRUE` if the window was given input focus, or
                `GLFW_FALSE` if it lost it.
            """.trimIndent(),
            overload = "invoke"
        )
    }.pointerType c "GLFWwindowfocusfun"

    val GLFWwindowiconifyfun = Upcall(
        glfwPackage,
        "GLFWWindowIconifyFun",
        javadoc = """
            The function pointer type for window iconify callbacks.

            This is the function pointer type for window iconify callbacks.  A window
            iconify callback function has the following signature:
            ```java
            void function_name(MemorySegment window, boolean iconified)
            ```

            @see GLFW#glfwSetWindowIconifyCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        interfaceMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("iconified"),
            javadoc = """
                Invoke

                @param window The window that was iconified or restored.
                @param iconified `true` if the window was iconified, or
                `false` if it was restored.
            """.trimIndent()
        )
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("iconified"),
            javadoc = """
                Invoke

                @param window The window that was iconified or restored.
                @param iconified `GLFW_TRUE` if the window was iconified, or
                `GLFW_FALSE` if it was restored.
            """.trimIndent(),
            overload = "invoke"
        )
    }.pointerType c "GLFWwindowiconifyfun"

    val GLFWwindowmaximizefun = Upcall(
        glfwPackage,
        "GLFWWindowMaximizeFun",
        javadoc = """
            The function pointer type for window maximize callbacks.

            This is the function pointer type for window maximize callbacks.  A window
            maximize callback function has the following signature:
            ```java
            void function_name(MemorySegment window, boolean maximized)
            ```

            @see GLFW#glfwSetWindowMaximizeCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        interfaceMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("maximized"),
            javadoc = """
                Invoke

                @param window The window that was maximized or restored.
                @param maximized `true` if the window was maximized, or
                `false` if it was restored.
            """.trimIndent()
        )
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("maximized"),
            javadoc = """
                Invoke

                @param window The window that was maximized or restored.
                @param maximized `GLFW_TRUE` if the window was maximized, or
                `GLFW_FALSE` if it was restored.
            """.trimIndent(),
            overload = "invoke"
        )
    }.pointerType c "GLFWwindowmaximizefun"

    val GLFWframebuffersizefun = Upcall(
        glfwPackage,
        "GLFWFramebufferSizeFun",
        javadoc = """
            The function pointer type for framebuffer size callbacks.

            This is the function pointer type for framebuffer size callbacks.
            A framebuffer size callback function has the following signature:
            ```java
            void function_name(MemorySegment window, int width, int height)
            ```

            @see GLFW#glfwSetFramebufferSizeCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("width"),
            int("height"),
            javadoc = """
                Invoke

                @param window The window whose framebuffer was resized.
                @param width The new width, in pixels, of the framebuffer.
                @param height The new height, in pixels, of the framebuffer.
            """.trimIndent()
        )
    }.pointerType c "GLFWframebuffersizefun"

    val GLFWwindowcontentscalefun = Upcall(
        glfwPackage,
        "GLFWWindowContentScaleFun",
        javadoc = """
            The function pointer type for window content scale callbacks.

            This is the function pointer type for window content scale callbacks.
            A window content scale callback function has the following signature:
            ```java
            void function_name(MemorySegment window, float xscale, float yscale)
            ```

            @see GLFW#glfwSetWindowContentScaleCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            float("xscale"),
            float("yscale"),
            javadoc = """
                Invoke

                @param window The window whose content scale changed.
                @param xscale The new x-axis content scale of the window.
                @param yscale The new y-axis content scale of the window.
            """.trimIndent()
        )
    }.pointerType c "GLFWwindowcontentscalefun"

    val GLFWmousebuttonfun = Upcall(
        glfwPackage,
        "GLFWMouseButtonFun",
        javadoc = """
            The function pointer type for mouse button callbacks.

            This is the function pointer type for mouse button callback functions.
            A mouse button callback function has the following signature:
            ```java
            void function_name(MemorySegment window, int button, int action, int mods)
            ```

            @see GLFW#glfwSetMouseButtonCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("button"),
            int("action"),
            int("mods"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param button The mouse button that was pressed or
                released.
                @param action One of `GLFW_PRESS` or `GLFW_RELEASE`.  Future releases
                may add more actions.
                @param mods Bit field describing which modifier keys were
                held down.
            """.trimIndent()
        )
    }.pointerType c "GLFWmousebuttonfun"

    val GLFWcursorposfun = Upcall(
        glfwPackage,
        "GLFWCursorPosFun",
        javadoc = """
            The function pointer type for cursor position callbacks.

            This is the function pointer type for cursor position callbacks.  A cursor
            position callback function has the following signature:
            ```java
            void function_name(MemorySegment window, double xpos, double ypos);
            ```

            @see GLFW#glfwSetCursorPosCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            double("xpos"),
            double("ypos"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param xpos The new cursor x-coordinate, relative to the left edge of
                the content area.
                @param ypos The new cursor y-coordinate, relative to the top edge of the
                content area.
            """.trimIndent()
        )
    }.pointerType c "GLFWcursorposfun"

    val GLFWcursorenterfun = Upcall(
        glfwPackage,
        "GLFWCursorEnterFun",
        javadoc = """
            The function pointer type for cursor enter/leave callbacks.

            This is the function pointer type for cursor enter/leave callbacks.
            A cursor enter/leave callback function has the following signature:
            ```java
            void function_name(MemorySegment window, boolean entered)
            ```

            @see GLFW#glfwSetCursorEnterCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        interfaceMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("entered"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param entered `GLFW_TRUE` if the cursor entered the window's content
                area, or `GLFW_FALSE` if it left it.
            """.trimIndent()
        )
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("entered"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param entered `GLFW_TRUE` if the cursor entered the window's content
                area, or `GLFW_FALSE` if it left it.
            """.trimIndent(),
            overload = "invoke"
        )
    }.pointerType c "GLFWcursorenterfun"

    val GLFWscrollfun = Upcall(
        glfwPackage,
        "GLFWScrollFun",
        javadoc = """
            The function pointer type for scroll callbacks.

            This is the function pointer type for scroll callbacks.  A scroll callback
            function has the following signature:
            ```java
            void function_name(MemorySegment window, double xoffset, double yoffset)
            ```

            @see GLFW#glfwSetScrollCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            double("xoffset"),
            double("yoffset"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param xoffset The scroll offset along the x-axis.
                @param yoffset The scroll offset along the y-axis.
            """.trimIndent()
        )
    }.pointerType c "GLFWscrollfun"

    val GLFWkeyfun = Upcall(
        glfwPackage,
        "GLFWKeyFun",
        javadoc = """
            The function pointer type for keyboard key callbacks.

            This is the function pointer type for keyboard key callbacks.  A keyboard
            key callback function has the following signature:
            ```java
            void function_name(MemorySegment window, int key, int scancode, int action, int mods)
            ```

            @see GLFW#glfwSetKeyCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("key"),
            int("scancode"),
            int("action"),
            int("mods"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param key The keyboard key that was pressed or released.
                @param scancode The platform-specific scancode of the key.
                @param action `GLFW_PRESS`, `GLFW_RELEASE` or `GLFW_REPEAT`.  Future
                releases may add more actions.
                @param mods Bit field describing which modifier keys were
                held down.
            """.trimIndent()
        )
    }.pointerType c "GLFWkeyfun"

    val GLFWcharfun = Upcall(
        glfwPackage,
        "GLFWCharFun",
        javadoc = """
            The function pointer type for Unicode character callbacks.

            This is the function pointer type for Unicode character callbacks.
            A Unicode character callback function has the following signature:
            ```java
            void function_name(MemorySegment window, int codepoint)
            ```

            @see GLFW#glfwSetCharCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            uint("codepoint"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param codepoint The Unicode code point of the character.
            """.trimIndent()
        )
    }.pointerType c "GLFWcharfun"

    val GLFWdropfun = Upcall(
        glfwPackage,
        "GLFWDropFun",
        javadoc = """
            The function pointer type for path drop callbacks.

            This is the function pointer type for path drop callbacks.  A path drop
            callback function has the following signature:
            ```
            void function_name(MemorySegment window, String[] paths)
            ```

            @see GLFW#glfwSetDropCallback(MemorySegment, MemorySegment)
        """.trimIndent()
    ) {
        interfaceMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            string_u8_array("paths"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param paths The UTF-8 encoded file and/or directory path names.

                @glfw.pointer_lifetime The path array and its strings are valid until the
                callback function returns.
            """.trimIndent()
        )
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("path_count"),
            string_u8_array("paths"),
            javadoc = """
                Invoke

                @param window The window that received the event.
                @param path_count The number of dropped paths.
                @param paths The UTF-8 encoded file and/or directory path names.

                @glfw.pointer_lifetime The path array and its strings are valid until the
                callback function returns.
            """.trimIndent(),
            code = """
                var a = new String[path_count];
                Unmarshal.copy(paths, a);
                invoke(window, a);
            """.trimIndent()
        )
        wrapperCode = """
            return (window, paths) -> { try (var stack = MemoryStack.pushLocal()) {
                invoke(stub, window, paths.length, Marshal.marshal(stack, paths));
            } };
        """.trimIndent()
    }.pointerType c "GLFWdropfun"

    val GLFWmonitorfun = Upcall(
        glfwPackage,
        "GLFWMonitorFun",
        javadoc = """
            The function pointer type for monitor configuration callbacks.

            This is the function pointer type for monitor configuration callbacks.
            A monitor callback function has the following signature:
            ```java
            void function_name(MemorySegment monitor, int event)
            ```

            @see GLFW#glfwSetMonitorCallback(MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            GLFWmonitor_ptr("monitor"),
            int("event"),
            javadoc = """
                Invoke

                @param monitor The monitor that was connected or disconnected.
                @param event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
                releases may add more events.
            """.trimIndent()
        )
    }.pointerType c "GLFWmonitorfun"

    val GLFWjoystickfun = Upcall(
        glfwPackage,
        "GLFWJoystickFun",
        javadoc = """
            The function pointer type for joystick configuration callbacks.

            This is the function pointer type for joystick configuration callbacks.
            A joystick configuration callback function has the following signature:
            ```java
            void function_name(int jid, int event)
            ```

            @see GLFW#glfwSetJoystickCallback(MemorySegment)
        """.trimIndent()
    ) {
        targetMethod = "invoke"(
            void,
            int("jid"),
            int("event"),
            javadoc = """
                Invoke

                @param jid The joystick that was connected or disconnected.
                @param event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
                releases may add more events.
            """.trimIndent()
        )
    }.pointerType c "GLFWjoystickfun"
    //endregion

    //region Structs
    val const_GLFWvidmode_ptr = Struct(
        glfwPackage,
        "GLFWVidMode",
        cType = "GLFWvidmode",
        javadoc = """
            Video mode type.

            This describes a single video mode.

            ## See Also
            - [glfwGetVideoMode][GLFW#glfwGetVideoMode(MemorySegment)]
            - [glfwGetVideoModes][GLFW#glfwGetVideoModes(MemorySegment, MemorySegment)]
        """.trimIndent()
    ) {
        int("width", javadoc = "The width, in screen coordinates, of the video mode.")
        int("height", javadoc = "The height, in screen coordinates, of the video mode.")
        int("redBits", javadoc = "The bit depth of the red channel of the video mode.")
        int("greenBits", javadoc = "The bit depth of the green channel of the video mode.")
        int("blueBits", javadoc = "The bit depth of the blue channel of the video mode.")
        int("refreshRate", javadoc = "The refresh rate, in Hz, of the video mode.")
    }.pointerType c "const GLFWvidmode*"

    val const_GLFWgammaramp_ptr = Struct(
        glfwPackage,
        "GLFWGammaRamp",
        cType = "GLFWgammaramp",
        javadoc = """
            Gamma ramp.

            This describes the gamma ramp for a monitor.

            ## See Also
            - [glfwGetGammaRamp][GLFW#glfwGetGammaRamp(MemorySegment)]
            - [glfwSetGammaRamp][GLFW#glfwSetGammaRamp(MemorySegment, MemorySegment)]
        """.trimIndent()
    ) {
        val ushort_ptr = jshort_array c "unsigned short*"
        ushort_ptr("red", javadoc = "An array of value describing the response of the red channel.")
        ushort_ptr("green", javadoc = "An array of value describing the response of the green channel.")
        ushort_ptr("blue", javadoc = "An array of value describing the response of the blue channel.")
        uint("size", javadoc = "The number of elements in each array.")
    }.pointerType c "const GLFWgammaramp*"

    val const_GLFWimage_ptr = Struct(
        glfwPackage,
        "GLFWImage",
        cType = "GLFWimage",
        javadoc = """
            Image data.

            This describes a single 2D image.  See the documentation for each related
            function what the expected pixel format is.
        """.trimIndent()
    ) {
        int("width", javadoc = "The width, in pixels, of this image.")
        int("height", javadoc = "The height, in pixels, of this image.")
        (address c "unsigned char*")(
            "pixels",
            javadoc = "The pixel data of this image, arranged left-to-right, top-to-bottom."
        )
    }.pointerType c "const GLFWimage*"

    val GLFWgamepadstate_ptr = Struct(
        glfwPackage,
        "GLFWGamepadState",
        cType = "GLFWgamepadstate",
        javadoc = """
            Gamepad input state

            This describes the input state of a gamepad.

            ## See Also
            - [glfwGetGamepadState][GLFW#glfwGetGamepadState(int, MemorySegment)]
        """.trimIndent()
    ) {
        fixedSize(
            uchar,
            "buttons",
            15,
            javadoc = """
                The states of each gamepad button, `GLFW_PRESS`
                or `GLFW_RELEASE`.
            """.trimIndent()
        )
        fixedSize(
            float,
            "axes",
            6,
            javadoc = """
                The states of each gamepad axis, in the range -1.0
                to 1.0 inclusive.
            """.trimIndent()
        )
    }.pointerType c "GLFWgamepadstate*"

    val const_GLFWallocator_ptr = Struct(
        glfwPackage,
        "GLFWAllocator",
        cType = "GLFWallocator",
        javadoc = """
            Custom heap memory allocator.

            This describes a custom heap memory allocator for GLFW.  To set an allocator, pass it
            to [glfwInitAllocator][GLFW#glfwInitAllocator(MemorySegment)] before initializing the library.
        """.trimIndent()
    ) {
        GLFWallocatefun(
            "allocate",
            javadoc = """
                The memory allocation function.  See [GLFWAllocateFun] for details about
                allocation function.
            """.trimIndent()
        )
        GLFWreallocatefun(
            "reallocate",
            javadoc = """
                The memory reallocation function.  See [GLFWReallocateFun] for details about
                reallocation function.
            """.trimIndent()
        )
        GLFWdeallocatefun(
            "deallocate",
            javadoc = """
                The memory deallocation function.  See [GLFWDeallocateFun] for details about
                deallocation function.
            """.trimIndent()
        )
        void_ptr(
            "user",
            javadoc = """
                The user pointer for this custom allocator.  This value will be passed to the
                allocator functions.
            """.trimIndent()
        )
    }.pointerType c "const GLFWallocator*"
    //endregion

    StaticDowncall(glfwPackage, "GLFW", symbolLookup = glfwLookup) {
        //region GLFW API tokens

        int(javadoc = "GLFW version macros") {
            "GLFW_VERSION_MAJOR"(
                "3",
                javadoc = """
                    The major version number of the GLFW header.  This is incremented when the
                    API is changed in non-compatible ways.
                """.trimIndent()
            )
            "GLFW_VERSION_MINOR"(
                "5",
                javadoc = """
                    The minor version number of the GLFW header.  This is incremented when
                    features are added to the API but it remains backward-compatible.
                """.trimIndent()
            )
            "GLFW_VERSION_REVISION"(
                "0",
                javadoc = """
                    The revision number of the GLFW header.  This is incremented when a bug fix
                    release is made that does not contain any API changes.
                """.trimIndent()
            )
        }

        int(
            "GLFW_TRUE" to "1",
            javadoc = """
                One.

                This is only semantic sugar for the number 1.  You can instead use `1` or
                `true` or `_True` or `GL_TRUE` or `VK_TRUE` or anything else that is equal
                to one.
            """.trimIndent()
        )
        int(
            "GLFW_FALSE" to "0",
            javadoc = """
                Zero.

                This is only semantic sugar for the number 0.  You can instead use `0` or
                `false` or `_False` or `GL_FALSE` or `VK_FALSE` or anything else that is
                equal to zero.
            """.trimIndent()
        )

        int(javadoc = "Key and button actions") {
            "GLFW_RELEASE"("0", javadoc = "The key or mouse button was released.")
            "GLFW_PRESS"("1", javadoc = "The key or mouse button was pressed.")
            "GLFW_REPEAT"("2", javadoc = "The key was held down until it repeated.")
        }

        int(
            javadoc = """
            Joystick hat states.

            See joystick hat input for how these are used.
        """.trimIndent()
        ) {
            "GLFW_HAT_CENTERED"("0")
            "GLFW_HAT_UP"("1")
            "GLFW_HAT_RIGHT"("2")
            "GLFW_HAT_DOWN"("4")
            "GLFW_HAT_LEFT"("8")
            "GLFW_HAT_RIGHT_UP"("(GLFW_HAT_RIGHT | GLFW_HAT_UP)")
            "GLFW_HAT_RIGHT_DOWN"("(GLFW_HAT_RIGHT | GLFW_HAT_DOWN)")
            "GLFW_HAT_LEFT_UP"("(GLFW_HAT_LEFT | GLFW_HAT_UP)")
            "GLFW_HAT_LEFT_DOWN"("(GLFW_HAT_LEFT | GLFW_HAT_DOWN)")
        }

        int("GLFW_KEY_UNKNOWN" to "-1")

        int(javadoc = "Printable keys") {
            "GLFW_KEY_SPACE"("32")
            "GLFW_KEY_APOSTROPHE"("39", javadoc = "`'`")
            "GLFW_KEY_COMMA"("44", javadoc = "`,`")
            "GLFW_KEY_MINUS"("45", javadoc = "`-`")
            "GLFW_KEY_PERIOD"("46", javadoc = "`.`")
            "GLFW_KEY_SLASH"("47", javadoc = "`/`")
            "GLFW_KEY_0"("48")
            "GLFW_KEY_1"("49")
            "GLFW_KEY_2"("50")
            "GLFW_KEY_3"("51")
            "GLFW_KEY_4"("52")
            "GLFW_KEY_5"("53")
            "GLFW_KEY_6"("54")
            "GLFW_KEY_7"("55")
            "GLFW_KEY_8"("56")
            "GLFW_KEY_9"("57")
            "GLFW_KEY_SEMICOLON"("59", javadoc = "`;`")
            "GLFW_KEY_EQUAL"("61", javadoc = "`=`")
            "GLFW_KEY_A"("65")
            "GLFW_KEY_B"("66")
            "GLFW_KEY_C"("67")
            "GLFW_KEY_D"("68")
            "GLFW_KEY_E"("69")
            "GLFW_KEY_F"("70")
            "GLFW_KEY_G"("71")
            "GLFW_KEY_H"("72")
            "GLFW_KEY_I"("73")
            "GLFW_KEY_J"("74")
            "GLFW_KEY_K"("75")
            "GLFW_KEY_L"("76")
            "GLFW_KEY_M"("77")
            "GLFW_KEY_N"("78")
            "GLFW_KEY_O"("79")
            "GLFW_KEY_P"("80")
            "GLFW_KEY_Q"("81")
            "GLFW_KEY_R"("82")
            "GLFW_KEY_S"("83")
            "GLFW_KEY_T"("84")
            "GLFW_KEY_U"("85")
            "GLFW_KEY_V"("86")
            "GLFW_KEY_W"("87")
            "GLFW_KEY_X"("88")
            "GLFW_KEY_Y"("89")
            "GLFW_KEY_Z"("90")
            "GLFW_KEY_LEFT_BRACKET"("91", javadoc = "`[`")
            "GLFW_KEY_BACKSLASH"("92", javadoc = "`\\\\`")
            "GLFW_KEY_RIGHT_BRACKET"("93", javadoc = "`]`")
            "GLFW_KEY_GRAVE_ACCENT"("96", javadoc = "<code>`</code>")
            "GLFW_KEY_WORLD_1"("161", javadoc = "non-US #1")
            "GLFW_KEY_WORLD_2"("162", javadoc = "non-US #2")
        }

        int(javadoc = "Function keys") {
            "GLFW_KEY_ESCAPE"("256")
            "GLFW_KEY_ENTER"("257")
            "GLFW_KEY_TAB"("258")
            "GLFW_KEY_BACKSPACE"("259")
            "GLFW_KEY_INSERT"("260")
            "GLFW_KEY_DELETE"("261")
            "GLFW_KEY_RIGHT"("262")
            "GLFW_KEY_LEFT"("263")
            "GLFW_KEY_DOWN"("264")
            "GLFW_KEY_UP"("265")
            "GLFW_KEY_PAGE_UP"("266")
            "GLFW_KEY_PAGE_DOWN"("267")
            "GLFW_KEY_HOME"("268")
            "GLFW_KEY_END"("269")
            "GLFW_KEY_CAPS_LOCK"("280")
            "GLFW_KEY_SCROLL_LOCK"("281")
            "GLFW_KEY_NUM_LOCK"("282")
            "GLFW_KEY_PRINT_SCREEN"("283")
            "GLFW_KEY_PAUSE"("284")
            "GLFW_KEY_F1"("290")
            "GLFW_KEY_F2"("291")
            "GLFW_KEY_F3"("292")
            "GLFW_KEY_F4"("293")
            "GLFW_KEY_F5"("294")
            "GLFW_KEY_F6"("295")
            "GLFW_KEY_F7"("296")
            "GLFW_KEY_F8"("297")
            "GLFW_KEY_F9"("298")
            "GLFW_KEY_F10"("299")
            "GLFW_KEY_F11"("300")
            "GLFW_KEY_F12"("301")
            "GLFW_KEY_F13"("302")
            "GLFW_KEY_F14"("303")
            "GLFW_KEY_F15"("304")
            "GLFW_KEY_F16"("305")
            "GLFW_KEY_F17"("306")
            "GLFW_KEY_F18"("307")
            "GLFW_KEY_F19"("308")
            "GLFW_KEY_F20"("309")
            "GLFW_KEY_F21"("310")
            "GLFW_KEY_F22"("311")
            "GLFW_KEY_F23"("312")
            "GLFW_KEY_F24"("313")
            "GLFW_KEY_F25"("314")
            "GLFW_KEY_KP_0"("320")
            "GLFW_KEY_KP_1"("321")
            "GLFW_KEY_KP_2"("322")
            "GLFW_KEY_KP_3"("323")
            "GLFW_KEY_KP_4"("324")
            "GLFW_KEY_KP_5"("325")
            "GLFW_KEY_KP_6"("326")
            "GLFW_KEY_KP_7"("327")
            "GLFW_KEY_KP_8"("328")
            "GLFW_KEY_KP_9"("329")
            "GLFW_KEY_KP_DECIMAL"("330")
            "GLFW_KEY_KP_DIVIDE"("331")
            "GLFW_KEY_KP_MULTIPLY"("332")
            "GLFW_KEY_KP_SUBTRACT"("333")
            "GLFW_KEY_KP_ADD"("334")
            "GLFW_KEY_KP_ENTER"("335")
            "GLFW_KEY_KP_EQUAL"("336")
            "GLFW_KEY_LEFT_SHIFT"("340")
            "GLFW_KEY_LEFT_CONTROL"("341")
            "GLFW_KEY_LEFT_ALT"("342")
            "GLFW_KEY_LEFT_SUPER"("343")
            "GLFW_KEY_RIGHT_SHIFT"("344")
            "GLFW_KEY_RIGHT_CONTROL"("345")
            "GLFW_KEY_RIGHT_ALT"("346")
            "GLFW_KEY_RIGHT_SUPER"("347")
            "GLFW_KEY_MENU"("348")
        }

        int("GLFW_KEY_LAST" to "GLFW_KEY_MENU")

        int(
            javadoc = """
            Modifier key flags.

            See key input for how these are used.
        """.trimIndent()
        ) {
            "GLFW_MOD_SHIFT"("0x0001", javadoc = "If this bit is set one or more Shift keys were held down.")
            "GLFW_MOD_CONTROL"("0x0002", javadoc = "If this bit is set one or more Control keys were held down.")
            "GLFW_MOD_ALT"("0x0004", javadoc = "If this bit is set one or more Alt keys were held down.")
            "GLFW_MOD_SUPER"("0x0008", javadoc = "If this bit is set one or more Super keys were held down.")
            "GLFW_MOD_CAPS_LOCK"(
                "0x0010",
                javadoc = """
                    If this bit is set the Caps Lock key is enabled.

                    If this bit is set the Caps Lock key is enabled and the
                    [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] input mode is set.
                """.trimIndent()
            )
            "GLFW_MOD_NUM_LOCK"(
                "0x0020",
                javadoc = """
                    If this bit is set the Num Lock key is enabled.

                    If this bit is set the Num Lock key is enabled and the
                    [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] input mode is set.
                """.trimIndent()
            )
        }

        int(
            javadoc = """
            Mouse button IDs.

            See mouse button input for how these are used.
        """.trimIndent()
        ) {
            "GLFW_MOUSE_BUTTON_1"("0")
            "GLFW_MOUSE_BUTTON_2"("1")
            "GLFW_MOUSE_BUTTON_3"("2")
            "GLFW_MOUSE_BUTTON_4"("3")
            "GLFW_MOUSE_BUTTON_5"("4")
            "GLFW_MOUSE_BUTTON_6"("5")
            "GLFW_MOUSE_BUTTON_7"("6")
            "GLFW_MOUSE_BUTTON_8"("7")
            "GLFW_MOUSE_BUTTON_LAST"("GLFW_MOUSE_BUTTON_8")
            "GLFW_MOUSE_BUTTON_LEFT"("GLFW_MOUSE_BUTTON_1")
            "GLFW_MOUSE_BUTTON_RIGHT"("GLFW_MOUSE_BUTTON_2")
            "GLFW_MOUSE_BUTTON_MIDDLE"("GLFW_MOUSE_BUTTON_3")
        }

        int(
            javadoc = """
            Joystick IDs.

            See joystick input for how these are used.
        """.trimIndent()
        ) {
            "GLFW_JOYSTICK_1"("0")
            "GLFW_JOYSTICK_2"("1")
            "GLFW_JOYSTICK_3"("2")
            "GLFW_JOYSTICK_4"("3")
            "GLFW_JOYSTICK_5"("4")
            "GLFW_JOYSTICK_6"("5")
            "GLFW_JOYSTICK_7"("6")
            "GLFW_JOYSTICK_8"("7")
            "GLFW_JOYSTICK_9"("8")
            "GLFW_JOYSTICK_10"("9")
            "GLFW_JOYSTICK_11"("10")
            "GLFW_JOYSTICK_12"("11")
            "GLFW_JOYSTICK_13"("12")
            "GLFW_JOYSTICK_14"("13")
            "GLFW_JOYSTICK_15"("14")
            "GLFW_JOYSTICK_16"("15")
            "GLFW_JOYSTICK_LAST"("GLFW_JOYSTICK_16")
        }

        int(
            javadoc = """
            Gamepad buttons.

            See gamepad for how these are used.
        """.trimIndent()
        ) {
            "GLFW_GAMEPAD_BUTTON_A"("0")
            "GLFW_GAMEPAD_BUTTON_B"("1")
            "GLFW_GAMEPAD_BUTTON_X"("2")
            "GLFW_GAMEPAD_BUTTON_Y"("3")
            "GLFW_GAMEPAD_BUTTON_LEFT_BUMPER"("4")
            "GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER"("5")
            "GLFW_GAMEPAD_BUTTON_BACK"("6")
            "GLFW_GAMEPAD_BUTTON_START"("7")
            "GLFW_GAMEPAD_BUTTON_GUIDE"("8")
            "GLFW_GAMEPAD_BUTTON_LEFT_THUMB"("9")
            "GLFW_GAMEPAD_BUTTON_RIGHT_THUMB"("10")
            "GLFW_GAMEPAD_BUTTON_DPAD_UP"("11")
            "GLFW_GAMEPAD_BUTTON_DPAD_RIGHT"("12")
            "GLFW_GAMEPAD_BUTTON_DPAD_DOWN"("13")
            "GLFW_GAMEPAD_BUTTON_DPAD_LEFT"("14")
            "GLFW_GAMEPAD_BUTTON_LAST"("GLFW_GAMEPAD_BUTTON_DPAD_LEFT")

            "GLFW_GAMEPAD_BUTTON_CROSS"("GLFW_GAMEPAD_BUTTON_A")
            "GLFW_GAMEPAD_BUTTON_CIRCLE"("GLFW_GAMEPAD_BUTTON_B")
            "GLFW_GAMEPAD_BUTTON_SQUARE"("GLFW_GAMEPAD_BUTTON_X")
            "GLFW_GAMEPAD_BUTTON_TRIANGLE"("GLFW_GAMEPAD_BUTTON_Y")
        }

        int(
            javadoc = """
            Gamepad axes.

            See gamepad for how these are used.
        """.trimIndent()
        ) {
            "GLFW_GAMEPAD_AXIS_LEFT_X"("0")
            "GLFW_GAMEPAD_AXIS_LEFT_Y"("1")
            "GLFW_GAMEPAD_AXIS_RIGHT_X"("2")
            "GLFW_GAMEPAD_AXIS_RIGHT_Y"("3")
            "GLFW_GAMEPAD_AXIS_LEFT_TRIGGER"("4")
            "GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER"("5")
            "GLFW_GAMEPAD_AXIS_LAST"("GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER")
        }

        int(
            javadoc = """
            Error codes.

            See error handling for how these are used.
        """.trimIndent()
        ) {
            "GLFW_NO_ERROR"(
                "0",
                javadoc = """
                    No error has occurred.

                    ###### Analysis
                    Yay.
                """.trimIndent()
            )
            "GLFW_NOT_INITIALIZED"(
                "0x00010001",
                javadoc = """
                    GLFW has not been initialized.

                    This occurs if a GLFW function was called that must not be called unless the
                    library is initialized.

                    ###### Analysis
                    Application programmer error.  Initialize GLFW before calling any
                    function that requires initialization.
                """.trimIndent()
            )
            "GLFW_NO_CURRENT_CONTEXT"(
                "0x00010002",
                javadoc = """
                    No context is current for this thread.

                    This occurs if a GLFW function was called that needs and operates on the
                    current OpenGL or OpenGL ES context but no context is current on the calling
                    thread.  One such function is [glfwSwapInterval][#glfwSwapInterval(int)].

                    ###### Analysis
                    Application programmer error.  Ensure a context is current before
                    calling functions that require a current context.
                """.trimIndent()
            )
            "GLFW_INVALID_ENUM"(
                "0x00010003",
                javadoc = """
                    One of the arguments to the function was an invalid enum value.

                    One of the arguments to the function was an invalid enum value, for example
                    requesting [GLFW_RED_BITS][#GLFW_RED_BITS] with [glfwGetWindowAttrib][#glfwGetWindowAttrib(MemorySegment, int)].

                    ###### Analysis
                    Application programmer error.  Fix the offending call.
                """.trimIndent()
            )
            "GLFW_INVALID_VALUE"(
                "0x00010004",
                javadoc = """
                    One of the arguments to the function was an invalid value.

                    One of the arguments to the function was an invalid value, for example
                    requesting a non-existent OpenGL or OpenGL ES version like 2.7.

                    Requesting a valid but unavailable OpenGL or OpenGL ES version will instead
                    result in a [GLFW_VERSION_UNAVAILABLE][#GLFW_VERSION_UNAVAILABLE] error.

                    ###### Analysis
                    Application programmer error.  Fix the offending call.
                """.trimIndent()
            )
            "GLFW_OUT_OF_MEMORY"(
                "0x00010005",
                javadoc = """
                    A memory allocation failed.

                    ###### Analysis
                    A bug in GLFW or the underlying operating system.  Report the bug
                    to our [issue tracker](https://github.com/glfw/glfw/issues).
                """.trimIndent()
            )
            "GLFW_API_UNAVAILABLE"(
                "0x00010006",
                javadoc = """
                    GLFW could not find support for the requested API on the system.

                    ###### Analysis
                    The installed graphics driver does not support the requested
                    API, or does not support it via the chosen context creation API.
                    Below are a few examples.

                    Some pre-installed Windows graphics drivers do not support OpenGL.  AMD only
                    supports OpenGL ES via EGL, while Nvidia and Intel only support it via
                    a WGL or GLX extension.  macOS does not provide OpenGL ES at all.  The Mesa
                    EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
                    driver.  Older graphics drivers do not support Vulkan.
                """.trimIndent()
            )
            "GLFW_VERSION_UNAVAILABLE"(
                "0x00010007",
                javadoc = """
                    The requested OpenGL or OpenGL ES version is not available.

                    The requested OpenGL or OpenGL ES version (including any requested context
                    or framebuffer hints) is not available on this machine.

                    ###### Analysis
                    The machine does not support your requirements.  If your
                    application is sufficiently flexible, downgrade your requirements and try
                    again.  Otherwise, inform the user that their machine does not match your
                    requirements.
                """.trimIndent()
            )
            "GLFW_PLATFORM_ERROR"(
                "0x00010008",
                javadoc = """
                    A platform-specific error occurred that does not match any of the more
                    specific categories.

                    ###### Analysis
                    A bug or configuration error in GLFW, the underlying operating
                    system or its drivers, or a lack of required resources.  Report the issue to
                    our [issue tracker](https://github.com/glfw/glfw/issues).
                """.trimIndent()
            )
            "GLFW_FORMAT_UNAVAILABLE"(
                "0x00010009",
                javadoc = """
                    The requested format is not supported or available.

                    If emitted during window creation, the requested pixel format is not
                    supported.

                    If emitted when querying the clipboard, the contents of the clipboard could
                    not be converted to the requested format.

                    ###### Analysis
                    If emitted during window creation, one or more
                    hard constraints did not match any of the
                    available pixel formats.  If your application is sufficiently flexible,
                    downgrade your requirements and try again.  Otherwise, inform the user that
                    their machine does not match your requirements.

                    If emitted when querying the clipboard, ignore the error or report it to
                    the user, as appropriate.
                """.trimIndent()
            )
            "GLFW_NO_WINDOW_CONTEXT"(
                "0x0001000A",
                javadoc = """
                    The specified window does not have an OpenGL or OpenGL ES context.

                    A window that does not have an OpenGL or OpenGL ES context was passed to
                    a function that requires it to have one.

                    ###### Analysis
                    Application programmer error.  Fix the offending call.
                """.trimIndent()
            )
            "GLFW_CURSOR_UNAVAILABLE"(
                "0x0001000B",
                javadoc = """
                    The specified cursor shape is not available.

                    The specified standard cursor shape is not available, either because the
                    current platform cursor theme does not provide it or because it is not
                    available on the platform.

                    ###### Analysis
                    Platform or system settings limitation.  Pick another
                    standard cursor shape or create a
                    custom cursor.
                """.trimIndent()
            )
            "GLFW_FEATURE_UNAVAILABLE"(
                "0x0001000C",
                javadoc = """
                    The requested feature is not provided by the platform.

                    The requested feature is not provided by the platform, so GLFW is unable to
                    implement it.  The documentation for each function notes if it could emit
                    this error.

                    ###### Analysis
                    Platform or platform version limitation.  The error can be ignored
                    unless the feature is critical to the application.

                    A function call that emits this error has no effect other than the error and
                    updating any existing out parameters.
                """.trimIndent()
            )
            "GLFW_FEATURE_UNIMPLEMENTED"(
                "0x0001000D",
                javadoc = """
                    The requested feature is not implemented for the platform.

                    The requested feature has not yet been implemented in GLFW for this platform.

                    ###### Analysis
                    An incomplete implementation of GLFW for this platform, hopefully
                    fixed in a future release.  The error can be ignored unless the feature is
                    critical to the application.

                    A function call that emits this error has no effect other than the error and
                    updating any existing out parameters.
                """.trimIndent()
            )
            "GLFW_PLATFORM_UNAVAILABLE"(
                "0x0001000E",
                javadoc = """
                    Platform unavailable or no matching platform was found.

                    If emitted during initialization, no matching platform was found.  If the
                    [GLFW_PLATFORM][#GLFW_PLATFORM] init hint was set to `GLFW_ANY_PLATFORM`, GLFW could not detect any of
                    the platforms supported by this library binary, except for the Null platform.  If the
                    init hint was set to a specific platform, it is either not supported by this library
                    binary or GLFW was not able to detect it.

                    If emitted by a native access function, GLFW was initialized for a different platform
                    than the function is for.

                    ###### Analysis
                    Failure to detect any platform usually only happens on non-macOS Unix
                    systems, either when no window system is running or the program was run from
                    a terminal that does not have the necessary environment variables.  Fall back to
                    a different platform if possible or notify the user that no usable platform was
                    detected.

                    Failure to detect a specific platform may have the same cause as above or be because
                    support for that platform was not compiled in.  Call [glfwPlatformSupported][#glfwPlatformSupported(int)] to
                    check whether a specific platform is supported by a library binary.
                """.trimIndent()
            )
        }

        int("GLFW_FOCUSED" to "0x00020001", javadoc = "Input focus window hint and attribute")
        int("GLFW_ICONIFIED" to "0x00020002", javadoc = "Window iconification window attribute")
        int("GLFW_RESIZABLE" to "0x00020003", javadoc = "Window resize-ability window hint and attribute")
        int("GLFW_VISIBLE" to "0x00020004", javadoc = "Window visibility window hint and attribute")
        int("GLFW_DECORATED" to "0x00020005", javadoc = "Window decoration window hint and attribute")
        int("GLFW_AUTO_ICONIFY" to "0x00020006", javadoc = "Window auto-iconification window hint and attribute")
        int("GLFW_FLOATING" to "0x00020007", javadoc = "Window decoration window hint and attribute")
        int("GLFW_MAXIMIZED" to "0x00020008", javadoc = "Window maximization window hint and attribute")
        int("GLFW_CENTER_CURSOR" to "0x00020009", javadoc = "Cursor centering window hint")
        int(
            "GLFW_TRANSPARENT_FRAMEBUFFER" to "0x0002000A",
            javadoc = "Window framebuffer transparency hint and attribute"
        )
        int("GLFW_HOVERED" to "0x0002000B", javadoc = "Mouse cursor hover window attribute.")
        int("GLFW_FOCUS_ON_SHOW" to "0x0002000C", javadoc = "Input focus on calling show window hint and attribute")

        int("GLFW_MOUSE_PASSTHROUGH" to "0x0002000D", javadoc = "Mouse input transparency window hint and attribute")

        int("GLFW_POSITION_X" to "0x0002000E", javadoc = "Initial position x-coordinate window hint.")
        int("GLFW_POSITION_Y" to "0x0002000F", javadoc = "Initial position y-coordinate window hint.")

        int("GLFW_RED_BITS" to "0x00021001", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_GREEN_BITS" to "0x00021002", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_BLUE_BITS" to "0x00021003", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_ALPHA_BITS" to "0x00021004", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_DEPTH_BITS" to "0x00021005", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_STENCIL_BITS" to "0x00021006", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_ACCUM_RED_BITS" to "0x00021007", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_ACCUM_GREEN_BITS" to "0x00021008", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_ACCUM_BLUE_BITS" to "0x00021009", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_ACCUM_ALPHA_BITS" to "0x0002100A", javadoc = "Framebuffer bit depth hint.")
        int("GLFW_AUX_BUFFERS" to "0x0002100B", javadoc = "Framebuffer auxiliary buffer hint.")
        int("GLFW_STEREO" to "0x0002100C", javadoc = "OpenGL stereoscopic rendering hint.")
        int("GLFW_SAMPLES" to "0x0002100D", javadoc = "Framebuffer MSAA samples hint.")
        int("GLFW_SRGB_CAPABLE" to "0x0002100E", javadoc = "Framebuffer sRGB hint.")
        int("GLFW_REFRESH_RATE" to "0x0002100F", javadoc = "Monitor refresh rate hint.")
        int("GLFW_DOUBLEBUFFER" to "0x00021010", javadoc = "Framebuffer double buffering hint and attribute.")

        int("GLFW_CLIENT_API" to "0x00022001", javadoc = "Context client API hint and attribute.")
        int(
            "GLFW_CONTEXT_VERSION_MAJOR" to "0x00022002",
            javadoc = "Context client API major version hint and attribute."
        )
        int(
            "GLFW_CONTEXT_VERSION_MINOR" to "0x00022003",
            javadoc = "Context client API minor version hint and attribute."
        )
        int("GLFW_CONTEXT_REVISION" to "0x00022004", javadoc = "Context client API revision number attribute.")
        int("GLFW_CONTEXT_ROBUSTNESS" to "0x00022005", javadoc = "Context robustness hint and attribute.")
        int("GLFW_OPENGL_FORWARD_COMPAT" to "0x00022006", javadoc = "OpenGL forward-compatibility hint and attribute.")
        int("GLFW_CONTEXT_DEBUG" to "0x00022007", javadoc = "Debug mode context hint and attribute.")
        int(
            "GLFW_OPENGL_DEBUG_CONTEXT" to "GLFW_CONTEXT_DEBUG",
            javadoc = """
                Legacy name for compatibility.

                This is an alias for compatibility with earlier versions.
            """.trimIndent()
        )
        int("GLFW_OPENGL_PROFILE" to "0x00022008", javadoc = "OpenGL profile hint and attribute.")
        int("GLFW_CONTEXT_RELEASE_BEHAVIOR" to "0x00022009", javadoc = "Context flush-on-release hint and attribute.")
        int("GLFW_CONTEXT_NO_ERROR" to "0x0002200A", javadoc = "Context error suppression hint and attribute.")
        int("GLFW_CONTEXT_CREATION_API" to "0x0002200B", javadoc = "Context creation API hint and attribute.")
        int("GLFW_SCALE_TO_MONITOR" to "0x0002200C", javadoc = "Window content area scaling window hint.")
        int("GLFW_SCALE_FRAMEBUFFER" to "0x0002200D", javadoc = "Window framebuffer scaling window hint.")
        int(
            "GLFW_COCOA_RETINA_FRAMEBUFFER" to "0x00023001",
            javadoc = """
                Legacy name for compatibility.

                This is an alias for the
                [GLFW_SCALE_FRAMEBUFFER][#GLFW_SCALE_FRAMEBUFFER] window hint for
                compatibility with earlier versions.
            """.trimIndent()
        )
        int("GLFW_COCOA_FRAME_NAME" to "0x00023002", javadoc = "macOS specific window hint.")
        int("GLFW_COCOA_GRAPHICS_SWITCHING" to "0x00023003", javadoc = "macOS specific window hint.")
        int("GLFW_X11_CLASS_NAME" to "0x00024001", javadoc = "X11 specific window hint.")
        int("GLFW_X11_INSTANCE_NAME" to "0x00024002", javadoc = "X11 specific window hint.")
        int("GLFW_WIN32_KEYBOARD_MENU" to "0x00025001", javadoc = "Win32 specific window hint.")
        int("GLFW_WIN32_SHOWDEFAULT" to "0x00025002", javadoc = "Win32 specific window hint.")
        int(
            "GLFW_WAYLAND_APP_ID" to "0x00026001",
            javadoc = """
                Wayland specific window hint.

                Allows specification of the Wayland app_id.
            """.trimIndent()
        )

        int {
            "GLFW_NO_API"("0")
            "GLFW_OPENGL_API"("0x00030001")
            "GLFW_OPENGL_ES_API"("0x00030002")
        }

        int {
            "GLFW_NO_ROBUSTNESS"("0")
            "GLFW_NO_RESET_NOTIFICATION"("0x00031001")
            "GLFW_LOSE_CONTEXT_ON_RESET"("0x00031002")
        }

        int {
            "GLFW_OPENGL_ANY_PROFILE"("0")
            "GLFW_OPENGL_CORE_PROFILE"("0x00032001")
            "GLFW_OPENGL_COMPAT_PROFILE"("0x00032002")
        }

        int {
            "GLFW_CURSOR"("0x00033001")
            "GLFW_STICKY_KEYS"("0x00033002")
            "GLFW_STICKY_MOUSE_BUTTONS"("0x00033003")
            "GLFW_LOCK_KEY_MODS"("0x00033004")
            "GLFW_RAW_MOUSE_MOTION"("0x00033005")
            "GLFW_UNLIMITED_MOUSE_BUTTONS"("0x00033006")
        }

        int {
            "GLFW_CURSOR_NORMAL"("0x00034001")
            "GLFW_CURSOR_HIDDEN"("0x00034002")
            "GLFW_CURSOR_DISABLED"("0x00034003")
            "GLFW_CURSOR_CAPTURED"("0x00034004")
        }

        int {
            "GLFW_ANY_RELEASE_BEHAVIOR"("0")
            "GLFW_RELEASE_BEHAVIOR_FLUSH"("0x00035001")
            "GLFW_RELEASE_BEHAVIOR_NONE"("0x00035002")
        }

        int {
            "GLFW_NATIVE_CONTEXT_API"("0x00036001")
            "GLFW_EGL_CONTEXT_API"("0x00036002")
            "GLFW_OSMESA_CONTEXT_API"("0x00036003")
        }

        int {
            "GLFW_ANGLE_PLATFORM_TYPE_NONE"("0x00037001")
            "GLFW_ANGLE_PLATFORM_TYPE_OPENGL"("0x00037002")
            "GLFW_ANGLE_PLATFORM_TYPE_OPENGLES"("0x00037003")
            "GLFW_ANGLE_PLATFORM_TYPE_D3D9"("0x00037004")
            "GLFW_ANGLE_PLATFORM_TYPE_D3D11"("0x00037005")
            "GLFW_ANGLE_PLATFORM_TYPE_VULKAN"("0x00037007")
            "GLFW_ANGLE_PLATFORM_TYPE_METAL"("0x00037008")
        }

        int {
            "GLFW_WAYLAND_PREFER_LIBDECOR"("0x00038001")
            "GLFW_WAYLAND_DISABLE_LIBDECOR"("0x00038002")
        }

        int {
            "GLFW_ANY_POSITION"("0x80000000")
        }

        int(
            javadoc = """
            Standard system cursor shapes.

            These are the standard cursor shapes] that can be
            requested from the platform (window system).
        """.trimIndent()
        ) {
            "GLFW_ARROW_CURSOR"("0x00036001", javadoc = "The regular arrow cursor shape.")
            "GLFW_IBEAM_CURSOR"("0x00036002", javadoc = "The text input I-beam cursor shape.")
            "GLFW_CROSSHAIR_CURSOR"("0x00036003", javadoc = "The crosshair cursor shape.")
            "GLFW_POINTING_HAND_CURSOR"("0x00036004", javadoc = "The pointing hand cursor shape.")
            "GLFW_RESIZE_EW_CURSOR"(
                "0x00036005",
                javadoc = """
                    The horizontal resize/move arrow shape.

                    The horizontal resize/move arrow shape.  This is usually a horizontal
                    double-headed arrow.
                """.trimIndent()
            )
            "GLFW_RESIZE_NS_CURSOR"(
                "0x00036006",
                javadoc = """
                    The vertical resize/move arrow shape.

                    The vertical resize/move shape.  This is usually a vertical double-headed
                    arrow.
                """.trimIndent()
            )
            "GLFW_RESIZE_NWSE_CURSOR"(
                "0x00036007",
                javadoc = """
                    The top-left to bottom-right diagonal resize/move arrow shape.

                    The top-left to bottom-right diagonal resize/move shape.  This is usually
                    a diagonal double-headed arrow.

                    ###### Note
                    - __macOS:__ This shape is provided by a private system API and may fail
                        with [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] in the future.
                    - __Wayland:__ This shape is provided by a newer standard not supported by
                        all cursor themes.
                    - __X11:__ This shape is provided by a newer standard not supported by all
                        cursor themes.
                """.trimIndent()
            )
            "GLFW_RESIZE_NESW_CURSOR"(
                "0x00036008",
                javadoc = """
                    The top-right to bottom-left diagonal resize/move arrow shape.

                    The top-right to bottom-left diagonal resize/move shape.  This is usually
                    a diagonal double-headed arrow.

                    ###### Note
                    - __macOS:__ This shape is provided by a private system API and may fail
                        with [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] in the future.
                    - __Wayland:__ This shape is provided by a newer standard not supported by
                        all cursor themes.
                    - __X11:__ This shape is provided by a newer standard not supported by all
                        cursor themes.
                """.trimIndent()
            )
            "GLFW_RESIZE_ALL_CURSOR"(
                "0x00036009",
                javadoc = """
                    The omni-directional resize/move cursor shape.

                    The omni-directional resize cursor/move shape.  This is usually either
                    a combined horizontal and vertical double-headed arrow or a grabbing hand.
                """.trimIndent()
            )
            "GLFW_NOT_ALLOWED_CURSOR"(
                "0x0003600A",
                javadoc = """
                    The operation-not-allowed shape.

                    The operation-not-allowed shape.  This is usually a circle with a diagonal
                    line through it.

                    ###### Note
                    - __Wayland:__ This shape is provided by a newer standard not supported by
                        all cursor themes.
                    - __X11:__ This shape is provided by a newer standard not supported by all
                        cursor themes.
                """.trimIndent()
            )
            "GLFW_HRESIZE_CURSOR"(
                "GLFW_RESIZE_EW_CURSOR",
                javadoc = """
                    Legacy name for compatibility.

                    This is an alias for compatibility with earlier versions.
                """.trimIndent()
            )
            "GLFW_VRESIZE_CURSOR"(
                "GLFW_RESIZE_NS_CURSOR",
                javadoc = """
                    Legacy name for compatibility.

                    This is an alias for compatibility with earlier versions.
                """.trimIndent()
            )
            "GLFW_HAND_CURSOR"(
                "GLFW_POINTING_HAND_CURSOR",
                javadoc = """
                    Legacy name for compatibility.

                    This is an alias for compatibility with earlier versions.
                """.trimIndent()
            )
        }

        int("GLFW_CONNECTED" to "0x00040001")
        int("GLFW_DISCONNECTED" to "0x00040002")

        int("GLFW_JOYSTICK_HAT_BUTTONS" to "0x00050001", javadoc = "Joystick hat buttons init hint.")
        int("GLFW_ANGLE_PLATFORM_TYPE" to "0x00050002", javadoc = "ANGLE rendering backend init hint.")
        int("GLFW_PLATFORM" to "0x00050003", javadoc = "Platform selection init hint.")
        int("GLFW_COCOA_CHDIR_RESOURCES" to "0x00051001", javadoc = "macOS specific init hint.")
        int("GLFW_COCOA_MENUBAR" to "0x00051002", javadoc = "macOS specific init hint.")
        int("GLFW_X11_XCB_VULKAN_SURFACE" to "0x00052001", javadoc = "X11 specific init hint.")
        int("GLFW_WAYLAND_LIBDECOR" to "0x00053001", javadoc = "Wayland specific init hint.")

        int(
            javadoc = """
            Hint value that enables automatic platform selection.

            Hint value for [GLFW_PLATFORM][#GLFW_PLATFORM] that enables automatic platform selection.
        """.trimIndent()
        ) {
            "GLFW_ANY_PLATFORM"("0x00060000")
            "GLFW_PLATFORM_WIN32"("0x00060001")
            "GLFW_PLATFORM_COCOA"("0x00060002")
            "GLFW_PLATFORM_WAYLAND"("0x00060003")
            "GLFW_PLATFORM_X11"("0x00060004")
            "GLFW_PLATFORM_NULL"("0x00060005")
        }

        int("GLFW_DONT_CARE" to "-1")

        //endregion

        //region GLFW API functions

        +"glfwInit"(
            glfw_boolean,
            entrypoint = "glfwInit",
            javadoc = """
                Initializes the GLFW library.

                This function initializes the GLFW library.  Before most GLFW functions can
                be used, GLFW must be initialized, and before an application terminates GLFW
                should be terminated in order to free any resources allocated during or
                after initialization.

                If this function fails, it calls [glfwTerminate][#glfwTerminate()] before returning.  If it
                succeeds, you should call [glfwTerminate][#glfwTerminate()] before the application exits.

                Additional calls to this function after successful initialization but before
                termination will return `GLFW_TRUE` immediately.

                The [GLFW_PLATFORM][#GLFW_PLATFORM] init hint controls which platforms are considered during
                initialization.  This also depends on which platforms the library was compiled to
                support.

                @return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_PLATFORM_UNAVAILABLE][#GLFW_PLATFORM_UNAVAILABLE] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark
                - __macOS:__ This function will change the current directory of the
                    application to the `Contents/Resources` subdirectory of the application's
                    bundle, if present.  This can be disabled with the
                    [GLFW_COCOA_CHDIR_RESOURCES][#GLFW_COCOA_CHDIR_RESOURCES] init hint.

                    This function will create the main menu and dock icon for the
                    application.  If GLFW finds a `MainMenu.nib` it is loaded and assumed to
                    contain a menu bar.  Otherwise a minimal menu bar is created manually with
                    common commands like Hide, Quit and About.  The About entry opens a minimal
                    about dialog with information from the application's bundle.  The menu bar
                    and dock icon can be disabled entirely with the [GLFW_COCOA_MENUBAR][#GLFW_COCOA_MENUBAR] init
                    hint.
                - __Wayland, X11:__ If the library was compiled with support for both
                    Wayland and X11, and the [GLFW_PLATFORM][#GLFW_PLATFORM] init hint is set to
                    `GLFW_ANY_PLATFORM`, the `XDG_SESSION_TYPE` environment variable affects
                    which platform is picked.  If the environment variable is not set, or is set
                    to something other than `wayland` or `x11`, the regular detection mechanism
                    will be used instead.
                - __X11:__ This function will set the `LC_CTYPE` category of the
                    application locale according to the current environment if that category is
                    still "C".  This is because the "C" locale breaks Unicode text input.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwInitHint(int, int) glfwInitHint
                @see #glfwInitAllocator(MemorySegment) glfwInitAllocator
                @see #glfwTerminate() glfwTerminate
            """.trimIndent(),
            addNow = false
        ).overload()

        "glfwTerminate"(
            void,
            entrypoint = "glfwTerminate",
            javadoc = """
                Terminates the GLFW library.

                This function destroys all remaining windows and cursors, restores any
                modified gamma ramps and frees any other allocated resources.  Once this
                function is called, you must again call [glfwInit][#glfwInit()] successfully before
                you will be able to use most GLFW functions.

                If GLFW has been successfully initialized, this function should be called
                before the application exits.  If initialization fails, there is no need to
                call this function, as it is called by [glfwInit][#glfwInit()] before it returns
                failure.

                This function has no effect if GLFW is not initialized.

                @glfw.errors Possible errors include [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.warning The contexts of any remaining windows must not be current on any
                other thread when this function is called.

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwInit() glfwInit
            """.trimIndent()
        )

        "glfwInitHint"(
            void,
            int("hint"),
            int("value"),
            entrypoint = "glfwInitHint",
            javadoc = """
                Sets the specified init hint to the desired value.

                This function sets hints for the next initialization of GLFW.

                The values you set hints to are never reset by GLFW, but they only take
                effect during initialization.  Once GLFW has been initialized, any values
                you set will be ignored until the library is terminated and initialized
                again.

                Some hints are platform specific.  These may be set on any platform but they
                will only affect their specific platform.  Other platforms will ignore them.
                Setting these hints requires no platform specific headers or functions.

                @param hint The init hint to set.
                @param value The new value of the init hint.

                @glfw.errors Possible errors include [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwInit() glfwInit
            """.trimIndent()
        )

        +"glfwInitAllocator"(
            void,
            const_GLFWallocator_ptr("allocator"),
            entrypoint = "glfwInitAllocator",
            javadoc = """
                Sets the init allocator to the desired value.

                To use the default allocator, call this function with a `NULL` argument.

                If you specify an allocator struct, every member must be a valid function
                pointer.  If any member is `NULL`, this function will emit
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and the init allocator will be unchanged.

                The functions in the allocator must fulfil a number of requirements.  See the
                documentation for [GLFWAllocateFun], [GLFWReallocateFun] and
                [GLFWDeallocateFun] for details.

                @param allocator The allocator to use at the next initialization, or
                `NULL` to use the default one.

                @glfw.errors Possible errors include [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].

                @glfw.pointer_lifetime The specified allocator is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwInit() glfwInit
            """.trimIndent()
        ).overload()

        +"glfwGetVersion"(
            void,
            int_ptr("major").ref(),
            int_ptr("minor").ref(),
            int_ptr("rev").ref(),
            entrypoint = "glfwGetVersion",
            javadoc = """
                Retrieves the version of the GLFW library.

                This function retrieves the major, minor and revision numbers of the GLFW
                library.  It is intended for when you are using GLFW as a shared library and
                want to ensure that you are using the minimum required version.

                Any or all of the version arguments may be `NULL`.

                @param major Where to store the major version number, or `NULL`.
                @param minor Where to store the minor version number, or `NULL`.
                @param rev Where to store the revision number, or `NULL`.

                @glfw.errors None.

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetVersionString() glfwGetVersionString
            """.trimIndent()
        ).overload()

        +"glfwGetVersionString_"(
            const_char_ptr,
            entrypoint = "glfwGetVersionString",
            javadoc = """
                Returns a string describing the compile-time configuration.

                This function returns the compile-time generated
                version string of the GLFW library binary.  It describes
                the version, platforms, compiler and any platform or operating system specific
                compile-time options.  It should not be confused with the OpenGL or OpenGL ES version
                string, queried with `glGetString`.

                __Do not use the version string__ to parse the GLFW library version.  The
                [glfwGetVersion][#glfwGetVersion(MemorySegment, MemorySegment, MemorySegment)] function provides the version of the running library
                binary in numerical format.

                __Do not use the version string__ to parse what platforms are supported.  The
                [glfwPlatformSupported][#glfwPlatformSupported(int)] function lets you query platform support.

                @return The ASCII encoded GLFW version string.

                @glfw.errors None.

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.pointer_lifetime The returned string is static and compile-time generated.

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetVersion(MemorySegment, MemorySegment, MemorySegment) glfwGetVersion
            """.trimIndent()
        ).overload(name = "glfwGetVersionString")

        +"glfwGetError"(
            int,
            (string_u8_array c "const char**")("description").ref(),
            entrypoint = "glfwGetError",
            javadoc = """
                Returns and clears the last error for the calling thread.

                This function returns and clears the error code of the last
                error that occurred on the calling thread, and optionally a UTF-8 encoded
                human-readable description of it.  If no error has occurred since the last
                call, it returns [GLFW_NO_ERROR][#GLFW_NO_ERROR] (zero) and the description pointer is
                set to `NULL`.

                @param description Where to store the error description pointer, or `NULL`.
                @return The last error code for the calling thread, or [GLFW_NO_ERROR][#GLFW_NO_ERROR]
                (zero).

                @glfw.errors None.

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is guaranteed to be valid only until the
                next error occurs or the library is terminated.

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwSetErrorCallback(MemorySegment) glfwSetErrorCallback
            """.trimIndent()
        ).overload()

        +"glfwSetErrorCallback"(
            address c "GLFWerrorfun",
            GLFWerrorfun("callback"),
            entrypoint = "glfwSetErrorCallback",
            javadoc = """
                Sets the error callback.

                This function sets the error callback, which is called with an error code
                and a human-readable description each time a GLFW error occurs.

                The error code is set before the callback is called.  Calling
                [glfwGetError][#glfwGetError(MemorySegment)] from the error callback will return the same value as the error
                code argument.

                The error callback is called on the thread where the error occurred.  If you
                are using GLFW from multiple threads, your error callback needs to be
                written accordingly.

                Because the description string may have been generated specifically for that
                error, it is not guaranteed to be valid after the callback has returned.  If
                you wish to use it after the callback returns, you need to make a copy.

                Once set, the error callback remains set even after the library has been
                terminated.

                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [callback pointer type][GLFWErrorFun].

                @glfw.errors None.

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetError(MemorySegment) glfwGetError
            """.trimIndent()
        ).callbackOverload("Arena.global()")

        "glfwGetPlatform"(
            int,
            entrypoint = "glfwGetPlatform",
            javadoc = """
                Returns the currently selected platform.

                This function returns the platform that was selected during initialization.  The
                returned value will be one of `GLFW_PLATFORM_WIN32`, `GLFW_PLATFORM_COCOA`,
                `GLFW_PLATFORM_WAYLAND`, `GLFW_PLATFORM_X11` or `GLFW_PLATFORM_NULL`.

                @return The currently selected platform, or zero if an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwPlatformSupported(int) glfwPlatformSupported
            """.trimIndent()
        )

        +"glfwPlatformSupported"(
            glfw_boolean,
            int("platform"),
            entrypoint = "glfwPlatformSupported",
            javadoc = """
                Returns whether the library includes support for the specified platform.

                This function returns whether the library was compiled with support for the specified
                platform.  The platform must be one of `GLFW_PLATFORM_WIN32`, `GLFW_PLATFORM_COCOA`,
                `GLFW_PLATFORM_WAYLAND`, `GLFW_PLATFORM_X11` or `GLFW_PLATFORM_NULL`.

                @param platform The platform to query.
                @return `GLFW_TRUE` if the platform is supported, or `GLFW_FALSE` otherwise.

                @glfw.errors Possible errors include [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.remark This function may be called before [glfwInit][#glfwInit()].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetPlatform() glfwGetPlatform
            """.trimIndent(),
            addNow = false
        ).overload()

        //region Monitor
        "glfwGetMonitors"(
            (address c "GLFWmonitor**"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetMonitors",
            javadoc = """
                Returns the currently connected monitors.

                This function returns an array of handles for all currently connected
                monitors.  The primary monitor is always first in the returned array.  If no
                monitors were found, this function returns `NULL`.

                @param count Where to store the number of monitors in the returned
                array.  This is set to zero if an error occurred.
                @return An array of monitor handles, or `NULL` if no monitors were found or
                if an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is guaranteed to be valid only until the
                monitor configuration changes or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetPrimaryMonitor() glfwGetPrimaryMonitor
            """.trimIndent()
        )

        "glfwGetPrimaryMonitor"(
            GLFWmonitor_ptr,
            entrypoint = "glfwGetPrimaryMonitor",
            javadoc = """
                Returns the primary monitor.

                This function returns the primary monitor.  This is usually the monitor
                where elements like the task bar or global menu bar are located.

                @return The primary monitor, or `NULL` if no monitors were found or if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.

                @glfw.remark The primary monitor is always first in the array returned by @ref
                glfwGetMonitors.

                @see #glfwGetMonitors(MemorySegment) glfwGetMonitors
            """.trimIndent()
        )

        +"glfwGetMonitorPos"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            entrypoint = "glfwGetMonitorPos",
            javadoc = """
                Returns the position of the monitor's viewport on the virtual screen.

                This function returns the position, in screen coordinates, of the upper-left
                corner of the specified monitor.

                Any or all of the position arguments may be `NULL`.  If an error occurs, all
                non-`NULL` position arguments will be set to zero.

                @param monitor The monitor to query.
                @param xpos Where to store the monitor x-coordinate, or `NULL`.
                @param ypos Where to store the monitor y-coordinate, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        +"glfwGetMonitorWorkarea"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetMonitorWorkarea",
            javadoc = """
                Retrieves the work area of the monitor.

                This function returns the position, in screen coordinates, of the upper-left
                corner of the work area of the specified monitor along with the work area
                size in screen coordinates. The work area is defined as the area of the
                monitor not occluded by the window system task bar where present. If no
                task bar exists then the work area is the monitor resolution in screen
                coordinates.

                Any or all of the position and size arguments may be `NULL`.  If an error
                occurs, all non-`NULL` position and size arguments will be set to zero.

                @param monitor The monitor to query.
                @param xpos Where to store the monitor x-coordinate, or `NULL`.
                @param ypos Where to store the monitor y-coordinate, or `NULL`.
                @param width Where to store the monitor width, or `NULL`.
                @param height Where to store the monitor height, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        +"glfwGetMonitorPhysicalSize"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("widthMM").ref(),
            int_ptr("heightMM").ref(),
            entrypoint = "glfwGetMonitorPhysicalSize",
            javadoc = """
                Returns the physical size of the monitor.

                This function returns the size, in millimetres, of the display area of the
                specified monitor.

                Some platforms do not provide accurate monitor size information, either
                because the monitor [EDID](https://en.wikipedia.org/wiki/Extended_display_identification_data) data is incorrect or because the driver does
                not report it accurately.

                Any or all of the size arguments may be `NULL`.  If an error occurs, all
                non-`NULL` size arguments will be set to zero.

                @param monitor The monitor to query.
                @param widthMM Where to store the width, in millimetres, of the
                monitor's display area, or `NULL`.
                @param heightMM Where to store the height, in millimetres, of the
                monitor's display area, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.remark __Windows:__ On Windows 8 and earlier the physical size is calculated from
                the current resolution and system DPI instead of querying the monitor EDID data.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        +"glfwGetMonitorContentScale"(
            void,
            GLFWmonitor_ptr("monitor"),
            float_ptr("xscale").ref(),
            float_ptr("yscale").ref(),
            entrypoint = "glfwGetMonitorContentScale",
            javadoc = """
                Retrieves the content scale for the specified monitor.

                This function retrieves the content scale for the specified monitor.  The
                content scale is the ratio between the current DPI and the platform's
                default DPI.  This is especially important for text and any UI elements.  If
                the pixel dimensions of your UI scaled by this look appropriate on your
                machine then it should appear at a reasonable size on other machines
                regardless of their DPI and scaling settings.  This relies on the system DPI
                and scaling settings being somewhat correct.

                The content scale may depend on both the monitor resolution and pixel
                density and on user settings.  It may be very different from the raw DPI
                calculated from the physical size and current resolution.

                @param monitor The monitor to query.
                @param xscale Where to store the x-axis content scale, or `NULL`.
                @param yscale Where to store the y-axis content scale, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Wayland:__ Fractional scaling information is not yet available for
                monitors, so this function only returns integer content scales.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowContentScale
            """.trimIndent()
        ).overload()

        +"glfwGetMonitorName_"(
            const_char_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetMonitorName",
            javadoc = """
                Returns the name of the specified monitor.

                This function returns a human-readable name, encoded as UTF-8, of the
                specified monitor.  The name typically reflects the make and model of the
                monitor and is not guaranteed to be unique among the connected monitors.

                @param monitor The monitor to query.
                @return The UTF-8 encoded name of the monitor, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified monitor is
                disconnected or the library is terminated.
                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload(name = "glfwGetMonitorName")

        "glfwSetMonitorUserPointer"(
            void,
            GLFWmonitor_ptr("monitor"),
            void_ptr("pointer"),
            entrypoint = "glfwSetMonitorUserPointer",
            javadoc = """
                Sets the user pointer of the specified monitor.

                This function sets the user-defined pointer of the specified monitor.  The
                current value is retained until the monitor is disconnected.  The initial
                value is `NULL`.

                This function may be called from the monitor callback, even for a monitor
                that is being disconnected.

                @param monitor The monitor whose pointer to set.
                @param pointer The new value.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwGetMonitorUserPointer(MemorySegment) glfwGetMonitorUserPointer
            """.trimIndent()
        )

        "glfwGetMonitorUserPointer"(
            void_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetMonitorUserPointer",
            javadoc = """
                Returns the user pointer of the specified monitor.

                This function returns the current value of the user-defined pointer of the
                specified monitor.  The initial value is `NULL`.

                This function may be called from the monitor callback, even for a monitor
                that is being disconnected.

                @param monitor The monitor whose pointer to return.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwSetMonitorUserPointer(MemorySegment, MemorySegment) glfwSetMonitorUserPointer
            """.trimIndent()
        )

        +"glfwSetMonitorCallback"(
            address c "GLFWmonitorfun",
            GLFWmonitorfun("callback"),
            entrypoint = "glfwSetMonitorCallback",
            javadoc = """
                Sets the monitor configuration callback.

                This function sets the monitor configuration callback, or removes the
                currently set callback.  This is called when a monitor is connected to or
                disconnected from the system.

                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWMonitorFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).callbackOverload("Arena.global()")
        //endregion

        "glfwGetVideoModes"(
            address c "const GLFWvidmode*",
            GLFWmonitor_ptr("monitor"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetVideoModes",
            javadoc = """
                Returns the available video modes for the specified monitor.

                This function returns an array of all video modes supported by the specified
                monitor.  The returned array is sorted in ascending order, first by color
                bit depth (the sum of all channel depths), then by resolution area (the
                product of width and height), then resolution width and finally by refresh
                rate.

                @param monitor The monitor to query.
                @param count Where to store the number of video modes in the returned
                array.  This is set to zero if an error occurred.
                @return An array of video modes, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified monitor is
                disconnected, this function is called again for that monitor or the library
                is terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetVideoMode(MemorySegment) glfwGetVideoMode
            """.trimIndent()
        )

        +"glfwGetVideoMode_"(
            const_GLFWvidmode_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetVideoMode",
            javadoc = """
                Returns the current mode of the specified monitor.

                This function returns the current video mode of the specified monitor.  If
                you have created a full screen window for that monitor, the return value
                will depend on whether that window is iconified.

                @param monitor The monitor to query.
                @return The current mode of the monitor, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified monitor is
                disconnected or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetVideoModes(MemorySegment, MemorySegment) glfwGetVideoModes
            """.trimIndent()
        ).overload(name = "glfwGetVideoMode")

        "glfwSetGamma"(
            void,
            GLFWmonitor_ptr("monitor"),
            float("gamma"),
            entrypoint = "glfwSetGamma",
            javadoc = """
                Generates a gamma ramp and sets it for the specified monitor.

                This function generates an appropriately sized gamma ramp from the specified
                exponent and then calls [glfwSetGammaRamp][#glfwSetGammaRamp(MemorySegment, MemorySegment)] with it.  The value must be
                a finite number greater than zero.

                The software controlled gamma ramp is applied _in addition_ to the hardware
                gamma correction, which today is usually an approximation of sRGB gamma.
                This means that setting a perfectly linear ramp, or gamma 1.0, will produce
                the default (usually sRGB-like) behavior.

                For gamma correct rendering with OpenGL or OpenGL ES, see the
                [GLFW_SRGB_CAPABLE][#GLFW_SRGB_CAPABLE] hint.

                @param monitor The monitor whose gamma ramp to set.
                @param gamma The desired exponent.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE],
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark __Wayland:__ Gamma handling is a privileged protocol, this function
                will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        +"glfwGetGammaRamp_"(
            const_GLFWgammaramp_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetGammaRamp",
            javadoc = """
                Returns the current gamma ramp for the specified monitor.

                This function returns the current gamma ramp of the specified monitor.

                @param monitor The monitor to query.
                @return The current gamma ramp, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
                and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark __Wayland:__ Gamma handling is a privileged protocol, this function
                will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] while
                returning `NULL`.

                @glfw.pointer_lifetime The returned structure and its arrays are allocated and
                freed by GLFW.  You should not free them yourself.  They are valid until the
                specified monitor is disconnected, this function is called again for that
                monitor or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload(name = "glfwGetGammaRamp")

        +"glfwSetGammaRamp"(
            void,
            GLFWmonitor_ptr("monitor"),
            const_GLFWgammaramp_ptr("ramp"),
            entrypoint = "glfwSetGammaRamp",
            javadoc = """
                Sets the current gamma ramp for the specified monitor.

                This function sets the current gamma ramp for the specified monitor.  The
                original gamma ramp for that monitor is saved by GLFW the first time this
                function is called and is restored by [glfwTerminate][#glfwTerminate()].

                The software controlled gamma ramp is applied _in addition_ to the hardware
                gamma correction, which today is usually an approximation of sRGB gamma.
                This means that setting a perfectly linear ramp, or gamma 1.0, will produce
                the default (usually sRGB-like) behavior.

                For gamma correct rendering with OpenGL or OpenGL ES, see the
                [GLFW_SRGB_CAPABLE][#GLFW_SRGB_CAPABLE] hint.

                @param monitor The monitor whose gamma ramp to set.
                @param ramp The gamma ramp to use.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
                and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark The size of the specified gamma ramp should match the size of the
                current ramp for that monitor.
                - __Windows:__ The gamma ramp size must be 256.
                - __Wayland:__ Gamma handling is a privileged protocol, this function
                    will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.pointer_lifetime The specified gamma ramp is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        "glfwDefaultWindowHints"(
            void,
            entrypoint = "glfwDefaultWindowHints",
            javadoc = """
                Resets all window hints to their default values.

                This function resets all window hints to their
                default values.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwWindowHint(int, int) glfwWindowHint
                @see #glfwWindowHintString(int, MemorySegment) glfwWindowHintString
            """.trimIndent()
        )

        "glfwWindowHint"(
            void,
            int("hint"),
            int("value"),
            entrypoint = "glfwWindowHint",
            javadoc = """
                Sets the specified window hint to the desired value.

                This function sets hints for the next call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].  The
                hints, once set, retain their values until changed by a call to this
                function or [glfwDefaultWindowHints][#glfwDefaultWindowHints()], or until the library is terminated.

                Only integer value hints can be set with this function.  String value hints
                are set with [glfwWindowHintString][#glfwWindowHintString(int, MemorySegment)].

                This function does not check whether the specified hint values are valid.
                If you set hints to invalid values this will instead be reported by the next
                call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].

                Some hints are platform specific.  These may be set on any platform but they
                will only affect their specific platform.  Other platforms will ignore them.
                Setting these hints requires no platform specific headers or functions.

                @param hint The window hint to set.
                @param value The new value of the window hint.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwWindowHintString(int, MemorySegment) glfwWindowHintString
                @see #glfwDefaultWindowHints() glfwDefaultWindowHints
            """.trimIndent()
        )

        +"glfwWindowHintString"(
            void,
            int("hint"),
            const_char_ptr("value"),
            entrypoint = "glfwWindowHintString",
            javadoc = """
                Sets the specified window hint to the desired value.

                This function sets hints for the next call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].  The
                hints, once set, retain their values until changed by a call to this
                function or [glfwDefaultWindowHints][#glfwDefaultWindowHints()], or until the library is terminated.

                Only string type hints can be set with this function.  Integer value hints
                are set with [glfwWindowHint][#glfwWindowHint(int, int)].

                This function does not check whether the specified hint values are valid.
                If you set hints to invalid values this will instead be reported by the next
                call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].

                Some hints are platform specific.  These may be set on any platform but they
                will only affect their specific platform.  Other platforms will ignore them.
                Setting these hints requires no platform specific headers or functions.

                @param hint The window hint to set.
                @param value The new value of the window hint.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.pointer_lifetime The specified string is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwWindowHint(int, int) glfwWindowHint
                @see #glfwDefaultWindowHints() glfwDefaultWindowHints
            """.trimIndent()
        ).overload()

        +"glfwCreateWindow"(
            GLFWwindow_ptr,
            int("width"),
            int("height"),
            const_char_ptr("title"),
            GLFWmonitor_ptr("monitor"),
            GLFWwindow_ptr("share"),
            entrypoint = "glfwCreateWindow",
            javadoc = """
                Creates a window and its associated context.

                This function creates a window and its associated OpenGL or OpenGL ES
                context.  Most of the options controlling how the window and its context
                should be created are specified with window hints.

                Successful creation does not change which context is current.  Before you
                can use the newly created context, you need to
                make it current.  For information about the `share`
                parameter, see context_sharing.

                The created window, framebuffer and context may differ from what you
                requested, as not all parameters and hints are
                hard constraints.  This includes the size of the
                window, especially for full screen windows.  To query the actual attributes
                of the created window, framebuffer and context, see
                [glfwGetWindowAttrib][#glfwGetWindowAttrib(MemorySegment, int)], [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)] and [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].

                To create a full screen window, you need to specify the monitor the window
                will cover.  If no monitor is specified, the window will be windowed mode.
                Unless you have a way for the user to choose a specific monitor, it is
                recommended that you pick the primary monitor.  For more information on how
                to query connected monitors, see monitor_monitors.

                For full screen windows, the specified size becomes the resolution of the
                window's _desired video mode_.  As long as a full screen window is not
                iconified, the supported video mode most closely matching the desired video
                mode is set for the specified monitor.  For more information about full
                screen windows, including the creation of so called _windowed full screen_
                or _borderless full screen_ windows, see window_windowed_full_screen.

                Once you have created the window, you can switch it between windowed and
                full screen mode with [glfwSetWindowMonitor][#glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int)].  This will not affect its
                OpenGL or OpenGL ES context.

                By default, newly created windows use the placement recommended by the
                window system.  To create the window at a specific position, set the
                [GLFW_POSITION_X][#GLFW_POSITION_X] and [GLFW_POSITION_Y][#GLFW_POSITION_Y] window hints before creation.  To
                restore the default behavior, set either or both hints back to
                `GLFW_ANY_POSITION`.

                As long as at least one full screen window is not iconified, the screensaver
                is prohibited from starting.

                Window systems put limits on window sizes.  Very large or very small window
                dimensions may be overridden by the window system on creation.  Check the
                actual size after creation.

                The swap interval is not set during window creation and
                the initial value may vary depending on driver settings and defaults.

                @param width The desired width, in screen coordinates, of the window.
                This must be greater than zero.
                @param height The desired height, in screen coordinates, of the window.
                This must be greater than zero.
                @param title The initial, UTF-8 encoded window title.
                @param monitor The monitor to use for full screen mode, or `NULL` for
                windowed mode.
                @param share The window whose context to share resources with, or `NULL`
                to not share resources.
                @return The handle of the created window, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE],
                [GLFW_VERSION_UNAVAILABLE][#GLFW_VERSION_UNAVAILABLE], [GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE],
                [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark
                - __Windows:__ Window creation will fail if the Microsoft GDI software
                    OpenGL implementation is the only one available.

                    If the executable has an icon resource named `GLFW_ICON,` it
                    will be set as the initial icon for the window.  If no such icon is present,
                    the `IDI_APPLICATION` icon will be used instead.  To set a different icon,
                    see [glfwSetWindowIcon][#glfwSetWindowIcon(MemorySegment, int, MemorySegment)].

                    The context to share resources with must not be current on
                    any other thread.
                - __macOS:__ The OS only supports core profile contexts for OpenGL
                    versions 3.2 and later.  Before creating an OpenGL context of version 3.2 or
                    later you must set the [GLFW_OPENGL_PROFILE][#GLFW_OPENGL_PROFILE]
                    hint accordingly.  OpenGL 3.0 and 3.1 contexts are not supported at all
                    on macOS.

                    The GLFW window has no icon, as it is not a document
                    window, but the dock icon will be the same as the application bundle's icon.
                    For more information on bundles, see the
                    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.

                    The window frame will not be rendered at full resolution on
                    Retina displays unless the
                    [GLFW_SCALE_FRAMEBUFFER][#GLFW_SCALE_FRAMEBUFFER]
                    hint is `GLFW_TRUE` and the `NSHighResolutionCapable` key is enabled in the
                    application bundle's `Info.plist`.  For more information, see
                    [High Resolution Guidelines for OS X](https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html) in the Mac Developer
                    Library.  The GLFW test and example programs use a custom `Info.plist`
                    template for this, which can be found as `CMake/Info.plist.in` in the source
                    tree.

                    When activating frame autosaving with
                    [GLFW_COCOA_FRAME_NAME][#GLFW_COCOA_FRAME_NAME], the specified
                    window size and position may be overridden by previously saved values.
                - __Wayland:__ GLFW uses [libdecor](https://gitlab.freedesktop.org/libdecor/libdecor) where available to create its window
                    decorations.  This in turn uses server-side XDG decorations where available
                    and provides high quality client-side decorations on compositors like GNOME.
                    If both XDG decorations and libdecor are unavailable, GLFW falls back to
                    a very simple set of window decorations that only support moving, resizing
                    and the window manager's right-click menu.
                - __X11:__ Some window managers will not respect the placement of
                    initially hidden windows.

                    Due to the asynchronous nature of X11, it may take a moment for
                    a window to reach its requested state.  This means you may not be able to
                    query the final size, position or other attributes directly after window
                    creation.

                    The class part of the `WM_CLASS` window property will by
                    default be set to the window title passed to this function.  The instance
                    part will use the contents of the `RESOURCE_NAME` environment variable, if
                    present and not empty, or fall back to the window title.  Set the
                    [GLFW_X11_CLASS_NAME][#GLFW_X11_CLASS_NAME] and
                    [GLFW_X11_INSTANCE_NAME][#GLFW_X11_INSTANCE_NAME] window hints to
                    override this.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwDestroyWindow(MemorySegment) glfwDestroyWindow
            """.trimIndent()
        ).overload()

        "glfwDestroyWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwDestroyWindow",
            javadoc = """
                Destroys the specified window and its context.

                This function destroys the specified window and its context.  On calling
                this function, no further callbacks will be called for that window.

                If the context of the specified window is current on the main thread, it is
                detached before being destroyed.

                @param window The window to destroy.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.note The context of the specified window must not be current on any other
                thread when this function is called.

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment) glfwCreateWindow
            """.trimIndent()
        )

        +"glfwWindowShouldClose"(
            glfw_boolean,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwWindowShouldClose",
            javadoc = """
                Checks the close flag of the specified window.

                This function returns the value of the close flag of the specified window.

                @param window The window to query.
                @return The value of the close flag.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            addNow = false
        ).overload()

        +"glfwSetWindowShouldClose"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("value"),
            entrypoint = "glfwSetWindowShouldClose",
            javadoc = """
                Sets the close flag of the specified window.

                This function sets the value of the close flag of the specified window.
                This can be used to override the user's attempt to close the window, or
                to signal that it should be closed.

                @param window The window whose flag to change.
                @param value The new value.

                @errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            addNow = false
        ).overload()

        +"glfwGetWindowTitle_"(
            const_char_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWindowTitle",
            javadoc = """
                Returns the title of the specified window.

                This function returns the window title, encoded as UTF-8, of the specified
                window.  This is the title set previously by [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)]
                or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].

                @param window The window to query.
                @return The UTF-8 encoded window title, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.remark The returned title is currently a copy of the title last set by
                [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)] or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].  It does not include any
                additional text which may be appended by the platform or another program.

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the next call to
                `glfwGetWindowTitle` or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)], or until the library is
                terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowTitle(MemorySegment, MemorySegment) glfwSetWindowTitle
            """.trimIndent()
        ).overload(name = "glfwGetWindowTitle")

        +"glfwSetWindowTitle"(
            void,
            GLFWwindow_ptr("window"),
            const_char_ptr("title"),
            entrypoint = "glfwSetWindowTitle",
            javadoc = """
                Sets the title of the specified window.

                This function sets the window title, encoded as UTF-8, of the specified
                window.

                @param window The window whose title to change.
                @param title The UTF-8 encoded window title.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __macOS:__ The window title will not be updated until the next time you
                process events.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowTitle(MemorySegment) glfwGetWindowTitle
            """.trimIndent()
        ).overload()

        +"glfwSetWindowIcon"(
            void,
            GLFWwindow_ptr("window"),
            int("count"),
            const_GLFWimage_ptr("images"),
            entrypoint = "glfwSetWindowIcon",
            javadoc = """
                Sets the icon for the specified window.

                This function sets the icon of the specified window.  If passed an array of
                candidate images, those of or closest to the sizes desired by the system are
                selected.  If no images are specified, the window reverts to its default
                icon.

                The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
                bits per channel with the red channel first.  They are arranged canonically
                as packed sequential rows, starting from the top-left corner.

                The desired image sizes varies depending on platform and system settings.
                The selected images will be rescaled as needed.  Good sizes include 16x16,
                32x32 and 48x48.

                @param window The window whose icon to set.
                @param count The number of images in the specified array, or zero to
                revert to the default window icon.
                @param images The images to create the icon from.  This is ignored if
                count is zero.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
                [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.pointer_lifetime The specified image data is copied before this function
                returns.

                @glfw.remark
                - __macOS:__ Regular windows do not have icons on macOS.  This function
                    will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].  The dock icon will be the same as
                    the application bundle's icon.  For more information on bundles, see the
                    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.
                - __Wayland:__ There is no existing protocol to change an icon, the
                    window will thus inherit the one defined in the application's desktop file.
                    This function will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        +"glfwGetWindowPos"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            entrypoint = "glfwGetWindowPos",
            javadoc = """
                Retrieves the position of the content area of the specified window.

                This function retrieves the position, in screen coordinates, of the
                upper-left corner of the content area of the specified window.

                Any or all of the position arguments may be `NULL`.  If an error occurs, all
                non-`NULL` position arguments will be set to zero.

                @param window The window to query.
                @param xpos Where to store the x-coordinate of the upper-left corner of
                the content area, or `NULL`.
                @param ypos Where to store the y-coordinate of the upper-left corner of
                the content area, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark __Wayland:__ There is no way for an application to retrieve the global
                position of its windows.  This function will emit
                [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowPos(MemorySegment, int, int) glfwSetWindowPos
            """.trimIndent()
        ).overload()

        "glfwSetWindowPos"(
            void,
            GLFWwindow_ptr("window"),
            int("xpos"),
            int("ypos"),
            entrypoint = "glfwSetWindowPos",
            javadoc = """
                Sets the position of the content area of the specified window.

                This function sets the position, in screen coordinates, of the upper-left
                corner of the content area of the specified windowed mode window.  If the
                window is a full screen window, this function does nothing.

                __Do not use this function__ to move an already visible window unless you
                have very good reasons for doing so, as it will confuse and annoy the user.

                The window manager may put limits on what positions are allowed.  GLFW
                cannot and should not override these limits.

                @param window The window to query.
                @param xpos The x-coordinate of the upper-left corner of the content area.
                @param ypos The y-coordinate of the upper-left corner of the content area.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark __Wayland:__ There is no way for an application to set the global
                position of its windows.  This function will emit
                [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowPos(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowPos
            """.trimIndent()
        )

        +"glfwGetWindowSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetWindowSize",
            javadoc = """
                Retrieves the size of the content area of the specified window.

                This function retrieves the size, in screen coordinates, of the content area
                of the specified window.  If you wish to retrieve the size of the
                framebuffer of the window in pixels, see [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].

                Any or all of the size arguments may be `NULL`.  If an error occurs, all
                non-`NULL` size arguments will be set to zero.

                @param window The window whose size to retrieve.
                @param width Where to store the width, in screen coordinates, of the
                content area, or `NULL`.
                @param height Where to store the height, in screen coordinates, of the
                content area, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowSize(MemorySegment, int, int) glfwSetWindowSize
            """.trimIndent()
        ).overload()

        "glfwSetWindowSizeLimits"(
            void,
            GLFWwindow_ptr("window"),
            int("minwidth"),
            int("minheight"),
            int("maxwidth"),
            int("maxheight"),
            entrypoint = "glfwSetWindowSizeLimits",
            javadoc = """
                Sets the size limits of the specified window.

                This function sets the size limits of the content area of the specified
                window.  If the window is full screen, the size limits only take effect
                once it is made windowed.  If the window is not resizable, this function
                does nothing.

                The size limits are applied immediately to a windowed mode window and may
                cause it to be resized.

                The maximum dimensions must be greater than or equal to the minimum
                dimensions and all must be greater than or equal to zero.

                @param window The window to set limits for.
                @param minwidth The minimum width, in screen coordinates, of the content
                area, or `GLFW_DONT_CARE`.
                @param minheight The minimum height, in screen coordinates, of the
                content area, or `GLFW_DONT_CARE`.
                @param maxwidth The maximum width, in screen coordinates, of the content
                area, or `GLFW_DONT_CARE`.
                @param maxheight The maximum height, in screen coordinates, of the
                content area, or `GLFW_DONT_CARE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark If you set size limits and an aspect ratio that conflict, the
                results are undefined.
                - __Wayland:__ The size limits will not be applied until the window is
                actually resized, either by the user or by the compositor.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowAspectRatio(MemorySegment, int, int) glfwSetWindowAspectRatio
            """.trimIndent()
        )

        "glfwSetWindowAspectRatio"(
            void,
            GLFWwindow_ptr("window"),
            int("numer"),
            int("denom"),
            entrypoint = "glfwSetWindowAspectRatio",
            javadoc = """
                Sets the aspect ratio of the specified window.

                This function sets the required aspect ratio of the content area of the
                specified window.  If the window is full screen, the aspect ratio only takes
                effect once it is made windowed.  If the window is not resizable, this
                function does nothing.

                The aspect ratio is specified as a numerator and a denominator and both
                values must be greater than zero.  For example, the common 16:9 aspect ratio
                is specified as 16 and 9, respectively.

                If the numerator and denominator is set to `GLFW_DONT_CARE` then the aspect
                ratio limit is disabled.

                The aspect ratio is applied immediately to a windowed mode window and may
                cause it to be resized.

                @param window The window to set limits for.
                @param numer The numerator of the desired aspect ratio, or
                `GLFW_DONT_CARE`.
                @param denom The denominator of the desired aspect ratio, or
                `GLFW_DONT_CARE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark If you set size limits and an aspect ratio that conflict, the
                results are undefined.
                - __Wayland:__ The aspect ratio will not be applied until the window is
                actually resized, either by the user or by the compositor.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowSizeLimits(MemorySegment, int, int, int, int) glfwSetWindowSizeLimits
            """.trimIndent()
        )

        "glfwSetWindowSize"(
            void,
            GLFWwindow_ptr("window"),
            int("width"),
            int("height"),
            entrypoint = "glfwSetWindowSize",
            javadoc = """
                Sets the size of the content area of the specified window.

                This function sets the size, in screen coordinates, of the content area of
                the specified window.

                For full screen windows, this function updates the resolution of its desired
                video mode and switches to the video mode closest to it, without affecting
                the window's context.  As the context is unaffected, the bit depths of the
                framebuffer remain unchanged.

                If you wish to update the refresh rate of the desired video mode in addition
                to its resolution, see [glfwSetWindowMonitor][#glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int)].

                The window manager may put limits on what sizes are allowed.  GLFW cannot
                and should not override these limits.

                @param window The window to resize.
                @param width The desired width, in screen coordinates, of the window
                content area.
                @param height The desired height, in screen coordinates, of the window
                content area.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowSize
                @see #glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) glfwSetWindowMonitor
            """.trimIndent()
        )

        +"glfwGetFramebufferSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetFramebufferSize",
            javadoc = """
                Retrieves the size of the framebuffer of the specified window.

                This function retrieves the size, in pixels, of the framebuffer of the
                specified window.  If you wish to retrieve the size of the window in screen
                coordinates, see [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)].

                Any or all of the size arguments may be `NULL`.  If an error occurs, all
                non-`NULL` size arguments will be set to zero.

                @param window The window whose framebuffer to query.
                @param width Where to store the width, in pixels, of the framebuffer,
                or `NULL`.
                @param height Where to store the height, in pixels, of the framebuffer,
                or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetFramebufferSizeCallback(MemorySegment, MemorySegment) glfwSetFramebufferSizeCallback
            """.trimIndent()
        ).overload()

        +"glfwGetWindowFrameSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("left").ref(),
            int_ptr("top").ref(),
            int_ptr("right").ref(),
            int_ptr("bottom").ref(),
            entrypoint = "glfwGetWindowFrameSize",
            javadoc = """
                Retrieves the size of the frame of the window.

                This function retrieves the size, in screen coordinates, of each edge of the
                frame of the specified window.  This size includes the title bar, if the
                window has one.  The size of the frame may vary depending on the
                window-related hints used to create it.

                Because this function retrieves the size of each window frame edge and not
                the offset along a particular coordinate axis, the retrieved values will
                always be zero or positive.

                Any or all of the size arguments may be `NULL`.  If an error occurs, all
                non-`NULL` size arguments will be set to zero.

                @param window The window whose frame size to query.
                @param left Where to store the size, in screen coordinates, of the left
                edge of the window frame, or `NULL`.
                @param top Where to store the size, in screen coordinates, of the top
                edge of the window frame, or `NULL`.
                @param right Where to store the size, in screen coordinates, of the
                right edge of the window frame, or `NULL`.
                @param bottom Where to store the size, in screen coordinates, of the
                bottom edge of the window frame, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload()

        +"glfwGetWindowContentScale"(
            void,
            GLFWwindow_ptr("window"),
            float_ptr("xscale").ref(),
            float_ptr("yscale").ref(),
            entrypoint = "glfwGetWindowContentScale",
            javadoc = """
                Retrieves the content scale for the specified window.

                This function retrieves the content scale for the specified window.  The
                content scale is the ratio between the current DPI and the platform's
                default DPI.  This is especially important for text and any UI elements.  If
                the pixel dimensions of your UI scaled by this look appropriate on your
                machine then it should appear at a reasonable size on other machines
                regardless of their DPI and scaling settings.  This relies on the system DPI
                and scaling settings being somewhat correct.

                On platforms where each monitors can have its own content scale, the window
                content scale will depend on which monitor the system considers the window
                to be on.

                @param window The window to query.
                @param xscale Where to store the x-axis content scale, or `NULL`.
                @param yscale Where to store the y-axis content scale, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowContentScaleCallback(MemorySegment, MemorySegment) glfwSetWindowContentScaleCallback
                @see #glfwGetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetMonitorContentScale
            """.trimIndent()
        ).overload()

        "glfwGetWindowOpacity"(
            float,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWindowOpacity",
            javadoc = """
                Returns the opacity of the whole window.

                This function returns the opacity of the window, including any decorations.

                The opacity (or alpha) value is a positive finite number between zero and
                one, where zero is fully transparent and one is fully opaque.  If the system
                does not support whole window transparency, this function always returns one.

                The initial opacity value for newly created windows is one.

                @param window The window to query.
                @return The opacity value of the specified window.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowOpacity(MemorySegment, float) glfwSetWindowOpacity
            """.trimIndent()
        )

        "glfwSetWindowOpacity"(
            void,
            GLFWwindow_ptr("window"),
            float("opacity"),
            entrypoint = "glfwSetWindowOpacity",
            javadoc = """
                Sets the opacity of the whole window.

                This function sets the opacity of the window, including any decorations.

                The opacity (or alpha) value is a positive finite number between zero and
                one, where zero is fully transparent and one is fully opaque.

                The initial opacity value for newly created windows is one.

                A window created with framebuffer transparency may not use whole window
                transparency.  The results of doing this are undefined.

                @param window The window to set the opacity for.
                @param opacity The desired opacity of the specified window.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark __Wayland:__ There is no way to set an opacity factor for a window.
                This function will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowOpacity(MemorySegment) glfwGetWindowOpacity
            """.trimIndent()
        )

        "glfwIconifyWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwIconifyWindow",
            javadoc = """
                Iconifies the specified window.

                This function iconifies (minimizes) the specified window if it was
                previously restored.  If the window is already iconified, this function does
                nothing.

                If the specified window is a full screen window, GLFW restores the original
                video mode of the monitor.  The window's desired video mode is set again
                when the window is restored.

                @param window The window to iconify.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Wayland:__ Once a window is iconified, [glfwRestoreWindow][#glfwRestoreWindow(MemorySegment)] won't
                be able to restore it.  This is a design decision of the xdg-shell
                protocol.

                @thread_safety This function must only be called from the main thread.

                @see #glfwRestoreWindow(MemorySegment) glfwRestoreWindow
                @see #glfwMaximizeWindow(MemorySegment) glfwMaximizeWindow
            """.trimIndent()
        )

        "glfwRestoreWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwRestoreWindow",
            javadoc = """
                Restores the specified window.

                This function restores the specified window if it was previously iconified
                (minimized) or maximized.  If the window is already restored, this function
                does nothing.

                If the specified window is an iconified full screen window, its desired
                video mode is set again for its monitor when the window is restored.

                @param window The window to restore.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwIconifyWindow(MemorySegment) glfwIconifyWindow
                @see #glfwMaximizeWindow(MemorySegment) glfwMaximizeWindow
            """.trimIndent()
        )

        "glfwMaximizeWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwMaximizeWindow",
            javadoc = """
                Maximizes the specified window.

                This function maximizes the specified window if it was previously not
                maximized.  If the window is already maximized, this function does nothing.

                If the specified window is a full screen window, this function does nothing.

                @param window The window to maximize.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function may only be called from the main thread.

                @see #glfwIconifyWindow(MemorySegment) glfwIconifyWindow
                @see #glfwRestoreWindow(MemorySegment) glfwRestoreWindow
            """.trimIndent()
        )

        "glfwShowWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwShowWindow",
            javadoc = """
                Makes the specified window visible.

                This function makes the specified window visible if it was previously
                hidden.  If the window is already visible or is in full screen mode, this
                function does nothing.

                By default, windowed mode windows are focused when shown
                Set the [GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW] window hint
                to change this behavior for all newly created windows, or change the
                behavior for an existing window with [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].

                @param window The window to make visible.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Wayland:__ Because Wayland wants every frame of the desktop to be
                complete, this function does not immediately make the window visible.
                Instead it will become visible the next time the window framebuffer is
                updated after this call.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwHideWindow(MemorySegment) glfwHideWindow
            """.trimIndent()
        )

        "glfwHideWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwHideWindow",
            javadoc = """
                Hides the specified window.

                This function hides the specified window if it was previously visible.  If
                the window is already hidden or is in full screen mode, this function does
                nothing.

                @param window The window to hide.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwShowWindow(MemorySegment) glfwShowWindow
            """.trimIndent()
        )

        "glfwFocusWindow"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwFocusWindow",
            javadoc = """
                Brings the specified window to front and sets input focus.

                This function brings the specified window to front and sets input focus.
                The window should already be visible and not iconified.

                By default, both windowed and full screen mode windows are focused when
                initially created.  Set the [GLFW_FOCUSED][#GLFW_FOCUSED] to
                disable this behavior.

                Also by default, windowed mode windows are focused when shown
                with [glfwShowWindow][#glfwShowWindow(MemorySegment)]. Set the
                [GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW] to disable this behavior.

                __Do not use this function__ to steal focus from other applications unless
                you are certain that is what the user wants.  Focus stealing can be
                extremely disruptive.

                For a less disruptive way of getting the user's attention, see
                attention requests.

                @param window The window to give input focus.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Wayland:__ The compositor will likely ignore focus requests unless
                another window created by the same application already has input focus.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwRequestWindowAttention"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwRequestWindowAttention",
            javadoc = """
                Requests user attention to the specified window.

                This function requests user attention to the specified window.  On
                platforms where this is not supported, attention is requested to the
                application as a whole.

                Once the user has given attention, usually by focusing the window or
                application, the system will end the request automatically.

                @param window The window to request attention to.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __macOS:__ Attention is requested to the application as a whole, not the
                specific window.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwGetWindowMonitor"(
            GLFWmonitor_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWindowMonitor",
            javadoc = """
                Returns the monitor that the window uses for full screen mode.

                This function returns the handle of the monitor that the specified window is
                in full screen on.

                @param window The window to query.
                @return The monitor, or `NULL` if the window is in windowed mode or an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) glfwSetWindowMonitor
            """.trimIndent()
        )

        "glfwSetWindowMonitor"(
            void,
            GLFWwindow_ptr("window"),
            GLFWmonitor_ptr("monitor"),
            int("xpos"),
            int("ypos"),
            int("width"),
            int("height"),
            int("refreshRate"),
            entrypoint = "glfwSetWindowMonitor",
            javadoc = """
                Sets the mode, monitor, video mode and placement of a window.

                This function sets the monitor that the window uses for full screen mode or,
                if the monitor is `NULL`, makes it windowed mode.

                When setting a monitor, this function updates the width, height and refresh
                rate of the desired video mode and switches to the video mode closest to it.
                The window position is ignored when setting a monitor.

                When the monitor is `NULL`, the position, width and height are used to
                place the window content area.  The refresh rate is ignored when no monitor
                is specified.

                If you only wish to update the resolution of a full screen window or the
                size of a windowed mode window, see [glfwSetWindowSize][#glfwSetWindowSize(MemorySegment, int, int)].

                When a window transitions from full screen to windowed mode, this function
                restores any previous window settings such as whether it is decorated,
                floating, resizable, has size or aspect ratio limits, etc.

                @param window The window whose monitor, size or video mode to set.
                @param monitor The desired monitor, or `NULL` to set windowed mode.
                @param xpos The desired x-coordinate of the upper-left corner of the
                content area.
                @param ypos The desired y-coordinate of the upper-left corner of the
                content area.
                @param width The desired with, in screen coordinates, of the content
                area or video mode.
                @param height The desired height, in screen coordinates, of the content
                area or video mode.
                @param refreshRate The desired refresh rate, in Hz, of the video mode,
                or `GLFW_DONT_CARE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark The OpenGL or OpenGL ES context will not be destroyed or otherwise
                affected by any resizing or mode switching, although you may need to update
                your viewport if the framebuffer size has changed.
                - __Wayland:__ The desired window position is ignored, as there is no way
                    for an application to set this property.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwGetWindowAttrib"(
            int,
            GLFWwindow_ptr("window"),
            int("attrib"),
            entrypoint = "glfwGetWindowAttrib",
            javadoc = """
                Returns an attribute of the specified window.

                This function returns the value of an attribute of the specified window or
                its OpenGL or OpenGL ES context.

                @param window The window to query.
                @param attrib The window attribute whose value to
                return.
                @return The value of the attribute, or zero if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark Framebuffer related hints are not window attributes.  See
                window_attribs_fb for more information.

                Zero is a valid value for many window and context related
                attributes so you cannot use a return value of zero as an indication of
                errors.  However, this function should not fail as long as it is passed
                valid arguments and the library has been initialized.
                - __Wayland:__ The Wayland protocol provides no way to check whether a
                window is iconfied, so [GLFW_ICONIFIED][#GLFW_ICONIFIED] always returns `GLFW_FALSE`.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetWindowAttrib(MemorySegment, int, int) glfwSetWindowAttrib
            """.trimIndent()
        )

        "glfwSetWindowAttrib"(
            void,
            GLFWwindow_ptr("window"),
            int("attrib"),
            int("value"),
            entrypoint = "glfwSetWindowAttrib",
            javadoc = """
                Sets an attribute of the specified window.

                This function sets the value of an attribute of the specified window.

                The supported attributes are [GLFW_DECORATED][#GLFW_DECORATED],
                [GLFW_RESIZABLE][#GLFW_RESIZABLE],
                [GLFW_FLOATING][#GLFW_FLOATING],
                [GLFW_AUTO_ICONIFY][#GLFW_AUTO_ICONIFY] and
                [GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW].
                [GLFW_MOUSE_PASSTHROUGH][#GLFW_MOUSE_PASSTHROUGH]

                Some of these attributes are ignored for full screen windows.  The new
                value will take effect if the window is later made windowed.

                Some of these attributes are ignored for windowed mode windows.  The new
                value will take effect if the window is later made full screen.

                @param window The window to set the attribute for.
                @param attrib A supported window attribute.
                @param value `GLFW_TRUE` or `GLFW_FALSE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
                [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark Calling glfwGetWindowAttrib will always return the latest
                value, even if that value is ignored by the current mode of the window.
                - __Wayland:__ The [GLFW_FLOATING][#GLFW_FLOATING] window attribute is
                not supported.  Setting this will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetWindowAttrib(MemorySegment, int) glfwGetWindowAttrib
            """.trimIndent()
        )

        "glfwSetWindowUserPointer"(
            void,
            GLFWwindow_ptr("window"),
            void_ptr("pointer"),
            entrypoint = "glfwSetWindowUserPointer",
            javadoc = """
                Sets the user pointer of the specified window.

                This function sets the user-defined pointer of the specified window.  The
                current value is retained until the window is destroyed.  The initial value
                is `NULL`.

                @param window The window whose pointer to set.
                @param pointer The new value.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwGetWindowUserPointer(MemorySegment) glfwGetWindowUserPointer
            """.trimIndent()
        )

        "glfwGetWindowUserPointer"(
            void_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWindowUserPointer",
            javadoc = """
                Returns the user pointer of the specified window.

                This function returns the current value of the user-defined pointer of the
                specified window.  The initial value is `NULL`.

                @param window The window whose pointer to return.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwSetWindowUserPointer(MemorySegment, MemorySegment) glfwSetWindowUserPointer
            """.trimIndent()
        )

        //region Callback 1
        windowCallback(
            "glfwSetWindowPosCallback",
            GLFWwindowposfun,
            javadoc = """
                Sets the position callback for the specified window.

                This function sets the position callback of the specified window, which is
                called when the window is moved.  The callback is provided with the
                position, in screen coordinates, of the upper-left corner of the content
                area of the window.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowPosFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.remark __Wayland:__ This callback will never be called, as there is no way for
                an application to know its global position.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowSizeCallback",
            GLFWwindowsizefun,
            javadoc = """
                Sets the size callback for the specified window.

                This function sets the size callback of the specified window, which is
                called when the window is resized.  The callback is provided with the size,
                in screen coordinates, of the content area of the window.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowSizeFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowCloseCallback",
            GLFWwindowclosefun,
            javadoc = """
                Sets the close callback for the specified window.

                This function sets the close callback of the specified window, which is
                called when the user attempts to close the window, for example by clicking
                the close widget in the title bar.

                The close flag is set before this callback is called, but you can modify it
                at any time with [glfwSetWindowShouldClose][#glfwSetWindowShouldClose(MemorySegment, boolean)].

                The close callback is not triggered by [glfwDestroyWindow][#glfwDestroyWindow(MemorySegment)].

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowCloseFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.remark __macOS:__ Selecting Quit from the application menu will trigger the
                close callback for all windows.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowRefreshCallback",
            GLFWwindowrefreshfun,
            javadoc = """
                Sets the refresh callback for the specified window.

                This function sets the refresh callback of the specified window, which is
                called when the content area of the window needs to be redrawn, for example
                if the window has been exposed after having been covered by another window.

                On compositing window systems such as Aero, Compiz, Aqua or Wayland, where
                the window contents are saved off-screen, this callback may be called only
                very infrequently or never at all.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowRefreshFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowFocusCallback",
            GLFWwindowfocusfun,
            javadoc = """
                Sets the focus callback for the specified window.

                This function sets the focus callback of the specified window, which is
                called when the window gains or loses input focus.

                After the focus callback is called for a window that lost input focus,
                synthetic key and mouse button release events will be generated for all such
                that had been pressed.  For more information, see [glfwSetKeyCallback][#glfwSetKeyCallback(MemorySegment, MemorySegment)]
                and [glfwSetMouseButtonCallback][#glfwSetMouseButtonCallback(MemorySegment, MemorySegment)].

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowFocusFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowIconifyCallback",
            GLFWwindowiconifyfun,
            javadoc = """
                Sets the iconify callback for the specified window.

                This function sets the iconification callback of the specified window, which
                is called when the window is iconified or restored.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowIconifyFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowMaximizeCallback",
            GLFWwindowmaximizefun,
            javadoc = """
                Sets the maximize callback for the specified window.

                This function sets the maximization callback of the specified window, which
                is called when the window is maximized or restored.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowMaximizeFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetFramebufferSizeCallback",
            GLFWframebuffersizefun,
            javadoc = """
                Sets the framebuffer resize callback for the specified window.

                This function sets the framebuffer resize callback of the specified window,
                which is called when the framebuffer of the specified window is resized.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWFramebufferSizeFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetWindowContentScaleCallback",
            GLFWwindowcontentscalefun,
            javadoc = """
                Sets the window content scale callback for the specified window.

                This function sets the window content scale callback of the specified window,
                which is called when the content scale of the specified window changes.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWWindowContentScaleFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )
        //endregion

        "glfwPollEvents"(
            void,
            entrypoint = "glfwPollEvents",
            javadoc = """
                Processes all pending events.

                This function processes only those events that are already in the event
                queue and then returns immediately.  Processing events will cause the window
                and input callbacks associated with those events to be called.

                On some platforms, a window move, resize or menu operation will cause event
                processing to block.  This is due to how event processing is designed on
                those platforms.  You can use the
                window refresh callback to redraw the contents of
                your window when necessary during such operations.

                Do not assume that callbacks you set will _only_ be called in response to
                event processing functions like this one.  While it is necessary to poll for
                events, window systems that require GLFW to register callbacks of its own
                can pass events to GLFW in response to many window system function calls.
                GLFW will pass those events on to the application callbacks before
                returning.

                Event processing is not required for joystick input to work.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwWaitEvents() glfwWaitEvents
                @see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
            """.trimIndent()
        )

        "glfwWaitEvents"(
            void,
            entrypoint = "glfwWaitEvents",
            javadoc = """
                Waits until events are queued and processes them.

                This function puts the calling thread to sleep until at least one event is
                available in the event queue.  Once one or more events are available,
                it behaves exactly like [glfwPollEvents][#glfwPollEvents()], i.e. the events in the queue
                are processed and the function then returns immediately.  Processing events
                will cause the window and input callbacks associated with those events to be
                called.

                Since not all events are associated with callbacks, this function may return
                without a callback having been called even if you are monitoring all
                callbacks.

                On some platforms, a window move, resize or menu operation will cause event
                processing to block.  This is due to how event processing is designed on
                those platforms.  You can use the
                window refresh callback to redraw the contents of
                your window when necessary during such operations.

                Do not assume that callbacks you set will _only_ be called in response to
                event processing functions like this one.  While it is necessary to poll for
                events, window systems that require GLFW to register callbacks of its own
                can pass events to GLFW in response to many window system function calls.
                GLFW will pass those events on to the application callbacks before
                returning.

                Event processing is not required for joystick input to work.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwPollEvents() glfwPollEvents
                @see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
            """.trimIndent()
        )

        "glfwWaitEventsTimeout"(
            void,
            double("timeout"),
            entrypoint = "glfwWaitEventsTimeout",
            javadoc = """
                Waits with timeout until events are queued and processes them.

                This function puts the calling thread to sleep until at least one event is
                available in the event queue, or until the specified timeout is reached.  If
                one or more events are available, it behaves exactly like
                [glfwPollEvents][#glfwPollEvents()], i.e. the events in the queue are processed and the function
                then returns immediately.  Processing events will cause the window and input
                callbacks associated with those events to be called.

                The timeout value must be a positive finite number.

                Since not all events are associated with callbacks, this function may return
                without a callback having been called even if you are monitoring all
                callbacks.

                On some platforms, a window move, resize or menu operation will cause event
                processing to block.  This is due to how event processing is designed on
                those platforms.  You can use the
                window refresh callback to redraw the contents of
                your window when necessary during such operations.

                Do not assume that callbacks you set will _only_ be called in response to
                event processing functions like this one.  While it is necessary to poll for
                events, window systems that require GLFW to register callbacks of its own
                can pass events to GLFW in response to many window system function calls.
                GLFW will pass those events on to the application callbacks before
                returning.

                Event processing is not required for joystick input to work.

                @param timeout The maximum amount of time, in seconds, to wait.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwPollEvents() glfwPollEvents
                @see #glfwWaitEvents() glfwWaitEvents
            """.trimIndent()
        )

        "glfwPostEmptyEvent"(
            void,
            entrypoint = "glfwPostEmptyEvent",
            javadoc = """
                Posts an empty event to the event queue.

                This function posts an empty event from the current thread to the event
                queue, causing [glfwWaitEvents][#glfwWaitEvents()] or [glfwWaitEventsTimeout][#glfwWaitEventsTimeout(double)] to return.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwWaitEvents() glfwWaitEvents
                @see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
            """.trimIndent()
        )

        "glfwGetInputMode"(
            int,
            GLFWwindow_ptr("window"),
            int("mode"),
            entrypoint = "glfwGetInputMode",
            javadoc = """
                Returns the value of an input option for the specified window.

                This function returns the value of an input option for the specified window.
                The mode must be one of [GLFW_CURSOR][#GLFW_CURSOR], [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS],
                [GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS], [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] or
                [GLFW_RAW_MOUSE_MOTION][#GLFW_RAW_MOUSE_MOTION].

                @param window The window to query.
                @param mode One of `GLFW_CURSOR`, `GLFW_STICKY_KEYS`,
                `GLFW_STICKY_MOUSE_BUTTONS`, `GLFW_LOCK_KEY_MODS` or
                `GLFW_RAW_MOUSE_MOTION`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetInputMode(MemorySegment, int, int) glfwSetInputMode
            """.trimIndent()
        )

        "glfwSetInputMode"(
            void,
            GLFWwindow_ptr("window"),
            int("mode"),
            int("value"),
            entrypoint = "glfwSetInputMode",
            javadoc = """
                Sets an input option for the specified window.

                This function sets an input mode option for the specified window.  The mode
                must be one of [GLFW_CURSOR][#GLFW_CURSOR], [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS],
                [GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS], [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS]
                [GLFW_RAW_MOUSE_MOTION][#GLFW_RAW_MOUSE_MOTION], or [GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS].

                If the mode is `GLFW_CURSOR`, the value must be one of the following cursor
                modes:
                - `GLFW_CURSOR_NORMAL` makes the cursor visible and behaving normally.
                - `GLFW_CURSOR_HIDDEN` makes the cursor invisible when it is over the
                  content area of the window but does not restrict the cursor from leaving.
                - `GLFW_CURSOR_DISABLED` hides and grabs the cursor, providing virtual
                  and unlimited cursor movement.  This is useful for implementing for
                  example 3D camera controls.
                - `GLFW_CURSOR_CAPTURED` makes the cursor visible and confines it to the
                  content area of the window.

                If the mode is `GLFW_STICKY_KEYS`, the value must be either `GLFW_TRUE` to
                enable sticky keys, or `GLFW_FALSE` to disable it.  If sticky keys are
                enabled, a key press will ensure that [glfwGetKey][#glfwGetKey(MemorySegment, int)] returns `GLFW_PRESS`
                the next time it is called even if the key had been released before the
                call.  This is useful when you are only interested in whether keys have been
                pressed but not when or in which order.

                If the mode is `GLFW_STICKY_MOUSE_BUTTONS`, the value must be either
                `GLFW_TRUE` to enable sticky mouse buttons, or `GLFW_FALSE` to disable it.
                If sticky mouse buttons are enabled, a mouse button press will ensure that
                [glfwGetMouseButton][#glfwGetMouseButton(MemorySegment, int)] returns `GLFW_PRESS` the next time it is called even
                if the mouse button had been released before the call.  This is useful when
                you are only interested in whether mouse buttons have been pressed but not
                when or in which order.

                If the mode is `GLFW_LOCK_KEY_MODS`, the value must be either `GLFW_TRUE` to
                enable lock key modifier bits, or `GLFW_FALSE` to disable them.  If enabled,
                callbacks that receive modifier bits will also have the
                [GLFW_MOD_CAPS_LOCK][#GLFW_MOD_CAPS_LOCK] bit set when the event was generated with Caps Lock on,
                and the [GLFW_MOD_NUM_LOCK][#GLFW_MOD_NUM_LOCK] bit when Num Lock was on.

                If the mode is `GLFW_RAW_MOUSE_MOTION`, the value must be either `GLFW_TRUE`
                to enable raw (unscaled and unaccelerated) mouse motion when the cursor is
                disabled, or `GLFW_FALSE` to disable it.  If raw motion is not supported,
                attempting to set this will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].  Call
                [glfwRawMouseMotionSupported][#glfwRawMouseMotionSupported()] to check for support.

                If the mode is `GLFW_UNLIMITED_MOUSE_BUTTONS`, the value must be either
                `GLFW_TRUE` to disable the mouse button limit when calling the mouse button
                callback, or `GLFW_FALSE` to limit the mouse buttons sent to the callback
                to the mouse button token values up to `GLFW_MOUSE_BUTTON_LAST`.

                @param window The window whose input mode to set.
                @param mode One of `GLFW_CURSOR`, `GLFW_STICKY_KEYS`,
                `GLFW_STICKY_MOUSE_BUTTONS`, `GLFW_LOCK_KEY_MODS` or
                `GLFW_RAW_MOUSE_MOTION`.
                @param value The new value of the specified input mode.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
                [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see above).

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetInputMode(MemorySegment, int) glfwGetInputMode
            """.trimIndent()
        )

        +"glfwRawMouseMotionSupported"(
            glfw_boolean,
            entrypoint = "glfwRawMouseMotionSupported",
            javadoc = """
                Returns whether raw mouse motion is supported.

                This function returns whether raw mouse motion is supported on the current
                system.  This status does not change after GLFW has been initialized so you
                only need to check this once.  If you attempt to enable raw motion on
                a system that does not support it, [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] will be emitted.

                Raw mouse motion is closer to the actual motion of the mouse across
                a surface.  It is not affected by the scaling and acceleration applied to
                the motion of the desktop cursor.  That processing is suitable for a cursor
                while raw motion is better for controlling for example a 3D camera.  Because
                of this, raw mouse motion is only provided when the cursor is disabled.

                @return `GLFW_TRUE` if raw mouse motion is supported on the current machine,
                or `GLFW_FALSE` otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetInputMode(MemorySegment, int, int) glfwSetInputMode
            """.trimIndent(),
            addNow = false
        ).overload()

        +"glfwGetKeyName_"(
            const_char_ptr,
            int("key"),
            int("scancode"),
            entrypoint = "glfwGetKeyName",
            javadoc = """
                Returns the layout-specific name of the specified printable key.

                This function returns the name of the specified printable key, encoded as
                UTF-8.  This is typically the character that key would produce without any
                modifier keys, intended for displaying key bindings to the user.  For dead
                keys, it is typically the diacritic it would add to a character.

                __Do not use this function__ for text input.  You will
                break text input for many languages even if it happens to work for yours.

                If the key is `GLFW_KEY_UNKNOWN`, the scancode is used to identify the key,
                otherwise the scancode is ignored.  If you specify a non-printable key, or
                `GLFW_KEY_UNKNOWN` and a scancode that maps to a non-printable key, this
                function returns `NULL` but does not emit an error.

                This behavior allows you to always pass in the arguments in the
                key callback without modification.

                The printable keys are:
                - `GLFW_KEY_APOSTROPHE`
                - `GLFW_KEY_COMMA`
                - `GLFW_KEY_MINUS`
                - `GLFW_KEY_PERIOD`
                - `GLFW_KEY_SLASH`
                - `GLFW_KEY_SEMICOLON`
                - `GLFW_KEY_EQUAL`
                - `GLFW_KEY_LEFT_BRACKET`
                - `GLFW_KEY_RIGHT_BRACKET`
                - `GLFW_KEY_BACKSLASH`
                - `GLFW_KEY_WORLD_1`
                - `GLFW_KEY_WORLD_2`
                - `GLFW_KEY_0` to `GLFW_KEY_9`
                - `GLFW_KEY_A` to `GLFW_KEY_Z`
                - `GLFW_KEY_KP_0` to `GLFW_KEY_KP_9`
                - `GLFW_KEY_KP_DECIMAL`
                - `GLFW_KEY_KP_DIVIDE`
                - `GLFW_KEY_KP_MULTIPLY`
                - `GLFW_KEY_KP_SUBTRACT`
                - `GLFW_KEY_KP_ADD`
                - `GLFW_KEY_KP_EQUAL`

                Names for printable keys depend on keyboard layout, while names for
                non-printable keys are the same across layouts but depend on the application
                language and should be localized along with other user interface text.

                @param key The key to query, or `GLFW_KEY_UNKNOWN`.
                @param scancode The scancode of the key to query.
                @return The UTF-8 encoded, layout-specific name of the key, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark The contents of the returned string may change when a keyboard
                layout change event is received.

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload(name = "glfwGetKeyName")

        "glfwGetKeyScancode"(
            int,
            int("key"),
            entrypoint = "glfwGetKeyScancode",
            javadoc = """
                Returns the platform-specific scancode of the specified key.

                This function returns the platform-specific scancode of the specified key.

                If the specified key token corresponds to a physical key not
                supported on the current platform then this method will return `-1`.
                Calling this function with anything other than a key token will return `-1`
                and generate a [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] error.

                @param key Any key token.
                @return The platform-specific scancode for the key, or `-1` if the key is
                not supported on the current platform or an error
                occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function may be called from any thread.
            """.trimIndent()
        )

        "glfwGetKey"(
            int,
            GLFWwindow_ptr("window"),
            int("key"),
            entrypoint = "glfwGetKey",
            javadoc = """
                Returns the last reported state of a keyboard key for the specified
                window.

                This function returns the last state reported for the specified key to the
                specified window.  The returned state is one of `GLFW_PRESS` or
                `GLFW_RELEASE`.  The action `GLFW_REPEAT` is only reported to the key callback.

                If the [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS] input mode is enabled, this function returns
                `GLFW_PRESS` the first time you call it for a key that was pressed, even if
                that key has already been released.

                The key functions deal with physical keys, with key tokens
                named after their use on the standard US keyboard layout.  If you want to
                input text, use the Unicode character callback instead.

                The modifier key bit masks are not key tokens and cannot be
                used with this function.

                __Do not use this function__ to implement text input.

                @param window The desired window.
                @param key The desired keyboard key.  `GLFW_KEY_UNKNOWN` is
                not a valid key for this function.
                @return One of `GLFW_PRESS` or `GLFW_RELEASE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwGetMouseButton"(
            int,
            GLFWwindow_ptr("window"),
            int("button"),
            entrypoint = "glfwGetMouseButton",
            javadoc = """
                Returns the last reported state of a mouse button for the specified
                window.

                This function returns the last state reported for the specified mouse button
                to the specified window.  The returned state is one of `GLFW_PRESS` or
                `GLFW_RELEASE`.

                If the [GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS] input mode is enabled, this function
                returns `GLFW_PRESS` the first time you call it for a mouse button that was
                pressed, even if that mouse button has already been released.

                The [GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS] input mode does not effect the
                limit on buttons which can be polled with this function.

                @param window The desired window.
                @param button The desired mouse button token.
                @return One of `GLFW_PRESS` or `GLFW_RELEASE`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        +"glfwGetCursorPos"(
            void,
            GLFWwindow_ptr("window"),
            double_ptr("xpos").ref(),
            double_ptr("ypos").ref(),
            entrypoint = "glfwGetCursorPos",
            javadoc = """
                Retrieves the position of the cursor relative to the content area of
                the window.

                This function returns the position of the cursor, in screen coordinates,
                relative to the upper-left corner of the content area of the specified
                window.

                If the cursor is disabled (with `GLFW_CURSOR_DISABLED`) then the cursor
                position is unbounded and limited only by the minimum and maximum values of
                a `double`.

                The coordinate can be converted to their integer equivalents with the
                `floor` function.  Casting directly to an integer type works for positive
                coordinates, but fails for negative ones.

                Any or all of the position arguments may be `NULL`.  If an error occurs, all
                non-`NULL` position arguments will be set to zero.

                @param window The desired window.
                @param xpos Where to store the cursor x-coordinate, relative to the
                left edge of the content area, or `NULL`.
                @param ypos Where to store the cursor y-coordinate, relative to the to
                top edge of the content area, or `NULL`.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetCursorPos(MemorySegment, double, double) glfwSetCursorPos
            """.trimIndent()
        ).overload()

        "glfwSetCursorPos"(
            void,
            GLFWwindow_ptr("window"),
            double("xpos"),
            double("ypos"),
            entrypoint = "glfwSetCursorPos",
            javadoc = """
                Sets the position of the cursor, relative to the content area of the
                window.

                This function sets the position, in screen coordinates, of the cursor
                relative to the upper-left corner of the content area of the specified
                window.  The window must have input focus.  If the window does not have
                input focus when this function is called, it fails silently.

                __Do not use this function__ to implement things like camera controls.  GLFW
                already provides the `GLFW_CURSOR_DISABLED` cursor mode that hides the
                cursor, transparently re-centers it and provides unconstrained cursor
                motion.  See [glfwSetInputMode][#glfwSetInputMode(MemorySegment, int, int)] for more information.

                If the cursor mode is `GLFW_CURSOR_DISABLED` then the cursor position is
                unconstrained and limited only by the minimum and maximum values of
                a `double`.

                @param window The desired window.
                @param xpos The desired x-coordinate, relative to the left edge of the
                content area.
                @param ypos The desired y-coordinate, relative to the top edge of the
                content area.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).

                @glfw.remark @wayland This function will only work when the cursor mode is
                `GLFW_CURSOR_DISABLED`, otherwise it will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetCursorPos(MemorySegment, MemorySegment, MemorySegment) glfwGetCursorPos
            """.trimIndent()
        )

        "glfwCreateCursor"(
            GLFWcursor_ptr,
            const_GLFWimage_ptr("image"),
            int("xhot"),
            int("yhot"),
            entrypoint = "glfwCreateCursor",
            javadoc = """
                Creates a custom cursor.

                Creates a new custom cursor image that can be set for a window with
                [glfwSetCursor][#glfwSetCursor(MemorySegment, MemorySegment)].  The cursor can be destroyed with [glfwDestroyCursor][#glfwDestroyCursor(MemorySegment)].
                Any remaining cursors are destroyed by [glfwTerminate][#glfwTerminate()].

                The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
                bits per channel with the red channel first.  They are arranged canonically
                as packed sequential rows, starting from the top-left corner.

                The cursor hotspot is specified in pixels, relative to the upper-left corner
                of the cursor image.  Like all other coordinate systems in GLFW, the X-axis
                points to the right and the Y-axis points down.

                @param image The desired cursor image.
                @param xhot The desired x-coordinate, in pixels, of the cursor hotspot.
                @param yhot The desired y-coordinate, in pixels, of the cursor hotspot.
                @return The handle of the created cursor, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The specified image data is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwDestroyCursor(MemorySegment) glfwDestroyCursor
                @see #glfwCreateStandardCursor(int) glfwCreateStandardCursor
            """.trimIndent()
        )

        "glfwCreateStandardCursor"(
            GLFWcursor_ptr,
            int("shape"),
            entrypoint = "glfwCreateStandardCursor",
            javadoc = """
                Creates a cursor with a standard shape.

                Returns a cursor with a standard shape, that can be set for a window with
                [glfwSetCursor][#glfwSetCursor(MemorySegment, MemorySegment)].  The images for these cursors come from the system
                cursor theme and their exact appearance will vary between platforms.

                Most of these shapes are guaranteed to exist on every supported platform but
                a few may not be present.  See the table below for details.

                | Cursor shape                   | Windows | macOS | X11    | Wayland |
                | ------------------------------ | ------- | ----- | ------ | ------- |
                | [GLFW_ARROW_CURSOR][#GLFW_ARROW_CURSOR]         | Yes     | Yes   | Yes    | Yes |
                | [GLFW_IBEAM_CURSOR][#GLFW_IBEAM_CURSOR]         | Yes     | Yes   | Yes    | Yes |
                | [GLFW_CROSSHAIR_CURSOR][#GLFW_CROSSHAIR_CURSOR]     | Yes     | Yes   | Yes    | Yes |
                | [GLFW_POINTING_HAND_CURSOR][#GLFW_POINTING_HAND_CURSOR] | Yes     | Yes   | Yes    | Yes |
                | [GLFW_RESIZE_EW_CURSOR][#GLFW_RESIZE_EW_CURSOR]     | Yes     | Yes   | Yes    | Yes |
                | [GLFW_RESIZE_NS_CURSOR][#GLFW_RESIZE_NS_CURSOR]     | Yes     | Yes   | Yes    | Yes |
                | [GLFW_RESIZE_NWSE_CURSOR][#GLFW_RESIZE_NWSE_CURSOR]   | Yes     | Yes<sup>1</sup> | Maybe<sup>2</sup> | Maybe<sup>2</sup> |
                | [GLFW_RESIZE_NESW_CURSOR][#GLFW_RESIZE_NESW_CURSOR]   | Yes     | Yes<sup>1</sup> | Maybe<sup>2</sup> | Maybe<sup>2</sup> |
                | [GLFW_RESIZE_ALL_CURSOR][#GLFW_RESIZE_ALL_CURSOR]    | Yes     | Yes   | Yes    | Yes |
                | [GLFW_NOT_ALLOWED_CURSOR][#GLFW_NOT_ALLOWED_CURSOR]   | Yes     | Yes   | Maybe<sup>2</sup> | Maybe<sup>2</sup> |

                1. This uses a private system API and may fail in the future.
                2. This uses a newer standard that not all cursor themes support.

                If the requested shape is not available, this function emits a
                [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] error and returns `NULL`.

                @param shape One of the standard shapes.
                @return A new cursor ready to use or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwCreateCursor(MemorySegment, int, int) glfwCreateCursor
            """.trimIndent()
        )

        "glfwDestroyCursor"(
            void,
            GLFWcursor_ptr("cursor"),
            entrypoint = "glfwDestroyCursor",
            javadoc = """
                Destroys a cursor.

                This function destroys a cursor previously created with
                [glfwCreateCursor][#glfwCreateCursor(MemorySegment, int, int)].  Any remaining cursors will be destroyed by
                [glfwTerminate][#glfwTerminate()].

                If the specified cursor is current for any window, that window will be
                reverted to the default cursor.  This does not affect the cursor mode.

                @param cursor The cursor object to destroy.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.reentrancy This function must not be called from a callback.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwCreateCursor(MemorySegment, int, int) glfwCreateCursor
            """.trimIndent()
        )

        "glfwSetCursor"(
            void,
            GLFWwindow_ptr("window"),
            GLFWcursor_ptr("cursor"),
            entrypoint = "glfwSetCursor",
            javadoc = """
                Sets the cursor for the window.

                This function sets the cursor image to be used when the cursor is over the
                content area of the specified window.  The set cursor will only be visible
                when the cursor mode of the window is
                `GLFW_CURSOR_NORMAL`.

                On some platforms, the set cursor may not be visible unless the window also
                has input focus.

                @param window The window to set the cursor for.
                @param cursor The cursor to set, or `NULL` to switch back to the default
                arrow cursor.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        //region Callback 2
        windowCallback(
            "glfwSetKeyCallback",
            GLFWkeyfun,
            javadoc = """
                Sets the key callback.

                This function sets the key callback of the specified window, which is called
                when a key is pressed, repeated or released.

                The key functions deal with physical keys, with layout independent
                key tokens named after their values in the standard US keyboard
                layout.  If you want to input text, use the
                [character callback][#glfwSetCharCallback(MemorySegment, MemorySegment)] instead.

                When a window loses input focus, it will generate synthetic key release
                events for all pressed keys with associated key tokens.  You can tell these
                events from user-generated events by the fact that the synthetic ones are
                generated after the focus loss event has been processed, i.e. after the
                [window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has been called.

                The scancode of a key is specific to that platform or sometimes even to that
                machine.  Scancodes are intended to allow users to bind keys that don't have
                a GLFW key token.  Such keys have `key` set to `GLFW_KEY_UNKNOWN`, their
                state is not saved and so it cannot be queried with [glfwGetKey][#glfwGetKey(MemorySegment, int)].

                Sometimes GLFW needs to generate synthetic key events, in which case the
                scancode may be zero.

                @param window The window whose callback to set.
                @param callback The new key callback, or `NULL` to remove the currently
                set callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWKeyFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetCharCallback",
            GLFWcharfun,
            javadoc = """
                Sets the Unicode character callback.

                This function sets the character callback of the specified window, which is
                called when a Unicode character is input.

                The character callback is intended for Unicode text input.  As it deals with
                characters, it is keyboard layout dependent, whereas the
                [key callback][#glfwSetKeyCallback(MemorySegment, MemorySegment)] is not.  Characters do not map 1:1
                to physical keys, as a key may produce zero, one or more characters.  If you
                want to know whether a specific physical key was pressed or released, see
                the key callback instead.

                The character callback behaves as system text input normally does and will
                not be called if modifier keys are held down that would prevent normal text
                input on that platform, for example a Super (Command) key on macOS or Alt key
                on Windows.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWCharFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetMouseButtonCallback",
            GLFWmousebuttonfun,
            javadoc = """
                Sets the mouse button callback.

                This function sets the mouse button callback of the specified window, which
                is called when a mouse button is pressed or released.

                When a window loses input focus, it will generate synthetic mouse button
                release events for all pressed mouse buttons with associated button tokens.
                You can tell these events from user-generated events by the fact that the
                synthetic ones are generated after the focus loss event has been processed,
                i.e. after the [window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has
                been called.

                The reported `button` value can be higher than `GLFW_MOUSE_BUTTON_LAST` if
                the button does not have an associated button token and the
                [GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS] input mode is set.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWMouseButtonFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetCursorPosCallback",
            GLFWcursorposfun,
            javadoc = """
                Sets the cursor position callback.

                This function sets the cursor position callback of the specified window,
                which is called when the cursor is moved.  The callback is provided with the
                position, in screen coordinates, relative to the upper-left corner of the
                content area of the window.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWCursorPosFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetCursorEnterCallback",
            GLFWcursorenterfun,
            javadoc = """
                Sets the cursor enter/leave callback.

                This function sets the cursor boundary crossing callback of the specified
                window, which is called when the cursor enters or leaves the content area of
                the window.

                @param window The window whose callback to set.
                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWCursorEnterFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetScrollCallback",
            GLFWscrollfun,
            javadoc = """
                Sets the scroll callback.

                This function sets the scroll callback of the specified window, which is
                called when a scrolling device is used, such as a mouse wheel or scrolling
                area of a touchpad.

                The scroll callback receives all scrolling input, like that from a mouse
                wheel or a touchpad scrolling area.

                @param window The window whose callback to set.
                @param callback The new scroll callback, or `NULL` to remove the
                currently set callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWScrollFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        windowCallback(
            "glfwSetDropCallback",
            GLFWdropfun,
            javadoc = """
                Sets the path drop callback.

                This function sets the path drop callback of the specified window, which is
                called when one or more dragged paths are dropped on the window.

                Because the path array and its strings may have been generated specifically
                for that event, they are not guaranteed to be valid after the callback has
                returned.  If you wish to use them after the callback returns, you need to
                make a deep copy.

                @param window The window whose callback to set.
                @param callback The new file drop callback, or `NULL` to remove the
                currently set callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWDropFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )
        //endregion

        +"glfwJoystickPresent"(
            glfw_boolean,
            int("jid"),
            entrypoint = "glfwJoystickPresent",
            javadoc = """
                Returns whether the specified joystick is present.

                This function returns whether the specified joystick is present.

                There is no need to call this function before other functions that accept
                a joystick ID, as they all check for presence before performing any other
                work.

                @param jid The joystick to query.
                @return `GLFW_TRUE` if the joystick is present, or `GLFW_FALSE` otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent(),
            addNow = false
        ).overload()

        "glfwGetJoystickAxes"(
            jfloat_array c "const float*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickAxes",
            javadoc = """
                Returns the values of all axes of the specified joystick.

                This function returns the values of all axes of the specified joystick.
                Each element in the array is a value between -1.0 and 1.0.

                If the specified joystick is not present this function will return `NULL`
                but will not generate an error.  This can be used instead of first calling
                [glfwJoystickPresent][#glfwJoystickPresent(int)].

                @param jid The joystick to query.
                @param count Where to store the number of axis values in the returned
                array.  This is set to zero if the joystick is not present or an error
                occurred.
                @return An array of axis values, or `NULL` if the joystick is not present or
                an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwGetJoystickButtons"(
            address c "const unsigned char*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickButtons",
            javadoc = """
                Returns the state of all buttons of the specified joystick.

                This function returns the state of all buttons of the specified joystick.
                Each element in the array is either `GLFW_PRESS` or `GLFW_RELEASE`.

                For backward compatibility with earlier versions that did not have
                [glfwGetJoystickHats][#glfwGetJoystickHats(int, MemorySegment)], the button array also includes all hats, each
                represented as four buttons.  The hats are in the same order as returned by
                __glfwGetJoystickHats__ and are in the order _up_, _right_, _down_ and
                _left_.  To disable these extra buttons, set the
                [GLFW_JOYSTICK_HAT_BUTTONS][#GLFW_JOYSTICK_HAT_BUTTONS] init hint before initialization.

                If the specified joystick is not present this function will return `NULL`
                but will not generate an error.  This can be used instead of first calling
                [glfwJoystickPresent][#glfwJoystickPresent(int)].

                @param jid The joystick to query.
                @param count Where to store the number of button states in the returned
                array.  This is set to zero if the joystick is not present or an error
                occurred.
                @return An array of button states, or `NULL` if the joystick is not present
                or an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        "glfwGetJoystickHats"(
            address c "const unsigned char*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickHats",
            javadoc = """
                Returns the state of all hats of the specified joystick.

                This function returns the state of all hats of the specified joystick.
                Each element in the array is one of the following values:

                | Name                  | Value |
                | ----                  | ----- |
                | `GLFW_HAT_CENTERED`   | 0 |
                | `GLFW_HAT_UP`         | 1 |
                | `GLFW_HAT_RIGHT`      | 2 |
                | `GLFW_HAT_DOWN`       | 4 |
                | `GLFW_HAT_LEFT`       | 8 |
                | `GLFW_HAT_RIGHT_UP`   | `GLFW_HAT_RIGHT` \| `GLFW_HAT_UP` |
                | `GLFW_HAT_RIGHT_DOWN` | `GLFW_HAT_RIGHT` \| `GLFW_HAT_DOWN` |
                | `GLFW_HAT_LEFT_UP`    | `GLFW_HAT_LEFT` \| `GLFW_HAT_UP` |
                | `GLFW_HAT_LEFT_DOWN`  | `GLFW_HAT_LEFT` \| `GLFW_HAT_DOWN` |

                The diagonal directions are bitwise combinations of the primary (up, right,
                down and left) directions and you can test for these individually by ANDing
                it with the corresponding direction.

                ```java
                if (hats[2] & GLFW_HAT_RIGHT)
                {
                    // State of hat 2 could be right-up, right or right-down
                }
                ```

                If the specified joystick is not present this function will return `NULL`
                but will not generate an error.  This can be used instead of first calling
                [glfwJoystickPresent][#glfwJoystickPresent(int)].

                @param jid The joystick to query.
                @param count Where to store the number of hat states in the returned
                array.  This is set to zero if the joystick is not present or an error
                occurred.
                @return An array of hat states, or `NULL` if the joystick is not present
                or an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected, this function is called again for that joystick or the library
                is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        )

        +"glfwGetJoystickName_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetJoystickName",
            javadoc = """
                Returns the name of the specified joystick.

                This function returns the name, encoded as UTF-8, of the specified joystick.
                The returned string is allocated and freed by GLFW.  You should not free it
                yourself.

                If the specified joystick is not present this function will return `NULL`
                but will not generate an error.  This can be used instead of first calling
                [glfwJoystickPresent][#glfwJoystickPresent(int)].

                @param jid The joystick to query.
                @return The UTF-8 encoded name of the joystick, or `NULL` if the joystick
                is not present or an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload(name = "glfwGetJoystickName")

        +"glfwGetJoystickGUID_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetJoystickGUID",
            javadoc = """
                Returns the SDL compatible GUID of the specified joystick.

                This function returns the SDL compatible GUID, as a UTF-8 encoded
                hexadecimal string, of the specified joystick.  The returned string is
                allocated and freed by GLFW.  You should not free it yourself.

                The GUID is what connects a joystick to a gamepad mapping.  A connected
                joystick will always have a GUID even if there is no gamepad mapping
                assigned to it.

                If the specified joystick is not present this function will return `NULL`
                but will not generate an error.  This can be used instead of first calling
                [glfwJoystickPresent][#glfwJoystickPresent(int)].

                The GUID uses the format introduced in SDL 2.0.5.  This GUID tries to
                uniquely identify the make and model of a joystick but does not identify
                a specific unit, e.g. all wired Xbox 360 controllers will have the same
                GUID on that platform.  The GUID for a unit may vary between platforms
                depending on what hardware information the platform specific APIs provide.

                @param jid The joystick to query.
                @return The UTF-8 encoded GUID of the joystick, or `NULL` if the joystick
                is not present or an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected or the library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).overload(name = "glfwGetJoystickGUID")

        "glfwSetJoystickUserPointer"(
            void,
            int("jid"),
            void_ptr("pointer"),
            entrypoint = "glfwSetJoystickUserPointer",
            javadoc = """
                Sets the user pointer of the specified joystick.

                This function sets the user-defined pointer of the specified joystick.  The
                current value is retained until the joystick is disconnected.  The initial
                value is `NULL`.

                This function may be called from the joystick callback, even for a joystick
                that is being disconnected.

                @param jid The joystick whose pointer to set.
                @param pointer The new value.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwGetJoystickUserPointer(int) glfwGetJoystickUserPointer
            """.trimIndent()
        )

        "glfwGetJoystickUserPointer"(
            void_ptr,
            int("jid"),
            entrypoint = "glfwGetJoystickUserPointer",
            javadoc = """
                Returns the user pointer of the specified joystick.

                This function returns the current value of the user-defined pointer of the
                specified joystick.  The initial value is `NULL`.

                This function may be called from the joystick callback, even for a joystick
                that is being disconnected.

                @param jid The joystick whose pointer to return.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.

                @see #glfwSetJoystickUserPointer(int, MemorySegment) glfwSetJoystickUserPointer
            """.trimIndent()
        )

        +"glfwJoystickIsGamepad"(
            glfw_boolean,
            int("jid"),
            entrypoint = "glfwJoystickIsGamepad",
            javadoc = """
                Returns whether the specified joystick has a gamepad mapping.

                This function returns whether the specified joystick is both present and has
                a gamepad mapping.

                If the specified joystick is present but does not have a gamepad mapping
                this function will return `GLFW_FALSE` but will not generate an error.  Call
                [glfwJoystickPresent][#glfwJoystickPresent(int)] to check if a joystick is present regardless of
                whether it has a mapping.

                @param jid The joystick to query.
                @return `GLFW_TRUE` if a joystick is both present and has a gamepad mapping,
                or `GLFW_FALSE` otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetGamepadState(int, MemorySegment) glfwGetGamepadState
            """.trimIndent(),
            addNow = false
        ).overload()

        +"glfwSetJoystickCallback"(
            address c "GLFWjoystickfun",
            GLFWjoystickfun("callback"),
            entrypoint = "glfwSetJoystickCallback",
            javadoc = """
                Sets the joystick configuration callback.

                This function sets the joystick configuration callback, or removes the
                currently set callback.  This is called when a joystick is connected to or
                disconnected from the system.

                For joystick connection and disconnection events to be delivered on all
                platforms, you need to call one of the [event processing](@ref events)
                functions.  Joystick disconnection may also be detected and the callback
                called by joystick functions.  The function will then return whatever it
                returns if the joystick is not present.

                @param callback The new callback, or `NULL` to remove the currently set
                callback.
                @return The previously set callback, or `NULL` if no callback was set or the
                library had not been initialized.

                @glfw.callback_signature
                For more information about the callback parameters, see the
                [function pointer type][GLFWJoystickFun].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function must only be called from the main thread.
            """.trimIndent()
        ).callbackOverload("Arena.global()")

        +(+"glfwUpdateGamepadMappings"(
            glfw_boolean,
            (address.copy(
                javaType = MemorySegment_,
                cType = const_char_ptr.cType,
                layout = const_char_ptr.layout
            ))("string"),
            entrypoint = "glfwUpdateGamepadMappings",
            javadoc = """
                Adds the specified SDL_GameControllerDB gamepad mappings.

                This function parses the specified ASCII encoded string and updates the
                internal list with any gamepad mappings it finds.  This string may
                contain either a single gamepad mapping or many mappings separated by
                newlines.  The parser supports the full format of the `gamecontrollerdb.txt`
                source file including empty lines and comments.

                See gamepad_mapping for a description of the format.

                If there is already a gamepad mapping for a given GUID in the internal list,
                it will be replaced by the one passed to this function.  If the library is
                terminated and re-initialized the internal list will revert to the built-in
                default.

                @param string The string containing the gamepad mappings.
                @return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
                @see #glfwGetGamepadName(int) glfwGetGamepadName
            """.trimIndent(),
            addNow = false,
        ).overload()).overload(parameters = listOf(const_char_ptr("string")))

        +"glfwGetGamepadName_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetGamepadName",
            javadoc = """
                Returns the human-readable gamepad name for the specified joystick.

                This function returns the human-readable name of the gamepad from the
                gamepad mapping assigned to the specified joystick.

                If the specified joystick is not present or does not have a gamepad mapping
                this function will return `NULL` but will not generate an error.  Call
                [glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
                whether it has a mapping.

                @param jid The joystick to query.
                @return The UTF-8 encoded name of the gamepad, or `NULL` if the
                joystick is not present, does not have a mapping or an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the specified joystick is
                disconnected, the gamepad mappings are updated or the library is terminated.
                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
            """.trimIndent()
        ).overload(name = "glfwGetGamepadName")

        +(+"glfwGetGamepadState"(
            glfw_boolean,
            int("jid"),
            (address.copy(
                javaType = MemorySegment_,
                cType = GLFWgamepadstate_ptr.cType,
                layout = GLFWgamepadstate_ptr.layout
            ))("state"),
            entrypoint = "glfwGetGamepadState",
            javadoc = """
                Retrieves the state of the specified joystick remapped as a gamepad.

                This function retrieves the state of the specified joystick remapped to
                an Xbox-like gamepad.

                If the specified joystick is not present or does not have a gamepad mapping
                this function will return `GLFW_FALSE` but will not generate an error.  Call
                [glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
                whether it has a mapping.

                The Guide button may not be available for input as it is often hooked by the
                system or the Steam client.

                Not all devices have all the buttons or axes provided by
                [GLFWGamepadState].  Unavailable buttons and axes will always report
                `GLFW_RELEASE` and 0.0 respectively.

                @param jid The joystick to query.
                @param state The gamepad input state of the joystick.
                @return `GLFW_TRUE` if successful, or `GLFW_FALSE` if no joystick is
                connected, it has no gamepad mapping or an error
                occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwUpdateGamepadMappings(MemorySegment) glfwUpdateGamepadMappings
                @see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
            """.trimIndent(),
            addNow = false
        ).overload()).overload(parameters = listOf(int("jid"), GLFWgamepadstate_ptr("state")))

        +"glfwSetClipboardString"(
            void,
            GLFWwindow_ptr("window"),
            const_char_ptr("string"),
            entrypoint = "glfwSetClipboardString",
            javadoc = """
                Sets the clipboard to the specified string.

                This function sets the system clipboard to the specified, UTF-8 encoded
                string.

                @param window Deprecated.  Any valid window or `NULL`.
                @param string A UTF-8 encoded string.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
                writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
                cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
                It is safe to try this multiple times.

                @glfw.pointer_lifetime The specified string is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetClipboardString(MemorySegment) glfwGetClipboardString
            """.trimIndent()
        ).overload()

        +"glfwGetClipboardString_"(
            const_char_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetClipboardString",
            javadoc = """
                Returns the contents of the clipboard as a string.

                This function returns the contents of the system clipboard, if it contains
                or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
                if its contents cannot be converted, `NULL` is returned and a
                [GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] error is generated.

                @param window Deprecated.  Any valid window or `NULL`.
                @return The contents of the clipboard as a UTF-8 encoded string, or `NULL`
                if an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
                writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
                cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
                It is safe to try this multiple times.

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
                should not free it yourself.  It is valid until the next call to
                `glfwGetClipboardString` or [glfwSetClipboardString][#glfwSetClipboardString(MemorySegment, MemorySegment)], or until the library
                is terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetClipboardString(MemorySegment, MemorySegment) glfwSetClipboardString
            """.trimIndent()
        ).overload(name = "glfwGetClipboardString")

        "glfwGetTime"(
            double,
            entrypoint = "glfwGetTime",
            javadoc = """
                Returns the GLFW time.

                This function returns the current GLFW time, in seconds.  Unless the time
                has been set using [glfwSetTime][#glfwSetTime(double)] it measures time elapsed since GLFW was
                initialized.

                This function and [glfwSetTime][#glfwSetTime(double)] are helper functions on top of
                [glfwGetTimerFrequency][#glfwGetTimerFrequency()] and [glfwGetTimerValue][#glfwGetTimerValue()].

                The resolution of the timer is system dependent, but is usually on the order
                of a few micro- or nanoseconds.  It uses the highest-resolution monotonic
                time source on each operating system.

                @return The current time, in seconds, or zero if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.  Reading and
                writing of the internal base time is not atomic, so it needs to be
                externally synchronized with calls to [glfwSetTime][#glfwSetTime(double)].
            """.trimIndent()
        )

        "glfwSetTime"(
            void,
            double("time"),
            entrypoint = "glfwSetTime",
            javadoc = """
                Sets the GLFW time.

                This function sets the current GLFW time, in seconds.  The value must be
                a positive finite number less than or equal to 18446744073.0, which is
                approximately 584.5 years.

                This function and [glfwGetTime][#glfwGetTime()] are helper functions on top of
                [glfwGetTimerFrequency][#glfwGetTimerFrequency()] and [glfwGetTimerValue][#glfwGetTimerValue()].

                @param time The new value, in seconds.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].

                @glfw.remark The upper limit of GLFW time is calculated as
                floor((2<sup>64</sup> - 1) / 10<sup>9</sup>) and is due to implementations
                storing nanoseconds in 64 bits.  The limit may be increased in the future.

                @glfw.thread_safety This function may be called from any thread.  Reading and
                writing of the internal base time is not atomic, so it needs to be
                externally synchronized with calls to [glfwGetTime][#glfwGetTime()].
            """.trimIndent()
        )

        "glfwGetTimerValue"(
            uint64_t,
            entrypoint = "glfwGetTimerValue",
            javadoc = """
                Returns the current value of the raw timer.

                This function returns the current value of the raw timer, measured in
                1&nbsp;/&nbsp;frequency seconds.  To get the frequency, call
                [glfwGetTimerFrequency][#glfwGetTimerFrequency()].

                @return The value of the timer, or zero if an
                error occurred.
                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetTimerFrequency() glfwGetTimerFrequency
            """.trimIndent()
        )

        "glfwGetTimerFrequency"(
            uint64_t,
            entrypoint = "glfwGetTimerFrequency",
            javadoc = """
                Returns the frequency, in Hz, of the raw timer.

                This function returns the frequency, in Hz, of the raw timer.

                @return The frequency of the timer, in Hz, or zero if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetTimerValue() glfwGetTimerValue
            """.trimIndent()
        )

        "glfwMakeContextCurrent"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwMakeContextCurrent",
            javadoc = """
                Makes the context of the specified window current for the calling
                thread.

                This function makes the OpenGL or OpenGL ES context of the specified window
                current on the calling thread.  It can also detach the current context from
                the calling thread without making a new one current by passing in `NULL`.

                A context must only be made current on a single thread at a time and each
                thread can have only a single current context at a time.  Making a context
                current detaches any previously current context on the calling thread.

                When moving a context between threads, you must detach it (make it
                non-current) on the old thread before making it current on the new one.

                By default, making a context non-current implicitly forces a pipeline flush.
                On machines that support `GL_KHR_context_flush_control`, you can control
                whether a context performs this flush by setting the
                [GLFW_CONTEXT_RELEASE_BEHAVIOR][#GLFW_CONTEXT_RELEASE_BEHAVIOR]
                hint.

                The specified window must have an OpenGL or OpenGL ES context.  Specifying
                a window without a context will generate a [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT]
                error.

                @param window The window whose context to make current, or `NULL` to
                detach the current context.

                @glfw.remark If the previously current context was created via a different
                context creation API than the one passed to this function, GLFW will still
                detach the previous one from its API before making the new one current.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetCurrentContext() glfwGetCurrentContext
            """.trimIndent()
        )

        "glfwGetCurrentContext"(
            GLFWwindow_ptr,
            entrypoint = "glfwGetCurrentContext",
            javadoc = """
                Returns the window whose context is current on the calling thread.

                This function returns the window whose OpenGL or OpenGL ES context is
                current on the calling thread.

                @return The window whose context is current, or `NULL` if no window's
                context is current.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwMakeContextCurrent(MemorySegment) glfwMakeContextCurrent
            """.trimIndent()
        )

        "glfwSwapBuffers"(
            void,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwSwapBuffers",
            javadoc = """
                Swaps the front and back buffers of the specified window.

                This function swaps the front and back buffers of the specified window when
                rendering with OpenGL or OpenGL ES.  If the swap interval is greater than
                zero, the GPU driver waits the specified number of screen updates before
                swapping the buffers.

                The specified window must have an OpenGL or OpenGL ES context.  Specifying
                a window without a context will generate a [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT]
                error.

                This function does not apply to Vulkan.  If you are rendering with Vulkan,
                see `vkQueuePresentKHR` instead.

                @param window The window whose buffers to swap.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark __EGL:__ The context of the specified window must be current on the
                calling thread.

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwSwapInterval(int) glfwSwapInterval
            """.trimIndent()
        )

        "glfwSwapInterval"(
            void,
            int("interval"),
            entrypoint = "glfwSwapInterval",
            javadoc = """
                Sets the swap interval for the current context.

                This function sets the swap interval for the current OpenGL or OpenGL ES
                context, i.e. the number of screen updates to wait from the time
                [glfwSwapBuffers][#glfwSwapBuffers(MemorySegment)] was called before swapping the buffers and returning.  This
                is sometimes called _vertical synchronization_, _vertical retrace
                synchronization_ or just _vsync_.

                A context that supports either of the `WGL_EXT_swap_control_tear` and
                `GLX_EXT_swap_control_tear` extensions also accepts _negative_ swap
                intervals, which allows the driver to swap immediately even if a frame
                arrives a little bit late.  You can check for these extensions with
                [glfwExtensionSupported][#glfwExtensionSupported(MemorySegment)].

                A context must be current on the calling thread.  Calling this function
                without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.

                This function does not apply to Vulkan.  If you are rendering with Vulkan,
                see the present mode of your swapchain instead.

                @param interval The minimum number of screen updates to wait for
                until the buffers are swapped by [glfwSwapBuffers][#glfwSwapBuffers(MemorySegment)].

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark This function is not called during context creation, leaving the
                swap interval set to whatever is the default for that API.  This is done
                because some swap interval extensions used by GLFW do not allow the swap
                interval to be reset to zero once it has been set to a non-zero value.

                Some GPU drivers do not honor the requested swap interval, either
                because of a user setting that overrides the application's request or due to
                bugs in the driver.

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwSwapBuffers(MemorySegment) glfwSwapBuffers
            """.trimIndent()
        )

        +(+"glfwExtensionSupported"(
            glfw_boolean,
            address.copy(
                javaType = MemorySegment_,
                cType = const_char_ptr.cType,
                layout = const_char_ptr.layout
            )("extension"),
            entrypoint = "glfwExtensionSupported",
            javadoc = """
                Returns whether the specified extension is available.

                This function returns whether the specified
                API extension is supported by the current OpenGL or
                OpenGL ES context.  It searches both for client API extension and context
                creation API extensions.

                A context must be current on the calling thread.  Calling this function
                without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.

                As this functions retrieves and searches one or more extension strings each
                call, it is recommended that you cache its results if it is going to be used
                frequently.  The extension strings will not change during the lifetime of
                a context, so there is no danger in doing this.

                This function does not apply to Vulkan.  If you are using Vulkan, see
                [glfwGetRequiredInstanceExtensions][#glfwGetRequiredInstanceExtensions(MemorySegment)], `vkEnumerateInstanceExtensionProperties`
                and `vkEnumerateDeviceExtensionProperties` instead.

                @param extension The ASCII encoded name of the extension.
                @return `GLFW_TRUE` if the extension is available, or `GLFW_FALSE`
                otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and
                [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwGetProcAddress(MemorySegment) glfwGetProcAddress
            """.trimIndent(),
            addNow = false
        ).overload()).overload(parameters = listOf(const_char_ptr("extension")))

        +"glfwGetProcAddress"(
            address c "GLFWglproc",
            const_char_ptr("procname"),
            entrypoint = "glfwGetProcAddress",
            javadoc = """
                Returns the address of the specified function for the current
                context.

                This function returns the address of the specified OpenGL or OpenGL ES
                core or extension function, if it is supported
                by the current context.

                A context must be current on the calling thread.  Calling this function
                without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.

                This function does not apply to Vulkan.  If you are rendering with Vulkan,
                see [glfwGetInstanceProcAddress][GLFWVulkan#glfwGetInstanceProcAddress(MemorySegment, MemorySegment)], `vkGetInstanceProcAddr` and
                `vkGetDeviceProcAddr` instead.

                @param procname The ASCII encoded name of the function.
                @return The address of the function, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
                [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].

                @glfw.remark The address of a given function is not guaranteed to be the same
                between contexts.

                This function may return a non-`NULL` address despite the
                associated version or extension not being available.  Always check the
                context version or extension string first.

                @glfw.pointer_lifetime The returned function pointer is valid until the context
                is destroyed or the library is terminated.

                @glfw.thread_safety This function may be called from any thread.

                @see #glfwExtensionSupported(MemorySegment) glfwExtensionSupported
            """.trimIndent()
        ).overload()

        +"glfwVulkanSupported"(
            glfw_boolean,
            entrypoint = "glfwVulkanSupported",
            javadoc = """
                Returns whether the Vulkan loader and an ICD have been found.

                This function returns whether the Vulkan loader and any minimally functional
                ICD have been found.

                The availability of a Vulkan loader and even an ICD does not by itself guarantee that
                surface creation or even instance creation is possible.  Call
                [glfwGetRequiredInstanceExtensions][#glfwGetRequiredInstanceExtensions(MemorySegment)] to check whether the extensions necessary for Vulkan
                surface creation are available and [glfwGetPhysicalDevicePresentationSupport][GLFWVulkan#glfwGetPhysicalDevicePresentationSupport(MemorySegment, MemorySegment, int)] to
                check whether a queue family of a physical device supports image presentation.

                @return `GLFW_TRUE` if Vulkan is minimally available, or `GLFW_FALSE`
                otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].

                @glfw.thread_safety This function may be called from any thread.
            """.trimIndent(),
            addNow = false
        ).overload()

        "glfwGetRequiredInstanceExtensions"(
            address c "const char**",
            (address c "uint32_t*")("count").ref(),
            entrypoint = "glfwGetRequiredInstanceExtensions",
            javadoc = """
                Returns the Vulkan instance extensions required by GLFW.

                This function returns an array of names of Vulkan instance extensions required
                by GLFW for creating Vulkan surfaces for GLFW windows.  If successful, the
                list will always contain `VK_KHR_surface`, so if you don't require any
                additional extensions you can pass this list directly to the
                `VkInstanceCreateInfo` struct.

                If Vulkan is not available on the machine, this function returns `NULL` and
                generates a [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][#glfwVulkanSupported()]
                to check whether Vulkan is at least minimally available.

                If Vulkan is available but no set of extensions allowing window surface
                creation was found, this function returns `NULL`.  You may still use Vulkan
                for off-screen rendering and compute work.

                @param count Where to store the number of extensions in the returned
                array.  This is set to zero if an error occurred.
                @return An array of ASCII encoded extension names, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
                [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE].

                @glfw.remark Additional extensions may be required by future versions of GLFW.
                You should check if any extensions you wish to enable are already in the
                returned array, as it is an error to specify an extension more than once in
                the `VkInstanceCreateInfo` struct.

                @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
                should not free it yourself.  It is guaranteed to be valid only until the
                library is terminated.

                @glfw.thread_safety This function may be called from any thread.

                @see GLFWVulkan#glfwCreateWindowSurface(MemorySegment, MemorySegment, MemorySegment, MemorySegment) glfwCreateWindowSurface
            """.trimIndent()
        )

        //endregion
    }

    StaticDowncall(glfwPackage, "GLFWVulkan", symbolLookup = glfwLookup) {
        val VkInstance = address c "VkInstance"
        val VkPhysicalDevice = address c "VkPhysicalDevice"
        val const_VkAllocationCallbacks_ptr = address c "const VkAllocationCallbacks*"
        val VkSurfaceKHR_ptr = address c "VkSurfaceKHR*"
        val VkResult = int c "VkResult"

        "glfwInitVulkanLoader"(
            void,
            (address c "PFN_vkGetInstanceProcAddr")("loader"),
            entrypoint = "glfwInitVulkanLoader",
            javadoc = """
                Sets the desired Vulkan `vkGetInstanceProcAddr` function.

                This function sets the `vkGetInstanceProcAddr` function that GLFW will use for all
                Vulkan related entry point queries.

                This feature is mostly useful on macOS, if your copy of the Vulkan loader is in
                a location where GLFW cannot find it through dynamic loading, or if you are still
                using the static library version of the loader.

                If set to `NULL`, GLFW will try to load the Vulkan loader dynamically by its standard
                name and get this function from there.  This is the default behavior.

                The standard name of the loader is `vulkan-1.dll` on Windows, `libvulkan.so.1` on
                Linux and other Unix-like systems and `libvulkan.1.dylib` on macOS.  If your code is
                also loading it via these names then you probably don't need to use this function.

                The function address you set is never reset by GLFW, but it only takes effect during
                initialization.  Once GLFW has been initialized, any updates will be ignored until the
                library is terminated and initialized again.

                @param loader The address of the function to use, or `NULL`.

                Loader function signature
                ```c
                PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* name)
                ```
                For more information about this function, see the
                [Vulkan Registry](https://www.khronos.org/registry/vulkan/).

                @glfw.errors None.

                @glfw.remark This function may be called before [glfwInit][GLFW#glfwInit()].

                @glfw.thread_safety This function must only be called from the main thread.

                @see GLFW#glfwInit() glfwInit
            """.trimIndent()
        )

        +"glfwGetInstanceProcAddress"(
            address c "GLFWvkproc",
            VkInstance("instance"),
            const_char_ptr("procname"),
            entrypoint = "glfwGetInstanceProcAddress",
            javadoc = """
                Returns the address of the specified Vulkan instance function.

                This function returns the address of the specified Vulkan core or extension
                function for the specified instance.  If instance is set to `NULL` it can
                return any function exported from the Vulkan loader, including at least the
                following functions:
                - `vkEnumerateInstanceExtensionProperties`
                - `vkEnumerateInstanceLayerProperties`
                - `vkCreateInstance`
                - `vkGetInstanceProcAddr`

                If Vulkan is not available on the machine, this function returns `NULL` and
                generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()]
                to check whether Vulkan is at least minimally available.

                This function is equivalent to calling `vkGetInstanceProcAddr` with
                a platform-specific query of the Vulkan loader as a fallback.

                @param instance The Vulkan instance to query, or `NULL` to retrieve
                functions related to instance creation.
                @param procname The ASCII encoded name of the function.
                @return The address of the function, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE].

                @glfw.pointer_lifetime The returned function pointer is valid until the library
                is terminated.

                @glfw.thread_safety This function may be called from any thread.
            """.trimIndent()
        ).overload()

        +"glfwGetPhysicalDevicePresentationSupport"(
            glfw_boolean,
            VkInstance("instance"),
            VkPhysicalDevice("device"),
            uint32_t("queuefamily"),
            entrypoint = "glfwGetPhysicalDevicePresentationSupport",
            javadoc = """
                Returns whether the specified queue family can present images.

                This function returns whether the specified queue family of the specified
                physical device supports presentation to the platform GLFW was built for.

                If Vulkan or the required window surface creation instance extensions are
                not available on the machine, or if the specified instance was not created
                with the required extensions, this function returns `GLFW_FALSE` and
                generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()]
                to check whether Vulkan is at least minimally available and
                [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] to check what instance extensions are
                required.

                @param instance The instance that the physical device belongs to.
                @param device The physical device that the queue family belongs to.
                @param queuefamily The index of the queue family to query.
                @return `GLFW_TRUE` if the queue family supports presentation, or
                `GLFW_FALSE` otherwise.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR].

                @glfw.remark __macOS:__ This function currently always returns `GLFW_TRUE`, as the
                `VK_MVK_macos_surface` and `VK_EXT_metal_surface` extensions do not provide
                a `vkGetPhysicalDevice*PresentationSupport` type function.

                @glfw.thread_safety This function may be called from any thread.  For
                synchronization details of Vulkan objects, see the Vulkan specification.
            """.trimIndent(),
            addNow = false
        ).overload()

        "glfwCreateWindowSurface"(
            VkResult,
            VkInstance("instance"),
            GLFWwindow_ptr("window"),
            const_VkAllocationCallbacks_ptr("allocator"),
            VkSurfaceKHR_ptr("surface").ref(),
            entrypoint = "glfwCreateWindowSurface",
            javadoc = """
                Creates a Vulkan surface for the specified window.

                This function creates a Vulkan surface for the specified window.

                If the Vulkan loader or at least one minimally functional ICD were not found,
                this function returns `VK_ERROR_INITIALIZATION_FAILED` and generates a
                [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][GLFW#glfwVulkanSupported()] to check whether
                Vulkan is at least minimally available.

                If the required window surface creation instance extensions are not
                available or if the specified instance was not created with these extensions
                enabled, this function returns `VK_ERROR_EXTENSION_NOT_PRESENT` and
                generates a [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE] error.  Call
                [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] to check what instance extensions are
                required.

                The window surface cannot be shared with another API so the window must
                have been created with the client api hint
                set to `GLFW_NO_API` otherwise it generates a [GLFW_INVALID_VALUE][GLFW#GLFW_INVALID_VALUE] error
                and returns `VK_ERROR_NATIVE_WINDOW_IN_USE_KHR`.

                The window surface must be destroyed before the specified Vulkan instance.
                It is the responsibility of the caller to destroy the window surface.  GLFW
                does not destroy it for you.  Call `vkDestroySurfaceKHR` to destroy the
                surface.

                @param instance The Vulkan instance to create the surface in.
                @param window The window to create the surface for.
                @param allocator The allocator to use, or `NULL` to use the default
                allocator.
                @param surface Where to store the handle of the surface.  This is set
                to `VK_NULL_HANDLE` if an error occurred.
                @return `VK_SUCCESS` if successful, or a Vulkan error code if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_API_UNAVAILABLE][GLFW#GLFW_API_UNAVAILABLE], [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR] and [GLFW_INVALID_VALUE][GLFW#GLFW_INVALID_VALUE]

                @glfw.remark If an error occurs before the creation call is made, GLFW returns
                the Vulkan error code most appropriate for the error.  Appropriate use of
                [glfwVulkanSupported][GLFW#glfwVulkanSupported()] and [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)] should
                eliminate almost all occurrences of these errors.
                - __macOS:__ GLFW prefers the `VK_EXT_metal_surface` extension, with the
                    `VK_MVK_macos_surface` extension as a fallback.  The name of the selected
                    extension, if any, is included in the array returned by
                    [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)].

                    This function creates and sets a `CAMetalLayer` instance for
                    the window content view, which is required for MoltenVK to function.
                - __X11:__ By default GLFW prefers the `VK_KHR_xcb_surface` extension,
                    with the `VK_KHR_xlib_surface` extension as a fallback.  You can make
                    `VK_KHR_xlib_surface` the preferred extension by setting the
                    [GLFW_X11_XCB_VULKAN_SURFACE][GLFW#GLFW_X11_XCB_VULKAN_SURFACE] init
                    hint.  The name of the selected extension, if any, is included in the array
                    returned by [glfwGetRequiredInstanceExtensions][GLFW#glfwGetRequiredInstanceExtensions(MemorySegment)].

                @glfw.thread_safety This function may be called from any thread.  For
                synchronization details of Vulkan objects, see the Vulkan specification.

                @see GLFW#glfwGetRequiredInstanceExtensions(MemorySegment) glfwGetRequiredInstanceExtensions
            """.trimIndent()
        )
    }

    StaticDowncall(glfwPackage, "GLFWNative", symbolLookup = glfwLookup) {
        //region WIN32
        val HWND = address c "HWND"

        +"glfwGetWin32Adapter_"(
            const_char_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWin32Adapter",
            javadoc = """
                Returns the adapter device name of the specified monitor.

                @return The UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`)
                of the specified monitor, or `NULL` if an error
                occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        ).overload(name = "glfwGetWin32Adapter", defaultCode = "return null;")

        +"glfwGetWin32Monitor_"(
            const_char_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWin32Monitor",
            javadoc = """
                Returns the display device name of the specified monitor.

                @return The UTF-8 encoded display device name (for example
                `\\.\DISPLAY1\Monitor0`) of the specified monitor, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        ).overload(name = "glfwGetWin32Monitor", defaultCode = "return null;")

        "glfwGetWin32Window"(
            HWND,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWin32Window",
            javadoc = """
                Returns the `HWND` of the specified window.

                @return The `HWND` of the specified window, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].
                @glfw.remark The `HDC` associated with the window can be queried with the
                [GetDC](https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc)
                function.
                ```c
                HDC dc = GetDC(glfwGetWin32Window(window));
                ```
                This DC is private and does not need to be released.

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region WGL
        val HGLRC = address c "HGLRC"
        "glfwGetWGLContext"(
            HGLRC,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWGLContext",
            javadoc = """
                Returns the `HGLRC` of the specified window.

                @return The `HGLRC` of the specified window, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE] and [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.remark The `HDC` associated with the window can be queried with the
                [GetDC](https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc)
                function.
                ```c
                HDC dc = GetDC(glfwGetWin32Window(window));
                ```
                This DC is private and does not need to be released.

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region COCOA
        val CGDirectDisplayID = int c "CGDirectDisplayID"
        val id = address c "id"

        "glfwGetCocoaMonitor"(
            CGDirectDisplayID,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetCocoaMonitor",
            javadoc = """
                Returns the `CGDirectDisplayID` of the specified monitor.

                @return The `CGDirectDisplayID` of the specified monitor, or
                `kCGNullDirectDisplay` if an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return 0;"
        )

        "glfwGetCocoaWindow"(
            id,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetCocoaWindow",
            javadoc = """
                Returns the `NSWindow` of the specified window.

                @return The `NSWindow` of the specified window, or `nil` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetCocoaView"(
            id,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetCocoaView",
            javadoc = """
                Returns the `NSView` of the specified window.

                @return The `NSView` of the specified window, or `nil` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region NSGL
        "glfwGetNSGLContext"(
            id,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetNSGLContext",
            javadoc = """
                Returns the `NSOpenGLContext` of the specified window.

                @return The `NSOpenGLContext` of the specified window, or `nil` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE] and [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region X11
        val Display_ptr = address c "Display*"
        val RRCrtc = jlong c "RRCrtc"
        val RROutput = jlong c "RROutput"
        val Window = jlong c "Window"

        "glfwGetX11Display"(
            Display_ptr,
            entrypoint = "glfwGetX11Display",
            javadoc = """
                Returns the `Display` used by GLFW.

                @return The `Display` used by GLFW, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetX11Adapter"(
            RRCrtc,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetX11Adapter",
            javadoc = """
                Returns the `RRCrtc` of the specified monitor.

                @return The `RRCrtc` of the specified monitor, or `None` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return 0L;"
        )

        "glfwGetX11Monitor"(
            RROutput,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetX11Monitor",
            javadoc = """
                Returns the `RROutput` of the specified monitor.

                @return The `RROutput` of the specified monitor, or `None` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return 0L;"
        )

        "glfwGetX11Window"(
            RROutput,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetX11Window",
            javadoc = """
                Returns the `Window` of the specified window.

                @return The `Window` of the specified window, or `None` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return 0L;"
        )

        +"glfwSetX11SelectionString"(
            void,
            const_char_ptr("string"),
            entrypoint = "glfwSetX11SelectionString",
            javadoc = """
                Sets the current primary selection to the specified string.

                @param string A UTF-8 encoded string.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The specified string is copied before this function
                returns.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwGetX11SelectionString() glfwGetX11SelectionString
                @see GLFW#glfwSetClipboardString(MemorySegment, MemorySegment) glfwSetClipboardString
            """.trimIndent(),
            optional = true
        ).overload()

        +"glfwGetX11SelectionString_"(
            const_char_ptr,
            entrypoint = "glfwGetX11SelectionString",
            javadoc = """
                Returns the contents of the current primary selection as a string.

                If the selection is empty or if its contents cannot be converted, `NULL`
                is returned and a [GLFW_FORMAT_UNAVAILABLE][GLFW#GLFW_FORMAT_UNAVAILABLE] error is generated.

                @return The contents of the selection as a UTF-8 encoded string, or `NULL`
                if an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][GLFW#GLFW_PLATFORM_ERROR].

                @glfw.pointer_lifetime The returned string is allocated and freed by GLFW. You
                should not free it yourself. It is valid until the next call to
                `glfwGetX11SelectionString` or [glfwSetX11SelectionString][#glfwSetX11SelectionString(MemorySegment)], or until the
                library is terminated.

                @glfw.thread_safety This function must only be called from the main thread.

                @see #glfwSetX11SelectionString(MemorySegment) glfwSetX11SelectionString
                @see GLFW#glfwGetClipboardString(MemorySegment) glfwGetClipboardString
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        ).overload(name = "glfwGetX11SelectionString", defaultCode = "return null;")
        //endregion

        //region GLX
        val GLXContext = address c "GLXContext"
        val GLXWindow = jlong c "GLXWindow"

        "glfwGetGLXContext"(
            GLXContext,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetGLXContext",
            javadoc = """
                Returns the `GLXContext` of the specified window.

                @return The `GLXContext` of the specified window, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetGLXWindow"(
            GLXWindow,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetGLXWindow",
            javadoc = """
                Returns the `GLXWindow` of the specified window.

                @return The `GLXWindow` of the specified window, or `None` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED],
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return 0L;"
        )
        //endregion

        //region WAYLAND
        val struct_wl_display_ptr = address c "struct wl_display*"
        val struct_wl_output_ptr = address c "struct wl_output*"
        val struct_wl_surface_ptr = address c "struct wl_surface*"

        "glfwGetWaylandDisplay"(
            struct_wl_display_ptr,
            entrypoint = "glfwGetWaylandDisplay",
            javadoc = """
                Returns the `struct wl_display*` used by GLFW.

                @return The `struct wl_display*` used by GLFW, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetWaylandMonitor"(
            struct_wl_output_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWaylandMonitor",
            javadoc = """
                Returns the `struct wl_output*` of the specified monitor.

                @return The `struct wl_output*` of the specified monitor, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetWaylandWindow"(
            struct_wl_surface_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWaylandWindow",
            javadoc = """
                Returns the main `struct wl_surface*` of the specified window.

                @return The main `struct wl_surface*` of the specified window, or `NULL` if
                an error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_PLATFORM_UNAVAILABLE][GLFW#GLFW_PLATFORM_UNAVAILABLE].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region EGL
        val EGLDisplay = address c "EGLDisplay"
        val EGLContext = address c "EGLContext"
        val EGLSurface = address c "EGLSurface"

        "glfwGetEGLDisplay"(
            EGLDisplay,
            entrypoint = "glfwGetEGLDisplay",
            javadoc = """
                Returns the `EGLDisplay` used by GLFW.

                @return The `EGLDisplay` used by GLFW, or `EGL_NO_DISPLAY` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED].

                @glfw.remark Because EGL is initialized on demand, this function will return
                `EGL_NO_DISPLAY` until the first context has been created via EGL.

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetEGLContext"(
            EGLContext,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetEGLContext",
            javadoc = """
                Returns the `EGLContext` of the specified window.

                @return The `EGLContext` of the specified window, or `EGL_NO_CONTEXT` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )

        "glfwGetEGLSurface"(
            EGLSurface,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetEGLSurface",
            javadoc = """
                Returns the `EGLSurface` of the specified window.

                @return The `EGLSurface` of the specified window, or `EGL_NO_SURFACE` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion

        //region OSMESA
        val OSMesaContext = address c "OSMesaContext"
        val int_ptr_osmesa = address c "int*"
        val void_ptr_ptr_osmesa = address c "void**"

        +"glfwGetOSMesaColorBuffer"(
            glfw_boolean,
            GLFWwindow_ptr("window"),
            int_ptr_osmesa("width").ref(),
            int_ptr_osmesa("height").ref(),
            int_ptr_osmesa("format").ref(),
            void_ptr_ptr_osmesa("buffer").ref(),
            entrypoint = "glfwGetOSMesaColorBuffer",
            javadoc = """
                Retrieves the color buffer associated with the specified window.

                @param window The window whose color buffer to retrieve.
                @param width Where to store the width of the color buffer, or `NULL`.
                @param height Where to store the height of the color buffer, or `NULL`.
                @param format Where to store the OSMesa pixel format of the color
                buffer, or `NULL`.
                @param buffer Where to store the address of the color buffer, or
                `NULL`.
                @return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            addNow = false,
            optional = true,
            defaultCode = "return false;"
        ).overload()

        +"glfwGetOSMesaDepthBuffer"(
            glfw_boolean,
            GLFWwindow_ptr("window"),
            int_ptr_osmesa("width").ref(),
            int_ptr_osmesa("height").ref(),
            int_ptr_osmesa("bytesPerValue").ref(),
            void_ptr_ptr_osmesa("buffer").ref(),
            entrypoint = "glfwGetOSMesaDepthBuffer",
            javadoc = """
                Retrieves the depth buffer associated with the specified window.

                @param window The window whose depth buffer to retrieve.
                @param width Where to store the width of the depth buffer, or `NULL`.
                @param height Where to store the height of the depth buffer, or `NULL`.
                @param bytesPerValue Where to store the number of bytes per depth
                buffer element, or `NULL`.
                @param buffer Where to store the address of the depth buffer, or
                `NULL`.
                @return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            addNow = false,
            optional = true,
            defaultCode = "return false;"
        ).overload()

        "glfwGetOSMesaContext"(
            OSMesaContext,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetOSMesaContext",
            javadoc = """
                Returns the `OSMesaContext` of the specified window.

                @return The `OSMesaContext` of the specified window, or `NULL` if an
                error occurred.

                @glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][GLFW#GLFW_NOT_INITIALIZED] and
                [GLFW_NO_WINDOW_CONTEXT][GLFW#GLFW_NO_WINDOW_CONTEXT].

                @glfw.thread_safety This function may be called from any thread.  Access is not
                synchronized.
            """.trimIndent(),
            optional = true,
            defaultCode = "return MemorySegment.NULL;"
        )
        //endregion
    }
}

private fun DowncallMethod.callbackOverload(arena: String): DowncallMethod =
    copy(
        overload = true,
        code = "return $name(callback != null ? callback.stub($arena) : MemorySegment.NULL);"
    )

private fun DowncallMethod.windowCallbackOverload(): DowncallMethod =
    copy(
        overload = true,
        code = "return $name(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);"
    )

private fun StaticDowncall.windowCallback(
    name: String,
    callbackType: CustomTypeSpec,
    javadoc: String
) {
    +name(
        address c callbackType.cType,
        GLFWwindow_ptr("window"),
        callbackType("callback"),
        entrypoint = name,
        javadoc = javadoc
    ).windowCallbackOverload()
}
