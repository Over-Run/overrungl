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
 * The OpenGL 3.0 constants.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL30 extends GL30C permits GLLegacy {
    int CLAMP_VERTEX_COLOR = 0x891A;
    int CLAMP_FRAGMENT_COLOR = 0x891B;
    int ALPHA_INTEGER = 0x8D97;
}
