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

package overrungl.joml;

import org.joml.*;
import overrun.marshal.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

    private Vectorn() {
        //no instance
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector2ic vec) {
        return put(vec, allocator.allocate(VEC2I));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector2fc vec) {
        return put(vec, allocator.allocate(VEC2F));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector2dc vec) {
        return put(vec, allocator.allocate(VEC2D));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector3ic vec) {
        return put(vec, allocator.allocate(VEC3I));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector3fc vec) {
        return put(vec, allocator.allocate(VEC3F));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector3dc vec) {
        return put(vec, allocator.allocate(VEC3D));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector4ic vec) {
        return put(vec, allocator.allocate(VEC4I));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector4fc vec) {
        return put(vec, allocator.allocate(VEC4F));
    }

    /**
     * Allocates the vector.
     *
     * @param allocator the segment allocator.
     * @param vec       the vector.
     * @return the segment.
     */
    public static MemorySegment allocate(SegmentAllocator allocator, Vector4dc vec) {
        return put(vec, allocator.allocate(VEC4D));
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
}
