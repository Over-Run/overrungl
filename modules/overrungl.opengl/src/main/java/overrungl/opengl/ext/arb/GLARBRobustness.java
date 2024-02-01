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
 * {@code GL_ARB_robustness}
 */
public interface GLARBRobustness {
    int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;

    int glGetGraphicsResetStatusARB();
    void glGetnCompressedTexImageARB(int target, int lod, int bufSize, @NativeType("void*") MemorySegment img);
    void glGetnTexImageARB(int target, int level, int format, int type, int bufSize, @NativeType("void*") MemorySegment img);
    void glGetnUniformdvARB(int program, int location, int bufSize, @NativeType("GLdouble*") MemorySegment params);
    void glGetnUniformfvARB(int program, int location, int bufSize, @NativeType("GLfloat*") MemorySegment params);
    void glGetnUniformivARB(int program, int location, int bufSize, @NativeType("GLint*") MemorySegment params);
    void glGetnUniformuivARB(int program, int location, int bufSize, @NativeType("GLuint*") MemorySegment params);
    void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, @NativeType("void*") MemorySegment data);
}
