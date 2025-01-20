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
package overrungl.vulkan.android.struct;

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
/// ### colorAttachmentFormat
/// [VarHandle][#VH_colorAttachmentFormat] - [Getter][#colorAttachmentFormat()] - [Setter][#colorAttachmentFormat(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAndroidHardwareBufferFormatResolvePropertiesANDROID {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat colorAttachmentFormat;
/// } VkAndroidHardwareBufferFormatResolvePropertiesANDROID;
/// ```
public sealed class VkAndroidHardwareBufferFormatResolvePropertiesANDROID extends Struct {
    /// The struct layout of `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentFormat")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `colorAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentFormat"));

    /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment); }

    /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidHardwareBufferFormatResolvePropertiesANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkFormat") int colorAttachmentFormat) { return alloc(allocator).sType(sType).pNext(pNext).colorAttachmentFormat(colorAttachmentFormat); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID copyFrom(VkAndroidHardwareBufferFormatResolvePropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID sType(@CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID pNext(@CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `colorAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_colorAttachmentFormat(MemorySegment segment, long index) { return (int) VH_colorAttachmentFormat.get(segment, 0L, index); }
    /// {@return `colorAttachmentFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_colorAttachmentFormat(MemorySegment segment) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_colorAttachmentFormat(segment, 0L); }
    /// {@return `colorAttachmentFormat`}
    public @CType("VkFormat") int colorAttachmentFormat() { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_colorAttachmentFormat(this.segment()); }
    /// Sets `colorAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_colorAttachmentFormat.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentFormat(MemorySegment segment, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_colorAttachmentFormat(segment, 0L, value); }
    /// Sets `colorAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID colorAttachmentFormat(@CType("VkFormat") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_colorAttachmentFormat(this.segment(), value); return this; }

    /// A buffer of [VkAndroidHardwareBufferFormatResolvePropertiesANDROID].
    public static final class Buffer extends VkAndroidHardwareBufferFormatResolvePropertiesANDROID {
        private final long elementCount;

        /// Creates `VkAndroidHardwareBufferFormatResolvePropertiesANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `colorAttachmentFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int colorAttachmentFormatAt(long index) { return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.get_colorAttachmentFormat(this.segment(), index); }
        /// Sets `colorAttachmentFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentFormatAt(long index, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatResolvePropertiesANDROID.set_colorAttachmentFormat(this.segment(), index, value); return this; }

    }
}
