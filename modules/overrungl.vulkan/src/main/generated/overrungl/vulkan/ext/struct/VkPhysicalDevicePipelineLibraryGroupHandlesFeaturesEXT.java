// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineLibraryGroupHandles;
/// }
/// ```
public final class VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineLibraryGroupHandles")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineLibraryGroupHandles = LAYOUT.byteOffset(PathElement.groupElement("pipelineLibraryGroupHandles"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineLibraryGroupHandles = LAYOUT.select(PathElement.groupElement("pipelineLibraryGroupHandles"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineLibraryGroupHandles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLibraryGroupHandles"));

    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPipelineLibraryGroupHandles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT); }
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPipelineLibraryGroupHandles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT copyFrom(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT at(long index, Consumer<VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineLibraryGroupHandlesAt(long index) { return (int) VH_pipelineLibraryGroupHandles.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineLibraryGroupHandles() { return (int) VH_pipelineLibraryGroupHandles.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pipelineLibraryGroupHandlesAt(long index, int value) { VH_pipelineLibraryGroupHandles.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pipelineLibraryGroupHandles(int value) { VH_pipelineLibraryGroupHandles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineLibraryGroupHandlesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineLibraryGroupHandles, index), LAYOUT_pipelineLibraryGroupHandles); }
    public MemorySegment _pipelineLibraryGroupHandles() { return _pipelineLibraryGroupHandlesAt(0L); }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _pipelineLibraryGroupHandlesAt(long index, MemorySegment src) { _pipelineLibraryGroupHandlesAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT _pipelineLibraryGroupHandles(MemorySegment src) { return _pipelineLibraryGroupHandlesAt(0L, src); }
}
