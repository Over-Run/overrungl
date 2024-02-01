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
 * {@code GL_EXT_raster_multisample}
 */
public interface GLEXTRasterMultisample {
    int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    int GL_RASTER_SAMPLES_EXT = 0x9328;
    int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;

    void glRasterSamplesEXT(int samples, boolean fixedsamplelocations);
}
