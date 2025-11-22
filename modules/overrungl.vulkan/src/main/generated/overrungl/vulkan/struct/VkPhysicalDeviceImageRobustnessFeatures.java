// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageRobustnessFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageRobustnessFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 robustImageAccess;
/// }
/// ```
public final class VkPhysicalDeviceImageRobustnessFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustImageAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_robustImageAccess = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_robustImageAccess = LAYOUT.select(PathElement.groupElement("robustImageAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_robustImageAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess"));

    public VkPhysicalDeviceImageRobustnessFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageRobustnessFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageRobustnessFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageRobustnessFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageRobustnessFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageRobustnessFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageRobustnessFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageRobustnessFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageRobustnessFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageRobustnessFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageRobustnessFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageRobustnessFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES); }
    public static VkPhysicalDeviceImageRobustnessFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES);
        return s;
    }
    public VkPhysicalDeviceImageRobustnessFeatures copyFrom(VkPhysicalDeviceImageRobustnessFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures reinterpret(long count) { return new VkPhysicalDeviceImageRobustnessFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageRobustnessFeatures asSlice(long index) { return new VkPhysicalDeviceImageRobustnessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageRobustnessFeatures asSlice(long index, long count) { return new VkPhysicalDeviceImageRobustnessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageRobustnessFeatures at(long index, Consumer<VkPhysicalDeviceImageRobustnessFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int robustImageAccessAt(long index) { return (int) VH_robustImageAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int robustImageAccess() { return (int) VH_robustImageAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageRobustnessFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures robustImageAccessAt(long index, int value) { VH_robustImageAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures robustImageAccess(int value) { VH_robustImageAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageRobustnessFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageRobustnessFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustImageAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustImageAccess, index), LAYOUT_robustImageAccess); }
    public MemorySegment _robustImageAccess() { return _robustImageAccessAt(0L); }
    public VkPhysicalDeviceImageRobustnessFeatures _robustImageAccessAt(long index, MemorySegment src) { _robustImageAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageRobustnessFeatures _robustImageAccess(MemorySegment src) { return _robustImageAccessAt(0L, src); }
}
