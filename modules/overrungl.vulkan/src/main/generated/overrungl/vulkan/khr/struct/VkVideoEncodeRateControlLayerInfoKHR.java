// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeRateControlLayerInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeRateControlLayerInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t averageBitrate;
///     uint64_t maxBitrate;
///     uint32_t frameRateNumerator;
///     uint32_t frameRateDenominator;
/// };
/// ```
public final class VkVideoEncodeRateControlLayerInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeRateControlLayerInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("averageBitrate"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("frameRateNumerator"),
        ValueLayout.JAVA_INT.withName("frameRateDenominator")
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
    /// The byte offset of `averageBitrate`.
    public static final long OFFSET_averageBitrate = LAYOUT.byteOffset(PathElement.groupElement("averageBitrate"));
    /// The memory layout of `averageBitrate`.
    public static final MemoryLayout LAYOUT_averageBitrate = LAYOUT.select(PathElement.groupElement("averageBitrate"));
    /// The [VarHandle] of `averageBitrate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_averageBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("averageBitrate"));
    /// The byte offset of `maxBitrate`.
    public static final long OFFSET_maxBitrate = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
    /// The memory layout of `maxBitrate`.
    public static final MemoryLayout LAYOUT_maxBitrate = LAYOUT.select(PathElement.groupElement("maxBitrate"));
    /// The [VarHandle] of `maxBitrate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    /// The byte offset of `frameRateNumerator`.
    public static final long OFFSET_frameRateNumerator = LAYOUT.byteOffset(PathElement.groupElement("frameRateNumerator"));
    /// The memory layout of `frameRateNumerator`.
    public static final MemoryLayout LAYOUT_frameRateNumerator = LAYOUT.select(PathElement.groupElement("frameRateNumerator"));
    /// The [VarHandle] of `frameRateNumerator` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameRateNumerator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateNumerator"));
    /// The byte offset of `frameRateDenominator`.
    public static final long OFFSET_frameRateDenominator = LAYOUT.byteOffset(PathElement.groupElement("frameRateDenominator"));
    /// The memory layout of `frameRateDenominator`.
    public static final MemoryLayout LAYOUT_frameRateDenominator = LAYOUT.select(PathElement.groupElement("frameRateDenominator"));
    /// The [VarHandle] of `frameRateDenominator` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameRateDenominator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateDenominator"));

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeRateControlLayerInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlLayerInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeRateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRateControlLayerInfoKHR`
    public static VkVideoEncodeRateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlLayerInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeRateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeRateControlLayerInfoKHR`
    public static VkVideoEncodeRateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRateControlLayerInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR copyFrom(VkVideoEncodeRateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeRateControlLayerInfoKHR reinterpret(long count) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeRateControlLayerInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeRateControlLayerInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `averageBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long averageBitrate(MemorySegment segment, long index) { return (long) VH_averageBitrate.get(segment, 0L, index); }
    /// {@return `averageBitrate`}
    public long averageBitrate() { return averageBitrate(this.segment(), 0L); }
    /// Sets `averageBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void averageBitrate(MemorySegment segment, long index, long value) { VH_averageBitrate.set(segment, 0L, index, value); }
    /// Sets `averageBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(long value) { averageBitrate(this.segment(), 0L, value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBitrate(MemorySegment segment, long index) { return (long) VH_maxBitrate.get(segment, 0L, index); }
    /// {@return `maxBitrate`}
    public long maxBitrate() { return maxBitrate(this.segment(), 0L); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBitrate(MemorySegment segment, long index, long value) { VH_maxBitrate.set(segment, 0L, index, value); }
    /// Sets `maxBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(long value) { maxBitrate(this.segment(), 0L, value); return this; }

    /// {@return `frameRateNumerator` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameRateNumerator(MemorySegment segment, long index) { return (int) VH_frameRateNumerator.get(segment, 0L, index); }
    /// {@return `frameRateNumerator`}
    public int frameRateNumerator() { return frameRateNumerator(this.segment(), 0L); }
    /// Sets `frameRateNumerator` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameRateNumerator(MemorySegment segment, long index, int value) { VH_frameRateNumerator.set(segment, 0L, index, value); }
    /// Sets `frameRateNumerator` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(int value) { frameRateNumerator(this.segment(), 0L, value); return this; }

    /// {@return `frameRateDenominator` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameRateDenominator(MemorySegment segment, long index) { return (int) VH_frameRateDenominator.get(segment, 0L, index); }
    /// {@return `frameRateDenominator`}
    public int frameRateDenominator() { return frameRateDenominator(this.segment(), 0L); }
    /// Sets `frameRateDenominator` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameRateDenominator(MemorySegment segment, long index, int value) { VH_frameRateDenominator.set(segment, 0L, index, value); }
    /// Sets `frameRateDenominator` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(int value) { frameRateDenominator(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeRateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeRateControlLayerInfoKHR`
    public VkVideoEncodeRateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeRateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeRateControlLayerInfoKHR`
    public VkVideoEncodeRateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeRateControlLayerInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR at(long index, Consumer<VkVideoEncodeRateControlLayerInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `averageBitrate` at the given index}
    /// @param index the index of the struct buffer
    public long averageBitrateAt(long index) { return averageBitrate(this.segment(), index); }
    /// Sets `averageBitrate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrateAt(long index, long value) { averageBitrate(this.segment(), index, value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param index the index of the struct buffer
    public long maxBitrateAt(long index) { return maxBitrate(this.segment(), index); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrateAt(long index, long value) { maxBitrate(this.segment(), index, value); return this; }

    /// {@return `frameRateNumerator` at the given index}
    /// @param index the index of the struct buffer
    public int frameRateNumeratorAt(long index) { return frameRateNumerator(this.segment(), index); }
    /// Sets `frameRateNumerator` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumeratorAt(long index, int value) { frameRateNumerator(this.segment(), index, value); return this; }

    /// {@return `frameRateDenominator` at the given index}
    /// @param index the index of the struct buffer
    public int frameRateDenominatorAt(long index) { return frameRateDenominator(this.segment(), index); }
    /// Sets `frameRateDenominator` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominatorAt(long index, int value) { frameRateDenominator(this.segment(), index, value); return this; }

}
