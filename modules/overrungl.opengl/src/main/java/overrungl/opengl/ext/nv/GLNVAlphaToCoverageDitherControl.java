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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_alpha_to_coverage_dither_control}
 */
public interface GLNVAlphaToCoverageDitherControl {
    int GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D;
    int GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV = 0x934E;
    int GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;
    int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;

    default void glAlphaToCoverageDitherControlNV(int mode) {
        throw new ContextException();
    }

}
