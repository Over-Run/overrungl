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
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### name
/// [Byte offset][#OFFSET_name] - [Memory layout][#ML_name] - [Getter][#name()] - [Setter][#name(MemorySegment)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(MemorySegment)]
/// ### isText
/// [VarHandle][#VH_isText] - [Getter][#isText()] - [Setter][#isText(int)]
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(long)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineExecutableInternalRepresentationKHR {
///     VkStructureType sType;
///     void * pNext;
///     char[VK_MAX_DESCRIPTION_SIZE] name;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     VkBool32 isText;
///     size_t dataSize;
///     void * pData;
/// } VkPipelineExecutableInternalRepresentationKHR;
/// ```
public sealed class VkPipelineExecutableInternalRepresentationKHR extends Struct {
    /// The struct layout of `VkPipelineExecutableInternalRepresentationKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("isText"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `isText` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_isText = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isText"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkPipelineExecutableInternalRepresentationKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutableInternalRepresentationKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutableInternalRepresentationKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInternalRepresentationKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInternalRepresentationKHR(segment); }

    /// Creates `VkPipelineExecutableInternalRepresentationKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableInternalRepresentationKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInternalRepresentationKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableInternalRepresentationKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutableInternalRepresentationKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineExecutableInternalRepresentationKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInternalRepresentationKHR`
    public static VkPipelineExecutableInternalRepresentationKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInternalRepresentationKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutableInternalRepresentationKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableInternalRepresentationKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineExecutableInternalRepresentationKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInternalRepresentationKHR`
    public static VkPipelineExecutableInternalRepresentationKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment name, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description, @CType("VkBool32") int isText, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData) { return alloc(allocator).sType(sType).pNext(pNext).name(name).description(description).isText(isText).dataSize(dataSize).pData(pData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR copyFrom(VkPipelineExecutableInternalRepresentationKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineExecutableInternalRepresentationKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineExecutableInternalRepresentationKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR sType(@CType("VkStructureType") int value) { VkPipelineExecutableInternalRepresentationKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPipelineExecutableInternalRepresentationKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR pNext(@CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), ML_name); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_name(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_name(segment, 0L); }
    /// {@return `name`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment name() { return VkPipelineExecutableInternalRepresentationKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), ML_name.byteSize()); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR name(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_name(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description() { return VkPipelineExecutableInternalRepresentationKHR.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_description(this.segment(), value); return this; }

    /// {@return `isText` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_isText(MemorySegment segment, long index) { return (int) VH_isText.get(segment, 0L, index); }
    /// {@return `isText`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_isText(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_isText(segment, 0L); }
    /// {@return `isText`}
    public @CType("VkBool32") int isText() { return VkPipelineExecutableInternalRepresentationKHR.get_isText(this.segment()); }
    /// Sets `isText` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_isText(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_isText.set(segment, 0L, index, value); }
    /// Sets `isText` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_isText(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineExecutableInternalRepresentationKHR.set_isText(segment, 0L, value); }
    /// Sets `isText` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR isText(@CType("VkBool32") int value) { VkPipelineExecutableInternalRepresentationKHR.set_isText(this.segment(), value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dataSize(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_dataSize(segment, 0L); }
    /// {@return `dataSize`}
    public @CType("size_t") long dataSize() { return VkPipelineExecutableInternalRepresentationKHR.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("size_t") long value) { VkPipelineExecutableInternalRepresentationKHR.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR dataSize(@CType("size_t") long value) { VkPipelineExecutableInternalRepresentationKHR.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pData(MemorySegment segment) { return VkPipelineExecutableInternalRepresentationKHR.get_pData(segment, 0L); }
    /// {@return `pData`}
    public @CType("void *") MemorySegment pData() { return VkPipelineExecutableInternalRepresentationKHR.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInternalRepresentationKHR pData(@CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pData(this.segment(), value); return this; }

    /// A buffer of [VkPipelineExecutableInternalRepresentationKHR].
    public static final class Buffer extends VkPipelineExecutableInternalRepresentationKHR {
        private final long elementCount;

        /// Creates `VkPipelineExecutableInternalRepresentationKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineExecutableInternalRepresentationKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineExecutableInternalRepresentationKHR`
        public VkPipelineExecutableInternalRepresentationKHR asSlice(long index) { return new VkPipelineExecutableInternalRepresentationKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineExecutableInternalRepresentationKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineExecutableInternalRepresentationKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineExecutableInternalRepresentationKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `name` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment nameAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_name(this.segment(), index); }
        /// Sets `name` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nameAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_name(this.segment(), index, value); return this; }

        /// {@return `description` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment descriptionAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_description(this.segment(), index, value); return this; }

        /// {@return `isText` at the given index}
        /// @param index the index
        public @CType("VkBool32") int isTextAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_isText(this.segment(), index); }
        /// Sets `isText` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer isTextAt(long index, @CType("VkBool32") int value) { VkPipelineExecutableInternalRepresentationKHR.set_isText(this.segment(), index, value); return this; }

        /// {@return `dataSize` at the given index}
        /// @param index the index
        public @CType("size_t") long dataSizeAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_dataSize(this.segment(), index); }
        /// Sets `dataSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataSizeAt(long index, @CType("size_t") long value) { VkPipelineExecutableInternalRepresentationKHR.set_dataSize(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pDataAt(long index) { return VkPipelineExecutableInternalRepresentationKHR.get_pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, @CType("void *") MemorySegment value) { VkPipelineExecutableInternalRepresentationKHR.set_pData(this.segment(), index, value); return this; }

    }
}
