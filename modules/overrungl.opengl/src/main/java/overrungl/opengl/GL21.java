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

import overrun.marshal.DirectAccess;

/**
 * The OpenGL 2.1 constants.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL21 extends DirectAccess {
    int CURRENT_RASTER_SECONDARY_COLOR = 0x845F;
    int SLUMINANCE_ALPHA = 0x8C44;
    int SLUMINANCE8_ALPHA8 = 0x8C45;
    int SLUMINANCE = 0x8C46;
    int SLUMINANCE8 = 0x8C47;
    int COMPRESSED_SLUMINANCE = 0x8C4A;
    int COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;
}
