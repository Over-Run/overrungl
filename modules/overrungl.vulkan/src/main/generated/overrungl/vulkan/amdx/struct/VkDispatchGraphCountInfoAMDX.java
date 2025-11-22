// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDispatchGraphCountInfoAMDX`.
/// ## Layout
/// ```
/// struct VkDispatchGraphCountInfoAMDX {
///     uint32_t count;
///     VkDeviceOrHostAddressConstAMDX infos;
///     uint64_t stride;
/// }
/// ```
public final class VkDispatchGraphCountInfoAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    public static final long OFFSET_infos = LAYOUT.byteOffset(PathElement.groupElement("infos"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    public static final MemoryLayout LAYOUT_infos = LAYOUT.select(PathElement.groupElement("infos"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    public static final VarHandle VH_infos$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("infos"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_infos$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("infos"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    public VkDispatchGraphCountInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDispatchGraphCountInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkDispatchGraphCountInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDispatchGraphCountInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDispatchGraphCountInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphCountInfoAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkDispatchGraphCountInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkDispatchGraphCountInfoAMDX(allocator.allocate(LAYOUT, count), count); }
    public VkDispatchGraphCountInfoAMDX copyFrom(VkDispatchGraphCountInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDispatchGraphCountInfoAMDX reinterpret(long count) { return new VkDispatchGraphCountInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDispatchGraphCountInfoAMDX asSlice(long index) { return new VkDispatchGraphCountInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDispatchGraphCountInfoAMDX asSlice(long index, long count) { return new VkDispatchGraphCountInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDispatchGraphCountInfoAMDX at(long index, Consumer<VkDispatchGraphCountInfoAMDX> func) { func.accept(asSlice(index)); return this; }
    public int countAt(long index) { return (int) VH_count.get(this.segment(), 0L, index); }
    public long infos$deviceAddressAt(long index) { return (long) VH_infos$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment infos$hostAddressAt(long index) { return (MemorySegment) VH_infos$hostAddress.get(this.segment(), 0L, index); }
    public long strideAt(long index) { return (long) VH_stride.get(this.segment(), 0L, index); }
    public int count() { return (int) VH_count.get(this.segment(), 0L, 0L); }
    public long infos$deviceAddress() { return (long) VH_infos$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment infos$hostAddress() { return (MemorySegment) VH_infos$hostAddress.get(this.segment(), 0L, 0L); }
    public long stride() { return (long) VH_stride.get(this.segment(), 0L, 0L); }
    public VkDispatchGraphCountInfoAMDX countAt(long index, int value) { VH_count.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphCountInfoAMDX infos$deviceAddressAt(long index, long value) { VH_infos$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphCountInfoAMDX infos$hostAddressAt(long index, MemorySegment value) { VH_infos$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphCountInfoAMDX strideAt(long index, long value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphCountInfoAMDX count(int value) { VH_count.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphCountInfoAMDX infos$deviceAddress(long value) { VH_infos$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphCountInfoAMDX infos$hostAddress(MemorySegment value) { VH_infos$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphCountInfoAMDX stride(long value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _countAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_count, index), LAYOUT_count); }
    public MemorySegment _count() { return _countAt(0L); }
    public VkDispatchGraphCountInfoAMDX _countAt(long index, MemorySegment src) { _countAt(index).copyFrom(src); return this; }
    public VkDispatchGraphCountInfoAMDX _count(MemorySegment src) { return _countAt(0L, src); }
    public MemorySegment _infosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_infos, index), LAYOUT_infos); }
    public MemorySegment _infos() { return _infosAt(0L); }
    public VkDispatchGraphCountInfoAMDX _infosAt(long index, MemorySegment src) { _infosAt(index).copyFrom(src); return this; }
    public VkDispatchGraphCountInfoAMDX _infos(MemorySegment src) { return _infosAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkDispatchGraphCountInfoAMDX _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkDispatchGraphCountInfoAMDX _stride(MemorySegment src) { return _strideAt(0L, src); }
}
