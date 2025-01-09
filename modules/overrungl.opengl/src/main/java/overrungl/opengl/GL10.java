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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL10 permits GL11 {
    public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
    public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
    public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
    public static final int GL_FALSE = 0;
    public static final int GL_TRUE = 1;
    public static final int GL_POINTS = 0x0000;
    public static final int GL_LINES = 0x0001;
    public static final int GL_LINE_LOOP = 0x0002;
    public static final int GL_LINE_STRIP = 0x0003;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_TRIANGLE_FAN = 0x0006;
    public static final int GL_NEVER = 0x0200;
    public static final int GL_LESS = 0x0201;
    public static final int GL_EQUAL = 0x0202;
    public static final int GL_LEQUAL = 0x0203;
    public static final int GL_GREATER = 0x0204;
    public static final int GL_NOTEQUAL = 0x0205;
    public static final int GL_GEQUAL = 0x0206;
    public static final int GL_ALWAYS = 0x0207;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 0x0300;
    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int GL_SRC_ALPHA = 0x0302;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int GL_DST_ALPHA = 0x0304;
    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int GL_DST_COLOR = 0x0306;
    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 0x0400;
    public static final int GL_FRONT_RIGHT = 0x0401;
    public static final int GL_BACK_LEFT = 0x0402;
    public static final int GL_BACK_RIGHT = 0x0403;
    public static final int GL_FRONT = 0x0404;
    public static final int GL_BACK = 0x0405;
    public static final int GL_LEFT = 0x0406;
    public static final int GL_RIGHT = 0x0407;
    public static final int GL_FRONT_AND_BACK = 0x0408;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 0x0500;
    public static final int GL_INVALID_VALUE = 0x0501;
    public static final int GL_INVALID_OPERATION = 0x0502;
    public static final int GL_OUT_OF_MEMORY = 0x0505;
    public static final int GL_CW = 0x0900;
    public static final int GL_CCW = 0x0901;
    public static final int GL_POINT_SIZE = 0x0B11;
    public static final int GL_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_LINE_SMOOTH = 0x0B20;
    public static final int GL_LINE_WIDTH = 0x0B21;
    public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_POLYGON_MODE = 0x0B40;
    public static final int GL_POLYGON_SMOOTH = 0x0B41;
    public static final int GL_CULL_FACE = 0x0B44;
    public static final int GL_CULL_FACE_MODE = 0x0B45;
    public static final int GL_FRONT_FACE = 0x0B46;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_DEPTH_TEST = 0x0B71;
    public static final int GL_DEPTH_WRITEMASK = 0x0B72;
    public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int GL_DEPTH_FUNC = 0x0B74;
    public static final int GL_STENCIL_TEST = 0x0B90;
    public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int GL_STENCIL_FUNC = 0x0B92;
    public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
    public static final int GL_STENCIL_FAIL = 0x0B94;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int GL_STENCIL_REF = 0x0B97;
    public static final int GL_STENCIL_WRITEMASK = 0x0B98;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DITHER = 0x0BD0;
    public static final int GL_BLEND_DST = 0x0BE0;
    public static final int GL_BLEND_SRC = 0x0BE1;
    public static final int GL_BLEND = 0x0BE2;
    public static final int GL_LOGIC_OP_MODE = 0x0BF0;
    public static final int GL_DRAW_BUFFER = 0x0C01;
    public static final int GL_READ_BUFFER = 0x0C02;
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
    public static final int GL_COLOR_WRITEMASK = 0x0C23;
    public static final int GL_DOUBLEBUFFER = 0x0C32;
    public static final int GL_STEREO = 0x0C33;
    public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
    public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
    public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
    public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
    public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
    public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
    public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
    public static final int GL_PACK_SWAP_BYTES = 0x0D00;
    public static final int GL_PACK_LSB_FIRST = 0x0D01;
    public static final int GL_PACK_ROW_LENGTH = 0x0D02;
    public static final int GL_PACK_SKIP_ROWS = 0x0D03;
    public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
    public static final int GL_PACK_ALIGNMENT = 0x0D05;
    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int GL_SUBPIXEL_BITS = 0x0D50;
    public static final int GL_TEXTURE_1D = 0x0DE0;
    public static final int GL_TEXTURE_2D = 0x0DE1;
    public static final int GL_TEXTURE_WIDTH = 0x1000;
    public static final int GL_TEXTURE_HEIGHT = 0x1001;
    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
    public static final int GL_DONT_CARE = 0x1100;
    public static final int GL_FASTEST = 0x1101;
    public static final int GL_NICEST = 0x1102;
    public static final int GL_BYTE = 0x1400;
    public static final int GL_UNSIGNED_BYTE = 0x1401;
    public static final int GL_SHORT = 0x1402;
    public static final int GL_UNSIGNED_SHORT = 0x1403;
    public static final int GL_INT = 0x1404;
    public static final int GL_UNSIGNED_INT = 0x1405;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_CLEAR = 0x1500;
    public static final int GL_AND = 0x1501;
    public static final int GL_AND_REVERSE = 0x1502;
    public static final int GL_COPY = 0x1503;
    public static final int GL_AND_INVERTED = 0x1504;
    public static final int GL_NOOP = 0x1505;
    public static final int GL_XOR = 0x1506;
    public static final int GL_OR = 0x1507;
    public static final int GL_NOR = 0x1508;
    public static final int GL_EQUIV = 0x1509;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_OR_REVERSE = 0x150B;
    public static final int GL_COPY_INVERTED = 0x150C;
    public static final int GL_OR_INVERTED = 0x150D;
    public static final int GL_NAND = 0x150E;
    public static final int GL_SET = 0x150F;
    public static final int GL_TEXTURE = 0x1702;
    public static final int GL_COLOR = 0x1800;
    public static final int GL_DEPTH = 0x1801;
    public static final int GL_STENCIL = 0x1802;
    public static final int GL_STENCIL_INDEX = 0x1901;
    public static final int GL_DEPTH_COMPONENT = 0x1902;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RGB = 0x1907;
    public static final int GL_RGBA = 0x1908;
    public static final int GL_POINT = 0x1B00;
    public static final int GL_LINE = 0x1B01;
    public static final int GL_FILL = 0x1B02;
    public static final int GL_KEEP = 0x1E00;
    public static final int GL_REPLACE = 0x1E01;
    public static final int GL_INCR = 0x1E02;
    public static final int GL_DECR = 0x1E03;
    public static final int GL_VENDOR = 0x1F00;
    public static final int GL_RENDERER = 0x1F01;
    public static final int GL_VERSION = 0x1F02;
    public static final int GL_EXTENSIONS = 0x1F03;
    public static final int GL_NEAREST = 0x2600;
    public static final int GL_LINEAR = 0x2601;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
    public static final int GL_TEXTURE_WRAP_S = 0x2802;
    public static final int GL_TEXTURE_WRAP_T = 0x2803;
    public static final int GL_REPEAT = 0x2901;
    public static final MethodHandle MH_glCullFace = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFrontFace = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glHint = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glLineWidth = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glPointSize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glPolygonMode = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glScissor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glTexParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glTexParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glTexImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glDrawBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClear = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClearColor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glClearStencil = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glClearDepth = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glStencilMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glColorMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));
    public static final MethodHandle MH_glDepthMask = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
    public static final MethodHandle MH_glDisable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFinish = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public static final MethodHandle MH_glFlush = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public static final MethodHandle MH_glBlendFunc = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glLogicOp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glStencilFunc = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glStencilOp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDepthFunc = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glPixelStoref = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glPixelStorei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glReadBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glReadPixels = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetBooleanv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetDoublev = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetError = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetFloatv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetIntegerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetString = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetTexImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexLevelParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetTexLevelParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIsEnabled = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDepthRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glViewport = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCullFace;
    public final MemorySegment PFN_glFrontFace;
    public final MemorySegment PFN_glHint;
    public final MemorySegment PFN_glLineWidth;
    public final MemorySegment PFN_glPointSize;
    public final MemorySegment PFN_glPolygonMode;
    public final MemorySegment PFN_glScissor;
    public final MemorySegment PFN_glTexParameterf;
    public final MemorySegment PFN_glTexParameterfv;
    public final MemorySegment PFN_glTexParameteri;
    public final MemorySegment PFN_glTexParameteriv;
    public final MemorySegment PFN_glTexImage1D;
    public final MemorySegment PFN_glTexImage2D;
    public final MemorySegment PFN_glDrawBuffer;
    public final MemorySegment PFN_glClear;
    public final MemorySegment PFN_glClearColor;
    public final MemorySegment PFN_glClearStencil;
    public final MemorySegment PFN_glClearDepth;
    public final MemorySegment PFN_glStencilMask;
    public final MemorySegment PFN_glColorMask;
    public final MemorySegment PFN_glDepthMask;
    public final MemorySegment PFN_glDisable;
    public final MemorySegment PFN_glEnable;
    public final MemorySegment PFN_glFinish;
    public final MemorySegment PFN_glFlush;
    public final MemorySegment PFN_glBlendFunc;
    public final MemorySegment PFN_glLogicOp;
    public final MemorySegment PFN_glStencilFunc;
    public final MemorySegment PFN_glStencilOp;
    public final MemorySegment PFN_glDepthFunc;
    public final MemorySegment PFN_glPixelStoref;
    public final MemorySegment PFN_glPixelStorei;
    public final MemorySegment PFN_glReadBuffer;
    public final MemorySegment PFN_glReadPixels;
    public final MemorySegment PFN_glGetBooleanv;
    public final MemorySegment PFN_glGetDoublev;
    public final MemorySegment PFN_glGetError;
    public final MemorySegment PFN_glGetFloatv;
    public final MemorySegment PFN_glGetIntegerv;
    public final MemorySegment PFN_glGetString;
    public final MemorySegment PFN_glGetTexImage;
    public final MemorySegment PFN_glGetTexParameterfv;
    public final MemorySegment PFN_glGetTexParameteriv;
    public final MemorySegment PFN_glGetTexLevelParameterfv;
    public final MemorySegment PFN_glGetTexLevelParameteriv;
    public final MemorySegment PFN_glIsEnabled;
    public final MemorySegment PFN_glDepthRange;
    public final MemorySegment PFN_glViewport;

    public GL10(GLLoadFunc func) {
        PFN_glCullFace = func.invoke("glCullFace");
        PFN_glFrontFace = func.invoke("glFrontFace");
        PFN_glHint = func.invoke("glHint");
        PFN_glLineWidth = func.invoke("glLineWidth");
        PFN_glPointSize = func.invoke("glPointSize");
        PFN_glPolygonMode = func.invoke("glPolygonMode", "glPolygonModeNV");
        PFN_glScissor = func.invoke("glScissor");
        PFN_glTexParameterf = func.invoke("glTexParameterf");
        PFN_glTexParameterfv = func.invoke("glTexParameterfv");
        PFN_glTexParameteri = func.invoke("glTexParameteri");
        PFN_glTexParameteriv = func.invoke("glTexParameteriv");
        PFN_glTexImage1D = func.invoke("glTexImage1D");
        PFN_glTexImage2D = func.invoke("glTexImage2D");
        PFN_glDrawBuffer = func.invoke("glDrawBuffer");
        PFN_glClear = func.invoke("glClear");
        PFN_glClearColor = func.invoke("glClearColor");
        PFN_glClearStencil = func.invoke("glClearStencil");
        PFN_glClearDepth = func.invoke("glClearDepth");
        PFN_glStencilMask = func.invoke("glStencilMask");
        PFN_glColorMask = func.invoke("glColorMask");
        PFN_glDepthMask = func.invoke("glDepthMask");
        PFN_glDisable = func.invoke("glDisable");
        PFN_glEnable = func.invoke("glEnable");
        PFN_glFinish = func.invoke("glFinish");
        PFN_glFlush = func.invoke("glFlush");
        PFN_glBlendFunc = func.invoke("glBlendFunc");
        PFN_glLogicOp = func.invoke("glLogicOp");
        PFN_glStencilFunc = func.invoke("glStencilFunc");
        PFN_glStencilOp = func.invoke("glStencilOp");
        PFN_glDepthFunc = func.invoke("glDepthFunc");
        PFN_glPixelStoref = func.invoke("glPixelStoref");
        PFN_glPixelStorei = func.invoke("glPixelStorei");
        PFN_glReadBuffer = func.invoke("glReadBuffer");
        PFN_glReadPixels = func.invoke("glReadPixels");
        PFN_glGetBooleanv = func.invoke("glGetBooleanv");
        PFN_glGetDoublev = func.invoke("glGetDoublev");
        PFN_glGetError = func.invoke("glGetError");
        PFN_glGetFloatv = func.invoke("glGetFloatv");
        PFN_glGetIntegerv = func.invoke("glGetIntegerv");
        PFN_glGetString = func.invoke("glGetString");
        PFN_glGetTexImage = func.invoke("glGetTexImage");
        PFN_glGetTexParameterfv = func.invoke("glGetTexParameterfv");
        PFN_glGetTexParameteriv = func.invoke("glGetTexParameteriv");
        PFN_glGetTexLevelParameterfv = func.invoke("glGetTexLevelParameterfv");
        PFN_glGetTexLevelParameteriv = func.invoke("glGetTexLevelParameteriv");
        PFN_glIsEnabled = func.invoke("glIsEnabled");
        PFN_glDepthRange = func.invoke("glDepthRange");
        PFN_glViewport = func.invoke("glViewport");
    }

    public void CullFace(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glCullFace)) throw new SymbolNotFoundError("Symbol not found: glCullFace");
        try { MH_glCullFace.invokeExact(PFN_glCullFace, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glCullFace", e); }
    }

    public void FrontFace(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glFrontFace)) throw new SymbolNotFoundError("Symbol not found: glFrontFace");
        try { MH_glFrontFace.invokeExact(PFN_glFrontFace, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glFrontFace", e); }
    }

    public void Hint(@CType("GLenum") int target, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glHint)) throw new SymbolNotFoundError("Symbol not found: glHint");
        try { MH_glHint.invokeExact(PFN_glHint, target, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glHint", e); }
    }

    public void LineWidth(@CType("GLfloat") float width) {
        if (Unmarshal.isNullPointer(PFN_glLineWidth)) throw new SymbolNotFoundError("Symbol not found: glLineWidth");
        try { MH_glLineWidth.invokeExact(PFN_glLineWidth, width); }
        catch (Throwable e) { throw new RuntimeException("error in glLineWidth", e); }
    }

    public void PointSize(@CType("GLfloat") float size) {
        if (Unmarshal.isNullPointer(PFN_glPointSize)) throw new SymbolNotFoundError("Symbol not found: glPointSize");
        try { MH_glPointSize.invokeExact(PFN_glPointSize, size); }
        catch (Throwable e) { throw new RuntimeException("error in glPointSize", e); }
    }

    public void PolygonMode(@CType("GLenum") int face, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glPolygonMode)) throw new SymbolNotFoundError("Symbol not found: glPolygonMode");
        try { MH_glPolygonMode.invokeExact(PFN_glPolygonMode, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonMode", e); }
    }

    public void Scissor(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(PFN_glScissor)) throw new SymbolNotFoundError("Symbol not found: glScissor");
        try { MH_glScissor.invokeExact(PFN_glScissor, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glScissor", e); }
    }

    public void TexParameterf(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glTexParameterf)) throw new SymbolNotFoundError("Symbol not found: glTexParameterf");
        try { MH_glTexParameterf.invokeExact(PFN_glTexParameterf, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterf", e); }
    }

    public void TexParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glTexParameterfv)) throw new SymbolNotFoundError("Symbol not found: glTexParameterfv");
        try { MH_glTexParameterfv.invokeExact(PFN_glTexParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterfv", e); }
    }

    public void TexParameteri(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glTexParameteri)) throw new SymbolNotFoundError("Symbol not found: glTexParameteri");
        try { MH_glTexParameteri.invokeExact(PFN_glTexParameteri, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameteri", e); }
    }

    public void TexParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glTexParameteriv)) throw new SymbolNotFoundError("Symbol not found: glTexParameteriv");
        try { MH_glTexParameteriv.invokeExact(PFN_glTexParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameteriv", e); }
    }

    public void TexImage1D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glTexImage1D)) throw new SymbolNotFoundError("Symbol not found: glTexImage1D");
        try { MH_glTexImage1D.invokeExact(PFN_glTexImage1D, target, level, internalformat, width, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage1D", e); }
    }

    public void TexImage2D(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glTexImage2D)) throw new SymbolNotFoundError("Symbol not found: glTexImage2D");
        try { MH_glTexImage2D.invokeExact(PFN_glTexImage2D, target, level, internalformat, width, height, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTexImage2D", e); }
    }

    public void DrawBuffer(@CType("GLenum") int buf) {
        if (Unmarshal.isNullPointer(PFN_glDrawBuffer)) throw new SymbolNotFoundError("Symbol not found: glDrawBuffer");
        try { MH_glDrawBuffer.invokeExact(PFN_glDrawBuffer, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawBuffer", e); }
    }

    public void Clear(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(PFN_glClear)) throw new SymbolNotFoundError("Symbol not found: glClear");
        try { MH_glClear.invokeExact(PFN_glClear, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glClear", e); }
    }

    public void ClearColor(@CType("GLfloat") float red, @CType("GLfloat") float green, @CType("GLfloat") float blue, @CType("GLfloat") float alpha) {
        if (Unmarshal.isNullPointer(PFN_glClearColor)) throw new SymbolNotFoundError("Symbol not found: glClearColor");
        try { MH_glClearColor.invokeExact(PFN_glClearColor, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glClearColor", e); }
    }

    public void ClearStencil(@CType("GLint") int s) {
        if (Unmarshal.isNullPointer(PFN_glClearStencil)) throw new SymbolNotFoundError("Symbol not found: glClearStencil");
        try { MH_glClearStencil.invokeExact(PFN_glClearStencil, s); }
        catch (Throwable e) { throw new RuntimeException("error in glClearStencil", e); }
    }

    public void ClearDepth(@CType("GLdouble") double depth) {
        if (Unmarshal.isNullPointer(PFN_glClearDepth)) throw new SymbolNotFoundError("Symbol not found: glClearDepth");
        try { MH_glClearDepth.invokeExact(PFN_glClearDepth, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepth", e); }
    }

    public void StencilMask(@CType("GLuint") int mask) {
        if (Unmarshal.isNullPointer(PFN_glStencilMask)) throw new SymbolNotFoundError("Symbol not found: glStencilMask");
        try { MH_glStencilMask.invokeExact(PFN_glStencilMask, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilMask", e); }
    }

    public void ColorMask(@CType("GLboolean") boolean red, @CType("GLboolean") boolean green, @CType("GLboolean") boolean blue, @CType("GLboolean") boolean alpha) {
        if (Unmarshal.isNullPointer(PFN_glColorMask)) throw new SymbolNotFoundError("Symbol not found: glColorMask");
        try { MH_glColorMask.invokeExact(PFN_glColorMask, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glColorMask", e); }
    }

    public void DepthMask(@CType("GLboolean") boolean flag) {
        if (Unmarshal.isNullPointer(PFN_glDepthMask)) throw new SymbolNotFoundError("Symbol not found: glDepthMask");
        try { MH_glDepthMask.invokeExact(PFN_glDepthMask, flag); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthMask", e); }
    }

    public void Disable(@CType("GLenum") int cap) {
        if (Unmarshal.isNullPointer(PFN_glDisable)) throw new SymbolNotFoundError("Symbol not found: glDisable");
        try { MH_glDisable.invokeExact(PFN_glDisable, cap); }
        catch (Throwable e) { throw new RuntimeException("error in glDisable", e); }
    }

    public void Enable(@CType("GLenum") int cap) {
        if (Unmarshal.isNullPointer(PFN_glEnable)) throw new SymbolNotFoundError("Symbol not found: glEnable");
        try { MH_glEnable.invokeExact(PFN_glEnable, cap); }
        catch (Throwable e) { throw new RuntimeException("error in glEnable", e); }
    }

    public void Finish() {
        if (Unmarshal.isNullPointer(PFN_glFinish)) throw new SymbolNotFoundError("Symbol not found: glFinish");
        try { MH_glFinish.invokeExact(PFN_glFinish); }
        catch (Throwable e) { throw new RuntimeException("error in glFinish", e); }
    }

    public void Flush() {
        if (Unmarshal.isNullPointer(PFN_glFlush)) throw new SymbolNotFoundError("Symbol not found: glFlush");
        try { MH_glFlush.invokeExact(PFN_glFlush); }
        catch (Throwable e) { throw new RuntimeException("error in glFlush", e); }
    }

    public void BlendFunc(@CType("GLenum") int sfactor, @CType("GLenum") int dfactor) {
        if (Unmarshal.isNullPointer(PFN_glBlendFunc)) throw new SymbolNotFoundError("Symbol not found: glBlendFunc");
        try { MH_glBlendFunc.invokeExact(PFN_glBlendFunc, sfactor, dfactor); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFunc", e); }
    }

    public void LogicOp(@CType("GLenum") int opcode) {
        if (Unmarshal.isNullPointer(PFN_glLogicOp)) throw new SymbolNotFoundError("Symbol not found: glLogicOp");
        try { MH_glLogicOp.invokeExact(PFN_glLogicOp, opcode); }
        catch (Throwable e) { throw new RuntimeException("error in glLogicOp", e); }
    }

    public void StencilFunc(@CType("GLenum") int func, @CType("GLint") int ref, @CType("GLuint") int mask) {
        if (Unmarshal.isNullPointer(PFN_glStencilFunc)) throw new SymbolNotFoundError("Symbol not found: glStencilFunc");
        try { MH_glStencilFunc.invokeExact(PFN_glStencilFunc, func, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilFunc", e); }
    }

    public void StencilOp(@CType("GLenum") int fail, @CType("GLenum") int zfail, @CType("GLenum") int zpass) {
        if (Unmarshal.isNullPointer(PFN_glStencilOp)) throw new SymbolNotFoundError("Symbol not found: glStencilOp");
        try { MH_glStencilOp.invokeExact(PFN_glStencilOp, fail, zfail, zpass); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilOp", e); }
    }

    public void DepthFunc(@CType("GLenum") int func) {
        if (Unmarshal.isNullPointer(PFN_glDepthFunc)) throw new SymbolNotFoundError("Symbol not found: glDepthFunc");
        try { MH_glDepthFunc.invokeExact(PFN_glDepthFunc, func); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthFunc", e); }
    }

    public void PixelStoref(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glPixelStoref)) throw new SymbolNotFoundError("Symbol not found: glPixelStoref");
        try { MH_glPixelStoref.invokeExact(PFN_glPixelStoref, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelStoref", e); }
    }

    public void PixelStorei(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glPixelStorei)) throw new SymbolNotFoundError("Symbol not found: glPixelStorei");
        try { MH_glPixelStorei.invokeExact(PFN_glPixelStorei, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelStorei", e); }
    }

    public void ReadBuffer(@CType("GLenum") int src) {
        if (Unmarshal.isNullPointer(PFN_glReadBuffer)) throw new SymbolNotFoundError("Symbol not found: glReadBuffer");
        try { MH_glReadBuffer.invokeExact(PFN_glReadBuffer, src); }
        catch (Throwable e) { throw new RuntimeException("error in glReadBuffer", e); }
    }

    public void ReadPixels(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glReadPixels)) throw new SymbolNotFoundError("Symbol not found: glReadPixels");
        try { MH_glReadPixels.invokeExact(PFN_glReadPixels, x, y, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glReadPixels", e); }
    }

    public void GetBooleanv(@CType("GLenum") int pname, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(PFN_glGetBooleanv)) throw new SymbolNotFoundError("Symbol not found: glGetBooleanv");
        try { MH_glGetBooleanv.invokeExact(PFN_glGetBooleanv, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetBooleanv", e); }
    }

    public void GetDoublev(@CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(PFN_glGetDoublev)) throw new SymbolNotFoundError("Symbol not found: glGetDoublev");
        try { MH_glGetDoublev.invokeExact(PFN_glGetDoublev, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoublev", e); }
    }

    public @CType("GLenum") int GetError() {
        if (Unmarshal.isNullPointer(PFN_glGetError)) throw new SymbolNotFoundError("Symbol not found: glGetError");
        try { return (int) MH_glGetError.invokeExact(PFN_glGetError); }
        catch (Throwable e) { throw new RuntimeException("error in glGetError", e); }
    }

    public void GetFloatv(@CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(PFN_glGetFloatv)) throw new SymbolNotFoundError("Symbol not found: glGetFloatv");
        try { MH_glGetFloatv.invokeExact(PFN_glGetFloatv, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloatv", e); }
    }

    public void GetIntegerv(@CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(PFN_glGetIntegerv)) throw new SymbolNotFoundError("Symbol not found: glGetIntegerv");
        try { MH_glGetIntegerv.invokeExact(PFN_glGetIntegerv, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerv", e); }
    }

    public @CType("const GLubyte *") java.lang.foreign.MemorySegment GetString(@CType("GLenum") int name) {
        if (Unmarshal.isNullPointer(PFN_glGetString)) throw new SymbolNotFoundError("Symbol not found: glGetString");
        try { return (java.lang.foreign.MemorySegment) MH_glGetString.invokeExact(PFN_glGetString, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetString", e); }
    }

    public void GetTexImage(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(PFN_glGetTexImage)) throw new SymbolNotFoundError("Symbol not found: glGetTexImage");
        try { MH_glGetTexImage.invokeExact(PFN_glGetTexImage, target, level, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexImage", e); }
    }

    public void GetTexParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameterfv");
        try { MH_glGetTexParameterfv.invokeExact(PFN_glGetTexParameterfv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterfv", e); }
    }

    public void GetTexParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTexParameteriv");
        try { MH_glGetTexParameteriv.invokeExact(PFN_glGetTexParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameteriv", e); }
    }

    public void GetTexLevelParameterfv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexLevelParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTexLevelParameterfv");
        try { MH_glGetTexLevelParameterfv.invokeExact(PFN_glGetTexLevelParameterfv, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexLevelParameterfv", e); }
    }

    public void GetTexLevelParameteriv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetTexLevelParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTexLevelParameteriv");
        try { MH_glGetTexLevelParameteriv.invokeExact(PFN_glGetTexLevelParameteriv, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexLevelParameteriv", e); }
    }

    public @CType("GLboolean") boolean IsEnabled(@CType("GLenum") int cap) {
        if (Unmarshal.isNullPointer(PFN_glIsEnabled)) throw new SymbolNotFoundError("Symbol not found: glIsEnabled");
        try { return (boolean) MH_glIsEnabled.invokeExact(PFN_glIsEnabled, cap); }
        catch (Throwable e) { throw new RuntimeException("error in glIsEnabled", e); }
    }

    public void DepthRange(@CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (Unmarshal.isNullPointer(PFN_glDepthRange)) throw new SymbolNotFoundError("Symbol not found: glDepthRange");
        try { MH_glDepthRange.invokeExact(PFN_glDepthRange, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRange", e); }
    }

    public void Viewport(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(PFN_glViewport)) throw new SymbolNotFoundError("Symbol not found: glViewport");
        try { MH_glViewport.invokeExact(PFN_glViewport, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glViewport", e); }
    }

    // --- OverrunGL custom code ---
    public boolean GetBooleanv(@CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.bytes((byte) 0); GetBooleanv(pname, p); return p.get(ValueLayout.JAVA_BOOLEAN, 0); } }
    public double GetDoublev(@CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.doubles(0); GetDoublev(pname, p); return p.get(ValueLayout.JAVA_DOUBLE, 0); } }
    public float GetFloatv(@CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.floats(0); GetFloatv(pname, p); return p.get(ValueLayout.JAVA_FLOAT, 0); } }
    public int GetIntegerv(@CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetIntegerv(pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public String GetString_(@CType("GLenum") int pname) { return Unmarshal.unmarshalAsString(GetString(pname)); }
    public float GetTexParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.floats(0); GetTexParameterfv(target, pname, p); return p.get(ValueLayout.JAVA_FLOAT, 0); } }
    public int GetTexParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetTexParameteriv(target, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public float GetTexLevelParameterfv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.floats(0); GetTexLevelParameterfv(target, level, pname, p); return p.get(ValueLayout.JAVA_FLOAT, 0); } }
    public int GetTexLevelParameteriv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetTexLevelParameteriv(target, level, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
