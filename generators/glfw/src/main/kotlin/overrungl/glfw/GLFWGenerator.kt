/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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
val glfwLookup = "Handles.lookup"

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

            TODO
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

            TODO
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

            TODO
            @see GLFW#glfwSetWindowSizeCallback()
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

            TODO
            @see GLFW#glfwSetWindowCloseCallback()
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

            TODO
            @see GLFW#glfwSetWindowRefreshCallback()
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

            TODO
            @see GLFW#glfwSetWindowFocusCallback()
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

            TODO
            @see GLFW#glfwSetWindowIconifyCallback()
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

            TODO
            @see GLFW#glfwSetWindowMaximizeCallback()
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

            @see GLFW#glfwSetFramebufferSizeCallback()
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

            @see GLFW#glfwSetWindowContentScaleCallback()
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

            TODO
            @see GLFW#glfwSetMouseButtonCallback()
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

            TODO
            @see GLFW#glfwSetCursorPosCallback()
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

            TODO
            @see GLFW#glfwSetCursorEnterCallback()
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

            @see GLFW#glfwSetScrollCallback()
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

            TODO
            @see GLFW#glfwSetKeyCallback()
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

            TODO
            @see GLFW#glfwSetCharCallback()
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

            TODO
            @see GLFW#glfwSetDropCallback()
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

            TODO
            @see GLFW#glfwSetMonitorCallback()
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

            TODO
            @see GLFW#glfwSetJoystickCallback()
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
    Struct(
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
    }

    Struct(
        glfwPackage,
        "GLFWGammaRamp",
        cType = "GLFWgammaramp",
        javadoc = """
            Gamma ramp.

            This describes the gamma ramp for a monitor.

            ## See Also
            TODO
            - [glfwGetGammaRamp][GLFW#glfwGetGammaRamp()]
            - [glfwSetGammaRamp][GLFW#glfwSetGammaRamp()]
        """.trimIndent()
    ) {
        val ushort_ptr = jshort_array c "unsigned short*"
        ushort_ptr("red", javadoc = "An array of value describing the response of the red channel.")
        ushort_ptr("green", javadoc = "An array of value describing the response of the green channel.")
        ushort_ptr("blue", javadoc = "An array of value describing the response of the blue channel.")
        uint("size", javadoc = "The number of elements in each array.")
    }

    Struct(
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
    }

    Struct(
        glfwPackage,
        "GLFWGamepadState",
        cType = "GLFWgamepadstate",
        javadoc = """
            Gamepad input state

            This describes the input state of a gamepad.

            ## See Also
            TODO
            - [glfwGetGamepadState][GLFW#glfwGetGamepadState()]
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
    }

    Struct(
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
    }
    //endregion

    StaticDowncall(glfwPackage, "GLFW", symbolLookup = glfwLookup) {

    }
}
