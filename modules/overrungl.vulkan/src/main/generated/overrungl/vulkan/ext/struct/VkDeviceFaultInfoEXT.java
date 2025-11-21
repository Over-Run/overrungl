// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceFaultInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     VkDeviceFaultAddressInfoEXT* pAddressInfos;
///     VkDeviceFaultVendorInfoEXT* pVendorInfos;
///     void* pVendorBinaryData;
/// }
/// ```
public final class VkDeviceFaultInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.ADDRESS.withName("pAddressInfos"),
        ValueLayout.ADDRESS.withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_pAddressInfos = LAYOUT.byteOffset(PathElement.groupElement("pAddressInfos"));
    public static final long OFFSET_pVendorInfos = LAYOUT.byteOffset(PathElement.groupElement("pVendorInfos"));
    public static final long OFFSET_pVendorBinaryData = LAYOUT.byteOffset(PathElement.groupElement("pVendorBinaryData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_pAddressInfos = LAYOUT.select(PathElement.groupElement("pAddressInfos"));
    public static final MemoryLayout LAYOUT_pVendorInfos = LAYOUT.select(PathElement.groupElement("pVendorInfos"));
    public static final MemoryLayout LAYOUT_pVendorBinaryData = LAYOUT.select(PathElement.groupElement("pVendorBinaryData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_pAddressInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAddressInfos"));
    public static final VarHandle VH_pVendorInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorInfos"));
    public static final VarHandle VH_pVendorBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorBinaryData"));

    public VkDeviceFaultInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceFaultInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceFaultInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT); }
    public static VkDeviceFaultInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT);
        return s;
    }
    public VkDeviceFaultInfoEXT copyFrom(VkDeviceFaultInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceFaultInfoEXT reinterpret(long count) { return new VkDeviceFaultInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceFaultInfoEXT asSlice(long index) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceFaultInfoEXT asSlice(long index, long count) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceFaultInfoEXT at(long index, Consumer<VkDeviceFaultInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public MemorySegment pAddressInfosAt(long index) { return (MemorySegment) VH_pAddressInfos.get(this.segment(), 0L, index); }
    public MemorySegment pVendorInfosAt(long index) { return (MemorySegment) VH_pVendorInfos.get(this.segment(), 0L, index); }
    public MemorySegment pVendorBinaryDataAt(long index) { return (MemorySegment) VH_pVendorBinaryData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public MemorySegment pAddressInfos() { return (MemorySegment) VH_pAddressInfos.get(this.segment(), 0L, 0L); }
    public MemorySegment pVendorInfos() { return (MemorySegment) VH_pVendorInfos.get(this.segment(), 0L, 0L); }
    public MemorySegment pVendorBinaryData() { return (MemorySegment) VH_pVendorBinaryData.get(this.segment(), 0L, 0L); }
    public VkDeviceFaultInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultInfoEXT descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDeviceFaultInfoEXT pAddressInfosAt(long index, MemorySegment value) { VH_pAddressInfos.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultInfoEXT pVendorInfosAt(long index, MemorySegment value) { VH_pVendorInfos.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultInfoEXT pVendorBinaryDataAt(long index, MemorySegment value) { VH_pVendorBinaryData.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultInfoEXT description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkDeviceFaultInfoEXT pAddressInfos(MemorySegment value) { VH_pAddressInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultInfoEXT pVendorInfos(MemorySegment value) { VH_pVendorInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultInfoEXT pVendorBinaryData(MemorySegment value) { VH_pVendorBinaryData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceFaultInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceFaultInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkDeviceFaultInfoEXT _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _pAddressInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAddressInfos, index), LAYOUT_pAddressInfos); }
    public MemorySegment _pAddressInfos() { return _pAddressInfosAt(0L); }
    public VkDeviceFaultInfoEXT _pAddressInfosAt(long index, MemorySegment src) { _pAddressInfosAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _pAddressInfos(MemorySegment src) { return _pAddressInfosAt(0L, src); }
    public MemorySegment _pVendorInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVendorInfos, index), LAYOUT_pVendorInfos); }
    public MemorySegment _pVendorInfos() { return _pVendorInfosAt(0L); }
    public VkDeviceFaultInfoEXT _pVendorInfosAt(long index, MemorySegment src) { _pVendorInfosAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _pVendorInfos(MemorySegment src) { return _pVendorInfosAt(0L, src); }
    public MemorySegment _pVendorBinaryDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVendorBinaryData, index), LAYOUT_pVendorBinaryData); }
    public MemorySegment _pVendorBinaryData() { return _pVendorBinaryDataAt(0L); }
    public VkDeviceFaultInfoEXT _pVendorBinaryDataAt(long index, MemorySegment src) { _pVendorBinaryDataAt(index).copyFrom(src); return this; }
    public VkDeviceFaultInfoEXT _pVendorBinaryData(MemorySegment src) { return _pVendorBinaryDataAt(0L, src); }
}
