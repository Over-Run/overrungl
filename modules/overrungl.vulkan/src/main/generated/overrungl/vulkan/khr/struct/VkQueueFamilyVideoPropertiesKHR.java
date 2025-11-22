// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyVideoPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyVideoPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoCodecOperationFlagsKHR videoCodecOperations;
/// }
/// ```
public final class VkQueueFamilyVideoPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoCodecOperations = LAYOUT.byteOffset(PathElement.groupElement("videoCodecOperations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoCodecOperations = LAYOUT.select(PathElement.groupElement("videoCodecOperations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoCodecOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoCodecOperations"));

    public VkQueueFamilyVideoPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyVideoPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyVideoPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyVideoPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyVideoPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyVideoPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyVideoPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyVideoPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyVideoPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR); }
    public static VkQueueFamilyVideoPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR);
        return s;
    }
    public VkQueueFamilyVideoPropertiesKHR copyFrom(VkQueueFamilyVideoPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyVideoPropertiesKHR reinterpret(long count) { return new VkQueueFamilyVideoPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyVideoPropertiesKHR asSlice(long index) { return new VkQueueFamilyVideoPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyVideoPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyVideoPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyVideoPropertiesKHR at(long index, Consumer<VkQueueFamilyVideoPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoCodecOperationsAt(long index) { return (int) VH_videoCodecOperations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoCodecOperations() { return (int) VH_videoCodecOperations.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyVideoPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyVideoPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyVideoPropertiesKHR videoCodecOperationsAt(long index, int value) { VH_videoCodecOperations.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyVideoPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyVideoPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyVideoPropertiesKHR videoCodecOperations(int value) { VH_videoCodecOperations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyVideoPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyVideoPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyVideoPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyVideoPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoCodecOperationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoCodecOperations, index), LAYOUT_videoCodecOperations); }
    public MemorySegment _videoCodecOperations() { return _videoCodecOperationsAt(0L); }
    public VkQueueFamilyVideoPropertiesKHR _videoCodecOperationsAt(long index, MemorySegment src) { _videoCodecOperationsAt(index).copyFrom(src); return this; }
    public VkQueueFamilyVideoPropertiesKHR _videoCodecOperations(MemorySegment src) { return _videoCodecOperationsAt(0L, src); }
}
