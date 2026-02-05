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

import jdk.incubator.vector.*;

import java.util.Arrays;

/// @since 0.1.0
final /*value*/ class Vec3d implements Vec3<Double> {
    private static final VectorSpecies<Double> SPECIES = DoubleVector.SPECIES_PREFERRED;
    private static final int[] YX_INDEX2 = {1, 0};
    private static final int[] XZ_INDEX2 = {0, 2};
    private static final int[] ZX_INDEX2 = {2, 0};
    private static final int[] ZY_INDEX2 = {2, 1};
    private static final int[] YZZX_INDEX4 = {1, 2, 2, 0};
    private static final int[] ZYXZ_INDEX4 = {2, 1, 0, 2};
    private static final int[] YX_INDEX4 = {1, 0, 0, 0};
    private static final int[] YZZX_INDEX8 = {1, 2, 2, 0, 0, 0, 0, 0};
    private static final int[] ZYXZ_INDEX8 = {2, 1, 0, 2, 0, 0, 0, 0};
    private static final int[] YX_INDEX8 = {1, 0, 0, 0, 0, 0, 0, 0};
    private final double[] components;

    Vec3d(double[] components) {
        this.components = components;
    }

    public Vec3d(double x, double y, double z) {
        this(new double[]{x, y, z});
    }

    public Vec3d(double value) {
        this(value, value, value);
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
    public DoubleVector toVector(int offset, int[] indexMap, int mapOffset) {
        return DoubleVector.fromArray(SPECIES, components, offset, indexMap, mapOffset);
    }

    @Override
    public DoubleVector toVector(int offset, int[] indexMap, int mapOffset, VectorMask<Double> mask) {
        return DoubleVector.fromArray(SPECIES, components, offset, indexMap, mapOffset, mask);
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
    public Vec3<Double> add(Vec3<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec3d(x() + v.x(), y() + v.y(), z() + v.z());
            case S_128_BIT -> {
                var thisV = toVector(0);
                var otherV = v.toVector(0);
                var addV = thisV.add(otherV);
                yield new Vec3d(addV.lane(0), addV.lane(1), z() + v.z());
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                var thisV = toVector(0, mask);
                var otherV = v.toVector(0, mask);
                var addV = thisV.add(otherV, mask);
                yield new Vec3d(addV.lane(0), addV.lane(1), addV.lane(2));
            }
        };
    }

    @Override
    public Vec3<Double> sub(Vec3<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec3d(x() - v.x(), y() - v.y(), z() - v.z());
            case S_128_BIT -> {
                var thisV = toVector(0);
                var otherV = v.toVector(0);
                var subV = thisV.sub(otherV);
                yield new Vec3d(subV.lane(0), subV.lane(1), z() - v.z());
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                var thisV = toVector(0, mask);
                var otherV = v.toVector(0, mask);
                var subV = thisV.sub(otherV, mask);
                yield new Vec3d(subV.lane(0), subV.lane(1), subV.lane(2));
            }
        };
    }

    @Override
    public Vec3<Double> mul(Vec3<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec3d(x() * v.x(), y() * v.y(), z() * v.z());
            case S_128_BIT -> {
                var thisV = toVector(0);
                var otherV = v.toVector(0);
                var mulV = thisV.mul(otherV);
                yield new Vec3d(mulV.lane(0), mulV.lane(1), z() * v.z());
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                var thisV = toVector(0, mask);
                var otherV = v.toVector(0, mask);
                var mulV = thisV.mul(otherV, mask);
                yield new Vec3d(mulV.lane(0), mulV.lane(1), mulV.lane(2));
            }
        };
    }

    @Override
    public Vec3<Double> div(Vec3<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> new Vec3d(x() / v.x(), y() / v.y(), z() / v.z());
            case S_128_BIT -> {
                var thisV = toVector(0);
                var otherV = v.toVector(0);
                var divV = thisV.div(otherV);
                yield new Vec3d(divV.lane(0), divV.lane(1), z() / v.z());
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                var thisV = toVector(0, mask);
                var otherV = v.toVector(0, mask);
                var divV = thisV.div(otherV, mask);
                yield new Vec3d(divV.lane(0), divV.lane(1), divV.lane(2));
            }
        };
    }

    @Override
    public Double lengthSquared() {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> x() * x() + y() * y() + z() * z();
            case S_128_BIT -> {
                var thisV = toVector(0);
                yield thisV.mul(thisV).reduceLanes(VectorOperators.ADD) + z() * z();
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                var thisV = toVector(0, mask);
                yield thisV.mul(thisV, mask).reduceLanes(VectorOperators.ADD, mask);
            }
        };
    }

    @Override
    public Double dot(Vec3<Double> v) {
        return switch (SPECIES.vectorShape()) {
            case S_64_BIT -> x() * v.x() + y() * v.y() + z() * v.z();
            case S_128_BIT -> {
                var thisV = toVector(0);
                var otherV = v.toVector(0);
                var mulV = thisV.mul(otherV);
                yield mulV.reduceLanes(VectorOperators.ADD) + z() * v.z();
            }
            case S_256_BIT, S_512_BIT, S_Max_BIT -> {
                var mask = VectorMask.fromLong(SPECIES, 0b111);
                yield toVector(0, mask).mul(v.toVector(0, mask), mask).reduceLanes(VectorOperators.ADD, mask);
            }
        };
    }

    @Override
    public Vec3<Double> cross(Vec3<Double> v) {
        VectorShape vectorShape = SPECIES.vectorShape();
        return switch (vectorShape) {
            case S_64_BIT -> new Vec3d(
                y() * v.z() - z() * v.y(),
                z() * v.x() - x() * v.z(),
                x() * v.y() - y() * v.x()
            );
            case S_128_BIT -> {
                var yz1 = toVector(1);
                var zx1 = toVector(0, ZX_INDEX2, 0);
                var xy1 = toVector(0);
                var zy2 = v.toVector(0, ZY_INDEX2, 0);
                var xz2 = v.toVector(0, XZ_INDEX2, 0);
                var yx2 = v.toVector(0, YX_INDEX2, 0);
                var mulX = yz1.mul(zy2);
                var mulY = zx1.mul(xz2);
                var mulZ = xy1.mul(yx2);
                yield new Vec3d(
                    mulX.lane(0) - mulX.lane(1),
                    mulY.lane(0) - mulY.lane(1),
                    mulZ.lane(0) - mulZ.lane(1)
                );
            }
            case S_256_BIT, S_512_BIT -> {
                boolean shape256 = vectorShape == VectorShape.S_256_BIT;
                var mask2 = VectorMask.fromLong(SPECIES, 0b11);
                var mask4 = VectorMask.fromLong(SPECIES, 0b1111);
                var yzzx1 = toVector(0, shape256 ? YZZX_INDEX4 : YZZX_INDEX8, 0, mask4);
                var zyxz2 = v.toVector(0, shape256 ? ZYXZ_INDEX4 : ZYXZ_INDEX8, 0, mask4);
                var xy1 = toVector(0, mask2);
                var yx2 = v.toVector(0, shape256 ? YX_INDEX4 : YX_INDEX8, 0, mask2);
                var mulXY = yzzx1.mul(zyxz2, mask4);
                var mulZ = xy1.mul(yx2, mask2);
                yield new Vec3d(
                    mulXY.lane(0) - mulXY.lane(1),
                    mulXY.lane(2) - mulXY.lane(3),
                    mulZ.lane(0) - mulZ.lane(1)
                );
            }
            case S_Max_BIT -> {
                var mask2 = VectorMask.fromLong(SPECIES, 0b11);
                var yz1 = toVector(1, mask2);
                var zx1 = DoubleVector.fromArray(SPECIES, new double[]{z(), x()}, 0, mask2);
                var xy1 = toVector(0, mask2);
                var zy2 = DoubleVector.fromArray(SPECIES, new double[]{v.z(), v.y()}, 0, mask2);
                var xz2 = DoubleVector.fromArray(SPECIES, new double[]{v.x(), v.z()}, 0, mask2);
                var yx2 = DoubleVector.fromArray(SPECIES, new double[]{v.y(), v.x()}, 0, mask2);
                var mulX = yz1.mul(zy2, mask2);
                var mulY = zx1.mul(xz2, mask2);
                var mulZ = xy1.mul(yx2, mask2);
                yield new Vec3d(
                    mulX.lane(0) - mulX.lane(1),
                    mulY.lane(0) - mulY.lane(1),
                    mulZ.lane(0) - mulZ.lane(1)
                );
            }
        };
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vec3<?> vec3)) return false;
        if (vec3.componentClass() != double.class && vec3.componentClass() != Double.class) return false;
        var vec3d = (Vec3<Double>) vec3;
        return Double.compare(components[0], vec3d.x()) == 0
            && Double.compare(components[1], vec3d.y()) == 0
            && Double.compare(components[2], vec3d.z()) == 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(components);
    }

    @Override
    public String toString() {
        return "( " + components[0] + ", " + components[1] + ", " + components[2] + " )";
    }
}
