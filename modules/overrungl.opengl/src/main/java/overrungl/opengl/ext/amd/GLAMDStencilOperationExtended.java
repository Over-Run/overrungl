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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_stencil_operation_extended}
 */
public interface GLAMDStencilOperationExtended {
    int GL_SET_AMD = 0x874A;
    int GL_REPLACE_VALUE_AMD = 0x874B;
    int GL_STENCIL_OP_VALUE_AMD = 0x874C;
    int GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;

    void glStencilOpValueAMD(int face, int value);
}
