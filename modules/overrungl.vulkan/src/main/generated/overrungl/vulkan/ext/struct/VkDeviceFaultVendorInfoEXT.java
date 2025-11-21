// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceFaultVendorInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultVendorInfoEXT {
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     uint64_t vendorFaultCode;
///     uint64_t vendorFaultData;
/// }
/// ```
public final class VkDeviceFaultVendorInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_vendorFaultCode = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultCode"));
    public static final long OFFSET_vendorFaultData = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultData"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_vendorFaultCode = LAYOUT.select(PathElement.groupElement("vendorFaultCode"));
    public static final MemoryLayout LAYOUT_vendorFaultData = LAYOUT.select(PathElement.groupElement("vendorFaultData"));
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_vendorFaultCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultCode"));
    public static final VarHandle VH_vendorFaultData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultData"));

    public VkDeviceFaultVendorInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceFaultVendorInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDeviceFaultVendorInfoEXT copyFrom(VkDeviceFaultVendorInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceFaultVendorInfoEXT reinterpret(long count) { return new VkDeviceFaultVendorInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceFaultVendorInfoEXT asSlice(long index) { return new VkDeviceFaultVendorInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceFaultVendorInfoEXT asSlice(long index, long count) { return new VkDeviceFaultVendorInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceFaultVendorInfoEXT at(long index, Consumer<VkDeviceFaultVendorInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public long vendorFaultCodeAt(long index) { return (long) VH_vendorFaultCode.get(this.segment(), 0L, index); }
    public long vendorFaultDataAt(long index) { return (long) VH_vendorFaultData.get(this.segment(), 0L, index); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public long vendorFaultCode() { return (long) VH_vendorFaultCode.get(this.segment(), 0L, 0L); }
    public long vendorFaultData() { return (long) VH_vendorFaultData.get(this.segment(), 0L, 0L); }
    public VkDeviceFaultVendorInfoEXT descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDeviceFaultVendorInfoEXT vendorFaultCodeAt(long index, long value) { VH_vendorFaultCode.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorInfoEXT vendorFaultDataAt(long index, long value) { VH_vendorFaultData.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorInfoEXT description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(long value) { VH_vendorFaultCode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorInfoEXT vendorFaultData(long value) { VH_vendorFaultData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkDeviceFaultVendorInfoEXT _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorInfoEXT _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _vendorFaultCodeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorFaultCode, index), LAYOUT_vendorFaultCode); }
    public MemorySegment _vendorFaultCode() { return _vendorFaultCodeAt(0L); }
    public VkDeviceFaultVendorInfoEXT _vendorFaultCodeAt(long index, MemorySegment src) { _vendorFaultCodeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorInfoEXT _vendorFaultCode(MemorySegment src) { return _vendorFaultCodeAt(0L, src); }
    public MemorySegment _vendorFaultDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorFaultData, index), LAYOUT_vendorFaultData); }
    public MemorySegment _vendorFaultData() { return _vendorFaultDataAt(0L); }
    public VkDeviceFaultVendorInfoEXT _vendorFaultDataAt(long index, MemorySegment src) { _vendorFaultDataAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorInfoEXT _vendorFaultData(MemorySegment src) { return _vendorFaultDataAt(0L, src); }
}
