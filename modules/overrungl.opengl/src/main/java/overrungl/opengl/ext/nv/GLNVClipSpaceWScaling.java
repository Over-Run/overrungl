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
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_clip_space_w_scaling}
 */
public interface GLNVClipSpaceWScaling extends overrun.marshal.DirectAccess {
    int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;

    default void glViewportPositionWScaleNV(int index, float xcoeff, float ycoeff) {
        throw new ContextException();
    }

}
