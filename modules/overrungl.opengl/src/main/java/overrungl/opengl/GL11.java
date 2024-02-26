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

import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 1.1 functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL11 extends DirectAccess {
    int CURRENT_BIT = 0x00000001,
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
    int QUAD_STRIP = 0x0008,
        QUADS = 0x0007,
        POLYGON = 0x0009;
    int ACCUM = 0x0100,
        LOAD = 0x0101,
        RETURN = 0x0102,
        MULT = 0x0103,
        ADD = 0x0104;
    int STACK_OVERFLOW = 0x0503,
        STACK_UNDERFLOW = 0x0504;
    int AUX0 = 0x0409,
        AUX1 = 0x040A,
        AUX2 = 0x040B,
        AUX3 = 0x040C;
    int GL_2D = 0x0600,
        GL_3D = 0x0601,
        GL_3D_COLOR = 0x0602,
        GL_3D_COLOR_TEXTURE = 0x0603,
        GL_4D_COLOR_TEXTURE = 0x0604;
    int PASS_THROUGH_TOKEN = 0x0700,
        POINT_TOKEN = 0x0701,
        LINE_TOKEN = 0x0702,
        POLYGON_TOKEN = 0x0703,
        BITMAP_TOKEN = 0x0704,
        DRAW_PIXEL_TOKEN = 0x0705,
        COPY_PIXEL_TOKEN = 0x0706,
        LINE_RESET_TOKEN = 0x0707;
    int EXP = 0x0800,
        EXP2 = 0x0801;
    int COEFF = 0x0A00,
        ORDER = 0x0A01,
        DOMAIN = 0x0A02;
    int PIXEL_MAP_I_TO_I = 0x0C70,
        PIXEL_MAP_S_TO_S = 0x0C71,
        PIXEL_MAP_I_TO_R = 0x0C72,
        PIXEL_MAP_I_TO_G = 0x0C73,
        PIXEL_MAP_I_TO_B = 0x0C74,
        PIXEL_MAP_I_TO_A = 0x0C75,
        PIXEL_MAP_R_TO_R = 0x0C76,
        PIXEL_MAP_G_TO_G = 0x0C77,
        PIXEL_MAP_B_TO_B = 0x0C78,
        PIXEL_MAP_A_TO_A = 0x0C79;
    int VERTEX_ARRAY_POINTER = 0x808E,
        NORMAL_ARRAY_POINTER = 0x808F,
        COLOR_ARRAY_POINTER = 0x8090,
        INDEX_ARRAY_POINTER = 0x8091,
        TEXTURE_COORD_ARRAY_POINTER = 0x8092,
        EDGE_FLAG_ARRAY_POINTER = 0x8093;
    int FEEDBACK_BUFFER_POINTER = 0x0DF0;
    int SELECTION_BUFFER_POINTER = 0x0DF3;
    int CURRENT_COLOR = 0x0B00,
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
    int LINE_STIPPLE = 0x0B24,
        LINE_STIPPLE_PATTERN = 0x0B25,
        LINE_STIPPLE_REPEAT = 0x0B26;
    int LIST_MODE = 0x0B30,
        MAX_LIST_NESTING = 0x0B31,
        LIST_BASE = 0x0B32,
        LIST_INDEX = 0x0B33;
    int POLYGON_STIPPLE = 0x0B42,
        EDGE_FLAG = 0x0B43;
    int LIGHTING = 0x0B50,
        LIGHT_MODEL_LOCAL_VIEWER = 0x0B51,
        LIGHT_MODEL_TWO_SIDE = 0x0B52,
        LIGHT_MODEL_AMBIENT = 0x0B53,
        SHADE_MODEL = 0x0B54,
        COLOR_MATERIAL_FACE = 0x0B55,
        COLOR_MATERIAL_PARAMETER = 0x0B56,
        COLOR_MATERIAL = 0x0B57;
    int FOG = 0x0B60,
        FOG_INDEX = 0x0B61,
        FOG_DENSITY = 0x0B62,
        FOG_START = 0x0B63,
        FOG_END = 0x0B64,
        FOG_MODE = 0x0B65,
        FOG_COLOR = 0x0B66;
    int ACCUM_CLEAR_VALUE = 0x0B80;
    int MATRIX_MODE = 0x0BA0,
        NORMALIZE = 0x0BA1,
        MODELVIEW_STACK_DEPTH = 0x0BA3,
        PROJECTION_STACK_DEPTH = 0x0BA4,
        TEXTURE_STACK_DEPTH = 0x0BA5,
        MODELVIEW_MATRIX = 0x0BA6,
        PROJECTION_MATRIX = 0x0BA7,
        TEXTURE_MATRIX = 0x0BA8;
    int ATTRIB_STACK_DEPTH = 0x0BB0,
        CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
    int ALPHA_TEST = 0x0BC0,
        ALPHA_TEST_FUNC = 0x0BC1,
        ALPHA_TEST_REF = 0x0BC2;
    int INDEX_LOGIC_OP = 0x0BF1;
    int LOGIC_OP = 0x0BF1;
    int AUX_BUFFERS = 0x0C00;
    int INDEX_CLEAR_VALUE = 0x0C20;
    int INDEX_WRITEMASK = 0x0C21;
    int INDEX_MODE = 0x0C30;
    int RGBA_MODE = 0x0C31;
    int RENDER_MODE = 0x0C40;
    int PERSPECTIVE_CORRECTION_HINT = 0x0C50,
        POINT_SMOOTH_HINT = 0x0C51,
        FOG_HINT = 0x0C54;
    int TEXTURE_GEN_S = 0x0C60,
        TEXTURE_GEN_T = 0x0C61,
        TEXTURE_GEN_R = 0x0C62,
        TEXTURE_GEN_Q = 0x0C63;
    int PIXEL_MAP_I_TO_I_SIZE = 0x0CB0,
        PIXEL_MAP_S_TO_S_SIZE = 0x0CB1,
        PIXEL_MAP_I_TO_R_SIZE = 0x0CB2,
        PIXEL_MAP_I_TO_G_SIZE = 0x0CB3,
        PIXEL_MAP_I_TO_B_SIZE = 0x0CB4,
        PIXEL_MAP_I_TO_A_SIZE = 0x0CB5,
        PIXEL_MAP_R_TO_R_SIZE = 0x0CB6,
        PIXEL_MAP_G_TO_G_SIZE = 0x0CB7,
        PIXEL_MAP_B_TO_B_SIZE = 0x0CB8,
        PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
    int MAP_COLOR = 0x0D10,
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
    int MAX_EVAL_ORDER = 0x0D30,
        MAX_LIGHTS = 0x0D31,
        MAX_CLIP_PLANES = 0x0D32,
        MAX_PIXEL_MAP_TABLE = 0x0D34,
        MAX_ATTRIB_STACK_DEPTH = 0x0D35,
        MAX_MODELVIEW_STACK_DEPTH = 0x0D36,
        MAX_NAME_STACK_DEPTH = 0x0D37,
        MAX_PROJECTION_STACK_DEPTH = 0x0D38,
        MAX_TEXTURE_STACK_DEPTH = 0x0D39,
        MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
    int INDEX_BITS = 0x0D51,
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
    int NAME_STACK_DEPTH = 0x0D70,
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
    int MAP2_COLOR_4 = 0x0DB0,
        MAP2_INDEX = 0x0DB1,
        MAP2_NORMAL = 0x0DB2,
        MAP2_TEXTURE_COORD_1 = 0x0DB3,
        MAP2_TEXTURE_COORD_2 = 0x0DB4,
        MAP2_TEXTURE_COORD_3 = 0x0DB5,
        MAP2_TEXTURE_COORD_4 = 0x0DB6,
        MAP2_VERTEX_3 = 0x0DB7,
        MAP2_VERTEX_4 = 0x0DB8;
    int MAP1_GRID_DOMAIN = 0x0DD0,
        MAP1_GRID_SEGMENTS = 0x0DD1,
        MAP2_GRID_DOMAIN = 0x0DD2,
        MAP2_GRID_SEGMENTS = 0x0DD3;
    int FEEDBACK_BUFFER_SIZE = 0x0DF1,
        FEEDBACK_BUFFER_TYPE = 0x0DF2,
        SELECTION_BUFFER_SIZE = 0x0DF4;
    int VERTEX_ARRAY = 0x8074,
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
    int TEXTURE_COMPONENTS = 0x1003,
        TEXTURE_BORDER = 0x1005;
    int TEXTURE_LUMINANCE_SIZE = 0x8060,
        TEXTURE_INTENSITY_SIZE = 0x8061,
        TEXTURE_PRIORITY = 0x8066,
        TEXTURE_RESIDENT = 0x8067;
    int AMBIENT = 0x1200,
        DIFFUSE = 0x1201,
        SPECULAR = 0x1202,
        POSITION = 0x1203,
        SPOT_DIRECTION = 0x1204,
        SPOT_EXPONENT = 0x1205,
        SPOT_CUTOFF = 0x1206,
        CONSTANT_ATTENUATION = 0x1207,
        LINEAR_ATTENUATION = 0x1208,
        QUADRATIC_ATTENUATION = 0x1209;
    int COMPILE = 0x1300,
        COMPILE_AND_EXECUTE = 0x1301;
    int GL_2_BYTES = 0x1407,
        GL_3_BYTES = 0x1408,
        GL_4_BYTES = 0x1409;
    int EMISSION = 0x1600,
        SHININESS = 0x1601,
        AMBIENT_AND_DIFFUSE = 0x1602,
        COLOR_INDEXES = 0x1603;
    int MODELVIEW = 0x1700,
        PROJECTION = 0x1701;
    int COLOR_INDEX = 0x1900,
        LUMINANCE = 0x1909,
        LUMINANCE_ALPHA = 0x190A;
    int BITMAP = 0x1A00;
    int RENDER = 0x1C00,
        FEEDBACK = 0x1C01,
        SELECT = 0x1C02;
    int FLAT = 0x1D00,
        SMOOTH = 0x1D01;
    int S = 0x2000,
        T = 0x2001,
        R = 0x2003,
        Q = 0x2002;
    int MODULATE = 0x2100,
        DECAL = 0x2101;
    int TEXTURE_ENV_MODE = 0x2200,
        TEXTURE_ENV_COLOR = 0x2201;
    int TEXTURE_ENV = 0x2300;
    int EYE_LINEAR = 0x2400,
        OBJECT_LINEAR = 0x2401,
        SPHERE_MAP = 0x2402;
    int TEXTURE_GEN_MODE = 0x2500,
        OBJECT_PLANE = 0x2501,
        EYE_PLANE = 0x2502;
    int CLAMP = 0x2900;
    int ALPHA4 = 0x803B,
        ALPHA8 = 0x803C,
        ALPHA12 = 0x803D,
        ALPHA16 = 0x803E;
    int LUMINANCE4 = 0x803F,
        LUMINANCE8 = 0x8040,
        LUMINANCE12 = 0x8041,
        LUMINANCE16 = 0x8042,
        LUMINANCE4_ALPHA4 = 0x8043,
        LUMINANCE6_ALPHA2 = 0x8044,
        LUMINANCE8_ALPHA8 = 0x8045,
        LUMINANCE12_ALPHA4 = 0x8046,
        LUMINANCE12_ALPHA12 = 0x8047,
        LUMINANCE16_ALPHA16 = 0x8048;
    int INTENSITY = 0x8049,
        INTENSITY4 = 0x804A,
        INTENSITY8 = 0x804B,
        INTENSITY12 = 0x804C,
        INTENSITY16 = 0x804D;
    int V2F = 0x2A20,
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
    int CLIP_PLANE0 = 0x3000,
        CLIP_PLANE1 = 0x3001,
        CLIP_PLANE2 = 0x3002,
        CLIP_PLANE3 = 0x3003,
        CLIP_PLANE4 = 0x3004,
        CLIP_PLANE5 = 0x3005;
    int LIGHT0 = 0x4000,
        LIGHT1 = 0x4001,
        LIGHT2 = 0x4002,
        LIGHT3 = 0x4003,
        LIGHT4 = 0x4004,
        LIGHT5 = 0x4005,
        LIGHT6 = 0x4006,
        LIGHT7 = 0x4007;

    @Entrypoint("glAreTexturesResident")
    default boolean areTexturesResident(int n, MemorySegment textures, MemorySegment residences) {
        throw new ContextException();
    }

    @Skip
    default boolean areTexturesResident(SegmentAllocator allocator, int[] textures, @Ref boolean[] residences) {
        var pRes = Marshal.marshal(allocator, residences);
        boolean b = areTexturesResident(textures.length, Marshal.marshal(allocator, textures), pRes);
        Unmarshal.copy(pRes, residences);
        return b;
    }

    @Entrypoint("glArrayElement")
    default void arrayElement(int i) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(SegmentAllocator allocator, int size, int type, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glColorPointer")
    default void colorPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glDisableClientState")
    default void disableClientState(int array) {
        throw new ContextException();
    }

    @Entrypoint("glEdgeFlagPointer")
    default void edgeFlagPointer(int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glEnableClientState")
    default void enableClientState(int array) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexPointer")
    default void indexPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glIndexub")
    default void indexub(byte c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexubv")
    default void indexubv(MemorySegment c) {
        throw new ContextException();
    }

    @Entrypoint("glIndexubv")
    default void indexubv(SegmentAllocator allocator, byte[] c) {
        throw new ContextException();
    }

    @Entrypoint("glInterleavedArrays")
    default void interleavedArrays(int format, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glInterleavedArrays")
    default void interleavedArrays(SegmentAllocator allocator, int format, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(SegmentAllocator allocator, int type, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(SegmentAllocator allocator, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(SegmentAllocator allocator, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glNormalPointer")
    default void normalPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glPopClientAttrib")
    default void popClientAttrib() {
        throw new ContextException();
    }

    @Entrypoint("glPrioritizeTextures")
    default void prioritizeTextures(int n, MemorySegment textures, MemorySegment priorities) {
        throw new ContextException();
    }

    @Skip
    default void prioritizeTextures(SegmentAllocator allocator, int[] textures, float[] priorities) {
        prioritizeTextures(textures.length, Marshal.marshal(allocator, textures), Marshal.marshal(allocator, priorities));
    }

    @Entrypoint("glPushClientAttrib")
    default void pushClientAttrib(int mask) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoordPointer")
    default void texCoordPointer(int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoordPointer")
    default void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoordPointer")
    default void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoordPointer")
    default void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glTexCoordPointer")
    default void texCoordPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexPointer")
    default void vertexPointer(int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexPointer")
    default void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexPointer")
    default void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexPointer")
    default void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexPointer")
    default void vertexPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        throw new ContextException();
    }
}
