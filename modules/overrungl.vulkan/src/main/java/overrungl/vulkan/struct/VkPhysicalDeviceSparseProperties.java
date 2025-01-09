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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### residencyStandard2DBlockShape
/// [VarHandle][#VH_residencyStandard2DBlockShape] - [Getter][#residencyStandard2DBlockShape()] - [Setter][#residencyStandard2DBlockShape(int)]
/// ### residencyStandard2DMultisampleBlockShape
/// [VarHandle][#VH_residencyStandard2DMultisampleBlockShape] - [Getter][#residencyStandard2DMultisampleBlockShape()] - [Setter][#residencyStandard2DMultisampleBlockShape(int)]
/// ### residencyStandard3DBlockShape
/// [VarHandle][#VH_residencyStandard3DBlockShape] - [Getter][#residencyStandard3DBlockShape()] - [Setter][#residencyStandard3DBlockShape(int)]
/// ### residencyAlignedMipSize
/// [VarHandle][#VH_residencyAlignedMipSize] - [Getter][#residencyAlignedMipSize()] - [Setter][#residencyAlignedMipSize(int)]
/// ### residencyNonResidentStrict
/// [VarHandle][#VH_residencyNonResidentStrict] - [Getter][#residencyNonResidentStrict()] - [Setter][#residencyNonResidentStrict(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSparseProperties {
///     VkBool32 residencyStandard2DBlockShape;
///     VkBool32 residencyStandard2DMultisampleBlockShape;
///     VkBool32 residencyStandard3DBlockShape;
///     VkBool32 residencyAlignedMipSize;
///     VkBool32 residencyNonResidentStrict;
/// } VkPhysicalDeviceSparseProperties;
/// ```
public final class VkPhysicalDeviceSparseProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceSparseProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );
    /// The [VarHandle] of `residencyStandard2DBlockShape` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residencyStandard2DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DBlockShape"));
    /// The [VarHandle] of `residencyStandard2DMultisampleBlockShape` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residencyStandard2DMultisampleBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    /// The [VarHandle] of `residencyStandard3DBlockShape` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residencyStandard3DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard3DBlockShape"));
    /// The [VarHandle] of `residencyAlignedMipSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residencyAlignedMipSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyAlignedMipSize"));
    /// The [VarHandle] of `residencyNonResidentStrict` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_residencyNonResidentStrict = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyNonResidentStrict"));

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSparseProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSparseProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSparseProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSparseProperties`
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceSparseProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSparseProperties`
    public VkPhysicalDeviceSparseProperties asSlice(long index) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceSparseProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSparseProperties`
    public VkPhysicalDeviceSparseProperties asSlice(long index, long count) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `residencyStandard2DBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_residencyStandard2DBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard2DBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard2DBlockShape`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_residencyStandard2DBlockShape(MemorySegment segment) { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DBlockShape(segment, 0L); }
    /// {@return `residencyStandard2DBlockShape` at the given index}
    /// @param index the index
    public @CType("VkBool32") int residencyStandard2DBlockShapeAt(long index) { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DBlockShape(this.segment(), index); }
    /// {@return `residencyStandard2DBlockShape`}
    public @CType("VkBool32") int residencyStandard2DBlockShape() { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DBlockShape(this.segment()); }
    /// Sets `residencyStandard2DBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residencyStandard2DBlockShape(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_residencyStandard2DBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard2DBlockShape` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residencyStandard2DBlockShape(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DBlockShape(segment, 0L, value); }
    /// Sets `residencyStandard2DBlockShape` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShapeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DBlockShape(this.segment(), index, value); return this; }
    /// Sets `residencyStandard2DBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShape(@CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DBlockShape(this.segment(), value); return this; }

    /// {@return `residencyStandard2DMultisampleBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_residencyStandard2DMultisampleBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard2DMultisampleBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard2DMultisampleBlockShape`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_residencyStandard2DMultisampleBlockShape(MemorySegment segment) { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DMultisampleBlockShape(segment, 0L); }
    /// {@return `residencyStandard2DMultisampleBlockShape` at the given index}
    /// @param index the index
    public @CType("VkBool32") int residencyStandard2DMultisampleBlockShapeAt(long index) { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DMultisampleBlockShape(this.segment(), index); }
    /// {@return `residencyStandard2DMultisampleBlockShape`}
    public @CType("VkBool32") int residencyStandard2DMultisampleBlockShape() { return VkPhysicalDeviceSparseProperties.get_residencyStandard2DMultisampleBlockShape(this.segment()); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residencyStandard2DMultisampleBlockShape(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_residencyStandard2DMultisampleBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residencyStandard2DMultisampleBlockShape(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DMultisampleBlockShape(segment, 0L, value); }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShapeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DMultisampleBlockShape(this.segment(), index, value); return this; }
    /// Sets `residencyStandard2DMultisampleBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShape(@CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard2DMultisampleBlockShape(this.segment(), value); return this; }

    /// {@return `residencyStandard3DBlockShape` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_residencyStandard3DBlockShape(MemorySegment segment, long index) { return (int) VH_residencyStandard3DBlockShape.get(segment, 0L, index); }
    /// {@return `residencyStandard3DBlockShape`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_residencyStandard3DBlockShape(MemorySegment segment) { return VkPhysicalDeviceSparseProperties.get_residencyStandard3DBlockShape(segment, 0L); }
    /// {@return `residencyStandard3DBlockShape` at the given index}
    /// @param index the index
    public @CType("VkBool32") int residencyStandard3DBlockShapeAt(long index) { return VkPhysicalDeviceSparseProperties.get_residencyStandard3DBlockShape(this.segment(), index); }
    /// {@return `residencyStandard3DBlockShape`}
    public @CType("VkBool32") int residencyStandard3DBlockShape() { return VkPhysicalDeviceSparseProperties.get_residencyStandard3DBlockShape(this.segment()); }
    /// Sets `residencyStandard3DBlockShape` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residencyStandard3DBlockShape(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_residencyStandard3DBlockShape.set(segment, 0L, index, value); }
    /// Sets `residencyStandard3DBlockShape` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residencyStandard3DBlockShape(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard3DBlockShape(segment, 0L, value); }
    /// Sets `residencyStandard3DBlockShape` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShapeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard3DBlockShape(this.segment(), index, value); return this; }
    /// Sets `residencyStandard3DBlockShape` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShape(@CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyStandard3DBlockShape(this.segment(), value); return this; }

    /// {@return `residencyAlignedMipSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_residencyAlignedMipSize(MemorySegment segment, long index) { return (int) VH_residencyAlignedMipSize.get(segment, 0L, index); }
    /// {@return `residencyAlignedMipSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_residencyAlignedMipSize(MemorySegment segment) { return VkPhysicalDeviceSparseProperties.get_residencyAlignedMipSize(segment, 0L); }
    /// {@return `residencyAlignedMipSize` at the given index}
    /// @param index the index
    public @CType("VkBool32") int residencyAlignedMipSizeAt(long index) { return VkPhysicalDeviceSparseProperties.get_residencyAlignedMipSize(this.segment(), index); }
    /// {@return `residencyAlignedMipSize`}
    public @CType("VkBool32") int residencyAlignedMipSize() { return VkPhysicalDeviceSparseProperties.get_residencyAlignedMipSize(this.segment()); }
    /// Sets `residencyAlignedMipSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residencyAlignedMipSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_residencyAlignedMipSize.set(segment, 0L, index, value); }
    /// Sets `residencyAlignedMipSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residencyAlignedMipSize(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyAlignedMipSize(segment, 0L, value); }
    /// Sets `residencyAlignedMipSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSizeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyAlignedMipSize(this.segment(), index, value); return this; }
    /// Sets `residencyAlignedMipSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSize(@CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyAlignedMipSize(this.segment(), value); return this; }

    /// {@return `residencyNonResidentStrict` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_residencyNonResidentStrict(MemorySegment segment, long index) { return (int) VH_residencyNonResidentStrict.get(segment, 0L, index); }
    /// {@return `residencyNonResidentStrict`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_residencyNonResidentStrict(MemorySegment segment) { return VkPhysicalDeviceSparseProperties.get_residencyNonResidentStrict(segment, 0L); }
    /// {@return `residencyNonResidentStrict` at the given index}
    /// @param index the index
    public @CType("VkBool32") int residencyNonResidentStrictAt(long index) { return VkPhysicalDeviceSparseProperties.get_residencyNonResidentStrict(this.segment(), index); }
    /// {@return `residencyNonResidentStrict`}
    public @CType("VkBool32") int residencyNonResidentStrict() { return VkPhysicalDeviceSparseProperties.get_residencyNonResidentStrict(this.segment()); }
    /// Sets `residencyNonResidentStrict` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_residencyNonResidentStrict(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_residencyNonResidentStrict.set(segment, 0L, index, value); }
    /// Sets `residencyNonResidentStrict` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_residencyNonResidentStrict(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyNonResidentStrict(segment, 0L, value); }
    /// Sets `residencyNonResidentStrict` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrictAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyNonResidentStrict(this.segment(), index, value); return this; }
    /// Sets `residencyNonResidentStrict` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrict(@CType("VkBool32") int value) { VkPhysicalDeviceSparseProperties.set_residencyNonResidentStrict(this.segment(), value); return this; }

}
