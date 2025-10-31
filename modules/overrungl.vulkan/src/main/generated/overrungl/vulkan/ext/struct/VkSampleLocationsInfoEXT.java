// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSampleLocationsInfoEXT`.
/// ## Layout
/// ```
/// struct VkSampleLocationsInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSampleCountFlagBits sampleLocationsPerPixel;
///     (struct VkExtent2D) VkExtent2D sampleLocationGridSize;
///     uint32_t sampleLocationsCount;
///     const VkSampleLocationEXT* pSampleLocations;
/// };
/// ```
public final class VkSampleLocationsInfoEXT extends GroupType {
    /// The struct layout of `VkSampleLocationsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
        ValueLayout.JAVA_INT.withName("sampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
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
    /// The byte offset of `sampleLocationsPerPixel`.
    public static final long OFFSET_sampleLocationsPerPixel = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsPerPixel"));
    /// The memory layout of `sampleLocationsPerPixel`.
    public static final MemoryLayout LAYOUT_sampleLocationsPerPixel = LAYOUT.select(PathElement.groupElement("sampleLocationsPerPixel"));
    /// The [VarHandle] of `sampleLocationsPerPixel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsPerPixel"));
    /// The byte offset of `sampleLocationGridSize`.
    public static final long OFFSET_sampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationGridSize"));
    /// The memory layout of `sampleLocationGridSize`.
    public static final MemoryLayout LAYOUT_sampleLocationGridSize = LAYOUT.select(PathElement.groupElement("sampleLocationGridSize"));
    /// The byte offset of `sampleLocationsCount`.
    public static final long OFFSET_sampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsCount"));
    /// The memory layout of `sampleLocationsCount`.
    public static final MemoryLayout LAYOUT_sampleLocationsCount = LAYOUT.select(PathElement.groupElement("sampleLocationsCount"));
    /// The [VarHandle] of `sampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsCount"));
    /// The byte offset of `pSampleLocations`.
    public static final long OFFSET_pSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
    /// The memory layout of `pSampleLocations`.
    public static final MemoryLayout LAYOUT_pSampleLocations = LAYOUT.select(PathElement.groupElement("pSampleLocations"));
    /// The [VarHandle] of `pSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSampleLocationsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSampleLocationsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSampleLocationsInfoEXT`
    public static VkSampleLocationsInfoEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationsInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSampleLocationsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSampleLocationsInfoEXT`
    public static VkSampleLocationsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSampleLocationsInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSampleLocationsInfoEXT copyFrom(VkSampleLocationsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSampleLocationsInfoEXT reinterpret(long count) { return new VkSampleLocationsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSampleLocationsInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSampleLocationsInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationsPerPixel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationsPerPixel(MemorySegment segment, long index) { return (int) VH_sampleLocationsPerPixel.get(segment, 0L, index); }
    /// {@return `sampleLocationsPerPixel`}
    public int sampleLocationsPerPixel() { return sampleLocationsPerPixel(this.segment(), 0L); }
    /// Sets `sampleLocationsPerPixel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsPerPixel(MemorySegment segment, long index, int value) { VH_sampleLocationsPerPixel.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsPerPixel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(int value) { sampleLocationsPerPixel(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sampleLocationGridSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationGridSize, index), LAYOUT_sampleLocationGridSize); }
    /// {@return `sampleLocationGridSize`}
    public MemorySegment sampleLocationGridSize() { return sampleLocationGridSize(this.segment(), 0L); }
    /// Sets `sampleLocationGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationGridSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationGridSize, index), LAYOUT_sampleLocationGridSize.byteSize()); }
    /// Sets `sampleLocationGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationGridSize(MemorySegment value) { sampleLocationGridSize(this.segment(), 0L, value); return this; }
    /// Accepts `sampleLocationGridSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationGridSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(sampleLocationGridSize())); return this; }

    /// {@return `sampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationsCount(MemorySegment segment, long index) { return (int) VH_sampleLocationsCount.get(segment, 0L, index); }
    /// {@return `sampleLocationsCount`}
    public int sampleLocationsCount() { return sampleLocationsCount(this.segment(), 0L); }
    /// Sets `sampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsCount(MemorySegment segment, long index, int value) { VH_sampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsCount(int value) { sampleLocationsCount(this.segment(), 0L, value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSampleLocations(MemorySegment segment, long index) { return (MemorySegment) VH_pSampleLocations.get(segment, 0L, index); }
    /// {@return `pSampleLocations`}
    public MemorySegment pSampleLocations() { return pSampleLocations(this.segment(), 0L); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSampleLocations(MemorySegment segment, long index, MemorySegment value) { VH_pSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT pSampleLocations(MemorySegment value) { pSampleLocations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSampleLocationsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSampleLocationsInfoEXT`
    public VkSampleLocationsInfoEXT asSlice(long index) { return new VkSampleLocationsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSampleLocationsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSampleLocationsInfoEXT`
    public VkSampleLocationsInfoEXT asSlice(long index, long count) { return new VkSampleLocationsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSampleLocationsInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSampleLocationsInfoEXT at(long index, Consumer<VkSampleLocationsInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampleLocationsPerPixel` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationsPerPixelAt(long index) { return sampleLocationsPerPixel(this.segment(), index); }
    /// Sets `sampleLocationsPerPixel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsPerPixelAt(long index, int value) { sampleLocationsPerPixel(this.segment(), index, value); return this; }

    /// {@return `sampleLocationGridSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment sampleLocationGridSizeAt(long index) { return sampleLocationGridSize(this.segment(), index); }
    /// Sets `sampleLocationGridSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationGridSizeAt(long index, MemorySegment value) { sampleLocationGridSize(this.segment(), index, value); return this; }
    /// Accepts `sampleLocationGridSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationGridSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(sampleLocationGridSizeAt(index))); return this; }

    /// {@return `sampleLocationsCount` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationsCountAt(long index) { return sampleLocationsCount(this.segment(), index); }
    /// Sets `sampleLocationsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsCountAt(long index, int value) { sampleLocationsCount(this.segment(), index, value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSampleLocationsAt(long index) { return pSampleLocations(this.segment(), index); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT pSampleLocationsAt(long index, MemorySegment value) { pSampleLocations(this.segment(), index, value); return this; }

}
