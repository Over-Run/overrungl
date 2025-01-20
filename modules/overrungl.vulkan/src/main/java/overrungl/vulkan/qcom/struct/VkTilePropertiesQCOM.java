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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### tileSize
/// [Byte offset][#OFFSET_tileSize] - [Memory layout][#ML_tileSize] - [Getter][#tileSize()] - [Setter][#tileSize(MemorySegment)]
/// ### apronSize
/// [Byte offset][#OFFSET_apronSize] - [Memory layout][#ML_apronSize] - [Getter][#apronSize()] - [Setter][#apronSize(MemorySegment)]
/// ### origin
/// [Byte offset][#OFFSET_origin] - [Memory layout][#ML_origin] - [Getter][#origin()] - [Setter][#origin(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTilePropertiesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent3D tileSize;
///     VkExtent2D apronSize;
///     VkOffset2D origin;
/// } VkTilePropertiesQCOM;
/// ```
public sealed class VkTilePropertiesQCOM extends Struct {
    /// The struct layout of `VkTilePropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("tileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("apronSize"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("origin")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `tileSize`.
    public static final long OFFSET_tileSize = LAYOUT.byteOffset(PathElement.groupElement("tileSize"));
    /// The memory layout of `tileSize`.
    public static final MemoryLayout ML_tileSize = LAYOUT.select(PathElement.groupElement("tileSize"));
    /// The byte offset of `apronSize`.
    public static final long OFFSET_apronSize = LAYOUT.byteOffset(PathElement.groupElement("apronSize"));
    /// The memory layout of `apronSize`.
    public static final MemoryLayout ML_apronSize = LAYOUT.select(PathElement.groupElement("apronSize"));
    /// The byte offset of `origin`.
    public static final long OFFSET_origin = LAYOUT.byteOffset(PathElement.groupElement("origin"));
    /// The memory layout of `origin`.
    public static final MemoryLayout ML_origin = LAYOUT.select(PathElement.groupElement("origin"));

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkTilePropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTilePropertiesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTilePropertiesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkTilePropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTilePropertiesQCOM`
    public static VkTilePropertiesQCOM alloc(SegmentAllocator allocator) { return new VkTilePropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTilePropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTilePropertiesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTilePropertiesQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTilePropertiesQCOM`
    public static VkTilePropertiesQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkExtent3D") MemorySegment tileSize, @CType("VkExtent2D") MemorySegment apronSize, @CType("VkOffset2D") MemorySegment origin) { return alloc(allocator).sType(sType).pNext(pNext).tileSize(tileSize).apronSize(apronSize).origin(origin); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTilePropertiesQCOM copyFrom(VkTilePropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkTilePropertiesQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkTilePropertiesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkTilePropertiesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM sType(@CType("VkStructureType") int value) { VkTilePropertiesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkTilePropertiesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkTilePropertiesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkTilePropertiesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM pNext(@CType("void *") MemorySegment value) { VkTilePropertiesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `tileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") MemorySegment get_tileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_tileSize, index), ML_tileSize); }
    /// {@return `tileSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") MemorySegment get_tileSize(MemorySegment segment) { return VkTilePropertiesQCOM.get_tileSize(segment, 0L); }
    /// {@return `tileSize`}
    public @CType("VkExtent3D") MemorySegment tileSize() { return VkTilePropertiesQCOM.get_tileSize(this.segment()); }
    /// Sets `tileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tileSize(MemorySegment segment, long index, @CType("VkExtent3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_tileSize, index), ML_tileSize.byteSize()); }
    /// Sets `tileSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tileSize(MemorySegment segment, @CType("VkExtent3D") MemorySegment value) { VkTilePropertiesQCOM.set_tileSize(segment, 0L, value); }
    /// Sets `tileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM tileSize(@CType("VkExtent3D") MemorySegment value) { VkTilePropertiesQCOM.set_tileSize(this.segment(), value); return this; }

    /// {@return `apronSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_apronSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_apronSize, index), ML_apronSize); }
    /// {@return `apronSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_apronSize(MemorySegment segment) { return VkTilePropertiesQCOM.get_apronSize(segment, 0L); }
    /// {@return `apronSize`}
    public @CType("VkExtent2D") MemorySegment apronSize() { return VkTilePropertiesQCOM.get_apronSize(this.segment()); }
    /// Sets `apronSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_apronSize(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_apronSize, index), ML_apronSize.byteSize()); }
    /// Sets `apronSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_apronSize(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkTilePropertiesQCOM.set_apronSize(segment, 0L, value); }
    /// Sets `apronSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM apronSize(@CType("VkExtent2D") MemorySegment value) { VkTilePropertiesQCOM.set_apronSize(this.segment(), value); return this; }

    /// {@return `origin` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") MemorySegment get_origin(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_origin, index), ML_origin); }
    /// {@return `origin`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") MemorySegment get_origin(MemorySegment segment) { return VkTilePropertiesQCOM.get_origin(segment, 0L); }
    /// {@return `origin`}
    public @CType("VkOffset2D") MemorySegment origin() { return VkTilePropertiesQCOM.get_origin(this.segment()); }
    /// Sets `origin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_origin(MemorySegment segment, long index, @CType("VkOffset2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_origin, index), ML_origin.byteSize()); }
    /// Sets `origin` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_origin(MemorySegment segment, @CType("VkOffset2D") MemorySegment value) { VkTilePropertiesQCOM.set_origin(segment, 0L, value); }
    /// Sets `origin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM origin(@CType("VkOffset2D") MemorySegment value) { VkTilePropertiesQCOM.set_origin(this.segment(), value); return this; }

    /// A buffer of [VkTilePropertiesQCOM].
    public static final class Buffer extends VkTilePropertiesQCOM {
        private final long elementCount;

        /// Creates `VkTilePropertiesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkTilePropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkTilePropertiesQCOM`
        public VkTilePropertiesQCOM asSlice(long index) { return new VkTilePropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkTilePropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkTilePropertiesQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkTilePropertiesQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkTilePropertiesQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkTilePropertiesQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkTilePropertiesQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `tileSize` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") MemorySegment tileSizeAt(long index) { return VkTilePropertiesQCOM.get_tileSize(this.segment(), index); }
        /// Sets `tileSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tileSizeAt(long index, @CType("VkExtent3D") MemorySegment value) { VkTilePropertiesQCOM.set_tileSize(this.segment(), index, value); return this; }

        /// {@return `apronSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment apronSizeAt(long index) { return VkTilePropertiesQCOM.get_apronSize(this.segment(), index); }
        /// Sets `apronSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer apronSizeAt(long index, @CType("VkExtent2D") MemorySegment value) { VkTilePropertiesQCOM.set_apronSize(this.segment(), index, value); return this; }

        /// {@return `origin` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") MemorySegment originAt(long index) { return VkTilePropertiesQCOM.get_origin(this.segment(), index); }
        /// Sets `origin` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer originAt(long index, @CType("VkOffset2D") MemorySegment value) { VkTilePropertiesQCOM.set_origin(this.segment(), index, value); return this; }

    }
}
