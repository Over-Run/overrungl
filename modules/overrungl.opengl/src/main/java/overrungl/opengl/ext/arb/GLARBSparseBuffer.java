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

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_sparse_buffer}
 */
public interface GLARBSparseBuffer {
    int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;

    void glBufferPageCommitmentARB(int target, long offset, long size, boolean commit);
    void glNamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit);
    void glNamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit);
}
