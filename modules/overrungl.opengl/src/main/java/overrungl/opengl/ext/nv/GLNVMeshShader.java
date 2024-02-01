/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_mesh_shader}
 */
public interface GLNVMeshShader {
    int GL_MESH_SHADER_NV = 0x9559;
    int GL_TASK_SHADER_NV = 0x955A;
    int GL_MAX_MESH_UNIFORM_BLOCKS_NV = 0x8E60;
    int GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV = 0x8E61;
    int GL_MAX_MESH_IMAGE_UNIFORMS_NV = 0x8E62;
    int GL_MAX_MESH_UNIFORM_COMPONENTS_NV = 0x8E63;
    int GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV = 0x8E64;
    int GL_MAX_MESH_ATOMIC_COUNTERS_NV = 0x8E65;
    int GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV = 0x8E66;
    int GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV = 0x8E67;
    int GL_MAX_TASK_UNIFORM_BLOCKS_NV = 0x8E68;
    int GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV = 0x8E69;
    int GL_MAX_TASK_IMAGE_UNIFORMS_NV = 0x8E6A;
    int GL_MAX_TASK_UNIFORM_COMPONENTS_NV = 0x8E6B;
    int GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV = 0x8E6C;
    int GL_MAX_TASK_ATOMIC_COUNTERS_NV = 0x8E6D;
    int GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV = 0x8E6E;
    int GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV = 0x8E6F;
    int GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV = 0x95A2;
    int GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV = 0x95A3;
    int GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV = 0x9536;
    int GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV = 0x9537;
    int GL_MAX_MESH_OUTPUT_VERTICES_NV = 0x9538;
    int GL_MAX_MESH_OUTPUT_PRIMITIVES_NV = 0x9539;
    int GL_MAX_TASK_OUTPUT_COUNT_NV = 0x953A;
    int GL_MAX_DRAW_MESH_TASKS_COUNT_NV = 0x953D;
    int GL_MAX_MESH_VIEWS_NV = 0x9557;
    int GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV = 0x92DF;
    int GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV = 0x9543;
    int GL_MAX_MESH_WORK_GROUP_SIZE_NV = 0x953B;
    int GL_MAX_TASK_WORK_GROUP_SIZE_NV = 0x953C;
    int GL_MESH_WORK_GROUP_SIZE_NV = 0x953E;
    int GL_TASK_WORK_GROUP_SIZE_NV = 0x953F;
    int GL_MESH_VERTICES_OUT_NV = 0x9579;
    int GL_MESH_PRIMITIVES_OUT_NV = 0x957A;
    int GL_MESH_OUTPUT_TYPE_NV = 0x957B;
    int GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 0x959C;
    int GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 0x959D;
    int GL_REFERENCED_BY_MESH_SHADER_NV = 0x95A0;
    int GL_REFERENCED_BY_TASK_SHADER_NV = 0x95A1;
    int GL_MESH_SHADER_BIT_NV = 0x00000040;
    int GL_TASK_SHADER_BIT_NV = 0x00000080;
    int GL_MESH_SUBROUTINE_NV = 0x957C;
    int GL_TASK_SUBROUTINE_NV = 0x957D;
    int GL_MESH_SUBROUTINE_UNIFORM_NV = 0x957E;
    int GL_TASK_SUBROUTINE_UNIFORM_NV = 0x957F;
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 0x959E;
    int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 0x959F;

    default void glDrawMeshTasksNV(int first, int count) {
        throw new ContextException();
    }

    default void glDrawMeshTasksIndirectNV(long indirect) {
        throw new ContextException();
    }

    default void glMultiDrawMeshTasksIndirectNV(long indirect, int drawcount, int stride) {
        throw new ContextException();
    }

    default void glMultiDrawMeshTasksIndirectCountNV(long indirect, long drawcount, int maxdrawcount, int stride) {
        throw new ContextException();
    }

}
