// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineBinaryFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineBinaryFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineBinaries;
/// }
/// ```
public final class VkPhysicalDevicePipelineBinaryFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBinaries = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBinaries = LAYOUT.select(PathElement.groupElement("pipelineBinaries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBinaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaries"));

    public VkPhysicalDevicePipelineBinaryFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineBinaryFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineBinaryFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR); }
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR copyFrom(VkPhysicalDevicePipelineBinaryFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePipelineBinaryFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePipelineBinaryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePipelineBinaryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR at(long index, Consumer<VkPhysicalDevicePipelineBinaryFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineBinariesAt(long index) { return (int) VH_pipelineBinaries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineBinaries() { return (int) VH_pipelineBinaries.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pipelineBinariesAt(long index, int value) { VH_pipelineBinaries.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pipelineBinaries(int value) { VH_pipelineBinaries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBinariesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaries, index), LAYOUT_pipelineBinaries); }
    public MemorySegment _pipelineBinaries() { return _pipelineBinariesAt(0L); }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _pipelineBinariesAt(long index, MemorySegment src) { _pipelineBinariesAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryFeaturesKHR _pipelineBinaries(MemorySegment src) { return _pipelineBinariesAt(0L, src); }
}
