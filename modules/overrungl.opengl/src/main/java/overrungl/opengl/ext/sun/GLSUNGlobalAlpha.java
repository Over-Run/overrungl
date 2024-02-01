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
package overrungl.opengl.ext.sun;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_SUN_global_alpha}
 */
public interface GLSUNGlobalAlpha {
    int GL_GLOBAL_ALPHA_SUN = 0x81D9;
    int GL_GLOBAL_ALPHA_FACTOR_SUN = 0x81DA;

    void glGlobalAlphaFactorbSUN(byte factor);
    void glGlobalAlphaFactorsSUN(short factor);
    void glGlobalAlphaFactoriSUN(int factor);
    void glGlobalAlphaFactorfSUN(float factor);
    void glGlobalAlphaFactordSUN(double factor);
    void glGlobalAlphaFactorubSUN(byte factor);
    void glGlobalAlphaFactorusSUN(short factor);
    void glGlobalAlphaFactoruiSUN(int factor);
}
