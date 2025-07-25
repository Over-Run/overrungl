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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// The GLFW binding.
///
/// See the [online documentation](https://www.glfw.org/docs/latest/).
///
/// @author squid233
/// @since 0.1.0
public final class GLFW {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int GLFW_VERSION_MAJOR = 3;
    public static final int GLFW_VERSION_MINOR = 5;
    public static final int GLFW_VERSION_REVISION = 0;
    public static final int GLFW_TRUE = 1;
    public static final int GLFW_FALSE = 0;
    public static final int GLFW_RELEASE = 0;
    public static final int GLFW_PRESS = 1;
    public static final int GLFW_REPEAT = 2;
    public static final int GLFW_HAT_CENTERED = 0;
    public static final int GLFW_HAT_UP = 1;
    public static final int GLFW_HAT_RIGHT = 2;
    public static final int GLFW_HAT_DOWN = 4;
    public static final int GLFW_HAT_LEFT = 8;
    public static final int GLFW_HAT_RIGHT_UP = (GLFW_HAT_RIGHT | GLFW_HAT_UP);
    public static final int GLFW_HAT_RIGHT_DOWN = (GLFW_HAT_RIGHT | GLFW_HAT_DOWN);
    public static final int GLFW_HAT_LEFT_UP = (GLFW_HAT_LEFT  | GLFW_HAT_UP);
    public static final int GLFW_HAT_LEFT_DOWN = (GLFW_HAT_LEFT  | GLFW_HAT_DOWN);
    public static final int GLFW_KEY_UNKNOWN = -1;
    public static final int GLFW_KEY_SPACE = 32;
    public static final int GLFW_KEY_APOSTROPHE = 39;
    public static final int GLFW_KEY_COMMA = 44;
    public static final int GLFW_KEY_MINUS = 45;
    public static final int GLFW_KEY_PERIOD = 46;
    public static final int GLFW_KEY_SLASH = 47;
    public static final int GLFW_KEY_0 = 48;
    public static final int GLFW_KEY_1 = 49;
    public static final int GLFW_KEY_2 = 50;
    public static final int GLFW_KEY_3 = 51;
    public static final int GLFW_KEY_4 = 52;
    public static final int GLFW_KEY_5 = 53;
    public static final int GLFW_KEY_6 = 54;
    public static final int GLFW_KEY_7 = 55;
    public static final int GLFW_KEY_8 = 56;
    public static final int GLFW_KEY_9 = 57;
    public static final int GLFW_KEY_SEMICOLON = 59;
    public static final int GLFW_KEY_EQUAL = 61;
    public static final int GLFW_KEY_A = 65;
    public static final int GLFW_KEY_B = 66;
    public static final int GLFW_KEY_C = 67;
    public static final int GLFW_KEY_D = 68;
    public static final int GLFW_KEY_E = 69;
    public static final int GLFW_KEY_F = 70;
    public static final int GLFW_KEY_G = 71;
    public static final int GLFW_KEY_H = 72;
    public static final int GLFW_KEY_I = 73;
    public static final int GLFW_KEY_J = 74;
    public static final int GLFW_KEY_K = 75;
    public static final int GLFW_KEY_L = 76;
    public static final int GLFW_KEY_M = 77;
    public static final int GLFW_KEY_N = 78;
    public static final int GLFW_KEY_O = 79;
    public static final int GLFW_KEY_P = 80;
    public static final int GLFW_KEY_Q = 81;
    public static final int GLFW_KEY_R = 82;
    public static final int GLFW_KEY_S = 83;
    public static final int GLFW_KEY_T = 84;
    public static final int GLFW_KEY_U = 85;
    public static final int GLFW_KEY_V = 86;
    public static final int GLFW_KEY_W = 87;
    public static final int GLFW_KEY_X = 88;
    public static final int GLFW_KEY_Y = 89;
    public static final int GLFW_KEY_Z = 90;
    public static final int GLFW_KEY_LEFT_BRACKET = 91;
    public static final int GLFW_KEY_BACKSLASH = 92;
    public static final int GLFW_KEY_RIGHT_BRACKET = 93;
    public static final int GLFW_KEY_GRAVE_ACCENT = 96;
    public static final int GLFW_KEY_WORLD_1 = 161;
    public static final int GLFW_KEY_WORLD_2 = 162;
    public static final int GLFW_KEY_ESCAPE = 256;
    public static final int GLFW_KEY_ENTER = 257;
    public static final int GLFW_KEY_TAB = 258;
    public static final int GLFW_KEY_BACKSPACE = 259;
    public static final int GLFW_KEY_INSERT = 260;
    public static final int GLFW_KEY_DELETE = 261;
    public static final int GLFW_KEY_RIGHT = 262;
    public static final int GLFW_KEY_LEFT = 263;
    public static final int GLFW_KEY_DOWN = 264;
    public static final int GLFW_KEY_UP = 265;
    public static final int GLFW_KEY_PAGE_UP = 266;
    public static final int GLFW_KEY_PAGE_DOWN = 267;
    public static final int GLFW_KEY_HOME = 268;
    public static final int GLFW_KEY_END = 269;
    public static final int GLFW_KEY_CAPS_LOCK = 280;
    public static final int GLFW_KEY_SCROLL_LOCK = 281;
    public static final int GLFW_KEY_NUM_LOCK = 282;
    public static final int GLFW_KEY_PRINT_SCREEN = 283;
    public static final int GLFW_KEY_PAUSE = 284;
    public static final int GLFW_KEY_F1 = 290;
    public static final int GLFW_KEY_F2 = 291;
    public static final int GLFW_KEY_F3 = 292;
    public static final int GLFW_KEY_F4 = 293;
    public static final int GLFW_KEY_F5 = 294;
    public static final int GLFW_KEY_F6 = 295;
    public static final int GLFW_KEY_F7 = 296;
    public static final int GLFW_KEY_F8 = 297;
    public static final int GLFW_KEY_F9 = 298;
    public static final int GLFW_KEY_F10 = 299;
    public static final int GLFW_KEY_F11 = 300;
    public static final int GLFW_KEY_F12 = 301;
    public static final int GLFW_KEY_F13 = 302;
    public static final int GLFW_KEY_F14 = 303;
    public static final int GLFW_KEY_F15 = 304;
    public static final int GLFW_KEY_F16 = 305;
    public static final int GLFW_KEY_F17 = 306;
    public static final int GLFW_KEY_F18 = 307;
    public static final int GLFW_KEY_F19 = 308;
    public static final int GLFW_KEY_F20 = 309;
    public static final int GLFW_KEY_F21 = 310;
    public static final int GLFW_KEY_F22 = 311;
    public static final int GLFW_KEY_F23 = 312;
    public static final int GLFW_KEY_F24 = 313;
    public static final int GLFW_KEY_F25 = 314;
    public static final int GLFW_KEY_KP_0 = 320;
    public static final int GLFW_KEY_KP_1 = 321;
    public static final int GLFW_KEY_KP_2 = 322;
    public static final int GLFW_KEY_KP_3 = 323;
    public static final int GLFW_KEY_KP_4 = 324;
    public static final int GLFW_KEY_KP_5 = 325;
    public static final int GLFW_KEY_KP_6 = 326;
    public static final int GLFW_KEY_KP_7 = 327;
    public static final int GLFW_KEY_KP_8 = 328;
    public static final int GLFW_KEY_KP_9 = 329;
    public static final int GLFW_KEY_KP_DECIMAL = 330;
    public static final int GLFW_KEY_KP_DIVIDE = 331;
    public static final int GLFW_KEY_KP_MULTIPLY = 332;
    public static final int GLFW_KEY_KP_SUBTRACT = 333;
    public static final int GLFW_KEY_KP_ADD = 334;
    public static final int GLFW_KEY_KP_ENTER = 335;
    public static final int GLFW_KEY_KP_EQUAL = 336;
    public static final int GLFW_KEY_LEFT_SHIFT = 340;
    public static final int GLFW_KEY_LEFT_CONTROL = 341;
    public static final int GLFW_KEY_LEFT_ALT = 342;
    public static final int GLFW_KEY_LEFT_SUPER = 343;
    public static final int GLFW_KEY_RIGHT_SHIFT = 344;
    public static final int GLFW_KEY_RIGHT_CONTROL = 345;
    public static final int GLFW_KEY_RIGHT_ALT = 346;
    public static final int GLFW_KEY_RIGHT_SUPER = 347;
    public static final int GLFW_KEY_MENU = 348;
    public static final int GLFW_KEY_LAST = GLFW_KEY_MENU;
    public static final int GLFW_MOD_SHIFT = 0x0001;
    public static final int GLFW_MOD_CONTROL = 0x0002;
    public static final int GLFW_MOD_ALT = 0x0004;
    public static final int GLFW_MOD_SUPER = 0x0008;
    public static final int GLFW_MOD_CAPS_LOCK = 0x0010;
    public static final int GLFW_MOD_NUM_LOCK = 0x0020;
    public static final int GLFW_MOUSE_BUTTON_1 = 0;
    public static final int GLFW_MOUSE_BUTTON_2 = 1;
    public static final int GLFW_MOUSE_BUTTON_3 = 2;
    public static final int GLFW_MOUSE_BUTTON_4 = 3;
    public static final int GLFW_MOUSE_BUTTON_5 = 4;
    public static final int GLFW_MOUSE_BUTTON_6 = 5;
    public static final int GLFW_MOUSE_BUTTON_7 = 6;
    public static final int GLFW_MOUSE_BUTTON_8 = 7;
    public static final int GLFW_MOUSE_BUTTON_LAST = GLFW_MOUSE_BUTTON_8;
    public static final int GLFW_MOUSE_BUTTON_LEFT = GLFW_MOUSE_BUTTON_1;
    public static final int GLFW_MOUSE_BUTTON_RIGHT = GLFW_MOUSE_BUTTON_2;
    public static final int GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;
    public static final int GLFW_JOYSTICK_1 = 0;
    public static final int GLFW_JOYSTICK_2 = 1;
    public static final int GLFW_JOYSTICK_3 = 2;
    public static final int GLFW_JOYSTICK_4 = 3;
    public static final int GLFW_JOYSTICK_5 = 4;
    public static final int GLFW_JOYSTICK_6 = 5;
    public static final int GLFW_JOYSTICK_7 = 6;
    public static final int GLFW_JOYSTICK_8 = 7;
    public static final int GLFW_JOYSTICK_9 = 8;
    public static final int GLFW_JOYSTICK_10 = 9;
    public static final int GLFW_JOYSTICK_11 = 10;
    public static final int GLFW_JOYSTICK_12 = 11;
    public static final int GLFW_JOYSTICK_13 = 12;
    public static final int GLFW_JOYSTICK_14 = 13;
    public static final int GLFW_JOYSTICK_15 = 14;
    public static final int GLFW_JOYSTICK_16 = 15;
    public static final int GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;
    public static final int GLFW_GAMEPAD_BUTTON_A = 0;
    public static final int GLFW_GAMEPAD_BUTTON_B = 1;
    public static final int GLFW_GAMEPAD_BUTTON_X = 2;
    public static final int GLFW_GAMEPAD_BUTTON_Y = 3;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_BUMPER = 4;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5;
    public static final int GLFW_GAMEPAD_BUTTON_BACK = 6;
    public static final int GLFW_GAMEPAD_BUTTON_START = 7;
    public static final int GLFW_GAMEPAD_BUTTON_GUIDE = 8;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_THUMB = 9;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_THUMB = 10;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_UP = 11;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_RIGHT = 12;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_DOWN = 13;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_LEFT = 14;
    public static final int GLFW_GAMEPAD_BUTTON_LAST = GLFW_GAMEPAD_BUTTON_DPAD_LEFT;
    public static final int GLFW_GAMEPAD_BUTTON_CROSS = GLFW_GAMEPAD_BUTTON_A;
    public static final int GLFW_GAMEPAD_BUTTON_CIRCLE = GLFW_GAMEPAD_BUTTON_B;
    public static final int GLFW_GAMEPAD_BUTTON_SQUARE = GLFW_GAMEPAD_BUTTON_X;
    public static final int GLFW_GAMEPAD_BUTTON_TRIANGLE = GLFW_GAMEPAD_BUTTON_Y;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_X = 0;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_Y = 1;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_X = 2;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_Y = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int GLFW_GAMEPAD_AXIS_LAST = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;
    public static final int GLFW_NO_ERROR = 0;
    public static final int GLFW_NOT_INITIALIZED = 0x00010001;
    public static final int GLFW_NO_CURRENT_CONTEXT = 0x00010002;
    public static final int GLFW_INVALID_ENUM = 0x00010003;
    public static final int GLFW_INVALID_VALUE = 0x00010004;
    public static final int GLFW_OUT_OF_MEMORY = 0x00010005;
    public static final int GLFW_API_UNAVAILABLE = 0x00010006;
    public static final int GLFW_VERSION_UNAVAILABLE = 0x00010007;
    public static final int GLFW_PLATFORM_ERROR = 0x00010008;
    public static final int GLFW_FORMAT_UNAVAILABLE = 0x00010009;
    public static final int GLFW_NO_WINDOW_CONTEXT = 0x0001000A;
    public static final int GLFW_CURSOR_UNAVAILABLE = 0x0001000B;
    public static final int GLFW_FEATURE_UNAVAILABLE = 0x0001000C;
    public static final int GLFW_FEATURE_UNIMPLEMENTED = 0x0001000D;
    public static final int GLFW_PLATFORM_UNAVAILABLE = 0x0001000E;
    public static final int GLFW_FOCUSED = 0x00020001;
    public static final int GLFW_ICONIFIED = 0x00020002;
    public static final int GLFW_RESIZABLE = 0x00020003;
    public static final int GLFW_VISIBLE = 0x00020004;
    public static final int GLFW_DECORATED = 0x00020005;
    public static final int GLFW_AUTO_ICONIFY = 0x00020006;
    public static final int GLFW_FLOATING = 0x00020007;
    public static final int GLFW_MAXIMIZED = 0x00020008;
    public static final int GLFW_CENTER_CURSOR = 0x00020009;
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;
    public static final int GLFW_HOVERED = 0x0002000B;
    public static final int GLFW_FOCUS_ON_SHOW = 0x0002000C;
    public static final int GLFW_MOUSE_PASSTHROUGH = 0x0002000D;
    public static final int GLFW_POSITION_X = 0x0002000E;
    public static final int GLFW_POSITION_Y = 0x0002000F;
    public static final int GLFW_RED_BITS = 0x00021001;
    public static final int GLFW_GREEN_BITS = 0x00021002;
    public static final int GLFW_BLUE_BITS = 0x00021003;
    public static final int GLFW_ALPHA_BITS = 0x00021004;
    public static final int GLFW_DEPTH_BITS = 0x00021005;
    public static final int GLFW_STENCIL_BITS = 0x00021006;
    public static final int GLFW_ACCUM_RED_BITS = 0x00021007;
    public static final int GLFW_ACCUM_GREEN_BITS = 0x00021008;
    public static final int GLFW_ACCUM_BLUE_BITS = 0x00021009;
    public static final int GLFW_ACCUM_ALPHA_BITS = 0x0002100A;
    public static final int GLFW_AUX_BUFFERS = 0x0002100B;
    public static final int GLFW_STEREO = 0x0002100C;
    public static final int GLFW_SAMPLES = 0x0002100D;
    public static final int GLFW_SRGB_CAPABLE = 0x0002100E;
    public static final int GLFW_REFRESH_RATE = 0x0002100F;
    public static final int GLFW_DOUBLEBUFFER = 0x00021010;
    public static final int GLFW_CLIENT_API = 0x00022001;
    public static final int GLFW_CONTEXT_VERSION_MAJOR = 0x00022002;
    public static final int GLFW_CONTEXT_VERSION_MINOR = 0x00022003;
    public static final int GLFW_CONTEXT_REVISION = 0x00022004;
    public static final int GLFW_CONTEXT_ROBUSTNESS = 0x00022005;
    public static final int GLFW_OPENGL_FORWARD_COMPAT = 0x00022006;
    public static final int GLFW_CONTEXT_DEBUG = 0x00022007;
    public static final int GLFW_OPENGL_DEBUG_CONTEXT = GLFW_CONTEXT_DEBUG;
    public static final int GLFW_OPENGL_PROFILE = 0x00022008;
    public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x00022009;
    public static final int GLFW_CONTEXT_NO_ERROR = 0x0002200A;
    public static final int GLFW_CONTEXT_CREATION_API = 0x0002200B;
    public static final int GLFW_SCALE_TO_MONITOR = 0x0002200C;
    public static final int GLFW_SCALE_FRAMEBUFFER = 0x0002200D;
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x00023001;
    public static final int GLFW_COCOA_FRAME_NAME = 0x00023002;
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x00023003;
    public static final int GLFW_X11_CLASS_NAME = 0x00024001;
    public static final int GLFW_X11_INSTANCE_NAME = 0x00024002;
    public static final int GLFW_WIN32_KEYBOARD_MENU = 0x00025001;
    public static final int GLFW_WIN32_SHOWDEFAULT = 0x00025002;
    public static final int GLFW_WAYLAND_APP_ID = 0x00026001;
    public static final int GLFW_NO_API = 0;
    public static final int GLFW_OPENGL_API = 0x00030001;
    public static final int GLFW_OPENGL_ES_API = 0x00030002;
    public static final int GLFW_NO_ROBUSTNESS = 0;
    public static final int GLFW_NO_RESET_NOTIFICATION = 0x00031001;
    public static final int GLFW_LOSE_CONTEXT_ON_RESET = 0x00031002;
    public static final int GLFW_OPENGL_ANY_PROFILE = 0;
    public static final int GLFW_OPENGL_CORE_PROFILE = 0x00032001;
    public static final int GLFW_OPENGL_COMPAT_PROFILE = 0x00032002;
    public static final int GLFW_CURSOR = 0x00033001;
    public static final int GLFW_STICKY_KEYS = 0x00033002;
    public static final int GLFW_STICKY_MOUSE_BUTTONS = 0x00033003;
    public static final int GLFW_LOCK_KEY_MODS = 0x00033004;
    public static final int GLFW_RAW_MOUSE_MOTION = 0x00033005;
    public static final int GLFW_UNLIMITED_MOUSE_BUTTONS = 0x00033006;
    public static final int GLFW_CURSOR_NORMAL = 0x00034001;
    public static final int GLFW_CURSOR_HIDDEN = 0x00034002;
    public static final int GLFW_CURSOR_DISABLED = 0x00034003;
    public static final int GLFW_CURSOR_CAPTURED = 0x00034004;
    public static final int GLFW_ANY_RELEASE_BEHAVIOR = 0;
    public static final int GLFW_RELEASE_BEHAVIOR_FLUSH = 0x00035001;
    public static final int GLFW_RELEASE_BEHAVIOR_NONE = 0x00035002;
    public static final int GLFW_NATIVE_CONTEXT_API = 0x00036001;
    public static final int GLFW_EGL_CONTEXT_API = 0x00036002;
    public static final int GLFW_OSMESA_CONTEXT_API = 0x00036003;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_NONE = 0x00037001;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGL = 0x00037002;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x00037003;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D9 = 0x00037004;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D11 = 0x00037005;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_VULKAN = 0x00037007;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_METAL = 0x00037008;
    public static final int GLFW_WAYLAND_PREFER_LIBDECOR = 0x00038001;
    public static final int GLFW_WAYLAND_DISABLE_LIBDECOR = 0x00038002;
    public static final int GLFW_ANY_POSITION = 0x80000000;
    public static final int GLFW_ARROW_CURSOR = 0x00036001;
    public static final int GLFW_IBEAM_CURSOR = 0x00036002;
    public static final int GLFW_CROSSHAIR_CURSOR = 0x00036003;
    public static final int GLFW_POINTING_HAND_CURSOR = 0x00036004;
    public static final int GLFW_RESIZE_EW_CURSOR = 0x00036005;
    public static final int GLFW_RESIZE_NS_CURSOR = 0x00036006;
    public static final int GLFW_RESIZE_NWSE_CURSOR = 0x00036007;
    public static final int GLFW_RESIZE_NESW_CURSOR = 0x00036008;
    public static final int GLFW_RESIZE_ALL_CURSOR = 0x00036009;
    public static final int GLFW_NOT_ALLOWED_CURSOR = 0x0003600A;
    public static final int GLFW_HRESIZE_CURSOR = GLFW_RESIZE_EW_CURSOR;
    public static final int GLFW_VRESIZE_CURSOR = GLFW_RESIZE_NS_CURSOR;
    public static final int GLFW_HAND_CURSOR = GLFW_POINTING_HAND_CURSOR;
    public static final int GLFW_CONNECTED = 0x00040001;
    public static final int GLFW_DISCONNECTED = 0x00040002;
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x00050001;
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x00050002;
    public static final int GLFW_PLATFORM = 0x00050003;
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x00051001;
    public static final int GLFW_COCOA_MENUBAR = 0x00051002;
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x00052001;
    public static final int GLFW_WAYLAND_LIBDECOR = 0x00053001;
    public static final int GLFW_ANY_PLATFORM = 0x00060000;
    public static final int GLFW_PLATFORM_WIN32 = 0x00060001;
    public static final int GLFW_PLATFORM_COCOA = 0x00060002;
    public static final int GLFW_PLATFORM_WAYLAND = 0x00060003;
    public static final int GLFW_PLATFORM_X11 = 0x00060004;
    public static final int GLFW_PLATFORM_NULL = 0x00060005;
    public static final int GLFW_DONT_CARE = -1;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwInit`.
        public static final MethodHandle MH_glfwInit = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwTerminate`.
        public static final MethodHandle MH_glfwTerminate = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwInitHint`.
        public static final MethodHandle MH_glfwInitHint = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwInitAllocator`.
        public static final MethodHandle MH_glfwInitAllocator = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwInitVulkanLoader`.
        public static final MethodHandle MH_glfwInitVulkanLoader = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersion`.
        public static final MethodHandle MH_glfwGetVersion = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersionString`.
        public static final MethodHandle MH_glfwGetVersionString = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetError`.
        public static final MethodHandle MH_glfwGetError = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetErrorCallback`.
        public static final MethodHandle MH_glfwSetErrorCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPlatform`.
        public static final MethodHandle MH_glfwGetPlatform = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwPlatformSupported`.
        public static final MethodHandle MH_glfwPlatformSupported = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMonitors`.
        public static final MethodHandle MH_glfwGetMonitors = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPrimaryMonitor`.
        public static final MethodHandle MH_glfwGetPrimaryMonitor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPos`.
        public static final MethodHandle MH_glfwGetMonitorPos = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorWorkarea`.
        public static final MethodHandle MH_glfwGetMonitorWorkarea = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPhysicalSize`.
        public static final MethodHandle MH_glfwGetMonitorPhysicalSize = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorContentScale`.
        public static final MethodHandle MH_glfwGetMonitorContentScale = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorName`.
        public static final MethodHandle MH_glfwGetMonitorName = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorUserPointer`.
        public static final MethodHandle MH_glfwSetMonitorUserPointer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorUserPointer`.
        public static final MethodHandle MH_glfwGetMonitorUserPointer = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorCallback`.
        public static final MethodHandle MH_glfwSetMonitorCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoModes`.
        public static final MethodHandle MH_glfwGetVideoModes = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoMode`.
        public static final MethodHandle MH_glfwGetVideoMode = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGamma`.
        public static final MethodHandle MH_glfwSetGamma = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwGetGammaRamp`.
        public static final MethodHandle MH_glfwGetGammaRamp = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGammaRamp`.
        public static final MethodHandle MH_glfwSetGammaRamp = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwDefaultWindowHints`.
        public static final MethodHandle MH_glfwDefaultWindowHints = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWindowHint`.
        public static final MethodHandle MH_glfwWindowHint = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwWindowHintString`.
        public static final MethodHandle MH_glfwWindowHintString = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwCreateWindow`.
        public static final MethodHandle MH_glfwCreateWindow = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwDestroyWindow`.
        public static final MethodHandle MH_glfwDestroyWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwWindowShouldClose`.
        public static final MethodHandle MH_glfwWindowShouldClose = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowShouldClose`.
        public static final MethodHandle MH_glfwSetWindowShouldClose = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowTitle`.
        public static final MethodHandle MH_glfwGetWindowTitle = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowTitle`.
        public static final MethodHandle MH_glfwSetWindowTitle = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowIcon`.
        public static final MethodHandle MH_glfwSetWindowIcon = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowPos`.
        public static final MethodHandle MH_glfwGetWindowPos = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPos`.
        public static final MethodHandle MH_glfwSetWindowPos = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowSize`.
        public static final MethodHandle MH_glfwGetWindowSize = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeLimits`.
        public static final MethodHandle MH_glfwSetWindowSizeLimits = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAspectRatio`.
        public static final MethodHandle MH_glfwSetWindowAspectRatio = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowSize`.
        public static final MethodHandle MH_glfwSetWindowSize = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetFramebufferSize`.
        public static final MethodHandle MH_glfwGetFramebufferSize = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowFrameSize`.
        public static final MethodHandle MH_glfwGetWindowFrameSize = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowContentScale`.
        public static final MethodHandle MH_glfwGetWindowContentScale = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowOpacity`.
        public static final MethodHandle MH_glfwGetWindowOpacity = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowOpacity`.
        public static final MethodHandle MH_glfwSetWindowOpacity = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwIconifyWindow`.
        public static final MethodHandle MH_glfwIconifyWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRestoreWindow`.
        public static final MethodHandle MH_glfwRestoreWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwMaximizeWindow`.
        public static final MethodHandle MH_glfwMaximizeWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwShowWindow`.
        public static final MethodHandle MH_glfwShowWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwHideWindow`.
        public static final MethodHandle MH_glfwHideWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwFocusWindow`.
        public static final MethodHandle MH_glfwFocusWindow = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRequestWindowAttention`.
        public static final MethodHandle MH_glfwRequestWindowAttention = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowMonitor`.
        public static final MethodHandle MH_glfwGetWindowMonitor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMonitor`.
        public static final MethodHandle MH_glfwSetWindowMonitor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowAttrib`.
        public static final MethodHandle MH_glfwGetWindowAttrib = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAttrib`.
        public static final MethodHandle MH_glfwSetWindowAttrib = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowUserPointer`.
        public static final MethodHandle MH_glfwSetWindowUserPointer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowUserPointer`.
        public static final MethodHandle MH_glfwGetWindowUserPointer = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPosCallback`.
        public static final MethodHandle MH_glfwSetWindowPosCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeCallback`.
        public static final MethodHandle MH_glfwSetWindowSizeCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowCloseCallback`.
        public static final MethodHandle MH_glfwSetWindowCloseCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowRefreshCallback`.
        public static final MethodHandle MH_glfwSetWindowRefreshCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowFocusCallback`.
        public static final MethodHandle MH_glfwSetWindowFocusCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowIconifyCallback`.
        public static final MethodHandle MH_glfwSetWindowIconifyCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMaximizeCallback`.
        public static final MethodHandle MH_glfwSetWindowMaximizeCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetFramebufferSizeCallback`.
        public static final MethodHandle MH_glfwSetFramebufferSizeCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowContentScaleCallback`.
        public static final MethodHandle MH_glfwSetWindowContentScaleCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwPollEvents`.
        public static final MethodHandle MH_glfwPollEvents = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEvents`.
        public static final MethodHandle MH_glfwWaitEvents = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEventsTimeout`.
        public static final MethodHandle MH_glfwWaitEventsTimeout = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwPostEmptyEvent`.
        public static final MethodHandle MH_glfwPostEmptyEvent = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwGetInputMode`.
        public static final MethodHandle MH_glfwGetInputMode = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetInputMode`.
        public static final MethodHandle MH_glfwSetInputMode = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwRawMouseMotionSupported`.
        public static final MethodHandle MH_glfwRawMouseMotionSupported = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyName`.
        public static final MethodHandle MH_glfwGetKeyName = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyScancode`.
        public static final MethodHandle MH_glfwGetKeyScancode = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKey`.
        public static final MethodHandle MH_glfwGetKey = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMouseButton`.
        public static final MethodHandle MH_glfwGetMouseButton = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetCursorPos`.
        public static final MethodHandle MH_glfwGetCursorPos = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPos`.
        public static final MethodHandle MH_glfwSetCursorPos = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwCreateCursor`.
        public static final MethodHandle MH_glfwCreateCursor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateStandardCursor`.
        public static final MethodHandle MH_glfwCreateStandardCursor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwDestroyCursor`.
        public static final MethodHandle MH_glfwDestroyCursor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursor`.
        public static final MethodHandle MH_glfwSetCursor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetKeyCallback`.
        public static final MethodHandle MH_glfwSetKeyCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCharCallback`.
        public static final MethodHandle MH_glfwSetCharCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMouseButtonCallback`.
        public static final MethodHandle MH_glfwSetMouseButtonCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPosCallback`.
        public static final MethodHandle MH_glfwSetCursorPosCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorEnterCallback`.
        public static final MethodHandle MH_glfwSetCursorEnterCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetScrollCallback`.
        public static final MethodHandle MH_glfwSetScrollCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetDropCallback`.
        public static final MethodHandle MH_glfwSetDropCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwJoystickPresent`.
        public static final MethodHandle MH_glfwJoystickPresent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickAxes`.
        public static final MethodHandle MH_glfwGetJoystickAxes = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickButtons`.
        public static final MethodHandle MH_glfwGetJoystickButtons = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickHats`.
        public static final MethodHandle MH_glfwGetJoystickHats = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickName`.
        public static final MethodHandle MH_glfwGetJoystickName = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickGUID`.
        public static final MethodHandle MH_glfwGetJoystickGUID = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickUserPointer`.
        public static final MethodHandle MH_glfwSetJoystickUserPointer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickUserPointer`.
        public static final MethodHandle MH_glfwGetJoystickUserPointer = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwJoystickIsGamepad`.
        public static final MethodHandle MH_glfwJoystickIsGamepad = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickCallback`.
        public static final MethodHandle MH_glfwSetJoystickCallback = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwUpdateGamepadMappings`.
        public static final MethodHandle MH_glfwUpdateGamepadMappings = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetGamepadName`.
        public static final MethodHandle MH_glfwGetGamepadName = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetGamepadState`.
        public static final MethodHandle MH_glfwGetGamepadState = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetClipboardString`.
        public static final MethodHandle MH_glfwSetClipboardString = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetClipboardString`.
        public static final MethodHandle MH_glfwGetClipboardString = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetTime`.
        public static final MethodHandle MH_glfwGetTime = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwSetTime`.
        public static final MethodHandle MH_glfwSetTime = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwGetTimerValue`.
        public static final MethodHandle MH_glfwGetTimerValue = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwGetTimerFrequency`.
        public static final MethodHandle MH_glfwGetTimerFrequency = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwMakeContextCurrent`.
        public static final MethodHandle MH_glfwMakeContextCurrent = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCurrentContext`.
        public static final MethodHandle MH_glfwGetCurrentContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapBuffers`.
        public static final MethodHandle MH_glfwSwapBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapInterval`.
        public static final MethodHandle MH_glfwSwapInterval = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `glfwExtensionSupported`.
        public static final MethodHandle MH_glfwExtensionSupported = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetProcAddress`.
        public static final MethodHandle MH_glfwGetProcAddress = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwVulkanSupported`.
        public static final MethodHandle MH_glfwVulkanSupported = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetRequiredInstanceExtensions`.
        public static final MethodHandle MH_glfwGetRequiredInstanceExtensions = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetInstanceProcAddress`.
        public static final MethodHandle MH_glfwGetInstanceProcAddress = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPhysicalDevicePresentationSupport`.
        public static final MethodHandle MH_glfwGetPhysicalDevicePresentationSupport = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateWindowSurface`.
        public static final MethodHandle MH_glfwCreateWindowSurface = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The function address of `glfwInit`.
        public final MemorySegment PFN_glfwInit;
        /// The function address of `glfwTerminate`.
        public final MemorySegment PFN_glfwTerminate;
        /// The function address of `glfwInitHint`.
        public final MemorySegment PFN_glfwInitHint;
        /// The function address of `glfwInitAllocator`.
        public final MemorySegment PFN_glfwInitAllocator;
        /// The function address of `glfwInitVulkanLoader`.
        public final MemorySegment PFN_glfwInitVulkanLoader;
        /// The function address of `glfwGetVersion`.
        public final MemorySegment PFN_glfwGetVersion;
        /// The function address of `glfwGetVersionString`.
        public final MemorySegment PFN_glfwGetVersionString;
        /// The function address of `glfwGetError`.
        public final MemorySegment PFN_glfwGetError;
        /// The function address of `glfwSetErrorCallback`.
        public final MemorySegment PFN_glfwSetErrorCallback;
        /// The function address of `glfwGetPlatform`.
        public final MemorySegment PFN_glfwGetPlatform;
        /// The function address of `glfwPlatformSupported`.
        public final MemorySegment PFN_glfwPlatformSupported;
        /// The function address of `glfwGetMonitors`.
        public final MemorySegment PFN_glfwGetMonitors;
        /// The function address of `glfwGetPrimaryMonitor`.
        public final MemorySegment PFN_glfwGetPrimaryMonitor;
        /// The function address of `glfwGetMonitorPos`.
        public final MemorySegment PFN_glfwGetMonitorPos;
        /// The function address of `glfwGetMonitorWorkarea`.
        public final MemorySegment PFN_glfwGetMonitorWorkarea;
        /// The function address of `glfwGetMonitorPhysicalSize`.
        public final MemorySegment PFN_glfwGetMonitorPhysicalSize;
        /// The function address of `glfwGetMonitorContentScale`.
        public final MemorySegment PFN_glfwGetMonitorContentScale;
        /// The function address of `glfwGetMonitorName`.
        public final MemorySegment PFN_glfwGetMonitorName;
        /// The function address of `glfwSetMonitorUserPointer`.
        public final MemorySegment PFN_glfwSetMonitorUserPointer;
        /// The function address of `glfwGetMonitorUserPointer`.
        public final MemorySegment PFN_glfwGetMonitorUserPointer;
        /// The function address of `glfwSetMonitorCallback`.
        public final MemorySegment PFN_glfwSetMonitorCallback;
        /// The function address of `glfwGetVideoModes`.
        public final MemorySegment PFN_glfwGetVideoModes;
        /// The function address of `glfwGetVideoMode`.
        public final MemorySegment PFN_glfwGetVideoMode;
        /// The function address of `glfwSetGamma`.
        public final MemorySegment PFN_glfwSetGamma;
        /// The function address of `glfwGetGammaRamp`.
        public final MemorySegment PFN_glfwGetGammaRamp;
        /// The function address of `glfwSetGammaRamp`.
        public final MemorySegment PFN_glfwSetGammaRamp;
        /// The function address of `glfwDefaultWindowHints`.
        public final MemorySegment PFN_glfwDefaultWindowHints;
        /// The function address of `glfwWindowHint`.
        public final MemorySegment PFN_glfwWindowHint;
        /// The function address of `glfwWindowHintString`.
        public final MemorySegment PFN_glfwWindowHintString;
        /// The function address of `glfwCreateWindow`.
        public final MemorySegment PFN_glfwCreateWindow;
        /// The function address of `glfwDestroyWindow`.
        public final MemorySegment PFN_glfwDestroyWindow;
        /// The function address of `glfwWindowShouldClose`.
        public final MemorySegment PFN_glfwWindowShouldClose;
        /// The function address of `glfwSetWindowShouldClose`.
        public final MemorySegment PFN_glfwSetWindowShouldClose;
        /// The function address of `glfwGetWindowTitle`.
        public final MemorySegment PFN_glfwGetWindowTitle;
        /// The function address of `glfwSetWindowTitle`.
        public final MemorySegment PFN_glfwSetWindowTitle;
        /// The function address of `glfwSetWindowIcon`.
        public final MemorySegment PFN_glfwSetWindowIcon;
        /// The function address of `glfwGetWindowPos`.
        public final MemorySegment PFN_glfwGetWindowPos;
        /// The function address of `glfwSetWindowPos`.
        public final MemorySegment PFN_glfwSetWindowPos;
        /// The function address of `glfwGetWindowSize`.
        public final MemorySegment PFN_glfwGetWindowSize;
        /// The function address of `glfwSetWindowSizeLimits`.
        public final MemorySegment PFN_glfwSetWindowSizeLimits;
        /// The function address of `glfwSetWindowAspectRatio`.
        public final MemorySegment PFN_glfwSetWindowAspectRatio;
        /// The function address of `glfwSetWindowSize`.
        public final MemorySegment PFN_glfwSetWindowSize;
        /// The function address of `glfwGetFramebufferSize`.
        public final MemorySegment PFN_glfwGetFramebufferSize;
        /// The function address of `glfwGetWindowFrameSize`.
        public final MemorySegment PFN_glfwGetWindowFrameSize;
        /// The function address of `glfwGetWindowContentScale`.
        public final MemorySegment PFN_glfwGetWindowContentScale;
        /// The function address of `glfwGetWindowOpacity`.
        public final MemorySegment PFN_glfwGetWindowOpacity;
        /// The function address of `glfwSetWindowOpacity`.
        public final MemorySegment PFN_glfwSetWindowOpacity;
        /// The function address of `glfwIconifyWindow`.
        public final MemorySegment PFN_glfwIconifyWindow;
        /// The function address of `glfwRestoreWindow`.
        public final MemorySegment PFN_glfwRestoreWindow;
        /// The function address of `glfwMaximizeWindow`.
        public final MemorySegment PFN_glfwMaximizeWindow;
        /// The function address of `glfwShowWindow`.
        public final MemorySegment PFN_glfwShowWindow;
        /// The function address of `glfwHideWindow`.
        public final MemorySegment PFN_glfwHideWindow;
        /// The function address of `glfwFocusWindow`.
        public final MemorySegment PFN_glfwFocusWindow;
        /// The function address of `glfwRequestWindowAttention`.
        public final MemorySegment PFN_glfwRequestWindowAttention;
        /// The function address of `glfwGetWindowMonitor`.
        public final MemorySegment PFN_glfwGetWindowMonitor;
        /// The function address of `glfwSetWindowMonitor`.
        public final MemorySegment PFN_glfwSetWindowMonitor;
        /// The function address of `glfwGetWindowAttrib`.
        public final MemorySegment PFN_glfwGetWindowAttrib;
        /// The function address of `glfwSetWindowAttrib`.
        public final MemorySegment PFN_glfwSetWindowAttrib;
        /// The function address of `glfwSetWindowUserPointer`.
        public final MemorySegment PFN_glfwSetWindowUserPointer;
        /// The function address of `glfwGetWindowUserPointer`.
        public final MemorySegment PFN_glfwGetWindowUserPointer;
        /// The function address of `glfwSetWindowPosCallback`.
        public final MemorySegment PFN_glfwSetWindowPosCallback;
        /// The function address of `glfwSetWindowSizeCallback`.
        public final MemorySegment PFN_glfwSetWindowSizeCallback;
        /// The function address of `glfwSetWindowCloseCallback`.
        public final MemorySegment PFN_glfwSetWindowCloseCallback;
        /// The function address of `glfwSetWindowRefreshCallback`.
        public final MemorySegment PFN_glfwSetWindowRefreshCallback;
        /// The function address of `glfwSetWindowFocusCallback`.
        public final MemorySegment PFN_glfwSetWindowFocusCallback;
        /// The function address of `glfwSetWindowIconifyCallback`.
        public final MemorySegment PFN_glfwSetWindowIconifyCallback;
        /// The function address of `glfwSetWindowMaximizeCallback`.
        public final MemorySegment PFN_glfwSetWindowMaximizeCallback;
        /// The function address of `glfwSetFramebufferSizeCallback`.
        public final MemorySegment PFN_glfwSetFramebufferSizeCallback;
        /// The function address of `glfwSetWindowContentScaleCallback`.
        public final MemorySegment PFN_glfwSetWindowContentScaleCallback;
        /// The function address of `glfwPollEvents`.
        public final MemorySegment PFN_glfwPollEvents;
        /// The function address of `glfwWaitEvents`.
        public final MemorySegment PFN_glfwWaitEvents;
        /// The function address of `glfwWaitEventsTimeout`.
        public final MemorySegment PFN_glfwWaitEventsTimeout;
        /// The function address of `glfwPostEmptyEvent`.
        public final MemorySegment PFN_glfwPostEmptyEvent;
        /// The function address of `glfwGetInputMode`.
        public final MemorySegment PFN_glfwGetInputMode;
        /// The function address of `glfwSetInputMode`.
        public final MemorySegment PFN_glfwSetInputMode;
        /// The function address of `glfwRawMouseMotionSupported`.
        public final MemorySegment PFN_glfwRawMouseMotionSupported;
        /// The function address of `glfwGetKeyName`.
        public final MemorySegment PFN_glfwGetKeyName;
        /// The function address of `glfwGetKeyScancode`.
        public final MemorySegment PFN_glfwGetKeyScancode;
        /// The function address of `glfwGetKey`.
        public final MemorySegment PFN_glfwGetKey;
        /// The function address of `glfwGetMouseButton`.
        public final MemorySegment PFN_glfwGetMouseButton;
        /// The function address of `glfwGetCursorPos`.
        public final MemorySegment PFN_glfwGetCursorPos;
        /// The function address of `glfwSetCursorPos`.
        public final MemorySegment PFN_glfwSetCursorPos;
        /// The function address of `glfwCreateCursor`.
        public final MemorySegment PFN_glfwCreateCursor;
        /// The function address of `glfwCreateStandardCursor`.
        public final MemorySegment PFN_glfwCreateStandardCursor;
        /// The function address of `glfwDestroyCursor`.
        public final MemorySegment PFN_glfwDestroyCursor;
        /// The function address of `glfwSetCursor`.
        public final MemorySegment PFN_glfwSetCursor;
        /// The function address of `glfwSetKeyCallback`.
        public final MemorySegment PFN_glfwSetKeyCallback;
        /// The function address of `glfwSetCharCallback`.
        public final MemorySegment PFN_glfwSetCharCallback;
        /// The function address of `glfwSetMouseButtonCallback`.
        public final MemorySegment PFN_glfwSetMouseButtonCallback;
        /// The function address of `glfwSetCursorPosCallback`.
        public final MemorySegment PFN_glfwSetCursorPosCallback;
        /// The function address of `glfwSetCursorEnterCallback`.
        public final MemorySegment PFN_glfwSetCursorEnterCallback;
        /// The function address of `glfwSetScrollCallback`.
        public final MemorySegment PFN_glfwSetScrollCallback;
        /// The function address of `glfwSetDropCallback`.
        public final MemorySegment PFN_glfwSetDropCallback;
        /// The function address of `glfwJoystickPresent`.
        public final MemorySegment PFN_glfwJoystickPresent;
        /// The function address of `glfwGetJoystickAxes`.
        public final MemorySegment PFN_glfwGetJoystickAxes;
        /// The function address of `glfwGetJoystickButtons`.
        public final MemorySegment PFN_glfwGetJoystickButtons;
        /// The function address of `glfwGetJoystickHats`.
        public final MemorySegment PFN_glfwGetJoystickHats;
        /// The function address of `glfwGetJoystickName`.
        public final MemorySegment PFN_glfwGetJoystickName;
        /// The function address of `glfwGetJoystickGUID`.
        public final MemorySegment PFN_glfwGetJoystickGUID;
        /// The function address of `glfwSetJoystickUserPointer`.
        public final MemorySegment PFN_glfwSetJoystickUserPointer;
        /// The function address of `glfwGetJoystickUserPointer`.
        public final MemorySegment PFN_glfwGetJoystickUserPointer;
        /// The function address of `glfwJoystickIsGamepad`.
        public final MemorySegment PFN_glfwJoystickIsGamepad;
        /// The function address of `glfwSetJoystickCallback`.
        public final MemorySegment PFN_glfwSetJoystickCallback;
        /// The function address of `glfwUpdateGamepadMappings`.
        public final MemorySegment PFN_glfwUpdateGamepadMappings;
        /// The function address of `glfwGetGamepadName`.
        public final MemorySegment PFN_glfwGetGamepadName;
        /// The function address of `glfwGetGamepadState`.
        public final MemorySegment PFN_glfwGetGamepadState;
        /// The function address of `glfwSetClipboardString`.
        public final MemorySegment PFN_glfwSetClipboardString;
        /// The function address of `glfwGetClipboardString`.
        public final MemorySegment PFN_glfwGetClipboardString;
        /// The function address of `glfwGetTime`.
        public final MemorySegment PFN_glfwGetTime;
        /// The function address of `glfwSetTime`.
        public final MemorySegment PFN_glfwSetTime;
        /// The function address of `glfwGetTimerValue`.
        public final MemorySegment PFN_glfwGetTimerValue;
        /// The function address of `glfwGetTimerFrequency`.
        public final MemorySegment PFN_glfwGetTimerFrequency;
        /// The function address of `glfwMakeContextCurrent`.
        public final MemorySegment PFN_glfwMakeContextCurrent;
        /// The function address of `glfwGetCurrentContext`.
        public final MemorySegment PFN_glfwGetCurrentContext;
        /// The function address of `glfwSwapBuffers`.
        public final MemorySegment PFN_glfwSwapBuffers;
        /// The function address of `glfwSwapInterval`.
        public final MemorySegment PFN_glfwSwapInterval;
        /// The function address of `glfwExtensionSupported`.
        public final MemorySegment PFN_glfwExtensionSupported;
        /// The function address of `glfwGetProcAddress`.
        public final MemorySegment PFN_glfwGetProcAddress;
        /// The function address of `glfwVulkanSupported`.
        public final MemorySegment PFN_glfwVulkanSupported;
        /// The function address of `glfwGetRequiredInstanceExtensions`.
        public final MemorySegment PFN_glfwGetRequiredInstanceExtensions;
        /// The function address of `glfwGetInstanceProcAddress`.
        public final MemorySegment PFN_glfwGetInstanceProcAddress;
        /// The function address of `glfwGetPhysicalDevicePresentationSupport`.
        public final MemorySegment PFN_glfwGetPhysicalDevicePresentationSupport;
        /// The function address of `glfwCreateWindowSurface`.
        public final MemorySegment PFN_glfwCreateWindowSurface;
        private Handles() {
            var _lookup = GLFWLibrary.lookup();
            PFN_glfwInit = _lookup.findOrThrow("glfwInit");
            PFN_glfwTerminate = _lookup.findOrThrow("glfwTerminate");
            PFN_glfwInitHint = _lookup.findOrThrow("glfwInitHint");
            PFN_glfwInitAllocator = _lookup.findOrThrow("glfwInitAllocator");
            PFN_glfwInitVulkanLoader = _lookup.findOrThrow("glfwInitVulkanLoader");
            PFN_glfwGetVersion = _lookup.findOrThrow("glfwGetVersion");
            PFN_glfwGetVersionString = _lookup.findOrThrow("glfwGetVersionString");
            PFN_glfwGetError = _lookup.findOrThrow("glfwGetError");
            PFN_glfwSetErrorCallback = _lookup.findOrThrow("glfwSetErrorCallback");
            PFN_glfwGetPlatform = _lookup.findOrThrow("glfwGetPlatform");
            PFN_glfwPlatformSupported = _lookup.findOrThrow("glfwPlatformSupported");
            PFN_glfwGetMonitors = _lookup.findOrThrow("glfwGetMonitors");
            PFN_glfwGetPrimaryMonitor = _lookup.findOrThrow("glfwGetPrimaryMonitor");
            PFN_glfwGetMonitorPos = _lookup.findOrThrow("glfwGetMonitorPos");
            PFN_glfwGetMonitorWorkarea = _lookup.findOrThrow("glfwGetMonitorWorkarea");
            PFN_glfwGetMonitorPhysicalSize = _lookup.findOrThrow("glfwGetMonitorPhysicalSize");
            PFN_glfwGetMonitorContentScale = _lookup.findOrThrow("glfwGetMonitorContentScale");
            PFN_glfwGetMonitorName = _lookup.findOrThrow("glfwGetMonitorName");
            PFN_glfwSetMonitorUserPointer = _lookup.findOrThrow("glfwSetMonitorUserPointer");
            PFN_glfwGetMonitorUserPointer = _lookup.findOrThrow("glfwGetMonitorUserPointer");
            PFN_glfwSetMonitorCallback = _lookup.findOrThrow("glfwSetMonitorCallback");
            PFN_glfwGetVideoModes = _lookup.findOrThrow("glfwGetVideoModes");
            PFN_glfwGetVideoMode = _lookup.findOrThrow("glfwGetVideoMode");
            PFN_glfwSetGamma = _lookup.findOrThrow("glfwSetGamma");
            PFN_glfwGetGammaRamp = _lookup.findOrThrow("glfwGetGammaRamp");
            PFN_glfwSetGammaRamp = _lookup.findOrThrow("glfwSetGammaRamp");
            PFN_glfwDefaultWindowHints = _lookup.findOrThrow("glfwDefaultWindowHints");
            PFN_glfwWindowHint = _lookup.findOrThrow("glfwWindowHint");
            PFN_glfwWindowHintString = _lookup.findOrThrow("glfwWindowHintString");
            PFN_glfwCreateWindow = _lookup.findOrThrow("glfwCreateWindow");
            PFN_glfwDestroyWindow = _lookup.findOrThrow("glfwDestroyWindow");
            PFN_glfwWindowShouldClose = _lookup.findOrThrow("glfwWindowShouldClose");
            PFN_glfwSetWindowShouldClose = _lookup.findOrThrow("glfwSetWindowShouldClose");
            PFN_glfwGetWindowTitle = _lookup.findOrThrow("glfwGetWindowTitle");
            PFN_glfwSetWindowTitle = _lookup.findOrThrow("glfwSetWindowTitle");
            PFN_glfwSetWindowIcon = _lookup.findOrThrow("glfwSetWindowIcon");
            PFN_glfwGetWindowPos = _lookup.findOrThrow("glfwGetWindowPos");
            PFN_glfwSetWindowPos = _lookup.findOrThrow("glfwSetWindowPos");
            PFN_glfwGetWindowSize = _lookup.findOrThrow("glfwGetWindowSize");
            PFN_glfwSetWindowSizeLimits = _lookup.findOrThrow("glfwSetWindowSizeLimits");
            PFN_glfwSetWindowAspectRatio = _lookup.findOrThrow("glfwSetWindowAspectRatio");
            PFN_glfwSetWindowSize = _lookup.findOrThrow("glfwSetWindowSize");
            PFN_glfwGetFramebufferSize = _lookup.findOrThrow("glfwGetFramebufferSize");
            PFN_glfwGetWindowFrameSize = _lookup.findOrThrow("glfwGetWindowFrameSize");
            PFN_glfwGetWindowContentScale = _lookup.findOrThrow("glfwGetWindowContentScale");
            PFN_glfwGetWindowOpacity = _lookup.findOrThrow("glfwGetWindowOpacity");
            PFN_glfwSetWindowOpacity = _lookup.findOrThrow("glfwSetWindowOpacity");
            PFN_glfwIconifyWindow = _lookup.findOrThrow("glfwIconifyWindow");
            PFN_glfwRestoreWindow = _lookup.findOrThrow("glfwRestoreWindow");
            PFN_glfwMaximizeWindow = _lookup.findOrThrow("glfwMaximizeWindow");
            PFN_glfwShowWindow = _lookup.findOrThrow("glfwShowWindow");
            PFN_glfwHideWindow = _lookup.findOrThrow("glfwHideWindow");
            PFN_glfwFocusWindow = _lookup.findOrThrow("glfwFocusWindow");
            PFN_glfwRequestWindowAttention = _lookup.findOrThrow("glfwRequestWindowAttention");
            PFN_glfwGetWindowMonitor = _lookup.findOrThrow("glfwGetWindowMonitor");
            PFN_glfwSetWindowMonitor = _lookup.findOrThrow("glfwSetWindowMonitor");
            PFN_glfwGetWindowAttrib = _lookup.findOrThrow("glfwGetWindowAttrib");
            PFN_glfwSetWindowAttrib = _lookup.findOrThrow("glfwSetWindowAttrib");
            PFN_glfwSetWindowUserPointer = _lookup.findOrThrow("glfwSetWindowUserPointer");
            PFN_glfwGetWindowUserPointer = _lookup.findOrThrow("glfwGetWindowUserPointer");
            PFN_glfwSetWindowPosCallback = _lookup.findOrThrow("glfwSetWindowPosCallback");
            PFN_glfwSetWindowSizeCallback = _lookup.findOrThrow("glfwSetWindowSizeCallback");
            PFN_glfwSetWindowCloseCallback = _lookup.findOrThrow("glfwSetWindowCloseCallback");
            PFN_glfwSetWindowRefreshCallback = _lookup.findOrThrow("glfwSetWindowRefreshCallback");
            PFN_glfwSetWindowFocusCallback = _lookup.findOrThrow("glfwSetWindowFocusCallback");
            PFN_glfwSetWindowIconifyCallback = _lookup.findOrThrow("glfwSetWindowIconifyCallback");
            PFN_glfwSetWindowMaximizeCallback = _lookup.findOrThrow("glfwSetWindowMaximizeCallback");
            PFN_glfwSetFramebufferSizeCallback = _lookup.findOrThrow("glfwSetFramebufferSizeCallback");
            PFN_glfwSetWindowContentScaleCallback = _lookup.findOrThrow("glfwSetWindowContentScaleCallback");
            PFN_glfwPollEvents = _lookup.findOrThrow("glfwPollEvents");
            PFN_glfwWaitEvents = _lookup.findOrThrow("glfwWaitEvents");
            PFN_glfwWaitEventsTimeout = _lookup.findOrThrow("glfwWaitEventsTimeout");
            PFN_glfwPostEmptyEvent = _lookup.findOrThrow("glfwPostEmptyEvent");
            PFN_glfwGetInputMode = _lookup.findOrThrow("glfwGetInputMode");
            PFN_glfwSetInputMode = _lookup.findOrThrow("glfwSetInputMode");
            PFN_glfwRawMouseMotionSupported = _lookup.findOrThrow("glfwRawMouseMotionSupported");
            PFN_glfwGetKeyName = _lookup.findOrThrow("glfwGetKeyName");
            PFN_glfwGetKeyScancode = _lookup.findOrThrow("glfwGetKeyScancode");
            PFN_glfwGetKey = _lookup.findOrThrow("glfwGetKey");
            PFN_glfwGetMouseButton = _lookup.findOrThrow("glfwGetMouseButton");
            PFN_glfwGetCursorPos = _lookup.findOrThrow("glfwGetCursorPos");
            PFN_glfwSetCursorPos = _lookup.findOrThrow("glfwSetCursorPos");
            PFN_glfwCreateCursor = _lookup.findOrThrow("glfwCreateCursor");
            PFN_glfwCreateStandardCursor = _lookup.findOrThrow("glfwCreateStandardCursor");
            PFN_glfwDestroyCursor = _lookup.findOrThrow("glfwDestroyCursor");
            PFN_glfwSetCursor = _lookup.findOrThrow("glfwSetCursor");
            PFN_glfwSetKeyCallback = _lookup.findOrThrow("glfwSetKeyCallback");
            PFN_glfwSetCharCallback = _lookup.findOrThrow("glfwSetCharCallback");
            PFN_glfwSetMouseButtonCallback = _lookup.findOrThrow("glfwSetMouseButtonCallback");
            PFN_glfwSetCursorPosCallback = _lookup.findOrThrow("glfwSetCursorPosCallback");
            PFN_glfwSetCursorEnterCallback = _lookup.findOrThrow("glfwSetCursorEnterCallback");
            PFN_glfwSetScrollCallback = _lookup.findOrThrow("glfwSetScrollCallback");
            PFN_glfwSetDropCallback = _lookup.findOrThrow("glfwSetDropCallback");
            PFN_glfwJoystickPresent = _lookup.findOrThrow("glfwJoystickPresent");
            PFN_glfwGetJoystickAxes = _lookup.findOrThrow("glfwGetJoystickAxes");
            PFN_glfwGetJoystickButtons = _lookup.findOrThrow("glfwGetJoystickButtons");
            PFN_glfwGetJoystickHats = _lookup.findOrThrow("glfwGetJoystickHats");
            PFN_glfwGetJoystickName = _lookup.findOrThrow("glfwGetJoystickName");
            PFN_glfwGetJoystickGUID = _lookup.findOrThrow("glfwGetJoystickGUID");
            PFN_glfwSetJoystickUserPointer = _lookup.findOrThrow("glfwSetJoystickUserPointer");
            PFN_glfwGetJoystickUserPointer = _lookup.findOrThrow("glfwGetJoystickUserPointer");
            PFN_glfwJoystickIsGamepad = _lookup.findOrThrow("glfwJoystickIsGamepad");
            PFN_glfwSetJoystickCallback = _lookup.findOrThrow("glfwSetJoystickCallback");
            PFN_glfwUpdateGamepadMappings = _lookup.findOrThrow("glfwUpdateGamepadMappings");
            PFN_glfwGetGamepadName = _lookup.findOrThrow("glfwGetGamepadName");
            PFN_glfwGetGamepadState = _lookup.findOrThrow("glfwGetGamepadState");
            PFN_glfwSetClipboardString = _lookup.findOrThrow("glfwSetClipboardString");
            PFN_glfwGetClipboardString = _lookup.findOrThrow("glfwGetClipboardString");
            PFN_glfwGetTime = _lookup.findOrThrow("glfwGetTime");
            PFN_glfwSetTime = _lookup.findOrThrow("glfwSetTime");
            PFN_glfwGetTimerValue = _lookup.findOrThrow("glfwGetTimerValue");
            PFN_glfwGetTimerFrequency = _lookup.findOrThrow("glfwGetTimerFrequency");
            PFN_glfwMakeContextCurrent = _lookup.findOrThrow("glfwMakeContextCurrent");
            PFN_glfwGetCurrentContext = _lookup.findOrThrow("glfwGetCurrentContext");
            PFN_glfwSwapBuffers = _lookup.findOrThrow("glfwSwapBuffers");
            PFN_glfwSwapInterval = _lookup.findOrThrow("glfwSwapInterval");
            PFN_glfwExtensionSupported = _lookup.findOrThrow("glfwExtensionSupported");
            PFN_glfwGetProcAddress = _lookup.findOrThrow("glfwGetProcAddress");
            PFN_glfwVulkanSupported = _lookup.findOrThrow("glfwVulkanSupported");
            PFN_glfwGetRequiredInstanceExtensions = _lookup.findOrThrow("glfwGetRequiredInstanceExtensions");
            PFN_glfwGetInstanceProcAddress = _lookup.findOrThrow("glfwGetInstanceProcAddress");
            PFN_glfwGetPhysicalDevicePresentationSupport = _lookup.findOrThrow("glfwGetPhysicalDevicePresentationSupport");
            PFN_glfwCreateWindowSurface = _lookup.findOrThrow("glfwCreateWindowSurface");
        }
        private static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// (int) GLFWboolean glfwInit();
    /// ```
    public static boolean glfwInit() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInit"); }
        return (((int) Handles.MH_glfwInit.invokeExact(Handles.get().PFN_glfwInit)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInit", e); }
    }

    /// ```
    /// void glfwTerminate();
    /// ```
    public static void glfwTerminate() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwTerminate"); }
        Handles.MH_glfwTerminate.invokeExact(Handles.get().PFN_glfwTerminate); }
        catch (Throwable e) { throw new RuntimeException("error in glfwTerminate", e); }
    }

    /// ```
    /// void glfwInitHint(int hint, int value);
    /// ```
    public static void glfwInitHint(int hint, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitHint", hint, value); }
        Handles.MH_glfwInitHint.invokeExact(Handles.get().PFN_glfwInitHint, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitHint", e); }
    }

    /// ```
    /// void glfwInitAllocator(const GLFWallocator* allocator);
    /// ```
    public static void glfwInitAllocator(MemorySegment allocator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitAllocator", allocator); }
        Handles.MH_glfwInitAllocator.invokeExact(Handles.get().PFN_glfwInitAllocator, allocator); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    /// ```
    /// void glfwInitVulkanLoader((void*) PFN_vkGetInstanceProcAddr loader);
    /// ```
    public static void glfwInitVulkanLoader(MemorySegment loader) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitVulkanLoader", loader); }
        Handles.MH_glfwInitVulkanLoader.invokeExact(Handles.get().PFN_glfwInitVulkanLoader, loader); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    /// ```
    /// void glfwGetVersion(int* major, int* minor, int* rev);
    /// ```
    public static void glfwGetVersion(MemorySegment major, MemorySegment minor, MemorySegment rev) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVersion", major, minor, rev); }
        Handles.MH_glfwGetVersion.invokeExact(Handles.get().PFN_glfwGetVersion, major, minor, rev); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    /// ```
    /// const char* glfwGetVersionString();
    /// ```
    public static MemorySegment glfwGetVersionString() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVersionString"); }
        return (MemorySegment) Handles.MH_glfwGetVersionString.invokeExact(Handles.get().PFN_glfwGetVersionString); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    /// ```
    /// int glfwGetError(const char** description);
    /// ```
    public static int glfwGetError(MemorySegment description) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetError", description); }
        return (int) Handles.MH_glfwGetError.invokeExact(Handles.get().PFN_glfwGetError, description); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    /// ```
    /// (void (*GLFWErrorFun)(int error_code, const char* description)) GLFWerrorfun glfwSetErrorCallback((void (*GLFWErrorFun)(int error_code, const char* description)) GLFWerrorfun callback);
    /// ```
    public static MemorySegment glfwSetErrorCallback(MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetErrorCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetErrorCallback.invokeExact(Handles.get().PFN_glfwSetErrorCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetErrorCallback", e); }
    }

    /// ```
    /// int glfwGetPlatform();
    /// ```
    public static int glfwGetPlatform() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPlatform"); }
        return (int) Handles.MH_glfwGetPlatform.invokeExact(Handles.get().PFN_glfwGetPlatform); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPlatform", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwPlatformSupported(int platform);
    /// ```
    public static boolean glfwPlatformSupported(int platform) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPlatformSupported", platform); }
        return (((int) Handles.MH_glfwPlatformSupported.invokeExact(Handles.get().PFN_glfwPlatformSupported, platform)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPlatformSupported", e); }
    }

    /// ```
    /// GLFWmonitor** glfwGetMonitors(int* count);
    /// ```
    public static MemorySegment glfwGetMonitors(MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitors", count); }
        return (MemorySegment) Handles.MH_glfwGetMonitors.invokeExact(Handles.get().PFN_glfwGetMonitors, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitors", e); }
    }

    /// ```
    /// GLFWmonitor* glfwGetPrimaryMonitor();
    /// ```
    public static MemorySegment glfwGetPrimaryMonitor() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPrimaryMonitor"); }
        return (MemorySegment) Handles.MH_glfwGetPrimaryMonitor.invokeExact(Handles.get().PFN_glfwGetPrimaryMonitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPrimaryMonitor", e); }
    }

    /// ```
    /// void glfwGetMonitorPos(GLFWmonitor* monitor, int* xpos, int* ypos);
    /// ```
    public static void glfwGetMonitorPos(MemorySegment monitor, MemorySegment xpos, MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorPos", monitor, xpos, ypos); }
        Handles.MH_glfwGetMonitorPos.invokeExact(Handles.get().PFN_glfwGetMonitorPos, monitor, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    /// ```
    /// void glfwGetMonitorWorkarea(GLFWmonitor* monitor, int* xpos, int* ypos, int* width, int* height);
    /// ```
    public static void glfwGetMonitorWorkarea(MemorySegment monitor, MemorySegment xpos, MemorySegment ypos, MemorySegment width, MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorWorkarea", monitor, xpos, ypos, width, height); }
        Handles.MH_glfwGetMonitorWorkarea.invokeExact(Handles.get().PFN_glfwGetMonitorWorkarea, monitor, xpos, ypos, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    /// ```
    /// void glfwGetMonitorPhysicalSize(GLFWmonitor* monitor, int* widthMM, int* heightMM);
    /// ```
    public static void glfwGetMonitorPhysicalSize(MemorySegment monitor, MemorySegment widthMM, MemorySegment heightMM) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorPhysicalSize", monitor, widthMM, heightMM); }
        Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(Handles.get().PFN_glfwGetMonitorPhysicalSize, monitor, widthMM, heightMM); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    /// ```
    /// void glfwGetMonitorContentScale(GLFWmonitor* monitor, float* xscale, float* yscale);
    /// ```
    public static void glfwGetMonitorContentScale(MemorySegment monitor, MemorySegment xscale, MemorySegment yscale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorContentScale", monitor, xscale, yscale); }
        Handles.MH_glfwGetMonitorContentScale.invokeExact(Handles.get().PFN_glfwGetMonitorContentScale, monitor, xscale, yscale); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    /// ```
    /// const char* glfwGetMonitorName(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetMonitorName(MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorName", monitor); }
        return (MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(Handles.get().PFN_glfwGetMonitorName, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    /// ```
    /// void glfwSetMonitorUserPointer(GLFWmonitor* monitor, void* pointer);
    /// ```
    public static void glfwSetMonitorUserPointer(MemorySegment monitor, MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMonitorUserPointer", monitor, pointer); }
        Handles.MH_glfwSetMonitorUserPointer.invokeExact(Handles.get().PFN_glfwSetMonitorUserPointer, monitor, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorUserPointer", e); }
    }

    /// ```
    /// void* glfwGetMonitorUserPointer(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetMonitorUserPointer(MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorUserPointer", monitor); }
        return (MemorySegment) Handles.MH_glfwGetMonitorUserPointer.invokeExact(Handles.get().PFN_glfwGetMonitorUserPointer, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorUserPointer", e); }
    }

    /// ```
    /// (void (*GLFWMonitorFun)(GLFWmonitor* monitor, int event)) GLFWmonitorfun glfwSetMonitorCallback((void (*GLFWMonitorFun)(GLFWmonitor* monitor, int event)) GLFWmonitorfun callback);
    /// ```
    public static MemorySegment glfwSetMonitorCallback(MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMonitorCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetMonitorCallback.invokeExact(Handles.get().PFN_glfwSetMonitorCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorCallback", e); }
    }

    /// ```
    /// const GLFWvidmode* glfwGetVideoModes(GLFWmonitor* monitor, int* count);
    /// ```
    public static MemorySegment glfwGetVideoModes(MemorySegment monitor, MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVideoModes", monitor, count); }
        return (MemorySegment) Handles.MH_glfwGetVideoModes.invokeExact(Handles.get().PFN_glfwGetVideoModes, monitor, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoModes", e); }
    }

    /// ```
    /// const GLFWvidmode* glfwGetVideoMode(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetVideoMode(MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVideoMode", monitor); }
        return (MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(Handles.get().PFN_glfwGetVideoMode, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    /// ```
    /// void glfwSetGamma(GLFWmonitor* monitor, float gamma);
    /// ```
    public static void glfwSetGamma(MemorySegment monitor, float gamma) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetGamma", monitor, gamma); }
        Handles.MH_glfwSetGamma.invokeExact(Handles.get().PFN_glfwSetGamma, monitor, gamma); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetGamma", e); }
    }

    /// ```
    /// const GLFWgammaramp* glfwGetGammaRamp(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetGammaRamp(MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGammaRamp", monitor); }
        return (MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(Handles.get().PFN_glfwGetGammaRamp, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    /// ```
    /// void glfwSetGammaRamp(GLFWmonitor* monitor, const GLFWgammaramp* ramp);
    /// ```
    public static void glfwSetGammaRamp(MemorySegment monitor, MemorySegment ramp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetGammaRamp", monitor, ramp); }
        Handles.MH_glfwSetGammaRamp.invokeExact(Handles.get().PFN_glfwSetGammaRamp, monitor, ramp); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    /// ```
    /// void glfwDefaultWindowHints();
    /// ```
    public static void glfwDefaultWindowHints() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDefaultWindowHints"); }
        Handles.MH_glfwDefaultWindowHints.invokeExact(Handles.get().PFN_glfwDefaultWindowHints); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDefaultWindowHints", e); }
    }

    /// ```
    /// void glfwWindowHint(int hint, int value);
    /// ```
    public static void glfwWindowHint(int hint, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowHint", hint, value); }
        Handles.MH_glfwWindowHint.invokeExact(Handles.get().PFN_glfwWindowHint, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowHint", e); }
    }

    /// ```
    /// void glfwWindowHintString(int hint, const char* value);
    /// ```
    public static void glfwWindowHintString(int hint, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowHintString", hint, value); }
        Handles.MH_glfwWindowHintString.invokeExact(Handles.get().PFN_glfwWindowHintString, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    /// ```
    /// GLFWwindow* glfwCreateWindow(int width, int height, const char* title, GLFWmonitor* monitor, GLFWwindow* share);
    /// ```
    public static MemorySegment glfwCreateWindow(int width, int height, MemorySegment title, MemorySegment monitor, MemorySegment share) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateWindow", width, height, title, monitor, share); }
        return (MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(Handles.get().PFN_glfwCreateWindow, width, height, title, monitor, share); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    /// ```
    /// void glfwDestroyWindow(GLFWwindow* window);
    /// ```
    public static void glfwDestroyWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDestroyWindow", window); }
        Handles.MH_glfwDestroyWindow.invokeExact(Handles.get().PFN_glfwDestroyWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDestroyWindow", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwWindowShouldClose(GLFWwindow* window);
    /// ```
    public static boolean glfwWindowShouldClose(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowShouldClose", window); }
        return (((int) Handles.MH_glfwWindowShouldClose.invokeExact(Handles.get().PFN_glfwWindowShouldClose, window)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowShouldClose", e); }
    }

    /// ```
    /// void glfwSetWindowShouldClose(GLFWwindow* window, (int) GLFWboolean value);
    /// ```
    public static void glfwSetWindowShouldClose(MemorySegment window, boolean value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowShouldClose", window, value); }
        Handles.MH_glfwSetWindowShouldClose.invokeExact(Handles.get().PFN_glfwSetWindowShouldClose, window, ((value) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowShouldClose", e); }
    }

    /// ```
    /// const char* glfwGetWindowTitle(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWindowTitle(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowTitle", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(Handles.get().PFN_glfwGetWindowTitle, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    /// ```
    /// void glfwSetWindowTitle(GLFWwindow* window, const char* title);
    /// ```
    public static void glfwSetWindowTitle(MemorySegment window, MemorySegment title) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowTitle", window, title); }
        Handles.MH_glfwSetWindowTitle.invokeExact(Handles.get().PFN_glfwSetWindowTitle, window, title); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    /// ```
    /// void glfwSetWindowIcon(GLFWwindow* window, int count, const GLFWimage* images);
    /// ```
    public static void glfwSetWindowIcon(MemorySegment window, int count, MemorySegment images) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowIcon", window, count, images); }
        Handles.MH_glfwSetWindowIcon.invokeExact(Handles.get().PFN_glfwSetWindowIcon, window, count, images); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    /// ```
    /// void glfwGetWindowPos(GLFWwindow* window, int* xpos, int* ypos);
    /// ```
    public static void glfwGetWindowPos(MemorySegment window, MemorySegment xpos, MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowPos", window, xpos, ypos); }
        Handles.MH_glfwGetWindowPos.invokeExact(Handles.get().PFN_glfwGetWindowPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    /// ```
    /// void glfwSetWindowPos(GLFWwindow* window, int xpos, int ypos);
    /// ```
    public static void glfwSetWindowPos(MemorySegment window, int xpos, int ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowPos", window, xpos, ypos); }
        Handles.MH_glfwSetWindowPos.invokeExact(Handles.get().PFN_glfwSetWindowPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPos", e); }
    }

    /// ```
    /// void glfwGetWindowSize(GLFWwindow* window, int* width, int* height);
    /// ```
    public static void glfwGetWindowSize(MemorySegment window, MemorySegment width, MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowSize", window, width, height); }
        Handles.MH_glfwGetWindowSize.invokeExact(Handles.get().PFN_glfwGetWindowSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    /// ```
    /// void glfwSetWindowSizeLimits(GLFWwindow* window, int minwidth, int minheight, int maxwidth, int maxheight);
    /// ```
    public static void glfwSetWindowSizeLimits(MemorySegment window, int minwidth, int minheight, int maxwidth, int maxheight) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSizeLimits", window, minwidth, minheight, maxwidth, maxheight); }
        Handles.MH_glfwSetWindowSizeLimits.invokeExact(Handles.get().PFN_glfwSetWindowSizeLimits, window, minwidth, minheight, maxwidth, maxheight); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeLimits", e); }
    }

    /// ```
    /// void glfwSetWindowAspectRatio(GLFWwindow* window, int numer, int denom);
    /// ```
    public static void glfwSetWindowAspectRatio(MemorySegment window, int numer, int denom) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowAspectRatio", window, numer, denom); }
        Handles.MH_glfwSetWindowAspectRatio.invokeExact(Handles.get().PFN_glfwSetWindowAspectRatio, window, numer, denom); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAspectRatio", e); }
    }

    /// ```
    /// void glfwSetWindowSize(GLFWwindow* window, int width, int height);
    /// ```
    public static void glfwSetWindowSize(MemorySegment window, int width, int height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSize", window, width, height); }
        Handles.MH_glfwSetWindowSize.invokeExact(Handles.get().PFN_glfwSetWindowSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSize", e); }
    }

    /// ```
    /// void glfwGetFramebufferSize(GLFWwindow* window, int* width, int* height);
    /// ```
    public static void glfwGetFramebufferSize(MemorySegment window, MemorySegment width, MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetFramebufferSize", window, width, height); }
        Handles.MH_glfwGetFramebufferSize.invokeExact(Handles.get().PFN_glfwGetFramebufferSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    /// ```
    /// void glfwGetWindowFrameSize(GLFWwindow* window, int* left, int* top, int* right, int* bottom);
    /// ```
    public static void glfwGetWindowFrameSize(MemorySegment window, MemorySegment left, MemorySegment top, MemorySegment right, MemorySegment bottom) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowFrameSize", window, left, top, right, bottom); }
        Handles.MH_glfwGetWindowFrameSize.invokeExact(Handles.get().PFN_glfwGetWindowFrameSize, window, left, top, right, bottom); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    /// ```
    /// void glfwGetWindowContentScale(GLFWwindow* window, float* xscale, float* yscale);
    /// ```
    public static void glfwGetWindowContentScale(MemorySegment window, MemorySegment xscale, MemorySegment yscale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowContentScale", window, xscale, yscale); }
        Handles.MH_glfwGetWindowContentScale.invokeExact(Handles.get().PFN_glfwGetWindowContentScale, window, xscale, yscale); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    /// ```
    /// float glfwGetWindowOpacity(GLFWwindow* window);
    /// ```
    public static float glfwGetWindowOpacity(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowOpacity", window); }
        return (float) Handles.MH_glfwGetWindowOpacity.invokeExact(Handles.get().PFN_glfwGetWindowOpacity, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowOpacity", e); }
    }

    /// ```
    /// void glfwSetWindowOpacity(GLFWwindow* window, float opacity);
    /// ```
    public static void glfwSetWindowOpacity(MemorySegment window, float opacity) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowOpacity", window, opacity); }
        Handles.MH_glfwSetWindowOpacity.invokeExact(Handles.get().PFN_glfwSetWindowOpacity, window, opacity); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowOpacity", e); }
    }

    /// ```
    /// void glfwIconifyWindow(GLFWwindow* window);
    /// ```
    public static void glfwIconifyWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwIconifyWindow", window); }
        Handles.MH_glfwIconifyWindow.invokeExact(Handles.get().PFN_glfwIconifyWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwIconifyWindow", e); }
    }

    /// ```
    /// void glfwRestoreWindow(GLFWwindow* window);
    /// ```
    public static void glfwRestoreWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRestoreWindow", window); }
        Handles.MH_glfwRestoreWindow.invokeExact(Handles.get().PFN_glfwRestoreWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRestoreWindow", e); }
    }

    /// ```
    /// void glfwMaximizeWindow(GLFWwindow* window);
    /// ```
    public static void glfwMaximizeWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwMaximizeWindow", window); }
        Handles.MH_glfwMaximizeWindow.invokeExact(Handles.get().PFN_glfwMaximizeWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwMaximizeWindow", e); }
    }

    /// ```
    /// void glfwShowWindow(GLFWwindow* window);
    /// ```
    public static void glfwShowWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwShowWindow", window); }
        Handles.MH_glfwShowWindow.invokeExact(Handles.get().PFN_glfwShowWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwShowWindow", e); }
    }

    /// ```
    /// void glfwHideWindow(GLFWwindow* window);
    /// ```
    public static void glfwHideWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwHideWindow", window); }
        Handles.MH_glfwHideWindow.invokeExact(Handles.get().PFN_glfwHideWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwHideWindow", e); }
    }

    /// ```
    /// void glfwFocusWindow(GLFWwindow* window);
    /// ```
    public static void glfwFocusWindow(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwFocusWindow", window); }
        Handles.MH_glfwFocusWindow.invokeExact(Handles.get().PFN_glfwFocusWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwFocusWindow", e); }
    }

    /// ```
    /// void glfwRequestWindowAttention(GLFWwindow* window);
    /// ```
    public static void glfwRequestWindowAttention(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRequestWindowAttention", window); }
        Handles.MH_glfwRequestWindowAttention.invokeExact(Handles.get().PFN_glfwRequestWindowAttention, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRequestWindowAttention", e); }
    }

    /// ```
    /// GLFWmonitor* glfwGetWindowMonitor(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWindowMonitor(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowMonitor", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowMonitor.invokeExact(Handles.get().PFN_glfwGetWindowMonitor, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowMonitor", e); }
    }

    /// ```
    /// void glfwSetWindowMonitor(GLFWwindow* window, GLFWmonitor* monitor, int xpos, int ypos, int width, int height, int refreshRate);
    /// ```
    public static void glfwSetWindowMonitor(MemorySegment window, MemorySegment monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowMonitor", window, monitor, xpos, ypos, width, height, refreshRate); }
        Handles.MH_glfwSetWindowMonitor.invokeExact(Handles.get().PFN_glfwSetWindowMonitor, window, monitor, xpos, ypos, width, height, refreshRate); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMonitor", e); }
    }

    /// ```
    /// int glfwGetWindowAttrib(GLFWwindow* window, int attrib);
    /// ```
    public static int glfwGetWindowAttrib(MemorySegment window, int attrib) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowAttrib", window, attrib); }
        return (int) Handles.MH_glfwGetWindowAttrib.invokeExact(Handles.get().PFN_glfwGetWindowAttrib, window, attrib); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowAttrib", e); }
    }

    /// ```
    /// void glfwSetWindowAttrib(GLFWwindow* window, int attrib, int value);
    /// ```
    public static void glfwSetWindowAttrib(MemorySegment window, int attrib, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowAttrib", window, attrib, value); }
        Handles.MH_glfwSetWindowAttrib.invokeExact(Handles.get().PFN_glfwSetWindowAttrib, window, attrib, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAttrib", e); }
    }

    /// ```
    /// void glfwSetWindowUserPointer(GLFWwindow* window, void* pointer);
    /// ```
    public static void glfwSetWindowUserPointer(MemorySegment window, MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowUserPointer", window, pointer); }
        Handles.MH_glfwSetWindowUserPointer.invokeExact(Handles.get().PFN_glfwSetWindowUserPointer, window, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowUserPointer", e); }
    }

    /// ```
    /// void* glfwGetWindowUserPointer(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWindowUserPointer(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowUserPointer", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowUserPointer.invokeExact(Handles.get().PFN_glfwGetWindowUserPointer, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowUserPointer", e); }
    }

    /// ```
    /// (void (*GLFWWindowPosFun)(GLFWwindow* window, int xpos, int ypos)) GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow* window, (void (*GLFWWindowPosFun)(GLFWwindow* window, int xpos, int ypos)) GLFWwindowposfun callback);
    /// ```
    public static MemorySegment glfwSetWindowPosCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowPosCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowPosCallback.invokeExact(Handles.get().PFN_glfwSetWindowPosCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPosCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowSizeFun)(GLFWwindow* window, int width, int height)) GLFWwindowsizefun glfwSetWindowSizeCallback(GLFWwindow* window, (void (*GLFWWindowSizeFun)(GLFWwindow* window, int width, int height)) GLFWwindowsizefun callback);
    /// ```
    public static MemorySegment glfwSetWindowSizeCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowSizeCallback.invokeExact(Handles.get().PFN_glfwSetWindowSizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowCloseFun)(GLFWwindow* window)) GLFWwindowclosefun glfwSetWindowCloseCallback(GLFWwindow* window, (void (*GLFWWindowCloseFun)(GLFWwindow* window)) GLFWwindowclosefun callback);
    /// ```
    public static MemorySegment glfwSetWindowCloseCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowCloseCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowCloseCallback.invokeExact(Handles.get().PFN_glfwSetWindowCloseCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowCloseCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowRefreshFun)(GLFWwindow* window)) GLFWwindowrefreshfun glfwSetWindowRefreshCallback(GLFWwindow* window, (void (*GLFWWindowRefreshFun)(GLFWwindow* window)) GLFWwindowrefreshfun callback);
    /// ```
    public static MemorySegment glfwSetWindowRefreshCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowRefreshCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowRefreshCallback.invokeExact(Handles.get().PFN_glfwSetWindowRefreshCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowRefreshCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowFocusFun)(GLFWwindow* window, (int) GLFWboolean focused)) GLFWwindowfocusfun glfwSetWindowFocusCallback(GLFWwindow* window, (void (*GLFWWindowFocusFun)(GLFWwindow* window, (int) GLFWboolean focused)) GLFWwindowfocusfun callback);
    /// ```
    public static MemorySegment glfwSetWindowFocusCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowFocusCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowFocusCallback.invokeExact(Handles.get().PFN_glfwSetWindowFocusCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowFocusCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowIconifyFun)(GLFWwindow* window, (int) GLFWboolean iconified)) GLFWwindowiconifyfun glfwSetWindowIconifyCallback(GLFWwindow* window, (void (*GLFWWindowIconifyFun)(GLFWwindow* window, (int) GLFWboolean iconified)) GLFWwindowiconifyfun callback);
    /// ```
    public static MemorySegment glfwSetWindowIconifyCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowIconifyCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowIconifyCallback.invokeExact(Handles.get().PFN_glfwSetWindowIconifyCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIconifyCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowMaximizeFun)(GLFWwindow* window, (int) GLFWboolean maximized)) GLFWwindowmaximizefun glfwSetWindowMaximizeCallback(GLFWwindow* window, (void (*GLFWWindowMaximizeFun)(GLFWwindow* window, (int) GLFWboolean maximized)) GLFWwindowmaximizefun callback);
    /// ```
    public static MemorySegment glfwSetWindowMaximizeCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowMaximizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowMaximizeCallback.invokeExact(Handles.get().PFN_glfwSetWindowMaximizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMaximizeCallback", e); }
    }

    /// ```
    /// (void (*GLFWFramebufferSizeFun)(GLFWwindow* window, int width, int height)) GLFWframebuffersizefun glfwSetFramebufferSizeCallback(GLFWwindow* window, (void (*GLFWFramebufferSizeFun)(GLFWwindow* window, int width, int height)) GLFWframebuffersizefun callback);
    /// ```
    public static MemorySegment glfwSetFramebufferSizeCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetFramebufferSizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetFramebufferSizeCallback.invokeExact(Handles.get().PFN_glfwSetFramebufferSizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetFramebufferSizeCallback", e); }
    }

    /// ```
    /// (void (*GLFWWindowContentScaleFun)(GLFWwindow* window, float xscale, float yscale)) GLFWwindowcontentscalefun glfwSetWindowContentScaleCallback(GLFWwindow* window, (void (*GLFWWindowContentScaleFun)(GLFWwindow* window, float xscale, float yscale)) GLFWwindowcontentscalefun callback);
    /// ```
    public static MemorySegment glfwSetWindowContentScaleCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowContentScaleCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowContentScaleCallback.invokeExact(Handles.get().PFN_glfwSetWindowContentScaleCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowContentScaleCallback", e); }
    }

    /// ```
    /// void glfwPollEvents();
    /// ```
    public static void glfwPollEvents() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPollEvents"); }
        Handles.MH_glfwPollEvents.invokeExact(Handles.get().PFN_glfwPollEvents); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPollEvents", e); }
    }

    /// ```
    /// void glfwWaitEvents();
    /// ```
    public static void glfwWaitEvents() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWaitEvents"); }
        Handles.MH_glfwWaitEvents.invokeExact(Handles.get().PFN_glfwWaitEvents); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWaitEvents", e); }
    }

    /// ```
    /// void glfwWaitEventsTimeout(double timeout);
    /// ```
    public static void glfwWaitEventsTimeout(double timeout) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWaitEventsTimeout", timeout); }
        Handles.MH_glfwWaitEventsTimeout.invokeExact(Handles.get().PFN_glfwWaitEventsTimeout, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWaitEventsTimeout", e); }
    }

    /// ```
    /// void glfwPostEmptyEvent();
    /// ```
    public static void glfwPostEmptyEvent() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPostEmptyEvent"); }
        Handles.MH_glfwPostEmptyEvent.invokeExact(Handles.get().PFN_glfwPostEmptyEvent); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPostEmptyEvent", e); }
    }

    /// ```
    /// int glfwGetInputMode(GLFWwindow* window, int mode);
    /// ```
    public static int glfwGetInputMode(MemorySegment window, int mode) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetInputMode", window, mode); }
        return (int) Handles.MH_glfwGetInputMode.invokeExact(Handles.get().PFN_glfwGetInputMode, window, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetInputMode", e); }
    }

    /// ```
    /// void glfwSetInputMode(GLFWwindow* window, int mode, int value);
    /// ```
    public static void glfwSetInputMode(MemorySegment window, int mode, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetInputMode", window, mode, value); }
        Handles.MH_glfwSetInputMode.invokeExact(Handles.get().PFN_glfwSetInputMode, window, mode, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetInputMode", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwRawMouseMotionSupported();
    /// ```
    public static boolean glfwRawMouseMotionSupported() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRawMouseMotionSupported"); }
        return (((int) Handles.MH_glfwRawMouseMotionSupported.invokeExact(Handles.get().PFN_glfwRawMouseMotionSupported)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRawMouseMotionSupported", e); }
    }

    /// ```
    /// const char* glfwGetKeyName(int key, int scancode);
    /// ```
    public static MemorySegment glfwGetKeyName(int key, int scancode) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKeyName", key, scancode); }
        return (MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(Handles.get().PFN_glfwGetKeyName, key, scancode); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    /// ```
    /// int glfwGetKeyScancode(int key);
    /// ```
    public static int glfwGetKeyScancode(int key) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKeyScancode", key); }
        return (int) Handles.MH_glfwGetKeyScancode.invokeExact(Handles.get().PFN_glfwGetKeyScancode, key); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyScancode", e); }
    }

    /// ```
    /// int glfwGetKey(GLFWwindow* window, int key);
    /// ```
    public static int glfwGetKey(MemorySegment window, int key) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKey", window, key); }
        return (int) Handles.MH_glfwGetKey.invokeExact(Handles.get().PFN_glfwGetKey, window, key); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKey", e); }
    }

    /// ```
    /// int glfwGetMouseButton(GLFWwindow* window, int button);
    /// ```
    public static int glfwGetMouseButton(MemorySegment window, int button) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMouseButton", window, button); }
        return (int) Handles.MH_glfwGetMouseButton.invokeExact(Handles.get().PFN_glfwGetMouseButton, window, button); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMouseButton", e); }
    }

    /// ```
    /// void glfwGetCursorPos(GLFWwindow* window, double* xpos, double* ypos);
    /// ```
    public static void glfwGetCursorPos(MemorySegment window, MemorySegment xpos, MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCursorPos", window, xpos, ypos); }
        Handles.MH_glfwGetCursorPos.invokeExact(Handles.get().PFN_glfwGetCursorPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    /// ```
    /// void glfwSetCursorPos(GLFWwindow* window, double xpos, double ypos);
    /// ```
    public static void glfwSetCursorPos(MemorySegment window, double xpos, double ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorPos", window, xpos, ypos); }
        Handles.MH_glfwSetCursorPos.invokeExact(Handles.get().PFN_glfwSetCursorPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPos", e); }
    }

    /// ```
    /// GLFWcursor* glfwCreateCursor(const GLFWimage* image, int xhot, int yhot);
    /// ```
    public static MemorySegment glfwCreateCursor(MemorySegment image, int xhot, int yhot) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateCursor", image, xhot, yhot); }
        return (MemorySegment) Handles.MH_glfwCreateCursor.invokeExact(Handles.get().PFN_glfwCreateCursor, image, xhot, yhot); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateCursor", e); }
    }

    /// ```
    /// GLFWcursor* glfwCreateStandardCursor(int shape);
    /// ```
    public static MemorySegment glfwCreateStandardCursor(int shape) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateStandardCursor", shape); }
        return (MemorySegment) Handles.MH_glfwCreateStandardCursor.invokeExact(Handles.get().PFN_glfwCreateStandardCursor, shape); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateStandardCursor", e); }
    }

    /// ```
    /// void glfwDestroyCursor(GLFWcursor* cursor);
    /// ```
    public static void glfwDestroyCursor(MemorySegment cursor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDestroyCursor", cursor); }
        Handles.MH_glfwDestroyCursor.invokeExact(Handles.get().PFN_glfwDestroyCursor, cursor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDestroyCursor", e); }
    }

    /// ```
    /// void glfwSetCursor(GLFWwindow* window, GLFWcursor* cursor);
    /// ```
    public static void glfwSetCursor(MemorySegment window, MemorySegment cursor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursor", window, cursor); }
        Handles.MH_glfwSetCursor.invokeExact(Handles.get().PFN_glfwSetCursor, window, cursor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    /// ```
    /// (void (*GLFWKeyFun)(GLFWwindow* window, int key, int scancode, int action, int mods)) GLFWkeyfun glfwSetKeyCallback(GLFWwindow* window, (void (*GLFWKeyFun)(GLFWwindow* window, int key, int scancode, int action, int mods)) GLFWkeyfun callback);
    /// ```
    public static MemorySegment glfwSetKeyCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetKeyCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetKeyCallback.invokeExact(Handles.get().PFN_glfwSetKeyCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetKeyCallback", e); }
    }

    /// ```
    /// (void (*GLFWCharFun)(GLFWwindow* window, unsigned int codepoint)) GLFWcharfun glfwSetCharCallback(GLFWwindow* window, (void (*GLFWCharFun)(GLFWwindow* window, unsigned int codepoint)) GLFWcharfun callback);
    /// ```
    public static MemorySegment glfwSetCharCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCharCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCharCallback.invokeExact(Handles.get().PFN_glfwSetCharCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCharCallback", e); }
    }

    /// ```
    /// (void (*GLFWMouseButtonFun)(GLFWwindow* window, int button, int action, int mods)) GLFWmousebuttonfun glfwSetMouseButtonCallback(GLFWwindow* window, (void (*GLFWMouseButtonFun)(GLFWwindow* window, int button, int action, int mods)) GLFWmousebuttonfun callback);
    /// ```
    public static MemorySegment glfwSetMouseButtonCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMouseButtonCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetMouseButtonCallback.invokeExact(Handles.get().PFN_glfwSetMouseButtonCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMouseButtonCallback", e); }
    }

    /// ```
    /// (void (*GLFWCursorPosFun)(GLFWwindow* window, double xpos, double ypos)) GLFWcursorposfun glfwSetCursorPosCallback(GLFWwindow* window, (void (*GLFWCursorPosFun)(GLFWwindow* window, double xpos, double ypos)) GLFWcursorposfun callback);
    /// ```
    public static MemorySegment glfwSetCursorPosCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorPosCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCursorPosCallback.invokeExact(Handles.get().PFN_glfwSetCursorPosCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPosCallback", e); }
    }

    /// ```
    /// (void (*GLFWCursorEnterFun)(GLFWwindow* window, (int) GLFWboolean entered)) GLFWcursorenterfun glfwSetCursorEnterCallback(GLFWwindow* window, (void (*GLFWCursorEnterFun)(GLFWwindow* window, (int) GLFWboolean entered)) GLFWcursorenterfun callback);
    /// ```
    public static MemorySegment glfwSetCursorEnterCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorEnterCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCursorEnterCallback.invokeExact(Handles.get().PFN_glfwSetCursorEnterCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorEnterCallback", e); }
    }

    /// ```
    /// (void (*GLFWScrollFun)(GLFWwindow* window, double xoffset, double yoffset)) GLFWscrollfun glfwSetScrollCallback(GLFWwindow* window, (void (*GLFWScrollFun)(GLFWwindow* window, double xoffset, double yoffset)) GLFWscrollfun callback);
    /// ```
    public static MemorySegment glfwSetScrollCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetScrollCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetScrollCallback.invokeExact(Handles.get().PFN_glfwSetScrollCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetScrollCallback", e); }
    }

    /// ```
    /// (void (*GLFWDropFun)(GLFWwindow* window, int path_count, const char** paths)) GLFWdropfun glfwSetDropCallback(GLFWwindow* window, (void (*GLFWDropFun)(GLFWwindow* window, int path_count, const char** paths)) GLFWdropfun callback);
    /// ```
    public static MemorySegment glfwSetDropCallback(MemorySegment window, MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetDropCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetDropCallback.invokeExact(Handles.get().PFN_glfwSetDropCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetDropCallback", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwJoystickPresent(int jid);
    /// ```
    public static boolean glfwJoystickPresent(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwJoystickPresent", jid); }
        return (((int) Handles.MH_glfwJoystickPresent.invokeExact(Handles.get().PFN_glfwJoystickPresent, jid)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwJoystickPresent", e); }
    }

    /// ```
    /// const float* glfwGetJoystickAxes(int jid, int* count);
    /// ```
    public static MemorySegment glfwGetJoystickAxes(int jid, MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickAxes", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickAxes.invokeExact(Handles.get().PFN_glfwGetJoystickAxes, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickAxes", e); }
    }

    /// ```
    /// const unsigned char* glfwGetJoystickButtons(int jid, int* count);
    /// ```
    public static MemorySegment glfwGetJoystickButtons(int jid, MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickButtons", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickButtons.invokeExact(Handles.get().PFN_glfwGetJoystickButtons, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickButtons", e); }
    }

    /// ```
    /// const unsigned char* glfwGetJoystickHats(int jid, int* count);
    /// ```
    public static MemorySegment glfwGetJoystickHats(int jid, MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickHats", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickHats.invokeExact(Handles.get().PFN_glfwGetJoystickHats, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickHats", e); }
    }

    /// ```
    /// const char* glfwGetJoystickName(int jid);
    /// ```
    public static MemorySegment glfwGetJoystickName(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickName", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(Handles.get().PFN_glfwGetJoystickName, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    /// ```
    /// const char* glfwGetJoystickGUID(int jid);
    /// ```
    public static MemorySegment glfwGetJoystickGUID(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickGUID", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(Handles.get().PFN_glfwGetJoystickGUID, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    /// ```
    /// void glfwSetJoystickUserPointer(int jid, void* pointer);
    /// ```
    public static void glfwSetJoystickUserPointer(int jid, MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetJoystickUserPointer", jid, pointer); }
        Handles.MH_glfwSetJoystickUserPointer.invokeExact(Handles.get().PFN_glfwSetJoystickUserPointer, jid, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickUserPointer", e); }
    }

    /// ```
    /// void* glfwGetJoystickUserPointer(int jid);
    /// ```
    public static MemorySegment glfwGetJoystickUserPointer(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickUserPointer", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickUserPointer.invokeExact(Handles.get().PFN_glfwGetJoystickUserPointer, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickUserPointer", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwJoystickIsGamepad(int jid);
    /// ```
    public static boolean glfwJoystickIsGamepad(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwJoystickIsGamepad", jid); }
        return (((int) Handles.MH_glfwJoystickIsGamepad.invokeExact(Handles.get().PFN_glfwJoystickIsGamepad, jid)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwJoystickIsGamepad", e); }
    }

    /// ```
    /// (void (*GLFWJoystickFun)(int jid, int event)) GLFWjoystickfun glfwSetJoystickCallback((void (*GLFWJoystickFun)(int jid, int event)) GLFWjoystickfun callback);
    /// ```
    public static MemorySegment glfwSetJoystickCallback(MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetJoystickCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetJoystickCallback.invokeExact(Handles.get().PFN_glfwSetJoystickCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickCallback", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwUpdateGamepadMappings(const char* string);
    /// ```
    public static boolean glfwUpdateGamepadMappings(MemorySegment string) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwUpdateGamepadMappings", string); }
        return (((int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(Handles.get().PFN_glfwUpdateGamepadMappings, string)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    /// ```
    /// const char* glfwGetGamepadName(int jid);
    /// ```
    public static MemorySegment glfwGetGamepadName(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGamepadName", jid); }
        return (MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(Handles.get().PFN_glfwGetGamepadName, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwGetGamepadState(int jid, GLFWgamepadstate* state);
    /// ```
    public static boolean glfwGetGamepadState(int jid, MemorySegment state) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGamepadState", jid, state); }
        return (((int) Handles.MH_glfwGetGamepadState.invokeExact(Handles.get().PFN_glfwGetGamepadState, jid, state)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    /// ```
    /// void glfwSetClipboardString(GLFWwindow* window, const char* string);
    /// ```
    public static void glfwSetClipboardString(MemorySegment window, MemorySegment string) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetClipboardString", window, string); }
        Handles.MH_glfwSetClipboardString.invokeExact(Handles.get().PFN_glfwSetClipboardString, window, string); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    /// ```
    /// const char* glfwGetClipboardString(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetClipboardString(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetClipboardString", window); }
        return (MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(Handles.get().PFN_glfwGetClipboardString, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    /// ```
    /// double glfwGetTime();
    /// ```
    public static double glfwGetTime() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTime"); }
        return (double) Handles.MH_glfwGetTime.invokeExact(Handles.get().PFN_glfwGetTime); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTime", e); }
    }

    /// ```
    /// void glfwSetTime(double time);
    /// ```
    public static void glfwSetTime(double time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetTime", time); }
        Handles.MH_glfwSetTime.invokeExact(Handles.get().PFN_glfwSetTime, time); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetTime", e); }
    }

    /// ```
    /// uint64_t glfwGetTimerValue();
    /// ```
    public static long glfwGetTimerValue() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTimerValue"); }
        return (long) Handles.MH_glfwGetTimerValue.invokeExact(Handles.get().PFN_glfwGetTimerValue); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerValue", e); }
    }

    /// ```
    /// uint64_t glfwGetTimerFrequency();
    /// ```
    public static long glfwGetTimerFrequency() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTimerFrequency"); }
        return (long) Handles.MH_glfwGetTimerFrequency.invokeExact(Handles.get().PFN_glfwGetTimerFrequency); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerFrequency", e); }
    }

    /// ```
    /// void glfwMakeContextCurrent(GLFWwindow* window);
    /// ```
    public static void glfwMakeContextCurrent(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwMakeContextCurrent", window); }
        Handles.MH_glfwMakeContextCurrent.invokeExact(Handles.get().PFN_glfwMakeContextCurrent, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwMakeContextCurrent", e); }
    }

    /// ```
    /// GLFWwindow* glfwGetCurrentContext();
    /// ```
    public static MemorySegment glfwGetCurrentContext() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCurrentContext"); }
        return (MemorySegment) Handles.MH_glfwGetCurrentContext.invokeExact(Handles.get().PFN_glfwGetCurrentContext); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCurrentContext", e); }
    }

    /// ```
    /// void glfwSwapBuffers(GLFWwindow* window);
    /// ```
    public static void glfwSwapBuffers(MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSwapBuffers", window); }
        Handles.MH_glfwSwapBuffers.invokeExact(Handles.get().PFN_glfwSwapBuffers, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSwapBuffers", e); }
    }

    /// ```
    /// void glfwSwapInterval(int interval);
    /// ```
    public static void glfwSwapInterval(int interval) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSwapInterval", interval); }
        Handles.MH_glfwSwapInterval.invokeExact(Handles.get().PFN_glfwSwapInterval, interval); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSwapInterval", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwExtensionSupported(const char* extension);
    /// ```
    public static boolean glfwExtensionSupported(MemorySegment extension) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwExtensionSupported", extension); }
        return (((int) Handles.MH_glfwExtensionSupported.invokeExact(Handles.get().PFN_glfwExtensionSupported, extension)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    /// ```
    /// (void*) GLFWglproc glfwGetProcAddress(const char* procname);
    /// ```
    public static MemorySegment glfwGetProcAddress(MemorySegment procname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetProcAddress", procname); }
        return (MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(Handles.get().PFN_glfwGetProcAddress, procname); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwVulkanSupported();
    /// ```
    public static boolean glfwVulkanSupported() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwVulkanSupported"); }
        return (((int) Handles.MH_glfwVulkanSupported.invokeExact(Handles.get().PFN_glfwVulkanSupported)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwVulkanSupported", e); }
    }

    /// ```
    /// const char** glfwGetRequiredInstanceExtensions(uint32_t* count);
    /// ```
    public static MemorySegment glfwGetRequiredInstanceExtensions(MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetRequiredInstanceExtensions", count); }
        return (MemorySegment) Handles.MH_glfwGetRequiredInstanceExtensions.invokeExact(Handles.get().PFN_glfwGetRequiredInstanceExtensions, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetRequiredInstanceExtensions", e); }
    }

    /// ```
    /// (void*) GLFWvkproc glfwGetInstanceProcAddress((void*) VkInstance instance, const char* procname);
    /// ```
    public static MemorySegment glfwGetInstanceProcAddress(MemorySegment instance, MemorySegment procname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetInstanceProcAddress", instance, procname); }
        return (MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(Handles.get().PFN_glfwGetInstanceProcAddress, instance, procname); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    /// ```
    /// (int) GLFWboolean glfwGetPhysicalDevicePresentationSupport((void*) VkInstance instance, (void*) VkPhysicalDevice device, uint32_t queuefamily);
    /// ```
    public static boolean glfwGetPhysicalDevicePresentationSupport(MemorySegment instance, MemorySegment device, int queuefamily) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPhysicalDevicePresentationSupport", instance, device, queuefamily); }
        return (((int) Handles.MH_glfwGetPhysicalDevicePresentationSupport.invokeExact(Handles.get().PFN_glfwGetPhysicalDevicePresentationSupport, instance, device, queuefamily)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPhysicalDevicePresentationSupport", e); }
    }

    /// ```
    /// (int) VkResult glfwCreateWindowSurface((void*) VkInstance instance, GLFWwindow* window, const VkAllocationCallbacks* allocator, VkSurfaceKHR* surface);
    /// ```
    public static int glfwCreateWindowSurface(MemorySegment instance, MemorySegment window, MemorySegment allocator, MemorySegment surface) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateWindowSurface", instance, window, allocator, surface); }
        return (int) Handles.MH_glfwCreateWindowSurface.invokeExact(Handles.get().PFN_glfwCreateWindowSurface, instance, window, allocator, surface); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindowSurface", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFW() {
    }

    /**
     * Converts the given error code to a readable string.
     * <p>
     * This method is created by OverrunGL and does not belong to the original GLFW library.
     *
     * @param errorCode the error code.
     * @return the error string.
     */
    public static String glfwGetErrorString(int errorCode) {
        return switch (errorCode) {
            case GLFW_NO_ERROR -> "NO_ERROR";
            case GLFW_NOT_INITIALIZED -> "NOT_INITIALIZED";
            case GLFW_NO_CURRENT_CONTEXT -> "NO_CURRENT_CONTEXT";
            case GLFW_INVALID_ENUM -> "INVALID_ENUM";
            case GLFW_INVALID_VALUE -> "INVALID_VALUE";
            case GLFW_OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case GLFW_API_UNAVAILABLE -> "API_UNAVAILABLE";
            case GLFW_VERSION_UNAVAILABLE -> "VERSION_UNAVAILABLE";
            case GLFW_PLATFORM_ERROR -> "PLATFORM_ERROR";
            case GLFW_FORMAT_UNAVAILABLE -> "FORMAT_UNAVAILABLE";
            case GLFW_NO_WINDOW_CONTEXT -> "NO_WINDOW_CONTEXT";
            case GLFW_CURSOR_UNAVAILABLE -> "CURSOR_UNAVAILABLE";
            case GLFW_FEATURE_UNAVAILABLE -> "FEATURE_UNAVAILABLE";
            case GLFW_FEATURE_UNIMPLEMENTED -> "FEATURE_UNIMPLEMENTED";
            case GLFW_PLATFORM_UNAVAILABLE -> "PLATFORM_UNAVAILABLE";
            default -> unknownToken(errorCode);
        };
    }

    /**
     * Converts the given platform code to a debug string.
     * <p>
     * This method is created by OverrunGL and does not belong to the original GLFW library.
     *
     * @param platformCode the platform code.
     * @return the platform string.
     */
    public static String glfwGetPlatformDebugString(int platformCode) {
        return switch (platformCode) {
            case GLFW_PLATFORM_WIN32 -> "PLATFORM_WIN32";
            case GLFW_PLATFORM_COCOA -> "PLATFORM_COCOA";
            case GLFW_PLATFORM_WAYLAND -> "PLATFORM_WAYLAND";
            case GLFW_PLATFORM_X11 -> "PLATFORM_X11";
            case GLFW_PLATFORM_NULL -> "PLATFORM_NULL";
            default -> unknownToken(platformCode);
        };
    }

    /**
     * Converts the given platform code to a readable string.
     * <p>
     * This method is created by OverrunGL and does not belong to the original GLFW library.
     *
     * @param platformCode the platform code.
     * @return the platform string.
     */
    public static String glfwGetPlatformString(int platformCode) {
        return switch (platformCode) {
            case GLFW_PLATFORM_WIN32 -> "Win32";
            case GLFW_PLATFORM_COCOA -> "Cocoa";
            case GLFW_PLATFORM_WAYLAND -> "Wayland";
            case GLFW_PLATFORM_X11 -> "X11";
            case GLFW_PLATFORM_NULL -> "Null";
            default -> unknownToken(platformCode);
        };
    }
}
