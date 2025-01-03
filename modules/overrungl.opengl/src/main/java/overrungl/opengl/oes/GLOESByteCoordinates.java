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
package overrungl.opengl.oes;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESByteCoordinates {
    public static final int GL_BYTE = 0x1400;
    public static final MethodHandle MH_glMultiTexCoord1bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glMultiTexCoord1bOES;
    public static final MethodHandle MH_glMultiTexCoord1bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord1bvOES;
    public static final MethodHandle MH_glMultiTexCoord2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glMultiTexCoord2bOES;
    public static final MethodHandle MH_glMultiTexCoord2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord2bvOES;
    public static final MethodHandle MH_glMultiTexCoord3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glMultiTexCoord3bOES;
    public static final MethodHandle MH_glMultiTexCoord3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord3bvOES;
    public static final MethodHandle MH_glMultiTexCoord4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glMultiTexCoord4bOES;
    public static final MethodHandle MH_glMultiTexCoord4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoord4bvOES;
    public static final MethodHandle MH_glTexCoord1bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glTexCoord1bOES;
    public static final MethodHandle MH_glTexCoord1bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord1bvOES;
    public static final MethodHandle MH_glTexCoord2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glTexCoord2bOES;
    public static final MethodHandle MH_glTexCoord2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord2bvOES;
    public static final MethodHandle MH_glTexCoord3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glTexCoord3bOES;
    public static final MethodHandle MH_glTexCoord3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord3bvOES;
    public static final MethodHandle MH_glTexCoord4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glTexCoord4bOES;
    public static final MethodHandle MH_glTexCoord4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoord4bvOES;
    public static final MethodHandle MH_glVertex2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glVertex2bOES;
    public static final MethodHandle MH_glVertex2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex2bvOES;
    public static final MethodHandle MH_glVertex3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glVertex3bOES;
    public static final MethodHandle MH_glVertex3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex3bvOES;
    public static final MethodHandle MH_glVertex4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glVertex4bOES;
    public static final MethodHandle MH_glVertex4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertex4bvOES;

    public GLOESByteCoordinates(overrungl.opengl.GLLoadFunc func) {
        PFN_glMultiTexCoord1bOES = func.invoke("glMultiTexCoord1bOES");
        PFN_glMultiTexCoord1bvOES = func.invoke("glMultiTexCoord1bvOES");
        PFN_glMultiTexCoord2bOES = func.invoke("glMultiTexCoord2bOES");
        PFN_glMultiTexCoord2bvOES = func.invoke("glMultiTexCoord2bvOES");
        PFN_glMultiTexCoord3bOES = func.invoke("glMultiTexCoord3bOES");
        PFN_glMultiTexCoord3bvOES = func.invoke("glMultiTexCoord3bvOES");
        PFN_glMultiTexCoord4bOES = func.invoke("glMultiTexCoord4bOES");
        PFN_glMultiTexCoord4bvOES = func.invoke("glMultiTexCoord4bvOES");
        PFN_glTexCoord1bOES = func.invoke("glTexCoord1bOES");
        PFN_glTexCoord1bvOES = func.invoke("glTexCoord1bvOES");
        PFN_glTexCoord2bOES = func.invoke("glTexCoord2bOES");
        PFN_glTexCoord2bvOES = func.invoke("glTexCoord2bvOES");
        PFN_glTexCoord3bOES = func.invoke("glTexCoord3bOES");
        PFN_glTexCoord3bvOES = func.invoke("glTexCoord3bvOES");
        PFN_glTexCoord4bOES = func.invoke("glTexCoord4bOES");
        PFN_glTexCoord4bvOES = func.invoke("glTexCoord4bvOES");
        PFN_glVertex2bOES = func.invoke("glVertex2bOES");
        PFN_glVertex2bvOES = func.invoke("glVertex2bvOES");
        PFN_glVertex3bOES = func.invoke("glVertex3bOES");
        PFN_glVertex3bvOES = func.invoke("glVertex3bvOES");
        PFN_glVertex4bOES = func.invoke("glVertex4bOES");
        PFN_glVertex4bvOES = func.invoke("glVertex4bvOES");
    }

    public void MultiTexCoord1bOES(@CType("GLenum") int texture, @CType("GLbyte") byte s) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1bOES))
            MH_glMultiTexCoord1bOES.invokeExact(PFN_glMultiTexCoord1bOES, texture, s);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1bOES", e); }
    }

    public void MultiTexCoord1bvOES(@CType("GLenum") int texture, @CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord1bvOES))
            MH_glMultiTexCoord1bvOES.invokeExact(PFN_glMultiTexCoord1bvOES, texture, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord1bvOES", e); }
    }

    public void MultiTexCoord2bOES(@CType("GLenum") int texture, @CType("GLbyte") byte s, @CType("GLbyte") byte t) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2bOES))
            MH_glMultiTexCoord2bOES.invokeExact(PFN_glMultiTexCoord2bOES, texture, s, t);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2bOES", e); }
    }

    public void MultiTexCoord2bvOES(@CType("GLenum") int texture, @CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord2bvOES))
            MH_glMultiTexCoord2bvOES.invokeExact(PFN_glMultiTexCoord2bvOES, texture, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord2bvOES", e); }
    }

    public void MultiTexCoord3bOES(@CType("GLenum") int texture, @CType("GLbyte") byte s, @CType("GLbyte") byte t, @CType("GLbyte") byte r) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3bOES))
            MH_glMultiTexCoord3bOES.invokeExact(PFN_glMultiTexCoord3bOES, texture, s, t, r);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3bOES", e); }
    }

    public void MultiTexCoord3bvOES(@CType("GLenum") int texture, @CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord3bvOES))
            MH_glMultiTexCoord3bvOES.invokeExact(PFN_glMultiTexCoord3bvOES, texture, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord3bvOES", e); }
    }

    public void MultiTexCoord4bOES(@CType("GLenum") int texture, @CType("GLbyte") byte s, @CType("GLbyte") byte t, @CType("GLbyte") byte r, @CType("GLbyte") byte q) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4bOES))
            MH_glMultiTexCoord4bOES.invokeExact(PFN_glMultiTexCoord4bOES, texture, s, t, r, q);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4bOES", e); }
    }

    public void MultiTexCoord4bvOES(@CType("GLenum") int texture, @CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoord4bvOES))
            MH_glMultiTexCoord4bvOES.invokeExact(PFN_glMultiTexCoord4bvOES, texture, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoord4bvOES", e); }
    }

    public void TexCoord1bOES(@CType("GLbyte") byte s) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord1bOES))
            MH_glTexCoord1bOES.invokeExact(PFN_glTexCoord1bOES, s);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1bOES", e); }
    }

    public void TexCoord1bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord1bvOES))
            MH_glTexCoord1bvOES.invokeExact(PFN_glTexCoord1bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord1bvOES", e); }
    }

    public void TexCoord2bOES(@CType("GLbyte") byte s, @CType("GLbyte") byte t) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord2bOES))
            MH_glTexCoord2bOES.invokeExact(PFN_glTexCoord2bOES, s, t);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2bOES", e); }
    }

    public void TexCoord2bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord2bvOES))
            MH_glTexCoord2bvOES.invokeExact(PFN_glTexCoord2bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2bvOES", e); }
    }

    public void TexCoord3bOES(@CType("GLbyte") byte s, @CType("GLbyte") byte t, @CType("GLbyte") byte r) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord3bOES))
            MH_glTexCoord3bOES.invokeExact(PFN_glTexCoord3bOES, s, t, r);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3bOES", e); }
    }

    public void TexCoord3bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord3bvOES))
            MH_glTexCoord3bvOES.invokeExact(PFN_glTexCoord3bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord3bvOES", e); }
    }

    public void TexCoord4bOES(@CType("GLbyte") byte s, @CType("GLbyte") byte t, @CType("GLbyte") byte r, @CType("GLbyte") byte q) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord4bOES))
            MH_glTexCoord4bOES.invokeExact(PFN_glTexCoord4bOES, s, t, r, q);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4bOES", e); }
    }

    public void TexCoord4bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexCoord4bvOES))
            MH_glTexCoord4bvOES.invokeExact(PFN_glTexCoord4bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4bvOES", e); }
    }

    public void Vertex2bOES(@CType("GLbyte") byte x, @CType("GLbyte") byte y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex2bOES))
            MH_glVertex2bOES.invokeExact(PFN_glVertex2bOES, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2bOES", e); }
    }

    public void Vertex2bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex2bvOES))
            MH_glVertex2bvOES.invokeExact(PFN_glVertex2bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex2bvOES", e); }
    }

    public void Vertex3bOES(@CType("GLbyte") byte x, @CType("GLbyte") byte y, @CType("GLbyte") byte z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex3bOES))
            MH_glVertex3bOES.invokeExact(PFN_glVertex3bOES, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3bOES", e); }
    }

    public void Vertex3bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex3bvOES))
            MH_glVertex3bvOES.invokeExact(PFN_glVertex3bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex3bvOES", e); }
    }

    public void Vertex4bOES(@CType("GLbyte") byte x, @CType("GLbyte") byte y, @CType("GLbyte") byte z, @CType("GLbyte") byte w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex4bOES))
            MH_glVertex4bOES.invokeExact(PFN_glVertex4bOES, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4bOES", e); }
    }

    public void Vertex4bvOES(@CType("const GLbyte *") java.lang.foreign.MemorySegment coords) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertex4bvOES))
            MH_glVertex4bvOES.invokeExact(PFN_glVertex4bvOES, coords);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertex4bvOES", e); }
    }

}
