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
 * {@code GL_NV_conditional_render}
 */
public interface GLNVConditionalRender {
    int GL_QUERY_WAIT_NV = 0x8E13;
    int GL_QUERY_NO_WAIT_NV = 0x8E14;
    int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;

    void glBeginConditionalRenderNV(int id, int mode);
    void glEndConditionalRenderNV();
}
