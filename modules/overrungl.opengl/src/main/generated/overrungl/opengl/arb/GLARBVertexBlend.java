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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBVertexBlend {
    public static final int GL_MAX_VERTEX_UNITS_ARB = 0x86A4;
    public static final int GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;
    public static final int GL_WEIGHT_SUM_UNITY_ARB = 0x86A6;
    public static final int GL_VERTEX_BLEND_ARB = 0x86A7;
    public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;
    public static final int GL_WEIGHT_ARRAY_TYPE_ARB = 0x86A9;
    public static final int GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA;
    public static final int GL_WEIGHT_ARRAY_SIZE_ARB = 0x86AB;
    public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;
    public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;
    public static final int GL_MODELVIEW0_ARB = 0x1700;
    public static final int GL_MODELVIEW1_ARB = 0x850A;
    public static final int GL_MODELVIEW2_ARB = 0x8722;
    public static final int GL_MODELVIEW3_ARB = 0x8723;
    public static final int GL_MODELVIEW4_ARB = 0x8724;
    public static final int GL_MODELVIEW5_ARB = 0x8725;
    public static final int GL_MODELVIEW6_ARB = 0x8726;
    public static final int GL_MODELVIEW7_ARB = 0x8727;
    public static final int GL_MODELVIEW8_ARB = 0x8728;
    public static final int GL_MODELVIEW9_ARB = 0x8729;
    public static final int GL_MODELVIEW10_ARB = 0x872A;
    public static final int GL_MODELVIEW11_ARB = 0x872B;
    public static final int GL_MODELVIEW12_ARB = 0x872C;
    public static final int GL_MODELVIEW13_ARB = 0x872D;
    public static final int GL_MODELVIEW14_ARB = 0x872E;
    public static final int GL_MODELVIEW15_ARB = 0x872F;
    public static final int GL_MODELVIEW16_ARB = 0x8730;
    public static final int GL_MODELVIEW17_ARB = 0x8731;
    public static final int GL_MODELVIEW18_ARB = 0x8732;
    public static final int GL_MODELVIEW19_ARB = 0x8733;
    public static final int GL_MODELVIEW20_ARB = 0x8734;
    public static final int GL_MODELVIEW21_ARB = 0x8735;
    public static final int GL_MODELVIEW22_ARB = 0x8736;
    public static final int GL_MODELVIEW23_ARB = 0x8737;
    public static final int GL_MODELVIEW24_ARB = 0x8738;
    public static final int GL_MODELVIEW25_ARB = 0x8739;
    public static final int GL_MODELVIEW26_ARB = 0x873A;
    public static final int GL_MODELVIEW27_ARB = 0x873B;
    public static final int GL_MODELVIEW28_ARB = 0x873C;
    public static final int GL_MODELVIEW29_ARB = 0x873D;
    public static final int GL_MODELVIEW30_ARB = 0x873E;
    public static final int GL_MODELVIEW31_ARB = 0x873F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glWeightbvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightsvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightubvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightusvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightuivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glWeightPointerARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexBlendARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glWeightbvARB;
        public final MemorySegment PFN_glWeightsvARB;
        public final MemorySegment PFN_glWeightivARB;
        public final MemorySegment PFN_glWeightfvARB;
        public final MemorySegment PFN_glWeightdvARB;
        public final MemorySegment PFN_glWeightubvARB;
        public final MemorySegment PFN_glWeightusvARB;
        public final MemorySegment PFN_glWeightuivARB;
        public final MemorySegment PFN_glWeightPointerARB;
        public final MemorySegment PFN_glVertexBlendARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glWeightbvARB = func.invoke("glWeightbvARB");
            PFN_glWeightsvARB = func.invoke("glWeightsvARB");
            PFN_glWeightivARB = func.invoke("glWeightivARB");
            PFN_glWeightfvARB = func.invoke("glWeightfvARB");
            PFN_glWeightdvARB = func.invoke("glWeightdvARB");
            PFN_glWeightubvARB = func.invoke("glWeightubvARB");
            PFN_glWeightusvARB = func.invoke("glWeightusvARB");
            PFN_glWeightuivARB = func.invoke("glWeightuivARB");
            PFN_glWeightPointerARB = func.invoke("glWeightPointerARB");
            PFN_glVertexBlendARB = func.invoke("glVertexBlendARB");
        }
    }

    public GLARBVertexBlend(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glWeightbvARB((int) GLint size, const GLbyte* weights);
    /// ```
    public void WeightbvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightbvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightbvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightbvARB", size, weights); }
        Handles.MH_glWeightbvARB.invokeExact(handles.PFN_glWeightbvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightbvARB", e); }
    }

    /// ```
    /// void glWeightsvARB((int) GLint size, const GLshort* weights);
    /// ```
    public void WeightsvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightsvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightsvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightsvARB", size, weights); }
        Handles.MH_glWeightsvARB.invokeExact(handles.PFN_glWeightsvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightsvARB", e); }
    }

    /// ```
    /// void glWeightivARB((int) GLint size, const GLint* weights);
    /// ```
    public void WeightivARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightivARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightivARB", size, weights); }
        Handles.MH_glWeightivARB.invokeExact(handles.PFN_glWeightivARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightivARB", e); }
    }

    /// ```
    /// void glWeightfvARB((int) GLint size, const GLfloat* weights);
    /// ```
    public void WeightfvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightfvARB", size, weights); }
        Handles.MH_glWeightfvARB.invokeExact(handles.PFN_glWeightfvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightfvARB", e); }
    }

    /// ```
    /// void glWeightdvARB((int) GLint size, const GLdouble* weights);
    /// ```
    public void WeightdvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightdvARB", size, weights); }
        Handles.MH_glWeightdvARB.invokeExact(handles.PFN_glWeightdvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightdvARB", e); }
    }

    /// ```
    /// void glWeightubvARB((int) GLint size, const GLubyte* weights);
    /// ```
    public void WeightubvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightubvARB", size, weights); }
        Handles.MH_glWeightubvARB.invokeExact(handles.PFN_glWeightubvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightubvARB", e); }
    }

    /// ```
    /// void glWeightusvARB((int) GLint size, const GLushort* weights);
    /// ```
    public void WeightusvARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightusvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightusvARB", size, weights); }
        Handles.MH_glWeightusvARB.invokeExact(handles.PFN_glWeightusvARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightusvARB", e); }
    }

    /// ```
    /// void glWeightuivARB((int) GLint size, const GLuint* weights);
    /// ```
    public void WeightuivARB(int size, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightuivARB", size, weights); }
        Handles.MH_glWeightuivARB.invokeExact(handles.PFN_glWeightuivARB, size, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightuivARB", e); }
    }

    /// ```
    /// void glWeightPointerARB((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void WeightPointerARB(int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightPointerARB)) throw new GLSymbolNotFoundError("Symbol not found: glWeightPointerARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightPointerARB", size, type, stride, pointer); }
        Handles.MH_glWeightPointerARB.invokeExact(handles.PFN_glWeightPointerARB, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in WeightPointerARB", e); }
    }

    /// ```
    /// void glVertexBlendARB((int) GLint count);
    /// ```
    public void VertexBlendARB(int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBlendARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexBlendARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexBlendARB", count); }
        Handles.MH_glVertexBlendARB.invokeExact(handles.PFN_glVertexBlendARB, count); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBlendARB", e); }
    }

}
