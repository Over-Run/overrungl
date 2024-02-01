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
package overrungl.opengl.ext.oes;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_OES_byte_coordinates}
 */
public interface GLOESByteCoordinates {

    void glMultiTexCoord1bOES(int texture, byte s);
    void glMultiTexCoord1bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords);
    void glMultiTexCoord2bOES(int texture, byte s, byte t);
    void glMultiTexCoord2bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords);
    void glMultiTexCoord3bOES(int texture, byte s, byte t, byte r);
    void glMultiTexCoord3bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords);
    void glMultiTexCoord4bOES(int texture, byte s, byte t, byte r, byte q);
    void glMultiTexCoord4bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords);
    void glTexCoord1bOES(byte s);
    void glTexCoord1bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glTexCoord2bOES(byte s, byte t);
    void glTexCoord2bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glTexCoord3bOES(byte s, byte t, byte r);
    void glTexCoord3bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glTexCoord4bOES(byte s, byte t, byte r, byte q);
    void glTexCoord4bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glVertex2bOES(byte x, byte y);
    void glVertex2bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glVertex3bOES(byte x, byte y, byte z);
    void glVertex3bvOES(@NativeType("const GLbyte *") MemorySegment coords);
    void glVertex4bOES(byte x, byte y, byte z, byte w);
    void glVertex4bvOES(@NativeType("const GLbyte *") MemorySegment coords);
}
