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
package overrungl.opengl.ext.sgi;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGIX_instruments}
 */
public interface GLSGIXInstruments {
    int GL_INSTRUMENT_BUFFER_POINTER_SGIX = 0x8180;
    int GL_INSTRUMENT_MEASUREMENTS_SGIX = 0x8181;

    default int glGetInstrumentsSGIX() {
        throw new ContextException();
    }

    default void glInstrumentsBufferSGIX(int size, @NativeType("GLint *") MemorySegment buffer) {
        throw new ContextException();
    }

    default int glPollInstrumentsSGIX(@NativeType("GLint *") MemorySegment marker_p) {
        throw new ContextException();
    }

    default void glReadInstrumentsSGIX(int marker) {
        throw new ContextException();
    }

    default void glStartInstrumentsSGIX() {
        throw new ContextException();
    }

    default void glStopInstrumentsSGIX(int marker) {
        throw new ContextException();
    }

}
