// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 indirectMemoryCopy;
///     VkBool32 indirectMemoryToImageCopy;
/// }
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indirectMemoryCopy"),
        ValueLayout.JAVA_INT.withName("indirectMemoryToImageCopy")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_indirectMemoryCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryCopy"));
    public static final long OFFSET_indirectMemoryToImageCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryToImageCopy"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_indirectMemoryCopy = LAYOUT.select(PathElement.groupElement("indirectMemoryCopy"));
    public static final MemoryLayout LAYOUT_indirectMemoryToImageCopy = LAYOUT.select(PathElement.groupElement("indirectMemoryToImageCopy"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_indirectMemoryCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectMemoryCopy"));
    public static final VarHandle VH_indirectMemoryToImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectMemoryToImageCopy"));

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR); }
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR copyFrom(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indirectMemoryCopyAt(long index) { return (int) VH_indirectMemoryCopy.get(this.segment(), 0L, index); }
    public int indirectMemoryToImageCopyAt(long index) { return (int) VH_indirectMemoryToImageCopy.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int indirectMemoryCopy() { return (int) VH_indirectMemoryCopy.get(this.segment(), 0L, 0L); }
    public int indirectMemoryToImageCopy() { return (int) VH_indirectMemoryToImageCopy.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopyAt(long index, int value) { VH_indirectMemoryCopy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopyAt(long index, int value) { VH_indirectMemoryToImageCopy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopy(int value) { VH_indirectMemoryCopy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopy(int value) { VH_indirectMemoryToImageCopy.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indirectMemoryCopyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectMemoryCopy, index), LAYOUT_indirectMemoryCopy); }
    public MemorySegment _indirectMemoryCopy() { return _indirectMemoryCopyAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _indirectMemoryCopyAt(long index, MemorySegment src) { _indirectMemoryCopyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _indirectMemoryCopy(MemorySegment src) { return _indirectMemoryCopyAt(0L, src); }
    public MemorySegment _indirectMemoryToImageCopyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectMemoryToImageCopy, index), LAYOUT_indirectMemoryToImageCopy); }
    public MemorySegment _indirectMemoryToImageCopy() { return _indirectMemoryToImageCopyAt(0L); }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _indirectMemoryToImageCopyAt(long index, MemorySegment src) { _indirectMemoryToImageCopyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR _indirectMemoryToImageCopy(MemorySegment src) { return _indirectMemoryToImageCopyAt(0L, src); }
}
