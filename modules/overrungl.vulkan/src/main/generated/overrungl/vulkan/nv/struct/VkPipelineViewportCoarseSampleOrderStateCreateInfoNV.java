// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkCoarseSampleOrderTypeNV sampleOrderType;
///     uint32_t customSampleOrderCount;
///     const VkCoarseSampleOrderCustomNV* pCustomSampleOrders;
/// };
/// ```
public final class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleOrderType"),
        ValueLayout.JAVA_INT.withName("customSampleOrderCount"),
        ValueLayout.ADDRESS.withName("pCustomSampleOrders")
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
    /// The byte offset of `sampleOrderType`.
    public static final long OFFSET_sampleOrderType = LAYOUT.byteOffset(PathElement.groupElement("sampleOrderType"));
    /// The memory layout of `sampleOrderType`.
    public static final MemoryLayout LAYOUT_sampleOrderType = LAYOUT.select(PathElement.groupElement("sampleOrderType"));
    /// The [VarHandle] of `sampleOrderType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleOrderType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleOrderType"));
    /// The byte offset of `customSampleOrderCount`.
    public static final long OFFSET_customSampleOrderCount = LAYOUT.byteOffset(PathElement.groupElement("customSampleOrderCount"));
    /// The memory layout of `customSampleOrderCount`.
    public static final MemoryLayout LAYOUT_customSampleOrderCount = LAYOUT.select(PathElement.groupElement("customSampleOrderCount"));
    /// The [VarHandle] of `customSampleOrderCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_customSampleOrderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customSampleOrderCount"));
    /// The byte offset of `pCustomSampleOrders`.
    public static final long OFFSET_pCustomSampleOrders = LAYOUT.byteOffset(PathElement.groupElement("pCustomSampleOrders"));
    /// The memory layout of `pCustomSampleOrders`.
    public static final MemoryLayout LAYOUT_pCustomSampleOrders = LAYOUT.select(PathElement.groupElement("pCustomSampleOrders"));
    /// The [VarHandle] of `pCustomSampleOrders` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCustomSampleOrders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCustomSampleOrders"));

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV copyFrom(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampleOrderType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleOrderType(MemorySegment segment, long index) { return (int) VH_sampleOrderType.get(segment, 0L, index); }
    /// {@return `sampleOrderType`}
    public int sampleOrderType() { return sampleOrderType(this.segment(), 0L); }
    /// Sets `sampleOrderType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleOrderType(MemorySegment segment, long index, int value) { VH_sampleOrderType.set(segment, 0L, index, value); }
    /// Sets `sampleOrderType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(int value) { sampleOrderType(this.segment(), 0L, value); return this; }

    /// {@return `customSampleOrderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int customSampleOrderCount(MemorySegment segment, long index) { return (int) VH_customSampleOrderCount.get(segment, 0L, index); }
    /// {@return `customSampleOrderCount`}
    public int customSampleOrderCount() { return customSampleOrderCount(this.segment(), 0L); }
    /// Sets `customSampleOrderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void customSampleOrderCount(MemorySegment segment, long index, int value) { VH_customSampleOrderCount.set(segment, 0L, index, value); }
    /// Sets `customSampleOrderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCount(int value) { customSampleOrderCount(this.segment(), 0L, value); return this; }

    /// {@return `pCustomSampleOrders` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCustomSampleOrders(MemorySegment segment, long index) { return (MemorySegment) VH_pCustomSampleOrders.get(segment, 0L, index); }
    /// {@return `pCustomSampleOrders`}
    public MemorySegment pCustomSampleOrders() { return pCustomSampleOrders(this.segment(), 0L); }
    /// Sets `pCustomSampleOrders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCustomSampleOrders(MemorySegment segment, long index, MemorySegment value) { VH_pCustomSampleOrders.set(segment, 0L, index, value); }
    /// Sets `pCustomSampleOrders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(MemorySegment value) { pCustomSampleOrders(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV at(long index, Consumer<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampleOrderType` at the given index}
    /// @param index the index of the struct buffer
    public int sampleOrderTypeAt(long index) { return sampleOrderType(this.segment(), index); }
    /// Sets `sampleOrderType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderTypeAt(long index, int value) { sampleOrderType(this.segment(), index, value); return this; }

    /// {@return `customSampleOrderCount` at the given index}
    /// @param index the index of the struct buffer
    public int customSampleOrderCountAt(long index) { return customSampleOrderCount(this.segment(), index); }
    /// Sets `customSampleOrderCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCountAt(long index, int value) { customSampleOrderCount(this.segment(), index, value); return this; }

    /// {@return `pCustomSampleOrders` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCustomSampleOrdersAt(long index) { return pCustomSampleOrders(this.segment(), index); }
    /// Sets `pCustomSampleOrders` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrdersAt(long index, MemorySegment value) { pCustomSampleOrders(this.segment(), index, value); return this; }

}
