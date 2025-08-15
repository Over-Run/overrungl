/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.gremedy;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_GREMEDY_string_marker`
public final class GLGREMEDYStringMarker {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glStringMarkerGREMEDY = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glStringMarkerGREMEDY;
        private Handles(GLLoadFunc func) {
            PFN_glStringMarkerGREMEDY = func.invoke("glStringMarkerGREMEDY");
        }
    }

    public GLGREMEDYStringMarker(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glStringMarkerGREMEDY`.
    /// ```
    /// void glStringMarkerGREMEDY((int) GLsizei len, const void* string);
    /// ```
    public void StringMarkerGREMEDY(int len, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStringMarkerGREMEDY)) throw new GLSymbolNotFoundError("Symbol not found: glStringMarkerGREMEDY");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStringMarkerGREMEDY", len, string); }
        Handles.MH_glStringMarkerGREMEDY.invokeExact(handles.PFN_glStringMarkerGREMEDY, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in StringMarkerGREMEDY", e); }
    }

}
