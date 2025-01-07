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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEElementArray {
    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
    public static final MethodHandle MH_glElementPointerAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glElementPointerAPPLE;
    public static final MethodHandle MH_glDrawElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawElementArrayAPPLE;
    public static final MethodHandle MH_glDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawRangeElementArrayAPPLE;
    public static final MethodHandle MH_glMultiDrawElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawElementArrayAPPLE;
    public static final MethodHandle MH_glMultiDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawRangeElementArrayAPPLE;

    public GLAPPLEElementArray(overrungl.opengl.GLLoadFunc func) {
        PFN_glElementPointerAPPLE = func.invoke("glElementPointerAPPLE");
        PFN_glDrawElementArrayAPPLE = func.invoke("glDrawElementArrayAPPLE");
        PFN_glDrawRangeElementArrayAPPLE = func.invoke("glDrawRangeElementArrayAPPLE");
        PFN_glMultiDrawElementArrayAPPLE = func.invoke("glMultiDrawElementArrayAPPLE");
        PFN_glMultiDrawRangeElementArrayAPPLE = func.invoke("glMultiDrawRangeElementArrayAPPLE");
    }

    public void ElementPointerAPPLE(@CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glElementPointerAPPLE)) { try {
            MH_glElementPointerAPPLE.invokeExact(PFN_glElementPointerAPPLE, type, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glElementPointerAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glElementPointerAPPLE"); }
    }

    public void DrawElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (!Unmarshal.isNullPointer(PFN_glDrawElementArrayAPPLE)) { try {
            MH_glDrawElementArrayAPPLE.invokeExact(PFN_glDrawElementArrayAPPLE, mode, first, count);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawElementArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawElementArrayAPPLE"); }
    }

    public void DrawRangeElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (!Unmarshal.isNullPointer(PFN_glDrawRangeElementArrayAPPLE)) { try {
            MH_glDrawRangeElementArrayAPPLE.invokeExact(PFN_glDrawRangeElementArrayAPPLE, mode, start, end, first, count);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementArrayAPPLE"); }
    }

    public void MultiDrawElementArrayAPPLE(@CType("GLenum") int mode, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glMultiDrawElementArrayAPPLE)) { try {
            MH_glMultiDrawElementArrayAPPLE.invokeExact(PFN_glMultiDrawElementArrayAPPLE, mode, first, count, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementArrayAPPLE"); }
    }

    public void MultiDrawRangeElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glMultiDrawRangeElementArrayAPPLE)) { try {
            MH_glMultiDrawRangeElementArrayAPPLE.invokeExact(PFN_glMultiDrawRangeElementArrayAPPLE, mode, start, end, first, count, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiDrawRangeElementArrayAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiDrawRangeElementArrayAPPLE"); }
    }

}
