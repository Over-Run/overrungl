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
 * The STB image resizer edge
 *
 * @author squid233
 * @since 0.1.0
 */
public enum STBIREdge implements CEnum {
    CLAMP(0),
    REFLECT(1),
    /**
     * this edge mode is slower and uses more memory
     */
    WRAP(2),
    ZERO(3);

    private final int value;

    STBIREdge(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}
