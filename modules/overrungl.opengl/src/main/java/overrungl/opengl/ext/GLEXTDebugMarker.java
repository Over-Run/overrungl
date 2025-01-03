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
    public static final MethodHandle MH_glInsertEventMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glInsertEventMarkerEXT;
    public static final MethodHandle MH_glPushGroupMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPushGroupMarkerEXT;
    public static final MethodHandle MH_glPopGroupMarkerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glPopGroupMarkerEXT;

    public GLEXTDebugMarker(overrungl.opengl.GLLoadFunc func) {
        PFN_glInsertEventMarkerEXT = func.invoke("glInsertEventMarkerEXT");
        PFN_glPushGroupMarkerEXT = func.invoke("glPushGroupMarkerEXT");
        PFN_glPopGroupMarkerEXT = func.invoke("glPopGroupMarkerEXT");
    }

    public void InsertEventMarkerEXT(@CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment marker) {
        try { if (!Unmarshal.isNullPointer(PFN_glInsertEventMarkerEXT))
            MH_glInsertEventMarkerEXT.invokeExact(PFN_glInsertEventMarkerEXT, length, marker);
        }
        catch (Throwable e) { throw new RuntimeException("error in glInsertEventMarkerEXT", e); }
    }

    public void PushGroupMarkerEXT(@CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment marker) {
        try { if (!Unmarshal.isNullPointer(PFN_glPushGroupMarkerEXT))
            MH_glPushGroupMarkerEXT.invokeExact(PFN_glPushGroupMarkerEXT, length, marker);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPushGroupMarkerEXT", e); }
    }

    public void PopGroupMarkerEXT() {
        try { if (!Unmarshal.isNullPointer(PFN_glPopGroupMarkerEXT))
            MH_glPopGroupMarkerEXT.invokeExact(PFN_glPopGroupMarkerEXT);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPopGroupMarkerEXT", e); }
    }

}
