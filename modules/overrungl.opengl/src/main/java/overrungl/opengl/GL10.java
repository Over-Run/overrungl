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
import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 1.0 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL10 extends DirectAccess {
    @Entrypoint("glAccum")
    default void accum(int op, float value) {
        throw new ContextException();
    }

    @Entrypoint("glAlphaFunc")
    default void alphaFunc(int func, float ref) {
        throw new ContextException();
    }

    @Entrypoint("glBegin")
    default void begin(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glBitmap")
    default void bitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, MemorySegment bitmap) {
        throw new ContextException();
    }

    @Entrypoint("glCallList")
    default void callList(int list) {
        throw new ContextException();
    }

    @Entrypoint("glCallLists")
    default void callLists(int n, int type, MemorySegment lists) {
        throw new ContextException();
    }

    @Entrypoint("glClearAccum")
    default void clearAccum(float red, float green, float blue, float alpha) {
        throw new ContextException();
    }

    @Entrypoint("glClearIndex")
    default void clearIndex(float c) {
        throw new ContextException();
    }

    @Entrypoint("glClipPlane")
    default void clipPlane(int plane, MemorySegment equation) {
        throw new ContextException();
    }

    @Entrypoint("glClipPlane")
    default void clipPlane(SegmentAllocator allocator, int plane, double[] equation) {
        throw new ContextException();
    }

    @Entrypoint("glColor3b")
    default void color3b(byte red, byte green, byte blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3bv")
    default void color3bv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3bv")
    default void color3bv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3d")
    default void color3d(double red, double green, double blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3dv")
    default void color3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3dv")
    default void color3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3f")
    default void color3f(float red, float green, float blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3fv")
    default void color3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3fv")
    default void color3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3i")
    default void color3i(int red, int green, int blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3iv")
    default void color3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3iv")
    default void color3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3s")
    default void color3s(short red, short green, short blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3sv")
    default void color3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3sv")
    default void color3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3ub")
    default void color3ub(byte red, byte green, byte blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3ubv")
    default void color3ubv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3ubv")
    default void color3ubv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3ui")
    default void color3ui(int red, int green, int blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3uiv")
    default void color3uiv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3uiv")
    default void color3uiv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3us")
    default void color3us(short red, short green, short blue) {
        throw new ContextException();
    }

    @Entrypoint("glColor3usv")
    default void color3usv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor3usv")
    default void color3usv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4b")
    default void color4b(byte red, byte green, byte blue, byte alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4bv")
    default void color4bv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4bv")
    default void color4bv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4d")
    default void color4d(double red, double green, double blue, double alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4dv")
    default void color4dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4dv")
    default void color4dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4f")
    default void color4f(float red, float green, float blue, float alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4fv")
    default void color4fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4fv")
    default void color4fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4i")
    default void color4i(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4iv")
    default void color4iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4iv")
    default void color4iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4s")
    default void color4s(short red, short green, short blue, short alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4sv")
    default void color4sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4sv")
    default void color4sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4ub")
    default void color4ub(byte red, byte green, byte blue, byte alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4ubv")
    default void color4ubv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4ubv")
    default void color4ubv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4ui")
    default void color4ui(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4uiv")
    default void color4uiv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4uiv")
    default void color4uiv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4us")
    default void color4us(short red, short green, short blue, short alpha) {
        throw new ContextException();
    }

    @Entrypoint("glColor4usv")
    default void color4usv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glColor4usv")
    default void color4usv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glColorMaterial")
    default void colorMaterial(int face, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glCopyPixels")
    default void copyPixels(int x, int y, int width, int height, int type) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteLists")
    default void deleteLists(int list, int range) {
        throw new ContextException();
    }

    @Entrypoint("glDrawPixels")
    default void drawPixels(int width, int height, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glEdgeFlag")
    default void edgeFlag(boolean flag) {
        throw new ContextException();
    }

    @Entrypoint("glEdgeFlagv")
    default void edgeFlagv(MemorySegment flag) {
        throw new ContextException();
    }

    @Entrypoint("glEdgeFlagv")
    default void edgeFlagv(SegmentAllocator allocator, boolean[] flag) {
        throw new ContextException();
    }

    @Entrypoint("glEnd")
    default void end() {
        throw new ContextException();
    }

    @Entrypoint("glEndList")
    default void endList() {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1d")
    default void evalCoord1d(double u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1dv")
    default void evalCoord1dv(MemorySegment u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1dv")
    default void evalCoord1dv(SegmentAllocator allocator, double[] u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1f")
    default void evalCoord1f(float u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1fv")
    default void evalCoord1fv(MemorySegment u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord1fv")
    default void evalCoord1fv(SegmentAllocator allocator, float[] u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2d")
    default void evalCoord2d(double u, double v) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2dv")
    default void evalCoord2dv(MemorySegment u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2dv")
    default void evalCoord2dv(SegmentAllocator allocator, double[] u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2f")
    default void evalCoord2f(float u, float v) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2fv")
    default void evalCoord2fv(MemorySegment u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalCoord2fv")
    default void evalCoord2fv(SegmentAllocator allocator, float[] u) {
        throw new ContextException();
    }

    @Entrypoint("glEvalMesh1")
    default void evalMesh1(int mode, int i1, int i2) {
        throw new ContextException();
    }

    @Entrypoint("glEvalMesh2")
    default void evalMesh2(int mode, int i1, int i2, int j1, int j2) {
        throw new ContextException();
    }

    @Entrypoint("glEvalPoint1")
    default void evalPoint1(int mode, int i) {
        throw new ContextException();
    }

    @Entrypoint("glEvalPoint2")
    default void evalPoint2(int mode, int i, int j) {
        throw new ContextException();
    }

    @Entrypoint("glFeedbackBuffer")
    default void feedbackBuffer(int size, int type, MemorySegment buffer) {
        throw new ContextException();
    }

    @Entrypoint("glFeedbackBuffer")
    default void feedbackBuffer(SegmentAllocator allocator, int type, @Ref float[] buffer) {
        throw new ContextException();
    }

    @Entrypoint("glFogf")
    default void fogf(int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glFogfv")
    default void fogfv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glFogfv")
    default void fogfv(SegmentAllocator allocator, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glFogi")
    default void fogi(int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glFogiv")
    default void fogiv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glFogiv")
    default void fogiv(SegmentAllocator allocator, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glFrustum")
    default void frustum(double left, double right, double bottom, double top, double zNear, double zFar) {
        throw new ContextException();
    }

    @Entrypoint("glGenLists")
    default int genLists(int range) {
        throw new ContextException();
    }

    @Entrypoint("glGetClipPlane")
    default void getClipPlane(int plane, MemorySegment equation) {
        throw new ContextException();
    }

    @Skip
    default double[] getClipPlane(int plane) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pEq = stack.allocate(JAVA_DOUBLE, 4);
            getClipPlane(plane, pEq);
            return Unmarshal.unmarshalAsDoubleArray(pEq);
        }
    }

    @Entrypoint("glGetLightfv")
    default void getLightfv(int light, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetLightfv")
    default void getLightfv(SegmentAllocator allocator, int light, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getLightfv(int light, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getLightfv(light, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetLightiv")
    default void getLightiv(int light, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetLightiv")
    default void getLightiv(SegmentAllocator allocator, int light, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getLightiv(int light, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getLightiv(light, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetMapdv")
    default void getMapdv(int target, int query, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glGetMapdv")
    default void getMapdv(SegmentAllocator allocator, int target, int query, @Ref double[] v) {
        throw new ContextException();
    }

    @Skip
    default double getMapdv(int target, int query) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pv = stack.allocate(JAVA_DOUBLE);
            getMapdv(target, query, pv);
            return pv.get(JAVA_DOUBLE, 0);
        }
    }

    @Entrypoint("glGetMapfv")
    default void getMapfv(int target, int query, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glGetMapfv")
    default void getMapfv(SegmentAllocator allocator, int target, int query, @Ref float[] v) {
        throw new ContextException();
    }

    @Skip
    default float getMapfv(int target, int query) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pv = stack.allocate(JAVA_FLOAT);
            getMapfv(target, query, pv);
            return pv.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetMapiv")
    default void getMapiv(int target, int query, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glGetMapiv")
    default void getMapiv(SegmentAllocator allocator, int target, int query, @Ref int[] v) {
        throw new ContextException();
    }

    @Skip
    default int getMapiv(int target, int query) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pv = stack.allocate(JAVA_INT);
            getMapiv(target, query, pv);
            return pv.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetMaterialfv")
    default void getMaterialfv(int face, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetMaterialfv")
    default void getMaterialfv(SegmentAllocator allocator, int face, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getMaterialfv(int face, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getMaterialfv(face, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetMaterialiv")
    default void getMaterialiv(int face, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetMaterialiv")
    default void getMaterialiv(SegmentAllocator allocator, int face, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getMaterialiv(int face, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getMaterialiv(face, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetPixelMapfv")
    default void getPixelMapfv(int map, MemorySegment values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPixelMapfv")
    default void getPixelMapfv(SegmentAllocator allocator, int map, @Ref float[] values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPixelMapuiv")
    default void getPixelMapuiv(int map, MemorySegment values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPixelMapuiv")
    default void getPixelMapuiv(SegmentAllocator allocator, int map, @Ref int[] values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPixelMapusv")
    default void getPixelMapusv(int map, MemorySegment values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPixelMapusv")
    default void getPixelMapusv(SegmentAllocator allocator, int map, @Ref short[] values) {
        throw new ContextException();
    }

    @Entrypoint("glGetPolygonStipple")
    default void getPolygonStipple(MemorySegment mask) {
        throw new ContextException();
    }

    @Entrypoint("glGetPolygonStipple")
    default void getPolygonStipple(SegmentAllocator allocator, @Ref byte[] mask) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexEnvfv")
    default void getTexEnvfv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexEnvfv")
    default void getTexEnvfv(SegmentAllocator allocator, int target, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getTexEnvfv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getTexEnvfv(target, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetTexEnviv")
    default void getTexEnviv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexEnviv")
    default void getTexEnviv(SegmentAllocator allocator, int target, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTexEnviv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getTexEnviv(target, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTexGendv")
    default void getTexGendv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexGendv")
    default void getTexGendv(SegmentAllocator allocator, int coord, int pname, @Ref double[] params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexGenfv")
    default void getTexGenfv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexGenfv")
    default void getTexGenfv(SegmentAllocator allocator, int coord, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexGeniv")
    default void getTexGeniv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexGeniv")
    default void getTexGeniv(SegmentAllocator allocator, int coord, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glIndexMask")
    default void indexMask(int mask) {
        throw new ContextException();
    }

    @Entrypoint("glIndexd")
    default void indexd(double c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexdv")
    default void indexdv(MemorySegment c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexdv")
    default void indexdv(SegmentAllocator allocator, double[] c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexf")
    default void indexf(float c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexfv")
    default void indexfv(MemorySegment c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexfv")
    default void indexfv(SegmentAllocator allocator, float[] c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexi")
    default void indexi(int c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexiv")
    default void indexiv(MemorySegment c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexiv")
    default void indexiv(SegmentAllocator allocator, int[] c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexs")
    default void indexs(short c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexsv")
    default void indexsv(MemorySegment c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexsv")
    default void indexsv(SegmentAllocator allocator, short[] c) {
        throw new ContextException();
    }

    @Entrypoint("glInitNames")
    default void initNames() {
        throw new ContextException();
    }

    @Entrypoint("glIsList")
    default boolean isList(int list) {
        throw new ContextException();
    }

    @Entrypoint("glLightModelf")
    default void lightModelf(int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glLightModelfv")
    default void lightModelfv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glLightModelfv")
    default void lightModelfv(SegmentAllocator allocator, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glLightModeli")
    default void lightModeli(int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glLightModeliv")
    default void lightModeliv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glLightModeliv")
    default void lightModeliv(SegmentAllocator allocator, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glLightf")
    default void lightf(int light, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glLightfv")
    default void lightfv(int light, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glLightfv")
    default void lightfv(SegmentAllocator allocator, int light, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glLighti")
    default void lighti(int light, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glLightiv")
    default void lightiv(int light, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glLightiv")
    default void lightiv(SegmentAllocator allocator, int light, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glLineStipple")
    default void lineStipple(int factor, short pattern) {
        throw new ContextException();
    }

    @Entrypoint("glListBase")
    default void listBase(int base) {
        throw new ContextException();
    }

    @Entrypoint("glLoadIdentity")
    default void loadIdentity() {
        throw new ContextException();
    }

    @Entrypoint("glLoadMatrixd")
    default void loadMatrixd(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadMatrixd")
    default void loadMatrixd(SegmentAllocator allocator, double[] m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadMatrixf")
    default void loadMatrixf(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadMatrixf")
    default void loadMatrixf(SegmentAllocator allocator, float[] m) {
        throw new ContextException();
    }

    @Entrypoint("glLoadName")
    default void loadName(int name) {
        throw new ContextException();
    }

    @Entrypoint("glMap1d")
    default void map1d(int target, double u1, double u2, int stride, int order, MemorySegment points) {
        throw new ContextException();
    }

    @Entrypoint("glMap1d")
    default void map1d(SegmentAllocator allocator, int target, double u1, double u2, int stride, int order, double[] points) {
        throw new ContextException();
    }

    @Entrypoint("glMap1f")
    default void map1f(int target, float u1, float u2, int stride, int order, MemorySegment points) {
        throw new ContextException();
    }

    @Entrypoint("glMap1f")
    default void map1f(SegmentAllocator allocator, int target, float u1, float u2, int stride, int order, float[] points) {
        throw new ContextException();
    }

    @Entrypoint("glMap2d")
    default void map2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, MemorySegment points) {
        throw new ContextException();
    }


    @Entrypoint("glMap2d")
    default void map2d(SegmentAllocator allocator, int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        throw new ContextException();
    }

    @Entrypoint("glMap2f")
    default void map2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, MemorySegment points) {
        throw new ContextException();
    }

    @Entrypoint("glMap2f")
    default void map2f(SegmentAllocator allocator, int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        throw new ContextException();
    }

    @Entrypoint("glMapGrid1d")
    default void mapGrid1d(int un, double u1, double u2) {
        throw new ContextException();
    }

    @Entrypoint("glMapGrid1f")
    default void mapGrid1f(int un, float u1, float u2) {
        throw new ContextException();
    }

    @Entrypoint("glMapGrid2d")
    default void mapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        throw new ContextException();
    }

    @Entrypoint("glMapGrid2f")
    default void mapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        throw new ContextException();
    }

    @Entrypoint("glMaterialf")
    default void materialf(int face, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glMaterialfv")
    default void materialfv(int face, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glMaterialfv")
    default void materialfv(SegmentAllocator allocator, int face, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glMateriali")
    default void materiali(int face, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glMaterialiv")
    default void materialiv(int face, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glMaterialiv")
    default void materialiv(SegmentAllocator allocator, int face, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glMatrixMode")
    default void matrixMode(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glMultMatrixd")
    default void multMatrixd(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glMultMatrixd")
    default void multMatrixd(SegmentAllocator allocator, double[] m) {
        throw new ContextException();
    }

    @Entrypoint("glMultMatrixf")
    default void multMatrixf(MemorySegment m) {
        throw new ContextException();
    }

    @Entrypoint("glMultMatrixf")
    default void multMatrixf(SegmentAllocator allocator, float[] m) {
        throw new ContextException();
    }

    @Entrypoint("glNewList")
    default void newList(int list, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3b")
    default void normal3b(byte nx, byte ny, byte nz) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3bv")
    default void normal3bv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3bv")
    default void normal3bv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3d")
    default void normal3d(double nx, double ny, double nz) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3dv")
    default void normal3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3dv")
    default void normal3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3f")
    default void normal3f(float nx, float ny, float nz) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3fv")
    default void normal3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3fv")
    default void normal3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3i")
    default void normal3i(int nx, int ny, int nz) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3iv")
    default void normal3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3iv")
    default void normal3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3s")
    default void normal3s(short nx, short ny, short nz) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3sv")
    default void normal3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glNormal3sv")
    default void normal3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glOrtho")
    default void ortho(double left, double right, double bottom, double top, double zNear, double zFar) {
        throw new ContextException();
    }

    @Entrypoint("glPassThrough")
    default void passThrough(float token) {
        throw new ContextException();
    }

    @Entrypoint("glPixelMapfv")
    default void pixelMapfv(int map, int mapSize, MemorySegment values) {
        throw new ContextException();
    }

    @Skip
    default void pixelMapfv(SegmentAllocator allocator, int map, float[] values) {
        pixelMapfv(map, values.length, Marshal.marshal(allocator, values));
    }

    @Entrypoint("glPixelMapuiv")
    default void pixelMapuiv(int map, int mapSize, MemorySegment values) {
        throw new ContextException();
    }

    @Skip
    default void pixelMapuiv(SegmentAllocator allocator, int map, int[] values) {
        pixelMapuiv(map, values.length, Marshal.marshal(allocator, values));
    }

    @Entrypoint("glPixelMapusv")
    default void pixelMapusv(int map, int mapSize, MemorySegment values) {
        throw new ContextException();
    }

    @Skip
    default void pixelMapusv(SegmentAllocator allocator, int map, short[] values) {
        pixelMapusv(map, values.length, Marshal.marshal(allocator, values));
    }

    @Entrypoint("glPixelTransferf")
    default void pixelTransferf(int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glPixelTransferi")
    default void pixelTransferi(int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glPixelZoom")
    default void pixelZoom(float xfactor, float yfactor) {
        throw new ContextException();
    }

    @Entrypoint("glPolygonStipple")
    default void polygonStipple(MemorySegment mask) {
        throw new ContextException();
    }

    @Entrypoint("glPolygonStipple")
    default void polygonStipple(SegmentAllocator allocator, byte[] mask) {
        throw new ContextException();
    }

    @Entrypoint("glPopAttrib")
    default void popAttrib() {
        throw new ContextException();
    }

    @Entrypoint("glPopMatrix")
    default void popMatrix() {
        throw new ContextException();
    }

    @Entrypoint("glPopName")
    default void popName() {
        throw new ContextException();
    }

    @Entrypoint("glPushAttrib")
    default void pushAttrib(int mask) {
        throw new ContextException();
    }

    @Entrypoint("glPushMatrix")
    default void pushMatrix() {
        throw new ContextException();
    }

    @Entrypoint("glPushName")
    default void pushName(int name) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2d")
    default void rasterPos2d(double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2dv")
    default void rasterPos2dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2dv")
    default void rasterPos2dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2f")
    default void rasterPos2f(float x, float y) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2fv")
    default void rasterPos2fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2fv")
    default void rasterPos2fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2i")
    default void rasterPos2i(int x, int y) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2iv")
    default void rasterPos2iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2iv")
    default void rasterPos2iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2s")
    default void rasterPos2s(short x, short y) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2sv")
    default void rasterPos2sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos2sv")
    default void rasterPos2sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3d")
    default void rasterPos3d(double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3dv")
    default void rasterPos3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3dv")
    default void rasterPos3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3f")
    default void rasterPos3f(float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3fv")
    default void rasterPos3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3fv")
    default void rasterPos3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3i")
    default void rasterPos3i(int x, int y, int z) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3iv")
    default void rasterPos3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3iv")
    default void rasterPos3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3s")
    default void rasterPos3s(short x, short y, short z) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3sv")
    default void rasterPos3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos3sv")
    default void rasterPos3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4d")
    default void rasterPos4d(double x, double y, double z, double w) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4dv")
    default void rasterPos4dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4dv")
    default void rasterPos4dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4f")
    default void rasterPos4f(float x, float y, float z, float w) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4fv")
    default void rasterPos4fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4fv")
    default void rasterPos4fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4i")
    default void rasterPos4i(int x, int y, int z, int w) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4iv")
    default void rasterPos4iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4iv")
    default void rasterPos4iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4s")
    default void rasterPos4s(short x, short y, short z, short w) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4sv")
    default void rasterPos4sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glRasterPos4sv")
    default void rasterPos4sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glRectd")
    default void rectd(double x1, double y1, double x2, double y2) {
        throw new ContextException();
    }

    @Entrypoint("glRectdv")
    default void rectdv(MemorySegment v1, MemorySegment v2) {
        throw new ContextException();
    }

    @Entrypoint("glRectdv")
    default void rectdv(SegmentAllocator allocator, double[] v1, double[] v2) {
        throw new ContextException();
    }

    @Entrypoint("glRectf")
    default void rectf(float x1, float y1, float x2, float y2) {
        throw new ContextException();
    }

    @Entrypoint("glRectfv")
    default void rectfv(MemorySegment v1, MemorySegment v2) {
        throw new ContextException();
    }

    @Entrypoint("glRectfv")
    default void rectfv(SegmentAllocator allocator, float[] v1, float[] v2) {
        throw new ContextException();
    }

    @Entrypoint("glRecti")
    default void recti(int x1, int y1, int x2, int y2) {
        throw new ContextException();
    }

    @Entrypoint("glRectiv")
    default void rectiv(MemorySegment v1, MemorySegment v2) {
        throw new ContextException();
    }

    @Entrypoint("glRectiv")
    default void rectiv(SegmentAllocator allocator, int[] v1, int[] v2) {
        throw new ContextException();
    }

    @Entrypoint("glRects")
    default void rects(short x1, short y1, short x2, short y2) {
        throw new ContextException();
    }

    @Entrypoint("glRectsv")
    default void rectsv(MemorySegment v1, MemorySegment v2) {
        throw new ContextException();
    }

    @Entrypoint("glRectsv")
    default void rectsv(SegmentAllocator allocator, short[] v1, short[] v2) {
        throw new ContextException();
    }

    @Entrypoint("glRenderMode")
    default int renderMode(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glRotated")
    default void rotated(double angle, double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glRotatef")
    default void rotatef(float angle, float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glScaled")
    default void scaled(double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glScalef")
    default void scalef(float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glSelectBuffer")
    default void selectBuffer(int size, MemorySegment buffer) {
        throw new ContextException();
    }

    @Entrypoint("glSelectBuffer")
    default void selectBuffer(SegmentAllocator allocator, @Ref int[] buffer) {
        throw new ContextException();
    }

    @Entrypoint("glShadeModel")
    default void shadeModel(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1d")
    default void texCoord1d(double s) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1dv")
    default void texCoord1dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1dv")
    default void texCoord1dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1f")
    default void texCoord1f(float s) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1fv")
    default void texCoord1fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1fv")
    default void texCoord1fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1i")
    default void texCoord1i(int s) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1iv")
    default void texCoord1iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1iv")
    default void texCoord1iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1s")
    default void texCoord1s(short s) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1sv")
    default void texCoord1sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord1sv")
    default void texCoord1sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2d")
    default void texCoord2d(double s, double t) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2dv")
    default void texCoord2dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2dv")
    default void texCoord2dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2f")
    default void texCoord2f(float s, float t) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2fv")
    default void texCoord2fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2fv")
    default void texCoord2fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2i")
    default void texCoord2i(int s, int t) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2iv")
    default void texCoord2iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2iv")
    default void texCoord2iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2s")
    default void texCoord2s(short s, short t) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2sv")
    default void texCoord2sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord2sv")
    default void texCoord2sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3d")
    default void texCoord3d(double s, double t, double r) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3dv")
    default void texCoord3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3dv")
    default void texCoord3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3f")
    default void texCoord3f(float s, float t, float r) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3fv")
    default void texCoord3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3fv")
    default void texCoord3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3i")
    default void texCoord3i(int s, int t, int r) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3iv")
    default void texCoord3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3iv")
    default void texCoord3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3s")
    default void texCoord3s(short s, short t, short r) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3sv")
    default void texCoord3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord3sv")
    default void texCoord3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4d")
    default void texCoord4d(double s, double t, double r, double q) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4dv")
    default void texCoord4dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4dv")
    default void texCoord4dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4f")
    default void texCoord4f(float s, float t, float r, float q) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4fv")
    default void texCoord4fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4fv")
    default void texCoord4fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4i")
    default void texCoord4i(int s, int t, int r, int q) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4iv")
    default void texCoord4iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4iv")
    default void texCoord4iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4s")
    default void texCoord4s(short s, short t, short r, short q) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4sv")
    default void texCoord4sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoord4sv")
    default void texCoord4sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnvf")
    default void texEnvf(int target, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnvfv")
    default void texEnvfv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnvfv")
    default void texEnvfv(SegmentAllocator allocator, int target, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnvi")
    default void texEnvi(int target, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnviv")
    default void texEnviv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexEnviv")
    default void texEnviv(SegmentAllocator allocator, int target, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGend")
    default void texGend(int coord, int pname, double param) {
        throw new ContextException();
    }

    @Entrypoint("glTexGendv")
    default void texGendv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGendv")
    default void texGendv(SegmentAllocator allocator, int coord, int pname, double[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGenf")
    default void texGenf(int coord, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glTexGenfv")
    default void texGenfv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGenfv")
    default void texGenfv(SegmentAllocator allocator, int coord, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGeni")
    default void texGeni(int coord, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glTexGeniv")
    default void texGeniv(int coord, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexGeniv")
    default void texGeniv(SegmentAllocator allocator, int coord, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTranslated")
    default void translated(double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glTranslatef")
    default void translatef(float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2d")
    default void vertex2d(double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2dv")
    default void vertex2dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2dv")
    default void vertex2dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2f")
    default void vertex2f(float x, float y) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2fv")
    default void vertex2fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2fv")
    default void vertex2fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2i")
    default void vertex2i(int x, int y) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2iv")
    default void vertex2iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2iv")
    default void vertex2iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2s")
    default void vertex2s(short x, short y) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2sv")
    default void vertex2sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex2sv")
    default void vertex2sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3d")
    default void vertex3d(double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3dv")
    default void vertex3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3dv")
    default void vertex3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3f")
    default void vertex3f(float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3fv")
    default void vertex3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3fv")
    default void vertex3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3i")
    default void vertex3i(int x, int y, int z) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3iv")
    default void vertex3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3iv")
    default void vertex3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3s")
    default void vertex3s(short x, short y, short z) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3sv")
    default void vertex3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex3sv")
    default void vertex3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4d")
    default void vertex4d(double x, double y, double z, double w) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4dv")
    default void vertex4dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4dv")
    default void vertex4dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4f")
    default void vertex4f(float x, float y, float z, float w) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4fv")
    default void vertex4fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4fv")
    default void vertex4fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4i")
    default void vertex4i(int x, int y, int z, int w) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4iv")
    default void vertex4iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4iv")
    default void vertex4iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4s")
    default void vertex4s(short x, short y, short z, short w) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4sv")
    default void vertex4sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertex4sv")
    default void vertex4sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }
}
