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

/// Represents `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 shadingRateImageEnable;
///     uint32_t viewportCount;
///     const VkShadingRatePaletteNV* pShadingRatePalettes;
/// };
/// ```
public final class VkPipelineViewportShadingRateImageStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePalettes")
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
    /// The byte offset of `shadingRateImageEnable`.
    public static final long OFFSET_shadingRateImageEnable = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImageEnable"));
    /// The memory layout of `shadingRateImageEnable`.
    public static final MemoryLayout LAYOUT_shadingRateImageEnable = LAYOUT.select(PathElement.groupElement("shadingRateImageEnable"));
    /// The [VarHandle] of `shadingRateImageEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRateImageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImageEnable"));
    /// The byte offset of `viewportCount`.
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    /// The memory layout of `viewportCount`.
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The byte offset of `pShadingRatePalettes`.
    public static final long OFFSET_pShadingRatePalettes = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePalettes"));
    /// The memory layout of `pShadingRatePalettes`.
    public static final MemoryLayout LAYOUT_pShadingRatePalettes = LAYOUT.select(PathElement.groupElement("pShadingRatePalettes"));
    /// The [VarHandle] of `pShadingRatePalettes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShadingRatePalettes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePalettes"));

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportShadingRateImageStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public static VkPipelineViewportShadingRateImageStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV copyFrom(VkPipelineViewportShadingRateImageStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportShadingRateImageStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateImageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateImageEnable(MemorySegment segment, long index) { return (int) VH_shadingRateImageEnable.get(segment, 0L, index); }
    /// {@return `shadingRateImageEnable`}
    public int shadingRateImageEnable() { return shadingRateImageEnable(this.segment(), 0L); }
    /// Sets `shadingRateImageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateImageEnable(MemorySegment segment, long index, int value) { VH_shadingRateImageEnable.set(segment, 0L, index, value); }
    /// Sets `shadingRateImageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(int value) { shadingRateImageEnable(this.segment(), 0L, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    public int viewportCount() { return viewportCount(this.segment(), 0L); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportCount(MemorySegment segment, long index, int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(int value) { viewportCount(this.segment(), 0L, value); return this; }

    /// {@return `pShadingRatePalettes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShadingRatePalettes(MemorySegment segment, long index) { return (MemorySegment) VH_pShadingRatePalettes.get(segment, 0L, index); }
    /// {@return `pShadingRatePalettes`}
    public MemorySegment pShadingRatePalettes() { return pShadingRatePalettes(this.segment(), 0L); }
    /// Sets `pShadingRatePalettes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShadingRatePalettes(MemorySegment segment, long index, MemorySegment value) { VH_pShadingRatePalettes.set(segment, 0L, index, value); }
    /// Sets `pShadingRatePalettes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(MemorySegment value) { pShadingRatePalettes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportShadingRateImageStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportShadingRateImageStateCreateInfoNV`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportShadingRateImageStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportShadingRateImageStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV at(long index, Consumer<VkPipelineViewportShadingRateImageStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shadingRateImageEnable` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateImageEnableAt(long index) { return shadingRateImageEnable(this.segment(), index); }
    /// Sets `shadingRateImageEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnableAt(long index, int value) { shadingRateImageEnable(this.segment(), index, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param index the index of the struct buffer
    public int viewportCountAt(long index) { return viewportCount(this.segment(), index); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCountAt(long index, int value) { viewportCount(this.segment(), index, value); return this; }

    /// {@return `pShadingRatePalettes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pShadingRatePalettesAt(long index) { return pShadingRatePalettes(this.segment(), index); }
    /// Sets `pShadingRatePalettes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettesAt(long index, MemorySegment value) { pShadingRatePalettes(this.segment(), index, value); return this; }

}
