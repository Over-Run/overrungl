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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_path_rendering}
 */
public interface GLNVPathRendering {
    int GL_PATH_FORMAT_SVG_NV = 0x9070;
    int GL_PATH_FORMAT_PS_NV = 0x9071;
    int GL_STANDARD_FONT_NAME_NV = 0x9072;
    int GL_SYSTEM_FONT_NAME_NV = 0x9073;
    int GL_FILE_NAME_NV = 0x9074;
    int GL_PATH_STROKE_WIDTH_NV = 0x9075;
    int GL_PATH_END_CAPS_NV = 0x9076;
    int GL_PATH_INITIAL_END_CAP_NV = 0x9077;
    int GL_PATH_TERMINAL_END_CAP_NV = 0x9078;
    int GL_PATH_JOIN_STYLE_NV = 0x9079;
    int GL_PATH_MITER_LIMIT_NV = 0x907A;
    int GL_PATH_DASH_CAPS_NV = 0x907B;
    int GL_PATH_INITIAL_DASH_CAP_NV = 0x907C;
    int GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D;
    int GL_PATH_DASH_OFFSET_NV = 0x907E;
    int GL_PATH_CLIENT_LENGTH_NV = 0x907F;
    int GL_PATH_FILL_MODE_NV = 0x9080;
    int GL_PATH_FILL_MASK_NV = 0x9081;
    int GL_PATH_FILL_COVER_MODE_NV = 0x9082;
    int GL_PATH_STROKE_COVER_MODE_NV = 0x9083;
    int GL_PATH_STROKE_MASK_NV = 0x9084;
    int GL_COUNT_UP_NV = 0x9088;
    int GL_COUNT_DOWN_NV = 0x9089;
    int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;
    int GL_CONVEX_HULL_NV = 0x908B;
    int GL_BOUNDING_BOX_NV = 0x908D;
    int GL_TRANSLATE_X_NV = 0x908E;
    int GL_TRANSLATE_Y_NV = 0x908F;
    int GL_TRANSLATE_2D_NV = 0x9090;
    int GL_TRANSLATE_3D_NV = 0x9091;
    int GL_AFFINE_2D_NV = 0x9092;
    int GL_AFFINE_3D_NV = 0x9094;
    int GL_TRANSPOSE_AFFINE_2D_NV = 0x9096;
    int GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;
    int GL_UTF8_NV = 0x909A;
    int GL_UTF16_NV = 0x909B;
    int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;
    int GL_PATH_COMMAND_COUNT_NV = 0x909D;
    int GL_PATH_COORD_COUNT_NV = 0x909E;
    int GL_PATH_DASH_ARRAY_COUNT_NV = 0x909F;
    int GL_PATH_COMPUTED_LENGTH_NV = 0x90A0;
    int GL_PATH_FILL_BOUNDING_BOX_NV = 0x90A1;
    int GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;
    int GL_SQUARE_NV = 0x90A3;
    int GL_ROUND_NV = 0x90A4;
    int GL_TRIANGULAR_NV = 0x90A5;
    int GL_BEVEL_NV = 0x90A6;
    int GL_MITER_REVERT_NV = 0x90A7;
    int GL_MITER_TRUNCATE_NV = 0x90A8;
    int GL_SKIP_MISSING_GLYPH_NV = 0x90A9;
    int GL_USE_MISSING_GLYPH_NV = 0x90AA;
    int GL_PATH_ERROR_POSITION_NV = 0x90AB;
    int GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD;
    int GL_ADJACENT_PAIRS_NV = 0x90AE;
    int GL_FIRST_TO_REST_NV = 0x90AF;
    int GL_PATH_GEN_MODE_NV = 0x90B0;
    int GL_PATH_GEN_COEFF_NV = 0x90B1;
    int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;
    int GL_PATH_STENCIL_FUNC_NV = 0x90B7;
    int GL_PATH_STENCIL_REF_NV = 0x90B8;
    int GL_PATH_STENCIL_VALUE_MASK_NV = 0x90B9;
    int GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD;
    int GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV = 0x90BE;
    int GL_PATH_COVER_DEPTH_FUNC_NV = 0x90BF;
    int GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4;
    int GL_MOVE_TO_RESETS_NV = 0x90B5;
    int GL_MOVE_TO_CONTINUES_NV = 0x90B6;
    int GL_CLOSE_PATH_NV = 0x00;
    int GL_MOVE_TO_NV = 0x02;
    int GL_RELATIVE_MOVE_TO_NV = 0x03;
    int GL_LINE_TO_NV = 0x04;
    int GL_RELATIVE_LINE_TO_NV = 0x05;
    int GL_HORIZONTAL_LINE_TO_NV = 0x06;
    int GL_RELATIVE_HORIZONTAL_LINE_TO_NV = 0x07;
    int GL_VERTICAL_LINE_TO_NV = 0x08;
    int GL_RELATIVE_VERTICAL_LINE_TO_NV = 0x09;
    int GL_QUADRATIC_CURVE_TO_NV = 0x0A;
    int GL_RELATIVE_QUADRATIC_CURVE_TO_NV = 0x0B;
    int GL_CUBIC_CURVE_TO_NV = 0x0C;
    int GL_RELATIVE_CUBIC_CURVE_TO_NV = 0x0D;
    int GL_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0E;
    int GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0x0F;
    int GL_SMOOTH_CUBIC_CURVE_TO_NV = 0x10;
    int GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV = 0x11;
    int GL_SMALL_CCW_ARC_TO_NV = 0x12;
    int GL_RELATIVE_SMALL_CCW_ARC_TO_NV = 0x13;
    int GL_SMALL_CW_ARC_TO_NV = 0x14;
    int GL_RELATIVE_SMALL_CW_ARC_TO_NV = 0x15;
    int GL_LARGE_CCW_ARC_TO_NV = 0x16;
    int GL_RELATIVE_LARGE_CCW_ARC_TO_NV = 0x17;
    int GL_LARGE_CW_ARC_TO_NV = 0x18;
    int GL_RELATIVE_LARGE_CW_ARC_TO_NV = 0x19;
    int GL_RESTART_PATH_NV = 0xF0;
    int GL_DUP_FIRST_CUBIC_CURVE_TO_NV = 0xF2;
    int GL_DUP_LAST_CUBIC_CURVE_TO_NV = 0xF4;
    int GL_RECT_NV = 0xF6;
    int GL_CIRCULAR_CCW_ARC_TO_NV = 0xF8;
    int GL_CIRCULAR_CW_ARC_TO_NV = 0xFA;
    int GL_CIRCULAR_TANGENT_ARC_TO_NV = 0xFC;
    int GL_ARC_TO_NV = 0xFE;
    int GL_RELATIVE_ARC_TO_NV = 0xFF;
    int GL_BOLD_BIT_NV = 0x01;
    int GL_ITALIC_BIT_NV = 0x02;
    int GL_GLYPH_WIDTH_BIT_NV = 0x01;
    int GL_GLYPH_HEIGHT_BIT_NV = 0x02;
    int GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV = 0x04;
    int GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV = 0x08;
    int GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10;
    int GL_GLYPH_VERTICAL_BEARING_X_BIT_NV = 0x20;
    int GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV = 0x40;
    int GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV = 0x80;
    int GL_GLYPH_HAS_KERNING_BIT_NV = 0x100;
    int GL_FONT_X_MIN_BOUNDS_BIT_NV = 0x00010000;
    int GL_FONT_Y_MIN_BOUNDS_BIT_NV = 0x00020000;
    int GL_FONT_X_MAX_BOUNDS_BIT_NV = 0x00040000;
    int GL_FONT_Y_MAX_BOUNDS_BIT_NV = 0x00080000;
    int GL_FONT_UNITS_PER_EM_BIT_NV = 0x00100000;
    int GL_FONT_ASCENDER_BIT_NV = 0x00200000;
    int GL_FONT_DESCENDER_BIT_NV = 0x00400000;
    int GL_FONT_HEIGHT_BIT_NV = 0x00800000;
    int GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV = 0x01000000;
    int GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV = 0x02000000;
    int GL_FONT_UNDERLINE_POSITION_BIT_NV = 0x04000000;
    int GL_FONT_UNDERLINE_THICKNESS_BIT_NV = 0x08000000;
    int GL_FONT_HAS_KERNING_BIT_NV = 0x10000000;
    int GL_ROUNDED_RECT_NV = 0xE8;
    int GL_RELATIVE_ROUNDED_RECT_NV = 0xE9;
    int GL_ROUNDED_RECT2_NV = 0xEA;
    int GL_RELATIVE_ROUNDED_RECT2_NV = 0xEB;
    int GL_ROUNDED_RECT4_NV = 0xEC;
    int GL_RELATIVE_ROUNDED_RECT4_NV = 0xED;
    int GL_ROUNDED_RECT8_NV = 0xEE;
    int GL_RELATIVE_ROUNDED_RECT8_NV = 0xEF;
    int GL_RELATIVE_RECT_NV = 0xF7;
    int GL_FONT_GLYPHS_AVAILABLE_NV = 0x9368;
    int GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369;
    int GL_FONT_UNAVAILABLE_NV = 0x936A;
    int GL_FONT_UNINTELLIGIBLE_NV = 0x936B;
    int GL_CONIC_CURVE_TO_NV = 0x1A;
    int GL_RELATIVE_CONIC_CURVE_TO_NV = 0x1B;
    int GL_FONT_NUM_GLYPH_INDICES_BIT_NV = 0x20000000;
    int GL_STANDARD_FONT_FORMAT_NV = 0x936C;
    int GL_2_BYTES_NV = 0x1407;
    int GL_3_BYTES_NV = 0x1408;
    int GL_4_BYTES_NV = 0x1409;
    int GL_EYE_LINEAR_NV = 0x2400;
    int GL_OBJECT_LINEAR_NV = 0x2401;
    int GL_CONSTANT_NV = 0x8576;
    int GL_PATH_FOG_GEN_MODE_NV = 0x90AC;
    int GL_PRIMARY_COLOR_NV = 0x852C;
    int GL_SECONDARY_COLOR_NV = 0x852D;
    int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;
    int GL_PATH_PROJECTION_NV = 0x1701;
    int GL_PATH_MODELVIEW_NV = 0x1700;
    int GL_PATH_MODELVIEW_STACK_DEPTH_NV = 0x0BA3;
    int GL_PATH_MODELVIEW_MATRIX_NV = 0x0BA6;
    int GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV = 0x0D36;
    int GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV = 0x84E3;
    int GL_PATH_PROJECTION_STACK_DEPTH_NV = 0x0BA4;
    int GL_PATH_PROJECTION_MATRIX_NV = 0x0BA7;
    int GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV = 0x0D38;
    int GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 0x84E4;
    int GL_FRAGMENT_INPUT_NV = 0x936D;

    default int glGenPathsNV(int range) {
        throw new ContextException();
    }

    default void glDeletePathsNV(int path, int range) {
        throw new ContextException();
    }

    default boolean glIsPathNV(int path) {
        throw new ContextException();
    }

    default void glPathCommandsNV(int path, int numCommands, @NativeType("const GLubyte *") MemorySegment commands, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glPathCoordsNV(int path, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, @NativeType("const GLubyte *") MemorySegment commands, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, @NativeType("const void *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glPathStringNV(int path, int format, int length, @NativeType("const void *") MemorySegment pathString) {
        throw new ContextException();
    }

    default void glPathGlyphsNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int numGlyphs, int type, @NativeType("const void *") MemorySegment charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        throw new ContextException();
    }

    default void glPathGlyphRangeNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
        throw new ContextException();
    }

    default void glWeightPathsNV(int resultPath, int numPaths, @NativeType("const GLuint *") MemorySegment paths, @NativeType("const GLfloat *") MemorySegment weights) {
        throw new ContextException();
    }

    default void glCopyPathNV(int resultPath, int srcPath) {
        throw new ContextException();
    }

    default void glInterpolatePathsNV(int resultPath, int pathA, int pathB, float weight) {
        throw new ContextException();
    }

    default void glTransformPathNV(int resultPath, int srcPath, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glPathParameterivNV(int path, int pname, @NativeType("const GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glPathParameteriNV(int path, int pname, int value) {
        throw new ContextException();
    }

    default void glPathParameterfvNV(int path, int pname, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glPathParameterfNV(int path, int pname, float value) {
        throw new ContextException();
    }

    default void glPathDashArrayNV(int path, int dashCount, @NativeType("const GLfloat *") MemorySegment dashArray) {
        throw new ContextException();
    }

    default void glPathStencilFuncNV(int func, int ref, int mask) {
        throw new ContextException();
    }

    default void glPathStencilDepthOffsetNV(float factor, float units) {
        throw new ContextException();
    }

    default void glStencilFillPathNV(int path, int fillMode, int mask) {
        throw new ContextException();
    }

    default void glStencilStrokePathNV(int path, int reference, int mask) {
        throw new ContextException();
    }

    default void glStencilFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int fillMode, int mask, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glStencilStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int reference, int mask, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glPathCoverDepthFuncNV(int func) {
        throw new ContextException();
    }

    default void glCoverFillPathNV(int path, int coverMode) {
        throw new ContextException();
    }

    default void glCoverStrokePathNV(int path, int coverMode) {
        throw new ContextException();
    }

    default void glCoverFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glCoverStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glGetPathParameterivNV(int path, int pname, @NativeType("GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetPathParameterfvNV(int path, int pname, @NativeType("GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetPathCommandsNV(int path, @NativeType("GLubyte *") MemorySegment commands) {
        throw new ContextException();
    }

    default void glGetPathCoordsNV(int path, @NativeType("GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glGetPathDashArrayNV(int path, @NativeType("GLfloat *") MemorySegment dashArray) {
        throw new ContextException();
    }

    default void glGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int stride, @NativeType("GLfloat *") MemorySegment metrics) {
        throw new ContextException();
    }

    default void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, @NativeType("GLfloat *") MemorySegment metrics) {
        throw new ContextException();
    }

    default void glGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, float advanceScale, float kerningScale, int transformType, @NativeType("GLfloat *") MemorySegment returnedSpacing) {
        throw new ContextException();
    }

    default boolean glIsPointInFillPathNV(int path, int mask, float x, float y) {
        throw new ContextException();
    }

    default boolean glIsPointInStrokePathNV(int path, float x, float y) {
        throw new ContextException();
    }

    default float glGetPathLengthNV(int path, int startSegment, int numSegments) {
        throw new ContextException();
    }

    default boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, @NativeType("GLfloat *") MemorySegment x, @NativeType("GLfloat *") MemorySegment y, @NativeType("GLfloat *") MemorySegment tangentX, @NativeType("GLfloat *") MemorySegment tangentY) {
        throw new ContextException();
    }

    default void glMatrixLoad3x2fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixLoad3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixLoadTranspose3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMult3x2fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMult3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMultTranspose3x3fNV(int matrixMode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glStencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode) {
        throw new ContextException();
    }

    default void glStencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode) {
        throw new ContextException();
    }

    default void glStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default void glStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, @NativeType("const void *") MemorySegment paths, int pathBase, int reference, int mask, int coverMode, int transformType, @NativeType("const GLfloat *") MemorySegment transformValues) {
        throw new ContextException();
    }

    default int glPathGlyphIndexRangeNV(int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int pathParameterTemplate, float emScale, @NativeType("GLuint *") MemorySegment baseAndCount) {
        throw new ContextException();
    }

    default int glPathGlyphIndexArrayNV(int firstPathName, int fontTarget, @NativeType("const void *") MemorySegment fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        throw new ContextException();
    }

    default int glPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, @NativeType("const void *") MemorySegment fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        throw new ContextException();
    }

    default void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, @NativeType("const GLfloat *") MemorySegment coeffs) {
        throw new ContextException();
    }

    default void glGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, @NativeType("const GLenum *") MemorySegment props, int count, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glPathColorGenNV(int color, int genMode, int colorFormat, @NativeType("const GLfloat *") MemorySegment coeffs) {
        throw new ContextException();
    }

    default void glPathTexGenNV(int texCoordSet, int genMode, int components, @NativeType("const GLfloat *") MemorySegment coeffs) {
        throw new ContextException();
    }

    default void glPathFogGenNV(int genMode) {
        throw new ContextException();
    }

    default void glGetPathColorGenivNV(int color, int pname, @NativeType("GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetPathColorGenfvNV(int color, int pname, @NativeType("GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetPathTexGenivNV(int texCoordSet, int pname, @NativeType("GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetPathTexGenfvNV(int texCoordSet, int pname, @NativeType("GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

}
