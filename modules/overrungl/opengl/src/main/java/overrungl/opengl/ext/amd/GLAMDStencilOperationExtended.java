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

package overrungl.opengl.ext.amd;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

/**
 * {@code GL_AMD_stencil_operation_extended}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDStencilOperationExtended {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_stencil_operation_extended) return;
        ext.glStencilOpValueAMD = load.invoke("glStencilOpValueAMD", FunctionDescriptors.IIV);
    }

    public static void glStencilOpValueAMD(int face, int value) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glStencilOpValueAMD).invokeExact(face, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
