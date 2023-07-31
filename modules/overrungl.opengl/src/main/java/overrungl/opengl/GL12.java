/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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
 * The OpenGL 1.2 constants.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL12 extends GL12C {
    public static final int RESCALE_NORMAL = 0x803A;
    public static final int LIGHT_MODEL_COLOR_CONTROL = 0x81F8,
        SINGLE_COLOR = 0x81F9,
        SEPARATE_SPECULAR_COLOR = 0x81FA;
    public static final int ALIASED_POINT_SIZE_RANGE = 0x846D;
}
