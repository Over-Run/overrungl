// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxExecutionGraphDepth;
///     uint32_t maxExecutionGraphShaderOutputNodes;
///     uint32_t maxExecutionGraphShaderPayloadSize;
///     uint32_t maxExecutionGraphShaderPayloadCount;
///     uint32_t executionGraphDispatchAddressAlignment;
///     uint32_t maxExecutionGraphWorkgroupCount[3];
///     uint32_t maxExecutionGraphWorkgroups;
/// }
/// ```
public final class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphDepth"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderOutputNodes"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadCount"),
        ValueLayout.JAVA_INT.withName("executionGraphDispatchAddressAlignment"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxExecutionGraphWorkgroupCount"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroups")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxExecutionGraphDepth = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphDepth"));
    public static final long OFFSET_maxExecutionGraphShaderOutputNodes = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    public static final long OFFSET_maxExecutionGraphShaderPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    public static final long OFFSET_maxExecutionGraphShaderPayloadCount = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    public static final long OFFSET_executionGraphDispatchAddressAlignment = LAYOUT.byteOffset(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    public static final long OFFSET_maxExecutionGraphWorkgroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    public static final long OFFSET_maxExecutionGraphWorkgroups = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphWorkgroups"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphDepth = LAYOUT.select(PathElement.groupElement("maxExecutionGraphDepth"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderOutputNodes = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderPayloadSize = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderPayloadCount = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    public static final MemoryLayout LAYOUT_executionGraphDispatchAddressAlignment = LAYOUT.select(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphWorkgroupCount = LAYOUT.select(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    public static final MemoryLayout LAYOUT_maxExecutionGraphWorkgroups = LAYOUT.select(PathElement.groupElement("maxExecutionGraphWorkgroups"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxExecutionGraphDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphDepth"));
    public static final VarHandle VH_maxExecutionGraphShaderOutputNodes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    public static final VarHandle VH_maxExecutionGraphShaderPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    public static final VarHandle VH_maxExecutionGraphShaderPayloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    public static final VarHandle VH_executionGraphDispatchAddressAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    public static final VarHandle VH_maxExecutionGraphWorkgroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphWorkgroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_maxExecutionGraphWorkgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphWorkgroups"));

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX); }
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
        return s;
    }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX copyFrom(VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX reinterpret(long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX asSlice(long index) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX asSlice(long index, long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX at(long index, Consumer<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxExecutionGraphDepthAt(long index) { return (int) VH_maxExecutionGraphDepth.get(this.segment(), 0L, index); }
    public int maxExecutionGraphShaderOutputNodesAt(long index) { return (int) VH_maxExecutionGraphShaderOutputNodes.get(this.segment(), 0L, index); }
    public int maxExecutionGraphShaderPayloadSizeAt(long index) { return (int) VH_maxExecutionGraphShaderPayloadSize.get(this.segment(), 0L, index); }
    public int maxExecutionGraphShaderPayloadCountAt(long index) { return (int) VH_maxExecutionGraphShaderPayloadCount.get(this.segment(), 0L, index); }
    public int executionGraphDispatchAddressAlignmentAt(long index) { return (int) VH_executionGraphDispatchAddressAlignment.get(this.segment(), 0L, index); }
    public int maxExecutionGraphWorkgroupCountAt(long index, long index0) { return (int) VH_maxExecutionGraphWorkgroupCount.get(this.segment(), 0L, index, index0); }
    public int maxExecutionGraphWorkgroupsAt(long index) { return (int) VH_maxExecutionGraphWorkgroups.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxExecutionGraphDepth() { return (int) VH_maxExecutionGraphDepth.get(this.segment(), 0L, 0L); }
    public int maxExecutionGraphShaderOutputNodes() { return (int) VH_maxExecutionGraphShaderOutputNodes.get(this.segment(), 0L, 0L); }
    public int maxExecutionGraphShaderPayloadSize() { return (int) VH_maxExecutionGraphShaderPayloadSize.get(this.segment(), 0L, 0L); }
    public int maxExecutionGraphShaderPayloadCount() { return (int) VH_maxExecutionGraphShaderPayloadCount.get(this.segment(), 0L, 0L); }
    public int executionGraphDispatchAddressAlignment() { return (int) VH_executionGraphDispatchAddressAlignment.get(this.segment(), 0L, 0L); }
    public int maxExecutionGraphWorkgroupCount(long index0) { return (int) VH_maxExecutionGraphWorkgroupCount.get(this.segment(), 0L, 0L, index0); }
    public int maxExecutionGraphWorkgroups() { return (int) VH_maxExecutionGraphWorkgroups.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepthAt(long index, int value) { VH_maxExecutionGraphDepth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodesAt(long index, int value) { VH_maxExecutionGraphShaderOutputNodes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSizeAt(long index, int value) { VH_maxExecutionGraphShaderPayloadSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCountAt(long index, int value) { VH_maxExecutionGraphShaderPayloadCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignmentAt(long index, int value) { VH_executionGraphDispatchAddressAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCountAt(long index, long index0, int value) { VH_maxExecutionGraphWorkgroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupsAt(long index, int value) { VH_maxExecutionGraphWorkgroups.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepth(int value) { VH_maxExecutionGraphDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodes(int value) { VH_maxExecutionGraphShaderOutputNodes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSize(int value) { VH_maxExecutionGraphShaderPayloadSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCount(int value) { VH_maxExecutionGraphShaderPayloadCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignment(int value) { VH_executionGraphDispatchAddressAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCount(long index0, int value) { VH_maxExecutionGraphWorkgroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroups(int value) { VH_maxExecutionGraphWorkgroups.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxExecutionGraphDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphDepth, index), LAYOUT_maxExecutionGraphDepth); }
    public MemorySegment _maxExecutionGraphDepth() { return _maxExecutionGraphDepthAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphDepthAt(long index, MemorySegment src) { _maxExecutionGraphDepthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphDepth(MemorySegment src) { return _maxExecutionGraphDepthAt(0L, src); }
    public MemorySegment _maxExecutionGraphShaderOutputNodesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphShaderOutputNodes, index), LAYOUT_maxExecutionGraphShaderOutputNodes); }
    public MemorySegment _maxExecutionGraphShaderOutputNodes() { return _maxExecutionGraphShaderOutputNodesAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderOutputNodesAt(long index, MemorySegment src) { _maxExecutionGraphShaderOutputNodesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderOutputNodes(MemorySegment src) { return _maxExecutionGraphShaderOutputNodesAt(0L, src); }
    public MemorySegment _maxExecutionGraphShaderPayloadSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphShaderPayloadSize, index), LAYOUT_maxExecutionGraphShaderPayloadSize); }
    public MemorySegment _maxExecutionGraphShaderPayloadSize() { return _maxExecutionGraphShaderPayloadSizeAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderPayloadSizeAt(long index, MemorySegment src) { _maxExecutionGraphShaderPayloadSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderPayloadSize(MemorySegment src) { return _maxExecutionGraphShaderPayloadSizeAt(0L, src); }
    public MemorySegment _maxExecutionGraphShaderPayloadCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphShaderPayloadCount, index), LAYOUT_maxExecutionGraphShaderPayloadCount); }
    public MemorySegment _maxExecutionGraphShaderPayloadCount() { return _maxExecutionGraphShaderPayloadCountAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderPayloadCountAt(long index, MemorySegment src) { _maxExecutionGraphShaderPayloadCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphShaderPayloadCount(MemorySegment src) { return _maxExecutionGraphShaderPayloadCountAt(0L, src); }
    public MemorySegment _executionGraphDispatchAddressAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_executionGraphDispatchAddressAlignment, index), LAYOUT_executionGraphDispatchAddressAlignment); }
    public MemorySegment _executionGraphDispatchAddressAlignment() { return _executionGraphDispatchAddressAlignmentAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _executionGraphDispatchAddressAlignmentAt(long index, MemorySegment src) { _executionGraphDispatchAddressAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _executionGraphDispatchAddressAlignment(MemorySegment src) { return _executionGraphDispatchAddressAlignmentAt(0L, src); }
    public MemorySegment _maxExecutionGraphWorkgroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroupCount, index), LAYOUT_maxExecutionGraphWorkgroupCount); }
    public MemorySegment _maxExecutionGraphWorkgroupCount() { return _maxExecutionGraphWorkgroupCountAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphWorkgroupCountAt(long index, MemorySegment src) { _maxExecutionGraphWorkgroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphWorkgroupCount(MemorySegment src) { return _maxExecutionGraphWorkgroupCountAt(0L, src); }
    public MemorySegment _maxExecutionGraphWorkgroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroups, index), LAYOUT_maxExecutionGraphWorkgroups); }
    public MemorySegment _maxExecutionGraphWorkgroups() { return _maxExecutionGraphWorkgroupsAt(0L); }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphWorkgroupsAt(long index, MemorySegment src) { _maxExecutionGraphWorkgroupsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX _maxExecutionGraphWorkgroups(MemorySegment src) { return _maxExecutionGraphWorkgroupsAt(0L, src); }
}
