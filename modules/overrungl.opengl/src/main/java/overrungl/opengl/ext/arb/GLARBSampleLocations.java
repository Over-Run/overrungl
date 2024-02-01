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
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_sample_locations}
 */
public interface GLARBSampleLocations {
    int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 0x933D;
    int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 0x933E;
    int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 0x933F;
    int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;
    int GL_SAMPLE_LOCATION_ARB = 0x8E50;
    int GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB = 0x9341;
    int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342;
    int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 0x9343;

    default void glEvaluateDepthValuesARB() {
        throw new ContextException();
    }

    default void glFramebufferSampleLocationsfvARB(int target, int start, int count, @NativeType("const GLfloat *v") MemorySegment v) {
        throw new ContextException();
    }

    default void glNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, @NativeType("const GLfloat *v") MemorySegment v) {
        throw new ContextException();
    }

}
