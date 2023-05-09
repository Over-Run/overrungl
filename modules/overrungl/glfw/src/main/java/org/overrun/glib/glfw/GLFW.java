/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib.glfw;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;
import org.overrun.glib.util.value.Value2;
import org.overrun.glib.util.value.ValueInt3;
import org.overrun.glib.util.value.ValueInt4;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.glfw.Handles.*;

/**
 * The GLFW binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFW {
    /**
     * The major version number of the GLFW header.
     * <p>
     * This is incremented when the API is changed in non-compatible ways.
     */
    public static final int VERSION_MAJOR = 3;
    /**
     * The minor version number of the GLFW header.
     * <p>
     * This is incremented when features are added to the API, but it remains backward-compatible.
     */
    public static final int VERSION_MINOR = 3;
    /**
     * The revision number of the GLFW header.
     * <p>
     * This is incremented when a bug fix release is made that does not contain any API changes.
     */
    public static final int VERSION_REVISION = 8;

    /**
     * One.
     * <p>
     * This is only semantic sugar for the number 1.  You can instead use {@code 1} or
     * {@code true} or {@code _True} or {@code GL_TRUE} or {@code VK_TRUE} or anything else that is equal
     * to one.
     */
    public static final int TRUE = 1;
    /**
     * Zero.
     * <p>
     * This is only semantic sugar for the number 0.  You can instead use {@code 0} or
     * {@code false} or {@code _False} or {@code GL_FALSE} or {@code VK_FALSE} or anything else that is
     * equal to zero.
     */
    public static final int FALSE = 0;

    /**
     * The key or mouse button was released.
     */
    public static final int RELEASE = 0;
    /**
     * The key or mouse button was pressed.
     */
    public static final int PRESS = 1;
    /**
     * The key was held down until it repeated.
     */
    public static final int REPEAT = 2;

    /**
     * Joystick hat states.
     */
    public static final int HAT_CENTERED = 0,
        HAT_UP = 1,
        HAT_RIGHT = 2,
        HAT_DOWN = 4,
        HAT_LEFT = 8,
        HAT_RIGHT_UP = (HAT_RIGHT | HAT_UP),
        HAT_RIGHT_DOWN = (HAT_RIGHT | HAT_DOWN),
        HAT_LEFT_UP = (HAT_LEFT | HAT_UP),
        HAT_LEFT_DOWN = (HAT_LEFT | HAT_DOWN);


    /**
     * The unknown key
     */
    public static final int KEY_UNKNOWN = -1;

    /**
     * Printable keys
     */
    public static final int KEY_SPACE = 32,
        KEY_APOSTROPHE = 39, /* ' */
        KEY_COMMA = 44, /* , */
        KEY_MINUS = 45, /* - */
        KEY_PERIOD = 46, /* . */
        KEY_SLASH = 47, /* / */
        KEY_0 = 48,
        KEY_1 = 49,
        KEY_2 = 50,
        KEY_3 = 51,
        KEY_4 = 52,
        KEY_5 = 53,
        KEY_6 = 54,
        KEY_7 = 55,
        KEY_8 = 56,
        KEY_9 = 57,
        KEY_SEMICOLON = 59, /* ; */
        KEY_EQUAL = 61, /* = */
        KEY_A = 65,
        KEY_B = 66,
        KEY_C = 67,
        KEY_D = 68,
        KEY_E = 69,
        KEY_F = 70,
        KEY_G = 71,
        KEY_H = 72,
        KEY_I = 73,
        KEY_J = 74,
        KEY_K = 75,
        KEY_L = 76,
        KEY_M = 77,
        KEY_N = 78,
        KEY_O = 79,
        KEY_P = 80,
        KEY_Q = 81,
        KEY_R = 82,
        KEY_S = 83,
        KEY_T = 84,
        KEY_U = 85,
        KEY_V = 86,
        KEY_W = 87,
        KEY_X = 88,
        KEY_Y = 89,
        KEY_Z = 90,
        KEY_LEFT_BRACKET = 91, /* [ */
        KEY_BACKSLASH = 92, /* \ */
        KEY_RIGHT_BRACKET = 93, /* ] */
        KEY_GRAVE_ACCENT = 96, /* ` */
        KEY_WORLD_1 = 161, /* non-US #1 */
        KEY_WORLD_2 = 162; /* non-US #2 */

    /**
     * Function keys
     */
    public static final int KEY_ESCAPE = 256,
        KEY_ENTER = 257,
        KEY_TAB = 258,
        KEY_BACKSPACE = 259,
        KEY_INSERT = 260,
        KEY_DELETE = 261,
        KEY_RIGHT = 262,
        KEY_LEFT = 263,
        KEY_DOWN = 264,
        KEY_UP = 265,
        KEY_PAGE_UP = 266,
        KEY_PAGE_DOWN = 267,
        KEY_HOME = 268,
        KEY_END = 269,
        KEY_CAPS_LOCK = 280,
        KEY_SCROLL_LOCK = 281,
        KEY_NUM_LOCK = 282,
        KEY_PRINT_SCREEN = 283,
        KEY_PAUSE = 284,
        KEY_F1 = 290,
        KEY_F2 = 291,
        KEY_F3 = 292,
        KEY_F4 = 293,
        KEY_F5 = 294,
        KEY_F6 = 295,
        KEY_F7 = 296,
        KEY_F8 = 297,
        KEY_F9 = 298,
        KEY_F10 = 299,
        KEY_F11 = 300,
        KEY_F12 = 301,
        KEY_F13 = 302,
        KEY_F14 = 303,
        KEY_F15 = 304,
        KEY_F16 = 305,
        KEY_F17 = 306,
        KEY_F18 = 307,
        KEY_F19 = 308,
        KEY_F20 = 309,
        KEY_F21 = 310,
        KEY_F22 = 311,
        KEY_F23 = 312,
        KEY_F24 = 313,
        KEY_F25 = 314,
        KEY_KP_0 = 320,
        KEY_KP_1 = 321,
        KEY_KP_2 = 322,
        KEY_KP_3 = 323,
        KEY_KP_4 = 324,
        KEY_KP_5 = 325,
        KEY_KP_6 = 326,
        KEY_KP_7 = 327,
        KEY_KP_8 = 328,
        KEY_KP_9 = 329,
        KEY_KP_DECIMAL = 330,
        KEY_KP_DIVIDE = 331,
        KEY_KP_MULTIPLY = 332,
        KEY_KP_SUBTRACT = 333,
        KEY_KP_ADD = 334,
        KEY_KP_ENTER = 335,
        KEY_KP_EQUAL = 336,
        KEY_LEFT_SHIFT = 340,
        KEY_LEFT_CONTROL = 341,
        KEY_LEFT_ALT = 342,
        KEY_LEFT_SUPER = 343,
        KEY_RIGHT_SHIFT = 344,
        KEY_RIGHT_CONTROL = 345,
        KEY_RIGHT_ALT = 346,
        KEY_RIGHT_SUPER = 347,
        KEY_MENU = 348;

    public static final int KEY_LAST = KEY_MENU;

    /**
     * If this bit is set one or more Shift keys were held down.
     */
    public static final int MOD_SHIFT = 0x0001;
    /**
     * If this bit is set one or more Control keys were held down.
     */
    public static final int MOD_CONTROL = 0x0002;
    /**
     * If this bit is set one or more Alt keys were held down.
     */
    public static final int MOD_ALT = 0x0004;
    /**
     * If this bit is set one or more Super keys were held down.
     */
    public static final int MOD_SUPER = 0x0008;
    /**
     * If this bit is set the Caps Lock key is enabled and the
     * {@link #LOCK_KEY_MODS} input mode is set.
     */
    public static final int MOD_CAPS_LOCK = 0x0010;
    /**
     * If this bit is set the Num Lock key is enabled and the
     * {@link #LOCK_KEY_MODS} input mode is set.
     */
    public static final int MOD_NUM_LOCK = 0x0020;

    /**
     * Mouse button IDs.
     */
    public static final int MOUSE_BUTTON_1 = 0,
        MOUSE_BUTTON_2 = 1,
        MOUSE_BUTTON_3 = 2,
        MOUSE_BUTTON_4 = 3,
        MOUSE_BUTTON_5 = 4,
        MOUSE_BUTTON_6 = 5,
        MOUSE_BUTTON_7 = 6,
        MOUSE_BUTTON_8 = 7,
        MOUSE_BUTTON_LAST = MOUSE_BUTTON_8,
        MOUSE_BUTTON_LEFT = MOUSE_BUTTON_1,
        MOUSE_BUTTON_RIGHT = MOUSE_BUTTON_2,
        MOUSE_BUTTON_MIDDLE = MOUSE_BUTTON_3;

    /**
     * Joystick IDs.
     **/
    public static final int JOYSTICK_1 = 0,
        JOYSTICK_2 = 1,
        JOYSTICK_3 = 2,
        JOYSTICK_4 = 3,
        JOYSTICK_5 = 4,
        JOYSTICK_6 = 5,
        JOYSTICK_7 = 6,
        JOYSTICK_8 = 7,
        JOYSTICK_9 = 8,
        JOYSTICK_10 = 9,
        JOYSTICK_11 = 10,
        JOYSTICK_12 = 11,
        JOYSTICK_13 = 12,
        JOYSTICK_14 = 13,
        JOYSTICK_15 = 14,
        JOYSTICK_16 = 15,
        JOYSTICK_LAST = JOYSTICK_16;

    /**
     * Gamepad buttons.
     */
    public static final int GAMEPAD_BUTTON_A = 0,
        GAMEPAD_BUTTON_B = 1,
        GAMEPAD_BUTTON_X = 2,
        GAMEPAD_BUTTON_Y = 3,
        GAMEPAD_BUTTON_LEFT_BUMPER = 4,
        GAMEPAD_BUTTON_RIGHT_BUMPER = 5,
        GAMEPAD_BUTTON_BACK = 6,
        GAMEPAD_BUTTON_START = 7,
        GAMEPAD_BUTTON_GUIDE = 8,
        GAMEPAD_BUTTON_LEFT_THUMB = 9,
        GAMEPAD_BUTTON_RIGHT_THUMB = 10,
        GAMEPAD_BUTTON_DPAD_UP = 11,
        GAMEPAD_BUTTON_DPAD_RIGHT = 12,
        GAMEPAD_BUTTON_DPAD_DOWN = 13,
        GAMEPAD_BUTTON_DPAD_LEFT = 14,
        GAMEPAD_BUTTON_LAST = GAMEPAD_BUTTON_DPAD_LEFT,

    GAMEPAD_BUTTON_CROSS = GAMEPAD_BUTTON_A,
        GAMEPAD_BUTTON_CIRCLE = GAMEPAD_BUTTON_B,
        GAMEPAD_BUTTON_SQUARE = GAMEPAD_BUTTON_X,
        GAMEPAD_BUTTON_TRIANGLE = GAMEPAD_BUTTON_Y;

    /**
     * Gamepad axes.
     **/
    public static final int GAMEPAD_AXIS_LEFT_X = 0,
        GAMEPAD_AXIS_LEFT_Y = 1,
        GAMEPAD_AXIS_RIGHT_X = 2,
        GAMEPAD_AXIS_RIGHT_Y = 3,
        GAMEPAD_AXIS_LEFT_TRIGGER = 4,
        GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        GAMEPAD_AXIS_LAST = GAMEPAD_AXIS_RIGHT_TRIGGER;

    /**
     * No error has occurred.
     *
     * <h4>Analysis</h4>
     * Yay.
     */
    public static final int NO_ERROR = 0;
    /**
     * GLFW has not been initialized.
     * <p>
     * This occurs if a GLFW function was called that must not be called unless the
     * library is <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     *
     * <h4>Analysis</h4>
     * Application programmer error. Initialize GLFW before calling any
     * function that requires initialization.
     */
    public static final int NOT_INITIALIZED = 0x00010001;
    /**
     * No context is current for this thread.
     * <p>
     * This occurs if a GLFW function was called that needs and operates on the
     * current OpenGL or OpenGL ES context but no context is current on the calling
     * thread.  One such function is @ref glfwSwapInterval.
     *
     * <h4>Analysis</h4>
     * Application programmer error. Ensure a context is current before
     * calling functions that require a current context.
     */
    public static final int NO_CURRENT_CONTEXT = 0x00010002;
    /**
     * One of the arguments to the function was an invalid enum value, for example
     * requesting {@link #RED_BITS} with {@link #getWindowAttrib}.
     *
     * <h4>Analysis</h4>
     * Application programmer error. Fix the offending call.
     */
    public static final int INVALID_ENUM = 0x00010003;
    /**
     * One of the arguments to the function was an invalid value, for example
     * requesting a non-existent OpenGL or OpenGL ES version like 2.7.
     * <p>
     * Requesting a valid but unavailable OpenGL or OpenGL ES version will instead
     * result in a {@link #VERSION_UNAVAILABLE} error.
     *
     * <h4>Analysis</h4>
     * Application programmer error. Fix the offending call.
     */
    public static final int INVALID_VALUE = 0x00010004;
    /**
     * A memory allocation failed.
     *
     * <h4>Analysis</h4>
     * A bug in GLFW or the underlying operating system. Report the bug
     * to the <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.
     */
    public static final int OUT_OF_MEMORY = 0x00010005;
    /**
     * GLFW could not find support for the requested API on the system.
     *
     * <h4>Analysis</h4>
     * The installed graphics driver does not support the requested
     * API, or does not support it via the chosen context creation backend.
     * Below are a few examples.
     * <p>
     * Some pre-installed Windows graphics drivers do not support OpenGL.  AMD only
     * supports OpenGL ES via EGL, while Nvidia and Intel only support it via
     * a WGL or GLX extension.  macOS does not provide OpenGL ES at all.  The Mesa
     * EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
     * driver.  Older graphics drivers do not support Vulkan.
     */
    public static final int API_UNAVAILABLE = 0x00010006;
    /**
     * The requested OpenGL or OpenGL ES version (including any requested context
     * or framebuffer hints) is not available on this machine.
     *
     * <h4>Analysis</h4>
     * The machine does not support your requirements.  If your
     * application is sufficiently flexible, downgrade your requirements and try
     * again.  Otherwise, inform the user that their machine does not match your
     * requirements.
     * <p>
     * Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0
     * comes out before the 4.x series gets that far, also fail with this error and
     * not {@link #INVALID_VALUE}, because GLFW cannot know what future versions
     * will exist.
     */
    public static final int VERSION_UNAVAILABLE = 0x00010007;
    /**
     * A platform-specific error occurred that does not match any of the more
     * specific categories.
     *
     * <h4>Analysis</h4>
     * A bug or configuration error in GLFW, the underlying operating
     * system or its drivers, or a lack of required resources.  Report the issue to
     * the <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.
     */
    public static final int PLATFORM_ERROR = 0x00010008;
    /**
     * The requested format is not supported or available.
     * <p>
     * If emitted during window creation, the requested pixel format is not
     * supported.
     * <p>
     * If emitted when querying the clipboard, the contents of the clipboard could
     * not be converted to the requested format.
     *
     * <h4>Analysis</h4>
     * If emitted during window creation, one or more
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints_hard">hard constraints</a> did not match any of the
     * available pixel formats.  If your application is sufficiently flexible,
     * downgrade your requirements and try again.  Otherwise, inform the user that
     * their machine does not match your requirements.
     * <p>
     * If emitted when querying the clipboard, ignore the error or report it to
     * the user, as appropriate.
     */
    public static final int FORMAT_UNAVAILABLE = 0x00010009;
    /**
     * The specified window does not have an OpenGL or OpenGL ES context.
     * <p>
     * A window that does not have an OpenGL or OpenGL ES context was passed to
     * a function that requires it to have one.
     *
     * <h4>Analysis</h4>
     * Application programmer error. Fix the offending call.
     */
    public static final int NO_WINDOW_CONTEXT = 0x0001000A;

    /**
     * <h4>Window related hints</h4>
     * <ul>
     * <li>{@link #RESIZABLE}: specifies whether the windowed mode window will be resizable by the user.
     * The window will still be resizable using the {@link #setWindowSize} function.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     * This hint is ignored for full screen and undecorated windows.</li>
     * <li>{@link #VISIBLE}: specifies whether the windowed mode window will be initially visible.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     * This hint is ignored for full screen windows.</li>
     * <li>{@link #DECORATED}: specifies whether the windowed mode window will have window decorations such as a border,
     * a close widget, etc. An undecorated window will not be resizable by the user but will still allow the user
     * to generate close events on some platforms. Possible values are {@link #TRUE} and {@link #FALSE}.
     * This hint is ignored for full screen windows.</li>
     * <li>{@link #FOCUSED}: specifies whether the windowed mode window will be given input focus when created.
     * Possible values are {@link #TRUE} and {@link #FALSE}. This hint is ignored for full screen and initially hidden windows.</li>
     * <li>{@link #AUTO_ICONIFY}: specifies whether the full screen window will automatically iconify
     * and restore the previous video mode on input focus loss.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     * This hint is ignored for windowed mode windows.</li>
     * <li>{@link #FLOATING}: specifies whether the windowed mode window will be floating above other regular windows,
     * also called topmost or always-on-top. This is intended primarily for debugging purposes and cannot be used
     * to implement proper full screen windows. Possible values are {@link #TRUE} and {@link #FALSE}.
     * This hint is ignored for full screen windows.</li>
     * <li>{@link #MAXIMIZED}: specifies whether the windowed mode window will be maximized when created.
     * Possible values are {@link #TRUE} and {@link #FALSE}. This hint is ignored for full screen windows.</li>
     * <li>{@link #CENTER_CURSOR}: specifies whether the cursor should be centered over newly created full screen windows.
     * Possible values are {@link #TRUE} and {@link #FALSE}. This hint is ignored for windowed mode windows.</li>
     * <li>{@link #TRANSPARENT_FRAMEBUFFER}: specifies whether the window framebuffer will be transparent.
     * If enabled and supported by the system, the window framebuffer alpha channel will be used to combine the framebuffer
     * with the background. This does not affect window decorations. Possible values are {@link #TRUE} and {@link #FALSE}.</li>
     * <li>{@link #FOCUS_ON_SHOW}: specifies whether the window will be given input focus when {@link #showWindow} is called.
     * Possible values are {@link #TRUE} and {@link #FALSE}.</li>
     * <li>{@link #SCALE_TO_MONITOR}: specified whether the window content area should be resized based
     * on the <a href="https://www.glfw.org/docs/latest/monitor_guide.html#monitor_scale">monitor content scale</a>
     * of any monitor it is placed on. This includes the initial placement when the window is created.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     * <p>
     * This hint only has an effect on platforms where screen coordinates and pixels always map 1:1 such as Windows and X11.
     * On platforms like macOS the resolution of the framebuffer is changed independently of the window size.</li>
     * </ul>
     */
    public static final int FOCUSED = 0x00020001,
        ICONIFIED = 0x00020002,
        RESIZABLE = 0x00020003,
        VISIBLE = 0x00020004,
        DECORATED = 0x00020005,
        AUTO_ICONIFY = 0x00020006,
        FLOATING = 0x00020007,
        MAXIMIZED = 0x00020008,
        CENTER_CURSOR = 0x00020009,
        TRANSPARENT_FRAMEBUFFER = 0x0002000A,
        FOCUS_ON_SHOW = 0x0002000C,
        SCALE_TO_MONITOR = 0x0002200C;

    /**
     * <b>HOVERED</b> indicates whether the cursor is currently directly over the content area of the window, with no other windows between.
     * See <a href="https://www.glfw.org/docs/latest/input_guide.html#cursor_enter">Cursor enter/leave events</a> for details.
     */
    public static final int HOVERED = 0x0002000B;

    /**
     * <h4>Framebuffer related hints</h4>
     * <ul>
     * <li>{@link #RED_BITS}, {@link #GREEN_BITS}, {@link #BLUE_BITS}, {@link #ALPHA_BITS}, {@link #DEPTH_BITS} and {@link #STENCIL_BITS}:
     * specify the desired bit depths of the various components of the default framebuffer.
     * A value of {@link #DONT_CARE} means the application has no preference.</li>
     * <li>{@link #ACCUM_RED_BITS}, {@link #ACCUM_GREEN_BITS}, {@link #ACCUM_BLUE_BITS} and {@link #ACCUM_ALPHA_BITS}:
     * specify the desired bit depths of the various components of the accumulation buffer.
     * A value of {@link #DONT_CARE} means the application has no preference.
     * <p>
     * Accumulation buffers are a legacy OpenGL feature and should not be used in new code.</li>
     * <li>{@link #AUX_BUFFERS}: specifies the desired number of auxiliary buffers.
     * A value of {@link #DONT_CARE} means the application has no preference.
     * <p>
     * Auxiliary buffers are a legacy OpenGL feature and should not be used in new code.</li>
     * <li>{@link #STEREO}: specifies whether to use OpenGL stereoscopic rendering.
     * Possible values are {@link #TRUE} and {@link #FALSE}. This is a hard constraint.</li>
     * <li>{@link #SAMPLES}: specifies the desired number of samples to use for multisampling.
     * Zero disables multisampling. A value of {@link #DONT_CARE} means the application has no preference.</li>
     * <li>{@link #SRGB_CAPABLE}: specifies whether the framebuffer should be sRGB capable.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     * <p>
     * <b>Note</b><br>
     * <b>OpenGL:</b> If enabled and supported by the system,
     * the {@code GL_FRAMEBUFFER_SRGB} enable will control sRGB rendering.
     * By default, sRGB rendering will be disabled.<br>
     * <b>OpenGL ES:</b> If enabled and supported by the system, the context will always have sRGB rendering enabled.
     * </li>
     * <li>{@link #DOUBLEBUFFER}: specifies whether the framebuffer should be double buffered.
     * You nearly always want to use double buffering. This is a hard constraint.
     * Possible values are {@link #TRUE} and {@link #FALSE}.</li>
     * </ul>
     */
    public static final int RED_BITS = 0x00021001,
        GREEN_BITS = 0x00021002,
        BLUE_BITS = 0x00021003,
        ALPHA_BITS = 0x00021004,
        DEPTH_BITS = 0x00021005,
        STENCIL_BITS = 0x00021006,
        ACCUM_RED_BITS = 0x00021007,
        ACCUM_GREEN_BITS = 0x00021008,
        ACCUM_BLUE_BITS = 0x00021009,
        ACCUM_ALPHA_BITS = 0x0002100A,
        AUX_BUFFERS = 0x0002100B,
        STEREO = 0x0002100C,
        SAMPLES = 0x0002100D,
        SRGB_CAPABLE = 0x0002100E,
        DOUBLEBUFFER = 0x00021010;

    /**
     * <b>REFRESH_RATE</b> specifies the desired refresh rate for full screen windows.
     * A value of {@link #DONT_CARE} means the highest available refresh rate will be used.
     * This hint is ignored for windowed mode windows.
     */
    public static final int REFRESH_RATE = 0x0002100F;

    /**
     * <h4>Context related hints</h4>
     * <ul>
     * <li>{@link #CLIENT_API}: specifies which client API to create the context for.
     * Possible values are {@link #OPENGL_API}, {@link #OPENGL_ES_API} and {@link #NO_API}.
     * This is a hard constraint.</li>
     * <li>{@link #CONTEXT_CREATION_API}: specifies which context creation API to use to create the context.
     * Possible values are {@link #NATIVE_CONTEXT_API}, {@link #EGL_CONTEXT_API} and {@link #OSMESA_CONTEXT_API}.
     * This is a hard constraint. If no client API is requested, this hint is ignored.
     * <p>
     * An <a href="https://www.glfw.org/docs/latest/context_guide.html#context_glext_auto">extension loader library</a>
     * that assumes it knows which API was used to create the current context may fail if you change this hint.
     * This can be resolved by having it load functions via {@link #ngetProcAddress(MemorySegment) getProcAddress}.
     * <p>
     * <b>Note</b><br>
     * <b>Wayland:</b> The EGL API is the native context creation API, so this hint will have no effect.<br>
     * <b>X11:</b> On some Linux systems, creating contexts via both the native and EGL APIs in a single process
     * will cause the application to segfault. Stick to one API or the other on Linux for now.<br>
     * <b>OSMesa:</b> As its name implies, an OpenGL context created with OSMesa does not update the window contents
     * when its buffers are swapped. Use OpenGL functions or the OSMesa native access functions
     * {@link GLFWNative#ngetOSMesaColorBuffer getOSMesaColorBuffer} and {@link GLFWNative#ngetOSMesaDepthBuffer getOSMesaDepthBuffer}
     * to retrieve the framebuffer contents.
     * </li>
     * <li>{@link #CONTEXT_VERSION_MAJOR} and {@link #CONTEXT_VERSION_MINOR}: specify the client API version
     * that the created context must be compatible with.
     * The exact behavior of these hints depend on the requested client API.
     * <p>
     * While there is no way to ask the driver for a context of the highest supported version,
     * GLFW will attempt to provide this when you ask for a version 1.0 context,
     * which is the default for these hints.
     * <p>
     * Do not confuse these hints with {@link #VERSION_MAJOR} and {@link #VERSION_MINOR},
     * which provide the API version of the GLFW header.
     * <p>
     * <b>Note</b><br>
     * <b>OpenGL:</b> These hints are not hard constraints, but creation will fail if the OpenGL version
     * of the created context is less than the one requested. It is therefore perfectly safe to use the default
     * of version 1.0 for legacy code and you will still get backwards-compatible contexts of version 3.0 and above when available.<br>
     * <b>OpenGL ES:</b> These hints are not hard constraints, but creation will fail if the OpenGL ES version
     * of the created context is less than the one requested. Additionally, OpenGL ES 1.x cannot be returned
     * if 2.0 or later was requested, and vice versa. This is because OpenGL ES 3.x is backward compatible with 2.0,
     * but OpenGL ES 2.0 is not backward compatible with 1.x.<br>
     * <b>macOS:</b> The OS only supports forward-compatible core profile contexts for OpenGL versions 3.2 and later.
     * Before creating an OpenGL context of version 3.2 or later you must set the {@link #OPENGL_FORWARD_COMPAT}
     * and {@link #OPENGL_PROFILE} hints accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.
     * </li>
     * <li>{@link #OPENGL_FORWARD_COMPAT}: specifies whether the OpenGL context should be forward-compatible,
     * i.e. one where all functionality deprecated in the requested version of OpenGL is removed.
     * This must only be used if the requested OpenGL version is 3.0 or above.
     * If OpenGL ES is requested, this hint is ignored.
     * <p>
     * Forward-compatibility is described in detail in the <a href="https://www.opengl.org/registry/">OpenGL Reference Manual</a>.
     * </li>
     * <li>{@link #OPENGL_DEBUG_CONTEXT}: specifies whether the context should be created in debug mode,
     * which may provide additional error and diagnostic reporting functionality. Possible values are {@link #TRUE} and {@link #FALSE}.
     * <p>
     * Debug contexts for OpenGL and OpenGL ES are described in detail
     * by the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_debug.txt">GL_KHR_debug</a> extension.
     * </li>
     * <li>{@link #OPENGL_PROFILE}: specifies which OpenGL profile to create the context for.
     * Possible values are one of {@link #OPENGL_CORE_PROFILE} or {@link #OPENGL_COMPAT_PROFILE},
     * or {@link #OPENGL_ANY_PROFILE} to not request a specific profile. If requesting an OpenGL version below 3.2,
     * {@link #OPENGL_ANY_PROFILE} must be used. If OpenGL ES is requested, this hint is ignored.
     * <p>
     * OpenGL profiles are described in detail in the <a href="https://www.opengl.org/registry/">OpenGL Reference Manual</a>.
     * </li>
     * <li>{@link #CONTEXT_ROBUSTNESS}: specifies the robustness strategy to be used by the context.
     * This can be one of {@link #NO_RESET_NOTIFICATION} or {@link #LOSE_CONTEXT_ON_RESET},
     * or {@link #NO_ROBUSTNESS} to not request a robustness strategy.</li>
     * <li>{@link #CONTEXT_RELEASE_BEHAVIOR}: specifies the release behavior to be used by the context.
     * Possible values are one of {@link #ANY_RELEASE_BEHAVIOR}, {@link #RELEASE_BEHAVIOR_FLUSH} or {@link #RELEASE_BEHAVIOR_NONE}.
     * If the behavior is {@link #ANY_RELEASE_BEHAVIOR}, the default behavior of the context creation API will be used.
     * If the behavior is {@link #RELEASE_BEHAVIOR_FLUSH}, the pipeline will be flushed whenever the context is released from being the current one.
     * If the behavior is {@link #RELEASE_BEHAVIOR_NONE}, the pipeline will not be flushed on release.
     * <p>
     * Context release behaviors are described in detail
     * by the <a href="https://www.opengl.org/registry/specs/KHR/context_flush_control.txt">GL_KHR_context_flush_control</a> extension.
     * </li>
     * <li>{@link #CONTEXT_NO_ERROR}: specifies whether errors should be generated by the context.
     * Possible values are {@link #TRUE} and {@link #FALSE}. If enabled, situations that would have generated errors instead cause undefined behavior.
     * <p>
     * The no error mode for OpenGL and OpenGL ES is described in detail
     * by the <a href="https://www.opengl.org/registry/specs/KHR/no_error.txt">GL_KHR_no_error</a> extension.
     * </li>
     * </ul>
     */
    public static final int CLIENT_API = 0x00022001,
        CONTEXT_VERSION_MAJOR = 0x00022002,
        CONTEXT_VERSION_MINOR = 0x00022003,
        CONTEXT_ROBUSTNESS = 0x00022005,
        OPENGL_FORWARD_COMPAT = 0x00022006,
        OPENGL_DEBUG_CONTEXT = 0x00022007,
        OPENGL_PROFILE = 0x00022008,
        CONTEXT_RELEASE_BEHAVIOR = 0x00022009,
        CONTEXT_NO_ERROR = 0x0002200A,
        CONTEXT_CREATION_API = 0x0002200B;

    /**
     * {@link #CONTEXT_VERSION_MAJOR}, {@link #CONTEXT_VERSION_MINOR} and {@code CONTEXT_REVISION} indicate the client API version of the window's context.
     */
    public static final int CONTEXT_REVISION = 0x00022004;

    /**
     * <h4>macOS specific window hints</h4>
     * <ul>
     * <li>{@link #COCOA_RETINA_FRAMEBUFFER}: specifies whether to use full resolution framebuffers on Retina displays.
     * Possible values are {@link #TRUE} and {@link #FALSE}. This is ignored on other platforms.</li>
     * <li>{@link #COCOA_FRAME_NAME}: specifies the UTF-8 encoded name to use for autosaving the window frame,
     * or if empty disables frame autosaving for the window.
     * This is ignored on other platforms. This is set with {@link #windowHintString}.</li>
     * <li>{@link #COCOA_GRAPHICS_SWITCHING}: specifies whether to in Automatic Graphics Switching,
     * i.e. to allow the system to choose the integrated GPU for the OpenGL context and move it between GPUs
     * if necessary or whether to force it to always run on the discrete GPU. This only affects systems
     * with both integrated and discrete GPUs. Possible values are {@link #TRUE} and {@link #FALSE}.
     * This is ignored on other platforms.
     * <p>
     * Simpler programs and tools may want to enable this to save power,
     * while games and other applications performing advanced rendering will want to leave it disabled.
     * <p>
     * A bundled application that wishes to participate in Automatic Graphics Switching should also declare this
     * in its {@code Info.plist} by setting the {@code NSSupportsAutomaticGraphicsSwitching} key to {@code true}.
     * </li>
     * </ul>
     */
    public static final int COCOA_RETINA_FRAMEBUFFER = 0x00023001,
        COCOA_FRAME_NAME = 0x00023002,
        COCOA_GRAPHICS_SWITCHING = 0x00023003;

    /**
     * <h4>X11 specific window hints</h4>
     * {@link #X11_CLASS_NAME} and {@link #X11_INSTANCE_NAME} specifies the desired ASCII encoded class and instance parts
     * of the ICCCM {@code WM_CLASS} window property. These are set with {@link #windowHintString}.
     */
    public static final int X11_CLASS_NAME = 0x00024001,
        X11_INSTANCE_NAME = 0x00024002;

    /**
     * value for CLIENT_API
     *
     * @see #CLIENT_API
     */
    public static final int NO_API = 0,
        OPENGL_API = 0x00030001,
        OPENGL_ES_API = 0x00030002;

    /**
     * value for CONTEXT_ROBUSTNESS
     *
     * @see #CONTEXT_ROBUSTNESS
     */
    public static final int NO_ROBUSTNESS = 0,
        NO_RESET_NOTIFICATION = 0x00031001,
        LOSE_CONTEXT_ON_RESET = 0x00031002;

    /**
     * value for OPENGL_PROFILE
     *
     * @see #OPENGL_PROFILE
     */
    public static final int OPENGL_ANY_PROFILE = 0,
        OPENGL_CORE_PROFILE = 0x00032001,
        OPENGL_COMPAT_PROFILE = 0x00032002;

    public static final int CURSOR = 0x00033001;
    public static final int STICKY_KEYS = 0x00033002;
    public static final int STICKY_MOUSE_BUTTONS = 0x00033003;
    public static final int LOCK_KEY_MODS = 0x00033004;
    public static final int RAW_MOUSE_MOTION = 0x00033005;

    /**
     * <h4>Cursor mode</h4>
     * The {@code CURSOR} input mode provides several cursor modes for special forms of mouse motion input.
     * By default, the cursor mode is {@code CURSOR_NORMAL}, meaning the regular arrow cursor
     * (or another cursor set with {@link #setCursor}) is used and cursor motion is not limited.
     * <p>
     * If you wish to implement mouse motion based camera controls or other input schemes
     * that require unlimited mouse movement, set the cursor mode to {@code CURSOR_DISABLED}.
     * <!-- todo don't use snippet because some bugs -->
     * <pre>{@code
     * GLFW.setInputMode(window, GLFW.CURSOR, GLFW.CURSOR_DISABLED);
     * }</pre>
     * This will hide the cursor and lock it to the specified window. GLFW will then take care of all the details of cursor re-centering
     * and offset calculation and providing the application with a virtual cursor position. This virtual position is provided normally
     * via both the cursor position callback and through polling.
     * <p>
     * <b>Note</b><br>
     * You should not implement your own version of this functionality using other features of GLFW.
     * It is not supported and will not work as robustly as {@code CURSOR_DISABLED}.
     * <p>
     * If you only wish the cursor to become hidden when it is over a window but still want it to behave normally,
     * set the cursor mode to {@code CURSOR_HIDDEN}.
     * <pre>{@code
     * GLFW.setInputMode(window, GLFW.CURSOR, GLFW.CURSOR_HIDDEN);
     * }</pre>
     * This mode puts no limit on the motion of the cursor.
     * <p>
     * To exit out of either of these special modes, restore the {@code CURSOR_NORMAL} cursor mode.
     * <pre>{@code
     * GLFW.setInputMode(window, GLFW.CURSOR, GLFW.CURSOR_NORMAL);
     * }</pre>
     */
    public static final int CURSOR_NORMAL = 0x00034001,
        CURSOR_HIDDEN = 0x00034002,
        CURSOR_DISABLED = 0x00034003;

    public static final int ANY_RELEASE_BEHAVIOR = 0;
    public static final int RELEASE_BEHAVIOR_FLUSH = 0x00035001;
    public static final int RELEASE_BEHAVIOR_NONE = 0x00035002;

    public static final int NATIVE_CONTEXT_API = 0x00036001;
    public static final int EGL_CONTEXT_API = 0x00036002;
    public static final int OSMESA_CONTEXT_API = 0x00036003;

    /**
     * The regular arrow cursor.
     */
    public static final int ARROW_CURSOR = 0x00036001;
    /**
     * The text input I-beam cursor shape.
     */
    public static final int IBEAM_CURSOR = 0x00036002;
    /**
     * The crosshair shape.
     */
    public static final int CROSSHAIR_CURSOR = 0x00036003;
    /**
     * The hand shape.
     */
    public static final int HAND_CURSOR = 0x00036004;
    /**
     * The horizontal resize arrow shape.
     */
    public static final int HRESIZE_CURSOR = 0x00036005;
    /**
     * The vertical resize arrow shape.
     */
    public static final int VRESIZE_CURSOR = 0x00036006;

    public static final int CONNECTED = 0x00040001;
    public static final int DISCONNECTED = 0x00040002;

    /**
     * {@code JOYSTICK_HAT_BUTTONS} specifies whether to also expose joystick hats as buttons,
     * for compatibility with earlier versions of GLFW that did not have {@link #getJoystickHats}.
     * Possible values are {@link #TRUE} and {@link #FALSE}.
     */
    public static final int JOYSTICK_HAT_BUTTONS = 0x00050001;
    /**
     * <h4>macOS specific init hints</h4>
     * <ul>
     * <li>{@link #COCOA_CHDIR_RESOURCES}: specifies whether to set the current directory to the application
     * to the {@code Contents/Resources} subdirectory of the application's bundle, if present. Set this with {@link #initHint}.</li>
     * <li>{@link #COCOA_MENUBAR}: specifies whether to create a basic menu bar, either from a nib or manually,
     * when the first window is created, which is when AppKit is initialized. Set this with {@link #initHint}.</li>
     * </ul>
     */
    public static final int COCOA_CHDIR_RESOURCES = 0x00051001,
        COCOA_MENUBAR = 0x00051002;

    /**
     * Don't care value.
     */
    public static final int DONT_CARE = -1;

    static {
        create();
    }

    private GLFW() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Converts the given error code to a readable string.
     *
     * @param errorCode the error code.
     * @return the error string.
     */
    public static String getErrorString(int errorCode) {
        return switch (errorCode) {
            case NO_ERROR -> "NO_ERROR";
            case NOT_INITIALIZED -> "NOT_INITIALIZED";
            case NO_CURRENT_CONTEXT -> "NO_CURRENT_CONTEXT";
            case INVALID_ENUM -> "INVALID_ENUM";
            case INVALID_VALUE -> "INVALID_VALUE";
            case OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case API_UNAVAILABLE -> "API_UNAVAILABLE";
            case VERSION_UNAVAILABLE -> "VERSION_UNAVAILABLE";
            case PLATFORM_ERROR -> "PLATFORM_ERROR";
            case FORMAT_UNAVAILABLE -> "FORMAT_UNAVAILABLE";
            case NO_WINDOW_CONTEXT -> "NO_WINDOW_CONTEXT";
            default -> RuntimeHelper.unknownToken(errorCode);
        };
    }

    /**
     * Initializes the GLFW library.
     * <p>
     * This function initializes the GLFW library.  Before most GLFW functions can
     * be used, GLFW must be initialized, and before an application terminates GLFW
     * should be terminated in order to free any resources allocated during or
     * after initialization.
     * <p>
     * If this function fails, it calls {@link #terminate} before returning.  If it
     * succeeds, you should call {@link #terminate} before the application exits.
     * <p>
     * Additional calls to this function after successful initialization but before
     * termination will return {@code true} immediately.
     *
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>macOS:</b> This function will change the current directory of the
     * application to the {@code Contents/Resources} subdirectory of the application's
     * bundle, if present.  This can be disabled with the
     * {@link #COCOA_CHDIR_RESOURCES} init hint.<br>
     *
     * <b>X11:</b> This function will set the {@code LC_CTYPE} category of the
     * application locale according to the current environment if that category is
     * still "C".  This is because the "C" locale breaks Unicode text input.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #terminate
     */
    public static boolean init() {
        try {
            return (int) glfwInit.invokeExact() != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Terminates the GLFW library.
     * <p>
     * This function destroys all remaining windows and cursors, restores any
     * modified gamma ramps and frees any other allocated resources.  Once this
     * function is called, you must again call {@link #init} successfully before
     * you will be able to use most GLFW functions.
     * <p>
     * If GLFW has been successfully initialized, this function should be called
     * before the application exits.  If initialization fails, there is no need to
     * call this function, as it is called by {@link #init} before it returns
     * failure.
     * <p>
     * This function has no effect if GLFW is not initialized.
     *
     * @glfw.errors Possible errors include {@link #PLATFORM_ERROR}.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.warning The contexts of any remaining windows must not be current on any
     * other thread when this function is called.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #init
     */
    public static void terminate() {
        try {
            glfwTerminate.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the specified init hint to the desired value.
     * <p>
     * This function sets hints for the next initialization of GLFW.
     * The values you set hints to are never reset by GLFW, but they only take
     * effect during initialization.  Once GLFW has been initialized, any values
     * you set will be ignored until the library is terminated and initialized
     * again.
     * <p>
     * Some hints are platform specific.  These may be set on any platform, but they
     * will only affect their specific platform.  Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.
     *
     * @param hint  The <a href="https://www.glfw.org/docs/latest/intro_guide.html#init_hints">init hint</a> to set.
     * @param value The new value of the init hint.
     * @glfw.errors Possible errors include {@link #INVALID_ENUM} and {@link #INVALID_VALUE}.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #init() init
     */
    public static void initHint(int hint, int value) {
        try {
            glfwInitHint.invokeExact(hint, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the version of the GLFW library.
     * <p>
     * This function retrieves the major, minor and revision numbers of the GLFW
     * library.  It is intended for when you are using GLFW as a shared library and
     * want to ensure that you are using the minimum required version.
     * <p>
     * Any or all of the version arguments may be {@link MemorySegment#NULL NULL}.
     *
     * @param major Where to store the major version number, or {@link MemorySegment#NULL NULL}.
     * @param minor Where to store the minor version number, or {@link MemorySegment#NULL NULL}.
     * @param rev   Where to store the revision number, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors None.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #ngetVersionString() getVersionString
     */
    public static void ngetVersion(MemorySegment major, MemorySegment minor, MemorySegment rev) {
        try {
            glfwGetVersion.invokeExact(major, minor, rev);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the version of the GLFW library.
     *
     * @param major Where to store the major version number, or {@code null}.
     * @param minor Where to store the minor version number, or {@code null}.
     * @param rev   Where to store the revision number, or {@code null}.
     * @see #ngetVersion(MemorySegment, MemorySegment, MemorySegment) ngetVersion
     */
    public static void getVersion(int @Nullable [] major, int @Nullable [] minor, int @Nullable [] rev) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pMajor = major != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pMinor = minor != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pRev = rev != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetVersion(pMajor, pMinor, pRev);
            if (major != null && major.length > 0) {
                major[0] = pMajor.get(JAVA_INT, 0);
            }
            if (minor != null && minor.length > 0) {
                minor[0] = pMinor.get(JAVA_INT, 0);
            }
            if (rev != null && rev.length > 0) {
                rev[0] = pRev.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the version of the GLFW library.
     *
     * @return the major, minor and revision version number
     * @see #ngetVersion(MemorySegment, MemorySegment, MemorySegment) ngetVersion
     */
    public static ValueInt3 getVersion() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pMajor = stack.calloc(JAVA_INT);
            var pMinor = stack.calloc(JAVA_INT);
            var pRev = stack.calloc(JAVA_INT);
            ngetVersion(pMajor, pMinor, pRev);
            return new ValueInt3(pMajor.get(JAVA_INT, 0),
                pMinor.get(JAVA_INT, 0),
                pRev.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns a string describing the compile-time configuration.
     * <p>
     * This function returns the compile-time generated
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_version_string">version string</a>
     * of the GLFW library binary.  It describes the version, platform, compiler and any platform-specific
     * compile-time options.  It should not be confused with the OpenGL or OpenGL
     * ES version string, queried with {@code GL.getString}.
     * <p>
     * <b>Do not use the version string</b> to parse the GLFW library version.  The
     * {@link #ngetVersion getVersion} function provides the version of the running library
     * binary in numerical format.
     *
     * @return The ASCII encoded GLFW version string.
     * @glfw.errors None.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #ngetVersion(MemorySegment, MemorySegment, MemorySegment) getVersion
     */
    public static MemorySegment ngetVersionString() {
        try {
            return (MemorySegment) glfwGetVersionString.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns a string describing the compile-time configuration.
     *
     * @return The ASCII encoded GLFW version string.
     * @see #ngetVersionString() ngetVersionString
     */
    public static String getVersionString() {
        return ngetVersionString().getUtf8String(0);
    }

    /**
     * Returns and clears the last error for the calling thread.
     * <p>
     * This function returns and clears the <a href="https://www.glfw.org/docs/latest/group__errors.html">error code</a>
     * of the last error that occurred on the calling thread, and optionally a UTF-8 encoded
     * human-readable description of it.  If no error has occurred since the last
     * call, it returns {@link #NO_ERROR} (zero) and the description pointer is
     * set to {@link MemorySegment#NULL NULL}.
     *
     * @param description Where to store the error description pointer, or {@link MemorySegment#NULL NULL}.
     * @return The last error code for the calling thread, or {@link #NO_ERROR} (zero).
     * @glfw.errors None.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is guaranteed to be valid only until the
     * next error occurs or the library is terminated.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #nsetErrorCallback(MemorySegment) setErrorCallback
     */
    public static int ngetError(MemorySegment description) {
        try {
            return (int) glfwGetError.invokeExact(description);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns and clears the last error for the calling thread.
     *
     * @param description Where to store the error description pointer, or {@code null}.
     * @return The last error code for the calling thread, or {@link #NO_ERROR} (zero).
     * @see #ngetError(MemorySegment) ngetError
     */
    public static int getError(String @Nullable [] description) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = description != null ? stack.malloc(ADDRESS) : MemorySegment.NULL;
            final int err = ngetError(seg);
            if (description != null && description.length > 0) {
                description[0] = RuntimeHelper.unboundPointerString(seg);
            }
            return err;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns and clears the last error for the calling thread.
     *
     * @return the error description pointer. and the last error code for the calling thread, or {@link #NO_ERROR} (zero)
     * @see #ngetError(MemorySegment) ngetError
     */
    public static Value2.OfObjInt<String> getError() {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.malloc(ADDRESS);
            final int err = ngetError(seg);
            return new Value2.OfObjInt<>(RuntimeHelper.unboundPointerString(seg), err);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Sets the error callback.
     * <p>
     * This function sets the error callback, which is called with an error code
     * and a human-readable description each time a GLFW error occurs.
     * <p>
     * The error code is set before the callback is called.  Calling
     * {@link #getError} from the error callback will return the same value as the error
     * code argument.
     * <p>
     * The error callback is called on the thread where the error occurred.  If you
     * are using GLFW from multiple threads, your error callback needs to be
     * written accordingly.
     * <p>
     * Because the description string may have been generated specifically for that
     * error, it is not guaranteed to be valid after the callback has returned.  If
     * you wish to use it after the callback returns, you need to make a copy.
     * <p>
     * Once set, the error callback remains set even after the library has been
     * terminated.
     *
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set.
     * @glfw.errors None.
     * @glfw.remark This function may be called before {@link #init}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetError(MemorySegment) getError
     */
    public static MemorySegment nsetErrorCallback(MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetErrorCallback.invokeExact(callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the error callback.
     *
     * @param callback The new callback, or {@code null} to remove the currently set callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set.
     * @see #nsetErrorCallback(MemorySegment) nsetErrorCallback
     */
    public static MemorySegment setErrorCallback(@Nullable IGLFWErrorFun callback) {
        return nsetErrorCallback(callback != null ? callback.address(Arena.global()) : MemorySegment.NULL);
    }

    /**
     * Returns the currently connected monitors.
     * <p>
     * This function returns an array of handles for all currently connected
     * monitors.  The primary monitor is always first in the returned array.  If no
     * monitors were found, this function returns {@link MemorySegment#NULL NULL}.
     *
     * @param count Where to store the number of monitors in the returned array.
     *              This is set to zero if an error occurred.
     * @return An array of monitor handles, or {@link MemorySegment#NULL NULL} if no monitors were found or
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is guaranteed to be valid only until the
     * monitor configuration changes or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #getPrimaryMonitor() getPrimaryMonitor
     */
    public static MemorySegment ngetMonitors(MemorySegment count) {
        try {
            return (MemorySegment) glfwGetMonitors.invokeExact(count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the currently connected monitors.
     *
     * @return An array of monitor handles, or {@code null} if no monitors were found or
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetMonitors(MemorySegment) ngetMonitors
     */
    public static MemorySegment @Nullable [] getMonitors() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pCount = stack.calloc(JAVA_INT);
            var pMonitors = ngetMonitors(pCount);
            return RuntimeHelper.isNullptr(pMonitors) ?
                null :
                RuntimeHelper.toArray(pMonitors, new MemorySegment[pCount.get(JAVA_INT, 0)]);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the primary monitor.
     * <p>
     * This function returns the primary monitor.  This is usually the monitor
     * where elements like the task bar or global menu bar are located.
     *
     * @return The primary monitor, or {@link MemorySegment#NULL NULL} if no monitors were found or if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @glfw.remark The primary monitor is always first in the array returned by
     * {@link #ngetMonitors(MemorySegment) getMonitors}.
     * @see #ngetMonitors(MemorySegment) getMonitors
     */
    public static MemorySegment getPrimaryMonitor() {
        try {
            return (MemorySegment) glfwGetPrimaryMonitor.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the position of the monitor's viewport on the virtual screen.
     * <p>
     * This function returns the position, in screen coordinates, of the upper-left
     * corner of the specified monitor.
     * <p>
     * Any or all of the position arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} position arguments will be set to zero.
     *
     * @param monitor The monitor to query.
     * @param xpos    Where to store the monitor x-coordinate, or {@link MemorySegment#NULL NULL}.
     * @param ypos    Where to store the monitor y-coordinate, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void ngetMonitorPos(MemorySegment monitor, MemorySegment xpos, MemorySegment ypos) {
        try {
            glfwGetMonitorPos.invokeExact(monitor, xpos, ypos);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the position of the monitor's viewport on the virtual screen.
     *
     * @param monitor The monitor to query.
     * @param xpos    Where to store the monitor x-coordinate, or {@code null}.
     * @param ypos    Where to store the monitor y-coordinate, or {@code null}.
     * @see #ngetMonitorPos(MemorySegment, MemorySegment, MemorySegment) ngetMonitorPos
     */
    public static void getMonitorPos(MemorySegment monitor, int @Nullable [] xpos, int @Nullable [] ypos) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xpos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var py = ypos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetMonitorPos(monitor, px, py);
            if (xpos != null && xpos.length > 0) {
                xpos[0] = px.get(JAVA_INT, 0);
            }
            if (ypos != null && ypos.length > 0) {
                ypos[0] = py.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the position of the monitor's viewport on the virtual screen.
     *
     * @param monitor The monitor to query.
     * @return the monitor xy-coordinate
     * @see #ngetMonitorPos(MemorySegment, MemorySegment, MemorySegment) ngetMonitorPos
     */
    public static Value2.OfInt getMonitorPos(MemorySegment monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            ngetMonitorPos(monitor, px, py);
            return new Value2.OfInt(px.get(JAVA_INT, 0), py.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the work area of the monitor.
     * <p>
     * This function returns the position, in screen coordinates, of the upper-left
     * corner of the work area of the specified monitor along with the work area
     * size in screen coordinates. The work area is defined as the area of the
     * monitor not occluded by the operating system task bar where present. If no
     * task bar exists then the work area is the monitor resolution in screen
     * coordinates.
     * <p>
     * Any or all of the position and size arguments may be {@link MemorySegment#NULL NULL}.  If an error
     * occurs, all non-{@link MemorySegment#NULL NULL} position and size arguments will be set to zero.
     *
     * @param monitor The monitor to query.
     * @param xpos    Where to store the monitor x-coordinate, or {@link MemorySegment#NULL NULL}.
     * @param ypos    Where to store the monitor y-coordinate, or {@link MemorySegment#NULL NULL}.
     * @param width   Where to store the monitor width, or {@link MemorySegment#NULL NULL}.
     * @param height  Where to store the monitor height, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void ngetMonitorWorkarea(MemorySegment monitor, MemorySegment xpos, MemorySegment ypos, MemorySegment width, MemorySegment height) {
        try {
            glfwGetMonitorWorkarea.invokeExact(monitor, xpos, ypos, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the work area of the monitor.
     *
     * @param monitor The monitor to query.
     * @param xpos    Where to store the monitor x-coordinate, or {@code null}.
     * @param ypos    Where to store the monitor y-coordinate, or {@code null}.
     * @param width   Where to store the monitor width, or {@code null}.
     * @param height  Where to store the monitor height, or {@code null}.
     * @see #ngetMonitorWorkarea(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetMonitorWorkarea
     */
    public static void getMonitorWorkarea(MemorySegment monitor, int @Nullable [] xpos, int @Nullable [] ypos, int @Nullable [] width, int @Nullable [] height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xpos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var py = ypos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pw = width != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var ph = height != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetMonitorWorkarea(monitor, px, py, pw, ph);
            if (xpos != null && xpos.length > 0) {
                xpos[0] = px.get(JAVA_INT, 0);
            }
            if (ypos != null && ypos.length > 0) {
                ypos[0] = py.get(JAVA_INT, 0);
            }
            if (width != null && width.length > 0) {
                width[0] = pw.get(JAVA_INT, 0);
            }
            if (height != null && height.length > 0) {
                height[0] = ph.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the work area of the monitor.
     *
     * @param monitor The monitor to query.
     * @return the monitor xy-coordinate, the monitor width and the monitor height
     * @see #ngetMonitorWorkarea(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetMonitorWorkarea
     */
    public static ValueInt4 getMonitorWorkarea(MemorySegment monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pw = stack.calloc(JAVA_INT);
            var ph = stack.calloc(JAVA_INT);
            ngetMonitorWorkarea(monitor, px, py, pw, ph);
            return new ValueInt4(px.get(JAVA_INT, 0),
                py.get(JAVA_INT, 0),
                pw.get(JAVA_INT, 0),
                ph.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the physical size of the monitor.
     * <p>
     * This function returns the size, in millimetres, of the display area of the
     * specified monitor.
     * <p>
     * Some systems do not provide accurate monitor size information, either
     * because the monitor
     * <a href="https://en.wikipedia.org/wiki/Extended_display_identification_data">EDID</a>
     * data is incorrect or because the driver does not report it accurately.
     * <p>
     * Any or all of the size arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} size arguments will be set to zero.
     *
     * @param monitor  The monitor to query.
     * @param widthMM  Where to store the width, in millimetres, of the
     *                 monitor's display area, or {@link MemorySegment#NULL NULL}.
     * @param heightMM Where to store the height, in millimetres, of the
     *                 monitor's display area, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.remark <b>Windows:</b> On Windows 8 and earlier the physical size is calculated from
     * the current resolution and system DPI instead of querying the monitor EDID data.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void ngetMonitorPhysicalSize(MemorySegment monitor, MemorySegment widthMM, MemorySegment heightMM) {
        try {
            glfwGetMonitorPhysicalSize.invokeExact(monitor, widthMM, heightMM);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the physical size of the monitor.
     *
     * @param monitor  The monitor to query.
     * @param widthMM  Where to store the width, in millimetres, of the
     *                 monitor's display area, or {@code null}.
     * @param heightMM Where to store the height, in millimetres, of the
     *                 monitor's display area, or {@code null}.
     * @see #ngetMonitorPhysicalSize(MemorySegment, MemorySegment, MemorySegment) ngetMonitorPhysicalSize
     */
    public static void getMonitorPhysicalSize(MemorySegment monitor, int @Nullable [] widthMM, int @Nullable [] heightMM) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = widthMM != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var ph = heightMM != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetMonitorPhysicalSize(monitor, pw, ph);
            if (widthMM != null && widthMM.length > 0) {
                widthMM[0] = pw.get(JAVA_INT, 0);
            }
            if (heightMM != null && heightMM.length > 0) {
                heightMM[0] = ph.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the physical size of the monitor.
     *
     * @param monitor The monitor to query.
     * @return the width and height, in millimetres, of the monitor's display area.
     * @see #ngetMonitorPhysicalSize(MemorySegment, MemorySegment, MemorySegment) ngetMonitorPhysicalSize
     */
    public static Value2.OfInt getMonitorPhysicalSize(MemorySegment monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = stack.calloc(JAVA_INT);
            var ph = stack.calloc(JAVA_INT);
            ngetMonitorPhysicalSize(monitor, pw, ph);
            return new Value2.OfInt(pw.get(JAVA_INT, 0), ph.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the content scale for the specified monitor.
     * <p>
     * This function retrieves the content scale for the specified monitor.  The
     * content scale is the ratio between the current DPI and the platform's
     * default DPI.  This is especially important for text and any UI elements.  If
     * the pixel dimensions of your UI scaled by this look appropriate on your
     * machine then it should appear at a reasonable size on other machines
     * regardless of their DPI and scaling settings.  This relies on the system DPI
     * and scaling settings being somewhat correct.
     * <p>
     * The content scale may depend on both the monitor resolution and pixel
     * density and on user settings.  It may be very different from the raw DPI
     * calculated from the physical size and current resolution.
     *
     * @param monitor The monitor to query.
     * @param xscale  Where to store the x-axis content scale, or {@link MemorySegment#NULL NULL}.
     * @param yscale  Where to store the y-axis content scale, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) getWindowContentScale
     */
    public static void ngetMonitorContentScale(MemorySegment monitor, MemorySegment xscale, MemorySegment yscale) {
        try {
            glfwGetMonitorContentScale.invokeExact(monitor, xscale, yscale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the content scale for the specified monitor.
     *
     * @param monitor The monitor to query.
     * @param xscale  Where to store the x-axis content scale, or {@code null}.
     * @param yscale  Where to store the y-axis content scale, or {@code null}.
     * @see #ngetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) ngetMonitorContentScale
     */
    public static void getMonitorContentScale(MemorySegment monitor, float @Nullable [] xscale, float @Nullable [] yscale) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xscale != null ? stack.calloc(JAVA_FLOAT) : MemorySegment.NULL;
            var py = yscale != null ? stack.calloc(JAVA_FLOAT) : MemorySegment.NULL;
            ngetMonitorContentScale(monitor, px, py);
            if (xscale != null && xscale.length > 0) {
                xscale[0] = px.get(JAVA_FLOAT, 0);
            }
            if (yscale != null && yscale.length > 0) {
                yscale[0] = py.get(JAVA_FLOAT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the content scale for the specified monitor.
     *
     * @param monitor The monitor to query.
     * @return the xy-axis content scale
     * @see #ngetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) ngetMonitorContentScale
     */
    public static Value2.OfFloat getMonitorContentScale(MemorySegment monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_FLOAT);
            var py = stack.calloc(JAVA_FLOAT);
            ngetMonitorContentScale(monitor, px, py);
            return new Value2.OfFloat(px.get(JAVA_FLOAT, 0), py.get(JAVA_FLOAT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the name of the specified monitor.
     * <p>
     * This function returns a human-readable name, encoded as UTF-8, of the
     * specified monitor.  The name typically reflects the make and model of the
     * monitor and is not guaranteed to be unique among the connected monitors.
     *
     * @param monitor The monitor to query.
     * @return The UTF-8 encoded name of the monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified monitor is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment ngetMonitorName(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetMonitorName.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the name of the specified monitor.
     *
     * @param monitor The monitor to query.
     * @return The UTF-8 encoded name of the monitor, or {@code null} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetMonitorName(MemorySegment) ngetMonitorName
     */
    @Nullable
    public static String getMonitorName(MemorySegment monitor) {
        var pName = ngetMonitorName(monitor);
        return RuntimeHelper.isNullptr(pName) ? null : pName.getUtf8String(0);
    }

    /**
     * Sets the user pointer of the specified monitor.
     * <p>
     * This function sets the user-defined pointer of the specified monitor.  The
     * current value is retained until the monitor is disconnected.  The initial
     * value is {@link MemorySegment#NULL NULL}.
     * <p>
     * This function may be called from the monitor callback, even for a monitor
     * that is being disconnected.
     *
     * @param monitor The monitor whose pointer to set.
     * @param pointer The new value.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #getMonitorUserPointer(MemorySegment) getMonitorUserPointer
     */
    public static void setMonitorUserPointer(MemorySegment monitor, MemorySegment pointer) {
        try {
            glfwSetMonitorUserPointer.invokeExact(monitor, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * {@return the user pointer of the specified monitor.}
     * <p>
     * This function returns the current value of the user-defined pointer of the
     * specified monitor.  The initial value is {@link MemorySegment#NULL NULL}.
     * <p>
     * This function may be called from the monitor callback, even for a monitor
     * that is being disconnected.
     *
     * @param monitor The monitor whose pointer to return.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #setMonitorUserPointer(MemorySegment, MemorySegment) setMonitorUserPointer
     */
    public static MemorySegment getMonitorUserPointer(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetMonitorUserPointer.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the monitor configuration callback.
     * <p>
     * This function sets the monitor configuration callback, or removes the
     * currently set callback.  This is called when a monitor is connected to or
     * disconnected from the system.
     *
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWmonitor* monitor, int event)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWMonitorFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetMonitorCallback(MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetMonitorCallback.invokeExact(callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the monitor configuration callback.
     *
     * @param callback The new callback, or {@code null}  to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetMonitorCallback(MemorySegment) nsetMonitorCallback
     */
    public static MemorySegment setMonitorCallback(@Nullable IGLFWMonitorFun callback) {
        return nsetMonitorCallback(callback != null ? callback.address(Arena.global()) : MemorySegment.NULL);
    }

    /**
     * Returns the available video modes for the specified monitor.
     * <p>
     * This function returns an array of all video modes supported by the specified
     * monitor.  The returned array is sorted in ascending order, first by color
     * bit depth (the sum of all channel depths), then by resolution area (the
     * product of width and height), then resolution width and finally by refresh
     * rate.
     *
     * @param monitor The monitor to query.
     * @param count   Where to store the number of video modes in the returned
     *                array.  This is set to zero if an error occurred.
     * @return An array of video modes, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified monitor is
     * disconnected, this function is called again for that monitor or the library
     * is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetVideoMode(MemorySegment) getVideoMode
     */
    public static MemorySegment ngetVideoModes(MemorySegment monitor, MemorySegment count) {
        try {
            return (MemorySegment) glfwGetVideoModes.invokeExact(monitor, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the available video modes for the specified monitor.
     *
     * @param allocator The allocator that allocates the result.
     * @param monitor   The monitor to query.
     * @return An array of video modes, or {@code null} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetVideoModes(MemorySegment, MemorySegment) ngetVideoModes
     */
    public static @Nullable GLFWVidMode.Buffer getVideoModes(SegmentAllocator allocator, MemorySegment monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pCount = stack.calloc(JAVA_INT);
            var pModes = ngetVideoModes(monitor, pCount);
            return RuntimeHelper.isNullptr(pModes) ?
                null :
                new GLFWVidMode.Buffer(pModes, allocator, pCount.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the current mode of the specified monitor.
     * <p>
     * This function returns the current video mode of the specified monitor.  If
     * you have created a full screen window for that monitor, the return value
     * will depend on whether that window is iconified.
     *
     * @param monitor The monitor to query.
     * @return The current mode of the monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the specified monitor is
     * disconnected or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetVideoModes(MemorySegment, MemorySegment) getVideoModes
     */
    public static MemorySegment ngetVideoMode(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetVideoMode.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the current mode of the specified monitor.
     *
     * @param monitor The monitor to query.
     * @return The current mode of the monitor, or {@code null} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetVideoMode(MemorySegment) ngetVideoMode
     */
    @Nullable
    public static GLFWVidMode.Value getVideoMode(MemorySegment monitor) {
        var pMode = ngetVideoMode(monitor);
        if (RuntimeHelper.isNullptr(pMode)) return null;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            return new GLFWVidMode(pMode, stack).constCast();
        }
    }

    /**
     * Generates a gamma ramp and sets it for the specified monitor.
     * <p>
     * This function generates an appropriately sized gamma ramp from the specified
     * exponent and then calls {@link #setGammaRamp(MemorySegment, GLFWGammaRamp) setGammaRamp} with it.
     * The value must be a finite number greater than zero.
     * <p>
     * The software controlled gamma ramp is applied <i>in addition</i> to the hardware
     * gamma correction, which today is usually an approximation of sRGB gamma.
     * This means that setting a perfectly linear ramp, or gamma 1.0, will produce
     * the default (usually sRGB-like) behavior.
     * <p>
     * For gamma correct rendering with OpenGL or OpenGL ES, see the
     * {@link #SRGB_CAPABLE} hint.
     *
     * @param monitor The monitor whose gamma ramp to set.
     * @param gamma   The desired exponent.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> Gamma handling is a privileged protocol, this function
     * will thus never be implemented and emits {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void setGamma(MemorySegment monitor, float gamma) {
        try {
            glfwSetGamma.invokeExact(monitor, gamma);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the current gamma ramp for the specified monitor.
     * <p>
     * This function returns the current gamma ramp of the specified monitor.
     *
     * @param monitor The monitor to query.
     * @return The current gamma ramp, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> Gamma handling is a privileged protocol, this function
     * will thus never be implemented and emits {@link #PLATFORM_ERROR} while
     * returning {@link MemorySegment#NULL NULL}.
     * @glfw.pointer_lifetime The returned structure and its arrays are allocated and
     * freed by GLFW.  You should not free them yourself.  They are valid until the
     * specified monitor is disconnected, this function is called again for that
     * monitor or the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment ngetGammaRamp(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetGammaRamp.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the current gamma ramp for the specified monitor.
     *
     * @param monitor The monitor to query.
     * @return The current gamma ramp, or {@code null} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetGammaRamp(MemorySegment) ngetGammaRamp
     */
    @Nullable
    public static GLFWGammaRamp getGammaRamp(MemorySegment monitor) {
        var pRamp = ngetGammaRamp(monitor);
        if (RuntimeHelper.isNullptr(pRamp)) return null;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            return new GLFWGammaRamp(pRamp, stack);
        }
    }

    /**
     * Sets the current gamma ramp for the specified monitor.
     * <p>
     * This function sets the current gamma ramp for the specified monitor.  The
     * original gamma ramp for that monitor is saved by GLFW the first time this
     * function is called and is restored by {@link #terminate}.
     * <p>
     * The software controlled gamma ramp is applied <i>in addition</i> to the hardware
     * gamma correction, which today is usually an approximation of sRGB gamma.
     * This means that setting a perfectly linear ramp, or gamma 1.0, will produce
     * the default (usually sRGB-like) behavior.
     * <p>
     * For gamma correct rendering with OpenGL or OpenGL ES, see the
     * {@link #SRGB_CAPABLE} hint.
     *
     * @param monitor The monitor whose gamma ramp to set.
     * @param ramp    The gamma ramp to use.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark The size of the specified gamma ramp should match the size of the
     * current ramp for that monitor.
     * <p>
     * <b>Windows:</b> The gamma ramp size must be 256.
     * <p>
     * <b>Wayland:</b> Gamma handling is a privileged protocol, this function
     * will thus never be implemented and emits {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified gamma ramp is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void nsetGammaRamp(MemorySegment monitor, MemorySegment ramp) {
        try {
            glfwSetGammaRamp.invokeExact(monitor, ramp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the current gamma ramp for the specified monitor.
     *
     * @param monitor The monitor whose gamma ramp to set.
     * @param ramp    The gamma ramp to use.
     * @see #nsetGammaRamp(MemorySegment, MemorySegment) nsetGammaRamp
     */
    public static void setGammaRamp(MemorySegment monitor, GLFWGammaRamp ramp) {
        nsetGammaRamp(monitor, ramp.address());
    }

    /**
     * Resets all window hints to their default values.
     * <p>
     * This function resets all window hints to their
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints_values">default values</a>.
     *
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #windowHint(int, int) windowHint
     * @see #nwindowHintString(int, MemorySegment) windowHintString
     */
    public static void defaultWindowHints() {
        try {
            glfwDefaultWindowHints.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the specified window hint to the desired value.
     * <p>
     * This function sets hints for the next call to {@link #ncreateWindow createWindow}.  The
     * hints, once set, retain their values until changed by a call to this
     * function or {@link #defaultWindowHints}, or until the library is terminated.
     * <p>
     * Only integer value hints can be set with this function.  String value hints
     * are set with {@link #nwindowHintString windowHintString}.
     * <p>
     * This function does not check whether the specified hint values are valid.
     * If you set hints to invalid values this will instead be reported by the next
     * call to {@link #ncreateWindow createWindow}.
     * <p>
     * Some hints are platform specific.  These may be set on any platform, but they
     * will only affect their specific platform.  Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.
     *
     * @param hint  The <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints">window hint</a> to set.
     * @param value The new value of the window hint.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nwindowHintString(int, MemorySegment) windowHintString
     * @see #defaultWindowHints
     */
    public static void windowHint(int hint, int value) {
        try {
            glfwWindowHint.invokeExact(hint, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the specified window hint to the desired value.
     *
     * @param hint  The <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints">window hint</a> to set.
     * @param value The new value of the window hint.
     * @see #windowHint(int, int)
     */
    public static void windowHint(int hint, boolean value) {
        windowHint(hint, value ? TRUE : FALSE);
    }

    /**
     * Sets the specified window hint to the desired value.
     * <p>
     * This function sets hints for the next call to {@link #ncreateWindow createWindow}.  The
     * hints, once set, retain their values until changed by a call to this
     * function or {@link #defaultWindowHints}, or until the library is terminated.
     * <p>
     * Only string type hints can be set with this function.  Integer value hints
     * are set with {@link #windowHint(int, int) windowHint}.
     * <p>
     * This function does not check whether the specified hint values are valid.
     * If you set hints to invalid values this will instead be reported by the next
     * call to {@link #ncreateWindow}.
     * <p>
     * Some hints are platform specific.  These may be set on any platform, but they
     * will only affect their specific platform.  Other platforms will ignore them.
     * Setting these hints requires no platform specific headers or functions.
     *
     * @param hint  The <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints">window hint</a> to set.
     * @param value The new value of the window hint.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.pointer_lifetime The specified string is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #windowHint(int, int) windowHint
     * @see #defaultWindowHints
     */
    public static void nwindowHintString(int hint, MemorySegment value) {
        try {
            glfwWindowHintString.invokeExact(hint, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the specified window hint to the desired value.
     *
     * @param allocator The value allocator.
     * @param hint      The <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints">window hint</a> to set.
     * @param value     The new value of the window hint.
     * @see #nwindowHintString(int, MemorySegment) nwindowHintString
     */
    public static void windowHintString(SegmentAllocator allocator, int hint, String value) {
        nwindowHintString(hint, allocator.allocateUtf8String(value));
    }

    /**
     * Creates a window and its associated context.
     * <p>
     * This function creates a window and its associated OpenGL or OpenGL ES
     * context.  Most of the options controlling how the window and its context
     * should be created are specified with
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints">window hints</a>.
     * <p>
     * Successful creation does not change which context is current.  Before you
     * can use the newly created context, you need to
     * <a href="https://www.glfw.org/docs/latest/context_guide.html#context_current">make it current</a>.
     * For information about the {@code share} parameter, see
     * <a href="https://www.glfw.org/docs/latest/context_guide.html#context_sharing">Context object sharing</a>.
     * <p>
     * The created window, framebuffer and context may differ from what you
     * requested, as not all parameters and hints are
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints_hard">hard constraints</a>.
     * This includes the size of the window, especially for full screen windows.  To query the actual attributes
     * of the created window, framebuffer and context, see
     * {@link #getWindowAttrib}, {@link #ngetWindowSize(MemorySegment, MemorySegment, MemorySegment) getWindowSize}
     * and {@link #ngetFramebufferSize(MemorySegment, MemorySegment, MemorySegment) getFramebufferSize}.
     * <p>
     * To create a full screen window, you need to specify the monitor the window
     * will cover.  If no monitor is specified, the window will be windowed mode.
     * Unless you have a way for the user to choose a specific monitor, it is
     * recommended that you pick the primary monitor.  For more information on how
     * to query connected monitors, see
     * <a href="https://www.glfw.org/docs/latest/monitor_guide.html#monitor_monitors">Retrieving monitors</a>.
     * <p>
     * For full screen windows, the specified size becomes the resolution of the
     * window's <i>desired video mode</i>.  As long as a full screen window is not
     * iconified, the supported video mode most closely matching the desired video
     * mode is set for the specified monitor.  For more information about full
     * screen windows, including the creation of so called <i>windowed full screen</i>
     * or <i>borderless full screen</i> windows, see
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_windowed_full_screen">"Windowed full screen" windows</a>.
     * <p>
     * Once you have created the window, you can switch it between windowed and
     * full screen mode with {@link #setWindowMonitor}.  This will not affect its
     * OpenGL or OpenGL ES context.
     * <p>
     * By default, newly created windows use the placement recommended by the
     * window system.  To create the window at a specific position, make it
     * initially invisible using the {@link #VISIBLE} window
     * hint, set its <a href="https://www.glfw.org/docs/latest/window_guide.html#window_pos">position</a>
     * and then <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hide">show</a>
     * it.
     * <p>
     * As long as at least one full screen window is not iconified, the screensaver
     * is prohibited from starting.
     * <p>
     * Window systems put limits on window sizes.  Very large or very small window
     * dimensions may be overridden by the window system on creation.  Check the
     * actual <a href="https://www.glfw.org/docs/latest/window_guide.html#window_size">size</a> after creation.
     * <p>
     * The <a href="https://www.glfw.org/docs/latest/window_guide.html#buffer_swap">swap interval</a>
     * is not set during window creation and
     * the initial value may vary depending on driver settings and defaults.
     *
     * @param width   The desired width, in screen coordinates, of the window.
     *                This must be greater than zero.
     * @param height  The desired height, in screen coordinates, of the window.
     *                This must be greater than zero.
     * @param title   The initial, UTF-8 encoded window title.
     * @param monitor The monitor to use for full screen mode, or {@link MemorySegment#NULL NULL} for
     *                windowed mode.
     * @param share   The window whose context to share resources with, or {@link MemorySegment#NULL NULL}
     *                to not share resources.
     * @return The handle of the created window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM}, {@link #INVALID_VALUE}, {@link #API_UNAVAILABLE},
     * {@link #VERSION_UNAVAILABLE}, {@link #FORMAT_UNAVAILABLE} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Windows:</b> Window creation will fail if the Microsoft GDI software
     * OpenGL implementation is the only one available.
     * <p>
     * <b>Windows:</b> If the executable has an icon resource named {@code GLFW_ICON}, it
     * will be set as the initial icon for the window.  If no such icon is present,
     * the {@code IDI_APPLICATION} icon will be used instead.  To set a different icon,
     * see {@link #nsetWindowIcon(MemorySegment, int, MemorySegment) setWindowIcon}.
     * <p>
     * <b>Windows:</b> The context to share resources with must not be current on
     * any other thread.
     * <p>
     * <b>macOS:</b> The OS only supports forward-compatible core profile contexts
     * for OpenGL versions 3.2 and later.  Before creating an OpenGL context of
     * version 3.2, or later you must set the
     * {@link #OPENGL_FORWARD_COMPAT} and
     * {@link #OPENGL_PROFILE} hints accordingly.
     * OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.
     * <p>
     * <b>macOS:</b> The GLFW window has no icon, as it is not a document
     * window, but the dock icon will be the same as the application bundle's icon.
     * For more information on bundles, see the
     * <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a>
     * in the Mac Developer Library.
     * <p>
     * <b>macOS:</b> The first time a window is created the menu bar is created.
     * If GLFW finds a {@code MainMenu.nib} it is loaded and assumed to contain a menu
     * bar.  Otherwise, a minimal menu bar is created manually with common commands
     * like Hide, Quit and About.  The "About" entry opens a minimal about dialog
     * with information from the application's bundle.  Menu bar creation can be
     * disabled entirely with the {@link #COCOA_MENUBAR} init hint.
     * <p>
     * <b>macOS:</b> On OS X 10.10 and later the window frame will not be rendered
     * at full resolution on Retina displays unless the
     * {@link #COCOA_RETINA_FRAMEBUFFER}
     * hint is {@link #TRUE} and the {@code NSHighResolutionCapable} key is enabled in the
     * application bundle's {@code Info.plist}.  For more information, see
     * <a href="https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High Resolution Guidelines for OS X</a>
     * in the Mac Developer Library.  The GLFW test and example programs use
     * a custom {@code Info.plist} template for this, which can be found as
     * {@code CMake/MacOSXBundleInfo.plist.in} in the source tree.
     * <p>
     * <b>macOS:</b> When activating frame autosaving with
     * {@link #COCOA_FRAME_NAME}, the specified
     * window size and position may be overridden by previously saved values.
     * <p>
     * <b>X11:</b> Some window managers will not respect the placement of
     * initially hidden windows.
     * <p>
     * <b>X11:</b> Due to the asynchronous nature of X11, it may take a moment for
     * a window to reach its requested state.  This means you may not be able to
     * query the final size, position or other attributes directly after window
     * creation.
     * <p>
     * <b>X11:</b> The class part of the {@code WM_CLASS} window property will by
     * default be set to the window title passed to this function.  The instance
     * part will use the contents of the {@code RESOURCE_NAME} environment variable, if
     * present and not empty, or fall back to the window title.  Set the
     * {@link #X11_CLASS_NAME} and
     * {@link #X11_INSTANCE_NAME} window hints to
     * override this.
     * <p>
     * <b>Wayland:</b> Compositors should implement the xdg-decoration protocol
     * for GLFW to decorate the window properly.  If this protocol isn't
     * supported, or if the compositor prefers client-side decorations, a very
     * simple fallback frame will be drawn using the wp_viewporter protocol.  A
     * compositor can still emit close, maximize or fullscreen events, using for
     * instance a keybind mechanism.  If neither of these protocols is supported,
     * the window won't be decorated.
     * <p>
     * <b>Wayland:</b> A full screen window will not attempt to change the mode,
     * no matter what the requested size or refresh rate.
     * <p>
     * <b>Wayland:</b> Screensaver inhibition requires the idle-inhibit protocol
     * to be implemented in the user's compositor.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #destroyWindow
     */
    public static MemorySegment ncreateWindow(int width, int height, MemorySegment title, MemorySegment monitor, MemorySegment share) {
        try {
            return (MemorySegment) glfwCreateWindow.invokeExact(width, height, title, monitor, share);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Creates a window and its associated context.
     *
     * @param allocator The title allocator.
     * @param width     The desired width, in screen coordinates, of the window.
     *                  This must be greater than zero.
     * @param height    The desired height, in screen coordinates, of the window.
     *                  This must be greater than zero.
     * @param title     The initial, UTF-8 encoded window title.
     * @param monitor   The monitor to use for full screen mode, or {@link MemorySegment#NULL NULL} for
     *                  windowed mode.
     * @param share     The window whose context to share resources with, or {@link MemorySegment#NULL NULL}
     *                  to not share resources.
     * @return The handle of the created window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ncreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment) ncreateWindow
     */
    public static MemorySegment createWindow(SegmentAllocator allocator, int width, int height, String title, MemorySegment monitor, MemorySegment share) {
        return ncreateWindow(width, height, allocator.allocateUtf8String(title), monitor, share);
    }

    /**
     * Destroys the specified window and its context.
     * <p>
     * This function destroys the specified window and its context.  On calling
     * this function, no further callbacks will be called for that window.
     * <p>
     * If the context of the specified window is current on the main thread, it is
     * detached before being destroyed.
     *
     * @param window The window to destroy.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.note The context of the specified window must not be current on any other
     * thread when this function is called.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ncreateWindow(int, int, MemorySegment, MemorySegment, MemorySegment) createWindow
     */
    public static void destroyWindow(MemorySegment window) {
        try {
            glfwDestroyWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Checks the close flag of the specified window.
     * <p>
     * This function returns the value of the close flag of the specified window.
     *
     * @param window The window to query.
     * @return The value of the close flag.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static boolean windowShouldClose(MemorySegment window) {
        try {
            return (int) glfwWindowShouldClose.invokeExact(window) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the close flag of the specified window.
     * <p>
     * This function sets the value of the close flag of the specified window.
     * This can be used to override the user's attempt to close the window, or
     * to signal that it should be closed.
     *
     * @param window The window whose flag to change.
     * @param value  The new value.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static void setWindowShouldClose(MemorySegment window, boolean value) {
        try {
            glfwSetWindowShouldClose.invokeExact(window, value ? TRUE : FALSE);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the title of the specified window.
     * <p>
     * This function sets the window title, encoded as UTF-8, of the specified
     * window.
     *
     * @param window The window whose title to change.
     * @param title  The UTF-8 encoded window title.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>macOS:</b> The window title will not be updated until the next time you
     * process events.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void nsetWindowTitle(MemorySegment window, MemorySegment title) {
        try {
            glfwSetWindowTitle.invokeExact(window, title);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the title of the specified window.
     *
     * @param allocator The title allocator.
     * @param window    The window whose title to change.
     * @param title     The UTF-8 encoded window title.
     * @see #nsetWindowTitle(MemorySegment, MemorySegment) nsetWindowTitle
     */
    public static void setWindowTitle(SegmentAllocator allocator, MemorySegment window, String title) {
        nsetWindowTitle(window, allocator.allocateUtf8String(title));
    }

    /**
     * Sets the icon for the specified window.
     * <p>
     * This function sets the icon of the specified window.  If passed an array of
     * candidate images, those of or closest to the sizes desired by the system are
     * selected.  If no images are specified, the window reverts to its default
     * icon.
     * <p>
     * The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
     * bits per channel with the red channel first.  They are arranged canonically
     * as packed sequential rows, starting from the top-left corner.
     * <p>
     * The desired image sizes varies depending on platform and system settings.
     * The selected images will be rescaled as needed.  Good sizes include 16x16,
     * 32x32 and 48x48.
     *
     * @param window The window whose icon to set.
     * @param count  The number of images in the specified array, or zero to
     *               revert to the default window icon.
     * @param images The images to create the icon from.  This is ignored if
     *               count is zero.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified image data is copied before this function
     * returns.
     * @glfw.remark <b>macOS:</b> The GLFW window has no icon, as it is not a document
     * window, so this function does nothing.  The dock icon will be the same as
     * the application bundle's icon.  For more information on bundles, see the
     * <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a>
     * in the Mac Developer Library.
     * <p>
     * <b>Wayland:</b> There is no existing protocol to change an icon, the
     * window will thus inherit the one defined in the application's desktop file.
     * This function always emits {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void nsetWindowIcon(MemorySegment window, int count, MemorySegment images) {
        try {
            glfwSetWindowIcon.invokeExact(window, count, images);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the icon for the specified window.
     *
     * @param window The window whose icon to set.
     * @param count  The number of images in the specified array, or zero to
     *               revert to the default window icon.
     * @param images The images to create the icon from.  This is ignored if
     *               count is zero.
     * @see #nsetWindowIcon(MemorySegment, int, MemorySegment) nsetWindowIcon
     */
    public static void setWindowIcon(MemorySegment window, int count, GLFWImage.Buffer images) {
        if (images == null || count == 0) {
            nsetWindowIcon(window, 0, MemorySegment.NULL);
        } else {
            nsetWindowIcon(window, count, images.address());
        }
    }

    /**
     * Sets the icon for the specified window.
     *
     * @param window The window whose icon to set.
     * @param images The images to create the icon from, or {@code null} to
     *               revert to the default window icon.
     * @see #nsetWindowIcon(MemorySegment, int, MemorySegment) nsetWindowIcon
     */
    public static void setWindowIcon(MemorySegment window, @Nullable GLFWImage.Buffer images) {
        if (images == null) {
            nsetWindowIcon(window, 0, MemorySegment.NULL);
        } else {
            setWindowIcon(window, (int) Math.min(images.elementCount(), Integer.MAX_VALUE), images);
        }
    }

    /**
     * Retrieves the position of the content area of the specified window.
     * <p>
     * This function retrieves the position, in screen coordinates, of the
     * upper-left corner of the content area of the specified window.
     * <p>
     * Any or all of the position arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} position arguments will be set to zero.
     *
     * @param window The window to query.
     * @param xpos   Where to store the x-coordinate of the upper-left corner of
     *               the content area, or {@link MemorySegment#NULL NULL}.
     * @param ypos   Where to store the y-coordinate of the upper-left corner of
     *               the content area, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> There is no way for an application to retrieve the global
     * position of its windows, this function will always emit
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowPos(MemorySegment, int, int) setWindowPos
     */
    public static void ngetWindowPos(MemorySegment window, MemorySegment xpos, MemorySegment ypos) {
        try {
            glfwGetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the position of the content area of the specified window.
     *
     * @param window The window to query.
     * @param xpos   Where to store the x-coordinate of the upper-left corner of
     *               the content area, or {@code null}.
     * @param ypos   Where to store the y-coordinate of the upper-left corner of
     *               the content area, or {@code null}.
     */
    public static void getWindowPos(MemorySegment window, int @Nullable [] xpos, int @Nullable [] ypos) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xpos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var py = ypos != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetWindowPos(window, px, py);
            if (xpos != null && xpos.length > 1) {
                xpos[0] = px.get(JAVA_INT, 0);
            }
            if (ypos != null && ypos.length > 1) {
                ypos[0] = py.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the position of the content area of the specified window.
     *
     * @param window The window to query.
     * @return the xy-coordinate of the upper-left corner of the content area.
     */
    public static Value2.OfInt getWindowPos(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            ngetWindowPos(window, px, py);
            return new Value2.OfInt(px.get(JAVA_INT, 0), py.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Sets the position of the content area of the specified window.
     * <p>
     * This function sets the position, in screen coordinates, of the upper-left
     * corner of the content area of the specified windowed mode window.  If the
     * window is a full screen window, this function does nothing.
     * <p>
     * <b>Do not use this function</b> to move an already visible window unless you
     * have very good reasons for doing so, as it will confuse and annoy the user.
     * <p>
     * The window manager may put limits on what positions are allowed.  GLFW
     * cannot and should not override these limits.
     *
     * @param window The window to query.
     * @param xpos   The x-coordinate of the upper-left corner of the content area.
     * @param ypos   The y-coordinate of the upper-left corner of the content area.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> There is no way for an application to set the global
     * position of its windows, this function will always emit
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetWindowPos(MemorySegment, MemorySegment, MemorySegment) getWindowPos
     */
    public static void setWindowPos(MemorySegment window, int xpos, int ypos) {
        try {
            glfwSetWindowPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the size of the content area of the specified window.
     * <p>
     * This function retrieves the size, in screen coordinates, of the content area
     * of the specified window.  If you wish to retrieve the size of the
     * framebuffer of the window in pixels, see
     * {@link #ngetFramebufferSize(MemorySegment, MemorySegment, MemorySegment) getFramebufferSize}.
     * <p>
     * Any or all of the size arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} size arguments will be set to zero.
     *
     * @param window The window whose size to retrieve.
     * @param width  Where to store the width, in screen coordinates, of the
     *               content area, or {@link MemorySegment#NULL NULL}.
     * @param height Where to store the height, in screen coordinates, of the
     *               content area, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowSize(MemorySegment, int, int) setWindowSize
     */
    public static void ngetWindowSize(MemorySegment window, MemorySegment width, MemorySegment height) {
        try {
            glfwGetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the size of the content area of the specified window.
     *
     * @param window The window whose size to retrieve.
     * @param width  Where to store the width, in screen coordinates, of the
     *               content area, or {@code null}.
     * @param height Where to store the height, in screen coordinates, of the
     *               content area, or {@code null}.
     * @see #ngetWindowSize(MemorySegment, MemorySegment, MemorySegment) ngetWindowSize
     */
    public static void getWindowSize(MemorySegment window, int @Nullable [] width, int @Nullable [] height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = width != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var ph = height != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetWindowSize(window, pw, ph);
            if (width != null && width.length > 0) {
                width[0] = pw.get(JAVA_INT, 0);
            }
            if (height != null && height.length > 0) {
                height[0] = ph.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the size of the content area of the specified window.
     *
     * @param window The window whose size to retrieve.
     * @return the width and height, in screen coordinates, of the content area.
     * @see #ngetWindowSize(MemorySegment, MemorySegment, MemorySegment) ngetWindowSize
     */
    public static Value2.OfInt getWindowSize(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = stack.calloc(JAVA_INT);
            var ph = stack.calloc(JAVA_INT);
            ngetWindowSize(window, pw, ph);
            return new Value2.OfInt(pw.get(JAVA_INT, 0), ph.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Sets the size limits of the specified window.
     * <p>
     * This function sets the size limits of the content area of the specified
     * window.  If the window is full screen, the size limits only take effect
     * once it is made windowed.  If the window is not resizable, this function
     * does nothing.
     * <p>
     * The size limits are applied immediately to a windowed mode window and may
     * cause it to be resized.
     * <p>
     * The maximum dimensions must be greater than or equal to the minimum
     * dimensions and all must be greater than or equal to zero.
     *
     * @param window    The window to set limits for.
     * @param minWidth  The minimum width, in screen coordinates, of the content
     *                  area, or {@link #DONT_CARE}.
     * @param minHeight The minimum height, in screen coordinates, of the
     *                  content area, or {@link #DONT_CARE}.
     * @param maxWidth  The maximum width, in screen coordinates, of the content
     *                  area, or {@link #DONT_CARE}.
     * @param maxHeight The maximum height, in screen coordinates, of the
     *                  content area, or {@link #DONT_CARE}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.remark If you set size limits and an aspect ratio that conflict, the
     * results are undefined.
     * <p>
     * <b>Wayland:</b> The size limits will not be applied until the window is
     * actually resized, either by the user or by the compositor.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowAspectRatio(MemorySegment, int, int) setWindowAspectRatio
     */
    public static void setWindowSizeLimits(MemorySegment window, int minWidth, int minHeight, int maxWidth, int maxHeight) {
        try {
            glfwSetWindowSizeLimits.invokeExact(window, minWidth, minHeight, maxWidth, maxHeight);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the aspect ratio of the specified window.
     * <p>
     * This function sets the required aspect ratio of the content area of the
     * specified window.  If the window is full screen, the aspect ratio only takes
     * effect once it is made windowed.  If the window is not resizable, this
     * function does nothing.
     * <p>
     * The aspect ratio is specified as a numerator and a denominator and both
     * values must be greater than zero.  For example, the common 16:9 aspect ratio
     * is specified as 16 and 9, respectively.
     * <p>
     * If the numerator and denominator is set to {@link #DONT_CARE} then the aspect
     * ratio limit is disabled.
     * <p>
     * The aspect ratio is applied immediately to a windowed mode window and may
     * cause it to be resized.
     *
     * @param window The window to set limits for.
     * @param numer  The numerator of the desired aspect ratio, or
     *               {@link #DONT_CARE}.
     * @param denom  The denominator of the desired aspect ratio, or
     *               {@link #DONT_CARE}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.remark If you set size limits and an aspect ratio that conflict, the
     * results are undefined.
     * <p>
     * <b>Wayland:</b> The aspect ratio will not be applied until the window is
     * actually resized, either by the user or by the compositor.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowSizeLimits(MemorySegment, int, int, int, int) setWindowSizeLimits
     */
    public static void setWindowAspectRatio(MemorySegment window, int numer, int denom) {
        try {
            glfwSetWindowAspectRatio.invokeExact(window, numer, denom);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the size of the content area of the specified window.
     * <p>
     * This function sets the size, in screen coordinates, of the content area of
     * the specified window.
     * <p>
     * For full screen windows, this function updates the resolution of its desired
     * video mode and switches to the video mode closest to it, without affecting
     * the window's context.  As the context is unaffected, the bit depths of the
     * framebuffer remain unchanged.
     * <p>
     * If you wish to update the refresh rate of the desired video mode in addition
     * to its resolution, see
     * {@link #setWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) setWindowMonitor}.
     * <p>
     * The window manager may put limits on what sizes are allowed.  GLFW cannot
     * and should not override these limits.
     *
     * @param window The window to resize.
     * @param width  The desired width, in screen coordinates, of the window
     *               content area.
     * @param height The desired height, in screen coordinates, of the window
     *               content area.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> A full screen window will not attempt to change the mode,
     * no matter what the requested size.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetWindowSize(MemorySegment, MemorySegment, MemorySegment) getWindowSize
     * @see #setWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) setWindowMonitor
     */
    public static void setWindowSize(MemorySegment window, int width, int height) {
        try {
            glfwSetWindowSize.invokeExact(window, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the size of the framebuffer of the specified window.
     * <p>
     * This function retrieves the size, in pixels, of the framebuffer of the
     * specified window.  If you wish to retrieve the size of the window in screen
     * coordinates, see {@link #ngetWindowSize(MemorySegment, MemorySegment, MemorySegment) getWindowSize}.
     * <p>
     * Any or all of the size arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} size arguments will be set to zero.
     *
     * @param window The window whose framebuffer to query.
     * @param width  Where to store the width, in pixels, of the framebuffer,
     *               or {@link MemorySegment#NULL NULL}.
     * @param height Where to store the height, in pixels, of the framebuffer,
     *               or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetFramebufferSizeCallback(MemorySegment, MemorySegment) setFramebufferSizeCallback
     */
    public static void ngetFramebufferSize(MemorySegment window, MemorySegment width, MemorySegment height) {
        try {
            glfwGetFramebufferSize.invokeExact(window, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the size of the framebuffer of the specified window.
     *
     * @param window The window whose framebuffer to query.
     * @param width  Where to store the width, in pixels, of the framebuffer,
     *               or {@code null}.
     * @param height Where to store the height, in pixels, of the framebuffer,
     *               or {@code null}.
     * @see #ngetFramebufferSize(MemorySegment, MemorySegment, MemorySegment) ngetFramebufferSize
     */
    public static void getFramebufferSize(MemorySegment window, int @Nullable [] width, int @Nullable [] height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = width != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var ph = height != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetFramebufferSize(window, pw, ph);
            if (width != null && width.length > 0) {
                width[0] = pw.get(JAVA_INT, 0);
            }
            if (height != null && height.length > 0) {
                height[0] = ph.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the size of the framebuffer of the specified window.
     *
     * @param window The window whose framebuffer to query.
     * @return the width and height, in pixels, of the framebuffer.
     * @see #ngetFramebufferSize(MemorySegment, MemorySegment, MemorySegment) ngetFramebufferSize
     */
    public static Value2.OfInt getFramebufferSize(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pw = stack.calloc(JAVA_INT);
            var ph = stack.calloc(JAVA_INT);
            ngetFramebufferSize(window, pw, ph);
            return new Value2.OfInt(pw.get(JAVA_INT, 0), ph.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the size of the frame of the window.
     * <p>
     * This function retrieves the size, in screen coordinates, of each edge of the
     * frame of the specified window.  This size includes the title bar, if the
     * window has one.  The size of the frame may vary depending on the
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_hints_wnd">window-related hints</a>
     * used to create it.
     * <p>
     * Because this function retrieves the size of each window frame edge and not
     * the offset along a particular coordinate axis, the retrieved values will
     * always be zero or positive.
     * <p>
     * Any or all of the size arguments may be {@link MemorySegment#NULL NULL}.
     * If an error occurs, all non-{@link MemorySegment#NULL NULL} size arguments will be set to zero.
     *
     * @param window The window whose frame size to query.
     * @param left   Where to store the size, in screen coordinates, of the left
     *               edge of the window frame, or {@link MemorySegment#NULL NULL}.
     * @param top    Where to store the size, in screen coordinates, of the top
     *               edge of the window frame, or {@link MemorySegment#NULL NULL}.
     * @param right  Where to store the size, in screen coordinates, of the
     *               right edge of the window frame, or {@link MemorySegment#NULL NULL}.
     * @param bottom Where to store the size, in screen coordinates, of the
     *               bottom edge of the window frame, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void ngetWindowFrameSize(MemorySegment window, MemorySegment left, MemorySegment top, MemorySegment right, MemorySegment bottom) {
        try {
            glfwGetWindowFrameSize.invokeExact(window, left, top, right, bottom);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the size of the frame of the window.
     *
     * @param window The window whose frame size to query.
     * @param left   Where to store the size, in screen coordinates, of the left
     *               edge of the window frame, or {@code null}.
     * @param top    Where to store the size, in screen coordinates, of the top
     *               edge of the window frame, or {@code null}.
     * @param right  Where to store the size, in screen coordinates, of the
     *               right edge of the window frame, or {@code null}.
     * @param bottom Where to store the size, in screen coordinates, of the
     *               bottom edge of the window frame, or {@code null}.
     * @see #ngetWindowFrameSize(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetWindowFrameSize
     */
    public static void getWindowFrameSize(MemorySegment window, int @Nullable [] left, int @Nullable [] top, int @Nullable [] right, int @Nullable [] bottom) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pl = left != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pt = top != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pr = right != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            var pb = bottom != null ? stack.calloc(JAVA_INT) : MemorySegment.NULL;
            ngetWindowFrameSize(window, pl, pt, pr, pb);
            if (left != null && left.length > 0) {
                left[0] = pl.get(JAVA_INT, 0);
            }
            if (top != null && top.length > 0) {
                top[0] = pt.get(JAVA_INT, 0);
            }
            if (right != null && right.length > 0) {
                right[0] = pr.get(JAVA_INT, 0);
            }
            if (bottom != null && bottom.length > 0) {
                bottom[0] = pb.get(JAVA_INT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the size of the frame of the window.
     *
     * @param window The window whose frame size to query.
     * @return the size, in screen coordinates, of the left, top, right and bottom
     * edge of the window frame.
     * @see #ngetWindowFrameSize(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetWindowFrameSize
     */
    public static ValueInt4 getWindowFrameSize(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pl = stack.calloc(JAVA_INT);
            var pt = stack.calloc(JAVA_INT);
            var pr = stack.calloc(JAVA_INT);
            var pb = stack.calloc(JAVA_INT);
            ngetWindowFrameSize(window, pl, pt, pr, pb);
            return new ValueInt4(pl.get(JAVA_INT, 0),
                pt.get(JAVA_INT, 0),
                pr.get(JAVA_INT, 0),
                pb.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the content scale for the specified window.
     * <p>
     * This function retrieves the content scale for the specified window.  The
     * content scale is the ratio between the current DPI and the platform's
     * default DPI.  This is especially important for text and any UI elements.  If
     * the pixel dimensions of your UI scaled by this look appropriate on your
     * machine then it should appear at a reasonable size on other machines
     * regardless of their DPI and scaling settings.  This relies on the system DPI
     * and scaling settings being somewhat correct.
     * <p>
     * On systems where each monitors can have its own content scale, the window
     * content scale will depend on which monitor the system considers the window
     * to be on.
     *
     * @param window The window to query.
     * @param xscale Where to store the x-axis content scale, or {@link MemorySegment#NULL NULL}.
     * @param yscale Where to store the y-axis content scale, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetWindowContentScaleCallback(MemorySegment, MemorySegment) setWindowContentScaleCallback
     * @see #ngetMonitorContentScale(MemorySegment, MemorySegment, MemorySegment) getMonitorContentScale
     */
    public static void ngetWindowContentScale(MemorySegment window, MemorySegment xscale, MemorySegment yscale) {
        try {
            glfwGetWindowContentScale.invokeExact(window, xscale, yscale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the content scale for the specified window.
     *
     * @param window The window to query.
     * @param xscale Where to store the x-axis content scale, or {@code null}.
     * @param yscale Where to store the y-axis content scale, or {@code null}.
     * @see #ngetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) ngetWindowContentScale
     */
    public static void getWindowContentScale(MemorySegment window, float @Nullable [] xscale, float @Nullable [] yscale) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xscale != null ? stack.calloc(JAVA_FLOAT) : MemorySegment.NULL;
            var py = yscale != null ? stack.calloc(JAVA_FLOAT) : MemorySegment.NULL;
            ngetWindowContentScale(window, px, py);
            if (xscale != null && xscale.length > 0) {
                xscale[0] = px.get(JAVA_FLOAT, 0);
            }
            if (yscale != null && yscale.length > 0) {
                yscale[0] = py.get(JAVA_FLOAT, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the content scale for the specified window.
     *
     * @param window The window to query.
     * @return the xy-axis content scale.
     * @see #ngetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) ngetWindowContentScale
     */
    public static Value2.OfFloat getWindowContentScale(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_FLOAT);
            var py = stack.calloc(JAVA_FLOAT);
            ngetWindowContentScale(window, px, py);
            return new Value2.OfFloat(px.get(JAVA_FLOAT, 0), py.get(JAVA_FLOAT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the opacity of the whole window.
     * <p>
     * This function returns the opacity of the window, including any decorations.
     * <p>
     * The opacity (or alpha) value is a positive finite number between zero and
     * one, where zero is fully transparent and one is fully opaque.  If the system
     * does not support whole window transparency, this function always returns one.
     * <p>
     * The initial opacity value for newly created windows is one.
     *
     * @param window The window to query.
     * @return The opacity value of the specified window.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowOpacity(MemorySegment, float) setWindowOpacity
     */
    public static float getWindowOpacity(MemorySegment window) {
        try {
            return (float) glfwGetWindowOpacity.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the opacity of the whole window.
     * <p>
     * This function sets the opacity of the window, including any decorations.
     * <p>
     * The opacity (or alpha) value is a positive finite number between zero and
     * one, where zero is fully transparent and one is fully opaque.
     * <p>
     * The initial opacity value for newly created windows is one.
     * <p>
     * A window created with framebuffer transparency may not use whole window
     * transparency.  The results of doing this are undefined.
     *
     * @param window  The window to set the opacity for.
     * @param opacity The desired opacity of the specified window.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #getWindowOpacity(MemorySegment) getWindowOpacity
     */
    public static void setWindowOpacity(MemorySegment window, float opacity) {
        try {
            glfwSetWindowOpacity.invokeExact(window, opacity);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Iconifies the specified window.
     * <p>
     * This function iconifies (minimizes) the specified window if it was
     * previously restored.  If the window is already iconified, this function does
     * nothing.
     * <p>
     * If the specified window is a full screen window, GLFW restores the original
     * video mode of the monitor.  The window's desired video mode is set again
     * when the window is restored.
     *
     * @param window The window to iconify.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #restoreWindow(MemorySegment) restoreWindow
     * @see #maximizeWindow(MemorySegment) maximizeWindow
     */
    public static void iconifyWindow(MemorySegment window) {
        try {
            glfwIconifyWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Restores the specified window.
     * <p>
     * This function restores the specified window if it was previously iconified
     * (minimized) or maximized.  If the window is already restored, this function
     * does nothing.
     * <p>
     * If the specified window is an iconified full screen window, its desired
     * video mode is set again for its monitor when the window is restored.
     *
     * @param window The window to restore.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #iconifyWindow(MemorySegment) iconifyWindow
     * @see #maximizeWindow(MemorySegment) maximizeWindow
     */
    public static void restoreWindow(MemorySegment window) {
        try {
            glfwRestoreWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Maximizes the specified window.
     * <p>
     * This function maximizes the specified window if it was previously not
     * maximized.  If the window is already maximized, this function does nothing.
     * <p>
     * If the specified window is a full screen window, this function does nothing.
     *
     * @param window The window to maximize.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may only be called from the main thread.
     * @see #iconifyWindow(MemorySegment) iconifyWindow
     * @see #restoreWindow(MemorySegment) restoreWindow
     */
    public static void maximizeWindow(MemorySegment window) {
        try {
            glfwMaximizeWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Makes the specified window visible.
     * <p>
     * This function makes the specified window visible if it was previously
     * hidden.  If the window is already visible or is in full screen mode, this
     * function does nothing.
     * <p>
     * By default, windowed mode windows are focused when shown
     * Set the {@link #FOCUS_ON_SHOW} window hint
     * to change this behavior for all newly created windows, or change the
     * behavior for an existing window with {@link #setWindowAttrib}.
     *
     * @param window The window to make visible.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> Because Wayland wants every frame of the desktop to be
     * complete, this function does not immediately make the window visible.
     * Instead, it will become visible the next time the window framebuffer is
     * updated after this call.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #hideWindow(MemorySegment) hideWindow
     */
    public static void showWindow(MemorySegment window) {
        try {
            glfwShowWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Hides the specified window.
     * <p>
     * This function hides the specified window if it was previously visible.  If
     * the window is already hidden or is in full screen mode, this function does
     * nothing.
     *
     * @param window The window to hide.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #showWindow(MemorySegment) showWindow
     */
    public static void hideWindow(MemorySegment window) {
        try {
            glfwHideWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Brings the specified window to front and sets input focus.
     * <p>
     * This function brings the specified window to front and sets input focus.
     * The window should already be visible and not iconified.
     * <p>
     * By default, both windowed and full screen mode windows are focused when
     * initially created.  Set the {@link #FOCUSED} to
     * disable this behavior.
     * <p>
     * Also by default, windowed mode windows are focused when shown
     * with {@link #showWindow}. Set the
     * {@link #FOCUS_ON_SHOW} to disable this behavior.
     * <p>
     * <b>Do not use this function</b> to steal focus from other applications unless
     * you are certain that is what the user wants.  Focus stealing can be
     * extremely disruptive.
     * <p>
     * For a less disruptive way of getting the user's attention, see
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_attention">attention requests</a>.
     *
     * @param window The window to give input focus.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> It is not possible for an application to bring its windows
     * to front, this function will always emit {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void focusWindow(MemorySegment window) {
        try {
            glfwFocusWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Requests user attention to the specified window.
     * <p>
     * This function requests user attention to the specified window.  On
     * platforms where this is not supported, attention is requested to the
     * application as a whole.
     * <p>
     * Once the user has given attention, usually by focusing the window or
     * application, the system will end the request automatically.
     *
     * @param window The window to request attention to.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>macOS:</b> Attention is requested to the application as a whole, not the
     * specific window.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void requestWindowAttention(MemorySegment window) {
        try {
            glfwRequestWindowAttention.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the monitor that the window uses for full screen mode.
     * <p>
     * This function returns the handle of the monitor that the specified window is
     * in full screen on.
     *
     * @param window The window to query.
     * @return The monitor, or {@link MemorySegment#NULL NULL} if the window is in windowed mode or an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) setWindowMonitor
     */
    public static MemorySegment getWindowMonitor(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetWindowMonitor.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the mode, monitor, video mode and placement of a window.
     * <p>
     * This function sets the monitor that the window uses for full screen mode or,
     * if the monitor is {@link MemorySegment#NULL NULL}, makes it windowed mode.
     * <p>
     * When setting a monitor, this function updates the width, height and refresh
     * rate of the desired video mode and switches to the video mode closest to it.
     * The window position is ignored when setting a monitor.
     * <p>
     * When the monitor is {@link MemorySegment#NULL NULL}, the position,
     * width and height are used to place the window content area.
     * The refresh rate is ignored when no monitor is specified.
     * <p>
     * If you only wish to update the resolution of a full screen window or the
     * size of a windowed mode window, see {@link #setWindowSize}.
     * <p>
     * When a window transitions from full screen to windowed mode, this function
     * restores any previous window settings such as whether it is decorated,
     * floating, resizable, has size or aspect ratio limits, etc.
     *
     * @param window      The window whose monitor, size or video mode to set.
     * @param monitor     The desired monitor, or {@link MemorySegment#NULL NULL} to set windowed mode.
     * @param xpos        The desired x-coordinate of the upper-left corner of the
     *                    content area.
     * @param ypos        The desired y-coordinate of the upper-left corner of the
     *                    content area.
     * @param width       The desired with, in screen coordinates, of the content
     *                    area or video mode.
     * @param height      The desired height, in screen coordinates, of the content
     *                    area or video mode.
     * @param refreshRate The desired refresh rate, in Hz, of the video mode,
     *                    or {@link #DONT_CARE}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark The OpenGL or OpenGL ES context will not be destroyed or otherwise
     * affected by any resizing or mode switching, although you may need to update
     * your viewport if the framebuffer size has changed.
     * <p>
     * <b>Wayland:</b> The desired window position is ignored, as there is no way
     * for an application to set this property.
     * <p>
     * <b>Wayland:</b> Setting the window to full screen will not attempt to
     * change the mode, no matter what the requested size or refresh rate.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #getWindowMonitor(MemorySegment) getWindowMonitor
     * @see #setWindowSize(MemorySegment, int, int) setWindowSize
     */
    public static void setWindowMonitor(MemorySegment window, MemorySegment monitor, int xpos, int ypos, int width, int height, int refreshRate) {
        try {
            glfwGetWindowMonitor.invokeExact(window, monitor, xpos, ypos, width, height, refreshRate);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns an attribute of the specified window.
     * <p>
     * This function returns the value of an attribute of the specified window or
     * its OpenGL or OpenGL ES context.
     *
     * @param window The window to query.
     * @param attrib The <a href="https://www.glfw.org/docs/latest/window_guide.html#window_attribs">window attribute</a>
     *               whose value to return.
     * @return The value of the attribute, or zero if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.remark Framebuffer related hints are not window attributes.  See
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_attribs_fb">Framebuffer related attributes</a>
     * for more information.
     * @glfw.remark Zero is a valid value for many window and context related
     * attributes, so you cannot use a return value of zero as an indication of
     * errors.  However, this function should not fail as long as it is passed
     * valid arguments and the library has been
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * <p>
     * <b>Wayland:</b> The Wayland protocol provides no way to check whether a
     * window is iconfied, so {@link #ICONIFIED} always returns {@link #FALSE}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setWindowAttrib(MemorySegment, int, boolean) setWindowAttrib
     */
    public static int getWindowAttrib(MemorySegment window, int attrib) {
        try {
            return (int) glfwGetWindowAttrib.invokeExact(window, attrib);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets an attribute of the specified window.
     * <p>
     * This function sets the value of an attribute of the specified window.
     * <p>
     * The supported attributes are {@link #DECORATED},
     * {@link #RESIZABLE},
     * {@link #FLOATING},
     * {@link #AUTO_ICONIFY} and
     * {@link #FOCUS_ON_SHOW}.
     * <p>
     * Some of these attributes are ignored for full screen windows.  The new
     * value will take effect if the window is later made windowed.
     * <p>
     * Some of these attributes are ignored for windowed mode windows.  The new
     * value will take effect if the window is later made full screen.
     *
     * @param window The window to set the attribute for.
     * @param attrib A supported window attribute.
     * @param value  {@code true} of {@code false}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM}, {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.remark Calling {@link #getWindowAttrib} will always return the latest
     * value, even if that value is ignored by the current mode of the window.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #getWindowAttrib(MemorySegment, int) getWindowAttrib
     */
    public static void setWindowAttrib(MemorySegment window, int attrib, boolean value) {
        try {
            glfwSetWindowAttrib.invokeExact(window, attrib, value ? TRUE : FALSE);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the user pointer of the specified window.
     * <p>
     * This function sets the user-defined pointer of the specified window.  The
     * current value is retained until the window is destroyed.  The initial value
     * is {@link MemorySegment#NULL NULL}.
     *
     * @param window  The window whose pointer to set.
     * @param pointer The new value.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #getWindowUserPointer(MemorySegment) getWindowUserPointer
     */
    public static void setWindowUserPointer(MemorySegment window, MemorySegment pointer) {
        try {
            glfwSetWindowUserPointer.invokeExact(window, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * {@return the user pointer of the specified window.}
     * <p>
     * This function returns the current value of the user-defined pointer of the
     * specified window.  The initial value is {@link MemorySegment#NULL NULL}.
     *
     * @param window The window whose pointer to return.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     * @see #setWindowUserPointer(MemorySegment, MemorySegment) setWindowUserPointer
     */
    public static MemorySegment getWindowUserPointer(MemorySegment window) {
        try {
            return (MemorySegment) glfwSetWindowUserPointer.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the position callback for the specified window.
     * <p>
     * This function sets the position callback of the specified window, which is
     * called when the window is moved.  The callback is provided with the
     * position, in screen coordinates, of the upper-left corner of the content
     * area of the window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int xpos, int ypos)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowPosFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.remark <b>Wayland:</b> This callback will never be called, as there is no way for
     * an application to know its global position.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowPosCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowPosCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the position callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowPosCallback(MemorySegment, MemorySegment) nsetWindowPosCallback
     */
    public static MemorySegment setWindowPosCallback(MemorySegment window, @Nullable IGLFWWindowPosFun callback) {
        return nsetWindowPosCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the size callback for the specified window.
     * <p>
     * This function sets the size callback of the specified window, which is
     * called when the window is resized.  The callback is provided with the size,
     * in screen coordinates, of the content area of the window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int width, int height)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowSizeFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowSizeCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the size callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowSizeCallback(MemorySegment, MemorySegment) nsetWindowSizeCallback
     */
    public static MemorySegment setWindowSizeCallback(MemorySegment window, @Nullable IGLFWWindowSizeFun callback) {
        return nsetWindowSizeCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the close callback for the specified window.
     * <p>
     * This function sets the close callback of the specified window, which is
     * called when the user attempts to close the window, for example by clicking
     * the close widget in the title bar.
     * <p>
     * The close flag is set before this callback is called, but you can modify it
     * at any time with {@link #setWindowShouldClose}.
     * <p>
     * The close callback is not triggered by {@link #destroyWindow}.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowCloseFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.remark <b>macOS:</b> Selecting Quit from the application menu will trigger the
     * close callback for all windows.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowCloseCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowCloseCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the close callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowCloseCallback(MemorySegment, MemorySegment) nsetWindowCloseCallback
     */
    public static MemorySegment setWindowCloseCallback(MemorySegment window, @Nullable IGLFWWindowCloseFun callback) {
        return nsetWindowCloseCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the refresh callback for the specified window.
     * <p>
     * This function sets the refresh callback of the specified window, which is
     * called when the content area of the window needs to be redrawn, for example
     * if the window has been exposed after having been covered by another window.
     * <p>
     * On compositing window systems such as Aero, Compiz, Aqua or Wayland, where
     * the window contents are saved off-screen, this callback may be called only
     * very infrequently or never at all.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window);}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowRefreshFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowRefreshCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowRefreshCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the refresh callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowRefreshCallback(MemorySegment, MemorySegment) nsetWindowRefreshCallback
     */
    public static MemorySegment setWindowRefreshCallback(MemorySegment window, @Nullable IGLFWWindowRefreshFun callback) {
        return nsetWindowRefreshCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the focus callback for the specified window.
     * <p>
     * This function sets the focus callback of the specified window, which is
     * called when the window gains or loses input focus.
     * <p>
     * After the focus callback is called for a window that lost input focus,
     * synthetic key and mouse button release events will be generated for all such
     * that had been pressed.  For more information, see
     * {@link #nsetKeyCallback(MemorySegment, MemorySegment) setKeyCallback}
     * and {@link #nsetMouseButtonCallback(MemorySegment, MemorySegment) setMouseButtonCallback}.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int focused)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowFocusFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowFocusCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowFocusCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the focus callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowFocusCallback(MemorySegment, MemorySegment) nsetWindowFocusCallback
     */
    public static MemorySegment setWindowFocusCallback(MemorySegment window, @Nullable IGLFWWindowFocusFun callback) {
        return nsetWindowFocusCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the iconify callback for the specified window.
     * <p>
     * This function sets the iconification callback of the specified window, which
     * is called when the window is iconified or restored.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int iconified)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowIconifyFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.remark <b>Wayland:</b> The XDG-shell protocol has no event for iconification, so
     * this callback will never be called.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowIconifyCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowIconifyCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the iconify callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowIconifyCallback(MemorySegment, MemorySegment) nsetWindowIconifyCallback
     */
    public static MemorySegment setWindowIconifyCallback(MemorySegment window, @Nullable IGLFWWindowIconifyFun callback) {
        return nsetWindowIconifyCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the maximize callback for the specified window.
     * <p>
     * This function sets the maximization callback of the specified window, which
     * is called when the window is maximized or restored.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int maximized)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowMaximizeFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetWindowMaximizeCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowMaximizeCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the maximize callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowMaximizeCallback(MemorySegment, MemorySegment) nsetWindowMaximizeCallback
     */
    public static MemorySegment setWindowMaximizeCallback(MemorySegment window, @Nullable IGLFWWindowMaximizeFun callback) {
        return nsetWindowMaximizeCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the framebuffer resize callback for the specified window.
     * <p>
     * This function sets the framebuffer resize callback of the specified window,
     * which is called when the framebuffer of the specified window is resized.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, int width, int height)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWFramebufferSizeFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetFramebufferSizeCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetFramebufferSizeCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the framebuffer resize callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetFramebufferSizeCallback(MemorySegment, MemorySegment) nsetFramebufferSizeCallback
     */
    public static MemorySegment setFramebufferSizeCallback(MemorySegment window, @Nullable IGLFWFramebufferSizeFun callback) {
        return nsetFramebufferSizeCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Sets the window content scale callback for the specified window.
     * <p>
     * This function sets the window content scale callback of the specified window,
     * which is called when the content scale of the specified window changes.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@link MemorySegment#NULL NULL} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @glfw.callback_signature <pre>{@code void function_name(GLFWwindow* window, float xscale, float yscale)}</pre>
     * For more information about the callback parameters, see the
     * {@link IGLFWWindowContentScaleFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetWindowContentScale(MemorySegment, MemorySegment, MemorySegment) getWindowContentScale
     */
    public static MemorySegment nsetWindowContentScaleCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetWindowContentScaleCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the window content scale callback for the specified window.
     *
     * @param window   The window whose callback to set.
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetWindowContentScaleCallback(MemorySegment, MemorySegment) nsetWindowContentScaleCallback
     */
    public static MemorySegment setWindowContentScaleCallback(MemorySegment window, @Nullable IGLFWWindowContentScaleFun callback) {
        return nsetWindowContentScaleCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
    }

    /**
     * Processes all pending events.
     * <p>
     * This function processes only those events that are already in the event
     * queue and then returns immediately.  Processing events will cause the window
     * and input callbacks associated with those events to be called.
     * <p>
     * On some platforms, a window move, resize or menu operation will cause event
     * processing to block.  This is due to how event processing is designed on
     * those platforms.  You can use the
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_refresh">window refresh callback</a>
     * to redraw the contents of
     * your window when necessary during such operations.
     * <p>
     * Do not assume that callbacks you set will <i>only</i> be called in response to
     * event processing functions like this one.  While it is necessary to poll for
     * events, window systems that require GLFW to register callbacks of its own
     * can pass events to GLFW in response to many window system function calls.
     * GLFW will pass those events on to the application callbacks before
     * returning.
     * <p>
     * Event processing is not required for joystick input to work.
     *
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #waitEvents() waitEvents
     * @see #waitEventsTimeout(double) waitEventsTimeout
     */
    public static void pollEvents() {
        try {
            glfwPollEvents.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Waits until events are queued and processes them.
     * <p>
     * This function puts the calling thread to sleep until at least one event is
     * available in the event queue.  Once one or more events are available,
     * it behaves exactly like {@link #pollEvents}, i.e. the events in the queue
     * are processed and the function then returns immediately.  Processing events
     * will cause the window and input callbacks associated with those events to be
     * called.
     * <p>
     * Since not all events are associated with callbacks, this function may return
     * without a callback having been called even if you are monitoring all
     * callbacks.
     * <p>
     * On some platforms, a window move, resize or menu operation will cause event
     * processing to block.  This is due to how event processing is designed on
     * those platforms.  You can use the
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_refresh">window refresh callback</a>
     * to redraw the contents of your window when necessary during such operations.
     * <p>
     * Do not assume that callbacks you set will <i>only</i> be called in response to
     * event processing functions like this one.  While it is necessary to poll for
     * events, window systems that require GLFW to register callbacks of its own
     * can pass events to GLFW in response to many window system function calls.
     * GLFW will pass those events on to the application callbacks before
     * returning.
     * <p>
     * Event processing is not required for joystick input to work.
     *
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #pollEvents() pollEvents
     * @see #waitEventsTimeout(double) waitEventsTimeout
     */
    public static void waitEvents() {
        try {
            glfwWaitEvents.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Waits with timeout until events are queued and processes them.
     * <p>
     * This function puts the calling thread to sleep until at least one event is
     * available in the event queue, or until the specified timeout is reached.  If
     * one or more events are available, it behaves exactly like
     * {@link #pollEvents}, i.e. the events in the queue are processed and the function
     * then returns immediately.  Processing events will cause the window and input
     * callbacks associated with those events to be called.
     * <p>
     * The timeout value must be a positive finite number.
     * <p>
     * Since not all events are associated with callbacks, this function may return
     * without a callback having been called even if you are monitoring all
     * callbacks.
     * <p>
     * On some platforms, a window move, resize or menu operation will cause event
     * processing to block.  This is due to how event processing is designed on
     * those platforms.  You can use the
     * <a href="https://www.glfw.org/docs/latest/window_guide.html#window_refresh">window refresh callback</a>
     * to redraw the contents of your window when necessary during such operations.
     * <p>
     * Do not assume that callbacks you set will <i>only</i> be called in response to
     * event processing functions like this one.  While it is necessary to poll for
     * events, window systems that require GLFW to register callbacks of its own
     * can pass events to GLFW in response to many window system function calls.
     * GLFW will pass those events on to the application callbacks before
     * returning.
     * <p>
     * Event processing is not required for joystick input to work.
     *
     * @param timeout The maximum amount of time, in seconds, to wait.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #pollEvents() pollEvents
     * @see #waitEvents() waitEvents
     */
    public static void waitEventsTimeout(double timeout) {
        try {
            glfwWaitEventsTimeout.invokeExact(timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Posts an empty event to the event queue.
     * <p>
     * This function posts an empty event from the current thread to the event
     * queue, causing {@link #waitEvents} or {@link #waitEventsTimeout} to return.
     *
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #waitEvents() waitEvents
     * @see #waitEventsTimeout(double) waitEventsTimeout
     */
    public static void postEmptyEvents() {
        try {
            glfwPostEmptyEvent.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * {@return the value of an input option for the specified window.}
     * <p>
     * This function returns the value of an input option for the specified window.
     * The mode must be one of {@link #CURSOR}, {@link #STICKY_KEYS},
     * {@link #STICKY_MOUSE_BUTTONS}, {@link #LOCK_KEY_MODS} or
     * {@link #RAW_MOUSE_MOTION}.
     *
     * @param window The window to query.
     * @param mode   One of {@code CURSOR}, {@code STICKY_KEYS},
     *               {@code STICKY_MOUSE_BUTTONS}, {@code LOCK_KEY_MODS} or
     *               {@code RAW_MOUSE_MOTION}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setInputMode(MemorySegment, int, int) setInputMode
     */
    public static int getInputMode(MemorySegment window, int mode) {
        try {
            return (int) glfwGetInputMode.invokeExact(window, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets an input option for the specified window.
     * <p>
     * This function sets an input mode option for the specified window.  The mode
     * must be one of {@link #CURSOR}, {@link #STICKY_KEYS},
     * {@link #STICKY_MOUSE_BUTTONS}, {@link #LOCK_KEY_MODS} or
     * {@link #RAW_MOUSE_MOTION}.
     * <p>
     * If the mode is {@code CURSOR}, the value must be one of the following cursor
     * modes:
     * <ul>
     *     <li>{@link #CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
     *     <li>{@link #CURSOR_HIDDEN} makes the cursor invisible when it is over the
     *         content area of the window but does not restrict the cursor from leaving.</li>
     *     <li>{@link #CURSOR_DISABLED} hides and grabs the cursor, providing virtual
     *         and unlimited cursor movement.  This is useful for implementing for
     *         example 3D camera controls.</li>
     * </ul>
     * <p>
     * If the mode is {@code STICKY_KEYS}, the value must be either {@link #TRUE} to
     * enable sticky keys, or {@link #FALSE} to disable it.  If sticky keys are
     * enabled, a key press will ensure that {@link #getKey} returns {@code PRESS}
     * the next time it is called even if the key had been released before the
     * call.  This is useful when you are only interested in whether keys have been
     * pressed but not when or in which order.
     * <p>
     * If the mode is {@code STICKY_MOUSE_BUTTONS}, the value must be either
     * {@link #TRUE} to enable sticky mouse buttons, or {@link #FALSE} to disable it.
     * If sticky mouse buttons are enabled, a mouse button press will ensure that
     * {@link #getMouseButton} returns {@code PRESS} the next time it is called even
     * if the mouse button had been released before the call.  This is useful when
     * you are only interested in whether mouse buttons have been pressed but not
     * when or in which order.
     * <p>
     * If the mode is {@code LOCK_KEY_MODS}, the value must be either {@link #TRUE} to
     * enable lock key modifier bits, or {@link #FALSE} to disable them.  If enabled,
     * callbacks that receive modifier bits will also have the
     * {@link #MOD_CAPS_LOCK} bit set when the event was generated with Caps Lock on,
     * and the {@link #MOD_NUM_LOCK} bit when Num Lock was on.
     * <p>
     * If the mode is {@code RAW_MOUSE_MOTION}, the value must be either {@link #TRUE}
     * to enable raw (unscaled and unaccelerated) mouse motion when the cursor is
     * disabled, or {@link #FALSE} to disable it.  If raw motion is not supported,
     * attempting to set this will emit {@link #PLATFORM_ERROR}.  Call
     * {@link #rawMouseMotionSupported} to check for support.
     *
     * @param window The window whose input mode to set.
     * @param mode   One of {@code CURSOR}, {@code STICKY_KEYS},
     *               {@code STICKY_MOUSE_BUTTONS}, {@code LOCK_KEY_MODS} or
     *               {@code RAW_MOUSE_MOTION}.
     * @param value  The new value of the specified input mode.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #getInputMode(MemorySegment, int) getInputMode
     */
    public static void setInputMode(MemorySegment window, int mode, int value) {
        try {
            glfwSetInputMode.invokeExact(window, mode, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns whether raw mouse motion is supported.
     * <p>
     * This function returns whether raw mouse motion is supported on the current
     * system.  This status does not change after GLFW has been initialized, so you
     * only need to check this once.  If you attempt to enable raw motion on
     * a system that does not support it, {@link #PLATFORM_ERROR} will be emitted.
     * <p>
     * Raw mouse motion is closer to the actual motion of the mouse across
     * a surface.  It is not affected by the scaling and acceleration applied to
     * the motion of the desktop cursor.  That processing is suitable for a cursor
     * while raw motion is better for controlling for example a 3D camera.  Because
     * of this, raw mouse motion is only provided when the cursor is disabled.
     *
     * @return {@link #TRUE} if raw mouse motion is supported on the current machine,
     * or {@link #FALSE} otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setInputMode(MemorySegment, int, int) setInputMode
     */
    public static boolean rawMouseMotionSupported() {
        try {
            return (int) glfwRawMouseMotionSupported.invokeExact() != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the layout-specific name of the specified printable key.
     * <p>
     * This function returns the name of the specified printable key, encoded as
     * UTF-8.  This is typically the character that key would produce without any
     * modifier keys, intended for displaying key bindings to the user.  For dead
     * keys, it is typically the diacritic it would add to a character.
     * <p>
     * <b>Do not use this function</b> for
     * <a href="https://www.glfw.org/docs/latest/input_guide.html#input_char">text input</a>.
     * You will break text input for many languages even if it happens to work for yours.
     * <p>
     * If the key is {@link #KEY_UNKNOWN}, the scancode is used to identify the key,
     * otherwise the scancode is ignored.  If you specify a non-printable key, or
     * {@link #KEY_UNKNOWN} and a scancode that maps to a non-printable key, this
     * function returns {@link MemorySegment#NULL NULL} but does not emit an error.
     * <p>
     * This behavior allows you to always pass in the arguments in the
     * <a href="https://www.glfw.org/docs/latest/input_guide.html#input_key">key callback</a>
     * without modification.
     * <p>
     * The printable keys are:
     * <ul>
     *     <li>{@link #KEY_APOSTROPHE}</li>
     *     <li>{@link #KEY_COMMA}</li>
     *     <li>{@link #KEY_MINUS}</li>
     *     <li>{@link #KEY_PERIOD}</li>
     *     <li>{@link #KEY_SLASH}</li>
     *     <li>{@link #KEY_SEMICOLON}</li>
     *     <li>{@link #KEY_EQUAL}</li>
     *     <li>{@link #KEY_LEFT_BRACKET}</li>
     *     <li>{@link #KEY_RIGHT_BRACKET}</li>
     *     <li>{@link #KEY_BACKSLASH}</li>
     *     <li>{@link #KEY_WORLD_1}</li>
     *     <li>{@link #KEY_WORLD_2}</li>
     *     <li>{@link #KEY_0} to {@link #KEY_9}</li>
     *     <li>{@link #KEY_A} to {@link #KEY_Z}</li>
     *     <li>{@link #KEY_KP_0} to {@link #KEY_KP_9}</li>
     *     <li>{@link #KEY_KP_DECIMAL}</li>
     *     <li>{@link #KEY_KP_DIVIDE}</li>
     *     <li>{@link #KEY_KP_MULTIPLY}</li>
     *     <li>{@link #KEY_KP_SUBTRACT}</li>
     *     <li>{@link #KEY_KP_ADD}</li>
     *     <li>{@link #KEY_KP_EQUAL}</li>
     * </ul>
     * <p>
     * Names for printable keys depend on keyboard layout, while names for
     * non-printable keys are the same across layouts but depend on the application
     * language and should be localized along with other user interface text.
     *
     * @param key      The key to query, or {@link #KEY_UNKNOWN}.
     * @param scancode The scancode of the key to query.
     * @return The UTF-8 encoded, layout-specific name of the key, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark The contents of the returned string may change when a keyboard
     * layout change event is received.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment ngetKeyName(int key, int scancode) {
        try {
            return (MemorySegment) glfwGetKeyName.invokeExact(key, scancode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the layout-specific name of the specified printable key.
     *
     * @param key      The key to query, or {@link #KEY_UNKNOWN}.
     * @param scancode The scancode of the key to query.
     * @return The UTF-8 encoded, layout-specific name of the key, or {@code null}.
     * @see #ngetKeyName(int, int) ngetKeyName
     */
    @Nullable
    public static String getKeyName(int key, int scancode) {
        var pName = ngetKeyName(key, scancode);
        return RuntimeHelper.isNullptr(pName) ? null : pName.getUtf8String(0);
    }

    /**
     * Returns the platform-specific scancode of the specified key.
     * <p>
     * This function returns the platform-specific scancode of the specified key.
     * <p>
     * If the key is {@code KEY_UNKNOWN} or does not exist on the keyboard this
     * method will return {@code -1}.
     *
     * @param key Any <a href="https://www.glfw.org/docs/latest/group__keys.html">named key</a>.
     * @return The platform-specific scancode for the key, or {@code -1} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may be called from any thread.
     */
    public static int getKeyScancode(int key) {
        try {
            return (int) glfwGetKeyScancode.invokeExact(key);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the last reported state of a keyboard key for the specified
     * window.
     * <p>
     * This function returns the last state reported for the specified key to the
     * specified window.  The returned state is one of {@code PRESS} or
     * {@code RELEASE}.  The action {@code REPEAT} is only reported to the key callback.
     * <p>
     * If the {@link #STICKY_KEYS} input mode is enabled, this function returns
     * {@code PRESS} the first time you call it for a key that was pressed, even if
     * that key has already been released.
     * <p>
     * The key functions deal with physical keys, with
     * <a href="https://www.glfw.org/docs/latest/group__keys.html">key tokens</a>
     * named after their use on the standard US keyboard layout.  If you want to
     * input text, use the Unicode character callback instead.
     * <p>
     * The <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier key bit masks</a>
     * are not key tokens and cannot be used with this function.
     * <p>
     * <b>Do not use this function </b>to implement
     * <a href="https://www.glfw.org/docs/latest/input_guide.html#input_char">text input</a>.
     *
     * @param window The desired window.
     * @param key    The desired <a href="https://www.glfw.org/docs/latest/group__keys.html">keyboard key</a>.
     *               {@code KEY_UNKNOWN} is not a valid key for this function.
     * @return One of {@code PRESS} or {@code RELEASE}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static int getKey(MemorySegment window, int key) {
        try {
            return (int) glfwGetKey.invokeExact(window, key);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the last reported state of a mouse button for the specified
     * window.
     * <p>
     * This function returns the last state reported for the specified mouse button
     * to the specified window.  The returned state is one of {@code PRESS} or
     * {@code RELEASE}.
     * <p>
     * If the {@link #STICKY_MOUSE_BUTTONS} input mode is enabled, this function
     * returns {@code PRESS} the first time you call it for a mouse button that was
     * pressed, even if that mouse button has already been released.
     *
     * @param window The desired window.
     * @param button The desired <a href="https://www.glfw.org/docs/latest/group__buttons.html">mouse button</a>.
     * @return One of {@code PRESS} or {@code RELEASE}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #INVALID_ENUM}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static int getMouseButton(MemorySegment window, int button) {
        try {
            return (int) glfwGetMouseButton.invokeExact(window, button);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the position of the cursor relative to the content area of
     * the window.
     * <p>
     * This function returns the position of the cursor, in screen coordinates,
     * relative to the upper-left corner of the content area of the specified
     * window.
     * <p>
     * If the cursor is disabled (with {@link #CURSOR_DISABLED}) then the cursor
     * position is unbounded and limited only by the minimum and maximum values of
     * a {@code double}.
     * <p>
     * The coordinate can be converted to their integer equivalents with the
     * {@code floor} function.  Casting directly to an integer type works for positive
     * coordinates, but fails for negative ones.
     * <p>
     * Any or all of the position arguments may be {@link MemorySegment#NULL NULL}.  If an error occurs, all
     * non-{@link MemorySegment#NULL NULL} position arguments will be set to zero.
     *
     * @param window The desired window.
     * @param xpos   Where to store the cursor x-coordinate, relative to the
     *               left edge of the content area, or {@link MemorySegment#NULL NULL}.
     * @param ypos   Where to store the cursor y-coordinate, relative to the to
     *               top edge of the content area, or {@link MemorySegment#NULL NULL}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #setCursorPos(MemorySegment, double, double) setCursorPos
     */
    public static void ngetCursorPos(MemorySegment window, MemorySegment xpos, MemorySegment ypos) {
        try {
            glfwGetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the position of the cursor relative to the content area of
     * the window.
     *
     * @param window The desired window.
     * @param xpos   Where to store the cursor x-coordinate, relative to the
     *               left edge of the content area, or {@code null}.
     * @param ypos   Where to store the cursor y-coordinate, relative to the to
     *               top edge of the content area, or {@code null}.
     * @see #ngetCursorPos(MemorySegment, MemorySegment, MemorySegment) ngetCursorPos
     */
    public static void getCursorPos(MemorySegment window, double @Nullable [] xpos, double @Nullable [] ypos) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = xpos != null ? stack.calloc(JAVA_DOUBLE) : MemorySegment.NULL;
            var py = ypos != null ? stack.calloc(JAVA_DOUBLE) : MemorySegment.NULL;
            ngetCursorPos(window, px, py);
            if (xpos != null && xpos.length > 0) {
                xpos[0] = px.get(JAVA_DOUBLE, 0);
            }
            if (ypos != null && ypos.length > 0) {
                ypos[0] = py.get(JAVA_DOUBLE, 0);
            }
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the position of the cursor relative to the content area of
     * the window.
     *
     * @param window The desired window.
     * @return the cursor xy-coordinate, relative to the left and top edge of the content area.
     * @see #ngetCursorPos(MemorySegment, MemorySegment, MemorySegment) ngetCursorPos
     */
    public static Value2.OfDouble getCursorPos(MemorySegment window) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_DOUBLE);
            var py = stack.calloc(JAVA_DOUBLE);
            ngetCursorPos(window, px, py);
            return new Value2.OfDouble(px.get(JAVA_DOUBLE, 0), py.get(JAVA_DOUBLE, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Sets the position of the cursor, relative to the content area of the
     * window.
     * <p>
     * This function sets the position, in screen coordinates, of the cursor
     * relative to the upper-left corner of the content area of the specified
     * window.  The window must have input focus.  If the window does not have
     * input focus when this function is called, it fails silently.
     * <p>
     * <b>Do not use this function</b> to implement things like camera controls.  GLFW
     * already provides the {@link #CURSOR_DISABLED} cursor mode that hides the
     * cursor, transparently re-centers it and provides unconstrained cursor
     * motion.  See {@link #setInputMode} for more information.
     * <p>
     * If the cursor mode is {@link #CURSOR_DISABLED} then the cursor position is
     * unconstrained and limited only by the minimum and maximum values of
     * a {@code double}.
     *
     * @param window The desired window.
     * @param xpos   The desired x-coordinate, relative to the left edge of the
     *               content area.
     * @param ypos   The desired y-coordinate, relative to the top edge of the
     *               content area.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.remark <b>Wayland:</b> This function will only work when the cursor mode is
     * {@link #CURSOR_DISABLED}, otherwise it will do nothing.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetCursorPos(MemorySegment, MemorySegment, MemorySegment) getCursorPos
     */
    public static void setCursorPos(MemorySegment window, double xpos, double ypos) {
        try {
            glfwSetCursorPos.invokeExact(window, xpos, ypos);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Creates a custom cursor.
     * <p>
     * Creates a new custom cursor image that can be set for a window with
     * {@link #setCursor}.  The cursor can be destroyed with {@link #destroyCursor}.
     * Any remaining cursors are destroyed by {@link #terminate}.
     * <p>
     * The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight
     * bits per channel with the red channel first.  They are arranged canonically
     * as packed sequential rows, starting from the top-left corner.
     * <p>
     * The cursor hotspot is specified in pixels, relative to the upper-left corner
     * of the cursor image.  Like all other coordinate systems in GLFW, the X-axis
     * points to the right and the Y-axis points down.
     *
     * @param image The desired cursor image.
     * @param xhot  The desired x-coordinate, in pixels, of the cursor hotspot.
     * @param yhot  The desired y-coordinate, in pixels, of the cursor hotspot.
     * @return The handle of the created cursor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_VALUE} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified image data is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #destroyCursor(MemorySegment) destroyCursor
     * @see #createStandardCursor(int) createStandardCursor
     */
    public static MemorySegment ncreateCursor(MemorySegment image, int xhot, int yhot) {
        try {
            return (MemorySegment) glfwCreateCursor.invokeExact(image, xhot, yhot);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Creates a custom cursor.
     *
     * @param image The desired cursor image.
     * @param xhot  The desired x-coordinate, in pixels, of the cursor hotspot.
     * @param yhot  The desired y-coordinate, in pixels, of the cursor hotspot.
     * @return The handle of the created cursor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ncreateCursor(MemorySegment, int, int) ncreateCursor
     */
    public static MemorySegment createCursor(GLFWImage image, int xhot, int yhot) {
        return ncreateCursor(image.address(), xhot, yhot);
    }

    /**
     * Creates a cursor with a standard shape.
     * <p>
     * Returns a cursor with a <a href="https://www.glfw.org/docs/latest/group__shapes.html">standard shape</a>,
     * that can be set for a window with {@link #setCursor}.
     *
     * @param shape One of the <a href="https://www.glfw.org/docs/latest/group__shapes.html">standard shapes</a>.
     * @return A new cursor ready to use or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #INVALID_ENUM} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ncreateCursor(MemorySegment, int, int) createCursor
     */
    public static MemorySegment createStandardCursor(int shape) {
        try {
            return (MemorySegment) glfwCreateStandardCursor.invokeExact(shape);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Destroys a cursor.
     * <p>
     * This function destroys a cursor previously created with
     * {@link #createCursor}.  Any remaining cursors will be destroyed by
     * {@link #terminate}.
     * <p>
     * If the specified cursor is current for any window, that window will be
     * reverted to the default cursor.  This does not affect the cursor mode.
     *
     * @param cursor The cursor object to destroy.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.reentrancy This function must not be called from a callback.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ncreateCursor(MemorySegment, int, int) createCursor
     */
    public static void destroyCursor(MemorySegment cursor) {
        try {
            glfwDestroyCursor.invokeExact(cursor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the cursor for the window.
     * <p>
     * This function sets the cursor image to be used when the cursor is over the
     * content area of the specified window.  The set cursor will only be visible
     * when the <a href="https://www.glfw.org/docs/latest/input_guide.html#cursor_mode">cursor mode</a>
     * of the window is {@link #CURSOR_NORMAL}.
     * <p>
     * On some platforms, the set cursor may not be visible unless the window also
     * has input focus.
     *
     * @param window The window to set the cursor for.
     * @param cursor The cursor to set, or {@link MemorySegment#NULL NULL} to switch
     *               back to the default arrow cursor.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static void setCursor(MemorySegment window, MemorySegment cursor) {
        try {
            glfwSetCursor.invokeExact(window, cursor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
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
     * events for all pressed keys.  You can tell these events from user-generated
     * events by the fact that the synthetic ones are generated after the focus
     * loss event has been processed, i.e. after the
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
     * {@link IGLFWKeyFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetKeyCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetKeyCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setKeyCallback(MemorySegment window, @Nullable IGLFWKeyFun callback) {
        return nsetKeyCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWCharFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetCharCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetCharCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setCharCallback(MemorySegment window, @Nullable IGLFWCharFun callback) {
        return nsetCharCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWMouseButtonFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetMouseButtonCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetMouseButtonCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setMouseButtonCallback(MemorySegment window, @Nullable IGLFWMouseButtonFun callback) {
        return nsetMouseButtonCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWCursorPosFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetCursorPosCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetCursorPosCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setCursorPosCallback(MemorySegment window, @Nullable IGLFWCursorPosFun callback) {
        return nsetCursorPosCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWCursorEnterFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetCursorEnterCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetCursorEnterCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setCursorEnterCallback(MemorySegment window, @Nullable IGLFWCursorEnterFun callback) {
        return nsetCursorEnterCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWScrollFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetScrollCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetScrollCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setScrollCallback(MemorySegment window, @Nullable IGLFWScrollFun callback) {
        return nsetScrollCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
     * {@link IGLFWDropFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.remark <b>Wayland:</b> File drop is currently unimplemented.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetDropCallback(MemorySegment window, MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetDropCallback.invokeExact(window, callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment setDropCallback(MemorySegment window, @Nullable IGLFWDropFun callback) {
        return nsetDropCallback(window, callback != null ? callback.address(Callbacks.create(window)) : MemorySegment.NULL);
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
    public static boolean joystickPresent(int jid) {
        try {
            return (int) glfwJoystickPresent.invokeExact(jid) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment ngetJoystickAxes(int jid, MemorySegment count) {
        try {
            return (MemorySegment) glfwGetJoystickAxes.invokeExact(jid, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the values of all axes of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of axis values, or {@code null} if the
     * joystick is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @see #ngetJoystickAxes(int, MemorySegment) ngetJoystickAxes
     */
    public static float @Nullable [] getJoystickAxes(int jid) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        MemorySegment pAxes;
        final int count;
        try {
            var pCount = stack.calloc(JAVA_INT);
            pAxes = ngetJoystickAxes(jid, pCount);
            count = pCount.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
        if (count == 0) return null;
        return RuntimeHelper.toArray(pAxes, new float[count]);
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
    public static MemorySegment ngetJoystickButtons(int jid, MemorySegment count) {
        try {
            return (MemorySegment) glfwGetJoystickButtons.invokeExact(jid, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the state of all buttons of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of button states, or {@code null} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickButtons(int, MemorySegment) ngetJoystickButtons
     */
    public static boolean @Nullable [] getJoystickButtons(int jid) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        MemorySegment pButtons;
        final int count;
        try {
            var pCount = stack.calloc(JAVA_INT);
            pButtons = ngetJoystickButtons(jid, pCount);
            count = pCount.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
        if (count == 0) return null;
        boolean[] buttons = new boolean[count];
        for (int i = 0; i < count; i++) {
            buttons[i] = pButtons.getAtIndex(JAVA_INT, i) == PRESS;
        }
        return buttons;
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
     *
     * <pre>{@code
     * if (hats[2] & HAT_RIGHT) {
     *     // State of hat 2 could be right-up, right or right-down
     * }}</pre>
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
    public static MemorySegment ngetJoystickHats(int jid, MemorySegment count) {
        try {
            return (MemorySegment) glfwGetJoystickHats.invokeExact(jid, count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the state of all hats of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return An array of hat states, or {@code null} if the joystick is not present
     * or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickHats(int, MemorySegment) ngetJoystickHats
     */
    public static byte[] getJoystickHats(int jid) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pCount = stack.calloc(JAVA_INT);
            var pHats = ngetJoystickHats(jid, pCount);
            return RuntimeHelper.toArray(pHats, new byte[pCount.get(JAVA_INT, 0)]);
        } finally {
            stack.setPointer(stackPointer);
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
    public static MemorySegment ngetJoystickName(int jid) {
        try {
            return (MemorySegment) glfwGetJoystickName.invokeExact(jid);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the name of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the joystick, or {@code null} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickName(int) ngetJoystickName
     */
    @Nullable
    public static String getJoystickName(int jid) {
        var pName = ngetJoystickName(jid);
        return RuntimeHelper.isNullptr(pName) ? null : pName.getUtf8String(0);
    }

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
    public static MemorySegment ngetJoystickGUID(int jid) {
        try {
            return (MemorySegment) glfwGetJoystickGUID.invokeExact(jid);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the SDL compatible GUID of the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded GUID of the joystick, or {@code null} if the joystick
     * is not present or an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetJoystickGUID(int) ngetJoystickGUID
     */
    @Nullable
    public static String getJoystickGUID(int jid) {
        var pGUID = ngetJoystickGUID(jid);
        return RuntimeHelper.isNullptr(pGUID) ? null : pGUID.getUtf8String(0);
    }

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
    public static void setJoystickUserPointer(int jid, MemorySegment pointer) {
        try {
            glfwSetJoystickUserPointer.invokeExact(jid, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * {@return the user pointer of the specified joystick.}
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
    public static MemorySegment getJoystickUserPointer(int jid) {
        try {
            return (MemorySegment) glfwGetJoystickUserPointer.invokeExact(jid);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static boolean joystickIsGamepad(int jid) {
        try {
            return (int) glfwJoystickIsGamepad.invokeExact(jid) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
     * {@link IGLFWJoystickFun function pointer type}.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function must only be called from the main thread.
     */
    public static MemorySegment nsetJoystickCallback(MemorySegment callback) {
        try {
            return (MemorySegment) glfwSetJoystickCallback.invokeExact(callback);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the joystick configuration callback.
     *
     * @param callback The new callback, or {@code null} to remove the currently set
     *                 callback.
     * @return The previously set callback, or {@link MemorySegment#NULL NULL} if no callback was set or the
     * library had not been <a href="https://www.glfw.org/docs/latest/intro_guide.html#intro_init">initialized</a>.
     * @see #nsetJoystickCallback(MemorySegment) nsetJoystickCallback
     */
    public static MemorySegment setJoystickCallback(@Nullable IGLFWJoystickFun callback) {
        return nsetJoystickCallback(callback != null ? callback.address(Arena.global()) : MemorySegment.NULL);
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
    public static boolean nupdateGamepadMappings(MemorySegment string) {
        try {
            return (int) glfwUpdateGamepadMappings.invokeExact(string) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Adds the specified SDL_GameControllerDB gamepad mappings.
     *
     * @param allocator The string allocator.
     * @param string    The string containing the gamepad mappings.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #nupdateGamepadMappings(MemorySegment) nupdateGamepadMappings
     */
    public static boolean updateGamepadMappings(SegmentAllocator allocator, String string) {
        return nupdateGamepadMappings(allocator.allocateUtf8String(string));
    }

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
    public static MemorySegment ngetGamepadName(int jid) {
        try {
            return (MemorySegment) glfwGetGamepadName.invokeExact(jid);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the human-readable gamepad name for the specified joystick.
     *
     * @param jid The <a href="https://www.glfw.org/docs/latest/group__joysticks.html">joystick</a> to query.
     * @return The UTF-8 encoded name of the gamepad, or {@code null} if the
     * joystick is not present, does not have a mapping or an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetGamepadName(int) ngetGamepadName
     */
    @Nullable
    public static String getGamepadName(int jid) {
        var pName = ngetGamepadName(jid);
        return RuntimeHelper.isNullptr(pName) ? null : pName.getUtf8String(0);
    }

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
    public static boolean ngetGamepadState(int jid, MemorySegment state) {
        try {
            return (int) glfwGetGamepadState.invokeExact(jid, state) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static boolean getGamepadState(int jid, GLFWGamepadState state) {
        return ngetGamepadState(jid, state.address());
    }

    /**
     * Sets the clipboard to the specified string.
     * <p>
     * This function sets the system clipboard to the specified, UTF-8 encoded
     * string.
     *
     * @param window Deprecated.  Any valid window or {@link MemorySegment#NULL NULL}.
     * @param string A UTF-8 encoded string.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED} and
     * {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified string is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetClipboardString(MemorySegment) getClipboardString
     */
    public static void nsetClipboardString(@Deprecated MemorySegment window, MemorySegment string) {
        try {
            glfwSetClipboardString.invokeExact(window, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the clipboard to the specified string.
     *
     * @param allocator The string allocator.
     * @param window    Deprecated.  Any valid window or {@link MemorySegment#NULL NULL}.
     * @param string    A UTF-8 encoded string.
     * @see #nsetClipboardString(MemorySegment, MemorySegment) nsetClipboardString
     */
    public static void setClipboardString(SegmentAllocator allocator, @Deprecated MemorySegment window, String string) {
        nsetClipboardString(window, allocator.allocateUtf8String(string));
    }

    /**
     * Returns the contents of the clipboard as a string.
     * <p>
     * This function returns the contents of the system clipboard, if it contains
     * or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
     * if its contents cannot be converted, {@link MemorySegment#NULL NULL} is returned and a
     * {@link #FORMAT_UNAVAILABLE} error is generated.
     *
     * @param window Deprecated.  Any valid window or {@link MemorySegment#NULL NULL}.
     * @return The contents of the clipboard as a UTF-8 encoded string, or {@link MemorySegment#NULL NULL}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #FORMAT_UNAVAILABLE} and {@link #PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
     * should not free it yourself.  It is valid until the next call to
     * {@link #ngetClipboardString(MemorySegment) getClipboardString} or
     * {@link #nsetClipboardString(MemorySegment, MemorySegment) setClipboardString},
     * or until the library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetClipboardString(MemorySegment, MemorySegment) setClipboardString
     */
    public static MemorySegment ngetClipboardString(@Deprecated MemorySegment window) {
        try {
            return (MemorySegment) glfwGetClipboardString.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the contents of the clipboard as a string.
     *
     * @param window Deprecated.  Any valid window or {@link MemorySegment#NULL NULL}.
     * @return The contents of the clipboard as a UTF-8 encoded string, or {@code null}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     */
    @Nullable
    public static String getClipboardString(@Deprecated MemorySegment window) {
        var pString = ngetClipboardString(window);
        return RuntimeHelper.isNullptr(pString) ? null : pString.getUtf8String(0);
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
     * time source on each supported platform.
     *
     * @return The current time, in seconds, or zero if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Reading and
     * writing of the internal base time is not atomic, so it needs to be
     * externally synchronized with calls to {@link #setTime}.
     */
    public static double getTime() {
        try {
            return (double) glfwGetTime.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static void setTime(double time) {
        try {
            glfwSetTime.invokeExact(time);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static long getTimerValue() {
        try {
            return (long) glfwGetTimerValue.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static long getTimerFrequency() {
        try {
            return (long) glfwGetTimerFrequency.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Makes the context of the specified window current for the calling
     * thread.
     * <p>
     * This function makes the OpenGL or OpenGL ES context of the specified window
     * current on the calling thread.  A context must only be made current on
     * a single thread at a time and each thread can have only a single current
     * context at a time.
     * <p>
     * When moving a context between threads, you must make it non-current on the
     * old thread before making it current on the new one.
     * <p>
     * By default, making a context non-current implicitly forces a pipeline flush.
     * On machines that support {@code GL_KHR_context_flush_control}, you can control
     * whether a context performs this flush by setting the
     * {@link #CONTEXT_RELEASE_BEHAVIOR}
     * hint.
     * <p>
     * The specified window must have an OpenGL or OpenGL ES context.  Specifying
     * a window without a context will generate a {@link #NO_WINDOW_CONTEXT}
     * error.
     *
     * @param window The window whose context to make current, or {@link MemorySegment#NULL NULL} to
     *               detach the current context.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED},
     * {@link #NO_WINDOW_CONTEXT} and {@link #PLATFORM_ERROR}.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #getCurrentContext
     */
    public static void makeContextCurrent(MemorySegment window) {
        try {
            glfwMakeContextCurrent.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment getCurrentContext() {
        try {
            return (MemorySegment) glfwGetCurrentContext.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static void swapBuffers(MemorySegment window) {
        try {
            glfwSwapBuffers.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
     * swap interval set to whatever is the default on that platform.  This is done
     * because some swap interval extensions used by GLFW do not allow the swap
     * interval to be reset to zero once it has been set to a non-zero value.
     * @glfw.remark Some GPU drivers do not honor the requested swap interval, either
     * because of a user setting that overrides the application's request or due to
     * bugs in the driver.
     * @glfw.thread_safety This function may be called from any thread.
     * @see #swapBuffers
     */
    public static void swapInterval(int interval) {
        try {
            glfwSwapInterval.invokeExact(interval);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static boolean nextensionSupported(MemorySegment extension) {
        try {
            return (int) glfwExtensionSupported.invokeExact(extension) != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns whether the specified extension is available.
     *
     * @param allocator The extension string allocator.
     * @param extension The ASCII encoded name of the extension.
     * @return {@code true} if the extension is available, or {@code false}
     * otherwise.
     * @see #nextensionSupported(MemorySegment) nextensionSupported
     */
    public static boolean extensionSupported(SegmentAllocator allocator, String extension) {
        return nextensionSupported(allocator.allocateUtf8String(extension));
    }

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
     * see {@link GLFWVulkan#nglfwGetInstanceProcAddress(MemorySegment, MemorySegment) glfwGetInstanceProcAddress},
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
    public static MemorySegment ngetProcAddress(MemorySegment procName) {
        try {
            return (MemorySegment) glfwGetProcAddress.invokeExact(procName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the address of the specified function for the current
     * context.
     *
     * @param allocator The segment allocator to allocate the string.
     * @param procName  The ASCII encoded name of the function.
     * @return The address of the function, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetProcAddress(MemorySegment) ngetProcAddress
     */
    public static MemorySegment getProcAddress(SegmentAllocator allocator, String procName) {
        return ngetProcAddress(allocator.allocateUtf8String(procName));
    }

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
     * {@link GLFWVulkan#glfwGetPhysicalDevicePresentationSupport glfwGetPhysicalDevicePresentationSupport}
     * to check whether a queue family of a physical device supports image presentation.
     *
     * @return {@code true} if Vulkan is minimally available, or {@code false}
     * otherwise.
     * @glfw.errors Possible errors include {@link #NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.
     */
    public static boolean vulkanSupported() {
        try {
            return (int) glfwVulkanSupported.invokeExact() != FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

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
    public static MemorySegment ngetRequiredInstanceExtensions(MemorySegment count) {
        try {
            return (MemorySegment) glfwGetRequiredInstanceExtensions.invokeExact(count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the Vulkan instance extensions required by GLFW.
     *
     * @return An array of ASCII encoded extension names, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetRequiredInstanceExtensions(MemorySegment) ngetRequiredInstanceExtensions
     */
    public static String @Nullable [] getRequiredInstanceExtensions() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        MemorySegment pExt;
        final int count;
        try {
            var pCount = stack.calloc(JAVA_INT);
            pExt = ngetRequiredInstanceExtensions(pCount);
            count = pCount.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
        if (count == 0) return null;
        return RuntimeHelper.toUnboundedArray(pExt, new String[count]);
    }
}
