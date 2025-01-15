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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### minBitstreamBufferOffsetAlignment
/// [VarHandle][#VH_minBitstreamBufferOffsetAlignment] - [Getter][#minBitstreamBufferOffsetAlignment()] - [Setter][#minBitstreamBufferOffsetAlignment(long)]
/// ### minBitstreamBufferSizeAlignment
/// [VarHandle][#VH_minBitstreamBufferSizeAlignment] - [Getter][#minBitstreamBufferSizeAlignment()] - [Setter][#minBitstreamBufferSizeAlignment(long)]
/// ### pictureAccessGranularity
/// [Byte offset][#OFFSET_pictureAccessGranularity] - [Memory layout][#ML_pictureAccessGranularity] - [Getter][#pictureAccessGranularity()] - [Setter][#pictureAccessGranularity(java.lang.foreign.MemorySegment)]
/// ### minCodedExtent
/// [Byte offset][#OFFSET_minCodedExtent] - [Memory layout][#ML_minCodedExtent] - [Getter][#minCodedExtent()] - [Setter][#minCodedExtent(java.lang.foreign.MemorySegment)]
/// ### maxCodedExtent
/// [Byte offset][#OFFSET_maxCodedExtent] - [Memory layout][#ML_maxCodedExtent] - [Getter][#maxCodedExtent()] - [Setter][#maxCodedExtent(java.lang.foreign.MemorySegment)]
/// ### maxDpbSlots
/// [VarHandle][#VH_maxDpbSlots] - [Getter][#maxDpbSlots()] - [Setter][#maxDpbSlots(int)]
/// ### maxActiveReferencePictures
/// [VarHandle][#VH_maxActiveReferencePictures] - [Getter][#maxActiveReferencePictures()] - [Setter][#maxActiveReferencePictures(int)]
/// ### stdHeaderVersion
/// [Byte offset][#OFFSET_stdHeaderVersion] - [Memory layout][#ML_stdHeaderVersion] - [Getter][#stdHeaderVersion()] - [Setter][#stdHeaderVersion(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoCapabilityFlagsKHR flags;
///     VkDeviceSize minBitstreamBufferOffsetAlignment;
///     VkDeviceSize minBitstreamBufferSizeAlignment;
///     VkExtent2D pictureAccessGranularity;
///     VkExtent2D minCodedExtent;
///     VkExtent2D maxCodedExtent;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     VkExtensionProperties stdHeaderVersion;
/// } VkVideoCapabilitiesKHR;
/// ```
public sealed class VkVideoCapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferSizeAlignment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("pictureAccessGranularity"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minCodedExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        overrungl.vulkan.struct.VkExtensionProperties.LAYOUT.withName("stdHeaderVersion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `minBitstreamBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minBitstreamBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    /// The [VarHandle] of `minBitstreamBufferSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minBitstreamBufferSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    /// The byte offset of `pictureAccessGranularity`.
    public static final long OFFSET_pictureAccessGranularity = LAYOUT.byteOffset(PathElement.groupElement("pictureAccessGranularity"));
    /// The memory layout of `pictureAccessGranularity`.
    public static final MemoryLayout ML_pictureAccessGranularity = LAYOUT.select(PathElement.groupElement("pictureAccessGranularity"));
    /// The byte offset of `minCodedExtent`.
    public static final long OFFSET_minCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("minCodedExtent"));
    /// The memory layout of `minCodedExtent`.
    public static final MemoryLayout ML_minCodedExtent = LAYOUT.select(PathElement.groupElement("minCodedExtent"));
    /// The byte offset of `maxCodedExtent`.
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    /// The memory layout of `maxCodedExtent`.
    public static final MemoryLayout ML_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    /// The [VarHandle] of `maxDpbSlots` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    /// The [VarHandle] of `maxActiveReferencePictures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    /// The byte offset of `stdHeaderVersion`.
    public static final long OFFSET_stdHeaderVersion = LAYOUT.byteOffset(PathElement.groupElement("stdHeaderVersion"));
    /// The memory layout of `stdHeaderVersion`.
    public static final MemoryLayout ML_stdHeaderVersion = LAYOUT.select(PathElement.groupElement("stdHeaderVersion"));

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkVideoCapabilityFlagsKHR") int flags, @CType("VkDeviceSize") long minBitstreamBufferOffsetAlignment, @CType("VkDeviceSize") long minBitstreamBufferSizeAlignment, @CType("VkExtent2D") java.lang.foreign.MemorySegment pictureAccessGranularity, @CType("VkExtent2D") java.lang.foreign.MemorySegment minCodedExtent, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxCodedExtent, @CType("uint32_t") int maxDpbSlots, @CType("uint32_t") int maxActiveReferencePictures, @CType("VkExtensionProperties") java.lang.foreign.MemorySegment stdHeaderVersion) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent).maxCodedExtent(maxCodedExtent).maxDpbSlots(maxDpbSlots).maxActiveReferencePictures(maxActiveReferencePictures).stdHeaderVersion(stdHeaderVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoCapabilitiesKHR copyFrom(VkVideoCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoCapabilityFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoCapabilityFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoCapabilityFlagsKHR") int flags() { return VkVideoCapabilitiesKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoCapabilityFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoCapabilityFlagsKHR") int value) { VkVideoCapabilitiesKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR flags(@CType("VkVideoCapabilityFlagsKHR") int value) { VkVideoCapabilitiesKHR.set_flags(this.segment(), value); return this; }

    /// {@return `minBitstreamBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minBitstreamBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minBitstreamBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minBitstreamBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minBitstreamBufferOffsetAlignment(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_minBitstreamBufferOffsetAlignment(segment, 0L); }
    /// {@return `minBitstreamBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long minBitstreamBufferOffsetAlignment() { return VkVideoCapabilitiesKHR.get_minBitstreamBufferOffsetAlignment(this.segment()); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBitstreamBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minBitstreamBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBitstreamBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minBitstreamBufferSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minBitstreamBufferSizeAlignment(MemorySegment segment, long index) { return (long) VH_minBitstreamBufferSizeAlignment.get(segment, 0L, index); }
    /// {@return `minBitstreamBufferSizeAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minBitstreamBufferSizeAlignment(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_minBitstreamBufferSizeAlignment(segment, 0L); }
    /// {@return `minBitstreamBufferSizeAlignment`}
    public @CType("VkDeviceSize") long minBitstreamBufferSizeAlignment() { return VkVideoCapabilitiesKHR.get_minBitstreamBufferSizeAlignment(this.segment()); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBitstreamBufferSizeAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minBitstreamBufferSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBitstreamBufferSizeAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferSizeAlignment(segment, 0L, value); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignment(@CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferSizeAlignment(this.segment(), value); return this; }

    /// {@return `pictureAccessGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_pictureAccessGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pictureAccessGranularity, index), ML_pictureAccessGranularity); }
    /// {@return `pictureAccessGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_pictureAccessGranularity(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_pictureAccessGranularity(segment, 0L); }
    /// {@return `pictureAccessGranularity`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment pictureAccessGranularity() { return VkVideoCapabilitiesKHR.get_pictureAccessGranularity(this.segment()); }
    /// Sets `pictureAccessGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pictureAccessGranularity(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pictureAccessGranularity, index), ML_pictureAccessGranularity.byteSize()); }
    /// Sets `pictureAccessGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pictureAccessGranularity(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pictureAccessGranularity(segment, 0L, value); }
    /// Sets `pictureAccessGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pictureAccessGranularity(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pictureAccessGranularity(this.segment(), value); return this; }

    /// {@return `minCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minCodedExtent, index), ML_minCodedExtent); }
    /// {@return `minCodedExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minCodedExtent(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_minCodedExtent(segment, 0L); }
    /// {@return `minCodedExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minCodedExtent() { return VkVideoCapabilitiesKHR.get_minCodedExtent(this.segment()); }
    /// Sets `minCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minCodedExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minCodedExtent, index), ML_minCodedExtent.byteSize()); }
    /// Sets `minCodedExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minCodedExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_minCodedExtent(segment, 0L, value); }
    /// Sets `minCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minCodedExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_minCodedExtent(this.segment(), value); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), ML_maxCodedExtent); }
    /// {@return `maxCodedExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxCodedExtent(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_maxCodedExtent(segment, 0L); }
    /// {@return `maxCodedExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxCodedExtent() { return VkVideoCapabilitiesKHR.get_maxCodedExtent(this.segment()); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCodedExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxCodedExtent, index), ML_maxCodedExtent.byteSize()); }
    /// Sets `maxCodedExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCodedExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_maxCodedExtent(segment, 0L, value); }
    /// Sets `maxCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxCodedExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_maxCodedExtent(this.segment(), value); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDpbSlots(MemorySegment segment, long index) { return (int) VH_maxDpbSlots.get(segment, 0L, index); }
    /// {@return `maxDpbSlots`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDpbSlots(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_maxDpbSlots(segment, 0L); }
    /// {@return `maxDpbSlots`}
    public @CType("uint32_t") int maxDpbSlots() { return VkVideoCapabilitiesKHR.get_maxDpbSlots(this.segment()); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDpbSlots(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDpbSlots.set(segment, 0L, index, value); }
    /// Sets `maxDpbSlots` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDpbSlots(MemorySegment segment, @CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxDpbSlots(segment, 0L, value); }
    /// Sets `maxDpbSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxDpbSlots(@CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxDpbSlots(this.segment(), value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxActiveReferencePictures(MemorySegment segment, long index) { return (int) VH_maxActiveReferencePictures.get(segment, 0L, index); }
    /// {@return `maxActiveReferencePictures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxActiveReferencePictures(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_maxActiveReferencePictures(segment, 0L); }
    /// {@return `maxActiveReferencePictures`}
    public @CType("uint32_t") int maxActiveReferencePictures() { return VkVideoCapabilitiesKHR.get_maxActiveReferencePictures(this.segment()); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxActiveReferencePictures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxActiveReferencePictures.set(segment, 0L, index, value); }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxActiveReferencePictures(MemorySegment segment, @CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxActiveReferencePictures(segment, 0L, value); }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxActiveReferencePictures(@CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxActiveReferencePictures(this.segment(), value); return this; }

    /// {@return `stdHeaderVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtensionProperties") java.lang.foreign.MemorySegment get_stdHeaderVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stdHeaderVersion, index), ML_stdHeaderVersion); }
    /// {@return `stdHeaderVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkExtensionProperties") java.lang.foreign.MemorySegment get_stdHeaderVersion(MemorySegment segment) { return VkVideoCapabilitiesKHR.get_stdHeaderVersion(segment, 0L); }
    /// {@return `stdHeaderVersion`}
    public @CType("VkExtensionProperties") java.lang.foreign.MemorySegment stdHeaderVersion() { return VkVideoCapabilitiesKHR.get_stdHeaderVersion(this.segment()); }
    /// Sets `stdHeaderVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdHeaderVersion(MemorySegment segment, long index, @CType("VkExtensionProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stdHeaderVersion, index), ML_stdHeaderVersion.byteSize()); }
    /// Sets `stdHeaderVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdHeaderVersion(MemorySegment segment, @CType("VkExtensionProperties") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_stdHeaderVersion(segment, 0L, value); }
    /// Sets `stdHeaderVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR stdHeaderVersion(@CType("VkExtensionProperties") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_stdHeaderVersion(this.segment(), value); return this; }

    /// A buffer of [VkVideoCapabilitiesKHR].
    public static final class Buffer extends VkVideoCapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoCapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoCapabilitiesKHR`
        public VkVideoCapabilitiesKHR asSlice(long index) { return new VkVideoCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoCapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoCapabilitiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoCapabilitiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoCapabilityFlagsKHR") int flagsAt(long index) { return VkVideoCapabilitiesKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoCapabilityFlagsKHR") int value) { VkVideoCapabilitiesKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `minBitstreamBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minBitstreamBufferOffsetAlignmentAt(long index) { return VkVideoCapabilitiesKHR.get_minBitstreamBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minBitstreamBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minBitstreamBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minBitstreamBufferSizeAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minBitstreamBufferSizeAlignmentAt(long index) { return VkVideoCapabilitiesKHR.get_minBitstreamBufferSizeAlignment(this.segment(), index); }
        /// Sets `minBitstreamBufferSizeAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minBitstreamBufferSizeAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkVideoCapabilitiesKHR.set_minBitstreamBufferSizeAlignment(this.segment(), index, value); return this; }

        /// {@return `pictureAccessGranularity` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment pictureAccessGranularityAt(long index) { return VkVideoCapabilitiesKHR.get_pictureAccessGranularity(this.segment(), index); }
        /// Sets `pictureAccessGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pictureAccessGranularityAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_pictureAccessGranularity(this.segment(), index, value); return this; }

        /// {@return `minCodedExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment minCodedExtentAt(long index) { return VkVideoCapabilitiesKHR.get_minCodedExtent(this.segment(), index); }
        /// Sets `minCodedExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minCodedExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_minCodedExtent(this.segment(), index, value); return this; }

        /// {@return `maxCodedExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxCodedExtentAt(long index) { return VkVideoCapabilitiesKHR.get_maxCodedExtent(this.segment(), index); }
        /// Sets `maxCodedExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxCodedExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_maxCodedExtent(this.segment(), index, value); return this; }

        /// {@return `maxDpbSlots` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDpbSlotsAt(long index) { return VkVideoCapabilitiesKHR.get_maxDpbSlots(this.segment(), index); }
        /// Sets `maxDpbSlots` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDpbSlotsAt(long index, @CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxDpbSlots(this.segment(), index, value); return this; }

        /// {@return `maxActiveReferencePictures` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxActiveReferencePicturesAt(long index) { return VkVideoCapabilitiesKHR.get_maxActiveReferencePictures(this.segment(), index); }
        /// Sets `maxActiveReferencePictures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxActiveReferencePicturesAt(long index, @CType("uint32_t") int value) { VkVideoCapabilitiesKHR.set_maxActiveReferencePictures(this.segment(), index, value); return this; }

        /// {@return `stdHeaderVersion` at the given index}
        /// @param index the index
        public @CType("VkExtensionProperties") java.lang.foreign.MemorySegment stdHeaderVersionAt(long index) { return VkVideoCapabilitiesKHR.get_stdHeaderVersion(this.segment(), index); }
        /// Sets `stdHeaderVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdHeaderVersionAt(long index, @CType("VkExtensionProperties") java.lang.foreign.MemorySegment value) { VkVideoCapabilitiesKHR.set_stdHeaderVersion(this.segment(), index, value); return this; }

    }
}
