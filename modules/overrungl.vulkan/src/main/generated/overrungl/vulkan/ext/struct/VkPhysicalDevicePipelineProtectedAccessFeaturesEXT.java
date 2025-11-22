// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineProtectedAccessFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineProtectedAccessFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineProtectedAccess;
/// }
/// ```
public final class VkPhysicalDevicePipelineProtectedAccessFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineProtectedAccess = LAYOUT.byteOffset(PathElement.groupElement("pipelineProtectedAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineProtectedAccess = LAYOUT.select(PathElement.groupElement("pipelineProtectedAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineProtectedAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineProtectedAccess"));

    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES);
        return s;
    }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT copyFrom(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT at(long index, Consumer<VkPhysicalDevicePipelineProtectedAccessFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineProtectedAccessAt(long index) { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineProtectedAccess() { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pipelineProtectedAccessAt(long index, int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pipelineProtectedAccess(int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineProtectedAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineProtectedAccess, index), LAYOUT_pipelineProtectedAccess); }
    public MemorySegment _pipelineProtectedAccess() { return _pipelineProtectedAccessAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _pipelineProtectedAccessAt(long index, MemorySegment src) { _pipelineProtectedAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT _pipelineProtectedAccess(MemorySegment src) { return _pipelineProtectedAccessAt(0L, src); }
}
