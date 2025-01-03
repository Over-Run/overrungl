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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBProgramInterfaceQuery {
    public static final int GL_UNIFORM = 0x92E1;
    public static final int GL_UNIFORM_BLOCK = 0x92E2;
    public static final int GL_PROGRAM_INPUT = 0x92E3;
    public static final int GL_PROGRAM_OUTPUT = 0x92E4;
    public static final int GL_BUFFER_VARIABLE = 0x92E5;
    public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
    public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
    public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
    public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    public static final int GL_ACTIVE_RESOURCES = 0x92F5;
    public static final int GL_MAX_NAME_LENGTH = 0x92F6;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    public static final int GL_NAME_LENGTH = 0x92F9;
    public static final int GL_TYPE = 0x92FA;
    public static final int GL_ARRAY_SIZE = 0x92FB;
    public static final int GL_OFFSET = 0x92FC;
    public static final int GL_BLOCK_INDEX = 0x92FD;
    public static final int GL_ARRAY_STRIDE = 0x92FE;
    public static final int GL_MATRIX_STRIDE = 0x92FF;
    public static final int GL_IS_ROW_MAJOR = 0x9300;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    public static final int GL_BUFFER_BINDING = 0x9302;
    public static final int GL_BUFFER_DATA_SIZE = 0x9303;
    public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
    public static final int GL_ACTIVE_VARIABLES = 0x9305;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    public static final int GL_LOCATION = 0x930E;
    public static final int GL_LOCATION_INDEX = 0x930F;
    public static final int GL_IS_PER_PATCH = 0x92E7;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final MethodHandle MH_glGetProgramInterfaceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramInterfaceiv;
    public static final MethodHandle MH_glGetProgramResourceIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramResourceIndex;
    public static final MethodHandle MH_glGetProgramResourceName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramResourceName;
    public static final MethodHandle MH_glGetProgramResourceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramResourceiv;
    public static final MethodHandle MH_glGetProgramResourceLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramResourceLocation;
    public static final MethodHandle MH_glGetProgramResourceLocationIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramResourceLocationIndex;

    public GLARBProgramInterfaceQuery(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetProgramInterfaceiv = func.invoke("glGetProgramInterfaceiv");
        PFN_glGetProgramResourceIndex = func.invoke("glGetProgramResourceIndex");
        PFN_glGetProgramResourceName = func.invoke("glGetProgramResourceName");
        PFN_glGetProgramResourceiv = func.invoke("glGetProgramResourceiv");
        PFN_glGetProgramResourceLocation = func.invoke("glGetProgramResourceLocation");
        PFN_glGetProgramResourceLocationIndex = func.invoke("glGetProgramResourceLocationIndex");
    }

    public void GetProgramInterfaceiv(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramInterfaceiv))
            MH_glGetProgramInterfaceiv.invokeExact(PFN_glGetProgramInterfaceiv, program, programInterface, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramInterfaceiv", e); }
    }

    public @CType("GLuint") int GetProgramResourceIndex(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramResourceIndex))
            return (int) MH_glGetProgramResourceIndex.invokeExact(PFN_glGetProgramResourceIndex, program, programInterface, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramResourceIndex", e); }
    }

    public void GetProgramResourceName(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramResourceName))
            MH_glGetProgramResourceName.invokeExact(PFN_glGetProgramResourceName, program, programInterface, index, bufSize, length, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramResourceName", e); }
    }

    public void GetProgramResourceiv(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("GLuint") int index, @CType("GLsizei") int propCount, @CType("const GLenum *") java.lang.foreign.MemorySegment props, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramResourceiv))
            MH_glGetProgramResourceiv.invokeExact(PFN_glGetProgramResourceiv, program, programInterface, index, propCount, props, count, length, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramResourceiv", e); }
    }

    public @CType("GLint") int GetProgramResourceLocation(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramResourceLocation))
            return (int) MH_glGetProgramResourceLocation.invokeExact(PFN_glGetProgramResourceLocation, program, programInterface, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramResourceLocation", e); }
    }

    public @CType("GLint") int GetProgramResourceLocationIndex(@CType("GLuint") int program, @CType("GLenum") int programInterface, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramResourceLocationIndex))
            return (int) MH_glGetProgramResourceLocationIndex.invokeExact(PFN_glGetProgramResourceLocationIndex, program, programInterface, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramResourceLocationIndex", e); }
    }

}
