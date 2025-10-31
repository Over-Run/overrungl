// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265QuantizationMapCapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     int32_t minQpDelta;
///     int32_t maxQpDelta;
/// };
/// ```
public final class VkVideoEncodeH265QuantizationMapCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQpDelta"),
        ValueLayout.JAVA_INT.withName("maxQpDelta")
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
    /// The byte offset of `minQpDelta`.
    public static final long OFFSET_minQpDelta = LAYOUT.byteOffset(PathElement.groupElement("minQpDelta"));
    /// The memory layout of `minQpDelta`.
    public static final MemoryLayout LAYOUT_minQpDelta = LAYOUT.select(PathElement.groupElement("minQpDelta"));
    /// The [VarHandle] of `minQpDelta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQpDelta"));
    /// The byte offset of `maxQpDelta`.
    public static final long OFFSET_maxQpDelta = LAYOUT.byteOffset(PathElement.groupElement("maxQpDelta"));
    /// The memory layout of `maxQpDelta`.
    public static final MemoryLayout LAYOUT_maxQpDelta = LAYOUT.select(PathElement.groupElement("maxQpDelta"));
    /// The [VarHandle] of `maxQpDelta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQpDelta"));

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeH265QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR copyFrom(VkVideoEncodeH265QuantizationMapCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minQpDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minQpDelta(MemorySegment segment, long index) { return (int) VH_minQpDelta.get(segment, 0L, index); }
    /// {@return `minQpDelta`}
    public int minQpDelta() { return minQpDelta(this.segment(), 0L); }
    /// Sets `minQpDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQpDelta(MemorySegment segment, long index, int value) { VH_minQpDelta.set(segment, 0L, index, value); }
    /// Sets `minQpDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR minQpDelta(int value) { minQpDelta(this.segment(), 0L, value); return this; }

    /// {@return `maxQpDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQpDelta(MemorySegment segment, long index) { return (int) VH_maxQpDelta.get(segment, 0L, index); }
    /// {@return `maxQpDelta`}
    public int maxQpDelta() { return maxQpDelta(this.segment(), 0L); }
    /// Sets `maxQpDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQpDelta(MemorySegment segment, long index, int value) { VH_maxQpDelta.set(segment, 0L, index, value); }
    /// Sets `maxQpDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR maxQpDelta(int value) { maxQpDelta(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265QuantizationMapCapabilitiesKHR`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265QuantizationMapCapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR at(long index, Consumer<VkVideoEncodeH265QuantizationMapCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minQpDelta` at the given index}
    /// @param index the index of the struct buffer
    public int minQpDeltaAt(long index) { return minQpDelta(this.segment(), index); }
    /// Sets `minQpDelta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR minQpDeltaAt(long index, int value) { minQpDelta(this.segment(), index, value); return this; }

    /// {@return `maxQpDelta` at the given index}
    /// @param index the index of the struct buffer
    public int maxQpDeltaAt(long index) { return maxQpDelta(this.segment(), index); }
    /// Sets `maxQpDelta` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QuantizationMapCapabilitiesKHR maxQpDeltaAt(long index, int value) { maxQpDelta(this.segment(), index, value); return this; }

}
