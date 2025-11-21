// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkStridedDeviceAddressNV`.
/// ## Layout
/// ```
/// struct VkStridedDeviceAddressNV {
///     VkDeviceAddress startAddress;
///     VkDeviceSize strideInBytes;
/// }
/// ```
public final class VkStridedDeviceAddressNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("startAddress"),
        ValueLayout.JAVA_LONG.withName("strideInBytes")
    );
    public static final long OFFSET_startAddress = LAYOUT.byteOffset(PathElement.groupElement("startAddress"));
    public static final long OFFSET_strideInBytes = LAYOUT.byteOffset(PathElement.groupElement("strideInBytes"));
    public static final MemoryLayout LAYOUT_startAddress = LAYOUT.select(PathElement.groupElement("startAddress"));
    public static final MemoryLayout LAYOUT_strideInBytes = LAYOUT.select(PathElement.groupElement("strideInBytes"));
    public static final VarHandle VH_startAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("startAddress"));
    public static final VarHandle VH_strideInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("strideInBytes"));

    public VkStridedDeviceAddressNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkStridedDeviceAddressNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkStridedDeviceAddressNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkStridedDeviceAddressNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkStridedDeviceAddressNV alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressNV(allocator.allocate(LAYOUT), 1); }
    public static VkStridedDeviceAddressNV alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressNV(allocator.allocate(LAYOUT, count), count); }
    public VkStridedDeviceAddressNV copyFrom(VkStridedDeviceAddressNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkStridedDeviceAddressNV reinterpret(long count) { return new VkStridedDeviceAddressNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkStridedDeviceAddressNV asSlice(long index) { return new VkStridedDeviceAddressNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkStridedDeviceAddressNV asSlice(long index, long count) { return new VkStridedDeviceAddressNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkStridedDeviceAddressNV at(long index, Consumer<VkStridedDeviceAddressNV> func) { func.accept(asSlice(index)); return this; }
    public long startAddressAt(long index) { return (long) VH_startAddress.get(this.segment(), 0L, index); }
    public long strideInBytesAt(long index) { return (long) VH_strideInBytes.get(this.segment(), 0L, index); }
    public long startAddress() { return (long) VH_startAddress.get(this.segment(), 0L, 0L); }
    public long strideInBytes() { return (long) VH_strideInBytes.get(this.segment(), 0L, 0L); }
    public VkStridedDeviceAddressNV startAddressAt(long index, long value) { VH_startAddress.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressNV strideInBytesAt(long index, long value) { VH_strideInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressNV startAddress(long value) { VH_startAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkStridedDeviceAddressNV strideInBytes(long value) { VH_strideInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _startAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_startAddress, index), LAYOUT_startAddress); }
    public MemorySegment _startAddress() { return _startAddressAt(0L); }
    public VkStridedDeviceAddressNV _startAddressAt(long index, MemorySegment src) { _startAddressAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressNV _startAddress(MemorySegment src) { return _startAddressAt(0L, src); }
    public MemorySegment _strideInBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_strideInBytes, index), LAYOUT_strideInBytes); }
    public MemorySegment _strideInBytes() { return _strideInBytesAt(0L); }
    public VkStridedDeviceAddressNV _strideInBytesAt(long index, MemorySegment src) { _strideInBytesAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressNV _strideInBytes(MemorySegment src) { return _strideInBytesAt(0L, src); }
}
