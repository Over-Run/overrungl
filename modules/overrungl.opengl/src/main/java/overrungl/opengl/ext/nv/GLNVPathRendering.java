/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_path_rendering}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_path_rendering) return;
        ext.glGenPathsNV = load.invoke("glGenPathsNV", of(JAVA_INT, JAVA_INT));
        ext.glDeletePathsNV = load.invoke("glDeletePathsNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glIsPathNV = load.invoke("glIsPathNV", of(JAVA_BYTE, JAVA_INT));
        ext.glPathCommandsNV = load.invoke("glPathCommandsNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathCoordsNV = load.invoke("glPathCoordsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathSubCommandsNV = load.invoke("glPathSubCommandsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathSubCoordsNV = load.invoke("glPathSubCoordsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathStringNV = load.invoke("glPathStringNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathGlyphsNV = load.invoke("glPathGlyphsNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glPathGlyphRangeNV = load.invoke("glPathGlyphRangeNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glWeightPathsNV = load.invoke("glWeightPathsNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glCopyPathNV = load.invoke("glCopyPathNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glInterpolatePathsNV = load.invoke("glInterpolatePathsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glTransformPathNV = load.invoke("glTransformPathNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathParameterivNV = load.invoke("glPathParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathParameteriNV = load.invoke("glPathParameteriNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPathParameterfvNV = load.invoke("glPathParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathParameterfNV = load.invoke("glPathParameterfNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glPathDashArrayNV = load.invoke("glPathDashArrayNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathStencilFuncNV = load.invoke("glPathStencilFuncNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPathStencilDepthOffsetNV = load.invoke("glPathStencilDepthOffsetNV", ofVoid(JAVA_FLOAT, JAVA_FLOAT));
        ext.glStencilFillPathNV = load.invoke("glStencilFillPathNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glStencilStrokePathNV = load.invoke("glStencilStrokePathNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glStencilFillPathInstancedNV = load.invoke("glStencilFillPathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glStencilStrokePathInstancedNV = load.invoke("glStencilStrokePathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathCoverDepthFuncNV = load.invoke("glPathCoverDepthFuncNV", ofVoid(JAVA_INT));
        ext.glCoverFillPathNV = load.invoke("glCoverFillPathNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glCoverStrokePathNV = load.invoke("glCoverStrokePathNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glCoverFillPathInstancedNV = load.invoke("glCoverFillPathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCoverStrokePathInstancedNV = load.invoke("glCoverStrokePathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathParameterivNV = load.invoke("glGetPathParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathParameterfvNV = load.invoke("glGetPathParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathCommandsNV = load.invoke("glGetPathCommandsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPathCoordsNV = load.invoke("glGetPathCoordsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPathDashArrayNV = load.invoke("glGetPathDashArrayNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPathMetricsNV = load.invoke("glGetPathMetricsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathMetricRangeNV = load.invoke("glGetPathMetricRangeNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathSpacingNV = load.invoke("glGetPathSpacingNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, ADDRESS));
        ext.glIsPointInFillPathNV = load.invoke("glIsPointInFillPathNV", of(JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glIsPointInStrokePathNV = load.invoke("glIsPointInStrokePathNV", of(JAVA_BYTE, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glGetPathLengthNV = load.invoke("glGetPathLengthNV", of(JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPointAlongPathNV = load.invoke("glPointAlongPathNV", of(JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glMatrixLoad3x2fNV = load.invoke("glMatrixLoad3x2fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixLoad3x3fNV = load.invoke("glMatrixLoad3x3fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixLoadTranspose3x3fNV = load.invoke("glMatrixLoadTranspose3x3fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMult3x2fNV = load.invoke("glMatrixMult3x2fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMult3x3fNV = load.invoke("glMatrixMult3x3fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMultTranspose3x3fNV = load.invoke("glMatrixMultTranspose3x3fNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glStencilThenCoverFillPathNV = load.invoke("glStencilThenCoverFillPathNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glStencilThenCoverStrokePathNV = load.invoke("glStencilThenCoverStrokePathNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glStencilThenCoverFillPathInstancedNV = load.invoke("glStencilThenCoverFillPathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glStencilThenCoverStrokePathInstancedNV = load.invoke("glStencilThenCoverStrokePathInstancedNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathGlyphIndexRangeNV = load.invoke("glPathGlyphIndexRangeNV", of(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT, ADDRESS));
        ext.glPathGlyphIndexArrayNV = load.invoke("glPathGlyphIndexArrayNV", of(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glPathMemoryGlyphIndexArrayNV = load.invoke("glPathMemoryGlyphIndexArrayNV", of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glProgramPathFragmentInputGenNV = load.invoke("glProgramPathFragmentInputGenNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramResourcefvNV = load.invoke("glGetProgramResourcefvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS));
        ext.glPathColorGenNV = load.invoke("glPathColorGenNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathTexGenNV = load.invoke("glPathTexGenNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glPathFogGenNV = load.invoke("glPathFogGenNV", ofVoid(JAVA_INT));
        ext.glGetPathColorGenivNV = load.invoke("glGetPathColorGenivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathColorGenfvNV = load.invoke("glGetPathColorGenfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathTexGenivNV = load.invoke("glGetPathTexGenivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPathTexGenfvNV = load.invoke("glGetPathTexGenfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static int glGenPathsNV(int range) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGenPathsNV).invokeExact(range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeletePathsNV(int path, int range) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeletePathsNV).invokeExact(path, range);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsPathNV(int path) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsPathNV).invokeExact(path);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathCommandsNV(int path, int numCommands, @NativeType("const GLubyte *") MemorySegment commands, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathCommandsNV).invokeExact(path, numCommands, commands, numCoords, coordType, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathCoordsNV(int path, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathCoordsNV).invokeExact(path, numCoords, coordType, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, @NativeType("const GLubyte *") MemorySegment commands, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathSubCommandsNV).invokeExact(path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathSubCoordsNV).invokeExact(path, coordStart, numCoords, coordType, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathStringNV(int path, int format, int length, @NativeType("const void *") MemorySegment pathString) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathStringNV).invokeExact(path, format, length, pathString);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathGlyphsNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int numGlyphs, int type, @NativeType("const void *") MemorySegment charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathGlyphsNV).invokeExact(firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathGlyphRangeNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathGlyphRangeNV).invokeExact(firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWeightPathsNV(int resultPath, int numPaths, @NativeType("const GLuint *") MemorySegment paths, @NativeType("const GLfloat *") MemorySegment weights) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWeightPathsNV).invokeExact(resultPath, numPaths, paths, weights);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyPathNV(int resultPath, int srcPath) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyPathNV).invokeExact(resultPath, srcPath);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glInterpolatePathsNV(int resultPath, int pathA, int pathB, float weight) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glInterpolatePathsNV).invokeExact(resultPath, pathA, pathB, weight);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTransformPathNV(int resultPath, int srcPath, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTransformPathNV).invokeExact(resultPath, srcPath, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathParameterivNV(int path, int pname, @NativeType("const GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathParameterivNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathParameteriNV(int path, int pname, int value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathParameteriNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathParameterfvNV(int path, int pname, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathParameterfvNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathParameterfNV(int path, int pname, float value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathParameterfNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathDashArrayNV(int path, int dashCount, @NativeType("const GLfloat *") MemorySegment dashArray) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathDashArrayNV).invokeExact(path, dashCount, dashArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathStencilFuncNV(int func, int ref, int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathStencilFuncNV).invokeExact(func, ref, mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathStencilDepthOffsetNV(float factor, float units) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathStencilDepthOffsetNV).invokeExact(factor, units);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilFillPathNV(int path, int fillMode, int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilFillPathNV).invokeExact(path, fillMode, mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilStrokePathNV(int path, int reference, int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilStrokePathNV).invokeExact(path, reference, mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int fillMode, int mask, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilFillPathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int reference, int mask, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilStrokePathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathCoverDepthFuncNV(int func) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathCoverDepthFuncNV).invokeExact(func);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCoverFillPathNV(int path, int coverMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverFillPathNV).invokeExact(path, coverMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCoverStrokePathNV(int path, int coverMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverStrokePathNV).invokeExact(path, coverMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCoverFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverFillPathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCoverStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCoverStrokePathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathParameterivNV(int path, int pname, @NativeType("GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathParameterivNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathParameterfvNV(int path, int pname, @NativeType("GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathParameterfvNV).invokeExact(path, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathCommandsNV(int path, @NativeType("GLubyte *") MemorySegment commands) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathCommandsNV).invokeExact(path, commands);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathCoordsNV(int path, @NativeType("GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathCoordsNV).invokeExact(path, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathDashArrayNV(int path, @NativeType("GLfloat *") MemorySegment dashArray) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathDashArrayNV).invokeExact(path, dashArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int stride, @NativeType("GLfloat *") MemorySegment metrics) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathMetricsNV).invokeExact(metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, @NativeType("GLfloat *") MemorySegment metrics) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathMetricRangeNV).invokeExact(metricQueryMask, firstPathName, numPaths, stride, metrics);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, float advanceScale, float kerningScale, int transformType, @NativeType("GLfloat *") MemorySegment returnedSpacing) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathSpacingNV).invokeExact(pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsPointInFillPathNV(int path, int mask, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsPointInFillPathNV).invokeExact(path, mask, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsPointInStrokePathNV(int path, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsPointInStrokePathNV).invokeExact(path, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static float glGetPathLengthNV(int path, int startSegment, int numSegments) {
        final var ext = getExtCapabilities();
        try {
            return (float)
            check(ext.glGetPathLengthNV).invokeExact(path, startSegment, numSegments);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, @NativeType("GLfloat *") MemorySegment x, @NativeType("GLfloat *") MemorySegment y, @NativeType("GLfloat *") MemorySegment tangentX, @NativeType("GLfloat *") MemorySegment tangentY) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glPointAlongPathNV).invokeExact(path, startSegment, numSegments, distance, x, y, tangentX, tangentY);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoad3x2fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoad3x2fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoad3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoad3x3fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoadTranspose3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoadTranspose3x3fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMult3x2fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMult3x2fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMult3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMult3x3fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMultTranspose3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMultTranspose3x3fNV).invokeExact(matrixMode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilThenCoverFillPathNV).invokeExact(path, fillMode, mask, coverMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilThenCoverStrokePathNV).invokeExact(path, reference, mask, coverMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilThenCoverFillPathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int reference, int mask, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStencilThenCoverStrokePathInstancedNV).invokeExact(numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glPathGlyphIndexRangeNV(int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int pathParameterTemplate, float emScale, @NativeType("GLuint *") MemorySegment baseAndCount) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glPathGlyphIndexRangeNV).invokeExact(fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glPathGlyphIndexArrayNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glPathGlyphIndexArrayNV).invokeExact(firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, @NativeType("const void *") MemorySegment fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glPathMemoryGlyphIndexArrayNV).invokeExact(firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, @NativeType("const GLfloat *") MemorySegment coeffs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramPathFragmentInputGenNV).invokeExact(program, location, genMode, components, coeffs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, @NativeType("const GLenum *") MemorySegment props, int count, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramResourcefvNV).invokeExact(program, programInterface, index, propCount, props, count, length, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathColorGenNV(int color, int genMode, int colorFormat, @NativeType("const GLfloat *") MemorySegment coeffs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathColorGenNV).invokeExact(color, genMode, colorFormat, coeffs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathTexGenNV(int texCoordSet, int genMode, int components, @NativeType("const GLfloat *") MemorySegment coeffs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathTexGenNV).invokeExact(texCoordSet, genMode, components, coeffs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPathFogGenNV(int genMode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPathFogGenNV).invokeExact(genMode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathColorGenivNV(int color, int pname, @NativeType("GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathColorGenivNV).invokeExact(color, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathColorGenfvNV(int color, int pname, @NativeType("GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathColorGenfvNV).invokeExact(color, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathTexGenivNV(int texCoordSet, int pname, @NativeType("GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathTexGenivNV).invokeExact(texCoordSet, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPathTexGenfvNV(int texCoordSet, int pname, @NativeType("GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPathTexGenfvNV).invokeExact(texCoordSet, pname, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
