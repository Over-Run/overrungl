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

/// Represents `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkFragmentShadingRateTypeNV shadingRateType;
///     (int) VkFragmentShadingRateNV shadingRate;
///     (int) VkFragmentShadingRateCombinerOpKHR combinerOps[2];
/// };
/// ```
public final class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
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
    /// The byte offset of `shadingRateType`.
    public static final long OFFSET_shadingRateType = LAYOUT.byteOffset(PathElement.groupElement("shadingRateType"));
    /// The memory layout of `shadingRateType`.
    public static final MemoryLayout LAYOUT_shadingRateType = LAYOUT.select(PathElement.groupElement("shadingRateType"));
    /// The [VarHandle] of `shadingRateType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateType"));
    /// The byte offset of `shadingRate`.
    public static final long OFFSET_shadingRate = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
    /// The memory layout of `shadingRate`.
    public static final MemoryLayout LAYOUT_shadingRate = LAYOUT.select(PathElement.groupElement("shadingRate"));
    /// The [VarHandle] of `shadingRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    /// The byte offset of `combinerOps`.
    public static final long OFFSET_combinerOps = LAYOUT.byteOffset(PathElement.groupElement("combinerOps"));
    /// The memory layout of `combinerOps`.
    public static final MemoryLayout LAYOUT_combinerOps = LAYOUT.select(PathElement.groupElement("combinerOps"));
    /// The [VarHandle] of `combinerOps` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_combinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"), PathElement.sequenceElement());

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV copyFrom(VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV reinterpret(long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateType(MemorySegment segment, long index) { return (int) VH_shadingRateType.get(segment, 0L, index); }
    /// {@return `shadingRateType`}
    public int shadingRateType() { return shadingRateType(this.segment(), 0L); }
    /// Sets `shadingRateType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateType(MemorySegment segment, long index, int value) { VH_shadingRateType.set(segment, 0L, index, value); }
    /// Sets `shadingRateType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(int value) { shadingRateType(this.segment(), 0L, value); return this; }

    /// {@return `shadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRate(MemorySegment segment, long index) { return (int) VH_shadingRate.get(segment, 0L, index); }
    /// {@return `shadingRate`}
    public int shadingRate() { return shadingRate(this.segment(), 0L); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRate(MemorySegment segment, long index, int value) { VH_shadingRate.set(segment, 0L, index, value); }
    /// Sets `shadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(int value) { shadingRate(this.segment(), 0L, value); return this; }

    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment combinerOps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_combinerOps, index), LAYOUT_combinerOps); }
    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int combinerOps(MemorySegment segment, long index, long index0) { return (int) VH_combinerOps.get(segment, 0L, index, index0); }
    /// {@return `combinerOps`}
    public MemorySegment combinerOps() { return combinerOps(this.segment(), 0L); }
    /// {@return `combinerOps`}
    /// @param index0 the Index 0 of the array
    public int combinerOps(long index0) { return combinerOps(this.segment(), 0L, index0); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void combinerOps(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_combinerOps, index), LAYOUT_combinerOps.byteSize()); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void combinerOps(MemorySegment segment, long index, long index0, int value) { VH_combinerOps.set(segment, 0L, index, index0, value); }
    /// Sets `combinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(MemorySegment value) { combinerOps(this.segment(), 0L, value); return this; }
    /// Sets `combinerOps` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(long index0, int value) { combinerOps(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV asSlice(long index) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineFragmentShadingRateEnumStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV at(long index, Consumer<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shadingRateType` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateTypeAt(long index) { return shadingRateType(this.segment(), index); }
    /// Sets `shadingRateType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateTypeAt(long index, int value) { shadingRateType(this.segment(), index, value); return this; }

    /// {@return `shadingRate` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateAt(long index) { return shadingRate(this.segment(), index); }
    /// Sets `shadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateAt(long index, int value) { shadingRate(this.segment(), index, value); return this; }

    /// {@return `combinerOps` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment combinerOpsAt(long index) { return combinerOps(this.segment(), index); }
    /// {@return `combinerOps` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int combinerOpsAt(long index, long index0) { return combinerOps(this.segment(), index, index0); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOpsAt(long index, MemorySegment value) { combinerOps(this.segment(), index, value); return this; }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOpsAt(long index, long index0, int value) { combinerOps(this.segment(), index, index0, value); return this; }

}
