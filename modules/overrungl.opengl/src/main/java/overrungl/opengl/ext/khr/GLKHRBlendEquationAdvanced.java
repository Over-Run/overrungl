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
package overrungl.opengl.ext.khr;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_KHR_blend_equation_advanced}
 */
public interface GLKHRBlendEquationAdvanced {
    int GL_MULTIPLY_KHR = 0x9294;
    int GL_SCREEN_KHR = 0x9295;
    int GL_OVERLAY_KHR = 0x9296;
    int GL_DARKEN_KHR = 0x9297;
    int GL_LIGHTEN_KHR = 0x9298;
    int GL_COLORDODGE_KHR = 0x9299;
    int GL_COLORBURN_KHR = 0x929A;
    int GL_HARDLIGHT_KHR = 0x929B;
    int GL_SOFTLIGHT_KHR = 0x929C;
    int GL_DIFFERENCE_KHR = 0x929E;
    int GL_EXCLUSION_KHR = 0x92A0;
    int GL_HSL_HUE_KHR = 0x92AD;
    int GL_HSL_SATURATION_KHR = 0x92AE;
    int GL_HSL_COLOR_KHR = 0x92AF;
    int GL_HSL_LUMINOSITY_KHR = 0x92B0;

    default void glBlendBarrierKHR() {
        throw new ContextException();
    }

}
