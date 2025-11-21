// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t identifierSize;
///     const uint8_t* pIdentifier;
/// }
/// ```
public final class VkPipelineShaderStageModuleIdentifierCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withName("pIdentifier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_identifierSize = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
    public static final long OFFSET_pIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pIdentifier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_identifierSize = LAYOUT.select(PathElement.groupElement("identifierSize"));
    public static final MemoryLayout LAYOUT_pIdentifier = LAYOUT.select(PathElement.groupElement("pIdentifier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    public static final VarHandle VH_pIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIdentifier"));

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT); }
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT copyFrom(VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT reinterpret(long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT asSlice(long index) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT asSlice(long index, long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT at(long index, Consumer<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int identifierSizeAt(long index) { return (int) VH_identifierSize.get(this.segment(), 0L, index); }
    public MemorySegment pIdentifierAt(long index) { return (MemorySegment) VH_pIdentifier.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int identifierSize() { return (int) VH_identifierSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pIdentifier() { return (MemorySegment) VH_pIdentifier.get(this.segment(), 0L, 0L); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT identifierSizeAt(long index, int value) { VH_identifierSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifierAt(long index, MemorySegment value) { VH_pIdentifier.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT identifierSize(int value) { VH_identifierSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifier(MemorySegment value) { VH_pIdentifier.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _identifierSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identifierSize, index), LAYOUT_identifierSize); }
    public MemorySegment _identifierSize() { return _identifierSizeAt(0L); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _identifierSizeAt(long index, MemorySegment src) { _identifierSizeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _identifierSize(MemorySegment src) { return _identifierSizeAt(0L, src); }
    public MemorySegment _pIdentifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pIdentifier, index), LAYOUT_pIdentifier); }
    public MemorySegment _pIdentifier() { return _pIdentifierAt(0L); }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _pIdentifierAt(long index, MemorySegment src) { _pIdentifierAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT _pIdentifier(MemorySegment src) { return _pIdentifierAt(0L, src); }
}
