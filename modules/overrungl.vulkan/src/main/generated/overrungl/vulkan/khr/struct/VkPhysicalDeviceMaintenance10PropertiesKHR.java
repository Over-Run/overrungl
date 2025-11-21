// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance10PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance10PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rgba4OpaqueBlackSwizzled;
///     VkBool32 resolveSrgbFormatAppliesTransferFunction;
///     VkBool32 resolveSrgbFormatSupportsTransferFunctionControl;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance10PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rgba4OpaqueBlackSwizzled"),
        ValueLayout.JAVA_INT.withName("resolveSrgbFormatAppliesTransferFunction"),
        ValueLayout.JAVA_INT.withName("resolveSrgbFormatSupportsTransferFunctionControl")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rgba4OpaqueBlackSwizzled = LAYOUT.byteOffset(PathElement.groupElement("rgba4OpaqueBlackSwizzled"));
    public static final long OFFSET_resolveSrgbFormatAppliesTransferFunction = LAYOUT.byteOffset(PathElement.groupElement("resolveSrgbFormatAppliesTransferFunction"));
    public static final long OFFSET_resolveSrgbFormatSupportsTransferFunctionControl = LAYOUT.byteOffset(PathElement.groupElement("resolveSrgbFormatSupportsTransferFunctionControl"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rgba4OpaqueBlackSwizzled = LAYOUT.select(PathElement.groupElement("rgba4OpaqueBlackSwizzled"));
    public static final MemoryLayout LAYOUT_resolveSrgbFormatAppliesTransferFunction = LAYOUT.select(PathElement.groupElement("resolveSrgbFormatAppliesTransferFunction"));
    public static final MemoryLayout LAYOUT_resolveSrgbFormatSupportsTransferFunctionControl = LAYOUT.select(PathElement.groupElement("resolveSrgbFormatSupportsTransferFunctionControl"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rgba4OpaqueBlackSwizzled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgba4OpaqueBlackSwizzled"));
    public static final VarHandle VH_resolveSrgbFormatAppliesTransferFunction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveSrgbFormatAppliesTransferFunction"));
    public static final VarHandle VH_resolveSrgbFormatSupportsTransferFunctionControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveSrgbFormatSupportsTransferFunctionControl"));

    public VkPhysicalDeviceMaintenance10PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance10PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance10PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance10PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR); }
    public static VkPhysicalDeviceMaintenance10PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceMaintenance10PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance10PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance10PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance10PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance10PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance10PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rgba4OpaqueBlackSwizzledAt(long index) { return (int) VH_rgba4OpaqueBlackSwizzled.get(this.segment(), 0L, index); }
    public int resolveSrgbFormatAppliesTransferFunctionAt(long index) { return (int) VH_resolveSrgbFormatAppliesTransferFunction.get(this.segment(), 0L, index); }
    public int resolveSrgbFormatSupportsTransferFunctionControlAt(long index) { return (int) VH_resolveSrgbFormatSupportsTransferFunctionControl.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rgba4OpaqueBlackSwizzled() { return (int) VH_rgba4OpaqueBlackSwizzled.get(this.segment(), 0L, 0L); }
    public int resolveSrgbFormatAppliesTransferFunction() { return (int) VH_resolveSrgbFormatAppliesTransferFunction.get(this.segment(), 0L, 0L); }
    public int resolveSrgbFormatSupportsTransferFunctionControl() { return (int) VH_resolveSrgbFormatSupportsTransferFunctionControl.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR rgba4OpaqueBlackSwizzledAt(long index, int value) { VH_rgba4OpaqueBlackSwizzled.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatAppliesTransferFunctionAt(long index, int value) { VH_resolveSrgbFormatAppliesTransferFunction.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatSupportsTransferFunctionControlAt(long index, int value) { VH_resolveSrgbFormatSupportsTransferFunctionControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR rgba4OpaqueBlackSwizzled(int value) { VH_rgba4OpaqueBlackSwizzled.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatAppliesTransferFunction(int value) { VH_resolveSrgbFormatAppliesTransferFunction.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatSupportsTransferFunctionControl(int value) { VH_resolveSrgbFormatSupportsTransferFunctionControl.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rgba4OpaqueBlackSwizzledAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rgba4OpaqueBlackSwizzled, index), LAYOUT_rgba4OpaqueBlackSwizzled); }
    public MemorySegment _rgba4OpaqueBlackSwizzled() { return _rgba4OpaqueBlackSwizzledAt(0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _rgba4OpaqueBlackSwizzledAt(long index, MemorySegment src) { _rgba4OpaqueBlackSwizzledAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _rgba4OpaqueBlackSwizzled(MemorySegment src) { return _rgba4OpaqueBlackSwizzledAt(0L, src); }
    public MemorySegment _resolveSrgbFormatAppliesTransferFunctionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveSrgbFormatAppliesTransferFunction, index), LAYOUT_resolveSrgbFormatAppliesTransferFunction); }
    public MemorySegment _resolveSrgbFormatAppliesTransferFunction() { return _resolveSrgbFormatAppliesTransferFunctionAt(0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _resolveSrgbFormatAppliesTransferFunctionAt(long index, MemorySegment src) { _resolveSrgbFormatAppliesTransferFunctionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _resolveSrgbFormatAppliesTransferFunction(MemorySegment src) { return _resolveSrgbFormatAppliesTransferFunctionAt(0L, src); }
    public MemorySegment _resolveSrgbFormatSupportsTransferFunctionControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveSrgbFormatSupportsTransferFunctionControl, index), LAYOUT_resolveSrgbFormatSupportsTransferFunctionControl); }
    public MemorySegment _resolveSrgbFormatSupportsTransferFunctionControl() { return _resolveSrgbFormatSupportsTransferFunctionControlAt(0L); }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _resolveSrgbFormatSupportsTransferFunctionControlAt(long index, MemorySegment src) { _resolveSrgbFormatSupportsTransferFunctionControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance10PropertiesKHR _resolveSrgbFormatSupportsTransferFunctionControl(MemorySegment src) { return _resolveSrgbFormatSupportsTransferFunctionControlAt(0L, src); }
}
