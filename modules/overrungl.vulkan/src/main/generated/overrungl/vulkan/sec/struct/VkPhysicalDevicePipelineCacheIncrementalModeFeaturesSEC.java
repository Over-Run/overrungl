// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.sec.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineCacheIncrementalMode;
/// }
/// ```
public final class VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineCacheIncrementalMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineCacheIncrementalMode = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheIncrementalMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineCacheIncrementalMode = LAYOUT.select(PathElement.groupElement("pipelineCacheIncrementalMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineCacheIncrementalMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheIncrementalMode"));

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.sec.VKSECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC); }
    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.sec.VKSECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC);
        return s;
    }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC copyFrom(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC reinterpret(long count) { return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC asSlice(long index) { return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC asSlice(long index, long count) { return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC at(long index, Consumer<VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineCacheIncrementalModeAt(long index) { return (int) VH_pipelineCacheIncrementalMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineCacheIncrementalMode() { return (int) VH_pipelineCacheIncrementalMode.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pipelineCacheIncrementalModeAt(long index, int value) { VH_pipelineCacheIncrementalMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pipelineCacheIncrementalMode(int value) { VH_pipelineCacheIncrementalMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineCacheIncrementalModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCacheIncrementalMode, index), LAYOUT_pipelineCacheIncrementalMode); }
    public MemorySegment _pipelineCacheIncrementalMode() { return _pipelineCacheIncrementalModeAt(0L); }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _pipelineCacheIncrementalModeAt(long index, MemorySegment src) { _pipelineCacheIncrementalModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC _pipelineCacheIncrementalMode(MemorySegment src) { return _pipelineCacheIncrementalModeAt(0L, src); }
}
