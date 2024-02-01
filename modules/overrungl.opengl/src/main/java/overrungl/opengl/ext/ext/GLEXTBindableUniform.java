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
 * {@code GL_EXT_bindable_uniform}
 */
public interface GLEXTBindableUniform {
    int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 0x8DE2;
    int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3;
    int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4;
    int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 0x8DED;
    int GL_UNIFORM_BUFFER_EXT = 0x8DEE;
    int GL_UNIFORM_BUFFER_BINDING_EXT = 0x8DEF;

    void glUniformBufferEXT(int program, int location, int buffer);
    int glGetUniformBufferSizeEXT(int program, int location);
    long glGetUniformOffsetEXT(int program, int location);
}
