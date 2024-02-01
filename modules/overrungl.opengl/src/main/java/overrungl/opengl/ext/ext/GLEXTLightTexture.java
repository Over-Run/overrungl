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
 * {@code GL_EXT_light_texture}
 */
public interface GLEXTLightTexture {
    int GL_FRAGMENT_MATERIAL_EXT = 0x8349;
    int GL_FRAGMENT_NORMAL_EXT = 0x834A;
    int GL_FRAGMENT_COLOR_EXT = 0x834C;
    int GL_ATTENUATION_EXT = 0x834D;
    int GL_SHADOW_ATTENUATION_EXT = 0x834E;
    int GL_TEXTURE_APPLICATION_MODE_EXT = 0x834F;
    int GL_TEXTURE_LIGHT_EXT = 0x8350;
    int GL_TEXTURE_MATERIAL_FACE_EXT = 0x8351;
    int GL_TEXTURE_MATERIAL_PARAMETER_EXT = 0x8352;

    void glApplyTextureEXT(int mode);
    void glTextureLightEXT(int pname);
    void glTextureMaterialEXT(int face, int mode);
}
