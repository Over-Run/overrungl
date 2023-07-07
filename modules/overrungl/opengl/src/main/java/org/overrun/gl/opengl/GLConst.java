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

/**
 * The OpenGL 1.0 ~ 4.6 constants.
 *
 * @author squid233
 * @since 0.1.0
 */
@Deprecated(since = "0.1.0")
public final class GLConst extends GLConstC {
    public static final int GL_2_BYTES_NV = 0x1407;
    public static final int GL_3_BYTES_NV = 0x1408;
    public static final int GL_4_BYTES_NV = 0x1409;
    public static final int GL_ADD_SIGNED = 0x8574;
    public static final int GL_ALPHA_INTEGER = 0x8D97;
    public static final int GL_AUTO_NORMAL = 0x0D80;
    public static final int GL_CLAMP_FRAGMENT_COLOR = 0x891B;
    public static final int GL_CLAMP_VERTEX_COLOR = 0x891A;
    public static final int GL_CLIENT_ACTIVE_TEXTURE = 0x84E1;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 0x8898;
    public static final int GL_COLOR_MATRIX = 0x80B1;
    public static final int GL_COLOR_MATRIX_STACK_DEPTH = 0x80B2;
    public static final int GL_COLOR_SUM = 0x8458;
    public static final int GL_COLOR_TABLE = 0x80D0;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE = 0x80DD;
    public static final int GL_COLOR_TABLE_BIAS = 0x80D7;
    public static final int GL_COLOR_TABLE_BLUE_SIZE = 0x80DC;
    public static final int GL_COLOR_TABLE_FORMAT = 0x80D8;
    public static final int GL_COLOR_TABLE_GREEN_SIZE = 0x80DB;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE;
    public static final int GL_COLOR_TABLE_RED_SIZE = 0x80DA;
    public static final int GL_COLOR_TABLE_SCALE = 0x80D6;
    public static final int GL_COLOR_TABLE_WIDTH = 0x80D9;
    public static final int GL_COMBINE = 0x8570;
    public static final int GL_COMBINE_ALPHA = 0x8572;
    public static final int GL_COMBINE_RGB = 0x8571;
    public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;
    public static final int GL_COMPRESSED_ALPHA = 0x84E9;
    public static final int GL_COMPRESSED_INTENSITY = 0x84EC;
    public static final int GL_COMPRESSED_LUMINANCE = 0x84EA;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    public static final int GL_COMPRESSED_SLUMINANCE = 0x8C4A;
    public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;
    public static final int GL_CONSTANT = 0x8576;
    public static final int GL_CONSTANT_BORDER = 0x8151;
    public static final int GL_CONSTANT_NV = 0x8576;
    public static final int GL_CONVOLUTION_1D = 0x8010;
    public static final int GL_CONVOLUTION_2D = 0x8011;
    public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;
    public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;
    public static final int GL_CONVOLUTION_FILTER_BIAS = 0x8015;
    public static final int GL_CONVOLUTION_FILTER_SCALE = 0x8014;
    public static final int GL_CONVOLUTION_FORMAT = 0x8017;
    public static final int GL_CONVOLUTION_HEIGHT = 0x8019;
    public static final int GL_CONVOLUTION_WIDTH = 0x8018;
    public static final int GL_COORD_REPLACE = 0x8862;
    public static final int GL_CURRENT_FOG_COORD = 0x8453;
    public static final int GL_CURRENT_FOG_COORDINATE = 0x8453;
    public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;
    public static final int GL_CURRENT_SECONDARY_COLOR = 0x8459;
    public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;
    public static final int GL_DISPLAY_LIST = 0x82E7;
    public static final int GL_DOT3_RGB = 0x86AE;
    public static final int GL_DOT3_RGBA = 0x86AF;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
    public static final int GL_EYE_LINEAR_NV = 0x2400;
    public static final int GL_FOG_COORD = 0x8451;
    public static final int GL_FOG_COORDINATE = 0x8451;
    public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;
    public static final int GL_FOG_COORD_ARRAY = 0x8457;
    public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_FOG_COORD_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORD_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORD_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORD_SRC = 0x8450;
    public static final int GL_FRAGMENT_DEPTH = 0x8452;
    public static final int GL_GENERATE_MIPMAP = 0x8191;
    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;
    public static final int GL_HISTOGRAM = 0x8024;
    public static final int GL_HISTOGRAM_ALPHA_SIZE = 0x802B;
    public static final int GL_HISTOGRAM_BLUE_SIZE = 0x802A;
    public static final int GL_HISTOGRAM_FORMAT = 0x8027;
    public static final int GL_HISTOGRAM_GREEN_SIZE = 0x8029;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C;
    public static final int GL_HISTOGRAM_RED_SIZE = 0x8028;
    public static final int GL_HISTOGRAM_SINK = 0x802D;
    public static final int GL_HISTOGRAM_WIDTH = 0x8026;
    public static final int GL_INDEX = 0x8222;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 0x8899;
    public static final int GL_INTERPOLATE = 0x8575;
    public static final int GL_MAP_COLOR = 0x0D10;
    public static final int GL_MAP_STENCIL = 0x0D11;
    public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;
    public static final int GL_MAX_CONVOLUTION_HEIGHT = 0x801B;
    public static final int GL_MAX_CONVOLUTION_WIDTH = 0x801A;
    public static final int GL_MAX_TEXTURE_COORDS = 0x8871;
    public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;
    public static final int GL_MINMAX = 0x802E;
    public static final int GL_MINMAX_FORMAT = 0x802F;
    public static final int GL_MINMAX_SINK = 0x8030;
    public static final int GL_MULTISAMPLE_BIT = 0x20000000;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
    public static final int GL_NORMAL_MAP = 0x8511;
    public static final int GL_OBJECT_LINEAR_NV = 0x2401;
    public static final int GL_OPERAND0_ALPHA = 0x8598;
    public static final int GL_OPERAND0_RGB = 0x8590;
    public static final int GL_OPERAND1_ALPHA = 0x8599;
    public static final int GL_OPERAND1_RGB = 0x8591;
    public static final int GL_OPERAND2_ALPHA = 0x859A;
    public static final int GL_OPERAND2_RGB = 0x8592;
    public static final int GL_PATH_FOG_GEN_MODE_NV = 0x90AC;
    public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;
    public static final int GL_POINT_DISTANCE_ATTENUATION = 0x8129;
    public static final int GL_POINT_SIZE_MAX = 0x8127;
    public static final int GL_POINT_SIZE_MIN = 0x8126;
    public static final int GL_POINT_SPRITE = 0x8861;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 0x80BB;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7;
    public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 0x80BA;
    public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 0x80B6;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;
    public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 0x80B9;
    public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5;
    public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 0x80B8;
    public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 0x80B4;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 0x8023;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 0x8022;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 0x801E;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 0x80D1;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 0x8021;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D;
    public static final int GL_POST_CONVOLUTION_RED_BIAS = 0x8020;
    public static final int GL_POST_CONVOLUTION_RED_SCALE = 0x801C;
    public static final int GL_PREVIOUS = 0x8578;
    public static final int GL_PRIMARY_COLOR = 0x8577;
    public static final int GL_PROXY_COLOR_TABLE = 0x80D3;
    public static final int GL_PROXY_HISTOGRAM = 0x8025;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 0x80D4;
    public static final int GL_REDUCE = 0x8016;
    public static final int GL_REFLECTION_MAP = 0x8512;
    public static final int GL_REPLICATE_BORDER = 0x8153;
    public static final int GL_RGB_SCALE = 0x8573;
    public static final int GL_S = 0x2000;
    public static final int GL_SCISSOR_BIT = 0x00080000;
    public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 0x845B;
    public static final int GL_SEPARABLE_2D = 0x8012;
    public static final int GL_SLUMINANCE = 0x8C46;
    public static final int GL_SLUMINANCE8 = 0x8C47;
    public static final int GL_SLUMINANCE8_ALPHA8 = 0x8C45;
    public static final int GL_SLUMINANCE_ALPHA = 0x8C44;
    public static final int GL_SOURCE0_ALPHA = 0x8588;
    public static final int GL_SOURCE0_RGB = 0x8580;
    public static final int GL_SOURCE1_RGB = 0x8581;
    public static final int GL_SOURCE2_ALPHA = 0x858A;
    public static final int GL_SOURCE2_RGB = 0x8582;
    public static final int GL_SRC0_ALPHA = 0x8588;
    public static final int GL_SRC0_RGB = 0x8580;
    public static final int GL_SRC1_RGB = 0x8581;
    public static final int GL_SRC2_ALPHA = 0x858A;
    public static final int GL_SRC2_RGB = 0x8582;
    public static final int GL_SUBTRACT = 0x84E7;
    public static final int GL_TABLE_TOO_LARGE = 0x8031;
    public static final int GL_TEXTURE_BIT = 0x00040000;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
    public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;
    public static final int GL_TEXTURE_INTENSITY_TYPE = 0x8C15;
    public static final int GL_TEXTURE_LUMINANCE_TYPE = 0x8C14;
    public static final int GL_TRANSPOSE_COLOR_MATRIX = 0x84E6;
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 0x8643;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
}
