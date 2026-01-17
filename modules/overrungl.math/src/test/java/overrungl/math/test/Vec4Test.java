/*
 * MIT License
 *
 * Copyright (c) 2026 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.math.test;

import org.junit.jupiter.api.Test;
import overrungl.math.Vec4;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// @since 0.1.0
public class Vec4Test {
    @Test
    void testDouble() {
        var v1 = Vec4.doubles(1, 2, 3, 4);
        var v2 = Vec4.doubles(5, 6, 7, 8);

        var vAdd = v1.add(v2);
        assertEquals(Vec4.doubles(6, 8, 10, 12), vAdd);

        var vSub = v1.sub(v2);
        assertEquals(Vec4.doubles(-4, -4, -4, -4), vSub);

        var vMul = v1.mul(v2);
        assertEquals(Vec4.doubles(5, 12, 21, 32), vMul);

        var vDiv = v1.div(v2);
        assertEquals(Vec4.doubles(1.0 / 5, 2.0 / 6, 3.0 / 7, 4.0 / 8), vDiv);

        var v1LengthSq = v1.lengthSquared();
        assertEquals(30, v1LengthSq);

        var v2LengthSq = v2.lengthSquared();
        assertEquals(174, v2LengthSq);

        var dot = v1.dot(v2);
        assertEquals(70, dot);
    }
}
