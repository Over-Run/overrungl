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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_provoking_vertex}
 */
public interface GLEXTProvokingVertex extends overrun.marshal.DirectAccess {
    int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;
    int GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D;
    int GL_LAST_VERTEX_CONVENTION_EXT = 0x8E4E;
    int GL_PROVOKING_VERTEX_EXT = 0x8E4F;

    default void glProvokingVertexEXT(int mode) {
        throw new ContextException();
    }

}
