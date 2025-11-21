// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSetInlineUniformBlockEXT`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetInlineUniformBlockEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t dataSize;
///     const void* pData;
/// }
/// ```
public final class VkWriteDescriptorSetInlineUniformBlockEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkWriteDescriptorSetInlineUniformBlockEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlockEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlockEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlockEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetInlineUniformBlockEXT(allocator.allocate(LAYOUT), 1); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetInlineUniformBlockEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK); }
    public static VkWriteDescriptorSetInlineUniformBlockEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK);
        return s;
    }
    public VkWriteDescriptorSetInlineUniformBlockEXT copyFrom(VkWriteDescriptorSetInlineUniformBlockEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT reinterpret(long count) { return new VkWriteDescriptorSetInlineUniformBlockEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteDescriptorSetInlineUniformBlockEXT asSlice(long index) { return new VkWriteDescriptorSetInlineUniformBlockEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteDescriptorSetInlineUniformBlockEXT asSlice(long index, long count) { return new VkWriteDescriptorSetInlineUniformBlockEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteDescriptorSetInlineUniformBlockEXT at(long index, Consumer<VkWriteDescriptorSetInlineUniformBlockEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dataSizeAt(long index) { return (int) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dataSize() { return (int) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkWriteDescriptorSetInlineUniformBlockEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT dataSizeAt(long index, int value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT dataSize(int value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteDescriptorSetInlineUniformBlockEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteDescriptorSetInlineUniformBlockEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkWriteDescriptorSetInlineUniformBlockEXT _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkWriteDescriptorSetInlineUniformBlockEXT _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetInlineUniformBlockEXT _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
