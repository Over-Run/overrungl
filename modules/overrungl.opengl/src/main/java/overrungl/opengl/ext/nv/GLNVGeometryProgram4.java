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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_geometry_program4}
 */
public interface GLNVGeometryProgram4 extends overrun.marshal.DirectAccess {
    int GL_GEOMETRY_PROGRAM_NV = 0x8C26;
    int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 0x8C27;
    int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 0x8C28;

    default void glProgramVertexLimitNV(int target, int limit) {
        throw new ContextException();
    }

    default void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
        throw new ContextException();
    }

    default void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
        throw new ContextException();
    }

}
