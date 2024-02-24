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
package overrungl.opengl.ext.sun;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SUN_mesh_array}
 */
public interface GLSUNMeshArray extends overrun.marshal.DirectAccess {
    int GL_QUAD_MESH_SUN = 0x8614;
    int GL_TRIANGLE_MESH_SUN = 0x8615;

    default void glDrawMeshArraysSUN(int mode, int first, int count, int width) {
        throw new ContextException();
    }

}
