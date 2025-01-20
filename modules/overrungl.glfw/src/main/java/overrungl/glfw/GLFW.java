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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwInit`.
        public static final MethodHandle MH_glfwInit = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwTerminate`.
        public static final MethodHandle MH_glfwTerminate = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwInitHint`.
        public static final MethodHandle MH_glfwInitHint = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwInitAllocator`.
        public static final MethodHandle MH_glfwInitAllocator = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWAllocator.LAYOUT)));
        /// The method handle of `glfwInitVulkanLoader`.
        public static final MethodHandle MH_glfwInitVulkanLoader = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersion`.
        public static final MethodHandle MH_glfwGetVersion = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersionString`.
        public static final MethodHandle MH_glfwGetVersionString = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetError`.
        public static final MethodHandle MH_glfwGetError = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetErrorCallback`.
        public static final MethodHandle MH_glfwSetErrorCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPlatform`.
        public static final MethodHandle MH_glfwGetPlatform = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwPlatformSupported`.
        public static final MethodHandle MH_glfwPlatformSupported = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMonitors`.
        public static final MethodHandle MH_glfwGetMonitors = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPrimaryMonitor`.
        public static final MethodHandle MH_glfwGetPrimaryMonitor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPos`.
        public static final MethodHandle MH_glfwGetMonitorPos = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorWorkarea`.
        public static final MethodHandle MH_glfwGetMonitorWorkarea = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPhysicalSize`.
        public static final MethodHandle MH_glfwGetMonitorPhysicalSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorContentScale`.
        public static final MethodHandle MH_glfwGetMonitorContentScale = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorName`.
        public static final MethodHandle MH_glfwGetMonitorName = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorUserPointer`.
        public static final MethodHandle MH_glfwSetMonitorUserPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorUserPointer`.
        public static final MethodHandle MH_glfwGetMonitorUserPointer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorCallback`.
        public static final MethodHandle MH_glfwSetMonitorCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoModes`.
        public static final MethodHandle MH_glfwGetVideoModes = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoMode`.
        public static final MethodHandle MH_glfwGetVideoMode = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWVidMode.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGamma`.
        public static final MethodHandle MH_glfwSetGamma = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwGetGammaRamp`.
        public static final MethodHandle MH_glfwGetGammaRamp = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGammaRamp`.
        public static final MethodHandle MH_glfwSetGammaRamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT)));
        /// The method handle of `glfwDefaultWindowHints`.
        public static final MethodHandle MH_glfwDefaultWindowHints = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWindowHint`.
        public static final MethodHandle MH_glfwWindowHint = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwWindowHintString`.
        public static final MethodHandle MH_glfwWindowHintString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwCreateWindow`.
        public static final MethodHandle MH_glfwCreateWindow = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwDestroyWindow`.
        public static final MethodHandle MH_glfwDestroyWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwWindowShouldClose`.
        public static final MethodHandle MH_glfwWindowShouldClose = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowShouldClose`.
        public static final MethodHandle MH_glfwSetWindowShouldClose = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowTitle`.
        public static final MethodHandle MH_glfwGetWindowTitle = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowTitle`.
        public static final MethodHandle MH_glfwSetWindowTitle = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwSetWindowIcon`.
        public static final MethodHandle MH_glfwSetWindowIcon = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT)));
        /// The method handle of `glfwGetWindowPos`.
        public static final MethodHandle MH_glfwGetWindowPos = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPos`.
        public static final MethodHandle MH_glfwSetWindowPos = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowSize`.
        public static final MethodHandle MH_glfwGetWindowSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeLimits`.
        public static final MethodHandle MH_glfwSetWindowSizeLimits = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAspectRatio`.
        public static final MethodHandle MH_glfwSetWindowAspectRatio = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowSize`.
        public static final MethodHandle MH_glfwSetWindowSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetFramebufferSize`.
        public static final MethodHandle MH_glfwGetFramebufferSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowFrameSize`.
        public static final MethodHandle MH_glfwGetWindowFrameSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowContentScale`.
        public static final MethodHandle MH_glfwGetWindowContentScale = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowOpacity`.
        public static final MethodHandle MH_glfwGetWindowOpacity = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowOpacity`.
        public static final MethodHandle MH_glfwSetWindowOpacity = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwIconifyWindow`.
        public static final MethodHandle MH_glfwIconifyWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRestoreWindow`.
        public static final MethodHandle MH_glfwRestoreWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwMaximizeWindow`.
        public static final MethodHandle MH_glfwMaximizeWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwShowWindow`.
        public static final MethodHandle MH_glfwShowWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwHideWindow`.
        public static final MethodHandle MH_glfwHideWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwFocusWindow`.
        public static final MethodHandle MH_glfwFocusWindow = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRequestWindowAttention`.
        public static final MethodHandle MH_glfwRequestWindowAttention = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowMonitor`.
        public static final MethodHandle MH_glfwGetWindowMonitor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMonitor`.
        public static final MethodHandle MH_glfwSetWindowMonitor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowAttrib`.
        public static final MethodHandle MH_glfwGetWindowAttrib = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAttrib`.
        public static final MethodHandle MH_glfwSetWindowAttrib = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowUserPointer`.
        public static final MethodHandle MH_glfwSetWindowUserPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowUserPointer`.
        public static final MethodHandle MH_glfwGetWindowUserPointer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPosCallback`.
        public static final MethodHandle MH_glfwSetWindowPosCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeCallback`.
        public static final MethodHandle MH_glfwSetWindowSizeCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowCloseCallback`.
        public static final MethodHandle MH_glfwSetWindowCloseCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowRefreshCallback`.
        public static final MethodHandle MH_glfwSetWindowRefreshCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowFocusCallback`.
        public static final MethodHandle MH_glfwSetWindowFocusCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowIconifyCallback`.
        public static final MethodHandle MH_glfwSetWindowIconifyCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMaximizeCallback`.
        public static final MethodHandle MH_glfwSetWindowMaximizeCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetFramebufferSizeCallback`.
        public static final MethodHandle MH_glfwSetFramebufferSizeCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowContentScaleCallback`.
        public static final MethodHandle MH_glfwSetWindowContentScaleCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwPollEvents`.
        public static final MethodHandle MH_glfwPollEvents = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEvents`.
        public static final MethodHandle MH_glfwWaitEvents = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEventsTimeout`.
        public static final MethodHandle MH_glfwWaitEventsTimeout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwPostEmptyEvent`.
        public static final MethodHandle MH_glfwPostEmptyEvent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `glfwGetInputMode`.
        public static final MethodHandle MH_glfwGetInputMode = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetInputMode`.
        public static final MethodHandle MH_glfwSetInputMode = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwRawMouseMotionSupported`.
        public static final MethodHandle MH_glfwRawMouseMotionSupported = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyName`.
        public static final MethodHandle MH_glfwGetKeyName = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyScancode`.
        public static final MethodHandle MH_glfwGetKeyScancode = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKey`.
        public static final MethodHandle MH_glfwGetKey = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMouseButton`.
        public static final MethodHandle MH_glfwGetMouseButton = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetCursorPos`.
        public static final MethodHandle MH_glfwGetCursorPos = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPos`.
        public static final MethodHandle MH_glfwSetCursorPos = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwCreateCursor`.
        public static final MethodHandle MH_glfwCreateCursor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateStandardCursor`.
        public static final MethodHandle MH_glfwCreateStandardCursor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwDestroyCursor`.
        public static final MethodHandle MH_glfwDestroyCursor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursor`.
        public static final MethodHandle MH_glfwSetCursor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetKeyCallback`.
        public static final MethodHandle MH_glfwSetKeyCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCharCallback`.
        public static final MethodHandle MH_glfwSetCharCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMouseButtonCallback`.
        public static final MethodHandle MH_glfwSetMouseButtonCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPosCallback`.
        public static final MethodHandle MH_glfwSetCursorPosCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorEnterCallback`.
        public static final MethodHandle MH_glfwSetCursorEnterCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetScrollCallback`.
        public static final MethodHandle MH_glfwSetScrollCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetDropCallback`.
        public static final MethodHandle MH_glfwSetDropCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwJoystickPresent`.
        public static final MethodHandle MH_glfwJoystickPresent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickAxes`.
        public static final MethodHandle MH_glfwGetJoystickAxes = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickButtons`.
        public static final MethodHandle MH_glfwGetJoystickButtons = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickHats`.
        public static final MethodHandle MH_glfwGetJoystickHats = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickName`.
        public static final MethodHandle MH_glfwGetJoystickName = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickGUID`.
        public static final MethodHandle MH_glfwGetJoystickGUID = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickUserPointer`.
        public static final MethodHandle MH_glfwSetJoystickUserPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickUserPointer`.
        public static final MethodHandle MH_glfwGetJoystickUserPointer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwJoystickIsGamepad`.
        public static final MethodHandle MH_glfwJoystickIsGamepad = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickCallback`.
        public static final MethodHandle MH_glfwSetJoystickCallback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwUpdateGamepadMappings`.
        public static final MethodHandle MH_glfwUpdateGamepadMappings = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetGamepadName`.
        public static final MethodHandle MH_glfwGetGamepadName = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetGamepadState`.
        public static final MethodHandle MH_glfwGetGamepadState = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGamepadState.LAYOUT)));
        /// The method handle of `glfwSetClipboardString`.
        public static final MethodHandle MH_glfwSetClipboardString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetClipboardString`.
        public static final MethodHandle MH_glfwGetClipboardString = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetTime`.
        public static final MethodHandle MH_glfwGetTime = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwSetTime`.
        public static final MethodHandle MH_glfwSetTime = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwGetTimerValue`.
        public static final MethodHandle MH_glfwGetTimerValue = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwGetTimerFrequency`.
        public static final MethodHandle MH_glfwGetTimerFrequency = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwMakeContextCurrent`.
        public static final MethodHandle MH_glfwMakeContextCurrent = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCurrentContext`.
        public static final MethodHandle MH_glfwGetCurrentContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapBuffers`.
        public static final MethodHandle MH_glfwSwapBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapInterval`.
        public static final MethodHandle MH_glfwSwapInterval = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `glfwExtensionSupported`.
        public static final MethodHandle MH_glfwExtensionSupported = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetProcAddress`.
        public static final MethodHandle MH_glfwGetProcAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwVulkanSupported`.
        public static final MethodHandle MH_glfwVulkanSupported = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetRequiredInstanceExtensions`.
        public static final MethodHandle MH_glfwGetRequiredInstanceExtensions = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetInstanceProcAddress`.
        public static final MethodHandle MH_glfwGetInstanceProcAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetPhysicalDevicePresentationSupport`.
        public static final MethodHandle MH_glfwGetPhysicalDevicePresentationSupport = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateWindowSurface`.
        public static final MethodHandle MH_glfwCreateWindowSurface = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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
            PFN_glfwInit = GLFWInternal.lookup().findOrThrow("glfwInit");
            PFN_glfwTerminate = GLFWInternal.lookup().findOrThrow("glfwTerminate");
            PFN_glfwInitHint = GLFWInternal.lookup().findOrThrow("glfwInitHint");
            PFN_glfwInitAllocator = GLFWInternal.lookup().findOrThrow("glfwInitAllocator");
            PFN_glfwInitVulkanLoader = GLFWInternal.lookup().findOrThrow("glfwInitVulkanLoader");
            PFN_glfwGetVersion = GLFWInternal.lookup().findOrThrow("glfwGetVersion");
            PFN_glfwGetVersionString = GLFWInternal.lookup().findOrThrow("glfwGetVersionString");
            PFN_glfwGetError = GLFWInternal.lookup().findOrThrow("glfwGetError");
            PFN_glfwSetErrorCallback = GLFWInternal.lookup().findOrThrow("glfwSetErrorCallback");
            PFN_glfwGetPlatform = GLFWInternal.lookup().findOrThrow("glfwGetPlatform");
            PFN_glfwPlatformSupported = GLFWInternal.lookup().findOrThrow("glfwPlatformSupported");
            PFN_glfwGetMonitors = GLFWInternal.lookup().findOrThrow("glfwGetMonitors");
            PFN_glfwGetPrimaryMonitor = GLFWInternal.lookup().findOrThrow("glfwGetPrimaryMonitor");
            PFN_glfwGetMonitorPos = GLFWInternal.lookup().findOrThrow("glfwGetMonitorPos");
            PFN_glfwGetMonitorWorkarea = GLFWInternal.lookup().findOrThrow("glfwGetMonitorWorkarea");
            PFN_glfwGetMonitorPhysicalSize = GLFWInternal.lookup().findOrThrow("glfwGetMonitorPhysicalSize");
            PFN_glfwGetMonitorContentScale = GLFWInternal.lookup().findOrThrow("glfwGetMonitorContentScale");
            PFN_glfwGetMonitorName = GLFWInternal.lookup().findOrThrow("glfwGetMonitorName");
            PFN_glfwSetMonitorUserPointer = GLFWInternal.lookup().findOrThrow("glfwSetMonitorUserPointer");
            PFN_glfwGetMonitorUserPointer = GLFWInternal.lookup().findOrThrow("glfwGetMonitorUserPointer");
            PFN_glfwSetMonitorCallback = GLFWInternal.lookup().findOrThrow("glfwSetMonitorCallback");
            PFN_glfwGetVideoModes = GLFWInternal.lookup().findOrThrow("glfwGetVideoModes");
            PFN_glfwGetVideoMode = GLFWInternal.lookup().findOrThrow("glfwGetVideoMode");
            PFN_glfwSetGamma = GLFWInternal.lookup().findOrThrow("glfwSetGamma");
            PFN_glfwGetGammaRamp = GLFWInternal.lookup().findOrThrow("glfwGetGammaRamp");
            PFN_glfwSetGammaRamp = GLFWInternal.lookup().findOrThrow("glfwSetGammaRamp");
            PFN_glfwDefaultWindowHints = GLFWInternal.lookup().findOrThrow("glfwDefaultWindowHints");
            PFN_glfwWindowHint = GLFWInternal.lookup().findOrThrow("glfwWindowHint");
            PFN_glfwWindowHintString = GLFWInternal.lookup().findOrThrow("glfwWindowHintString");
            PFN_glfwCreateWindow = GLFWInternal.lookup().findOrThrow("glfwCreateWindow");
            PFN_glfwDestroyWindow = GLFWInternal.lookup().findOrThrow("glfwDestroyWindow");
            PFN_glfwWindowShouldClose = GLFWInternal.lookup().findOrThrow("glfwWindowShouldClose");
            PFN_glfwSetWindowShouldClose = GLFWInternal.lookup().findOrThrow("glfwSetWindowShouldClose");
            PFN_glfwGetWindowTitle = GLFWInternal.lookup().findOrThrow("glfwGetWindowTitle");
            PFN_glfwSetWindowTitle = GLFWInternal.lookup().findOrThrow("glfwSetWindowTitle");
            PFN_glfwSetWindowIcon = GLFWInternal.lookup().findOrThrow("glfwSetWindowIcon");
            PFN_glfwGetWindowPos = GLFWInternal.lookup().findOrThrow("glfwGetWindowPos");
            PFN_glfwSetWindowPos = GLFWInternal.lookup().findOrThrow("glfwSetWindowPos");
            PFN_glfwGetWindowSize = GLFWInternal.lookup().findOrThrow("glfwGetWindowSize");
            PFN_glfwSetWindowSizeLimits = GLFWInternal.lookup().findOrThrow("glfwSetWindowSizeLimits");
            PFN_glfwSetWindowAspectRatio = GLFWInternal.lookup().findOrThrow("glfwSetWindowAspectRatio");
            PFN_glfwSetWindowSize = GLFWInternal.lookup().findOrThrow("glfwSetWindowSize");
            PFN_glfwGetFramebufferSize = GLFWInternal.lookup().findOrThrow("glfwGetFramebufferSize");
            PFN_glfwGetWindowFrameSize = GLFWInternal.lookup().findOrThrow("glfwGetWindowFrameSize");
            PFN_glfwGetWindowContentScale = GLFWInternal.lookup().findOrThrow("glfwGetWindowContentScale");
            PFN_glfwGetWindowOpacity = GLFWInternal.lookup().findOrThrow("glfwGetWindowOpacity");
            PFN_glfwSetWindowOpacity = GLFWInternal.lookup().findOrThrow("glfwSetWindowOpacity");
            PFN_glfwIconifyWindow = GLFWInternal.lookup().findOrThrow("glfwIconifyWindow");
            PFN_glfwRestoreWindow = GLFWInternal.lookup().findOrThrow("glfwRestoreWindow");
            PFN_glfwMaximizeWindow = GLFWInternal.lookup().findOrThrow("glfwMaximizeWindow");
            PFN_glfwShowWindow = GLFWInternal.lookup().findOrThrow("glfwShowWindow");
            PFN_glfwHideWindow = GLFWInternal.lookup().findOrThrow("glfwHideWindow");
            PFN_glfwFocusWindow = GLFWInternal.lookup().findOrThrow("glfwFocusWindow");
            PFN_glfwRequestWindowAttention = GLFWInternal.lookup().findOrThrow("glfwRequestWindowAttention");
            PFN_glfwGetWindowMonitor = GLFWInternal.lookup().findOrThrow("glfwGetWindowMonitor");
            PFN_glfwSetWindowMonitor = GLFWInternal.lookup().findOrThrow("glfwSetWindowMonitor");
            PFN_glfwGetWindowAttrib = GLFWInternal.lookup().findOrThrow("glfwGetWindowAttrib");
            PFN_glfwSetWindowAttrib = GLFWInternal.lookup().findOrThrow("glfwSetWindowAttrib");
            PFN_glfwSetWindowUserPointer = GLFWInternal.lookup().findOrThrow("glfwSetWindowUserPointer");
            PFN_glfwGetWindowUserPointer = GLFWInternal.lookup().findOrThrow("glfwGetWindowUserPointer");
            PFN_glfwSetWindowPosCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowPosCallback");
            PFN_glfwSetWindowSizeCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowSizeCallback");
            PFN_glfwSetWindowCloseCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowCloseCallback");
            PFN_glfwSetWindowRefreshCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowRefreshCallback");
            PFN_glfwSetWindowFocusCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowFocusCallback");
            PFN_glfwSetWindowIconifyCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowIconifyCallback");
            PFN_glfwSetWindowMaximizeCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowMaximizeCallback");
            PFN_glfwSetFramebufferSizeCallback = GLFWInternal.lookup().findOrThrow("glfwSetFramebufferSizeCallback");
            PFN_glfwSetWindowContentScaleCallback = GLFWInternal.lookup().findOrThrow("glfwSetWindowContentScaleCallback");
            PFN_glfwPollEvents = GLFWInternal.lookup().findOrThrow("glfwPollEvents");
            PFN_glfwWaitEvents = GLFWInternal.lookup().findOrThrow("glfwWaitEvents");
            PFN_glfwWaitEventsTimeout = GLFWInternal.lookup().findOrThrow("glfwWaitEventsTimeout");
            PFN_glfwPostEmptyEvent = GLFWInternal.lookup().findOrThrow("glfwPostEmptyEvent");
            PFN_glfwGetInputMode = GLFWInternal.lookup().findOrThrow("glfwGetInputMode");
            PFN_glfwSetInputMode = GLFWInternal.lookup().findOrThrow("glfwSetInputMode");
            PFN_glfwRawMouseMotionSupported = GLFWInternal.lookup().findOrThrow("glfwRawMouseMotionSupported");
            PFN_glfwGetKeyName = GLFWInternal.lookup().findOrThrow("glfwGetKeyName");
            PFN_glfwGetKeyScancode = GLFWInternal.lookup().findOrThrow("glfwGetKeyScancode");
            PFN_glfwGetKey = GLFWInternal.lookup().findOrThrow("glfwGetKey");
            PFN_glfwGetMouseButton = GLFWInternal.lookup().findOrThrow("glfwGetMouseButton");
            PFN_glfwGetCursorPos = GLFWInternal.lookup().findOrThrow("glfwGetCursorPos");
            PFN_glfwSetCursorPos = GLFWInternal.lookup().findOrThrow("glfwSetCursorPos");
            PFN_glfwCreateCursor = GLFWInternal.lookup().findOrThrow("glfwCreateCursor");
            PFN_glfwCreateStandardCursor = GLFWInternal.lookup().findOrThrow("glfwCreateStandardCursor");
            PFN_glfwDestroyCursor = GLFWInternal.lookup().findOrThrow("glfwDestroyCursor");
            PFN_glfwSetCursor = GLFWInternal.lookup().findOrThrow("glfwSetCursor");
            PFN_glfwSetKeyCallback = GLFWInternal.lookup().findOrThrow("glfwSetKeyCallback");
            PFN_glfwSetCharCallback = GLFWInternal.lookup().findOrThrow("glfwSetCharCallback");
            PFN_glfwSetMouseButtonCallback = GLFWInternal.lookup().findOrThrow("glfwSetMouseButtonCallback");
            PFN_glfwSetCursorPosCallback = GLFWInternal.lookup().findOrThrow("glfwSetCursorPosCallback");
            PFN_glfwSetCursorEnterCallback = GLFWInternal.lookup().findOrThrow("glfwSetCursorEnterCallback");
            PFN_glfwSetScrollCallback = GLFWInternal.lookup().findOrThrow("glfwSetScrollCallback");
            PFN_glfwSetDropCallback = GLFWInternal.lookup().findOrThrow("glfwSetDropCallback");
            PFN_glfwJoystickPresent = GLFWInternal.lookup().findOrThrow("glfwJoystickPresent");
            PFN_glfwGetJoystickAxes = GLFWInternal.lookup().findOrThrow("glfwGetJoystickAxes");
            PFN_glfwGetJoystickButtons = GLFWInternal.lookup().findOrThrow("glfwGetJoystickButtons");
            PFN_glfwGetJoystickHats = GLFWInternal.lookup().findOrThrow("glfwGetJoystickHats");
            PFN_glfwGetJoystickName = GLFWInternal.lookup().findOrThrow("glfwGetJoystickName");
            PFN_glfwGetJoystickGUID = GLFWInternal.lookup().findOrThrow("glfwGetJoystickGUID");
            PFN_glfwSetJoystickUserPointer = GLFWInternal.lookup().findOrThrow("glfwSetJoystickUserPointer");
            PFN_glfwGetJoystickUserPointer = GLFWInternal.lookup().findOrThrow("glfwGetJoystickUserPointer");
            PFN_glfwJoystickIsGamepad = GLFWInternal.lookup().findOrThrow("glfwJoystickIsGamepad");
            PFN_glfwSetJoystickCallback = GLFWInternal.lookup().findOrThrow("glfwSetJoystickCallback");
            PFN_glfwUpdateGamepadMappings = GLFWInternal.lookup().findOrThrow("glfwUpdateGamepadMappings");
            PFN_glfwGetGamepadName = GLFWInternal.lookup().findOrThrow("glfwGetGamepadName");
            PFN_glfwGetGamepadState = GLFWInternal.lookup().findOrThrow("glfwGetGamepadState");
            PFN_glfwSetClipboardString = GLFWInternal.lookup().findOrThrow("glfwSetClipboardString");
            PFN_glfwGetClipboardString = GLFWInternal.lookup().findOrThrow("glfwGetClipboardString");
            PFN_glfwGetTime = GLFWInternal.lookup().findOrThrow("glfwGetTime");
            PFN_glfwSetTime = GLFWInternal.lookup().findOrThrow("glfwSetTime");
            PFN_glfwGetTimerValue = GLFWInternal.lookup().findOrThrow("glfwGetTimerValue");
            PFN_glfwGetTimerFrequency = GLFWInternal.lookup().findOrThrow("glfwGetTimerFrequency");
            PFN_glfwMakeContextCurrent = GLFWInternal.lookup().findOrThrow("glfwMakeContextCurrent");
            PFN_glfwGetCurrentContext = GLFWInternal.lookup().findOrThrow("glfwGetCurrentContext");
            PFN_glfwSwapBuffers = GLFWInternal.lookup().findOrThrow("glfwSwapBuffers");
            PFN_glfwSwapInterval = GLFWInternal.lookup().findOrThrow("glfwSwapInterval");
            PFN_glfwExtensionSupported = GLFWInternal.lookup().findOrThrow("glfwExtensionSupported");
            PFN_glfwGetProcAddress = GLFWInternal.lookup().findOrThrow("glfwGetProcAddress");
            PFN_glfwVulkanSupported = GLFWInternal.lookup().findOrThrow("glfwVulkanSupported");
            PFN_glfwGetRequiredInstanceExtensions = GLFWInternal.lookup().findOrThrow("glfwGetRequiredInstanceExtensions");
            PFN_glfwGetInstanceProcAddress = GLFWInternal.lookup().findOrThrow("glfwGetInstanceProcAddress");
            PFN_glfwGetPhysicalDevicePresentationSupport = GLFWInternal.lookup().findOrThrow("glfwGetPhysicalDevicePresentationSupport");
            PFN_glfwCreateWindowSurface = GLFWInternal.lookup().findOrThrow("glfwCreateWindowSurface");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("int") boolean glfwInit() {
        try {
            return (int) Handles.MH_glfwInit.invokeExact(Handles.get().PFN_glfwInit) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwInit", e); }
    }

    public static void glfwTerminate() {
        try {
            Handles.MH_glfwTerminate.invokeExact(Handles.get().PFN_glfwTerminate);
        } catch (Throwable e) { throw new RuntimeException("error in glfwTerminate", e); }
    }

    public static void glfwInitHint(@CType("int") int hint, @CType("int") int value) {
        try {
            Handles.MH_glfwInitHint.invokeExact(Handles.get().PFN_glfwInitHint, hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitHint", e); }
    }

    public static void glfwInitAllocator(@CType("const GLFWallocator*") MemorySegment allocator) {
        try {
            Handles.MH_glfwInitAllocator.invokeExact(Handles.get().PFN_glfwInitAllocator, allocator);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    public static void glfwInitAllocator(@CType("const GLFWallocator*") overrungl.glfw.GLFWAllocator allocator) {
        try {
            Handles.MH_glfwInitAllocator.invokeExact(Handles.get().PFN_glfwInitAllocator, Marshal.marshal(allocator));
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    public static void glfwInitVulkanLoader(@CType("PFN_vkGetInstanceProcAddr") MemorySegment loader) {
        try {
            Handles.MH_glfwInitVulkanLoader.invokeExact(Handles.get().PFN_glfwInitVulkanLoader, loader);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    public static void glfwGetVersion(@Out @CType("int*") MemorySegment major, @Out @CType("int*") MemorySegment minor, @Out @CType("int*") MemorySegment rev) {
        try {
            Handles.MH_glfwGetVersion.invokeExact(Handles.get().PFN_glfwGetVersion, major, minor, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    public static void glfwGetVersion(@Out @CType("int*") int[] major, @Out @CType("int*") int[] minor, @Out @CType("int*") int[] rev) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_major = Marshal.marshal(__overrungl_stack, major);
            var __overrungl_ref_minor = Marshal.marshal(__overrungl_stack, minor);
            var __overrungl_ref_rev = Marshal.marshal(__overrungl_stack, rev);
            Handles.MH_glfwGetVersion.invokeExact(Handles.get().PFN_glfwGetVersion, __overrungl_ref_major, __overrungl_ref_minor, __overrungl_ref_rev);
            Unmarshal.copy(__overrungl_ref_major, major);
            Unmarshal.copy(__overrungl_ref_minor, minor);
            Unmarshal.copy(__overrungl_ref_rev, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetVersionString_() {
        try {
            return (MemorySegment) Handles.MH_glfwGetVersionString.invokeExact(Handles.get().PFN_glfwGetVersionString);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    public static @CType("const char*") String glfwGetVersionString() {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetVersionString.invokeExact(Handles.get().PFN_glfwGetVersionString));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    public static @CType("int") int glfwGetError(@Out @CType("const char**") MemorySegment description) {
        try {
            return (int) Handles.MH_glfwGetError.invokeExact(Handles.get().PFN_glfwGetError, description);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    public static @CType("int") int glfwGetError(@Out @CType("const char**") String[] description) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_description = Marshal.marshal(__overrungl_stack, description);
            var __overrungl_result = (int) Handles.MH_glfwGetError.invokeExact(Handles.get().PFN_glfwGetError, __overrungl_ref_description);
            Unmarshal.copy(__overrungl_ref_description, description);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    public static @CType("GLFWerrorfun") MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetErrorCallback.invokeExact(Handles.get().PFN_glfwSetErrorCallback, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetErrorCallback", e); }
    }

    public static @CType("GLFWerrorfun") MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") overrungl.glfw.GLFWErrorFun callback) {
        return glfwSetErrorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("int") int glfwGetPlatform() {
        try {
            return (int) Handles.MH_glfwGetPlatform.invokeExact(Handles.get().PFN_glfwGetPlatform);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPlatform", e); }
    }

    public static @CType("int") boolean glfwPlatformSupported(@CType("int") int platform) {
        try {
            return (int) Handles.MH_glfwPlatformSupported.invokeExact(Handles.get().PFN_glfwPlatformSupported, platform) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwPlatformSupported", e); }
    }

    public static @CType("GLFWmonitor**") MemorySegment glfwGetMonitors(@Out @CType("int*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetMonitors.invokeExact(Handles.get().PFN_glfwGetMonitors, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitors", e); }
    }

    public static @CType("GLFWmonitor*") MemorySegment glfwGetPrimaryMonitor() {
        try {
            return (MemorySegment) Handles.MH_glfwGetPrimaryMonitor.invokeExact(Handles.get().PFN_glfwGetPrimaryMonitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPrimaryMonitor", e); }
    }

    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") MemorySegment xpos, @Out @CType("int*") MemorySegment ypos) {
        try {
            Handles.MH_glfwGetMonitorPos.invokeExact(Handles.get().PFN_glfwGetMonitorPos, monitor, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetMonitorPos.invokeExact(Handles.get().PFN_glfwGetMonitorPos, monitor, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") MemorySegment xpos, @Out @CType("int*") MemorySegment ypos, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height) {
        try {
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(Handles.get().PFN_glfwGetMonitorWorkarea, monitor, xpos, ypos, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(Handles.get().PFN_glfwGetMonitorWorkarea, monitor, __overrungl_ref_xpos, __overrungl_ref_ypos, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") MemorySegment widthMM, @Out @CType("int*") MemorySegment heightMM) {
        try {
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(Handles.get().PFN_glfwGetMonitorPhysicalSize, monitor, widthMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") int[] widthMM, @Out @CType("int*") int[] heightMM) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_widthMM = Marshal.marshal(__overrungl_stack, widthMM);
            var __overrungl_ref_heightMM = Marshal.marshal(__overrungl_stack, heightMM);
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(Handles.get().PFN_glfwGetMonitorPhysicalSize, monitor, __overrungl_ref_widthMM, __overrungl_ref_heightMM);
            Unmarshal.copy(__overrungl_ref_widthMM, widthMM);
            Unmarshal.copy(__overrungl_ref_heightMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("float*") MemorySegment xscale, @Out @CType("float*") MemorySegment yscale) {
        try {
            Handles.MH_glfwGetMonitorContentScale.invokeExact(Handles.get().PFN_glfwGetMonitorContentScale, monitor, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            Handles.MH_glfwGetMonitorContentScale.invokeExact(Handles.get().PFN_glfwGetMonitorContentScale, monitor, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetMonitorName_(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return (MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(Handles.get().PFN_glfwGetMonitorName, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    public static @CType("const char*") String glfwGetMonitorName(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(Handles.get().PFN_glfwGetMonitorName, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    public static void glfwSetMonitorUserPointer(@CType("GLFWmonitor*") MemorySegment monitor, @CType("void*") MemorySegment pointer) {
        try {
            Handles.MH_glfwSetMonitorUserPointer.invokeExact(Handles.get().PFN_glfwSetMonitorUserPointer, monitor, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorUserPointer", e); }
    }

    public static @CType("void*") MemorySegment glfwGetMonitorUserPointer(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return (MemorySegment) Handles.MH_glfwGetMonitorUserPointer.invokeExact(Handles.get().PFN_glfwGetMonitorUserPointer, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorUserPointer", e); }
    }

    public static @CType("GLFWmonitorfun") MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetMonitorCallback.invokeExact(Handles.get().PFN_glfwSetMonitorCallback, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorCallback", e); }
    }

    public static @CType("GLFWmonitorfun") MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") overrungl.glfw.GLFWMonitorFun callback) {
        return glfwSetMonitorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("const GLFWvidmode*") MemorySegment glfwGetVideoModes(@CType("GLFWmonitor*") MemorySegment monitor, @Out @CType("int*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetVideoModes.invokeExact(Handles.get().PFN_glfwGetVideoModes, monitor, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoModes", e); }
    }

    public static @CType("const GLFWvidmode*") MemorySegment glfwGetVideoMode_(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return (MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(Handles.get().PFN_glfwGetVideoMode, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    public static @CType("const GLFWvidmode*") overrungl.glfw.GLFWVidMode glfwGetVideoMode(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWVidMode.of((MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(Handles.get().PFN_glfwGetVideoMode, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    public static void glfwSetGamma(@CType("GLFWmonitor*") MemorySegment monitor, @CType("float") float gamma) {
        try {
            Handles.MH_glfwSetGamma.invokeExact(Handles.get().PFN_glfwSetGamma, monitor, gamma);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGamma", e); }
    }

    public static @CType("const GLFWgammaramp*") MemorySegment glfwGetGammaRamp_(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return (MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(Handles.get().PFN_glfwGetGammaRamp, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    public static @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp glfwGetGammaRamp(@CType("GLFWmonitor*") MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWGammaRamp.of((MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(Handles.get().PFN_glfwGetGammaRamp, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") MemorySegment monitor, @CType("const GLFWgammaramp*") MemorySegment ramp) {
        try {
            Handles.MH_glfwSetGammaRamp.invokeExact(Handles.get().PFN_glfwSetGammaRamp, monitor, ramp);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") MemorySegment monitor, @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp ramp) {
        try {
            Handles.MH_glfwSetGammaRamp.invokeExact(Handles.get().PFN_glfwSetGammaRamp, monitor, Marshal.marshal(ramp));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    public static void glfwDefaultWindowHints() {
        try {
            Handles.MH_glfwDefaultWindowHints.invokeExact(Handles.get().PFN_glfwDefaultWindowHints);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDefaultWindowHints", e); }
    }

    public static void glfwWindowHint(@CType("int") int hint, @CType("int") int value) {
        try {
            Handles.MH_glfwWindowHint.invokeExact(Handles.get().PFN_glfwWindowHint, hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHint", e); }
    }

    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") MemorySegment value) {
        try {
            Handles.MH_glfwWindowHintString.invokeExact(Handles.get().PFN_glfwWindowHintString, hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") String value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwWindowHintString.invokeExact(Handles.get().PFN_glfwWindowHintString, hint, Marshal.marshal(__overrungl_stack, value));
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    public static @CType("GLFWwindow*") MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") MemorySegment title, @CType("GLFWmonitor*") MemorySegment monitor, @CType("GLFWwindow*") MemorySegment share) {
        try {
            return (MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(Handles.get().PFN_glfwCreateWindow, width, height, title, monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    public static @CType("GLFWwindow*") MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") String title, @CType("GLFWmonitor*") MemorySegment monitor, @CType("GLFWwindow*") MemorySegment share) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(Handles.get().PFN_glfwCreateWindow, width, height, Marshal.marshal(__overrungl_stack, title), monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    public static void glfwDestroyWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwDestroyWindow.invokeExact(Handles.get().PFN_glfwDestroyWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyWindow", e); }
    }

    public static @CType("int") boolean glfwWindowShouldClose(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (int) Handles.MH_glfwWindowShouldClose.invokeExact(Handles.get().PFN_glfwWindowShouldClose, window) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowShouldClose", e); }
    }

    public static void glfwSetWindowShouldClose(@CType("GLFWwindow*") MemorySegment window, @CType("int") boolean value) {
        try {
            Handles.MH_glfwSetWindowShouldClose.invokeExact(Handles.get().PFN_glfwSetWindowShouldClose, window, value ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowShouldClose", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetWindowTitle_(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(Handles.get().PFN_glfwGetWindowTitle, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    public static @CType("const char*") String glfwGetWindowTitle(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(Handles.get().PFN_glfwGetWindowTitle, window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    public static void glfwSetWindowTitle(@CType("GLFWwindow*") MemorySegment window, @CType("const char*") MemorySegment title) {
        try {
            Handles.MH_glfwSetWindowTitle.invokeExact(Handles.get().PFN_glfwSetWindowTitle, window, title);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    public static void glfwSetWindowTitle(@CType("GLFWwindow*") MemorySegment window, @CType("const char*") String title) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetWindowTitle.invokeExact(Handles.get().PFN_glfwSetWindowTitle, window, Marshal.marshal(__overrungl_stack, title));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    public static void glfwSetWindowIcon(@CType("GLFWwindow*") MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") MemorySegment images) {
        try {
            Handles.MH_glfwSetWindowIcon.invokeExact(Handles.get().PFN_glfwSetWindowIcon, window, count, images);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    public static void glfwSetWindowIcon(@CType("GLFWwindow*") MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") overrungl.glfw.GLFWImage images) {
        try {
            Handles.MH_glfwSetWindowIcon.invokeExact(Handles.get().PFN_glfwSetWindowIcon, window, count, Marshal.marshal(images));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    public static void glfwGetWindowPos(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") MemorySegment xpos, @Out @CType("int*") MemorySegment ypos) {
        try {
            Handles.MH_glfwGetWindowPos.invokeExact(Handles.get().PFN_glfwGetWindowPos, window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    public static void glfwGetWindowPos(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetWindowPos.invokeExact(Handles.get().PFN_glfwGetWindowPos, window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    public static void glfwSetWindowPos(@CType("GLFWwindow*") MemorySegment window, @CType("int") int xpos, @CType("int") int ypos) {
        try {
            Handles.MH_glfwSetWindowPos.invokeExact(Handles.get().PFN_glfwSetWindowPos, window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPos", e); }
    }

    public static void glfwGetWindowSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height) {
        try {
            Handles.MH_glfwGetWindowSize.invokeExact(Handles.get().PFN_glfwGetWindowSize, window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    public static void glfwGetWindowSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetWindowSize.invokeExact(Handles.get().PFN_glfwGetWindowSize, window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    public static void glfwSetWindowSizeLimits(@CType("GLFWwindow*") MemorySegment window, @CType("int") int minwidth, @CType("int") int minheight, @CType("int") int maxwidth, @CType("int") int maxheight) {
        try {
            Handles.MH_glfwSetWindowSizeLimits.invokeExact(Handles.get().PFN_glfwSetWindowSizeLimits, window, minwidth, minheight, maxwidth, maxheight);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeLimits", e); }
    }

    public static void glfwSetWindowAspectRatio(@CType("GLFWwindow*") MemorySegment window, @CType("int") int numer, @CType("int") int denom) {
        try {
            Handles.MH_glfwSetWindowAspectRatio.invokeExact(Handles.get().PFN_glfwSetWindowAspectRatio, window, numer, denom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAspectRatio", e); }
    }

    public static void glfwSetWindowSize(@CType("GLFWwindow*") MemorySegment window, @CType("int") int width, @CType("int") int height) {
        try {
            Handles.MH_glfwSetWindowSize.invokeExact(Handles.get().PFN_glfwSetWindowSize, window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSize", e); }
    }

    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height) {
        try {
            Handles.MH_glfwGetFramebufferSize.invokeExact(Handles.get().PFN_glfwGetFramebufferSize, window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            Handles.MH_glfwGetFramebufferSize.invokeExact(Handles.get().PFN_glfwGetFramebufferSize, window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") MemorySegment left, @Out @CType("int*") MemorySegment top, @Out @CType("int*") MemorySegment right, @Out @CType("int*") MemorySegment bottom) {
        try {
            Handles.MH_glfwGetWindowFrameSize.invokeExact(Handles.get().PFN_glfwGetWindowFrameSize, window, left, top, right, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") MemorySegment window, @Out @CType("int*") int[] left, @Out @CType("int*") int[] top, @Out @CType("int*") int[] right, @Out @CType("int*") int[] bottom) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_left = Marshal.marshal(__overrungl_stack, left);
            var __overrungl_ref_top = Marshal.marshal(__overrungl_stack, top);
            var __overrungl_ref_right = Marshal.marshal(__overrungl_stack, right);
            var __overrungl_ref_bottom = Marshal.marshal(__overrungl_stack, bottom);
            Handles.MH_glfwGetWindowFrameSize.invokeExact(Handles.get().PFN_glfwGetWindowFrameSize, window, __overrungl_ref_left, __overrungl_ref_top, __overrungl_ref_right, __overrungl_ref_bottom);
            Unmarshal.copy(__overrungl_ref_left, left);
            Unmarshal.copy(__overrungl_ref_top, top);
            Unmarshal.copy(__overrungl_ref_right, right);
            Unmarshal.copy(__overrungl_ref_bottom, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") MemorySegment window, @Out @CType("float*") MemorySegment xscale, @Out @CType("float*") MemorySegment yscale) {
        try {
            Handles.MH_glfwGetWindowContentScale.invokeExact(Handles.get().PFN_glfwGetWindowContentScale, window, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") MemorySegment window, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            Handles.MH_glfwGetWindowContentScale.invokeExact(Handles.get().PFN_glfwGetWindowContentScale, window, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    public static @CType("float") float glfwGetWindowOpacity(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (float) Handles.MH_glfwGetWindowOpacity.invokeExact(Handles.get().PFN_glfwGetWindowOpacity, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowOpacity", e); }
    }

    public static void glfwSetWindowOpacity(@CType("GLFWwindow*") MemorySegment window, @CType("float") float opacity) {
        try {
            Handles.MH_glfwSetWindowOpacity.invokeExact(Handles.get().PFN_glfwSetWindowOpacity, window, opacity);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowOpacity", e); }
    }

    public static void glfwIconifyWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwIconifyWindow.invokeExact(Handles.get().PFN_glfwIconifyWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwIconifyWindow", e); }
    }

    public static void glfwRestoreWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwRestoreWindow.invokeExact(Handles.get().PFN_glfwRestoreWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRestoreWindow", e); }
    }

    public static void glfwMaximizeWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwMaximizeWindow.invokeExact(Handles.get().PFN_glfwMaximizeWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMaximizeWindow", e); }
    }

    public static void glfwShowWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwShowWindow.invokeExact(Handles.get().PFN_glfwShowWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwShowWindow", e); }
    }

    public static void glfwHideWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwHideWindow.invokeExact(Handles.get().PFN_glfwHideWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwHideWindow", e); }
    }

    public static void glfwFocusWindow(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwFocusWindow.invokeExact(Handles.get().PFN_glfwFocusWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwFocusWindow", e); }
    }

    public static void glfwRequestWindowAttention(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwRequestWindowAttention.invokeExact(Handles.get().PFN_glfwRequestWindowAttention, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRequestWindowAttention", e); }
    }

    public static @CType("GLFWmonitor*") MemorySegment glfwGetWindowMonitor(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (MemorySegment) Handles.MH_glfwGetWindowMonitor.invokeExact(Handles.get().PFN_glfwGetWindowMonitor, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowMonitor", e); }
    }

    public static void glfwSetWindowMonitor(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWmonitor*") MemorySegment monitor, @CType("int") int xpos, @CType("int") int ypos, @CType("int") int width, @CType("int") int height, @CType("int") int refreshRate) {
        try {
            Handles.MH_glfwSetWindowMonitor.invokeExact(Handles.get().PFN_glfwSetWindowMonitor, window, monitor, xpos, ypos, width, height, refreshRate);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMonitor", e); }
    }

    public static @CType("int") int glfwGetWindowAttrib(@CType("GLFWwindow*") MemorySegment window, @CType("int") int attrib) {
        try {
            return (int) Handles.MH_glfwGetWindowAttrib.invokeExact(Handles.get().PFN_glfwGetWindowAttrib, window, attrib);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowAttrib", e); }
    }

    public static void glfwSetWindowAttrib(@CType("GLFWwindow*") MemorySegment window, @CType("int") int attrib, @CType("int") int value) {
        try {
            Handles.MH_glfwSetWindowAttrib.invokeExact(Handles.get().PFN_glfwSetWindowAttrib, window, attrib, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAttrib", e); }
    }

    public static void glfwSetWindowUserPointer(@CType("GLFWwindow*") MemorySegment window, @CType("void*") MemorySegment pointer) {
        try {
            Handles.MH_glfwSetWindowUserPointer.invokeExact(Handles.get().PFN_glfwSetWindowUserPointer, window, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowUserPointer", e); }
    }

    public static @CType("void*") MemorySegment glfwGetWindowUserPointer(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (MemorySegment) Handles.MH_glfwGetWindowUserPointer.invokeExact(Handles.get().PFN_glfwGetWindowUserPointer, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowUserPointer", e); }
    }

    public static @CType("GLFWwindowposfun") MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowposfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowPosCallback.invokeExact(Handles.get().PFN_glfwSetWindowPosCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPosCallback", e); }
    }

    public static @CType("GLFWwindowposfun") MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowposfun") overrungl.glfw.GLFWWindowPosFun callback) {
        return glfwSetWindowPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowsizefun") MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowsizefun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowSizeCallback.invokeExact(Handles.get().PFN_glfwSetWindowSizeCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeCallback", e); }
    }

    public static @CType("GLFWwindowsizefun") MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowsizefun") overrungl.glfw.GLFWWindowSizeFun callback) {
        return glfwSetWindowSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowclosefun") MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowclosefun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowCloseCallback.invokeExact(Handles.get().PFN_glfwSetWindowCloseCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowCloseCallback", e); }
    }

    public static @CType("GLFWwindowclosefun") MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowclosefun") overrungl.glfw.GLFWWindowCloseFun callback) {
        return glfwSetWindowCloseCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowrefreshfun") MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowrefreshfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowRefreshCallback.invokeExact(Handles.get().PFN_glfwSetWindowRefreshCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowRefreshCallback", e); }
    }

    public static @CType("GLFWwindowrefreshfun") MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowrefreshfun") overrungl.glfw.GLFWWindowRefreshFun callback) {
        return glfwSetWindowRefreshCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowfocusfun") MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowfocusfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowFocusCallback.invokeExact(Handles.get().PFN_glfwSetWindowFocusCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowFocusCallback", e); }
    }

    public static @CType("GLFWwindowfocusfun") MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowfocusfun") overrungl.glfw.GLFWWindowFocusFun callback) {
        return glfwSetWindowFocusCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowiconifyfun") MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowiconifyfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowIconifyCallback.invokeExact(Handles.get().PFN_glfwSetWindowIconifyCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIconifyCallback", e); }
    }

    public static @CType("GLFWwindowiconifyfun") MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowiconifyfun") overrungl.glfw.GLFWWindowIconifyFun callback) {
        return glfwSetWindowIconifyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowmaximizefun") MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowmaximizefun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowMaximizeCallback.invokeExact(Handles.get().PFN_glfwSetWindowMaximizeCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMaximizeCallback", e); }
    }

    public static @CType("GLFWwindowmaximizefun") MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowmaximizefun") overrungl.glfw.GLFWWindowMaximizeFun callback) {
        return glfwSetWindowMaximizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWframebuffersizefun") MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWframebuffersizefun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetFramebufferSizeCallback.invokeExact(Handles.get().PFN_glfwSetFramebufferSizeCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetFramebufferSizeCallback", e); }
    }

    public static @CType("GLFWframebuffersizefun") MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWframebuffersizefun") overrungl.glfw.GLFWFramebufferSizeFun callback) {
        return glfwSetFramebufferSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWwindowcontentscalefun") MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowcontentscalefun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetWindowContentScaleCallback.invokeExact(Handles.get().PFN_glfwSetWindowContentScaleCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowContentScaleCallback", e); }
    }

    public static @CType("GLFWwindowcontentscalefun") MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWwindowcontentscalefun") overrungl.glfw.GLFWWindowContentScaleFun callback) {
        return glfwSetWindowContentScaleCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static void glfwPollEvents() {
        try {
            Handles.MH_glfwPollEvents.invokeExact(Handles.get().PFN_glfwPollEvents);
        } catch (Throwable e) { throw new RuntimeException("error in glfwPollEvents", e); }
    }

    public static void glfwWaitEvents() {
        try {
            Handles.MH_glfwWaitEvents.invokeExact(Handles.get().PFN_glfwWaitEvents);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEvents", e); }
    }

    public static void glfwWaitEventsTimeout(@CType("double") double timeout) {
        try {
            Handles.MH_glfwWaitEventsTimeout.invokeExact(Handles.get().PFN_glfwWaitEventsTimeout, timeout);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEventsTimeout", e); }
    }

    public static void glfwPostEmptyEvent() {
        try {
            Handles.MH_glfwPostEmptyEvent.invokeExact(Handles.get().PFN_glfwPostEmptyEvent);
        } catch (Throwable e) { throw new RuntimeException("error in glfwPostEmptyEvent", e); }
    }

    public static @CType("int") int glfwGetInputMode(@CType("GLFWwindow*") MemorySegment window, @CType("int") int mode) {
        try {
            return (int) Handles.MH_glfwGetInputMode.invokeExact(Handles.get().PFN_glfwGetInputMode, window, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInputMode", e); }
    }

    public static void glfwSetInputMode(@CType("GLFWwindow*") MemorySegment window, @CType("int") int mode, @CType("int") int value) {
        try {
            Handles.MH_glfwSetInputMode.invokeExact(Handles.get().PFN_glfwSetInputMode, window, mode, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetInputMode", e); }
    }

    public static @CType("int") boolean glfwRawMouseMotionSupported() {
        try {
            return (int) Handles.MH_glfwRawMouseMotionSupported.invokeExact(Handles.get().PFN_glfwRawMouseMotionSupported) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwRawMouseMotionSupported", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetKeyName_(@CType("int") int key, @CType("int") int scancode) {
        try {
            return (MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(Handles.get().PFN_glfwGetKeyName, key, scancode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    public static @CType("const char*") String glfwGetKeyName(@CType("int") int key, @CType("int") int scancode) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(Handles.get().PFN_glfwGetKeyName, key, scancode));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    public static @CType("int") int glfwGetKeyScancode(@CType("int") int key) {
        try {
            return (int) Handles.MH_glfwGetKeyScancode.invokeExact(Handles.get().PFN_glfwGetKeyScancode, key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyScancode", e); }
    }

    public static @CType("int") int glfwGetKey(@CType("GLFWwindow*") MemorySegment window, @CType("int") int key) {
        try {
            return (int) Handles.MH_glfwGetKey.invokeExact(Handles.get().PFN_glfwGetKey, window, key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKey", e); }
    }

    public static @CType("int") int glfwGetMouseButton(@CType("GLFWwindow*") MemorySegment window, @CType("int") int button) {
        try {
            return (int) Handles.MH_glfwGetMouseButton.invokeExact(Handles.get().PFN_glfwGetMouseButton, window, button);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMouseButton", e); }
    }

    public static void glfwGetCursorPos(@CType("GLFWwindow*") MemorySegment window, @Out @CType("double*") MemorySegment xpos, @Out @CType("double*") MemorySegment ypos) {
        try {
            Handles.MH_glfwGetCursorPos.invokeExact(Handles.get().PFN_glfwGetCursorPos, window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    public static void glfwGetCursorPos(@CType("GLFWwindow*") MemorySegment window, @Out @CType("double*") double[] xpos, @Out @CType("double*") double[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_glfwGetCursorPos.invokeExact(Handles.get().PFN_glfwGetCursorPos, window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    public static void glfwSetCursorPos(@CType("GLFWwindow*") MemorySegment window, @CType("double") double xpos, @CType("double") double ypos) {
        try {
            Handles.MH_glfwSetCursorPos.invokeExact(Handles.get().PFN_glfwSetCursorPos, window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPos", e); }
    }

    public static @CType("GLFWcursor*") MemorySegment glfwCreateCursor(@CType("const GLFWimage*") MemorySegment image, @CType("int") int xhot, @CType("int") int yhot) {
        try {
            return (MemorySegment) Handles.MH_glfwCreateCursor.invokeExact(Handles.get().PFN_glfwCreateCursor, image, xhot, yhot);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateCursor", e); }
    }

    public static @CType("GLFWcursor*") MemorySegment glfwCreateStandardCursor(@CType("int") int shape) {
        try {
            return (MemorySegment) Handles.MH_glfwCreateStandardCursor.invokeExact(Handles.get().PFN_glfwCreateStandardCursor, shape);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateStandardCursor", e); }
    }

    public static void glfwDestroyCursor(@CType("GLFWcursor*") MemorySegment cursor) {
        try {
            Handles.MH_glfwDestroyCursor.invokeExact(Handles.get().PFN_glfwDestroyCursor, cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyCursor", e); }
    }

    public static void glfwSetCursor(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcursor*") MemorySegment cursor) {
        try {
            Handles.MH_glfwSetCursor.invokeExact(Handles.get().PFN_glfwSetCursor, window, cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    public static @CType("GLFWkeyfun") MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWkeyfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetKeyCallback.invokeExact(Handles.get().PFN_glfwSetKeyCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetKeyCallback", e); }
    }

    public static @CType("GLFWkeyfun") MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWkeyfun") overrungl.glfw.GLFWKeyFun callback) {
        return glfwSetKeyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcharfun") MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcharfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetCharCallback.invokeExact(Handles.get().PFN_glfwSetCharCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCharCallback", e); }
    }

    public static @CType("GLFWcharfun") MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcharfun") overrungl.glfw.GLFWCharFun callback) {
        return glfwSetCharCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWmousebuttonfun") MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWmousebuttonfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetMouseButtonCallback.invokeExact(Handles.get().PFN_glfwSetMouseButtonCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMouseButtonCallback", e); }
    }

    public static @CType("GLFWmousebuttonfun") MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWmousebuttonfun") overrungl.glfw.GLFWMouseButtonFun callback) {
        return glfwSetMouseButtonCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcursorposfun") MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcursorposfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetCursorPosCallback.invokeExact(Handles.get().PFN_glfwSetCursorPosCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPosCallback", e); }
    }

    public static @CType("GLFWcursorposfun") MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcursorposfun") overrungl.glfw.GLFWCursorPosFun callback) {
        return glfwSetCursorPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWcursorenterfun") MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcursorenterfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetCursorEnterCallback.invokeExact(Handles.get().PFN_glfwSetCursorEnterCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorEnterCallback", e); }
    }

    public static @CType("GLFWcursorenterfun") MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWcursorenterfun") overrungl.glfw.GLFWCursorEnterFun callback) {
        return glfwSetCursorEnterCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWscrollfun") MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWscrollfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetScrollCallback.invokeExact(Handles.get().PFN_glfwSetScrollCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetScrollCallback", e); }
    }

    public static @CType("GLFWscrollfun") MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWscrollfun") overrungl.glfw.GLFWScrollFun callback) {
        return glfwSetScrollCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("GLFWdropfun") MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWdropfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetDropCallback.invokeExact(Handles.get().PFN_glfwSetDropCallback, window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetDropCallback", e); }
    }

    public static @CType("GLFWdropfun") MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") MemorySegment window, @CType("GLFWdropfun") overrungl.glfw.GLFWDropFun callback) {
        return glfwSetDropCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    public static @CType("int") boolean glfwJoystickPresent(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickPresent.invokeExact(Handles.get().PFN_glfwJoystickPresent, jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickPresent", e); }
    }

    public static @CType("const float*") MemorySegment glfwGetJoystickAxes(@CType("int") int jid, @Out @CType("int*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickAxes.invokeExact(Handles.get().PFN_glfwGetJoystickAxes, jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickAxes", e); }
    }

    public static @CType("const unsigned char*") MemorySegment glfwGetJoystickButtons(@CType("int") int jid, @Out @CType("int*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickButtons.invokeExact(Handles.get().PFN_glfwGetJoystickButtons, jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickButtons", e); }
    }

    public static @CType("const unsigned char*") MemorySegment glfwGetJoystickHats(@CType("int") int jid, @Out @CType("int*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickHats.invokeExact(Handles.get().PFN_glfwGetJoystickHats, jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickHats", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetJoystickName_(@CType("int") int jid) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(Handles.get().PFN_glfwGetJoystickName, jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    public static @CType("const char*") String glfwGetJoystickName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(Handles.get().PFN_glfwGetJoystickName, jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetJoystickGUID_(@CType("int") int jid) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(Handles.get().PFN_glfwGetJoystickGUID, jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    public static @CType("const char*") String glfwGetJoystickGUID(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(Handles.get().PFN_glfwGetJoystickGUID, jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    public static void glfwSetJoystickUserPointer(@CType("int") int jid, @CType("void*") MemorySegment pointer) {
        try {
            Handles.MH_glfwSetJoystickUserPointer.invokeExact(Handles.get().PFN_glfwSetJoystickUserPointer, jid, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickUserPointer", e); }
    }

    public static @CType("void*") MemorySegment glfwGetJoystickUserPointer(@CType("int") int jid) {
        try {
            return (MemorySegment) Handles.MH_glfwGetJoystickUserPointer.invokeExact(Handles.get().PFN_glfwGetJoystickUserPointer, jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickUserPointer", e); }
    }

    public static @CType("int") boolean glfwJoystickIsGamepad(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickIsGamepad.invokeExact(Handles.get().PFN_glfwJoystickIsGamepad, jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickIsGamepad", e); }
    }

    public static @CType("GLFWjoystickfun") MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") MemorySegment callback) {
        try {
            return (MemorySegment) Handles.MH_glfwSetJoystickCallback.invokeExact(Handles.get().PFN_glfwSetJoystickCallback, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickCallback", e); }
    }

    public static @CType("GLFWjoystickfun") MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") overrungl.glfw.GLFWJoystickFun callback) {
        return glfwSetJoystickCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") MemorySegment string) {
        try {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(Handles.get().PFN_glfwUpdateGamepadMappings, string) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(Handles.get().PFN_glfwUpdateGamepadMappings, Marshal.marshal(__overrungl_stack, string)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetGamepadName_(@CType("int") int jid) {
        try {
            return (MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(Handles.get().PFN_glfwGetGamepadName, jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    public static @CType("const char*") String glfwGetGamepadName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(Handles.get().PFN_glfwGetGamepadName, jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") MemorySegment state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(Handles.get().PFN_glfwGetGamepadState, jid, state) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") overrungl.glfw.GLFWGamepadState state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(Handles.get().PFN_glfwGetGamepadState, jid, Marshal.marshal(state)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    public static void glfwSetClipboardString(@CType("GLFWwindow*") MemorySegment window, @CType("const char*") MemorySegment string) {
        try {
            Handles.MH_glfwSetClipboardString.invokeExact(Handles.get().PFN_glfwSetClipboardString, window, string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    public static void glfwSetClipboardString(@CType("GLFWwindow*") MemorySegment window, @CType("const char*") String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetClipboardString.invokeExact(Handles.get().PFN_glfwSetClipboardString, window, Marshal.marshal(__overrungl_stack, string));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    public static @CType("const char*") MemorySegment glfwGetClipboardString_(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return (MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(Handles.get().PFN_glfwGetClipboardString, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    public static @CType("const char*") String glfwGetClipboardString(@CType("GLFWwindow*") MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(Handles.get().PFN_glfwGetClipboardString, window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    public static @CType("double") double glfwGetTime() {
        try {
            return (double) Handles.MH_glfwGetTime.invokeExact(Handles.get().PFN_glfwGetTime);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTime", e); }
    }

    public static void glfwSetTime(@CType("double") double time) {
        try {
            Handles.MH_glfwSetTime.invokeExact(Handles.get().PFN_glfwSetTime, time);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetTime", e); }
    }

    public static @CType("uint64_t") long glfwGetTimerValue() {
        try {
            return (long) Handles.MH_glfwGetTimerValue.invokeExact(Handles.get().PFN_glfwGetTimerValue);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerValue", e); }
    }

    public static @CType("uint64_t") long glfwGetTimerFrequency() {
        try {
            return (long) Handles.MH_glfwGetTimerFrequency.invokeExact(Handles.get().PFN_glfwGetTimerFrequency);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerFrequency", e); }
    }

    public static void glfwMakeContextCurrent(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwMakeContextCurrent.invokeExact(Handles.get().PFN_glfwMakeContextCurrent, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMakeContextCurrent", e); }
    }

    public static @CType("GLFWwindow*") MemorySegment glfwGetCurrentContext() {
        try {
            return (MemorySegment) Handles.MH_glfwGetCurrentContext.invokeExact(Handles.get().PFN_glfwGetCurrentContext);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCurrentContext", e); }
    }

    public static void glfwSwapBuffers(@CType("GLFWwindow*") MemorySegment window) {
        try {
            Handles.MH_glfwSwapBuffers.invokeExact(Handles.get().PFN_glfwSwapBuffers, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapBuffers", e); }
    }

    public static void glfwSwapInterval(@CType("int") int interval) {
        try {
            Handles.MH_glfwSwapInterval.invokeExact(Handles.get().PFN_glfwSwapInterval, interval);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapInterval", e); }
    }

    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") MemorySegment extension) {
        try {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(Handles.get().PFN_glfwExtensionSupported, extension) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") String extension) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(Handles.get().PFN_glfwExtensionSupported, Marshal.marshal(__overrungl_stack, extension)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    public static @CType("GLFWglproc") MemorySegment glfwGetProcAddress(@CType("const char*") MemorySegment procname) {
        try {
            return (MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(Handles.get().PFN_glfwGetProcAddress, procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    public static @CType("GLFWglproc") MemorySegment glfwGetProcAddress(@CType("const char*") String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(Handles.get().PFN_glfwGetProcAddress, Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    public static @CType("int") boolean glfwVulkanSupported() {
        try {
            return (int) Handles.MH_glfwVulkanSupported.invokeExact(Handles.get().PFN_glfwVulkanSupported) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwVulkanSupported", e); }
    }

    public static @CType("const char**") MemorySegment glfwGetRequiredInstanceExtensions(@Out @CType("uint32_t*") MemorySegment count) {
        try {
            return (MemorySegment) Handles.MH_glfwGetRequiredInstanceExtensions.invokeExact(Handles.get().PFN_glfwGetRequiredInstanceExtensions, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetRequiredInstanceExtensions", e); }
    }

    public static @CType("GLFWvkproc") MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") MemorySegment instance, @CType("const char*") MemorySegment procname) {
        try {
            return (MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(Handles.get().PFN_glfwGetInstanceProcAddress, instance, procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    public static @CType("GLFWvkproc") MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") MemorySegment instance, @CType("const char*") String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(Handles.get().PFN_glfwGetInstanceProcAddress, instance, Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    public static @CType("int") boolean glfwGetPhysicalDevicePresentationSupport(@CType("VkInstance") MemorySegment instance, @CType("VkPhysicalDevice") MemorySegment device, @CType("uint32_t") int queuefamily) {
        try {
            return (int) Handles.MH_glfwGetPhysicalDevicePresentationSupport.invokeExact(Handles.get().PFN_glfwGetPhysicalDevicePresentationSupport, instance, device, queuefamily) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPhysicalDevicePresentationSupport", e); }
    }

    public static @CType("VkResult") int glfwCreateWindowSurface(@CType("VkInstance") MemorySegment instance, @CType("GLFWwindow*") MemorySegment window, @CType("const VkAllocationCallbacks*") MemorySegment allocator, @Out @CType("VkSurfaceKHR*") MemorySegment surface) {
        try {
            return (int) Handles.MH_glfwCreateWindowSurface.invokeExact(Handles.get().PFN_glfwCreateWindowSurface, instance, window, allocator, surface);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindowSurface", e); }
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
