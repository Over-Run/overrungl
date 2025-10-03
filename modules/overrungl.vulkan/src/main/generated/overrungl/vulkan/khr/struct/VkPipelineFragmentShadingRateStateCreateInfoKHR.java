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

/// Represents `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkExtent2D) VkExtent2D fragmentSize;
///     (int) VkFragmentShadingRateCombinerOpKHR combinerOps[2];
/// };
/// ```
public final class VkPipelineFragmentShadingRateStateCreateInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
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
    /// The byte offset of `fragmentSize`.
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    /// The memory layout of `fragmentSize`.
    public static final MemoryLayout LAYOUT_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));
    /// The byte offset of `combinerOps`.
    public static final long OFFSET_combinerOps = LAYOUT.byteOffset(PathElement.groupElement("combinerOps"));
    /// The memory layout of `combinerOps`.
    public static final MemoryLayout LAYOUT_combinerOps = LAYOUT.select(PathElement.groupElement("combinerOps"));
    /// The [VarHandle] of `combinerOps` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_combinerOps = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"), PathElement.sequenceElement()));

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR copyFrom(VkPipelineFragmentShadingRateStateCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineFragmentShadingRateStateCreateInfoKHR reinterpret(long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize); }
    /// {@return `fragmentSize`}
    public MemorySegment fragmentSize() { return fragmentSize(this.segment(), 0L); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize.byteSize()); }
    /// Sets `fragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(MemorySegment value) { fragmentSize(this.segment(), 0L, value); return this; }
    /// Accepts `fragmentSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(fragmentSize())); return this; }

    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment combinerOps(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_combinerOps, index), LAYOUT_combinerOps); }
    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int combinerOps(MemorySegment segment, long index, long index0) { return (int) VH_combinerOps.get().get(segment, 0L, index, index0); }
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
    public static void combinerOps(MemorySegment segment, long index, long index0, int value) { VH_combinerOps.get().set(segment, 0L, index, index0, value); }
    /// Sets `combinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(MemorySegment value) { combinerOps(this.segment(), 0L, value); return this; }
    /// Sets `combinerOps` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(long index0, int value) { combinerOps(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR asSlice(long index) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR asSlice(long index, long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineFragmentShadingRateStateCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR at(long index, Consumer<VkPipelineFragmentShadingRateStateCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment fragmentSizeAt(long index) { return fragmentSize(this.segment(), index); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSizeAt(long index, MemorySegment value) { fragmentSize(this.segment(), index, value); return this; }
    /// Accepts `fragmentSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(fragmentSizeAt(index))); return this; }

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
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOpsAt(long index, MemorySegment value) { combinerOps(this.segment(), index, value); return this; }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOpsAt(long index, long index0, int value) { combinerOps(this.segment(), index, index0, value); return this; }

}
