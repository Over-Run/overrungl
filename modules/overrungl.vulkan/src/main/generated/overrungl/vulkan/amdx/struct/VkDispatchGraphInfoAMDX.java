// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDispatchGraphInfoAMDX`.
/// ## Layout
/// ```
/// struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex;
///     uint32_t payloadCount;
///     VkDeviceOrHostAddressConstAMDX payloads;
///     uint64_t payloadStride;
/// }
/// ```
public final class VkDispatchGraphInfoAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("nodeIndex"),
        ValueLayout.JAVA_INT.withName("payloadCount"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads"),
        ValueLayout.JAVA_LONG.withName("payloadStride")
    );
    public static final long OFFSET_nodeIndex = LAYOUT.byteOffset(PathElement.groupElement("nodeIndex"));
    public static final long OFFSET_payloadCount = LAYOUT.byteOffset(PathElement.groupElement("payloadCount"));
    public static final long OFFSET_payloads = LAYOUT.byteOffset(PathElement.groupElement("payloads"));
    public static final long OFFSET_payloadStride = LAYOUT.byteOffset(PathElement.groupElement("payloadStride"));
    public static final MemoryLayout LAYOUT_nodeIndex = LAYOUT.select(PathElement.groupElement("nodeIndex"));
    public static final MemoryLayout LAYOUT_payloadCount = LAYOUT.select(PathElement.groupElement("payloadCount"));
    public static final MemoryLayout LAYOUT_payloads = LAYOUT.select(PathElement.groupElement("payloads"));
    public static final MemoryLayout LAYOUT_payloadStride = LAYOUT.select(PathElement.groupElement("payloadStride"));
    public static final VarHandle VH_nodeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nodeIndex"));
    public static final VarHandle VH_payloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadCount"));
    public static final VarHandle VH_payloads$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloads"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_payloads$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloads"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_payloadStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadStride"));

    public VkDispatchGraphInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDispatchGraphInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkDispatchGraphInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDispatchGraphInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDispatchGraphInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphInfoAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkDispatchGraphInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkDispatchGraphInfoAMDX(allocator.allocate(LAYOUT, count), count); }
    public VkDispatchGraphInfoAMDX copyFrom(VkDispatchGraphInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDispatchGraphInfoAMDX reinterpret(long count) { return new VkDispatchGraphInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDispatchGraphInfoAMDX asSlice(long index) { return new VkDispatchGraphInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDispatchGraphInfoAMDX asSlice(long index, long count) { return new VkDispatchGraphInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDispatchGraphInfoAMDX at(long index, Consumer<VkDispatchGraphInfoAMDX> func) { func.accept(asSlice(index)); return this; }
    public int nodeIndexAt(long index) { return (int) VH_nodeIndex.get(this.segment(), 0L, index); }
    public int payloadCountAt(long index) { return (int) VH_payloadCount.get(this.segment(), 0L, index); }
    public long payloads$deviceAddressAt(long index) { return (long) VH_payloads$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment payloads$hostAddressAt(long index) { return (MemorySegment) VH_payloads$hostAddress.get(this.segment(), 0L, index); }
    public long payloadStrideAt(long index) { return (long) VH_payloadStride.get(this.segment(), 0L, index); }
    public int nodeIndex() { return (int) VH_nodeIndex.get(this.segment(), 0L, 0L); }
    public int payloadCount() { return (int) VH_payloadCount.get(this.segment(), 0L, 0L); }
    public long payloads$deviceAddress() { return (long) VH_payloads$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment payloads$hostAddress() { return (MemorySegment) VH_payloads$hostAddress.get(this.segment(), 0L, 0L); }
    public long payloadStride() { return (long) VH_payloadStride.get(this.segment(), 0L, 0L); }
    public VkDispatchGraphInfoAMDX nodeIndexAt(long index, int value) { VH_nodeIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphInfoAMDX payloadCountAt(long index, int value) { VH_payloadCount.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphInfoAMDX payloads$deviceAddressAt(long index, long value) { VH_payloads$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphInfoAMDX payloads$hostAddressAt(long index, MemorySegment value) { VH_payloads$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphInfoAMDX payloadStrideAt(long index, long value) { VH_payloadStride.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchGraphInfoAMDX nodeIndex(int value) { VH_nodeIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphInfoAMDX payloadCount(int value) { VH_payloadCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphInfoAMDX payloads$deviceAddress(long value) { VH_payloads$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphInfoAMDX payloads$hostAddress(MemorySegment value) { VH_payloads$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchGraphInfoAMDX payloadStride(long value) { VH_payloadStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _nodeIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nodeIndex, index), LAYOUT_nodeIndex); }
    public MemorySegment _nodeIndex() { return _nodeIndexAt(0L); }
    public VkDispatchGraphInfoAMDX _nodeIndexAt(long index, MemorySegment src) { _nodeIndexAt(index).copyFrom(src); return this; }
    public VkDispatchGraphInfoAMDX _nodeIndex(MemorySegment src) { return _nodeIndexAt(0L, src); }
    public MemorySegment _payloadCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_payloadCount, index), LAYOUT_payloadCount); }
    public MemorySegment _payloadCount() { return _payloadCountAt(0L); }
    public VkDispatchGraphInfoAMDX _payloadCountAt(long index, MemorySegment src) { _payloadCountAt(index).copyFrom(src); return this; }
    public VkDispatchGraphInfoAMDX _payloadCount(MemorySegment src) { return _payloadCountAt(0L, src); }
    public MemorySegment _payloadsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_payloads, index), LAYOUT_payloads); }
    public MemorySegment _payloads() { return _payloadsAt(0L); }
    public VkDispatchGraphInfoAMDX _payloadsAt(long index, MemorySegment src) { _payloadsAt(index).copyFrom(src); return this; }
    public VkDispatchGraphInfoAMDX _payloads(MemorySegment src) { return _payloadsAt(0L, src); }
    public MemorySegment _payloadStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_payloadStride, index), LAYOUT_payloadStride); }
    public MemorySegment _payloadStride() { return _payloadStrideAt(0L); }
    public VkDispatchGraphInfoAMDX _payloadStrideAt(long index, MemorySegment src) { _payloadStrideAt(index).copyFrom(src); return this; }
    public VkDispatchGraphInfoAMDX _payloadStride(MemorySegment src) { return _payloadStrideAt(0L, src); }
}
