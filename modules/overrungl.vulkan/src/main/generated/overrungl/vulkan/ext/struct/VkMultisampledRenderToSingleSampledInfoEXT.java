// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultisampledRenderToSingleSampledInfoEXT`.
/// ## Layout
/// ```
/// struct VkMultisampledRenderToSingleSampledInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 multisampledRenderToSingleSampledEnable;
///     (int) VkSampleCountFlagBits rasterizationSamples;
/// };
/// ```
public final class VkMultisampledRenderToSingleSampledInfoEXT extends GroupType {
    /// The struct layout of `VkMultisampledRenderToSingleSampledInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampledEnable"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples")
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
    /// The byte offset of `multisampledRenderToSingleSampledEnable`.
    public static final long OFFSET_multisampledRenderToSingleSampledEnable = LAYOUT.byteOffset(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    /// The memory layout of `multisampledRenderToSingleSampledEnable`.
    public static final MemoryLayout LAYOUT_multisampledRenderToSingleSampledEnable = LAYOUT.select(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    /// The [VarHandle] of `multisampledRenderToSingleSampledEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multisampledRenderToSingleSampledEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    /// The byte offset of `rasterizationSamples`.
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    /// The memory layout of `rasterizationSamples`.
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisampledRenderToSingleSampledInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisampledRenderToSingleSampledInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisampledRenderToSingleSampledInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultisampledRenderToSingleSampledInfoEXT`
    public static VkMultisampledRenderToSingleSampledInfoEXT alloc(SegmentAllocator allocator) { return new VkMultisampledRenderToSingleSampledInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultisampledRenderToSingleSampledInfoEXT`
    public static VkMultisampledRenderToSingleSampledInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT copyFrom(VkMultisampledRenderToSingleSampledInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMultisampledRenderToSingleSampledInfoEXT reinterpret(long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMultisampledRenderToSingleSampledInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMultisampledRenderToSingleSampledInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `multisampledRenderToSingleSampledEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multisampledRenderToSingleSampledEnable(MemorySegment segment, long index) { return (int) VH_multisampledRenderToSingleSampledEnable.get(segment, 0L, index); }
    /// {@return `multisampledRenderToSingleSampledEnable`}
    public int multisampledRenderToSingleSampledEnable() { return multisampledRenderToSingleSampledEnable(this.segment(), 0L); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multisampledRenderToSingleSampledEnable(MemorySegment segment, long index, int value) { VH_multisampledRenderToSingleSampledEnable.set(segment, 0L, index, value); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(int value) { multisampledRenderToSingleSampledEnable(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    public int rasterizationSamples() { return rasterizationSamples(this.segment(), 0L); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationSamples(MemorySegment segment, long index, int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(int value) { rasterizationSamples(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMultisampledRenderToSingleSampledInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMultisampledRenderToSingleSampledInfoEXT`
    public VkMultisampledRenderToSingleSampledInfoEXT asSlice(long index) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMultisampledRenderToSingleSampledInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMultisampledRenderToSingleSampledInfoEXT`
    public VkMultisampledRenderToSingleSampledInfoEXT asSlice(long index, long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMultisampledRenderToSingleSampledInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT at(long index, Consumer<VkMultisampledRenderToSingleSampledInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `multisampledRenderToSingleSampledEnable` at the given index}
    /// @param index the index of the struct buffer
    public int multisampledRenderToSingleSampledEnableAt(long index) { return multisampledRenderToSingleSampledEnable(this.segment(), index); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnableAt(long index, int value) { multisampledRenderToSingleSampledEnable(this.segment(), index, value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param index the index of the struct buffer
    public int rasterizationSamplesAt(long index) { return rasterizationSamples(this.segment(), index); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamplesAt(long index, int value) { rasterizationSamples(this.segment(), index, value); return this; }

}
