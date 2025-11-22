// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineInputAssemblyStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineInputAssemblyStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineInputAssemblyStateCreateFlags flags;
///     VkPrimitiveTopology topology;
///     VkBool32 primitiveRestartEnable;
/// }
/// ```
public final class VkPipelineInputAssemblyStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("primitiveRestartEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_topology = LAYOUT.byteOffset(PathElement.groupElement("topology"));
    public static final long OFFSET_primitiveRestartEnable = LAYOUT.byteOffset(PathElement.groupElement("primitiveRestartEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_topology = LAYOUT.select(PathElement.groupElement("topology"));
    public static final MemoryLayout LAYOUT_primitiveRestartEnable = LAYOUT.select(PathElement.groupElement("primitiveRestartEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_topology = LAYOUT.arrayElementVarHandle(PathElement.groupElement("topology"));
    public static final VarHandle VH_primitiveRestartEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveRestartEnable"));

    public VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineInputAssemblyStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineInputAssemblyStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineInputAssemblyStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineInputAssemblyStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineInputAssemblyStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineInputAssemblyStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineInputAssemblyStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineInputAssemblyStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO); }
    public static VkPipelineInputAssemblyStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineInputAssemblyStateCreateInfo copyFrom(VkPipelineInputAssemblyStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineInputAssemblyStateCreateInfo reinterpret(long count) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineInputAssemblyStateCreateInfo asSlice(long index) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineInputAssemblyStateCreateInfo asSlice(long index, long count) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineInputAssemblyStateCreateInfo at(long index, Consumer<VkPipelineInputAssemblyStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int topologyAt(long index) { return (int) VH_topology.get(this.segment(), 0L, index); }
    public int primitiveRestartEnableAt(long index) { return (int) VH_primitiveRestartEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int topology() { return (int) VH_topology.get(this.segment(), 0L, 0L); }
    public int primitiveRestartEnable() { return (int) VH_primitiveRestartEnable.get(this.segment(), 0L, 0L); }
    public VkPipelineInputAssemblyStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo topologyAt(long index, int value) { VH_topology.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnableAt(long index, int value) { VH_primitiveRestartEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo topology(int value) { VH_topology.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(int value) { VH_primitiveRestartEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineInputAssemblyStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineInputAssemblyStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineInputAssemblyStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineInputAssemblyStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineInputAssemblyStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineInputAssemblyStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _topologyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_topology, index), LAYOUT_topology); }
    public MemorySegment _topology() { return _topologyAt(0L); }
    public VkPipelineInputAssemblyStateCreateInfo _topologyAt(long index, MemorySegment src) { _topologyAt(index).copyFrom(src); return this; }
    public VkPipelineInputAssemblyStateCreateInfo _topology(MemorySegment src) { return _topologyAt(0L, src); }
    public MemorySegment _primitiveRestartEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveRestartEnable, index), LAYOUT_primitiveRestartEnable); }
    public MemorySegment _primitiveRestartEnable() { return _primitiveRestartEnableAt(0L); }
    public VkPipelineInputAssemblyStateCreateInfo _primitiveRestartEnableAt(long index, MemorySegment src) { _primitiveRestartEnableAt(index).copyFrom(src); return this; }
    public VkPipelineInputAssemblyStateCreateInfo _primitiveRestartEnable(MemorySegment src) { return _primitiveRestartEnableAt(0L, src); }
}
