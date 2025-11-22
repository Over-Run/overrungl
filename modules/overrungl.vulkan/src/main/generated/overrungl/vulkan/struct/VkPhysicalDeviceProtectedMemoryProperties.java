// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceProtectedMemoryProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProtectedMemoryProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 protectedNoFault;
/// }
/// ```
public final class VkPhysicalDeviceProtectedMemoryProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("protectedNoFault")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_protectedNoFault = LAYOUT.byteOffset(PathElement.groupElement("protectedNoFault"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_protectedNoFault = LAYOUT.select(PathElement.groupElement("protectedNoFault"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_protectedNoFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedNoFault"));

    public VkPhysicalDeviceProtectedMemoryProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceProtectedMemoryProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProtectedMemoryProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceProtectedMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProtectedMemoryProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceProtectedMemoryProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProtectedMemoryProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceProtectedMemoryProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProtectedMemoryProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceProtectedMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProtectedMemoryProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceProtectedMemoryProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES); }
    public static VkPhysicalDeviceProtectedMemoryProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceProtectedMemoryProperties copyFrom(VkPhysicalDeviceProtectedMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties reinterpret(long count) { return new VkPhysicalDeviceProtectedMemoryProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceProtectedMemoryProperties asSlice(long index) { return new VkPhysicalDeviceProtectedMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceProtectedMemoryProperties asSlice(long index, long count) { return new VkPhysicalDeviceProtectedMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceProtectedMemoryProperties at(long index, Consumer<VkPhysicalDeviceProtectedMemoryProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int protectedNoFaultAt(long index) { return (int) VH_protectedNoFault.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int protectedNoFault() { return (int) VH_protectedNoFault.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceProtectedMemoryProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties protectedNoFaultAt(long index, int value) { VH_protectedNoFault.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties protectedNoFault(int value) { VH_protectedNoFault.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceProtectedMemoryProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceProtectedMemoryProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _protectedNoFaultAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_protectedNoFault, index), LAYOUT_protectedNoFault); }
    public MemorySegment _protectedNoFault() { return _protectedNoFaultAt(0L); }
    public VkPhysicalDeviceProtectedMemoryProperties _protectedNoFaultAt(long index, MemorySegment src) { _protectedNoFaultAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProtectedMemoryProperties _protectedNoFault(MemorySegment src) { return _protectedNoFaultAt(0L, src); }
}
