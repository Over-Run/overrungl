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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTDebugMarker {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glInsertEventMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushGroupMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopGroupMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glInsertEventMarkerEXT;
        public final MemorySegment PFN_glPushGroupMarkerEXT;
        public final MemorySegment PFN_glPopGroupMarkerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glInsertEventMarkerEXT = func.invoke("glInsertEventMarkerEXT");
            PFN_glPushGroupMarkerEXT = func.invoke("glPushGroupMarkerEXT");
            PFN_glPopGroupMarkerEXT = func.invoke("glPopGroupMarkerEXT");
        }
    }

    public GLEXTDebugMarker(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void InsertEventMarkerEXT(@CType("GLsizei") int length, @CType("const GLchar *") MemorySegment marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glInsertEventMarkerEXT)) throw new SymbolNotFoundError("Symbol not found: glInsertEventMarkerEXT");
        try { Handles.MH_glInsertEventMarkerEXT.invokeExact(handles.PFN_glInsertEventMarkerEXT, length, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glInsertEventMarkerEXT", e); }
    }

    public void PushGroupMarkerEXT(@CType("GLsizei") int length, @CType("const GLchar *") MemorySegment marker) {
        if (Unmarshal.isNullPointer(handles.PFN_glPushGroupMarkerEXT)) throw new SymbolNotFoundError("Symbol not found: glPushGroupMarkerEXT");
        try { Handles.MH_glPushGroupMarkerEXT.invokeExact(handles.PFN_glPushGroupMarkerEXT, length, marker); }
        catch (Throwable e) { throw new RuntimeException("error in glPushGroupMarkerEXT", e); }
    }

    public void PopGroupMarkerEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glPopGroupMarkerEXT)) throw new SymbolNotFoundError("Symbol not found: glPopGroupMarkerEXT");
        try { Handles.MH_glPopGroupMarkerEXT.invokeExact(handles.PFN_glPopGroupMarkerEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glPopGroupMarkerEXT", e); }
    }

}
