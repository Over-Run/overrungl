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
 * {@code GL_NV_conservative_raster_dilate}
 */
public interface GLNVConservativeRasterDilate {
    int GL_CONSERVATIVE_RASTER_DILATE_NV = 0x9379;
    int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 0x937A;
    int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;

    void glConservativeRasterParameterfNV(int pname, float value);
}
