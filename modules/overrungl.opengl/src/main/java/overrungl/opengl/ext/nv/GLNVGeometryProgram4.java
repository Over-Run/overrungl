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

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_geometry_program4}
 */
public interface GLNVGeometryProgram4 {
    int GL_GEOMETRY_PROGRAM_NV = 0x8C26;
    int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = 0x8C27;
    int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = 0x8C28;

    void glProgramVertexLimitNV(int target, int limit);
    void glFramebufferTextureEXT(int target, int attachment, int texture, int level);
    void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face);
}
