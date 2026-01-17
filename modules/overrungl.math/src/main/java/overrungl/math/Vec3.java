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

package overrungl.math;

import jdk.incubator.vector.Vector;
import jdk.incubator.vector.VectorMask;

/// @since 0.1.0
public interface Vec3<T> {
    Class<?> componentClass();

    Vector<T> toVector(int offset);

    Vector<T> toVector(int offset, VectorMask<T> mask);

    T x();

    T y();

    T z();

    Vec3<T> add(Vec3<T> v);

    Vec3<T> sub(Vec3<T> v);

    Vec3<T> mul(Vec3<T> v);

    Vec3<T> div(Vec3<T> v);

    T lengthSquared();

    T dot(Vec3<T> v);

    Vec3<T> cross(Vec3<T> v);
}
