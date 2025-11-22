// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCoarseSampleOrderCustomNV`.
/// ## Layout
/// ```
/// struct VkCoarseSampleOrderCustomNV {
///     VkShadingRatePaletteEntryNV shadingRate;
///     uint32_t sampleCount;
///     uint32_t sampleLocationCount;
///     const VkCoarseSampleLocationNV* pSampleLocations;
/// }
/// ```
public final class VkCoarseSampleOrderCustomNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
    );
    public static final long OFFSET_shadingRate = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
    public static final long OFFSET_sampleCount = LAYOUT.byteOffset(PathElement.groupElement("sampleCount"));
    public static final long OFFSET_sampleLocationCount = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCount"));
    public static final long OFFSET_pSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
    public static final MemoryLayout LAYOUT_shadingRate = LAYOUT.select(PathElement.groupElement("shadingRate"));
    public static final MemoryLayout LAYOUT_sampleCount = LAYOUT.select(PathElement.groupElement("sampleCount"));
    public static final MemoryLayout LAYOUT_sampleLocationCount = LAYOUT.select(PathElement.groupElement("sampleLocationCount"));
    public static final MemoryLayout LAYOUT_pSampleLocations = LAYOUT.select(PathElement.groupElement("pSampleLocations"));
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    public static final VarHandle VH_sampleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCount"));
    public static final VarHandle VH_sampleLocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationCount"));
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    public VkCoarseSampleOrderCustomNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCoarseSampleOrderCustomNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCoarseSampleOrderCustomNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleOrderCustomNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT), 1); }
    public static VkCoarseSampleOrderCustomNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleOrderCustomNV(allocator.allocate(LAYOUT, count), count); }
    public VkCoarseSampleOrderCustomNV copyFrom(VkCoarseSampleOrderCustomNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCoarseSampleOrderCustomNV reinterpret(long count) { return new VkCoarseSampleOrderCustomNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCoarseSampleOrderCustomNV asSlice(long index) { return new VkCoarseSampleOrderCustomNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCoarseSampleOrderCustomNV asSlice(long index, long count) { return new VkCoarseSampleOrderCustomNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCoarseSampleOrderCustomNV at(long index, Consumer<VkCoarseSampleOrderCustomNV> func) { func.accept(asSlice(index)); return this; }
    public int shadingRateAt(long index) { return (int) VH_shadingRate.get(this.segment(), 0L, index); }
    public int sampleCountAt(long index) { return (int) VH_sampleCount.get(this.segment(), 0L, index); }
    public int sampleLocationCountAt(long index) { return (int) VH_sampleLocationCount.get(this.segment(), 0L, index); }
    public MemorySegment pSampleLocationsAt(long index) { return (MemorySegment) VH_pSampleLocations.get(this.segment(), 0L, index); }
    public int shadingRate() { return (int) VH_shadingRate.get(this.segment(), 0L, 0L); }
    public int sampleCount() { return (int) VH_sampleCount.get(this.segment(), 0L, 0L); }
    public int sampleLocationCount() { return (int) VH_sampleLocationCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSampleLocations() { return (MemorySegment) VH_pSampleLocations.get(this.segment(), 0L, 0L); }
    public VkCoarseSampleOrderCustomNV shadingRateAt(long index, int value) { VH_shadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleOrderCustomNV sampleCountAt(long index, int value) { VH_sampleCount.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleOrderCustomNV sampleLocationCountAt(long index, int value) { VH_sampleLocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleOrderCustomNV pSampleLocationsAt(long index, MemorySegment value) { VH_pSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleOrderCustomNV shadingRate(int value) { VH_shadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkCoarseSampleOrderCustomNV sampleCount(int value) { VH_sampleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCoarseSampleOrderCustomNV sampleLocationCount(int value) { VH_sampleLocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCoarseSampleOrderCustomNV pSampleLocations(MemorySegment value) { VH_pSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _shadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRate, index), LAYOUT_shadingRate); }
    public MemorySegment _shadingRate() { return _shadingRateAt(0L); }
    public VkCoarseSampleOrderCustomNV _shadingRateAt(long index, MemorySegment src) { _shadingRateAt(index).copyFrom(src); return this; }
    public VkCoarseSampleOrderCustomNV _shadingRate(MemorySegment src) { return _shadingRateAt(0L, src); }
    public MemorySegment _sampleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleCount, index), LAYOUT_sampleCount); }
    public MemorySegment _sampleCount() { return _sampleCountAt(0L); }
    public VkCoarseSampleOrderCustomNV _sampleCountAt(long index, MemorySegment src) { _sampleCountAt(index).copyFrom(src); return this; }
    public VkCoarseSampleOrderCustomNV _sampleCount(MemorySegment src) { return _sampleCountAt(0L, src); }
    public MemorySegment _sampleLocationCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationCount, index), LAYOUT_sampleLocationCount); }
    public MemorySegment _sampleLocationCount() { return _sampleLocationCountAt(0L); }
    public VkCoarseSampleOrderCustomNV _sampleLocationCountAt(long index, MemorySegment src) { _sampleLocationCountAt(index).copyFrom(src); return this; }
    public VkCoarseSampleOrderCustomNV _sampleLocationCount(MemorySegment src) { return _sampleLocationCountAt(0L, src); }
    public MemorySegment _pSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSampleLocations, index), LAYOUT_pSampleLocations); }
    public MemorySegment _pSampleLocations() { return _pSampleLocationsAt(0L); }
    public VkCoarseSampleOrderCustomNV _pSampleLocationsAt(long index, MemorySegment src) { _pSampleLocationsAt(index).copyFrom(src); return this; }
    public VkCoarseSampleOrderCustomNV _pSampleLocations(MemorySegment src) { return _pSampleLocationsAt(0L, src); }
}
