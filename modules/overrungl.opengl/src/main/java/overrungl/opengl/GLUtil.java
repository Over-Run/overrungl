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

package overrungl.opengl;

import overrungl.OverrunGL;
import overrungl.opengl.amd.GLAMDDebugOutput;
import overrungl.opengl.amd.GLDebugProcAMD;
import overrungl.opengl.arb.GLARBDebugOutput;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Locale;
import java.util.function.Consumer;

import static overrungl.OverrunGL.apiLog;
import static overrungl.internal.RuntimeHelper.unknownToken;
import static overrungl.opengl.GL.*;
import static overrungl.opengl.amd.GLAMDDebugOutput.*;
import static overrungl.opengl.arb.GLARBDebugOutput.*;

/**
 * OpenGL utilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLUtil {
    private GLUtil() {
    }

    /**
     * Detects the best debug output functionality to use and creates a callback that prints information to
     * {@link OverrunGL#apiLogger() API Logger}.
     * <p>
     * The callback function is allocated with the given {@link Arena} that should be
     * {@link Arena#close() closed} when no longer needed, which is often after destroying GL context.
     *
     * @param arena the arena to allocate the callback
     * @param gl    the OpenGL context.
     * @param flags the OpenGL flags.
     * @param func  the loading function
     */
    public static void setupDebugMessageCallback(
        Arena arena,
        GL43 gl,
        GLFlags flags,
        GLLoadFunc func
    ) {
        setupDebugMessageCallback(arena, gl, flags, func, OverrunGL.apiLogger());
    }

    /**
     * Detects the best debug output functionality to use and creates a callback that prints information to the specified
     * logger.
     * <p>
     * The callback function is allocated with the given {@link Arena} that should be
     * {@link Arena#close() closed} when no longer needed, which is often after destroying GL context.
     *
     * @param arena  the arena to allocate the callback
     * @param gl     the OpenGL context.
     * @param flags  the OpenGL flags.
     * @param func   the loading function
     * @param logger the output logger.
     */
    public static void setupDebugMessageCallback(
        Arena arena,
        GL43 gl,
        GLFlags flags,
        GLLoadFunc func,
        Consumer<String> logger
    ) {
        if (flags.GL43 || flags.GL_KHR_debug) {
            if (flags.GL43) {
                apiLog("[GL] Using OpenGL 4.3 for error logging.");
            } else {
                apiLog("[GL] Using KHR_debug for error logging.");
            }
            gl.DebugMessageCallback(GLDebugProc.alloc(arena, (source, type, id, severity, _, message, _) -> {
                var sb = new StringBuilder(768);
                sb.append("[OverrunGL] OpenGL debug message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id).toUpperCase(Locale.ROOT));
                printDetail(sb, "Source", getDebugSource(source));
                printDetail(sb, "Type", getDebugType(type));
                printDetail(sb, "Severity", getDebugSeverity(severity));
                printDetail(sb, "Message", MemoryUtil.nativeString(message));
                var stack = Thread.currentThread().getStackTrace();
                for (int i = 3; i < stack.length; i++) {
                    sb.append("    at ").append(stack[i]).append("\n");
                }
                logger.accept(sb.toString());
            }), MemorySegment.NULL);
            // no need GL_KHR_debug
            if (flags.GL30) {
                int contextFlags;
                try (MemoryStack stack = MemoryStack.pushLocal()) {
                    MemorySegment segment = stack.allocate(ValueLayout.JAVA_INT);
                    gl.GetIntegerv(GL_CONTEXT_FLAGS, segment);
                    contextFlags = segment.get(ValueLayout.JAVA_INT, 0);
                }
                if ((contextFlags & GL_CONTEXT_FLAG_DEBUG_BIT) == 0) {
                    apiLog("[GL] Warning: A non-debug context may not produce any debug output.");
                    gl.Enable(GL_DEBUG_OUTPUT);
                }
            }
        }

        if (flags.GL_ARB_debug_output) {
            apiLog("[GL] Using ARB_debug_output for error logging.");
            new GLARBDebugOutput(func).DebugMessageCallbackARB(GLDebugProc.alloc(arena, (source, type, id, severity, _, message, _) -> {
                var sb = new StringBuilder(768);
                sb.append("[OverrunGL] ARB_debug_output message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id).toUpperCase(Locale.ROOT));
                printDetail(sb, "Source", getSourceARB(source));
                printDetail(sb, "Type", getTypeARB(type));
                printDetail(sb, "Severity", getSeverityARB(severity));
                printDetail(sb, "Message", MemoryUtil.nativeString(message));
                var stack = Thread.currentThread().getStackTrace();
                for (int i = 3; i < stack.length; i++) {
                    sb.append("    at ").append(stack[i]).append("\n");
                }
                logger.accept(sb.toString());
            }), MemorySegment.NULL);
        }

        if (flags.GL_AMD_debug_output) {
            apiLog("[GL] Using AMD_debug_output for error logging.");
            new GLAMDDebugOutput(func).DebugMessageCallbackAMD(GLDebugProcAMD.alloc(arena, (id, category, severity, _, message, _) -> {
                var sb = new StringBuilder(768);
                sb.append("[OverrunGL] AMD_debug_output message\n");
                printDetail(sb, "ID", "0x" + Integer.toHexString(id).toUpperCase(Locale.ROOT));
                printDetail(sb, "Category", getCategoryAMD(category));
                printDetail(sb, "Severity", getSeverityAMD(severity));
                printDetail(sb, "Message", MemoryUtil.nativeString(message));
                var stack = Thread.currentThread().getStackTrace();
                for (int i = 3; i < stack.length; i++) {
                    sb.append("    at ").append(stack[i]).append("\n");
                }
                logger.accept(sb.toString());
            }), MemorySegment.NULL);
        }

        apiLog("[GL] No debug output implementation is available.");
    }

    private static void printDetail(StringBuilder sb, String type, String message) {
        sb.append("    ").append(type).append(": ").append(message).append("\n");
    }

    private static String getDebugSource(int source) {
        return switch (source) {
            case GL_DEBUG_SOURCE_API -> "API";
            case GL_DEBUG_SOURCE_WINDOW_SYSTEM -> "WINDOW SYSTEM";
            case GL_DEBUG_SOURCE_SHADER_COMPILER -> "SHADER COMPILER";
            case GL_DEBUG_SOURCE_THIRD_PARTY -> "THIRD PARTY";
            case GL_DEBUG_SOURCE_APPLICATION -> "APPLICATION";
            case GL_DEBUG_SOURCE_OTHER -> "OTHER";
            default -> unknownToken(source);
        };
    }

    private static String getDebugType(int type) {
        return switch (type) {
            case GL_DEBUG_TYPE_ERROR -> "ERROR";
            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR -> "DEPRECATED BEHAVIOR";
            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR -> "UNDEFINED BEHAVIOR";
            case GL_DEBUG_TYPE_PORTABILITY -> "PORTABILITY";
            case GL_DEBUG_TYPE_PERFORMANCE -> "PERFORMANCE";
            case GL_DEBUG_TYPE_OTHER -> "OTHER";
            case GL_DEBUG_TYPE_MARKER -> "MARKER";
            default -> unknownToken(type);
        };
    }

    private static String getDebugSeverity(int severity) {
        return switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH -> "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM -> "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW -> "LOW";
            case GL_DEBUG_SEVERITY_NOTIFICATION -> "NOTIFICATION";
            default -> unknownToken(severity);
        };
    }

    private static String getSourceARB(int source) {
        return switch (source) {
            case GL_DEBUG_SOURCE_API_ARB -> "API";
            case GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB -> "WINDOW SYSTEM";
            case GL_DEBUG_SOURCE_SHADER_COMPILER_ARB -> "SHADER COMPILER";
            case GL_DEBUG_SOURCE_THIRD_PARTY_ARB -> "THIRD PARTY";
            case GL_DEBUG_SOURCE_APPLICATION_ARB -> "APPLICATION";
            case GL_DEBUG_SOURCE_OTHER_ARB -> "OTHER";
            default -> unknownToken(source);
        };
    }

    private static String getTypeARB(int type) {
        return switch (type) {
            case GL_DEBUG_TYPE_ERROR_ARB -> "ERROR";
            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB -> "DEPRECATED BEHAVIOR";
            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB -> "UNDEFINED BEHAVIOR";
            case GL_DEBUG_TYPE_PORTABILITY_ARB -> "PORTABILITY";
            case GL_DEBUG_TYPE_PERFORMANCE_ARB -> "PERFORMANCE";
            case GL_DEBUG_TYPE_OTHER_ARB -> "OTHER";
            default -> unknownToken(type);
        };
    }

    private static String getSeverityARB(int severity) {
        return switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH_ARB -> "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM_ARB -> "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW_ARB -> "LOW";
            default -> unknownToken(severity);
        };
    }

    private static String getCategoryAMD(int category) {
        return switch (category) {
            case GL_DEBUG_CATEGORY_API_ERROR_AMD -> "API ERROR";
            case GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD -> "WINDOW SYSTEM";
            case GL_DEBUG_CATEGORY_DEPRECATION_AMD -> "DEPRECATION";
            case GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD -> "UNDEFINED BEHAVIOR";
            case GL_DEBUG_CATEGORY_PERFORMANCE_AMD -> "PERFORMANCE";
            case GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD -> "SHADER COMPILER";
            case GL_DEBUG_CATEGORY_APPLICATION_AMD -> "APPLICATION";
            case GL_DEBUG_CATEGORY_OTHER_AMD -> "OTHER";
            default -> unknownToken(category);
        };
    }

    private static String getSeverityAMD(int severity) {
        return switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH_AMD -> "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM_AMD -> "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW_AMD -> "LOW";
            default -> unknownToken(severity);
        };
    }
}
