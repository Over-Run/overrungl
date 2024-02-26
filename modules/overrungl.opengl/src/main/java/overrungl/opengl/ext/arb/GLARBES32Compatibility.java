/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
 * {@code GL_ARB_ES3_2_compatibility}
 */
public interface GLARBES32Compatibility extends overrun.marshal.DirectAccess {
    int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;
    int GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 0x9381;
    int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;

    default void glPrimitiveBoundingBoxARB(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
        throw new ContextException();
    }

}
