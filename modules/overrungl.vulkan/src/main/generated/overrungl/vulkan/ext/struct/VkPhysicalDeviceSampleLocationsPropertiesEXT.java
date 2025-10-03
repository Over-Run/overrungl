// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampleLocationSampleCounts;
///     (struct VkExtent2D) VkExtent2D maxSampleLocationGridSize;
///     float sampleLocationCoordinateRange[2];
///     uint32_t sampleLocationSubPixelBits;
///     (uint32_t) VkBool32 variableSampleLocations;
/// };
/// ```
public final class VkPhysicalDeviceSampleLocationsPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
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
    /// The byte offset of `sampleLocationSampleCounts`.
    public static final long OFFSET_sampleLocationSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSampleCounts"));
    /// The memory layout of `sampleLocationSampleCounts`.
    public static final MemoryLayout LAYOUT_sampleLocationSampleCounts = LAYOUT.select(PathElement.groupElement("sampleLocationSampleCounts"));
    /// The [VarHandle] of `sampleLocationSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSampleCounts"));
    /// The byte offset of `maxSampleLocationGridSize`.
    public static final long OFFSET_maxSampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
    /// The memory layout of `maxSampleLocationGridSize`.
    public static final MemoryLayout LAYOUT_maxSampleLocationGridSize = LAYOUT.select(PathElement.groupElement("maxSampleLocationGridSize"));
    /// The byte offset of `sampleLocationCoordinateRange`.
    public static final long OFFSET_sampleLocationCoordinateRange = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCoordinateRange"));
    /// The memory layout of `sampleLocationCoordinateRange`.
    public static final MemoryLayout LAYOUT_sampleLocationCoordinateRange = LAYOUT.select(PathElement.groupElement("sampleLocationCoordinateRange"));
    /// The [VarHandle] of `sampleLocationCoordinateRange` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_sampleLocationCoordinateRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationCoordinateRange"), PathElement.sequenceElement());
    /// The byte offset of `sampleLocationSubPixelBits`.
    public static final long OFFSET_sampleLocationSubPixelBits = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSubPixelBits"));
    /// The memory layout of `sampleLocationSubPixelBits`.
    public static final MemoryLayout LAYOUT_sampleLocationSubPixelBits = LAYOUT.select(PathElement.groupElement("sampleLocationSubPixelBits"));
    /// The [VarHandle] of `sampleLocationSubPixelBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleLocationSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationSubPixelBits"));
    /// The byte offset of `variableSampleLocations`.
    public static final long OFFSET_variableSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("variableSampleLocations"));
    /// The memory layout of `variableSampleLocations`.
    public static final MemoryLayout LAYOUT_variableSampleLocations = LAYOUT.select(PathElement.groupElement("variableSampleLocations"));
    /// The [VarHandle] of `variableSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variableSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableSampleLocations"));

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSampleLocationsPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT copyFrom(VkPhysicalDeviceSampleLocationsPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSampleLocationsPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationSampleCounts(MemorySegment segment, long index) { return (int) VH_sampleLocationSampleCounts.get(segment, 0L, index); }
    /// {@return `sampleLocationSampleCounts`}
    public int sampleLocationSampleCounts() { return sampleLocationSampleCounts(this.segment(), 0L); }
    /// Sets `sampleLocationSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationSampleCounts(MemorySegment segment, long index, int value) { VH_sampleLocationSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleLocationSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCounts(int value) { sampleLocationSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxSampleLocationGridSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), LAYOUT_maxSampleLocationGridSize); }
    /// {@return `maxSampleLocationGridSize`}
    public MemorySegment maxSampleLocationGridSize() { return maxSampleLocationGridSize(this.segment(), 0L); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSampleLocationGridSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), LAYOUT_maxSampleLocationGridSize.byteSize()); }
    /// Sets `maxSampleLocationGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize(MemorySegment value) { maxSampleLocationGridSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxSampleLocationGridSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxSampleLocationGridSize())); return this; }

    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sampleLocationCoordinateRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationCoordinateRange, index), LAYOUT_sampleLocationCoordinateRange); }
    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float sampleLocationCoordinateRange(MemorySegment segment, long index, long index0) { return (float) VH_sampleLocationCoordinateRange.get(segment, 0L, index, index0); }
    /// {@return `sampleLocationCoordinateRange`}
    public MemorySegment sampleLocationCoordinateRange() { return sampleLocationCoordinateRange(this.segment(), 0L); }
    /// {@return `sampleLocationCoordinateRange`}
    /// @param index0 the Index 0 of the array
    public float sampleLocationCoordinateRange(long index0) { return sampleLocationCoordinateRange(this.segment(), 0L, index0); }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationCoordinateRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationCoordinateRange, index), LAYOUT_sampleLocationCoordinateRange.byteSize()); }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void sampleLocationCoordinateRange(MemorySegment segment, long index, long index0, float value) { VH_sampleLocationCoordinateRange.set(segment, 0L, index, index0, value); }
    /// Sets `sampleLocationCoordinateRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRange(MemorySegment value) { sampleLocationCoordinateRange(this.segment(), 0L, value); return this; }
    /// Sets `sampleLocationCoordinateRange` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRange(long index0, float value) { sampleLocationCoordinateRange(this.segment(), 0L, index0, value); return this; }

    /// {@return `sampleLocationSubPixelBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleLocationSubPixelBits(MemorySegment segment, long index) { return (int) VH_sampleLocationSubPixelBits.get(segment, 0L, index); }
    /// {@return `sampleLocationSubPixelBits`}
    public int sampleLocationSubPixelBits() { return sampleLocationSubPixelBits(this.segment(), 0L); }
    /// Sets `sampleLocationSubPixelBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationSubPixelBits(MemorySegment segment, long index, int value) { VH_sampleLocationSubPixelBits.set(segment, 0L, index, value); }
    /// Sets `sampleLocationSubPixelBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBits(int value) { sampleLocationSubPixelBits(this.segment(), 0L, value); return this; }

    /// {@return `variableSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variableSampleLocations(MemorySegment segment, long index) { return (int) VH_variableSampleLocations.get(segment, 0L, index); }
    /// {@return `variableSampleLocations`}
    public int variableSampleLocations() { return variableSampleLocations(this.segment(), 0L); }
    /// Sets `variableSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variableSampleLocations(MemorySegment segment, long index, int value) { VH_variableSampleLocations.set(segment, 0L, index, value); }
    /// Sets `variableSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocations(int value) { variableSampleLocations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSampleLocationsPropertiesEXT`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSampleLocationsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSampleLocationsPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT at(long index, Consumer<VkPhysicalDeviceSampleLocationsPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampleLocationSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationSampleCountsAt(long index) { return sampleLocationSampleCounts(this.segment(), index); }
    /// Sets `sampleLocationSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCountsAt(long index, int value) { sampleLocationSampleCounts(this.segment(), index, value); return this; }

    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxSampleLocationGridSizeAt(long index) { return maxSampleLocationGridSize(this.segment(), index); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSizeAt(long index, MemorySegment value) { maxSampleLocationGridSize(this.segment(), index, value); return this; }
    /// Accepts `maxSampleLocationGridSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxSampleLocationGridSizeAt(index))); return this; }

    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment sampleLocationCoordinateRangeAt(long index) { return sampleLocationCoordinateRange(this.segment(), index); }
    /// {@return `sampleLocationCoordinateRange` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float sampleLocationCoordinateRangeAt(long index, long index0) { return sampleLocationCoordinateRange(this.segment(), index, index0); }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRangeAt(long index, MemorySegment value) { sampleLocationCoordinateRange(this.segment(), index, value); return this; }
    /// Sets `sampleLocationCoordinateRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRangeAt(long index, long index0, float value) { sampleLocationCoordinateRange(this.segment(), index, index0, value); return this; }

    /// {@return `sampleLocationSubPixelBits` at the given index}
    /// @param index the index of the struct buffer
    public int sampleLocationSubPixelBitsAt(long index) { return sampleLocationSubPixelBits(this.segment(), index); }
    /// Sets `sampleLocationSubPixelBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBitsAt(long index, int value) { sampleLocationSubPixelBits(this.segment(), index, value); return this; }

    /// {@return `variableSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public int variableSampleLocationsAt(long index) { return variableSampleLocations(this.segment(), index); }
    /// Sets `variableSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocationsAt(long index, int value) { variableSampleLocations(this.segment(), index, value); return this; }

}
