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

import org.joml.*;
import org.overrun.glib.util.BufferBuilder;
import org.overrun.glib.util.MemoryStack;
import org.overrun.glib.util.MemoryUtil;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.lang.foreign.SequenceLayout;

import static java.lang.foreign.ValueLayout.*;

/**
 * The vector-to-native-memory util.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Vectorn {
    /**
     * The {@code Vector2i} layout.
     */
    public static final SequenceLayout VEC2I = MemoryLayout.sequenceLayout(2, JAVA_INT);
    /**
     * The {@code Vector2f} layout.
     */
    public static final SequenceLayout VEC2F = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
    /**
     * The {@code Vector2d} layout.
     */
    public static final SequenceLayout VEC2D = MemoryLayout.sequenceLayout(2, JAVA_DOUBLE);
    /**
     * The {@code Vector3i} layout.
     */
    public static final SequenceLayout VEC3I = MemoryLayout.sequenceLayout(3, JAVA_INT);
    /**
     * The {@code Vector3f} layout.
     */
    public static final SequenceLayout VEC3F = MemoryLayout.sequenceLayout(3, JAVA_FLOAT);
    /**
     * The {@code Vector3d} layout.
     */
    public static final SequenceLayout VEC3D = MemoryLayout.sequenceLayout(3, JAVA_DOUBLE);
    /**
     * The {@code Vector4i} layout.
     */
    public static final SequenceLayout VEC4I = MemoryLayout.sequenceLayout(4, JAVA_INT);
    /**
     * The {@code Vector4f} layout.
     */
    public static final SequenceLayout VEC4F = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
    /**
     * The {@code Vector4d} layout.
     */
    public static final SequenceLayout VEC4D = MemoryLayout.sequenceLayout(4, JAVA_DOUBLE);

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector2ic vec) {
        return put(vec, MemorySegment.allocateNative(VEC2I, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector2fc vec) {
        return put(vec, MemorySegment.allocateNative(VEC2F, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector2dc vec) {
        return put(vec, MemorySegment.allocateNative(VEC2D, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector3ic vec) {
        return put(vec, MemorySegment.allocateNative(VEC3I, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector3fc vec) {
        return put(vec, MemorySegment.allocateNative(VEC3F, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector3dc vec) {
        return put(vec, MemorySegment.allocateNative(VEC3D, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector4ic vec) {
        return put(vec, MemorySegment.allocateNative(VEC4I, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector4fc vec) {
        return put(vec, MemorySegment.allocateNative(VEC4F, scope));
    }

    /**
     * Allocates the vector.
     *
     * @param scope the segment scope
     * @param vec   the vector
     * @return the segment
     */
    public static MemorySegment allocate(SegmentScope scope, Vector4dc vec) {
        return put(vec, MemorySegment.allocateNative(VEC4D, scope));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector2ic vec) {
        return put(vec, MemoryUtil.malloc(VEC2I));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector2fc vec) {
        return put(vec, MemoryUtil.malloc(VEC2F));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector2dc vec) {
        return put(vec, MemoryUtil.malloc(VEC2D));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector3ic vec) {
        return put(vec, MemoryUtil.malloc(VEC3I));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector3fc vec) {
        return put(vec, MemoryUtil.malloc(VEC3F));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector3dc vec) {
        return put(vec, MemoryUtil.malloc(VEC3D));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector4ic vec) {
        return put(vec, MemoryUtil.malloc(VEC4I));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector4fc vec) {
        return put(vec, MemoryUtil.malloc(VEC4F));
    }

    /**
     * Allocates the vector by C memory function.
     *
     * @param vec the vector
     * @return the memory address
     */
    public static MemorySegment malloc(Vector4dc vec) {
        return put(vec, MemoryUtil.malloc(VEC4D));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector2ic vec) {
        return put(vec, stack.malloc(VEC2I));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector2fc vec) {
        return put(vec, stack.malloc(VEC2F));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector2dc vec) {
        return put(vec, stack.malloc(VEC2D));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector3ic vec) {
        return put(vec, stack.malloc(VEC3I));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector3fc vec) {
        return put(vec, stack.malloc(VEC3F));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector3dc vec) {
        return put(vec, stack.malloc(VEC3D));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector4ic vec) {
        return put(vec, stack.malloc(VEC4I));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector4fc vec) {
        return put(vec, stack.malloc(VEC4F));
    }

    /**
     * Allocates the vector on stack.
     *
     * @param stack the memory stack
     * @param vec   the vector
     * @return the memory address
     */
    public static MemorySegment malloc(MemoryStack stack, Vector4dc vec) {
        return put(vec, stack.malloc(VEC4D));
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2ic vec, long offset, MemorySegment dest) {
        dest.set(JAVA_INT, offset, vec.x());
        dest.set(JAVA_INT, offset + 4, vec.y());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2fc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, vec.x());
        dest.set(JAVA_FLOAT, offset + 4, vec.y());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2dc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, vec.x());
        dest.set(JAVA_DOUBLE, offset + 8, vec.y());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3ic vec, long offset, MemorySegment dest) {
        dest.set(JAVA_INT, offset, vec.x());
        dest.set(JAVA_INT, offset + 4, vec.y());
        dest.set(JAVA_INT, offset + 8, vec.z());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3fc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, vec.x());
        dest.set(JAVA_FLOAT, offset + 4, vec.y());
        dest.set(JAVA_FLOAT, offset + 8, vec.z());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3dc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, vec.x());
        dest.set(JAVA_DOUBLE, offset + 8, vec.y());
        dest.set(JAVA_DOUBLE, offset + 16, vec.z());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4ic vec, long offset, MemorySegment dest) {
        dest.set(JAVA_INT, offset, vec.x());
        dest.set(JAVA_INT, offset + 4, vec.y());
        dest.set(JAVA_INT, offset + 8, vec.z());
        dest.set(JAVA_INT, offset + 12, vec.w());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4fc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_FLOAT, offset, vec.x());
        dest.set(JAVA_FLOAT, offset + 4, vec.y());
        dest.set(JAVA_FLOAT, offset + 8, vec.z());
        dest.set(JAVA_FLOAT, offset + 12, vec.w());
        return dest;
    }

    /**
     * Puts the vector at the given offset.
     *
     * @param vec    the vector
     * @param offset the offset
     * @param dest   the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4dc vec, long offset, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, offset, vec.x());
        dest.set(JAVA_DOUBLE, offset + 8, vec.y());
        dest.set(JAVA_DOUBLE, offset + 16, vec.z());
        dest.set(JAVA_DOUBLE, offset + 24, vec.w());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2ic vec, MemorySegment dest) {
        dest.set(JAVA_INT, 0, vec.x());
        dest.set(JAVA_INT, 4, vec.y());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2fc vec, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, vec.x());
        dest.set(JAVA_FLOAT, 4, vec.y());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector2dc vec, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, vec.x());
        dest.set(JAVA_DOUBLE, 8, vec.y());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3ic vec, MemorySegment dest) {
        dest.set(JAVA_INT, 0, vec.x());
        dest.set(JAVA_INT, 4, vec.y());
        dest.set(JAVA_INT, 8, vec.z());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3fc vec, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, vec.x());
        dest.set(JAVA_FLOAT, 4, vec.y());
        dest.set(JAVA_FLOAT, 8, vec.z());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector3dc vec, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, vec.x());
        dest.set(JAVA_DOUBLE, 8, vec.y());
        dest.set(JAVA_DOUBLE, 16, vec.z());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4ic vec, MemorySegment dest) {
        dest.set(JAVA_INT, 0, vec.x());
        dest.set(JAVA_INT, 4, vec.y());
        dest.set(JAVA_INT, 8, vec.z());
        dest.set(JAVA_INT, 12, vec.w());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4fc vec, MemorySegment dest) {
        dest.set(JAVA_FLOAT, 0, vec.x());
        dest.set(JAVA_FLOAT, 4, vec.y());
        dest.set(JAVA_FLOAT, 8, vec.z());
        dest.set(JAVA_FLOAT, 12, vec.w());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static MemorySegment put(Vector4dc vec, MemorySegment dest) {
        dest.set(JAVA_DOUBLE, 0, vec.x());
        dest.set(JAVA_DOUBLE, 8, vec.y());
        dest.set(JAVA_DOUBLE, 16, vec.z());
        dest.set(JAVA_DOUBLE, 24, vec.w());
        return dest;
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector2ic vec, BufferBuilder dest) {
        return dest.put(JAVA_INT, vec.x())
            .put(JAVA_INT, vec.y());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector2fc vec, BufferBuilder dest) {
        return dest.put(JAVA_FLOAT, vec.x())
            .put(JAVA_FLOAT, vec.y());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector2dc vec, BufferBuilder dest) {
        return dest.put(JAVA_DOUBLE, vec.x())
            .put(JAVA_DOUBLE, vec.y());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector3ic vec, BufferBuilder dest) {
        return dest.put(JAVA_INT, vec.x())
            .put(JAVA_INT, vec.y())
            .put(JAVA_INT, vec.z());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector3fc vec, BufferBuilder dest) {
        return dest.put(JAVA_FLOAT, vec.x())
            .put(JAVA_FLOAT, vec.y())
            .put(JAVA_FLOAT, vec.z());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector3dc vec, BufferBuilder dest) {
        return dest.put(JAVA_DOUBLE, vec.x())
            .put(JAVA_DOUBLE, vec.y())
            .put(JAVA_DOUBLE, vec.z());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector4ic vec, BufferBuilder dest) {
        return dest.put(JAVA_INT, vec.x())
            .put(JAVA_INT, vec.y())
            .put(JAVA_INT, vec.z())
            .put(JAVA_INT, vec.w());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector4fc vec, BufferBuilder dest) {
        return dest.put(JAVA_FLOAT, vec.x())
            .put(JAVA_FLOAT, vec.y())
            .put(JAVA_FLOAT, vec.z())
            .put(JAVA_FLOAT, vec.w());
    }

    /**
     * Puts the vector.
     *
     * @param vec  the vector
     * @param dest the destination
     * @return the destination
     */
    public static BufferBuilder put(Vector4dc vec, BufferBuilder dest) {
        return dest.put(JAVA_DOUBLE, vec.x())
            .put(JAVA_DOUBLE, vec.y())
            .put(JAVA_DOUBLE, vec.z())
            .put(JAVA_DOUBLE, vec.w());
    }
}
