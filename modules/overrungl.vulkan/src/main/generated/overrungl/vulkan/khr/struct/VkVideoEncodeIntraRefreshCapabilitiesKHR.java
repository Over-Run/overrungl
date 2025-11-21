// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeIntraRefreshCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeIntraRefreshCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeIntraRefreshModeFlagsKHR intraRefreshModes;
///     uint32_t maxIntraRefreshCycleDuration;
///     uint32_t maxIntraRefreshActiveReferencePictures;
///     VkBool32 partitionIndependentIntraRefreshRegions;
///     VkBool32 nonRectangularIntraRefreshRegions;
/// }
/// ```
public final class VkVideoEncodeIntraRefreshCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("intraRefreshModes"),
        ValueLayout.JAVA_INT.withName("maxIntraRefreshCycleDuration"),
        ValueLayout.JAVA_INT.withName("maxIntraRefreshActiveReferencePictures"),
        ValueLayout.JAVA_INT.withName("partitionIndependentIntraRefreshRegions"),
        ValueLayout.JAVA_INT.withName("nonRectangularIntraRefreshRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_intraRefreshModes = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshModes"));
    public static final long OFFSET_maxIntraRefreshCycleDuration = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    public static final long OFFSET_maxIntraRefreshActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    public static final long OFFSET_partitionIndependentIntraRefreshRegions = LAYOUT.byteOffset(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    public static final long OFFSET_nonRectangularIntraRefreshRegions = LAYOUT.byteOffset(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_intraRefreshModes = LAYOUT.select(PathElement.groupElement("intraRefreshModes"));
    public static final MemoryLayout LAYOUT_maxIntraRefreshCycleDuration = LAYOUT.select(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    public static final MemoryLayout LAYOUT_maxIntraRefreshActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    public static final MemoryLayout LAYOUT_partitionIndependentIntraRefreshRegions = LAYOUT.select(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    public static final MemoryLayout LAYOUT_nonRectangularIntraRefreshRegions = LAYOUT.select(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_intraRefreshModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshModes"));
    public static final VarHandle VH_maxIntraRefreshCycleDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    public static final VarHandle VH_maxIntraRefreshActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    public static final VarHandle VH_partitionIndependentIntraRefreshRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    public static final VarHandle VH_nonRectangularIntraRefreshRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonRectangularIntraRefreshRegions"));

    public VkVideoEncodeIntraRefreshCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR); }
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR copyFrom(VkVideoEncodeIntraRefreshCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR at(long index, Consumer<VkVideoEncodeIntraRefreshCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int intraRefreshModesAt(long index) { return (int) VH_intraRefreshModes.get(this.segment(), 0L, index); }
    public int maxIntraRefreshCycleDurationAt(long index) { return (int) VH_maxIntraRefreshCycleDuration.get(this.segment(), 0L, index); }
    public int maxIntraRefreshActiveReferencePicturesAt(long index) { return (int) VH_maxIntraRefreshActiveReferencePictures.get(this.segment(), 0L, index); }
    public int partitionIndependentIntraRefreshRegionsAt(long index) { return (int) VH_partitionIndependentIntraRefreshRegions.get(this.segment(), 0L, index); }
    public int nonRectangularIntraRefreshRegionsAt(long index) { return (int) VH_nonRectangularIntraRefreshRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int intraRefreshModes() { return (int) VH_intraRefreshModes.get(this.segment(), 0L, 0L); }
    public int maxIntraRefreshCycleDuration() { return (int) VH_maxIntraRefreshCycleDuration.get(this.segment(), 0L, 0L); }
    public int maxIntraRefreshActiveReferencePictures() { return (int) VH_maxIntraRefreshActiveReferencePictures.get(this.segment(), 0L, 0L); }
    public int partitionIndependentIntraRefreshRegions() { return (int) VH_partitionIndependentIntraRefreshRegions.get(this.segment(), 0L, 0L); }
    public int nonRectangularIntraRefreshRegions() { return (int) VH_nonRectangularIntraRefreshRegions.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR intraRefreshModesAt(long index, int value) { VH_intraRefreshModes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshCycleDurationAt(long index, int value) { VH_maxIntraRefreshCycleDuration.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshActiveReferencePicturesAt(long index, int value) { VH_maxIntraRefreshActiveReferencePictures.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR partitionIndependentIntraRefreshRegionsAt(long index, int value) { VH_partitionIndependentIntraRefreshRegions.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR nonRectangularIntraRefreshRegionsAt(long index, int value) { VH_nonRectangularIntraRefreshRegions.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR intraRefreshModes(int value) { VH_intraRefreshModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshCycleDuration(int value) { VH_maxIntraRefreshCycleDuration.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshActiveReferencePictures(int value) { VH_maxIntraRefreshActiveReferencePictures.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR partitionIndependentIntraRefreshRegions(int value) { VH_partitionIndependentIntraRefreshRegions.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR nonRectangularIntraRefreshRegions(int value) { VH_nonRectangularIntraRefreshRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _intraRefreshModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraRefreshModes, index), LAYOUT_intraRefreshModes); }
    public MemorySegment _intraRefreshModes() { return _intraRefreshModesAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _intraRefreshModesAt(long index, MemorySegment src) { _intraRefreshModesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _intraRefreshModes(MemorySegment src) { return _intraRefreshModesAt(0L, src); }
    public MemorySegment _maxIntraRefreshCycleDurationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIntraRefreshCycleDuration, index), LAYOUT_maxIntraRefreshCycleDuration); }
    public MemorySegment _maxIntraRefreshCycleDuration() { return _maxIntraRefreshCycleDurationAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _maxIntraRefreshCycleDurationAt(long index, MemorySegment src) { _maxIntraRefreshCycleDurationAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _maxIntraRefreshCycleDuration(MemorySegment src) { return _maxIntraRefreshCycleDurationAt(0L, src); }
    public MemorySegment _maxIntraRefreshActiveReferencePicturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIntraRefreshActiveReferencePictures, index), LAYOUT_maxIntraRefreshActiveReferencePictures); }
    public MemorySegment _maxIntraRefreshActiveReferencePictures() { return _maxIntraRefreshActiveReferencePicturesAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _maxIntraRefreshActiveReferencePicturesAt(long index, MemorySegment src) { _maxIntraRefreshActiveReferencePicturesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _maxIntraRefreshActiveReferencePictures(MemorySegment src) { return _maxIntraRefreshActiveReferencePicturesAt(0L, src); }
    public MemorySegment _partitionIndependentIntraRefreshRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionIndependentIntraRefreshRegions, index), LAYOUT_partitionIndependentIntraRefreshRegions); }
    public MemorySegment _partitionIndependentIntraRefreshRegions() { return _partitionIndependentIntraRefreshRegionsAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _partitionIndependentIntraRefreshRegionsAt(long index, MemorySegment src) { _partitionIndependentIntraRefreshRegionsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _partitionIndependentIntraRefreshRegions(MemorySegment src) { return _partitionIndependentIntraRefreshRegionsAt(0L, src); }
    public MemorySegment _nonRectangularIntraRefreshRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonRectangularIntraRefreshRegions, index), LAYOUT_nonRectangularIntraRefreshRegions); }
    public MemorySegment _nonRectangularIntraRefreshRegions() { return _nonRectangularIntraRefreshRegionsAt(0L); }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _nonRectangularIntraRefreshRegionsAt(long index, MemorySegment src) { _nonRectangularIntraRefreshRegionsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshCapabilitiesKHR _nonRectangularIntraRefreshRegions(MemorySegment src) { return _nonRectangularIntraRefreshRegionsAt(0L, src); }
}
