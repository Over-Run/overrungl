/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import org.jetbrains.annotations.Nullable;
import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;
import overrungl.util.value.Pair;
import overrungl.util.value.Quad;
import overrungl.util.value.Triplet;
import overrungl.util.value.Tuple2;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;

import static java.lang.foreign.ValueLayout.*;

/// The header of the GLFW 3 API.
///
/// This is the header file of the GLFW 3 API.  It defines all its types and
/// declares all its functions.
///
/// For more information about how to use this file, see build_include.
///
/// ## (context) Context reference
/// Functions and types related to OpenGL and OpenGL ES contexts.
///
/// This is the reference documentation for OpenGL and OpenGL ES context related
/// functions.  For more task-oriented information, see the context_guide.
///
/// ## (vulkan) Vulkan support reference
/// Functions and types related to Vulkan.
///
/// This is the reference documentation for Vulkan related functions and types.
/// For more task-oriented information, see the vulkan_guide.
///
/// ## (init) Initialization, version and error reference
/// Functions and types related to initialization and error handling.
///
/// This is the reference documentation for initialization and termination of
/// the library, version management and error handling.  For more task-oriented
/// information, see the intro_guide.
///
/// ## (input) Input reference
/// Functions and types related to input handling.
///
/// This is the reference documentation for input related functions and types.
/// For more task-oriented information, see the input_guide.
///
/// ## (monitor) Monitor reference
/// Functions and types related to monitors.
///
/// This is the reference documentation for monitor related functions and types.
/// For more task-oriented information, see the monitor_guide.
///
/// ## (window) Window reference
/// Functions and types related to windows.
///
/// This is the reference documentation for window related functions and types,
/// including creation, deletion and event polling.  For more task-oriented
/// information, see the window_guide.
///
/// ## (keys) Keyboard key tokens
/// Keyboard key tokens.
///
/// See key input for how these are used.
///
/// These key codes are inspired by the _USB HID Usage Tables v1.12_ (p. 53-60),
/// but re-arranged to map to 7-bit ASCII for printable keys (function keys are
/// put in the 256+ range).
///
/// The naming of the key codes follow these rules:
///  - The US keyboard layout is used
///  - Names of printable alphanumeric characters are used (e.g. "A", "R",
///    "3", etc.)
///  - For non-alphanumeric characters, Unicode:ish names are used (e.g.
///    "COMMA", "LEFT_SQUARE_BRACKET", etc.). Note that some names do not
///    correspond to the Unicode standard (usually for brevity)
///  - Keys that lack a clear US mapping are named "WORLD_x"
///  - For non-printable keys, custom names are used (e.g. "F4",
///    "BACKSPACE", etc.)
///
/// @author squid233
/// @since 0.1.0
public interface GLFW {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    ///GLFW version macros
    ///#### Documentation of fields
    ///##### GLFW_VERSION_MAJOR
    ///The major version number of the GLFW header.  This is incremented when the
    ///API is changed in non-compatible ways.
    ///##### GLFW_VERSION_MINOR
    ///The minor version number of the GLFW header.  This is incremented when
    ///features are added to the API but it remains backward-compatible.
    ///##### GLFW_VERSION_REVISION
    ///The revision number of the GLFW header.  This is incremented when a bug fix
    ///release is made that does not contain any API changes.
    public static final int
        GLFW_VERSION_MAJOR = 3,
        GLFW_VERSION_MINOR = 5,
        GLFW_VERSION_REVISION = 0;
    ///One.
    ///
    ///This is only semantic sugar for the number 1.  You can instead use `1` or
    ///`true` or `_True` or `GL_TRUE` or `VK_TRUE` or anything else that is equal
    ///to one.
    public static final int GLFW_TRUE = 1;
    ///Zero.
    ///
    ///This is only semantic sugar for the number 0.  You can instead use `0` or
    ///`false` or `_False` or `GL_FALSE` or `VK_FALSE` or anything else that is
    ///equal to zero.
    public static final int GLFW_FALSE = 0;
    ///Key and button actions
    ///#### Documentation of fields
    ///##### GLFW_RELEASE
    ///The key or mouse button was released.
    ///##### GLFW_PRESS
    ///The key or mouse button was pressed.
    ///##### GLFW_REPEAT
    ///The key was held down until it repeated.
    public static final int
        GLFW_RELEASE = 0,
        GLFW_PRESS = 1,
        GLFW_REPEAT = 2;
    ///Joystick hat states.
    ///
    ///See joystick hat input for how these are used.
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
    ///Printable keys
    ///#### Documentation of fields
    ///##### GLFW_KEY_APOSTROPHE
    ///`'`
    ///##### GLFW_KEY_COMMA
    ///`,`
    ///##### GLFW_KEY_MINUS
    ///`-`
    ///##### GLFW_KEY_PERIOD
    ///`.`
    ///##### GLFW_KEY_SLASH
    ///`/`
    ///##### GLFW_KEY_SEMICOLON
    ///`;`
    ///##### GLFW_KEY_EQUAL
    ///`=`
    ///##### GLFW_KEY_LEFT_BRACKET
    ///`[`
    ///##### GLFW_KEY_BACKSLASH
    ///`\\`
    ///##### GLFW_KEY_RIGHT_BRACKET
    ///`]`
    ///##### GLFW_KEY_GRAVE_ACCENT
    ///<code>`</code>
    ///##### GLFW_KEY_WORLD_1
    ///non-US #1
    ///##### GLFW_KEY_WORLD_2
    ///non-US #2
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
    ///Function keys
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
    ///Modifier key flags.
    ///
    ///See key input for how these are used.
    ///#### Documentation of fields
    ///##### GLFW_MOD_SHIFT
    ///If this bit is set one or more Shift keys were held down.
    ///##### GLFW_MOD_CONTROL
    ///If this bit is set one or more Control keys were held down.
    ///##### GLFW_MOD_ALT
    ///If this bit is set one or more Alt keys were held down.
    ///##### GLFW_MOD_SUPER
    ///If this bit is set one or more Super keys were held down.
    ///##### GLFW_MOD_CAPS_LOCK
    ///If this bit is set the Caps Lock key is enabled.
    ///
    ///If this bit is set the Caps Lock key is enabled and the
    ///[GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] input mode is set.
    ///##### GLFW_MOD_NUM_LOCK
    ///If this bit is set the Num Lock key is enabled.
    ///
    ///If this bit is set the Num Lock key is enabled and the
    ///[GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] input mode is set.
    public static final int
        GLFW_MOD_SHIFT = 0x0001,
        GLFW_MOD_CONTROL = 0x0002,
        GLFW_MOD_ALT = 0x0004,
        GLFW_MOD_SUPER = 0x0008,
        GLFW_MOD_CAPS_LOCK = 0x0010,
        GLFW_MOD_NUM_LOCK = 0x0020;
    ///Mouse button IDs.
    ///
    ///See mouse button input for how these are used.
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
    ///Joystick IDs.
    ///
    ///See joystick input for how these are used.
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
    ///Gamepad buttons.
    ///
    ///See gamepad for how these are used.
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
    ///Gamepad axes.
    ///
    ///See gamepad for how these are used.
    public static final int
        GLFW_GAMEPAD_AXIS_LEFT_X = 0,
        GLFW_GAMEPAD_AXIS_LEFT_Y = 1,
        GLFW_GAMEPAD_AXIS_RIGHT_X = 2,
        GLFW_GAMEPAD_AXIS_RIGHT_Y = 3,
        GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4,
        GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        GLFW_GAMEPAD_AXIS_LAST = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;
    ///Error codes.
    ///
    ///See error handling for how these are used.
    ///#### Documentation of fields
    ///##### GLFW_NO_ERROR
    ///No error has occurred.
    ///
    ///###### Analysis
    ///Yay.
    ///##### GLFW_NOT_INITIALIZED
    ///GLFW has not been initialized.
    ///
    ///This occurs if a GLFW function was called that must not be called unless the
    ///library is initialized.
    ///
    ///###### Analysis
    ///Application programmer error.  Initialize GLFW before calling any
    ///function that requires initialization.
    ///##### GLFW_NO_CURRENT_CONTEXT
    ///No context is current for this thread.
    ///
    ///This occurs if a GLFW function was called that needs and operates on the
    ///current OpenGL or OpenGL ES context but no context is current on the calling
    ///thread.  One such function is [glfwSwapInterval][#glfwSwapInterval()].
    ///TODO
    ///###### Analysis
    ///Application programmer error.  Ensure a context is current before
    ///calling functions that require a current context.
    ///##### GLFW_INVALID_ENUM
    ///One of the arguments to the function was an invalid enum value.
    ///
    ///One of the arguments to the function was an invalid enum value, for example
    ///requesting [GLFW_RED_BITS][#GLFW_RED_BITS] with [glfwGetWindowAttrib][#glfwGetWindowAttrib()].
    ///TODO
    ///###### Analysis
    ///Application programmer error.  Fix the offending call.
    ///##### GLFW_INVALID_VALUE
    ///One of the arguments to the function was an invalid value.
    ///
    ///One of the arguments to the function was an invalid value, for example
    ///requesting a non-existent OpenGL or OpenGL ES version like 2.7.
    ///
    ///Requesting a valid but unavailable OpenGL or OpenGL ES version will instead
    ///result in a [GLFW_VERSION_UNAVAILABLE][#GLFW_VERSION_UNAVAILABLE] error.
    ///
    ///###### Analysis
    ///Application programmer error.  Fix the offending call.
    ///##### GLFW_OUT_OF_MEMORY
    ///A memory allocation failed.
    ///
    ///###### Analysis
    ///A bug in GLFW or the underlying operating system.  Report the bug
    ///to our [issue tracker](https://github.com/glfw/glfw/issues).
    ///##### GLFW_API_UNAVAILABLE
    ///GLFW could not find support for the requested API on the system.
    ///
    ///###### Analysis
    ///The installed graphics driver does not support the requested
    ///API, or does not support it via the chosen context creation API.
    ///Below are a few examples.
    ///
    ///Some pre-installed Windows graphics drivers do not support OpenGL.  AMD only
    ///supports OpenGL ES via EGL, while Nvidia and Intel only support it via
    ///a WGL or GLX extension.  macOS does not provide OpenGL ES at all.  The Mesa
    ///EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
    ///driver.  Older graphics drivers do not support Vulkan.
    ///##### GLFW_VERSION_UNAVAILABLE
    ///The requested OpenGL or OpenGL ES version is not available.
    ///
    ///The requested OpenGL or OpenGL ES version (including any requested context
    ///or framebuffer hints) is not available on this machine.
    ///
    ///###### Analysis
    ///The machine does not support your requirements.  If your
    ///application is sufficiently flexible, downgrade your requirements and try
    ///again.  Otherwise, inform the user that their machine does not match your
    ///requirements.
    ///##### GLFW_PLATFORM_ERROR
    ///A platform-specific error occurred that does not match any of the more
    ///specific categories.
    ///
    ///###### Analysis
    ///A bug or configuration error in GLFW, the underlying operating
    ///system or its drivers, or a lack of required resources.  Report the issue to
    ///our [issue tracker](https://github.com/glfw/glfw/issues).
    ///##### GLFW_FORMAT_UNAVAILABLE
    ///The requested format is not supported or available.
    ///
    ///If emitted during window creation, the requested pixel format is not
    ///supported.
    ///
    ///If emitted when querying the clipboard, the contents of the clipboard could
    ///not be converted to the requested format.
    ///
    ///###### Analysis
    ///If emitted during window creation, one or more
    ///hard constraints did not match any of the
    ///available pixel formats.  If your application is sufficiently flexible,
    ///downgrade your requirements and try again.  Otherwise, inform the user that
    ///their machine does not match your requirements.
    ///
    ///If emitted when querying the clipboard, ignore the error or report it to
    ///the user, as appropriate.
    ///##### GLFW_NO_WINDOW_CONTEXT
    ///The specified window does not have an OpenGL or OpenGL ES context.
    ///
    ///A window that does not have an OpenGL or OpenGL ES context was passed to
    ///a function that requires it to have one.
    ///
    ///###### Analysis
    ///Application programmer error.  Fix the offending call.
    ///##### GLFW_CURSOR_UNAVAILABLE
    ///The specified cursor shape is not available.
    ///
    ///The specified standard cursor shape is not available, either because the
    ///current platform cursor theme does not provide it or because it is not
    ///available on the platform.
    ///
    ///###### Analysis
    ///Platform or system settings limitation.  Pick another
    ///standard cursor shape or create a
    ///custom cursor.
    ///##### GLFW_FEATURE_UNAVAILABLE
    ///The requested feature is not provided by the platform.
    ///
    ///The requested feature is not provided by the platform, so GLFW is unable to
    ///implement it.  The documentation for each function notes if it could emit
    ///this error.
    ///
    ///###### Analysis
    ///Platform or platform version limitation.  The error can be ignored
    ///unless the feature is critical to the application.
    ///
    ///A function call that emits this error has no effect other than the error and
    ///updating any existing out parameters.
    ///##### GLFW_FEATURE_UNIMPLEMENTED
    ///The requested feature is not implemented for the platform.
    ///
    ///The requested feature has not yet been implemented in GLFW for this platform.
    ///
    ///###### Analysis
    ///An incomplete implementation of GLFW for this platform, hopefully
    ///fixed in a future release.  The error can be ignored unless the feature is
    ///critical to the application.
    ///
    ///A function call that emits this error has no effect other than the error and
    ///updating any existing out parameters.
    ///##### GLFW_PLATFORM_UNAVAILABLE
    ///Platform unavailable or no matching platform was found.
    ///
    ///If emitted during initialization, no matching platform was found.  If the
    ///[GLFW_PLATFORM][#GLFW_PLATFORM] init hint was set to `GLFW_ANY_PLATFORM`, GLFW could not detect any of
    ///the platforms supported by this library binary, except for the Null platform.  If the
    ///init hint was set to a specific platform, it is either not supported by this library
    ///binary or GLFW was not able to detect it.
    ///
    ///If emitted by a native access function, GLFW was initialized for a different platform
    ///than the function is for.
    ///
    ///###### Analysis
    ///Failure to detect any platform usually only happens on non-macOS Unix
    ///systems, either when no window system is running or the program was run from
    ///a terminal that does not have the necessary environment variables.  Fall back to
    ///a different platform if possible or notify the user that no usable platform was
    ///detected.
    ///TODO
    ///Failure to detect a specific platform may have the same cause as above or be because
    ///support for that platform was not compiled in.  Call [glfwPlatformSupported][#glfwPlatformSupported()] to
    ///check whether a specific platform is supported by a library binary.
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
    ///Input focus window hint and attribute
    public static final int GLFW_FOCUSED = 0x00020001;
    ///Window iconification window attribute
    public static final int GLFW_ICONIFIED = 0x00020002;
    ///Window resize-ability window hint and attribute
    public static final int GLFW_RESIZABLE = 0x00020003;
    ///Window visibility window hint and attribute
    public static final int GLFW_VISIBLE = 0x00020004;
    ///Window decoration window hint and attribute
    public static final int GLFW_DECORATED = 0x00020005;
    ///Window auto-iconification window hint and attribute
    public static final int GLFW_AUTO_ICONIFY = 0x00020006;
    ///Window decoration window hint and attribute
    public static final int GLFW_FLOATING = 0x00020007;
    ///Window maximization window hint and attribute
    public static final int GLFW_MAXIMIZED = 0x00020008;
    ///Cursor centering window hint
    public static final int GLFW_CENTER_CURSOR = 0x00020009;
    ///Window framebuffer transparency hint and attribute
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;
    ///Mouse cursor hover window attribute.
    public static final int GLFW_HOVERED = 0x0002000B;
    ///Input focus on calling show window hint and attribute
    public static final int GLFW_FOCUS_ON_SHOW = 0x0002000C;
    ///Mouse input transparency window hint and attribute
    public static final int GLFW_MOUSE_PASSTHROUGH = 0x0002000D;
    ///Initial position x-coordinate window hint.
    public static final int GLFW_POSITION_X = 0x0002000E;
    ///Initial position y-coordinate window hint.
    public static final int GLFW_POSITION_Y = 0x0002000F;
    ///Framebuffer bit depth hint.
    public static final int GLFW_RED_BITS = 0x00021001;
    ///Framebuffer bit depth hint.
    public static final int GLFW_GREEN_BITS = 0x00021002;
    ///Framebuffer bit depth hint.
    public static final int GLFW_BLUE_BITS = 0x00021003;
    ///Framebuffer bit depth hint.
    public static final int GLFW_ALPHA_BITS = 0x00021004;
    ///Framebuffer bit depth hint.
    public static final int GLFW_DEPTH_BITS = 0x00021005;
    ///Framebuffer bit depth hint.
    public static final int GLFW_STENCIL_BITS = 0x00021006;
    ///Framebuffer bit depth hint.
    public static final int GLFW_ACCUM_RED_BITS = 0x00021007;
    ///Framebuffer bit depth hint.
    public static final int GLFW_ACCUM_GREEN_BITS = 0x00021008;
    ///Framebuffer bit depth hint.
    public static final int GLFW_ACCUM_BLUE_BITS = 0x00021009;
    ///Framebuffer bit depth hint.
    public static final int GLFW_ACCUM_ALPHA_BITS = 0x0002100A;
    ///Framebuffer auxiliary buffer hint.
    public static final int GLFW_AUX_BUFFERS = 0x0002100B;
    ///OpenGL stereoscopic rendering hint.
    public static final int GLFW_STEREO = 0x0002100C;
    ///Framebuffer MSAA samples hint.
    public static final int GLFW_SAMPLES = 0x0002100D;
    ///Framebuffer sRGB hint.
    public static final int GLFW_SRGB_CAPABLE = 0x0002100E;
    ///Monitor refresh rate hint.
    public static final int GLFW_REFRESH_RATE = 0x0002100F;
    ///Framebuffer double buffering hint and attribute.
    public static final int GLFW_DOUBLEBUFFER = 0x00021010;
    ///Context client API hint and attribute.
    public static final int GLFW_CLIENT_API = 0x00022001;
    ///Context client API major version hint and attribute.
    public static final int GLFW_CONTEXT_VERSION_MAJOR = 0x00022002;
    ///Context client API minor version hint and attribute.
    public static final int GLFW_CONTEXT_VERSION_MINOR = 0x00022003;
    ///Context client API revision number attribute.
    public static final int GLFW_CONTEXT_REVISION = 0x00022004;
    ///Context robustness hint and attribute.
    public static final int GLFW_CONTEXT_ROBUSTNESS = 0x00022005;
    ///OpenGL forward-compatibility hint and attribute.
    public static final int GLFW_OPENGL_FORWARD_COMPAT = 0x00022006;
    ///Debug mode context hint and attribute.
    public static final int GLFW_CONTEXT_DEBUG = 0x00022007;
    ///Legacy name for compatibility.
    ///
    ///This is an alias for compatibility with earlier versions.
    public static final int GLFW_OPENGL_DEBUG_CONTEXT = GLFW_CONTEXT_DEBUG;
    ///OpenGL profile hint and attribute.
    public static final int GLFW_OPENGL_PROFILE = 0x00022008;
    ///Context flush-on-release hint and attribute.
    public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x00022009;
    ///Context error suppression hint and attribute.
    public static final int GLFW_CONTEXT_NO_ERROR = 0x0002200A;
    ///Context creation API hint and attribute.
    public static final int GLFW_CONTEXT_CREATION_API = 0x0002200B;
    ///Window content area scaling window hint.
    public static final int GLFW_SCALE_TO_MONITOR = 0x0002200C;
    ///Window framebuffer scaling window hint.
    public static final int GLFW_SCALE_FRAMEBUFFER = 0x0002200D;
    ///Legacy name for compatibility.
    ///
    ///This is an alias for the
    ///[GLFW_SCALE_FRAMEBUFFER][#GLFW_SCALE_FRAMEBUFFER] window hint for
    ///compatibility with earlier versions.
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x00023001;
    ///macOS specific window hint.
    public static final int GLFW_COCOA_FRAME_NAME = 0x00023002;
    ///macOS specific window hint.
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x00023003;
    ///X11 specific window hint.
    public static final int GLFW_X11_CLASS_NAME = 0x00024001;
    ///X11 specific window hint.
    public static final int GLFW_X11_INSTANCE_NAME = 0x00024002;
    ///Win32 specific window hint.
    public static final int GLFW_WIN32_KEYBOARD_MENU = 0x00025001;
    ///Win32 specific window hint.
    public static final int GLFW_WIN32_SHOWDEFAULT = 0x00025002;
    ///Wayland specific window hint.
    ///
    ///Allows specification of the Wayland app_id.
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
    ///Standard system cursor shapes.
    ///
    ///These are the standard cursor shapes] that can be
    ///requested from the platform (window system).
    ///#### Documentation of fields
    ///##### GLFW_ARROW_CURSOR
    ///The regular arrow cursor shape.
    ///##### GLFW_IBEAM_CURSOR
    ///The text input I-beam cursor shape.
    ///##### GLFW_CROSSHAIR_CURSOR
    ///The crosshair cursor shape.
    ///##### GLFW_POINTING_HAND_CURSOR
    ///The pointing hand cursor shape.
    ///##### GLFW_RESIZE_EW_CURSOR
    ///The horizontal resize/move arrow shape.
    ///
    ///The horizontal resize/move arrow shape.  This is usually a horizontal
    ///double-headed arrow.
    ///##### GLFW_RESIZE_NS_CURSOR
    ///The vertical resize/move arrow shape.
    ///
    ///The vertical resize/move shape.  This is usually a vertical double-headed
    ///arrow.
    ///##### GLFW_RESIZE_NWSE_CURSOR
    ///The top-left to bottom-right diagonal resize/move arrow shape.
    ///
    ///The top-left to bottom-right diagonal resize/move shape.  This is usually
    ///a diagonal double-headed arrow.
    ///
    ///###### Note
    ///- __macOS:__ This shape is provided by a private system API and may fail
    ///    with [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] in the future.
    ///- __Wayland:__ This shape is provided by a newer standard not supported by
    ///    all cursor themes.
    ///- __X11:__ This shape is provided by a newer standard not supported by all
    ///    cursor themes.
    ///##### GLFW_RESIZE_NESW_CURSOR
    ///The top-right to bottom-left diagonal resize/move arrow shape.
    ///
    ///The top-right to bottom-left diagonal resize/move shape.  This is usually
    ///a diagonal double-headed arrow.
    ///
    ///###### Note
    ///- __macOS:__ This shape is provided by a private system API and may fail
    ///    with [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] in the future.
    ///- __Wayland:__ This shape is provided by a newer standard not supported by
    ///    all cursor themes.
    ///- __X11:__ This shape is provided by a newer standard not supported by all
    ///    cursor themes.
    ///##### GLFW_RESIZE_ALL_CURSOR
    ///The omni-directional resize/move cursor shape.
    ///
    ///The omni-directional resize cursor/move shape.  This is usually either
    ///a combined horizontal and vertical double-headed arrow or a grabbing hand.
    ///##### GLFW_NOT_ALLOWED_CURSOR
    ///The operation-not-allowed shape.
    ///
    ///The operation-not-allowed shape.  This is usually a circle with a diagonal
    ///line through it.
    ///
    ///###### Note
    ///- __Wayland:__ This shape is provided by a newer standard not supported by
    ///    all cursor themes.
    ///- __X11:__ This shape is provided by a newer standard not supported by all
    ///    cursor themes.
    ///##### GLFW_HRESIZE_CURSOR
    ///Legacy name for compatibility.
    ///
    ///This is an alias for compatibility with earlier versions.
    ///##### GLFW_VRESIZE_CURSOR
    ///Legacy name for compatibility.
    ///
    ///This is an alias for compatibility with earlier versions.
    ///##### GLFW_HAND_CURSOR
    ///Legacy name for compatibility.
    ///
    ///This is an alias for compatibility with earlier versions.
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
    ///Joystick hat buttons init hint.
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x00050001;
    ///ANGLE rendering backend init hint.
    public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x00050002;
    ///Platform selection init hint.
    public static final int GLFW_PLATFORM = 0x00050003;
    ///macOS specific init hint.
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x00051001;
    ///macOS specific init hint.
    public static final int GLFW_COCOA_MENUBAR = 0x00051002;
    ///X11 specific init hint.
    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x00052001;
    ///Wayland specific init hint.
    public static final int GLFW_WAYLAND_LIBDECOR = 0x00053001;
    ///Hint value that enables automatic platform selection.
    ///
    ///Hint value for [GLFW_PLATFORM][#GLFW_PLATFORM] that enables automatic platform selection.
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
    /// The method handle of `glfwInit`.
    public static final MethodHandle MH_glfwInit = RuntimeHelper.downcall(Handles.lookup, "glfwInit", FunctionDescriptor.of(ValueLayout.JAVA_INT));
    /// The method handle of `glfwTerminate`.
    public static final MethodHandle MH_glfwTerminate = RuntimeHelper.downcall(Handles.lookup, "glfwTerminate", FunctionDescriptor.ofVoid());
    /// The method handle of `glfwInitHint`.
    public static final MethodHandle MH_glfwInitHint = RuntimeHelper.downcall(Handles.lookup, "glfwInitHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwInitAllocator`.
    public static final MethodHandle MH_glfwInitAllocator = RuntimeHelper.downcall(Handles.lookup, "glfwInitAllocator", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWAllocator.LAYOUT)));
    /// The method handle of `glfwInitVulkanLoader`.
    public static final MethodHandle MH_glfwInitVulkanLoader = RuntimeHelper.downcall(Handles.lookup, "glfwInitVulkanLoader", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwGetVersion`.
    public static final MethodHandle MH_glfwGetVersion = RuntimeHelper.downcall(Handles.lookup, "glfwGetVersion", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetVersionString`.
    public static final MethodHandle MH_glfwGetVersionString = RuntimeHelper.downcall(Handles.lookup, "glfwGetVersionString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
    /// The method handle of `glfwGetError`.
    public static final MethodHandle MH_glfwGetError = RuntimeHelper.downcall(Handles.lookup, "glfwGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetErrorCallback`.
    public static final MethodHandle MH_glfwSetErrorCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetErrorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetPlatform`.
    public static final MethodHandle MH_glfwGetPlatform = RuntimeHelper.downcall(Handles.lookup, "glfwGetPlatform", FunctionDescriptor.of(ValueLayout.JAVA_INT));
    /// The method handle of `glfwPlatformSupported`.
    public static final MethodHandle MH_glfwPlatformSupported = RuntimeHelper.downcall(Handles.lookup, "glfwPlatformSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetMonitors`.
    public static final MethodHandle MH_glfwGetMonitors = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitors", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetPrimaryMonitor`.
    public static final MethodHandle MH_glfwGetPrimaryMonitor = RuntimeHelper.downcall(Handles.lookup, "glfwGetPrimaryMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorPos`.
    public static final MethodHandle MH_glfwGetMonitorPos = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorWorkarea`.
    public static final MethodHandle MH_glfwGetMonitorWorkarea = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorWorkarea", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorPhysicalSize`.
    public static final MethodHandle MH_glfwGetMonitorPhysicalSize = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorPhysicalSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorContentScale`.
    public static final MethodHandle MH_glfwGetMonitorContentScale = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorName`.
    public static final MethodHandle MH_glfwGetMonitorName = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetMonitorUserPointer`.
    public static final MethodHandle MH_glfwSetMonitorUserPointer = RuntimeHelper.downcall(Handles.lookup, "glfwSetMonitorUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetMonitorUserPointer`.
    public static final MethodHandle MH_glfwGetMonitorUserPointer = RuntimeHelper.downcall(Handles.lookup, "glfwGetMonitorUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetMonitorCallback`.
    public static final MethodHandle MH_glfwSetMonitorCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetMonitorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetVideoModes`.
    public static final MethodHandle MH_glfwGetVideoModes = RuntimeHelper.downcall(Handles.lookup, "glfwGetVideoModes", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetVideoMode`.
    public static final MethodHandle MH_glfwGetVideoMode = RuntimeHelper.downcall(Handles.lookup, "glfwGetVideoMode", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWVidMode.LAYOUT), ValueLayout.ADDRESS));
    /// The method handle of `glfwSetGamma`.
    public static final MethodHandle MH_glfwSetGamma = RuntimeHelper.downcall(Handles.lookup, "glfwSetGamma", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
    /// The method handle of `glfwGetGammaRamp`.
    public static final MethodHandle MH_glfwGetGammaRamp = RuntimeHelper.downcall(Handles.lookup, "glfwGetGammaRamp", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT), ValueLayout.ADDRESS));
    /// The method handle of `glfwSetGammaRamp`.
    public static final MethodHandle MH_glfwSetGammaRamp = RuntimeHelper.downcall(Handles.lookup, "glfwSetGammaRamp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT)));
    /// The method handle of `glfwDefaultWindowHints`.
    public static final MethodHandle MH_glfwDefaultWindowHints = RuntimeHelper.downcall(Handles.lookup, "glfwDefaultWindowHints", FunctionDescriptor.ofVoid());
    /// The method handle of `glfwWindowHint`.
    public static final MethodHandle MH_glfwWindowHint = RuntimeHelper.downcall(Handles.lookup, "glfwWindowHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwWindowHintString`.
    public static final MethodHandle MH_glfwWindowHintString = RuntimeHelper.downcall(Handles.lookup, "glfwWindowHintString", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
    /// The method handle of `glfwCreateWindow`.
    public static final MethodHandle MH_glfwCreateWindow = RuntimeHelper.downcall(Handles.lookup, "glfwCreateWindow", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwDestroyWindow`.
    public static final MethodHandle MH_glfwDestroyWindow = RuntimeHelper.downcall(Handles.lookup, "glfwDestroyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwWindowShouldClose`.
    public static final MethodHandle MH_glfwWindowShouldClose = RuntimeHelper.downcall(Handles.lookup, "glfwWindowShouldClose", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowShouldClose`.
    public static final MethodHandle MH_glfwSetWindowShouldClose = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowShouldClose", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetWindowTitle`.
    public static final MethodHandle MH_glfwGetWindowTitle = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowTitle", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowTitle`.
    public static final MethodHandle MH_glfwSetWindowTitle = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowTitle", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
    /// The method handle of `glfwSetWindowIcon`.
    public static final MethodHandle MH_glfwSetWindowIcon = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowIcon", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT)));
    /// The method handle of `glfwGetWindowPos`.
    public static final MethodHandle MH_glfwGetWindowPos = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowPos`.
    public static final MethodHandle MH_glfwSetWindowPos = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetWindowSize`.
    public static final MethodHandle MH_glfwGetWindowSize = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowSizeLimits`.
    public static final MethodHandle MH_glfwSetWindowSizeLimits = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowSizeLimits", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwSetWindowAspectRatio`.
    public static final MethodHandle MH_glfwSetWindowAspectRatio = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowAspectRatio", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwSetWindowSize`.
    public static final MethodHandle MH_glfwSetWindowSize = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetFramebufferSize`.
    public static final MethodHandle MH_glfwGetFramebufferSize = RuntimeHelper.downcall(Handles.lookup, "glfwGetFramebufferSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetWindowFrameSize`.
    public static final MethodHandle MH_glfwGetWindowFrameSize = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowFrameSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetWindowContentScale`.
    public static final MethodHandle MH_glfwGetWindowContentScale = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetWindowOpacity`.
    public static final MethodHandle MH_glfwGetWindowOpacity = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowOpacity", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowOpacity`.
    public static final MethodHandle MH_glfwSetWindowOpacity = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowOpacity", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
    /// The method handle of `glfwIconifyWindow`.
    public static final MethodHandle MH_glfwIconifyWindow = RuntimeHelper.downcall(Handles.lookup, "glfwIconifyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwRestoreWindow`.
    public static final MethodHandle MH_glfwRestoreWindow = RuntimeHelper.downcall(Handles.lookup, "glfwRestoreWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwMaximizeWindow`.
    public static final MethodHandle MH_glfwMaximizeWindow = RuntimeHelper.downcall(Handles.lookup, "glfwMaximizeWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwShowWindow`.
    public static final MethodHandle MH_glfwShowWindow = RuntimeHelper.downcall(Handles.lookup, "glfwShowWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwHideWindow`.
    public static final MethodHandle MH_glfwHideWindow = RuntimeHelper.downcall(Handles.lookup, "glfwHideWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwFocusWindow`.
    public static final MethodHandle MH_glfwFocusWindow = RuntimeHelper.downcall(Handles.lookup, "glfwFocusWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwRequestWindowAttention`.
    public static final MethodHandle MH_glfwRequestWindowAttention = RuntimeHelper.downcall(Handles.lookup, "glfwRequestWindowAttention", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwGetWindowMonitor`.
    public static final MethodHandle MH_glfwGetWindowMonitor = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowMonitor`.
    public static final MethodHandle MH_glfwSetWindowMonitor = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowMonitor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetWindowAttrib`.
    public static final MethodHandle MH_glfwGetWindowAttrib = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowAttrib", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwSetWindowAttrib`.
    public static final MethodHandle MH_glfwSetWindowAttrib = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowAttrib", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwSetWindowUserPointer`.
    public static final MethodHandle MH_glfwSetWindowUserPointer = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwGetWindowUserPointer`.
    public static final MethodHandle MH_glfwGetWindowUserPointer = RuntimeHelper.downcall(Handles.lookup, "glfwGetWindowUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowPosCallback`.
    public static final MethodHandle MH_glfwSetWindowPosCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowPosCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowSizeCallback`.
    public static final MethodHandle MH_glfwSetWindowSizeCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowCloseCallback`.
    public static final MethodHandle MH_glfwSetWindowCloseCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowCloseCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowRefreshCallback`.
    public static final MethodHandle MH_glfwSetWindowRefreshCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowRefreshCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowFocusCallback`.
    public static final MethodHandle MH_glfwSetWindowFocusCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowFocusCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowIconifyCallback`.
    public static final MethodHandle MH_glfwSetWindowIconifyCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowIconifyCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowMaximizeCallback`.
    public static final MethodHandle MH_glfwSetWindowMaximizeCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowMaximizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetFramebufferSizeCallback`.
    public static final MethodHandle MH_glfwSetFramebufferSizeCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetFramebufferSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetWindowContentScaleCallback`.
    public static final MethodHandle MH_glfwSetWindowContentScaleCallback = RuntimeHelper.downcall(Handles.lookup, "glfwSetWindowContentScaleCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwPollEvents`.
    public static final MethodHandle MH_glfwPollEvents = RuntimeHelper.downcall(Handles.lookup, "glfwPollEvents", FunctionDescriptor.ofVoid());
    /// The method handle of `glfwWaitEvents`.
    public static final MethodHandle MH_glfwWaitEvents = RuntimeHelper.downcall(Handles.lookup, "glfwWaitEvents", FunctionDescriptor.ofVoid());
    /// The method handle of `glfwWaitEventsTimeout`.
    public static final MethodHandle MH_glfwWaitEventsTimeout = RuntimeHelper.downcall(Handles.lookup, "glfwWaitEventsTimeout", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
    /// The method handle of `glfwPostEmptyEvent`.
    public static final MethodHandle MH_glfwPostEmptyEvent = RuntimeHelper.downcall(Handles.lookup, "glfwPostEmptyEvent", FunctionDescriptor.ofVoid());
    /// The method handle of `glfwGetInputMode`.
    public static final MethodHandle MH_glfwGetInputMode = RuntimeHelper.downcall(Handles.lookup, "glfwGetInputMode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwSetInputMode`.
    public static final MethodHandle MH_glfwSetInputMode = RuntimeHelper.downcall(Handles.lookup, "glfwSetInputMode", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwRawMouseMotionSupported`.
    public static final MethodHandle MH_glfwRawMouseMotionSupported = RuntimeHelper.downcall(Handles.lookup, "glfwRawMouseMotionSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetKeyName`.
    public static final MethodHandle MH_glfwGetKeyName = RuntimeHelper.downcall(Handles.lookup, "glfwGetKeyName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetKeyScancode`.
    public static final MethodHandle MH_glfwGetKeyScancode = RuntimeHelper.downcall(Handles.lookup, "glfwGetKeyScancode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetKey`.
    public static final MethodHandle MH_glfwGetKey = RuntimeHelper.downcall(Handles.lookup, "glfwGetKey", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetMouseButton`.
    public static final MethodHandle MH_glfwGetMouseButton = RuntimeHelper.downcall(Handles.lookup, "glfwGetMouseButton", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwGetCursorPos`.
    public static final MethodHandle MH_glfwGetCursorPos = RuntimeHelper.downcall(Handles.lookup, "glfwGetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `glfwSetCursorPos`.
    public static final MethodHandle MH_glfwSetCursorPos = RuntimeHelper.downcall(Handles.lookup, "glfwSetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    /// The method handle of `glfwCreateCursor`.
    public static final MethodHandle MH_glfwCreateCursor = RuntimeHelper.downcall(Handles.lookup, "glfwCreateCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `glfwCreateStandardCursor`.
    public static final MethodHandle MH_glfwCreateStandardCursor = RuntimeHelper.downcall(Handles.lookup, "glfwCreateStandardCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `glfwDestroyCursor`.
    public static final MethodHandle MH_glfwDestroyCursor = RuntimeHelper.downcall(Handles.lookup, "glfwDestroyCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `glfwSetCursor`.
    public static final MethodHandle MH_glfwSetCursor = RuntimeHelper.downcall(Handles.lookup, "glfwSetCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    //endregion

    ///Initializes the GLFW library.
    ///
    ///This function initializes the GLFW library.  Before most GLFW functions can
    ///be used, GLFW must be initialized, and before an application terminates GLFW
    ///should be terminated in order to free any resources allocated during or
    ///after initialization.
    ///
    ///If this function fails, it calls [glfwTerminate][#glfwTerminate()] before returning.  If it
    ///succeeds, you should call [glfwTerminate][#glfwTerminate()] before the application exits.
    ///
    ///Additional calls to this function after successful initialization but before
    ///termination will return `GLFW_TRUE` immediately.
    ///
    ///The [GLFW_PLATFORM][#GLFW_PLATFORM] init hint controls which platforms are considered during
    ///initialization.  This also depends on which platforms the library was compiled to
    ///support.
    ///
    ///@return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_PLATFORM_UNAVAILABLE][#GLFW_PLATFORM_UNAVAILABLE] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark
    ///- __macOS:__ This function will change the current directory of the
    ///    application to the `Contents/Resources` subdirectory of the application's
    ///    bundle, if present.  This can be disabled with the
    ///    [GLFW_COCOA_CHDIR_RESOURCES][#GLFW_COCOA_CHDIR_RESOURCES] init hint.
    ///
    ///    This function will create the main menu and dock icon for the
    ///    application.  If GLFW finds a `MainMenu.nib` it is loaded and assumed to
    ///    contain a menu bar.  Otherwise a minimal menu bar is created manually with
    ///    common commands like Hide, Quit and About.  The About entry opens a minimal
    ///    about dialog with information from the application's bundle.  The menu bar
    ///    and dock icon can be disabled entirely with the [GLFW_COCOA_MENUBAR][#GLFW_COCOA_MENUBAR] init
    ///    hint.
    ///- __Wayland, X11:__ If the library was compiled with support for both
    ///    Wayland and X11, and the [GLFW_PLATFORM][#GLFW_PLATFORM] init hint is set to
    ///    `GLFW_ANY_PLATFORM`, the `XDG_SESSION_TYPE` environment variable affects
    ///    which platform is picked.  If the environment variable is not set, or is set
    ///    to something other than `wayland` or `x11`, the regular detection mechanism
    ///    will be used instead.
    ///- __X11:__ This function will set the `LC_CTYPE` category of the
    ///    application locale according to the current environment if that category is
    ///    still "C".  This is because the "C" locale breaks Unicode text input.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInitHint(int, int) glfwInitHint
    ///@see #glfwInitAllocator(MemorySegment) glfwInitAllocator
    ///@see #glfwTerminate() glfwTerminate
    public static @CType("int") boolean glfwInit() {
        try {
            return (int) MH_glfwInit.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwInit", e); }
    }

    ///Terminates the GLFW library.
    ///
    ///This function destroys all remaining windows and cursors, restores any
    ///modified gamma ramps and frees any other allocated resources.  Once this
    ///function is called, you must again call [glfwInit][#glfwInit()] successfully before
    ///you will be able to use most GLFW functions.
    ///
    ///If GLFW has been successfully initialized, this function should be called
    ///before the application exits.  If initialization fails, there is no need to
    ///call this function, as it is called by [glfwInit][#glfwInit()] before it returns
    ///failure.
    ///
    ///This function has no effect if GLFW is not initialized.
    ///
    ///@glfw.errors Possible errors include [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.warning The contexts of any remaining windows must not be current on any
    ///other thread when this function is called.
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInit() glfwInit
    public static void glfwTerminate() {
        try {
            MH_glfwTerminate.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwTerminate", e); }
    }

    ///Sets the specified init hint to the desired value.
    ///
    ///This function sets hints for the next initialization of GLFW.
    ///
    ///The values you set hints to are never reset by GLFW, but they only take
    ///effect during initialization.  Once GLFW has been initialized, any values
    ///you set will be ignored until the library is terminated and initialized
    ///again.
    ///
    ///Some hints are platform specific.  These may be set on any platform but they
    ///will only affect their specific platform.  Other platforms will ignore them.
    ///Setting these hints requires no platform specific headers or functions.
    ///
    ///@param hint The init hint to set.
    ///@param value The new value of the init hint.
    ///
    ///@glfw.errors Possible errors include [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInit() glfwInit
    public static void glfwInitHint(@CType("int") int hint, @CType("int") int value) {
        try {
            MH_glfwInitHint.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitHint", e); }
    }

    ///Sets the init allocator to the desired value.
    ///
    ///To use the default allocator, call this function with a `NULL` argument.
    ///
    ///If you specify an allocator struct, every member must be a valid function
    ///pointer.  If any member is `NULL`, this function will emit
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and the init allocator will be unchanged.
    ///
    ///The functions in the allocator must fulfil a number of requirements.  See the
    ///documentation for [GLFWAllocateFun], [GLFWReallocateFun] and
    ///[GLFWDeallocateFun] for details.
    ///
    ///@param allocator The allocator to use at the next initialization, or
    ///`NULL` to use the default one.
    ///
    ///@glfw.errors Possible errors include [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.pointer_lifetime The specified allocator is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInit() glfwInit
    public static void glfwInitAllocator(@CType("const GLFWallocator*") java.lang.foreign.MemorySegment allocator) {
        try {
            MH_glfwInitAllocator.invokeExact(allocator);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

    ///Sets the init allocator to the desired value.
    ///
    ///To use the default allocator, call this function with a `NULL` argument.
    ///
    ///If you specify an allocator struct, every member must be a valid function
    ///pointer.  If any member is `NULL`, this function will emit
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and the init allocator will be unchanged.
    ///
    ///The functions in the allocator must fulfil a number of requirements.  See the
    ///documentation for [GLFWAllocateFun], [GLFWReallocateFun] and
    ///[GLFWDeallocateFun] for details.
    ///
    ///@param allocator The allocator to use at the next initialization, or
    ///`NULL` to use the default one.
    ///
    ///@glfw.errors Possible errors include [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.pointer_lifetime The specified allocator is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInit() glfwInit
    public static void glfwInitAllocator(@CType("const GLFWallocator*") overrungl.glfw.GLFWAllocator allocator) {
        try {
            MH_glfwInitAllocator.invokeExact(Marshal.marshal(allocator));
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
    }

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
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwInit() glfwInit
    public static void glfwInitVulkanLoader(@CType("PFN_vkGetInstanceProcAddr") java.lang.foreign.MemorySegment loader) {
        try {
            MH_glfwInitVulkanLoader.invokeExact(loader);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    ///Retrieves the version of the GLFW library.
    ///
    ///This function retrieves the major, minor and revision numbers of the GLFW
    ///library.  It is intended for when you are using GLFW as a shared library and
    ///want to ensure that you are using the minimum required version.
    ///
    ///Any or all of the version arguments may be `NULL`.
    ///
    ///@param major Where to store the major version number, or `NULL`.
    ///@param minor Where to store the minor version number, or `NULL`.
    ///@param rev Where to store the revision number, or `NULL`.
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetVersionString() glfwGetVersionString
    public static void glfwGetVersion(@Out @CType("int*") java.lang.foreign.MemorySegment major, @Out @CType("int*") java.lang.foreign.MemorySegment minor, @Out @CType("int*") java.lang.foreign.MemorySegment rev) {
        try {
            MH_glfwGetVersion.invokeExact(major, minor, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    ///Retrieves the version of the GLFW library.
    ///
    ///This function retrieves the major, minor and revision numbers of the GLFW
    ///library.  It is intended for when you are using GLFW as a shared library and
    ///want to ensure that you are using the minimum required version.
    ///
    ///Any or all of the version arguments may be `NULL`.
    ///
    ///@param major Where to store the major version number, or `NULL`.
    ///@param minor Where to store the minor version number, or `NULL`.
    ///@param rev Where to store the revision number, or `NULL`.
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetVersionString() glfwGetVersionString
    public static void glfwGetVersion(@Out @CType("int*") int[] major, @Out @CType("int*") int[] minor, @Out @CType("int*") int[] rev) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_major = Marshal.marshal(__overrungl_stack, major);
            var __overrungl_ref_minor = Marshal.marshal(__overrungl_stack, minor);
            var __overrungl_ref_rev = Marshal.marshal(__overrungl_stack, rev);
            MH_glfwGetVersion.invokeExact(__overrungl_ref_major, __overrungl_ref_minor, __overrungl_ref_rev);
            Unmarshal.copy(__overrungl_ref_major, major);
            Unmarshal.copy(__overrungl_ref_minor, minor);
            Unmarshal.copy(__overrungl_ref_rev, rev);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersion", e); }
    }

    ///Returns a string describing the compile-time configuration.
    ///
    ///This function returns the compile-time generated
    ///version string of the GLFW library binary.  It describes
    ///the version, platforms, compiler and any platform or operating system specific
    ///compile-time options.  It should not be confused with the OpenGL or OpenGL ES version
    ///string, queried with `glGetString`.
    ///
    ///__Do not use the version string__ to parse the GLFW library version.  The
    ///[glfwGetVersion][#glfwGetVersion(MemorySegment, MemorySegment, MemorySegment)] function provides the version of the running library
    ///binary in numerical format.
    ///TODO
    ///__Do not use the version string__ to parse what platforms are supported.  The
    ///[glfwPlatformSupported][#glfwPlatformSupported()] function lets you query platform support.
    ///
    ///@return The ASCII encoded GLFW version string.
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.pointer_lifetime The returned string is static and compile-time generated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetVersion(MemorySegment, MemorySegment, MemorySegment) glfwGetVersion
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetVersionString_() {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetVersionString.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    ///Returns a string describing the compile-time configuration.
    ///
    ///This function returns the compile-time generated
    ///version string of the GLFW library binary.  It describes
    ///the version, platforms, compiler and any platform or operating system specific
    ///compile-time options.  It should not be confused with the OpenGL or OpenGL ES version
    ///string, queried with `glGetString`.
    ///
    ///__Do not use the version string__ to parse the GLFW library version.  The
    ///[glfwGetVersion][#glfwGetVersion(MemorySegment, MemorySegment, MemorySegment)] function provides the version of the running library
    ///binary in numerical format.
    ///TODO
    ///__Do not use the version string__ to parse what platforms are supported.  The
    ///[glfwPlatformSupported][#glfwPlatformSupported()] function lets you query platform support.
    ///
    ///@return The ASCII encoded GLFW version string.
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.pointer_lifetime The returned string is static and compile-time generated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetVersion(MemorySegment, MemorySegment, MemorySegment) glfwGetVersion
    public static @CType("const char*") java.lang.String glfwGetVersionString() {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) MH_glfwGetVersionString.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVersionString", e); }
    }

    ///Returns and clears the last error for the calling thread.
    ///
    ///This function returns and clears the error code of the last
    ///error that occurred on the calling thread, and optionally a UTF-8 encoded
    ///human-readable description of it.  If no error has occurred since the last
    ///call, it returns [GLFW_NO_ERROR][#GLFW_NO_ERROR] (zero) and the description pointer is
    ///set to `NULL`.
    ///
    ///@param description Where to store the error description pointer, or `NULL`.
    ///@return The last error code for the calling thread, or [GLFW_NO_ERROR][#GLFW_NO_ERROR]
    ///(zero).
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is guaranteed to be valid only until the
    ///next error occurs or the library is terminated.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwSetErrorCallback(MemorySegment) glfwSetErrorCallback
    public static @CType("int") int glfwGetError(@Out @CType("const char**") java.lang.foreign.MemorySegment description) {
        try {
            return (int) MH_glfwGetError.invokeExact(description);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    ///Returns and clears the last error for the calling thread.
    ///
    ///This function returns and clears the error code of the last
    ///error that occurred on the calling thread, and optionally a UTF-8 encoded
    ///human-readable description of it.  If no error has occurred since the last
    ///call, it returns [GLFW_NO_ERROR][#GLFW_NO_ERROR] (zero) and the description pointer is
    ///set to `NULL`.
    ///
    ///@param description Where to store the error description pointer, or `NULL`.
    ///@return The last error code for the calling thread, or [GLFW_NO_ERROR][#GLFW_NO_ERROR]
    ///(zero).
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is guaranteed to be valid only until the
    ///next error occurs or the library is terminated.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwSetErrorCallback(MemorySegment) glfwSetErrorCallback
    public static @CType("int") int glfwGetError(@Out @CType("const char**") java.lang.String[] description) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_description = Marshal.marshal(__overrungl_stack, description);
            var __overrungl_result = (int) MH_glfwGetError.invokeExact(__overrungl_ref_description);
            Unmarshal.copy(__overrungl_ref_description, description);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetError", e); }
    }

    ///Sets the error callback.
    ///
    ///This function sets the error callback, which is called with an error code
    ///and a human-readable description each time a GLFW error occurs.
    ///
    ///The error code is set before the callback is called.  Calling
    ///[glfwGetError][#glfwGetError(MemorySegment)] from the error callback will return the same value as the error
    ///code argument.
    ///
    ///The error callback is called on the thread where the error occurred.  If you
    ///are using GLFW from multiple threads, your error callback needs to be
    ///written accordingly.
    ///
    ///Because the description string may have been generated specifically for that
    ///error, it is not guaranteed to be valid after the callback has returned.  If
    ///you wish to use it after the callback returns, you need to make a copy.
    ///
    ///Once set, the error callback remains set even after the library has been
    ///terminated.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[callback pointer type][GLFWErrorFun].
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetError(MemorySegment) glfwGetError
    public static @CType("GLFWerrorfun") java.lang.foreign.MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetErrorCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetErrorCallback", e); }
    }

    ///Sets the error callback.
    ///
    ///This function sets the error callback, which is called with an error code
    ///and a human-readable description each time a GLFW error occurs.
    ///
    ///The error code is set before the callback is called.  Calling
    ///[glfwGetError][#glfwGetError(MemorySegment)] from the error callback will return the same value as the error
    ///code argument.
    ///
    ///The error callback is called on the thread where the error occurred.  If you
    ///are using GLFW from multiple threads, your error callback needs to be
    ///written accordingly.
    ///
    ///Because the description string may have been generated specifically for that
    ///error, it is not guaranteed to be valid after the callback has returned.  If
    ///you wish to use it after the callback returns, you need to make a copy.
    ///
    ///Once set, the error callback remains set even after the library has been
    ///terminated.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[callback pointer type][GLFWErrorFun].
    ///
    ///@glfw.errors None.
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetError(MemorySegment) glfwGetError
    public static @CType("GLFWerrorfun") java.lang.foreign.MemorySegment glfwSetErrorCallback(@CType("GLFWerrorfun") overrungl.glfw.GLFWErrorFun callback) {
        return glfwSetErrorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    ///Returns the currently selected platform.
    ///
    ///This function returns the platform that was selected during initialization.  The
    ///returned value will be one of `GLFW_PLATFORM_WIN32`, `GLFW_PLATFORM_COCOA`,
    ///`GLFW_PLATFORM_WAYLAND`, `GLFW_PLATFORM_X11` or `GLFW_PLATFORM_NULL`.
    ///
    ///@return The currently selected platform, or zero if an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwPlatformSupported(int) glfwPlatformSupported
    public static @CType("int") int glfwGetPlatform() {
        try {
            return (int) MH_glfwGetPlatform.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPlatform", e); }
    }

    ///Returns whether the library includes support for the specified platform.
    ///
    ///This function returns whether the library was compiled with support for the specified
    ///platform.  The platform must be one of `GLFW_PLATFORM_WIN32`, `GLFW_PLATFORM_COCOA`,
    ///`GLFW_PLATFORM_WAYLAND`, `GLFW_PLATFORM_X11` or `GLFW_PLATFORM_NULL`.
    ///
    ///@param platform The platform to query.
    ///@return `GLFW_TRUE` if the platform is supported, or `GLFW_FALSE` otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.remark This function may be called before [glfwInit][#glfwInit()].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetPlatform() glfwGetPlatform
    public static @CType("int") boolean glfwPlatformSupported(@CType("int") int platform) {
        try {
            return (int) MH_glfwPlatformSupported.invokeExact(platform) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwPlatformSupported", e); }
    }

    ///Returns the currently connected monitors.
    ///
    ///This function returns an array of handles for all currently connected
    ///monitors.  The primary monitor is always first in the returned array.  If no
    ///monitors were found, this function returns `NULL`.
    ///
    ///@param count Where to store the number of monitors in the returned
    ///array.  This is set to zero if an error occurred.
    ///@return An array of monitor handles, or `NULL` if no monitors were found or
    ///if an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is guaranteed to be valid only until the
    ///monitor configuration changes or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetPrimaryMonitor() glfwGetPrimaryMonitor
    public static @CType("GLFWmonitor**") java.lang.foreign.MemorySegment glfwGetMonitors(@Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetMonitors.invokeExact(count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitors", e); }
    }

    ///Returns the primary monitor.
    ///
    ///This function returns the primary monitor.  This is usually the monitor
    ///where elements like the task bar or global menu bar are located.
    ///
    ///@return The primary monitor, or `NULL` if no monitors were found or if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@glfw.remark The primary monitor is always first in the array returned by @ref
    ///glfwGetMonitors.
    ///
    ///@see #glfwGetMonitors(MemorySegment) glfwGetMonitors
    public static @CType("GLFWmonitor*") java.lang.foreign.MemorySegment glfwGetPrimaryMonitor() {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetPrimaryMonitor.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPrimaryMonitor", e); }
    }

    ///Returns the position of the monitor's viewport on the virtual screen.
    ///
    ///This function returns the position, in screen coordinates, of the upper-left
    ///corner of the specified monitor.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param xpos Where to store the monitor x-coordinate, or `NULL`.
    ///@param ypos Where to store the monitor y-coordinate, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos) {
        try {
            MH_glfwGetMonitorPos.invokeExact(monitor, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    ///Returns the position of the monitor's viewport on the virtual screen.
    ///
    ///This function returns the position, in screen coordinates, of the upper-left
    ///corner of the specified monitor.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param xpos Where to store the monitor x-coordinate, or `NULL`.
    ///@param ypos Where to store the monitor y-coordinate, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorPos(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            MH_glfwGetMonitorPos.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPos", e); }
    }

    ///Retrieves the work area of the monitor.
    ///
    ///This function returns the position, in screen coordinates, of the upper-left
    ///corner of the work area of the specified monitor along with the work area
    ///size in screen coordinates. The work area is defined as the area of the
    ///monitor not occluded by the window system task bar where present. If no
    ///task bar exists then the work area is the monitor resolution in screen
    ///coordinates.
    ///
    ///Any or all of the position and size arguments may be `NULL`.  If an error
    ///occurs, all non-`NULL` position and size arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param xpos Where to store the monitor x-coordinate, or `NULL`.
    ///@param ypos Where to store the monitor y-coordinate, or `NULL`.
    ///@param width Where to store the monitor width, or `NULL`.
    ///@param height Where to store the monitor height, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            MH_glfwGetMonitorWorkarea.invokeExact(monitor, xpos, ypos, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    ///Retrieves the work area of the monitor.
    ///
    ///This function returns the position, in screen coordinates, of the upper-left
    ///corner of the work area of the specified monitor along with the work area
    ///size in screen coordinates. The work area is defined as the area of the
    ///monitor not occluded by the window system task bar where present. If no
    ///task bar exists then the work area is the monitor resolution in screen
    ///coordinates.
    ///
    ///Any or all of the position and size arguments may be `NULL`.  If an error
    ///occurs, all non-`NULL` position and size arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param xpos Where to store the monitor x-coordinate, or `NULL`.
    ///@param ypos Where to store the monitor y-coordinate, or `NULL`.
    ///@param width Where to store the monitor width, or `NULL`.
    ///@param height Where to store the monitor height, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorWorkarea(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            MH_glfwGetMonitorWorkarea.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorWorkarea", e); }
    }

    ///Returns the physical size of the monitor.
    ///
    ///This function returns the size, in millimetres, of the display area of the
    ///specified monitor.
    ///
    ///Some platforms do not provide accurate monitor size information, either
    ///because the monitor [EDID](https://en.wikipedia.org/wiki/Extended_display_identification_data) data is incorrect or because the driver does
    ///not report it accurately.
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param widthMM Where to store the width, in millimetres, of the
    ///monitor's display area, or `NULL`.
    ///@param heightMM Where to store the height, in millimetres, of the
    ///monitor's display area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __Windows:__ On Windows 8 and earlier the physical size is calculated from
    ///the current resolution and system DPI instead of querying the monitor EDID data.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment widthMM, @Out @CType("int*") java.lang.foreign.MemorySegment heightMM) {
        try {
            MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, widthMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    ///Returns the physical size of the monitor.
    ///
    ///This function returns the size, in millimetres, of the display area of the
    ///specified monitor.
    ///
    ///Some platforms do not provide accurate monitor size information, either
    ///because the monitor [EDID](https://en.wikipedia.org/wiki/Extended_display_identification_data) data is incorrect or because the driver does
    ///not report it accurately.
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param monitor The monitor to query.
    ///@param widthMM Where to store the width, in millimetres, of the
    ///monitor's display area, or `NULL`.
    ///@param heightMM Where to store the height, in millimetres, of the
    ///monitor's display area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __Windows:__ On Windows 8 and earlier the physical size is calculated from
    ///the current resolution and system DPI instead of querying the monitor EDID data.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetMonitorPhysicalSize(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") int[] widthMM, @Out @CType("int*") int[] heightMM) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_widthMM = Marshal.marshal(__overrungl_stack, widthMM);
            var __overrungl_ref_heightMM = Marshal.marshal(__overrungl_stack, heightMM);
            MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, __overrungl_ref_widthMM, __overrungl_ref_heightMM);
            Unmarshal.copy(__overrungl_ref_widthMM, widthMM);
            Unmarshal.copy(__overrungl_ref_heightMM, heightMM);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorPhysicalSize", e); }
    }

    ///Retrieves the content scale for the specified monitor.
    ///
    ///This function retrieves the content scale for the specified monitor.  The
    ///content scale is the ratio between the current DPI and the platform's
    ///default DPI.  This is especially important for text and any UI elements.  If
    ///the pixel dimensions of your UI scaled by this look appropriate on your
    ///machine then it should appear at a reasonable size on other machines
    ///regardless of their DPI and scaling settings.  This relies on the system DPI
    ///and scaling settings being somewhat correct.
    ///
    ///The content scale may depend on both the monitor resolution and pixel
    ///density and on user settings.  It may be very different from the raw DPI
    ///calculated from the physical size and current resolution.
    ///
    ///@param monitor The monitor to query.
    ///@param xscale Where to store the x-axis content scale, or `NULL`.
    ///@param yscale Where to store the y-axis content scale, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Wayland:__ Fractional scaling information is not yet available for
    ///monitors, so this function only returns integer content scales.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowContentScale
    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("float*") java.lang.foreign.MemorySegment xscale, @Out @CType("float*") java.lang.foreign.MemorySegment yscale) {
        try {
            MH_glfwGetMonitorContentScale.invokeExact(monitor, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    ///Retrieves the content scale for the specified monitor.
    ///
    ///This function retrieves the content scale for the specified monitor.  The
    ///content scale is the ratio between the current DPI and the platform's
    ///default DPI.  This is especially important for text and any UI elements.  If
    ///the pixel dimensions of your UI scaled by this look appropriate on your
    ///machine then it should appear at a reasonable size on other machines
    ///regardless of their DPI and scaling settings.  This relies on the system DPI
    ///and scaling settings being somewhat correct.
    ///
    ///The content scale may depend on both the monitor resolution and pixel
    ///density and on user settings.  It may be very different from the raw DPI
    ///calculated from the physical size and current resolution.
    ///
    ///@param monitor The monitor to query.
    ///@param xscale Where to store the x-axis content scale, or `NULL`.
    ///@param yscale Where to store the y-axis content scale, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Wayland:__ Fractional scaling information is not yet available for
    ///monitors, so this function only returns integer content scales.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowContentScale
    public static void glfwGetMonitorContentScale(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            MH_glfwGetMonitorContentScale.invokeExact(monitor, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorContentScale", e); }
    }

    ///Returns the name of the specified monitor.
    ///
    ///This function returns a human-readable name, encoded as UTF-8, of the
    ///specified monitor.  The name typically reflects the make and model of the
    ///monitor and is not guaranteed to be unique among the connected monitors.
    ///
    ///@param monitor The monitor to query.
    ///@return The UTF-8 encoded name of the monitor, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified monitor is
    ///disconnected or the library is terminated.
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetMonitorName_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetMonitorName.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    ///Returns the name of the specified monitor.
    ///
    ///This function returns a human-readable name, encoded as UTF-8, of the
    ///specified monitor.  The name typically reflects the make and model of the
    ///monitor and is not guaranteed to be unique among the connected monitors.
    ///
    ///@param monitor The monitor to query.
    ///@return The UTF-8 encoded name of the monitor, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified monitor is
    ///disconnected or the library is terminated.
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.String glfwGetMonitorName(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) MH_glfwGetMonitorName.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorName", e); }
    }

    ///Sets the user pointer of the specified monitor.
    ///
    ///This function sets the user-defined pointer of the specified monitor.  The
    ///current value is retained until the monitor is disconnected.  The initial
    ///value is `NULL`.
    ///
    ///This function may be called from the monitor callback, even for a monitor
    ///that is being disconnected.
    ///
    ///@param monitor The monitor whose pointer to set.
    ///@param pointer The new value.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwGetMonitorUserPointer(MemorySegment) glfwGetMonitorUserPointer
    public static void glfwSetMonitorUserPointer(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            MH_glfwSetMonitorUserPointer.invokeExact(monitor, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorUserPointer", e); }
    }

    ///Returns the user pointer of the specified monitor.
    ///
    ///This function returns the current value of the user-defined pointer of the
    ///specified monitor.  The initial value is `NULL`.
    ///
    ///This function may be called from the monitor callback, even for a monitor
    ///that is being disconnected.
    ///
    ///@param monitor The monitor whose pointer to return.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwSetMonitorUserPointer(MemorySegment, MemorySegment) glfwSetMonitorUserPointer
    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetMonitorUserPointer(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetMonitorUserPointer.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMonitorUserPointer", e); }
    }

    ///Sets the monitor configuration callback.
    ///
    ///This function sets the monitor configuration callback, or removes the
    ///currently set callback.  This is called when a monitor is connected to or
    ///disconnected from the system.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWMonitorFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWmonitorfun") java.lang.foreign.MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetMonitorCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMonitorCallback", e); }
    }

    ///Sets the monitor configuration callback.
    ///
    ///This function sets the monitor configuration callback, or removes the
    ///currently set callback.  This is called when a monitor is connected to or
    ///disconnected from the system.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWMonitorFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWmonitorfun") java.lang.foreign.MemorySegment glfwSetMonitorCallback(@CType("GLFWmonitorfun") overrungl.glfw.GLFWMonitorFun callback) {
        return glfwSetMonitorCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    ///Returns the available video modes for the specified monitor.
    ///
    ///This function returns an array of all video modes supported by the specified
    ///monitor.  The returned array is sorted in ascending order, first by color
    ///bit depth (the sum of all channel depths), then by resolution area (the
    ///product of width and height), then resolution width and finally by refresh
    ///rate.
    ///
    ///@param monitor The monitor to query.
    ///@param count Where to store the number of video modes in the returned
    ///array.  This is set to zero if an error occurred.
    ///@return An array of video modes, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified monitor is
    ///disconnected, this function is called again for that monitor or the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetVideoMode(MemorySegment) glfwGetVideoMode
    public static @CType("const GLFWvidmode*") java.lang.foreign.MemorySegment glfwGetVideoModes(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetVideoModes.invokeExact(monitor, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoModes", e); }
    }

    ///Returns the current mode of the specified monitor.
    ///
    ///This function returns the current video mode of the specified monitor.  If
    ///you have created a full screen window for that monitor, the return value
    ///will depend on whether that window is iconified.
    ///
    ///@param monitor The monitor to query.
    ///@return The current mode of the monitor, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified monitor is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetVideoModes(MemorySegment, MemorySegment) glfwGetVideoModes
    public static @CType("const GLFWvidmode*") java.lang.foreign.MemorySegment glfwGetVideoMode_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetVideoMode.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    ///Returns the current mode of the specified monitor.
    ///
    ///This function returns the current video mode of the specified monitor.  If
    ///you have created a full screen window for that monitor, the return value
    ///will depend on whether that window is iconified.
    ///
    ///@param monitor The monitor to query.
    ///@return The current mode of the monitor, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified monitor is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetVideoModes(MemorySegment, MemorySegment) glfwGetVideoModes
    public static @CType("const GLFWvidmode*") overrungl.glfw.GLFWVidMode glfwGetVideoMode(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWVidMode.of((java.lang.foreign.MemorySegment) MH_glfwGetVideoMode.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetVideoMode", e); }
    }

    ///Generates a gamma ramp and sets it for the specified monitor.
    ///
    ///This function generates an appropriately sized gamma ramp from the specified
    ///exponent and then calls [glfwSetGammaRamp][#glfwSetGammaRamp(MemorySegment, MemorySegment)] with it.  The value must be
    ///a finite number greater than zero.
    ///
    ///The software controlled gamma ramp is applied _in addition_ to the hardware
    ///gamma correction, which today is usually an approximation of sRGB gamma.
    ///This means that setting a perfectly linear ramp, or gamma 1.0, will produce
    ///the default (usually sRGB-like) behavior.
    ///
    ///For gamma correct rendering with OpenGL or OpenGL ES, see the
    ///[GLFW_SRGB_CAPABLE][#GLFW_SRGB_CAPABLE] hint.
    ///
    ///@param monitor The monitor whose gamma ramp to set.
    ///@param gamma The desired exponent.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ Gamma handling is a privileged protocol, this function
    ///will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetGamma(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("float") float gamma) {
        try {
            MH_glfwSetGamma.invokeExact(monitor, gamma);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGamma", e); }
    }

    ///Returns the current gamma ramp for the specified monitor.
    ///
    ///This function returns the current gamma ramp of the specified monitor.
    ///
    ///@param monitor The monitor to query.
    ///@return The current gamma ramp, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
    ///and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ Gamma handling is a privileged protocol, this function
    ///will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] while
    ///returning `NULL`.
    ///
    ///@glfw.pointer_lifetime The returned structure and its arrays are allocated and
    ///freed by GLFW.  You should not free them yourself.  They are valid until the
    ///specified monitor is disconnected, this function is called again for that
    ///monitor or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const GLFWgammaramp*") java.lang.foreign.MemorySegment glfwGetGammaRamp_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetGammaRamp.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    ///Returns the current gamma ramp for the specified monitor.
    ///
    ///This function returns the current gamma ramp of the specified monitor.
    ///
    ///@param monitor The monitor to query.
    ///@return The current gamma ramp, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
    ///and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ Gamma handling is a privileged protocol, this function
    ///will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] while
    ///returning `NULL`.
    ///
    ///@glfw.pointer_lifetime The returned structure and its arrays are allocated and
    ///freed by GLFW.  You should not free them yourself.  They are valid until the
    ///specified monitor is disconnected, this function is called again for that
    ///monitor or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp glfwGetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        try {
            return overrungl.glfw.GLFWGammaRamp.of((java.lang.foreign.MemorySegment) MH_glfwGetGammaRamp.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGammaRamp", e); }
    }

    ///Sets the current gamma ramp for the specified monitor.
    ///
    ///This function sets the current gamma ramp for the specified monitor.  The
    ///original gamma ramp for that monitor is saved by GLFW the first time this
    ///function is called and is restored by [glfwTerminate][#glfwTerminate()].
    ///
    ///The software controlled gamma ramp is applied _in addition_ to the hardware
    ///gamma correction, which today is usually an approximation of sRGB gamma.
    ///This means that setting a perfectly linear ramp, or gamma 1.0, will produce
    ///the default (usually sRGB-like) behavior.
    ///
    ///For gamma correct rendering with OpenGL or OpenGL ES, see the
    ///[GLFW_SRGB_CAPABLE][#GLFW_SRGB_CAPABLE] hint.
    ///
    ///@param monitor The monitor whose gamma ramp to set.
    ///@param ramp The gamma ramp to use.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
    ///and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark The size of the specified gamma ramp should match the size of the
    ///current ramp for that monitor.
    ///- __Windows:__ The gamma ramp size must be 256.
    ///- __Wayland:__ Gamma handling is a privileged protocol, this function
    ///    will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.pointer_lifetime The specified gamma ramp is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("const GLFWgammaramp*") java.lang.foreign.MemorySegment ramp) {
        try {
            MH_glfwSetGammaRamp.invokeExact(monitor, ramp);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    ///Sets the current gamma ramp for the specified monitor.
    ///
    ///This function sets the current gamma ramp for the specified monitor.  The
    ///original gamma ramp for that monitor is saved by GLFW the first time this
    ///function is called and is restored by [glfwTerminate][#glfwTerminate()].
    ///
    ///The software controlled gamma ramp is applied _in addition_ to the hardware
    ///gamma correction, which today is usually an approximation of sRGB gamma.
    ///This means that setting a perfectly linear ramp, or gamma 1.0, will produce
    ///the default (usually sRGB-like) behavior.
    ///
    ///For gamma correct rendering with OpenGL or OpenGL ES, see the
    ///[GLFW_SRGB_CAPABLE][#GLFW_SRGB_CAPABLE] hint.
    ///
    ///@param monitor The monitor whose gamma ramp to set.
    ///@param ramp The gamma ramp to use.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR]
    ///and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark The size of the specified gamma ramp should match the size of the
    ///current ramp for that monitor.
    ///- __Windows:__ The gamma ramp size must be 256.
    ///- __Wayland:__ Gamma handling is a privileged protocol, this function
    ///    will thus never be implemented and emits [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.pointer_lifetime The specified gamma ramp is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetGammaRamp(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("const GLFWgammaramp*") overrungl.glfw.GLFWGammaRamp ramp) {
        try {
            MH_glfwSetGammaRamp.invokeExact(monitor, Marshal.marshal(ramp));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetGammaRamp", e); }
    }

    ///Resets all window hints to their default values.
    ///
    ///This function resets all window hints to their
    ///default values.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwWindowHint(int, int) glfwWindowHint
    ///@see #glfwWindowHintString(int, MemorySegment) glfwWindowHintString
    public static void glfwDefaultWindowHints() {
        try {
            MH_glfwDefaultWindowHints.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwDefaultWindowHints", e); }
    }

    ///Sets the specified window hint to the desired value.
    ///
    ///This function sets hints for the next call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].  The
    ///hints, once set, retain their values until changed by a call to this
    ///function or [glfwDefaultWindowHints][#glfwDefaultWindowHints()], or until the library is terminated.
    ///
    ///Only integer value hints can be set with this function.  String value hints
    ///are set with [glfwWindowHintString][#glfwWindowHintString(int, MemorySegment)].
    ///
    ///This function does not check whether the specified hint values are valid.
    ///If you set hints to invalid values this will instead be reported by the next
    ///call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Some hints are platform specific.  These may be set on any platform but they
    ///will only affect their specific platform.  Other platforms will ignore them.
    ///Setting these hints requires no platform specific headers or functions.
    ///
    ///@param hint The window hint to set.
    ///@param value The new value of the window hint.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwWindowHintString(int, MemorySegment) glfwWindowHintString
    ///@see #glfwDefaultWindowHints() glfwDefaultWindowHints
    public static void glfwWindowHint(@CType("int") int hint, @CType("int") int value) {
        try {
            MH_glfwWindowHint.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHint", e); }
    }

    ///Sets the specified window hint to the desired value.
    ///
    ///This function sets hints for the next call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].  The
    ///hints, once set, retain their values until changed by a call to this
    ///function or [glfwDefaultWindowHints][#glfwDefaultWindowHints()], or until the library is terminated.
    ///
    ///Only string type hints can be set with this function.  Integer value hints
    ///are set with [glfwWindowHint][#glfwWindowHint(int, int)].
    ///
    ///This function does not check whether the specified hint values are valid.
    ///If you set hints to invalid values this will instead be reported by the next
    ///call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Some hints are platform specific.  These may be set on any platform but they
    ///will only affect their specific platform.  Other platforms will ignore them.
    ///Setting these hints requires no platform specific headers or functions.
    ///
    ///@param hint The window hint to set.
    ///@param value The new value of the window hint.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.pointer_lifetime The specified string is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwWindowHint(int, int) glfwWindowHint
    ///@see #glfwDefaultWindowHints() glfwDefaultWindowHints
    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") java.lang.foreign.MemorySegment value) {
        try {
            MH_glfwWindowHintString.invokeExact(hint, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    ///Sets the specified window hint to the desired value.
    ///
    ///This function sets hints for the next call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].  The
    ///hints, once set, retain their values until changed by a call to this
    ///function or [glfwDefaultWindowHints][#glfwDefaultWindowHints()], or until the library is terminated.
    ///
    ///Only string type hints can be set with this function.  Integer value hints
    ///are set with [glfwWindowHint][#glfwWindowHint(int, int)].
    ///
    ///This function does not check whether the specified hint values are valid.
    ///If you set hints to invalid values this will instead be reported by the next
    ///call to [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Some hints are platform specific.  These may be set on any platform but they
    ///will only affect their specific platform.  Other platforms will ignore them.
    ///Setting these hints requires no platform specific headers or functions.
    ///
    ///@param hint The window hint to set.
    ///@param value The new value of the window hint.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.pointer_lifetime The specified string is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwWindowHint(int, int) glfwWindowHint
    ///@see #glfwDefaultWindowHints() glfwDefaultWindowHints
    public static void glfwWindowHintString(@CType("int") int hint, @CType("const char*") java.lang.String value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            MH_glfwWindowHintString.invokeExact(hint, Marshal.marshal(__overrungl_stack, value));
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowHintString", e); }
    }

    ///Creates a window and its associated context.
    ///
    ///This function creates a window and its associated OpenGL or OpenGL ES
    ///context.  Most of the options controlling how the window and its context
    ///should be created are specified with window hints.
    ///
    ///Successful creation does not change which context is current.  Before you
    ///can use the newly created context, you need to
    ///make it current.  For information about the `share`
    ///parameter, see context_sharing.
    ///
    ///The created window, framebuffer and context may differ from what you
    ///requested, as not all parameters and hints are
    ///hard constraints.  This includes the size of the
    ///window, especially for full screen windows.  To query the actual attributes
    ///of the created window, framebuffer and context, see
    ///[glfwGetWindowAttrib][#glfwGetWindowAttrib()], [glfwGetWindowSize][#glfwGetWindowSize()] and [glfwGetFramebufferSize][#glfwGetFramebufferSize()].
    ///TODO
    ///To create a full screen window, you need to specify the monitor the window
    ///will cover.  If no monitor is specified, the window will be windowed mode.
    ///Unless you have a way for the user to choose a specific monitor, it is
    ///recommended that you pick the primary monitor.  For more information on how
    ///to query connected monitors, see monitor_monitors.
    ///
    ///For full screen windows, the specified size becomes the resolution of the
    ///window's _desired video mode_.  As long as a full screen window is not
    ///iconified, the supported video mode most closely matching the desired video
    ///mode is set for the specified monitor.  For more information about full
    ///screen windows, including the creation of so called _windowed full screen_
    ///or _borderless full screen_ windows, see window_windowed_full_screen.
    ///TODO
    ///Once you have created the window, you can switch it between windowed and
    ///full screen mode with [glfwSetWindowMonitor][#glfwSetWindowMonitor()].  This will not affect its
    ///OpenGL or OpenGL ES context.
    ///
    ///By default, newly created windows use the placement recommended by the
    ///window system.  To create the window at a specific position, set the
    ///[GLFW_POSITION_X][#GLFW_POSITION_X] and [GLFW_POSITION_Y][#GLFW_POSITION_Y] window hints before creation.  To
    ///restore the default behavior, set either or both hints back to
    ///`GLFW_ANY_POSITION`.
    ///
    ///As long as at least one full screen window is not iconified, the screensaver
    ///is prohibited from starting.
    ///
    ///Window systems put limits on window sizes.  Very large or very small window
    ///dimensions may be overridden by the window system on creation.  Check the
    ///actual size after creation.
    ///
    ///The swap interval is not set during window creation and
    ///the initial value may vary depending on driver settings and defaults.
    ///
    ///@param width The desired width, in screen coordinates, of the window.
    ///This must be greater than zero.
    ///@param height The desired height, in screen coordinates, of the window.
    ///This must be greater than zero.
    ///@param title The initial, UTF-8 encoded window title.
    ///@param monitor The monitor to use for full screen mode, or `NULL` for
    ///windowed mode.
    ///@param share The window whose context to share resources with, or `NULL`
    ///to not share resources.
    ///@return The handle of the created window, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE],
    ///[GLFW_VERSION_UNAVAILABLE][#GLFW_VERSION_UNAVAILABLE], [GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE],
    ///[GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark
    ///- __Windows:__ Window creation will fail if the Microsoft GDI software
    ///    OpenGL implementation is the only one available.
    ///    TODO
    ///    If the executable has an icon resource named `GLFW_ICON,` it
    ///    will be set as the initial icon for the window.  If no such icon is present,
    ///    the `IDI_APPLICATION` icon will be used instead.  To set a different icon,
    ///    see [glfwSetWindowIcon][#glfwSetWindowIcon()].
    ///
    ///    The context to share resources with must not be current on
    ///    any other thread.
    ///- __macOS:__ The OS only supports core profile contexts for OpenGL
    ///    versions 3.2 and later.  Before creating an OpenGL context of version 3.2 or
    ///    later you must set the [GLFW_OPENGL_PROFILE][#GLFW_OPENGL_PROFILE]
    ///    hint accordingly.  OpenGL 3.0 and 3.1 contexts are not supported at all
    ///    on macOS.
    ///
    ///    The GLFW window has no icon, as it is not a document
    ///    window, but the dock icon will be the same as the application bundle's icon.
    ///    For more information on bundles, see the
    ///    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.
    ///
    ///    The window frame will not be rendered at full resolution on
    ///    Retina displays unless the
    ///    [GLFW_SCALE_FRAMEBUFFER][#GLFW_SCALE_FRAMEBUFFER]
    ///    hint is `GLFW_TRUE` and the `NSHighResolutionCapable` key is enabled in the
    ///    application bundle's `Info.plist`.  For more information, see
    ///    [High Resolution Guidelines for OS X](https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html) in the Mac Developer
    ///    Library.  The GLFW test and example programs use a custom `Info.plist`
    ///    template for this, which can be found as `CMake/Info.plist.in` in the source
    ///    tree.
    ///
    ///    When activating frame autosaving with
    ///    [GLFW_COCOA_FRAME_NAME][#GLFW_COCOA_FRAME_NAME], the specified
    ///    window size and position may be overridden by previously saved values.
    ///- __Wayland:__ GLFW uses [libdecor](https://gitlab.freedesktop.org/libdecor/libdecor) where available to create its window
    ///    decorations.  This in turn uses server-side XDG decorations where available
    ///    and provides high quality client-side decorations on compositors like GNOME.
    ///    If both XDG decorations and libdecor are unavailable, GLFW falls back to
    ///    a very simple set of window decorations that only support moving, resizing
    ///    and the window manager's right-click menu.
    ///- __X11:__ Some window managers will not respect the placement of
    ///    initially hidden windows.
    ///
    ///    Due to the asynchronous nature of X11, it may take a moment for
    ///    a window to reach its requested state.  This means you may not be able to
    ///    query the final size, position or other attributes directly after window
    ///    creation.
    ///
    ///    The class part of the `WM_CLASS` window property will by
    ///    default be set to the window title passed to this function.  The instance
    ///    part will use the contents of the `RESOURCE_NAME` environment variable, if
    ///    present and not empty, or fall back to the window title.  Set the
    ///    [GLFW_X11_CLASS_NAME][#GLFW_X11_CLASS_NAME] and
    ///    [GLFW_X11_INSTANCE_NAME][#GLFW_X11_INSTANCE_NAME] window hints to
    ///    override this.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwDestroyWindow(MemorySegment) glfwDestroyWindow
    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") java.lang.foreign.MemorySegment title, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("GLFWwindow*") java.lang.foreign.MemorySegment share) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwCreateWindow.invokeExact(width, height, title, monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    ///Creates a window and its associated context.
    ///
    ///This function creates a window and its associated OpenGL or OpenGL ES
    ///context.  Most of the options controlling how the window and its context
    ///should be created are specified with window hints.
    ///
    ///Successful creation does not change which context is current.  Before you
    ///can use the newly created context, you need to
    ///make it current.  For information about the `share`
    ///parameter, see context_sharing.
    ///
    ///The created window, framebuffer and context may differ from what you
    ///requested, as not all parameters and hints are
    ///hard constraints.  This includes the size of the
    ///window, especially for full screen windows.  To query the actual attributes
    ///of the created window, framebuffer and context, see
    ///[glfwGetWindowAttrib][#glfwGetWindowAttrib()], [glfwGetWindowSize][#glfwGetWindowSize()] and [glfwGetFramebufferSize][#glfwGetFramebufferSize()].
    ///TODO
    ///To create a full screen window, you need to specify the monitor the window
    ///will cover.  If no monitor is specified, the window will be windowed mode.
    ///Unless you have a way for the user to choose a specific monitor, it is
    ///recommended that you pick the primary monitor.  For more information on how
    ///to query connected monitors, see monitor_monitors.
    ///
    ///For full screen windows, the specified size becomes the resolution of the
    ///window's _desired video mode_.  As long as a full screen window is not
    ///iconified, the supported video mode most closely matching the desired video
    ///mode is set for the specified monitor.  For more information about full
    ///screen windows, including the creation of so called _windowed full screen_
    ///or _borderless full screen_ windows, see window_windowed_full_screen.
    ///TODO
    ///Once you have created the window, you can switch it between windowed and
    ///full screen mode with [glfwSetWindowMonitor][#glfwSetWindowMonitor()].  This will not affect its
    ///OpenGL or OpenGL ES context.
    ///
    ///By default, newly created windows use the placement recommended by the
    ///window system.  To create the window at a specific position, set the
    ///[GLFW_POSITION_X][#GLFW_POSITION_X] and [GLFW_POSITION_Y][#GLFW_POSITION_Y] window hints before creation.  To
    ///restore the default behavior, set either or both hints back to
    ///`GLFW_ANY_POSITION`.
    ///
    ///As long as at least one full screen window is not iconified, the screensaver
    ///is prohibited from starting.
    ///
    ///Window systems put limits on window sizes.  Very large or very small window
    ///dimensions may be overridden by the window system on creation.  Check the
    ///actual size after creation.
    ///
    ///The swap interval is not set during window creation and
    ///the initial value may vary depending on driver settings and defaults.
    ///
    ///@param width The desired width, in screen coordinates, of the window.
    ///This must be greater than zero.
    ///@param height The desired height, in screen coordinates, of the window.
    ///This must be greater than zero.
    ///@param title The initial, UTF-8 encoded window title.
    ///@param monitor The monitor to use for full screen mode, or `NULL` for
    ///windowed mode.
    ///@param share The window whose context to share resources with, or `NULL`
    ///to not share resources.
    ///@return The handle of the created window, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE],
    ///[GLFW_VERSION_UNAVAILABLE][#GLFW_VERSION_UNAVAILABLE], [GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE],
    ///[GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark
    ///- __Windows:__ Window creation will fail if the Microsoft GDI software
    ///    OpenGL implementation is the only one available.
    ///    TODO
    ///    If the executable has an icon resource named `GLFW_ICON,` it
    ///    will be set as the initial icon for the window.  If no such icon is present,
    ///    the `IDI_APPLICATION` icon will be used instead.  To set a different icon,
    ///    see [glfwSetWindowIcon][#glfwSetWindowIcon()].
    ///
    ///    The context to share resources with must not be current on
    ///    any other thread.
    ///- __macOS:__ The OS only supports core profile contexts for OpenGL
    ///    versions 3.2 and later.  Before creating an OpenGL context of version 3.2 or
    ///    later you must set the [GLFW_OPENGL_PROFILE][#GLFW_OPENGL_PROFILE]
    ///    hint accordingly.  OpenGL 3.0 and 3.1 contexts are not supported at all
    ///    on macOS.
    ///
    ///    The GLFW window has no icon, as it is not a document
    ///    window, but the dock icon will be the same as the application bundle's icon.
    ///    For more information on bundles, see the
    ///    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.
    ///
    ///    The window frame will not be rendered at full resolution on
    ///    Retina displays unless the
    ///    [GLFW_SCALE_FRAMEBUFFER][#GLFW_SCALE_FRAMEBUFFER]
    ///    hint is `GLFW_TRUE` and the `NSHighResolutionCapable` key is enabled in the
    ///    application bundle's `Info.plist`.  For more information, see
    ///    [High Resolution Guidelines for OS X](https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html) in the Mac Developer
    ///    Library.  The GLFW test and example programs use a custom `Info.plist`
    ///    template for this, which can be found as `CMake/Info.plist.in` in the source
    ///    tree.
    ///
    ///    When activating frame autosaving with
    ///    [GLFW_COCOA_FRAME_NAME][#GLFW_COCOA_FRAME_NAME], the specified
    ///    window size and position may be overridden by previously saved values.
    ///- __Wayland:__ GLFW uses [libdecor](https://gitlab.freedesktop.org/libdecor/libdecor) where available to create its window
    ///    decorations.  This in turn uses server-side XDG decorations where available
    ///    and provides high quality client-side decorations on compositors like GNOME.
    ///    If both XDG decorations and libdecor are unavailable, GLFW falls back to
    ///    a very simple set of window decorations that only support moving, resizing
    ///    and the window manager's right-click menu.
    ///- __X11:__ Some window managers will not respect the placement of
    ///    initially hidden windows.
    ///
    ///    Due to the asynchronous nature of X11, it may take a moment for
    ///    a window to reach its requested state.  This means you may not be able to
    ///    query the final size, position or other attributes directly after window
    ///    creation.
    ///
    ///    The class part of the `WM_CLASS` window property will by
    ///    default be set to the window title passed to this function.  The instance
    ///    part will use the contents of the `RESOURCE_NAME` environment variable, if
    ///    present and not empty, or fall back to the window title.  Set the
    ///    [GLFW_X11_CLASS_NAME][#GLFW_X11_CLASS_NAME] and
    ///    [GLFW_X11_INSTANCE_NAME][#GLFW_X11_INSTANCE_NAME] window hints to
    ///    override this.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwDestroyWindow(MemorySegment) glfwDestroyWindow
    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwCreateWindow(@CType("int") int width, @CType("int") int height, @CType("const char*") java.lang.String title, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("GLFWwindow*") java.lang.foreign.MemorySegment share) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) MH_glfwCreateWindow.invokeExact(width, height, Marshal.marshal(__overrungl_stack, title), monitor, share);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindow", e); }
    }

    ///Destroys the specified window and its context.
    ///
    ///This function destroys the specified window and its context.  On calling
    ///this function, no further callbacks will be called for that window.
    ///
    ///If the context of the specified window is current on the main thread, it is
    ///detached before being destroyed.
    ///
    ///@param window The window to destroy.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.note The context of the specified window must not be current on any other
    ///thread when this function is called.
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment) glfwCreateWindow
    public static void glfwDestroyWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwDestroyWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyWindow", e); }
    }

    ///Checks the close flag of the specified window.
    ///
    ///This function returns the value of the close flag of the specified window.
    ///
    ///@param window The window to query.
    ///@return The value of the close flag.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    public static @CType("int") boolean glfwWindowShouldClose(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (int) MH_glfwWindowShouldClose.invokeExact(window) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwWindowShouldClose", e); }
    }

    ///Sets the close flag of the specified window.
    ///
    ///This function sets the value of the close flag of the specified window.
    ///This can be used to override the user's attempt to close the window, or
    ///to signal that it should be closed.
    ///
    ///@param window The window whose flag to change.
    ///@param value The new value.
    ///
    ///@errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    public static void glfwSetWindowShouldClose(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") boolean value) {
        try {
            MH_glfwSetWindowShouldClose.invokeExact(window, value ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowShouldClose", e); }
    }

    ///Returns the title of the specified window.
    ///
    ///This function returns the window title, encoded as UTF-8, of the specified
    ///window.  This is the title set previously by [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)]
    ///or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].
    ///
    ///@param window The window to query.
    ///@return The UTF-8 encoded window title, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark The returned title is currently a copy of the title last set by
    ///[glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)] or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].  It does not include any
    ///additional text which may be appended by the platform or another program.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the next call to
    ///`glfwGetWindowTitle` or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)], or until the library is
    ///terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowTitle(MemorySegment, MemorySegment) glfwSetWindowTitle
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWindowTitle_(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetWindowTitle.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    ///Returns the title of the specified window.
    ///
    ///This function returns the window title, encoded as UTF-8, of the specified
    ///window.  This is the title set previously by [glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)]
    ///or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].
    ///
    ///@param window The window to query.
    ///@return The UTF-8 encoded window title, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark The returned title is currently a copy of the title last set by
    ///[glfwCreateWindow][#glfwCreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment)] or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)].  It does not include any
    ///additional text which may be appended by the platform or another program.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the next call to
    ///`glfwGetWindowTitle` or [glfwSetWindowTitle][#glfwSetWindowTitle(MemorySegment, MemorySegment)], or until the library is
    ///terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowTitle(MemorySegment, MemorySegment) glfwSetWindowTitle
    public static @CType("const char*") java.lang.String glfwGetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) MH_glfwGetWindowTitle.invokeExact(window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowTitle", e); }
    }

    ///Sets the title of the specified window.
    ///
    ///This function sets the window title, encoded as UTF-8, of the specified
    ///window.
    ///
    ///@param window The window whose title to change.
    ///@param title The UTF-8 encoded window title.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __macOS:__ The window title will not be updated until the next time you
    ///process events.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowTitle(MemorySegment) glfwGetWindowTitle
    public static void glfwSetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.foreign.MemorySegment title) {
        try {
            MH_glfwSetWindowTitle.invokeExact(window, title);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    ///Sets the title of the specified window.
    ///
    ///This function sets the window title, encoded as UTF-8, of the specified
    ///window.
    ///
    ///@param window The window whose title to change.
    ///@param title The UTF-8 encoded window title.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __macOS:__ The window title will not be updated until the next time you
    ///process events.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowTitle(MemorySegment) glfwGetWindowTitle
    public static void glfwSetWindowTitle(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.String title) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            MH_glfwSetWindowTitle.invokeExact(window, Marshal.marshal(__overrungl_stack, title));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowTitle", e); }
    }

    ///Sets the icon for the specified window.
    ///
    ///This function sets the icon of the specified window.  If passed an array of
    ///candidate images, those of or closest to the sizes desired by the system are
    ///selected.  If no images are specified, the window reverts to its default
    ///icon.
    ///
    ///The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
    ///bits per channel with the red channel first.  They are arranged canonically
    ///as packed sequential rows, starting from the top-left corner.
    ///
    ///The desired image sizes varies depending on platform and system settings.
    ///The selected images will be rescaled as needed.  Good sizes include 16x16,
    ///32x32 and 48x48.
    ///
    ///@param window The window whose icon to set.
    ///@param count The number of images in the specified array, or zero to
    ///revert to the default window icon.
    ///@param images The images to create the icon from.  This is ignored if
    ///count is zero.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.pointer_lifetime The specified image data is copied before this function
    ///returns.
    ///
    ///@glfw.remark
    ///- __macOS:__ Regular windows do not have icons on macOS.  This function
    ///    will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].  The dock icon will be the same as
    ///    the application bundle's icon.  For more information on bundles, see the
    ///    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.
    ///- __Wayland:__ There is no existing protocol to change an icon, the
    ///    window will thus inherit the one defined in the application's desktop file.
    ///    This function will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetWindowIcon(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") java.lang.foreign.MemorySegment images) {
        try {
            MH_glfwSetWindowIcon.invokeExact(window, count, images);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    ///Sets the icon for the specified window.
    ///
    ///This function sets the icon of the specified window.  If passed an array of
    ///candidate images, those of or closest to the sizes desired by the system are
    ///selected.  If no images are specified, the window reverts to its default
    ///icon.
    ///
    ///The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
    ///bits per channel with the red channel first.  They are arranged canonically
    ///as packed sequential rows, starting from the top-left corner.
    ///
    ///The desired image sizes varies depending on platform and system settings.
    ///The selected images will be rescaled as needed.  Good sizes include 16x16,
    ///32x32 and 48x48.
    ///
    ///@param window The window whose icon to set.
    ///@param count The number of images in the specified array, or zero to
    ///revert to the default window icon.
    ///@param images The images to create the icon from.  This is ignored if
    ///count is zero.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.pointer_lifetime The specified image data is copied before this function
    ///returns.
    ///
    ///@glfw.remark
    ///- __macOS:__ Regular windows do not have icons on macOS.  This function
    ///    will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].  The dock icon will be the same as
    ///    the application bundle's icon.  For more information on bundles, see the
    ///    [Bundle Programming Guide](https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/) in the Mac Developer Library.
    ///- __Wayland:__ There is no existing protocol to change an icon, the
    ///    window will thus inherit the one defined in the application's desktop file.
    ///    This function will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetWindowIcon(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int count, @CType("const GLFWimage*") overrungl.glfw.GLFWImage images) {
        try {
            MH_glfwSetWindowIcon.invokeExact(window, count, Marshal.marshal(images));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIcon", e); }
    }

    ///Retrieves the position of the content area of the specified window.
    ///
    ///This function retrieves the position, in screen coordinates, of the
    ///upper-left corner of the content area of the specified window.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param window The window to query.
    ///@param xpos Where to store the x-coordinate of the upper-left corner of
    ///the content area, or `NULL`.
    ///@param ypos Where to store the y-coordinate of the upper-left corner of
    ///the content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ There is no way for an application to retrieve the global
    ///position of its windows.  This function will emit
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowPos(MemorySegment, int, int) glfwSetWindowPos
    public static void glfwGetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment xpos, @Out @CType("int*") java.lang.foreign.MemorySegment ypos) {
        try {
            MH_glfwGetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    ///Retrieves the position of the content area of the specified window.
    ///
    ///This function retrieves the position, in screen coordinates, of the
    ///upper-left corner of the content area of the specified window.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param window The window to query.
    ///@param xpos Where to store the x-coordinate of the upper-left corner of
    ///the content area, or `NULL`.
    ///@param ypos Where to store the y-coordinate of the upper-left corner of
    ///the content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ There is no way for an application to retrieve the global
    ///position of its windows.  This function will emit
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowPos(MemorySegment, int, int) glfwSetWindowPos
    public static void glfwGetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] xpos, @Out @CType("int*") int[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            MH_glfwGetWindowPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowPos", e); }
    }

    ///Sets the position of the content area of the specified window.
    ///
    ///This function sets the position, in screen coordinates, of the upper-left
    ///corner of the content area of the specified windowed mode window.  If the
    ///window is a full screen window, this function does nothing.
    ///
    ///__Do not use this function__ to move an already visible window unless you
    ///have very good reasons for doing so, as it will confuse and annoy the user.
    ///
    ///The window manager may put limits on what positions are allowed.  GLFW
    ///cannot and should not override these limits.
    ///
    ///@param window The window to query.
    ///@param xpos The x-coordinate of the upper-left corner of the content area.
    ///@param ypos The y-coordinate of the upper-left corner of the content area.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ There is no way for an application to set the global
    ///position of its windows.  This function will emit
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowPos(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowPos
    public static void glfwSetWindowPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int xpos, @CType("int") int ypos) {
        try {
            MH_glfwSetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPos", e); }
    }

    ///Retrieves the size of the content area of the specified window.
    ///
    ///This function retrieves the size, in screen coordinates, of the content area
    ///of the specified window.  If you wish to retrieve the size of the
    ///framebuffer of the window in pixels, see [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose size to retrieve.
    ///@param width Where to store the width, in screen coordinates, of the
    ///content area, or `NULL`.
    ///@param height Where to store the height, in screen coordinates, of the
    ///content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowSize(MemorySegment, int, int) glfwSetWindowSize
    public static void glfwGetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            MH_glfwGetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    ///Retrieves the size of the content area of the specified window.
    ///
    ///This function retrieves the size, in screen coordinates, of the content area
    ///of the specified window.  If you wish to retrieve the size of the
    ///framebuffer of the window in pixels, see [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose size to retrieve.
    ///@param width Where to store the width, in screen coordinates, of the
    ///content area, or `NULL`.
    ///@param height Where to store the height, in screen coordinates, of the
    ///content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowSize(MemorySegment, int, int) glfwSetWindowSize
    public static void glfwGetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            MH_glfwGetWindowSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowSize", e); }
    }

    ///Sets the size limits of the specified window.
    ///
    ///This function sets the size limits of the content area of the specified
    ///window.  If the window is full screen, the size limits only take effect
    ///once it is made windowed.  If the window is not resizable, this function
    ///does nothing.
    ///
    ///The size limits are applied immediately to a windowed mode window and may
    ///cause it to be resized.
    ///
    ///The maximum dimensions must be greater than or equal to the minimum
    ///dimensions and all must be greater than or equal to zero.
    ///
    ///@param window The window to set limits for.
    ///@param minwidth The minimum width, in screen coordinates, of the content
    ///area, or `GLFW_DONT_CARE`.
    ///@param minheight The minimum height, in screen coordinates, of the
    ///content area, or `GLFW_DONT_CARE`.
    ///@param maxwidth The maximum width, in screen coordinates, of the content
    ///area, or `GLFW_DONT_CARE`.
    ///@param maxheight The maximum height, in screen coordinates, of the
    ///content area, or `GLFW_DONT_CARE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark If you set size limits and an aspect ratio that conflict, the
    ///results are undefined.
    ///- __Wayland:__ The size limits will not be applied until the window is
    ///actually resized, either by the user or by the compositor.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowAspectRatio(MemorySegment, int, int) glfwSetWindowAspectRatio
    public static void glfwSetWindowSizeLimits(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int minwidth, @CType("int") int minheight, @CType("int") int maxwidth, @CType("int") int maxheight) {
        try {
            MH_glfwSetWindowSizeLimits.invokeExact(window, minwidth, minheight, maxwidth, maxheight);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeLimits", e); }
    }

    ///Sets the aspect ratio of the specified window.
    ///
    ///This function sets the required aspect ratio of the content area of the
    ///specified window.  If the window is full screen, the aspect ratio only takes
    ///effect once it is made windowed.  If the window is not resizable, this
    ///function does nothing.
    ///
    ///The aspect ratio is specified as a numerator and a denominator and both
    ///values must be greater than zero.  For example, the common 16:9 aspect ratio
    ///is specified as 16 and 9, respectively.
    ///
    ///If the numerator and denominator is set to `GLFW_DONT_CARE` then the aspect
    ///ratio limit is disabled.
    ///
    ///The aspect ratio is applied immediately to a windowed mode window and may
    ///cause it to be resized.
    ///
    ///@param window The window to set limits for.
    ///@param numer The numerator of the desired aspect ratio, or
    ///`GLFW_DONT_CARE`.
    ///@param denom The denominator of the desired aspect ratio, or
    ///`GLFW_DONT_CARE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark If you set size limits and an aspect ratio that conflict, the
    ///results are undefined.
    ///- __Wayland:__ The aspect ratio will not be applied until the window is
    ///actually resized, either by the user or by the compositor.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowSizeLimits(MemorySegment, int, int, int, int) glfwSetWindowSizeLimits
    public static void glfwSetWindowAspectRatio(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int numer, @CType("int") int denom) {
        try {
            MH_glfwSetWindowAspectRatio.invokeExact(window, numer, denom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAspectRatio", e); }
    }

    ///Sets the size of the content area of the specified window.
    ///
    ///This function sets the size, in screen coordinates, of the content area of
    ///the specified window.
    ///
    ///For full screen windows, this function updates the resolution of its desired
    ///video mode and switches to the video mode closest to it, without affecting
    ///the window's context.  As the context is unaffected, the bit depths of the
    ///framebuffer remain unchanged.
    ///TODO
    ///If you wish to update the refresh rate of the desired video mode in addition
    ///to its resolution, see [glfwSetWindowMonitor][#glfwSetWindowMonitor()].
    ///
    ///The window manager may put limits on what sizes are allowed.  GLFW cannot
    ///and should not override these limits.
    ///
    ///@param window The window to resize.
    ///@param width The desired width, in screen coordinates, of the window
    ///content area.
    ///@param height The desired height, in screen coordinates, of the window
    ///content area.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///TODO
    ///@see #glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowSize
    ///@see #glfwSetWindowMonitor() glfwSetWindowMonitor
    public static void glfwSetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int width, @CType("int") int height) {
        try {
            MH_glfwSetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSize", e); }
    }

    ///Retrieves the size of the framebuffer of the specified window.
    ///
    ///This function retrieves the size, in pixels, of the framebuffer of the
    ///specified window.  If you wish to retrieve the size of the window in screen
    ///coordinates, see [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose framebuffer to query.
    ///@param width Where to store the width, in pixels, of the framebuffer,
    ///or `NULL`.
    ///@param height Where to store the height, in pixels, of the framebuffer,
    ///or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetFramebufferSizeCallback(MemorySegment, MemorySegment) glfwSetFramebufferSizeCallback
    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height) {
        try {
            MH_glfwGetFramebufferSize.invokeExact(window, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    ///Retrieves the size of the framebuffer of the specified window.
    ///
    ///This function retrieves the size, in pixels, of the framebuffer of the
    ///specified window.  If you wish to retrieve the size of the window in screen
    ///coordinates, see [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose framebuffer to query.
    ///@param width Where to store the width, in pixels, of the framebuffer,
    ///or `NULL`.
    ///@param height Where to store the height, in pixels, of the framebuffer,
    ///or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetFramebufferSizeCallback(MemorySegment, MemorySegment) glfwSetFramebufferSizeCallback
    public static void glfwGetFramebufferSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            MH_glfwGetFramebufferSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetFramebufferSize", e); }
    }

    ///Retrieves the size of the frame of the window.
    ///
    ///This function retrieves the size, in screen coordinates, of each edge of the
    ///frame of the specified window.  This size includes the title bar, if the
    ///window has one.  The size of the frame may vary depending on the
    ///window-related hints used to create it.
    ///
    ///Because this function retrieves the size of each window frame edge and not
    ///the offset along a particular coordinate axis, the retrieved values will
    ///always be zero or positive.
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose frame size to query.
    ///@param left Where to store the size, in screen coordinates, of the left
    ///edge of the window frame, or `NULL`.
    ///@param top Where to store the size, in screen coordinates, of the top
    ///edge of the window frame, or `NULL`.
    ///@param right Where to store the size, in screen coordinates, of the
    ///right edge of the window frame, or `NULL`.
    ///@param bottom Where to store the size, in screen coordinates, of the
    ///bottom edge of the window frame, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment left, @Out @CType("int*") java.lang.foreign.MemorySegment top, @Out @CType("int*") java.lang.foreign.MemorySegment right, @Out @CType("int*") java.lang.foreign.MemorySegment bottom) {
        try {
            MH_glfwGetWindowFrameSize.invokeExact(window, left, top, right, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    ///Retrieves the size of the frame of the window.
    ///
    ///This function retrieves the size, in screen coordinates, of each edge of the
    ///frame of the specified window.  This size includes the title bar, if the
    ///window has one.  The size of the frame may vary depending on the
    ///window-related hints used to create it.
    ///
    ///Because this function retrieves the size of each window frame edge and not
    ///the offset along a particular coordinate axis, the retrieved values will
    ///always be zero or positive.
    ///
    ///Any or all of the size arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` size arguments will be set to zero.
    ///
    ///@param window The window whose frame size to query.
    ///@param left Where to store the size, in screen coordinates, of the left
    ///edge of the window frame, or `NULL`.
    ///@param top Where to store the size, in screen coordinates, of the top
    ///edge of the window frame, or `NULL`.
    ///@param right Where to store the size, in screen coordinates, of the
    ///right edge of the window frame, or `NULL`.
    ///@param bottom Where to store the size, in screen coordinates, of the
    ///bottom edge of the window frame, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwGetWindowFrameSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") int[] left, @Out @CType("int*") int[] top, @Out @CType("int*") int[] right, @Out @CType("int*") int[] bottom) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_left = Marshal.marshal(__overrungl_stack, left);
            var __overrungl_ref_top = Marshal.marshal(__overrungl_stack, top);
            var __overrungl_ref_right = Marshal.marshal(__overrungl_stack, right);
            var __overrungl_ref_bottom = Marshal.marshal(__overrungl_stack, bottom);
            MH_glfwGetWindowFrameSize.invokeExact(window, __overrungl_ref_left, __overrungl_ref_top, __overrungl_ref_right, __overrungl_ref_bottom);
            Unmarshal.copy(__overrungl_ref_left, left);
            Unmarshal.copy(__overrungl_ref_top, top);
            Unmarshal.copy(__overrungl_ref_right, right);
            Unmarshal.copy(__overrungl_ref_bottom, bottom);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowFrameSize", e); }
    }

    ///Retrieves the content scale for the specified window.
    ///
    ///This function retrieves the content scale for the specified window.  The
    ///content scale is the ratio between the current DPI and the platform's
    ///default DPI.  This is especially important for text and any UI elements.  If
    ///the pixel dimensions of your UI scaled by this look appropriate on your
    ///machine then it should appear at a reasonable size on other machines
    ///regardless of their DPI and scaling settings.  This relies on the system DPI
    ///and scaling settings being somewhat correct.
    ///
    ///On platforms where each monitors can have its own content scale, the window
    ///content scale will depend on which monitor the system considers the window
    ///to be on.
    ///
    ///@param window The window to query.
    ///@param xscale Where to store the x-axis content scale, or `NULL`.
    ///@param yscale Where to store the y-axis content scale, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowContentScaleCallback(MemorySegment, MemorySegment) glfwSetWindowContentScaleCallback
    ///@see #glfwGetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetMonitorContentScale
    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("float*") java.lang.foreign.MemorySegment xscale, @Out @CType("float*") java.lang.foreign.MemorySegment yscale) {
        try {
            MH_glfwGetWindowContentScale.invokeExact(window, xscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    ///Retrieves the content scale for the specified window.
    ///
    ///This function retrieves the content scale for the specified window.  The
    ///content scale is the ratio between the current DPI and the platform's
    ///default DPI.  This is especially important for text and any UI elements.  If
    ///the pixel dimensions of your UI scaled by this look appropriate on your
    ///machine then it should appear at a reasonable size on other machines
    ///regardless of their DPI and scaling settings.  This relies on the system DPI
    ///and scaling settings being somewhat correct.
    ///
    ///On platforms where each monitors can have its own content scale, the window
    ///content scale will depend on which monitor the system considers the window
    ///to be on.
    ///
    ///@param window The window to query.
    ///@param xscale Where to store the x-axis content scale, or `NULL`.
    ///@param yscale Where to store the y-axis content scale, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowContentScaleCallback(MemorySegment, MemorySegment) glfwSetWindowContentScaleCallback
    ///@see #glfwGetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) glfwGetMonitorContentScale
    public static void glfwGetWindowContentScale(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("float*") float[] xscale, @Out @CType("float*") float[] yscale) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xscale = Marshal.marshal(__overrungl_stack, xscale);
            var __overrungl_ref_yscale = Marshal.marshal(__overrungl_stack, yscale);
            MH_glfwGetWindowContentScale.invokeExact(window, __overrungl_ref_xscale, __overrungl_ref_yscale);
            Unmarshal.copy(__overrungl_ref_xscale, xscale);
            Unmarshal.copy(__overrungl_ref_yscale, yscale);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowContentScale", e); }
    }

    ///Returns the opacity of the whole window.
    ///
    ///This function returns the opacity of the window, including any decorations.
    ///
    ///The opacity (or alpha) value is a positive finite number between zero and
    ///one, where zero is fully transparent and one is fully opaque.  If the system
    ///does not support whole window transparency, this function always returns one.
    ///
    ///The initial opacity value for newly created windows is one.
    ///
    ///@param window The window to query.
    ///@return The opacity value of the specified window.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowOpacity(MemorySegment, float) glfwSetWindowOpacity
    public static @CType("float") float glfwGetWindowOpacity(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (float) MH_glfwGetWindowOpacity.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowOpacity", e); }
    }

    ///Sets the opacity of the whole window.
    ///
    ///This function sets the opacity of the window, including any decorations.
    ///
    ///The opacity (or alpha) value is a positive finite number between zero and
    ///one, where zero is fully transparent and one is fully opaque.
    ///
    ///The initial opacity value for newly created windows is one.
    ///
    ///A window created with framebuffer transparency may not use whole window
    ///transparency.  The results of doing this are undefined.
    ///
    ///@param window The window to set the opacity for.
    ///@param opacity The desired opacity of the specified window.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark __Wayland:__ There is no way to set an opacity factor for a window.
    ///This function will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowOpacity(MemorySegment) glfwGetWindowOpacity
    public static void glfwSetWindowOpacity(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("float") float opacity) {
        try {
            MH_glfwSetWindowOpacity.invokeExact(window, opacity);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowOpacity", e); }
    }

    ///Iconifies the specified window.
    ///
    ///This function iconifies (minimizes) the specified window if it was
    ///previously restored.  If the window is already iconified, this function does
    ///nothing.
    ///
    ///If the specified window is a full screen window, GLFW restores the original
    ///video mode of the monitor.  The window's desired video mode is set again
    ///when the window is restored.
    ///
    ///@param window The window to iconify.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Wayland:__ Once a window is iconified, [glfwRestoreWindow][#glfwRestoreWindow(MemorySegment)] won't
    ///be able to restore it.  This is a design decision of the xdg-shell
    ///protocol.
    ///
    ///@thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwRestoreWindow(MemorySegment) glfwRestoreWindow
    ///@see #glfwMaximizeWindow(MemorySegment) glfwMaximizeWindow
    public static void glfwIconifyWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwIconifyWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwIconifyWindow", e); }
    }

    ///Restores the specified window.
    ///
    ///This function restores the specified window if it was previously iconified
    ///(minimized) or maximized.  If the window is already restored, this function
    ///does nothing.
    ///
    ///If the specified window is an iconified full screen window, its desired
    ///video mode is set again for its monitor when the window is restored.
    ///
    ///@param window The window to restore.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwIconifyWindow(MemorySegment) glfwIconifyWindow
    ///@see #glfwMaximizeWindow(MemorySegment) glfwMaximizeWindow
    public static void glfwRestoreWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwRestoreWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRestoreWindow", e); }
    }

    ///Maximizes the specified window.
    ///
    ///This function maximizes the specified window if it was previously not
    ///maximized.  If the window is already maximized, this function does nothing.
    ///
    ///If the specified window is a full screen window, this function does nothing.
    ///
    ///@param window The window to maximize.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function may only be called from the main thread.
    ///
    ///@see #glfwIconifyWindow(MemorySegment) glfwIconifyWindow
    ///@see #glfwRestoreWindow(MemorySegment) glfwRestoreWindow
    public static void glfwMaximizeWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwMaximizeWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMaximizeWindow", e); }
    }

    ///Makes the specified window visible.
    ///
    ///This function makes the specified window visible if it was previously
    ///hidden.  If the window is already visible or is in full screen mode, this
    ///function does nothing.
    ///
    ///By default, windowed mode windows are focused when shown
    ///Set the [GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW] window hint
    ///to change this behavior for all newly created windows, or change the
    ///behavior for an existing window with [glfwSetWindowAttrib][#glfwSetWindowAttrib()].
    ///TODO
    ///@param window The window to make visible.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Wayland:__ Because Wayland wants every frame of the desktop to be
    ///complete, this function does not immediately make the window visible.
    ///Instead it will become visible the next time the window framebuffer is
    ///updated after this call.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwHideWindow(MemorySegment) glfwHideWindow
    public static void glfwShowWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwShowWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwShowWindow", e); }
    }

    ///Hides the specified window.
    ///
    ///This function hides the specified window if it was previously visible.  If
    ///the window is already hidden or is in full screen mode, this function does
    ///nothing.
    ///
    ///@param window The window to hide.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwShowWindow(MemorySegment) glfwShowWindow
    public static void glfwHideWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwHideWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwHideWindow", e); }
    }

    ///Brings the specified window to front and sets input focus.
    ///
    ///This function brings the specified window to front and sets input focus.
    ///The window should already be visible and not iconified.
    ///
    ///By default, both windowed and full screen mode windows are focused when
    ///initially created.  Set the [GLFW_FOCUSED][#GLFW_FOCUSED] to
    ///disable this behavior.
    ///
    ///Also by default, windowed mode windows are focused when shown
    ///with [glfwShowWindow][#glfwShowWindow(MemorySegment)]. Set the
    ///[GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW] to disable this behavior.
    ///
    ///__Do not use this function__ to steal focus from other applications unless
    ///you are certain that is what the user wants.  Focus stealing can be
    ///extremely disruptive.
    ///
    ///For a less disruptive way of getting the user's attention, see
    ///attention requests.
    ///
    ///@param window The window to give input focus.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Wayland:__ The compositor will likely ignore focus requests unless
    ///another window created by the same application already has input focus.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwFocusWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwFocusWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwFocusWindow", e); }
    }

    ///Requests user attention to the specified window.
    ///
    ///This function requests user attention to the specified window.  On
    ///platforms where this is not supported, attention is requested to the
    ///application as a whole.
    ///
    ///Once the user has given attention, usually by focusing the window or
    ///application, the system will end the request automatically.
    ///
    ///@param window The window to request attention to.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __macOS:__ Attention is requested to the application as a whole, not the
    ///specific window.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwRequestWindowAttention(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            MH_glfwRequestWindowAttention.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwRequestWindowAttention", e); }
    }

    ///Returns the monitor that the window uses for full screen mode.
    ///
    ///This function returns the handle of the monitor that the specified window is
    ///in full screen on.
    ///
    ///@param window The window to query.
    ///@return The monitor, or `NULL` if the window is in windowed mode or an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) glfwSetWindowMonitor
    public static @CType("GLFWmonitor*") java.lang.foreign.MemorySegment glfwGetWindowMonitor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetWindowMonitor.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowMonitor", e); }
    }

    ///Sets the mode, monitor, video mode and placement of a window.
    ///
    ///This function sets the monitor that the window uses for full screen mode or,
    ///if the monitor is `NULL`, makes it windowed mode.
    ///
    ///When setting a monitor, this function updates the width, height and refresh
    ///rate of the desired video mode and switches to the video mode closest to it.
    ///The window position is ignored when setting a monitor.
    ///
    ///When the monitor is `NULL`, the position, width and height are used to
    ///place the window content area.  The refresh rate is ignored when no monitor
    ///is specified.
    ///
    ///If you only wish to update the resolution of a full screen window or the
    ///size of a windowed mode window, see [glfwSetWindowSize][#glfwSetWindowSize(MemorySegment, int, int)].
    ///
    ///When a window transitions from full screen to windowed mode, this function
    ///restores any previous window settings such as whether it is decorated,
    ///floating, resizable, has size or aspect ratio limits, etc.
    ///
    ///@param window The window whose monitor, size or video mode to set.
    ///@param monitor The desired monitor, or `NULL` to set windowed mode.
    ///@param xpos The desired x-coordinate of the upper-left corner of the
    ///content area.
    ///@param ypos The desired y-coordinate of the upper-left corner of the
    ///content area.
    ///@param width The desired with, in screen coordinates, of the content
    ///area or video mode.
    ///@param height The desired height, in screen coordinates, of the content
    ///area or video mode.
    ///@param refreshRate The desired refresh rate, in Hz, of the video mode,
    ///or `GLFW_DONT_CARE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark The OpenGL or OpenGL ES context will not be destroyed or otherwise
    ///affected by any resizing or mode switching, although you may need to update
    ///your viewport if the framebuffer size has changed.
    ///- __Wayland:__ The desired window position is ignored, as there is no way
    ///    for an application to set this property.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetWindowMonitor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor, @CType("int") int xpos, @CType("int") int ypos, @CType("int") int width, @CType("int") int height, @CType("int") int refreshRate) {
        try {
            MH_glfwSetWindowMonitor.invokeExact(window, monitor, xpos, ypos, width, height, refreshRate);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMonitor", e); }
    }

    ///Returns an attribute of the specified window.
    ///
    ///This function returns the value of an attribute of the specified window or
    ///its OpenGL or OpenGL ES context.
    ///
    ///@param window The window to query.
    ///@param attrib The window attribute whose value to
    ///return.
    ///@return The value of the attribute, or zero if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark Framebuffer related hints are not window attributes.  See
    ///window_attribs_fb for more information.
    ///
    ///Zero is a valid value for many window and context related
    ///attributes so you cannot use a return value of zero as an indication of
    ///errors.  However, this function should not fail as long as it is passed
    ///valid arguments and the library has been initialized.
    ///- __Wayland:__ The Wayland protocol provides no way to check whether a
    ///window is iconfied, so [GLFW_ICONIFIED][#GLFW_ICONIFIED] always returns `GLFW_FALSE`.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetWindowAttrib(MemorySegment, int, int) glfwSetWindowAttrib
    public static @CType("int") int glfwGetWindowAttrib(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int attrib) {
        try {
            return (int) MH_glfwGetWindowAttrib.invokeExact(window, attrib);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowAttrib", e); }
    }

    ///Sets an attribute of the specified window.
    ///
    ///This function sets the value of an attribute of the specified window.
    ///
    ///The supported attributes are [GLFW_DECORATED][#GLFW_DECORATED],
    ///[GLFW_RESIZABLE][#GLFW_RESIZABLE],
    ///[GLFW_FLOATING][#GLFW_FLOATING],
    ///[GLFW_AUTO_ICONIFY][#GLFW_AUTO_ICONIFY] and
    ///[GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW].
    ///[GLFW_MOUSE_PASSTHROUGH][#GLFW_MOUSE_PASSTHROUGH]
    ///
    ///Some of these attributes are ignored for full screen windows.  The new
    ///value will take effect if the window is later made windowed.
    ///
    ///Some of these attributes are ignored for windowed mode windows.  The new
    ///value will take effect if the window is later made full screen.
    ///
    ///@param window The window to set the attribute for.
    ///@param attrib A supported window attribute.
    ///@param value `GLFW_TRUE` or `GLFW_FALSE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark Calling glfwGetWindowAttrib will always return the latest
    ///value, even if that value is ignored by the current mode of the window.
    ///- __Wayland:__ The [GLFW_FLOATING][#GLFW_FLOATING] window attribute is
    ///not supported.  Setting this will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetWindowAttrib(MemorySegment, int) glfwGetWindowAttrib
    public static void glfwSetWindowAttrib(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int attrib, @CType("int") int value) {
        try {
            MH_glfwSetWindowAttrib.invokeExact(window, attrib, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowAttrib", e); }
    }

    ///Sets the user pointer of the specified window.
    ///
    ///This function sets the user-defined pointer of the specified window.  The
    ///current value is retained until the window is destroyed.  The initial value
    ///is `NULL`.
    ///
    ///@param window The window whose pointer to set.
    ///@param pointer The new value.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwGetWindowUserPointer(MemorySegment) glfwGetWindowUserPointer
    public static void glfwSetWindowUserPointer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            MH_glfwSetWindowUserPointer.invokeExact(window, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowUserPointer", e); }
    }

    ///Returns the user pointer of the specified window.
    ///
    ///This function returns the current value of the user-defined pointer of the
    ///specified window.  The initial value is `NULL`.
    ///
    ///@param window The window whose pointer to return.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwSetWindowUserPointer(MemorySegment, MemorySegment) glfwSetWindowUserPointer
    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetWindowUserPointer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetWindowUserPointer.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWindowUserPointer", e); }
    }

    ///Sets the position callback for the specified window.
    ///
    ///This function sets the position callback of the specified window, which is
    ///called when the window is moved.  The callback is provided with the
    ///position, in screen coordinates, of the upper-left corner of the content
    ///area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowPosFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __Wayland:__ This callback will never be called, as there is no way for
    ///an application to know its global position.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowPosCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowPosCallback", e); }
    }

    ///Sets the position callback for the specified window.
    ///
    ///This function sets the position callback of the specified window, which is
    ///called when the window is moved.  The callback is provided with the
    ///position, in screen coordinates, of the upper-left corner of the content
    ///area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowPosFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __Wayland:__ This callback will never be called, as there is no way for
    ///an application to know its global position.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowposfun") java.lang.foreign.MemorySegment glfwSetWindowPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowposfun") overrungl.glfw.GLFWWindowPosFun callback) {
        return glfwSetWindowPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the size callback for the specified window.
    ///
    ///This function sets the size callback of the specified window, which is
    ///called when the window is resized.  The callback is provided with the size,
    ///in screen coordinates, of the content area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowSizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowSizeCallback", e); }
    }

    ///Sets the size callback for the specified window.
    ///
    ///This function sets the size callback of the specified window, which is
    ///called when the window is resized.  The callback is provided with the size,
    ///in screen coordinates, of the content area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowSizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowsizefun") java.lang.foreign.MemorySegment glfwSetWindowSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowsizefun") overrungl.glfw.GLFWWindowSizeFun callback) {
        return glfwSetWindowSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the close callback for the specified window.
    ///
    ///This function sets the close callback of the specified window, which is
    ///called when the user attempts to close the window, for example by clicking
    ///the close widget in the title bar.
    ///
    ///The close flag is set before this callback is called, but you can modify it
    ///at any time with [glfwSetWindowShouldClose][#glfwSetWindowShouldClose(MemorySegment, boolean)].
    ///
    ///The close callback is not triggered by [glfwDestroyWindow][#glfwDestroyWindow(MemorySegment)].
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowCloseFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __macOS:__ Selecting Quit from the application menu will trigger the
    ///close callback for all windows.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowCloseCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowCloseCallback", e); }
    }

    ///Sets the close callback for the specified window.
    ///
    ///This function sets the close callback of the specified window, which is
    ///called when the user attempts to close the window, for example by clicking
    ///the close widget in the title bar.
    ///
    ///The close flag is set before this callback is called, but you can modify it
    ///at any time with [glfwSetWindowShouldClose][#glfwSetWindowShouldClose(MemorySegment, boolean)].
    ///
    ///The close callback is not triggered by [glfwDestroyWindow][#glfwDestroyWindow(MemorySegment)].
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowCloseFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.remark __macOS:__ Selecting Quit from the application menu will trigger the
    ///close callback for all windows.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowclosefun") java.lang.foreign.MemorySegment glfwSetWindowCloseCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowclosefun") overrungl.glfw.GLFWWindowCloseFun callback) {
        return glfwSetWindowCloseCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the refresh callback for the specified window.
    ///
    ///This function sets the refresh callback of the specified window, which is
    ///called when the content area of the window needs to be redrawn, for example
    ///if the window has been exposed after having been covered by another window.
    ///
    ///On compositing window systems such as Aero, Compiz, Aqua or Wayland, where
    ///the window contents are saved off-screen, this callback may be called only
    ///very infrequently or never at all.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowRefreshFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowRefreshCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowRefreshCallback", e); }
    }

    ///Sets the refresh callback for the specified window.
    ///
    ///This function sets the refresh callback of the specified window, which is
    ///called when the content area of the window needs to be redrawn, for example
    ///if the window has been exposed after having been covered by another window.
    ///
    ///On compositing window systems such as Aero, Compiz, Aqua or Wayland, where
    ///the window contents are saved off-screen, this callback may be called only
    ///very infrequently or never at all.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowRefreshFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowrefreshfun") java.lang.foreign.MemorySegment glfwSetWindowRefreshCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowrefreshfun") overrungl.glfw.GLFWWindowRefreshFun callback) {
        return glfwSetWindowRefreshCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the focus callback for the specified window.
    ///
    ///This function sets the focus callback of the specified window, which is
    ///called when the window gains or loses input focus.
    ///
    ///After the focus callback is called for a window that lost input focus,
    ///synthetic key and mouse button release events will be generated for all such
    ///that had been pressed.  For more information, see [glfwSetKeyCallback][#glfwSetKeyCallback(MemorySegment, MemorySegment)]
    ///and [glfwSetMouseButtonCallback][#glfwSetMouseButtonCallback(MemorySegment, MemorySegment)].
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowFocusFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowFocusCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowFocusCallback", e); }
    }

    ///Sets the focus callback for the specified window.
    ///
    ///This function sets the focus callback of the specified window, which is
    ///called when the window gains or loses input focus.
    ///
    ///After the focus callback is called for a window that lost input focus,
    ///synthetic key and mouse button release events will be generated for all such
    ///that had been pressed.  For more information, see [glfwSetKeyCallback][#glfwSetKeyCallback(MemorySegment, MemorySegment)]
    ///and [glfwSetMouseButtonCallback][#glfwSetMouseButtonCallback(MemorySegment, MemorySegment)].
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowFocusFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowfocusfun") java.lang.foreign.MemorySegment glfwSetWindowFocusCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowfocusfun") overrungl.glfw.GLFWWindowFocusFun callback) {
        return glfwSetWindowFocusCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the iconify callback for the specified window.
    ///
    ///This function sets the iconification callback of the specified window, which
    ///is called when the window is iconified or restored.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowIconifyFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowIconifyCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowIconifyCallback", e); }
    }

    ///Sets the iconify callback for the specified window.
    ///
    ///This function sets the iconification callback of the specified window, which
    ///is called when the window is iconified or restored.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowIconifyFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowiconifyfun") java.lang.foreign.MemorySegment glfwSetWindowIconifyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowiconifyfun") overrungl.glfw.GLFWWindowIconifyFun callback) {
        return glfwSetWindowIconifyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the maximize callback for the specified window.
    ///
    ///This function sets the maximization callback of the specified window, which
    ///is called when the window is maximized or restored.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowMaximizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowMaximizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowMaximizeCallback", e); }
    }

    ///Sets the maximize callback for the specified window.
    ///
    ///This function sets the maximization callback of the specified window, which
    ///is called when the window is maximized or restored.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowMaximizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowmaximizefun") java.lang.foreign.MemorySegment glfwSetWindowMaximizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowmaximizefun") overrungl.glfw.GLFWWindowMaximizeFun callback) {
        return glfwSetWindowMaximizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the framebuffer resize callback for the specified window.
    ///
    ///This function sets the framebuffer resize callback of the specified window,
    ///which is called when the framebuffer of the specified window is resized.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWFramebufferSizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetFramebufferSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetFramebufferSizeCallback", e); }
    }

    ///Sets the framebuffer resize callback for the specified window.
    ///
    ///This function sets the framebuffer resize callback of the specified window,
    ///which is called when the framebuffer of the specified window is resized.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWFramebufferSizeFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWframebuffersizefun") java.lang.foreign.MemorySegment glfwSetFramebufferSizeCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWframebuffersizefun") overrungl.glfw.GLFWFramebufferSizeFun callback) {
        return glfwSetFramebufferSizeCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the window content scale callback for the specified window.
    ///
    ///This function sets the window content scale callback of the specified window,
    ///which is called when the content scale of the specified window changes.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowContentScaleFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwSetWindowContentScaleCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetWindowContentScaleCallback", e); }
    }

    ///Sets the window content scale callback for the specified window.
    ///
    ///This function sets the window content scale callback of the specified window,
    ///which is called when the content scale of the specified window changes.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWWindowContentScaleFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWwindowcontentscalefun") java.lang.foreign.MemorySegment glfwSetWindowContentScaleCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWwindowcontentscalefun") overrungl.glfw.GLFWWindowContentScaleFun callback) {
        return glfwSetWindowContentScaleCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Processes all pending events.
    ///
    ///This function processes only those events that are already in the event
    ///queue and then returns immediately.  Processing events will cause the window
    ///and input callbacks associated with those events to be called.
    ///
    ///On some platforms, a window move, resize or menu operation will cause event
    ///processing to block.  This is due to how event processing is designed on
    ///those platforms.  You can use the
    ///window refresh callback to redraw the contents of
    ///your window when necessary during such operations.
    ///
    ///Do not assume that callbacks you set will _only_ be called in response to
    ///event processing functions like this one.  While it is necessary to poll for
    ///events, window systems that require GLFW to register callbacks of its own
    ///can pass events to GLFW in response to many window system function calls.
    ///GLFW will pass those events on to the application callbacks before
    ///returning.
    ///
    ///Event processing is not required for joystick input to work.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwWaitEvents() glfwWaitEvents
    ///@see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
    public static void glfwPollEvents() {
        try {
            MH_glfwPollEvents.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwPollEvents", e); }
    }

    ///Waits until events are queued and processes them.
    ///
    ///This function puts the calling thread to sleep until at least one event is
    ///available in the event queue.  Once one or more events are available,
    ///it behaves exactly like [glfwPollEvents][#glfwPollEvents()], i.e. the events in the queue
    ///are processed and the function then returns immediately.  Processing events
    ///will cause the window and input callbacks associated with those events to be
    ///called.
    ///
    ///Since not all events are associated with callbacks, this function may return
    ///without a callback having been called even if you are monitoring all
    ///callbacks.
    ///
    ///On some platforms, a window move, resize or menu operation will cause event
    ///processing to block.  This is due to how event processing is designed on
    ///those platforms.  You can use the
    ///window refresh callback to redraw the contents of
    ///your window when necessary during such operations.
    ///
    ///Do not assume that callbacks you set will _only_ be called in response to
    ///event processing functions like this one.  While it is necessary to poll for
    ///events, window systems that require GLFW to register callbacks of its own
    ///can pass events to GLFW in response to many window system function calls.
    ///GLFW will pass those events on to the application callbacks before
    ///returning.
    ///
    ///Event processing is not required for joystick input to work.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwPollEvents() glfwPollEvents
    ///@see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
    public static void glfwWaitEvents() {
        try {
            MH_glfwWaitEvents.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEvents", e); }
    }

    ///Waits with timeout until events are queued and processes them.
    ///
    ///This function puts the calling thread to sleep until at least one event is
    ///available in the event queue, or until the specified timeout is reached.  If
    ///one or more events are available, it behaves exactly like
    ///[glfwPollEvents][#glfwPollEvents()], i.e. the events in the queue are processed and the function
    ///then returns immediately.  Processing events will cause the window and input
    ///callbacks associated with those events to be called.
    ///
    ///The timeout value must be a positive finite number.
    ///
    ///Since not all events are associated with callbacks, this function may return
    ///without a callback having been called even if you are monitoring all
    ///callbacks.
    ///
    ///On some platforms, a window move, resize or menu operation will cause event
    ///processing to block.  This is due to how event processing is designed on
    ///those platforms.  You can use the
    ///window refresh callback to redraw the contents of
    ///your window when necessary during such operations.
    ///
    ///Do not assume that callbacks you set will _only_ be called in response to
    ///event processing functions like this one.  While it is necessary to poll for
    ///events, window systems that require GLFW to register callbacks of its own
    ///can pass events to GLFW in response to many window system function calls.
    ///GLFW will pass those events on to the application callbacks before
    ///returning.
    ///
    ///Event processing is not required for joystick input to work.
    ///
    ///@param timeout The maximum amount of time, in seconds, to wait.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwPollEvents() glfwPollEvents
    ///@see #glfwWaitEvents() glfwWaitEvents
    public static void glfwWaitEventsTimeout(@CType("double") double timeout) {
        try {
            MH_glfwWaitEventsTimeout.invokeExact(timeout);
        } catch (Throwable e) { throw new RuntimeException("error in glfwWaitEventsTimeout", e); }
    }

    ///Posts an empty event to the event queue.
    ///
    ///This function posts an empty event from the current thread to the event
    ///queue, causing [glfwWaitEvents][#glfwWaitEvents()] or [glfwWaitEventsTimeout][#glfwWaitEventsTimeout(double)] to return.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwWaitEvents() glfwWaitEvents
    ///@see #glfwWaitEventsTimeout(double) glfwWaitEventsTimeout
    public static void glfwPostEmptyEvent() {
        try {
            MH_glfwPostEmptyEvent.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwPostEmptyEvent", e); }
    }

    ///Returns the value of an input option for the specified window.
    ///
    ///This function returns the value of an input option for the specified window.
    ///The mode must be one of [GLFW_CURSOR][#GLFW_CURSOR], [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS],
    ///[GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS], [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS] or
    ///[GLFW_RAW_MOUSE_MOTION][#GLFW_RAW_MOUSE_MOTION].
    ///
    ///@param window The window to query.
    ///@param mode One of `GLFW_CURSOR`, `GLFW_STICKY_KEYS`,
    ///`GLFW_STICKY_MOUSE_BUTTONS`, `GLFW_LOCK_KEY_MODS` or
    ///`GLFW_RAW_MOUSE_MOTION`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetInputMode(MemorySegment, int, int) glfwSetInputMode
    public static @CType("int") int glfwGetInputMode(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int mode) {
        try {
            return (int) MH_glfwGetInputMode.invokeExact(window, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInputMode", e); }
    }

    ///Sets an input option for the specified window.
    ///
    ///This function sets an input mode option for the specified window.  The mode
    ///must be one of [GLFW_CURSOR][#GLFW_CURSOR], [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS],
    ///[GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS], [GLFW_LOCK_KEY_MODS][#GLFW_LOCK_KEY_MODS]
    ///[GLFW_RAW_MOUSE_MOTION][#GLFW_RAW_MOUSE_MOTION], or [GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS].
    ///
    ///If the mode is `GLFW_CURSOR`, the value must be one of the following cursor
    ///modes:
    ///- `GLFW_CURSOR_NORMAL` makes the cursor visible and behaving normally.
    ///- `GLFW_CURSOR_HIDDEN` makes the cursor invisible when it is over the
    ///  content area of the window but does not restrict the cursor from leaving.
    ///- `GLFW_CURSOR_DISABLED` hides and grabs the cursor, providing virtual
    ///  and unlimited cursor movement.  This is useful for implementing for
    ///  example 3D camera controls.
    ///- `GLFW_CURSOR_CAPTURED` makes the cursor visible and confines it to the
    ///  content area of the window.
    ///
    ///If the mode is `GLFW_STICKY_KEYS`, the value must be either `GLFW_TRUE` to
    ///enable sticky keys, or `GLFW_FALSE` to disable it.  If sticky keys are
    ///enabled, a key press will ensure that [glfwGetKey][#glfwGetKey(MemorySegment, int)] returns `GLFW_PRESS`
    ///the next time it is called even if the key had been released before the
    ///call.  This is useful when you are only interested in whether keys have been
    ///pressed but not when or in which order.
    ///
    ///If the mode is `GLFW_STICKY_MOUSE_BUTTONS`, the value must be either
    ///`GLFW_TRUE` to enable sticky mouse buttons, or `GLFW_FALSE` to disable it.
    ///If sticky mouse buttons are enabled, a mouse button press will ensure that
    ///[glfwGetMouseButton][#glfwGetMouseButton(MemorySegment, int)] returns `GLFW_PRESS` the next time it is called even
    ///if the mouse button had been released before the call.  This is useful when
    ///you are only interested in whether mouse buttons have been pressed but not
    ///when or in which order.
    ///
    ///If the mode is `GLFW_LOCK_KEY_MODS`, the value must be either `GLFW_TRUE` to
    ///enable lock key modifier bits, or `GLFW_FALSE` to disable them.  If enabled,
    ///callbacks that receive modifier bits will also have the
    ///[GLFW_MOD_CAPS_LOCK][#GLFW_MOD_CAPS_LOCK] bit set when the event was generated with Caps Lock on,
    ///and the [GLFW_MOD_NUM_LOCK][#GLFW_MOD_NUM_LOCK] bit when Num Lock was on.
    ///
    ///If the mode is `GLFW_RAW_MOUSE_MOTION`, the value must be either `GLFW_TRUE`
    ///to enable raw (unscaled and unaccelerated) mouse motion when the cursor is
    ///disabled, or `GLFW_FALSE` to disable it.  If raw motion is not supported,
    ///attempting to set this will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].  Call
    ///[glfwRawMouseMotionSupported][#glfwRawMouseMotionSupported()] to check for support.
    ///
    ///If the mode is `GLFW_UNLIMITED_MOUSE_BUTTONS`, the value must be either
    ///`GLFW_TRUE` to disable the mouse button limit when calling the mouse button
    ///callback, or `GLFW_FALSE` to limit the mouse buttons sent to the callback
    ///to the mouse button token values up to `GLFW_MOUSE_BUTTON_LAST`.
    ///
    ///@param window The window whose input mode to set.
    ///@param mode One of `GLFW_CURSOR`, `GLFW_STICKY_KEYS`,
    ///`GLFW_STICKY_MOUSE_BUTTONS`, `GLFW_LOCK_KEY_MODS` or
    ///`GLFW_RAW_MOUSE_MOTION`.
    ///@param value The new value of the specified input mode.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and
    ///[GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see above).
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetInputMode(MemorySegment, int) glfwGetInputMode
    public static void glfwSetInputMode(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int mode, @CType("int") int value) {
        try {
            MH_glfwSetInputMode.invokeExact(window, mode, value);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetInputMode", e); }
    }

    ///Returns whether raw mouse motion is supported.
    ///
    ///This function returns whether raw mouse motion is supported on the current
    ///system.  This status does not change after GLFW has been initialized so you
    ///only need to check this once.  If you attempt to enable raw motion on
    ///a system that does not support it, [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] will be emitted.
    ///
    ///Raw mouse motion is closer to the actual motion of the mouse across
    ///a surface.  It is not affected by the scaling and acceleration applied to
    ///the motion of the desktop cursor.  That processing is suitable for a cursor
    ///while raw motion is better for controlling for example a 3D camera.  Because
    ///of this, raw mouse motion is only provided when the cursor is disabled.
    ///
    ///@return `GLFW_TRUE` if raw mouse motion is supported on the current machine,
    ///or `GLFW_FALSE` otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetInputMode(MemorySegment, int, int) glfwSetInputMode
    public static @CType("int") boolean glfwRawMouseMotionSupported() {
        try {
            return (int) MH_glfwRawMouseMotionSupported.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwRawMouseMotionSupported", e); }
    }

    ///Returns the layout-specific name of the specified printable key.
    ///
    ///This function returns the name of the specified printable key, encoded as
    ///UTF-8.  This is typically the character that key would produce without any
    ///modifier keys, intended for displaying key bindings to the user.  For dead
    ///keys, it is typically the diacritic it would add to a character.
    ///
    ///__Do not use this function__ for text input.  You will
    ///break text input for many languages even if it happens to work for yours.
    ///
    ///If the key is `GLFW_KEY_UNKNOWN`, the scancode is used to identify the key,
    ///otherwise the scancode is ignored.  If you specify a non-printable key, or
    ///`GLFW_KEY_UNKNOWN` and a scancode that maps to a non-printable key, this
    ///function returns `NULL` but does not emit an error.
    ///
    ///This behavior allows you to always pass in the arguments in the
    ///key callback without modification.
    ///
    ///The printable keys are:
    ///- `GLFW_KEY_APOSTROPHE`
    ///- `GLFW_KEY_COMMA`
    ///- `GLFW_KEY_MINUS`
    ///- `GLFW_KEY_PERIOD`
    ///- `GLFW_KEY_SLASH`
    ///- `GLFW_KEY_SEMICOLON`
    ///- `GLFW_KEY_EQUAL`
    ///- `GLFW_KEY_LEFT_BRACKET`
    ///- `GLFW_KEY_RIGHT_BRACKET`
    ///- `GLFW_KEY_BACKSLASH`
    ///- `GLFW_KEY_WORLD_1`
    ///- `GLFW_KEY_WORLD_2`
    ///- `GLFW_KEY_0` to `GLFW_KEY_9`
    ///- `GLFW_KEY_A` to `GLFW_KEY_Z`
    ///- `GLFW_KEY_KP_0` to `GLFW_KEY_KP_9`
    ///- `GLFW_KEY_KP_DECIMAL`
    ///- `GLFW_KEY_KP_DIVIDE`
    ///- `GLFW_KEY_KP_MULTIPLY`
    ///- `GLFW_KEY_KP_SUBTRACT`
    ///- `GLFW_KEY_KP_ADD`
    ///- `GLFW_KEY_KP_EQUAL`
    ///
    ///Names for printable keys depend on keyboard layout, while names for
    ///non-printable keys are the same across layouts but depend on the application
    ///language and should be localized along with other user interface text.
    ///
    ///@param key The key to query, or `GLFW_KEY_UNKNOWN`.
    ///@param scancode The scancode of the key to query.
    ///@return The UTF-8 encoded, layout-specific name of the key, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark The contents of the returned string may change when a keyboard
    ///layout change event is received.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetKeyName_(@CType("int") int key, @CType("int") int scancode) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwGetKeyName.invokeExact(key, scancode);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    ///Returns the layout-specific name of the specified printable key.
    ///
    ///This function returns the name of the specified printable key, encoded as
    ///UTF-8.  This is typically the character that key would produce without any
    ///modifier keys, intended for displaying key bindings to the user.  For dead
    ///keys, it is typically the diacritic it would add to a character.
    ///
    ///__Do not use this function__ for text input.  You will
    ///break text input for many languages even if it happens to work for yours.
    ///
    ///If the key is `GLFW_KEY_UNKNOWN`, the scancode is used to identify the key,
    ///otherwise the scancode is ignored.  If you specify a non-printable key, or
    ///`GLFW_KEY_UNKNOWN` and a scancode that maps to a non-printable key, this
    ///function returns `NULL` but does not emit an error.
    ///
    ///This behavior allows you to always pass in the arguments in the
    ///key callback without modification.
    ///
    ///The printable keys are:
    ///- `GLFW_KEY_APOSTROPHE`
    ///- `GLFW_KEY_COMMA`
    ///- `GLFW_KEY_MINUS`
    ///- `GLFW_KEY_PERIOD`
    ///- `GLFW_KEY_SLASH`
    ///- `GLFW_KEY_SEMICOLON`
    ///- `GLFW_KEY_EQUAL`
    ///- `GLFW_KEY_LEFT_BRACKET`
    ///- `GLFW_KEY_RIGHT_BRACKET`
    ///- `GLFW_KEY_BACKSLASH`
    ///- `GLFW_KEY_WORLD_1`
    ///- `GLFW_KEY_WORLD_2`
    ///- `GLFW_KEY_0` to `GLFW_KEY_9`
    ///- `GLFW_KEY_A` to `GLFW_KEY_Z`
    ///- `GLFW_KEY_KP_0` to `GLFW_KEY_KP_9`
    ///- `GLFW_KEY_KP_DECIMAL`
    ///- `GLFW_KEY_KP_DIVIDE`
    ///- `GLFW_KEY_KP_MULTIPLY`
    ///- `GLFW_KEY_KP_SUBTRACT`
    ///- `GLFW_KEY_KP_ADD`
    ///- `GLFW_KEY_KP_EQUAL`
    ///
    ///Names for printable keys depend on keyboard layout, while names for
    ///non-printable keys are the same across layouts but depend on the application
    ///language and should be localized along with other user interface text.
    ///
    ///@param key The key to query, or `GLFW_KEY_UNKNOWN`.
    ///@param scancode The scancode of the key to query.
    ///@return The UTF-8 encoded, layout-specific name of the key, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE], [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark The contents of the returned string may change when a keyboard
    ///layout change event is received.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.String glfwGetKeyName(@CType("int") int key, @CType("int") int scancode) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) MH_glfwGetKeyName.invokeExact(key, scancode));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyName", e); }
    }

    ///Returns the platform-specific scancode of the specified key.
    ///
    ///This function returns the platform-specific scancode of the specified key.
    ///
    ///If the specified key token corresponds to a physical key not
    ///supported on the current platform then this method will return `-1`.
    ///Calling this function with anything other than a key token will return `-1`
    ///and generate a [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] error.
    ///
    ///@param key Any key token.
    ///@return The platform-specific scancode for the key, or `-1` if the key is
    ///not supported on the current platform or an error
    ///occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    public static @CType("int") int glfwGetKeyScancode(@CType("int") int key) {
        try {
            return (int) MH_glfwGetKeyScancode.invokeExact(key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKeyScancode", e); }
    }

    ///Returns the last reported state of a keyboard key for the specified
    ///window.
    ///
    ///This function returns the last state reported for the specified key to the
    ///specified window.  The returned state is one of `GLFW_PRESS` or
    ///`GLFW_RELEASE`.  The action `GLFW_REPEAT` is only reported to the key callback.
    ///
    ///If the [GLFW_STICKY_KEYS][#GLFW_STICKY_KEYS] input mode is enabled, this function returns
    ///`GLFW_PRESS` the first time you call it for a key that was pressed, even if
    ///that key has already been released.
    ///
    ///The key functions deal with physical keys, with key tokens
    ///named after their use on the standard US keyboard layout.  If you want to
    ///input text, use the Unicode character callback instead.
    ///
    ///The modifier key bit masks are not key tokens and cannot be
    ///used with this function.
    ///
    ///__Do not use this function__ to implement text input.
    ///
    ///@param window The desired window.
    ///@param key The desired keyboard key.  `GLFW_KEY_UNKNOWN` is
    ///not a valid key for this function.
    ///@return One of `GLFW_PRESS` or `GLFW_RELEASE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("int") int glfwGetKey(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int key) {
        try {
            return (int) MH_glfwGetKey.invokeExact(window, key);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetKey", e); }
    }

    ///Returns the last reported state of a mouse button for the specified
    ///window.
    ///
    ///This function returns the last state reported for the specified mouse button
    ///to the specified window.  The returned state is one of `GLFW_PRESS` or
    ///`GLFW_RELEASE`.
    ///
    ///If the [GLFW_STICKY_MOUSE_BUTTONS][#GLFW_STICKY_MOUSE_BUTTONS] input mode is enabled, this function
    ///returns `GLFW_PRESS` the first time you call it for a mouse button that was
    ///pressed, even if that mouse button has already been released.
    ///
    ///The [GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS] input mode does not effect the
    ///limit on buttons which can be polled with this function.
    ///
    ///@param window The desired window.
    ///@param button The desired mouse button token.
    ///@return One of `GLFW_PRESS` or `GLFW_RELEASE`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("int") int glfwGetMouseButton(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int button) {
        try {
            return (int) MH_glfwGetMouseButton.invokeExact(window, button);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetMouseButton", e); }
    }

    ///Retrieves the position of the cursor relative to the content area of
    ///the window.
    ///
    ///This function returns the position of the cursor, in screen coordinates,
    ///relative to the upper-left corner of the content area of the specified
    ///window.
    ///
    ///If the cursor is disabled (with `GLFW_CURSOR_DISABLED`) then the cursor
    ///position is unbounded and limited only by the minimum and maximum values of
    ///a `double`.
    ///
    ///The coordinate can be converted to their integer equivalents with the
    ///`floor` function.  Casting directly to an integer type works for positive
    ///coordinates, but fails for negative ones.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param window The desired window.
    ///@param xpos Where to store the cursor x-coordinate, relative to the
    ///left edge of the content area, or `NULL`.
    ///@param ypos Where to store the cursor y-coordinate, relative to the to
    ///top edge of the content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetCursorPos(MemorySegment, double, double) glfwSetCursorPos
    public static void glfwGetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("double*") java.lang.foreign.MemorySegment xpos, @Out @CType("double*") java.lang.foreign.MemorySegment ypos) {
        try {
            MH_glfwGetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    ///Retrieves the position of the cursor relative to the content area of
    ///the window.
    ///
    ///This function returns the position of the cursor, in screen coordinates,
    ///relative to the upper-left corner of the content area of the specified
    ///window.
    ///
    ///If the cursor is disabled (with `GLFW_CURSOR_DISABLED`) then the cursor
    ///position is unbounded and limited only by the minimum and maximum values of
    ///a `double`.
    ///
    ///The coordinate can be converted to their integer equivalents with the
    ///`floor` function.  Casting directly to an integer type works for positive
    ///coordinates, but fails for negative ones.
    ///
    ///Any or all of the position arguments may be `NULL`.  If an error occurs, all
    ///non-`NULL` position arguments will be set to zero.
    ///
    ///@param window The desired window.
    ///@param xpos Where to store the cursor x-coordinate, relative to the
    ///left edge of the content area, or `NULL`.
    ///@param ypos Where to store the cursor y-coordinate, relative to the to
    ///top edge of the content area, or `NULL`.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetCursorPos(MemorySegment, double, double) glfwSetCursorPos
    public static void glfwGetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("double*") double[] xpos, @Out @CType("double*") double[] ypos) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            MH_glfwGetCursorPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCursorPos", e); }
    }

    ///Sets the position of the cursor, relative to the content area of the
    ///window.
    ///
    ///This function sets the position, in screen coordinates, of the cursor
    ///relative to the upper-left corner of the content area of the specified
    ///window.  The window must have input focus.  If the window does not have
    ///input focus when this function is called, it fails silently.
    ///
    ///__Do not use this function__ to implement things like camera controls.  GLFW
    ///already provides the `GLFW_CURSOR_DISABLED` cursor mode that hides the
    ///cursor, transparently re-centers it and provides unconstrained cursor
    ///motion.  See [glfwSetInputMode][#glfwSetInputMode(MemorySegment, int, int)] for more information.
    ///
    ///If the cursor mode is `GLFW_CURSOR_DISABLED` then the cursor position is
    ///unconstrained and limited only by the minimum and maximum values of
    ///a `double`.
    ///
    ///@param window The desired window.
    ///@param xpos The desired x-coordinate, relative to the left edge of the
    ///content area.
    ///@param ypos The desired y-coordinate, relative to the top edge of the
    ///content area.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE] (see remarks).
    ///
    ///@glfw.remark @wayland This function will only work when the cursor mode is
    ///`GLFW_CURSOR_DISABLED`, otherwise it will emit [GLFW_FEATURE_UNAVAILABLE][#GLFW_FEATURE_UNAVAILABLE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetCursorPos(MemorySegment, MemorySegment, MemorySegment) glfwGetCursorPos
    public static void glfwSetCursorPos(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("double") double xpos, @CType("double") double ypos) {
        try {
            MH_glfwSetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPos", e); }
    }

    ///Creates a custom cursor.
    ///
    ///Creates a new custom cursor image that can be set for a window with
    ///[glfwSetCursor][#glfwSetCursor(MemorySegment, MemorySegment)].  The cursor can be destroyed with [glfwDestroyCursor][#glfwDestroyCursor(MemorySegment)].
    ///Any remaining cursors are destroyed by [glfwTerminate][#glfwTerminate()].
    ///
    ///The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
    ///bits per channel with the red channel first.  They are arranged canonically
    ///as packed sequential rows, starting from the top-left corner.
    ///
    ///The cursor hotspot is specified in pixels, relative to the upper-left corner
    ///of the cursor image.  Like all other coordinate systems in GLFW, the X-axis
    ///points to the right and the Y-axis points down.
    ///
    ///@param image The desired cursor image.
    ///@param xhot The desired x-coordinate, in pixels, of the cursor hotspot.
    ///@param yhot The desired y-coordinate, in pixels, of the cursor hotspot.
    ///@return The handle of the created cursor, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The specified image data is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwDestroyCursor(MemorySegment) glfwDestroyCursor
    ///@see #glfwCreateStandardCursor(int) glfwCreateStandardCursor
    public static @CType("GLFWcursor*") java.lang.foreign.MemorySegment glfwCreateCursor(@CType("const GLFWimage*") java.lang.foreign.MemorySegment image, @CType("int") int xhot, @CType("int") int yhot) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwCreateCursor.invokeExact(image, xhot, yhot);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateCursor", e); }
    }

    ///Creates a cursor with a standard shape.
    ///
    ///Returns a cursor with a standard shape, that can be set for a window with
    ///[glfwSetCursor][#glfwSetCursor(MemorySegment, MemorySegment)].  The images for these cursors come from the system
    ///cursor theme and their exact appearance will vary between platforms.
    ///
    ///Most of these shapes are guaranteed to exist on every supported platform but
    ///a few may not be present.  See the table below for details.
    ///
    ///| Cursor shape                   | Windows | macOS | X11    | Wayland |
    ///| ------------------------------ | ------- | ----- | ------ | ------- |
    ///| [GLFW_ARROW_CURSOR][#GLFW_ARROW_CURSOR]         | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_IBEAM_CURSOR][#GLFW_IBEAM_CURSOR]         | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_CROSSHAIR_CURSOR][#GLFW_CROSSHAIR_CURSOR]     | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_POINTING_HAND_CURSOR][#GLFW_POINTING_HAND_CURSOR] | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_RESIZE_EW_CURSOR][#GLFW_RESIZE_EW_CURSOR]     | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_RESIZE_NS_CURSOR][#GLFW_RESIZE_NS_CURSOR]     | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_RESIZE_NWSE_CURSOR][#GLFW_RESIZE_NWSE_CURSOR]   | Yes     | Yes<sup>1</sup> | Maybe<sup>2</sup> | Maybe<sup>2</sup> |
    ///| [GLFW_RESIZE_NESW_CURSOR][#GLFW_RESIZE_NESW_CURSOR]   | Yes     | Yes<sup>1</sup> | Maybe<sup>2</sup> | Maybe<sup>2</sup> |
    ///| [GLFW_RESIZE_ALL_CURSOR][#GLFW_RESIZE_ALL_CURSOR]    | Yes     | Yes   | Yes    | Yes |
    ///| [GLFW_NOT_ALLOWED_CURSOR][#GLFW_NOT_ALLOWED_CURSOR]   | Yes     | Yes   | Maybe<sup>2</sup> | Maybe<sup>2</sup> |
    ///
    ///1. This uses a private system API and may fail in the future.
    ///2. This uses a newer standard that not all cursor themes support.
    ///
    ///If the requested shape is not available, this function emits a
    ///[GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] error and returns `NULL`.
    ///
    ///@param shape One of the standard shapes.
    ///@return A new cursor ready to use or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM], [GLFW_CURSOR_UNAVAILABLE][#GLFW_CURSOR_UNAVAILABLE] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwCreateCursor(MemorySegment, int, int) glfwCreateCursor
    public static @CType("GLFWcursor*") java.lang.foreign.MemorySegment glfwCreateStandardCursor(@CType("int") int shape) {
        try {
            return (java.lang.foreign.MemorySegment) MH_glfwCreateStandardCursor.invokeExact(shape);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateStandardCursor", e); }
    }

    ///Destroys a cursor.
    ///
    ///This function destroys a cursor previously created with
    ///[glfwCreateCursor][#glfwCreateCursor(MemorySegment, int, int)].  Any remaining cursors will be destroyed by
    ///[glfwTerminate][#glfwTerminate()].
    ///
    ///If the specified cursor is current for any window, that window will be
    ///reverted to the default cursor.  This does not affect the cursor mode.
    ///
    ///@param cursor The cursor object to destroy.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.reentrancy This function must not be called from a callback.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwCreateCursor(MemorySegment, int, int) glfwCreateCursor
    public static void glfwDestroyCursor(@CType("GLFWcursor*") java.lang.foreign.MemorySegment cursor) {
        try {
            MH_glfwDestroyCursor.invokeExact(cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwDestroyCursor", e); }
    }

    ///Sets the cursor for the window.
    ///
    ///This function sets the cursor image to be used when the cursor is over the
    ///content area of the specified window.  The set cursor will only be visible
    ///when the cursor mode of the window is
    ///`GLFW_CURSOR_NORMAL`.
    ///
    ///On some platforms, the set cursor may not be visible unless the window also
    ///has input focus.
    ///
    ///@param window The window to set the cursor for.
    ///@param cursor The cursor to set, or `NULL` to switch back to the default
    ///arrow cursor.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static void glfwSetCursor(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursor*") java.lang.foreign.MemorySegment cursor) {
        try {
            MH_glfwSetCursor.invokeExact(window, cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFW() {
    }

    /**
     * The instance of GLFW.
     */
    GLFW INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);

    /// Returns the currently connected monitors.
    ///
    /// @return An array of monitor handles, or `NULL` if no monitors were found or
    /// if an error occurred.
    /// @see #glfwGetMonitors(MemorySegment)
    public static MemorySegment[] glfwGetMonitors() {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetMonitors(c);
            return Unmarshal.unmarshalAsAddressArray(segment.reinterpret(ADDRESS.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    /// Returns the available video modes for the specified monitor.
    ///
    /// @param monitor The monitor to query.
    /// @return An array of video modes, or `NULL` if an
    /// error occurred.
    /// @see #glfwGetVideoModes(MemorySegment, MemorySegment)
    public static GLFWVidMode glfwGetVideoModes(MemorySegment monitor) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetVideoModes(monitor, c);
            return new GLFWVidMode(segment.reinterpret(GLFWVidMode.LAYOUT.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    /// Sets the icon for the specified window.
    ///
    /// @param window The window whose icon to set.
    /// @param images The images to create the icon from.  This is ignored if
    ///               count is zero.
    /// @see #glfwSetWindowIcon(MemorySegment, int, MemorySegment)
    public static void glfwSetWindowIcon(MemorySegment window, GLFWImage images) {
        glfwSetWindowIcon(window, images != null ? Math.toIntExact(images.estimateCount()) : 0, images);
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

    /**
     * Sets the key callback.
     * <p>
     * This function sets the key callback of the specified window, which is called
     * when a key is pressed, repeated or released.
     * <p>
     * The key functions deal with physical keys, with layout independent
     * <a href="https://www.glfw.org/docs/latest/group__keys.html">key tokens</a>
     * named after their values in the standard US keyboard layout.  If you want to input text,
     * use the {@link #nsetCharCallback(MemorySegment, MemorySegment) character callback} instead.
     * <p>
     * When a window loses input focus, it will generate synthetic key release
     * events for all pressed keys with associated key tokens.  You can tell these
     * events from user-generated events by the fact that the synthetic ones are
     * generated after the focus loss event has been processed, i.e. after the
     * {@link #nsetWindowFocusCallback(MemorySegment, MemorySegment) window focus callback}
     * has been called.
     * <p>
     * The scancode of a key is specific to that platform or sometimes even to that
     * machine.  Scancodes are intended to allow users to bind keys that don't have
     * a GLFW key token.  Such keys have <i>{@code key}</i> set to {@code KEY_UNKNOWN}, their
     * state is not saved and so it cannot be queried with {@link #getKey}.
     * <p>
     * Sometimes GLFW needs to generate synthetic key events, in which case the
     * scancode may be zero.
     *
     * @param window   The window whose callback to set.
     * @param callback The new key callback, or {@link MemorySegment#NULL NULL} to remove the currently
     *                 set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int key, int scancode, int action, int mods)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWKeyFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetKeyCallback")
    MemorySegment nsetKeyCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the key callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new key callback, or {@code null} to remove the currently
     *                 set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetKeyCallback(MemorySegment, MemorySegment) nsetKeyCallback
     */
    @Skip
    default MemorySegment setKeyCallback(MemorySegment window, @Nullable GLFWKeyFun callback) {
        return nsetKeyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the Unicode character callback.
     * <p>
     * This function sets the character callback of the specified window, which is
     * called when a Unicode character is input.
     * <p>
     * The character callback is intended for Unicode text input.  As it deals with
     * characters, it is keyboard layout dependent, whereas the
     * {@link #nsetKeyCallback(MemorySegment, MemorySegment) key callback} is not.  Characters do not map 1:1
     * to physical keys, as a key may produce zero, one or more characters.  If you
     * want to know whether a specific physical key was pressed or released, see
     * the key callback instead.
     * <p>
     * The character callback behaves as system text input normally does and will
     * not be called if modifier keys are held down that would prevent normal text
     * input on that platform, for example a Super (Command) key on macOS or Alt key
     * on Windows.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, unsigned int codepoint)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWCharFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetCharCallback")
    MemorySegment nsetCharCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the Unicode character callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetCharCallback(MemorySegment, MemorySegment) nsetCharCallback
     */
    @Skip
    default MemorySegment setCharCallback(MemorySegment window, @Nullable GLFWCharFun callback) {
        return nsetCharCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the mouse button callback.
     * <p>
     * This function sets the mouse button callback of the specified window, which
     * is called when a mouse button is pressed or released.
     * <p>
     * When a window loses input focus, it will generate synthetic mouse button
     * release events for all pressed mouse buttons.  You can tell these events
     * from user-generated events by the fact that the synthetic ones are generated
     * after the focus loss event has been processed, i.e. after the
     * {@link #nsetWindowFocusCallback(MemorySegment, MemorySegment) window focus callback} has been called.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int button, int action, int mods)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWMouseButtonFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetMouseButtonCallback")
    MemorySegment nsetMouseButtonCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the mouse button callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetMouseButtonCallback(MemorySegment, MemorySegment) nsetMouseButtonCallback
     */
    @Skip
    default MemorySegment setMouseButtonCallback(MemorySegment window, @Nullable GLFWMouseButtonFun callback) {
        return nsetMouseButtonCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the cursor position callback.
     * <p>
     * This function sets the cursor position callback of the specified window,
     * which is called when the cursor is moved.  The callback is provided with the
     * position, in screen coordinates, relative to the upper-left corner of the
     * content area of the window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, double xpos, double ypos);}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWCursorPosFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetCursorPosCallback")
    MemorySegment nsetCursorPosCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the cursor position callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetCursorPosCallback(MemorySegment, MemorySegment) nsetCursorPosCallback
     */
    @Skip
    default MemorySegment setCursorPosCallback(MemorySegment window, @Nullable GLFWCursorPosFun callback) {
        return nsetCursorPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the cursor enter/leave callback.
     * <p>
     * This function sets the cursor boundary crossing callback of the specified
     * window, which is called when the cursor enters or leaves the content area of
     * the window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int entered)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWCursorEnterFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetCursorEnterCallback")
    MemorySegment nsetCursorEnterCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the cursor enter/leave callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetCursorEnterCallback(MemorySegment, MemorySegment) nsetCursorEnterCallback
     */
    @Skip
    default MemorySegment setCursorEnterCallback(MemorySegment window, @Nullable GLFWCursorEnterFun callback) {
        return nsetCursorEnterCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the scroll callback.
     * <p>
     * This function sets the scroll callback of the specified window, which is
     * called when a scrolling device is used, such as a mouse wheel or scrolling
     * area of a touchpad.
     * <p>
     * The scroll callback receives all scrolling input, like that from a mouse
     * wheel or a touchpad scrolling area.
     *
     * @param window   The window whose callback to set.
     * @param callback The new scroll callback, or {@link MemorySegment#NULL NULL} to remove the
     *                 currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, double xoffset, double yoffset)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWScrollFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetScrollCallback")
    MemorySegment nsetScrollCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the scroll callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new scroll callback, or {@code null} to remove the
     *                 currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetScrollCallback(MemorySegment, MemorySegment) nsetScrollCallback
     */
    @Skip
    default MemorySegment setScrollCallback(MemorySegment window, @Nullable GLFWScrollFun callback) {
        return nsetScrollCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the path drop callback.
     * <p>
     * This function sets the path drop callback of the specified window, which is
     * called when one or more dragged paths are dropped on the window.
     * <p>
     * Because the path array and its strings may have been generated specifically
     * for that event, they are not guaranteed to be valid after the callback has
     * returned.  If you wish to use them after the callback returns, you need to
     * make a deep copy.
     *
     * @param window   The window whose callback to set.
     * @param callback The new file drop callback, or {@link MemorySegment#NULL NULL} to remove the
     *                 currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int path_count, const char* paths[])}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWDropFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetDropCallback")
    MemorySegment nsetDropCallback(MemorySegment window, MemorySegment callback);

    /**
     * Sets the path drop callback.
     *
     * @param window   The window whose callback to set.
     * @param callback The new file drop callback, or {@code null} to remove the
     *                 currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetDropCallback(MemorySegment, MemorySegment) nsetDropCallback
     */
    @Skip
    default MemorySegment setDropCallback(MemorySegment window, @Nullable GLFWDropFun callback) {
        return nsetDropCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Returns whether the specified joystick is present.
     * <p>
     * This function returns whether the specified joystick is present.
     * <p>
     * There is no need to call this function before other functions that accept
     * a joystick ID, as they all check for presence before performing any other
     * work.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return {@code true} if the joystick is present, or {@code false} otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwJoystickPresent")
    boolean joystickPresent(int jid);

    /**
     * Returns the values of all axes of the specified joystick.
     * <p>
     * This function returns the values of all axes of the specified joystick.
     * Each element in the array is a value between -1.0 and 1.0.
     * <p>
     * If the specified joystick is not present this function will return {@link MemorySegment#NULL NULL}
     * but will not generate an error.  This can be used instead of first calling
     * {@link #joystickPresent}.
     *
     * @param jid   The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @param count Where to store the number of axis values in the returned
     *              array.  This is set to zero if the joystick is not present or an error
     *              occurred.
     * @return An array of axis values, or {@link MemorySegment#NULL NULL} if the
     * joystick is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwGetJoystickAxes")
    MemorySegment ngetJoystickAxes(int jid, MemorySegment count);

    /**
     * Returns the values of all axes of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of axis values, or {@code null} if the
     * joystick is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @see #ngetJoystickAxes(int, MemorySegment) ngetJoystickAxes
     */
    @Skip
    default float @Nullable [] getJoystickAxes(int jid) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pCount = stack.allocate(JAVA_INT);
            MemorySegment pAxes = ngetJoystickAxes(jid, pCount);
            final int count = pCount.get(JAVA_INT, 0);
            if (count == 0) return null;
            return Unmarshal.unmarshalAsFloatArray(pAxes.reinterpret(JAVA_FLOAT.scale(0L, count)));
        }
    }

    /**
     * Returns the state of all buttons of the specified joystick.
     * <p>
     * This function returns the state of all buttons of the specified joystick.
     * Each element in the array is either {@code PRESS} or {@code RELEASE}.
     * <p>
     * For backward compatibility with earlier versions that did not have
     * {@link #ngetJoystickHats}, the button array also includes all hats, each
     * represented as four buttons.  The hats are in the same order as returned by
     * <b>getJoystickHats</b> and are in the order <i>up</i>, <i>right</i>, <i>down</i> and
     * <i>left</i>.  To disable these extra buttons, set the
     * {@link #JOYSTICK_HAT_BUTTONS} init hint before initialization.
     * <p>
     * If the specified joystick is not present this function will return {@link MemorySegment#NULL NULL}
     * but will not generate an error.  This can be used instead of first calling
     * {@link #joystickPresent}.
     *
     * @param jid   The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @param count Where to store the number of button states in the returned
     *              array.  This is set to zero if the joystick is not present or an error
     *              occurred.
     * @return An array of button states, or {@link MemorySegment#NULL NULL} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwGetJoystickButtons")
    MemorySegment ngetJoystickButtons(int jid, MemorySegment count);

    /**
     * Returns the state of all buttons of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of button states, or {@code null} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickButtons(int, MemorySegment) ngetJoystickButtons
     */
    @Skip
    default int @Nullable [] getJoystickButtons(int jid) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pCount = stack.allocate(JAVA_INT);
            MemorySegment pButtons = ngetJoystickButtons(jid, pCount);
            final int count = pCount.get(JAVA_INT, 0);
            if (count == 0) return null;
            return Unmarshal.unmarshalAsIntArray(pButtons.reinterpret(JAVA_INT.scale(0L, count)));
        }
    }

    /**
     * Returns the state of all hats of the specified joystick.
     * <p>
     * This function returns the state of all hats of the specified joystick.
     * Each element in the array is one of the following values:
     *
     * <table>
     *     <caption>Values Table</caption>
     *     <tr><th>Name</th><th>Value</th></tr>
     *     <tr><td>{@code HAT_CENTERED}</td><td>0</td></tr>
     *     <tr><td>{@code HAT_UP}</td><td>1</td></tr>
     *     <tr><td>{@code HAT_RIGHT}</td><td>2</td></tr>
     *     <tr><td>{@code HAT_DOWN}</td><td>4</td></tr>
     *     <tr><td>{@code HAT_LEFT}</td><td>8</td></tr>
     *     <tr><td>{@code HAT_RIGHT_UP}</td><td>{@code HAT_RIGHT | HAT_UP}</td></tr>
     *     <tr><td>{@code HAT_RIGHT_DOWN}</td><td>{@code HAT_RIGHT | HAT_DOWN}</td></tr>
     *     <tr><td>{@code HAT_LEFT_UP}</td><td>{@code HAT_LEFT | HAT_UP}</td></tr>
     *     <tr><td>{@code HAT_LEFT_DOWN}</td><td>{@code HAT_LEFT | HAT_DOWN}</td></tr>
     * </table>
     * <p>
     * The diagonal directions are bitwise combinations of the primary (up, right,
     * down and left) directions, and you can test for these individually by ANDing
     * it with the corresponding direction.
     * {@snippet lang = java:
     * if (hats[2] & HAT_RIGHT) {
     *     // State of hat 2 could be right-up, right or right-down
     * }}
     * <p>
     * If the specified joystick is not present this function will return {@link MemorySegment#NULL NULL}
     * but will not generate an error.  This can be used instead of first calling
     * {@link #joystickPresent}.
     *
     * @param jid   The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @param count Where to store the number of hat states in the returned
     *              array.  This is set to zero if the joystick is not present or an error
     *              occurred.
     * @return An array of hat states, or {@link MemorySegment#NULL NULL} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected, this function is called again for that joystick or the library
     * is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwGetJoystickHats")
    MemorySegment ngetJoystickHats(int jid, MemorySegment count);

    /**
     * Returns the state of all hats of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of hat states, or {@code null} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickHats(int, MemorySegment) ngetJoystickHats
     */
    @Skip
    default byte[] getJoystickHats(int jid) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pCount = stack.allocate(JAVA_INT);
            var pHats = ngetJoystickHats(jid, pCount);
            return Unmarshal.unmarshalAsByteArray(pHats.reinterpret(JAVA_BYTE.scale(0L, pCount.get(JAVA_INT, 0))));
        }
    }

    /**
     * Returns the name of the specified joystick.
     * <p>
     * This function returns the name, encoded as UTF-8, of the specified joystick.
     * The returned string is allocated and freed by GLFW.  You should not free it
     * yourself.
     * <p>
     * If the specified joystick is not present this function will return {@link MemorySegment#NULL NULL}
     * but will not generate an error.  This can be used instead of first calling
     * {@link #joystickPresent}.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the joystick, or {@link MemorySegment#NULL NULL} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwGetJoystickName")
    MemorySegment ngetJoystickName(int jid);

    /**
     * Returns the name of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the joystick, or {@code null} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickName(int) ngetJoystickName
     */
    @Entrypoint("glfwGetJoystickName")
    @Nullable
    String getJoystickName(int jid);

    /**
     * Returns the SDL compatible GUID of the specified joystick.
     * <p>
     * This function returns the SDL compatible GUID, as a UTF-8 encoded
     * hexadecimal string, of the specified joystick.  The returned string is
     * allocated and freed by GLFW.  You should not free it yourself.
     * <p>
     * The GUID is what connects a joystick to a gamepad mapping.  A connected
     * joystick will always have a GUID even if there is no gamepad mapping
     * assigned to it.
     * <p>
     * If the specified joystick is not present this function will return {@link MemorySegment#NULL NULL}
     * but will not generate an error.  This can be used instead of first calling
     * {@link #joystickPresent}.
     * <p>
     * The GUID uses the format introduced in SDL 2.0.5.  This GUID tries to
     * uniquely identify the make and model of a joystick but does not identify
     * a specific unit, e.g. all wired Xbox 360 controllers will have the same
     * GUID on that platform.  The GUID for a unit may vary between platforms
     * depending on what hardware information the platform specific APIs provide.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded GUID of the joystick, or {@link MemorySegment#NULL NULL} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwGetJoystickGUID")
    MemorySegment ngetJoystickGUID(int jid);

    /**
     * Returns the SDL compatible GUID of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded GUID of the joystick, or {@code null} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickGUID(int) ngetJoystickGUID
     */
    @Entrypoint("glfwGetJoystickGUID")
    @Nullable
    String getJoystickGUID(int jid);

    /**
     * Sets the user pointer of the specified joystick.
     * <p>
     * This function sets the user-defined pointer of the specified joystick.  The
     * current value is retained until the joystick is disconnected.  The initial
     * value is {@link MemorySegment#NULL NULL}.
     * <p>
     * This function may be called from the joystick callback, even for a joystick
     * that is being disconnected.
     *
     * @param jid     The joystick whose pointer to set.
     * @param pointer The new value.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #getJoystickUserPointer(int) getJoystickUserPointer
     */
    @Entrypoint("glfwSetJoystickUserPointer")
    void setJoystickUserPointer(int jid, MemorySegment pointer);

    /**
     * {@return the user pointer of the specified joystick}
     * <p>
     * This function returns the current value of the user-defined pointer of the
     * specified joystick.  The initial value is {@link MemorySegment#NULL NULL}.
     * <p>
     * This function may be called from the joystick callback, even for a joystick
     * that is being disconnected.
     *
     * @param jid The joystick whose pointer to return.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #setJoystickUserPointer(int, MemorySegment) setJoystickUserPointer
     */
    @Entrypoint("glfwGetJoystickUserPointer")
    MemorySegment getJoystickUserPointer(int jid);

    /**
     * Returns whether the specified joystick has a gamepad mapping.
     * <p>
     * This function returns whether the specified joystick is both present and has
     * a gamepad mapping.
     * <p>
     * If the specified joystick is present but does not have a gamepad mapping
     * this function will return {@code false} but will not generate an error.  Call
     * {@link #joystickPresent} to check if a joystick is present regardless of
     * whether it has a mapping.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return {@code true} if a joystick is both present and has a gamepad mapping,
     * or {@code false} otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetGamepadState(int, MemorySegment) getGamepadState
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwJoystickIsGamepad")
    boolean joystickIsGamepad(int jid);

    /**
     * Sets the joystick configuration callback.
     * <p>
     * This function sets the joystick configuration callback, or removes the
     * currently set callback.  This is called when a joystick is connected to or
     * disconnected from the system.
     * <p>
     * For joystick connection and disconnection events to be delivered on all
     * platforms, you need to call one of the
     * <a href="https://www.glfw.org/docs/latest/input_guide.html#events">event processing</a>
     * functions.  Joystick disconnection may also be detected and the callback
     * called by joystick functions.  The function will then return whatever it
     * returns if the joystick is not present.
     *
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(int jid, int event)}</pre>
     * For more information about the callback parameters, see the
     * {@link GLFWJoystickFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    @Entrypoint("glfwSetJoystickCallback")
    MemorySegment nsetJoystickCallback(MemorySegment callback);

    /**
     * Sets the joystick configuration callback.
     *
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetJoystickCallback(MemorySegment) nsetJoystickCallback
     */
    @Skip
    default MemorySegment setJoystickCallback(@Nullable GLFWJoystickFun callback) {
        return nsetJoystickCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    /**
     * Adds the specified SDL_GameControllerDB gamepad mappings.
     * <p>
     * This function parses the specified ASCII encoded string and updates the
     * internal list with any gamepad mappings it finds.  This string may
     * contain either a single gamepad mapping or many mappings separated by
     * newlines.  The parser supports the full format of the {@code gamecontrollerdb.txt}
     * source file including empty lines and comments.
     * <p>
     * See <a href="https://www.glfw.org/docs/latest/input_guide.html#gamepad_mapping">Gamepad mappings</a>
     * for a description of the format.
     * <p>
     * If there is already a gamepad mapping for a given GUID in the internal list,
     * it will be replaced by the one passed to this function.  If the library is
     * terminated and re-initialized the internal list will revert to the built-in
     * default.
     *
     * @param string The string containing the gamepad mappings.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_VALUE}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #joystickIsGamepad(int) joystickIsGamepad
     * @see #ngetGamepadName(int) getGamepadName
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwUpdateGamepadMappings")
    boolean nupdateGamepadMappings(MemorySegment string);

    /**
     * Adds the specified SDL_GameControllerDB gamepad mappings.
     *
     * @param string The string containing the gamepad mappings.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #nupdateGamepadMappings(MemorySegment) nupdateGamepadMappings
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwUpdateGamepadMappings")
    boolean updateGamepadMappings(String string);

    /**
     * Returns the human-readable gamepad name for the specified joystick.
     * <p>
     * This function returns the human-readable name of the gamepad from the
     * gamepad mapping assigned to the specified joystick.
     * <p>
     * If the specified joystick is not present or does not have a gamepad mapping
     * this function will return {@link MemorySegment#NULL NULL} but will not generate an error.  Call
     * {@link #joystickPresent} to check whether it is present regardless of
     * whether it has a mapping.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the gamepad, or {@link MemorySegment#NULL NULL} if the
     * joystick is not present, does not have a mapping or an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and {@link #INVALID_ENUM}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified joystick is
     * disconnected, the gamepad mappings are updated or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #joystickIsGamepad(int) joystickIsGamepad
     */
    @Entrypoint("glfwGetGamepadName")
    MemorySegment ngetGamepadName(int jid);

    /**
     * Returns the human-readable gamepad name for the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the gamepad, or {@code null} if the
     * joystick is not present, does not have a mapping or an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetGamepadName(int) ngetGamepadName
     */
    @Entrypoint("glfwGetGamepadName")
    @Nullable
    String getGamepadName(int jid);

    /**
     * Retrieves the state of the specified joystick remapped as a gamepad.
     * <p>
     * This function retrieves the state of the specified joystick remapped to
     * an Xbox-like gamepad.
     * <p>
     * If the specified joystick is not present or does not have a gamepad mapping
     * this function will return {@code false} but will not generate an error.  Call
     * {@link #joystickPresent} to check whether it is present regardless of
     * whether it has a mapping.
     * <p>
     * The Guide button may not be available for input as it is often hooked by the
     * system or the Steam client.
     * <p>
     * Not all devices have all the buttons or axes provided by
     * {@link GLFWGamepadState}.  Unavailable buttons and axes will always report
     * {@link #RELEASE} and 0.0 respectively.
     *
     * @param jid   The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @param state The gamepad input state of the joystick.
     * @return {@code true} if successful, or {@code false} if no joystick is
     * connected, it has no gamepad mapping or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nupdateGamepadMappings(MemorySegment) updateGamepadMappings
     * @see #joystickIsGamepad(int) joystickIsGamepad
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwGetGamepadState")
    boolean ngetGamepadState(int jid, MemorySegment state);

    /**
     * Retrieves the state of the specified joystick remapped as a gamepad.
     *
     * @param jid   The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @param state The gamepad input state of the joystick.
     * @return {@code true} if successful, or {@code false} if no joystick is
     * connected, it has no gamepad mapping or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @see #ngetGamepadState(int, MemorySegment) ngetGamepadState
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwGetGamepadState")
    boolean getGamepadState(int jid, GLFWGamepadState state);

    /**
     * Sets the clipboard to the specified string.
     * <p>
     * This function sets the system clipboard to the specified, UTF-8 encoded
     * string.
     *
     * @param window Deprecated.  Any valid window or {@code NULL}.
     * @param string A UTF-8 encoded string.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Windows:</b> The clipboard on Windows has a single global lock for reading and
     * writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
     * cannot acquire the lock then this function emits {@link #PLATFORM_ERROR} and returns.
     * It is safe to try this multiple times.
     * @glfw.pointer_lifetime The specified string is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetClipboardString() getClipboardString
     */
    @Entrypoint("glfwSetClipboardString")
    void nsetClipboardString(MemorySegment window, MemorySegment string);

    /**
     * Sets the clipboard to the specified string.
     * <p>
     * This function sets the system clipboard to the specified, UTF-8 encoded
     * string.
     *
     * @param string A UTF-8 encoded string.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified string is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetClipboardString() getClipboardString
     */
    @Skip
    default void nsetClipboardString(MemorySegment string) {
        nsetClipboardString(MemorySegment.NULL, string);
    }

    /**
     * Sets the clipboard to the specified string.
     *
     * @param string A UTF-8 encoded string.
     * @see #nsetClipboardString(MemorySegment) nsetClipboardString
     */
    @Skip
    default void setClipboardString(String string) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            nsetClipboardString(stack.allocateFrom(string));
        }
    }

    /**
     * Returns the contents of the clipboard as a string.
     * <p>
     * This function returns the contents of the system clipboard, if it contains
     * or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
     * if its contents cannot be converted, {@link MemorySegment#NULL NULL} is returned and a
     * {@link #FORMAT_UNAVAILABLE} error is generated.
     *
     * @param window Deprecated.  Any valid window or {@code NULL}.
     * @return The contents of the clipboard as a UTF-8 encoded string, or {@link MemorySegment#NULL NULL}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #FORMAT_UNAVAILABLE} and {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Windows:</b> The clipboard on Windows has a single global lock for reading and
     * writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
     * cannot acquire the lock then this function emits {@link #PLATFORM_ERROR} and returns.
     * It is safe to try this multiple times.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the next call to
     * {@code getClipboardString} or
     * {@link #nsetClipboardString(MemorySegment) setClipboardString},
     * or until the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetClipboardString(MemorySegment) setClipboardString
     */
    @Entrypoint("glfwGetClipboardString")
    MemorySegment ngetClipboardString(MemorySegment window);

    /**
     * Returns the contents of the clipboard as a string.
     * <p>
     * This function returns the contents of the system clipboard, if it contains
     * or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
     * if its contents cannot be converted, {@link MemorySegment#NULL NULL} is returned and a
     * {@link #FORMAT_UNAVAILABLE} error is generated.
     *
     * @return The contents of the clipboard as a UTF-8 encoded string, or {@link MemorySegment#NULL NULL}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #FORMAT_UNAVAILABLE} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the next call to
     * {@code getClipboardString} or
     * {@link #nsetClipboardString(MemorySegment) setClipboardString},
     * or until the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetClipboardString(MemorySegment) setClipboardString
     */
    @Skip
    default MemorySegment ngetClipboardString() {
        return ngetClipboardString(MemorySegment.NULL);
    }

    /**
     * Returns the contents of the clipboard as a string.
     *
     * @return The contents of the clipboard as a UTF-8 encoded string, or {@code null}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetClipboardString() ngetClipboardString
     */
    @Skip
    @Nullable
    default String getClipboardString() {
        return Unmarshal.unmarshalAsString(ngetClipboardString());
    }

    /**
     * Returns the GLFW time.
     * <p>
     * This function returns the current GLFW time, in seconds.  Unless the time
     * has been set using {@link #setTime} it measures time elapsed since GLFW was
     * initialized.
     * <p>
     * This function and {@link #setTime} are helper functions on top of
     * {@link #getTimerFrequency} and {@link #getTimerValue}.
     * <p>
     * The resolution of the timer is system dependent, but is usually on the order
     * of a few micro- or nanoseconds.  It uses the highest-resolution monotonic
     * time source on each operating system.
     *
     * @return The current time, in seconds, or zero if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Reading and
     * writing of the internal base time is not atomic, so it needs to be
     * externally synchronized with calls to {@link #setTime}.
     */
    @Entrypoint("glfwGetTime")
    double getTime();

    /**
     * Sets the GLFW time.
     * <p>
     * This function sets the current GLFW time, in seconds.  The value must be
     * a positive finite number less than or equal to 18446744073.0, which is
     * approximately 584.5 years.
     * <p>
     * This function and {@link #getTime} are helper functions on top of
     * {@link #getTimerFrequency} and {@link #getTimerValue}.
     *
     * @param time The new value, in seconds.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_VALUE}.
     * @glfw.remark The upper limit of GLFW time is calculated as
     * floor((2<sup>64</sup> - 1) / 10<sup>9</sup>) and is due to implementations
     * storing nanoseconds in 64 bits.  The limit may be increased in the future.
     * @glfw.thread_safety This function may be called from any thread.  Reading and
     * writing of the internal base time is not atomic, so it needs to be
     * externally synchronized with calls to {@link #getTime}.
     */
    @Entrypoint("glfwSetTime")
    void setTime(double time);

    /**
     * Returns the current value of the raw timer.
     * <p>
     * This function returns the current value of the raw timer, measured in
     * 1&nbsp;/&nbsp;frequency seconds.  To get the frequency, call
     * {@link #getTimerFrequency}.
     *
     * @return The value of the timer, or zero if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #getTimerFrequency
     */
    @Entrypoint("glfwGetTimerValue")
    long getTimerValue();

    /**
     * Returns the frequency, in Hz, of the raw timer.
     * <p>
     * This function returns the frequency, in Hz, of the raw timer.
     *
     * @return The frequency of the timer, in Hz, or zero if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #getTimerValue
     */
    @Entrypoint("glfwGetTimerFrequency")
    long getTimerFrequency();

    /**
     * Makes the context of the specified window current for the calling
     * thread.
     * <p>
     * This function makes the OpenGL or OpenGL ES context of the specified window
     * current on the calling thread.
     * It can also detach the current context from
     * the calling thread without making a new one current by passing in {@code NULL}.
     * <p>
     * A context must only be made current on a single thread at a time and each
     * thread can have only a single current context at a time.  Making a context
     * current detaches any previously current context on the calling thread.
     * <p>
     * When moving a context between threads, you must detach it (make it
     * non-current) on the old thread before making it current on the new one.
     * <p>
     * By default, making a context non-current implicitly forces a pipeline flush.
     * On machines that support {@code GL_KHR_context_flush_control}, you can control
     * whether a context performs this flush by setting the
     * {@link #CONTEXT_RELEASE_BEHAVIOR}
     * hint.
     * <p>
     * The specified window must have an OpenGL or OpenGL ES context.
     * Specifying a window without a context will generate a {@link #NO_WINDOW_CONTEXT}
     * error.
     *
     * @param window The window whose context to make current, or {@link MemorySegment#NULL NULL} to
     *               detach the current context.
     * @glfw.remark If the previously current context was created via a different
     * context creation API than the one passed to this function, GLFW will still
     * detach the previous one from its API before making the new one current.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_WINDOW_CONTEXT} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #getCurrentContext
     */
    @Entrypoint("glfwMakeContextCurrent")
    void makeContextCurrent(MemorySegment window);

    /**
     * Returns the window whose context is current on the calling thread.
     * <p>
     * This function returns the window whose OpenGL or OpenGL ES context is
     * current on the calling thread.
     *
     * @return The window whose context is current, or {@link MemorySegment#NULL NULL} if no window's
     * context is current.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #makeContextCurrent
     */
    @Entrypoint("glfwGetCurrentContext")
    MemorySegment getCurrentContext();

    /**
     * Swaps the front and back buffers of the specified window.
     * <p>
     * This function swaps the front and back buffers of the specified window when
     * rendering with OpenGL or OpenGL ES.  If the swap interval is greater than
     * zero, the GPU driver waits the specified number of screen updates before
     * swapping the buffers.
     * <p>
     * The specified window must have an OpenGL or OpenGL ES context.  Specifying
     * a window without a context will generate a {@link #NO_WINDOW_CONTEXT} error.
     * <p>
     * This function does not apply to Vulkan.  If you are rendering with Vulkan,
     * see {@code vkQueuePresentKHR} instead.
     *
     * @param window The window whose buffers to swap.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_WINDOW_CONTEXT} and {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>EGL:</b> The context of the specified window must be current on the
     * calling thread.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #swapInterval
     */
    @Entrypoint("glfwSwapBuffers")
    void swapBuffers(MemorySegment window);

    /**
     * Sets the swap interval for the current context.
     * <p>
     * This function sets the swap interval for the current OpenGL or OpenGL ES
     * context, i.e. the number of screen updates to wait from the time @ref
     * glfwSwapBuffers was called before swapping the buffers and returning.  This
     * is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i>
     * or just <i>vsync</i>.
     * <p>
     * A context that supports either of the {@code WGL_EXT_swap_control_tear} and
     * {@code GLX_EXT_swap_control_tear} extensions also accepts <i>negative</i> swap
     * intervals, which allows the driver to swap immediately even if a frame
     * arrives a little bit late.  You can check for these extensions with
     * {@link #extensionSupported}.
     * <p>
     * A context must be current on the calling thread.  Calling this function
     * without a current context will cause a {@link #NO_CURRENT_CONTEXT} error.
     * <p>
     * This function does not apply to Vulkan.  If you are rendering with Vulkan,
     * see the present mode of your swapchain instead.
     *
     * @param interval The minimum number of screen updates to wait for
     *                 until the buffers are swapped by {@link #swapBuffers}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_CURRENT_CONTEXT} and {@link #PLATFORM_ERROR}.
     * @glfw.remark This function is not called during context creation, leaving the
     * swap interval set to whatever is the default for that API.  This is done
     * because some swap interval extensions used by GLFW do not allow the swap
     * interval to be reset to zero once it has been set to a non-zero value.
     * @glfw.remark Some GPU drivers do not honor the requested swap interval, either
     * because of a user setting that overrides the application's request or due to
     * bugs in the driver.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #swapBuffers
     */
    @Entrypoint("glfwSwapInterval")
    void swapInterval(int interval);

    /**
     * Returns whether the specified extension is available.
     * <p>
     * This function returns whether the specified
     * <a href="https://www.glfw.org/docs/latest/context_guide.html#context_glext">API extension</a>
     * is supported by the current OpenGL or OpenGL ES context.  It searches both for client API
     * extension and context creation API extensions.
     * <p>
     * A context must be current on the calling thread.  Calling this function
     * without a current context will cause a {@link #NO_CURRENT_CONTEXT} error.
     * <p>
     * As this functions retrieves and searches one or more extension strings each
     * call, it is recommended that you cache its results if it is going to be used
     * frequently.  The extension strings will not change during the lifetime of
     * a context, so there is no danger in doing this.
     * <p>
     * This function does not apply to Vulkan.  If you are using Vulkan, see
     * {@link #ngetRequiredInstanceExtensions}, {@code vkEnumerateInstanceExtensionProperties}
     * and {@code vkEnumerateDeviceExtensionProperties} instead.
     *
     * @param extension The ASCII encoded name of the extension.
     * @return {@code true} if the extension is available, or {@code false}
     * otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_CURRENT_CONTEXT}, {@link #INVALID_VALUE} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #ngetProcAddress
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwExtensionSupported")
    boolean nextensionSupported(MemorySegment extension);

    /**
     * Returns whether the specified extension is available.
     *
     * @param extension The ASCII encoded name of the extension.
     * @return {@code true} if the extension is available, or {@code false}
     * otherwise.
     * @see #nextensionSupported(MemorySegment) nextensionSupported
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwExtensionSupported")
    boolean extensionSupported(@StrCharset("US-ASCII") String extension);

    /**
     * Returns the address of the specified function for the current
     * context.
     * <p>
     * This function returns the address of the specified OpenGL or OpenGL ES
     * <a href="https://www.glfw.org/docs/latest/context_guide.html#context_glext">core or extension function</a>,
     * if it is supported by the current context.
     * <p>
     * A context must be current on the calling thread.  Calling this function
     * without a current context will cause a {@link #NO_CURRENT_CONTEXT} error.
     * <p>
     * This function does not apply to Vulkan.  If you are rendering with Vulkan,
     * see {@link GLFWVulkan#ngetInstanceProcAddress(MemorySegment, MemorySegment) glfwGetInstanceProcAddress},
     * {@code vkGetInstanceProcAddr} and {@code vkGetDeviceProcAddr} instead.
     *
     * @param procName The ASCII encoded name of the function.
     * @return The address of the function, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_CURRENT_CONTEXT} and {@link #PLATFORM_ERROR}.
     * @glfw.remark The address of a given function is not guaranteed to be the same
     * between contexts.
     * <p>
     * This function may return a non-{@link MemorySegment#NULL NULL} address despite the
     * associated version or extension not being available.  Always check the
     * context version or extension string first.
     * @glfw.pointer_lifetime The returned function pointer is valid until the context
     * is destroyed or the library is terminated.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #nextensionSupported
     */
    @Entrypoint("glfwGetProcAddress")
    MemorySegment ngetProcAddress(MemorySegment procName);

    /**
     * Returns the address of the specified function for the current
     * context.
     *
     * @param procName The ASCII encoded name of the function.
     * @return The address of the function, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetProcAddress(MemorySegment) ngetProcAddress
     */
    @Entrypoint("glfwGetProcAddress")
    MemorySegment getProcAddress(String procName);

    /**
     * Returns whether the Vulkan loader and an ICD have been found.
     * <p>
     * This function returns whether the Vulkan loader and any minimally functional
     * ICD have been found.
     * <p>
     * The availability of a Vulkan loader and even an ICD does not by itself guarantee that
     * surface creation or even instance creation is possible.  Call
     * {@link #ngetRequiredInstanceExtensions getRequiredInstanceExtensions} to check whether the
     * extensions necessary for Vulkan surface creation are available and
     * {@link GLFWVulkan#getPhysicalDevicePresentationSupport glfwGetPhysicalDevicePresentationSupport}
     * to check whether a queue family of a physical device supports image presentation.
     *
     * @return {@code true} if Vulkan is minimally available, or {@code false}
     * otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.
     */
    @Convert(AsBool.INT)
    @Entrypoint("glfwVulkanSupported")
    boolean vulkanSupported();

    /**
     * Returns the Vulkan instance extensions required by GLFW.
     * <p>
     * This function returns an array of names of Vulkan instance extensions required
     * by GLFW for creating Vulkan surfaces for GLFW windows.  If successful, the
     * list will always contain {@code VK_KHR_surface}, so if you don't require any
     * additional extensions you can pass this list directly to the
     * {@code VkInstanceCreateInfo} struct.
     * <p>
     * If Vulkan is not available on the machine, this function returns {@link MemorySegment#NULL NULL} and
     * generates a {@link #API_UNAVAILABLE} error.  Call {@link #vulkanSupported}
     * to check whether Vulkan is at least minimally available.
     * <p>
     * If Vulkan is available but no set of extensions allowing window surface
     * creation was found, this function returns {@link MemorySegment#NULL NULL}.  You may still use Vulkan
     * for off-screen rendering and compute work.
     *
     * @param count Where to store the number of extensions in the returned
     *              array.  This is set to zero if an error occurred.
     * @return An array of ASCII encoded extension names, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #API_UNAVAILABLE}.
     * @glfw.remark Additional extensions may be required by future versions of GLFW.
     * You should check if any extensions you wish to enable are already in the
     * returned array, as it is an error to specify an extension more than once in
     * the {@code VkInstanceCreateInfo} struct.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is guaranteed to be valid only until the
     * library is terminated.
     * @glfw.thread_safety This function may be called from any thread.
     */
    @Entrypoint("glfwGetRequiredInstanceExtensions")
    MemorySegment ngetRequiredInstanceExtensions(MemorySegment count);

    /**
     * Returns the Vulkan instance extensions required by GLFW.
     *
     * @return An array of ASCII encoded extension names, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetRequiredInstanceExtensions(MemorySegment) ngetRequiredInstanceExtensions
     */
    @Skip
    default String @Nullable [] getRequiredInstanceExtensions() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pCount = stack.allocate(JAVA_INT);
            MemorySegment pExt = ngetRequiredInstanceExtensions(pCount);
            final int count = pCount.get(JAVA_INT, 0);
            if (count == 0) return null;
            return Unmarshal.unmarshalAsStringArray(pExt.reinterpret(ADDRESS.scale(0L, count)), StandardCharsets.US_ASCII);
        }
    }
}
