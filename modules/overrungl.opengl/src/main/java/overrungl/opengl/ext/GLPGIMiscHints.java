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
package overrungl.opengl.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_PGI_misc_hints}
 */
public interface GLPGIMiscHints extends overrun.marshal.DirectAccess {
    int GL_PREFER_DOUBLEBUFFER_HINT_PGI = 0x1A1F8;
    int GL_CONSERVE_MEMORY_HINT_PGI = 0x1A1FD;
    int GL_RECLAIM_MEMORY_HINT_PGI = 0x1A1FE;
    int GL_NATIVE_GRAPHICS_HANDLE_PGI = 0x1A202;
    int GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI = 0x1A203;
    int GL_NATIVE_GRAPHICS_END_HINT_PGI = 0x1A204;
    int GL_ALWAYS_FAST_HINT_PGI = 0x1A20C;
    int GL_ALWAYS_SOFT_HINT_PGI = 0x1A20D;
    int GL_ALLOW_DRAW_OBJ_HINT_PGI = 0x1A20E;
    int GL_ALLOW_DRAW_WIN_HINT_PGI = 0x1A20F;
    int GL_ALLOW_DRAW_FRG_HINT_PGI = 0x1A210;
    int GL_ALLOW_DRAW_MEM_HINT_PGI = 0x1A211;
    int GL_STRICT_DEPTHFUNC_HINT_PGI = 0x1A216;
    int GL_STRICT_LIGHTING_HINT_PGI = 0x1A217;
    int GL_STRICT_SCISSOR_HINT_PGI = 0x1A218;
    int GL_FULL_STIPPLE_HINT_PGI = 0x1A219;
    int GL_CLIP_NEAR_HINT_PGI = 0x1A220;
    int GL_CLIP_FAR_HINT_PGI = 0x1A221;
    int GL_WIDE_LINE_HINT_PGI = 0x1A222;
    int GL_BACK_NORMALS_HINT_PGI = 0x1A223;

    default void glHintPGI(int target, int mode) {
        throw new ContextException();
    }

}
