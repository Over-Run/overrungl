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

/// Represents `VkVideoEncodeQuantizationMapInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQuantizationMapInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView quantizationMap;
///     (struct VkExtent2D) VkExtent2D quantizationMapExtent;
/// };
/// ```
public final class VkVideoEncodeQuantizationMapInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeQuantizationMapInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("quantizationMap"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapExtent")
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
    /// The byte offset of `quantizationMap`.
    public static final long OFFSET_quantizationMap = LAYOUT.byteOffset(PathElement.groupElement("quantizationMap"));
    /// The memory layout of `quantizationMap`.
    public static final MemoryLayout LAYOUT_quantizationMap = LAYOUT.select(PathElement.groupElement("quantizationMap"));
    /// The [VarHandle] of `quantizationMap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_quantizationMap = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMap")));
    /// The byte offset of `quantizationMapExtent`.
    public static final long OFFSET_quantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapExtent"));
    /// The memory layout of `quantizationMapExtent`.
    public static final MemoryLayout LAYOUT_quantizationMapExtent = LAYOUT.select(PathElement.groupElement("quantizationMapExtent"));

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeQuantizationMapInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR copyFrom(VkVideoEncodeQuantizationMapInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeQuantizationMapInfoKHR reinterpret(long count) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeQuantizationMapInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeQuantizationMapInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `quantizationMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long quantizationMap(MemorySegment segment, long index) { return (long) VH_quantizationMap.get().get(segment, 0L, index); }
    /// {@return `quantizationMap`}
    public long quantizationMap() { return quantizationMap(this.segment(), 0L); }
    /// Sets `quantizationMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quantizationMap(MemorySegment segment, long index, long value) { VH_quantizationMap.get().set(segment, 0L, index, value); }
    /// Sets `quantizationMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(long value) { quantizationMap(this.segment(), 0L, value); return this; }

    /// {@return `quantizationMapExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment quantizationMapExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapExtent, index), LAYOUT_quantizationMapExtent); }
    /// {@return `quantizationMapExtent`}
    public MemorySegment quantizationMapExtent() { return quantizationMapExtent(this.segment(), 0L); }
    /// Sets `quantizationMapExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quantizationMapExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapExtent, index), LAYOUT_quantizationMapExtent.byteSize()); }
    /// Sets `quantizationMapExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(MemorySegment value) { quantizationMapExtent(this.segment(), 0L, value); return this; }
    /// Accepts `quantizationMapExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(quantizationMapExtent())); return this; }

    /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
    public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
    public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeQuantizationMapInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR at(long index, Consumer<VkVideoEncodeQuantizationMapInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `quantizationMap` at the given index}
    /// @param index the index of the struct buffer
    public long quantizationMapAt(long index) { return quantizationMap(this.segment(), index); }
    /// Sets `quantizationMap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapAt(long index, long value) { quantizationMap(this.segment(), index, value); return this; }

    /// {@return `quantizationMapExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment quantizationMapExtentAt(long index) { return quantizationMapExtent(this.segment(), index); }
    /// Sets `quantizationMapExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtentAt(long index, MemorySegment value) { quantizationMapExtent(this.segment(), index, value); return this; }
    /// Accepts `quantizationMapExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(quantizationMapExtentAt(index))); return this; }

}
