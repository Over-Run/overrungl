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

package overrungl.opengl;

import overrungl.opengl.ext.arb.GLARBDrawBuffersBlend;
import overrungl.opengl.ext.arb.GLARBSampleShading;
import overrungl.opengl.ext.arb.GLARBTextureCubeMapArray;
import overrungl.opengl.ext.arb.GLARBTextureGather;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

/**
 * The OpenGL 4.0 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBDrawBuffersBlend GL_ARB_draw_buffers_blend}</li>
 *     <li>GL_ARB_draw_indirect</li>
 *     <li>GL_ARB_gpu_shader_fp64</li>
 *     <li>GL_ARB_shader_subroutine</li>
 *     <li>GL_ARB_tessellation_shader</li>
 *     <li>GL_ARB_transform_feedback2</li>
 *     <li>GL_ARB_transform_feedback3</li>
 *     <li>{@linkplain GLARBSampleShading GL_ARB_sample_shading}</li>
 *     <li>{@linkplain GLARBTextureCubeMapArray GL_ARB_texture_cube_map_array}</li>
 *     <li>{@linkplain GLARBTextureGather GL_ARB_texture_gather}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL40C extends GL33C permits GL41C {
    public static final int SAMPLE_SHADING = 0x8C36;
    public static final int MIN_SAMPLE_SHADING_VALUE = 0x8C37;
    public static final int MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
    public static final int MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
    public static final int TEXTURE_CUBE_MAP_ARRAY = 0x9009;
    public static final int TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
    public static final int PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
    public static final int SAMPLER_CUBE_MAP_ARRAY = 0x900C;
    public static final int SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
    public static final int INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
    public static final int UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
    public static final int DRAW_INDIRECT_BUFFER = 0x8F3F;
    public static final int DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    public static final int GEOMETRY_SHADER_INVOCATIONS = 0x887F;
    public static final int MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
    public static final int MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
    public static final int MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
    public static final int FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
    public static final int MAX_VERTEX_STREAMS = 0x8E71;
    public static final int DOUBLE_VEC2 = 0x8FFC;
    public static final int DOUBLE_VEC3 = 0x8FFD;
    public static final int DOUBLE_VEC4 = 0x8FFE;
    public static final int DOUBLE_MAT2 = 0x8F46;
    public static final int DOUBLE_MAT3 = 0x8F47;
    public static final int DOUBLE_MAT4 = 0x8F48;
    public static final int DOUBLE_MAT2x3 = 0x8F49;
    public static final int DOUBLE_MAT2x4 = 0x8F4A;
    public static final int DOUBLE_MAT3x2 = 0x8F4B;
    public static final int DOUBLE_MAT3x4 = 0x8F4C;
    public static final int DOUBLE_MAT4x2 = 0x8F4D;
    public static final int DOUBLE_MAT4x3 = 0x8F4E;
    public static final int ACTIVE_SUBROUTINES = 0x8DE5;
    public static final int ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    public static final int ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    public static final int ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    public static final int ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    public static final int MAX_SUBROUTINES = 0x8DE7;
    public static final int MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    public static final int NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final int PATCHES = 0x000E;
    public static final int PATCH_VERTICES = 0x8E72;
    public static final int PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
    public static final int PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
    public static final int TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
    public static final int TESS_GEN_MODE = 0x8E76;
    public static final int TESS_GEN_SPACING = 0x8E77;
    public static final int TESS_GEN_VERTEX_ORDER = 0x8E78;
    public static final int TESS_GEN_POINT_MODE = 0x8E79;
    public static final int ISOLINES = 0x8E7A;
    public static final int FRACTIONAL_ODD = 0x8E7B;
    public static final int FRACTIONAL_EVEN = 0x8E7C;
    public static final int MAX_PATCH_VERTICES = 0x8E7D;
    public static final int MAX_TESS_GEN_LEVEL = 0x8E7E;
    public static final int MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
    public static final int MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
    public static final int MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
    public static final int MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
    public static final int MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
    public static final int MAX_TESS_PATCH_COMPONENTS = 0x8E84;
    public static final int MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
    public static final int MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
    public static final int MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
    public static final int MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
    public static final int MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
    public static final int MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
    public static final int MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
    public static final int MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
    public static final int TESS_EVALUATION_SHADER = 0x8E87;
    public static final int TESS_CONTROL_SHADER = 0x8E88;
    public static final int TRANSFORM_FEEDBACK = 0x8E22;
    public static final int TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    public static final int MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBeginQueryIndexed, caps.glBindTransformFeedback, caps.glBlendEquationSeparatei, caps.glBlendEquationi, caps.glBlendFuncSeparatei, caps.glBlendFunci,
            caps.glDeleteTransformFeedbacks, caps.glDrawArraysIndirect, caps.glDrawElementsIndirect, caps.glDrawTransformFeedback, caps.glDrawTransformFeedbackStream, caps.glEndQueryIndexed,
            caps.glGenTransformFeedbacks, caps.glGetActiveSubroutineName, caps.glGetActiveSubroutineUniformName, caps.glGetActiveSubroutineUniformiv, caps.glGetProgramStageiv, caps.glGetQueryIndexediv,
            caps.glGetSubroutineIndex, caps.glGetSubroutineUniformLocation, caps.glGetUniformSubroutineuiv, caps.glGetUniformdv, caps.glIsTransformFeedback, caps.glMinSampleShading,
            caps.glPatchParameterfv, caps.glPatchParameteri, caps.glPauseTransformFeedback, caps.glResumeTransformFeedback, caps.glUniform1d, caps.glUniform1dv,
            caps.glUniform2d, caps.glUniform2dv, caps.glUniform3d, caps.glUniform3dv, caps.glUniform4d, caps.glUniform4dv,
            caps.glUniformMatrix2dv, caps.glUniformMatrix2x3dv, caps.glUniformMatrix2x4dv, caps.glUniformMatrix3dv, caps.glUniformMatrix3x2dv, caps.glUniformMatrix3x4dv,
            caps.glUniformMatrix4dv, caps.glUniformMatrix4x2dv, caps.glUniformMatrix4x3dv, caps.glUniformSubroutinesuiv);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBeginQueryIndexed = load.invoke("glBeginQueryIndexed", IIIV);
        caps.glBindTransformFeedback = load.invoke("glBindTransformFeedback", IIV);
        caps.glBlendEquationSeparatei = load.invoke("glBlendEquationSeparatei", IIIV);
        caps.glBlendEquationi = load.invoke("glBlendEquationi", IIV);
        caps.glBlendFuncSeparatei = load.invoke("glBlendFuncSeparatei", IIIIIV);
        caps.glBlendFunci = load.invoke("glBlendFunci", IIIV);
        caps.glDeleteTransformFeedbacks = load.invoke("glDeleteTransformFeedbacks", IPV);
        caps.glDrawArraysIndirect = load.invoke("glDrawArraysIndirect", IPV);
        caps.glDrawElementsIndirect = load.invoke("glDrawElementsIndirect", IIPV);
        caps.glDrawTransformFeedback = load.invoke("glDrawTransformFeedback", IIV);
        caps.glDrawTransformFeedbackStream = load.invoke("glDrawTransformFeedbackStream", IIIV);
        caps.glEndQueryIndexed = load.invoke("glEndQueryIndexed", IIV);
        caps.glGenTransformFeedbacks = load.invoke("glGenTransformFeedbacks", IPV);
        caps.glGetActiveSubroutineName = load.invoke("glGetActiveSubroutineName", IIIIPPV);
        caps.glGetActiveSubroutineUniformName = load.invoke("glGetActiveSubroutineUniformName", IIIIPPV);
        caps.glGetActiveSubroutineUniformiv = load.invoke("glGetActiveSubroutineUniformiv", IIIIPV);
        caps.glGetProgramStageiv = load.invoke("glGetProgramStageiv", IIIPV);
        caps.glGetQueryIndexediv = load.invoke("glGetQueryIndexediv", IIIPV);
        caps.glGetSubroutineIndex = load.invoke("glGetSubroutineIndex", IIPI);
        caps.glGetSubroutineUniformLocation = load.invoke("glGetSubroutineUniformLocation", IIPI);
        caps.glGetUniformSubroutineuiv = load.invoke("glGetUniformSubroutineuiv", IIPV);
        caps.glGetUniformdv = load.invoke("glGetUniformdv", IIPV);
        caps.glIsTransformFeedback = load.invoke("glIsTransformFeedback", IZ);
        caps.glMinSampleShading = load.invoke("glMinSampleShading", FV);
        caps.glPatchParameterfv = load.invoke("glPatchParameterfv", IPV);
        caps.glPatchParameteri = load.invoke("glPatchParameteri", IIV);
        caps.glPauseTransformFeedback = load.invoke("glPauseTransformFeedback", V);
        caps.glResumeTransformFeedback = load.invoke("glResumeTransformFeedback", V);
        caps.glUniform1d = load.invoke("glUniform1d", IDV);
        caps.glUniform1dv = load.invoke("glUniform1dv", IIPV);
        caps.glUniform2d = load.invoke("glUniform2d", IDDV);
        caps.glUniform2dv = load.invoke("glUniform2dv", IIPV);
        caps.glUniform3d = load.invoke("glUniform3d", IDDDV);
        caps.glUniform3dv = load.invoke("glUniform3dv", IIPV);
        caps.glUniform4d = load.invoke("glUniform4d", IDDDDV);
        caps.glUniform4dv = load.invoke("glUniform4dv", IIPV);
        caps.glUniformMatrix2dv = load.invoke("glUniformMatrix2dv", IIZPV);
        caps.glUniformMatrix2x3dv = load.invoke("glUniformMatrix2x3dv", IIZPV);
        caps.glUniformMatrix2x4dv = load.invoke("glUniformMatrix2x4dv", IIZPV);
        caps.glUniformMatrix3dv = load.invoke("glUniformMatrix3dv", IIZPV);
        caps.glUniformMatrix3x2dv = load.invoke("glUniformMatrix3x2dv", IIZPV);
        caps.glUniformMatrix3x4dv = load.invoke("glUniformMatrix3x4dv", IIZPV);
        caps.glUniformMatrix4dv = load.invoke("glUniformMatrix4dv", IIZPV);
        caps.glUniformMatrix4x2dv = load.invoke("glUniformMatrix4x2dv", IIZPV);
        caps.glUniformMatrix4x3dv = load.invoke("glUniformMatrix4x3dv", IIZPV);
        caps.glUniformSubroutinesuiv = load.invoke("glUniformSubroutinesuiv", IIPV);
    }

    public static void beginQueryIndexed(int target, int index, int id) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginQueryIndexed).invokeExact(target, index, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindTransformFeedback(int target, int id) {
        var caps = getCapabilities();
        try {
            check(caps.glBindTransformFeedback).invokeExact(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendEquationSeparatei).invokeExact(buf, modeRGB, modeAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationi(int buf, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendEquationi).invokeExact(buf, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquationSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendEquationSeparatei).invokeExact(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendFunci(int buf, int src, int dst) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendFunci).invokeExact(buf, src, dst);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTransformFeedbacks(int n, MemorySegment ids) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteTransformFeedbacks).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        deleteTransformFeedbacks(ids.length, allocator.allocateArray(JAVA_INT, ids));
    }

    public static void deleteTransformFeedback(int id) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteTransformFeedbacks(1, stack.ints(id));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void drawArraysIndirect(int mode, MemorySegment indirect) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawArraysIndirect).invokeExact(mode, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawArraysIndirect(int mode, DrawArraysIndirectCommand indirect) {
        drawArraysIndirect(mode, indirect.address());
    }

    public static void drawArraysIndirect(SegmentAllocator allocator, int mode, int[] indirect) {
        drawArraysIndirect(mode, allocator.allocateArray(JAVA_INT, indirect));
    }

    public static void drawElementsIndirect(int mode, int type, MemorySegment indirect) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElementsIndirect).invokeExact(mode, type, indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsIndirect(int mode, int type, DrawElementsIndirectCommand indirect) {
        drawElementsIndirect(mode, type, indirect.address());
    }

    public static void drawElementsIndirect(SegmentAllocator allocator, int mode, int type, int[] indirect) {
        drawElementsIndirect(mode, type, allocator.allocateArray(JAVA_INT, indirect));
    }

    public static void drawTransformFeedback(int mode, int id) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawTransformFeedback).invokeExact(mode, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawTransformFeedbackStream(int mode, int id, int stream) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawTransformFeedbackStream).invokeExact(mode, id, stream);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endQueryIndexed(int target, int index) {
        var caps = getCapabilities();
        try {
            check(caps.glEndQueryIndexed).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTransformFeedbacks(int n, MemorySegment ids) {
        var caps = getCapabilities();
        try {
            check(caps.glGenTransformFeedbacks).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        var seg = allocator.allocateArray(JAVA_INT, ids.length);
        genTransformFeedbacks(ids.length, seg);
        RuntimeHelper.toArray(seg, ids);
    }

    public static int genTransformFeedback() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            genTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getActiveSubroutineName(int program, int shaderType, int index, int bufSize, MemorySegment length, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetActiveSubroutineName).invokeExact(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getActiveSubroutineName(SegmentAllocator allocator, int program, int shaderType, int index, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveSubroutineName(program, shaderType, index, bufSize, MemorySegment.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize, MemorySegment length, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetActiveSubroutineUniformName).invokeExact(program, shaderType, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getActiveSubroutineUniformName(SegmentAllocator allocator, int program, int shaderType, int index, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveSubroutineUniformName(program, shaderType, index, bufSize, MemorySegment.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetActiveSubroutineUniformiv).invokeExact(program, shaderType, index, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveSubroutineUniformiv(SegmentAllocator allocator, int program, int shaderType, int index, int pname, int[] values) {
        var seg = allocator.allocateArray(JAVA_INT, values.length);
        getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static int getActiveSubroutineUniformi(int program, int shaderType, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getProgramStageiv(int program, int shaderType, int pname, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramStageiv).invokeExact(program, shaderType, pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramStagei(int program, int shaderType, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getProgramStageiv(program, shaderType, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryIndexediv(int target, int index, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetQueryIndexediv).invokeExact(target, index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getQueryIndexedi(int target, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getQueryIndexediv(target, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getSubroutineIndex(int program, int shaderType, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetSubroutineIndex).invokeExact(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getSubroutineIndex(int program, int shaderType, String name) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return getSubroutineIndex(program, shaderType, stack.allocateUtf8String(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getSubroutineUniformLocation(int program, int shaderType, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetSubroutineUniformLocation).invokeExact(program, shaderType, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getSubroutineUniformLocation(int program, int shaderType, String name) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return getSubroutineUniformLocation(program, shaderType, stack.allocateUtf8String(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getUniformSubroutineuiv(int shaderType, int location, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetUniformSubroutineuiv).invokeExact(shaderType, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformSubroutineuiv(SegmentAllocator allocator, int shaderType, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getUniformSubroutineuiv(shaderType, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getUniformdv(int program, int location, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetUniformdv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformdv(SegmentAllocator allocator, int program, int location, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getUniformdv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static double getUniformd(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocDouble();
            getUniformdv(program, location, seg);
            return seg.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isTransformFeedback(int id) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsTransformFeedback).invokeExact(id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void minSampleShading(float value) {
        var caps = getCapabilities();
        try {
            check(caps.glMinSampleShading).invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void patchParameterfv(int pname, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glPatchParameterfv).invokeExact(pname, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void patchParameterfv(SegmentAllocator allocator, int pname, float[] values) {
        patchParameterfv(pname, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void patchParameteri(int pname, int value) {
        var caps = getCapabilities();
        try {
            check(caps.glPatchParameteri).invokeExact(pname, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pauseTransformFeedback() {
        var caps = getCapabilities();
        try {
            check(caps.glPauseTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void resumeTransformFeedback() {
        var caps = getCapabilities();
        try {
            check(caps.glResumeTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1d(int location, double x) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1d).invokeExact(location, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1dv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1dv(SegmentAllocator allocator, int location, double[] value) {
        uniform1dv(location, value.length, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform2d(int location, double x, double y) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2d).invokeExact(location, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2dv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2dv(SegmentAllocator allocator, int location, double[] value) {
        uniform2dv(location, value.length >> 1, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform3d(int location, double x, double y, double z) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3d).invokeExact(location, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3dv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3dv(SegmentAllocator allocator, int location, double[] value) {
        uniform3dv(location, value.length / 3, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniform4d(int location, double x, double y, double z, double w) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4d).invokeExact(location, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4dv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4dv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4dv(SegmentAllocator allocator, int location, double[] value) {
        uniform4dv(location, value.length >> 2, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2dv(allocator, location, value.length >> 2, transpose, value);
    }

    public static void uniformMatrix2x3dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix2x3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2x3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x3dv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix2x4dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix2x4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix2x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix2x4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix2x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x4dv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix3dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3dv(allocator, location, value.length / 9, transpose, value);
    }

    public static void uniformMatrix3x2dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix3x2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3x2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x2dv(allocator, location, value.length / 6, transpose, value);
    }

    public static void uniformMatrix3x4dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix3x4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix3x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix3x4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix3x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x4dv(allocator, location, value.length / 12, transpose, value);
    }

    public static void uniformMatrix4dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix4dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4dv(allocator, location, value.length >> 4, transpose, value);
    }

    public static void uniformMatrix4x2dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix4x2dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4x2dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x2dv(allocator, location, value.length >> 3, transpose, value);
    }

    public static void uniformMatrix4x3dv(int location, int count, boolean transpose, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformMatrix4x3dv).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformMatrix4x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        uniformMatrix4x3dv(location, count, transpose, allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void uniformMatrix4x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x3dv(allocator, location, value.length / 12, transpose, value);
    }

    public static void uniformSubroutinesuiv(int shaderType, int count, MemorySegment indices) {
        var caps = getCapabilities();
        try {
            check(caps.glUniformSubroutinesuiv).invokeExact(shaderType, count, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformSubroutinesuiv(SegmentAllocator allocator, int shaderType, int[] indices) {
        uniformSubroutinesuiv(shaderType, indices.length, allocator.allocateArray(JAVA_INT, indices));
    }
}
