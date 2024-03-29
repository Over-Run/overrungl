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
package overrungl.opengl.ext.amd;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_interleaved_elements}
 */
public interface GLAMDInterleavedElements extends overrun.marshal.DirectAccess {
    int GL_VERTEX_ELEMENT_SWIZZLE_AMD = 0x91A4;
    int GL_VERTEX_ID_SWIZZLE_AMD = 0x91A5;

    default void glVertexAttribParameteriAMD(int index, int pname, int param) {
        throw new ContextException();
    }

}
