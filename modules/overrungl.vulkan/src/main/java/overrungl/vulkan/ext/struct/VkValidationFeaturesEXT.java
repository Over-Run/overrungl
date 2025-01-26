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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkValidationFeaturesEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t enabledValidationFeatureCount;
///     const VkValidationFeatureEnableEXT* pEnabledValidationFeatures;
///     uint32_t disabledValidationFeatureCount;
///     const VkValidationFeatureDisableEXT* pDisabledValidationFeatures;
/// };
/// ```
public sealed class VkValidationFeaturesEXT extends GroupType {
    /// The struct layout of `VkValidationFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pEnabledValidationFeatures"),
        ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationFeatures")
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
    /// The byte offset of `enabledValidationFeatureCount`.
    public static final long OFFSET_enabledValidationFeatureCount = LAYOUT.byteOffset(PathElement.groupElement("enabledValidationFeatureCount"));
    /// The memory layout of `enabledValidationFeatureCount`.
    public static final MemoryLayout LAYOUT_enabledValidationFeatureCount = LAYOUT.select(PathElement.groupElement("enabledValidationFeatureCount"));
    /// The [VarHandle] of `enabledValidationFeatureCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledValidationFeatureCount"));
    /// The byte offset of `pEnabledValidationFeatures`.
    public static final long OFFSET_pEnabledValidationFeatures = LAYOUT.byteOffset(PathElement.groupElement("pEnabledValidationFeatures"));
    /// The memory layout of `pEnabledValidationFeatures`.
    public static final MemoryLayout LAYOUT_pEnabledValidationFeatures = LAYOUT.select(PathElement.groupElement("pEnabledValidationFeatures"));
    /// The [VarHandle] of `pEnabledValidationFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pEnabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledValidationFeatures"));
    /// The byte offset of `disabledValidationFeatureCount`.
    public static final long OFFSET_disabledValidationFeatureCount = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationFeatureCount"));
    /// The memory layout of `disabledValidationFeatureCount`.
    public static final MemoryLayout LAYOUT_disabledValidationFeatureCount = LAYOUT.select(PathElement.groupElement("disabledValidationFeatureCount"));
    /// The [VarHandle] of `disabledValidationFeatureCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_disabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationFeatureCount"));
    /// The byte offset of `pDisabledValidationFeatures`.
    public static final long OFFSET_pDisabledValidationFeatures = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationFeatures"));
    /// The memory layout of `pDisabledValidationFeatures`.
    public static final MemoryLayout LAYOUT_pDisabledValidationFeatures = LAYOUT.select(PathElement.groupElement("pDisabledValidationFeatures"));
    /// The [VarHandle] of `pDisabledValidationFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDisabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationFeatures"));

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkValidationFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkValidationFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFeaturesEXT`
    public static VkValidationFeaturesEXT alloc(SegmentAllocator allocator) { return new VkValidationFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkValidationFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkValidationFeaturesEXT copyFrom(VkValidationFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkValidationFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkValidationFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `enabledValidationFeatureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enabledValidationFeatureCount(MemorySegment segment, long index) { return (int) VH_enabledValidationFeatureCount.get(segment, 0L, index); }
    /// {@return `enabledValidationFeatureCount`}
    public int enabledValidationFeatureCount() { return enabledValidationFeatureCount(this.segment(), 0L); }
    /// Sets `enabledValidationFeatureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enabledValidationFeatureCount(MemorySegment segment, long index, int value) { VH_enabledValidationFeatureCount.set(segment, 0L, index, value); }
    /// Sets `enabledValidationFeatureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT enabledValidationFeatureCount(int value) { enabledValidationFeatureCount(this.segment(), 0L, value); return this; }

    /// {@return `pEnabledValidationFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pEnabledValidationFeatures(MemorySegment segment, long index) { return (MemorySegment) VH_pEnabledValidationFeatures.get(segment, 0L, index); }
    /// {@return `pEnabledValidationFeatures`}
    public MemorySegment pEnabledValidationFeatures() { return pEnabledValidationFeatures(this.segment(), 0L); }
    /// Sets `pEnabledValidationFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pEnabledValidationFeatures(MemorySegment segment, long index, MemorySegment value) { VH_pEnabledValidationFeatures.set(segment, 0L, index, value); }
    /// Sets `pEnabledValidationFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT pEnabledValidationFeatures(MemorySegment value) { pEnabledValidationFeatures(this.segment(), 0L, value); return this; }

    /// {@return `disabledValidationFeatureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int disabledValidationFeatureCount(MemorySegment segment, long index) { return (int) VH_disabledValidationFeatureCount.get(segment, 0L, index); }
    /// {@return `disabledValidationFeatureCount`}
    public int disabledValidationFeatureCount() { return disabledValidationFeatureCount(this.segment(), 0L); }
    /// Sets `disabledValidationFeatureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void disabledValidationFeatureCount(MemorySegment segment, long index, int value) { VH_disabledValidationFeatureCount.set(segment, 0L, index, value); }
    /// Sets `disabledValidationFeatureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT disabledValidationFeatureCount(int value) { disabledValidationFeatureCount(this.segment(), 0L, value); return this; }

    /// {@return `pDisabledValidationFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDisabledValidationFeatures(MemorySegment segment, long index) { return (MemorySegment) VH_pDisabledValidationFeatures.get(segment, 0L, index); }
    /// {@return `pDisabledValidationFeatures`}
    public MemorySegment pDisabledValidationFeatures() { return pDisabledValidationFeatures(this.segment(), 0L); }
    /// Sets `pDisabledValidationFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDisabledValidationFeatures(MemorySegment segment, long index, MemorySegment value) { VH_pDisabledValidationFeatures.set(segment, 0L, index, value); }
    /// Sets `pDisabledValidationFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT pDisabledValidationFeatures(MemorySegment value) { pDisabledValidationFeatures(this.segment(), 0L, value); return this; }

    /// A buffer of [VkValidationFeaturesEXT].
    public static final class Buffer extends VkValidationFeaturesEXT {
        private final long elementCount;

        /// Creates `VkValidationFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkValidationFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkValidationFeaturesEXT`
        public VkValidationFeaturesEXT asSlice(long index) { return new VkValidationFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkValidationFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkValidationFeaturesEXT`
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

        /// {@return `enabledValidationFeatureCount` at the given index}
        /// @param index the index of the struct buffer
        public int enabledValidationFeatureCountAt(long index) { return enabledValidationFeatureCount(this.segment(), index); }
        /// Sets `enabledValidationFeatureCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer enabledValidationFeatureCountAt(long index, int value) { enabledValidationFeatureCount(this.segment(), index, value); return this; }

        /// {@return `pEnabledValidationFeatures` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pEnabledValidationFeaturesAt(long index) { return pEnabledValidationFeatures(this.segment(), index); }
        /// Sets `pEnabledValidationFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pEnabledValidationFeaturesAt(long index, MemorySegment value) { pEnabledValidationFeatures(this.segment(), index, value); return this; }

        /// {@return `disabledValidationFeatureCount` at the given index}
        /// @param index the index of the struct buffer
        public int disabledValidationFeatureCountAt(long index) { return disabledValidationFeatureCount(this.segment(), index); }
        /// Sets `disabledValidationFeatureCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer disabledValidationFeatureCountAt(long index, int value) { disabledValidationFeatureCount(this.segment(), index, value); return this; }

        /// {@return `pDisabledValidationFeatures` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDisabledValidationFeaturesAt(long index) { return pDisabledValidationFeatures(this.segment(), index); }
        /// Sets `pDisabledValidationFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDisabledValidationFeaturesAt(long index, MemorySegment value) { pDisabledValidationFeatures(this.segment(), index, value); return this; }

    }
}
