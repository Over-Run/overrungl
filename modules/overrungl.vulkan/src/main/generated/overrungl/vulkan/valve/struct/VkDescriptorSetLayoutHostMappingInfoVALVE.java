// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutHostMappingInfoVALVE`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutHostMappingInfoVALVE {
///     VkStructureType sType;
///     void* pNext;
///     size_t descriptorOffset;
///     uint32_t descriptorSize;
/// }
/// ```
public final class VkDescriptorSetLayoutHostMappingInfoVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorOffset = LAYOUT.byteOffset(PathElement.groupElement("descriptorOffset"));
    public static final long OFFSET_descriptorSize = LAYOUT.byteOffset(PathElement.groupElement("descriptorSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorOffset = LAYOUT.select(PathElement.groupElement("descriptorOffset"));
    public static final MemoryLayout LAYOUT_descriptorSize = LAYOUT.select(PathElement.groupElement("descriptorSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorOffset"));
    public static final VarHandle VH_descriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSize"));

    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE); }
    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
        return s;
    }
    public VkDescriptorSetLayoutHostMappingInfoVALVE copyFrom(VkDescriptorSetLayoutHostMappingInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE reinterpret(long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE asSlice(long index) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE asSlice(long index, long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE at(long index, Consumer<VkDescriptorSetLayoutHostMappingInfoVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long descriptorOffsetAt(long index) { return (long) VH_descriptorOffset.get(this.segment(), 0L, index); }
    public int descriptorSizeAt(long index) { return (int) VH_descriptorSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long descriptorOffset() { return (long) VH_descriptorOffset.get(this.segment(), 0L, 0L); }
    public int descriptorSize() { return (int) VH_descriptorSize.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffsetAt(long index, long value) { VH_descriptorOffset.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSizeAt(long index, int value) { VH_descriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffset(long value) { VH_descriptorOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSize(int value) { VH_descriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorOffset, index), LAYOUT_descriptorOffset); }
    public MemorySegment _descriptorOffset() { return _descriptorOffsetAt(0L); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _descriptorOffsetAt(long index, MemorySegment src) { _descriptorOffsetAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _descriptorOffset(MemorySegment src) { return _descriptorOffsetAt(0L, src); }
    public MemorySegment _descriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSize, index), LAYOUT_descriptorSize); }
    public MemorySegment _descriptorSize() { return _descriptorSizeAt(0L); }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _descriptorSizeAt(long index, MemorySegment src) { _descriptorSizeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutHostMappingInfoVALVE _descriptorSize(MemorySegment src) { return _descriptorSizeAt(0L, src); }
}
