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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBTransformFeedbackInstanced {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawTransformFeedbackInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawTransformFeedbackStreamInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawTransformFeedbackInstanced;
        public final MemorySegment PFN_glDrawTransformFeedbackStreamInstanced;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawTransformFeedbackInstanced = func.invoke("glDrawTransformFeedbackInstanced");
            PFN_glDrawTransformFeedbackStreamInstanced = func.invoke("glDrawTransformFeedbackStreamInstanced");
        }
    }

    public GLARBTransformFeedbackInstanced(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DrawTransformFeedbackInstanced(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLsizei") int instancecount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedbackInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackInstanced");
        try { Handles.MH_glDrawTransformFeedbackInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackInstanced, mode, id, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackInstanced", e); }
    }

    public void DrawTransformFeedbackStreamInstanced(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLuint") int stream, @CType("GLsizei") int instancecount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedbackStreamInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStreamInstanced");
        try { Handles.MH_glDrawTransformFeedbackStreamInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackStreamInstanced, mode, id, stream, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackStreamInstanced", e); }
    }

}
