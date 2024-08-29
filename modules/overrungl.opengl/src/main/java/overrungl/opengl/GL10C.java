/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.opengl;

import io.github.overrun.memstack.MemoryStack;
import org.jetbrains.annotations.Nullable;
import overrun.marshal.DirectAccess;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.SizedSeg;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 1.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL10C extends DirectAccess {
    int DEPTH_BUFFER_BIT = 0x00000100;
    int STENCIL_BUFFER_BIT = 0x00000400;
    int COLOR_BUFFER_BIT = 0x00004000;
    int FALSE = 0;
    int TRUE = 1;
    int POINTS = 0x0000;
    int LINES = 0x0001;
    int LINE_LOOP = 0x0002;
    int LINE_STRIP = 0x0003;
    int TRIANGLES = 0x0004;
    int TRIANGLE_STRIP = 0x0005;
    int TRIANGLE_FAN = 0x0006;
    int QUADS = 0x0007;
    int NEVER = 0x0200;
    int LESS = 0x0201;
    int EQUAL = 0x0202;
    int LEQUAL = 0x0203;
    int GREATER = 0x0204;
    int NOTEQUAL = 0x0205;
    int GEQUAL = 0x0206;
    int ALWAYS = 0x0207;
    int ZERO = 0;
    int ONE = 1;
    int SRC_COLOR = 0x0300;
    int ONE_MINUS_SRC_COLOR = 0x0301;
    int SRC_ALPHA = 0x0302;
    int ONE_MINUS_SRC_ALPHA = 0x0303;
    int DST_ALPHA = 0x0304;
    int ONE_MINUS_DST_ALPHA = 0x0305;
    int DST_COLOR = 0x0306;
    int ONE_MINUS_DST_COLOR = 0x0307;
    int SRC_ALPHA_SATURATE = 0x0308;
    int NONE = 0;
    int FRONT_LEFT = 0x0400;
    int FRONT_RIGHT = 0x0401;
    int BACK_LEFT = 0x0402;
    int BACK_RIGHT = 0x0403;
    int FRONT = 0x0404;
    int BACK = 0x0405;
    int LEFT = 0x0406;
    int RIGHT = 0x0407;
    int FRONT_AND_BACK = 0x0408;
    int NO_ERROR = 0;
    int INVALID_ENUM = 0x0500;
    int INVALID_VALUE = 0x0501;
    int INVALID_OPERATION = 0x0502;
    int OUT_OF_MEMORY = 0x0505;
    int CW = 0x0900;
    int CCW = 0x0901;
    int POINT_SIZE = 0x0B11;
    int POINT_SIZE_RANGE = 0x0B12;
    int POINT_SIZE_GRANULARITY = 0x0B13;
    int LINE_SMOOTH = 0x0B20;
    int LINE_WIDTH = 0x0B21;
    int LINE_WIDTH_RANGE = 0x0B22;
    int LINE_WIDTH_GRANULARITY = 0x0B23;
    int POLYGON_MODE = 0x0B40;
    int POLYGON_SMOOTH = 0x0B41;
    int CULL_FACE = 0x0B44;
    int CULL_FACE_MODE = 0x0B45;
    int FRONT_FACE = 0x0B46;
    int DEPTH_RANGE = 0x0B70;
    int DEPTH_TEST = 0x0B71;
    int DEPTH_WRITEMASK = 0x0B72;
    int DEPTH_CLEAR_VALUE = 0x0B73;
    int DEPTH_FUNC = 0x0B74;
    int STENCIL_TEST = 0x0B90;
    int STENCIL_CLEAR_VALUE = 0x0B91;
    int STENCIL_FUNC = 0x0B92;
    int STENCIL_VALUE_MASK = 0x0B93;
    int STENCIL_FAIL = 0x0B94;
    int STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    int STENCIL_PASS_DEPTH_PASS = 0x0B96;
    int STENCIL_REF = 0x0B97;
    int STENCIL_WRITEMASK = 0x0B98;
    int VIEWPORT = 0x0BA2;
    int DITHER = 0x0BD0;
    int BLEND_DST = 0x0BE0;
    int BLEND_SRC = 0x0BE1;
    int BLEND = 0x0BE2;
    int LOGIC_OP_MODE = 0x0BF0;
    int DRAW_BUFFER = 0x0C01;
    int READ_BUFFER = 0x0C02;
    int SCISSOR_BOX = 0x0C10;
    int SCISSOR_TEST = 0x0C11;
    int COLOR_CLEAR_VALUE = 0x0C22;
    int COLOR_WRITEMASK = 0x0C23;
    int DOUBLEBUFFER = 0x0C32;
    int STEREO = 0x0C33;
    int LINE_SMOOTH_HINT = 0x0C52;
    int POLYGON_SMOOTH_HINT = 0x0C53;
    int UNPACK_SWAP_BYTES = 0x0CF0;
    int UNPACK_LSB_FIRST = 0x0CF1;
    int UNPACK_ROW_LENGTH = 0x0CF2;
    int UNPACK_SKIP_ROWS = 0x0CF3;
    int UNPACK_SKIP_PIXELS = 0x0CF4;
    int UNPACK_ALIGNMENT = 0x0CF5;
    int PACK_SWAP_BYTES = 0x0D00;
    int PACK_LSB_FIRST = 0x0D01;
    int PACK_ROW_LENGTH = 0x0D02;
    int PACK_SKIP_ROWS = 0x0D03;
    int PACK_SKIP_PIXELS = 0x0D04;
    int PACK_ALIGNMENT = 0x0D05;
    int MAX_TEXTURE_SIZE = 0x0D33;
    int MAX_VIEWPORT_DIMS = 0x0D3A;
    int SUBPIXEL_BITS = 0x0D50;
    int TEXTURE_1D = 0x0DE0;
    int TEXTURE_2D = 0x0DE1;
    int TEXTURE_WIDTH = 0x1000;
    int TEXTURE_HEIGHT = 0x1001;
    int TEXTURE_BORDER_COLOR = 0x1004;
    int DONT_CARE = 0x1100;
    int FASTEST = 0x1101;
    int NICEST = 0x1102;
    int BYTE = 0x1400;
    int UNSIGNED_BYTE = 0x1401;
    int SHORT = 0x1402;
    int UNSIGNED_SHORT = 0x1403;
    int INT = 0x1404;
    int UNSIGNED_INT = 0x1405;
    int FLOAT = 0x1406;
    int STACK_OVERFLOW = 0x0503;
    int STACK_UNDERFLOW = 0x0504;
    int CLEAR = 0x1500;
    int AND = 0x1501;
    int AND_REVERSE = 0x1502;
    int COPY = 0x1503;
    int AND_INVERTED = 0x1504;
    int NOOP = 0x1505;
    int XOR = 0x1506;
    int OR = 0x1507;
    int NOR = 0x1508;
    int EQUIV = 0x1509;
    int INVERT = 0x150A;
    int OR_REVERSE = 0x150B;
    int COPY_INVERTED = 0x150C;
    int OR_INVERTED = 0x150D;
    int NAND = 0x150E;
    int SET = 0x150F;
    int TEXTURE = 0x1702;
    int COLOR = 0x1800;
    int DEPTH = 0x1801;
    int STENCIL = 0x1802;
    int STENCIL_INDEX = 0x1901;
    int DEPTH_COMPONENT = 0x1902;
    int RED = 0x1903;
    int GREEN = 0x1904;
    int BLUE = 0x1905;
    int ALPHA = 0x1906;
    int RGB = 0x1907;
    int RGBA = 0x1908;
    int POINT = 0x1B00;
    int LINE = 0x1B01;
    int FILL = 0x1B02;
    int KEEP = 0x1E00;
    int REPLACE = 0x1E01;
    int INCR = 0x1E02;
    int DECR = 0x1E03;
    int VENDOR = 0x1F00;
    int RENDERER = 0x1F01;
    int VERSION = 0x1F02;
    int EXTENSIONS = 0x1F03;
    int NEAREST = 0x2600;
    int LINEAR = 0x2601;
    int NEAREST_MIPMAP_NEAREST = 0x2700;
    int LINEAR_MIPMAP_NEAREST = 0x2701;
    int NEAREST_MIPMAP_LINEAR = 0x2702;
    int LINEAR_MIPMAP_LINEAR = 0x2703;
    int TEXTURE_MAG_FILTER = 0x2800;
    int TEXTURE_MIN_FILTER = 0x2801;
    int TEXTURE_WRAP_S = 0x2802;
    int TEXTURE_WRAP_T = 0x2803;
    int REPEAT = 0x2901;

    @Entrypoint("glBlendFunc")
    default void blendFunc(int sfactor, int dfactor) {
        throw new ContextException();
    }

    @Entrypoint("glClear")
    default void clear(int mask) {
        throw new ContextException();
    }

    @Entrypoint("glClearColor")
    default void clearColor(float red, float green, float blue, float alpha) {
        throw new ContextException();
    }

    @Entrypoint("glClearDepth")
    default void clearDepth(double depth) {
        throw new ContextException();
    }

    @Entrypoint("glClearStencil")
    default void clearStencil(int s) {
        throw new ContextException();
    }

    @Entrypoint("glColorMask")
    default void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        throw new ContextException();
    }

    @Entrypoint("glCullFace")
    default void cullFace(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glDepthFunc")
    default void depthFunc(int func) {
        throw new ContextException();
    }

    @Entrypoint("glDepthMask")
    default void depthMask(boolean flag) {
        throw new ContextException();
    }

    @Entrypoint("glDepthRange")
    default void depthRange(double n, double f) {
        throw new ContextException();
    }

    @Entrypoint("glDisable")
    default void disable(int cap) {
        throw new ContextException();
    }

    @Entrypoint("glDrawBuffer")
    default void drawBuffer(int buf) {
        throw new ContextException();
    }

    @Entrypoint("glEnable")
    default void enable(int cap) {
        throw new ContextException();
    }

    @Entrypoint("glFinish")
    default void finish() {
        throw new ContextException();
    }

    @Entrypoint("glFlush")
    default void flush() {
        throw new ContextException();
    }

    @Entrypoint("glFrontFace")
    default void frontFace(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glGetBooleanv")
    default void getBooleanv(int pname, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetBooleanv")
    default void getBooleanv(SegmentAllocator allocator, int pname, @Ref boolean[] data) {
        throw new ContextException();
    }

    @Skip
    default boolean getBooleanv(int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pData = stack.allocate(JAVA_BOOLEAN);
            getBooleanv(pname, pData);
            return pData.get(JAVA_BOOLEAN, 0);
        }
    }

    @Entrypoint("glGetDoublev")
    default void getDoublev(int pname, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetDoublev")
    default void getDoublev(SegmentAllocator allocator, int pname, @Ref double[] data) {
        throw new ContextException();
    }

    @Skip
    default double getDoublev(int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pData = stack.allocate(JAVA_DOUBLE);
            getDoublev(pname, pData);
            return pData.get(JAVA_DOUBLE, 0);
        }
    }

    @Entrypoint("glGetError")
    default int getError() {
        throw new ContextException();
    }

    @Entrypoint("glGetFloatv")
    default void getFloatv(int pname, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetFloatv")
    default void getFloatv(SegmentAllocator allocator, int pname, @Ref float[] data) {
        throw new ContextException();
    }

    @Skip
    default float getFloatv(int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pData = stack.allocate(JAVA_FLOAT);
            getFloatv(pname, pData);
            return pData.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetIntegerv")
    default void getIntegerv(int pname, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetIntegerv")
    default void getIntegerv(SegmentAllocator allocator, int pname, @Ref int[] data) {
        throw new ContextException();
    }

    @Skip
    default int getIntegerv(int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pData = stack.allocate(JAVA_INT);
            getIntegerv(pname, pData);
            return pData.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetString")
    default MemorySegment ngetString(int name) {
        throw new ContextException();
    }

    @Entrypoint("glGetString")
    @Nullable
    @SizedSeg(Unmarshal.STR_SIZE)
    default String getString(int name) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexImage")
    default void getTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexLevelParameterfv")
    default void getTexLevelParameterfv(int target, int level, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexLevelParameterfv")
    default void getTexLevelParameterfv(SegmentAllocator allocator, int target, int level, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getTexLevelParameterfv(int target, int level, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getTexLevelParameterfv(target, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetTexLevelParameteriv")
    default void getTexLevelParameteriv(int target, int level, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexLevelParameteriv")
    default void getTexLevelParameteriv(SegmentAllocator allocator, int target, int level, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTexLevelParameteriv(int target, int level, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getTexLevelParameteriv(target, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTexParameterfv")
    default void getTexParameterfv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexParameterfv")
    default void getTexParameterfv(SegmentAllocator allocator, int target, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getTexParameterfv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getTexParameterfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetTexParameteriv")
    default void getTexParameteriv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexParameteriv")
    default void getTexParameteriv(SegmentAllocator allocator, int target, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTexParameteriv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getTexParameteriv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glHint")
    default void hint(int target, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glIsEnabled")
    default boolean isEnabled(int cap) {
        throw new ContextException();
    }

    @Entrypoint("glLineWidth")
    default void lineWidth(float width) {
        throw new ContextException();
    }

    @Entrypoint("glLogicOp")
    default void logicOp(int opcode) {
        throw new ContextException();
    }

    @Entrypoint("glPixelStoref")
    default void pixelStoref(int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glPixelStorei")
    default void pixelStorei(int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glPointSize")
    default void pointSize(float size) {
        throw new ContextException();
    }

    @Entrypoint("glPolygonMode")
    default void polygonMode(int face, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glReadBuffer")
    default void readBuffer(int src) {
        throw new ContextException();
    }

    @Entrypoint("glReadPixels")
    default void readPixels(int x, int y, int width, int height, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glReadPixels")
    default void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glReadPixels")
    default void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glReadPixels")
    default void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glReadPixels")
    default void readPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glScissor")
    default void scissor(int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glStencilFunc")
    default void stencilFunc(int func, int ref, int mask) {
        throw new ContextException();
    }

    @Entrypoint("glStencilMask")
    default void stencilMask(int mask) {
        throw new ContextException();
    }

    @Entrypoint("glStencilOp")
    default void stencilOp(int fail, int zfail, int zpass) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage1D")
    default void texImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage1D")
    default void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage1D")
    default void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage1D")
    default void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage1D")
    default void texImage1D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int border, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2D")
    default void texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2D")
    default void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2D")
    default void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2D")
    default void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2D")
    default void texImage2D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int border, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterf")
    default void texParameterf(int target, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterfv")
    default void texParameterfv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterfv")
    default void texParameterfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameteri")
    default void texParameteri(int target, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameteriv")
    default void texParameteriv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameteriv")
    default void texParameteriv(SegmentAllocator allocator, int target, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glViewport")
    default void viewport(int x, int y, int width, int height) {
        throw new ContextException();
    }
}
