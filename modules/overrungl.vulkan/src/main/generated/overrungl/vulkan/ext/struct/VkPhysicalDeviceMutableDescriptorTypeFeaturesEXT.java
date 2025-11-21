// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 mutableDescriptorType;
/// }
/// ```
public final class VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mutableDescriptorType = LAYOUT.byteOffset(PathElement.groupElement("mutableDescriptorType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mutableDescriptorType = LAYOUT.select(PathElement.groupElement("mutableDescriptorType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mutableDescriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableDescriptorType"));

    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT); }
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT copyFrom(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int mutableDescriptorTypeAt(long index) { return (int) VH_mutableDescriptorType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int mutableDescriptorType() { return (int) VH_mutableDescriptorType.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT mutableDescriptorTypeAt(long index, int value) { VH_mutableDescriptorType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT mutableDescriptorType(int value) { VH_mutableDescriptorType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mutableDescriptorTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mutableDescriptorType, index), LAYOUT_mutableDescriptorType); }
    public MemorySegment _mutableDescriptorType() { return _mutableDescriptorTypeAt(0L); }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _mutableDescriptorTypeAt(long index, MemorySegment src) { _mutableDescriptorTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT _mutableDescriptorType(MemorySegment src) { return _mutableDescriptorTypeAt(0L, src); }
}
