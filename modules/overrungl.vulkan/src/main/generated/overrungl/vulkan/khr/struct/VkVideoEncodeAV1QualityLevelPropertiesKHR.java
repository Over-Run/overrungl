// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1QualityLevelPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredKeyFramePeriod;
///     uint32_t preferredConsecutiveBipredictiveFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     (struct VkVideoEncodeAV1QIndexKHR) VkVideoEncodeAV1QIndexKHR preferredConstantQIndex;
///     uint32_t preferredMaxSingleReferenceCount;
///     uint32_t preferredSingleReferenceNameMask;
///     uint32_t preferredMaxUnidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredUnidirectionalCompoundReferenceNameMask;
///     uint32_t preferredMaxBidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t preferredBidirectionalCompoundReferenceNameMask;
/// };
/// ```
public final class VkVideoEncodeAV1QualityLevelPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredKeyFramePeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("preferredConstantQIndex"),
        ValueLayout.JAVA_INT.withName("preferredMaxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredSingleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredUnidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredBidirectionalCompoundReferenceNameMask")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `preferredRateControlFlags`.
    public static final long OFFSET_preferredRateControlFlags = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
    /// The memory layout of `preferredRateControlFlags`.
    public static final MemoryLayout LAYOUT_preferredRateControlFlags = LAYOUT.select(PathElement.groupElement("preferredRateControlFlags"));
    /// The [VarHandle] of `preferredRateControlFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredRateControlFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags")));
    /// The byte offset of `preferredGopFrameCount`.
    public static final long OFFSET_preferredGopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
    /// The memory layout of `preferredGopFrameCount`.
    public static final MemoryLayout LAYOUT_preferredGopFrameCount = LAYOUT.select(PathElement.groupElement("preferredGopFrameCount"));
    /// The [VarHandle] of `preferredGopFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredGopFrameCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount")));
    /// The byte offset of `preferredKeyFramePeriod`.
    public static final long OFFSET_preferredKeyFramePeriod = LAYOUT.byteOffset(PathElement.groupElement("preferredKeyFramePeriod"));
    /// The memory layout of `preferredKeyFramePeriod`.
    public static final MemoryLayout LAYOUT_preferredKeyFramePeriod = LAYOUT.select(PathElement.groupElement("preferredKeyFramePeriod"));
    /// The [VarHandle] of `preferredKeyFramePeriod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredKeyFramePeriod = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredKeyFramePeriod")));
    /// The byte offset of `preferredConsecutiveBipredictiveFrameCount`.
    public static final long OFFSET_preferredConsecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    /// The memory layout of `preferredConsecutiveBipredictiveFrameCount`.
    public static final MemoryLayout LAYOUT_preferredConsecutiveBipredictiveFrameCount = LAYOUT.select(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    /// The [VarHandle] of `preferredConsecutiveBipredictiveFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredConsecutiveBipredictiveFrameCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount")));
    /// The byte offset of `preferredTemporalLayerCount`.
    public static final long OFFSET_preferredTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The memory layout of `preferredTemporalLayerCount`.
    public static final MemoryLayout LAYOUT_preferredTemporalLayerCount = LAYOUT.select(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The [VarHandle] of `preferredTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredTemporalLayerCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredTemporalLayerCount")));
    /// The byte offset of `preferredConstantQIndex`.
    public static final long OFFSET_preferredConstantQIndex = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQIndex"));
    /// The memory layout of `preferredConstantQIndex`.
    public static final MemoryLayout LAYOUT_preferredConstantQIndex = LAYOUT.select(PathElement.groupElement("preferredConstantQIndex"));
    /// The byte offset of `preferredMaxSingleReferenceCount`.
    public static final long OFFSET_preferredMaxSingleReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    /// The memory layout of `preferredMaxSingleReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxSingleReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    /// The [VarHandle] of `preferredMaxSingleReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxSingleReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxSingleReferenceCount")));
    /// The byte offset of `preferredSingleReferenceNameMask`.
    public static final long OFFSET_preferredSingleReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredSingleReferenceNameMask"));
    /// The memory layout of `preferredSingleReferenceNameMask`.
    public static final MemoryLayout LAYOUT_preferredSingleReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredSingleReferenceNameMask"));
    /// The [VarHandle] of `preferredSingleReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredSingleReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSingleReferenceNameMask")));
    /// The byte offset of `preferredMaxUnidirectionalCompoundReferenceCount`.
    public static final long OFFSET_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    /// The memory layout of `preferredMaxUnidirectionalCompoundReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `preferredMaxUnidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxUnidirectionalCompoundReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount")));
    /// The byte offset of `preferredMaxUnidirectionalCompoundGroup1ReferenceCount`.
    public static final long OFFSET_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The memory layout of `preferredMaxUnidirectionalCompoundGroup1ReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount")));
    /// The byte offset of `preferredUnidirectionalCompoundReferenceNameMask`.
    public static final long OFFSET_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    /// The memory layout of `preferredUnidirectionalCompoundReferenceNameMask`.
    public static final MemoryLayout LAYOUT_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `preferredUnidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredUnidirectionalCompoundReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask")));
    /// The byte offset of `preferredMaxBidirectionalCompoundReferenceCount`.
    public static final long OFFSET_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    /// The memory layout of `preferredMaxBidirectionalCompoundReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxBidirectionalCompoundReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount")));
    /// The byte offset of `preferredMaxBidirectionalCompoundGroup1ReferenceCount`.
    public static final long OFFSET_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    /// The memory layout of `preferredMaxBidirectionalCompoundGroup1ReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount")));
    /// The byte offset of `preferredMaxBidirectionalCompoundGroup2ReferenceCount`.
    public static final long OFFSET_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    /// The memory layout of `preferredMaxBidirectionalCompoundGroup2ReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundGroup2ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount")));
    /// The byte offset of `preferredBidirectionalCompoundReferenceNameMask`.
    public static final long OFFSET_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
    /// The memory layout of `preferredBidirectionalCompoundReferenceNameMask`.
    public static final MemoryLayout LAYOUT_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `preferredBidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredBidirectionalCompoundReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask")));

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1QualityLevelPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR copyFrom(VkVideoEncodeAV1QualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1QualityLevelPropertiesKHR reinterpret(long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredRateControlFlags(MemorySegment segment, long index) { return (int) VH_preferredRateControlFlags.get().get(segment, 0L, index); }
    /// {@return `preferredRateControlFlags`}
    public int preferredRateControlFlags() { return preferredRateControlFlags(this.segment(), 0L); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredRateControlFlags(MemorySegment segment, long index, int value) { VH_preferredRateControlFlags.get().set(segment, 0L, index, value); }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlags(int value) { preferredRateControlFlags(this.segment(), 0L, value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredGopFrameCount(MemorySegment segment, long index) { return (int) VH_preferredGopFrameCount.get().get(segment, 0L, index); }
    /// {@return `preferredGopFrameCount`}
    public int preferredGopFrameCount() { return preferredGopFrameCount(this.segment(), 0L); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredGopFrameCount(MemorySegment segment, long index, int value) { VH_preferredGopFrameCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCount(int value) { preferredGopFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredKeyFramePeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredKeyFramePeriod(MemorySegment segment, long index) { return (int) VH_preferredKeyFramePeriod.get().get(segment, 0L, index); }
    /// {@return `preferredKeyFramePeriod`}
    public int preferredKeyFramePeriod() { return preferredKeyFramePeriod(this.segment(), 0L); }
    /// Sets `preferredKeyFramePeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredKeyFramePeriod(MemorySegment segment, long index, int value) { VH_preferredKeyFramePeriod.get().set(segment, 0L, index, value); }
    /// Sets `preferredKeyFramePeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriod(int value) { preferredKeyFramePeriod(this.segment(), 0L, value); return this; }

    /// {@return `preferredConsecutiveBipredictiveFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredConsecutiveBipredictiveFrameCount(MemorySegment segment, long index) { return (int) VH_preferredConsecutiveBipredictiveFrameCount.get().get(segment, 0L, index); }
    /// {@return `preferredConsecutiveBipredictiveFrameCount`}
    public int preferredConsecutiveBipredictiveFrameCount() { return preferredConsecutiveBipredictiveFrameCount(this.segment(), 0L); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredConsecutiveBipredictiveFrameCount(MemorySegment segment, long index, int value) { VH_preferredConsecutiveBipredictiveFrameCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCount(int value) { preferredConsecutiveBipredictiveFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_preferredTemporalLayerCount.get().get(segment, 0L, index); }
    /// {@return `preferredTemporalLayerCount`}
    public int preferredTemporalLayerCount() { return preferredTemporalLayerCount(this.segment(), 0L); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredTemporalLayerCount(MemorySegment segment, long index, int value) { VH_preferredTemporalLayerCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCount(int value) { preferredTemporalLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredConstantQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment preferredConstantQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_preferredConstantQIndex, index), LAYOUT_preferredConstantQIndex); }
    /// {@return `preferredConstantQIndex`}
    public MemorySegment preferredConstantQIndex() { return preferredConstantQIndex(this.segment(), 0L); }
    /// Sets `preferredConstantQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredConstantQIndex(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_preferredConstantQIndex, index), LAYOUT_preferredConstantQIndex.byteSize()); }
    /// Sets `preferredConstantQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex(MemorySegment value) { preferredConstantQIndex(this.segment(), 0L, value); return this; }
    /// Accepts `preferredConstantQIndex` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex(Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(preferredConstantQIndex())); return this; }

    /// {@return `preferredMaxSingleReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxSingleReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxSingleReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxSingleReferenceCount`}
    public int preferredMaxSingleReferenceCount() { return preferredMaxSingleReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxSingleReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxSingleReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCount(int value) { preferredMaxSingleReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredSingleReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredSingleReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredSingleReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `preferredSingleReferenceNameMask`}
    public int preferredSingleReferenceNameMask() { return preferredSingleReferenceNameMask(this.segment(), 0L); }
    /// Sets `preferredSingleReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredSingleReferenceNameMask(MemorySegment segment, long index, int value) { VH_preferredSingleReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `preferredSingleReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMask(int value) { preferredSingleReferenceNameMask(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxUnidirectionalCompoundReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount`}
    public int preferredMaxUnidirectionalCompoundReferenceCount() { return preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxUnidirectionalCompoundReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCount(int value) { preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount`}
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCount(int value) { preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredUnidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredUnidirectionalCompoundReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `preferredUnidirectionalCompoundReferenceNameMask`}
    public int preferredUnidirectionalCompoundReferenceNameMask() { return preferredUnidirectionalCompoundReferenceNameMask(this.segment(), 0L); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, int value) { VH_preferredUnidirectionalCompoundReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMask(int value) { preferredUnidirectionalCompoundReferenceNameMask(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundReferenceCount`}
    public int preferredMaxBidirectionalCompoundReferenceCount() { return preferredMaxBidirectionalCompoundReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxBidirectionalCompoundReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCount(int value) { preferredMaxBidirectionalCompoundReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount`}
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCount(int value) { preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount`}
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCount(int value) { preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredBidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredBidirectionalCompoundReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `preferredBidirectionalCompoundReferenceNameMask`}
    public int preferredBidirectionalCompoundReferenceNameMask() { return preferredBidirectionalCompoundReferenceNameMask(this.segment(), 0L); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, int value) { VH_preferredBidirectionalCompoundReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMask(int value) { preferredBidirectionalCompoundReferenceNameMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1QualityLevelPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR at(long index, Consumer<VkVideoEncodeAV1QualityLevelPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param index the index of the struct buffer
    public int preferredRateControlFlagsAt(long index) { return preferredRateControlFlags(this.segment(), index); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, int value) { preferredRateControlFlags(this.segment(), index, value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredGopFrameCountAt(long index) { return preferredGopFrameCount(this.segment(), index); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, int value) { preferredGopFrameCount(this.segment(), index, value); return this; }

    /// {@return `preferredKeyFramePeriod` at the given index}
    /// @param index the index of the struct buffer
    public int preferredKeyFramePeriodAt(long index) { return preferredKeyFramePeriod(this.segment(), index); }
    /// Sets `preferredKeyFramePeriod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriodAt(long index, int value) { preferredKeyFramePeriod(this.segment(), index, value); return this; }

    /// {@return `preferredConsecutiveBipredictiveFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredConsecutiveBipredictiveFrameCountAt(long index) { return preferredConsecutiveBipredictiveFrameCount(this.segment(), index); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCountAt(long index, int value) { preferredConsecutiveBipredictiveFrameCount(this.segment(), index, value); return this; }

    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredTemporalLayerCountAt(long index) { return preferredTemporalLayerCount(this.segment(), index); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCountAt(long index, int value) { preferredTemporalLayerCount(this.segment(), index, value); return this; }

    /// {@return `preferredConstantQIndex` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment preferredConstantQIndexAt(long index) { return preferredConstantQIndex(this.segment(), index); }
    /// Sets `preferredConstantQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndexAt(long index, MemorySegment value) { preferredConstantQIndex(this.segment(), index, value); return this; }
    /// Accepts `preferredConstantQIndex` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndexAt(long index, Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(preferredConstantQIndexAt(index))); return this; }

    /// {@return `preferredMaxSingleReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxSingleReferenceCountAt(long index) { return preferredMaxSingleReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCountAt(long index, int value) { preferredMaxSingleReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredSingleReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int preferredSingleReferenceNameMaskAt(long index) { return preferredSingleReferenceNameMask(this.segment(), index); }
    /// Sets `preferredSingleReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMaskAt(long index, int value) { preferredSingleReferenceNameMask(this.segment(), index, value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxUnidirectionalCompoundReferenceCountAt(long index) { return preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCountAt(long index, int value) { preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredUnidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int preferredUnidirectionalCompoundReferenceNameMaskAt(long index) { return preferredUnidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMaskAt(long index, int value) { preferredUnidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxBidirectionalCompoundReferenceCountAt(long index) { return preferredMaxBidirectionalCompoundReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCountAt(long index, int value) { preferredMaxBidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index, int value) { preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredBidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int preferredBidirectionalCompoundReferenceNameMaskAt(long index) { return preferredBidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMaskAt(long index, int value) { preferredBidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

}
