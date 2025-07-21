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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphOperationSupportARM {
///     (int) VkPhysicalDeviceDataGraphOperationTypeARM operationType;
///     char name[128];
///     uint32_t version;
/// };
/// ```
public final class VkPhysicalDeviceDataGraphOperationSupportARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDataGraphOperationSupportARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("operationType"),
        MemoryLayout.sequenceLayout(128, ValueLayout.JAVA_BYTE).withName("name"),
        ValueLayout.JAVA_INT.withName("version")
    );
    /// The byte offset of `operationType`.
    public static final long OFFSET_operationType = LAYOUT.byteOffset(PathElement.groupElement("operationType"));
    /// The memory layout of `operationType`.
    public static final MemoryLayout LAYOUT_operationType = LAYOUT.select(PathElement.groupElement("operationType"));
    /// The [VarHandle] of `operationType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_operationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operationType"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    /// The byte offset of `version`.
    public static final long OFFSET_version = LAYOUT.byteOffset(PathElement.groupElement("version"));
    /// The memory layout of `version`.
    public static final MemoryLayout LAYOUT_version = LAYOUT.select(PathElement.groupElement("version"));
    /// The [VarHandle] of `version` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_version = LAYOUT.arrayElementVarHandle(PathElement.groupElement("version"));

    /// Creates `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDataGraphOperationSupportARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphOperationSupportARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphOperationSupportARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphOperationSupportARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDataGraphOperationSupportARM`
    public static VkPhysicalDeviceDataGraphOperationSupportARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphOperationSupportARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDataGraphOperationSupportARM`
    public static VkPhysicalDeviceDataGraphOperationSupportARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operationType `operationType`
    /// @param name `name`
    /// @param version `version`
    /// @return the allocated `VkPhysicalDeviceDataGraphOperationSupportARM`
    public static VkPhysicalDeviceDataGraphOperationSupportARM allocInit(SegmentAllocator allocator, int operationType, MemorySegment name, int version) {
        return alloc(allocator).operationType(operationType).name(name).version(version);
    }

    /// Allocates a `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operationType `operationType`
    /// @param name `name`
    /// @return the allocated `VkPhysicalDeviceDataGraphOperationSupportARM`
    public static VkPhysicalDeviceDataGraphOperationSupportARM allocInit(SegmentAllocator allocator, int operationType, MemorySegment name) {
        return alloc(allocator).operationType(operationType).name(name);
    }

    /// Allocates a `VkPhysicalDeviceDataGraphOperationSupportARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operationType `operationType`
    /// @return the allocated `VkPhysicalDeviceDataGraphOperationSupportARM`
    public static VkPhysicalDeviceDataGraphOperationSupportARM allocInit(SegmentAllocator allocator, int operationType) {
        return alloc(allocator).operationType(operationType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM copyFrom(VkPhysicalDeviceDataGraphOperationSupportARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDataGraphOperationSupportARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `operationType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int operationType(MemorySegment segment, long index) { return (int) VH_operationType.get(segment, 0L, index); }
    /// {@return `operationType`}
    public int operationType() { return operationType(this.segment(), 0L); }
    /// Sets `operationType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void operationType(MemorySegment segment, long index, int value) { VH_operationType.set(segment, 0L, index, value); }
    /// Sets `operationType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM operationType(int value) { operationType(this.segment(), 0L, value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte name(MemorySegment segment, long index, long index0) { return (byte) VH_name.get(segment, 0L, index, index0); }
    /// {@return `name`}
    public MemorySegment name() { return name(this.segment(), 0L); }
    /// {@return `name`}
    /// @param index0 the Index 0 of the array
    public byte name(long index0) { return name(this.segment(), 0L, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void name(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), LAYOUT_name.byteSize()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void name(MemorySegment segment, long index, long index0, byte value) { VH_name.set(segment, 0L, index, index0, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM name(MemorySegment value) { name(this.segment(), 0L, value); return this; }
    /// Sets `name` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM name(long index0, byte value) { name(this.segment(), 0L, index0, value); return this; }

    /// {@return `version` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int version(MemorySegment segment, long index) { return (int) VH_version.get(segment, 0L, index); }
    /// {@return `version`}
    public int version() { return version(this.segment(), 0L); }
    /// Sets `version` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void version(MemorySegment segment, long index, int value) { VH_version.set(segment, 0L, index, value); }
    /// Sets `version` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM version(int value) { version(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDataGraphOperationSupportARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDataGraphOperationSupportARM`
    public VkPhysicalDeviceDataGraphOperationSupportARM asSlice(long index) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDataGraphOperationSupportARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDataGraphOperationSupportARM`
    public VkPhysicalDeviceDataGraphOperationSupportARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDataGraphOperationSupportARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM at(long index, Consumer<VkPhysicalDeviceDataGraphOperationSupportARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `operationType` at the given index}
    /// @param index the index of the struct buffer
    public int operationTypeAt(long index) { return operationType(this.segment(), index); }
    /// Sets `operationType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM operationTypeAt(long index, int value) { operationType(this.segment(), index, value); return this; }

    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment nameAt(long index) { return name(this.segment(), index); }
    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte nameAt(long index, long index0) { return name(this.segment(), index, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM nameAt(long index, MemorySegment value) { name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM nameAt(long index, long index0, byte value) { name(this.segment(), index, index0, value); return this; }

    /// {@return `version` at the given index}
    /// @param index the index of the struct buffer
    public int versionAt(long index) { return version(this.segment(), index); }
    /// Sets `version` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphOperationSupportARM versionAt(long index, int value) { version(this.segment(), index, value); return this; }

}
