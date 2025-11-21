// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineProtectedAccessFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineProtectedAccessFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineProtectedAccess;
/// }
/// ```
public final class VkPhysicalDevicePipelineProtectedAccessFeatures extends GroupType {
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

    public VkPhysicalDevicePipelineProtectedAccessFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineProtectedAccessFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
    public static VkPhysicalDevicePipelineProtectedAccessFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES);
        return s;
    }
    public VkPhysicalDevicePipelineProtectedAccessFeatures copyFrom(VkPhysicalDevicePipelineProtectedAccessFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures reinterpret(long count) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures asSlice(long index) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures asSlice(long index, long count) { return new VkPhysicalDevicePipelineProtectedAccessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures at(long index, Consumer<VkPhysicalDevicePipelineProtectedAccessFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineProtectedAccessAt(long index) { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineProtectedAccess() { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccessAt(long index, int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccess(int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineProtectedAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineProtectedAccess, index), LAYOUT_pipelineProtectedAccess); }
    public MemorySegment _pipelineProtectedAccess() { return _pipelineProtectedAccessAt(0L); }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _pipelineProtectedAccessAt(long index, MemorySegment src) { _pipelineProtectedAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineProtectedAccessFeatures _pipelineProtectedAccess(MemorySegment src) { return _pipelineProtectedAccessAt(0L, src); }
}
