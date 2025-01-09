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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### raygenShaderRecordAddress
/// [VarHandle][#VH_raygenShaderRecordAddress] - [Getter][#raygenShaderRecordAddress()] - [Setter][#raygenShaderRecordAddress(long)]
/// ### raygenShaderRecordSize
/// [VarHandle][#VH_raygenShaderRecordSize] - [Getter][#raygenShaderRecordSize()] - [Setter][#raygenShaderRecordSize(long)]
/// ### missShaderBindingTableAddress
/// [VarHandle][#VH_missShaderBindingTableAddress] - [Getter][#missShaderBindingTableAddress()] - [Setter][#missShaderBindingTableAddress(long)]
/// ### missShaderBindingTableSize
/// [VarHandle][#VH_missShaderBindingTableSize] - [Getter][#missShaderBindingTableSize()] - [Setter][#missShaderBindingTableSize(long)]
/// ### missShaderBindingTableStride
/// [VarHandle][#VH_missShaderBindingTableStride] - [Getter][#missShaderBindingTableStride()] - [Setter][#missShaderBindingTableStride(long)]
/// ### hitShaderBindingTableAddress
/// [VarHandle][#VH_hitShaderBindingTableAddress] - [Getter][#hitShaderBindingTableAddress()] - [Setter][#hitShaderBindingTableAddress(long)]
/// ### hitShaderBindingTableSize
/// [VarHandle][#VH_hitShaderBindingTableSize] - [Getter][#hitShaderBindingTableSize()] - [Setter][#hitShaderBindingTableSize(long)]
/// ### hitShaderBindingTableStride
/// [VarHandle][#VH_hitShaderBindingTableStride] - [Getter][#hitShaderBindingTableStride()] - [Setter][#hitShaderBindingTableStride(long)]
/// ### callableShaderBindingTableAddress
/// [VarHandle][#VH_callableShaderBindingTableAddress] - [Getter][#callableShaderBindingTableAddress()] - [Setter][#callableShaderBindingTableAddress(long)]
/// ### callableShaderBindingTableSize
/// [VarHandle][#VH_callableShaderBindingTableSize] - [Getter][#callableShaderBindingTableSize()] - [Setter][#callableShaderBindingTableSize(long)]
/// ### callableShaderBindingTableStride
/// [VarHandle][#VH_callableShaderBindingTableStride] - [Getter][#callableShaderBindingTableStride()] - [Setter][#callableShaderBindingTableStride(long)]
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### depth
/// [VarHandle][#VH_depth] - [Getter][#depth()] - [Setter][#depth(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTraceRaysIndirectCommand2KHR {
///     VkDeviceAddress raygenShaderRecordAddress;
///     VkDeviceSize raygenShaderRecordSize;
///     VkDeviceAddress missShaderBindingTableAddress;
///     VkDeviceSize missShaderBindingTableSize;
///     VkDeviceSize missShaderBindingTableStride;
///     VkDeviceAddress hitShaderBindingTableAddress;
///     VkDeviceSize hitShaderBindingTableSize;
///     VkDeviceSize hitShaderBindingTableStride;
///     VkDeviceAddress callableShaderBindingTableAddress;
///     VkDeviceSize callableShaderBindingTableSize;
///     VkDeviceSize callableShaderBindingTableStride;
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// } VkTraceRaysIndirectCommand2KHR;
/// ```
public final class VkTraceRaysIndirectCommand2KHR extends Struct {
    /// The struct layout of `VkTraceRaysIndirectCommand2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordAddress"),
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableStride"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    /// The [VarHandle] of `raygenShaderRecordAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_raygenShaderRecordAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordAddress"));
    /// The [VarHandle] of `raygenShaderRecordSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_raygenShaderRecordSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordSize"));
    /// The [VarHandle] of `missShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_missShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableAddress"));
    /// The [VarHandle] of `missShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_missShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableSize"));
    /// The [VarHandle] of `missShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_missShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableStride"));
    /// The [VarHandle] of `hitShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_hitShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableAddress"));
    /// The [VarHandle] of `hitShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_hitShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableSize"));
    /// The [VarHandle] of `hitShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_hitShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableStride"));
    /// The [VarHandle] of `callableShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_callableShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableAddress"));
    /// The [VarHandle] of `callableShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_callableShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableSize"));
    /// The [VarHandle] of `callableShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_callableShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableStride"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    /// @param segment the memory segment
    public VkTraceRaysIndirectCommand2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkTraceRaysIndirectCommand2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTraceRaysIndirectCommand2KHR`
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTraceRaysIndirectCommand2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTraceRaysIndirectCommand2KHR`
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator, long count) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `raygenShaderRecordAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_raygenShaderRecordAddress(MemorySegment segment, long index) { return (long) VH_raygenShaderRecordAddress.get(segment, 0L, index); }
    /// {@return `raygenShaderRecordAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_raygenShaderRecordAddress(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordAddress(segment, 0L); }
    /// {@return `raygenShaderRecordAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long raygenShaderRecordAddressAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordAddress(this.segment(), index); }
    /// {@return `raygenShaderRecordAddress`}
    public @CType("VkDeviceAddress") long raygenShaderRecordAddress() { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordAddress(this.segment()); }
    /// Sets `raygenShaderRecordAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_raygenShaderRecordAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_raygenShaderRecordAddress.set(segment, 0L, index, value); }
    /// Sets `raygenShaderRecordAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_raygenShaderRecordAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordAddress(segment, 0L, value); }
    /// Sets `raygenShaderRecordAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddressAt(long index, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordAddress(this.segment(), index, value); return this; }
    /// Sets `raygenShaderRecordAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(@CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordAddress(this.segment(), value); return this; }

    /// {@return `raygenShaderRecordSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_raygenShaderRecordSize(MemorySegment segment, long index) { return (long) VH_raygenShaderRecordSize.get(segment, 0L, index); }
    /// {@return `raygenShaderRecordSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_raygenShaderRecordSize(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordSize(segment, 0L); }
    /// {@return `raygenShaderRecordSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long raygenShaderRecordSizeAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordSize(this.segment(), index); }
    /// {@return `raygenShaderRecordSize`}
    public @CType("VkDeviceSize") long raygenShaderRecordSize() { return VkTraceRaysIndirectCommand2KHR.get_raygenShaderRecordSize(this.segment()); }
    /// Sets `raygenShaderRecordSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_raygenShaderRecordSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_raygenShaderRecordSize.set(segment, 0L, index, value); }
    /// Sets `raygenShaderRecordSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_raygenShaderRecordSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordSize(segment, 0L, value); }
    /// Sets `raygenShaderRecordSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSizeAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordSize(this.segment(), index, value); return this; }
    /// Sets `raygenShaderRecordSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_raygenShaderRecordSize(this.segment(), value); return this; }

    /// {@return `missShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_missShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableAddress.get(segment, 0L, index); }
    /// {@return `missShaderBindingTableAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_missShaderBindingTableAddress(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableAddress(segment, 0L); }
    /// {@return `missShaderBindingTableAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long missShaderBindingTableAddressAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableAddress(this.segment(), index); }
    /// {@return `missShaderBindingTableAddress`}
    public @CType("VkDeviceAddress") long missShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableAddress(this.segment()); }
    /// Sets `missShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_missShaderBindingTableAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_missShaderBindingTableAddress.set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_missShaderBindingTableAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableAddress(segment, 0L, value); }
    /// Sets `missShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddressAt(long index, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableAddress(this.segment(), index, value); return this; }
    /// Sets `missShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(@CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableAddress(this.segment(), value); return this; }

    /// {@return `missShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_missShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableSize.get(segment, 0L, index); }
    /// {@return `missShaderBindingTableSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_missShaderBindingTableSize(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableSize(segment, 0L); }
    /// {@return `missShaderBindingTableSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long missShaderBindingTableSizeAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableSize(this.segment(), index); }
    /// {@return `missShaderBindingTableSize`}
    public @CType("VkDeviceSize") long missShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableSize(this.segment()); }
    /// Sets `missShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_missShaderBindingTableSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_missShaderBindingTableSize.set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_missShaderBindingTableSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableSize(segment, 0L, value); }
    /// Sets `missShaderBindingTableSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSizeAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableSize(this.segment(), index, value); return this; }
    /// Sets `missShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableSize(this.segment(), value); return this; }

    /// {@return `missShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_missShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableStride.get(segment, 0L, index); }
    /// {@return `missShaderBindingTableStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_missShaderBindingTableStride(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableStride(segment, 0L); }
    /// {@return `missShaderBindingTableStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long missShaderBindingTableStrideAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableStride(this.segment(), index); }
    /// {@return `missShaderBindingTableStride`}
    public @CType("VkDeviceSize") long missShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.get_missShaderBindingTableStride(this.segment()); }
    /// Sets `missShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_missShaderBindingTableStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_missShaderBindingTableStride.set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_missShaderBindingTableStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableStride(segment, 0L, value); }
    /// Sets `missShaderBindingTableStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStrideAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableStride(this.segment(), index, value); return this; }
    /// Sets `missShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_missShaderBindingTableStride(this.segment(), value); return this; }

    /// {@return `hitShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_hitShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableAddress.get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_hitShaderBindingTableAddress(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableAddress(segment, 0L); }
    /// {@return `hitShaderBindingTableAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long hitShaderBindingTableAddressAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableAddress(this.segment(), index); }
    /// {@return `hitShaderBindingTableAddress`}
    public @CType("VkDeviceAddress") long hitShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableAddress(this.segment()); }
    /// Sets `hitShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hitShaderBindingTableAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_hitShaderBindingTableAddress.set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hitShaderBindingTableAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableAddress(segment, 0L, value); }
    /// Sets `hitShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddressAt(long index, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableAddress(this.segment(), index, value); return this; }
    /// Sets `hitShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(@CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableAddress(this.segment(), value); return this; }

    /// {@return `hitShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_hitShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableSize.get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_hitShaderBindingTableSize(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableSize(segment, 0L); }
    /// {@return `hitShaderBindingTableSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long hitShaderBindingTableSizeAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableSize(this.segment(), index); }
    /// {@return `hitShaderBindingTableSize`}
    public @CType("VkDeviceSize") long hitShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableSize(this.segment()); }
    /// Sets `hitShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hitShaderBindingTableSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_hitShaderBindingTableSize.set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hitShaderBindingTableSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableSize(segment, 0L, value); }
    /// Sets `hitShaderBindingTableSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSizeAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableSize(this.segment(), index, value); return this; }
    /// Sets `hitShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableSize(this.segment(), value); return this; }

    /// {@return `hitShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_hitShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableStride.get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_hitShaderBindingTableStride(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableStride(segment, 0L); }
    /// {@return `hitShaderBindingTableStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long hitShaderBindingTableStrideAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableStride(this.segment(), index); }
    /// {@return `hitShaderBindingTableStride`}
    public @CType("VkDeviceSize") long hitShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.get_hitShaderBindingTableStride(this.segment()); }
    /// Sets `hitShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hitShaderBindingTableStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_hitShaderBindingTableStride.set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hitShaderBindingTableStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableStride(segment, 0L, value); }
    /// Sets `hitShaderBindingTableStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStrideAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableStride(this.segment(), index, value); return this; }
    /// Sets `hitShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_hitShaderBindingTableStride(this.segment(), value); return this; }

    /// {@return `callableShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_callableShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableAddress.get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_callableShaderBindingTableAddress(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableAddress(segment, 0L); }
    /// {@return `callableShaderBindingTableAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long callableShaderBindingTableAddressAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableAddress(this.segment(), index); }
    /// {@return `callableShaderBindingTableAddress`}
    public @CType("VkDeviceAddress") long callableShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableAddress(this.segment()); }
    /// Sets `callableShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_callableShaderBindingTableAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_callableShaderBindingTableAddress.set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_callableShaderBindingTableAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableAddress(segment, 0L, value); }
    /// Sets `callableShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddressAt(long index, @CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableAddress(this.segment(), index, value); return this; }
    /// Sets `callableShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(@CType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableAddress(this.segment(), value); return this; }

    /// {@return `callableShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_callableShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableSize.get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_callableShaderBindingTableSize(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableSize(segment, 0L); }
    /// {@return `callableShaderBindingTableSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long callableShaderBindingTableSizeAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableSize(this.segment(), index); }
    /// {@return `callableShaderBindingTableSize`}
    public @CType("VkDeviceSize") long callableShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableSize(this.segment()); }
    /// Sets `callableShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_callableShaderBindingTableSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_callableShaderBindingTableSize.set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_callableShaderBindingTableSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableSize(segment, 0L, value); }
    /// Sets `callableShaderBindingTableSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSizeAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableSize(this.segment(), index, value); return this; }
    /// Sets `callableShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableSize(this.segment(), value); return this; }

    /// {@return `callableShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_callableShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableStride.get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_callableShaderBindingTableStride(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableStride(segment, 0L); }
    /// {@return `callableShaderBindingTableStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long callableShaderBindingTableStrideAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableStride(this.segment(), index); }
    /// {@return `callableShaderBindingTableStride`}
    public @CType("VkDeviceSize") long callableShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.get_callableShaderBindingTableStride(this.segment()); }
    /// Sets `callableShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_callableShaderBindingTableStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_callableShaderBindingTableStride.set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_callableShaderBindingTableStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableStride(segment, 0L, value); }
    /// Sets `callableShaderBindingTableStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStrideAt(long index, @CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableStride(this.segment(), index, value); return this; }
    /// Sets `callableShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(@CType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.set_callableShaderBindingTableStride(this.segment(), value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("uint32_t") int widthAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkTraceRaysIndirectCommand2KHR.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR widthAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR width(@CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heightAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkTraceRaysIndirectCommand2KHR.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR heightAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR height(@CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_height(this.segment(), value); return this; }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_depth(MemorySegment segment, long index) { return (int) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_depth(MemorySegment segment) { return VkTraceRaysIndirectCommand2KHR.get_depth(segment, 0L); }
    /// {@return `depth` at the given index}
    /// @param index the index
    public @CType("uint32_t") int depthAt(long index) { return VkTraceRaysIndirectCommand2KHR.get_depth(this.segment(), index); }
    /// {@return `depth`}
    public @CType("uint32_t") int depth() { return VkTraceRaysIndirectCommand2KHR.get_depth(this.segment()); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depth(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_depth(segment, 0L, value); }
    /// Sets `depth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR depthAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_depth(this.segment(), index, value); return this; }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR depth(@CType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.set_depth(this.segment(), value); return this; }

}
