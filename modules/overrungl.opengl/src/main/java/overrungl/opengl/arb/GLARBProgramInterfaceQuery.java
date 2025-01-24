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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetProgramInterfaceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocationIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetProgramInterfaceiv;
        public final MemorySegment PFN_glGetProgramResourceIndex;
        public final MemorySegment PFN_glGetProgramResourceName;
        public final MemorySegment PFN_glGetProgramResourceiv;
        public final MemorySegment PFN_glGetProgramResourceLocation;
        public final MemorySegment PFN_glGetProgramResourceLocationIndex;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetProgramInterfaceiv = func.invoke("glGetProgramInterfaceiv");
            PFN_glGetProgramResourceIndex = func.invoke("glGetProgramResourceIndex");
            PFN_glGetProgramResourceName = func.invoke("glGetProgramResourceName");
            PFN_glGetProgramResourceiv = func.invoke("glGetProgramResourceiv");
            PFN_glGetProgramResourceLocation = func.invoke("glGetProgramResourceLocation");
            PFN_glGetProgramResourceLocationIndex = func.invoke("glGetProgramResourceLocationIndex");
        }
    }

    public GLARBProgramInterfaceQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetProgramInterfaceiv(unsigned int program, unsigned int programInterface, unsigned int pname, GLint* params);
    /// ```
    public void GetProgramInterfaceiv(int program, int programInterface, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramInterfaceiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramInterfaceiv");
        try { Handles.MH_glGetProgramInterfaceiv.invokeExact(handles.PFN_glGetProgramInterfaceiv, program, programInterface, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramInterfaceiv", e); }
    }

    /// ```
    /// unsigned int glGetProgramResourceIndex(unsigned int program, unsigned int programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceIndex(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceIndex)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceIndex");
        try { return (int) Handles.MH_glGetProgramResourceIndex.invokeExact(handles.PFN_glGetProgramResourceIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceIndex", e); }
    }

    /// ```
    /// void glGetProgramResourceName(unsigned int program, unsigned int programInterface, unsigned int index, int bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetProgramResourceName(int program, int programInterface, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceName)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceName");
        try { Handles.MH_glGetProgramResourceName.invokeExact(handles.PFN_glGetProgramResourceName, program, programInterface, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceName", e); }
    }

    /// ```
    /// void glGetProgramResourceiv(unsigned int program, unsigned int programInterface, unsigned int index, int propCount, const GLenum* props, int count, GLsizei* length, GLint* params);
    /// ```
    public void GetProgramResourceiv(int program, int programInterface, int index, int propCount, MemorySegment props, int count, MemorySegment length, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceiv");
        try { Handles.MH_glGetProgramResourceiv.invokeExact(handles.PFN_glGetProgramResourceiv, program, programInterface, index, propCount, props, count, length, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceiv", e); }
    }

    /// ```
    /// int glGetProgramResourceLocation(unsigned int program, unsigned int programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocation(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocation)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceLocation");
        try { return (int) Handles.MH_glGetProgramResourceLocation.invokeExact(handles.PFN_glGetProgramResourceLocation, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocation", e); }
    }

    /// ```
    /// int glGetProgramResourceLocationIndex(unsigned int program, unsigned int programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocationIndex(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocationIndex)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceLocationIndex");
        try { return (int) Handles.MH_glGetProgramResourceLocationIndex.invokeExact(handles.PFN_glGetProgramResourceLocationIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocationIndex", e); }
    }

}
