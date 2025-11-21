// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCommandBufferInheritanceFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCommandBufferInheritanceFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 commandBufferInheritance;
/// }
/// ```
public final class VkPhysicalDeviceCommandBufferInheritanceFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("commandBufferInheritance")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_commandBufferInheritance = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInheritance"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_commandBufferInheritance = LAYOUT.select(PathElement.groupElement("commandBufferInheritance"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_commandBufferInheritance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferInheritance"));

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV); }
    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV copyFrom(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV at(long index, Consumer<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int commandBufferInheritanceAt(long index) { return (int) VH_commandBufferInheritance.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int commandBufferInheritance() { return (int) VH_commandBufferInheritance.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV commandBufferInheritanceAt(long index, int value) { VH_commandBufferInheritance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV commandBufferInheritance(int value) { VH_commandBufferInheritance.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _commandBufferInheritanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBufferInheritance, index), LAYOUT_commandBufferInheritance); }
    public MemorySegment _commandBufferInheritance() { return _commandBufferInheritanceAt(0L); }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _commandBufferInheritanceAt(long index, MemorySegment src) { _commandBufferInheritanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV _commandBufferInheritance(MemorySegment src) { return _commandBufferInheritanceAt(0L, src); }
}
