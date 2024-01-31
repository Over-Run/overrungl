/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

/**
 * The OpenGL 1.5 constants.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL15 extends GL15C permits GLLegacy {
    int VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
    int NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
    int COLOR_ARRAY_BUFFER_BINDING = 0x8898;
    int INDEX_ARRAY_BUFFER_BINDING = 0x8899;
    int TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
    int EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
    int SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
    int FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
    int WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
    int FOG_COORD_SRC = 0x8450;
    int FOG_COORD = 0x8451;
    int CURRENT_FOG_COORD = 0x8453;
    int FOG_COORD_ARRAY_TYPE = 0x8454;
    int FOG_COORD_ARRAY_STRIDE = 0x8455;
    int FOG_COORD_ARRAY_POINTER = 0x8456;
    int FOG_COORD_ARRAY = 0x8457;
    int FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D;
    int SRC0_RGB = 0x8580;
    int SRC1_RGB = 0x8581;
    int SRC2_RGB = 0x8582;
    int SRC0_ALPHA = 0x8588;
    int SRC2_ALPHA = 0x858A;
}
