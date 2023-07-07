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

package org.overrun.gl.opengl.ext;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.FunctionDescriptors;

/**
 * {@code GL_GREMEDY_frame_terminator}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLGREMEDYFrameTerminator {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_GREMEDY_frame_terminator) return;
        ext.glFrameTerminatorGREMEDY = load.invoke("glFrameTerminatorGREMEDY", FunctionDescriptors.V);
    }

    public static void glFrameTerminatorGREMEDY() {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFrameTerminatorGREMEDY).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
