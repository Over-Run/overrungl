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

package overrungl.stb;

import overrun.marshal.CEnum;

/**
 * The STB image resizer filter
 *
 * @author squid233
 * @since 0.1.0
 */
public enum STBIRFilter implements CEnum {
    /**
     * use same filter type that easy-to-use API chooses
     */
    DEFAULT(0),
    /**
     * A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios
     */
    BOX(1),
    /**
     * On upsampling, produces same results as bilinear texture filtering
     */
    TRIANGLE(2),
    /**
     * The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque
     */
    CUBICBSPLINE(3),
    /**
     * An interpolating cubic spline
     */
    CATMULLROM(4),
    /**
     * Mitchell-Netrevalli filter with B=1/3, C=1/3
     */
    MITCHELL(5),
    /**
     * Simple point sampling
     */
    POINT_SAMPLE(6),
    /**
     * User callback specified
     */
    OTHER(7);

    private final int value;

    STBIRFilter(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}
