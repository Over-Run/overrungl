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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_SGIX_instruments}
  */
public final class GLSGIXInstruments {
    public static final int GL_INSTRUMENT_BUFFER_POINTER_SGIX = 0x8180;
    public static final int GL_INSTRUMENT_MEASUREMENTS_SGIX = 0x8181;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_instruments) return;
        ext.glGetInstrumentsSGIX = load.invoke("glGetInstrumentsSGIX", of(JAVA_INT));
        ext.glInstrumentsBufferSGIX = load.invoke("glInstrumentsBufferSGIX", ofVoid(JAVA_INT, ADDRESS));
        ext.glPollInstrumentsSGIX = load.invoke("glPollInstrumentsSGIX", of(JAVA_INT, ADDRESS));
        ext.glReadInstrumentsSGIX = load.invoke("glReadInstrumentsSGIX", ofVoid(JAVA_INT));
        ext.glStartInstrumentsSGIX = load.invoke("glStartInstrumentsSGIX", ofVoid());
        ext.glStopInstrumentsSGIX = load.invoke("glStopInstrumentsSGIX", ofVoid(JAVA_INT));
    }

    public static int glGetInstrumentsSGIX() {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetInstrumentsSGIX).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glInstrumentsBufferSGIX(int size, @NativeType("GLint *") MemorySegment buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glInstrumentsBufferSGIX).invokeExact(size, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glPollInstrumentsSGIX(@NativeType("GLint *") MemorySegment marker_p) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glPollInstrumentsSGIX).invokeExact(marker_p);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReadInstrumentsSGIX(int marker) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReadInstrumentsSGIX).invokeExact(marker);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStartInstrumentsSGIX() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStartInstrumentsSGIX).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStopInstrumentsSGIX(int marker) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStopInstrumentsSGIX).invokeExact(marker);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
