// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceFaultAddressInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultAddressInfoEXT {
///     VkDeviceFaultAddressTypeEXT addressType;
///     VkDeviceAddress reportedAddress;
///     VkDeviceSize addressPrecision;
/// }
/// ```
public final class VkDeviceFaultAddressInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("addressType"),
        ValueLayout.JAVA_LONG.withName("reportedAddress"),
        ValueLayout.JAVA_LONG.withName("addressPrecision")
    );
    public static final long OFFSET_addressType = LAYOUT.byteOffset(PathElement.groupElement("addressType"));
    public static final long OFFSET_reportedAddress = LAYOUT.byteOffset(PathElement.groupElement("reportedAddress"));
    public static final long OFFSET_addressPrecision = LAYOUT.byteOffset(PathElement.groupElement("addressPrecision"));
    public static final MemoryLayout LAYOUT_addressType = LAYOUT.select(PathElement.groupElement("addressType"));
    public static final MemoryLayout LAYOUT_reportedAddress = LAYOUT.select(PathElement.groupElement("reportedAddress"));
    public static final MemoryLayout LAYOUT_addressPrecision = LAYOUT.select(PathElement.groupElement("addressPrecision"));
    public static final VarHandle VH_addressType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressType"));
    public static final VarHandle VH_reportedAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportedAddress"));
    public static final VarHandle VH_addressPrecision = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressPrecision"));

    public VkDeviceFaultAddressInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceFaultAddressInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceFaultAddressInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceFaultAddressInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultAddressInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceFaultAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultAddressInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceFaultAddressInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultAddressInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDeviceFaultAddressInfoEXT copyFrom(VkDeviceFaultAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceFaultAddressInfoEXT reinterpret(long count) { return new VkDeviceFaultAddressInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceFaultAddressInfoEXT asSlice(long index) { return new VkDeviceFaultAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceFaultAddressInfoEXT asSlice(long index, long count) { return new VkDeviceFaultAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceFaultAddressInfoEXT at(long index, Consumer<VkDeviceFaultAddressInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int addressTypeAt(long index) { return (int) VH_addressType.get(this.segment(), 0L, index); }
    public long reportedAddressAt(long index) { return (long) VH_reportedAddress.get(this.segment(), 0L, index); }
    public long addressPrecisionAt(long index) { return (long) VH_addressPrecision.get(this.segment(), 0L, index); }
    public int addressType() { return (int) VH_addressType.get(this.segment(), 0L, 0L); }
    public long reportedAddress() { return (long) VH_reportedAddress.get(this.segment(), 0L, 0L); }
    public long addressPrecision() { return (long) VH_addressPrecision.get(this.segment(), 0L, 0L); }
    public VkDeviceFaultAddressInfoEXT addressTypeAt(long index, int value) { VH_addressType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultAddressInfoEXT reportedAddressAt(long index, long value) { VH_reportedAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultAddressInfoEXT addressPrecisionAt(long index, long value) { VH_addressPrecision.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultAddressInfoEXT addressType(int value) { VH_addressType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultAddressInfoEXT reportedAddress(long value) { VH_reportedAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultAddressInfoEXT addressPrecision(long value) { VH_addressPrecision.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _addressTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressType, index), LAYOUT_addressType); }
    public MemorySegment _addressType() { return _addressTypeAt(0L); }
    public VkDeviceFaultAddressInfoEXT _addressTypeAt(long index, MemorySegment src) { _addressTypeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultAddressInfoEXT _addressType(MemorySegment src) { return _addressTypeAt(0L, src); }
    public MemorySegment _reportedAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reportedAddress, index), LAYOUT_reportedAddress); }
    public MemorySegment _reportedAddress() { return _reportedAddressAt(0L); }
    public VkDeviceFaultAddressInfoEXT _reportedAddressAt(long index, MemorySegment src) { _reportedAddressAt(index).copyFrom(src); return this; }
    public VkDeviceFaultAddressInfoEXT _reportedAddress(MemorySegment src) { return _reportedAddressAt(0L, src); }
    public MemorySegment _addressPrecisionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressPrecision, index), LAYOUT_addressPrecision); }
    public MemorySegment _addressPrecision() { return _addressPrecisionAt(0L); }
    public VkDeviceFaultAddressInfoEXT _addressPrecisionAt(long index, MemorySegment src) { _addressPrecisionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultAddressInfoEXT _addressPrecision(MemorySegment src) { return _addressPrecisionAt(0L, src); }
}
