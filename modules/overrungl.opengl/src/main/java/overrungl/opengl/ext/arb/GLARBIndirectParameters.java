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
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_indirect_parameters}
 */
public interface GLARBIndirectParameters {
    int GL_PARAMETER_BUFFER_ARB = 0x80EE;
    int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;

    default void glMultiDrawArraysIndirectCountARB(int mode, @NativeType("const void *") MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        throw new ContextException();
    }

    default void glMultiDrawElementsIndirectCountARB(int mode, int type, @NativeType("const void *") MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        throw new ContextException();
    }

}
