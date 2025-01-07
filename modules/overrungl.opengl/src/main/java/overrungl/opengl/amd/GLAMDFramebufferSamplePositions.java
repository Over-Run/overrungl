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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDFramebufferSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD = 0x91AE;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD = 0x91AF;
    public static final int GL_ALL_PIXELS_AMD = 0xFFFFFFFF;
    public static final MethodHandle MH_glFramebufferSamplePositionsfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFramebufferSamplePositionsfvAMD;
    public static final MethodHandle MH_glNamedFramebufferSamplePositionsfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedFramebufferSamplePositionsfvAMD;
    public static final MethodHandle MH_glGetFramebufferParameterfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFramebufferParameterfvAMD;
    public static final MethodHandle MH_glGetNamedFramebufferParameterfvAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedFramebufferParameterfvAMD;

    public GLAMDFramebufferSamplePositions(overrungl.opengl.GLLoadFunc func) {
        PFN_glFramebufferSamplePositionsfvAMD = func.invoke("glFramebufferSamplePositionsfvAMD");
        PFN_glNamedFramebufferSamplePositionsfvAMD = func.invoke("glNamedFramebufferSamplePositionsfvAMD");
        PFN_glGetFramebufferParameterfvAMD = func.invoke("glGetFramebufferParameterfvAMD");
        PFN_glGetNamedFramebufferParameterfvAMD = func.invoke("glGetNamedFramebufferParameterfvAMD");
    }

    public void FramebufferSamplePositionsfvAMD(@CType("GLenum") int target, @CType("GLuint") int numsamples, @CType("GLuint") int pixelindex, @CType("const GLfloat *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferSamplePositionsfvAMD)) { try {
            MH_glFramebufferSamplePositionsfvAMD.invokeExact(PFN_glFramebufferSamplePositionsfvAMD, target, numsamples, pixelindex, values);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferSamplePositionsfvAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferSamplePositionsfvAMD"); }
    }

    public void NamedFramebufferSamplePositionsfvAMD(@CType("GLuint") int framebuffer, @CType("GLuint") int numsamples, @CType("GLuint") int pixelindex, @CType("const GLfloat *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferSamplePositionsfvAMD)) { try {
            MH_glNamedFramebufferSamplePositionsfvAMD.invokeExact(PFN_glNamedFramebufferSamplePositionsfvAMD, framebuffer, numsamples, pixelindex, values);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferSamplePositionsfvAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferSamplePositionsfvAMD"); }
    }

    public void GetFramebufferParameterfvAMD(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint") int numsamples, @CType("GLuint") int pixelindex, @CType("GLsizei") int size, @CType("GLfloat *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glGetFramebufferParameterfvAMD)) { try {
            MH_glGetFramebufferParameterfvAMD.invokeExact(PFN_glGetFramebufferParameterfvAMD, target, pname, numsamples, pixelindex, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferParameterfvAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameterfvAMD"); }
    }

    public void GetNamedFramebufferParameterfvAMD(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLuint") int numsamples, @CType("GLuint") int pixelindex, @CType("GLsizei") int size, @CType("GLfloat *") java.lang.foreign.MemorySegment values) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferParameterfvAMD)) { try {
            MH_glGetNamedFramebufferParameterfvAMD.invokeExact(PFN_glGetNamedFramebufferParameterfvAMD, framebuffer, pname, numsamples, pixelindex, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameterfvAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameterfvAMD"); }
    }

}
