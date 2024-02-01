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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_draw_buffers_blend}
 */
public interface GLAMDDrawBuffersBlend {

    default void glBlendFuncIndexedAMD(int buf, int src, int dst) {
        throw new ContextException();
    }

    default void glBlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        throw new ContextException();
    }

    default void glBlendEquationIndexedAMD(int buf, int mode) {
        throw new ContextException();
    }

    default void glBlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
        throw new ContextException();
    }

}
