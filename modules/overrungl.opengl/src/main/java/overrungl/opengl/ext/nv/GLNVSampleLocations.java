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

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_sample_locations}
 */
public interface GLNVSampleLocations {
    int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV = 0x933D;
    int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV = 0x933E;
    int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV = 0x933F;
    int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;
    int GL_SAMPLE_LOCATION_NV = 0x8E50;
    int GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;
    int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342;
    int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV = 0x9343;

    void glFramebufferSampleLocationsfvNV(int target, int start, int count, @NativeType("const GLfloat *") MemorySegment v);
    void glNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, @NativeType("const GLfloat *") MemorySegment v);
    void glResolveDepthValuesNV();
}
