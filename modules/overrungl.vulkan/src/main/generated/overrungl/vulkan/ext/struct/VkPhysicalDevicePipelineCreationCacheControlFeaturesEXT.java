// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineCreationCacheControl;
/// }
/// ```
public final class VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineCreationCacheControl")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineCreationCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineCreationCacheControl"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineCreationCacheControl = LAYOUT.select(PathElement.groupElement("pipelineCreationCacheControl"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineCreationCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCreationCacheControl"));

    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES); }
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES);
        return s;
    }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT copyFrom(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT at(long index, Consumer<VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineCreationCacheControlAt(long index) { return (int) VH_pipelineCreationCacheControl.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineCreationCacheControl() { return (int) VH_pipelineCreationCacheControl.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pipelineCreationCacheControlAt(long index, int value) { VH_pipelineCreationCacheControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pipelineCreationCacheControl(int value) { VH_pipelineCreationCacheControl.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineCreationCacheControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCreationCacheControl, index), LAYOUT_pipelineCreationCacheControl); }
    public MemorySegment _pipelineCreationCacheControl() { return _pipelineCreationCacheControlAt(0L); }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _pipelineCreationCacheControlAt(long index, MemorySegment src) { _pipelineCreationCacheControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT _pipelineCreationCacheControl(MemorySegment src) { return _pipelineCreationCacheControlAt(0L, src); }
}
