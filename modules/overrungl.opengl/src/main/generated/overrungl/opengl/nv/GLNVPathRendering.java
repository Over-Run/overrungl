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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVPathRendering {
    public static final int GL_PATH_FORMAT_SVG_NV = 0x9070;
    public static final int GL_PATH_FORMAT_PS_NV = 0x9071;
    public static final int GL_STANDARD_FONT_NAME_NV = 0x9072;
    public static final int GL_SYSTEM_FONT_NAME_NV = 0x9073;
    public static final int GL_FILE_NAME_NV = 0x9074;
    public static final int GL_PATH_STROKE_WIDTH_NV = 0x9075;
    public static final int GL_PATH_END_CAPS_NV = 0x9076;
    public static final int GL_PATH_INITIAL_END_CAP_NV = 0x9077;
    public static final int GL_PATH_TERMINAL_END_CAP_NV = 0x9078;
    public static final int GL_PATH_JOIN_STYLE_NV = 0x9079;
    public static final int GL_PATH_MITER_LIMIT_NV = 0x907A;
    public static final int GL_PATH_DASH_CAPS_NV = 0x907B;
    public static final int GL_PATH_INITIAL_DASH_CAP_NV = 0x907C;
    public static final int GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D;
    public static final int GL_PATH_DASH_OFFSET_NV = 0x907E;
    public static final int GL_PATH_CLIENT_LENGTH_NV = 0x907F;
    public static final int GL_PATH_FILL_MODE_NV = 0x9080;
    public static final int GL_PATH_FILL_MASK_NV = 0x9081;
    public static final int GL_PATH_FILL_COVER_MODE_NV = 0x9082;
    public static final int GL_PATH_STROKE_COVER_MODE_NV = 0x9083;
    public static final int GL_PATH_STROKE_MASK_NV = 0x9084;
    public static final int GL_COUNT_UP_NV = 0x9088;
    public static final int GL_COUNT_DOWN_NV = 0x9089;
    public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;
    public static final int GL_CONVEX_HULL_NV = 0x908B;
    public static final int GL_BOUNDING_BOX_NV = 0x908D;
    public static final int GL_TRANSLATE_X_NV = 0x908E;
    public static final int GL_TRANSLATE_Y_NV = 0x908F;
    public static final int GL_TRANSLATE_2D_NV = 0x9090;
    public static final int GL_TRANSLATE_3D_NV = 0x9091;
    public static final int GL_AFFINE_2D_NV = 0x9092;
    public static final int GL_AFFINE_3D_NV = 0x9094;
    public static final int GL_TRANSPOSE_AFFINE_2D_NV = 0x9096;
    public static final int GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;
    public static final int GL_UTF8_NV = 0x909A;
    public static final int GL_UTF16_NV = 0x909B;
    public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;
    public static final int GL_PATH_COMMAND_COUNT_NV = 0x909D;
    public static final int GL_PATH_COORD_COUNT_NV = 0x909E;
    public static final int GL_PATH_DASH_ARRAY_COUNT_NV = 0x909F;
    public static final int GL_PATH_COMPUTED_LENGTH_NV = 0x90A0;
    public static final int GL_PATH_FILL_BOUNDING_BOX_NV = 0x90A1;
    public static final int GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;
    public static final int GL_SQUARE_NV = 0x90A3;
    public static final int GL_ROUND_NV = 0x90A4;
    public static final int GL_TRIANGULAR_NV = 0x90A5;
    public static final int GL_BEVEL_NV = 0x90A6;
    public static final int GL_MITER_REVERT_NV = 0x90A7;
    public static final int GL_MITER_TRUNCATE_NV = 0x90A8;
    public static final int GL_SKIP_MISSING_GLYPH_NV = 0x90A9;
    public static final int GL_USE_MISSING_GLYPH_NV = 0x90AA;
    public static final int GL_PATH_ERROR_POSITION_NV = 0x90AB;
    public static final int GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD;
    public static final int GL_ADJACENT_PAIRS_NV = 0x90AE;
    public static final int GL_FIRST_TO_REST_NV = 0x90AF;
    public static final int GL_PATH_GEN_MODE_NV = 0x90B0;
    public static final int GL_PATH_GEN_COEFF_NV = 0x90B1;
    public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;
    public static final int GL_PATH_STENCIL_FUNC_NV = 0x90B7;
    public static final int GL_PATH_STENCIL_REF_NV = 0x90B8;
    public static final int GL_PATH_STENCIL_VALUE_MASK_NV = 0x90B9;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD;
    public static final int GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV = 0x90BE;
    public static final int GL_PATH_COVER_DEPTH_FUNC_NV = 0x90BF;
    public static final int GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4;
    public static final int GL_MOVE_TO_RESETS_NV = 0x90B5;
    public static final int GL_MOVE_TO_CONTINUES_NV = 0x90B6;
    public static final int GL_CLOSE_PATH_NV = 0x00;
    public static final int GL_MOVE_TO_NV = 0x02;
    public static final int GL_RELATIVE_MOVE_TO_NV = 0x03;
    public static final int GL_LINE_TO_NV = 0x04;
    public static final int GL_RELATIVE_LINE_TO_NV = 0x05;
    public static final int GL_HORIZONTAL_LINE_TO_NV = 0x06;
    public static final int GL_RELATIVE_HORIZONTAL_LINE_TO_NV = 0x07;
    public static final int GL_VERTICAL_LINE_TO_NV = 0x08;
    public static final int GL_RELATIVE_VERTICAL_LINE_TO_NV = 0x09;
    public static final int GL_QUADRATIC_CURVE_TO_NV = 0x0A;
    public static final int GL_RELATIVE_QUADRATIC_CURVE_TO_NV = 0x0B;
    public static final int GL_CUBIC_CURVE_TO_NV = 0x0C;
    public static final int GL_RELATIVE_CUBIC_CURVE_TO_NV = 0x0D;
    public static final int GL_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0E;
    public static final int GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0F;
    public static final int GL_SMOOTH_CUBIC_CURVE_TO_NV = 0x10;
    public static final int GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV = 0x11;
    public static final int GL_SMALL_CCW_ARC_TO_NV = 0x12;
    public static final int GL_RELATIVE_SMALL_CCW_ARC_TO_NV = 0x13;
    public static final int GL_SMALL_CW_ARC_TO_NV = 0x14;
    public static final int GL_RELATIVE_SMALL_CW_ARC_TO_NV = 0x15;
    public static final int GL_LARGE_CCW_ARC_TO_NV = 0x16;
    public static final int GL_RELATIVE_LARGE_CCW_ARC_TO_NV = 0x17;
    public static final int GL_LARGE_CW_ARC_TO_NV = 0x18;
    public static final int GL_RELATIVE_LARGE_CW_ARC_TO_NV = 0x19;
    public static final int GL_RESTART_PATH_NV = 0xF0;
    public static final int GL_DUP_FIRST_CUBIC_CURVE_TO_NV = 0xF2;
    public static final int GL_DUP_LAST_CUBIC_CURVE_TO_NV = 0xF4;
    public static final int GL_RECT_NV = 0xF6;
    public static final int GL_CIRCULAR_CCW_ARC_TO_NV = 0xF8;
    public static final int GL_CIRCULAR_CW_ARC_TO_NV = 0xFA;
    public static final int GL_CIRCULAR_TANGENT_ARC_TO_NV = 0xFC;
    public static final int GL_ARC_TO_NV = 0xFE;
    public static final int GL_RELATIVE_ARC_TO_NV = 0xFF;
    public static final int GL_BOLD_BIT_NV = 0x01;
    public static final int GL_ITALIC_BIT_NV = 0x02;
    public static final int GL_GLYPH_WIDTH_BIT_NV = 0x01;
    public static final int GL_GLYPH_HEIGHT_BIT_NV = 0x02;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV = 0x04;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV = 0x08;
    public static final int GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10;
    public static final int GL_GLYPH_VERTICAL_BEARING_X_BIT_NV = 0x20;
    public static final int GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV = 0x40;
    public static final int GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV = 0x80;
    public static final int GL_GLYPH_HAS_KERNING_BIT_NV = 0x100;
    public static final int GL_FONT_X_MIN_BOUNDS_BIT_NV = 0x00010000;
    public static final int GL_FONT_Y_MIN_BOUNDS_BIT_NV = 0x00020000;
    public static final int GL_FONT_X_MAX_BOUNDS_BIT_NV = 0x00040000;
    public static final int GL_FONT_Y_MAX_BOUNDS_BIT_NV = 0x00080000;
    public static final int GL_FONT_UNITS_PER_EM_BIT_NV = 0x00100000;
    public static final int GL_FONT_ASCENDER_BIT_NV = 0x00200000;
    public static final int GL_FONT_DESCENDER_BIT_NV = 0x00400000;
    public static final int GL_FONT_HEIGHT_BIT_NV = 0x00800000;
    public static final int GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV = 0x01000000;
    public static final int GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV = 0x02000000;
    public static final int GL_FONT_UNDERLINE_POSITION_BIT_NV = 0x04000000;
    public static final int GL_FONT_UNDERLINE_THICKNESS_BIT_NV = 0x08000000;
    public static final int GL_FONT_HAS_KERNING_BIT_NV = 0x10000000;
    public static final int GL_ROUNDED_RECT_NV = 0xE8;
    public static final int GL_RELATIVE_ROUNDED_RECT_NV = 0xE9;
    public static final int GL_ROUNDED_RECT2_NV = 0xEA;
    public static final int GL_RELATIVE_ROUNDED_RECT2_NV = 0xEB;
    public static final int GL_ROUNDED_RECT4_NV = 0xEC;
    public static final int GL_RELATIVE_ROUNDED_RECT4_NV = 0xED;
    public static final int GL_ROUNDED_RECT8_NV = 0xEE;
    public static final int GL_RELATIVE_ROUNDED_RECT8_NV = 0xEF;
    public static final int GL_RELATIVE_RECT_NV = 0xF7;
    public static final int GL_FONT_GLYPHS_AVAILABLE_NV = 0x9368;
    public static final int GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369;
    public static final int GL_FONT_UNAVAILABLE_NV = 0x936A;
    public static final int GL_FONT_UNINTELLIGIBLE_NV = 0x936B;
    public static final int GL_CONIC_CURVE_TO_NV = 0x1A;
    public static final int GL_RELATIVE_CONIC_CURVE_TO_NV = 0x1B;
    public static final int GL_FONT_NUM_GLYPH_INDICES_BIT_NV = 0x20000000;
    public static final int GL_STANDARD_FONT_FORMAT_NV = 0x936C;
    public static final int GL_2_BYTES_NV = 0x1407;
    public static final int GL_3_BYTES_NV = 0x1408;
    public static final int GL_4_BYTES_NV = 0x1409;
    public static final int GL_EYE_LINEAR_NV = 0x2400;
    public static final int GL_OBJECT_LINEAR_NV = 0x2401;
    public static final int GL_CONSTANT_NV = 0x8576;
    public static final int GL_PATH_FOG_GEN_MODE_NV = 0x90AC;
    public static final int GL_PRIMARY_COLOR = 0x8577;
    public static final int GL_PRIMARY_COLOR_NV = 0x852C;
    public static final int GL_SECONDARY_COLOR_NV = 0x852D;
    public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;
    public static final int GL_PATH_PROJECTION_NV = 0x1701;
    public static final int GL_PATH_MODELVIEW_NV = 0x1700;
    public static final int GL_PATH_MODELVIEW_STACK_DEPTH_NV = 0x0BA3;
    public static final int GL_PATH_MODELVIEW_MATRIX_NV = 0x0BA6;
    public static final int GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV = 0x0D36;
    public static final int GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV = 0x84E3;
    public static final int GL_PATH_PROJECTION_STACK_DEPTH_NV = 0x0BA4;
    public static final int GL_PATH_PROJECTION_MATRIX_NV = 0x0BA7;
    public static final int GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV = 0x0D38;
    public static final int GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 0x84E4;
    public static final int GL_FRAGMENT_INPUT_NV = 0x936D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenPathsNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeletePathsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsPathNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPathCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathCoordsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathSubCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathSubCoordsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathStringNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathGlyphsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPathGlyphRangeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glWeightPathsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyPathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInterpolatePathsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTransformPathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathParameteriNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPathParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathParameterfNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPathDashArrayNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathStencilFuncNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPathStencilDepthOffsetNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glStencilFillPathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilStrokePathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilFillPathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glStencilStrokePathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathCoverDepthFuncNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCoverFillPathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCoverStrokePathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCoverFillPathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCoverStrokePathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathCoordsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathDashArrayNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathMetricsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathMetricRangeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathSpacingNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsPointInFillPathNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glIsPointInStrokePathNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGetPathLengthNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPointAlongPathNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoad3x2fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoad3x3fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadTranspose3x3fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMult3x2fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMult3x3fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultTranspose3x3fNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glStencilThenCoverFillPathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilThenCoverStrokePathNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilThenCoverFillPathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glStencilThenCoverStrokePathInstancedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathGlyphIndexRangeNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathGlyphIndexArrayNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPathMemoryGlyphIndexArrayNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramPathFragmentInputGenNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourcefvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathColorGenNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathTexGenNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPathFogGenNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetPathColorGenivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathColorGenfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathTexGenivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPathTexGenfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixFrustumEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixLoadIdentityEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixLoadTransposefEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadTransposedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadfEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoaddEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultTransposefEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultTransposedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultfEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultdEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixOrthoEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixPopEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixPushEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixRotatefEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixRotatedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixScalefEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixScaledEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixTranslatefEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixTranslatedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public final MemorySegment PFN_glGenPathsNV;
        public final MemorySegment PFN_glDeletePathsNV;
        public final MemorySegment PFN_glIsPathNV;
        public final MemorySegment PFN_glPathCommandsNV;
        public final MemorySegment PFN_glPathCoordsNV;
        public final MemorySegment PFN_glPathSubCommandsNV;
        public final MemorySegment PFN_glPathSubCoordsNV;
        public final MemorySegment PFN_glPathStringNV;
        public final MemorySegment PFN_glPathGlyphsNV;
        public final MemorySegment PFN_glPathGlyphRangeNV;
        public final MemorySegment PFN_glWeightPathsNV;
        public final MemorySegment PFN_glCopyPathNV;
        public final MemorySegment PFN_glInterpolatePathsNV;
        public final MemorySegment PFN_glTransformPathNV;
        public final MemorySegment PFN_glPathParameterivNV;
        public final MemorySegment PFN_glPathParameteriNV;
        public final MemorySegment PFN_glPathParameterfvNV;
        public final MemorySegment PFN_glPathParameterfNV;
        public final MemorySegment PFN_glPathDashArrayNV;
        public final MemorySegment PFN_glPathStencilFuncNV;
        public final MemorySegment PFN_glPathStencilDepthOffsetNV;
        public final MemorySegment PFN_glStencilFillPathNV;
        public final MemorySegment PFN_glStencilStrokePathNV;
        public final MemorySegment PFN_glStencilFillPathInstancedNV;
        public final MemorySegment PFN_glStencilStrokePathInstancedNV;
        public final MemorySegment PFN_glPathCoverDepthFuncNV;
        public final MemorySegment PFN_glCoverFillPathNV;
        public final MemorySegment PFN_glCoverStrokePathNV;
        public final MemorySegment PFN_glCoverFillPathInstancedNV;
        public final MemorySegment PFN_glCoverStrokePathInstancedNV;
        public final MemorySegment PFN_glGetPathParameterivNV;
        public final MemorySegment PFN_glGetPathParameterfvNV;
        public final MemorySegment PFN_glGetPathCommandsNV;
        public final MemorySegment PFN_glGetPathCoordsNV;
        public final MemorySegment PFN_glGetPathDashArrayNV;
        public final MemorySegment PFN_glGetPathMetricsNV;
        public final MemorySegment PFN_glGetPathMetricRangeNV;
        public final MemorySegment PFN_glGetPathSpacingNV;
        public final MemorySegment PFN_glIsPointInFillPathNV;
        public final MemorySegment PFN_glIsPointInStrokePathNV;
        public final MemorySegment PFN_glGetPathLengthNV;
        public final MemorySegment PFN_glPointAlongPathNV;
        public final MemorySegment PFN_glMatrixLoad3x2fNV;
        public final MemorySegment PFN_glMatrixLoad3x3fNV;
        public final MemorySegment PFN_glMatrixLoadTranspose3x3fNV;
        public final MemorySegment PFN_glMatrixMult3x2fNV;
        public final MemorySegment PFN_glMatrixMult3x3fNV;
        public final MemorySegment PFN_glMatrixMultTranspose3x3fNV;
        public final MemorySegment PFN_glStencilThenCoverFillPathNV;
        public final MemorySegment PFN_glStencilThenCoverStrokePathNV;
        public final MemorySegment PFN_glStencilThenCoverFillPathInstancedNV;
        public final MemorySegment PFN_glStencilThenCoverStrokePathInstancedNV;
        public final MemorySegment PFN_glPathGlyphIndexRangeNV;
        public final MemorySegment PFN_glPathGlyphIndexArrayNV;
        public final MemorySegment PFN_glPathMemoryGlyphIndexArrayNV;
        public final MemorySegment PFN_glProgramPathFragmentInputGenNV;
        public final MemorySegment PFN_glGetProgramResourcefvNV;
        public final MemorySegment PFN_glPathColorGenNV;
        public final MemorySegment PFN_glPathTexGenNV;
        public final MemorySegment PFN_glPathFogGenNV;
        public final MemorySegment PFN_glGetPathColorGenivNV;
        public final MemorySegment PFN_glGetPathColorGenfvNV;
        public final MemorySegment PFN_glGetPathTexGenivNV;
        public final MemorySegment PFN_glGetPathTexGenfvNV;
        public final MemorySegment PFN_glMatrixFrustumEXT;
        public final MemorySegment PFN_glMatrixLoadIdentityEXT;
        public final MemorySegment PFN_glMatrixLoadTransposefEXT;
        public final MemorySegment PFN_glMatrixLoadTransposedEXT;
        public final MemorySegment PFN_glMatrixLoadfEXT;
        public final MemorySegment PFN_glMatrixLoaddEXT;
        public final MemorySegment PFN_glMatrixMultTransposefEXT;
        public final MemorySegment PFN_glMatrixMultTransposedEXT;
        public final MemorySegment PFN_glMatrixMultfEXT;
        public final MemorySegment PFN_glMatrixMultdEXT;
        public final MemorySegment PFN_glMatrixOrthoEXT;
        public final MemorySegment PFN_glMatrixPopEXT;
        public final MemorySegment PFN_glMatrixPushEXT;
        public final MemorySegment PFN_glMatrixRotatefEXT;
        public final MemorySegment PFN_glMatrixRotatedEXT;
        public final MemorySegment PFN_glMatrixScalefEXT;
        public final MemorySegment PFN_glMatrixScaledEXT;
        public final MemorySegment PFN_glMatrixTranslatefEXT;
        public final MemorySegment PFN_glMatrixTranslatedEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenPathsNV = func.invoke("glGenPathsNV");
            PFN_glDeletePathsNV = func.invoke("glDeletePathsNV");
            PFN_glIsPathNV = func.invoke("glIsPathNV");
            PFN_glPathCommandsNV = func.invoke("glPathCommandsNV");
            PFN_glPathCoordsNV = func.invoke("glPathCoordsNV");
            PFN_glPathSubCommandsNV = func.invoke("glPathSubCommandsNV");
            PFN_glPathSubCoordsNV = func.invoke("glPathSubCoordsNV");
            PFN_glPathStringNV = func.invoke("glPathStringNV");
            PFN_glPathGlyphsNV = func.invoke("glPathGlyphsNV");
            PFN_glPathGlyphRangeNV = func.invoke("glPathGlyphRangeNV");
            PFN_glWeightPathsNV = func.invoke("glWeightPathsNV");
            PFN_glCopyPathNV = func.invoke("glCopyPathNV");
            PFN_glInterpolatePathsNV = func.invoke("glInterpolatePathsNV");
            PFN_glTransformPathNV = func.invoke("glTransformPathNV");
            PFN_glPathParameterivNV = func.invoke("glPathParameterivNV");
            PFN_glPathParameteriNV = func.invoke("glPathParameteriNV");
            PFN_glPathParameterfvNV = func.invoke("glPathParameterfvNV");
            PFN_glPathParameterfNV = func.invoke("glPathParameterfNV");
            PFN_glPathDashArrayNV = func.invoke("glPathDashArrayNV");
            PFN_glPathStencilFuncNV = func.invoke("glPathStencilFuncNV");
            PFN_glPathStencilDepthOffsetNV = func.invoke("glPathStencilDepthOffsetNV");
            PFN_glStencilFillPathNV = func.invoke("glStencilFillPathNV");
            PFN_glStencilStrokePathNV = func.invoke("glStencilStrokePathNV");
            PFN_glStencilFillPathInstancedNV = func.invoke("glStencilFillPathInstancedNV");
            PFN_glStencilStrokePathInstancedNV = func.invoke("glStencilStrokePathInstancedNV");
            PFN_glPathCoverDepthFuncNV = func.invoke("glPathCoverDepthFuncNV");
            PFN_glCoverFillPathNV = func.invoke("glCoverFillPathNV");
            PFN_glCoverStrokePathNV = func.invoke("glCoverStrokePathNV");
            PFN_glCoverFillPathInstancedNV = func.invoke("glCoverFillPathInstancedNV");
            PFN_glCoverStrokePathInstancedNV = func.invoke("glCoverStrokePathInstancedNV");
            PFN_glGetPathParameterivNV = func.invoke("glGetPathParameterivNV");
            PFN_glGetPathParameterfvNV = func.invoke("glGetPathParameterfvNV");
            PFN_glGetPathCommandsNV = func.invoke("glGetPathCommandsNV");
            PFN_glGetPathCoordsNV = func.invoke("glGetPathCoordsNV");
            PFN_glGetPathDashArrayNV = func.invoke("glGetPathDashArrayNV");
            PFN_glGetPathMetricsNV = func.invoke("glGetPathMetricsNV");
            PFN_glGetPathMetricRangeNV = func.invoke("glGetPathMetricRangeNV");
            PFN_glGetPathSpacingNV = func.invoke("glGetPathSpacingNV");
            PFN_glIsPointInFillPathNV = func.invoke("glIsPointInFillPathNV");
            PFN_glIsPointInStrokePathNV = func.invoke("glIsPointInStrokePathNV");
            PFN_glGetPathLengthNV = func.invoke("glGetPathLengthNV");
            PFN_glPointAlongPathNV = func.invoke("glPointAlongPathNV");PFN_glMatrixLoad3x2fNV = func.invoke("glMatrixLoad3x2fNV");
            PFN_glMatrixLoad3x3fNV = func.invoke("glMatrixLoad3x3fNV");
            PFN_glMatrixLoadTranspose3x3fNV = func.invoke("glMatrixLoadTranspose3x3fNV");
            PFN_glMatrixMult3x2fNV = func.invoke("glMatrixMult3x2fNV");
            PFN_glMatrixMult3x3fNV = func.invoke("glMatrixMult3x3fNV");
            PFN_glMatrixMultTranspose3x3fNV = func.invoke("glMatrixMultTranspose3x3fNV");
            PFN_glStencilThenCoverFillPathNV = func.invoke("glStencilThenCoverFillPathNV");
            PFN_glStencilThenCoverStrokePathNV = func.invoke("glStencilThenCoverStrokePathNV");
            PFN_glStencilThenCoverFillPathInstancedNV = func.invoke("glStencilThenCoverFillPathInstancedNV");
            PFN_glStencilThenCoverStrokePathInstancedNV = func.invoke("glStencilThenCoverStrokePathInstancedNV");
            PFN_glPathGlyphIndexRangeNV = func.invoke("glPathGlyphIndexRangeNV");PFN_glPathGlyphIndexArrayNV = func.invoke("glPathGlyphIndexArrayNV");
            PFN_glPathMemoryGlyphIndexArrayNV = func.invoke("glPathMemoryGlyphIndexArrayNV");
            PFN_glProgramPathFragmentInputGenNV = func.invoke("glProgramPathFragmentInputGenNV");
            PFN_glGetProgramResourcefvNV = func.invoke("glGetProgramResourcefvNV");PFN_glPathColorGenNV = func.invoke("glPathColorGenNV");
            PFN_glPathTexGenNV = func.invoke("glPathTexGenNV");
            PFN_glPathFogGenNV = func.invoke("glPathFogGenNV");
            PFN_glGetPathColorGenivNV = func.invoke("glGetPathColorGenivNV");
            PFN_glGetPathColorGenfvNV = func.invoke("glGetPathColorGenfvNV");
            PFN_glGetPathTexGenivNV = func.invoke("glGetPathTexGenivNV");
            PFN_glGetPathTexGenfvNV = func.invoke("glGetPathTexGenfvNV");PFN_glMatrixFrustumEXT = func.invoke("glMatrixFrustumEXT");
            PFN_glMatrixLoadIdentityEXT = func.invoke("glMatrixLoadIdentityEXT");
            PFN_glMatrixLoadTransposefEXT = func.invoke("glMatrixLoadTransposefEXT");
            PFN_glMatrixLoadTransposedEXT = func.invoke("glMatrixLoadTransposedEXT");
            PFN_glMatrixLoadfEXT = func.invoke("glMatrixLoadfEXT");
            PFN_glMatrixLoaddEXT = func.invoke("glMatrixLoaddEXT");
            PFN_glMatrixMultTransposefEXT = func.invoke("glMatrixMultTransposefEXT");
            PFN_glMatrixMultTransposedEXT = func.invoke("glMatrixMultTransposedEXT");
            PFN_glMatrixMultfEXT = func.invoke("glMatrixMultfEXT");
            PFN_glMatrixMultdEXT = func.invoke("glMatrixMultdEXT");
            PFN_glMatrixOrthoEXT = func.invoke("glMatrixOrthoEXT");
            PFN_glMatrixPopEXT = func.invoke("glMatrixPopEXT");
            PFN_glMatrixPushEXT = func.invoke("glMatrixPushEXT");
            PFN_glMatrixRotatefEXT = func.invoke("glMatrixRotatefEXT");
            PFN_glMatrixRotatedEXT = func.invoke("glMatrixRotatedEXT");
            PFN_glMatrixScalefEXT = func.invoke("glMatrixScalefEXT");
            PFN_glMatrixScaledEXT = func.invoke("glMatrixScaledEXT");
            PFN_glMatrixTranslatefEXT = func.invoke("glMatrixTranslatefEXT");
            PFN_glMatrixTranslatedEXT = func.invoke("glMatrixTranslatedEXT");
        }
    }

    public GLNVPathRendering(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (unsigned int) GLuint glGenPathsNV((int) GLsizei range);
    /// ```
    public int GenPathsNV(int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenPathsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenPathsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenPathsNV", range); }
        return (int) Handles.MH_glGenPathsNV.invokeExact(handles.PFN_glGenPathsNV, range); }
        catch (Throwable e) { throw new RuntimeException("error in GenPathsNV", e); }
    }

    /// ```
    /// void glDeletePathsNV((unsigned int) GLuint path, (int) GLsizei range);
    /// ```
    public void DeletePathsNV(int path, int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeletePathsNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeletePathsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeletePathsNV", path, range); }
        Handles.MH_glDeletePathsNV.invokeExact(handles.PFN_glDeletePathsNV, path, range); }
        catch (Throwable e) { throw new RuntimeException("error in DeletePathsNV", e); }
    }

    /// ```
    /// GLboolean glIsPathNV((unsigned int) GLuint path);
    /// ```
    public boolean IsPathNV(int path) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsPathNV", path); }
        return (((byte) Handles.MH_glIsPathNV.invokeExact(handles.PFN_glIsPathNV, path)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsPathNV", e); }
    }

    /// ```
    /// void glPathCommandsNV((unsigned int) GLuint path, (int) GLsizei numCommands, const GLubyte* commands, (int) GLsizei numCoords, (unsigned int) GLenum coordType, const void* coords);
    /// ```
    public void PathCommandsNV(int path, int numCommands, MemorySegment commands, int numCoords, int coordType, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathCommandsNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathCommandsNV", path, numCommands, commands, numCoords, coordType, coords); }
        Handles.MH_glPathCommandsNV.invokeExact(handles.PFN_glPathCommandsNV, path, numCommands, commands, numCoords, coordType, coords); }
        catch (Throwable e) { throw new RuntimeException("error in PathCommandsNV", e); }
    }

    /// ```
    /// void glPathCoordsNV((unsigned int) GLuint path, (int) GLsizei numCoords, (unsigned int) GLenum coordType, const void* coords);
    /// ```
    public void PathCoordsNV(int path, int numCoords, int coordType, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathCoordsNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathCoordsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathCoordsNV", path, numCoords, coordType, coords); }
        Handles.MH_glPathCoordsNV.invokeExact(handles.PFN_glPathCoordsNV, path, numCoords, coordType, coords); }
        catch (Throwable e) { throw new RuntimeException("error in PathCoordsNV", e); }
    }

    /// ```
    /// void glPathSubCommandsNV((unsigned int) GLuint path, (int) GLsizei commandStart, (int) GLsizei commandsToDelete, (int) GLsizei numCommands, const GLubyte* commands, (int) GLsizei numCoords, (unsigned int) GLenum coordType, const void* coords);
    /// ```
    public void PathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, MemorySegment commands, int numCoords, int coordType, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathSubCommandsNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathSubCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathSubCommandsNV", path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords); }
        Handles.MH_glPathSubCommandsNV.invokeExact(handles.PFN_glPathSubCommandsNV, path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords); }
        catch (Throwable e) { throw new RuntimeException("error in PathSubCommandsNV", e); }
    }

    /// ```
    /// void glPathSubCoordsNV((unsigned int) GLuint path, (int) GLsizei coordStart, (int) GLsizei numCoords, (unsigned int) GLenum coordType, const void* coords);
    /// ```
    public void PathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathSubCoordsNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathSubCoordsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathSubCoordsNV", path, coordStart, numCoords, coordType, coords); }
        Handles.MH_glPathSubCoordsNV.invokeExact(handles.PFN_glPathSubCoordsNV, path, coordStart, numCoords, coordType, coords); }
        catch (Throwable e) { throw new RuntimeException("error in PathSubCoordsNV", e); }
    }

    /// ```
    /// void glPathStringNV((unsigned int) GLuint path, (unsigned int) GLenum format, (int) GLsizei length, const void* pathString);
    /// ```
    public void PathStringNV(int path, int format, int length, MemorySegment pathString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathStringNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathStringNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathStringNV", path, format, length, pathString); }
        Handles.MH_glPathStringNV.invokeExact(handles.PFN_glPathStringNV, path, format, length, pathString); }
        catch (Throwable e) { throw new RuntimeException("error in PathStringNV", e); }
    }

    /// ```
    /// void glPathGlyphsNV((unsigned int) GLuint firstPathName, (unsigned int) GLenum fontTarget, const void* fontName, (unsigned int) GLbitfield fontStyle, (int) GLsizei numGlyphs, (unsigned int) GLenum type, const void* charcodes, (unsigned int) GLenum handleMissingGlyphs, (unsigned int) GLuint pathParameterTemplate, ((float) khronos_float_t) GLfloat emScale);
    /// ```
    public void PathGlyphsNV(int firstPathName, int fontTarget, MemorySegment fontName, int fontStyle, int numGlyphs, int type, MemorySegment charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathGlyphsNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathGlyphsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathGlyphsNV", firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale); }
        Handles.MH_glPathGlyphsNV.invokeExact(handles.PFN_glPathGlyphsNV, firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale); }
        catch (Throwable e) { throw new RuntimeException("error in PathGlyphsNV", e); }
    }

    /// ```
    /// void glPathGlyphRangeNV((unsigned int) GLuint firstPathName, (unsigned int) GLenum fontTarget, const void* fontName, (unsigned int) GLbitfield fontStyle, (unsigned int) GLuint firstGlyph, (int) GLsizei numGlyphs, (unsigned int) GLenum handleMissingGlyphs, (unsigned int) GLuint pathParameterTemplate, ((float) khronos_float_t) GLfloat emScale);
    /// ```
    public void PathGlyphRangeNV(int firstPathName, int fontTarget, MemorySegment fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathGlyphRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathGlyphRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathGlyphRangeNV", firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale); }
        Handles.MH_glPathGlyphRangeNV.invokeExact(handles.PFN_glPathGlyphRangeNV, firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale); }
        catch (Throwable e) { throw new RuntimeException("error in PathGlyphRangeNV", e); }
    }

    /// ```
    /// void glWeightPathsNV((unsigned int) GLuint resultPath, (int) GLsizei numPaths, const GLuint* paths, const GLfloat* weights);
    /// ```
    public void WeightPathsNV(int resultPath, int numPaths, MemorySegment paths, MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWeightPathsNV)) throw new GLSymbolNotFoundError("Symbol not found: glWeightPathsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWeightPathsNV", resultPath, numPaths, paths, weights); }
        Handles.MH_glWeightPathsNV.invokeExact(handles.PFN_glWeightPathsNV, resultPath, numPaths, paths, weights); }
        catch (Throwable e) { throw new RuntimeException("error in WeightPathsNV", e); }
    }

    /// ```
    /// void glCopyPathNV((unsigned int) GLuint resultPath, (unsigned int) GLuint srcPath);
    /// ```
    public void CopyPathNV(int resultPath, int srcPath) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glCopyPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyPathNV", resultPath, srcPath); }
        Handles.MH_glCopyPathNV.invokeExact(handles.PFN_glCopyPathNV, resultPath, srcPath); }
        catch (Throwable e) { throw new RuntimeException("error in CopyPathNV", e); }
    }

    /// ```
    /// void glInterpolatePathsNV((unsigned int) GLuint resultPath, (unsigned int) GLuint pathA, (unsigned int) GLuint pathB, ((float) khronos_float_t) GLfloat weight);
    /// ```
    public void InterpolatePathsNV(int resultPath, int pathA, int pathB, float weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInterpolatePathsNV)) throw new GLSymbolNotFoundError("Symbol not found: glInterpolatePathsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInterpolatePathsNV", resultPath, pathA, pathB, weight); }
        Handles.MH_glInterpolatePathsNV.invokeExact(handles.PFN_glInterpolatePathsNV, resultPath, pathA, pathB, weight); }
        catch (Throwable e) { throw new RuntimeException("error in InterpolatePathsNV", e); }
    }

    /// ```
    /// void glTransformPathNV((unsigned int) GLuint resultPath, (unsigned int) GLuint srcPath, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void TransformPathNV(int resultPath, int srcPath, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glTransformPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformPathNV", resultPath, srcPath, transformType, transformValues); }
        Handles.MH_glTransformPathNV.invokeExact(handles.PFN_glTransformPathNV, resultPath, srcPath, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in TransformPathNV", e); }
    }

    /// ```
    /// void glPathParameterivNV((unsigned int) GLuint path, (unsigned int) GLenum pname, const GLint* value);
    /// ```
    public void PathParameterivNV(int path, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathParameterivNV", path, pname, value); }
        Handles.MH_glPathParameterivNV.invokeExact(handles.PFN_glPathParameterivNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PathParameterivNV", e); }
    }

    /// ```
    /// void glPathParameteriNV((unsigned int) GLuint path, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void PathParameteriNV(int path, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathParameteriNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathParameteriNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathParameteriNV", path, pname, value); }
        Handles.MH_glPathParameteriNV.invokeExact(handles.PFN_glPathParameteriNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PathParameteriNV", e); }
    }

    /// ```
    /// void glPathParameterfvNV((unsigned int) GLuint path, (unsigned int) GLenum pname, const GLfloat* value);
    /// ```
    public void PathParameterfvNV(int path, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathParameterfvNV", path, pname, value); }
        Handles.MH_glPathParameterfvNV.invokeExact(handles.PFN_glPathParameterfvNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PathParameterfvNV", e); }
    }

    /// ```
    /// void glPathParameterfNV((unsigned int) GLuint path, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat value);
    /// ```
    public void PathParameterfNV(int path, int pname, float value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathParameterfNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathParameterfNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathParameterfNV", path, pname, value); }
        Handles.MH_glPathParameterfNV.invokeExact(handles.PFN_glPathParameterfNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PathParameterfNV", e); }
    }

    /// ```
    /// void glPathDashArrayNV((unsigned int) GLuint path, (int) GLsizei dashCount, const GLfloat* dashArray);
    /// ```
    public void PathDashArrayNV(int path, int dashCount, MemorySegment dashArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathDashArrayNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathDashArrayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathDashArrayNV", path, dashCount, dashArray); }
        Handles.MH_glPathDashArrayNV.invokeExact(handles.PFN_glPathDashArrayNV, path, dashCount, dashArray); }
        catch (Throwable e) { throw new RuntimeException("error in PathDashArrayNV", e); }
    }

    /// ```
    /// void glPathStencilFuncNV((unsigned int) GLenum func, (int) GLint ref, (unsigned int) GLuint mask);
    /// ```
    public void PathStencilFuncNV(int func, int ref, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathStencilFuncNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathStencilFuncNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathStencilFuncNV", func, ref, mask); }
        Handles.MH_glPathStencilFuncNV.invokeExact(handles.PFN_glPathStencilFuncNV, func, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in PathStencilFuncNV", e); }
    }

    /// ```
    /// void glPathStencilDepthOffsetNV(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units);
    /// ```
    public void PathStencilDepthOffsetNV(float factor, float units) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathStencilDepthOffsetNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathStencilDepthOffsetNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathStencilDepthOffsetNV", factor, units); }
        Handles.MH_glPathStencilDepthOffsetNV.invokeExact(handles.PFN_glPathStencilDepthOffsetNV, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in PathStencilDepthOffsetNV", e); }
    }

    /// ```
    /// void glStencilFillPathNV((unsigned int) GLuint path, (unsigned int) GLenum fillMode, (unsigned int) GLuint mask);
    /// ```
    public void StencilFillPathNV(int path, int fillMode, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilFillPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilFillPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilFillPathNV", path, fillMode, mask); }
        Handles.MH_glStencilFillPathNV.invokeExact(handles.PFN_glStencilFillPathNV, path, fillMode, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilFillPathNV", e); }
    }

    /// ```
    /// void glStencilStrokePathNV((unsigned int) GLuint path, (int) GLint reference, (unsigned int) GLuint mask);
    /// ```
    public void StencilStrokePathNV(int path, int reference, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilStrokePathNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilStrokePathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilStrokePathNV", path, reference, mask); }
        Handles.MH_glStencilStrokePathNV.invokeExact(handles.PFN_glStencilStrokePathNV, path, reference, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilStrokePathNV", e); }
    }

    /// ```
    /// void glStencilFillPathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (unsigned int) GLenum fillMode, (unsigned int) GLuint mask, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void StencilFillPathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int fillMode, int mask, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilFillPathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilFillPathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilFillPathInstancedNV", numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues); }
        Handles.MH_glStencilFillPathInstancedNV.invokeExact(handles.PFN_glStencilFillPathInstancedNV, numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in StencilFillPathInstancedNV", e); }
    }

    /// ```
    /// void glStencilStrokePathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (int) GLint reference, (unsigned int) GLuint mask, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void StencilStrokePathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int reference, int mask, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilStrokePathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilStrokePathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilStrokePathInstancedNV", numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues); }
        Handles.MH_glStencilStrokePathInstancedNV.invokeExact(handles.PFN_glStencilStrokePathInstancedNV, numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in StencilStrokePathInstancedNV", e); }
    }

    /// ```
    /// void glPathCoverDepthFuncNV((unsigned int) GLenum func);
    /// ```
    public void PathCoverDepthFuncNV(int func) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathCoverDepthFuncNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathCoverDepthFuncNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathCoverDepthFuncNV", func); }
        Handles.MH_glPathCoverDepthFuncNV.invokeExact(handles.PFN_glPathCoverDepthFuncNV, func); }
        catch (Throwable e) { throw new RuntimeException("error in PathCoverDepthFuncNV", e); }
    }

    /// ```
    /// void glCoverFillPathNV((unsigned int) GLuint path, (unsigned int) GLenum coverMode);
    /// ```
    public void CoverFillPathNV(int path, int coverMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverFillPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverFillPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverFillPathNV", path, coverMode); }
        Handles.MH_glCoverFillPathNV.invokeExact(handles.PFN_glCoverFillPathNV, path, coverMode); }
        catch (Throwable e) { throw new RuntimeException("error in CoverFillPathNV", e); }
    }

    /// ```
    /// void glCoverStrokePathNV((unsigned int) GLuint path, (unsigned int) GLenum coverMode);
    /// ```
    public void CoverStrokePathNV(int path, int coverMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverStrokePathNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverStrokePathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverStrokePathNV", path, coverMode); }
        Handles.MH_glCoverStrokePathNV.invokeExact(handles.PFN_glCoverStrokePathNV, path, coverMode); }
        catch (Throwable e) { throw new RuntimeException("error in CoverStrokePathNV", e); }
    }

    /// ```
    /// void glCoverFillPathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (unsigned int) GLenum coverMode, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void CoverFillPathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int coverMode, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverFillPathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverFillPathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverFillPathInstancedNV", numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues); }
        Handles.MH_glCoverFillPathInstancedNV.invokeExact(handles.PFN_glCoverFillPathInstancedNV, numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in CoverFillPathInstancedNV", e); }
    }

    /// ```
    /// void glCoverStrokePathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (unsigned int) GLenum coverMode, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void CoverStrokePathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int coverMode, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverStrokePathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverStrokePathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverStrokePathInstancedNV", numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues); }
        Handles.MH_glCoverStrokePathInstancedNV.invokeExact(handles.PFN_glCoverStrokePathInstancedNV, numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in CoverStrokePathInstancedNV", e); }
    }

    /// ```
    /// void glGetPathParameterivNV((unsigned int) GLuint path, (unsigned int) GLenum pname, GLint* value);
    /// ```
    public void GetPathParameterivNV(int path, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathParameterivNV", path, pname, value); }
        Handles.MH_glGetPathParameterivNV.invokeExact(handles.PFN_glGetPathParameterivNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathParameterivNV", e); }
    }

    /// ```
    /// void glGetPathParameterfvNV((unsigned int) GLuint path, (unsigned int) GLenum pname, GLfloat* value);
    /// ```
    public void GetPathParameterfvNV(int path, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathParameterfvNV", path, pname, value); }
        Handles.MH_glGetPathParameterfvNV.invokeExact(handles.PFN_glGetPathParameterfvNV, path, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathParameterfvNV", e); }
    }

    /// ```
    /// void glGetPathCommandsNV((unsigned int) GLuint path, GLubyte* commands);
    /// ```
    public void GetPathCommandsNV(int path, MemorySegment commands) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathCommandsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathCommandsNV", path, commands); }
        Handles.MH_glGetPathCommandsNV.invokeExact(handles.PFN_glGetPathCommandsNV, path, commands); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathCommandsNV", e); }
    }

    /// ```
    /// void glGetPathCoordsNV((unsigned int) GLuint path, GLfloat* coords);
    /// ```
    public void GetPathCoordsNV(int path, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathCoordsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathCoordsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathCoordsNV", path, coords); }
        Handles.MH_glGetPathCoordsNV.invokeExact(handles.PFN_glGetPathCoordsNV, path, coords); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathCoordsNV", e); }
    }

    /// ```
    /// void glGetPathDashArrayNV((unsigned int) GLuint path, GLfloat* dashArray);
    /// ```
    public void GetPathDashArrayNV(int path, MemorySegment dashArray) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathDashArrayNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathDashArrayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathDashArrayNV", path, dashArray); }
        Handles.MH_glGetPathDashArrayNV.invokeExact(handles.PFN_glGetPathDashArrayNV, path, dashArray); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathDashArrayNV", e); }
    }

    /// ```
    /// void glGetPathMetricsNV((unsigned int) GLbitfield metricQueryMask, (int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (int) GLsizei stride, GLfloat* metrics);
    /// ```
    public void GetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, MemorySegment paths, int pathBase, int stride, MemorySegment metrics) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathMetricsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathMetricsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathMetricsNV", metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics); }
        Handles.MH_glGetPathMetricsNV.invokeExact(handles.PFN_glGetPathMetricsNV, metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathMetricsNV", e); }
    }

    /// ```
    /// void glGetPathMetricRangeNV((unsigned int) GLbitfield metricQueryMask, (unsigned int) GLuint firstPathName, (int) GLsizei numPaths, (int) GLsizei stride, GLfloat* metrics);
    /// ```
    public void GetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, MemorySegment metrics) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathMetricRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathMetricRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathMetricRangeNV", metricQueryMask, firstPathName, numPaths, stride, metrics); }
        Handles.MH_glGetPathMetricRangeNV.invokeExact(handles.PFN_glGetPathMetricRangeNV, metricQueryMask, firstPathName, numPaths, stride, metrics); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathMetricRangeNV", e); }
    }

    /// ```
    /// void glGetPathSpacingNV((unsigned int) GLenum pathListMode, (int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, ((float) khronos_float_t) GLfloat advanceScale, ((float) khronos_float_t) GLfloat kerningScale, (unsigned int) GLenum transformType, GLfloat* returnedSpacing);
    /// ```
    public void GetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, MemorySegment paths, int pathBase, float advanceScale, float kerningScale, int transformType, MemorySegment returnedSpacing) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathSpacingNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathSpacingNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathSpacingNV", pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing); }
        Handles.MH_glGetPathSpacingNV.invokeExact(handles.PFN_glGetPathSpacingNV, pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathSpacingNV", e); }
    }

    /// ```
    /// GLboolean glIsPointInFillPathNV((unsigned int) GLuint path, (unsigned int) GLuint mask, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public boolean IsPointInFillPathNV(int path, int mask, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsPointInFillPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsPointInFillPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsPointInFillPathNV", path, mask, x, y); }
        return (((byte) Handles.MH_glIsPointInFillPathNV.invokeExact(handles.PFN_glIsPointInFillPathNV, path, mask, x, y)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsPointInFillPathNV", e); }
    }

    /// ```
    /// GLboolean glIsPointInStrokePathNV((unsigned int) GLuint path, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public boolean IsPointInStrokePathNV(int path, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsPointInStrokePathNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsPointInStrokePathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsPointInStrokePathNV", path, x, y); }
        return (((byte) Handles.MH_glIsPointInStrokePathNV.invokeExact(handles.PFN_glIsPointInStrokePathNV, path, x, y)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsPointInStrokePathNV", e); }
    }

    /// ```
    /// ((float) khronos_float_t) GLfloat glGetPathLengthNV((unsigned int) GLuint path, (int) GLsizei startSegment, (int) GLsizei numSegments);
    /// ```
    public float GetPathLengthNV(int path, int startSegment, int numSegments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathLengthNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathLengthNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathLengthNV", path, startSegment, numSegments); }
        return (float) Handles.MH_glGetPathLengthNV.invokeExact(handles.PFN_glGetPathLengthNV, path, startSegment, numSegments); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathLengthNV", e); }
    }

    /// ```
    /// GLboolean glPointAlongPathNV((unsigned int) GLuint path, (int) GLsizei startSegment, (int) GLsizei numSegments, ((float) khronos_float_t) GLfloat distance, GLfloat* x, GLfloat* y, GLfloat* tangentX, GLfloat* tangentY);
    /// ```
    public boolean PointAlongPathNV(int path, int startSegment, int numSegments, float distance, MemorySegment x, MemorySegment y, MemorySegment tangentX, MemorySegment tangentY) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointAlongPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glPointAlongPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointAlongPathNV", path, startSegment, numSegments, distance, x, y, tangentX, tangentY); }
        return (((byte) Handles.MH_glPointAlongPathNV.invokeExact(handles.PFN_glPointAlongPathNV, path, startSegment, numSegments, distance, x, y, tangentX, tangentY)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in PointAlongPathNV", e); }
    }

    /// ```
    /// void glMatrixLoad3x2fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixLoad3x2fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoad3x2fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoad3x2fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoad3x2fNV", matrixMode, m); }
        Handles.MH_glMatrixLoad3x2fNV.invokeExact(handles.PFN_glMatrixLoad3x2fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoad3x2fNV", e); }
    }

    /// ```
    /// void glMatrixLoad3x3fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixLoad3x3fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoad3x3fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoad3x3fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoad3x3fNV", matrixMode, m); }
        Handles.MH_glMatrixLoad3x3fNV.invokeExact(handles.PFN_glMatrixLoad3x3fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoad3x3fNV", e); }
    }

    /// ```
    /// void glMatrixLoadTranspose3x3fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixLoadTranspose3x3fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadTranspose3x3fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadTranspose3x3fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoadTranspose3x3fNV", matrixMode, m); }
        Handles.MH_glMatrixLoadTranspose3x3fNV.invokeExact(handles.PFN_glMatrixLoadTranspose3x3fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadTranspose3x3fNV", e); }
    }

    /// ```
    /// void glMatrixMult3x2fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixMult3x2fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMult3x2fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMult3x2fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMult3x2fNV", matrixMode, m); }
        Handles.MH_glMatrixMult3x2fNV.invokeExact(handles.PFN_glMatrixMult3x2fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMult3x2fNV", e); }
    }

    /// ```
    /// void glMatrixMult3x3fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixMult3x3fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMult3x3fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMult3x3fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMult3x3fNV", matrixMode, m); }
        Handles.MH_glMatrixMult3x3fNV.invokeExact(handles.PFN_glMatrixMult3x3fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMult3x3fNV", e); }
    }

    /// ```
    /// void glMatrixMultTranspose3x3fNV((unsigned int) GLenum matrixMode, const GLfloat* m);
    /// ```
    public void MatrixMultTranspose3x3fNV(int matrixMode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultTranspose3x3fNV)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultTranspose3x3fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMultTranspose3x3fNV", matrixMode, m); }
        Handles.MH_glMatrixMultTranspose3x3fNV.invokeExact(handles.PFN_glMatrixMultTranspose3x3fNV, matrixMode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultTranspose3x3fNV", e); }
    }

    /// ```
    /// void glStencilThenCoverFillPathNV((unsigned int) GLuint path, (unsigned int) GLenum fillMode, (unsigned int) GLuint mask, (unsigned int) GLenum coverMode);
    /// ```
    public void StencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilThenCoverFillPathNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilThenCoverFillPathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilThenCoverFillPathNV", path, fillMode, mask, coverMode); }
        Handles.MH_glStencilThenCoverFillPathNV.invokeExact(handles.PFN_glStencilThenCoverFillPathNV, path, fillMode, mask, coverMode); }
        catch (Throwable e) { throw new RuntimeException("error in StencilThenCoverFillPathNV", e); }
    }

    /// ```
    /// void glStencilThenCoverStrokePathNV((unsigned int) GLuint path, (int) GLint reference, (unsigned int) GLuint mask, (unsigned int) GLenum coverMode);
    /// ```
    public void StencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilThenCoverStrokePathNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilThenCoverStrokePathNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilThenCoverStrokePathNV", path, reference, mask, coverMode); }
        Handles.MH_glStencilThenCoverStrokePathNV.invokeExact(handles.PFN_glStencilThenCoverStrokePathNV, path, reference, mask, coverMode); }
        catch (Throwable e) { throw new RuntimeException("error in StencilThenCoverStrokePathNV", e); }
    }

    /// ```
    /// void glStencilThenCoverFillPathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (unsigned int) GLenum fillMode, (unsigned int) GLuint mask, (unsigned int) GLenum coverMode, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void StencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilThenCoverFillPathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilThenCoverFillPathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilThenCoverFillPathInstancedNV", numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues); }
        Handles.MH_glStencilThenCoverFillPathInstancedNV.invokeExact(handles.PFN_glStencilThenCoverFillPathInstancedNV, numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in StencilThenCoverFillPathInstancedNV", e); }
    }

    /// ```
    /// void glStencilThenCoverStrokePathInstancedNV((int) GLsizei numPaths, (unsigned int) GLenum pathNameType, const void* paths, (unsigned int) GLuint pathBase, (int) GLint reference, (unsigned int) GLuint mask, (unsigned int) GLenum coverMode, (unsigned int) GLenum transformType, const GLfloat* transformValues);
    /// ```
    public void StencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, MemorySegment paths, int pathBase, int reference, int mask, int coverMode, int transformType, MemorySegment transformValues) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilThenCoverStrokePathInstancedNV)) throw new GLSymbolNotFoundError("Symbol not found: glStencilThenCoverStrokePathInstancedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilThenCoverStrokePathInstancedNV", numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues); }
        Handles.MH_glStencilThenCoverStrokePathInstancedNV.invokeExact(handles.PFN_glStencilThenCoverStrokePathInstancedNV, numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues); }
        catch (Throwable e) { throw new RuntimeException("error in StencilThenCoverStrokePathInstancedNV", e); }
    }

    /// ```
    /// (unsigned int) GLenum glPathGlyphIndexRangeNV((unsigned int) GLenum fontTarget, const void* fontName, (unsigned int) GLbitfield fontStyle, (unsigned int) GLuint pathParameterTemplate, ((float) khronos_float_t) GLfloat emScale, GLuint* baseAndCount);
    /// ```
    public int PathGlyphIndexRangeNV(int fontTarget, MemorySegment fontName, int fontStyle, int pathParameterTemplate, float emScale, MemorySegment baseAndCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathGlyphIndexRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathGlyphIndexRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathGlyphIndexRangeNV", fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount); }
        return (int) Handles.MH_glPathGlyphIndexRangeNV.invokeExact(handles.PFN_glPathGlyphIndexRangeNV, fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount); }
        catch (Throwable e) { throw new RuntimeException("error in PathGlyphIndexRangeNV", e); }
    }

    /// ```
    /// (unsigned int) GLenum glPathGlyphIndexArrayNV((unsigned int) GLuint firstPathName, (unsigned int) GLenum fontTarget, const void* fontName, (unsigned int) GLbitfield fontStyle, (unsigned int) GLuint firstGlyphIndex, (int) GLsizei numGlyphs, (unsigned int) GLuint pathParameterTemplate, ((float) khronos_float_t) GLfloat emScale);
    /// ```
    public int PathGlyphIndexArrayNV(int firstPathName, int fontTarget, MemorySegment fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathGlyphIndexArrayNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathGlyphIndexArrayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathGlyphIndexArrayNV", firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale); }
        return (int) Handles.MH_glPathGlyphIndexArrayNV.invokeExact(handles.PFN_glPathGlyphIndexArrayNV, firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale); }
        catch (Throwable e) { throw new RuntimeException("error in PathGlyphIndexArrayNV", e); }
    }

    /// ```
    /// (unsigned int) GLenum glPathMemoryGlyphIndexArrayNV((unsigned int) GLuint firstPathName, (unsigned int) GLenum fontTarget, ((signed long long) khronos_ssize_t) GLsizeiptr fontSize, const void* fontData, (int) GLsizei faceIndex, (unsigned int) GLuint firstGlyphIndex, (int) GLsizei numGlyphs, (unsigned int) GLuint pathParameterTemplate, ((float) khronos_float_t) GLfloat emScale);
    /// ```
    public int PathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, MemorySegment fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathMemoryGlyphIndexArrayNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathMemoryGlyphIndexArrayNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathMemoryGlyphIndexArrayNV", firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale); }
        return (int) Handles.MH_glPathMemoryGlyphIndexArrayNV.invokeExact(handles.PFN_glPathMemoryGlyphIndexArrayNV, firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale); }
        catch (Throwable e) { throw new RuntimeException("error in PathMemoryGlyphIndexArrayNV", e); }
    }

    /// ```
    /// void glProgramPathFragmentInputGenNV((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLenum genMode, (int) GLint components, const GLfloat* coeffs);
    /// ```
    public void ProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, MemorySegment coeffs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramPathFragmentInputGenNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramPathFragmentInputGenNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramPathFragmentInputGenNV", program, location, genMode, components, coeffs); }
        Handles.MH_glProgramPathFragmentInputGenNV.invokeExact(handles.PFN_glProgramPathFragmentInputGenNV, program, location, genMode, components, coeffs); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramPathFragmentInputGenNV", e); }
    }

    /// ```
    /// void glGetProgramResourcefvNV((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLuint index, (int) GLsizei propCount, const GLenum* props, (int) GLsizei count, GLsizei* length, GLfloat* params);
    /// ```
    public void GetProgramResourcefvNV(int program, int programInterface, int index, int propCount, MemorySegment props, int count, MemorySegment length, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourcefvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourcefvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourcefvNV", program, programInterface, index, propCount, props, count, length, params); }
        Handles.MH_glGetProgramResourcefvNV.invokeExact(handles.PFN_glGetProgramResourcefvNV, program, programInterface, index, propCount, props, count, length, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourcefvNV", e); }
    }

    /// ```
    /// void glPathColorGenNV((unsigned int) GLenum color, (unsigned int) GLenum genMode, (unsigned int) GLenum colorFormat, const GLfloat* coeffs);
    /// ```
    public void PathColorGenNV(int color, int genMode, int colorFormat, MemorySegment coeffs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathColorGenNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathColorGenNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathColorGenNV", color, genMode, colorFormat, coeffs); }
        Handles.MH_glPathColorGenNV.invokeExact(handles.PFN_glPathColorGenNV, color, genMode, colorFormat, coeffs); }
        catch (Throwable e) { throw new RuntimeException("error in PathColorGenNV", e); }
    }

    /// ```
    /// void glPathTexGenNV((unsigned int) GLenum texCoordSet, (unsigned int) GLenum genMode, (int) GLint components, const GLfloat* coeffs);
    /// ```
    public void PathTexGenNV(int texCoordSet, int genMode, int components, MemorySegment coeffs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathTexGenNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathTexGenNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathTexGenNV", texCoordSet, genMode, components, coeffs); }
        Handles.MH_glPathTexGenNV.invokeExact(handles.PFN_glPathTexGenNV, texCoordSet, genMode, components, coeffs); }
        catch (Throwable e) { throw new RuntimeException("error in PathTexGenNV", e); }
    }

    /// ```
    /// void glPathFogGenNV((unsigned int) GLenum genMode);
    /// ```
    public void PathFogGenNV(int genMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPathFogGenNV)) throw new GLSymbolNotFoundError("Symbol not found: glPathFogGenNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPathFogGenNV", genMode); }
        Handles.MH_glPathFogGenNV.invokeExact(handles.PFN_glPathFogGenNV, genMode); }
        catch (Throwable e) { throw new RuntimeException("error in PathFogGenNV", e); }
    }

    /// ```
    /// void glGetPathColorGenivNV((unsigned int) GLenum color, (unsigned int) GLenum pname, GLint* value);
    /// ```
    public void GetPathColorGenivNV(int color, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathColorGenivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathColorGenivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathColorGenivNV", color, pname, value); }
        Handles.MH_glGetPathColorGenivNV.invokeExact(handles.PFN_glGetPathColorGenivNV, color, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathColorGenivNV", e); }
    }

    /// ```
    /// void glGetPathColorGenfvNV((unsigned int) GLenum color, (unsigned int) GLenum pname, GLfloat* value);
    /// ```
    public void GetPathColorGenfvNV(int color, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathColorGenfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathColorGenfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathColorGenfvNV", color, pname, value); }
        Handles.MH_glGetPathColorGenfvNV.invokeExact(handles.PFN_glGetPathColorGenfvNV, color, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathColorGenfvNV", e); }
    }

    /// ```
    /// void glGetPathTexGenivNV((unsigned int) GLenum texCoordSet, (unsigned int) GLenum pname, GLint* value);
    /// ```
    public void GetPathTexGenivNV(int texCoordSet, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathTexGenivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathTexGenivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathTexGenivNV", texCoordSet, pname, value); }
        Handles.MH_glGetPathTexGenivNV.invokeExact(handles.PFN_glGetPathTexGenivNV, texCoordSet, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathTexGenivNV", e); }
    }

    /// ```
    /// void glGetPathTexGenfvNV((unsigned int) GLenum texCoordSet, (unsigned int) GLenum pname, GLfloat* value);
    /// ```
    public void GetPathTexGenfvNV(int texCoordSet, int pname, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPathTexGenfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetPathTexGenfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPathTexGenfvNV", texCoordSet, pname, value); }
        Handles.MH_glGetPathTexGenfvNV.invokeExact(handles.PFN_glGetPathTexGenfvNV, texCoordSet, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in GetPathTexGenfvNV", e); }
    }

    /// ```
    /// void glMatrixFrustumEXT((unsigned int) GLenum mode, (double) GLdouble left, (double) GLdouble right, (double) GLdouble bottom, (double) GLdouble top, (double) GLdouble zNear, (double) GLdouble zFar);
    /// ```
    public void MatrixFrustumEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixFrustumEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixFrustumEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixFrustumEXT", mode, left, right, bottom, top, zNear, zFar); }
        Handles.MH_glMatrixFrustumEXT.invokeExact(handles.PFN_glMatrixFrustumEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixFrustumEXT", e); }
    }

    /// ```
    /// void glMatrixLoadIdentityEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixLoadIdentityEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadIdentityEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadIdentityEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoadIdentityEXT", mode); }
        Handles.MH_glMatrixLoadIdentityEXT.invokeExact(handles.PFN_glMatrixLoadIdentityEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadIdentityEXT", e); }
    }

    /// ```
    /// void glMatrixLoadTransposefEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixLoadTransposefEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadTransposefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadTransposefEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoadTransposefEXT", mode, m); }
        Handles.MH_glMatrixLoadTransposefEXT.invokeExact(handles.PFN_glMatrixLoadTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadTransposefEXT", e); }
    }

    /// ```
    /// void glMatrixLoadTransposedEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixLoadTransposedEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadTransposedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadTransposedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoadTransposedEXT", mode, m); }
        Handles.MH_glMatrixLoadTransposedEXT.invokeExact(handles.PFN_glMatrixLoadTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadTransposedEXT", e); }
    }

    /// ```
    /// void glMatrixLoadfEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixLoadfEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoadfEXT", mode, m); }
        Handles.MH_glMatrixLoadfEXT.invokeExact(handles.PFN_glMatrixLoadfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadfEXT", e); }
    }

    /// ```
    /// void glMatrixLoaddEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixLoaddEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoaddEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoaddEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixLoaddEXT", mode, m); }
        Handles.MH_glMatrixLoaddEXT.invokeExact(handles.PFN_glMatrixLoaddEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoaddEXT", e); }
    }

    /// ```
    /// void glMatrixMultTransposefEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixMultTransposefEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultTransposefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultTransposefEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMultTransposefEXT", mode, m); }
        Handles.MH_glMatrixMultTransposefEXT.invokeExact(handles.PFN_glMatrixMultTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultTransposefEXT", e); }
    }

    /// ```
    /// void glMatrixMultTransposedEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixMultTransposedEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultTransposedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultTransposedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMultTransposedEXT", mode, m); }
        Handles.MH_glMatrixMultTransposedEXT.invokeExact(handles.PFN_glMatrixMultTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultTransposedEXT", e); }
    }

    /// ```
    /// void glMatrixMultfEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixMultfEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMultfEXT", mode, m); }
        Handles.MH_glMatrixMultfEXT.invokeExact(handles.PFN_glMatrixMultfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultfEXT", e); }
    }

    /// ```
    /// void glMatrixMultdEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixMultdEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultdEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultdEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixMultdEXT", mode, m); }
        Handles.MH_glMatrixMultdEXT.invokeExact(handles.PFN_glMatrixMultdEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultdEXT", e); }
    }

    /// ```
    /// void glMatrixOrthoEXT((unsigned int) GLenum mode, (double) GLdouble left, (double) GLdouble right, (double) GLdouble bottom, (double) GLdouble top, (double) GLdouble zNear, (double) GLdouble zFar);
    /// ```
    public void MatrixOrthoEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixOrthoEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixOrthoEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixOrthoEXT", mode, left, right, bottom, top, zNear, zFar); }
        Handles.MH_glMatrixOrthoEXT.invokeExact(handles.PFN_glMatrixOrthoEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixOrthoEXT", e); }
    }

    /// ```
    /// void glMatrixPopEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixPopEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixPopEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixPopEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixPopEXT", mode); }
        Handles.MH_glMatrixPopEXT.invokeExact(handles.PFN_glMatrixPopEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixPopEXT", e); }
    }

    /// ```
    /// void glMatrixPushEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixPushEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixPushEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixPushEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixPushEXT", mode); }
        Handles.MH_glMatrixPushEXT.invokeExact(handles.PFN_glMatrixPushEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixPushEXT", e); }
    }

    /// ```
    /// void glMatrixRotatefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat angle, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixRotatefEXT(int mode, float angle, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixRotatefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixRotatefEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixRotatefEXT", mode, angle, x, y, z); }
        Handles.MH_glMatrixRotatefEXT.invokeExact(handles.PFN_glMatrixRotatefEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixRotatefEXT", e); }
    }

    /// ```
    /// void glMatrixRotatedEXT((unsigned int) GLenum mode, (double) GLdouble angle, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixRotatedEXT(int mode, double angle, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixRotatedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixRotatedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixRotatedEXT", mode, angle, x, y, z); }
        Handles.MH_glMatrixRotatedEXT.invokeExact(handles.PFN_glMatrixRotatedEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixRotatedEXT", e); }
    }

    /// ```
    /// void glMatrixScalefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixScalefEXT(int mode, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixScalefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixScalefEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixScalefEXT", mode, x, y, z); }
        Handles.MH_glMatrixScalefEXT.invokeExact(handles.PFN_glMatrixScalefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixScalefEXT", e); }
    }

    /// ```
    /// void glMatrixScaledEXT((unsigned int) GLenum mode, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixScaledEXT(int mode, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixScaledEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixScaledEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixScaledEXT", mode, x, y, z); }
        Handles.MH_glMatrixScaledEXT.invokeExact(handles.PFN_glMatrixScaledEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixScaledEXT", e); }
    }

    /// ```
    /// void glMatrixTranslatefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixTranslatefEXT(int mode, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixTranslatefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixTranslatefEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixTranslatefEXT", mode, x, y, z); }
        Handles.MH_glMatrixTranslatefEXT.invokeExact(handles.PFN_glMatrixTranslatefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixTranslatefEXT", e); }
    }

    /// ```
    /// void glMatrixTranslatedEXT((unsigned int) GLenum mode, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixTranslatedEXT(int mode, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixTranslatedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixTranslatedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixTranslatedEXT", mode, x, y, z); }
        Handles.MH_glMatrixTranslatedEXT.invokeExact(handles.PFN_glMatrixTranslatedEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixTranslatedEXT", e); }
    }

}
