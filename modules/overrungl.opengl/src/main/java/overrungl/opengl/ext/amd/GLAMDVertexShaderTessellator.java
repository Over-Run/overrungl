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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_vertex_shader_tessellator}
 */
public interface GLAMDVertexShaderTessellator {
    int GL_SAMPLER_BUFFER_AMD = 0x9001;
    int GL_INT_SAMPLER_BUFFER_AMD = 0x9002;
    int GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;
    int GL_TESSELLATION_MODE_AMD = 0x9004;
    int GL_TESSELLATION_FACTOR_AMD = 0x9005;
    int GL_DISCRETE_AMD = 0x9006;
    int GL_CONTINUOUS_AMD = 0x9007;

    void glTessellationFactorAMD(float factor);
    void glTessellationModeAMD(int mode);
}
