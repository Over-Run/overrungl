// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 workgroupMemoryExplicitLayout;
///     VkBool32 workgroupMemoryExplicitLayoutScalarBlockLayout;
///     VkBool32 workgroupMemoryExplicitLayout8BitAccess;
///     VkBool32 workgroupMemoryExplicitLayout16BitAccess;
/// }
/// ```
public final class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_workgroupMemoryExplicitLayout = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    public static final long OFFSET_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    public static final long OFFSET_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    public static final long OFFSET_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_workgroupMemoryExplicitLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    public static final VarHandle VH_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    public static final VarHandle VH_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    public static final VarHandle VH_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR); }
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR copyFrom(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR at(long index, Consumer<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int workgroupMemoryExplicitLayoutAt(long index) { return (int) VH_workgroupMemoryExplicitLayout.get(this.segment(), 0L, index); }
    public int workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index) { return (int) VH_workgroupMemoryExplicitLayoutScalarBlockLayout.get(this.segment(), 0L, index); }
    public int workgroupMemoryExplicitLayout8BitAccessAt(long index) { return (int) VH_workgroupMemoryExplicitLayout8BitAccess.get(this.segment(), 0L, index); }
    public int workgroupMemoryExplicitLayout16BitAccessAt(long index) { return (int) VH_workgroupMemoryExplicitLayout16BitAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int workgroupMemoryExplicitLayout() { return (int) VH_workgroupMemoryExplicitLayout.get(this.segment(), 0L, 0L); }
    public int workgroupMemoryExplicitLayoutScalarBlockLayout() { return (int) VH_workgroupMemoryExplicitLayoutScalarBlockLayout.get(this.segment(), 0L, 0L); }
    public int workgroupMemoryExplicitLayout8BitAccess() { return (int) VH_workgroupMemoryExplicitLayout8BitAccess.get(this.segment(), 0L, 0L); }
    public int workgroupMemoryExplicitLayout16BitAccess() { return (int) VH_workgroupMemoryExplicitLayout16BitAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutAt(long index, int value) { VH_workgroupMemoryExplicitLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index, int value) { VH_workgroupMemoryExplicitLayoutScalarBlockLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccessAt(long index, int value) { VH_workgroupMemoryExplicitLayout8BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccessAt(long index, int value) { VH_workgroupMemoryExplicitLayout16BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(int value) { VH_workgroupMemoryExplicitLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(int value) { VH_workgroupMemoryExplicitLayoutScalarBlockLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(int value) { VH_workgroupMemoryExplicitLayout8BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(int value) { VH_workgroupMemoryExplicitLayout16BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _workgroupMemoryExplicitLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_workgroupMemoryExplicitLayout, index), LAYOUT_workgroupMemoryExplicitLayout); }
    public MemorySegment _workgroupMemoryExplicitLayout() { return _workgroupMemoryExplicitLayoutAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayoutAt(long index, MemorySegment src) { _workgroupMemoryExplicitLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayout(MemorySegment src) { return _workgroupMemoryExplicitLayoutAt(0L, src); }
    public MemorySegment _workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_workgroupMemoryExplicitLayoutScalarBlockLayout, index), LAYOUT_workgroupMemoryExplicitLayoutScalarBlockLayout); }
    public MemorySegment _workgroupMemoryExplicitLayoutScalarBlockLayout() { return _workgroupMemoryExplicitLayoutScalarBlockLayoutAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index, MemorySegment src) { _workgroupMemoryExplicitLayoutScalarBlockLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment src) { return _workgroupMemoryExplicitLayoutScalarBlockLayoutAt(0L, src); }
    public MemorySegment _workgroupMemoryExplicitLayout8BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_workgroupMemoryExplicitLayout8BitAccess, index), LAYOUT_workgroupMemoryExplicitLayout8BitAccess); }
    public MemorySegment _workgroupMemoryExplicitLayout8BitAccess() { return _workgroupMemoryExplicitLayout8BitAccessAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayout8BitAccessAt(long index, MemorySegment src) { _workgroupMemoryExplicitLayout8BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayout8BitAccess(MemorySegment src) { return _workgroupMemoryExplicitLayout8BitAccessAt(0L, src); }
    public MemorySegment _workgroupMemoryExplicitLayout16BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_workgroupMemoryExplicitLayout16BitAccess, index), LAYOUT_workgroupMemoryExplicitLayout16BitAccess); }
    public MemorySegment _workgroupMemoryExplicitLayout16BitAccess() { return _workgroupMemoryExplicitLayout16BitAccessAt(0L); }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayout16BitAccessAt(long index, MemorySegment src) { _workgroupMemoryExplicitLayout16BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR _workgroupMemoryExplicitLayout16BitAccess(MemorySegment src) { return _workgroupMemoryExplicitLayout16BitAccessAt(0L, src); }
}
