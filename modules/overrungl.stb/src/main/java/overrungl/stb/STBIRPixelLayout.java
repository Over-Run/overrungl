/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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
 * stbir_pixel_layout specifies:<br>
 * number of channels<br>
 * order of channels<br>
 * whether color is premultiplied by alpha
 *
 * @author squid233
 * @since 0.1.0
 */
public enum STBIRPixelLayout implements CEnum {
    _1CHANNEL(1),
    _2CHANNEL(2),
    /**
     * 3-chan, with order specified (for channel flipping)
     */
    RGB(3),
    /**
     * 3-chan, with order specified (for channel flipping)
     */
    BGR(0),
    _4CHANNEL(5),
    /**
     * alpha formats, where alpha is NOT premultiplied into color channels
     */
    RGBA(4),
    BGRA(6),
    ARGB(7),
    ABGR(8),
    RA(9),
    AR(10),
    /**
     * alpha formats, where alpha is premultiplied into color channels
     */
    RGBA_PM(11),
    BGRA_PM(12),
    ARGB_PM(13),
    ABGR_PM(14),
    RA_PM(15),
    AR_PM(16),
    /**
     * alpha formats, where NO alpha weighting is applied at all!
     * these are just synonyms for the _PM flags (which also do
     * no alpha weighting). These names just make it more clear
     * for some folks).
     */
    RGBA_NO_AW(11),
    BGRA_NO_AW(12),
    ARGB_NO_AW(13),
    ABGR_NO_AW(14),
    RA_NO_AW(15),
    AR_NO_AW(16),
    ;

    private final int value;

    STBIRPixelLayout(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}
