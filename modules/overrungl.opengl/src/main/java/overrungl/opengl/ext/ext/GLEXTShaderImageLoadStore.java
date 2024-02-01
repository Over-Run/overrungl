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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_shader_image_load_store}
 */
public interface GLEXTShaderImageLoadStore {
    int GL_MAX_IMAGE_UNITS_EXT = 0x8F38;
    int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT = 0x8F39;
    int GL_IMAGE_BINDING_NAME_EXT = 0x8F3A;
    int GL_IMAGE_BINDING_LEVEL_EXT = 0x8F3B;
    int GL_IMAGE_BINDING_LAYERED_EXT = 0x8F3C;
    int GL_IMAGE_BINDING_LAYER_EXT = 0x8F3D;
    int GL_IMAGE_BINDING_ACCESS_EXT = 0x8F3E;
    int GL_IMAGE_1D_EXT = 0x904C;
    int GL_IMAGE_2D_EXT = 0x904D;
    int GL_IMAGE_3D_EXT = 0x904E;
    int GL_IMAGE_2D_RECT_EXT = 0x904F;
    int GL_IMAGE_CUBE_EXT = 0x9050;
    int GL_IMAGE_BUFFER_EXT = 0x9051;
    int GL_IMAGE_1D_ARRAY_EXT = 0x9052;
    int GL_IMAGE_2D_ARRAY_EXT = 0x9053;
    int GL_IMAGE_CUBE_MAP_ARRAY_EXT = 0x9054;
    int GL_IMAGE_2D_MULTISAMPLE_EXT = 0x9055;
    int GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9056;
    int GL_INT_IMAGE_1D_EXT = 0x9057;
    int GL_INT_IMAGE_2D_EXT = 0x9058;
    int GL_INT_IMAGE_3D_EXT = 0x9059;
    int GL_INT_IMAGE_2D_RECT_EXT = 0x905A;
    int GL_INT_IMAGE_CUBE_EXT = 0x905B;
    int GL_INT_IMAGE_BUFFER_EXT = 0x905C;
    int GL_INT_IMAGE_1D_ARRAY_EXT = 0x905D;
    int GL_INT_IMAGE_2D_ARRAY_EXT = 0x905E;
    int GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x905F;
    int GL_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x9060;
    int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x9061;
    int GL_UNSIGNED_INT_IMAGE_1D_EXT = 0x9062;
    int GL_UNSIGNED_INT_IMAGE_2D_EXT = 0x9063;
    int GL_UNSIGNED_INT_IMAGE_3D_EXT = 0x9064;
    int GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT = 0x9065;
    int GL_UNSIGNED_INT_IMAGE_CUBE_EXT = 0x9066;
    int GL_UNSIGNED_INT_IMAGE_BUFFER_EXT = 0x9067;
    int GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT = 0x9068;
    int GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT = 0x9069;
    int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT = 0x906A;
    int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT = 0x906B;
    int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT = 0x906C;
    int GL_MAX_IMAGE_SAMPLES_EXT = 0x906D;
    int GL_IMAGE_BINDING_FORMAT_EXT = 0x906E;
    int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT = 0x00000001;
    int GL_ELEMENT_ARRAY_BARRIER_BIT_EXT = 0x00000002;
    int GL_UNIFORM_BARRIER_BIT_EXT = 0x00000004;
    int GL_TEXTURE_FETCH_BARRIER_BIT_EXT = 0x00000008;
    int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT = 0x00000020;
    int GL_COMMAND_BARRIER_BIT_EXT = 0x00000040;
    int GL_PIXEL_BUFFER_BARRIER_BIT_EXT = 0x00000080;
    int GL_TEXTURE_UPDATE_BARRIER_BIT_EXT = 0x00000100;
    int GL_BUFFER_UPDATE_BARRIER_BIT_EXT = 0x00000200;
    int GL_FRAMEBUFFER_BARRIER_BIT_EXT = 0x00000400;
    int GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT = 0x00000800;
    int GL_ATOMIC_COUNTER_BARRIER_BIT_EXT = 0x00001000;
    int GL_ALL_BARRIER_BITS_EXT = 0xFFFFFFFF;

    void glBindImageTextureEXT(int index, int texture, int level, boolean layered, int layer, int access, int format);
    void glMemoryBarrierEXT(int barriers);
}
