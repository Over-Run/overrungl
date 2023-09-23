/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.ibm;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_IBM_static_data}
  */
public final class GLIBMStaticData {
    public static final int GL_ALL_STATIC_DATA_IBM = 103060;
    public static final int GL_STATIC_VERTEX_ARRAY_IBM = 103061;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_IBM_static_data) return;
        ext.glFlushStaticDataIBM = load.invoke("glFlushStaticDataIBM", ofVoid(JAVA_INT));
    }

    public static void glFlushStaticDataIBM(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushStaticDataIBM).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
