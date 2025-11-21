// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineCompilerControlCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineCompilerControlCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pVendorOptions;
/// }
/// ```
public final class VkDataGraphPipelineCompilerControlCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVendorOptions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pVendorOptions = LAYOUT.byteOffset(PathElement.groupElement("pVendorOptions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pVendorOptions = LAYOUT.select(PathElement.groupElement("pVendorOptions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pVendorOptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorOptions"));

    public VkDataGraphPipelineCompilerControlCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM); }
    public static VkDataGraphPipelineCompilerControlCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineCompilerControlCreateInfoARM copyFrom(VkDataGraphPipelineCompilerControlCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM at(long index, Consumer<VkDataGraphPipelineCompilerControlCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pVendorOptionsAt(long index) { return (MemorySegment) VH_pVendorOptions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pVendorOptions() { return (MemorySegment) VH_pVendorOptions.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptionsAt(long index, MemorySegment value) { VH_pVendorOptions.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptions(MemorySegment value) { VH_pVendorOptions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pVendorOptionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVendorOptions, index), LAYOUT_pVendorOptions); }
    public MemorySegment _pVendorOptions() { return _pVendorOptionsAt(0L); }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _pVendorOptionsAt(long index, MemorySegment src) { _pVendorOptionsAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineCompilerControlCreateInfoARM _pVendorOptions(MemorySegment src) { return _pVendorOptionsAt(0L, src); }
}
