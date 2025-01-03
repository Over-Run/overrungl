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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0x0000;
    public static final int GL_NOP_COMMAND_NV = 0x0001;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 0x0002;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 0x0003;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 0x0004;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 0x0005;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x0006;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 0x0007;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 0x0008;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 0x0009;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 0x000A;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 0x000B;
    public static final int GL_STENCIL_REF_COMMAND_NV = 0x000C;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 0x000D;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 0x000E;
    public static final int GL_ALPHA_REF_COMMAND_NV = 0x000F;
    public static final int GL_VIEWPORT_COMMAND_NV = 0x0010;
    public static final int GL_SCISSOR_COMMAND_NV = 0x0011;
    public static final int GL_FRONT_FACE_COMMAND_NV = 0x0012;
    public static final MethodHandle MH_glCreateStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateStatesNV;
    public static final MethodHandle MH_glDeleteStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteStatesNV;
    public static final MethodHandle MH_glIsStateNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsStateNV;
    public static final MethodHandle MH_glStateCaptureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glStateCaptureNV;
    public static final MethodHandle MH_glGetCommandHeaderNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetCommandHeaderNV;
    public static final MethodHandle MH_glGetStageIndexNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetStageIndexNV;
    public static final MethodHandle MH_glDrawCommandsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawCommandsNV;
    public static final MethodHandle MH_glDrawCommandsAddressNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawCommandsAddressNV;
    public static final MethodHandle MH_glDrawCommandsStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawCommandsStatesNV;
    public static final MethodHandle MH_glDrawCommandsStatesAddressNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawCommandsStatesAddressNV;
    public static final MethodHandle MH_glCreateCommandListsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateCommandListsNV;
    public static final MethodHandle MH_glDeleteCommandListsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteCommandListsNV;
    public static final MethodHandle MH_glIsCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsCommandListNV;
    public static final MethodHandle MH_glListDrawCommandsStatesClientNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glListDrawCommandsStatesClientNV;
    public static final MethodHandle MH_glCommandListSegmentsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCommandListSegmentsNV;
    public static final MethodHandle MH_glCompileCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCompileCommandListNV;
    public static final MethodHandle MH_glCallCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCallCommandListNV;

    public GLNVCommandList(overrungl.opengl.GLLoadFunc func) {
        PFN_glCreateStatesNV = func.invoke("glCreateStatesNV");
        PFN_glDeleteStatesNV = func.invoke("glDeleteStatesNV");
        PFN_glIsStateNV = func.invoke("glIsStateNV");
        PFN_glStateCaptureNV = func.invoke("glStateCaptureNV");
        PFN_glGetCommandHeaderNV = func.invoke("glGetCommandHeaderNV");
        PFN_glGetStageIndexNV = func.invoke("glGetStageIndexNV");
        PFN_glDrawCommandsNV = func.invoke("glDrawCommandsNV");
        PFN_glDrawCommandsAddressNV = func.invoke("glDrawCommandsAddressNV");
        PFN_glDrawCommandsStatesNV = func.invoke("glDrawCommandsStatesNV");
        PFN_glDrawCommandsStatesAddressNV = func.invoke("glDrawCommandsStatesAddressNV");
        PFN_glCreateCommandListsNV = func.invoke("glCreateCommandListsNV");
        PFN_glDeleteCommandListsNV = func.invoke("glDeleteCommandListsNV");
        PFN_glIsCommandListNV = func.invoke("glIsCommandListNV");
        PFN_glListDrawCommandsStatesClientNV = func.invoke("glListDrawCommandsStatesClientNV");
        PFN_glCommandListSegmentsNV = func.invoke("glCommandListSegmentsNV");
        PFN_glCompileCommandListNV = func.invoke("glCompileCommandListNV");
        PFN_glCallCommandListNV = func.invoke("glCallCommandListNV");
    }

    public void CreateStatesNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment states) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateStatesNV))
            MH_glCreateStatesNV.invokeExact(PFN_glCreateStatesNV, n, states);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateStatesNV", e); }
    }

    public void DeleteStatesNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment states) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteStatesNV))
            MH_glDeleteStatesNV.invokeExact(PFN_glDeleteStatesNV, n, states);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteStatesNV", e); }
    }

    public @CType("GLboolean") boolean IsStateNV(@CType("GLuint") int state) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsStateNV))
            return (boolean) MH_glIsStateNV.invokeExact(PFN_glIsStateNV, state);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsStateNV", e); }
    }

    public void StateCaptureNV(@CType("GLuint") int state, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glStateCaptureNV))
            MH_glStateCaptureNV.invokeExact(PFN_glStateCaptureNV, state, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glStateCaptureNV", e); }
    }

    public @CType("GLuint") int GetCommandHeaderNV(@CType("GLenum") int tokenID, @CType("GLuint") int size) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetCommandHeaderNV))
            return (int) MH_glGetCommandHeaderNV.invokeExact(PFN_glGetCommandHeaderNV, tokenID, size);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetCommandHeaderNV", e); }
    }

    public @CType("GLushort") short GetStageIndexNV(@CType("GLenum") int shadertype) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetStageIndexNV))
            return (short) MH_glGetStageIndexNV.invokeExact(PFN_glGetStageIndexNV, shadertype);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetStageIndexNV", e); }
    }

    public void DrawCommandsNV(@CType("GLenum") int primitiveMode, @CType("GLuint") int buffer, @CType("const GLintptr *") java.lang.foreign.MemorySegment indirects, @CType("const GLsizei *") java.lang.foreign.MemorySegment sizes, @CType("GLuint") int count) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawCommandsNV))
            MH_glDrawCommandsNV.invokeExact(PFN_glDrawCommandsNV, primitiveMode, buffer, indirects, sizes, count);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawCommandsNV", e); }
    }

    public void DrawCommandsAddressNV(@CType("GLenum") int primitiveMode, @CType("const GLuint64 *") java.lang.foreign.MemorySegment indirects, @CType("const GLsizei *") java.lang.foreign.MemorySegment sizes, @CType("GLuint") int count) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawCommandsAddressNV))
            MH_glDrawCommandsAddressNV.invokeExact(PFN_glDrawCommandsAddressNV, primitiveMode, indirects, sizes, count);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawCommandsAddressNV", e); }
    }

    public void DrawCommandsStatesNV(@CType("GLuint") int buffer, @CType("const GLintptr *") java.lang.foreign.MemorySegment indirects, @CType("const GLsizei *") java.lang.foreign.MemorySegment sizes, @CType("const GLuint *") java.lang.foreign.MemorySegment states, @CType("const GLuint *") java.lang.foreign.MemorySegment fbos, @CType("GLuint") int count) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawCommandsStatesNV))
            MH_glDrawCommandsStatesNV.invokeExact(PFN_glDrawCommandsStatesNV, buffer, indirects, sizes, states, fbos, count);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawCommandsStatesNV", e); }
    }

    public void DrawCommandsStatesAddressNV(@CType("const GLuint64 *") java.lang.foreign.MemorySegment indirects, @CType("const GLsizei *") java.lang.foreign.MemorySegment sizes, @CType("const GLuint *") java.lang.foreign.MemorySegment states, @CType("const GLuint *") java.lang.foreign.MemorySegment fbos, @CType("GLuint") int count) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawCommandsStatesAddressNV))
            MH_glDrawCommandsStatesAddressNV.invokeExact(PFN_glDrawCommandsStatesAddressNV, indirects, sizes, states, fbos, count);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawCommandsStatesAddressNV", e); }
    }

    public void CreateCommandListsNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment lists) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateCommandListsNV))
            MH_glCreateCommandListsNV.invokeExact(PFN_glCreateCommandListsNV, n, lists);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateCommandListsNV", e); }
    }

    public void DeleteCommandListsNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment lists) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteCommandListsNV))
            MH_glDeleteCommandListsNV.invokeExact(PFN_glDeleteCommandListsNV, n, lists);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteCommandListsNV", e); }
    }

    public @CType("GLboolean") boolean IsCommandListNV(@CType("GLuint") int list) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsCommandListNV))
            return (boolean) MH_glIsCommandListNV.invokeExact(PFN_glIsCommandListNV, list);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsCommandListNV", e); }
    }

    public void ListDrawCommandsStatesClientNV(@CType("GLuint") int list, @CType("GLuint") int segment, @CType("const void **") java.lang.foreign.MemorySegment indirects, @CType("const GLsizei *") java.lang.foreign.MemorySegment sizes, @CType("const GLuint *") java.lang.foreign.MemorySegment states, @CType("const GLuint *") java.lang.foreign.MemorySegment fbos, @CType("GLuint") int count) {
        try { if (!Unmarshal.isNullPointer(PFN_glListDrawCommandsStatesClientNV))
            MH_glListDrawCommandsStatesClientNV.invokeExact(PFN_glListDrawCommandsStatesClientNV, list, segment, indirects, sizes, states, fbos, count);
        }
        catch (Throwable e) { throw new RuntimeException("error in glListDrawCommandsStatesClientNV", e); }
    }

    public void CommandListSegmentsNV(@CType("GLuint") int list, @CType("GLuint") int segments) {
        try { if (!Unmarshal.isNullPointer(PFN_glCommandListSegmentsNV))
            MH_glCommandListSegmentsNV.invokeExact(PFN_glCommandListSegmentsNV, list, segments);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCommandListSegmentsNV", e); }
    }

    public void CompileCommandListNV(@CType("GLuint") int list) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompileCommandListNV))
            MH_glCompileCommandListNV.invokeExact(PFN_glCompileCommandListNV, list);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompileCommandListNV", e); }
    }

    public void CallCommandListNV(@CType("GLuint") int list) {
        try { if (!Unmarshal.isNullPointer(PFN_glCallCommandListNV))
            MH_glCallCommandListNV.invokeExact(PFN_glCallCommandListNV, list);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCallCommandListNV", e); }
    }

}
