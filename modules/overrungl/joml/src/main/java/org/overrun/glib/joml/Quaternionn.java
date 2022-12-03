/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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

package org.overrun.glib.joml;

import org.joml.Quaterniondc;
import org.joml.Quaternionfc;
import org.overrun.glib.util.BufferBuilder;
import org.overrun.glib.util.MemoryStack;
import org.overrun.glib.util.MemoryUtil;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

/**
 * The quaternion-to-native-memory util.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Quaternionn {
    /**
     * The {@code Quaternionf} layout.
     */
    public static final SequenceLayout Q4F = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
    /**
     * The {@code Quaterniond} layout.
     */
    public static final SequenceLayout Q4D = MemoryLayout.sequenceLayout(4, JAVA_DOUBLE);

    /**
     * Allocates the quaternion.
     *
     * @param scope the segment scope
     * @param q     the quaternion
     * @return the segment
     */
    public static MemorySegment allocate(MemorySession scope, Quaternionfc q) {
        return put(q, MemorySegment.allocateNative(Q4F, scope));
    }

    /**
     * Allocates the quaternion.
     *
     * @param scope the segment scope
     * @param q     the quaternion
     * @return the segment
     */
    public static MemorySegment allocate(MemorySession scope, Quaterniondc q) {
        return put(q, MemorySegment.allocateNative(Q4D, scope));
    }

    /**
     * Allocates the quaternion by C memory function.
     *
     * @param q the quaternion
     * @return the memory address
     */
    public static MemoryAddress malloc(Quaternionfc q) {
        return put(q, MemoryUtil.malloc(Q4F));
    }

    /**
     * Allocates the quaternion by C memory function.
     *
     * @param q the quaternion
     * @return the memory address
     */
    public static MemoryAddress malloc(Quaterniondc q) {
        return put(q, MemoryUtil.malloc(Q4D));
    }

    /**
     * Allocates the quaternion on stack.
     *
     * @param stack the memory stack
     * @param q     the quaternion
     * @return the memory address
     */
    public static MemoryAddress malloc(MemoryStack stack, Quaternionfc q) {
        return put(q, stack.malloc(Q4F));
    }

    /**
     * Allocates the quaternion on stack.
     *
     * @param stack the memory stack
     * @param q     the quaternion
     * @return the memory address
     */
    public static MemoryAddress malloc(MemoryStack stack, Quaterniondc q) {
        return put(q, stack.malloc(Q4D));
    }

    /**
     * Puts the quaternion at the given offset.
     *
     * @param q      the quaternion
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Quaternionfc q, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, q.x());
        dest.set(JAVA_FLOAT, offset + 4, q.y());
        dest.set(JAVA_FLOAT, offset + 8, q.z());
        dest.set(JAVA_FLOAT, offset + 12, q.w());
        return dest;
    }

    /**
     * Puts the quaternion at the given offset.
     *
     * @param q      the quaternion
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Quaterniondc q, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, q.x());
        dest.set(JAVA_DOUBLE, offset + 8, q.y());
        dest.set(JAVA_DOUBLE, offset + 16, q.z());
        dest.set(JAVA_DOUBLE, offset + 24, q.w());
        return dest;
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Quaternionfc q, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, q.x());
        dest.set(JAVA_FLOAT, 4, q.y());
        dest.set(JAVA_FLOAT, 8, q.z());
        dest.set(JAVA_FLOAT, 12, q.w());
        return dest;
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Quaterniondc q, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, q.x());
        dest.set(JAVA_DOUBLE, 8, q.y());
        dest.set(JAVA_DOUBLE, 16, q.z());
        dest.set(JAVA_DOUBLE, 24, q.w());
        return dest;
    }

    /**
     * Puts the quaternion at the given offset.
     *
     * @param q      the quaternion
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    @Deprecated(since = "20", forRemoval = true)
    public static MemoryAddress put(Quaternionfc q, long offset, MemoryAddress dest) {
        dest.set(JAVA_FLOAT, offset, q.x());
        dest.set(JAVA_FLOAT, offset + 4, q.y());
        dest.set(JAVA_FLOAT, offset + 8, q.z());
        dest.set(JAVA_FLOAT, offset + 12, q.w());
        return dest;
    }

    /**
     * Puts the quaternion at the given offset.
     *
     * @param q      the quaternion
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    @Deprecated(since = "20", forRemoval = true)
    public static MemoryAddress put(Quaterniondc q, long offset, MemoryAddress dest) {
        dest.set(JAVA_DOUBLE, offset, q.x());
        dest.set(JAVA_DOUBLE, offset + 8, q.y());
        dest.set(JAVA_DOUBLE, offset + 16, q.z());
        dest.set(JAVA_DOUBLE, offset + 24, q.w());
        return dest;
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    @Deprecated(since = "20", forRemoval = true)
    public static MemoryAddress put(Quaternionfc q, MemoryAddress dest) {
        dest.set(JAVA_FLOAT, 0, q.x());
        dest.set(JAVA_FLOAT, 4, q.y());
        dest.set(JAVA_FLOAT, 8, q.z());
        dest.set(JAVA_FLOAT, 12, q.w());
        return dest;
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    @Deprecated(since = "20", forRemoval = true)
    public static MemoryAddress put(Quaterniondc q, MemoryAddress dest) {
        dest.set(JAVA_DOUBLE, 0, q.x());
        dest.set(JAVA_DOUBLE, 8, q.y());
        dest.set(JAVA_DOUBLE, 16, q.z());
        dest.set(JAVA_DOUBLE, 24, q.w());
        return dest;
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Quaternionfc q, BufferBuilder dest) {
        return dest.put(JAVA_FLOAT, q.x())
            .put(JAVA_FLOAT, q.y())
            .put(JAVA_FLOAT, q.z())
            .put(JAVA_FLOAT, q.w());
    }

    /**
     * Puts the quaternion.
     *
     * @param q    the quaternion
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Quaterniondc q, BufferBuilder dest) {
        return dest.put(JAVA_DOUBLE, q.x())
            .put(JAVA_DOUBLE, q.y())
            .put(JAVA_DOUBLE, q.z())
            .put(JAVA_DOUBLE, q.w());
    }
}
