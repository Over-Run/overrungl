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
public sealed class VkVideoCapabilitiesKHR extends GroupType {
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
    /// @param segment the memory segment
    public VkVideoCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoCapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoCapabilitiesKHR copyFrom(VkVideoCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `minBitstreamBufferOffsetAlignment` at the given index}
        /// @param index the index of the struct buffer
        public long minBitstreamBufferOffsetAlignmentAt(long index) { return minBitstreamBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minBitstreamBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBitstreamBufferOffsetAlignmentAt(long index, long value) { minBitstreamBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minBitstreamBufferSizeAlignment` at the given index}
        /// @param index the index of the struct buffer
        public long minBitstreamBufferSizeAlignmentAt(long index) { return minBitstreamBufferSizeAlignment(this.segment(), index); }
        /// Sets `minBitstreamBufferSizeAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minBitstreamBufferSizeAlignmentAt(long index, long value) { minBitstreamBufferSizeAlignment(this.segment(), index, value); return this; }

        /// {@return `pictureAccessGranularity` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pictureAccessGranularityAt(long index) { return pictureAccessGranularity(this.segment(), index); }
        /// Sets `pictureAccessGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pictureAccessGranularityAt(long index, MemorySegment value) { pictureAccessGranularity(this.segment(), index, value); return this; }

        /// {@return `minCodedExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment minCodedExtentAt(long index) { return minCodedExtent(this.segment(), index); }
        /// Sets `minCodedExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minCodedExtentAt(long index, MemorySegment value) { minCodedExtent(this.segment(), index, value); return this; }

        /// {@return `maxCodedExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxCodedExtentAt(long index) { return maxCodedExtent(this.segment(), index); }
        /// Sets `maxCodedExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCodedExtentAt(long index, MemorySegment value) { maxCodedExtent(this.segment(), index, value); return this; }

        /// {@return `maxDpbSlots` at the given index}
        /// @param index the index of the struct buffer
        public int maxDpbSlotsAt(long index) { return maxDpbSlots(this.segment(), index); }
        /// Sets `maxDpbSlots` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDpbSlotsAt(long index, int value) { maxDpbSlots(this.segment(), index, value); return this; }

        /// {@return `maxActiveReferencePictures` at the given index}
        /// @param index the index of the struct buffer
        public int maxActiveReferencePicturesAt(long index) { return maxActiveReferencePictures(this.segment(), index); }
        /// Sets `maxActiveReferencePictures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxActiveReferencePicturesAt(long index, int value) { maxActiveReferencePictures(this.segment(), index, value); return this; }

        /// {@return `stdHeaderVersion` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment stdHeaderVersionAt(long index) { return stdHeaderVersion(this.segment(), index); }
        /// Sets `stdHeaderVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdHeaderVersionAt(long index, MemorySegment value) { stdHeaderVersion(this.segment(), index, value); return this; }

    }
}
