/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceSparseProperties {
///     (uint32_t) VkBool32 residencyStandard2DBlockShape;
///     (uint32_t) VkBool32 residencyStandard2DMultisampleBlockShape;
///     (uint32_t) VkBool32 residencyStandard3DBlockShape;
///     (uint32_t) VkBool32 residencyAlignedMipSize;
///     (uint32_t) VkBool32 residencyNonResidentStrict;
/// };
/// ```
public final class VkPhysicalDeviceSparseProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSparseProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );
    /// The byte offset of `residencyStandard2DBlockShape`.
    public static final long OFFSET_residencyStandard2DBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DBlockShape"));
    /// The memory layout of `residencyStandard2DBlockShape`.
    public static final MemoryLayout LAYOUT_residencyStandard2DBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard2DBlockShape"));
    /// The [VarHandle] of `residencyStandard2DBlockShape` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_residencyStandard2DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DBlockShape"));
    /// The byte offset of `residencyStandard2DMultisampleBlockShape`.
    public static final long OFFSET_residencyStandard2DMultisampleBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    /// The memory layout of `residencyStandard2DMultisampleBlockShape`.
    public static final MemoryLayout LAYOUT_residencyStandard2DMultisampleBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    /// The [VarHandle] of `residencyStandard2DMultisampleBlockShape` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_residencyStandard2DMultisampleBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    /// The byte offset of `residencyStandard3DBlockShape`.
    public static final long OFFSET_residencyStandard3DBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard3DBlockShape"));
    /// The memory layout of `residencyStandard3DBlockShape`.
    public static final MemoryLayout LAYOUT_residencyStandard3DBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard3DBlockShape"));
    /// The [VarHandle] of `residencyStandard3DBlockShape` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_residencyStandard3DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard3DBlockShape"));
    /// The byte offset of `residencyAlignedMipSize`.
    public static final long OFFSET_residencyAlignedMipSize = LAYOUT.byteOffset(PathElement.groupElement("residencyAlignedMipSize"));
    /// The memory layout of `residencyAlignedMipSize`.
    public static final MemoryLayout LAYOUT_residencyAlignedMipSize = LAYOUT.select(PathElement.groupElement("residencyAlignedMipSize"));
    /// The [VarHandle] of `residencyAlignedMipSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_residencyAlignedMipSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyAlignedMipSize"));
    /// The byte offset of `residencyNonResidentStrict`.
    public static final long OFFSET_residencyNonResidentStrict = LAYOUT.byteOffset(PathElement.groupElement("residencyNonResidentStrict"));
    /// The memory layout of `residencyNonResidentStrict`.
    public static final MemoryLayout LAYOUT_residencyNonResidentStrict = LAYOUT.select(PathElement.groupElement("residencyNonResidentStrict"));
    /// The [VarHandle] of `residencyNonResidentStrict` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_residencyNonResidentStrict = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyNonResidentStrict"));

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSparseProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param residencyStandard2DBlockShape `residencyStandard2DBlockShape`
    /// @param residencyStandard2DMultisampleBlockShape `residencyStandard2DMultisampleBlockShape`
    /// @param residencyStandard3DBlockShape `residencyStandard3DBlockShape`
    /// @param residencyAlignedMipSize `residencyAlignedMipSize`
    /// @param residencyNonResidentStrict `residencyNonResidentStrict`
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties allocInit(SegmentAllocator allocator, int residencyStandard2DBlockShape, int residencyStandard2DMultisampleBlockShape, int residencyStandard3DBlockShape, int residencyAlignedMipSize, int residencyNonResidentStrict) {
        return alloc(allocator).residencyStandard2DBlockShape(residencyStandard2DBlockShape).residencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape).residencyStandard3DBlockShape(residencyStandard3DBlockShape).residencyAlignedMipSize(residencyAlignedMipSize).residencyNonResidentStrict(residencyNonResidentStrict);
    }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param residencyStandard2DBlockShape `residencyStandard2DBlockShape`
    /// @param residencyStandard2DMultisampleBlockShape `residencyStandard2DMultisampleBlockShape`
    /// @param residencyStandard3DBlockShape `residencyStandard3DBlockShape`
    /// @param residencyAlignedMipSize `residencyAlignedMipSize`
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties allocInit(SegmentAllocator allocator, int residencyStandard2DBlockShape, int residencyStandard2DMultisampleBlockShape, int residencyStandard3DBlockShape, int residencyAlignedMipSize) {
        return alloc(allocator).residencyStandard2DBlockShape(residencyStandard2DBlockShape).residencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape).residencyStandard3DBlockShape(residencyStandard3DBlockShape).residencyAlignedMipSize(residencyAlignedMipSize);
    }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param residencyStandard2DBlockShape `residencyStandard2DBlockShape`
    /// @param residencyStandard2DMultisampleBlockShape `residencyStandard2DMultisampleBlockShape`
    /// @param residencyStandard3DBlockShape `residencyStandard3DBlockShape`
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties allocInit(SegmentAllocator allocator, int residencyStandard2DBlockShape, int residencyStandard2DMultisampleBlockShape, int residencyStandard3DBlockShape) {
        return alloc(allocator).residencyStandard2DBlockShape(residencyStandard2DBlockShape).residencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape).residencyStandard3DBlockShape(residencyStandard3DBlockShape);
    }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param residencyStandard2DBlockShape `residencyStandard2DBlockShape`
    /// @param residencyStandard2DMultisampleBlockShape `residencyStandard2DMultisampleBlockShape`
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties allocInit(SegmentAllocator allocator, int residencyStandard2DBlockShape, int residencyStandard2DMultisampleBlockShape) {
        return alloc(allocator).residencyStandard2DBlockShape(residencyStandard2DBlockShape).residencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape);
    }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param residencyStandard2DBlockShape `residencyStandard2DBlockShape`
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties allocInit(SegmentAllocator allocator, int residencyStandard2DBlockShape) {
        return alloc(allocator).residencyStandard2DBlockShape(residencyStandard2DBlockShape);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSparseProperties copyFrom(VkPhysicalDeviceSparseProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSparseProperties reinterpret(long count) { return new VkPhysicalDeviceSparseProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `residencyStandard2DBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int residencyStandard2DBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard2DBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard2DBlockShape`}
    public int residencyStandard2DBlockShape() { return residencyStandard2DBlockShape(this.segment(), 0L); }
    /// Sets `residencyStandard2DBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void residencyStandard2DBlockShape(MemorySegment segment, long index, int value) { VH_residencyStandard2DBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard2DBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShape(int value) { residencyStandard2DBlockShape(this.segment(), 0L, value); return this; }

    /// {@return `residencyStandard2DMultisampleBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int residencyStandard2DMultisampleBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard2DMultisampleBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard2DMultisampleBlockShape`}
    public int residencyStandard2DMultisampleBlockShape() { return residencyStandard2DMultisampleBlockShape(this.segment(), 0L); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void residencyStandard2DMultisampleBlockShape(MemorySegment segment, long index, int value) { VH_residencyStandard2DMultisampleBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShape(int value) { residencyStandard2DMultisampleBlockShape(this.segment(), 0L, value); return this; }

    /// {@return `residencyStandard3DBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int residencyStandard3DBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard3DBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard3DBlockShape`}
    public int residencyStandard3DBlockShape() { return residencyStandard3DBlockShape(this.segment(), 0L); }
    /// Sets `residencyStandard3DBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void residencyStandard3DBlockShape(MemorySegment segment, long index, int value) { VH_residencyStandard3DBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard3DBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShape(int value) { residencyStandard3DBlockShape(this.segment(), 0L, value); return this; }

    /// {@return `residencyAlignedMipSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int residencyAlignedMipSize(MemorySegment segment, long index) { return (int) VH_residencyAlignedMipSize.get(segment, 0L, index); }
    /// {@return `residencyAlignedMipSize`}
    public int residencyAlignedMipSize() { return residencyAlignedMipSize(this.segment(), 0L); }
    /// Sets `residencyAlignedMipSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void residencyAlignedMipSize(MemorySegment segment, long index, int value) { VH_residencyAlignedMipSize.set(segment, 0L, index, value); }
    /// Sets `residencyAlignedMipSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSize(int value) { residencyAlignedMipSize(this.segment(), 0L, value); return this; }

    /// {@return `residencyNonResidentStrict` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int residencyNonResidentStrict(MemorySegment segment, long index) { return (int) VH_residencyNonResidentStrict.get(segment, 0L, index); }
    /// {@return `residencyNonResidentStrict`}
    public int residencyNonResidentStrict() { return residencyNonResidentStrict(this.segment(), 0L); }
    /// Sets `residencyNonResidentStrict` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void residencyNonResidentStrict(MemorySegment segment, long index, int value) { VH_residencyNonResidentStrict.set(segment, 0L, index, value); }
    /// Sets `residencyNonResidentStrict` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrict(int value) { residencyNonResidentStrict(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSparseProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSparseProperties`
    public VkPhysicalDeviceSparseProperties asSlice(long index) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSparseProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSparseProperties`
    public VkPhysicalDeviceSparseProperties asSlice(long index, long count) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSparseProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSparseProperties at(long index, Consumer<VkPhysicalDeviceSparseProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `residencyStandard2DBlockShape` at the given index}
    /// @param index the index of the struct buffer
    public int residencyStandard2DBlockShapeAt(long index) { return residencyStandard2DBlockShape(this.segment(), index); }
    /// Sets `residencyStandard2DBlockShape` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShapeAt(long index, int value) { residencyStandard2DBlockShape(this.segment(), index, value); return this; }

    /// {@return `residencyStandard2DMultisampleBlockShape` at the given index}
    /// @param index the index of the struct buffer
    public int residencyStandard2DMultisampleBlockShapeAt(long index) { return residencyStandard2DMultisampleBlockShape(this.segment(), index); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShapeAt(long index, int value) { residencyStandard2DMultisampleBlockShape(this.segment(), index, value); return this; }

    /// {@return `residencyStandard3DBlockShape` at the given index}
    /// @param index the index of the struct buffer
    public int residencyStandard3DBlockShapeAt(long index) { return residencyStandard3DBlockShape(this.segment(), index); }
    /// Sets `residencyStandard3DBlockShape` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShapeAt(long index, int value) { residencyStandard3DBlockShape(this.segment(), index, value); return this; }

    /// {@return `residencyAlignedMipSize` at the given index}
    /// @param index the index of the struct buffer
    public int residencyAlignedMipSizeAt(long index) { return residencyAlignedMipSize(this.segment(), index); }
    /// Sets `residencyAlignedMipSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSizeAt(long index, int value) { residencyAlignedMipSize(this.segment(), index, value); return this; }

    /// {@return `residencyNonResidentStrict` at the given index}
    /// @param index the index of the struct buffer
    public int residencyNonResidentStrictAt(long index) { return residencyNonResidentStrict(this.segment(), index); }
    /// Sets `residencyNonResidentStrict` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrictAt(long index, int value) { residencyNonResidentStrict(this.segment(), index, value); return this; }

}
