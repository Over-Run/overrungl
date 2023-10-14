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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_occlusion_query_event}
  */
public final class GLAMDOcclusionQueryEvent {
    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;
    public static final int GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD = 0x00000001;
    public static final int GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD = 0x00000002;
    public static final int GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD = 0x00000004;
    public static final int GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x00000008;
    public static final int GL_QUERY_ALL_EVENT_BITS_AMD = 0xFFFFFFFF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_occlusion_query_event) return;
        ext.glQueryObjectParameteruiAMD = load.invoke("glQueryObjectParameteruiAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glQueryObjectParameteruiAMD(int target, int id, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glQueryObjectParameteruiAMD).invokeExact(target, id, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
