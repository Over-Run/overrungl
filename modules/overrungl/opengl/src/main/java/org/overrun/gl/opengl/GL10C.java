/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.gl.opengl;

import org.jetbrains.annotations.Nullable;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.gl.FunctionDescriptors.*;
import static org.overrun.gl.opengl.GLLoader.*;

/**
 * The OpenGL 1.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL10C permits GL10, GL11C {
    public static final int DEPTH_BUFFER_BIT = 0x00000100;
    public static final int STENCIL_BUFFER_BIT = 0x00000400;
    public static final int COLOR_BUFFER_BIT = 0x00004000;
    public static final int FALSE = 0;
    public static final int TRUE = 1;
    public static final int POINTS = 0x0000;
    public static final int LINES = 0x0001;
    public static final int LINE_LOOP = 0x0002;
    public static final int LINE_STRIP = 0x0003;
    public static final int TRIANGLES = 0x0004;
    public static final int TRIANGLE_STRIP = 0x0005;
    public static final int TRIANGLE_FAN = 0x0006;
    public static final int QUADS = 0x0007;
    public static final int NEVER = 0x0200;
    public static final int LESS = 0x0201;
    public static final int EQUAL = 0x0202;
    public static final int LEQUAL = 0x0203;
    public static final int GREATER = 0x0204;
    public static final int NOTEQUAL = 0x0205;
    public static final int GEQUAL = 0x0206;
    public static final int ALWAYS = 0x0207;
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int SRC_COLOR = 0x0300;
    public static final int ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int SRC_ALPHA = 0x0302;
    public static final int ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int DST_ALPHA = 0x0304;
    public static final int ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int DST_COLOR = 0x0306;
    public static final int ONE_MINUS_DST_COLOR = 0x0307;
    public static final int SRC_ALPHA_SATURATE = 0x0308;
    public static final int NONE = 0;
    public static final int FRONT_LEFT = 0x0400;
    public static final int FRONT_RIGHT = 0x0401;
    public static final int BACK_LEFT = 0x0402;
    public static final int BACK_RIGHT = 0x0403;
    public static final int FRONT = 0x0404;
    public static final int BACK = 0x0405;
    public static final int LEFT = 0x0406;
    public static final int RIGHT = 0x0407;
    public static final int FRONT_AND_BACK = 0x0408;
    public static final int NO_ERROR = 0;
    public static final int INVALID_ENUM = 0x0500;
    public static final int INVALID_VALUE = 0x0501;
    public static final int INVALID_OPERATION = 0x0502;
    public static final int OUT_OF_MEMORY = 0x0505;
    public static final int CW = 0x0900;
    public static final int CCW = 0x0901;
    public static final int POINT_SIZE = 0x0B11;
    public static final int POINT_SIZE_RANGE = 0x0B12;
    public static final int POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int LINE_SMOOTH = 0x0B20;
    public static final int LINE_WIDTH = 0x0B21;
    public static final int LINE_WIDTH_RANGE = 0x0B22;
    public static final int LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int POLYGON_MODE = 0x0B40;
    public static final int POLYGON_SMOOTH = 0x0B41;
    public static final int CULL_FACE = 0x0B44;
    public static final int CULL_FACE_MODE = 0x0B45;
    public static final int FRONT_FACE = 0x0B46;
    public static final int DEPTH_RANGE = 0x0B70;
    public static final int DEPTH_TEST = 0x0B71;
    public static final int DEPTH_WRITEMASK = 0x0B72;
    public static final int DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int DEPTH_FUNC = 0x0B74;
    public static final int STENCIL_TEST = 0x0B90;
    public static final int STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int STENCIL_FUNC = 0x0B92;
    public static final int STENCIL_VALUE_MASK = 0x0B93;
    public static final int STENCIL_FAIL = 0x0B94;
    public static final int STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int STENCIL_REF = 0x0B97;
    public static final int STENCIL_WRITEMASK = 0x0B98;
    public static final int VIEWPORT = 0x0BA2;
    public static final int DITHER = 0x0BD0;
    public static final int BLEND_DST = 0x0BE0;
    public static final int BLEND_SRC = 0x0BE1;
    public static final int BLEND = 0x0BE2;
    public static final int LOGIC_OP_MODE = 0x0BF0;
    public static final int DRAW_BUFFER = 0x0C01;
    public static final int READ_BUFFER = 0x0C02;
    public static final int SCISSOR_BOX = 0x0C10;
    public static final int SCISSOR_TEST = 0x0C11;
    public static final int COLOR_CLEAR_VALUE = 0x0C22;
    public static final int COLOR_WRITEMASK = 0x0C23;
    public static final int DOUBLEBUFFER = 0x0C32;
    public static final int STEREO = 0x0C33;
    public static final int LINE_SMOOTH_HINT = 0x0C52;
    public static final int POLYGON_SMOOTH_HINT = 0x0C53;
    public static final int UNPACK_SWAP_BYTES = 0x0CF0;
    public static final int UNPACK_LSB_FIRST = 0x0CF1;
    public static final int UNPACK_ROW_LENGTH = 0x0CF2;
    public static final int UNPACK_SKIP_ROWS = 0x0CF3;
    public static final int UNPACK_SKIP_PIXELS = 0x0CF4;
    public static final int UNPACK_ALIGNMENT = 0x0CF5;
    public static final int PACK_SWAP_BYTES = 0x0D00;
    public static final int PACK_LSB_FIRST = 0x0D01;
    public static final int PACK_ROW_LENGTH = 0x0D02;
    public static final int PACK_SKIP_ROWS = 0x0D03;
    public static final int PACK_SKIP_PIXELS = 0x0D04;
    public static final int PACK_ALIGNMENT = 0x0D05;
    public static final int MAX_TEXTURE_SIZE = 0x0D33;
    public static final int MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int SUBPIXEL_BITS = 0x0D50;
    public static final int TEXTURE_1D = 0x0DE0;
    public static final int TEXTURE_2D = 0x0DE1;
    public static final int TEXTURE_WIDTH = 0x1000;
    public static final int TEXTURE_HEIGHT = 0x1001;
    public static final int TEXTURE_BORDER_COLOR = 0x1004;
    public static final int DONT_CARE = 0x1100;
    public static final int FASTEST = 0x1101;
    public static final int NICEST = 0x1102;
    public static final int BYTE = 0x1400;
    public static final int UNSIGNED_BYTE = 0x1401;
    public static final int SHORT = 0x1402;
    public static final int UNSIGNED_SHORT = 0x1403;
    public static final int INT = 0x1404;
    public static final int UNSIGNED_INT = 0x1405;
    public static final int FLOAT = 0x1406;
    public static final int STACK_OVERFLOW = 0x0503;
    public static final int STACK_UNDERFLOW = 0x0504;
    public static final int CLEAR = 0x1500;
    public static final int AND = 0x1501;
    public static final int AND_REVERSE = 0x1502;
    public static final int COPY = 0x1503;
    public static final int AND_INVERTED = 0x1504;
    public static final int NOOP = 0x1505;
    public static final int XOR = 0x1506;
    public static final int OR = 0x1507;
    public static final int NOR = 0x1508;
    public static final int EQUIV = 0x1509;
    public static final int INVERT = 0x150A;
    public static final int OR_REVERSE = 0x150B;
    public static final int COPY_INVERTED = 0x150C;
    public static final int OR_INVERTED = 0x150D;
    public static final int NAND = 0x150E;
    public static final int SET = 0x150F;
    public static final int TEXTURE = 0x1702;
    public static final int COLOR = 0x1800;
    public static final int DEPTH = 0x1801;
    public static final int STENCIL = 0x1802;
    public static final int STENCIL_INDEX = 0x1901;
    public static final int DEPTH_COMPONENT = 0x1902;
    public static final int RED = 0x1903;
    public static final int GREEN = 0x1904;
    public static final int BLUE = 0x1905;
    public static final int ALPHA = 0x1906;
    public static final int RGB = 0x1907;
    public static final int RGBA = 0x1908;
    public static final int POINT = 0x1B00;
    public static final int LINE = 0x1B01;
    public static final int FILL = 0x1B02;
    public static final int KEEP = 0x1E00;
    public static final int REPLACE = 0x1E01;
    public static final int INCR = 0x1E02;
    public static final int DECR = 0x1E03;
    public static final int VENDOR = 0x1F00;
    public static final int RENDERER = 0x1F01;
    public static final int VERSION = 0x1F02;
    public static final int EXTENSIONS = 0x1F03;
    public static final int NEAREST = 0x2600;
    public static final int LINEAR = 0x2601;
    public static final int NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int TEXTURE_MAG_FILTER = 0x2800;
    public static final int TEXTURE_MIN_FILTER = 0x2801;
    public static final int TEXTURE_WRAP_S = 0x2802;
    public static final int TEXTURE_WRAP_T = 0x2803;
    public static final int REPEAT = 0x2901;

    protected GL10C() {
        throw new IllegalStateException("Do not construct instance");
    }

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBlendFunc, caps.glClear, caps.glClearColor, caps.glClearDepth, caps.glClearStencil, caps.glColorMask,
            caps.glCullFace, caps.glDepthFunc, caps.glDepthMask, caps.glDepthRange, caps.glDisable, caps.glDrawBuffer,
            caps.glEnable, caps.glFinish, caps.glFlush, caps.glFrontFace, caps.glGetBooleanv, caps.glGetDoublev,
            caps.glGetError, caps.glGetFloatv, caps.glGetIntegerv, caps.glGetString, caps.glGetTexImage, caps.glGetTexLevelParameterfv,
            caps.glGetTexLevelParameteriv, caps.glGetTexParameterfv, caps.glGetTexParameteriv, caps.glHint, caps.glIsEnabled, caps.glLineWidth,
            caps.glLogicOp, caps.glPixelStoref, caps.glPixelStorei, caps.glPointSize, caps.glPolygonMode, caps.glReadBuffer,
            caps.glReadPixels, caps.glScissor, caps.glStencilFunc, caps.glStencilMask, caps.glStencilOp, caps.glTexImage1D,
            caps.glTexImage2D, caps.glTexParameterf, caps.glTexParameterfv, caps.glTexParameteri, caps.glTexParameteriv, caps.glViewport);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBlendFunc = load.invoke("glBlendFunc", IIV);
        caps.glClear = load.invoke("glClear", IV);
        caps.glClearColor = load.invoke("glClearColor", FFFFV);
        caps.glClearDepth = load.invoke("glClearDepth", DV);
        caps.glClearStencil = load.invoke("glClearStencil", IV);
        caps.glColorMask = load.invoke("glColorMask", ZZZZV);
        caps.glCullFace = load.invoke("glCullFace", IV);
        caps.glDepthFunc = load.invoke("glDepthFunc", IV);
        caps.glDepthMask = load.invoke("glDepthMask", ZV);
        caps.glDepthRange = load.invoke("glDepthRange", DDV);
        caps.glDisable = load.invoke("glDisable", IV);
        caps.glDrawBuffer = load.invoke("glDrawBuffer", IV);
        caps.glEnable = load.invoke("glEnable", IV);
        caps.glFinish = load.invoke("glFinish", V);
        caps.glFlush = load.invoke("glFlush", V);
        caps.glFrontFace = load.invoke("glFrontFace", IV);
        caps.glGetBooleanv = load.invoke("glGetBooleanv", IPV);
        caps.glGetDoublev = load.invoke("glGetDoublev", IPV);
        caps.glGetError = load.invoke("glGetError", I);
        caps.glGetFloatv = load.invoke("glGetFloatv", IPV);
        caps.glGetIntegerv = load.invoke("glGetIntegerv", IPV);
        caps.glGetString = load.invoke("glGetString", Ip);
        caps.glGetTexImage = load.invoke("glGetTexImage", IIIIPV);
        caps.glGetTexLevelParameterfv = load.invoke("glGetTexLevelParameterfv", IIIPV);
        caps.glGetTexLevelParameteriv = load.invoke("glGetTexLevelParameteriv", IIIPV);
        caps.glGetTexParameterfv = load.invoke("glGetTexParameterfv", IIPV);
        caps.glGetTexParameteriv = load.invoke("glGetTexParameteriv", IIPV);
        caps.glHint = load.invoke("glHint", IIV);
        caps.glIsEnabled = load.invoke("glIsEnabled", IZ);
        caps.glLineWidth = load.invoke("glLineWidth", FV);
        caps.glLogicOp = load.invoke("glLogicOp", IV);
        caps.glPixelStoref = load.invoke("glPixelStoref", IFV);
        caps.glPixelStorei = load.invoke("glPixelStorei", IIV);
        caps.glPointSize = load.invoke("glPointSize", FV);
        caps.glPolygonMode = load.invoke("glPolygonMode", IIV);
        caps.glReadBuffer = load.invoke("glReadBuffer", IV);
        caps.glReadPixels = load.invoke("glReadPixels", IIIIIIPV);
        caps.glScissor = load.invoke("glScissor", IIIIV);
        caps.glStencilFunc = load.invoke("glStencilFunc", IIIV);
        caps.glStencilMask = load.invoke("glStencilMask", IV);
        caps.glStencilOp = load.invoke("glStencilOp", IIIV);
        caps.glTexImage1D = load.invoke("glTexImage1D", IIIIIIIPV);
        caps.glTexImage2D = load.invoke("glTexImage2D", IIIIIIIIPV);
        caps.glTexParameterf = load.invoke("glTexParameterf", IIFV);
        caps.glTexParameterfv = load.invoke("glTexParameterfv", IIPV);
        caps.glTexParameteri = load.invoke("glTexParameteri", IIIV);
        caps.glTexParameteriv = load.invoke("glTexParameteriv", IIPV);
        caps.glViewport = load.invoke("glViewport", IIIIV);
    }

    public static void blendFunc(int sfactor, int dfactor) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendFunc).invokeExact(sfactor, dfactor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clear(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glClear).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearColor(float red, float green, float blue, float alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glClearColor).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearDepth(double depth) {
        var caps = getCapabilities();
        try {
            check(caps.glClearDepth).invokeExact(depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearStencil(int s) {
        var caps = getCapabilities();
        try {
            check(caps.glClearStencil).invokeExact(s);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glColorMask).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void cullFace(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glCullFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthFunc(int func) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthFunc).invokeExact(func);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthMask(boolean flag) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthMask).invokeExact(flag);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void depthRange(double n, double f) {
        var caps = getCapabilities();
        try {
            check(caps.glDepthRange).invokeExact(n, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void disable(int cap) {
        var caps = getCapabilities();
        try {
            check(caps.glDisable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawBuffer(int buf) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawBuffer).invokeExact(buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enable(int cap) {
        var caps = getCapabilities();
        try {
            check(caps.glEnable).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void finish() {
        var caps = getCapabilities();
        try {
            check(caps.glFinish).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flush() {
        var caps = getCapabilities();
        try {
            check(caps.glFlush).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void frontFace(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glFrontFace).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBooleanv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(SegmentAllocator allocator, int pname, boolean[] data) {
        var pData = allocator.allocateArray(JAVA_BOOLEAN, data.length);
        getBooleanv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static boolean getBoolean(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_BOOLEAN);
            getBooleanv(pname, pData);
            return pData.get(JAVA_BOOLEAN, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getDoublev(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetDoublev).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getDoublev(SegmentAllocator allocator, int pname, double[] data) {
        var pData = allocator.allocateArray(JAVA_DOUBLE, data.length);
        getDoublev(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static double getDouble(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_DOUBLE);
            getDoublev(pname, pData);
            return pData.get(JAVA_DOUBLE, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getError() {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetError).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFloatv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(SegmentAllocator allocator, int pname, float[] data) {
        var pData = allocator.allocateArray(JAVA_FLOAT, data.length);
        getFloatv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static float getFloat(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_FLOAT);
            getFloatv(pname, pData);
            return pData.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getIntegerv(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetIntegerv).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegerv(SegmentAllocator allocator, int pname, int[] data) {
        var pData = allocator.allocateArray(JAVA_INT, data.length);
        getIntegerv(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static int getInteger(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_INT);
            getIntegerv(pname, pData);
            return pData.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment ngetString(int name) {
        var caps = getCapabilities();
        try {
            return (MemorySegment) check(caps.glGetString).invokeExact(name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getString(int name) {
        var pStr = ngetString(name);
        return RuntimeHelper.isNullptr(pStr) ? null : pStr.getUtf8String(0);
    }

    public static void getTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexImage).invokeExact(target, level, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameterfv(int target, int level, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexLevelParameterfv).invokeExact(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameterfv(SegmentAllocator allocator, int target, int level, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexLevelParameterfv(target, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTexLevelParameterf(int target, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getTexLevelParameterfv(target, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexLevelParameteriv(int target, int level, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexLevelParameteriv).invokeExact(target, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexLevelParameteriv(SegmentAllocator allocator, int target, int level, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexLevelParameteriv(target, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTexLevelParameteri(int target, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getTexLevelParameteriv(target, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameterfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTexParameterfv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTexParameterf(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_FLOAT);
            getTexParameterfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameteriv(target, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTexParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.calloc(JAVA_INT);
            getTexParameteriv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void hint(int target, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glHint).invokeExact(target, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isEnabled(int cap) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsEnabled).invokeExact(cap);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void lineWidth(float width) {
        var caps = getCapabilities();
        try {
            check(caps.glLineWidth).invokeExact(width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void logicOp(int opcode) {
        var caps = getCapabilities();
        try {
            check(caps.glLogicOp).invokeExact(opcode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStoref(int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelStoref).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pixelStorei(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glPixelStorei).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointSize(float size) {
        var caps = getCapabilities();
        try {
            check(caps.glPointSize).invokeExact(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonMode(int face, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonMode).invokeExact(face, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readBuffer(int src) {
        var caps = getCapabilities();
        try {
            check(caps.glReadBuffer).invokeExact(src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glReadPixels).invokeExact(x, y, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, byte[] pixels) {
        var seg = allocator.allocateArray(JAVA_BYTE, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, short[] pixels) {
        var seg = allocator.allocateArray(JAVA_SHORT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, int[] pixels) {
        var seg = allocator.allocateArray(JAVA_INT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, float[] pixels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pixels.length);
        readPixels(x, y, width, height, format, type, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void scissor(int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glScissor).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilFunc(int func, int ref, int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilFunc).invokeExact(func, ref, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilMask(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilMask).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void stencilOp(int fail, int zfail, int zpass) {
        var caps = getCapabilities();
        try {
            check(caps.glStencilOp).invokeExact(fail, zfail, zpass);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage1D).invokeExact(target, level, internalFormat, width, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, byte[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, short[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, int[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, float[] pixels) {
        texImage1D(target, level, internalFormat, width, border, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage2D).invokeExact(target, level, internalFormat, width, height, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, byte[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, short[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, int[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, float[] pixels) {
        texImage2D(target, level, internalFormat, width, height, border, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texParameterf(int target, int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterf).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterfv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void texParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        texParameterfv(target, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void texParameteri(int target, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameteriv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void viewport(int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glViewport).invokeExact(x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
