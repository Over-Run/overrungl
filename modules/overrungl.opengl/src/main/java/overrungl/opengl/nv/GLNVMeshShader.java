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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVMeshShader {
    public static final int GL_MESH_SHADER_NV = 0x9559;
    public static final int GL_TASK_SHADER_NV = 0x955A;
    public static final int GL_MAX_MESH_UNIFORM_BLOCKS_NV = 0x8E60;
    public static final int GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV = 0x8E61;
    public static final int GL_MAX_MESH_IMAGE_UNIFORMS_NV = 0x8E62;
    public static final int GL_MAX_MESH_UNIFORM_COMPONENTS_NV = 0x8E63;
    public static final int GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV = 0x8E64;
    public static final int GL_MAX_MESH_ATOMIC_COUNTERS_NV = 0x8E65;
    public static final int GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV = 0x8E66;
    public static final int GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV = 0x8E67;
    public static final int GL_MAX_TASK_UNIFORM_BLOCKS_NV = 0x8E68;
    public static final int GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV = 0x8E69;
    public static final int GL_MAX_TASK_IMAGE_UNIFORMS_NV = 0x8E6A;
    public static final int GL_MAX_TASK_UNIFORM_COMPONENTS_NV = 0x8E6B;
    public static final int GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV = 0x8E6C;
    public static final int GL_MAX_TASK_ATOMIC_COUNTERS_NV = 0x8E6D;
    public static final int GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV = 0x8E6E;
    public static final int GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV = 0x8E6F;
    public static final int GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV = 0x95A2;
    public static final int GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV = 0x95A3;
    public static final int GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV = 0x9536;
    public static final int GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV = 0x9537;
    public static final int GL_MAX_MESH_OUTPUT_VERTICES_NV = 0x9538;
    public static final int GL_MAX_MESH_OUTPUT_PRIMITIVES_NV = 0x9539;
    public static final int GL_MAX_TASK_OUTPUT_COUNT_NV = 0x953A;
    public static final int GL_MAX_DRAW_MESH_TASKS_COUNT_NV = 0x953D;
    public static final int GL_MAX_MESH_VIEWS_NV = 0x9557;
    public static final int GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV = 0x92DF;
    public static final int GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV = 0x9543;
    public static final int GL_MAX_MESH_WORK_GROUP_SIZE_NV = 0x953B;
    public static final int GL_MAX_TASK_WORK_GROUP_SIZE_NV = 0x953C;
    public static final int GL_MESH_WORK_GROUP_SIZE_NV = 0x953E;
    public static final int GL_TASK_WORK_GROUP_SIZE_NV = 0x953F;
    public static final int GL_MESH_VERTICES_OUT_NV = 0x9579;
    public static final int GL_MESH_PRIMITIVES_OUT_NV = 0x957A;
    public static final int GL_MESH_OUTPUT_TYPE_NV = 0x957B;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 0x959C;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 0x959D;
    public static final int GL_REFERENCED_BY_MESH_SHADER_NV = 0x95A0;
    public static final int GL_REFERENCED_BY_TASK_SHADER_NV = 0x95A1;
    public static final int GL_MESH_SHADER_BIT_NV = 0x00000040;
    public static final int GL_TASK_SHADER_BIT_NV = 0x00000080;
    public static final int GL_MESH_SUBROUTINE_NV = 0x957C;
    public static final int GL_TASK_SUBROUTINE_NV = 0x957D;
    public static final int GL_MESH_SUBROUTINE_UNIFORM_NV = 0x957E;
    public static final int GL_TASK_SUBROUTINE_UNIFORM_NV = 0x957F;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 0x959E;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 0x959F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawMeshTasksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawMeshTasksIndirectNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMultiDrawMeshTasksIndirectNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawMeshTasksIndirectCountNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawMeshTasksNV;
        public final MemorySegment PFN_glDrawMeshTasksIndirectNV;
        public final MemorySegment PFN_glMultiDrawMeshTasksIndirectNV;
        public final MemorySegment PFN_glMultiDrawMeshTasksIndirectCountNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawMeshTasksNV = func.invoke("glDrawMeshTasksNV");
            PFN_glDrawMeshTasksIndirectNV = func.invoke("glDrawMeshTasksIndirectNV");
            PFN_glMultiDrawMeshTasksIndirectNV = func.invoke("glMultiDrawMeshTasksIndirectNV");
            PFN_glMultiDrawMeshTasksIndirectCountNV = func.invoke("glMultiDrawMeshTasksIndirectCountNV");
        }
    }

    public GLNVMeshShader(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawMeshTasksNV(unsigned int first, unsigned int count);
    /// ```
    public void DrawMeshTasksNV(int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshTasksNV)) throw new SymbolNotFoundError("Symbol not found: glDrawMeshTasksNV");
        try { Handles.MH_glDrawMeshTasksNV.invokeExact(handles.PFN_glDrawMeshTasksNV, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshTasksNV", e); }
    }

    /// ```
    /// void glDrawMeshTasksIndirectNV(signed long long indirect);
    /// ```
    public void DrawMeshTasksIndirectNV(long indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshTasksIndirectNV)) throw new SymbolNotFoundError("Symbol not found: glDrawMeshTasksIndirectNV");
        try { Handles.MH_glDrawMeshTasksIndirectNV.invokeExact(handles.PFN_glDrawMeshTasksIndirectNV, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshTasksIndirectNV", e); }
    }

    /// ```
    /// void glMultiDrawMeshTasksIndirectNV(signed long long indirect, int drawcount, int stride);
    /// ```
    public void MultiDrawMeshTasksIndirectNV(long indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawMeshTasksIndirectNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawMeshTasksIndirectNV");
        try { Handles.MH_glMultiDrawMeshTasksIndirectNV.invokeExact(handles.PFN_glMultiDrawMeshTasksIndirectNV, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawMeshTasksIndirectNV", e); }
    }

    /// ```
    /// void glMultiDrawMeshTasksIndirectCountNV(signed long long indirect, signed long long drawcount, int maxdrawcount, int stride);
    /// ```
    public void MultiDrawMeshTasksIndirectCountNV(long indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawMeshTasksIndirectCountNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawMeshTasksIndirectCountNV");
        try { Handles.MH_glMultiDrawMeshTasksIndirectCountNV.invokeExact(handles.PFN_glMultiDrawMeshTasksIndirectCountNV, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawMeshTasksIndirectCountNV", e); }
    }

}
