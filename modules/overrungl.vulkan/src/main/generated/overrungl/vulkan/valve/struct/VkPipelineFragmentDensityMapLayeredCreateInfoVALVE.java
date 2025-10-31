// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentDensityMapLayeredCreateInfoVALVE {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t maxFragmentDensityMapLayers;
/// };
/// ```
public final class VkPipelineFragmentDensityMapLayeredCreateInfoVALVE extends GroupType {
    /// The struct layout of `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentDensityMapLayers")
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
    /// The byte offset of `maxFragmentDensityMapLayers`.
    public static final long OFFSET_maxFragmentDensityMapLayers = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityMapLayers"));
    /// The memory layout of `maxFragmentDensityMapLayers`.
    public static final MemoryLayout LAYOUT_maxFragmentDensityMapLayers = LAYOUT.select(PathElement.groupElement("maxFragmentDensityMapLayers"));
    /// The [VarHandle] of `maxFragmentDensityMapLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentDensityMapLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDensityMapLayers"));

    /// Creates `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE alloc(SegmentAllocator allocator) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE copyFrom(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE reinterpret(long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentDensityMapLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentDensityMapLayers(MemorySegment segment, long index) { return (int) VH_maxFragmentDensityMapLayers.get(segment, 0L, index); }
    /// {@return `maxFragmentDensityMapLayers`}
    public int maxFragmentDensityMapLayers() { return maxFragmentDensityMapLayers(this.segment(), 0L); }
    /// Sets `maxFragmentDensityMapLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentDensityMapLayers(MemorySegment segment, long index, int value) { VH_maxFragmentDensityMapLayers.set(segment, 0L, index, value); }
    /// Sets `maxFragmentDensityMapLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayers(int value) { maxFragmentDensityMapLayers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE asSlice(long index) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE asSlice(long index, long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE at(long index, Consumer<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxFragmentDensityMapLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentDensityMapLayersAt(long index) { return maxFragmentDensityMapLayers(this.segment(), index); }
    /// Sets `maxFragmentDensityMapLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayersAt(long index, int value) { maxFragmentDensityMapLayers(this.segment(), index, value); return this; }

}
