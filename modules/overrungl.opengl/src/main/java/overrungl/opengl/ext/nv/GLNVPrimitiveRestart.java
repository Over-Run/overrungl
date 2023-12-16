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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_primitive_restart}
 */
public final class GLNVPrimitiveRestart {
    public static final int GL_PRIMITIVE_RESTART_NV = 0x8558;
    public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 0x8559;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_primitive_restart) return;
        ext.glPrimitiveRestartNV = load.invoke("glPrimitiveRestartNV", ofVoid());
        ext.glPrimitiveRestartIndexNV = load.invoke("glPrimitiveRestartIndexNV", ofVoid(JAVA_INT));
    }

    public static void glPrimitiveRestartNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPrimitiveRestartNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPrimitiveRestartIndexNV(int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPrimitiveRestartIndexNV).invokeExact(index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}