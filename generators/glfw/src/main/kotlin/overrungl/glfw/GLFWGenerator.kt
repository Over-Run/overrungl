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

const val glfwPackage = "overrungl.glfw"
const val glfwLookup = "GLFWInternal.lookup()"

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
    val GLFWallocatefun = Upcall(glfwPackage, "GLFWAllocateFun") {
        targetMethod = "invoke"(void_ptr, size_t("size"), void_ptr("user"))
    }.pointerType c "GLFWallocatefun"

    val GLFWreallocatefun = Upcall(glfwPackage, "GLFWReallocateFun") {
        targetMethod = "invoke"(void_ptr, void_ptr("block"), size_t("size"), void_ptr("user"))
    }.pointerType c "GLFWreallocatefun"

    val GLFWdeallocatefun = Upcall(glfwPackage, "GLFWDeallocateFun") {
        targetMethod = "invoke"(void, void_ptr("block"), void_ptr("user"))
    }.pointerType c "GLFWdeallocatefun"

    val GLFWerrorfun = Upcall(glfwPackage, "GLFWErrorFun") {
        interfaceMethod = "invoke"(void, int("error_code"), const_char_ptr("description"))
        targetMethod = "invoke"(void, int("error_code"), const_char_ptr("description"), overload = "invoke")
    }.pointerType c "GLFWerrorfun"

    val GLFWwindowposfun = Upcall(glfwPackage, "GLFWWindowPosFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), int("xpos"), int("ypos"))
    }.pointerType c "GLFWwindowposfun"

    val GLFWwindowsizefun = Upcall(glfwPackage, "GLFWWindowSizeFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), int("width"), int("height"))
    }.pointerType c "GLFWwindowsizefun"

    val GLFWwindowclosefun = Upcall(glfwPackage, "GLFWWindowCloseFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"))
    }.pointerType c "GLFWwindowclosefun"

    val GLFWwindowrefreshfun = Upcall(glfwPackage, "GLFWWindowRefreshFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"))
    }.pointerType c "GLFWwindowrefreshfun"

    val GLFWwindowfocusfun = Upcall(glfwPackage, "GLFWWindowFocusFun") {
        interfaceMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("focused"))
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("focused"), overload = "invoke")
    }.pointerType c "GLFWwindowfocusfun"

    val GLFWwindowiconifyfun = Upcall(glfwPackage, "GLFWWindowIconifyFun") {
        interfaceMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("iconified"))
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("iconified"), overload = "invoke")
    }.pointerType c "GLFWwindowiconifyfun"

    val GLFWwindowmaximizefun = Upcall(glfwPackage, "GLFWWindowMaximizeFun") {
        interfaceMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("maximized"))
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("maximized"), overload = "invoke")
    }.pointerType c "GLFWwindowmaximizefun"

    val GLFWframebuffersizefun = Upcall(glfwPackage, "GLFWFramebufferSizeFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), int("width"), int("height"))
    }.pointerType c "GLFWframebuffersizefun"

    val GLFWwindowcontentscalefun = Upcall(glfwPackage, "GLFWWindowContentScaleFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), float("xscale"), float("yscale"))
    }.pointerType c "GLFWwindowcontentscalefun"

    val GLFWmousebuttonfun = Upcall(glfwPackage, "GLFWMouseButtonFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), int("button"), int("action"), int("mods"))
    }.pointerType c "GLFWmousebuttonfun"

    val GLFWcursorposfun = Upcall(glfwPackage, "GLFWCursorPosFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), double("xpos"), double("ypos"))
    }.pointerType c "GLFWcursorposfun"

    val GLFWcursorenterfun = Upcall(glfwPackage, "GLFWCursorEnterFun") {
        interfaceMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("entered"))
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), glfw_boolean("entered"), overload = "invoke")
    }.pointerType c "GLFWcursorenterfun"

    val GLFWscrollfun = Upcall(glfwPackage, "GLFWScrollFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), double("xoffset"), double("yoffset"))
    }.pointerType c "GLFWscrollfun"

    val GLFWkeyfun = Upcall(glfwPackage, "GLFWKeyFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), int("key"), int("scancode"), int("action"), int("mods"))
    }.pointerType c "GLFWkeyfun"

    val GLFWcharfun = Upcall(glfwPackage, "GLFWCharFun") {
        targetMethod = "invoke"(void, GLFWwindow_ptr("window"), uint("codepoint"))
    }.pointerType c "GLFWcharfun"

    val GLFWdropfun = Upcall(glfwPackage, "GLFWDropFun") {
        interfaceMethod = "invoke"(void, GLFWwindow_ptr("window"), string_u8_array("paths"))
        targetMethod = "invoke"(
            void,
            GLFWwindow_ptr("window"),
            int("path_count"),
            string_u8_array("paths"),
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

    val GLFWmonitorfun = Upcall(glfwPackage, "GLFWMonitorFun") {
        targetMethod = "invoke"(void, GLFWmonitor_ptr("monitor"), int("event"))
    }.pointerType c "GLFWmonitorfun"

    val GLFWjoystickfun = Upcall(glfwPackage, "GLFWJoystickFun") {
        targetMethod = "invoke"(void, int("jid"), int("event"))
    }.pointerType c "GLFWjoystickfun"
    //endregion

    //region Structs
    val const_GLFWvidmode_ptr = Struct(glfwPackage, "GLFWVidMode", cType = "GLFWvidmode") {
        int("width")
        int("height")
        int("redBits")
        int("greenBits")
        int("blueBits")
        int("refreshRate")
    }.pointerType c "const GLFWvidmode*"

    val const_GLFWgammaramp_ptr = Struct(glfwPackage, "GLFWGammaRamp", cType = "GLFWgammaramp") {
        val ushort_ptr = jshort_array c "unsigned short*"
        ushort_ptr("red")
        ushort_ptr("green")
        ushort_ptr("blue")
        uint("size")
    }.pointerType c "const GLFWgammaramp*"

    val const_GLFWimage_ptr = Struct(glfwPackage, "GLFWImage", cType = "GLFWimage") {
        int("width")
        int("height")
        (address c "unsigned char*")("pixels")
    }.pointerType c "const GLFWimage*"

    val GLFWgamepadstate_ptr = Struct(glfwPackage, "GLFWGamepadState", cType = "GLFWgamepadstate") {
        fixedSize(uchar, "buttons", "15")
        fixedSize(float, "axes", "6")
    }.pointerType c "GLFWgamepadstate*"

    val const_GLFWallocator_ptr = Struct(glfwPackage, "GLFWAllocator", cType = "GLFWallocator") {
        GLFWallocatefun("allocate")
        GLFWreallocatefun("reallocate")
        GLFWdeallocatefun("deallocate")
        void_ptr("user")
    }.pointerType c "const GLFWallocator*"
    //endregion

    StaticDowncall(glfwPackage, "GLFW", symbolLookup = glfwLookup) {
        //region GLFW API tokens

        int {
            "GLFW_VERSION_MAJOR"("3")
            "GLFW_VERSION_MINOR"("5")
            "GLFW_VERSION_REVISION"("0")
        }

        int("GLFW_TRUE" to "1")
        int("GLFW_FALSE" to "0")

        int {
            "GLFW_RELEASE"("0")
            "GLFW_PRESS"("1")
            "GLFW_REPEAT"("2")
        }

        int {
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

        int {
            "GLFW_KEY_SPACE"("32")
            "GLFW_KEY_APOSTROPHE"("39")
            "GLFW_KEY_COMMA"("44")
            "GLFW_KEY_MINUS"("45")
            "GLFW_KEY_PERIOD"("46")
            "GLFW_KEY_SLASH"("47")
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
            "GLFW_KEY_SEMICOLON"("59")
            "GLFW_KEY_EQUAL"("61")
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
            "GLFW_KEY_LEFT_BRACKET"("91")
            "GLFW_KEY_BACKSLASH"("92")
            "GLFW_KEY_RIGHT_BRACKET"("93")
            "GLFW_KEY_GRAVE_ACCENT"("96")
            "GLFW_KEY_WORLD_1"("161")
            "GLFW_KEY_WORLD_2"("162")
        }

        int {
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

        int {
            "GLFW_MOD_SHIFT"("0x0001")
            "GLFW_MOD_CONTROL"("0x0002")
            "GLFW_MOD_ALT"("0x0004")
            "GLFW_MOD_SUPER"("0x0008")
            "GLFW_MOD_CAPS_LOCK"("0x0010")
            "GLFW_MOD_NUM_LOCK"("0x0020")
        }

        int {
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

        int {
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

        int {
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

        int {
            "GLFW_GAMEPAD_AXIS_LEFT_X"("0")
            "GLFW_GAMEPAD_AXIS_LEFT_Y"("1")
            "GLFW_GAMEPAD_AXIS_RIGHT_X"("2")
            "GLFW_GAMEPAD_AXIS_RIGHT_Y"("3")
            "GLFW_GAMEPAD_AXIS_LEFT_TRIGGER"("4")
            "GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER"("5")
            "GLFW_GAMEPAD_AXIS_LAST"("GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER")
        }

        int {
            "GLFW_NO_ERROR"("0")
            "GLFW_NOT_INITIALIZED"("0x00010001")
            "GLFW_NO_CURRENT_CONTEXT"("0x00010002")
            "GLFW_INVALID_ENUM"("0x00010003")
            "GLFW_INVALID_VALUE"("0x00010004")
            "GLFW_OUT_OF_MEMORY"("0x00010005")
            "GLFW_API_UNAVAILABLE"("0x00010006")
            "GLFW_VERSION_UNAVAILABLE"("0x00010007")
            "GLFW_PLATFORM_ERROR"("0x00010008")
            "GLFW_FORMAT_UNAVAILABLE"("0x00010009")
            "GLFW_NO_WINDOW_CONTEXT"("0x0001000A")
            "GLFW_CURSOR_UNAVAILABLE"("0x0001000B")
            "GLFW_FEATURE_UNAVAILABLE"("0x0001000C")
            "GLFW_FEATURE_UNIMPLEMENTED"("0x0001000D")
            "GLFW_PLATFORM_UNAVAILABLE"("0x0001000E")
        }

        int("GLFW_FOCUSED" to "0x00020001")
        int("GLFW_ICONIFIED" to "0x00020002")
        int("GLFW_RESIZABLE" to "0x00020003")
        int("GLFW_VISIBLE" to "0x00020004")
        int("GLFW_DECORATED" to "0x00020005")
        int("GLFW_AUTO_ICONIFY" to "0x00020006")
        int("GLFW_FLOATING" to "0x00020007")
        int("GLFW_MAXIMIZED" to "0x00020008")
        int("GLFW_CENTER_CURSOR" to "0x00020009")
        int("GLFW_TRANSPARENT_FRAMEBUFFER" to "0x0002000A")
        int("GLFW_HOVERED" to "0x0002000B")
        int("GLFW_FOCUS_ON_SHOW" to "0x0002000C")

        int("GLFW_MOUSE_PASSTHROUGH" to "0x0002000D")

        int("GLFW_POSITION_X" to "0x0002000E")
        int("GLFW_POSITION_Y" to "0x0002000F")

        int("GLFW_RED_BITS" to "0x00021001")
        int("GLFW_GREEN_BITS" to "0x00021002")
        int("GLFW_BLUE_BITS" to "0x00021003")
        int("GLFW_ALPHA_BITS" to "0x00021004")
        int("GLFW_DEPTH_BITS" to "0x00021005")
        int("GLFW_STENCIL_BITS" to "0x00021006")
        int("GLFW_ACCUM_RED_BITS" to "0x00021007")
        int("GLFW_ACCUM_GREEN_BITS" to "0x00021008")
        int("GLFW_ACCUM_BLUE_BITS" to "0x00021009")
        int("GLFW_ACCUM_ALPHA_BITS" to "0x0002100A")
        int("GLFW_AUX_BUFFERS" to "0x0002100B")
        int("GLFW_STEREO" to "0x0002100C")
        int("GLFW_SAMPLES" to "0x0002100D")
        int("GLFW_SRGB_CAPABLE" to "0x0002100E")
        int("GLFW_REFRESH_RATE" to "0x0002100F")
        int("GLFW_DOUBLEBUFFER" to "0x00021010")

        int("GLFW_CLIENT_API" to "0x00022001")
        int("GLFW_CONTEXT_VERSION_MAJOR" to "0x00022002")
        int("GLFW_CONTEXT_VERSION_MINOR" to "0x00022003")
        int("GLFW_CONTEXT_REVISION" to "0x00022004")
        int("GLFW_CONTEXT_ROBUSTNESS" to "0x00022005")
        int("GLFW_OPENGL_FORWARD_COMPAT" to "0x00022006")
        int("GLFW_CONTEXT_DEBUG" to "0x00022007")
        int("GLFW_OPENGL_DEBUG_CONTEXT" to "GLFW_CONTEXT_DEBUG")
        int("GLFW_OPENGL_PROFILE" to "0x00022008")
        int("GLFW_CONTEXT_RELEASE_BEHAVIOR" to "0x00022009")
        int("GLFW_CONTEXT_NO_ERROR" to "0x0002200A")
        int("GLFW_CONTEXT_CREATION_API" to "0x0002200B")
        int("GLFW_SCALE_TO_MONITOR" to "0x0002200C")
        int("GLFW_SCALE_FRAMEBUFFER" to "0x0002200D")
        int("GLFW_COCOA_RETINA_FRAMEBUFFER" to "0x00023001")
        int("GLFW_COCOA_FRAME_NAME" to "0x00023002")
        int("GLFW_COCOA_GRAPHICS_SWITCHING" to "0x00023003")
        int("GLFW_X11_CLASS_NAME" to "0x00024001")
        int("GLFW_X11_INSTANCE_NAME" to "0x00024002")
        int("GLFW_WIN32_KEYBOARD_MENU" to "0x00025001")
        int("GLFW_WIN32_SHOWDEFAULT" to "0x00025002")
        int("GLFW_WAYLAND_APP_ID" to "0x00026001")

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

        int {
            "GLFW_ARROW_CURSOR"("0x00036001")
            "GLFW_IBEAM_CURSOR"("0x00036002")
            "GLFW_CROSSHAIR_CURSOR"("0x00036003")
            "GLFW_POINTING_HAND_CURSOR"("0x00036004")
            "GLFW_RESIZE_EW_CURSOR"("0x00036005")
            "GLFW_RESIZE_NS_CURSOR"("0x00036006")
            "GLFW_RESIZE_NWSE_CURSOR"("0x00036007")
            "GLFW_RESIZE_NESW_CURSOR"("0x00036008")
            "GLFW_RESIZE_ALL_CURSOR"("0x00036009")
            "GLFW_NOT_ALLOWED_CURSOR"("0x0003600A")
            "GLFW_HRESIZE_CURSOR"("GLFW_RESIZE_EW_CURSOR")
            "GLFW_VRESIZE_CURSOR"("GLFW_RESIZE_NS_CURSOR")
            "GLFW_HAND_CURSOR"("GLFW_POINTING_HAND_CURSOR")
        }

        int("GLFW_CONNECTED" to "0x00040001")
        int("GLFW_DISCONNECTED" to "0x00040002")

        int("GLFW_JOYSTICK_HAT_BUTTONS" to "0x00050001")
        int("GLFW_ANGLE_PLATFORM_TYPE" to "0x00050002")
        int("GLFW_PLATFORM" to "0x00050003")
        int("GLFW_COCOA_CHDIR_RESOURCES" to "0x00051001")
        int("GLFW_COCOA_MENUBAR" to "0x00051002")
        int("GLFW_X11_XCB_VULKAN_SURFACE" to "0x00052001")
        int("GLFW_WAYLAND_LIBDECOR" to "0x00053001")

        int {
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

        +"glfwInit"(glfw_boolean, entrypoint = "glfwInit", addNow = false).overload()
        "glfwTerminate"(void, entrypoint = "glfwTerminate")
        "glfwInitHint"(void, int("hint"), int("value"), entrypoint = "glfwInitHint")
        +"glfwInitAllocator"(void, const_GLFWallocator_ptr("allocator"), entrypoint = "glfwInitAllocator").overload()
        "glfwInitVulkanLoader"(
            void,
            (address c "PFN_vkGetInstanceProcAddr")("loader"),
            entrypoint = "glfwInitVulkanLoader"
        )
        +"glfwGetVersion"(
            void,
            int_ptr("major").ref(),
            int_ptr("minor").ref(),
            int_ptr("rev").ref(),
            entrypoint = "glfwGetVersion"
        ).overload()
        +"glfwGetVersionString_"(
            const_char_ptr,
            entrypoint = "glfwGetVersionString"
        ).overload(name = "glfwGetVersionString")
        +"glfwGetError"(
            int,
            (string_u8_array c "const char**")("description").ref(),
            entrypoint = "glfwGetError"
        ).overload()
        +"glfwSetErrorCallback"(
            address c "GLFWerrorfun",
            GLFWerrorfun("callback"),
            entrypoint = "glfwSetErrorCallback"
        ).callbackOverload("Arena.global()")
        "glfwGetPlatform"(int, entrypoint = "glfwGetPlatform")
        +"glfwPlatformSupported"(
            glfw_boolean,
            int("platform"),
            entrypoint = "glfwPlatformSupported",
            addNow = false
        ).overload()

        //region Monitor
        "glfwGetMonitors"((address c "GLFWmonitor**"), int_ptr("count").ref(), entrypoint = "glfwGetMonitors")
        "glfwGetPrimaryMonitor"(GLFWmonitor_ptr, entrypoint = "glfwGetPrimaryMonitor")
        +"glfwGetMonitorPos"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            entrypoint = "glfwGetMonitorPos"
        ).overload()
        +"glfwGetMonitorWorkarea"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetMonitorWorkarea"
        ).overload()
        +"glfwGetMonitorPhysicalSize"(
            void,
            GLFWmonitor_ptr("monitor"),
            int_ptr("widthMM").ref(),
            int_ptr("heightMM").ref(),
            entrypoint = "glfwGetMonitorPhysicalSize"
        ).overload()
        +"glfwGetMonitorContentScale"(
            void,
            GLFWmonitor_ptr("monitor"),
            float_ptr("xscale").ref(),
            float_ptr("yscale").ref(),
            entrypoint = "glfwGetMonitorContentScale"
        ).overload()
        +"glfwGetMonitorName_"(const_char_ptr, GLFWmonitor_ptr("monitor"), entrypoint = "glfwGetMonitorName").overload(
            name = "glfwGetMonitorName"
        )
        "glfwSetMonitorUserPointer"(
            void,
            GLFWmonitor_ptr("monitor"),
            void_ptr("pointer"),
            entrypoint = "glfwSetMonitorUserPointer"
        )
        "glfwGetMonitorUserPointer"(void_ptr, GLFWmonitor_ptr("monitor"), entrypoint = "glfwGetMonitorUserPointer")
        +"glfwSetMonitorCallback"(
            address c "GLFWmonitorfun",
            GLFWmonitorfun("callback"),
            entrypoint = "glfwSetMonitorCallback"
        ).callbackOverload("Arena.global()")
        //endregion

        "glfwGetVideoModes"(
            address c "const GLFWvidmode*",
            GLFWmonitor_ptr("monitor"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetVideoModes"
        )
        +"glfwGetVideoMode_"(
            const_GLFWvidmode_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetVideoMode"
        ).overload(name = "glfwGetVideoMode")
        "glfwSetGamma"(void, GLFWmonitor_ptr("monitor"), float("gamma"), entrypoint = "glfwSetGamma")
        +"glfwGetGammaRamp_"(
            const_GLFWgammaramp_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetGammaRamp"
        ).overload(name = "glfwGetGammaRamp")
        +"glfwSetGammaRamp"(
            void,
            GLFWmonitor_ptr("monitor"),
            const_GLFWgammaramp_ptr("ramp"),
            entrypoint = "glfwSetGammaRamp"
        ).overload()
        "glfwDefaultWindowHints"(void, entrypoint = "glfwDefaultWindowHints")
        "glfwWindowHint"(void, int("hint"), int("value"), entrypoint = "glfwWindowHint")
        +"glfwWindowHintString"(
            void,
            int("hint"),
            const_char_ptr("value"),
            entrypoint = "glfwWindowHintString"
        ).overload()
        +"glfwCreateWindow"(
            GLFWwindow_ptr,
            int("width"),
            int("height"),
            const_char_ptr("title"),
            GLFWmonitor_ptr("monitor"),
            GLFWwindow_ptr("share"),
            entrypoint = "glfwCreateWindow"
        ).overload()
        "glfwDestroyWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwDestroyWindow")
        +"glfwWindowShouldClose"(
            glfw_boolean,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwWindowShouldClose",
            addNow = false
        ).overload()
        +"glfwSetWindowShouldClose"(
            void,
            GLFWwindow_ptr("window"),
            glfw_boolean("value"),
            entrypoint = "glfwSetWindowShouldClose",
            addNow = false
        ).overload()
        +"glfwGetWindowTitle_"(const_char_ptr, GLFWwindow_ptr("window"), entrypoint = "glfwGetWindowTitle").overload(
            name = "glfwGetWindowTitle"
        )
        +"glfwSetWindowTitle"(
            void,
            GLFWwindow_ptr("window"),
            const_char_ptr("title"),
            entrypoint = "glfwSetWindowTitle"
        ).overload()
        +"glfwSetWindowIcon"(
            void,
            GLFWwindow_ptr("window"),
            int("count"),
            const_GLFWimage_ptr("images"),
            entrypoint = "glfwSetWindowIcon"
        ).overload()
        +"glfwGetWindowPos"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("xpos").ref(),
            int_ptr("ypos").ref(),
            entrypoint = "glfwGetWindowPos"
        ).overload()
        "glfwSetWindowPos"(void, GLFWwindow_ptr("window"), int("xpos"), int("ypos"), entrypoint = "glfwSetWindowPos")
        +"glfwGetWindowSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetWindowSize"
        ).overload()
        "glfwSetWindowSizeLimits"(
            void,
            GLFWwindow_ptr("window"),
            int("minwidth"),
            int("minheight"),
            int("maxwidth"),
            int("maxheight"),
            entrypoint = "glfwSetWindowSizeLimits"
        )
        "glfwSetWindowAspectRatio"(
            void,
            GLFWwindow_ptr("window"),
            int("numer"),
            int("denom"),
            entrypoint = "glfwSetWindowAspectRatio"
        )
        "glfwSetWindowSize"(
            void,
            GLFWwindow_ptr("window"),
            int("width"),
            int("height"),
            entrypoint = "glfwSetWindowSize"
        )
        +"glfwGetFramebufferSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            entrypoint = "glfwGetFramebufferSize"
        ).overload()
        +"glfwGetWindowFrameSize"(
            void,
            GLFWwindow_ptr("window"),
            int_ptr("left").ref(),
            int_ptr("top").ref(),
            int_ptr("right").ref(),
            int_ptr("bottom").ref(),
            entrypoint = "glfwGetWindowFrameSize"
        ).overload()
        +"glfwGetWindowContentScale"(
            void,
            GLFWwindow_ptr("window"),
            float_ptr("xscale").ref(),
            float_ptr("yscale").ref(),
            entrypoint = "glfwGetWindowContentScale"
        ).overload()
        "glfwGetWindowOpacity"(float, GLFWwindow_ptr("window"), entrypoint = "glfwGetWindowOpacity")
        "glfwSetWindowOpacity"(void, GLFWwindow_ptr("window"), float("opacity"), entrypoint = "glfwSetWindowOpacity")
        "glfwIconifyWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwIconifyWindow")
        "glfwRestoreWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwRestoreWindow")
        "glfwMaximizeWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwMaximizeWindow")
        "glfwShowWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwShowWindow")
        "glfwHideWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwHideWindow")
        "glfwFocusWindow"(void, GLFWwindow_ptr("window"), entrypoint = "glfwFocusWindow")
        "glfwRequestWindowAttention"(void, GLFWwindow_ptr("window"), entrypoint = "glfwRequestWindowAttention")
        "glfwGetWindowMonitor"(GLFWmonitor_ptr, GLFWwindow_ptr("window"), entrypoint = "glfwGetWindowMonitor")
        "glfwSetWindowMonitor"(
            void,
            GLFWwindow_ptr("window"),
            GLFWmonitor_ptr("monitor"),
            int("xpos"),
            int("ypos"),
            int("width"),
            int("height"),
            int("refreshRate"),
            entrypoint = "glfwSetWindowMonitor"
        )
        "glfwGetWindowAttrib"(int, GLFWwindow_ptr("window"), int("attrib"), entrypoint = "glfwGetWindowAttrib")
        "glfwSetWindowAttrib"(
            void,
            GLFWwindow_ptr("window"),
            int("attrib"),
            int("value"),
            entrypoint = "glfwSetWindowAttrib"
        )
        "glfwSetWindowUserPointer"(
            void,
            GLFWwindow_ptr("window"),
            void_ptr("pointer"),
            entrypoint = "glfwSetWindowUserPointer"
        )
        "glfwGetWindowUserPointer"(void_ptr, GLFWwindow_ptr("window"), entrypoint = "glfwGetWindowUserPointer")

        //region Callback 1
        windowCallback("glfwSetWindowPosCallback", GLFWwindowposfun)
        windowCallback("glfwSetWindowSizeCallback", GLFWwindowsizefun)
        windowCallback("glfwSetWindowCloseCallback", GLFWwindowclosefun)
        windowCallback("glfwSetWindowRefreshCallback", GLFWwindowrefreshfun)
        windowCallback("glfwSetWindowFocusCallback", GLFWwindowfocusfun)
        windowCallback("glfwSetWindowIconifyCallback", GLFWwindowiconifyfun)
        windowCallback("glfwSetWindowMaximizeCallback", GLFWwindowmaximizefun)
        windowCallback("glfwSetFramebufferSizeCallback", GLFWframebuffersizefun)
        windowCallback("glfwSetWindowContentScaleCallback", GLFWwindowcontentscalefun)
        //endregion

        "glfwPollEvents"(void, entrypoint = "glfwPollEvents")
        "glfwWaitEvents"(void, entrypoint = "glfwWaitEvents")
        "glfwWaitEventsTimeout"(void, double("timeout"), entrypoint = "glfwWaitEventsTimeout")
        "glfwPostEmptyEvent"(void, entrypoint = "glfwPostEmptyEvent")
        "glfwGetInputMode"(int, GLFWwindow_ptr("window"), int("mode"), entrypoint = "glfwGetInputMode")
        "glfwSetInputMode"(void, GLFWwindow_ptr("window"), int("mode"), int("value"), entrypoint = "glfwSetInputMode")
        +"glfwRawMouseMotionSupported"(
            glfw_boolean,
            entrypoint = "glfwRawMouseMotionSupported",
            addNow = false
        ).overload()
        +"glfwGetKeyName_"(
            const_char_ptr,
            int("key"),
            int("scancode"),
            entrypoint = "glfwGetKeyName"
        ).overload(name = "glfwGetKeyName")
        "glfwGetKeyScancode"(int, int("key"), entrypoint = "glfwGetKeyScancode")
        "glfwGetKey"(int, GLFWwindow_ptr("window"), int("key"), entrypoint = "glfwGetKey")
        "glfwGetMouseButton"(int, GLFWwindow_ptr("window"), int("button"), entrypoint = "glfwGetMouseButton")
        +"glfwGetCursorPos"(
            void,
            GLFWwindow_ptr("window"),
            double_ptr("xpos").ref(),
            double_ptr("ypos").ref(),
            entrypoint = "glfwGetCursorPos"
        ).overload()
        "glfwSetCursorPos"(
            void,
            GLFWwindow_ptr("window"),
            double("xpos"),
            double("ypos"),
            entrypoint = "glfwSetCursorPos"
        )
        "glfwCreateCursor"(
            GLFWcursor_ptr,
            const_GLFWimage_ptr("image"),
            int("xhot"),
            int("yhot"),
            entrypoint = "glfwCreateCursor"
        )
        "glfwCreateStandardCursor"(GLFWcursor_ptr, int("shape"), entrypoint = "glfwCreateStandardCursor")
        "glfwDestroyCursor"(void, GLFWcursor_ptr("cursor"), entrypoint = "glfwDestroyCursor")
        "glfwSetCursor"(void, GLFWwindow_ptr("window"), GLFWcursor_ptr("cursor"), entrypoint = "glfwSetCursor")

        //region Callback 2
        windowCallback("glfwSetKeyCallback", GLFWkeyfun)
        windowCallback("glfwSetCharCallback", GLFWcharfun)
        windowCallback("glfwSetMouseButtonCallback", GLFWmousebuttonfun)
        windowCallback("glfwSetCursorPosCallback", GLFWcursorposfun)
        windowCallback("glfwSetCursorEnterCallback", GLFWcursorenterfun)
        windowCallback("glfwSetScrollCallback", GLFWscrollfun)
        windowCallback("glfwSetDropCallback", GLFWdropfun)
        //endregion

        +"glfwJoystickPresent"(glfw_boolean, int("jid"), entrypoint = "glfwJoystickPresent", addNow = false).overload()
        "glfwGetJoystickAxes"(
            jfloat_array c "const float*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickAxes"
        )
        "glfwGetJoystickButtons"(
            address c "const unsigned char*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickButtons"
        )
        "glfwGetJoystickHats"(
            address c "const unsigned char*",
            int("jid"),
            int_ptr("count").ref(),
            entrypoint = "glfwGetJoystickHats"
        )
        +"glfwGetJoystickName_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetJoystickName"
        ).overload(name = "glfwGetJoystickName")
        +"glfwGetJoystickGUID_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetJoystickGUID"
        ).overload(name = "glfwGetJoystickGUID")
        "glfwSetJoystickUserPointer"(void, int("jid"), void_ptr("pointer"), entrypoint = "glfwSetJoystickUserPointer")
        "glfwGetJoystickUserPointer"(void_ptr, int("jid"), entrypoint = "glfwGetJoystickUserPointer")
        +"glfwJoystickIsGamepad"(
            glfw_boolean,
            int("jid"),
            entrypoint = "glfwJoystickIsGamepad",
            addNow = false
        ).overload()
        +"glfwSetJoystickCallback"(
            address c "GLFWjoystickfun",
            GLFWjoystickfun("callback"),
            entrypoint = "glfwSetJoystickCallback"
        ).callbackOverload("Arena.global()")
        +(+"glfwUpdateGamepadMappings"(
            glfw_boolean,
            (address.copy(
                javaType = MemorySegment_,
                cType = const_char_ptr.cType,
                layout = const_char_ptr.layout
            ))("string"),
            entrypoint = "glfwUpdateGamepadMappings",
            addNow = false,
        ).overload()).overload(parameters = listOf(const_char_ptr("string")))
        +"glfwGetGamepadName_"(
            const_char_ptr,
            int("jid"),
            entrypoint = "glfwGetGamepadName"
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
            addNow = false
        ).overload()).overload(parameters = listOf(int("jid"), GLFWgamepadstate_ptr("state")))
        +"glfwSetClipboardString"(
            void,
            GLFWwindow_ptr("window"),
            const_char_ptr("string"),
            entrypoint = "glfwSetClipboardString"
        ).overload()
        +"glfwGetClipboardString_"(
            const_char_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetClipboardString"
        ).overload(name = "glfwGetClipboardString")
        "glfwGetTime"(double, entrypoint = "glfwGetTime")
        "glfwSetTime"(void, double("time"), entrypoint = "glfwSetTime")
        "glfwGetTimerValue"(uint64_t, entrypoint = "glfwGetTimerValue")
        "glfwGetTimerFrequency"(uint64_t, entrypoint = "glfwGetTimerFrequency")
        "glfwMakeContextCurrent"(void, GLFWwindow_ptr("window"), entrypoint = "glfwMakeContextCurrent")
        "glfwGetCurrentContext"(GLFWwindow_ptr, entrypoint = "glfwGetCurrentContext")
        "glfwSwapBuffers"(void, GLFWwindow_ptr("window"), entrypoint = "glfwSwapBuffers")
        "glfwSwapInterval"(void, int("interval"), entrypoint = "glfwSwapInterval")
        +(+"glfwExtensionSupported"(
            glfw_boolean,
            address.copy(
                javaType = MemorySegment_,
                cType = const_char_ptr.cType,
                layout = const_char_ptr.layout
            )("extension"),
            entrypoint = "glfwExtensionSupported",
            addNow = false
        ).overload()).overload(parameters = listOf(const_char_ptr("extension")))
        +"glfwGetProcAddress"(
            address c "GLFWglproc",
            const_char_ptr("procname"),
            entrypoint = "glfwGetProcAddress"
        ).overload()
        +"glfwVulkanSupported"(glfw_boolean, entrypoint = "glfwVulkanSupported", addNow = false).overload()
        "glfwGetRequiredInstanceExtensions"(
            address c "const char**",
            (address c "uint32_t*")("count").ref(),
            entrypoint = "glfwGetRequiredInstanceExtensions"
        )

        val VkInstance = address c "VkInstance"
        val VkPhysicalDevice = address c "VkPhysicalDevice"
        val const_VkAllocationCallbacks_ptr = address c "const VkAllocationCallbacks*"
        val VkSurfaceKHR_ptr = address c "VkSurfaceKHR*"
        val VkResult = int c "VkResult"

        +"glfwGetInstanceProcAddress"(
            address c "GLFWvkproc",
            VkInstance("instance"),
            const_char_ptr("procname"),
            entrypoint = "glfwGetInstanceProcAddress"
        ).overload()
        +"glfwGetPhysicalDevicePresentationSupport"(
            glfw_boolean,
            VkInstance("instance"),
            VkPhysicalDevice("device"),
            uint32_t("queuefamily"),
            entrypoint = "glfwGetPhysicalDevicePresentationSupport",
            addNow = false
        ).overload()
        "glfwCreateWindowSurface"(
            VkResult,
            VkInstance("instance"),
            GLFWwindow_ptr("window"),
            const_VkAllocationCallbacks_ptr("allocator"),
            VkSurfaceKHR_ptr("surface").ref(),
            entrypoint = "glfwCreateWindowSurface"
        )

        //endregion
    }

    StaticDowncall(glfwPackage, "GLFWNative", symbolLookup = glfwLookup) {
        //region WIN32
        val HWND = address c "HWND"

        +"glfwGetWin32Adapter_"(
            const_char_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWin32Adapter",
            optional = true
        ).overload(name = "glfwGetWin32Adapter")
        +"glfwGetWin32Monitor_"(
            const_char_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWin32Monitor",
            optional = true
        ).overload(name = "glfwGetWin32Monitor")
        "glfwGetWin32Window"(HWND, GLFWwindow_ptr("window"), entrypoint = "glfwGetWin32Window", optional = true)
        //endregion

        //region WGL
        val HGLRC = address c "HGLRC"
        "glfwGetWGLContext"(HGLRC, GLFWwindow_ptr("window"), entrypoint = "glfwGetWGLContext", optional = true)
        //endregion

        //region COCOA
        val CGDirectDisplayID = int c "CGDirectDisplayID"
        val id = address c "id"

        "glfwGetCocoaMonitor"(
            CGDirectDisplayID,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetCocoaMonitor",
            optional = true
        )
        "glfwGetCocoaWindow"(id, GLFWwindow_ptr("window"), entrypoint = "glfwGetCocoaWindow", optional = true)
        "glfwGetCocoaView"(id, GLFWwindow_ptr("window"), entrypoint = "glfwGetCocoaView", optional = true)
        //endregion

        //region NSGL
        "glfwGetNSGLContext"(id, GLFWwindow_ptr("window"), entrypoint = "glfwGetNSGLContext", optional = true)
        //endregion

        //region X11
        val Display_ptr = address c "Display*"
        val RRCrtc = jlong c "RRCrtc"
        val RROutput = jlong c "RROutput"
        val Window = jlong c "Window"

        "glfwGetX11Display"(Display_ptr, entrypoint = "glfwGetX11Display", optional = true)
        "glfwGetX11Adapter"(RRCrtc, GLFWmonitor_ptr("monitor"), entrypoint = "glfwGetX11Adapter", optional = true)
        "glfwGetX11Monitor"(RROutput, GLFWmonitor_ptr("monitor"), entrypoint = "glfwGetX11Monitor", optional = true)
        "glfwGetX11Window"(Window, GLFWwindow_ptr("window"), entrypoint = "glfwGetX11Window", optional = true)
        +"glfwSetX11SelectionString"(
            void,
            const_char_ptr("string"),
            entrypoint = "glfwSetX11SelectionString",
            optional = true
        ).overload()
        +"glfwGetX11SelectionString_"(
            const_char_ptr,
            entrypoint = "glfwGetX11SelectionString",
            optional = true
        ).overload(name = "glfwGetX11SelectionString")
        //endregion

        //region GLX
        val GLXContext = address c "GLXContext"
        val GLXWindow = jlong c "GLXWindow"

        "glfwGetGLXContext"(GLXContext, GLFWwindow_ptr("window"), entrypoint = "glfwGetGLXContext", optional = true)
        "glfwGetGLXWindow"(GLXWindow, GLFWwindow_ptr("window"), entrypoint = "glfwGetGLXWindow", optional = true)
        //endregion

        //region WAYLAND
        val struct_wl_display_ptr = address c "struct wl_display*"
        val struct_wl_output_ptr = address c "struct wl_output*"
        val struct_wl_surface_ptr = address c "struct wl_surface*"

        "glfwGetWaylandDisplay"(struct_wl_display_ptr, entrypoint = "glfwGetWaylandDisplay", optional = true)
        "glfwGetWaylandMonitor"(
            struct_wl_output_ptr,
            GLFWmonitor_ptr("monitor"),
            entrypoint = "glfwGetWaylandMonitor",
            optional = true
        )
        "glfwGetWaylandWindow"(
            struct_wl_surface_ptr,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetWaylandWindow",
            optional = true
        )
        //endregion

        //region EGL
        val EGLDisplay = address c "EGLDisplay"
        val EGLContext = address c "EGLContext"
        val EGLSurface = address c "EGLSurface"

        "glfwGetEGLDisplay"(EGLDisplay, entrypoint = "glfwGetEGLDisplay", optional = true)
        "glfwGetEGLContext"(EGLContext, GLFWwindow_ptr("window"), entrypoint = "glfwGetEGLContext", optional = true)
        "glfwGetEGLSurface"(EGLSurface, GLFWwindow_ptr("window"), entrypoint = "glfwGetEGLSurface", optional = true)
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
            addNow = false,
            optional = true
        ).overload()
        +"glfwGetOSMesaDepthBuffer"(
            glfw_boolean,
            GLFWwindow_ptr("window"),
            int_ptr_osmesa("width").ref(),
            int_ptr_osmesa("height").ref(),
            int_ptr_osmesa("bytesPerValue").ref(),
            void_ptr_ptr_osmesa("buffer").ref(),
            entrypoint = "glfwGetOSMesaDepthBuffer",
            addNow = false,
            optional = true
        ).overload()
        "glfwGetOSMesaContext"(
            OSMesaContext,
            GLFWwindow_ptr("window"),
            entrypoint = "glfwGetOSMesaContext",
            optional = true
        )
        //endregion
    }

    writeNativeImageRegistration(glfwPackage)
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
    callbackType: CustomTypeSpec
) {
    +name(
        address c callbackType.cType,
        GLFWwindow_ptr("window"),
        callbackType("callback"),
        entrypoint = name
    ).windowCallbackOverload()
}
