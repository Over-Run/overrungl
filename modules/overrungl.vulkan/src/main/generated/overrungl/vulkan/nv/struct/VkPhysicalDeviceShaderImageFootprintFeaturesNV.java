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

/// Represents `VkPhysicalDeviceShaderImageFootprintFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderImageFootprintFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 imageFootprint;
/// };
/// ```
public final class VkPhysicalDeviceShaderImageFootprintFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderImageFootprintFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageFootprint")
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
    /// The byte offset of `imageFootprint`.
    public static final long OFFSET_imageFootprint = LAYOUT.byteOffset(PathElement.groupElement("imageFootprint"));
    /// The memory layout of `imageFootprint`.
    public static final MemoryLayout LAYOUT_imageFootprint = LAYOUT.select(PathElement.groupElement("imageFootprint"));
    /// The [VarHandle] of `imageFootprint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageFootprint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFootprint"));

    /// Creates `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderImageFootprintFeaturesNV`
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderImageFootprintFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderImageFootprintFeaturesNV`
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV copyFrom(VkPhysicalDeviceShaderImageFootprintFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageFootprint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageFootprint(MemorySegment segment, long index) { return (int) VH_imageFootprint.get(segment, 0L, index); }
    /// {@return `imageFootprint`}
    public int imageFootprint() { return imageFootprint(this.segment(), 0L); }
    /// Sets `imageFootprint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageFootprint(MemorySegment segment, long index, int value) { VH_imageFootprint.set(segment, 0L, index, value); }
    /// Sets `imageFootprint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprint(int value) { imageFootprint(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderImageFootprintFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderImageFootprintFeaturesNV`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderImageFootprintFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderImageFootprintFeaturesNV`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderImageFootprintFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV at(long index, Consumer<VkPhysicalDeviceShaderImageFootprintFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageFootprint` at the given index}
    /// @param index the index of the struct buffer
    public int imageFootprintAt(long index) { return imageFootprint(this.segment(), index); }
    /// Sets `imageFootprint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprintAt(long index, int value) { imageFootprint(this.segment(), index, value); return this; }

}
