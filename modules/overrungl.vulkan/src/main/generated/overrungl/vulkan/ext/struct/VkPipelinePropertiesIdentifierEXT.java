// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelinePropertiesIdentifierEXT`.
/// ## Layout
/// ```
/// struct VkPipelinePropertiesIdentifierEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t pipelineIdentifier[VK_UUID_SIZE];
/// }
/// ```
public final class VkPipelinePropertiesIdentifierEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());

    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelinePropertiesIdentifierEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelinePropertiesIdentifierEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelinePropertiesIdentifierEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelinePropertiesIdentifierEXT alloc(SegmentAllocator allocator) { return new VkPipelinePropertiesIdentifierEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelinePropertiesIdentifierEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelinePropertiesIdentifierEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelinePropertiesIdentifierEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT); }
    public static VkPipelinePropertiesIdentifierEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT);
        return s;
    }
    public VkPipelinePropertiesIdentifierEXT copyFrom(VkPipelinePropertiesIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelinePropertiesIdentifierEXT reinterpret(long count) { return new VkPipelinePropertiesIdentifierEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelinePropertiesIdentifierEXT asSlice(long index) { return new VkPipelinePropertiesIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelinePropertiesIdentifierEXT asSlice(long index, long count) { return new VkPipelinePropertiesIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelinePropertiesIdentifierEXT at(long index, Consumer<VkPipelinePropertiesIdentifierEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte pipelineIdentifierAt(long index, long index0) { return (byte) VH_pipelineIdentifier.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte pipelineIdentifier(long index0) { return (byte) VH_pipelineIdentifier.get(this.segment(), 0L, 0L, index0); }
    public VkPipelinePropertiesIdentifierEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelinePropertiesIdentifierEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifierAt(long index, long index0, byte value) { VH_pipelineIdentifier.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelinePropertiesIdentifierEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelinePropertiesIdentifierEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(long index0, byte value) { VH_pipelineIdentifier.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelinePropertiesIdentifierEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelinePropertiesIdentifierEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelinePropertiesIdentifierEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelinePropertiesIdentifierEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineIdentifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier); }
    public MemorySegment _pipelineIdentifier() { return _pipelineIdentifierAt(0L); }
    public VkPipelinePropertiesIdentifierEXT _pipelineIdentifierAt(long index, MemorySegment src) { _pipelineIdentifierAt(index).copyFrom(src); return this; }
    public VkPipelinePropertiesIdentifierEXT _pipelineIdentifier(MemorySegment src) { return _pipelineIdentifierAt(0L, src); }
}
