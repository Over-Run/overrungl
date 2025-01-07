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

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

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
    public static final int
        GLFW_VERSION_MAJOR = 3,
        GLFW_VERSION_MINOR = 5,
        GLFW_VERSION_REVISION = 0;
    public static final int GLFW_TRUE = 1;
    public static final int GLFW_FALSE = 0;
    public static final int
        GLFW_RELEASE = 0,
        GLFW_PRESS = 1,
        GLFW_REPEAT = 2;
    public static final int
        GLFW_HAT_CENTERED = 0,
        GLFW_HAT_UP = 1,
        GLFW_HAT_RIGHT = 2,
        GLFW_HAT_DOWN = 4,
        GLFW_HAT_LEFT = 8,
        GLFW_HAT_RIGHT_UP = (GLFW_HAT_RIGHT | GLFW_HAT_UP),
        GLFW_HAT_RIGHT_DOWN = (GLFW_HAT_RIGHT | GLFW_HAT_DOWN),
        GLFW_HAT_LEFT_UP = (GLFW_HAT_LEFT | GLFW_HAT_UP),
        GLFW_HAT_LEFT_DOWN = (GLFW_HAT_LEFT | GLFW_HAT_DOWN);
    public static final int GLFW_KEY_UNKNOWN = -1;
    public static final int
        GLFW_KEY_SPACE = 32,
        GLFW_KEY_APOSTROPHE = 39,
        GLFW_KEY_COMMA = 44,
        GLFW_KEY_MINUS = 45,
        GLFW_KEY_PERIOD = 46,
        GLFW_KEY_SLASH = 47,
        GLFW_KEY_0 = 48,
        GLFW_KEY_1 = 49,
        GLFW_KEY_2 = 50,
        GLFW_KEY_3 = 51,
        GLFW_KEY_4 = 52,
        GLFW_KEY_5 = 53,
        GLFW_KEY_6 = 54,
        GLFW_KEY_7 = 55,
        GLFW_KEY_8 = 56,
        GLFW_KEY_9 = 57,
        GLFW_KEY_SEMICOLON = 59,
        GLFW_KEY_EQUAL = 61,
        GLFW_KEY_A = 65,
        GLFW_KEY_B = 66,
        GLFW_KEY_C = 67,
        GLFW_KEY_D = 68,
        GLFW_KEY_E = 69,
        GLFW_KEY_F = 70,
        GLFW_KEY_G = 71,
        GLFW_KEY_H = 72,
        GLFW_KEY_I = 73,
        GLFW_KEY_J = 74,
        GLFW_KEY_K = 75,
        GLFW_KEY_L = 76,
        GLFW_KEY_M = 77,
        GLFW_KEY_N = 78,
        GLFW_KEY_O = 79,
        GLFW_KEY_P = 80,
        GLFW_KEY_Q = 81,
        GLFW_KEY_R = 82,
        GLFW_KEY_S = 83,
        GLFW_KEY_T = 84,
        GLFW_KEY_U = 85,
        GLFW_KEY_V = 86,
        GLFW_KEY_W = 87,
        GLFW_KEY_X = 88,
        GLFW_KEY_Y = 89,
        GLFW_KEY_Z = 90,
        GLFW_KEY_LEFT_BRACKET = 91,
        GLFW_KEY_BACKSLASH = 92,
        GLFW_KEY_RIGHT_BRACKET = 93,
        GLFW_KEY_GRAVE_ACCENT = 96,
        GLFW_KEY_WORLD_1 = 161,
        GLFW_KEY_WORLD_2 = 162;
    public static final int
        GLFW_KEY_ESCAPE = 256,
        GLFW_KEY_ENTER = 257,
        GLFW_KEY_TAB = 258,
        GLFW_KEY_BACKSPACE = 259,
        GLFW_KEY_INSERT = 260,
        GLFW_KEY_DELETE = 261,
        GLFW_KEY_RIGHT = 262,
        GLFW_KEY_LEFT = 263,
        GLFW_KEY_DOWN = 264,
        GLFW_KEY_UP = 265,
        GLFW_KEY_PAGE_UP = 266,
        GLFW_KEY_PAGE_DOWN = 267,
        GLFW_KEY_HOME = 268,
        GLFW_KEY_END = 269,
        GLFW_KEY_CAPS_LOCK = 280,
        GLFW_KEY_SCROLL_LOCK = 281,
        GLFW_KEY_NUM_LOCK = 282,
        GLFW_KEY_PRINT_SCREEN = 283,
        GLFW_KEY_PAUSE = 284,
        GLFW_KEY_F1 = 290,
        GLFW_KEY_F2 = 291,
        GLFW_KEY_F3 = 292,
        GLFW_KEY_F4 = 293,
        GLFW_KEY_F5 = 294,
        GLFW_KEY_F6 = 295,
        GLFW_KEY_F7 = 296,
        GLFW_KEY_F8 = 297,
        GLFW_KEY_F9 = 298,
        GLFW_KEY_F10 = 299,
        GLFW_KEY_F11 = 300,
        GLFW_KEY_F12 = 301,
        GLFW_KEY_F13 = 302,
        GLFW_KEY_F14 = 303,
        GLFW_KEY_F15 = 304,
        GLFW_KEY_F16 = 305,
        GLFW_KEY_F17 = 306,
        GLFW_KEY_F18 = 307,
        GLFW_KEY_F19 = 308,
        GLFW_KEY_F20 = 309,
        GLFW_KEY_F21 = 310,
        GLFW_KEY_F22 = 311,
        GLFW_KEY_F23 = 312,
        GLFW_KEY_F24 = 313,
        GLFW_KEY_F25 = 314,
        GLFW_KEY_KP_0 = 320,
        GLFW_KEY_KP_1 = 321,
        GLFW_KEY_KP_2 = 322,
        GLFW_KEY_KP_3 = 323,
        GLFW_KEY_KP_4 = 324,
        GLFW_KEY_KP_5 = 325,
        GLFW_KEY_KP_6 = 326,
        GLFW_KEY_KP_7 = 327,
        GLFW_KEY_KP_8 = 328,
        GLFW_KEY_KP_9 = 329,
        GLFW_KEY_KP_DECIMAL = 330,
        GLFW_KEY_KP_DIVIDE = 331,
        GLFW_KEY_KP_MULTIPLY = 332,
        GLFW_KEY_KP_SUBTRACT = 333,
        GLFW_KEY_KP_ADD = 334,
        GLFW_KEY_KP_ENTER = 335,
        GLFW_KEY_KP_EQUAL = 336,
        GLFW_KEY_LEFT_SHIFT = 340,
        GLFW_KEY_LEFT_CONTROL = 341,
        GLFW_KEY_LEFT_ALT = 342,
        GLFW_KEY_LEFT_SUPER = 343,
        GLFW_KEY_RIGHT_SHIFT = 344,
        GLFW_KEY_RIGHT_CONTROL = 345,
        GLFW_KEY_RIGHT_ALT = 346,
        GLFW_KEY_RIGHT_SUPER = 347,
        GLFW_KEY_MENU = 348;
    public static final int GLFW_KEY_LAST = GLFW_KEY_MENU;
    public static final int
        GLFW_MOD_SHIFT = 0x0001,
        GLFW_MOD_CONTROL = 0x0002,
        GLFW_MOD_ALT = 0x0004,
        GLFW_MOD_SUPER = 0x0008,
        GLFW_MOD_CAPS_LOCK = 0x0010,
        GLFW_MOD_NUM_LOCK = 0x0020;
    public static final int
        GLFW_MOUSE_BUTTON_1 = 0,
        GLFW_MOUSE_BUTTON_2 = 1,
        GLFW_MOUSE_BUTTON_3 = 2,
        GLFW_MOUSE_BUTTON_4 = 3,
        GLFW_MOUSE_BUTTON_5 = 4,
        GLFW_MOUSE_BUTTON_6 = 5,
        GLFW_MOUSE_BUTTON_7 = 6,
        GLFW_MOUSE_BUTTON_8 = 7,
        GLFW_MOUSE_BUTTON_LAST = GLFW_MOUSE_BUTTON_8,
        GLFW_MOUSE_BUTTON_LEFT = GLFW_MOUSE_BUTTON_1,
        GLFW_MOUSE_BUTTON_RIGHT = GLFW_MOUSE_BUTTON_2,
        GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;
    public static final int
        GLFW_JOYSTICK_1 = 0,
        GLFW_JOYSTICK_2 = 1,
        GLFW_JOYSTICK_3 = 2,
        GLFW_JOYSTICK_4 = 3,
        GLFW_JOYSTICK_5 = 4,
        GLFW_JOYSTICK_6 = 5,
        GLFW_JOYSTICK_7 = 6,
        GLFW_JOYSTICK_8 = 7,
        GLFW_JOYSTICK_9 = 8,
        GLFW_JOYSTICK_10 = 9,
        GLFW_JOYSTICK_11 = 10,
        GLFW_JOYSTICK_12 = 11,
        GLFW_JOYSTICK_13 = 12,
        GLFW_JOYSTICK_14 = 13,
        GLFW_JOYSTICK_15 = 14,
        GLFW_JOYSTICK_16 = 15,
        GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;
    public static final int
        GLFW_GAMEPAD_BUTTON_A = 0,
        GLFW_GAMEPAD_BUTTON_B = 1,
        GLFW_GAMEPAD_BUTTON_X = 2,
        GLFW_GAMEPAD_BUTTON_Y = 3,
        GLFW_GAMEPAD_BUTTON_LEFT_BUMPER = 4,
        GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5,
        GLFW_GAMEPAD_BUTTON_BACK = 6,
        GLFW_GAMEPAD_BUTTON_START = 7,
        GLFW_GAMEPAD_BUTTON_GUIDE = 8,
        GLFW_GAMEPAD_BUTTON_LEFT_THUMB = 9,
        GLFW_GAMEPAD_BUTTON_RIGHT_THUMB = 10,
        GLFW_GAMEPAD_BUTTON_DPAD_UP = 11,
        GLFW_GAMEPAD_BUTTON_DPAD_RIGHT = 12,
        GLFW_GAMEPAD_BUTTON_DPAD_DOWN = 13,
        GLFW_GAMEPAD_BUTTON_DPAD_LEFT = 14,
        GLFW_GAMEPAD_BUTTON_LAST = GLFW_GAMEPAD_BUTTON_DPAD_LEFT,
        GLFW_GAMEPAD_BUTTON_CROSS = GLFW_GAMEPAD_BUTTON_A,
        GLFW_GAMEPAD_BUTTON_CIRCLE = GLFW_GAMEPAD_BUTTON_B,
        GLFW_GAMEPAD_BUTTON_SQUARE = GLFW_GAMEPAD_BUTTON_X,
        GLFW_GAMEPAD_BUTTON_TRIANGLE = GLFW_GAMEPAD_BUTTON_Y;
    public static final int
        GLFW_GAMEPAD_AXIS_LEFT_X = 0,
        GLFW_GAMEPAD_AXIS_LEFT_Y = 1,
        GLFW_GAMEPAD_AXIS_RIGHT_X = 2,
        GLFW_GAMEPAD_AXIS_RIGHT_Y = 3,
        GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4,
        GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        GLFW_GAMEPAD_AXIS_LAST = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;
    public static final int
        GLFW_NO_ERROR = 0,
        GLFW_NOT_INITIALIZED = 0x00010001,
        GLFW_NO_CURRENT_CONTEXT = 0x00010002,
        GLFW_INVALID_ENUM = 0x00010003,
        GLFW_INVALID_VALUE = 0x00010004,
        GLFW_OUT_OF_MEMORY = 0x00010005,
        GLFW_API_UNAVAILABLE = 0x00010006,
        GLFW_VERSION_UNAVAILABLE = 0x00010007,
        GLFW_PLATFORM_ERROR = 0x00010008,
        GLFW_FORMAT_UNAVAILABLE = 0x00010009,
        GLFW_NO_WINDOW_CONTEXT = 0x0001000A,
        GLFW_CURSOR_UNAVAILABLE = 0x0001000B,
        GLFW_FEATURE_UNAVAILABLE = 0x0001000C,
        GLFW_FEATURE_UNIMPLEMENTED = 0x0001000D,
        GLFW_PLATFORM_UNAVAILABLE = 0x0001000E;
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
    public static final int
        GLFW_NO_API = 0,
        GLFW_OPENGL_API = 0x00030001,
        GLFW_OPENGL_ES_API = 0x00030002;
    public static final int
        GLFW_NO_ROBUSTNESS = 0,
        GLFW_NO_RESET_NOTIFICATION = 0x00031001,
        GLFW_LOSE_CONTEXT_ON_RESET = 0x00031002;
    public static final int
        GLFW_OPENGL_ANY_PROFILE = 0,
        GLFW_OPENGL_CORE_PROFILE = 0x00032001,
        GLFW_OPENGL_COMPAT_PROFILE = 0x00032002;
    public static final int
        GLFW_CURSOR = 0x00033001,
        GLFW_STICKY_KEYS = 0x00033002,
        GLFW_STICKY_MOUSE_BUTTONS = 0x00033003,
        GLFW_LOCK_KEY_MODS = 0x00033004,
        GLFW_RAW_MOUSE_MOTION = 0x00033005,
        GLFW_UNLIMITED_MOUSE_BUTTONS = 0x00033006;
    public static final int
        GLFW_CURSOR_NORMAL = 0x00034001,
        GLFW_CURSOR_HIDDEN = 0x00034002,
        GLFW_CURSOR_DISABLED = 0x00034003,
        GLFW_CURSOR_CAPTURED = 0x00034004;
    public static final int
        GLFW_ANY_RELEASE_BEHAVIOR = 0,
        GLFW_RELEASE_BEHAVIOR_FLUSH = 0x00035001,
        GLFW_RELEASE_BEHAVIOR_NONE = 0x00035002;
    public static final int
        GLFW_NATIVE_CONTEXT_API = 0x00036001,
        GLFW_EGL_CONTEXT_API = 0x00036002,
        GLFW_OSMESA_CONTEXT_API = 0x00036003;
    public static final int
        GLFW_ANGLE_PLATFORM_TYPE_NONE = 0x00037001,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGL = 0x00037002,
        GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x00037003,
        GLFW_ANGLE_PLATFORM_TYPE_D3D9 = 0x00037004,
        GLFW_ANGLE_PLATFORM_TYPE_D3D11 = 0x00037005,
        GLFW_ANGLE_PLATFORM_TYPE_VULKAN = 0x00037007,
        GLFW_ANGLE_PLATFORM_TYPE_METAL = 0x00037008;
    public static final int
        GLFW_WAYLAND_PREFER_LIBDECOR = 0x00038001,
        GLFW_WAYLAND_DISABLE_LIBDECOR = 0x00038002;
    public static final int
        GLFW_ANY_POSITION = 0x80000000;
    public static final int
        GLFW_ARROW_CURSOR = 0x00036001,
        GLFW_IBEAM_CURSOR = 0x00036002,
        GLFW_CROSSHAIR_CURSOR = 0x00036003,
        GLFW_POINTING_HAND_CURSOR = 0x00036004,
        GLFW_RESIZE_EW_CURSOR = 0x00036005,
        GLFW_RESIZE_NS_CURSOR = 0x00036006,
        GLFW_RESIZE_NWSE_CURSOR = 0x00036007,
        GLFW_RESIZE_NESW_CURSOR = 0x00036008,
        GLFW_RESIZE_ALL_CURSOR = 0x00036009,
        GLFW_NOT_ALLOWED_CURSOR = 0x0003600A,
        GLFW_HRESIZE_CURSOR = GLFW_RESIZE_EW_CURSOR,
        GLFW_VRESIZE_CURSOR = GLFW_RESIZE_NS_CURSOR,
        GLFW_HAND_CURSOR = GLFW_POINTING_HAND_CURSOR;
    public static final int GLFW_CONNECTED = 0x00040001;
    public static final int GLFW_DISCONNECTED = 0x00040002;
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x00050001;
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x00050002;
    public static final int GLFW_PLATFORM = 0x00050003;
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x00051001;
    public static final int GLFW_COCOA_MENUBAR = 0x00051002;
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x00052001;
    public static final int GLFW_WAYLAND_LIBDECOR = 0x00053001;
    public static final int
        GLFW_ANY_PLATFORM = 0x00060000,
        GLFW_PLATFORM_WIN32 = 0x00060001,
        GLFW_PLATFORM_COCOA = 0x00060002,
        GLFW_PLATFORM_WAYLAND = 0x00060003,
        GLFW_PLATFORM_X11 = 0x00060004,
        GLFW_PLATFORM_NULL = 0x00060005;
    public static final int GLFW_DONT_CARE = -1;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `glfwInit`.
        public static final MethodHandle MH_glfwInit = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwInit", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwTerminate`.
        public static final MethodHandle MH_glfwTerminate = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwTerminate", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwInitHint`.
        public static final MethodHandle MH_glfwInitHint = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwInitHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwInitAllocator`.
        public static final MethodHandle MH_glfwInitAllocator = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwInitAllocator", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWAllocator.LAYOUT)));
        /// The method handle of `glfwGetVersion`.
        public static final MethodHandle MH_glfwGetVersion = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetVersion", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersionString`.
        public static final MethodHandle MH_glfwGetVersionString = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetVersionString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetError`.
        public static final MethodHandle MH_glfwGetError = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetErrorCallback`.
        public static final MethodHandle MH_glfwSetErrorCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetErrorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPlatform`.
        public static final MethodHandle MH_glfwGetPlatform = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetPlatform", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwPlatformSupported`.
        public static final MethodHandle MH_glfwPlatformSupported = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwPlatformSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMonitors`.
        public static final MethodHandle MH_glfwGetMonitors = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitors", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPrimaryMonitor`.
        public static final MethodHandle MH_glfwGetPrimaryMonitor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetPrimaryMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPos`.
        public static final MethodHandle MH_glfwGetMonitorPos = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorWorkarea`.
        public static final MethodHandle MH_glfwGetMonitorWorkarea = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorWorkarea", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPhysicalSize`.
        public static final MethodHandle MH_glfwGetMonitorPhysicalSize = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorPhysicalSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorContentScale`.
        public static final MethodHandle MH_glfwGetMonitorContentScale = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorName`.
        public static final MethodHandle MH_glfwGetMonitorName = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorUserPointer`.
        public static final MethodHandle MH_glfwSetMonitorUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetMonitorUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorUserPointer`.
        public static final MethodHandle MH_glfwGetMonitorUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMonitorUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorCallback`.
        public static final MethodHandle MH_glfwSetMonitorCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetMonitorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoModes`.
        public static final MethodHandle MH_glfwGetVideoModes = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetVideoModes", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoMode`.
        public static final MethodHandle MH_glfwGetVideoMode = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetVideoMode", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWVidMode.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGamma`.
        public static final MethodHandle MH_glfwSetGamma = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetGamma", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwGetGammaRamp`.
        public static final MethodHandle MH_glfwGetGammaRamp = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetGammaRamp", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGammaRamp`.
        public static final MethodHandle MH_glfwSetGammaRamp = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetGammaRamp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT)));
        /// The method handle of `glfwDefaultWindowHints`.
        public static final MethodHandle MH_glfwDefaultWindowHints = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwDefaultWindowHints", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWindowHint`.
        public static final MethodHandle MH_glfwWindowHint = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwWindowHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwWindowHintString`.
        public static final MethodHandle MH_glfwWindowHintString = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwWindowHintString", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwCreateWindow`.
        public static final MethodHandle MH_glfwCreateWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwCreateWindow", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwDestroyWindow`.
        public static final MethodHandle MH_glfwDestroyWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwDestroyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwWindowShouldClose`.
        public static final MethodHandle MH_glfwWindowShouldClose = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwWindowShouldClose", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowShouldClose`.
        public static final MethodHandle MH_glfwSetWindowShouldClose = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowShouldClose", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowTitle`.
        public static final MethodHandle MH_glfwGetWindowTitle = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowTitle", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowTitle`.
        public static final MethodHandle MH_glfwSetWindowTitle = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowTitle", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwSetWindowIcon`.
        public static final MethodHandle MH_glfwSetWindowIcon = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowIcon", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT)));
        /// The method handle of `glfwGetWindowPos`.
        public static final MethodHandle MH_glfwGetWindowPos = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPos`.
        public static final MethodHandle MH_glfwSetWindowPos = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowSize`.
        public static final MethodHandle MH_glfwGetWindowSize = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeLimits`.
        public static final MethodHandle MH_glfwSetWindowSizeLimits = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowSizeLimits", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAspectRatio`.
        public static final MethodHandle MH_glfwSetWindowAspectRatio = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowAspectRatio", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowSize`.
        public static final MethodHandle MH_glfwSetWindowSize = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetFramebufferSize`.
        public static final MethodHandle MH_glfwGetFramebufferSize = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetFramebufferSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowFrameSize`.
        public static final MethodHandle MH_glfwGetWindowFrameSize = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowFrameSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowContentScale`.
        public static final MethodHandle MH_glfwGetWindowContentScale = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowOpacity`.
        public static final MethodHandle MH_glfwGetWindowOpacity = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowOpacity", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowOpacity`.
        public static final MethodHandle MH_glfwSetWindowOpacity = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowOpacity", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwIconifyWindow`.
        public static final MethodHandle MH_glfwIconifyWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwIconifyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRestoreWindow`.
        public static final MethodHandle MH_glfwRestoreWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwRestoreWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwMaximizeWindow`.
        public static final MethodHandle MH_glfwMaximizeWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwMaximizeWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwShowWindow`.
        public static final MethodHandle MH_glfwShowWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwShowWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwHideWindow`.
        public static final MethodHandle MH_glfwHideWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwHideWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwFocusWindow`.
        public static final MethodHandle MH_glfwFocusWindow = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwFocusWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRequestWindowAttention`.
        public static final MethodHandle MH_glfwRequestWindowAttention = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwRequestWindowAttention", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowMonitor`.
        public static final MethodHandle MH_glfwGetWindowMonitor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMonitor`.
        public static final MethodHandle MH_glfwSetWindowMonitor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowMonitor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowAttrib`.
        public static final MethodHandle MH_glfwGetWindowAttrib = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowAttrib", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAttrib`.
        public static final MethodHandle MH_glfwSetWindowAttrib = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowAttrib", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowUserPointer`.
        public static final MethodHandle MH_glfwSetWindowUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowUserPointer`.
        public static final MethodHandle MH_glfwGetWindowUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetWindowUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPosCallback`.
        public static final MethodHandle MH_glfwSetWindowPosCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowPosCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeCallback`.
        public static final MethodHandle MH_glfwSetWindowSizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowCloseCallback`.
        public static final MethodHandle MH_glfwSetWindowCloseCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowCloseCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowRefreshCallback`.
        public static final MethodHandle MH_glfwSetWindowRefreshCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowRefreshCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowFocusCallback`.
        public static final MethodHandle MH_glfwSetWindowFocusCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowFocusCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowIconifyCallback`.
        public static final MethodHandle MH_glfwSetWindowIconifyCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowIconifyCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMaximizeCallback`.
        public static final MethodHandle MH_glfwSetWindowMaximizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowMaximizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetFramebufferSizeCallback`.
        public static final MethodHandle MH_glfwSetFramebufferSizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetFramebufferSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowContentScaleCallback`.
        public static final MethodHandle MH_glfwSetWindowContentScaleCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetWindowContentScaleCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwPollEvents`.
        public static final MethodHandle MH_glfwPollEvents = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwPollEvents", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEvents`.
        public static final MethodHandle MH_glfwWaitEvents = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwWaitEvents", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEventsTimeout`.
        public static final MethodHandle MH_glfwWaitEventsTimeout = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwWaitEventsTimeout", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwPostEmptyEvent`.
        public static final MethodHandle MH_glfwPostEmptyEvent = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwPostEmptyEvent", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwGetInputMode`.
        public static final MethodHandle MH_glfwGetInputMode = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetInputMode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetInputMode`.
        public static final MethodHandle MH_glfwSetInputMode = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetInputMode", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwRawMouseMotionSupported`.
        public static final MethodHandle MH_glfwRawMouseMotionSupported = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwRawMouseMotionSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyName`.
        public static final MethodHandle MH_glfwGetKeyName = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetKeyName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyScancode`.
        public static final MethodHandle MH_glfwGetKeyScancode = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetKeyScancode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKey`.
        public static final MethodHandle MH_glfwGetKey = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetKey", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMouseButton`.
        public static final MethodHandle MH_glfwGetMouseButton = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetMouseButton", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetCursorPos`.
        public static final MethodHandle MH_glfwGetCursorPos = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPos`.
        public static final MethodHandle MH_glfwSetCursorPos = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwCreateCursor`.
        public static final MethodHandle MH_glfwCreateCursor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwCreateCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateStandardCursor`.
        public static final MethodHandle MH_glfwCreateStandardCursor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwCreateStandardCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwDestroyCursor`.
        public static final MethodHandle MH_glfwDestroyCursor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwDestroyCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursor`.
        public static final MethodHandle MH_glfwSetCursor = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetKeyCallback`.
        public static final MethodHandle MH_glfwSetKeyCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetKeyCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCharCallback`.
        public static final MethodHandle MH_glfwSetCharCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetCharCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMouseButtonCallback`.
        public static final MethodHandle MH_glfwSetMouseButtonCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetMouseButtonCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPosCallback`.
        public static final MethodHandle MH_glfwSetCursorPosCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetCursorPosCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorEnterCallback`.
        public static final MethodHandle MH_glfwSetCursorEnterCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetCursorEnterCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetScrollCallback`.
        public static final MethodHandle MH_glfwSetScrollCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetScrollCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetDropCallback`.
        public static final MethodHandle MH_glfwSetDropCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetDropCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwJoystickPresent`.
        public static final MethodHandle MH_glfwJoystickPresent = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwJoystickPresent", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickAxes`.
        public static final MethodHandle MH_glfwGetJoystickAxes = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickAxes", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickButtons`.
        public static final MethodHandle MH_glfwGetJoystickButtons = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickButtons", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickHats`.
        public static final MethodHandle MH_glfwGetJoystickHats = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickHats", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickName`.
        public static final MethodHandle MH_glfwGetJoystickName = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickGUID`.
        public static final MethodHandle MH_glfwGetJoystickGUID = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickGUID", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickUserPointer`.
        public static final MethodHandle MH_glfwSetJoystickUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetJoystickUserPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickUserPointer`.
        public static final MethodHandle MH_glfwGetJoystickUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetJoystickUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwJoystickIsGamepad`.
        public static final MethodHandle MH_glfwJoystickIsGamepad = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwJoystickIsGamepad", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickCallback`.
        public static final MethodHandle MH_glfwSetJoystickCallback = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetJoystickCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwUpdateGamepadMappings`.
        public static final MethodHandle MH_glfwUpdateGamepadMappings = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwUpdateGamepadMappings", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetGamepadName`.
        public static final MethodHandle MH_glfwGetGamepadName = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetGamepadName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetGamepadState`.
        public static final MethodHandle MH_glfwGetGamepadState = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetGamepadState", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGamepadState.LAYOUT)));
        /// The method handle of `glfwSetClipboardString`.
        public static final MethodHandle MH_glfwSetClipboardString = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetClipboardString", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetClipboardString`.
        public static final MethodHandle MH_glfwGetClipboardString = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetClipboardString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetTime`.
        public static final MethodHandle MH_glfwGetTime = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetTime", FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwSetTime`.
        public static final MethodHandle MH_glfwSetTime = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSetTime", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwGetTimerValue`.
        public static final MethodHandle MH_glfwGetTimerValue = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetTimerValue", FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwGetTimerFrequency`.
        public static final MethodHandle MH_glfwGetTimerFrequency = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetTimerFrequency", FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwMakeContextCurrent`.
        public static final MethodHandle MH_glfwMakeContextCurrent = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwMakeContextCurrent", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCurrentContext`.
        public static final MethodHandle MH_glfwGetCurrentContext = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetCurrentContext", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapBuffers`.
        public static final MethodHandle MH_glfwSwapBuffers = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSwapBuffers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapInterval`.
        public static final MethodHandle MH_glfwSwapInterval = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwSwapInterval", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `glfwExtensionSupported`.
        public static final MethodHandle MH_glfwExtensionSupported = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwExtensionSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetProcAddress`.
        public static final MethodHandle MH_glfwGetProcAddress = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwVulkanSupported`.
        public static final MethodHandle MH_glfwVulkanSupported = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwVulkanSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetRequiredInstanceExtensions`.
        public static final MethodHandle MH_glfwGetRequiredInstanceExtensions = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetRequiredInstanceExtensions", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    //endregion

    public static @CType("int") boolean glfwInit() {
        try {
            return (int) Handles.MH_glfwInit.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwInit", e); }
    }

    public static void glfwTerminate() {
        try {
            Handles.MH_glfwTerminate.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwTerminate", e); }
    }

    public static void glfwInitHint(@CType("int") int hint, @CType("int") int value) {
        try {
            Handles.MH_glfwInitHint.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitHint", e); }
    }

    public static void glfwInitAllocator(@CType("const GLFWallocator*") java.lang.foreign.MemorySegment allocator) {
        try {
            Handles.MH_glfwInitAllocator.invokeExact(allocator);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    public static void glfwInitAllocator(@CType("const GLFWallocator*") overrungl.glfw.GLFWAllocator allocator) {
        try {
            Handles.MH_glfwInitAllocator.invokeExact(Marshal.marshal(allocator));
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    public static void glfwGetVersion(@Out @CType("int*") java.lang.foreign.MemorySegment major, @Out @CType("int*") java.lang.foreign.MemorySegment minor, @Out @CType("int*") java.lang.foreign.MemorySegment rev) {
        try {
            Handles.MH_glfwGetVersion.invokeExact(major, minor, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    public static void glfwGetVersion(@Out @CType("int*") int[] major, @Out @CType("int*") int[] minor, @Out @CType("int*") int[] rev) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_major = Marshal.marshal(__overrungl_stack, major);
            var __overrungl_ref_minor = Marshal.marshal(__overrungl_stack, minor);
            var __overrungl_ref_rev = Marshal.marshal(__overrungl_stack, rev);
            Handles.MH_glfwGetVersion.invokeExact(__overrungl_ref_major, __overrungl_ref_minor, __overrungl_ref_rev);
            Unmarshal.copy(__overrungl_ref_major, major);
            Unmarshal.copy(__overrungl_ref_minor, minor);
            Unmarshal.copy(__overrungl_ref_rev, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetVersionString_() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVersionString.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetVersionString() {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetVersionString.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    public static @CType("int") int glfwGetError(@Out @CType("const char**") java.lang.foreign.MemorySegment description) {
        try {
            return (int) Handles.MH_glfwGetError.invokeExact(description);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    public static @CType("int") int glfwGetError(@Out @CType("const char**") java.lang.String[] description) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_description = Marshal.marshal(__overrungl_stack, description);
            var __overrungl_result = (int) Handles.MH_glfwGetError.invokeExact(__overrungl_ref_description);
            Unmarshal.copy(__overrungl_ref_description, description);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    public static @CType("GLFWerrorfun") java.lang.foreign.MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetErrorCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetErrorCallback", e); }
    }

    public static @CType("GLFWerrorfun") java.lang.foreign.MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") overrungl.glfw.GLFWErrorFun callback) {
        return glfwSetErrorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("int") int glfwGetPlatform() {
        try {
            return (int) Handles.MH_glfwGetPlatform.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPlatform", e); }
    }

    public static @CType("int") boolean glfwPlatformSupported(@CType("int") int platform) {
        try {
            return (int) Handles.MH_glfwPlatformSupported.invokeExact(platform) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwPlatformSupported", e); }
    }

    public static @CType("GLFWmonitor**") java.lang.foreign.MemorySegment glfwGetMonitors(@Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitors.invokeExact(count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitors", e); }
    }

    public static @CType("GLFWmonitor*") java.lang.foreign.MemorySegment glfwGetPrimaryMonitor() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetPrimaryMonitor.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPrimaryMonitor", e); }
    }

    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos) {
        try {
            Handles.MH_glfwGetMonitorPos.invokeExact(monitor, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetMonitorPos.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(monitor, xpos, ypos, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment widthMM, @Out @CType("int*") java.lang.foreign.MemorySegment heightMM) {
        try {
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, widthMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] widthMM, @Out @CType("int*") int[] heightMM) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_widthMM = Marshal.marshal(__overrungl_stack, widthMM);
            var __overrungl_ref_heightMM = Marshal.marshal(__overrungl_stack, heightMM);
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, __overrungl_ref_widthMM, __overrungl_ref_heightMM);
            Unmarshal.copy(__overrungl_ref_widthMM, widthMM);
            Unmarshal.copy(__overrungl_ref_heightMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("float*") java.lang.foreign.MemorySegment xscale, @Out @CType("float*") java.lang.foreign.MemorySegment yscale) {
        try {
            Handles.MH_glfwGetMonitorContentScale.invokeExact(monitor, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            Handles.MH_glfwGetMonitorContentScale.invokeExact(monitor, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetMonitorName_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetMonitorName(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    public static void glfwSetMonitorUserPointer(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            Handles.MH_glfwSetMonitorUserPointer.invokeExact(monitor, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorUserPointer", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetMonitorUserPointer(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorUserPointer.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorUserPointer", e); }
    }

    public static @CType("GLFWmonitorfun") java.lang.foreign.MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetMonitorCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorCallback", e); }
    }

    public static @CType("GLFWmonitorfun") java.lang.foreign.MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") overrungl.glfw.GLFWMonitorFun callback) {
        return glfwSetMonitorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("const GLFWvidmode*") java.lang.foreign.MemorySegment glfwGetVideoModes(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoModes.invokeExact(monitor, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoModes", e); }
    }

    public static @CType("const GLFWvidmode*") java.lang.foreign.MemorySegment glfwGetVideoMode_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    public static @CType("const GLFWvidmode*") overrungl.glfw.GLFWVidMode glfwGetVideoMode(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWVidMode.of((java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    public static void glfwSetGamma(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("float") float gamma) {
        try {
            Handles.MH_glfwSetGamma.invokeExact(monitor, gamma);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGamma", e); }
    }

    public static @CType("const GLFWgammaramp*") java.lang.foreign.MemorySegment glfwGetGammaRamp_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    public static @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp glfwGetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWGammaRamp.of((java.lang.foreign.MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("const GLFWgammaramp*") java.lang.foreign.MemorySegment ramp) {
        try {
            Handles.MH_glfwSetGammaRamp.invokeExact(monitor, ramp);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp ramp) {
        try {
            Handles.MH_glfwSetGammaRamp.invokeExact(monitor, Marshal.marshal(ramp));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    public static void glfwDefaultWindowHints() {
        try {
            Handles.MH_glfwDefaultWindowHints.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwDefaultWindowHints", e); }
    }

    public static void glfwWindowHint(@CType("int") int hint, @CType("int") int value) {
        try {
            Handles.MH_glfwWindowHint.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHint", e); }
    }

    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_glfwWindowHintString.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") java.lang.String value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwWindowHintString.invokeExact(hint, Marshal.marshal(__overrungl_stack, value));
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") java.lang.foreign.MemorySegment title, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("GLFWwindow*") java.lang.foreign.MemorySegment share) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(width, height, title, monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") java.lang.String title, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("GLFWwindow*") java.lang.foreign.MemorySegment share) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(width, height, Marshal.marshal(__overrungl_stack, title), monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    public static void glfwDestroyWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwDestroyWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyWindow", e); }
    }

    public static @CType("int") boolean glfwWindowShouldClose(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (int) Handles.MH_glfwWindowShouldClose.invokeExact(window) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowShouldClose", e); }
    }

    public static void glfwSetWindowShouldClose(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") boolean value) {
        try {
            Handles.MH_glfwSetWindowShouldClose.invokeExact(window, value ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowShouldClose", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWindowTitle_(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    public static void glfwSetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.foreign.MemorySegment title) {
        try {
            Handles.MH_glfwSetWindowTitle.invokeExact(window, title);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    public static void glfwSetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.String title) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetWindowTitle.invokeExact(window, Marshal.marshal(__overrungl_stack, title));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    public static void glfwSetWindowIcon(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") java.lang.foreign.MemorySegment images) {
        try {
            Handles.MH_glfwSetWindowIcon.invokeExact(window, count, images);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    public static void glfwSetWindowIcon(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") overrungl.glfw.GLFWImage images) {
        try {
            Handles.MH_glfwSetWindowIcon.invokeExact(window, count, Marshal.marshal(images));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    public static void glfwGetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos) {
        try {
            Handles.MH_glfwGetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    public static void glfwGetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetWindowPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    public static void glfwSetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int xpos, @CType("int") int ypos) {
        try {
            Handles.MH_glfwSetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPos", e); }
    }

    public static void glfwGetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            Handles.MH_glfwGetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    public static void glfwGetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetWindowSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    public static void glfwSetWindowSizeLimits(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int minwidth, @CType("int") int minheight, @CType("int") int maxwidth, @CType("int") int maxheight) {
        try {
            Handles.MH_glfwSetWindowSizeLimits.invokeExact(window, minwidth, minheight, maxwidth, maxheight);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeLimits", e); }
    }

    public static void glfwSetWindowAspectRatio(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int numer, @CType("int") int denom) {
        try {
            Handles.MH_glfwSetWindowAspectRatio.invokeExact(window, numer, denom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAspectRatio", e); }
    }

    public static void glfwSetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int width, @CType("int") int height) {
        try {
            Handles.MH_glfwSetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSize", e); }
    }

    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            Handles.MH_glfwGetFramebufferSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetFramebufferSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment left, @Out @CType("int*") java.lang.foreign.MemorySegment top, @Out @CType("int*") java.lang.foreign.MemorySegment right, @Out @CType("int*") java.lang.foreign.MemorySegment bottom) {
        try {
            Handles.MH_glfwGetWindowFrameSize.invokeExact(window, left, top, right, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] left, @Out @CType("int*") int[] top, @Out @CType("int*") int[] right, @Out @CType("int*") int[] bottom) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_left = Marshal.marshal(__overrungl_stack, left);
            var __overrungl_ref_top = Marshal.marshal(__overrungl_stack, top);
            var __overrungl_ref_right = Marshal.marshal(__overrungl_stack, right);
            var __overrungl_ref_bottom = Marshal.marshal(__overrungl_stack, bottom);
            Handles.MH_glfwGetWindowFrameSize.invokeExact(window, __overrungl_ref_left, __overrungl_ref_top, __overrungl_ref_right, __overrungl_ref_bottom);
            Unmarshal.copy(__overrungl_ref_left, left);
            Unmarshal.copy(__overrungl_ref_top, top);
            Unmarshal.copy(__overrungl_ref_right, right);
            Unmarshal.copy(__overrungl_ref_bottom, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("float*") java.lang.foreign.MemorySegment xscale, @Out @CType("float*") java.lang.foreign.MemorySegment yscale) {
        try {
            Handles.MH_glfwGetWindowContentScale.invokeExact(window, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            Handles.MH_glfwGetWindowContentScale.invokeExact(window, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    public static @CType("float") float glfwGetWindowOpacity(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (float) Handles.MH_glfwGetWindowOpacity.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowOpacity", e); }
    }

    public static void glfwSetWindowOpacity(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("float") float opacity) {
        try {
            Handles.MH_glfwSetWindowOpacity.invokeExact(window, opacity);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowOpacity", e); }
    }

    public static void glfwIconifyWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwIconifyWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwIconifyWindow", e); }
    }

    public static void glfwRestoreWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwRestoreWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRestoreWindow", e); }
    }

    public static void glfwMaximizeWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwMaximizeWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMaximizeWindow", e); }
    }

    public static void glfwShowWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwShowWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwShowWindow", e); }
    }

    public static void glfwHideWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwHideWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwHideWindow", e); }
    }

    public static void glfwFocusWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwFocusWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwFocusWindow", e); }
    }

    public static void glfwRequestWindowAttention(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwRequestWindowAttention.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRequestWindowAttention", e); }
    }

    public static @CType("GLFWmonitor*") java.lang.foreign.MemorySegment glfwGetWindowMonitor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowMonitor.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowMonitor", e); }
    }

    public static void glfwSetWindowMonitor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("int") int xpos, @CType("int") int ypos, @CType("int") int width, @CType("int") int height, @CType("int") int refreshRate) {
        try {
            Handles.MH_glfwSetWindowMonitor.invokeExact(window, monitor, xpos, ypos, width, height, refreshRate);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMonitor", e); }
    }

    public static @CType("int") int glfwGetWindowAttrib(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int attrib) {
        try {
            return (int) Handles.MH_glfwGetWindowAttrib.invokeExact(window, attrib);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowAttrib", e); }
    }

    public static void glfwSetWindowAttrib(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int attrib, @CType("int") int value) {
        try {
            Handles.MH_glfwSetWindowAttrib.invokeExact(window, attrib, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAttrib", e); }
    }

    public static void glfwSetWindowUserPointer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            Handles.MH_glfwSetWindowUserPointer.invokeExact(window, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowUserPointer", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetWindowUserPointer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowUserPointer.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowUserPointer", e); }
    }

    public static @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowPosCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPosCallback", e); }
    }

    public static @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowposfun") overrungl.glfw.GLFWWindowPosFun callback) {
        return glfwSetWindowPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeCallback", e); }
    }

    public static @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowsizefun") overrungl.glfw.GLFWWindowSizeFun callback) {
        return glfwSetWindowSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowCloseCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowCloseCallback", e); }
    }

    public static @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowclosefun") overrungl.glfw.GLFWWindowCloseFun callback) {
        return glfwSetWindowCloseCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowRefreshCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowRefreshCallback", e); }
    }

    public static @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowrefreshfun") overrungl.glfw.GLFWWindowRefreshFun callback) {
        return glfwSetWindowRefreshCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowFocusCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowFocusCallback", e); }
    }

    public static @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowfocusfun") overrungl.glfw.GLFWWindowFocusFun callback) {
        return glfwSetWindowFocusCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowIconifyCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIconifyCallback", e); }
    }

    public static @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowiconifyfun") overrungl.glfw.GLFWWindowIconifyFun callback) {
        return glfwSetWindowIconifyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowMaximizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMaximizeCallback", e); }
    }

    public static @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowmaximizefun") overrungl.glfw.GLFWWindowMaximizeFun callback) {
        return glfwSetWindowMaximizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetFramebufferSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetFramebufferSizeCallback", e); }
    }

    public static @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWframebuffersizefun") overrungl.glfw.GLFWFramebufferSizeFun callback) {
        return glfwSetFramebufferSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowContentScaleCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowContentScaleCallback", e); }
    }

    public static @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowcontentscalefun") overrungl.glfw.GLFWWindowContentScaleFun callback) {
        return glfwSetWindowContentScaleCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static void glfwPollEvents() {
        try {
            Handles.MH_glfwPollEvents.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwPollEvents", e); }
    }

    public static void glfwWaitEvents() {
        try {
            Handles.MH_glfwWaitEvents.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEvents", e); }
    }

    public static void glfwWaitEventsTimeout(@CType("double") double timeout) {
        try {
            Handles.MH_glfwWaitEventsTimeout.invokeExact(timeout);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEventsTimeout", e); }
    }

    public static void glfwPostEmptyEvent() {
        try {
            Handles.MH_glfwPostEmptyEvent.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwPostEmptyEvent", e); }
    }

    public static @CType("int") int glfwGetInputMode(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int mode) {
        try {
            return (int) Handles.MH_glfwGetInputMode.invokeExact(window, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInputMode", e); }
    }

    public static void glfwSetInputMode(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int mode, @CType("int") int value) {
        try {
            Handles.MH_glfwSetInputMode.invokeExact(window, mode, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetInputMode", e); }
    }

    public static @CType("int") boolean glfwRawMouseMotionSupported() {
        try {
            return (int) Handles.MH_glfwRawMouseMotionSupported.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwRawMouseMotionSupported", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetKeyName_(@CType("int") int key, @CType("int") int scancode) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(key, scancode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetKeyName(@CType("int") int key, @CType("int") int scancode) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(key, scancode));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    public static @CType("int") int glfwGetKeyScancode(@CType("int") int key) {
        try {
            return (int) Handles.MH_glfwGetKeyScancode.invokeExact(key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyScancode", e); }
    }

    public static @CType("int") int glfwGetKey(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int key) {
        try {
            return (int) Handles.MH_glfwGetKey.invokeExact(window, key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKey", e); }
    }

    public static @CType("int") int glfwGetMouseButton(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int button) {
        try {
            return (int) Handles.MH_glfwGetMouseButton.invokeExact(window, button);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMouseButton", e); }
    }

    public static void glfwGetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("double*") java.lang.foreign.MemorySegment xpos, @Out @CType("double*") java.lang.foreign.MemorySegment ypos) {
        try {
            Handles.MH_glfwGetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    public static void glfwGetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("double*") double[] xpos, @Out @CType("double*") double[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetCursorPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    public static void glfwSetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("double") double xpos, @CType("double") double ypos) {
        try {
            Handles.MH_glfwSetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPos", e); }
    }

    public static @CType("GLFWcursor*") java.lang.foreign.MemorySegment glfwCreateCursor(@CType("const GLFWimage*") java.lang.foreign.MemorySegment image, @CType("int") int xhot, @CType("int") int yhot) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateCursor.invokeExact(image, xhot, yhot);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateCursor", e); }
    }

    public static @CType("GLFWcursor*") java.lang.foreign.MemorySegment glfwCreateStandardCursor(@CType("int") int shape) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateStandardCursor.invokeExact(shape);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateStandardCursor", e); }
    }

    public static void glfwDestroyCursor(@CType("GLFWcursor*") java.lang.foreign.MemorySegment cursor) {
        try {
            Handles.MH_glfwDestroyCursor.invokeExact(cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyCursor", e); }
    }

    public static void glfwSetCursor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursor*") java.lang.foreign.MemorySegment cursor) {
        try {
            Handles.MH_glfwSetCursor.invokeExact(window, cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    public static @CType("GLFWkeyfun") java.lang.foreign.MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWkeyfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetKeyCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetKeyCallback", e); }
    }

    public static @CType("GLFWkeyfun") java.lang.foreign.MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWkeyfun") overrungl.glfw.GLFWKeyFun callback) {
        return glfwSetKeyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcharfun") java.lang.foreign.MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcharfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCharCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCharCallback", e); }
    }

    public static @CType("GLFWcharfun") java.lang.foreign.MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcharfun") overrungl.glfw.GLFWCharFun callback) {
        return glfwSetCharCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetMouseButtonCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMouseButtonCallback", e); }
    }

    public static @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmousebuttonfun") overrungl.glfw.GLFWMouseButtonFun callback) {
        return glfwSetMouseButtonCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCursorPosCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPosCallback", e); }
    }

    public static @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorposfun") overrungl.glfw.GLFWCursorPosFun callback) {
        return glfwSetCursorPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCursorEnterCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorEnterCallback", e); }
    }

    public static @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorenterfun") overrungl.glfw.GLFWCursorEnterFun callback) {
        return glfwSetCursorEnterCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWscrollfun") java.lang.foreign.MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWscrollfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetScrollCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetScrollCallback", e); }
    }

    public static @CType("GLFWscrollfun") java.lang.foreign.MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWscrollfun") overrungl.glfw.GLFWScrollFun callback) {
        return glfwSetScrollCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWdropfun") java.lang.foreign.MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWdropfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetDropCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetDropCallback", e); }
    }

    public static @CType("GLFWdropfun") java.lang.foreign.MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWdropfun") overrungl.glfw.GLFWDropFun callback) {
        return glfwSetDropCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("int") boolean glfwJoystickPresent(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickPresent.invokeExact(jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickPresent", e); }
    }

    public static @CType("const float*") java.lang.foreign.MemorySegment glfwGetJoystickAxes(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickAxes.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickAxes", e); }
    }

    public static @CType("const unsigned char*") java.lang.foreign.MemorySegment glfwGetJoystickButtons(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickButtons.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickButtons", e); }
    }

    public static @CType("const unsigned char*") java.lang.foreign.MemorySegment glfwGetJoystickHats(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickHats.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickHats", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetJoystickName_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetJoystickName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetJoystickGUID_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetJoystickGUID(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    public static void glfwSetJoystickUserPointer(@CType("int") int jid, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            Handles.MH_glfwSetJoystickUserPointer.invokeExact(jid, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickUserPointer", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetJoystickUserPointer(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickUserPointer.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickUserPointer", e); }
    }

    public static @CType("int") boolean glfwJoystickIsGamepad(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickIsGamepad.invokeExact(jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickIsGamepad", e); }
    }

    public static @CType("GLFWjoystickfun") java.lang.foreign.MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetJoystickCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickCallback", e); }
    }

    public static @CType("GLFWjoystickfun") java.lang.foreign.MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") overrungl.glfw.GLFWJoystickFun callback) {
        return glfwSetJoystickCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") java.lang.foreign.MemorySegment string) {
        try {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(string) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") java.lang.String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(Marshal.marshal(__overrungl_stack, string)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetGamepadName_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetGamepadName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") java.lang.foreign.MemorySegment state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(jid, state) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") overrungl.glfw.GLFWGamepadState state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(jid, Marshal.marshal(state)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    public static void glfwSetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.foreign.MemorySegment string) {
        try {
            Handles.MH_glfwSetClipboardString.invokeExact(window, string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    public static void glfwSetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetClipboardString.invokeExact(window, Marshal.marshal(__overrungl_stack, string));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetClipboardString_(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    public static @CType("double") double glfwGetTime() {
        try {
            return (double) Handles.MH_glfwGetTime.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTime", e); }
    }

    public static void glfwSetTime(@CType("double") double time) {
        try {
            Handles.MH_glfwSetTime.invokeExact(time);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetTime", e); }
    }

    public static @CType("uint64_t") long glfwGetTimerValue() {
        try {
            return (long) Handles.MH_glfwGetTimerValue.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerValue", e); }
    }

    public static @CType("uint64_t") long glfwGetTimerFrequency() {
        try {
            return (long) Handles.MH_glfwGetTimerFrequency.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerFrequency", e); }
    }

    public static void glfwMakeContextCurrent(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwMakeContextCurrent.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMakeContextCurrent", e); }
    }

    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwGetCurrentContext() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCurrentContext.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCurrentContext", e); }
    }

    public static void glfwSwapBuffers(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwSwapBuffers.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapBuffers", e); }
    }

    public static void glfwSwapInterval(@CType("int") int interval) {
        try {
            Handles.MH_glfwSwapInterval.invokeExact(interval);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapInterval", e); }
    }

    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") java.lang.foreign.MemorySegment extension) {
        try {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(extension) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") java.lang.String extension) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(Marshal.marshal(__overrungl_stack, extension)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    public static @CType("GLFWglproc") java.lang.foreign.MemorySegment glfwGetProcAddress(@CType("const char*") java.lang.foreign.MemorySegment procname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    public static @CType("GLFWglproc") java.lang.foreign.MemorySegment glfwGetProcAddress(@CType("const char*") java.lang.String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    public static @CType("int") boolean glfwVulkanSupported() {
        try {
            return (int) Handles.MH_glfwVulkanSupported.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwVulkanSupported", e); }
    }

    public static @CType("const char**") java.lang.foreign.MemorySegment glfwGetRequiredInstanceExtensions(@Out @CType("uint32_t*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetRequiredInstanceExtensions.invokeExact(count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetRequiredInstanceExtensions", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFW() {
    }

    public static MemorySegment[] glfwGetMonitors() {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetMonitors(c);
            return Unmarshal.unmarshalAsAddressArray(segment.reinterpret(ADDRESS.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    public static GLFWVidMode glfwGetVideoModes(MemorySegment monitor) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetVideoModes(monitor, c);
            return new GLFWVidMode(segment.reinterpret(GLFWVidMode.LAYOUT.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    public static void glfwSetWindowIcon(MemorySegment window, GLFWImage images) {
        glfwSetWindowIcon(window, images != null ? Math.toIntExact(images.estimateCount()) : 0, images);
    }

    public static float[] glfwGetJoystickAxes(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickAxes(jid, c);
            return Unmarshal.unmarshalAsFloatArray(segment.reinterpret(JAVA_FLOAT.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    public static byte[] glfwGetJoystickButtons(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickButtons(jid, c);
            return Unmarshal.unmarshalAsByteArray(segment.reinterpret(JAVA_BYTE.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    public static byte[] glfwGetJoystickHats(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickHats(jid, c);
            return Unmarshal.unmarshalAsByteArray(segment.reinterpret(JAVA_BYTE.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    public static String[] glfwGetRequiredInstanceExtensions() {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetRequiredInstanceExtensions(c);
            return Unmarshal.unmarshalAsStringArray(segment.reinterpret(ADDRESS.scale(0, c.get(JAVA_INT, 0))));
        }
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
            default -> RuntimeHelper.unknownToken(errorCode);
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
            default -> RuntimeHelper.unknownToken(platformCode);
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
            default -> RuntimeHelper.unknownToken(platformCode);
        };
    }
}
