// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalDeviceInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalDeviceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     MTLDevice_id mtlDevice;
/// }
/// ```
public final class VkExportMetalDeviceInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlDevice")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mtlDevice = LAYOUT.byteOffset(PathElement.groupElement("mtlDevice"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mtlDevice = LAYOUT.select(PathElement.groupElement("mtlDevice"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mtlDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlDevice"));

    public VkExportMetalDeviceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalDeviceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalDeviceInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalDeviceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalDeviceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalDeviceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalDeviceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalDeviceInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalDeviceInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalDeviceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalDeviceInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalDeviceInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT); }
    public static VkExportMetalDeviceInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT);
        return s;
    }
    public VkExportMetalDeviceInfoEXT copyFrom(VkExportMetalDeviceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalDeviceInfoEXT reinterpret(long count) { return new VkExportMetalDeviceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalDeviceInfoEXT asSlice(long index) { return new VkExportMetalDeviceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalDeviceInfoEXT asSlice(long index, long count) { return new VkExportMetalDeviceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalDeviceInfoEXT at(long index, Consumer<VkExportMetalDeviceInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment mtlDeviceAt(long index) { return (MemorySegment) VH_mtlDevice.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlDevice() { return (MemorySegment) VH_mtlDevice.get(this.segment(), 0L, 0L); }
    public VkExportMetalDeviceInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalDeviceInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalDeviceInfoEXT mtlDeviceAt(long index, MemorySegment value) { VH_mtlDevice.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalDeviceInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalDeviceInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalDeviceInfoEXT mtlDevice(MemorySegment value) { VH_mtlDevice.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalDeviceInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalDeviceInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalDeviceInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalDeviceInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mtlDeviceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlDevice, index), LAYOUT_mtlDevice); }
    public MemorySegment _mtlDevice() { return _mtlDeviceAt(0L); }
    public VkExportMetalDeviceInfoEXT _mtlDeviceAt(long index, MemorySegment src) { _mtlDeviceAt(index).copyFrom(src); return this; }
    public VkExportMetalDeviceInfoEXT _mtlDevice(MemorySegment src) { return _mtlDeviceAt(0L, src); }
}
