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

import java.lang.foreign.MemorySegment;

/**
 * {@code GL_GREMEDY_string_marker}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLGREMEDYStringMarker {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_GREMEDY_string_marker) return;
        ext.glStringMarkerGREMEDY = load.invoke("glStringMarkerGREMEDY", FunctionDescriptors.IPV);
    }

    public static void glStringMarkerGREMEDY(int len, MemorySegment string) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glStringMarkerGREMEDY).invokeExact(len, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
