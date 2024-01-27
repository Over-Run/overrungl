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
 * The STB image resizer datatype
 *
 * @author squid233
 * @since 0.1.0
 */
public enum STBIRDatatype implements CEnum {
    UINT8(0),
    UINT8_SRGB(1),
    /**
     * alpha channel, when present, should also be SRGB (this is very unusual)
     */
    UINT8_SRGB_ALPHA(2),
    UINT16(3),
    FLOAT(4),
    HALF_FLOAT(5);

    private final int value;

    STBIRDatatype(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}
