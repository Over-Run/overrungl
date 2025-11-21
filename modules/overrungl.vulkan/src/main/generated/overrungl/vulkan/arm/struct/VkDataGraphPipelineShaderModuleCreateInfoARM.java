// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineShaderModuleCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineShaderModuleCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderModule module;
///     const char* pName;
///     const VkSpecializationInfo* pSpecializationInfo;
///     uint32_t constantCount;
///     const VkDataGraphPipelineConstantARM* pConstants;
/// }
/// ```
public final class VkDataGraphPipelineShaderModuleCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo"),
        ValueLayout.JAVA_INT.withName("constantCount"),
        ValueLayout.ADDRESS.withName("pConstants")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    public static final long OFFSET_constantCount = LAYOUT.byteOffset(PathElement.groupElement("constantCount"));
    public static final long OFFSET_pConstants = LAYOUT.byteOffset(PathElement.groupElement("pConstants"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    public static final MemoryLayout LAYOUT_constantCount = LAYOUT.select(PathElement.groupElement("constantCount"));
    public static final MemoryLayout LAYOUT_pConstants = LAYOUT.select(PathElement.groupElement("pConstants"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));
    public static final VarHandle VH_constantCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantCount"));
    public static final VarHandle VH_pConstants = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pConstants"));

    public VkDataGraphPipelineShaderModuleCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM); }
    public static VkDataGraphPipelineShaderModuleCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineShaderModuleCreateInfoARM copyFrom(VkDataGraphPipelineShaderModuleCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineShaderModuleCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM at(long index, Consumer<VkDataGraphPipelineShaderModuleCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long moduleAt(long index) { return (long) VH_module.get(this.segment(), 0L, index); }
    public MemorySegment pNameAt(long index) { return (MemorySegment) VH_pName.get(this.segment(), 0L, index); }
    public MemorySegment pSpecializationInfoAt(long index) { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, index); }
    public int constantCountAt(long index) { return (int) VH_constantCount.get(this.segment(), 0L, index); }
    public MemorySegment pConstantsAt(long index) { return (MemorySegment) VH_pConstants.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long module() { return (long) VH_module.get(this.segment(), 0L, 0L); }
    public MemorySegment pName() { return (MemorySegment) VH_pName.get(this.segment(), 0L, 0L); }
    public MemorySegment pSpecializationInfo() { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, 0L); }
    public int constantCount() { return (int) VH_constantCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pConstants() { return (MemorySegment) VH_pConstants.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM moduleAt(long index, long value) { VH_module.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNameAt(long index, MemorySegment value) { VH_pName.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfoAt(long index, MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCountAt(long index, int value) { VH_constantCount.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstantsAt(long index, MemorySegment value) { VH_pConstants.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM module(long value) { VH_module.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pName(MemorySegment value) { VH_pName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfo(MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCount(int value) { VH_constantCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstants(MemorySegment value) { VH_pConstants.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _moduleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_module, index), LAYOUT_module); }
    public MemorySegment _module() { return _moduleAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _moduleAt(long index, MemorySegment src) { _moduleAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _module(MemorySegment src) { return _moduleAt(0L, src); }
    public MemorySegment _pNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pName, index), LAYOUT_pName); }
    public MemorySegment _pName() { return _pNameAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pNameAt(long index, MemorySegment src) { _pNameAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pName(MemorySegment src) { return _pNameAt(0L, src); }
    public MemorySegment _pSpecializationInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSpecializationInfo, index), LAYOUT_pSpecializationInfo); }
    public MemorySegment _pSpecializationInfo() { return _pSpecializationInfoAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pSpecializationInfoAt(long index, MemorySegment src) { _pSpecializationInfoAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pSpecializationInfo(MemorySegment src) { return _pSpecializationInfoAt(0L, src); }
    public MemorySegment _constantCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantCount, index), LAYOUT_constantCount); }
    public MemorySegment _constantCount() { return _constantCountAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _constantCountAt(long index, MemorySegment src) { _constantCountAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _constantCount(MemorySegment src) { return _constantCountAt(0L, src); }
    public MemorySegment _pConstantsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pConstants, index), LAYOUT_pConstants); }
    public MemorySegment _pConstants() { return _pConstantsAt(0L); }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pConstantsAt(long index, MemorySegment src) { _pConstantsAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineShaderModuleCreateInfoARM _pConstants(MemorySegment src) { return _pConstantsAt(0L, src); }
}
