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
 * {@code GL_SGIX_framezoom}
 */
public interface GLSGIXFramezoom {
    int GL_FRAMEZOOM_SGIX = 0x818B;
    int GL_FRAMEZOOM_FACTOR_SGIX = 0x818C;
    int GL_MAX_FRAMEZOOM_FACTOR_SGIX = 0x818D;

    void glFrameZoomSGIX(int factor);
}
