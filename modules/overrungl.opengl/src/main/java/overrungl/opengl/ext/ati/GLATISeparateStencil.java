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
package overrungl.opengl.ext.ati;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_separate_stencil}
 */
public interface GLATISeparateStencil extends overrun.marshal.DirectAccess {
    int GL_STENCIL_BACK_FUNC_ATI = 0x8800;
    int GL_STENCIL_BACK_FAIL_ATI = 0x8801;
    int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802;
    int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803;

    default void glStencilOpSeparateATI(int face, int sfail, int dpfail, int dppass) {
        throw new ContextException();
    }

    default void glStencilFuncSeparateATI(int frontfunc, int backfunc, int ref, int mask) {
        throw new ContextException();
    }

}
