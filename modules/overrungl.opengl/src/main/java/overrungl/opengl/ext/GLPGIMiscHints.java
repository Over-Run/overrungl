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
package overrungl.opengl.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_PGI_misc_hints}
  */
public final class GLPGIMiscHints {
    public static final int GL_PREFER_DOUBLEBUFFER_HINT_PGI = 0x1A1F8;
    public static final int GL_CONSERVE_MEMORY_HINT_PGI = 0x1A1FD;
    public static final int GL_RECLAIM_MEMORY_HINT_PGI = 0x1A1FE;
    public static final int GL_NATIVE_GRAPHICS_HANDLE_PGI = 0x1A202;
    public static final int GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI = 0x1A203;
    public static final int GL_NATIVE_GRAPHICS_END_HINT_PGI = 0x1A204;
    public static final int GL_ALWAYS_FAST_HINT_PGI = 0x1A20C;
    public static final int GL_ALWAYS_SOFT_HINT_PGI = 0x1A20D;
    public static final int GL_ALLOW_DRAW_OBJ_HINT_PGI = 0x1A20E;
    public static final int GL_ALLOW_DRAW_WIN_HINT_PGI = 0x1A20F;
    public static final int GL_ALLOW_DRAW_FRG_HINT_PGI = 0x1A210;
    public static final int GL_ALLOW_DRAW_MEM_HINT_PGI = 0x1A211;
    public static final int GL_STRICT_DEPTHFUNC_HINT_PGI = 0x1A216;
    public static final int GL_STRICT_LIGHTING_HINT_PGI = 0x1A217;
    public static final int GL_STRICT_SCISSOR_HINT_PGI = 0x1A218;
    public static final int GL_FULL_STIPPLE_HINT_PGI = 0x1A219;
    public static final int GL_CLIP_NEAR_HINT_PGI = 0x1A220;
    public static final int GL_CLIP_FAR_HINT_PGI = 0x1A221;
    public static final int GL_WIDE_LINE_HINT_PGI = 0x1A222;
    public static final int GL_BACK_NORMALS_HINT_PGI = 0x1A223;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_PGI_misc_hints) return;
        ext.glHintPGI = load.invoke("glHintPGI", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glHintPGI(int target, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glHintPGI).invokeExact(target, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
