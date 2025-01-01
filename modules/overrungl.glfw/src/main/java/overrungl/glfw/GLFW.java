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
/// ## Window creation hints
///
/// ### Window related hints
///
/// __GLFW_RESIZABLE__ specifies whether the windowed mode window will be resizable
/// _by the user_.  The window will still be resizable using the
/// [glfwSetWindowSize][#glfwSetWindowSize(MemorySegment, int, int)] function.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.
/// This hint is ignored for full screen and undecorated windows.
///
/// __GLFW_VISIBLE__ specifies whether the windowed mode window will be initially
/// visible.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This hint is
/// ignored for full screen windows.
///
/// __GLFW_DECORATED__ specifies whether the windowed mode window will have window
/// decorations such as a border, a close widget, etc.  An undecorated window will
/// not be resizable by the user but will still allow the user to generate close
/// events on some platforms.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.
/// This hint is ignored for full screen windows.
///
/// __GLFW_FOCUSED__ specifies whether the windowed mode window will be given input
/// focus when created.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This
/// hint is ignored for full screen and initially hidden windows.
///
/// __GLFW_AUTO_ICONIFY__ specifies whether the full screen window will
/// automatically iconify and restore the previous video mode on input focus loss.
/// Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This hint is ignored for
/// windowed mode windows.
///
/// __GLFW_FLOATING__ specifies whether the windowed mode window will be floating
/// above other regular windows, also called topmost or always-on-top.  This is
/// intended primarily for debugging purposes and cannot be used to implement proper
/// full screen windows.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This
/// hint is ignored for full screen windows.
///
/// __GLFW_MAXIMIZED__ specifies whether the windowed mode window will be maximized
/// when created.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This hint is
/// ignored for full screen windows.
///
/// __GLFW_CENTER_CURSOR__ specifies whether the cursor should be centered over
/// newly created full screen windows.  Possible values are `GLFW_TRUE` and
/// `GLFW_FALSE`.  This hint is ignored for windowed mode windows.
///
/// __GLFW_TRANSPARENT_FRAMEBUFFER__ specifies whether the window framebuffer will
/// be transparent.  If enabled and supported by the system, the window framebuffer
/// alpha channel will be used to combine the framebuffer with the background.  This
/// does not affect window decorations.  Possible values are `GLFW_TRUE` and
/// `GLFW_FALSE`.
///
/// __GLFW_FOCUS_ON_SHOW__ specifies whether the window will be given input
/// focus when [glfwShowWindow][#glfwShowWindow(MemorySegment)] is called. Possible values are `GLFW_TRUE` and
/// `GLFW_FALSE`.
///
/// __GLFW_SCALE_TO_MONITOR__ specified whether the window content area should be
/// resized based on content scale changes.  This can be
/// because of a global user settings change or because the window was moved to
/// a monitor with different scale settings.
///
/// This hint only has an effect on platforms where screen coordinates and pixels
/// always map 1:1, such as Windows and X11.  On platforms like macOS the resolution
/// of the framebuffer can change independently of the window size.
///
/// __GLFW_SCALE_FRAMEBUFFER__ specifies whether the framebuffer should be resized
/// based on content scale changes.  This can be
/// because of a global user settings change or because the window was moved to
/// a monitor with different scale settings.
///
/// This hint only has an effect on platforms where screen coordinates can be scaled
/// relative to pixel coordinates, such as macOS and Wayland.  On platforms like
/// Windows and X11 the framebuffer and window content area sizes always map 1:1.
///
/// This is the new name, introduced in GLFW 3.4.  The older
/// `GLFW_COCOA_RETINA_FRAMEBUFFER` name is also available for compatibility.  Both
/// names modify the same hint value.
///
/// __GLFW_MOUSE_PASSTHROUGH__ specifies whether the window is transparent to mouse
/// input, letting any mouse events pass through to whatever window is behind it.
/// This is only supported for undecorated windows.  Decorated windows with this
/// enabled will behave differently between platforms.  Possible values are
/// `GLFW_TRUE` and `GLFW_FALSE`.
///
/// __GLFW_POSITION_X__ and __GLFW_POSITION_Y__ specify the desired initial position
/// of the window.  The window manager may modify or ignore these coordinates.  If
/// either or both of these hints are set to `GLFW_ANY_POSITION` then the window
/// manager will position the window where it thinks the user will prefer it.
/// Possible values are any valid screen coordinates and `GLFW_ANY_POSITION`.
///
/// ### Framebuffer related hints
///
/// __GLFW_RED_BITS__, __GLFW_GREEN_BITS__, __GLFW_BLUE_BITS__, __GLFW_ALPHA_BITS__,
/// __GLFW_DEPTH_BITS__ and __GLFW_STENCIL_BITS__ specify the desired bit depths of
/// the various components of the default framebuffer.  A value of `GLFW_DONT_CARE`
/// means the application has no preference.
///
/// __GLFW_ACCUM_RED_BITS__, __GLFW_ACCUM_GREEN_BITS__, __GLFW_ACCUM_BLUE_BITS__ and
/// __GLFW_ACCUM_ALPHA_BITS__ specify the desired bit depths of the various
/// components of the accumulation buffer.  A value of `GLFW_DONT_CARE` means the
/// application has no preference.
///
/// Accumulation buffers are a legacy OpenGL feature and should not be used in new
/// code.
///
/// __GLFW_AUX_BUFFERS__ specifies the desired number of auxiliary buffers.  A value
/// of `GLFW_DONT_CARE` means the application has no preference.
///
/// Auxiliary buffers are a legacy OpenGL feature and should not be used in new
/// code.
///
/// __GLFW_STEREO__ specifies whether to use OpenGL stereoscopic rendering.
/// Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This is a hard constraint.
///
/// __GLFW_SAMPLES__ specifies the desired number of samples to use for
/// multisampling.  Zero disables multisampling.  A value of `GLFW_DONT_CARE` means
/// the application has no preference.
///
/// __GLFW_SRGB_CAPABLE__ specifies whether the framebuffer should be sRGB capable.
/// Possible values are `GLFW_TRUE` and `GLFW_FALSE`.
///
/// > __Note__
/// >
/// > __OpenGL:__ If enabled and supported by the system, the
/// > `GL_FRAMEBUFFER_SRGB` enable will control sRGB rendering.  By default, sRGB
/// > rendering will be disabled.
/// >
/// > __OpenGL ES:__ If enabled and supported by the system, the context will
/// > always have sRGB rendering enabled.
///
/// __GLFW_DOUBLEBUFFER__ specifies whether the framebuffer should be double
/// buffered.  You nearly always want to use double buffering.  This is a hard
/// constraint.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.
///
/// ### Monitor related hints
///
/// __GLFW_REFRESH_RATE__ specifies the desired refresh rate for full screen
/// windows.  A value of `GLFW_DONT_CARE` means the highest available refresh rate
/// will be used.  This hint is ignored for windowed mode windows.
///
/// ### Context related hints
///
/// __GLFW_CLIENT_API__ specifies which client API to create the context for.
/// Possible values are `GLFW_OPENGL_API`, `GLFW_OPENGL_ES_API` and `GLFW_NO_API`.
/// This is a hard constraint.
///
/// __GLFW_CONTEXT_CREATION_API__ specifies which context creation API to use to
/// create the context.  Possible values are `GLFW_NATIVE_CONTEXT_API`,
/// `GLFW_EGL_CONTEXT_API` and `GLFW_OSMESA_CONTEXT_API`.  This is a hard
/// constraint.  If no client API is requested, this hint is ignored.
///
/// An extension loader library that assumes it knows
/// which API was used to create the current context may fail if you change this
/// hint.  This can be resolved by having it load functions via
/// [glfwGetProcAddress][#glfwGetProcAddress(MemorySegment)].
///
/// > __Note__
/// >
/// > __Wayland:__ The EGL API _is_ the native context creation API, so this hint
/// > will have no effect.
/// >
/// > __X11:__ On some Linux systems, creating contexts via both the native and EGL
/// > APIs in a single process will cause the application to segfault.  Stick to one
/// > API or the other on Linux for now.
/// >
/// > __OSMesa:__ As its name implies, an OpenGL context created with OSMesa
/// > does not update the window contents when its buffers are swapped.  Use OpenGL
/// > functions or the OSMesa native access functions [glfwGetOSMesaColorBuffer][GLFWNative#glfwGetOSMesaColorBuffer(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment)]
/// > and [glfwGetOSMesaDepthBuffer][GLFWNative#glfwGetOSMesaDepthBuffer(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment)] to retrieve the framebuffer contents.
///
/// __GLFW_CONTEXT_VERSION_MAJOR__ and __GLFW_CONTEXT_VERSION_MINOR__ specify the
/// client API version that the created context must be compatible with.  The exact
/// behavior of these hints depend on the requested client API.
///
/// While there is no way to ask the driver for a context of the highest supported
/// version, GLFW will attempt to provide this when you ask for a version 1.0
/// context, which is the default for these hints.
///
/// Do not confuse these hints with [GLFW_VERSION_MAJOR][#GLFW_VERSION_MAJOR] and
/// [GLFW_VERSION_MINOR][#GLFW_VERSION_MINOR], which provide the API version of the GLFW header.
///
/// > __Note__
/// >
/// > __OpenGL:__ These hints are not hard constraints, but creation will fail
/// > if the OpenGL version of the created context is less than the one requested.  It
/// > is therefore perfectly safe to use the default of version 1.0 for legacy code
/// > and you will still get backwards-compatible contexts of version 3.0 and above
/// > when available.
/// >
/// > __OpenGL ES:__ These hints are not hard constraints, but creation will
/// > fail if the OpenGL ES version of the created context is less than the one
/// > requested.  Additionally, OpenGL ES 1.x cannot be returned if 2.0 or later was
/// > requested, and vice versa.  This is because OpenGL ES 3.x is backward compatible
/// > with 2.0, but OpenGL ES 2.0 is not backward compatible with 1.x.
/// >
/// > __macOS:__ The OS only supports core profile contexts for OpenGL versions 3.2
/// > and later.  Before creating an OpenGL context of version 3.2 or later you must
/// > set the [GLFW_OPENGL_PROFILE](@ref GLFW_OPENGL_PROFILE_hint) hint accordingly.
/// > OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.
///
/// __GLFW_OPENGL_FORWARD_COMPAT__ specifies whether the OpenGL context should be
/// forward-compatible, i.e. one where all functionality deprecated in the requested
/// version of OpenGL is removed.  This must only be used if the requested OpenGL
/// version is 3.0 or above.  If OpenGL ES is requested, this hint is ignored.
///
/// Forward-compatibility is described in detail in the
/// [OpenGL Reference Manual](https://www.opengl.org/registry/).
///
/// __GLFW_CONTEXT_DEBUG__ specifies whether the context should be created in debug
/// mode, which may provide additional error and diagnostic reporting functionality.
/// Possible values are `GLFW_TRUE` and `GLFW_FALSE`.
///
/// Debug contexts for OpenGL and OpenGL ES are described in detail by the
/// [GL_KHR_debug](https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_debug.txt) extension.
///
/// > __Note__
/// >
/// > `GLFW_CONTEXT_DEBUG` is the new name introduced in GLFW 3.4.  The older
/// > `GLFW_OPENGL_DEBUG_CONTEXT` name is also available for compatibility.
///
/// __GLFW_OPENGL_PROFILE__ specifies which OpenGL profile to create the context
/// for.  Possible values are one of `GLFW_OPENGL_CORE_PROFILE` or
/// `GLFW_OPENGL_COMPAT_PROFILE`, or `GLFW_OPENGL_ANY_PROFILE` to not request
/// a specific profile.  If requesting an OpenGL version below 3.2,
/// `GLFW_OPENGL_ANY_PROFILE` must be used.  If OpenGL ES is requested, this hint
/// is ignored.
///
/// OpenGL profiles are described in detail in the
/// [OpenGL Reference Manual](https://www.opengl.org/registry/).
///
/// __GLFW_CONTEXT_ROBUSTNESS__ specifies the robustness strategy to be used by the
/// context.  This can be one of `GLFW_NO_RESET_NOTIFICATION` or
/// `GLFW_LOSE_CONTEXT_ON_RESET`, or `GLFW_NO_ROBUSTNESS` to not request
/// a robustness strategy.
///
/// __GLFW_CONTEXT_RELEASE_BEHAVIOR__ specifies the release behavior to be
/// used by the context.  Possible values are one of `GLFW_ANY_RELEASE_BEHAVIOR`,
/// `GLFW_RELEASE_BEHAVIOR_FLUSH` or `GLFW_RELEASE_BEHAVIOR_NONE`.  If the
/// behavior is `GLFW_ANY_RELEASE_BEHAVIOR`, the default behavior of the context
/// creation API will be used.  If the behavior is `GLFW_RELEASE_BEHAVIOR_FLUSH`,
/// the pipeline will be flushed whenever the context is released from being the
/// current one.  If the behavior is `GLFW_RELEASE_BEHAVIOR_NONE`, the pipeline will
/// not be flushed on release.
///
/// Context release behaviors are described in detail by the
/// [GL_KHR_context_flush_control](https://www.opengl.org/registry/specs/KHR/context_flush_control.txt) extension.
///
/// __GLFW_CONTEXT_NO_ERROR__ specifies whether errors should be generated by the
/// context.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  If enabled,
/// situations that would have generated errors instead cause undefined behavior.
///
/// The no error mode for OpenGL and OpenGL ES is described in detail by the
/// [GL_KHR_no_error](https://www.opengl.org/registry/specs/KHR/no_error.txt) extension.
///
/// ### Win32 specific hints
///
/// __GLFW_WIN32_KEYBOARD_MENU__ specifies whether to allow access to the window
/// menu via the Alt+Space and Alt-and-then-Space keyboard shortcuts.  This is
/// ignored on other platforms.
///
/// __GLFW_WIN32_SHOWDEFAULT__ specifies whether to show the window the way
/// specified in the program's `STARTUPINFO` when it is shown for the first time.
/// This is the same information as the `Run` option in the shortcut properties
/// window.  If this information was not specified when the program was started,
/// GLFW behaves as if this hint was set to `GLFW_FALSE`.  Possible values are
/// `GLFW_TRUE` and `GLFW_FALSE`.  This is ignored on other platforms.
///
/// ### macOS specific hints
///
/// __GLFW_COCOA_FRAME_NAME__ specifies the UTF-8 encoded name to use for autosaving
/// the window frame, or if empty disables frame autosaving for the window.  This is
/// ignored on other platforms.  This is set with [glfwWindowHintString][#glfwWindowHintString(int, MemorySegment)].
///
/// __GLFW_COCOA_GRAPHICS_SWITCHING__ specifies whether to in Automatic Graphics
/// Switching, i.e. to allow the system to choose the integrated GPU for the OpenGL
/// context and move it between GPUs if necessary or whether to force it to always
/// run on the discrete GPU.  This only affects systems with both integrated and
/// discrete GPUs.  Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  This is
/// ignored on other platforms.
///
/// Simpler programs and tools may want to enable this to save power, while games
/// and other applications performing advanced rendering will want to leave it
/// disabled.
///
/// A bundled application that wishes to participate in Automatic Graphics Switching
/// should also declare this in its `Info.plist` by setting the
/// `NSSupportsAutomaticGraphicsSwitching` key to `true`.
///
/// ### Wayland specific window hints
///
/// __GLFW_WAYLAND_APP_ID__ specifies the Wayland app_id for a window, used
/// by window managers to identify types of windows. This is set with
/// [glfwWindowHintString][#glfwWindowHintString(int, MemorySegment)].
///
/// ### X11 specific window hints
///
/// __GLFW_X11_CLASS_NAME__ and __GLFW_X11_INSTANCE_NAME__ specifies the desired
/// ASCII encoded class and instance parts of the ICCCM `WM_CLASS` window property.  Both
/// hints need to be set to something other than an empty string for them to take effect.
/// These are set with [glfwWindowHintString][#glfwWindowHintString(int, MemorySegment)].
///
/// ## Window attributes
///
/// ### Window related attributes
///
/// __GLFW_FOCUSED__ indicates whether the specified window has input focus.  See
/// [Window input focus](https://www.glfw.org/docs/latest/window_guide.html#window_focus) for details.
///
/// __GLFW_ICONIFIED__ indicates whether the specified window is iconified.
/// See [Window iconification](https://www.glfw.org/docs/latest/window_guide.html#window_iconify) for details.
///
/// __GLFW_MAXIMIZED__ indicates whether the specified window is maximized.  See
/// [Window maximization](https://www.glfw.org/docs/latest/window_guide.html#window_maximize) for details.
///
/// __GLFW_HOVERED__ indicates whether the cursor is currently directly over the
/// content area of the window, with no other windows between.  See
/// [Cursor enter/leave events](https://www.glfw.org/docs/latest/input_guide.html#cursor_enter) for details.
///
/// __GLFW_VISIBLE__ indicates whether the specified window is visible.  See
/// [Window visibility](https://www.glfw.org/docs/latest/window_guide.html#window_hide) for details.
///
/// __GLFW_RESIZABLE__ indicates whether the specified window is resizable _by the
/// user_.  This can be set before creation with the
/// [GLFW_RESIZABLE][#GLFW_RESIZABLE] window hint or after with
/// [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
///
/// __GLFW_DECORATED__ indicates whether the specified window has decorations such
/// as a border, a close widget, etc.  This can be set before creation with the
/// [GLFW_DECORATED][#GLFW_DECORATED] window hint or after with
/// [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
///
/// __GLFW_AUTO_ICONIFY__ indicates whether the specified full screen window is
/// iconified on focus loss, a close widget, etc.  This can be set before creation
/// with the [GLFW_AUTO_ICONIFY][#GLFW_AUTO_ICONIFY] window hint or after
/// with [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
///
/// __GLFW_FLOATING__ indicates whether the specified window is floating, also
/// called topmost or always-on-top.  This can be set before creation with the
/// [GLFW_FLOATING][#GLFW_FLOATING] window hint or after with
/// [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
///
/// __GLFW_TRANSPARENT_FRAMEBUFFER__ indicates whether the specified window has
/// a transparent framebuffer, i.e. the window contents is composited with the
/// background using the window framebuffer alpha channel.  See
/// [Window transparency](https://www.glfw.org/docs/latest/window_guide.html#window_transparency) for details.
///
/// __GLFW_FOCUS_ON_SHOW__ specifies whether the window will be given input
/// focus when [glfwShowWindow][#glfwShowWindow(MemorySegment)] is called. This can be set before creation
/// with the [GLFW_FOCUS_ON_SHOW][#GLFW_FOCUS_ON_SHOW] window hint or
/// after with [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
///
/// __GLFW_MOUSE_PASSTHROUGH__ specifies whether the window is transparent to mouse
/// input, letting any mouse events pass through to whatever window is behind it.
/// This can be set before creation with the
/// [GLFW_MOUSE_PASSTHROUGH][#GLFW_MOUSE_PASSTHROUGH] window hint or after
/// with [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].  This is only supported for undecorated windows.
/// Decorated windows with this enabled will behave differently between platforms.
///
/// ### Context related attributes
///
/// __GLFW_CLIENT_API__ indicates the client API provided by the window's context;
/// either `GLFW_OPENGL_API`, `GLFW_OPENGL_ES_API` or `GLFW_NO_API`.
///
/// __GLFW_CONTEXT_CREATION_API__ indicates the context creation API used to create
/// the window's context; either `GLFW_NATIVE_CONTEXT_API`, `GLFW_EGL_CONTEXT_API`
/// or `GLFW_OSMESA_CONTEXT_API`.
///
/// __GLFW_CONTEXT_VERSION_MAJOR__, __GLFW_CONTEXT_VERSION_MINOR__ and
/// __GLFW_CONTEXT_REVISION__ indicate the client API version of the window's
/// context.
///
/// > __Note__
/// >
/// > Do not confuse these attributes with `GLFW_VERSION_MAJOR`,
/// > `GLFW_VERSION_MINOR` and `GLFW_VERSION_REVISION` which provide the API version
/// > of the GLFW header.
///
/// __GLFW_OPENGL_FORWARD_COMPAT__ is `GLFW_TRUE` if the window's context is an
/// OpenGL forward-compatible one, or `GLFW_FALSE` otherwise.
///
/// __GLFW_CONTEXT_DEBUG__ is `GLFW_TRUE` if the window's context is in debug
/// mode, or `GLFW_FALSE` otherwise.
///
/// This is the new name, introduced in GLFW 3.4.  The older
/// `GLFW_OPENGL_DEBUG_CONTEXT` name is also available for compatibility.
///
/// __GLFW_OPENGL_PROFILE__ indicates the OpenGL profile used by the context.  This
/// is `GLFW_OPENGL_CORE_PROFILE` or `GLFW_OPENGL_COMPAT_PROFILE` if the context
/// uses a known profile, or `GLFW_OPENGL_ANY_PROFILE` if the OpenGL profile is
/// unknown or the context is an OpenGL ES context.  Note that the returned profile
/// may not match the profile bits of the context flags, as GLFW will try other
/// means of detecting the profile when no bits are set.
///
/// __GLFW_CONTEXT_RELEASE_BEHAVIOR__ indicates the release used by the context.
/// Possible values are one of `GLFW_ANY_RELEASE_BEHAVIOR`,
/// `GLFW_RELEASE_BEHAVIOR_FLUSH` or `GLFW_RELEASE_BEHAVIOR_NONE`.  If the
/// behavior is `GLFW_ANY_RELEASE_BEHAVIOR`, the default behavior of the context
/// creation API will be used.  If the behavior is `GLFW_RELEASE_BEHAVIOR_FLUSH`,
/// the pipeline will be flushed whenever the context is released from being the
/// current one.  If the behavior is `GLFW_RELEASE_BEHAVIOR_NONE`, the pipeline will
/// not be flushed on release.
///
/// __GLFW_CONTEXT_NO_ERROR__ indicates whether errors are generated by the context.
/// Possible values are `GLFW_TRUE` and `GLFW_FALSE`.  If enabled, situations that
/// would have generated errors instead cause undefined behavior.
///
/// __GLFW_CONTEXT_ROBUSTNESS__ indicates the robustness strategy used by the
/// context.  This is `GLFW_LOSE_CONTEXT_ON_RESET` or `GLFW_NO_RESET_NOTIFICATION`
/// if the window's context supports robustness, or `GLFW_NO_ROBUSTNESS` otherwise.
///
/// ### Framebuffer related attributes
///
/// __GLFW_DOUBLEBUFFER__ indicates whether the specified window is double-buffered
/// when rendering with OpenGL or OpenGL ES.  This can be set before creation with
/// the [GLFW_DOUBLEBUFFER][#GLFW_DOUBLEBUFFER] window hint.
///
/// @author squid233
/// @since 0.1.0
public final class GLFW {
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
    ///thread.  One such function is [glfwSwapInterval][#glfwSwapInterval(int)].
    ///
    ///###### Analysis
    ///Application programmer error.  Ensure a context is current before
    ///calling functions that require a current context.
    ///##### GLFW_INVALID_ENUM
    ///One of the arguments to the function was an invalid enum value.
    ///
    ///One of the arguments to the function was an invalid enum value, for example
    ///requesting [GLFW_RED_BITS][#GLFW_RED_BITS] with [glfwGetWindowAttrib][#glfwGetWindowAttrib(MemorySegment, int)].
    ///
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
    ///
    ///Failure to detect a specific platform may have the same cause as above or be because
    ///support for that platform was not compiled in.  Call [glfwPlatformSupported][#glfwPlatformSupported(int)] to
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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwInit`.
        public static final MethodHandle MH_glfwInit = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwInit", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwTerminate`.
        public static final MethodHandle MH_glfwTerminate = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwTerminate", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwInitHint`.
        public static final MethodHandle MH_glfwInitHint = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwInitHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwInitAllocator`.
        public static final MethodHandle MH_glfwInitAllocator = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwInitAllocator", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWAllocator.LAYOUT)));
        /// The method handle of `glfwGetVersion`.
        public static final MethodHandle MH_glfwGetVersion = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetVersion", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVersionString`.
        public static final MethodHandle MH_glfwGetVersionString = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetVersionString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetError`.
        public static final MethodHandle MH_glfwGetError = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetErrorCallback`.
        public static final MethodHandle MH_glfwSetErrorCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetErrorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPlatform`.
        public static final MethodHandle MH_glfwGetPlatform = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetPlatform", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwPlatformSupported`.
        public static final MethodHandle MH_glfwPlatformSupported = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwPlatformSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMonitors`.
        public static final MethodHandle MH_glfwGetMonitors = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitors", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetPrimaryMonitor`.
        public static final MethodHandle MH_glfwGetPrimaryMonitor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetPrimaryMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPos`.
        public static final MethodHandle MH_glfwGetMonitorPos = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorWorkarea`.
        public static final MethodHandle MH_glfwGetMonitorWorkarea = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorWorkarea", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorPhysicalSize`.
        public static final MethodHandle MH_glfwGetMonitorPhysicalSize = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorPhysicalSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorContentScale`.
        public static final MethodHandle MH_glfwGetMonitorContentScale = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorName`.
        public static final MethodHandle MH_glfwGetMonitorName = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorUserPointer`.
        public static final MethodHandle MH_glfwSetMonitorUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetMonitorUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetMonitorUserPointer`.
        public static final MethodHandle MH_glfwGetMonitorUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMonitorUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMonitorCallback`.
        public static final MethodHandle MH_glfwSetMonitorCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetMonitorCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoModes`.
        public static final MethodHandle MH_glfwGetVideoModes = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetVideoModes", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetVideoMode`.
        public static final MethodHandle MH_glfwGetVideoMode = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetVideoMode", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWVidMode.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGamma`.
        public static final MethodHandle MH_glfwSetGamma = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetGamma", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwGetGammaRamp`.
        public static final MethodHandle MH_glfwGetGammaRamp = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetGammaRamp", FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `glfwSetGammaRamp`.
        public static final MethodHandle MH_glfwSetGammaRamp = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetGammaRamp", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT)));
        /// The method handle of `glfwDefaultWindowHints`.
        public static final MethodHandle MH_glfwDefaultWindowHints = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwDefaultWindowHints", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWindowHint`.
        public static final MethodHandle MH_glfwWindowHint = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwWindowHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwWindowHintString`.
        public static final MethodHandle MH_glfwWindowHintString = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwWindowHintString", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwCreateWindow`.
        public static final MethodHandle MH_glfwCreateWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwCreateWindow", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwDestroyWindow`.
        public static final MethodHandle MH_glfwDestroyWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwDestroyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwWindowShouldClose`.
        public static final MethodHandle MH_glfwWindowShouldClose = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwWindowShouldClose", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowShouldClose`.
        public static final MethodHandle MH_glfwSetWindowShouldClose = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowShouldClose", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowTitle`.
        public static final MethodHandle MH_glfwGetWindowTitle = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowTitle", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowTitle`.
        public static final MethodHandle MH_glfwSetWindowTitle = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowTitle", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwSetWindowIcon`.
        public static final MethodHandle MH_glfwSetWindowIcon = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowIcon", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT)));
        /// The method handle of `glfwGetWindowPos`.
        public static final MethodHandle MH_glfwGetWindowPos = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPos`.
        public static final MethodHandle MH_glfwSetWindowPos = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowSize`.
        public static final MethodHandle MH_glfwGetWindowSize = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeLimits`.
        public static final MethodHandle MH_glfwSetWindowSizeLimits = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowSizeLimits", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAspectRatio`.
        public static final MethodHandle MH_glfwSetWindowAspectRatio = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowAspectRatio", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowSize`.
        public static final MethodHandle MH_glfwSetWindowSize = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetFramebufferSize`.
        public static final MethodHandle MH_glfwGetFramebufferSize = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetFramebufferSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowFrameSize`.
        public static final MethodHandle MH_glfwGetWindowFrameSize = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowFrameSize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowContentScale`.
        public static final MethodHandle MH_glfwGetWindowContentScale = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowContentScale", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowOpacity`.
        public static final MethodHandle MH_glfwGetWindowOpacity = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowOpacity", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowOpacity`.
        public static final MethodHandle MH_glfwSetWindowOpacity = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowOpacity", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `glfwIconifyWindow`.
        public static final MethodHandle MH_glfwIconifyWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwIconifyWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRestoreWindow`.
        public static final MethodHandle MH_glfwRestoreWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwRestoreWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwMaximizeWindow`.
        public static final MethodHandle MH_glfwMaximizeWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwMaximizeWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwShowWindow`.
        public static final MethodHandle MH_glfwShowWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwShowWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwHideWindow`.
        public static final MethodHandle MH_glfwHideWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwHideWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwFocusWindow`.
        public static final MethodHandle MH_glfwFocusWindow = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwFocusWindow", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwRequestWindowAttention`.
        public static final MethodHandle MH_glfwRequestWindowAttention = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwRequestWindowAttention", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowMonitor`.
        public static final MethodHandle MH_glfwGetWindowMonitor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMonitor`.
        public static final MethodHandle MH_glfwSetWindowMonitor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowMonitor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetWindowAttrib`.
        public static final MethodHandle MH_glfwGetWindowAttrib = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowAttrib", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowAttrib`.
        public static final MethodHandle MH_glfwSetWindowAttrib = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowAttrib", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetWindowUserPointer`.
        public static final MethodHandle MH_glfwSetWindowUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowUserPointer", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWindowUserPointer`.
        public static final MethodHandle MH_glfwGetWindowUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetWindowUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowPosCallback`.
        public static final MethodHandle MH_glfwSetWindowPosCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowPosCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowSizeCallback`.
        public static final MethodHandle MH_glfwSetWindowSizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowCloseCallback`.
        public static final MethodHandle MH_glfwSetWindowCloseCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowCloseCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowRefreshCallback`.
        public static final MethodHandle MH_glfwSetWindowRefreshCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowRefreshCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowFocusCallback`.
        public static final MethodHandle MH_glfwSetWindowFocusCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowFocusCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowIconifyCallback`.
        public static final MethodHandle MH_glfwSetWindowIconifyCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowIconifyCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowMaximizeCallback`.
        public static final MethodHandle MH_glfwSetWindowMaximizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowMaximizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetFramebufferSizeCallback`.
        public static final MethodHandle MH_glfwSetFramebufferSizeCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetFramebufferSizeCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetWindowContentScaleCallback`.
        public static final MethodHandle MH_glfwSetWindowContentScaleCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetWindowContentScaleCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwPollEvents`.
        public static final MethodHandle MH_glfwPollEvents = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwPollEvents", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEvents`.
        public static final MethodHandle MH_glfwWaitEvents = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwWaitEvents", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwWaitEventsTimeout`.
        public static final MethodHandle MH_glfwWaitEventsTimeout = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwWaitEventsTimeout", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwPostEmptyEvent`.
        public static final MethodHandle MH_glfwPostEmptyEvent = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwPostEmptyEvent", FunctionDescriptor.ofVoid());
        /// The method handle of `glfwGetInputMode`.
        public static final MethodHandle MH_glfwGetInputMode = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetInputMode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetInputMode`.
        public static final MethodHandle MH_glfwSetInputMode = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetInputMode", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwRawMouseMotionSupported`.
        public static final MethodHandle MH_glfwRawMouseMotionSupported = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwRawMouseMotionSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyName`.
        public static final MethodHandle MH_glfwGetKeyName = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetKeyName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKeyScancode`.
        public static final MethodHandle MH_glfwGetKeyScancode = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetKeyScancode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetKey`.
        public static final MethodHandle MH_glfwGetKey = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetKey", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetMouseButton`.
        public static final MethodHandle MH_glfwGetMouseButton = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetMouseButton", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetCursorPos`.
        public static final MethodHandle MH_glfwGetCursorPos = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPos`.
        public static final MethodHandle MH_glfwSetCursorPos = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetCursorPos", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwCreateCursor`.
        public static final MethodHandle MH_glfwCreateCursor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwCreateCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateStandardCursor`.
        public static final MethodHandle MH_glfwCreateStandardCursor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwCreateStandardCursor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwDestroyCursor`.
        public static final MethodHandle MH_glfwDestroyCursor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwDestroyCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursor`.
        public static final MethodHandle MH_glfwSetCursor = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetCursor", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetKeyCallback`.
        public static final MethodHandle MH_glfwSetKeyCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetKeyCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCharCallback`.
        public static final MethodHandle MH_glfwSetCharCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetCharCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetMouseButtonCallback`.
        public static final MethodHandle MH_glfwSetMouseButtonCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetMouseButtonCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorPosCallback`.
        public static final MethodHandle MH_glfwSetCursorPosCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetCursorPosCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetCursorEnterCallback`.
        public static final MethodHandle MH_glfwSetCursorEnterCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetCursorEnterCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetScrollCallback`.
        public static final MethodHandle MH_glfwSetScrollCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetScrollCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetDropCallback`.
        public static final MethodHandle MH_glfwSetDropCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetDropCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwJoystickPresent`.
        public static final MethodHandle MH_glfwJoystickPresent = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwJoystickPresent", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickAxes`.
        public static final MethodHandle MH_glfwGetJoystickAxes = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickAxes", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickButtons`.
        public static final MethodHandle MH_glfwGetJoystickButtons = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickButtons", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickHats`.
        public static final MethodHandle MH_glfwGetJoystickHats = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickHats", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickName`.
        public static final MethodHandle MH_glfwGetJoystickName = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetJoystickGUID`.
        public static final MethodHandle MH_glfwGetJoystickGUID = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickGUID", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickUserPointer`.
        public static final MethodHandle MH_glfwSetJoystickUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetJoystickUserPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetJoystickUserPointer`.
        public static final MethodHandle MH_glfwGetJoystickUserPointer = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetJoystickUserPointer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwJoystickIsGamepad`.
        public static final MethodHandle MH_glfwJoystickIsGamepad = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwJoystickIsGamepad", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwSetJoystickCallback`.
        public static final MethodHandle MH_glfwSetJoystickCallback = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetJoystickCallback", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwUpdateGamepadMappings`.
        public static final MethodHandle MH_glfwUpdateGamepadMappings = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwUpdateGamepadMappings", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetGamepadName`.
        public static final MethodHandle MH_glfwGetGamepadName = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetGamepadName", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetGamepadState`.
        public static final MethodHandle MH_glfwGetGamepadState = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetGamepadState", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGamepadState.LAYOUT)));
        /// The method handle of `glfwSetClipboardString`.
        public static final MethodHandle MH_glfwSetClipboardString = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetClipboardString", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetClipboardString`.
        public static final MethodHandle MH_glfwGetClipboardString = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetClipboardString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetTime`.
        public static final MethodHandle MH_glfwGetTime = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetTime", FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwSetTime`.
        public static final MethodHandle MH_glfwSetTime = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSetTime", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        /// The method handle of `glfwGetTimerValue`.
        public static final MethodHandle MH_glfwGetTimerValue = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetTimerValue", FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwGetTimerFrequency`.
        public static final MethodHandle MH_glfwGetTimerFrequency = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetTimerFrequency", FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        /// The method handle of `glfwMakeContextCurrent`.
        public static final MethodHandle MH_glfwMakeContextCurrent = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwMakeContextCurrent", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCurrentContext`.
        public static final MethodHandle MH_glfwGetCurrentContext = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetCurrentContext", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapBuffers`.
        public static final MethodHandle MH_glfwSwapBuffers = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSwapBuffers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwSwapInterval`.
        public static final MethodHandle MH_glfwSwapInterval = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwSwapInterval", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `glfwExtensionSupported`.
        public static final MethodHandle MH_glfwExtensionSupported = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwExtensionSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetProcAddress`.
        public static final MethodHandle MH_glfwGetProcAddress = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwVulkanSupported`.
        public static final MethodHandle MH_glfwVulkanSupported = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwVulkanSupported", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `glfwGetRequiredInstanceExtensions`.
        public static final MethodHandle MH_glfwGetRequiredInstanceExtensions = RuntimeHelper.downcall(GLFWInternal.lookup, "glfwGetRequiredInstanceExtensions", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
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
            return (int) Handles.MH_glfwInit.invokeExact() != GLFW.GLFW_FALSE;
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
            Handles.MH_glfwTerminate.invokeExact();
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
            Handles.MH_glfwInitHint.invokeExact(hint, value);
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
            Handles.MH_glfwInitAllocator.invokeExact(allocator);
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
            Handles.MH_glfwInitAllocator.invokeExact(Marshal.marshal(allocator));
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitAllocator", e); }
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
            Handles.MH_glfwGetVersion.invokeExact(major, minor, rev);
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
            Handles.MH_glfwGetVersion.invokeExact(__overrungl_ref_major, __overrungl_ref_minor, __overrungl_ref_rev);
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
    ///
    ///__Do not use the version string__ to parse what platforms are supported.  The
    ///[glfwPlatformSupported][#glfwPlatformSupported(int)] function lets you query platform support.
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVersionString.invokeExact();
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
    ///
    ///__Do not use the version string__ to parse what platforms are supported.  The
    ///[glfwPlatformSupported][#glfwPlatformSupported(int)] function lets you query platform support.
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
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetVersionString.invokeExact());
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
            return (int) Handles.MH_glfwGetError.invokeExact(description);
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
            var __overrungl_result = (int) Handles.MH_glfwGetError.invokeExact(__overrungl_ref_description);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetErrorCallback.invokeExact(callback);
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
            return (int) Handles.MH_glfwGetPlatform.invokeExact();
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
            return (int) Handles.MH_glfwPlatformSupported.invokeExact(platform) != GLFW.GLFW_FALSE;
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitors.invokeExact(count);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetPrimaryMonitor.invokeExact();
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
            Handles.MH_glfwGetMonitorPos.invokeExact(monitor, xpos, ypos);
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
            Handles.MH_glfwGetMonitorPos.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos);
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
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(monitor, xpos, ypos, width, height);
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
            Handles.MH_glfwGetMonitorWorkarea.invokeExact(monitor, __overrungl_ref_xpos, __overrungl_ref_ypos, __overrungl_ref_width, __overrungl_ref_height);
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
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, widthMM, heightMM);
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
            Handles.MH_glfwGetMonitorPhysicalSize.invokeExact(monitor, __overrungl_ref_widthMM, __overrungl_ref_heightMM);
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
            Handles.MH_glfwGetMonitorContentScale.invokeExact(monitor, xscale, yscale);
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
            Handles.MH_glfwGetMonitorContentScale.invokeExact(monitor, __overrungl_ref_xscale, __overrungl_ref_yscale);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(monitor);
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
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorName.invokeExact(monitor));
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
            Handles.MH_glfwSetMonitorUserPointer.invokeExact(monitor, pointer);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetMonitorUserPointer.invokeExact(monitor);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetMonitorCallback.invokeExact(callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoModes.invokeExact(monitor, count);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(monitor);
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
            return overrungl.glfw.GLFWVidMode.of((java.lang.foreign.MemorySegment) Handles.MH_glfwGetVideoMode.invokeExact(monitor));
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
            Handles.MH_glfwSetGamma.invokeExact(monitor, gamma);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(monitor);
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
            return overrungl.glfw.GLFWGammaRamp.of((java.lang.foreign.MemorySegment) Handles.MH_glfwGetGammaRamp.invokeExact(monitor));
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
            Handles.MH_glfwSetGammaRamp.invokeExact(monitor, ramp);
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
            Handles.MH_glfwSetGammaRamp.invokeExact(monitor, Marshal.marshal(ramp));
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
            Handles.MH_glfwDefaultWindowHints.invokeExact();
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
            Handles.MH_glfwWindowHint.invokeExact(hint, value);
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
            Handles.MH_glfwWindowHintString.invokeExact(hint, value);
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
            Handles.MH_glfwWindowHintString.invokeExact(hint, Marshal.marshal(__overrungl_stack, value));
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
    ///[glfwGetWindowAttrib][#glfwGetWindowAttrib(MemorySegment, int)], [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)] and [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
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
    ///
    ///Once you have created the window, you can switch it between windowed and
    ///full screen mode with [glfwSetWindowMonitor][#glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int)].  This will not affect its
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
    ///
    ///    If the executable has an icon resource named `GLFW_ICON,` it
    ///    will be set as the initial icon for the window.  If no such icon is present,
    ///    the `IDI_APPLICATION` icon will be used instead.  To set a different icon,
    ///    see [glfwSetWindowIcon][#glfwSetWindowIcon(MemorySegment, int, MemorySegment)].
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(width, height, title, monitor, share);
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
    ///[glfwGetWindowAttrib][#glfwGetWindowAttrib(MemorySegment, int)], [glfwGetWindowSize][#glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment)] and [glfwGetFramebufferSize][#glfwGetFramebufferSize(MemorySegment, MemorySegment, MemorySegment)].
    ///
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
    ///
    ///Once you have created the window, you can switch it between windowed and
    ///full screen mode with [glfwSetWindowMonitor][#glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int)].  This will not affect its
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
    ///
    ///    If the executable has an icon resource named `GLFW_ICON,` it
    ///    will be set as the initial icon for the window.  If no such icon is present,
    ///    the `IDI_APPLICATION` icon will be used instead.  To set a different icon,
    ///    see [glfwSetWindowIcon][#glfwSetWindowIcon(MemorySegment, int, MemorySegment)].
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateWindow.invokeExact(width, height, Marshal.marshal(__overrungl_stack, title), monitor, share);
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
            Handles.MH_glfwDestroyWindow.invokeExact(window);
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
            return (int) Handles.MH_glfwWindowShouldClose.invokeExact(window) != GLFW.GLFW_FALSE;
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
            Handles.MH_glfwSetWindowShouldClose.invokeExact(window, value ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(window);
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
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowTitle.invokeExact(window));
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
            Handles.MH_glfwSetWindowTitle.invokeExact(window, title);
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
            Handles.MH_glfwSetWindowTitle.invokeExact(window, Marshal.marshal(__overrungl_stack, title));
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
            Handles.MH_glfwSetWindowIcon.invokeExact(window, count, images);
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
            Handles.MH_glfwSetWindowIcon.invokeExact(window, count, Marshal.marshal(images));
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
            Handles.MH_glfwGetWindowPos.invokeExact(window, xpos, ypos);
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
            Handles.MH_glfwGetWindowPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
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
            Handles.MH_glfwSetWindowPos.invokeExact(window, xpos, ypos);
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
            Handles.MH_glfwGetWindowSize.invokeExact(window, width, height);
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
            Handles.MH_glfwGetWindowSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
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
            Handles.MH_glfwSetWindowSizeLimits.invokeExact(window, minwidth, minheight, maxwidth, maxheight);
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
            Handles.MH_glfwSetWindowAspectRatio.invokeExact(window, numer, denom);
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
    ///
    ///If you wish to update the refresh rate of the desired video mode in addition
    ///to its resolution, see [glfwSetWindowMonitor][#glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int)].
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
    ///
    ///@see #glfwGetWindowSize(MemorySegment, MemorySegment, MemorySegment) glfwGetWindowSize
    ///@see #glfwSetWindowMonitor(MemorySegment, MemorySegment, int, int, int, int, int) glfwSetWindowMonitor
    public static void glfwSetWindowSize(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("int") int width, @CType("int") int height) {
        try {
            Handles.MH_glfwSetWindowSize.invokeExact(window, width, height);
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
            Handles.MH_glfwGetFramebufferSize.invokeExact(window, width, height);
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
            Handles.MH_glfwGetFramebufferSize.invokeExact(window, __overrungl_ref_width, __overrungl_ref_height);
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
            Handles.MH_glfwGetWindowFrameSize.invokeExact(window, left, top, right, bottom);
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
            Handles.MH_glfwGetWindowFrameSize.invokeExact(window, __overrungl_ref_left, __overrungl_ref_top, __overrungl_ref_right, __overrungl_ref_bottom);
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
            Handles.MH_glfwGetWindowContentScale.invokeExact(window, xscale, yscale);
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
            Handles.MH_glfwGetWindowContentScale.invokeExact(window, __overrungl_ref_xscale, __overrungl_ref_yscale);
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
            return (float) Handles.MH_glfwGetWindowOpacity.invokeExact(window);
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
            Handles.MH_glfwSetWindowOpacity.invokeExact(window, opacity);
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
            Handles.MH_glfwIconifyWindow.invokeExact(window);
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
            Handles.MH_glfwRestoreWindow.invokeExact(window);
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
            Handles.MH_glfwMaximizeWindow.invokeExact(window);
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
    ///behavior for an existing window with [glfwSetWindowAttrib][#glfwSetWindowAttrib(MemorySegment, int, int)].
    ///
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
            Handles.MH_glfwShowWindow.invokeExact(window);
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
            Handles.MH_glfwHideWindow.invokeExact(window);
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
            Handles.MH_glfwFocusWindow.invokeExact(window);
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
            Handles.MH_glfwRequestWindowAttention.invokeExact(window);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowMonitor.invokeExact(window);
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
            Handles.MH_glfwSetWindowMonitor.invokeExact(window, monitor, xpos, ypos, width, height, refreshRate);
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
            return (int) Handles.MH_glfwGetWindowAttrib.invokeExact(window, attrib);
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
            Handles.MH_glfwSetWindowAttrib.invokeExact(window, attrib, value);
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
            Handles.MH_glfwSetWindowUserPointer.invokeExact(window, pointer);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWindowUserPointer.invokeExact(window);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowPosCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowSizeCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowCloseCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowRefreshCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowFocusCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowIconifyCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowMaximizeCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetFramebufferSizeCallback.invokeExact(window, callback);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetWindowContentScaleCallback.invokeExact(window, callback);
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
            Handles.MH_glfwPollEvents.invokeExact();
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
            Handles.MH_glfwWaitEvents.invokeExact();
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
            Handles.MH_glfwWaitEventsTimeout.invokeExact(timeout);
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
            Handles.MH_glfwPostEmptyEvent.invokeExact();
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
            return (int) Handles.MH_glfwGetInputMode.invokeExact(window, mode);
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
            Handles.MH_glfwSetInputMode.invokeExact(window, mode, value);
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
            return (int) Handles.MH_glfwRawMouseMotionSupported.invokeExact() != GLFW.GLFW_FALSE;
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(key, scancode);
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
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetKeyName.invokeExact(key, scancode));
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
            return (int) Handles.MH_glfwGetKeyScancode.invokeExact(key);
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
            return (int) Handles.MH_glfwGetKey.invokeExact(window, key);
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
            return (int) Handles.MH_glfwGetMouseButton.invokeExact(window, button);
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
            Handles.MH_glfwGetCursorPos.invokeExact(window, xpos, ypos);
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
            Handles.MH_glfwGetCursorPos.invokeExact(window, __overrungl_ref_xpos, __overrungl_ref_ypos);
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
            Handles.MH_glfwSetCursorPos.invokeExact(window, xpos, ypos);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateCursor.invokeExact(image, xhot, yhot);
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
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwCreateStandardCursor.invokeExact(shape);
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
            Handles.MH_glfwDestroyCursor.invokeExact(cursor);
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
            Handles.MH_glfwSetCursor.invokeExact(window, cursor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursor", e); }
    }

    ///Sets the key callback.
    ///
    ///This function sets the key callback of the specified window, which is called
    ///when a key is pressed, repeated or released.
    ///
    ///The key functions deal with physical keys, with layout independent
    ///key tokens named after their values in the standard US keyboard
    ///layout.  If you want to input text, use the
    ///[character callback][#glfwSetCharCallback(MemorySegment, MemorySegment)] instead.
    ///
    ///When a window loses input focus, it will generate synthetic key release
    ///events for all pressed keys with associated key tokens.  You can tell these
    ///events from user-generated events by the fact that the synthetic ones are
    ///generated after the focus loss event has been processed, i.e. after the
    ///[window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has been called.
    ///
    ///The scancode of a key is specific to that platform or sometimes even to that
    ///machine.  Scancodes are intended to allow users to bind keys that don't have
    ///a GLFW key token.  Such keys have `key` set to `GLFW_KEY_UNKNOWN`, their
    ///state is not saved and so it cannot be queried with [glfwGetKey][#glfwGetKey(MemorySegment, int)].
    ///
    ///Sometimes GLFW needs to generate synthetic key events, in which case the
    ///scancode may be zero.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new key callback, or `NULL` to remove the currently
    ///set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWKeyFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWkeyfun") java.lang.foreign.MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWkeyfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetKeyCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetKeyCallback", e); }
    }

    ///Sets the key callback.
    ///
    ///This function sets the key callback of the specified window, which is called
    ///when a key is pressed, repeated or released.
    ///
    ///The key functions deal with physical keys, with layout independent
    ///key tokens named after their values in the standard US keyboard
    ///layout.  If you want to input text, use the
    ///[character callback][#glfwSetCharCallback(MemorySegment, MemorySegment)] instead.
    ///
    ///When a window loses input focus, it will generate synthetic key release
    ///events for all pressed keys with associated key tokens.  You can tell these
    ///events from user-generated events by the fact that the synthetic ones are
    ///generated after the focus loss event has been processed, i.e. after the
    ///[window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has been called.
    ///
    ///The scancode of a key is specific to that platform or sometimes even to that
    ///machine.  Scancodes are intended to allow users to bind keys that don't have
    ///a GLFW key token.  Such keys have `key` set to `GLFW_KEY_UNKNOWN`, their
    ///state is not saved and so it cannot be queried with [glfwGetKey][#glfwGetKey(MemorySegment, int)].
    ///
    ///Sometimes GLFW needs to generate synthetic key events, in which case the
    ///scancode may be zero.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new key callback, or `NULL` to remove the currently
    ///set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWKeyFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWkeyfun") java.lang.foreign.MemorySegment glfwSetKeyCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWkeyfun") overrungl.glfw.GLFWKeyFun callback) {
        return glfwSetKeyCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the Unicode character callback.
    ///
    ///This function sets the character callback of the specified window, which is
    ///called when a Unicode character is input.
    ///
    ///The character callback is intended for Unicode text input.  As it deals with
    ///characters, it is keyboard layout dependent, whereas the
    ///[key callback][#glfwSetKeyCallback(MemorySegment, MemorySegment)] is not.  Characters do not map 1:1
    ///to physical keys, as a key may produce zero, one or more characters.  If you
    ///want to know whether a specific physical key was pressed or released, see
    ///the key callback instead.
    ///
    ///The character callback behaves as system text input normally does and will
    ///not be called if modifier keys are held down that would prevent normal text
    ///input on that platform, for example a Super (Command) key on macOS or Alt key
    ///on Windows.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCharFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcharfun") java.lang.foreign.MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcharfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCharCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCharCallback", e); }
    }

    ///Sets the Unicode character callback.
    ///
    ///This function sets the character callback of the specified window, which is
    ///called when a Unicode character is input.
    ///
    ///The character callback is intended for Unicode text input.  As it deals with
    ///characters, it is keyboard layout dependent, whereas the
    ///[key callback][#glfwSetKeyCallback(MemorySegment, MemorySegment)] is not.  Characters do not map 1:1
    ///to physical keys, as a key may produce zero, one or more characters.  If you
    ///want to know whether a specific physical key was pressed or released, see
    ///the key callback instead.
    ///
    ///The character callback behaves as system text input normally does and will
    ///not be called if modifier keys are held down that would prevent normal text
    ///input on that platform, for example a Super (Command) key on macOS or Alt key
    ///on Windows.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCharFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcharfun") java.lang.foreign.MemorySegment glfwSetCharCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcharfun") overrungl.glfw.GLFWCharFun callback) {
        return glfwSetCharCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the mouse button callback.
    ///
    ///This function sets the mouse button callback of the specified window, which
    ///is called when a mouse button is pressed or released.
    ///
    ///When a window loses input focus, it will generate synthetic mouse button
    ///release events for all pressed mouse buttons with associated button tokens.
    ///You can tell these events from user-generated events by the fact that the
    ///synthetic ones are generated after the focus loss event has been processed,
    ///i.e. after the [window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has
    ///been called.
    ///
    ///The reported `button` value can be higher than `GLFW_MOUSE_BUTTON_LAST` if
    ///the button does not have an associated button token and the
    ///[GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS] input mode is set.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWMouseButtonFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetMouseButtonCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetMouseButtonCallback", e); }
    }

    ///Sets the mouse button callback.
    ///
    ///This function sets the mouse button callback of the specified window, which
    ///is called when a mouse button is pressed or released.
    ///
    ///When a window loses input focus, it will generate synthetic mouse button
    ///release events for all pressed mouse buttons with associated button tokens.
    ///You can tell these events from user-generated events by the fact that the
    ///synthetic ones are generated after the focus loss event has been processed,
    ///i.e. after the [window focus callback][#glfwSetWindowFocusCallback(MemorySegment, MemorySegment)] has
    ///been called.
    ///
    ///The reported `button` value can be higher than `GLFW_MOUSE_BUTTON_LAST` if
    ///the button does not have an associated button token and the
    ///[GLFW_UNLIMITED_MOUSE_BUTTONS][#GLFW_UNLIMITED_MOUSE_BUTTONS] input mode is set.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWMouseButtonFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWmousebuttonfun") java.lang.foreign.MemorySegment glfwSetMouseButtonCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWmousebuttonfun") overrungl.glfw.GLFWMouseButtonFun callback) {
        return glfwSetMouseButtonCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the cursor position callback.
    ///
    ///This function sets the cursor position callback of the specified window,
    ///which is called when the cursor is moved.  The callback is provided with the
    ///position, in screen coordinates, relative to the upper-left corner of the
    ///content area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCursorPosFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCursorPosCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorPosCallback", e); }
    }

    ///Sets the cursor position callback.
    ///
    ///This function sets the cursor position callback of the specified window,
    ///which is called when the cursor is moved.  The callback is provided with the
    ///position, in screen coordinates, relative to the upper-left corner of the
    ///content area of the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCursorPosFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcursorposfun") java.lang.foreign.MemorySegment glfwSetCursorPosCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorposfun") overrungl.glfw.GLFWCursorPosFun callback) {
        return glfwSetCursorPosCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the cursor enter/leave callback.
    ///
    ///This function sets the cursor boundary crossing callback of the specified
    ///window, which is called when the cursor enters or leaves the content area of
    ///the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCursorEnterFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetCursorEnterCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetCursorEnterCallback", e); }
    }

    ///Sets the cursor enter/leave callback.
    ///
    ///This function sets the cursor boundary crossing callback of the specified
    ///window, which is called when the cursor enters or leaves the content area of
    ///the window.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWCursorEnterFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWcursorenterfun") java.lang.foreign.MemorySegment glfwSetCursorEnterCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWcursorenterfun") overrungl.glfw.GLFWCursorEnterFun callback) {
        return glfwSetCursorEnterCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the scroll callback.
    ///
    ///This function sets the scroll callback of the specified window, which is
    ///called when a scrolling device is used, such as a mouse wheel or scrolling
    ///area of a touchpad.
    ///
    ///The scroll callback receives all scrolling input, like that from a mouse
    ///wheel or a touchpad scrolling area.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new scroll callback, or `NULL` to remove the
    ///currently set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWScrollFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWscrollfun") java.lang.foreign.MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWscrollfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetScrollCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetScrollCallback", e); }
    }

    ///Sets the scroll callback.
    ///
    ///This function sets the scroll callback of the specified window, which is
    ///called when a scrolling device is used, such as a mouse wheel or scrolling
    ///area of a touchpad.
    ///
    ///The scroll callback receives all scrolling input, like that from a mouse
    ///wheel or a touchpad scrolling area.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new scroll callback, or `NULL` to remove the
    ///currently set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWScrollFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWscrollfun") java.lang.foreign.MemorySegment glfwSetScrollCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWscrollfun") overrungl.glfw.GLFWScrollFun callback) {
        return glfwSetScrollCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Sets the path drop callback.
    ///
    ///This function sets the path drop callback of the specified window, which is
    ///called when one or more dragged paths are dropped on the window.
    ///
    ///Because the path array and its strings may have been generated specifically
    ///for that event, they are not guaranteed to be valid after the callback has
    ///returned.  If you wish to use them after the callback returns, you need to
    ///make a deep copy.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new file drop callback, or `NULL` to remove the
    ///currently set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWDropFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWdropfun") java.lang.foreign.MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWdropfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetDropCallback.invokeExact(window, callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetDropCallback", e); }
    }

    ///Sets the path drop callback.
    ///
    ///This function sets the path drop callback of the specified window, which is
    ///called when one or more dragged paths are dropped on the window.
    ///
    ///Because the path array and its strings may have been generated specifically
    ///for that event, they are not guaranteed to be valid after the callback has
    ///returned.  If you wish to use them after the callback returns, you need to
    ///make a deep copy.
    ///
    ///@param window The window whose callback to set.
    ///@param callback The new file drop callback, or `NULL` to remove the
    ///currently set callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWDropFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWdropfun") java.lang.foreign.MemorySegment glfwSetDropCallback(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("GLFWdropfun") overrungl.glfw.GLFWDropFun callback) {
        return glfwSetDropCallback(window, callback != null ? callback.stub(GLFWCallbacks.create(window)) : MemorySegment.NULL);
    }

    ///Returns whether the specified joystick is present.
    ///
    ///This function returns whether the specified joystick is present.
    ///
    ///There is no need to call this function before other functions that accept
    ///a joystick ID, as they all check for presence before performing any other
    ///work.
    ///
    ///@param jid The joystick to query.
    ///@return `GLFW_TRUE` if the joystick is present, or `GLFW_FALSE` otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("int") boolean glfwJoystickPresent(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickPresent.invokeExact(jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickPresent", e); }
    }

    ///Returns the values of all axes of the specified joystick.
    ///
    ///This function returns the values of all axes of the specified joystick.
    ///Each element in the array is a value between -1.0 and 1.0.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///@param jid The joystick to query.
    ///@param count Where to store the number of axis values in the returned
    ///array.  This is set to zero if the joystick is not present or an error
    ///occurred.
    ///@return An array of axis values, or `NULL` if the joystick is not present or
    ///an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const float*") java.lang.foreign.MemorySegment glfwGetJoystickAxes(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickAxes.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickAxes", e); }
    }

    ///Returns the state of all buttons of the specified joystick.
    ///
    ///This function returns the state of all buttons of the specified joystick.
    ///Each element in the array is either `GLFW_PRESS` or `GLFW_RELEASE`.
    ///
    ///For backward compatibility with earlier versions that did not have
    ///[glfwGetJoystickHats][#glfwGetJoystickHats(int, MemorySegment)], the button array also includes all hats, each
    ///represented as four buttons.  The hats are in the same order as returned by
    ///__glfwGetJoystickHats__ and are in the order _up_, _right_, _down_ and
    ///_left_.  To disable these extra buttons, set the
    ///[GLFW_JOYSTICK_HAT_BUTTONS][#GLFW_JOYSTICK_HAT_BUTTONS] init hint before initialization.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///@param jid The joystick to query.
    ///@param count Where to store the number of button states in the returned
    ///array.  This is set to zero if the joystick is not present or an error
    ///occurred.
    ///@return An array of button states, or `NULL` if the joystick is not present
    ///or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const unsigned char*") java.lang.foreign.MemorySegment glfwGetJoystickButtons(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickButtons.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickButtons", e); }
    }

    ///Returns the state of all hats of the specified joystick.
    ///
    ///This function returns the state of all hats of the specified joystick.
    ///Each element in the array is one of the following values:
    ///
    ///| Name                  | Value |
    ///| ----                  | ----- |
    ///| `GLFW_HAT_CENTERED`   | 0 |
    ///| `GLFW_HAT_UP`         | 1 |
    ///| `GLFW_HAT_RIGHT`      | 2 |
    ///| `GLFW_HAT_DOWN`       | 4 |
    ///| `GLFW_HAT_LEFT`       | 8 |
    ///| `GLFW_HAT_RIGHT_UP`   | `GLFW_HAT_RIGHT` \| `GLFW_HAT_UP` |
    ///| `GLFW_HAT_RIGHT_DOWN` | `GLFW_HAT_RIGHT` \| `GLFW_HAT_DOWN` |
    ///| `GLFW_HAT_LEFT_UP`    | `GLFW_HAT_LEFT` \| `GLFW_HAT_UP` |
    ///| `GLFW_HAT_LEFT_DOWN`  | `GLFW_HAT_LEFT` \| `GLFW_HAT_DOWN` |
    ///
    ///The diagonal directions are bitwise combinations of the primary (up, right,
    ///down and left) directions and you can test for these individually by ANDing
    ///it with the corresponding direction.
    ///
    ///```java
    ///if (hats[2] & GLFW_HAT_RIGHT)
    ///{
    ///    // State of hat 2 could be right-up, right or right-down
    ///}
    ///```
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///@param jid The joystick to query.
    ///@param count Where to store the number of hat states in the returned
    ///array.  This is set to zero if the joystick is not present or an error
    ///occurred.
    ///@return An array of hat states, or `NULL` if the joystick is not present
    ///or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected, this function is called again for that joystick or the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const unsigned char*") java.lang.foreign.MemorySegment glfwGetJoystickHats(@CType("int") int jid, @Out @CType("int*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickHats.invokeExact(jid, count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickHats", e); }
    }

    ///Returns the name of the specified joystick.
    ///
    ///This function returns the name, encoded as UTF-8, of the specified joystick.
    ///The returned string is allocated and freed by GLFW.  You should not free it
    ///yourself.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded name of the joystick, or `NULL` if the joystick
    ///is not present or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetJoystickName_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    ///Returns the name of the specified joystick.
    ///
    ///This function returns the name, encoded as UTF-8, of the specified joystick.
    ///The returned string is allocated and freed by GLFW.  You should not free it
    ///yourself.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded name of the joystick, or `NULL` if the joystick
    ///is not present or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.String glfwGetJoystickName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickName.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickName", e); }
    }

    ///Returns the SDL compatible GUID of the specified joystick.
    ///
    ///This function returns the SDL compatible GUID, as a UTF-8 encoded
    ///hexadecimal string, of the specified joystick.  The returned string is
    ///allocated and freed by GLFW.  You should not free it yourself.
    ///
    ///The GUID is what connects a joystick to a gamepad mapping.  A connected
    ///joystick will always have a GUID even if there is no gamepad mapping
    ///assigned to it.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///The GUID uses the format introduced in SDL 2.0.5.  This GUID tries to
    ///uniquely identify the make and model of a joystick but does not identify
    ///a specific unit, e.g. all wired Xbox 360 controllers will have the same
    ///GUID on that platform.  The GUID for a unit may vary between platforms
    ///depending on what hardware information the platform specific APIs provide.
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded GUID of the joystick, or `NULL` if the joystick
    ///is not present or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetJoystickGUID_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    ///Returns the SDL compatible GUID of the specified joystick.
    ///
    ///This function returns the SDL compatible GUID, as a UTF-8 encoded
    ///hexadecimal string, of the specified joystick.  The returned string is
    ///allocated and freed by GLFW.  You should not free it yourself.
    ///
    ///The GUID is what connects a joystick to a gamepad mapping.  A connected
    ///joystick will always have a GUID even if there is no gamepad mapping
    ///assigned to it.
    ///
    ///If the specified joystick is not present this function will return `NULL`
    ///but will not generate an error.  This can be used instead of first calling
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)].
    ///
    ///The GUID uses the format introduced in SDL 2.0.5.  This GUID tries to
    ///uniquely identify the make and model of a joystick but does not identify
    ///a specific unit, e.g. all wired Xbox 360 controllers will have the same
    ///GUID on that platform.  The GUID for a unit may vary between platforms
    ///depending on what hardware information the platform specific APIs provide.
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded GUID of the joystick, or `NULL` if the joystick
    ///is not present or an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected or the library is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("const char*") java.lang.String glfwGetJoystickGUID(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickGUID.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickGUID", e); }
    }

    ///Sets the user pointer of the specified joystick.
    ///
    ///This function sets the user-defined pointer of the specified joystick.  The
    ///current value is retained until the joystick is disconnected.  The initial
    ///value is `NULL`.
    ///
    ///This function may be called from the joystick callback, even for a joystick
    ///that is being disconnected.
    ///
    ///@param jid The joystick whose pointer to set.
    ///@param pointer The new value.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwGetJoystickUserPointer(int) glfwGetJoystickUserPointer
    public static void glfwSetJoystickUserPointer(@CType("int") int jid, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        try {
            Handles.MH_glfwSetJoystickUserPointer.invokeExact(jid, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickUserPointer", e); }
    }

    ///Returns the user pointer of the specified joystick.
    ///
    ///This function returns the current value of the user-defined pointer of the
    ///specified joystick.  The initial value is `NULL`.
    ///
    ///This function may be called from the joystick callback, even for a joystick
    ///that is being disconnected.
    ///
    ///@param jid The joystick whose pointer to return.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Access is not
    ///synchronized.
    ///
    ///@see #glfwSetJoystickUserPointer(int, MemorySegment) glfwSetJoystickUserPointer
    public static @CType("void*") java.lang.foreign.MemorySegment glfwGetJoystickUserPointer(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetJoystickUserPointer.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetJoystickUserPointer", e); }
    }

    ///Returns whether the specified joystick has a gamepad mapping.
    ///
    ///This function returns whether the specified joystick is both present and has
    ///a gamepad mapping.
    ///
    ///If the specified joystick is present but does not have a gamepad mapping
    ///this function will return `GLFW_FALSE` but will not generate an error.  Call
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)] to check if a joystick is present regardless of
    ///whether it has a mapping.
    ///
    ///@param jid The joystick to query.
    ///@return `GLFW_TRUE` if a joystick is both present and has a gamepad mapping,
    ///or `GLFW_FALSE` otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetGamepadState(int, MemorySegment) glfwGetGamepadState
    public static @CType("int") boolean glfwJoystickIsGamepad(@CType("int") int jid) {
        try {
            return (int) Handles.MH_glfwJoystickIsGamepad.invokeExact(jid) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwJoystickIsGamepad", e); }
    }

    ///Sets the joystick configuration callback.
    ///
    ///This function sets the joystick configuration callback, or removes the
    ///currently set callback.  This is called when a joystick is connected to or
    ///disconnected from the system.
    ///
    ///For joystick connection and disconnection events to be delivered on all
    ///platforms, you need to call one of the [event processing](@ref events)
    ///functions.  Joystick disconnection may also be detected and the callback
    ///called by joystick functions.  The function will then return whatever it
    ///returns if the joystick is not present.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWJoystickFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWjoystickfun") java.lang.foreign.MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") java.lang.foreign.MemorySegment callback) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwSetJoystickCallback.invokeExact(callback);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetJoystickCallback", e); }
    }

    ///Sets the joystick configuration callback.
    ///
    ///This function sets the joystick configuration callback, or removes the
    ///currently set callback.  This is called when a joystick is connected to or
    ///disconnected from the system.
    ///
    ///For joystick connection and disconnection events to be delivered on all
    ///platforms, you need to call one of the [event processing](@ref events)
    ///functions.  Joystick disconnection may also be detected and the callback
    ///called by joystick functions.  The function will then return whatever it
    ///returns if the joystick is not present.
    ///
    ///@param callback The new callback, or `NULL` to remove the currently set
    ///callback.
    ///@return The previously set callback, or `NULL` if no callback was set or the
    ///library had not been initialized.
    ///
    ///@glfw.callback_signature
    ///For more information about the callback parameters, see the
    ///[function pointer type][GLFWJoystickFun].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    public static @CType("GLFWjoystickfun") java.lang.foreign.MemorySegment glfwSetJoystickCallback(@CType("GLFWjoystickfun") overrungl.glfw.GLFWJoystickFun callback) {
        return glfwSetJoystickCallback(callback != null ? callback.stub(Arena.global()) : MemorySegment.NULL);
    }

    ///Adds the specified SDL_GameControllerDB gamepad mappings.
    ///
    ///This function parses the specified ASCII encoded string and updates the
    ///internal list with any gamepad mappings it finds.  This string may
    ///contain either a single gamepad mapping or many mappings separated by
    ///newlines.  The parser supports the full format of the `gamecontrollerdb.txt`
    ///source file including empty lines and comments.
    ///
    ///See gamepad_mapping for a description of the format.
    ///
    ///If there is already a gamepad mapping for a given GUID in the internal list,
    ///it will be replaced by the one passed to this function.  If the library is
    ///terminated and re-initialized the internal list will revert to the built-in
    ///default.
    ///
    ///@param string The string containing the gamepad mappings.
    ///@return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    ///@see #glfwGetGamepadName(int) glfwGetGamepadName
    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") java.lang.foreign.MemorySegment string) {
        try {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(string) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    ///Adds the specified SDL_GameControllerDB gamepad mappings.
    ///
    ///This function parses the specified ASCII encoded string and updates the
    ///internal list with any gamepad mappings it finds.  This string may
    ///contain either a single gamepad mapping or many mappings separated by
    ///newlines.  The parser supports the full format of the `gamecontrollerdb.txt`
    ///source file including empty lines and comments.
    ///
    ///See gamepad_mapping for a description of the format.
    ///
    ///If there is already a gamepad mapping for a given GUID in the internal list,
    ///it will be replaced by the one passed to this function.  If the library is
    ///terminated and re-initialized the internal list will revert to the built-in
    ///default.
    ///
    ///@param string The string containing the gamepad mappings.
    ///@return `GLFW_TRUE` if successful, or `GLFW_FALSE` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    ///@see #glfwGetGamepadName(int) glfwGetGamepadName
    public static @CType("int") boolean glfwUpdateGamepadMappings(@CType("const char*") java.lang.String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwUpdateGamepadMappings.invokeExact(Marshal.marshal(__overrungl_stack, string)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwUpdateGamepadMappings", e); }
    }

    ///Returns the human-readable gamepad name for the specified joystick.
    ///
    ///This function returns the human-readable name of the gamepad from the
    ///gamepad mapping assigned to the specified joystick.
    ///
    ///If the specified joystick is not present or does not have a gamepad mapping
    ///this function will return `NULL` but will not generate an error.  Call
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
    ///whether it has a mapping.
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded name of the gamepad, or `NULL` if the
    ///joystick is not present, does not have a mapping or an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected, the gamepad mappings are updated or the library is terminated.
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetGamepadName_(@CType("int") int jid) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(jid);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    ///Returns the human-readable gamepad name for the specified joystick.
    ///
    ///This function returns the human-readable name of the gamepad from the
    ///gamepad mapping assigned to the specified joystick.
    ///
    ///If the specified joystick is not present or does not have a gamepad mapping
    ///this function will return `NULL` but will not generate an error.  Call
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
    ///whether it has a mapping.
    ///
    ///@param jid The joystick to query.
    ///@return The UTF-8 encoded name of the gamepad, or `NULL` if the
    ///joystick is not present, does not have a mapping or an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and [GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the specified joystick is
    ///disconnected, the gamepad mappings are updated or the library is terminated.
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    public static @CType("const char*") java.lang.String glfwGetGamepadName(@CType("int") int jid) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetGamepadName.invokeExact(jid));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadName", e); }
    }

    ///Retrieves the state of the specified joystick remapped as a gamepad.
    ///
    ///This function retrieves the state of the specified joystick remapped to
    ///an Xbox-like gamepad.
    ///
    ///If the specified joystick is not present or does not have a gamepad mapping
    ///this function will return `GLFW_FALSE` but will not generate an error.  Call
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
    ///whether it has a mapping.
    ///
    ///The Guide button may not be available for input as it is often hooked by the
    ///system or the Steam client.
    ///
    ///Not all devices have all the buttons or axes provided by
    ///[GLFWGamepadState].  Unavailable buttons and axes will always report
    ///`GLFW_RELEASE` and 0.0 respectively.
    ///
    ///@param jid The joystick to query.
    ///@param state The gamepad input state of the joystick.
    ///@return `GLFW_TRUE` if successful, or `GLFW_FALSE` if no joystick is
    ///connected, it has no gamepad mapping or an error
    ///occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwUpdateGamepadMappings(MemorySegment) glfwUpdateGamepadMappings
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") java.lang.foreign.MemorySegment state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(jid, state) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    ///Retrieves the state of the specified joystick remapped as a gamepad.
    ///
    ///This function retrieves the state of the specified joystick remapped to
    ///an Xbox-like gamepad.
    ///
    ///If the specified joystick is not present or does not have a gamepad mapping
    ///this function will return `GLFW_FALSE` but will not generate an error.  Call
    ///[glfwJoystickPresent][#glfwJoystickPresent(int)] to check whether it is present regardless of
    ///whether it has a mapping.
    ///
    ///The Guide button may not be available for input as it is often hooked by the
    ///system or the Steam client.
    ///
    ///Not all devices have all the buttons or axes provided by
    ///[GLFWGamepadState].  Unavailable buttons and axes will always report
    ///`GLFW_RELEASE` and 0.0 respectively.
    ///
    ///@param jid The joystick to query.
    ///@param state The gamepad input state of the joystick.
    ///@return `GLFW_TRUE` if successful, or `GLFW_FALSE` if no joystick is
    ///connected, it has no gamepad mapping or an error
    ///occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_ENUM][#GLFW_INVALID_ENUM].
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwUpdateGamepadMappings(MemorySegment) glfwUpdateGamepadMappings
    ///@see #glfwJoystickIsGamepad(int) glfwJoystickIsGamepad
    public static @CType("int") boolean glfwGetGamepadState(@CType("int") int jid, @CType("GLFWgamepadstate*") overrungl.glfw.GLFWGamepadState state) {
        try {
            return (int) Handles.MH_glfwGetGamepadState.invokeExact(jid, Marshal.marshal(state)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGamepadState", e); }
    }

    ///Sets the clipboard to the specified string.
    ///
    ///This function sets the system clipboard to the specified, UTF-8 encoded
    ///string.
    ///
    ///@param window Deprecated.  Any valid window or `NULL`.
    ///@param string A UTF-8 encoded string.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
    ///writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
    ///cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
    ///It is safe to try this multiple times.
    ///
    ///@glfw.pointer_lifetime The specified string is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetClipboardString(MemorySegment) glfwGetClipboardString
    public static void glfwSetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.foreign.MemorySegment string) {
        try {
            Handles.MH_glfwSetClipboardString.invokeExact(window, string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    ///Sets the clipboard to the specified string.
    ///
    ///This function sets the system clipboard to the specified, UTF-8 encoded
    ///string.
    ///
    ///@param window Deprecated.  Any valid window or `NULL`.
    ///@param string A UTF-8 encoded string.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
    ///writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
    ///cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
    ///It is safe to try this multiple times.
    ///
    ///@glfw.pointer_lifetime The specified string is copied before this function
    ///returns.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwGetClipboardString(MemorySegment) glfwGetClipboardString
    public static void glfwSetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const char*") java.lang.String string) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetClipboardString.invokeExact(window, Marshal.marshal(__overrungl_stack, string));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetClipboardString", e); }
    }

    ///Returns the contents of the clipboard as a string.
    ///
    ///This function returns the contents of the system clipboard, if it contains
    ///or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
    ///if its contents cannot be converted, `NULL` is returned and a
    ///[GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] error is generated.
    ///
    ///@param window Deprecated.  Any valid window or `NULL`.
    ///@return The contents of the clipboard as a UTF-8 encoded string, or `NULL`
    ///if an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
    ///writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
    ///cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
    ///It is safe to try this multiple times.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the next call to
    ///`glfwGetClipboardString` or [glfwSetClipboardString][#glfwSetClipboardString(MemorySegment, MemorySegment)], or until the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetClipboardString(MemorySegment, MemorySegment) glfwSetClipboardString
    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetClipboardString_(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    ///Returns the contents of the clipboard as a string.
    ///
    ///This function returns the contents of the system clipboard, if it contains
    ///or is convertible to a UTF-8 encoded string.  If the clipboard is empty or
    ///if its contents cannot be converted, `NULL` is returned and a
    ///[GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] error is generated.
    ///
    ///@param window Deprecated.  Any valid window or `NULL`.
    ///@return The contents of the clipboard as a UTF-8 encoded string, or `NULL`
    ///if an error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_FORMAT_UNAVAILABLE][#GLFW_FORMAT_UNAVAILABLE] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __Windows:__ The clipboard on Windows has a single global lock for reading and
    ///writing.  GLFW tries to acquire it a few times, which is almost always enough.  If it
    ///cannot acquire the lock then this function emits [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR] and returns.
    ///It is safe to try this multiple times.
    ///
    ///@glfw.pointer_lifetime The returned string is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is valid until the next call to
    ///`glfwGetClipboardString` or [glfwSetClipboardString][#glfwSetClipboardString(MemorySegment, MemorySegment)], or until the library
    ///is terminated.
    ///
    ///@glfw.thread_safety This function must only be called from the main thread.
    ///
    ///@see #glfwSetClipboardString(MemorySegment, MemorySegment) glfwSetClipboardString
    public static @CType("const char*") java.lang.String glfwGetClipboardString(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetClipboardString.invokeExact(window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetClipboardString", e); }
    }

    ///Returns the GLFW time.
    ///
    ///This function returns the current GLFW time, in seconds.  Unless the time
    ///has been set using [glfwSetTime][#glfwSetTime(double)] it measures time elapsed since GLFW was
    ///initialized.
    ///
    ///This function and [glfwSetTime][#glfwSetTime(double)] are helper functions on top of
    ///[glfwGetTimerFrequency][#glfwGetTimerFrequency()] and [glfwGetTimerValue][#glfwGetTimerValue()].
    ///
    ///The resolution of the timer is system dependent, but is usually on the order
    ///of a few micro- or nanoseconds.  It uses the highest-resolution monotonic
    ///time source on each operating system.
    ///
    ///@return The current time, in seconds, or zero if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Reading and
    ///writing of the internal base time is not atomic, so it needs to be
    ///externally synchronized with calls to [glfwSetTime][#glfwSetTime(double)].
    public static @CType("double") double glfwGetTime() {
        try {
            return (double) Handles.MH_glfwGetTime.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTime", e); }
    }

    ///Sets the GLFW time.
    ///
    ///This function sets the current GLFW time, in seconds.  The value must be
    ///a positive finite number less than or equal to 18446744073.0, which is
    ///approximately 584.5 years.
    ///
    ///This function and [glfwGetTime][#glfwGetTime()] are helper functions on top of
    ///[glfwGetTimerFrequency][#glfwGetTimerFrequency()] and [glfwGetTimerValue][#glfwGetTimerValue()].
    ///
    ///@param time The new value, in seconds.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE].
    ///
    ///@glfw.remark The upper limit of GLFW time is calculated as
    ///floor((2<sup>64</sup> - 1) / 10<sup>9</sup>) and is due to implementations
    ///storing nanoseconds in 64 bits.  The limit may be increased in the future.
    ///
    ///@glfw.thread_safety This function may be called from any thread.  Reading and
    ///writing of the internal base time is not atomic, so it needs to be
    ///externally synchronized with calls to [glfwGetTime][#glfwGetTime()].
    public static void glfwSetTime(@CType("double") double time) {
        try {
            Handles.MH_glfwSetTime.invokeExact(time);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetTime", e); }
    }

    ///Returns the current value of the raw timer.
    ///
    ///This function returns the current value of the raw timer, measured in
    ///1&nbsp;/&nbsp;frequency seconds.  To get the frequency, call
    ///[glfwGetTimerFrequency][#glfwGetTimerFrequency()].
    ///
    ///@return The value of the timer, or zero if an
    ///error occurred.
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetTimerFrequency() glfwGetTimerFrequency
    public static @CType("uint64_t") long glfwGetTimerValue() {
        try {
            return (long) Handles.MH_glfwGetTimerValue.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerValue", e); }
    }

    ///Returns the frequency, in Hz, of the raw timer.
    ///
    ///This function returns the frequency, in Hz, of the raw timer.
    ///
    ///@return The frequency of the timer, in Hz, or zero if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetTimerValue() glfwGetTimerValue
    public static @CType("uint64_t") long glfwGetTimerFrequency() {
        try {
            return (long) Handles.MH_glfwGetTimerFrequency.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetTimerFrequency", e); }
    }

    ///Makes the context of the specified window current for the calling
    ///thread.
    ///
    ///This function makes the OpenGL or OpenGL ES context of the specified window
    ///current on the calling thread.  It can also detach the current context from
    ///the calling thread without making a new one current by passing in `NULL`.
    ///
    ///A context must only be made current on a single thread at a time and each
    ///thread can have only a single current context at a time.  Making a context
    ///current detaches any previously current context on the calling thread.
    ///
    ///When moving a context between threads, you must detach it (make it
    ///non-current) on the old thread before making it current on the new one.
    ///
    ///By default, making a context non-current implicitly forces a pipeline flush.
    ///On machines that support `GL_KHR_context_flush_control`, you can control
    ///whether a context performs this flush by setting the
    ///[GLFW_CONTEXT_RELEASE_BEHAVIOR][#GLFW_CONTEXT_RELEASE_BEHAVIOR]
    ///hint.
    ///
    ///The specified window must have an OpenGL or OpenGL ES context.  Specifying
    ///a window without a context will generate a [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT]
    ///error.
    ///
    ///@param window The window whose context to make current, or `NULL` to
    ///detach the current context.
    ///
    ///@glfw.remark If the previously current context was created via a different
    ///context creation API than the one passed to this function, GLFW will still
    ///detach the previous one from its API before making the new one current.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetCurrentContext() glfwGetCurrentContext
    public static void glfwMakeContextCurrent(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwMakeContextCurrent.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwMakeContextCurrent", e); }
    }

    ///Returns the window whose context is current on the calling thread.
    ///
    ///This function returns the window whose OpenGL or OpenGL ES context is
    ///current on the calling thread.
    ///
    ///@return The window whose context is current, or `NULL` if no window's
    ///context is current.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwMakeContextCurrent(MemorySegment) glfwMakeContextCurrent
    public static @CType("GLFWwindow*") java.lang.foreign.MemorySegment glfwGetCurrentContext() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCurrentContext.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCurrentContext", e); }
    }

    ///Swaps the front and back buffers of the specified window.
    ///
    ///This function swaps the front and back buffers of the specified window when
    ///rendering with OpenGL or OpenGL ES.  If the swap interval is greater than
    ///zero, the GPU driver waits the specified number of screen updates before
    ///swapping the buffers.
    ///
    ///The specified window must have an OpenGL or OpenGL ES context.  Specifying
    ///a window without a context will generate a [GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT]
    ///error.
    ///
    ///This function does not apply to Vulkan.  If you are rendering with Vulkan,
    ///see `vkQueuePresentKHR` instead.
    ///
    ///@param window The window whose buffers to swap.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_WINDOW_CONTEXT][#GLFW_NO_WINDOW_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark __EGL:__ The context of the specified window must be current on the
    ///calling thread.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwSwapInterval(int) glfwSwapInterval
    public static void glfwSwapBuffers(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        try {
            Handles.MH_glfwSwapBuffers.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapBuffers", e); }
    }

    ///Sets the swap interval for the current context.
    ///
    ///This function sets the swap interval for the current OpenGL or OpenGL ES
    ///context, i.e. the number of screen updates to wait from the time
    ///[glfwSwapBuffers][#glfwSwapBuffers(MemorySegment)] was called before swapping the buffers and returning.  This
    ///is sometimes called _vertical synchronization_, _vertical retrace
    ///synchronization_ or just _vsync_.
    ///
    ///A context that supports either of the `WGL_EXT_swap_control_tear` and
    ///`GLX_EXT_swap_control_tear` extensions also accepts _negative_ swap
    ///intervals, which allows the driver to swap immediately even if a frame
    ///arrives a little bit late.  You can check for these extensions with
    ///[glfwExtensionSupported][#glfwExtensionSupported(MemorySegment)].
    ///
    ///A context must be current on the calling thread.  Calling this function
    ///without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.
    ///
    ///This function does not apply to Vulkan.  If you are rendering with Vulkan,
    ///see the present mode of your swapchain instead.
    ///
    ///@param interval The minimum number of screen updates to wait for
    ///until the buffers are swapped by [glfwSwapBuffers][#glfwSwapBuffers(MemorySegment)].
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark This function is not called during context creation, leaving the
    ///swap interval set to whatever is the default for that API.  This is done
    ///because some swap interval extensions used by GLFW do not allow the swap
    ///interval to be reset to zero once it has been set to a non-zero value.
    ///
    ///Some GPU drivers do not honor the requested swap interval, either
    ///because of a user setting that overrides the application's request or due to
    ///bugs in the driver.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwSwapBuffers(MemorySegment) glfwSwapBuffers
    public static void glfwSwapInterval(@CType("int") int interval) {
        try {
            Handles.MH_glfwSwapInterval.invokeExact(interval);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSwapInterval", e); }
    }

    ///Returns whether the specified extension is available.
    ///
    ///This function returns whether the specified
    ///API extension is supported by the current OpenGL or
    ///OpenGL ES context.  It searches both for client API extension and context
    ///creation API extensions.
    ///
    ///A context must be current on the calling thread.  Calling this function
    ///without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.
    ///
    ///As this functions retrieves and searches one or more extension strings each
    ///call, it is recommended that you cache its results if it is going to be used
    ///frequently.  The extension strings will not change during the lifetime of
    ///a context, so there is no danger in doing this.
    ///
    ///This function does not apply to Vulkan.  If you are using Vulkan, see
    ///[glfwGetRequiredInstanceExtensions][#glfwGetRequiredInstanceExtensions(MemorySegment)], `vkEnumerateInstanceExtensionProperties`
    ///and `vkEnumerateDeviceExtensionProperties` instead.
    ///
    ///@param extension The ASCII encoded name of the extension.
    ///@return `GLFW_TRUE` if the extension is available, or `GLFW_FALSE`
    ///otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetProcAddress(MemorySegment) glfwGetProcAddress
    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") java.lang.foreign.MemorySegment extension) {
        try {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(extension) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    ///Returns whether the specified extension is available.
    ///
    ///This function returns whether the specified
    ///API extension is supported by the current OpenGL or
    ///OpenGL ES context.  It searches both for client API extension and context
    ///creation API extensions.
    ///
    ///A context must be current on the calling thread.  Calling this function
    ///without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.
    ///
    ///As this functions retrieves and searches one or more extension strings each
    ///call, it is recommended that you cache its results if it is going to be used
    ///frequently.  The extension strings will not change during the lifetime of
    ///a context, so there is no danger in doing this.
    ///
    ///This function does not apply to Vulkan.  If you are using Vulkan, see
    ///[glfwGetRequiredInstanceExtensions][#glfwGetRequiredInstanceExtensions(MemorySegment)], `vkEnumerateInstanceExtensionProperties`
    ///and `vkEnumerateDeviceExtensionProperties` instead.
    ///
    ///@param extension The ASCII encoded name of the extension.
    ///@return `GLFW_TRUE` if the extension is available, or `GLFW_FALSE`
    ///otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT], [GLFW_INVALID_VALUE][#GLFW_INVALID_VALUE] and
    ///[GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwGetProcAddress(MemorySegment) glfwGetProcAddress
    public static @CType("int") boolean glfwExtensionSupported(@CType("const char*") java.lang.String extension) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_glfwExtensionSupported.invokeExact(Marshal.marshal(__overrungl_stack, extension)) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwExtensionSupported", e); }
    }

    ///Returns the address of the specified function for the current
    ///context.
    ///
    ///This function returns the address of the specified OpenGL or OpenGL ES
    ///core or extension function, if it is supported
    ///by the current context.
    ///
    ///A context must be current on the calling thread.  Calling this function
    ///without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.
    ///
    ///This function does not apply to Vulkan.  If you are rendering with Vulkan,
    ///see [glfwGetInstanceProcAddress][GLFWVulkan#glfwGetInstanceProcAddress(MemorySegment, MemorySegment)], `vkGetInstanceProcAddr` and
    ///`vkGetDeviceProcAddr` instead.
    ///
    ///@param procname The ASCII encoded name of the function.
    ///@return The address of the function, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark The address of a given function is not guaranteed to be the same
    ///between contexts.
    ///
    ///This function may return a non-`NULL` address despite the
    ///associated version or extension not being available.  Always check the
    ///context version or extension string first.
    ///
    ///@glfw.pointer_lifetime The returned function pointer is valid until the context
    ///is destroyed or the library is terminated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwExtensionSupported(MemorySegment) glfwExtensionSupported
    public static @CType("GLFWglproc") java.lang.foreign.MemorySegment glfwGetProcAddress(@CType("const char*") java.lang.foreign.MemorySegment procname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    ///Returns the address of the specified function for the current
    ///context.
    ///
    ///This function returns the address of the specified OpenGL or OpenGL ES
    ///core or extension function, if it is supported
    ///by the current context.
    ///
    ///A context must be current on the calling thread.  Calling this function
    ///without a current context will cause a [GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] error.
    ///
    ///This function does not apply to Vulkan.  If you are rendering with Vulkan,
    ///see [glfwGetInstanceProcAddress][GLFWVulkan#glfwGetInstanceProcAddress(MemorySegment, MemorySegment)], `vkGetInstanceProcAddr` and
    ///`vkGetDeviceProcAddr` instead.
    ///
    ///@param procname The ASCII encoded name of the function.
    ///@return The address of the function, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED],
    ///[GLFW_NO_CURRENT_CONTEXT][#GLFW_NO_CURRENT_CONTEXT] and [GLFW_PLATFORM_ERROR][#GLFW_PLATFORM_ERROR].
    ///
    ///@glfw.remark The address of a given function is not guaranteed to be the same
    ///between contexts.
    ///
    ///This function may return a non-`NULL` address despite the
    ///associated version or extension not being available.  Always check the
    ///context version or extension string first.
    ///
    ///@glfw.pointer_lifetime The returned function pointer is valid until the context
    ///is destroyed or the library is terminated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see #glfwExtensionSupported(MemorySegment) glfwExtensionSupported
    public static @CType("GLFWglproc") java.lang.foreign.MemorySegment glfwGetProcAddress(@CType("const char*") java.lang.String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetProcAddress.invokeExact(Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetProcAddress", e); }
    }

    ///Returns whether the Vulkan loader and an ICD have been found.
    ///
    ///This function returns whether the Vulkan loader and any minimally functional
    ///ICD have been found.
    ///
    ///The availability of a Vulkan loader and even an ICD does not by itself guarantee that
    ///surface creation or even instance creation is possible.  Call
    ///[glfwGetRequiredInstanceExtensions][#glfwGetRequiredInstanceExtensions(MemorySegment)] to check whether the extensions necessary for Vulkan
    ///surface creation are available and [glfwGetPhysicalDevicePresentationSupport][GLFWVulkan#glfwGetPhysicalDevicePresentationSupport(MemorySegment, MemorySegment, int)] to
    ///check whether a queue family of a physical device supports image presentation.
    ///
    ///@return `GLFW_TRUE` if Vulkan is minimally available, or `GLFW_FALSE`
    ///otherwise.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED].
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    public static @CType("int") boolean glfwVulkanSupported() {
        try {
            return (int) Handles.MH_glfwVulkanSupported.invokeExact() != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwVulkanSupported", e); }
    }

    ///Returns the Vulkan instance extensions required by GLFW.
    ///
    ///This function returns an array of names of Vulkan instance extensions required
    ///by GLFW for creating Vulkan surfaces for GLFW windows.  If successful, the
    ///list will always contain `VK_KHR_surface`, so if you don't require any
    ///additional extensions you can pass this list directly to the
    ///`VkInstanceCreateInfo` struct.
    ///
    ///If Vulkan is not available on the machine, this function returns `NULL` and
    ///generates a [GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE] error.  Call [glfwVulkanSupported][#glfwVulkanSupported()]
    ///to check whether Vulkan is at least minimally available.
    ///
    ///If Vulkan is available but no set of extensions allowing window surface
    ///creation was found, this function returns `NULL`.  You may still use Vulkan
    ///for off-screen rendering and compute work.
    ///
    ///@param count Where to store the number of extensions in the returned
    ///array.  This is set to zero if an error occurred.
    ///@return An array of ASCII encoded extension names, or `NULL` if an
    ///error occurred.
    ///
    ///@glfw.errors Possible errors include [GLFW_NOT_INITIALIZED][#GLFW_NOT_INITIALIZED] and
    ///[GLFW_API_UNAVAILABLE][#GLFW_API_UNAVAILABLE].
    ///
    ///@glfw.remark Additional extensions may be required by future versions of GLFW.
    ///You should check if any extensions you wish to enable are already in the
    ///returned array, as it is an error to specify an extension more than once in
    ///the `VkInstanceCreateInfo` struct.
    ///
    ///@glfw.pointer_lifetime The returned array is allocated and freed by GLFW.  You
    ///should not free it yourself.  It is guaranteed to be valid only until the
    ///library is terminated.
    ///
    ///@glfw.thread_safety This function may be called from any thread.
    ///
    ///@see GLFWVulkan#glfwCreateWindowSurface(MemorySegment, MemorySegment, MemorySegment, MemorySegment) glfwCreateWindowSurface
    public static @CType("const char**") java.lang.foreign.MemorySegment glfwGetRequiredInstanceExtensions(@Out @CType("uint32_t*") java.lang.foreign.MemorySegment count) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetRequiredInstanceExtensions.invokeExact(count);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetRequiredInstanceExtensions", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFW() {
    }

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
    /// @param images The images to create the icon from.  This is ignored if count is zero.
    /// @see #glfwSetWindowIcon(MemorySegment, int, MemorySegment)
    public static void glfwSetWindowIcon(MemorySegment window, GLFWImage images) {
        glfwSetWindowIcon(window, images != null ? Math.toIntExact(images.estimateCount()) : 0, images);
    }

    /// Returns the values of all axes of the specified joystick.
    ///
    /// @param jid The joystick to query.
    /// @return An array of axis values, or `NULL` if the joystick is not present or
    /// an error occurred.
    /// @see #glfwGetJoystickAxes(int, MemorySegment)
    public static float[] glfwGetJoystickAxes(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickAxes(jid, c);
            return Unmarshal.unmarshalAsFloatArray(segment.reinterpret(JAVA_FLOAT.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    /// Returns the state of all buttons of the specified joystick.
    ///
    /// @param jid The joystick to query.
    /// @return An array of button states, or `NULL` if the joystick is not present
    /// or an error occurred.
    /// @see #glfwGetJoystickButtons(int, MemorySegment)
    public static byte[] glfwGetJoystickButtons(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickButtons(jid, c);
            return Unmarshal.unmarshalAsByteArray(segment.reinterpret(JAVA_BYTE.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    /// Returns the state of all hats of the specified joystick.
    ///
    /// @param jid The joystick to query.
    /// @return An array of hat states, or `NULL` if the joystick is not present
    /// or an error occurred.
    /// @see #glfwGetJoystickHats(int, MemorySegment)
    public static byte[] glfwGetJoystickHats(int jid) {
        try (var stack = MemoryStack.pushLocal()) {
            MemorySegment c = stack.allocate(JAVA_INT);
            MemorySegment segment = glfwGetJoystickHats(jid, c);
            return Unmarshal.unmarshalAsByteArray(segment.reinterpret(JAVA_BYTE.scale(0, c.get(JAVA_INT, 0))));
        }
    }

    /// Returns the Vulkan instance extensions required by GLFW.
    ///
    /// @return An array of ASCII encoded extension names, or `NULL` if an
    /// error occurred.
    /// @see #glfwGetRequiredInstanceExtensions(MemorySegment)
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
