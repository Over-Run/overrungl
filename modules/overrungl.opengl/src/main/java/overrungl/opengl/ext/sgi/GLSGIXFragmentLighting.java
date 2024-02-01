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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIX_fragment_lighting}
 */
public interface GLSGIXFragmentLighting {
    int GL_FRAGMENT_LIGHTING_SGIX = 0x8400;
    int GL_FRAGMENT_COLOR_MATERIAL_SGIX = 0x8401;
    int GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX = 0x8402;
    int GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX = 0x8403;
    int GL_MAX_FRAGMENT_LIGHTS_SGIX = 0x8404;
    int GL_MAX_ACTIVE_LIGHTS_SGIX = 0x8405;
    int GL_CURRENT_RASTER_NORMAL_SGIX = 0x8406;
    int GL_LIGHT_ENV_MODE_SGIX = 0x8407;
    int GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX = 0x8408;
    int GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX = 0x8409;
    int GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX = 0x840A;
    int GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX = 0x840B;
    int GL_FRAGMENT_LIGHT0_SGIX = 0x840C;
    int GL_FRAGMENT_LIGHT1_SGIX = 0x840D;
    int GL_FRAGMENT_LIGHT2_SGIX = 0x840E;
    int GL_FRAGMENT_LIGHT3_SGIX = 0x840F;
    int GL_FRAGMENT_LIGHT4_SGIX = 0x8410;
    int GL_FRAGMENT_LIGHT5_SGIX = 0x8411;
    int GL_FRAGMENT_LIGHT6_SGIX = 0x8412;
    int GL_FRAGMENT_LIGHT7_SGIX = 0x8413;

    void glFragmentColorMaterialSGIX(int face, int mode);
    void glFragmentLightfSGIX(int light, int pname, float param);
    void glFragmentLightfvSGIX(int light, int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glFragmentLightiSGIX(int light, int pname, int param);
    void glFragmentLightivSGIX(int light, int pname, @NativeType("const GLint *") MemorySegment params);
    void glFragmentLightModelfSGIX(int pname, float param);
    void glFragmentLightModelfvSGIX(int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glFragmentLightModeliSGIX(int pname, int param);
    void glFragmentLightModelivSGIX(int pname, @NativeType("const GLint *") MemorySegment params);
    void glFragmentMaterialfSGIX(int face, int pname, float param);
    void glFragmentMaterialfvSGIX(int face, int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glFragmentMaterialiSGIX(int face, int pname, int param);
    void glFragmentMaterialivSGIX(int face, int pname, @NativeType("const GLint *") MemorySegment params);
    void glGetFragmentLightfvSGIX(int light, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetFragmentLightivSGIX(int light, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetFragmentMaterialfvSGIX(int face, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetFragmentMaterialivSGIX(int face, int pname, @NativeType("GLint *") MemorySegment params);
    void glLightEnviSGIX(int pname, int param);
}
