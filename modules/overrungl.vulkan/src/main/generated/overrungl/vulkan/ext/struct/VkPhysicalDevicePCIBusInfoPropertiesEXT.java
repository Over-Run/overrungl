// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePCIBusInfoPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t pciDomain;
///     uint32_t pciBus;
///     uint32_t pciDevice;
///     uint32_t pciFunction;
/// }
/// ```
public final class VkPhysicalDevicePCIBusInfoPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pciDomain"),
        ValueLayout.JAVA_INT.withName("pciBus"),
        ValueLayout.JAVA_INT.withName("pciDevice"),
        ValueLayout.JAVA_INT.withName("pciFunction")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pciDomain = LAYOUT.byteOffset(PathElement.groupElement("pciDomain"));
    public static final long OFFSET_pciBus = LAYOUT.byteOffset(PathElement.groupElement("pciBus"));
    public static final long OFFSET_pciDevice = LAYOUT.byteOffset(PathElement.groupElement("pciDevice"));
    public static final long OFFSET_pciFunction = LAYOUT.byteOffset(PathElement.groupElement("pciFunction"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pciDomain = LAYOUT.select(PathElement.groupElement("pciDomain"));
    public static final MemoryLayout LAYOUT_pciBus = LAYOUT.select(PathElement.groupElement("pciBus"));
    public static final MemoryLayout LAYOUT_pciDevice = LAYOUT.select(PathElement.groupElement("pciDevice"));
    public static final MemoryLayout LAYOUT_pciFunction = LAYOUT.select(PathElement.groupElement("pciFunction"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pciDomain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDomain"));
    public static final VarHandle VH_pciBus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciBus"));
    public static final VarHandle VH_pciDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDevice"));
    public static final VarHandle VH_pciFunction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciFunction"));

    public VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT); }
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT copyFrom(VkPhysicalDevicePCIBusInfoPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT reinterpret(long count) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT asSlice(long index) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT at(long index, Consumer<VkPhysicalDevicePCIBusInfoPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pciDomainAt(long index) { return (int) VH_pciDomain.get(this.segment(), 0L, index); }
    public int pciBusAt(long index) { return (int) VH_pciBus.get(this.segment(), 0L, index); }
    public int pciDeviceAt(long index) { return (int) VH_pciDevice.get(this.segment(), 0L, index); }
    public int pciFunctionAt(long index) { return (int) VH_pciFunction.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pciDomain() { return (int) VH_pciDomain.get(this.segment(), 0L, 0L); }
    public int pciBus() { return (int) VH_pciBus.get(this.segment(), 0L, 0L); }
    public int pciDevice() { return (int) VH_pciDevice.get(this.segment(), 0L, 0L); }
    public int pciFunction() { return (int) VH_pciFunction.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDomainAt(long index, int value) { VH_pciDomain.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciBusAt(long index, int value) { VH_pciBus.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDeviceAt(long index, int value) { VH_pciDevice.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciFunctionAt(long index, int value) { VH_pciFunction.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDomain(int value) { VH_pciDomain.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciBus(int value) { VH_pciBus.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDevice(int value) { VH_pciDevice.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciFunction(int value) { VH_pciFunction.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pciDomainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pciDomain, index), LAYOUT_pciDomain); }
    public MemorySegment _pciDomain() { return _pciDomainAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciDomainAt(long index, MemorySegment src) { _pciDomainAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciDomain(MemorySegment src) { return _pciDomainAt(0L, src); }
    public MemorySegment _pciBusAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pciBus, index), LAYOUT_pciBus); }
    public MemorySegment _pciBus() { return _pciBusAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciBusAt(long index, MemorySegment src) { _pciBusAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciBus(MemorySegment src) { return _pciBusAt(0L, src); }
    public MemorySegment _pciDeviceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pciDevice, index), LAYOUT_pciDevice); }
    public MemorySegment _pciDevice() { return _pciDeviceAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciDeviceAt(long index, MemorySegment src) { _pciDeviceAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciDevice(MemorySegment src) { return _pciDeviceAt(0L, src); }
    public MemorySegment _pciFunctionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pciFunction, index), LAYOUT_pciFunction); }
    public MemorySegment _pciFunction() { return _pciFunctionAt(0L); }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciFunctionAt(long index, MemorySegment src) { _pciFunctionAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePCIBusInfoPropertiesEXT _pciFunction(MemorySegment src) { return _pciFunctionAt(0L, src); }
}
