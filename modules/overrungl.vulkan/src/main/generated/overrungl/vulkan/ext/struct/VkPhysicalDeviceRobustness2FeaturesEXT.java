// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRobustness2FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRobustness2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 robustBufferAccess2;
///     VkBool32 robustImageAccess2;
///     VkBool32 nullDescriptor;
/// }
/// ```
public final class VkPhysicalDeviceRobustness2FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_robustBufferAccess2 = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess2"));
    public static final long OFFSET_robustImageAccess2 = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess2"));
    public static final long OFFSET_nullDescriptor = LAYOUT.byteOffset(PathElement.groupElement("nullDescriptor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_robustBufferAccess2 = LAYOUT.select(PathElement.groupElement("robustBufferAccess2"));
    public static final MemoryLayout LAYOUT_robustImageAccess2 = LAYOUT.select(PathElement.groupElement("robustImageAccess2"));
    public static final MemoryLayout LAYOUT_nullDescriptor = LAYOUT.select(PathElement.groupElement("nullDescriptor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_robustBufferAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess2"));
    public static final VarHandle VH_robustImageAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess2"));
    public static final VarHandle VH_nullDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullDescriptor"));

    public VkPhysicalDeviceRobustness2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR); }
    public static VkPhysicalDeviceRobustness2FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceRobustness2FeaturesEXT copyFrom(VkPhysicalDeviceRobustness2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRobustness2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRobustness2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRobustness2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceRobustness2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int robustBufferAccess2At(long index) { return (int) VH_robustBufferAccess2.get(this.segment(), 0L, index); }
    public int robustImageAccess2At(long index) { return (int) VH_robustImageAccess2.get(this.segment(), 0L, index); }
    public int nullDescriptorAt(long index) { return (int) VH_nullDescriptor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int robustBufferAccess2() { return (int) VH_robustBufferAccess2.get(this.segment(), 0L, 0L); }
    public int robustImageAccess2() { return (int) VH_robustImageAccess2.get(this.segment(), 0L, 0L); }
    public int nullDescriptor() { return (int) VH_nullDescriptor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2At(long index, int value) { VH_robustBufferAccess2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2At(long index, int value) { VH_robustImageAccess2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptorAt(long index, int value) { VH_nullDescriptor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(int value) { VH_robustBufferAccess2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(int value) { VH_robustImageAccess2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(int value) { VH_nullDescriptor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustBufferAccess2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustBufferAccess2, index), LAYOUT_robustBufferAccess2); }
    public MemorySegment _robustBufferAccess2() { return _robustBufferAccess2At(0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT _robustBufferAccess2At(long index, MemorySegment src) { _robustBufferAccess2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT _robustBufferAccess2(MemorySegment src) { return _robustBufferAccess2At(0L, src); }
    public MemorySegment _robustImageAccess2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustImageAccess2, index), LAYOUT_robustImageAccess2); }
    public MemorySegment _robustImageAccess2() { return _robustImageAccess2At(0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT _robustImageAccess2At(long index, MemorySegment src) { _robustImageAccess2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT _robustImageAccess2(MemorySegment src) { return _robustImageAccess2At(0L, src); }
    public MemorySegment _nullDescriptorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nullDescriptor, index), LAYOUT_nullDescriptor); }
    public MemorySegment _nullDescriptor() { return _nullDescriptorAt(0L); }
    public VkPhysicalDeviceRobustness2FeaturesEXT _nullDescriptorAt(long index, MemorySegment src) { _nullDescriptorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRobustness2FeaturesEXT _nullDescriptor(MemorySegment src) { return _nullDescriptorAt(0L, src); }
}
