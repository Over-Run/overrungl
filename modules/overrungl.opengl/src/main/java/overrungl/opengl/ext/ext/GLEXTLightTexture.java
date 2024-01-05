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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_light_texture}
 */
public final class GLEXTLightTexture {
    public static final int GL_FRAGMENT_MATERIAL_EXT = 0x8349;
    public static final int GL_FRAGMENT_NORMAL_EXT = 0x834A;
    public static final int GL_FRAGMENT_COLOR_EXT = 0x834C;
    public static final int GL_ATTENUATION_EXT = 0x834D;
    public static final int GL_SHADOW_ATTENUATION_EXT = 0x834E;
    public static final int GL_TEXTURE_APPLICATION_MODE_EXT = 0x834F;
    public static final int GL_TEXTURE_LIGHT_EXT = 0x8350;
    public static final int GL_TEXTURE_MATERIAL_FACE_EXT = 0x8351;
    public static final int GL_TEXTURE_MATERIAL_PARAMETER_EXT = 0x8352;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_light_texture) return;
        ext.glApplyTextureEXT = load.invoke("glApplyTextureEXT", ofVoid(JAVA_INT));
        ext.glTextureLightEXT = load.invoke("glTextureLightEXT", ofVoid(JAVA_INT));
        ext.glTextureMaterialEXT = load.invoke("glTextureMaterialEXT", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glApplyTextureEXT(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glApplyTextureEXT).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureLightEXT(int pname) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureLightEXT).invokeExact(pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureMaterialEXT(int face, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureMaterialEXT).invokeExact(face, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
