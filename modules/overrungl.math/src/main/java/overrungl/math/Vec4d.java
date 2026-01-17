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

import jdk.incubator.vector.DoubleVector;
import jdk.incubator.vector.VectorMask;
import jdk.incubator.vector.VectorOperators;
import jdk.incubator.vector.VectorSpecies;

import java.util.Arrays;

/// @since 0.1.0
final /*value*/ class Vec4d implements Vec4<Double> {
    private static final VectorSpecies<Double> SPECIES = DoubleVector.SPECIES_PREFERRED;
    private final double[] components;

    Vec4d(double[] components) {
        this.components = components;
    }

    public Vec4d(double x, double y, double z, double w) {
        this(new double[]{x, y, z, w});
    }

    public Vec4d(double value) {
        this(value, value, value, value);
    }

    @Override
    public Class<?> componentClass() {
        return double.class;
    }

    @Override
    public DoubleVector toVector(int offset) {
        return DoubleVector.fromArray(SPECIES, components, offset);
    }

    @Override
    public DoubleVector toVector(int offset, VectorMask<Double> mask) {
        return DoubleVector.fromArray(SPECIES, components, offset, mask);
    }

    @Override
    public Double x() {
        return components[0];
    }

    @Override
    public Double y() {
        return components[1];
    }

    @Override
    public Double z() {
        return components[2];
    }

    @Override
    public Double w() {
        return components[3];
    }

    @Override
    public Vec4<Double> add(Vec4<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec4d(x() + v.x(), y() + v.y(), z() + v.z(), w() + v.w());
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                var otherV0 = v.toVector(0);
                var otherV1 = v.toVector(2);
                var addV0 = thisV0.add(otherV0);
                var addV1 = thisV1.add(otherV1);
                yield new Vec4d(addV0.lane(0), addV0.lane(1), addV1.lane(0), addV1.lane(1));
            }
            case S_256_BIT -> new Vec4d(toVector(0).add(v.toVector(0)).toArray());
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                double[] arr = new double[4];
                toVector(0, mask).add(v.toVector(0, mask)).intoArray(arr, 0, mask);
                yield new Vec4d(arr);
            }
        };
    }

    @Override
    public Vec4<Double> sub(Vec4<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec4d(x() - v.x(), y() - v.y(), z() - v.z(), w() - v.w());
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                var otherV0 = v.toVector(0);
                var otherV1 = v.toVector(2);
                var subV0 = thisV0.sub(otherV0);
                var subV1 = thisV1.sub(otherV1);
                yield new Vec4d(subV0.lane(0), subV0.lane(1), subV1.lane(0), subV1.lane(1));
            }
            case S_256_BIT -> new Vec4d(toVector(0).sub(v.toVector(0)).toArray());
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                double[] arr = new double[4];
                toVector(0, mask).sub(v.toVector(0, mask)).intoArray(arr, 0, mask);
                yield new Vec4d(arr);
            }
        };
    }

    @Override
    public Vec4<Double> mul(Vec4<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec4d(x() * v.x(), y() * v.y(), z() * v.z(), w() * v.w());
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                var otherV0 = v.toVector(0);
                var otherV1 = v.toVector(2);
                var mulV0 = thisV0.mul(otherV0);
                var mulV1 = thisV1.mul(otherV1);
                yield new Vec4d(mulV0.lane(0), mulV0.lane(1), mulV1.lane(0), mulV1.lane(1));
            }
            case S_256_BIT -> new Vec4d(toVector(0).mul(v.toVector(0)).toArray());
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                double[] arr = new double[4];
                toVector(0, mask).mul(v.toVector(0, mask)).intoArray(arr, 0, mask);
                yield new Vec4d(arr);
            }
        };
    }

    @Override
    public Vec4<Double> div(Vec4<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec4d(x() / v.x(), y() / v.y(), z() / v.z(), w() / v.w());
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                var otherV0 = v.toVector(0);
                var otherV1 = v.toVector(2);
                var divV0 = thisV0.div(otherV0);
                var divV1 = thisV1.div(otherV1);
                yield new Vec4d(divV0.lane(0), divV0.lane(1), divV1.lane(0), divV1.lane(1));
            }
            case S_256_BIT -> new Vec4d(toVector(0).div(v.toVector(0)).toArray());
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                double[] arr = new double[4];
                toVector(0, mask).div(v.toVector(0, mask)).intoArray(arr, 0, mask);
                yield new Vec4d(arr);
            }
        };
    }

    @Override
    public Double lengthSquared() {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> x() * x() + y() * y() + z() * z() + w() * w();
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                yield thisV0.mul(thisV0).add(thisV1.mul(thisV1)).reduceLanes(VectorOperators.ADD);
            }
            case S_256_BIT -> {
                var thisV = toVector(0);
                yield thisV.mul(thisV).reduceLanes(VectorOperators.ADD);
            }
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                var thisV = toVector(0, mask);
                yield thisV.mul(thisV, mask).reduceLanes(VectorOperators.ADD, mask);
            }
        };
    }

    @Override
    public Double dot(Vec4<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> x() * v.x() + y() * v.y() + z() * v.z() + w() * v.w();
            case S_128_BIT -> {
                var thisV0 = toVector(0);
                var thisV1 = toVector(2);
                var otherV0 = v.toVector(0);
                var otherV1 = v.toVector(2);
                var mulV0 = thisV0.mul(otherV0);
                var mulV1 = thisV1.mul(otherV1);
                yield mulV0.add(mulV1).reduceLanes(VectorOperators.ADD);
            }
            case S_256_BIT -> toVector(0).mul(v.toVector(0)).reduceLanes(VectorOperators.ADD);
            case S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b1111);
                yield toVector(0, mask).mul(v.toVector(0, mask)).reduceLanes(VectorOperators.ADD, mask);
            }
        };
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vec4<?> vec4)) return false;
        if (vec4.componentClass() != double.class) return false;
        var vec4d = (Vec4<Double>) vec4;
        return Double.compare(components[0], vec4d.x()) == 0
            && Double.compare(components[1], vec4d.y()) == 0
            && Double.compare(components[2], vec4d.z()) == 0
            && Double.compare(components[3], vec4d.w()) == 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(components);
    }

    @Override
    public String toString() {
        return "( " + components[0] + ", " + components[1] + ", " + components[2] + ", " + components[3] + " )";
    }
}
