// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureGetTemplateIndicesInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureGetTemplateIndicesInfoNV {
///     VkDeviceAddress clusterTemplateAddress;
/// }
/// ```
public final class VkClusterAccelerationStructureGetTemplateIndicesInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("clusterTemplateAddress")
    );
    public static final long OFFSET_clusterTemplateAddress = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateAddress"));
    public static final MemoryLayout LAYOUT_clusterTemplateAddress = LAYOUT.select(PathElement.groupElement("clusterTemplateAddress"));
    public static final VarHandle VH_clusterTemplateAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateAddress"));

    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(allocator.allocate(LAYOUT, count), count); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV copyFrom(VkClusterAccelerationStructureGetTemplateIndicesInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV asSlice(long index) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV at(long index, Consumer<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> func) { func.accept(asSlice(index)); return this; }
    public long clusterTemplateAddressAt(long index) { return (long) VH_clusterTemplateAddress.get(this.segment(), 0L, index); }
    public long clusterTemplateAddress() { return (long) VH_clusterTemplateAddress.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddressAt(long index, long value) { VH_clusterTemplateAddress.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddress(long value) { VH_clusterTemplateAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _clusterTemplateAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterTemplateAddress, index), LAYOUT_clusterTemplateAddress); }
    public MemorySegment _clusterTemplateAddress() { return _clusterTemplateAddressAt(0L); }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV _clusterTemplateAddressAt(long index, MemorySegment src) { _clusterTemplateAddressAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV _clusterTemplateAddress(MemorySegment src) { return _clusterTemplateAddressAt(0L, src); }
}
