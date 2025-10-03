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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.glfw;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

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
        /// The method handle of [`glfwInit`][#glfwInit].
        public static final Supplier<MethodHandle> MH_glfwInit = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwTerminate`][#glfwTerminate].
        public static final Supplier<MethodHandle> MH_glfwTerminate = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        /// The method handle of [`glfwInitHint`][#glfwInitHint].
        public static final Supplier<MethodHandle> MH_glfwInitHint = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwInitAllocator`][#glfwInitAllocator].
        public static final Supplier<MethodHandle> MH_glfwInitAllocator = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwInitVulkanLoader`][#glfwInitVulkanLoader].
        public static final Supplier<MethodHandle> MH_glfwInitVulkanLoader = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetVersion`][#glfwGetVersion].
        public static final Supplier<MethodHandle> MH_glfwGetVersion = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetVersionString`][#glfwGetVersionString].
        public static final Supplier<MethodHandle> MH_glfwGetVersionString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetError`][#glfwGetError].
        public static final Supplier<MethodHandle> MH_glfwGetError = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetErrorCallback`][#glfwSetErrorCallback].
        public static final Supplier<MethodHandle> MH_glfwSetErrorCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetPlatform`][#glfwGetPlatform].
        public static final Supplier<MethodHandle> MH_glfwGetPlatform = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwPlatformSupported`][#glfwPlatformSupported].
        public static final Supplier<MethodHandle> MH_glfwPlatformSupported = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetMonitors`][#glfwGetMonitors].
        public static final Supplier<MethodHandle> MH_glfwGetMonitors = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetPrimaryMonitor`][#glfwGetPrimaryMonitor].
        public static final Supplier<MethodHandle> MH_glfwGetPrimaryMonitor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorPos`][#glfwGetMonitorPos].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorPos = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorWorkarea`][#glfwGetMonitorWorkarea].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorWorkarea = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorPhysicalSize`][#glfwGetMonitorPhysicalSize].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorPhysicalSize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorContentScale`][#glfwGetMonitorContentScale].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorContentScale = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorName`][#glfwGetMonitorName].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetMonitorUserPointer`][#glfwSetMonitorUserPointer].
        public static final Supplier<MethodHandle> MH_glfwSetMonitorUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetMonitorUserPointer`][#glfwGetMonitorUserPointer].
        public static final Supplier<MethodHandle> MH_glfwGetMonitorUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetMonitorCallback`][#glfwSetMonitorCallback].
        public static final Supplier<MethodHandle> MH_glfwSetMonitorCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetVideoModes`][#glfwGetVideoModes].
        public static final Supplier<MethodHandle> MH_glfwGetVideoModes = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetVideoMode`][#glfwGetVideoMode].
        public static final Supplier<MethodHandle> MH_glfwGetVideoMode = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetGamma`][#glfwSetGamma].
        public static final Supplier<MethodHandle> MH_glfwSetGamma = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`glfwGetGammaRamp`][#glfwGetGammaRamp].
        public static final Supplier<MethodHandle> MH_glfwGetGammaRamp = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetGammaRamp`][#glfwSetGammaRamp].
        public static final Supplier<MethodHandle> MH_glfwSetGammaRamp = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwDefaultWindowHints`][#glfwDefaultWindowHints].
        public static final Supplier<MethodHandle> MH_glfwDefaultWindowHints = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        /// The method handle of [`glfwWindowHint`][#glfwWindowHint].
        public static final Supplier<MethodHandle> MH_glfwWindowHint = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwWindowHintString`][#glfwWindowHintString].
        public static final Supplier<MethodHandle> MH_glfwWindowHintString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwCreateWindow`][#glfwCreateWindow].
        public static final Supplier<MethodHandle> MH_glfwCreateWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwDestroyWindow`][#glfwDestroyWindow].
        public static final Supplier<MethodHandle> MH_glfwDestroyWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwWindowShouldClose`][#glfwWindowShouldClose].
        public static final Supplier<MethodHandle> MH_glfwWindowShouldClose = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowShouldClose`][#glfwSetWindowShouldClose].
        public static final Supplier<MethodHandle> MH_glfwSetWindowShouldClose = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetWindowTitle`][#glfwGetWindowTitle].
        public static final Supplier<MethodHandle> MH_glfwGetWindowTitle = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowTitle`][#glfwSetWindowTitle].
        public static final Supplier<MethodHandle> MH_glfwSetWindowTitle = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowIcon`][#glfwSetWindowIcon].
        public static final Supplier<MethodHandle> MH_glfwSetWindowIcon = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowPos`][#glfwGetWindowPos].
        public static final Supplier<MethodHandle> MH_glfwGetWindowPos = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowPos`][#glfwSetWindowPos].
        public static final Supplier<MethodHandle> MH_glfwSetWindowPos = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetWindowSize`][#glfwGetWindowSize].
        public static final Supplier<MethodHandle> MH_glfwGetWindowSize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowSizeLimits`][#glfwSetWindowSizeLimits].
        public static final Supplier<MethodHandle> MH_glfwSetWindowSizeLimits = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetWindowAspectRatio`][#glfwSetWindowAspectRatio].
        public static final Supplier<MethodHandle> MH_glfwSetWindowAspectRatio = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetWindowSize`][#glfwSetWindowSize].
        public static final Supplier<MethodHandle> MH_glfwSetWindowSize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetFramebufferSize`][#glfwGetFramebufferSize].
        public static final Supplier<MethodHandle> MH_glfwGetFramebufferSize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowFrameSize`][#glfwGetWindowFrameSize].
        public static final Supplier<MethodHandle> MH_glfwGetWindowFrameSize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowContentScale`][#glfwGetWindowContentScale].
        public static final Supplier<MethodHandle> MH_glfwGetWindowContentScale = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowOpacity`][#glfwGetWindowOpacity].
        public static final Supplier<MethodHandle> MH_glfwGetWindowOpacity = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowOpacity`][#glfwSetWindowOpacity].
        public static final Supplier<MethodHandle> MH_glfwSetWindowOpacity = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`glfwIconifyWindow`][#glfwIconifyWindow].
        public static final Supplier<MethodHandle> MH_glfwIconifyWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwRestoreWindow`][#glfwRestoreWindow].
        public static final Supplier<MethodHandle> MH_glfwRestoreWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwMaximizeWindow`][#glfwMaximizeWindow].
        public static final Supplier<MethodHandle> MH_glfwMaximizeWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwShowWindow`][#glfwShowWindow].
        public static final Supplier<MethodHandle> MH_glfwShowWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwHideWindow`][#glfwHideWindow].
        public static final Supplier<MethodHandle> MH_glfwHideWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwFocusWindow`][#glfwFocusWindow].
        public static final Supplier<MethodHandle> MH_glfwFocusWindow = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwRequestWindowAttention`][#glfwRequestWindowAttention].
        public static final Supplier<MethodHandle> MH_glfwRequestWindowAttention = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowMonitor`][#glfwGetWindowMonitor].
        public static final Supplier<MethodHandle> MH_glfwGetWindowMonitor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowMonitor`][#glfwSetWindowMonitor].
        public static final Supplier<MethodHandle> MH_glfwSetWindowMonitor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetWindowAttrib`][#glfwGetWindowAttrib].
        public static final Supplier<MethodHandle> MH_glfwGetWindowAttrib = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetWindowAttrib`][#glfwSetWindowAttrib].
        public static final Supplier<MethodHandle> MH_glfwSetWindowAttrib = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetWindowUserPointer`][#glfwSetWindowUserPointer].
        public static final Supplier<MethodHandle> MH_glfwSetWindowUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetWindowUserPointer`][#glfwGetWindowUserPointer].
        public static final Supplier<MethodHandle> MH_glfwGetWindowUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowPosCallback`][#glfwSetWindowPosCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowPosCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowSizeCallback`][#glfwSetWindowSizeCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowSizeCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowCloseCallback`][#glfwSetWindowCloseCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowCloseCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowRefreshCallback`][#glfwSetWindowRefreshCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowRefreshCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowFocusCallback`][#glfwSetWindowFocusCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowFocusCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowIconifyCallback`][#glfwSetWindowIconifyCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowIconifyCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowMaximizeCallback`][#glfwSetWindowMaximizeCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowMaximizeCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetFramebufferSizeCallback`][#glfwSetFramebufferSizeCallback].
        public static final Supplier<MethodHandle> MH_glfwSetFramebufferSizeCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetWindowContentScaleCallback`][#glfwSetWindowContentScaleCallback].
        public static final Supplier<MethodHandle> MH_glfwSetWindowContentScaleCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwPollEvents`][#glfwPollEvents].
        public static final Supplier<MethodHandle> MH_glfwPollEvents = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        /// The method handle of [`glfwWaitEvents`][#glfwWaitEvents].
        public static final Supplier<MethodHandle> MH_glfwWaitEvents = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        /// The method handle of [`glfwWaitEventsTimeout`][#glfwWaitEventsTimeout].
        public static final Supplier<MethodHandle> MH_glfwWaitEventsTimeout = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE)));
        /// The method handle of [`glfwPostEmptyEvent`][#glfwPostEmptyEvent].
        public static final Supplier<MethodHandle> MH_glfwPostEmptyEvent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        /// The method handle of [`glfwGetInputMode`][#glfwGetInputMode].
        public static final Supplier<MethodHandle> MH_glfwGetInputMode = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetInputMode`][#glfwSetInputMode].
        public static final Supplier<MethodHandle> MH_glfwSetInputMode = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwRawMouseMotionSupported`][#glfwRawMouseMotionSupported].
        public static final Supplier<MethodHandle> MH_glfwRawMouseMotionSupported = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetKeyName`][#glfwGetKeyName].
        public static final Supplier<MethodHandle> MH_glfwGetKeyName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetKeyScancode`][#glfwGetKeyScancode].
        public static final Supplier<MethodHandle> MH_glfwGetKeyScancode = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetKey`][#glfwGetKey].
        public static final Supplier<MethodHandle> MH_glfwGetKey = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetMouseButton`][#glfwGetMouseButton].
        public static final Supplier<MethodHandle> MH_glfwGetMouseButton = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetCursorPos`][#glfwGetCursorPos].
        public static final Supplier<MethodHandle> MH_glfwGetCursorPos = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetCursorPos`][#glfwSetCursorPos].
        public static final Supplier<MethodHandle> MH_glfwSetCursorPos = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        /// The method handle of [`glfwCreateCursor`][#glfwCreateCursor].
        public static final Supplier<MethodHandle> MH_glfwCreateCursor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwCreateStandardCursor`][#glfwCreateStandardCursor].
        public static final Supplier<MethodHandle> MH_glfwCreateStandardCursor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwDestroyCursor`][#glfwDestroyCursor].
        public static final Supplier<MethodHandle> MH_glfwDestroyCursor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetCursor`][#glfwSetCursor].
        public static final Supplier<MethodHandle> MH_glfwSetCursor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetKeyCallback`][#glfwSetKeyCallback].
        public static final Supplier<MethodHandle> MH_glfwSetKeyCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetCharCallback`][#glfwSetCharCallback].
        public static final Supplier<MethodHandle> MH_glfwSetCharCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetMouseButtonCallback`][#glfwSetMouseButtonCallback].
        public static final Supplier<MethodHandle> MH_glfwSetMouseButtonCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetCursorPosCallback`][#glfwSetCursorPosCallback].
        public static final Supplier<MethodHandle> MH_glfwSetCursorPosCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetCursorEnterCallback`][#glfwSetCursorEnterCallback].
        public static final Supplier<MethodHandle> MH_glfwSetCursorEnterCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetScrollCallback`][#glfwSetScrollCallback].
        public static final Supplier<MethodHandle> MH_glfwSetScrollCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetDropCallback`][#glfwSetDropCallback].
        public static final Supplier<MethodHandle> MH_glfwSetDropCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwJoystickPresent`][#glfwJoystickPresent].
        public static final Supplier<MethodHandle> MH_glfwJoystickPresent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetJoystickAxes`][#glfwGetJoystickAxes].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickAxes = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetJoystickButtons`][#glfwGetJoystickButtons].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickButtons = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetJoystickHats`][#glfwGetJoystickHats].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickHats = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetJoystickName`][#glfwGetJoystickName].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetJoystickGUID`][#glfwGetJoystickGUID].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickGUID = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetJoystickUserPointer`][#glfwSetJoystickUserPointer].
        public static final Supplier<MethodHandle> MH_glfwSetJoystickUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetJoystickUserPointer`][#glfwGetJoystickUserPointer].
        public static final Supplier<MethodHandle> MH_glfwGetJoystickUserPointer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwJoystickIsGamepad`][#glfwJoystickIsGamepad].
        public static final Supplier<MethodHandle> MH_glfwJoystickIsGamepad = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwSetJoystickCallback`][#glfwSetJoystickCallback].
        public static final Supplier<MethodHandle> MH_glfwSetJoystickCallback = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwUpdateGamepadMappings`][#glfwUpdateGamepadMappings].
        public static final Supplier<MethodHandle> MH_glfwUpdateGamepadMappings = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetGamepadName`][#glfwGetGamepadName].
        public static final Supplier<MethodHandle> MH_glfwGetGamepadName = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetGamepadState`][#glfwGetGamepadState].
        public static final Supplier<MethodHandle> MH_glfwGetGamepadState = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSetClipboardString`][#glfwSetClipboardString].
        public static final Supplier<MethodHandle> MH_glfwSetClipboardString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetClipboardString`][#glfwGetClipboardString].
        public static final Supplier<MethodHandle> MH_glfwGetClipboardString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetTime`][#glfwGetTime].
        public static final Supplier<MethodHandle> MH_glfwGetTime = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)));
        /// The method handle of [`glfwSetTime`][#glfwSetTime].
        public static final Supplier<MethodHandle> MH_glfwSetTime = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE)));
        /// The method handle of [`glfwGetTimerValue`][#glfwGetTimerValue].
        public static final Supplier<MethodHandle> MH_glfwGetTimerValue = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG)));
        /// The method handle of [`glfwGetTimerFrequency`][#glfwGetTimerFrequency].
        public static final Supplier<MethodHandle> MH_glfwGetTimerFrequency = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG)));
        /// The method handle of [`glfwMakeContextCurrent`][#glfwMakeContextCurrent].
        public static final Supplier<MethodHandle> MH_glfwMakeContextCurrent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetCurrentContext`][#glfwGetCurrentContext].
        public static final Supplier<MethodHandle> MH_glfwGetCurrentContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSwapBuffers`][#glfwSwapBuffers].
        public static final Supplier<MethodHandle> MH_glfwSwapBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`glfwSwapInterval`][#glfwSwapInterval].
        public static final Supplier<MethodHandle> MH_glfwSwapInterval = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwExtensionSupported`][#glfwExtensionSupported].
        public static final Supplier<MethodHandle> MH_glfwExtensionSupported = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetProcAddress`][#glfwGetProcAddress].
        public static final Supplier<MethodHandle> MH_glfwGetProcAddress = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwVulkanSupported`][#glfwVulkanSupported].
        public static final Supplier<MethodHandle> MH_glfwVulkanSupported = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwGetRequiredInstanceExtensions`][#glfwGetRequiredInstanceExtensions].
        public static final Supplier<MethodHandle> MH_glfwGetRequiredInstanceExtensions = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetInstanceProcAddress`][#glfwGetInstanceProcAddress].
        public static final Supplier<MethodHandle> MH_glfwGetInstanceProcAddress = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`glfwGetPhysicalDevicePresentationSupport`][#glfwGetPhysicalDevicePresentationSupport].
        public static final Supplier<MethodHandle> MH_glfwGetPhysicalDevicePresentationSupport = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`glfwCreateWindowSurface`][#glfwCreateWindowSurface].
        public static final Supplier<MethodHandle> MH_glfwCreateWindowSurface = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The function address of [`glfwInit`][#glfwInit].
        public final MemorySegment PFN_glfwInit;
        /// The function address of [`glfwTerminate`][#glfwTerminate].
        public final MemorySegment PFN_glfwTerminate;
        /// The function address of [`glfwInitHint`][#glfwInitHint].
        public final MemorySegment PFN_glfwInitHint;
        /// The function address of [`glfwInitAllocator`][#glfwInitAllocator].
        public final MemorySegment PFN_glfwInitAllocator;
        /// The function address of [`glfwInitVulkanLoader`][#glfwInitVulkanLoader].
        public final MemorySegment PFN_glfwInitVulkanLoader;
        /// The function address of [`glfwGetVersion`][#glfwGetVersion].
        public final MemorySegment PFN_glfwGetVersion;
        /// The function address of [`glfwGetVersionString`][#glfwGetVersionString].
        public final MemorySegment PFN_glfwGetVersionString;
        /// The function address of [`glfwGetError`][#glfwGetError].
        public final MemorySegment PFN_glfwGetError;
        /// The function address of [`glfwSetErrorCallback`][#glfwSetErrorCallback].
        public final MemorySegment PFN_glfwSetErrorCallback;
        /// The function address of [`glfwGetPlatform`][#glfwGetPlatform].
        public final MemorySegment PFN_glfwGetPlatform;
        /// The function address of [`glfwPlatformSupported`][#glfwPlatformSupported].
        public final MemorySegment PFN_glfwPlatformSupported;
        /// The function address of [`glfwGetMonitors`][#glfwGetMonitors].
        public final MemorySegment PFN_glfwGetMonitors;
        /// The function address of [`glfwGetPrimaryMonitor`][#glfwGetPrimaryMonitor].
        public final MemorySegment PFN_glfwGetPrimaryMonitor;
        /// The function address of [`glfwGetMonitorPos`][#glfwGetMonitorPos].
        public final MemorySegment PFN_glfwGetMonitorPos;
        /// The function address of [`glfwGetMonitorWorkarea`][#glfwGetMonitorWorkarea].
        public final MemorySegment PFN_glfwGetMonitorWorkarea;
        /// The function address of [`glfwGetMonitorPhysicalSize`][#glfwGetMonitorPhysicalSize].
        public final MemorySegment PFN_glfwGetMonitorPhysicalSize;
        /// The function address of [`glfwGetMonitorContentScale`][#glfwGetMonitorContentScale].
        public final MemorySegment PFN_glfwGetMonitorContentScale;
        /// The function address of [`glfwGetMonitorName`][#glfwGetMonitorName].
        public final MemorySegment PFN_glfwGetMonitorName;
        /// The function address of [`glfwSetMonitorUserPointer`][#glfwSetMonitorUserPointer].
        public final MemorySegment PFN_glfwSetMonitorUserPointer;
        /// The function address of [`glfwGetMonitorUserPointer`][#glfwGetMonitorUserPointer].
        public final MemorySegment PFN_glfwGetMonitorUserPointer;
        /// The function address of [`glfwSetMonitorCallback`][#glfwSetMonitorCallback].
        public final MemorySegment PFN_glfwSetMonitorCallback;
        /// The function address of [`glfwGetVideoModes`][#glfwGetVideoModes].
        public final MemorySegment PFN_glfwGetVideoModes;
        /// The function address of [`glfwGetVideoMode`][#glfwGetVideoMode].
        public final MemorySegment PFN_glfwGetVideoMode;
        /// The function address of [`glfwSetGamma`][#glfwSetGamma].
        public final MemorySegment PFN_glfwSetGamma;
        /// The function address of [`glfwGetGammaRamp`][#glfwGetGammaRamp].
        public final MemorySegment PFN_glfwGetGammaRamp;
        /// The function address of [`glfwSetGammaRamp`][#glfwSetGammaRamp].
        public final MemorySegment PFN_glfwSetGammaRamp;
        /// The function address of [`glfwDefaultWindowHints`][#glfwDefaultWindowHints].
        public final MemorySegment PFN_glfwDefaultWindowHints;
        /// The function address of [`glfwWindowHint`][#glfwWindowHint].
        public final MemorySegment PFN_glfwWindowHint;
        /// The function address of [`glfwWindowHintString`][#glfwWindowHintString].
        public final MemorySegment PFN_glfwWindowHintString;
        /// The function address of [`glfwCreateWindow`][#glfwCreateWindow].
        public final MemorySegment PFN_glfwCreateWindow;
        /// The function address of [`glfwDestroyWindow`][#glfwDestroyWindow].
        public final MemorySegment PFN_glfwDestroyWindow;
        /// The function address of [`glfwWindowShouldClose`][#glfwWindowShouldClose].
        public final MemorySegment PFN_glfwWindowShouldClose;
        /// The function address of [`glfwSetWindowShouldClose`][#glfwSetWindowShouldClose].
        public final MemorySegment PFN_glfwSetWindowShouldClose;
        /// The function address of [`glfwGetWindowTitle`][#glfwGetWindowTitle].
        public final MemorySegment PFN_glfwGetWindowTitle;
        /// The function address of [`glfwSetWindowTitle`][#glfwSetWindowTitle].
        public final MemorySegment PFN_glfwSetWindowTitle;
        /// The function address of [`glfwSetWindowIcon`][#glfwSetWindowIcon].
        public final MemorySegment PFN_glfwSetWindowIcon;
        /// The function address of [`glfwGetWindowPos`][#glfwGetWindowPos].
        public final MemorySegment PFN_glfwGetWindowPos;
        /// The function address of [`glfwSetWindowPos`][#glfwSetWindowPos].
        public final MemorySegment PFN_glfwSetWindowPos;
        /// The function address of [`glfwGetWindowSize`][#glfwGetWindowSize].
        public final MemorySegment PFN_glfwGetWindowSize;
        /// The function address of [`glfwSetWindowSizeLimits`][#glfwSetWindowSizeLimits].
        public final MemorySegment PFN_glfwSetWindowSizeLimits;
        /// The function address of [`glfwSetWindowAspectRatio`][#glfwSetWindowAspectRatio].
        public final MemorySegment PFN_glfwSetWindowAspectRatio;
        /// The function address of [`glfwSetWindowSize`][#glfwSetWindowSize].
        public final MemorySegment PFN_glfwSetWindowSize;
        /// The function address of [`glfwGetFramebufferSize`][#glfwGetFramebufferSize].
        public final MemorySegment PFN_glfwGetFramebufferSize;
        /// The function address of [`glfwGetWindowFrameSize`][#glfwGetWindowFrameSize].
        public final MemorySegment PFN_glfwGetWindowFrameSize;
        /// The function address of [`glfwGetWindowContentScale`][#glfwGetWindowContentScale].
        public final MemorySegment PFN_glfwGetWindowContentScale;
        /// The function address of [`glfwGetWindowOpacity`][#glfwGetWindowOpacity].
        public final MemorySegment PFN_glfwGetWindowOpacity;
        /// The function address of [`glfwSetWindowOpacity`][#glfwSetWindowOpacity].
        public final MemorySegment PFN_glfwSetWindowOpacity;
        /// The function address of [`glfwIconifyWindow`][#glfwIconifyWindow].
        public final MemorySegment PFN_glfwIconifyWindow;
        /// The function address of [`glfwRestoreWindow`][#glfwRestoreWindow].
        public final MemorySegment PFN_glfwRestoreWindow;
        /// The function address of [`glfwMaximizeWindow`][#glfwMaximizeWindow].
        public final MemorySegment PFN_glfwMaximizeWindow;
        /// The function address of [`glfwShowWindow`][#glfwShowWindow].
        public final MemorySegment PFN_glfwShowWindow;
        /// The function address of [`glfwHideWindow`][#glfwHideWindow].
        public final MemorySegment PFN_glfwHideWindow;
        /// The function address of [`glfwFocusWindow`][#glfwFocusWindow].
        public final MemorySegment PFN_glfwFocusWindow;
        /// The function address of [`glfwRequestWindowAttention`][#glfwRequestWindowAttention].
        public final MemorySegment PFN_glfwRequestWindowAttention;
        /// The function address of [`glfwGetWindowMonitor`][#glfwGetWindowMonitor].
        public final MemorySegment PFN_glfwGetWindowMonitor;
        /// The function address of [`glfwSetWindowMonitor`][#glfwSetWindowMonitor].
        public final MemorySegment PFN_glfwSetWindowMonitor;
        /// The function address of [`glfwGetWindowAttrib`][#glfwGetWindowAttrib].
        public final MemorySegment PFN_glfwGetWindowAttrib;
        /// The function address of [`glfwSetWindowAttrib`][#glfwSetWindowAttrib].
        public final MemorySegment PFN_glfwSetWindowAttrib;
        /// The function address of [`glfwSetWindowUserPointer`][#glfwSetWindowUserPointer].
        public final MemorySegment PFN_glfwSetWindowUserPointer;
        /// The function address of [`glfwGetWindowUserPointer`][#glfwGetWindowUserPointer].
        public final MemorySegment PFN_glfwGetWindowUserPointer;
        /// The function address of [`glfwSetWindowPosCallback`][#glfwSetWindowPosCallback].
        public final MemorySegment PFN_glfwSetWindowPosCallback;
        /// The function address of [`glfwSetWindowSizeCallback`][#glfwSetWindowSizeCallback].
        public final MemorySegment PFN_glfwSetWindowSizeCallback;
        /// The function address of [`glfwSetWindowCloseCallback`][#glfwSetWindowCloseCallback].
        public final MemorySegment PFN_glfwSetWindowCloseCallback;
        /// The function address of [`glfwSetWindowRefreshCallback`][#glfwSetWindowRefreshCallback].
        public final MemorySegment PFN_glfwSetWindowRefreshCallback;
        /// The function address of [`glfwSetWindowFocusCallback`][#glfwSetWindowFocusCallback].
        public final MemorySegment PFN_glfwSetWindowFocusCallback;
        /// The function address of [`glfwSetWindowIconifyCallback`][#glfwSetWindowIconifyCallback].
        public final MemorySegment PFN_glfwSetWindowIconifyCallback;
        /// The function address of [`glfwSetWindowMaximizeCallback`][#glfwSetWindowMaximizeCallback].
        public final MemorySegment PFN_glfwSetWindowMaximizeCallback;
        /// The function address of [`glfwSetFramebufferSizeCallback`][#glfwSetFramebufferSizeCallback].
        public final MemorySegment PFN_glfwSetFramebufferSizeCallback;
        /// The function address of [`glfwSetWindowContentScaleCallback`][#glfwSetWindowContentScaleCallback].
        public final MemorySegment PFN_glfwSetWindowContentScaleCallback;
        /// The function address of [`glfwPollEvents`][#glfwPollEvents].
        public final MemorySegment PFN_glfwPollEvents;
        /// The function address of [`glfwWaitEvents`][#glfwWaitEvents].
        public final MemorySegment PFN_glfwWaitEvents;
        /// The function address of [`glfwWaitEventsTimeout`][#glfwWaitEventsTimeout].
        public final MemorySegment PFN_glfwWaitEventsTimeout;
        /// The function address of [`glfwPostEmptyEvent`][#glfwPostEmptyEvent].
        public final MemorySegment PFN_glfwPostEmptyEvent;
        /// The function address of [`glfwGetInputMode`][#glfwGetInputMode].
        public final MemorySegment PFN_glfwGetInputMode;
        /// The function address of [`glfwSetInputMode`][#glfwSetInputMode].
        public final MemorySegment PFN_glfwSetInputMode;
        /// The function address of [`glfwRawMouseMotionSupported`][#glfwRawMouseMotionSupported].
        public final MemorySegment PFN_glfwRawMouseMotionSupported;
        /// The function address of [`glfwGetKeyName`][#glfwGetKeyName].
        public final MemorySegment PFN_glfwGetKeyName;
        /// The function address of [`glfwGetKeyScancode`][#glfwGetKeyScancode].
        public final MemorySegment PFN_glfwGetKeyScancode;
        /// The function address of [`glfwGetKey`][#glfwGetKey].
        public final MemorySegment PFN_glfwGetKey;
        /// The function address of [`glfwGetMouseButton`][#glfwGetMouseButton].
        public final MemorySegment PFN_glfwGetMouseButton;
        /// The function address of [`glfwGetCursorPos`][#glfwGetCursorPos].
        public final MemorySegment PFN_glfwGetCursorPos;
        /// The function address of [`glfwSetCursorPos`][#glfwSetCursorPos].
        public final MemorySegment PFN_glfwSetCursorPos;
        /// The function address of [`glfwCreateCursor`][#glfwCreateCursor].
        public final MemorySegment PFN_glfwCreateCursor;
        /// The function address of [`glfwCreateStandardCursor`][#glfwCreateStandardCursor].
        public final MemorySegment PFN_glfwCreateStandardCursor;
        /// The function address of [`glfwDestroyCursor`][#glfwDestroyCursor].
        public final MemorySegment PFN_glfwDestroyCursor;
        /// The function address of [`glfwSetCursor`][#glfwSetCursor].
        public final MemorySegment PFN_glfwSetCursor;
        /// The function address of [`glfwSetKeyCallback`][#glfwSetKeyCallback].
        public final MemorySegment PFN_glfwSetKeyCallback;
        /// The function address of [`glfwSetCharCallback`][#glfwSetCharCallback].
        public final MemorySegment PFN_glfwSetCharCallback;
        /// The function address of [`glfwSetMouseButtonCallback`][#glfwSetMouseButtonCallback].
        public final MemorySegment PFN_glfwSetMouseButtonCallback;
        /// The function address of [`glfwSetCursorPosCallback`][#glfwSetCursorPosCallback].
        public final MemorySegment PFN_glfwSetCursorPosCallback;
        /// The function address of [`glfwSetCursorEnterCallback`][#glfwSetCursorEnterCallback].
        public final MemorySegment PFN_glfwSetCursorEnterCallback;
        /// The function address of [`glfwSetScrollCallback`][#glfwSetScrollCallback].
        public final MemorySegment PFN_glfwSetScrollCallback;
        /// The function address of [`glfwSetDropCallback`][#glfwSetDropCallback].
        public final MemorySegment PFN_glfwSetDropCallback;
        /// The function address of [`glfwJoystickPresent`][#glfwJoystickPresent].
        public final MemorySegment PFN_glfwJoystickPresent;
        /// The function address of [`glfwGetJoystickAxes`][#glfwGetJoystickAxes].
        public final MemorySegment PFN_glfwGetJoystickAxes;
        /// The function address of [`glfwGetJoystickButtons`][#glfwGetJoystickButtons].
        public final MemorySegment PFN_glfwGetJoystickButtons;
        /// The function address of [`glfwGetJoystickHats`][#glfwGetJoystickHats].
        public final MemorySegment PFN_glfwGetJoystickHats;
        /// The function address of [`glfwGetJoystickName`][#glfwGetJoystickName].
        public final MemorySegment PFN_glfwGetJoystickName;
        /// The function address of [`glfwGetJoystickGUID`][#glfwGetJoystickGUID].
        public final MemorySegment PFN_glfwGetJoystickGUID;
        /// The function address of [`glfwSetJoystickUserPointer`][#glfwSetJoystickUserPointer].
        public final MemorySegment PFN_glfwSetJoystickUserPointer;
        /// The function address of [`glfwGetJoystickUserPointer`][#glfwGetJoystickUserPointer].
        public final MemorySegment PFN_glfwGetJoystickUserPointer;
        /// The function address of [`glfwJoystickIsGamepad`][#glfwJoystickIsGamepad].
        public final MemorySegment PFN_glfwJoystickIsGamepad;
        /// The function address of [`glfwSetJoystickCallback`][#glfwSetJoystickCallback].
        public final MemorySegment PFN_glfwSetJoystickCallback;
        /// The function address of [`glfwUpdateGamepadMappings`][#glfwUpdateGamepadMappings].
        public final MemorySegment PFN_glfwUpdateGamepadMappings;
        /// The function address of [`glfwGetGamepadName`][#glfwGetGamepadName].
        public final MemorySegment PFN_glfwGetGamepadName;
        /// The function address of [`glfwGetGamepadState`][#glfwGetGamepadState].
        public final MemorySegment PFN_glfwGetGamepadState;
        /// The function address of [`glfwSetClipboardString`][#glfwSetClipboardString].
        public final MemorySegment PFN_glfwSetClipboardString;
        /// The function address of [`glfwGetClipboardString`][#glfwGetClipboardString].
        public final MemorySegment PFN_glfwGetClipboardString;
        /// The function address of [`glfwGetTime`][#glfwGetTime].
        public final MemorySegment PFN_glfwGetTime;
        /// The function address of [`glfwSetTime`][#glfwSetTime].
        public final MemorySegment PFN_glfwSetTime;
        /// The function address of [`glfwGetTimerValue`][#glfwGetTimerValue].
        public final MemorySegment PFN_glfwGetTimerValue;
        /// The function address of [`glfwGetTimerFrequency`][#glfwGetTimerFrequency].
        public final MemorySegment PFN_glfwGetTimerFrequency;
        /// The function address of [`glfwMakeContextCurrent`][#glfwMakeContextCurrent].
        public final MemorySegment PFN_glfwMakeContextCurrent;
        /// The function address of [`glfwGetCurrentContext`][#glfwGetCurrentContext].
        public final MemorySegment PFN_glfwGetCurrentContext;
        /// The function address of [`glfwSwapBuffers`][#glfwSwapBuffers].
        public final MemorySegment PFN_glfwSwapBuffers;
        /// The function address of [`glfwSwapInterval`][#glfwSwapInterval].
        public final MemorySegment PFN_glfwSwapInterval;
        /// The function address of [`glfwExtensionSupported`][#glfwExtensionSupported].
        public final MemorySegment PFN_glfwExtensionSupported;
        /// The function address of [`glfwGetProcAddress`][#glfwGetProcAddress].
        public final MemorySegment PFN_glfwGetProcAddress;
        /// The function address of [`glfwVulkanSupported`][#glfwVulkanSupported].
        public final MemorySegment PFN_glfwVulkanSupported;
        /// The function address of [`glfwGetRequiredInstanceExtensions`][#glfwGetRequiredInstanceExtensions].
        public final MemorySegment PFN_glfwGetRequiredInstanceExtensions;
        /// The function address of [`glfwGetInstanceProcAddress`][#glfwGetInstanceProcAddress].
        public final MemorySegment PFN_glfwGetInstanceProcAddress;
        /// The function address of [`glfwGetPhysicalDevicePresentationSupport`][#glfwGetPhysicalDevicePresentationSupport].
        public final MemorySegment PFN_glfwGetPhysicalDevicePresentationSupport;
        /// The function address of [`glfwCreateWindowSurface`][#glfwCreateWindowSurface].
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

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `glfwInit`.
    /// ```
    /// (int) GLFWboolean glfwInit();
    /// ```
    public static boolean glfwInit() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInit"); }
        return (((int) Handles.MH_glfwInit.get().invokeExact(Handles.get().PFN_glfwInit)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInit", e); }
    }

    /// Invokes `glfwTerminate`.
    /// ```
    /// void glfwTerminate();
    /// ```
    public static void glfwTerminate() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwTerminate"); }
        Handles.MH_glfwTerminate.get().invokeExact(Handles.get().PFN_glfwTerminate); }
        catch (Throwable e) { throw new RuntimeException("error in glfwTerminate", e); }
    }

    /// Invokes `glfwInitHint`.
    /// ```
    /// void glfwInitHint(int hint, int value);
    /// ```
    public static void glfwInitHint(int hint, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitHint", hint, value); }
        Handles.MH_glfwInitHint.get().invokeExact(Handles.get().PFN_glfwInitHint, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitHint", e); }
    }

    /// Invokes `glfwInitAllocator`.
    /// ```
    /// void glfwInitAllocator(const GLFWallocator* allocator);
    /// ```
    public static void glfwInitAllocator(@NonNull MemorySegment allocator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitAllocator", allocator); }
        Handles.MH_glfwInitAllocator.get().invokeExact(Handles.get().PFN_glfwInitAllocator, allocator); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    /// Invokes `glfwInitVulkanLoader`.
    /// ```
    /// void glfwInitVulkanLoader((void*) PFN_vkGetInstanceProcAddr loader);
    /// ```
    public static void glfwInitVulkanLoader(@NonNull MemorySegment loader) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwInitVulkanLoader", loader); }
        Handles.MH_glfwInitVulkanLoader.get().invokeExact(Handles.get().PFN_glfwInitVulkanLoader, loader); }
        catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    /// Invokes `glfwGetVersion`.
    /// ```
    /// void glfwGetVersion(int* major, int* minor, int* rev);
    /// ```
    public static void glfwGetVersion(@NonNull MemorySegment major, @NonNull MemorySegment minor, @NonNull MemorySegment rev) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVersion", major, minor, rev); }
        Handles.MH_glfwGetVersion.get().invokeExact(Handles.get().PFN_glfwGetVersion, major, minor, rev); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    /// Invokes `glfwGetVersionString`.
    /// ```
    /// const char* glfwGetVersionString();
    /// ```
    public static @NonNull MemorySegment glfwGetVersionString() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVersionString"); }
        return (MemorySegment) Handles.MH_glfwGetVersionString.get().invokeExact(Handles.get().PFN_glfwGetVersionString); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    /// Invokes `glfwGetError`.
    /// ```
    /// int glfwGetError(const char** description);
    /// ```
    public static int glfwGetError(@NonNull MemorySegment description) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetError", description); }
        return (int) Handles.MH_glfwGetError.get().invokeExact(Handles.get().PFN_glfwGetError, description); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    /// Invokes `glfwSetErrorCallback`.
    /// ```
    /// (void (*GLFWErrorFun)(int error_code, const char* description)) GLFWerrorfun glfwSetErrorCallback((void (*GLFWErrorFun)(int error_code, const char* description)) GLFWerrorfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetErrorCallback(@NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetErrorCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetErrorCallback.get().invokeExact(Handles.get().PFN_glfwSetErrorCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetErrorCallback", e); }
    }

    /// Invokes `glfwGetPlatform`.
    /// ```
    /// int glfwGetPlatform();
    /// ```
    public static int glfwGetPlatform() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPlatform"); }
        return (int) Handles.MH_glfwGetPlatform.get().invokeExact(Handles.get().PFN_glfwGetPlatform); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPlatform", e); }
    }

    /// Invokes `glfwPlatformSupported`.
    /// ```
    /// (int) GLFWboolean glfwPlatformSupported(int platform);
    /// ```
    public static boolean glfwPlatformSupported(int platform) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPlatformSupported", platform); }
        return (((int) Handles.MH_glfwPlatformSupported.get().invokeExact(Handles.get().PFN_glfwPlatformSupported, platform)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPlatformSupported", e); }
    }

    /// Invokes `glfwGetMonitors`.
    /// ```
    /// GLFWmonitor** glfwGetMonitors(int* count);
    /// ```
    public static @NonNull MemorySegment glfwGetMonitors(@NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitors", count); }
        return (MemorySegment) Handles.MH_glfwGetMonitors.get().invokeExact(Handles.get().PFN_glfwGetMonitors, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitors", e); }
    }

    /// Invokes `glfwGetPrimaryMonitor`.
    /// ```
    /// GLFWmonitor* glfwGetPrimaryMonitor();
    /// ```
    public static @NonNull MemorySegment glfwGetPrimaryMonitor() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPrimaryMonitor"); }
        return (MemorySegment) Handles.MH_glfwGetPrimaryMonitor.get().invokeExact(Handles.get().PFN_glfwGetPrimaryMonitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPrimaryMonitor", e); }
    }

    /// Invokes `glfwGetMonitorPos`.
    /// ```
    /// void glfwGetMonitorPos(GLFWmonitor* monitor, int* xpos, int* ypos);
    /// ```
    public static void glfwGetMonitorPos(@NonNull MemorySegment monitor, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorPos", monitor, xpos, ypos); }
        Handles.MH_glfwGetMonitorPos.get().invokeExact(Handles.get().PFN_glfwGetMonitorPos, monitor, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    /// Invokes `glfwGetMonitorWorkarea`.
    /// ```
    /// void glfwGetMonitorWorkarea(GLFWmonitor* monitor, int* xpos, int* ypos, int* width, int* height);
    /// ```
    public static void glfwGetMonitorWorkarea(@NonNull MemorySegment monitor, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos, @NonNull MemorySegment width, @NonNull MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorWorkarea", monitor, xpos, ypos, width, height); }
        Handles.MH_glfwGetMonitorWorkarea.get().invokeExact(Handles.get().PFN_glfwGetMonitorWorkarea, monitor, xpos, ypos, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    /// Invokes `glfwGetMonitorPhysicalSize`.
    /// ```
    /// void glfwGetMonitorPhysicalSize(GLFWmonitor* monitor, int* widthMM, int* heightMM);
    /// ```
    public static void glfwGetMonitorPhysicalSize(@NonNull MemorySegment monitor, @NonNull MemorySegment widthMM, @NonNull MemorySegment heightMM) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorPhysicalSize", monitor, widthMM, heightMM); }
        Handles.MH_glfwGetMonitorPhysicalSize.get().invokeExact(Handles.get().PFN_glfwGetMonitorPhysicalSize, monitor, widthMM, heightMM); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    /// Invokes `glfwGetMonitorContentScale`.
    /// ```
    /// void glfwGetMonitorContentScale(GLFWmonitor* monitor, float* xscale, float* yscale);
    /// ```
    public static void glfwGetMonitorContentScale(@NonNull MemorySegment monitor, @NonNull MemorySegment xscale, @NonNull MemorySegment yscale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorContentScale", monitor, xscale, yscale); }
        Handles.MH_glfwGetMonitorContentScale.get().invokeExact(Handles.get().PFN_glfwGetMonitorContentScale, monitor, xscale, yscale); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    /// Invokes `glfwGetMonitorName`.
    /// ```
    /// const char* glfwGetMonitorName(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetMonitorName(@NonNull MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorName", monitor); }
        return (MemorySegment) Handles.MH_glfwGetMonitorName.get().invokeExact(Handles.get().PFN_glfwGetMonitorName, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    /// Invokes `glfwSetMonitorUserPointer`.
    /// ```
    /// void glfwSetMonitorUserPointer(GLFWmonitor* monitor, void* pointer);
    /// ```
    public static void glfwSetMonitorUserPointer(@NonNull MemorySegment monitor, @NonNull MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMonitorUserPointer", monitor, pointer); }
        Handles.MH_glfwSetMonitorUserPointer.get().invokeExact(Handles.get().PFN_glfwSetMonitorUserPointer, monitor, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorUserPointer", e); }
    }

    /// Invokes `glfwGetMonitorUserPointer`.
    /// ```
    /// void* glfwGetMonitorUserPointer(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetMonitorUserPointer(@NonNull MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMonitorUserPointer", monitor); }
        return (MemorySegment) Handles.MH_glfwGetMonitorUserPointer.get().invokeExact(Handles.get().PFN_glfwGetMonitorUserPointer, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorUserPointer", e); }
    }

    /// Invokes `glfwSetMonitorCallback`.
    /// ```
    /// (void (*GLFWMonitorFun)(GLFWmonitor* monitor, int event)) GLFWmonitorfun glfwSetMonitorCallback((void (*GLFWMonitorFun)(GLFWmonitor* monitor, int event)) GLFWmonitorfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetMonitorCallback(@NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMonitorCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetMonitorCallback.get().invokeExact(Handles.get().PFN_glfwSetMonitorCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorCallback", e); }
    }

    /// Invokes `glfwGetVideoModes`.
    /// ```
    /// const GLFWvidmode* glfwGetVideoModes(GLFWmonitor* monitor, int* count);
    /// ```
    public static @NonNull MemorySegment glfwGetVideoModes(@NonNull MemorySegment monitor, @NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVideoModes", monitor, count); }
        return (MemorySegment) Handles.MH_glfwGetVideoModes.get().invokeExact(Handles.get().PFN_glfwGetVideoModes, monitor, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoModes", e); }
    }

    /// Invokes `glfwGetVideoMode`.
    /// ```
    /// const GLFWvidmode* glfwGetVideoMode(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetVideoMode(@NonNull MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetVideoMode", monitor); }
        return (MemorySegment) Handles.MH_glfwGetVideoMode.get().invokeExact(Handles.get().PFN_glfwGetVideoMode, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    /// Invokes `glfwSetGamma`.
    /// ```
    /// void glfwSetGamma(GLFWmonitor* monitor, float gamma);
    /// ```
    public static void glfwSetGamma(@NonNull MemorySegment monitor, float gamma) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetGamma", monitor, gamma); }
        Handles.MH_glfwSetGamma.get().invokeExact(Handles.get().PFN_glfwSetGamma, monitor, gamma); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetGamma", e); }
    }

    /// Invokes `glfwGetGammaRamp`.
    /// ```
    /// const GLFWgammaramp* glfwGetGammaRamp(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetGammaRamp(@NonNull MemorySegment monitor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGammaRamp", monitor); }
        return (MemorySegment) Handles.MH_glfwGetGammaRamp.get().invokeExact(Handles.get().PFN_glfwGetGammaRamp, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    /// Invokes `glfwSetGammaRamp`.
    /// ```
    /// void glfwSetGammaRamp(GLFWmonitor* monitor, const GLFWgammaramp* ramp);
    /// ```
    public static void glfwSetGammaRamp(@NonNull MemorySegment monitor, @NonNull MemorySegment ramp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetGammaRamp", monitor, ramp); }
        Handles.MH_glfwSetGammaRamp.get().invokeExact(Handles.get().PFN_glfwSetGammaRamp, monitor, ramp); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    /// Invokes `glfwDefaultWindowHints`.
    /// ```
    /// void glfwDefaultWindowHints();
    /// ```
    public static void glfwDefaultWindowHints() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDefaultWindowHints"); }
        Handles.MH_glfwDefaultWindowHints.get().invokeExact(Handles.get().PFN_glfwDefaultWindowHints); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDefaultWindowHints", e); }
    }

    /// Invokes `glfwWindowHint`.
    /// ```
    /// void glfwWindowHint(int hint, int value);
    /// ```
    public static void glfwWindowHint(int hint, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowHint", hint, value); }
        Handles.MH_glfwWindowHint.get().invokeExact(Handles.get().PFN_glfwWindowHint, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowHint", e); }
    }

    /// Invokes `glfwWindowHintString`.
    /// ```
    /// void glfwWindowHintString(int hint, const char* value);
    /// ```
    public static void glfwWindowHintString(int hint, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowHintString", hint, value); }
        Handles.MH_glfwWindowHintString.get().invokeExact(Handles.get().PFN_glfwWindowHintString, hint, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    /// Invokes `glfwCreateWindow`.
    /// ```
    /// GLFWwindow* glfwCreateWindow(int width, int height, const char* title, GLFWmonitor* monitor, GLFWwindow* share);
    /// ```
    public static @NonNull MemorySegment glfwCreateWindow(int width, int height, @NonNull MemorySegment title, @NonNull MemorySegment monitor, @NonNull MemorySegment share) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateWindow", width, height, title, monitor, share); }
        return (MemorySegment) Handles.MH_glfwCreateWindow.get().invokeExact(Handles.get().PFN_glfwCreateWindow, width, height, title, monitor, share); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    /// Invokes `glfwDestroyWindow`.
    /// ```
    /// void glfwDestroyWindow(GLFWwindow* window);
    /// ```
    public static void glfwDestroyWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDestroyWindow", window); }
        Handles.MH_glfwDestroyWindow.get().invokeExact(Handles.get().PFN_glfwDestroyWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDestroyWindow", e); }
    }

    /// Invokes `glfwWindowShouldClose`.
    /// ```
    /// (int) GLFWboolean glfwWindowShouldClose(GLFWwindow* window);
    /// ```
    public static boolean glfwWindowShouldClose(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWindowShouldClose", window); }
        return (((int) Handles.MH_glfwWindowShouldClose.get().invokeExact(Handles.get().PFN_glfwWindowShouldClose, window)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWindowShouldClose", e); }
    }

    /// Invokes `glfwSetWindowShouldClose`.
    /// ```
    /// void glfwSetWindowShouldClose(GLFWwindow* window, (int) GLFWboolean value);
    /// ```
    public static void glfwSetWindowShouldClose(@NonNull MemorySegment window, boolean value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowShouldClose", window, value); }
        Handles.MH_glfwSetWindowShouldClose.get().invokeExact(Handles.get().PFN_glfwSetWindowShouldClose, window, ((value) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowShouldClose", e); }
    }

    /// Invokes `glfwGetWindowTitle`.
    /// ```
    /// const char* glfwGetWindowTitle(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWindowTitle(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowTitle", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowTitle.get().invokeExact(Handles.get().PFN_glfwGetWindowTitle, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    /// Invokes `glfwSetWindowTitle`.
    /// ```
    /// void glfwSetWindowTitle(GLFWwindow* window, const char* title);
    /// ```
    public static void glfwSetWindowTitle(@NonNull MemorySegment window, @NonNull MemorySegment title) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowTitle", window, title); }
        Handles.MH_glfwSetWindowTitle.get().invokeExact(Handles.get().PFN_glfwSetWindowTitle, window, title); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    /// Invokes `glfwSetWindowIcon`.
    /// ```
    /// void glfwSetWindowIcon(GLFWwindow* window, int count, const GLFWimage* images);
    /// ```
    public static void glfwSetWindowIcon(@NonNull MemorySegment window, int count, @NonNull MemorySegment images) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowIcon", window, count, images); }
        Handles.MH_glfwSetWindowIcon.get().invokeExact(Handles.get().PFN_glfwSetWindowIcon, window, count, images); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    /// Invokes `glfwGetWindowPos`.
    /// ```
    /// void glfwGetWindowPos(GLFWwindow* window, int* xpos, int* ypos);
    /// ```
    public static void glfwGetWindowPos(@NonNull MemorySegment window, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowPos", window, xpos, ypos); }
        Handles.MH_glfwGetWindowPos.get().invokeExact(Handles.get().PFN_glfwGetWindowPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    /// Invokes `glfwSetWindowPos`.
    /// ```
    /// void glfwSetWindowPos(GLFWwindow* window, int xpos, int ypos);
    /// ```
    public static void glfwSetWindowPos(@NonNull MemorySegment window, int xpos, int ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowPos", window, xpos, ypos); }
        Handles.MH_glfwSetWindowPos.get().invokeExact(Handles.get().PFN_glfwSetWindowPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPos", e); }
    }

    /// Invokes `glfwGetWindowSize`.
    /// ```
    /// void glfwGetWindowSize(GLFWwindow* window, int* width, int* height);
    /// ```
    public static void glfwGetWindowSize(@NonNull MemorySegment window, @NonNull MemorySegment width, @NonNull MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowSize", window, width, height); }
        Handles.MH_glfwGetWindowSize.get().invokeExact(Handles.get().PFN_glfwGetWindowSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    /// Invokes `glfwSetWindowSizeLimits`.
    /// ```
    /// void glfwSetWindowSizeLimits(GLFWwindow* window, int minwidth, int minheight, int maxwidth, int maxheight);
    /// ```
    public static void glfwSetWindowSizeLimits(@NonNull MemorySegment window, int minwidth, int minheight, int maxwidth, int maxheight) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSizeLimits", window, minwidth, minheight, maxwidth, maxheight); }
        Handles.MH_glfwSetWindowSizeLimits.get().invokeExact(Handles.get().PFN_glfwSetWindowSizeLimits, window, minwidth, minheight, maxwidth, maxheight); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeLimits", e); }
    }

    /// Invokes `glfwSetWindowAspectRatio`.
    /// ```
    /// void glfwSetWindowAspectRatio(GLFWwindow* window, int numer, int denom);
    /// ```
    public static void glfwSetWindowAspectRatio(@NonNull MemorySegment window, int numer, int denom) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowAspectRatio", window, numer, denom); }
        Handles.MH_glfwSetWindowAspectRatio.get().invokeExact(Handles.get().PFN_glfwSetWindowAspectRatio, window, numer, denom); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAspectRatio", e); }
    }

    /// Invokes `glfwSetWindowSize`.
    /// ```
    /// void glfwSetWindowSize(GLFWwindow* window, int width, int height);
    /// ```
    public static void glfwSetWindowSize(@NonNull MemorySegment window, int width, int height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSize", window, width, height); }
        Handles.MH_glfwSetWindowSize.get().invokeExact(Handles.get().PFN_glfwSetWindowSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSize", e); }
    }

    /// Invokes `glfwGetFramebufferSize`.
    /// ```
    /// void glfwGetFramebufferSize(GLFWwindow* window, int* width, int* height);
    /// ```
    public static void glfwGetFramebufferSize(@NonNull MemorySegment window, @NonNull MemorySegment width, @NonNull MemorySegment height) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetFramebufferSize", window, width, height); }
        Handles.MH_glfwGetFramebufferSize.get().invokeExact(Handles.get().PFN_glfwGetFramebufferSize, window, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    /// Invokes `glfwGetWindowFrameSize`.
    /// ```
    /// void glfwGetWindowFrameSize(GLFWwindow* window, int* left, int* top, int* right, int* bottom);
    /// ```
    public static void glfwGetWindowFrameSize(@NonNull MemorySegment window, @NonNull MemorySegment left, @NonNull MemorySegment top, @NonNull MemorySegment right, @NonNull MemorySegment bottom) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowFrameSize", window, left, top, right, bottom); }
        Handles.MH_glfwGetWindowFrameSize.get().invokeExact(Handles.get().PFN_glfwGetWindowFrameSize, window, left, top, right, bottom); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    /// Invokes `glfwGetWindowContentScale`.
    /// ```
    /// void glfwGetWindowContentScale(GLFWwindow* window, float* xscale, float* yscale);
    /// ```
    public static void glfwGetWindowContentScale(@NonNull MemorySegment window, @NonNull MemorySegment xscale, @NonNull MemorySegment yscale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowContentScale", window, xscale, yscale); }
        Handles.MH_glfwGetWindowContentScale.get().invokeExact(Handles.get().PFN_glfwGetWindowContentScale, window, xscale, yscale); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    /// Invokes `glfwGetWindowOpacity`.
    /// ```
    /// float glfwGetWindowOpacity(GLFWwindow* window);
    /// ```
    public static float glfwGetWindowOpacity(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowOpacity", window); }
        return (float) Handles.MH_glfwGetWindowOpacity.get().invokeExact(Handles.get().PFN_glfwGetWindowOpacity, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowOpacity", e); }
    }

    /// Invokes `glfwSetWindowOpacity`.
    /// ```
    /// void glfwSetWindowOpacity(GLFWwindow* window, float opacity);
    /// ```
    public static void glfwSetWindowOpacity(@NonNull MemorySegment window, float opacity) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowOpacity", window, opacity); }
        Handles.MH_glfwSetWindowOpacity.get().invokeExact(Handles.get().PFN_glfwSetWindowOpacity, window, opacity); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowOpacity", e); }
    }

    /// Invokes `glfwIconifyWindow`.
    /// ```
    /// void glfwIconifyWindow(GLFWwindow* window);
    /// ```
    public static void glfwIconifyWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwIconifyWindow", window); }
        Handles.MH_glfwIconifyWindow.get().invokeExact(Handles.get().PFN_glfwIconifyWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwIconifyWindow", e); }
    }

    /// Invokes `glfwRestoreWindow`.
    /// ```
    /// void glfwRestoreWindow(GLFWwindow* window);
    /// ```
    public static void glfwRestoreWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRestoreWindow", window); }
        Handles.MH_glfwRestoreWindow.get().invokeExact(Handles.get().PFN_glfwRestoreWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRestoreWindow", e); }
    }

    /// Invokes `glfwMaximizeWindow`.
    /// ```
    /// void glfwMaximizeWindow(GLFWwindow* window);
    /// ```
    public static void glfwMaximizeWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwMaximizeWindow", window); }
        Handles.MH_glfwMaximizeWindow.get().invokeExact(Handles.get().PFN_glfwMaximizeWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwMaximizeWindow", e); }
    }

    /// Invokes `glfwShowWindow`.
    /// ```
    /// void glfwShowWindow(GLFWwindow* window);
    /// ```
    public static void glfwShowWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwShowWindow", window); }
        Handles.MH_glfwShowWindow.get().invokeExact(Handles.get().PFN_glfwShowWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwShowWindow", e); }
    }

    /// Invokes `glfwHideWindow`.
    /// ```
    /// void glfwHideWindow(GLFWwindow* window);
    /// ```
    public static void glfwHideWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwHideWindow", window); }
        Handles.MH_glfwHideWindow.get().invokeExact(Handles.get().PFN_glfwHideWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwHideWindow", e); }
    }

    /// Invokes `glfwFocusWindow`.
    /// ```
    /// void glfwFocusWindow(GLFWwindow* window);
    /// ```
    public static void glfwFocusWindow(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwFocusWindow", window); }
        Handles.MH_glfwFocusWindow.get().invokeExact(Handles.get().PFN_glfwFocusWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwFocusWindow", e); }
    }

    /// Invokes `glfwRequestWindowAttention`.
    /// ```
    /// void glfwRequestWindowAttention(GLFWwindow* window);
    /// ```
    public static void glfwRequestWindowAttention(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRequestWindowAttention", window); }
        Handles.MH_glfwRequestWindowAttention.get().invokeExact(Handles.get().PFN_glfwRequestWindowAttention, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRequestWindowAttention", e); }
    }

    /// Invokes `glfwGetWindowMonitor`.
    /// ```
    /// GLFWmonitor* glfwGetWindowMonitor(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWindowMonitor(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowMonitor", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowMonitor.get().invokeExact(Handles.get().PFN_glfwGetWindowMonitor, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowMonitor", e); }
    }

    /// Invokes `glfwSetWindowMonitor`.
    /// ```
    /// void glfwSetWindowMonitor(GLFWwindow* window, GLFWmonitor* monitor, int xpos, int ypos, int width, int height, int refreshRate);
    /// ```
    public static void glfwSetWindowMonitor(@NonNull MemorySegment window, @NonNull MemorySegment monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowMonitor", window, monitor, xpos, ypos, width, height, refreshRate); }
        Handles.MH_glfwSetWindowMonitor.get().invokeExact(Handles.get().PFN_glfwSetWindowMonitor, window, monitor, xpos, ypos, width, height, refreshRate); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMonitor", e); }
    }

    /// Invokes `glfwGetWindowAttrib`.
    /// ```
    /// int glfwGetWindowAttrib(GLFWwindow* window, int attrib);
    /// ```
    public static int glfwGetWindowAttrib(@NonNull MemorySegment window, int attrib) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowAttrib", window, attrib); }
        return (int) Handles.MH_glfwGetWindowAttrib.get().invokeExact(Handles.get().PFN_glfwGetWindowAttrib, window, attrib); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowAttrib", e); }
    }

    /// Invokes `glfwSetWindowAttrib`.
    /// ```
    /// void glfwSetWindowAttrib(GLFWwindow* window, int attrib, int value);
    /// ```
    public static void glfwSetWindowAttrib(@NonNull MemorySegment window, int attrib, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowAttrib", window, attrib, value); }
        Handles.MH_glfwSetWindowAttrib.get().invokeExact(Handles.get().PFN_glfwSetWindowAttrib, window, attrib, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAttrib", e); }
    }

    /// Invokes `glfwSetWindowUserPointer`.
    /// ```
    /// void glfwSetWindowUserPointer(GLFWwindow* window, void* pointer);
    /// ```
    public static void glfwSetWindowUserPointer(@NonNull MemorySegment window, @NonNull MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowUserPointer", window, pointer); }
        Handles.MH_glfwSetWindowUserPointer.get().invokeExact(Handles.get().PFN_glfwSetWindowUserPointer, window, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowUserPointer", e); }
    }

    /// Invokes `glfwGetWindowUserPointer`.
    /// ```
    /// void* glfwGetWindowUserPointer(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWindowUserPointer(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWindowUserPointer", window); }
        return (MemorySegment) Handles.MH_glfwGetWindowUserPointer.get().invokeExact(Handles.get().PFN_glfwGetWindowUserPointer, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowUserPointer", e); }
    }

    /// Invokes `glfwSetWindowPosCallback`.
    /// ```
    /// (void (*GLFWWindowPosFun)(GLFWwindow* window, int xpos, int ypos)) GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow* window, (void (*GLFWWindowPosFun)(GLFWwindow* window, int xpos, int ypos)) GLFWwindowposfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowPosCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowPosCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowPosCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowPosCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPosCallback", e); }
    }

    /// Invokes `glfwSetWindowSizeCallback`.
    /// ```
    /// (void (*GLFWWindowSizeFun)(GLFWwindow* window, int width, int height)) GLFWwindowsizefun glfwSetWindowSizeCallback(GLFWwindow* window, (void (*GLFWWindowSizeFun)(GLFWwindow* window, int width, int height)) GLFWwindowsizefun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowSizeCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowSizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowSizeCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowSizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeCallback", e); }
    }

    /// Invokes `glfwSetWindowCloseCallback`.
    /// ```
    /// (void (*GLFWWindowCloseFun)(GLFWwindow* window)) GLFWwindowclosefun glfwSetWindowCloseCallback(GLFWwindow* window, (void (*GLFWWindowCloseFun)(GLFWwindow* window)) GLFWwindowclosefun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowCloseCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowCloseCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowCloseCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowCloseCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowCloseCallback", e); }
    }

    /// Invokes `glfwSetWindowRefreshCallback`.
    /// ```
    /// (void (*GLFWWindowRefreshFun)(GLFWwindow* window)) GLFWwindowrefreshfun glfwSetWindowRefreshCallback(GLFWwindow* window, (void (*GLFWWindowRefreshFun)(GLFWwindow* window)) GLFWwindowrefreshfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowRefreshCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowRefreshCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowRefreshCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowRefreshCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowRefreshCallback", e); }
    }

    /// Invokes `glfwSetWindowFocusCallback`.
    /// ```
    /// (void (*GLFWWindowFocusFun)(GLFWwindow* window, (int) GLFWboolean focused)) GLFWwindowfocusfun glfwSetWindowFocusCallback(GLFWwindow* window, (void (*GLFWWindowFocusFun)(GLFWwindow* window, (int) GLFWboolean focused)) GLFWwindowfocusfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowFocusCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowFocusCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowFocusCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowFocusCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowFocusCallback", e); }
    }

    /// Invokes `glfwSetWindowIconifyCallback`.
    /// ```
    /// (void (*GLFWWindowIconifyFun)(GLFWwindow* window, (int) GLFWboolean iconified)) GLFWwindowiconifyfun glfwSetWindowIconifyCallback(GLFWwindow* window, (void (*GLFWWindowIconifyFun)(GLFWwindow* window, (int) GLFWboolean iconified)) GLFWwindowiconifyfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowIconifyCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowIconifyCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowIconifyCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowIconifyCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIconifyCallback", e); }
    }

    /// Invokes `glfwSetWindowMaximizeCallback`.
    /// ```
    /// (void (*GLFWWindowMaximizeFun)(GLFWwindow* window, (int) GLFWboolean maximized)) GLFWwindowmaximizefun glfwSetWindowMaximizeCallback(GLFWwindow* window, (void (*GLFWWindowMaximizeFun)(GLFWwindow* window, (int) GLFWboolean maximized)) GLFWwindowmaximizefun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowMaximizeCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowMaximizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowMaximizeCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowMaximizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMaximizeCallback", e); }
    }

    /// Invokes `glfwSetFramebufferSizeCallback`.
    /// ```
    /// (void (*GLFWFramebufferSizeFun)(GLFWwindow* window, int width, int height)) GLFWframebuffersizefun glfwSetFramebufferSizeCallback(GLFWwindow* window, (void (*GLFWFramebufferSizeFun)(GLFWwindow* window, int width, int height)) GLFWframebuffersizefun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetFramebufferSizeCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetFramebufferSizeCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetFramebufferSizeCallback.get().invokeExact(Handles.get().PFN_glfwSetFramebufferSizeCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetFramebufferSizeCallback", e); }
    }

    /// Invokes `glfwSetWindowContentScaleCallback`.
    /// ```
    /// (void (*GLFWWindowContentScaleFun)(GLFWwindow* window, float xscale, float yscale)) GLFWwindowcontentscalefun glfwSetWindowContentScaleCallback(GLFWwindow* window, (void (*GLFWWindowContentScaleFun)(GLFWwindow* window, float xscale, float yscale)) GLFWwindowcontentscalefun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetWindowContentScaleCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetWindowContentScaleCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetWindowContentScaleCallback.get().invokeExact(Handles.get().PFN_glfwSetWindowContentScaleCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowContentScaleCallback", e); }
    }

    /// Invokes `glfwPollEvents`.
    /// ```
    /// void glfwPollEvents();
    /// ```
    public static void glfwPollEvents() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPollEvents"); }
        Handles.MH_glfwPollEvents.get().invokeExact(Handles.get().PFN_glfwPollEvents); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPollEvents", e); }
    }

    /// Invokes `glfwWaitEvents`.
    /// ```
    /// void glfwWaitEvents();
    /// ```
    public static void glfwWaitEvents() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWaitEvents"); }
        Handles.MH_glfwWaitEvents.get().invokeExact(Handles.get().PFN_glfwWaitEvents); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWaitEvents", e); }
    }

    /// Invokes `glfwWaitEventsTimeout`.
    /// ```
    /// void glfwWaitEventsTimeout(double timeout);
    /// ```
    public static void glfwWaitEventsTimeout(double timeout) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwWaitEventsTimeout", timeout); }
        Handles.MH_glfwWaitEventsTimeout.get().invokeExact(Handles.get().PFN_glfwWaitEventsTimeout, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glfwWaitEventsTimeout", e); }
    }

    /// Invokes `glfwPostEmptyEvent`.
    /// ```
    /// void glfwPostEmptyEvent();
    /// ```
    public static void glfwPostEmptyEvent() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwPostEmptyEvent"); }
        Handles.MH_glfwPostEmptyEvent.get().invokeExact(Handles.get().PFN_glfwPostEmptyEvent); }
        catch (Throwable e) { throw new RuntimeException("error in glfwPostEmptyEvent", e); }
    }

    /// Invokes `glfwGetInputMode`.
    /// ```
    /// int glfwGetInputMode(GLFWwindow* window, int mode);
    /// ```
    public static int glfwGetInputMode(@NonNull MemorySegment window, int mode) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetInputMode", window, mode); }
        return (int) Handles.MH_glfwGetInputMode.get().invokeExact(Handles.get().PFN_glfwGetInputMode, window, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetInputMode", e); }
    }

    /// Invokes `glfwSetInputMode`.
    /// ```
    /// void glfwSetInputMode(GLFWwindow* window, int mode, int value);
    /// ```
    public static void glfwSetInputMode(@NonNull MemorySegment window, int mode, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetInputMode", window, mode, value); }
        Handles.MH_glfwSetInputMode.get().invokeExact(Handles.get().PFN_glfwSetInputMode, window, mode, value); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetInputMode", e); }
    }

    /// Invokes `glfwRawMouseMotionSupported`.
    /// ```
    /// (int) GLFWboolean glfwRawMouseMotionSupported();
    /// ```
    public static boolean glfwRawMouseMotionSupported() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwRawMouseMotionSupported"); }
        return (((int) Handles.MH_glfwRawMouseMotionSupported.get().invokeExact(Handles.get().PFN_glfwRawMouseMotionSupported)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwRawMouseMotionSupported", e); }
    }

    /// Invokes `glfwGetKeyName`.
    /// ```
    /// const char* glfwGetKeyName(int key, int scancode);
    /// ```
    public static @NonNull MemorySegment glfwGetKeyName(int key, int scancode) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKeyName", key, scancode); }
        return (MemorySegment) Handles.MH_glfwGetKeyName.get().invokeExact(Handles.get().PFN_glfwGetKeyName, key, scancode); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    /// Invokes `glfwGetKeyScancode`.
    /// ```
    /// int glfwGetKeyScancode(int key);
    /// ```
    public static int glfwGetKeyScancode(int key) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKeyScancode", key); }
        return (int) Handles.MH_glfwGetKeyScancode.get().invokeExact(Handles.get().PFN_glfwGetKeyScancode, key); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyScancode", e); }
    }

    /// Invokes `glfwGetKey`.
    /// ```
    /// int glfwGetKey(GLFWwindow* window, int key);
    /// ```
    public static int glfwGetKey(@NonNull MemorySegment window, int key) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetKey", window, key); }
        return (int) Handles.MH_glfwGetKey.get().invokeExact(Handles.get().PFN_glfwGetKey, window, key); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetKey", e); }
    }

    /// Invokes `glfwGetMouseButton`.
    /// ```
    /// int glfwGetMouseButton(GLFWwindow* window, int button);
    /// ```
    public static int glfwGetMouseButton(@NonNull MemorySegment window, int button) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetMouseButton", window, button); }
        return (int) Handles.MH_glfwGetMouseButton.get().invokeExact(Handles.get().PFN_glfwGetMouseButton, window, button); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetMouseButton", e); }
    }

    /// Invokes `glfwGetCursorPos`.
    /// ```
    /// void glfwGetCursorPos(GLFWwindow* window, double* xpos, double* ypos);
    /// ```
    public static void glfwGetCursorPos(@NonNull MemorySegment window, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCursorPos", window, xpos, ypos); }
        Handles.MH_glfwGetCursorPos.get().invokeExact(Handles.get().PFN_glfwGetCursorPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    /// Invokes `glfwSetCursorPos`.
    /// ```
    /// void glfwSetCursorPos(GLFWwindow* window, double xpos, double ypos);
    /// ```
    public static void glfwSetCursorPos(@NonNull MemorySegment window, double xpos, double ypos) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorPos", window, xpos, ypos); }
        Handles.MH_glfwSetCursorPos.get().invokeExact(Handles.get().PFN_glfwSetCursorPos, window, xpos, ypos); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPos", e); }
    }

    /// Invokes `glfwCreateCursor`.
    /// ```
    /// GLFWcursor* glfwCreateCursor(const GLFWimage* image, int xhot, int yhot);
    /// ```
    public static @NonNull MemorySegment glfwCreateCursor(@NonNull MemorySegment image, int xhot, int yhot) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateCursor", image, xhot, yhot); }
        return (MemorySegment) Handles.MH_glfwCreateCursor.get().invokeExact(Handles.get().PFN_glfwCreateCursor, image, xhot, yhot); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateCursor", e); }
    }

    /// Invokes `glfwCreateStandardCursor`.
    /// ```
    /// GLFWcursor* glfwCreateStandardCursor(int shape);
    /// ```
    public static @NonNull MemorySegment glfwCreateStandardCursor(int shape) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateStandardCursor", shape); }
        return (MemorySegment) Handles.MH_glfwCreateStandardCursor.get().invokeExact(Handles.get().PFN_glfwCreateStandardCursor, shape); }
        catch (Throwable e) { throw new RuntimeException("error in glfwCreateStandardCursor", e); }
    }

    /// Invokes `glfwDestroyCursor`.
    /// ```
    /// void glfwDestroyCursor(GLFWcursor* cursor);
    /// ```
    public static void glfwDestroyCursor(@NonNull MemorySegment cursor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwDestroyCursor", cursor); }
        Handles.MH_glfwDestroyCursor.get().invokeExact(Handles.get().PFN_glfwDestroyCursor, cursor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwDestroyCursor", e); }
    }

    /// Invokes `glfwSetCursor`.
    /// ```
    /// void glfwSetCursor(GLFWwindow* window, GLFWcursor* cursor);
    /// ```
    public static void glfwSetCursor(@NonNull MemorySegment window, @NonNull MemorySegment cursor) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursor", window, cursor); }
        Handles.MH_glfwSetCursor.get().invokeExact(Handles.get().PFN_glfwSetCursor, window, cursor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    /// Invokes `glfwSetKeyCallback`.
    /// ```
    /// (void (*GLFWKeyFun)(GLFWwindow* window, int key, int scancode, int action, int mods)) GLFWkeyfun glfwSetKeyCallback(GLFWwindow* window, (void (*GLFWKeyFun)(GLFWwindow* window, int key, int scancode, int action, int mods)) GLFWkeyfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetKeyCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetKeyCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetKeyCallback.get().invokeExact(Handles.get().PFN_glfwSetKeyCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetKeyCallback", e); }
    }

    /// Invokes `glfwSetCharCallback`.
    /// ```
    /// (void (*GLFWCharFun)(GLFWwindow* window, unsigned int codepoint)) GLFWcharfun glfwSetCharCallback(GLFWwindow* window, (void (*GLFWCharFun)(GLFWwindow* window, unsigned int codepoint)) GLFWcharfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetCharCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCharCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCharCallback.get().invokeExact(Handles.get().PFN_glfwSetCharCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCharCallback", e); }
    }

    /// Invokes `glfwSetMouseButtonCallback`.
    /// ```
    /// (void (*GLFWMouseButtonFun)(GLFWwindow* window, int button, int action, int mods)) GLFWmousebuttonfun glfwSetMouseButtonCallback(GLFWwindow* window, (void (*GLFWMouseButtonFun)(GLFWwindow* window, int button, int action, int mods)) GLFWmousebuttonfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetMouseButtonCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetMouseButtonCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetMouseButtonCallback.get().invokeExact(Handles.get().PFN_glfwSetMouseButtonCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetMouseButtonCallback", e); }
    }

    /// Invokes `glfwSetCursorPosCallback`.
    /// ```
    /// (void (*GLFWCursorPosFun)(GLFWwindow* window, double xpos, double ypos)) GLFWcursorposfun glfwSetCursorPosCallback(GLFWwindow* window, (void (*GLFWCursorPosFun)(GLFWwindow* window, double xpos, double ypos)) GLFWcursorposfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetCursorPosCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorPosCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCursorPosCallback.get().invokeExact(Handles.get().PFN_glfwSetCursorPosCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPosCallback", e); }
    }

    /// Invokes `glfwSetCursorEnterCallback`.
    /// ```
    /// (void (*GLFWCursorEnterFun)(GLFWwindow* window, (int) GLFWboolean entered)) GLFWcursorenterfun glfwSetCursorEnterCallback(GLFWwindow* window, (void (*GLFWCursorEnterFun)(GLFWwindow* window, (int) GLFWboolean entered)) GLFWcursorenterfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetCursorEnterCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetCursorEnterCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetCursorEnterCallback.get().invokeExact(Handles.get().PFN_glfwSetCursorEnterCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorEnterCallback", e); }
    }

    /// Invokes `glfwSetScrollCallback`.
    /// ```
    /// (void (*GLFWScrollFun)(GLFWwindow* window, double xoffset, double yoffset)) GLFWscrollfun glfwSetScrollCallback(GLFWwindow* window, (void (*GLFWScrollFun)(GLFWwindow* window, double xoffset, double yoffset)) GLFWscrollfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetScrollCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetScrollCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetScrollCallback.get().invokeExact(Handles.get().PFN_glfwSetScrollCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetScrollCallback", e); }
    }

    /// Invokes `glfwSetDropCallback`.
    /// ```
    /// (void (*GLFWDropFun)(GLFWwindow* window, int path_count, const char** paths)) GLFWdropfun glfwSetDropCallback(GLFWwindow* window, (void (*GLFWDropFun)(GLFWwindow* window, int path_count, const char** paths)) GLFWdropfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetDropCallback(@NonNull MemorySegment window, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetDropCallback", window, callback); }
        return (MemorySegment) Handles.MH_glfwSetDropCallback.get().invokeExact(Handles.get().PFN_glfwSetDropCallback, window, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetDropCallback", e); }
    }

    /// Invokes `glfwJoystickPresent`.
    /// ```
    /// (int) GLFWboolean glfwJoystickPresent(int jid);
    /// ```
    public static boolean glfwJoystickPresent(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwJoystickPresent", jid); }
        return (((int) Handles.MH_glfwJoystickPresent.get().invokeExact(Handles.get().PFN_glfwJoystickPresent, jid)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwJoystickPresent", e); }
    }

    /// Invokes `glfwGetJoystickAxes`.
    /// ```
    /// const float* glfwGetJoystickAxes(int jid, int* count);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickAxes(int jid, @NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickAxes", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickAxes.get().invokeExact(Handles.get().PFN_glfwGetJoystickAxes, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickAxes", e); }
    }

    /// Invokes `glfwGetJoystickButtons`.
    /// ```
    /// const unsigned char* glfwGetJoystickButtons(int jid, int* count);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickButtons(int jid, @NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickButtons", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickButtons.get().invokeExact(Handles.get().PFN_glfwGetJoystickButtons, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickButtons", e); }
    }

    /// Invokes `glfwGetJoystickHats`.
    /// ```
    /// const unsigned char* glfwGetJoystickHats(int jid, int* count);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickHats(int jid, @NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickHats", jid, count); }
        return (MemorySegment) Handles.MH_glfwGetJoystickHats.get().invokeExact(Handles.get().PFN_glfwGetJoystickHats, jid, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickHats", e); }
    }

    /// Invokes `glfwGetJoystickName`.
    /// ```
    /// const char* glfwGetJoystickName(int jid);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickName(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickName", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickName.get().invokeExact(Handles.get().PFN_glfwGetJoystickName, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    /// Invokes `glfwGetJoystickGUID`.
    /// ```
    /// const char* glfwGetJoystickGUID(int jid);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickGUID(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickGUID", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickGUID.get().invokeExact(Handles.get().PFN_glfwGetJoystickGUID, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    /// Invokes `glfwSetJoystickUserPointer`.
    /// ```
    /// void glfwSetJoystickUserPointer(int jid, void* pointer);
    /// ```
    public static void glfwSetJoystickUserPointer(int jid, @NonNull MemorySegment pointer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetJoystickUserPointer", jid, pointer); }
        Handles.MH_glfwSetJoystickUserPointer.get().invokeExact(Handles.get().PFN_glfwSetJoystickUserPointer, jid, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickUserPointer", e); }
    }

    /// Invokes `glfwGetJoystickUserPointer`.
    /// ```
    /// void* glfwGetJoystickUserPointer(int jid);
    /// ```
    public static @NonNull MemorySegment glfwGetJoystickUserPointer(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetJoystickUserPointer", jid); }
        return (MemorySegment) Handles.MH_glfwGetJoystickUserPointer.get().invokeExact(Handles.get().PFN_glfwGetJoystickUserPointer, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickUserPointer", e); }
    }

    /// Invokes `glfwJoystickIsGamepad`.
    /// ```
    /// (int) GLFWboolean glfwJoystickIsGamepad(int jid);
    /// ```
    public static boolean glfwJoystickIsGamepad(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwJoystickIsGamepad", jid); }
        return (((int) Handles.MH_glfwJoystickIsGamepad.get().invokeExact(Handles.get().PFN_glfwJoystickIsGamepad, jid)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwJoystickIsGamepad", e); }
    }

    /// Invokes `glfwSetJoystickCallback`.
    /// ```
    /// (void (*GLFWJoystickFun)(int jid, int event)) GLFWjoystickfun glfwSetJoystickCallback((void (*GLFWJoystickFun)(int jid, int event)) GLFWjoystickfun callback);
    /// ```
    public static @NonNull MemorySegment glfwSetJoystickCallback(@NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetJoystickCallback", callback); }
        return (MemorySegment) Handles.MH_glfwSetJoystickCallback.get().invokeExact(Handles.get().PFN_glfwSetJoystickCallback, callback); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickCallback", e); }
    }

    /// Invokes `glfwUpdateGamepadMappings`.
    /// ```
    /// (int) GLFWboolean glfwUpdateGamepadMappings(const char* string);
    /// ```
    public static boolean glfwUpdateGamepadMappings(@NonNull MemorySegment string) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwUpdateGamepadMappings", string); }
        return (((int) Handles.MH_glfwUpdateGamepadMappings.get().invokeExact(Handles.get().PFN_glfwUpdateGamepadMappings, string)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    /// Invokes `glfwGetGamepadName`.
    /// ```
    /// const char* glfwGetGamepadName(int jid);
    /// ```
    public static @NonNull MemorySegment glfwGetGamepadName(int jid) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGamepadName", jid); }
        return (MemorySegment) Handles.MH_glfwGetGamepadName.get().invokeExact(Handles.get().PFN_glfwGetGamepadName, jid); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    /// Invokes `glfwGetGamepadState`.
    /// ```
    /// (int) GLFWboolean glfwGetGamepadState(int jid, GLFWgamepadstate* state);
    /// ```
    public static boolean glfwGetGamepadState(int jid, @NonNull MemorySegment state) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGamepadState", jid, state); }
        return (((int) Handles.MH_glfwGetGamepadState.get().invokeExact(Handles.get().PFN_glfwGetGamepadState, jid, state)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    /// Invokes `glfwSetClipboardString`.
    /// ```
    /// void glfwSetClipboardString(GLFWwindow* window, const char* string);
    /// ```
    public static void glfwSetClipboardString(@NonNull MemorySegment window, @NonNull MemorySegment string) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetClipboardString", window, string); }
        Handles.MH_glfwSetClipboardString.get().invokeExact(Handles.get().PFN_glfwSetClipboardString, window, string); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    /// Invokes `glfwGetClipboardString`.
    /// ```
    /// const char* glfwGetClipboardString(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetClipboardString(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetClipboardString", window); }
        return (MemorySegment) Handles.MH_glfwGetClipboardString.get().invokeExact(Handles.get().PFN_glfwGetClipboardString, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    /// Invokes `glfwGetTime`.
    /// ```
    /// double glfwGetTime();
    /// ```
    public static double glfwGetTime() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTime"); }
        return (double) Handles.MH_glfwGetTime.get().invokeExact(Handles.get().PFN_glfwGetTime); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTime", e); }
    }

    /// Invokes `glfwSetTime`.
    /// ```
    /// void glfwSetTime(double time);
    /// ```
    public static void glfwSetTime(double time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetTime", time); }
        Handles.MH_glfwSetTime.get().invokeExact(Handles.get().PFN_glfwSetTime, time); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetTime", e); }
    }

    /// Invokes `glfwGetTimerValue`.
    /// ```
    /// uint64_t glfwGetTimerValue();
    /// ```
    public static long glfwGetTimerValue() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTimerValue"); }
        return (long) Handles.MH_glfwGetTimerValue.get().invokeExact(Handles.get().PFN_glfwGetTimerValue); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerValue", e); }
    }

    /// Invokes `glfwGetTimerFrequency`.
    /// ```
    /// uint64_t glfwGetTimerFrequency();
    /// ```
    public static long glfwGetTimerFrequency() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetTimerFrequency"); }
        return (long) Handles.MH_glfwGetTimerFrequency.get().invokeExact(Handles.get().PFN_glfwGetTimerFrequency); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerFrequency", e); }
    }

    /// Invokes `glfwMakeContextCurrent`.
    /// ```
    /// void glfwMakeContextCurrent(GLFWwindow* window);
    /// ```
    public static void glfwMakeContextCurrent(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwMakeContextCurrent", window); }
        Handles.MH_glfwMakeContextCurrent.get().invokeExact(Handles.get().PFN_glfwMakeContextCurrent, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwMakeContextCurrent", e); }
    }

    /// Invokes `glfwGetCurrentContext`.
    /// ```
    /// GLFWwindow* glfwGetCurrentContext();
    /// ```
    public static @NonNull MemorySegment glfwGetCurrentContext() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCurrentContext"); }
        return (MemorySegment) Handles.MH_glfwGetCurrentContext.get().invokeExact(Handles.get().PFN_glfwGetCurrentContext); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCurrentContext", e); }
    }

    /// Invokes `glfwSwapBuffers`.
    /// ```
    /// void glfwSwapBuffers(GLFWwindow* window);
    /// ```
    public static void glfwSwapBuffers(@NonNull MemorySegment window) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSwapBuffers", window); }
        Handles.MH_glfwSwapBuffers.get().invokeExact(Handles.get().PFN_glfwSwapBuffers, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSwapBuffers", e); }
    }

    /// Invokes `glfwSwapInterval`.
    /// ```
    /// void glfwSwapInterval(int interval);
    /// ```
    public static void glfwSwapInterval(int interval) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSwapInterval", interval); }
        Handles.MH_glfwSwapInterval.get().invokeExact(Handles.get().PFN_glfwSwapInterval, interval); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSwapInterval", e); }
    }

    /// Invokes `glfwExtensionSupported`.
    /// ```
    /// (int) GLFWboolean glfwExtensionSupported(const char* extension);
    /// ```
    public static boolean glfwExtensionSupported(@NonNull MemorySegment extension) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwExtensionSupported", extension); }
        return (((int) Handles.MH_glfwExtensionSupported.get().invokeExact(Handles.get().PFN_glfwExtensionSupported, extension)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    /// Invokes `glfwGetProcAddress`.
    /// ```
    /// (void*) GLFWglproc glfwGetProcAddress(const char* procname);
    /// ```
    public static @NonNull MemorySegment glfwGetProcAddress(@NonNull MemorySegment procname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetProcAddress", procname); }
        return (MemorySegment) Handles.MH_glfwGetProcAddress.get().invokeExact(Handles.get().PFN_glfwGetProcAddress, procname); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    /// Invokes `glfwVulkanSupported`.
    /// ```
    /// (int) GLFWboolean glfwVulkanSupported();
    /// ```
    public static boolean glfwVulkanSupported() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwVulkanSupported"); }
        return (((int) Handles.MH_glfwVulkanSupported.get().invokeExact(Handles.get().PFN_glfwVulkanSupported)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwVulkanSupported", e); }
    }

    /// Invokes `glfwGetRequiredInstanceExtensions`.
    /// ```
    /// const char** glfwGetRequiredInstanceExtensions(uint32_t* count);
    /// ```
    public static @NonNull MemorySegment glfwGetRequiredInstanceExtensions(@NonNull MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetRequiredInstanceExtensions", count); }
        return (MemorySegment) Handles.MH_glfwGetRequiredInstanceExtensions.get().invokeExact(Handles.get().PFN_glfwGetRequiredInstanceExtensions, count); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetRequiredInstanceExtensions", e); }
    }

    /// Invokes `glfwGetInstanceProcAddress`.
    /// ```
    /// (void*) GLFWvkproc glfwGetInstanceProcAddress((void*) VkInstance instance, const char* procname);
    /// ```
    public static @NonNull MemorySegment glfwGetInstanceProcAddress(@NonNull MemorySegment instance, @NonNull MemorySegment procname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetInstanceProcAddress", instance, procname); }
        return (MemorySegment) Handles.MH_glfwGetInstanceProcAddress.get().invokeExact(Handles.get().PFN_glfwGetInstanceProcAddress, instance, procname); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    /// Invokes `glfwGetPhysicalDevicePresentationSupport`.
    /// ```
    /// (int) GLFWboolean glfwGetPhysicalDevicePresentationSupport((void*) VkInstance instance, (void*) VkPhysicalDevice device, uint32_t queuefamily);
    /// ```
    public static boolean glfwGetPhysicalDevicePresentationSupport(@NonNull MemorySegment instance, @NonNull MemorySegment device, int queuefamily) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetPhysicalDevicePresentationSupport", instance, device, queuefamily); }
        return (((int) Handles.MH_glfwGetPhysicalDevicePresentationSupport.get().invokeExact(Handles.get().PFN_glfwGetPhysicalDevicePresentationSupport, instance, device, queuefamily)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetPhysicalDevicePresentationSupport", e); }
    }

    /// Invokes `glfwCreateWindowSurface`.
    /// ```
    /// (int) VkResult glfwCreateWindowSurface((void*) VkInstance instance, GLFWwindow* window, const VkAllocationCallbacks* allocator, VkSurfaceKHR* surface);
    /// ```
    public static int glfwCreateWindowSurface(@NonNull MemorySegment instance, @NonNull MemorySegment window, @NonNull MemorySegment allocator, @NonNull MemorySegment surface) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwCreateWindowSurface", instance, window, allocator, surface); }
        return (int) Handles.MH_glfwCreateWindowSurface.get().invokeExact(Handles.get().PFN_glfwCreateWindowSurface, instance, window, allocator, surface); }
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
    public static @NonNull String glfwGetErrorString(int errorCode) {
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
    public static @NonNull String glfwGetPlatformDebugString(int platformCode) {
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
    public static @NonNull String glfwGetPlatformString(int platformCode) {
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
