// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineFragmentDensityMapLayeredCreateInfoVALVE`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentDensityMapLayeredCreateInfoVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxFragmentDensityMapLayers;
/// }
/// ```
public final class VkPipelineFragmentDensityMapLayeredCreateInfoVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentDensityMapLayers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxFragmentDensityMapLayers = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityMapLayers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxFragmentDensityMapLayers = LAYOUT.select(PathElement.groupElement("maxFragmentDensityMapLayers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxFragmentDensityMapLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDensityMapLayers"));

    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE alloc(SegmentAllocator allocator) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE); }
    public static VkPipelineFragmentDensityMapLayeredCreateInfoVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE);
        return s;
    }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE copyFrom(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE reinterpret(long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE asSlice(long index) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE asSlice(long index, long count) { return new VkPipelineFragmentDensityMapLayeredCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE at(long index, Consumer<VkPipelineFragmentDensityMapLayeredCreateInfoVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxFragmentDensityMapLayersAt(long index) { return (int) VH_maxFragmentDensityMapLayers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxFragmentDensityMapLayers() { return (int) VH_maxFragmentDensityMapLayers.get(this.segment(), 0L, 0L); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayersAt(long index, int value) { VH_maxFragmentDensityMapLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE maxFragmentDensityMapLayers(int value) { VH_maxFragmentDensityMapLayers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxFragmentDensityMapLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentDensityMapLayers, index), LAYOUT_maxFragmentDensityMapLayers); }
    public MemorySegment _maxFragmentDensityMapLayers() { return _maxFragmentDensityMapLayersAt(0L); }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _maxFragmentDensityMapLayersAt(long index, MemorySegment src) { _maxFragmentDensityMapLayersAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentDensityMapLayeredCreateInfoVALVE _maxFragmentDensityMapLayers(MemorySegment src) { return _maxFragmentDensityMapLayersAt(0L, src); }
}
