// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxWorkGroupCount[3];
///     uint32_t maxWorkGroupSize[3];
///     uint32_t maxOutputClusterCount;
///     VkDeviceSize indirectBufferOffsetAlignment;
/// }
/// ```
public final class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupCount"));
    public static final long OFFSET_maxWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupSize"));
    public static final long OFFSET_maxOutputClusterCount = LAYOUT.byteOffset(PathElement.groupElement("maxOutputClusterCount"));
    public static final long OFFSET_indirectBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("indirectBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxWorkGroupCount"));
    public static final MemoryLayout LAYOUT_maxWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxWorkGroupSize"));
    public static final MemoryLayout LAYOUT_maxOutputClusterCount = LAYOUT.select(PathElement.groupElement("maxOutputClusterCount"));
    public static final MemoryLayout LAYOUT_indirectBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("indirectBufferOffsetAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_maxWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_maxOutputClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOutputClusterCount"));
    public static final VarHandle VH_indirectBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectBufferOffsetAlignment"));

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI); }
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI at(long index, Consumer<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxWorkGroupCountAt(long index, long index0) { return (int) VH_maxWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int maxWorkGroupSizeAt(long index, long index0) { return (int) VH_maxWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int maxOutputClusterCountAt(long index) { return (int) VH_maxOutputClusterCount.get(this.segment(), 0L, index); }
    public long indirectBufferOffsetAlignmentAt(long index) { return (long) VH_indirectBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxWorkGroupCount(long index0) { return (int) VH_maxWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int maxWorkGroupSize(long index0) { return (int) VH_maxWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int maxOutputClusterCount() { return (int) VH_maxOutputClusterCount.get(this.segment(), 0L, 0L); }
    public long indirectBufferOffsetAlignment() { return (long) VH_indirectBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCountAt(long index, long index0, int value) { VH_maxWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSizeAt(long index, long index0, int value) { VH_maxWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCountAt(long index, int value) { VH_maxOutputClusterCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignmentAt(long index, long value) { VH_indirectBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(long index0, int value) { VH_maxWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(long index0, int value) { VH_maxWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCount(int value) { VH_maxOutputClusterCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignment(long value) { VH_indirectBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxWorkGroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxWorkGroupCount, index), LAYOUT_maxWorkGroupCount); }
    public MemorySegment _maxWorkGroupCount() { return _maxWorkGroupCountAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxWorkGroupCountAt(long index, MemorySegment src) { _maxWorkGroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxWorkGroupCount(MemorySegment src) { return _maxWorkGroupCountAt(0L, src); }
    public MemorySegment _maxWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxWorkGroupSize, index), LAYOUT_maxWorkGroupSize); }
    public MemorySegment _maxWorkGroupSize() { return _maxWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxWorkGroupSizeAt(long index, MemorySegment src) { _maxWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxWorkGroupSize(MemorySegment src) { return _maxWorkGroupSizeAt(0L, src); }
    public MemorySegment _maxOutputClusterCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxOutputClusterCount, index), LAYOUT_maxOutputClusterCount); }
    public MemorySegment _maxOutputClusterCount() { return _maxOutputClusterCountAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxOutputClusterCountAt(long index, MemorySegment src) { _maxOutputClusterCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _maxOutputClusterCount(MemorySegment src) { return _maxOutputClusterCountAt(0L, src); }
    public MemorySegment _indirectBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectBufferOffsetAlignment, index), LAYOUT_indirectBufferOffsetAlignment); }
    public MemorySegment _indirectBufferOffsetAlignment() { return _indirectBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _indirectBufferOffsetAlignmentAt(long index, MemorySegment src) { _indirectBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI _indirectBufferOffsetAlignment(MemorySegment src) { return _indirectBufferOffsetAlignmentAt(0L, src); }
}
