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
import overrungl.math.Vec3;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// @since 0.1.0
public class Vec3Test {
    @Test
    void testDouble() {
        var v1 = Vec3.doubles(1, 2, 3);
        var v2 = Vec3.doubles(4, 5, 6);

        var vAdd = v1.add(v2);
        assertEquals(Vec3.doubles(5, 7, 9), vAdd);

        var vSub = v1.sub(v2);
        assertEquals(Vec3.doubles(-3, -3, -3), vSub);

        var vMul = v1.mul(v2);
        assertEquals(Vec3.doubles(4, 10, 18), vMul);

        var vDiv = v1.div(v2);
        assertEquals(Vec3.doubles(1.0 / 4, 2.0 / 5, 3.0 / 6), vDiv);

        var v1LengthSq = v1.lengthSquared();
        assertEquals(14, v1LengthSq);

        var v2LengthSq = v2.lengthSquared();
        assertEquals(77, v2LengthSq);

        var dot = v1.dot(v2);
        assertEquals(32, dot);

        var cross = v1.cross(v2);
        assertEquals(Vec3.doubles(-3, 6, -3), cross);
    }
}
