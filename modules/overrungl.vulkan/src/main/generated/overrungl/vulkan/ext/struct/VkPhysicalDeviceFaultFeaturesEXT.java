// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFaultFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFaultFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceFault;
///     VkBool32 deviceFaultVendorBinary;
/// }
/// ```
public final class VkPhysicalDeviceFaultFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceFault"),
        ValueLayout.JAVA_INT.withName("deviceFaultVendorBinary")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceFault = LAYOUT.byteOffset(PathElement.groupElement("deviceFault"));
    public static final long OFFSET_deviceFaultVendorBinary = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultVendorBinary"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceFault = LAYOUT.select(PathElement.groupElement("deviceFault"));
    public static final MemoryLayout LAYOUT_deviceFaultVendorBinary = LAYOUT.select(PathElement.groupElement("deviceFaultVendorBinary"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFault"));
    public static final VarHandle VH_deviceFaultVendorBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFaultVendorBinary"));

    public VkPhysicalDeviceFaultFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFaultFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFaultFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFaultFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFaultFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFaultFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFaultFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFaultFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT); }
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFaultFeaturesEXT copyFrom(VkPhysicalDeviceFaultFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFaultFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFaultFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFaultFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFaultFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFaultFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFaultFeaturesEXT at(long index, Consumer<VkPhysicalDeviceFaultFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceFaultAt(long index) { return (int) VH_deviceFault.get(this.segment(), 0L, index); }
    public int deviceFaultVendorBinaryAt(long index) { return (int) VH_deviceFaultVendorBinary.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceFault() { return (int) VH_deviceFault.get(this.segment(), 0L, 0L); }
    public int deviceFaultVendorBinary() { return (int) VH_deviceFaultVendorBinary.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFaultFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultAt(long index, int value) { VH_deviceFault.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinaryAt(long index, int value) { VH_deviceFaultVendorBinary.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(int value) { VH_deviceFault.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(int value) { VH_deviceFaultVendorBinary.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFaultFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFaultFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceFaultAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceFault, index), LAYOUT_deviceFault); }
    public MemorySegment _deviceFault() { return _deviceFaultAt(0L); }
    public VkPhysicalDeviceFaultFeaturesEXT _deviceFaultAt(long index, MemorySegment src) { _deviceFaultAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT _deviceFault(MemorySegment src) { return _deviceFaultAt(0L, src); }
    public MemorySegment _deviceFaultVendorBinaryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceFaultVendorBinary, index), LAYOUT_deviceFaultVendorBinary); }
    public MemorySegment _deviceFaultVendorBinary() { return _deviceFaultVendorBinaryAt(0L); }
    public VkPhysicalDeviceFaultFeaturesEXT _deviceFaultVendorBinaryAt(long index, MemorySegment src) { _deviceFaultVendorBinaryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFaultFeaturesEXT _deviceFaultVendorBinary(MemorySegment src) { return _deviceFaultVendorBinaryAt(0L, src); }
}
