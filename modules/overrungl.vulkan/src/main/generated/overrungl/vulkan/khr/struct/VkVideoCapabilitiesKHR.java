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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoCapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoCapabilityFlagsKHR flags;
///     (uint64_t) VkDeviceSize minBitstreamBufferOffsetAlignment;
///     (uint64_t) VkDeviceSize minBitstreamBufferSizeAlignment;
///     (struct VkExtent2D) VkExtent2D pictureAccessGranularity;
///     (struct VkExtent2D) VkExtent2D minCodedExtent;
///     (struct VkExtent2D) VkExtent2D maxCodedExtent;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     (struct VkExtensionProperties) VkExtensionProperties stdHeaderVersion;
/// };
/// ```
public final class VkVideoCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoCapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `minBitstreamBufferOffsetAlignment`.
    public static final long OFFSET_minBitstreamBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    /// The memory layout of `minBitstreamBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minBitstreamBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    /// The [VarHandle] of `minBitstreamBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBitstreamBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    /// The byte offset of `minBitstreamBufferSizeAlignment`.
    public static final long OFFSET_minBitstreamBufferSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    /// The memory layout of `minBitstreamBufferSizeAlignment`.
    public static final MemoryLayout LAYOUT_minBitstreamBufferSizeAlignment = LAYOUT.select(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    /// The [VarHandle] of `minBitstreamBufferSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minBitstreamBufferSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    /// The byte offset of `pictureAccessGranularity`.
    public static final long OFFSET_pictureAccessGranularity = LAYOUT.byteOffset(PathElement.groupElement("pictureAccessGranularity"));
    /// The memory layout of `pictureAccessGranularity`.
    public static final MemoryLayout LAYOUT_pictureAccessGranularity = LAYOUT.select(PathElement.groupElement("pictureAccessGranularity"));
    /// The byte offset of `minCodedExtent`.
    public static final long OFFSET_minCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("minCodedExtent"));
    /// The memory layout of `minCodedExtent`.
    public static final MemoryLayout LAYOUT_minCodedExtent = LAYOUT.select(PathElement.groupElement("minCodedExtent"));
    /// The byte offset of `maxCodedExtent`.
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    /// The memory layout of `maxCodedExtent`.
    public static final MemoryLayout LAYOUT_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    /// The byte offset of `maxDpbSlots`.
    public static final long OFFSET_maxDpbSlots = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
    /// The memory layout of `maxDpbSlots`.
    public static final MemoryLayout LAYOUT_maxDpbSlots = LAYOUT.select(PathElement.groupElement("maxDpbSlots"));
    /// The [VarHandle] of `maxDpbSlots` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    /// The byte offset of `maxActiveReferencePictures`.
    public static final long OFFSET_maxActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
    /// The memory layout of `maxActiveReferencePictures`.
    public static final MemoryLayout LAYOUT_maxActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxActiveReferencePictures"));
    /// The [VarHandle] of `maxActiveReferencePictures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    /// The byte offset of `stdHeaderVersion`.
    public static final long OFFSET_stdHeaderVersion = LAYOUT.byteOffset(PathElement.groupElement("stdHeaderVersion"));
    /// The memory layout of `stdHeaderVersion`.
    public static final MemoryLayout LAYOUT_stdHeaderVersion = LAYOUT.select(PathElement.groupElement("stdHeaderVersion"));

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @param minCodedExtent `minCodedExtent`
    /// @param maxCodedExtent `maxCodedExtent`
    /// @param maxDpbSlots `maxDpbSlots`
    /// @param maxActiveReferencePictures `maxActiveReferencePictures`
    /// @param stdHeaderVersion `stdHeaderVersion`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity, MemorySegment minCodedExtent, MemorySegment maxCodedExtent, int maxDpbSlots, int maxActiveReferencePictures, MemorySegment stdHeaderVersion) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent).maxCodedExtent(maxCodedExtent).maxDpbSlots(maxDpbSlots).maxActiveReferencePictures(maxActiveReferencePictures).stdHeaderVersion(stdHeaderVersion);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @param minCodedExtent `minCodedExtent`
    /// @param maxCodedExtent `maxCodedExtent`
    /// @param maxDpbSlots `maxDpbSlots`
    /// @param maxActiveReferencePictures `maxActiveReferencePictures`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity, MemorySegment minCodedExtent, MemorySegment maxCodedExtent, int maxDpbSlots, int maxActiveReferencePictures) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent).maxCodedExtent(maxCodedExtent).maxDpbSlots(maxDpbSlots).maxActiveReferencePictures(maxActiveReferencePictures);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @param minCodedExtent `minCodedExtent`
    /// @param maxCodedExtent `maxCodedExtent`
    /// @param maxDpbSlots `maxDpbSlots`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity, MemorySegment minCodedExtent, MemorySegment maxCodedExtent, int maxDpbSlots) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent).maxCodedExtent(maxCodedExtent).maxDpbSlots(maxDpbSlots);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @param minCodedExtent `minCodedExtent`
    /// @param maxCodedExtent `maxCodedExtent`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity, MemorySegment minCodedExtent, MemorySegment maxCodedExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent).maxCodedExtent(maxCodedExtent);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @param minCodedExtent `minCodedExtent`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity, MemorySegment minCodedExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity).minCodedExtent(minCodedExtent);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @param pictureAccessGranularity `pictureAccessGranularity`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment, MemorySegment pictureAccessGranularity) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment).pictureAccessGranularity(pictureAccessGranularity);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @param minBitstreamBufferSizeAlignment `minBitstreamBufferSizeAlignment`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment, long minBitstreamBufferSizeAlignment) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment).minBitstreamBufferSizeAlignment(minBitstreamBufferSizeAlignment);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param minBitstreamBufferOffsetAlignment `minBitstreamBufferOffsetAlignment`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long minBitstreamBufferOffsetAlignment) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).minBitstreamBufferOffsetAlignment(minBitstreamBufferOffsetAlignment);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoCapabilitiesKHR copyFrom(VkVideoCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoCapabilitiesKHR reinterpret(long count) { return new VkVideoCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `minBitstreamBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minBitstreamBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minBitstreamBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minBitstreamBufferOffsetAlignment`}
    public long minBitstreamBufferOffsetAlignment() { return minBitstreamBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBitstreamBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_minBitstreamBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignment(long value) { minBitstreamBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minBitstreamBufferSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minBitstreamBufferSizeAlignment(MemorySegment segment, long index) { return (long) VH_minBitstreamBufferSizeAlignment.get(segment, 0L, index); }
    /// {@return `minBitstreamBufferSizeAlignment`}
    public long minBitstreamBufferSizeAlignment() { return minBitstreamBufferSizeAlignment(this.segment(), 0L); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBitstreamBufferSizeAlignment(MemorySegment segment, long index, long value) { VH_minBitstreamBufferSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignment(long value) { minBitstreamBufferSizeAlignment(this.segment(), 0L, value); return this; }

    /// {@return `pictureAccessGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pictureAccessGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pictureAccessGranularity, index), LAYOUT_pictureAccessGranularity); }
    /// {@return `pictureAccessGranularity`}
    public MemorySegment pictureAccessGranularity() { return pictureAccessGranularity(this.segment(), 0L); }
    /// Sets `pictureAccessGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pictureAccessGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pictureAccessGranularity, index), LAYOUT_pictureAccessGranularity.byteSize()); }
    /// Sets `pictureAccessGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pictureAccessGranularity(MemorySegment value) { pictureAccessGranularity(this.segment(), 0L, value); return this; }
    /// Accepts `pictureAccessGranularity` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR pictureAccessGranularity(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(pictureAccessGranularity())); return this; }

    /// {@return `minCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minCodedExtent, index), LAYOUT_minCodedExtent); }
    /// {@return `minCodedExtent`}
    public MemorySegment minCodedExtent() { return minCodedExtent(this.segment(), 0L); }
    /// Sets `minCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minCodedExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minCodedExtent, index), LAYOUT_minCodedExtent.byteSize()); }
    /// Sets `minCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minCodedExtent(MemorySegment value) { minCodedExtent(this.segment(), 0L, value); return this; }
    /// Accepts `minCodedExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR minCodedExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minCodedExtent())); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent); }
    /// {@return `maxCodedExtent`}
    public MemorySegment maxCodedExtent() { return maxCodedExtent(this.segment(), 0L); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCodedExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent.byteSize()); }
    /// Sets `maxCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxCodedExtent(MemorySegment value) { maxCodedExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxCodedExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR maxCodedExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxCodedExtent())); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDpbSlots(MemorySegment segment, long index) { return (int) VH_maxDpbSlots.get(segment, 0L, index); }
    /// {@return `maxDpbSlots`}
    public int maxDpbSlots() { return maxDpbSlots(this.segment(), 0L); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDpbSlots(MemorySegment segment, long index, int value) { VH_maxDpbSlots.set(segment, 0L, index, value); }
    /// Sets `maxDpbSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxDpbSlots(int value) { maxDpbSlots(this.segment(), 0L, value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxActiveReferencePictures(MemorySegment segment, long index) { return (int) VH_maxActiveReferencePictures.get(segment, 0L, index); }
    /// {@return `maxActiveReferencePictures`}
    public int maxActiveReferencePictures() { return maxActiveReferencePictures(this.segment(), 0L); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxActiveReferencePictures(MemorySegment segment, long index, int value) { VH_maxActiveReferencePictures.set(segment, 0L, index, value); }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxActiveReferencePictures(int value) { maxActiveReferencePictures(this.segment(), 0L, value); return this; }

    /// {@return `stdHeaderVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment stdHeaderVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stdHeaderVersion, index), LAYOUT_stdHeaderVersion); }
    /// {@return `stdHeaderVersion`}
    public MemorySegment stdHeaderVersion() { return stdHeaderVersion(this.segment(), 0L); }
    /// Sets `stdHeaderVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdHeaderVersion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stdHeaderVersion, index), LAYOUT_stdHeaderVersion.byteSize()); }
    /// Sets `stdHeaderVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR stdHeaderVersion(MemorySegment value) { stdHeaderVersion(this.segment(), 0L, value); return this; }
    /// Accepts `stdHeaderVersion` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR stdHeaderVersion(Consumer<overrungl.vulkan.struct.VkExtensionProperties> func) { func.accept(overrungl.vulkan.struct.VkExtensionProperties.of(stdHeaderVersion())); return this; }

    /// Creates a slice of `VkVideoCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoCapabilitiesKHR`
    public VkVideoCapabilitiesKHR asSlice(long index) { return new VkVideoCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoCapabilitiesKHR`
    public VkVideoCapabilitiesKHR asSlice(long index, long count) { return new VkVideoCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoCapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoCapabilitiesKHR at(long index, Consumer<VkVideoCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `minBitstreamBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minBitstreamBufferOffsetAlignmentAt(long index) { return minBitstreamBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minBitstreamBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignmentAt(long index, long value) { minBitstreamBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minBitstreamBufferSizeAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minBitstreamBufferSizeAlignmentAt(long index) { return minBitstreamBufferSizeAlignment(this.segment(), index); }
    /// Sets `minBitstreamBufferSizeAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignmentAt(long index, long value) { minBitstreamBufferSizeAlignment(this.segment(), index, value); return this; }

    /// {@return `pictureAccessGranularity` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pictureAccessGranularityAt(long index) { return pictureAccessGranularity(this.segment(), index); }
    /// Sets `pictureAccessGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR pictureAccessGranularityAt(long index, MemorySegment value) { pictureAccessGranularity(this.segment(), index, value); return this; }
    /// Accepts `pictureAccessGranularity` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR pictureAccessGranularityAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(pictureAccessGranularityAt(index))); return this; }

    /// {@return `minCodedExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minCodedExtentAt(long index) { return minCodedExtent(this.segment(), index); }
    /// Sets `minCodedExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR minCodedExtentAt(long index, MemorySegment value) { minCodedExtent(this.segment(), index, value); return this; }
    /// Accepts `minCodedExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR minCodedExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minCodedExtentAt(index))); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxCodedExtentAt(long index) { return maxCodedExtent(this.segment(), index); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxCodedExtentAt(long index, MemorySegment value) { maxCodedExtent(this.segment(), index, value); return this; }
    /// Accepts `maxCodedExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR maxCodedExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxCodedExtentAt(index))); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param index the index of the struct buffer
    public int maxDpbSlotsAt(long index) { return maxDpbSlots(this.segment(), index); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxDpbSlotsAt(long index, int value) { maxDpbSlots(this.segment(), index, value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param index the index of the struct buffer
    public int maxActiveReferencePicturesAt(long index) { return maxActiveReferencePictures(this.segment(), index); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR maxActiveReferencePicturesAt(long index, int value) { maxActiveReferencePictures(this.segment(), index, value); return this; }

    /// {@return `stdHeaderVersion` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment stdHeaderVersionAt(long index) { return stdHeaderVersion(this.segment(), index); }
    /// Sets `stdHeaderVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoCapabilitiesKHR stdHeaderVersionAt(long index, MemorySegment value) { stdHeaderVersion(this.segment(), index, value); return this; }
    /// Accepts `stdHeaderVersion` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoCapabilitiesKHR stdHeaderVersionAt(long index, Consumer<overrungl.vulkan.struct.VkExtensionProperties> func) { func.accept(overrungl.vulkan.struct.VkExtensionProperties.of(stdHeaderVersionAt(index))); return this; }

}
