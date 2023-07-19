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

package overrungl.opengl;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.check;
import static overrungl.opengl.GLLoader.getCapabilities;

/**
 * The OpenGL 1.1 functions.
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public final class GL11 extends GL11C {
    public static final int CURRENT_BIT = 0x00000001,
        POINT_BIT = 0x00000002,
        LINE_BIT = 0x00000004,
        POLYGON_BIT = 0x00000008,
        POLYGON_STIPPLE_BIT = 0x00000010,
        PIXEL_MODE_BIT = 0x00000020,
        LIGHTING_BIT = 0x00000040,
        FOG_BIT = 0x00000080,
        ACCUM_BUFFER_BIT = 0x00000200,
        VIEWPORT_BIT = 0x00000800,
        TRANSFORM_BIT = 0x00001000,
        ENABLE_BIT = 0x00002000,
        HINT_BIT = 0x00008000,
        EVAL_BIT = 0x00010000,
        LIST_BIT = 0x00020000,
        TEXTURE_BIT = 0x00040000,
        SCISSOR_BIT = 0x00080000,
        ALL_ATTRIB_BITS = 0xFFFFFFFF,
        CLIENT_PIXEL_STORE_BIT = 0x00000001,
        CLIENT_VERTEX_ARRAY_BIT = 0x00000002,
        CLIENT_ALL_ATTRIB_BITS = 0xFFFFFFFF;
    public static final int QUAD_STRIP = 0x0008,
        QUADS = 0x0007,
        POLYGON = 0x0009;
    public static final int ACCUM = 0x0100,
        LOAD = 0x0101,
        RETURN = 0x0102,
        MULT = 0x0103,
        ADD = 0x0104;
    public static final int STACK_OVERFLOW = 0x0503,
        STACK_UNDERFLOW = 0x0504;
    public static final int AUX0 = 0x0409,
        AUX1 = 0x040A,
        AUX2 = 0x040B,
        AUX3 = 0x040C;
    public static final int GL_2D = 0x0600,
        GL_3D = 0x0601,
        GL_3D_COLOR = 0x0602,
        GL_3D_COLOR_TEXTURE = 0x0603,
        GL_4D_COLOR_TEXTURE = 0x0604;
    public static final int PASS_THROUGH_TOKEN = 0x0700,
        POINT_TOKEN = 0x0701,
        LINE_TOKEN = 0x0702,
        POLYGON_TOKEN = 0x0703,
        BITMAP_TOKEN = 0x0704,
        DRAW_PIXEL_TOKEN = 0x0705,
        COPY_PIXEL_TOKEN = 0x0706,
        LINE_RESET_TOKEN = 0x0707;
    public static final int EXP = 0x0800,
        EXP2 = 0x0801;
    public static final int COEFF = 0x0A00,
        ORDER = 0x0A01,
        DOMAIN = 0x0A02;
    public static final int PIXEL_MAP_I_TO_I = 0x0C70,
        PIXEL_MAP_S_TO_S = 0x0C71,
        PIXEL_MAP_I_TO_R = 0x0C72,
        PIXEL_MAP_I_TO_G = 0x0C73,
        PIXEL_MAP_I_TO_B = 0x0C74,
        PIXEL_MAP_I_TO_A = 0x0C75,
        PIXEL_MAP_R_TO_R = 0x0C76,
        PIXEL_MAP_G_TO_G = 0x0C77,
        PIXEL_MAP_B_TO_B = 0x0C78,
        PIXEL_MAP_A_TO_A = 0x0C79;
    public static final int VERTEX_ARRAY_POINTER = 0x808E,
        NORMAL_ARRAY_POINTER = 0x808F,
        COLOR_ARRAY_POINTER = 0x8090,
        INDEX_ARRAY_POINTER = 0x8091,
        TEXTURE_COORD_ARRAY_POINTER = 0x8092,
        EDGE_FLAG_ARRAY_POINTER = 0x8093;
    public static final int FEEDBACK_BUFFER_POINTER = 0x0DF0;
    public static final int SELECTION_BUFFER_POINTER = 0x0DF3;
    public static final int CURRENT_COLOR = 0x0B00,
        CURRENT_INDEX = 0x0B01,
        CURRENT_NORMAL = 0x0B02,
        CURRENT_TEXTURE_COORDS = 0x0B03,
        CURRENT_RASTER_COLOR = 0x0B04,
        CURRENT_RASTER_INDEX = 0x0B05,
        CURRENT_RASTER_TEXTURE_COORDS = 0x0B06,
        CURRENT_RASTER_POSITION = 0x0B07,
        CURRENT_RASTER_POSITION_VALID = 0x0B08,
        CURRENT_RASTER_DISTANCE = 0x0B09,
        POINT_SMOOTH = 0x0B10;
    public static final int LINE_STIPPLE = 0x0B24,
        LINE_STIPPLE_PATTERN = 0x0B25,
        LINE_STIPPLE_REPEAT = 0x0B26;
    public static final int LIST_MODE = 0x0B30,
        MAX_LIST_NESTING = 0x0B31,
        LIST_BASE = 0x0B32,
        LIST_INDEX = 0x0B33;
    public static final int POLYGON_STIPPLE = 0x0B42,
        EDGE_FLAG = 0x0B43;
    public static final int LIGHTING = 0x0B50,
        LIGHT_MODEL_LOCAL_VIEWER = 0x0B51,
        LIGHT_MODEL_TWO_SIDE = 0x0B52,
        LIGHT_MODEL_AMBIENT = 0x0B53,
        SHADE_MODEL = 0x0B54,
        COLOR_MATERIAL_FACE = 0x0B55,
        COLOR_MATERIAL_PARAMETER = 0x0B56,
        COLOR_MATERIAL = 0x0B57;
    public static final int FOG = 0x0B60,
        FOG_INDEX = 0x0B61,
        FOG_DENSITY = 0x0B62,
        FOG_START = 0x0B63,
        FOG_END = 0x0B64,
        FOG_MODE = 0x0B65,
        FOG_COLOR = 0x0B66;
    public static final int ACCUM_CLEAR_VALUE = 0x0B80;
    public static final int MATRIX_MODE = 0x0BA0,
        NORMALIZE = 0x0BA1,
        MODELVIEW_STACK_DEPTH = 0x0BA3,
        PROJECTION_STACK_DEPTH = 0x0BA4,
        TEXTURE_STACK_DEPTH = 0x0BA5,
        MODELVIEW_MATRIX = 0x0BA6,
        PROJECTION_MATRIX = 0x0BA7,
        TEXTURE_MATRIX = 0x0BA8;
    public static final int ATTRIB_STACK_DEPTH = 0x0BB0,
        CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
    public static final int ALPHA_TEST = 0x0BC0,
        ALPHA_TEST_FUNC = 0x0BC1,
        ALPHA_TEST_REF = 0x0BC2;
    public static final int INDEX_LOGIC_OP = 0x0BF1;
    public static final int LOGIC_OP = 0x0BF1;
    public static final int AUX_BUFFERS = 0x0C00;
    public static final int INDEX_CLEAR_VALUE = 0x0C20;
    public static final int INDEX_WRITEMASK = 0x0C21;
    public static final int INDEX_MODE = 0x0C30;
    public static final int RGBA_MODE = 0x0C31;
    public static final int RENDER_MODE = 0x0C40;
    public static final int PERSPECTIVE_CORRECTION_HINT = 0x0C50,
        POINT_SMOOTH_HINT = 0x0C51,
        FOG_HINT = 0x0C54;
    public static final int TEXTURE_GEN_S = 0x0C60,
        TEXTURE_GEN_T = 0x0C61,
        TEXTURE_GEN_R = 0x0C62,
        TEXTURE_GEN_Q = 0x0C63;
    public static final int PIXEL_MAP_I_TO_I_SIZE = 0x0CB0,
        PIXEL_MAP_S_TO_S_SIZE = 0x0CB1,
        PIXEL_MAP_I_TO_R_SIZE = 0x0CB2,
        PIXEL_MAP_I_TO_G_SIZE = 0x0CB3,
        PIXEL_MAP_I_TO_B_SIZE = 0x0CB4,
        PIXEL_MAP_I_TO_A_SIZE = 0x0CB5,
        PIXEL_MAP_R_TO_R_SIZE = 0x0CB6,
        PIXEL_MAP_G_TO_G_SIZE = 0x0CB7,
        PIXEL_MAP_B_TO_B_SIZE = 0x0CB8,
        PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
    public static final int MAP_COLOR = 0x0D10,
        MAP_STENCIL = 0x0D11,
        INDEX_SHIFT = 0x0D12,
        INDEX_OFFSET = 0x0D13,
        RED_SCALE = 0x0D14,
        RED_BIAS = 0x0D15,
        ZOOM_X = 0x0D16,
        ZOOM_Y = 0x0D17,
        GREEN_SCALE = 0x0D18,
        GREEN_BIAS = 0x0D19,
        BLUE_SCALE = 0x0D1A,
        BLUE_BIAS = 0x0D1B,
        ALPHA_SCALE = 0x0D1C,
        ALPHA_BIAS = 0x0D1D,
        DEPTH_SCALE = 0x0D1E,
        DEPTH_BIAS = 0x0D1F;
    public static final int MAX_EVAL_ORDER = 0x0D30,
        MAX_LIGHTS = 0x0D31,
        MAX_CLIP_PLANES = 0x0D32,
        MAX_PIXEL_MAP_TABLE = 0x0D34,
        MAX_ATTRIB_STACK_DEPTH = 0x0D35,
        MAX_MODELVIEW_STACK_DEPTH = 0x0D36,
        MAX_NAME_STACK_DEPTH = 0x0D37,
        MAX_PROJECTION_STACK_DEPTH = 0x0D38,
        MAX_TEXTURE_STACK_DEPTH = 0x0D39,
        MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
    public static final int INDEX_BITS = 0x0D51,
        RED_BITS = 0x0D52,
        GREEN_BITS = 0x0D53,
        BLUE_BITS = 0x0D54,
        ALPHA_BITS = 0x0D55,
        DEPTH_BITS = 0x0D56,
        STENCIL_BITS = 0x0D57,
        ACCUM_RED_BITS = 0x0D58,
        ACCUM_GREEN_BITS = 0x0D59,
        ACCUM_BLUE_BITS = 0x0D5A,
        ACCUM_ALPHA_BITS = 0x0D5B;
    public static final int NAME_STACK_DEPTH = 0x0D70,
        AUTO_NORMAL = 0x0D80,
        MAP1_COLOR_4 = 0x0D90,
        MAP1_INDEX = 0x0D91,
        MAP1_NORMAL = 0x0D92,
        MAP1_TEXTURE_COORD_1 = 0x0D93,
        MAP1_TEXTURE_COORD_2 = 0x0D94,
        MAP1_TEXTURE_COORD_3 = 0x0D95,
        MAP1_TEXTURE_COORD_4 = 0x0D96,
        MAP1_VERTEX_3 = 0x0D97,
        MAP1_VERTEX_4 = 0x0D98;
    public static final int MAP2_COLOR_4 = 0x0DB0,
        MAP2_INDEX = 0x0DB1,
        MAP2_NORMAL = 0x0DB2,
        MAP2_TEXTURE_COORD_1 = 0x0DB3,
        MAP2_TEXTURE_COORD_2 = 0x0DB4,
        MAP2_TEXTURE_COORD_3 = 0x0DB5,
        MAP2_TEXTURE_COORD_4 = 0x0DB6,
        MAP2_VERTEX_3 = 0x0DB7,
        MAP2_VERTEX_4 = 0x0DB8;
    public static final int MAP1_GRID_DOMAIN = 0x0DD0,
        MAP1_GRID_SEGMENTS = 0x0DD1,
        MAP2_GRID_DOMAIN = 0x0DD2,
        MAP2_GRID_SEGMENTS = 0x0DD3;
    public static final int FEEDBACK_BUFFER_SIZE = 0x0DF1,
        FEEDBACK_BUFFER_TYPE = 0x0DF2,
        SELECTION_BUFFER_SIZE = 0x0DF4;
    public static final int VERTEX_ARRAY = 0x8074,
        NORMAL_ARRAY = 0x8075,
        COLOR_ARRAY = 0x8076,
        INDEX_ARRAY = 0x8077,
        TEXTURE_COORD_ARRAY = 0x8078,
        EDGE_FLAG_ARRAY = 0x8079,
        VERTEX_ARRAY_SIZE = 0x807A,
        VERTEX_ARRAY_TYPE = 0x807B,
        VERTEX_ARRAY_STRIDE = 0x807C,
        NORMAL_ARRAY_TYPE = 0x807E,
        NORMAL_ARRAY_STRIDE = 0x807F,
        COLOR_ARRAY_SIZE = 0x8081,
        COLOR_ARRAY_TYPE = 0x8082,
        COLOR_ARRAY_STRIDE = 0x8083,
        INDEX_ARRAY_TYPE = 0x8085,
        INDEX_ARRAY_STRIDE = 0x8086,
        TEXTURE_COORD_ARRAY_SIZE = 0x8088,
        TEXTURE_COORD_ARRAY_TYPE = 0x8089,
        TEXTURE_COORD_ARRAY_STRIDE = 0x808A,
        EDGE_FLAG_ARRAY_STRIDE = 0x808C;
    public static final int TEXTURE_COMPONENTS = 0x1003,
        TEXTURE_BORDER = 0x1005;
    public static final int TEXTURE_LUMINANCE_SIZE = 0x8060,
        TEXTURE_INTENSITY_SIZE = 0x8061,
        TEXTURE_PRIORITY = 0x8066,
        TEXTURE_RESIDENT = 0x8067;
    public static final int AMBIENT = 0x1200,
        DIFFUSE = 0x1201,
        SPECULAR = 0x1202,
        POSITION = 0x1203,
        SPOT_DIRECTION = 0x1204,
        SPOT_EXPONENT = 0x1205,
        SPOT_CUTOFF = 0x1206,
        CONSTANT_ATTENUATION = 0x1207,
        LINEAR_ATTENUATION = 0x1208,
        QUADRATIC_ATTENUATION = 0x1209;
    public static final int COMPILE = 0x1300,
        COMPILE_AND_EXECUTE = 0x1301;
    public static final int GL_2_BYTES = 0x1407,
        GL_3_BYTES = 0x1408,
        GL_4_BYTES = 0x1409;
    public static final int EMISSION = 0x1600,
        SHININESS = 0x1601,
        AMBIENT_AND_DIFFUSE = 0x1602,
        COLOR_INDEXES = 0x1603;
    public static final int MODELVIEW = 0x1700,
        PROJECTION = 0x1701;
    public static final int COLOR_INDEX = 0x1900,
        LUMINANCE = 0x1909,
        LUMINANCE_ALPHA = 0x190A;
    public static final int BITMAP = 0x1A00;
    public static final int RENDER = 0x1C00,
        FEEDBACK = 0x1C01,
        SELECT = 0x1C02;
    public static final int FLAT = 0x1D00,
        SMOOTH = 0x1D01;
    public static final int S = 0x2000,
        T = 0x2001,
        R = 0x2003,
        Q = 0x2002;
    public static final int MODULATE = 0x2100,
        DECAL = 0x2101;
    public static final int TEXTURE_ENV_MODE = 0x2200,
        TEXTURE_ENV_COLOR = 0x2201;
    public static final int TEXTURE_ENV = 0x2300;
    public static final int EYE_LINEAR = 0x2400,
        OBJECT_LINEAR = 0x2401,
        SPHERE_MAP = 0x2402;
    public static final int TEXTURE_GEN_MODE = 0x2500,
        OBJECT_PLANE = 0x2501,
        EYE_PLANE = 0x2502;
    public static final int CLAMP = 0x2900;
    public static final int ALPHA4 = 0x803B,
        ALPHA8 = 0x803C,
        ALPHA12 = 0x803D,
        ALPHA16 = 0x803E;
    public static final int LUMINANCE4 = 0x803F,
        LUMINANCE8 = 0x8040,
        LUMINANCE12 = 0x8041,
        LUMINANCE16 = 0x8042,
        LUMINANCE4_ALPHA4 = 0x8043,
        LUMINANCE6_ALPHA2 = 0x8044,
        LUMINANCE8_ALPHA8 = 0x8045,
        LUMINANCE12_ALPHA4 = 0x8046,
        LUMINANCE12_ALPHA12 = 0x8047,
        LUMINANCE16_ALPHA16 = 0x8048;
    public static final int INTENSITY = 0x8049,
        INTENSITY4 = 0x804A,
        INTENSITY8 = 0x804B,
        INTENSITY12 = 0x804C,
        INTENSITY16 = 0x804D;
    public static final int V2F = 0x2A20,
        V3F = 0x2A21,
        C4UB_V2F = 0x2A22,
        C4UB_V3F = 0x2A23,
        C3F_V3F = 0x2A24,
        N3F_V3F = 0x2A25,
        C4F_N3F_V3F = 0x2A26,
        T2F_V3F = 0x2A27,
        T4F_V4F = 0x2A28,
        T2F_C4UB_V3F = 0x2A29,
        T2F_C3F_V3F = 0x2A2A,
        T2F_N3F_V3F = 0x2A2B,
        T2F_C4F_N3F_V3F = 0x2A2C,
        T4F_C4F_N3F_V4F = 0x2A2D;
    public static final int CLIP_PLANE0 = 0x3000,
        CLIP_PLANE1 = 0x3001,
        CLIP_PLANE2 = 0x3002,
        CLIP_PLANE3 = 0x3003,
        CLIP_PLANE4 = 0x3004,
        CLIP_PLANE5 = 0x3005;
    public static final int LIGHT0 = 0x4000,
        LIGHT1 = 0x4001,
        LIGHT2 = 0x4002,
        LIGHT3 = 0x4003,
        LIGHT4 = 0x4004,
        LIGHT5 = 0x4005,
        LIGHT6 = 0x4006,
        LIGHT7 = 0x4007;

    static void load(GLCapabilities caps, GLLoadFunc load) {
        if (!caps.Ver11) return;
        caps.glAreTexturesResident = load.invoke("glAreTexturesResident", IPPZ);
        caps.glArrayElement = load.invoke("glArrayElement", IV);
        caps.glColorPointer = load.invoke("glColorPointer", IIIPV);
        caps.glDisableClientState = load.invoke("glDisableClientState", IV);
        caps.glEdgeFlagPointer = load.invoke("glEdgeFlagPointer", IPV);
        caps.glEnableClientState = load.invoke("glEnableClientState", IV);
        caps.glIndexPointer = load.invoke("glIndexPointer", IIPV);
        caps.glIndexub = load.invoke("glIndexub", BV);
        caps.glIndexubv = load.invoke("glIndexubv", PV);
        caps.glInterleavedArrays = load.invoke("glInterleavedArrays", IIPV);
        caps.glNormalPointer = load.invoke("glNormalPointer", IIPV);
        caps.glPopClientAttrib = load.invoke("glPopClientAttrib", V);
        caps.glPrioritizeTextures = load.invoke("glPrioritizeTextures", IPPV);
        caps.glPushClientAttrib = load.invoke("glPushClientAttrib", IV);
        caps.glTexCoordPointer = load.invoke("glTexCoordPointer", IIIPV);
        caps.glVertexPointer = load.invoke("glVertexPointer", IIIPV);
    }

    public static boolean areTexturesResident(int n, MemorySegment textures, MemorySegment residences) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glAreTexturesResident).invokeExact(n, textures, residences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean areTexturesResident(SegmentAllocator allocator, int[] textures, boolean[] residences) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
        var pRes = allocator.allocateArray(JAVA_BOOLEAN, n);
        boolean b = areTexturesResident(n, pTex, pRes);
        for (int i = 0; i < n; i++) {
            textures[i] = pTex.getAtIndex(JAVA_INT, i);
            residences[i] = pTex.get(JAVA_BOOLEAN, i);
        }
        return b;
    }

    public static void arrayElement(int i) {
        var caps = getCapabilities();
        try {
            check(caps.glArrayElement).invokeExact(i);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorPointer(int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glColorPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, byte[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void colorPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        colorPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void disableClientState(int array) {
        var caps = getCapabilities();
        try {
            check(caps.glDisableClientState).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void edgeFlagPointer(int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glEdgeFlagPointer).invokeExact(stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enableClientState(int array) {
        var caps = getCapabilities();
        try {
            check(caps.glEnableClientState).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexPointer(int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexPointer).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void indexPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        indexPointer(type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void indexub(byte c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexub).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexubv(MemorySegment c) {
        var caps = getCapabilities();
        try {
            check(caps.glIndexubv).invokeExact(c);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void indexubv(SegmentAllocator allocator, byte[] c) {
        var pc = allocator.allocateArray(JAVA_BYTE, c);
        indexubv(pc);
    }

    public static void interleavedArrays(int format, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glInterleavedArrays).invokeExact(format, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void interleavedArrays(SegmentAllocator allocator, int format, int stride, float[] pointer) {
        var pp = allocator.allocateArray(JAVA_FLOAT, pointer);
        interleavedArrays(format, stride, pp);
    }

    public static void normalPointer(int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glNormalPointer).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void normalPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        normalPointer(type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void popClientAttrib() {
        var caps = getCapabilities();
        try {
            check(caps.glPopClientAttrib).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void prioritizeTextures(int n, MemorySegment textures, MemorySegment priorities) {
        var caps = getCapabilities();
        try {
            check(caps.glPrioritizeTextures).invokeExact(n, textures, priorities);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void prioritizeTextures(SegmentAllocator allocator, int[] textures, float[] priorities) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
        var pPri = allocator.allocateArray(JAVA_FLOAT, n);
        for (int i = 0; i < n; i++) {
            pTex.setAtIndex(JAVA_INT, i, textures[i]);
            pPri.setAtIndex(JAVA_FLOAT, i, priorities[i]);
        }
        prioritizeTextures(n, pTex, pPri);
    }

    public static void pushClientAttrib(int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glPushClientAttrib).invokeExact(mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoordPointer(int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glTexCoordPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        texCoordPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }

    public static void vertexPointer(int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexPointer).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_FLOAT, pointer));
    }

    public static void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        vertexPointer(size, type, stride, allocator.allocateArray(JAVA_DOUBLE, pointer));
    }
}
