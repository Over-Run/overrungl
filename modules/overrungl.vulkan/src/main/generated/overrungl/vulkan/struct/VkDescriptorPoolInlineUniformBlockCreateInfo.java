// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorPoolInlineUniformBlockCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorPoolInlineUniformBlockCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInlineUniformBlockBindings;
/// }
/// ```
public final class VkDescriptorPoolInlineUniformBlockCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockBindings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxInlineUniformBlockBindings = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockBindings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockBindings = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockBindings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxInlineUniformBlockBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockBindings"));

    public VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
    public static VkDescriptorPoolInlineUniformBlockCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO);
        return s;
    }
    public VkDescriptorPoolInlineUniformBlockCreateInfo copyFrom(VkDescriptorPoolInlineUniformBlockCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo reinterpret(long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo asSlice(long index) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo asSlice(long index, long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo at(long index, Consumer<VkDescriptorPoolInlineUniformBlockCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxInlineUniformBlockBindingsAt(long index) { return (int) VH_maxInlineUniformBlockBindings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxInlineUniformBlockBindings() { return (int) VH_maxInlineUniformBlockBindings.get(this.segment(), 0L, 0L); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindingsAt(long index, int value) { VH_maxInlineUniformBlockBindings.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(int value) { VH_maxInlineUniformBlockBindings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxInlineUniformBlockBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInlineUniformBlockBindings, index), LAYOUT_maxInlineUniformBlockBindings); }
    public MemorySegment _maxInlineUniformBlockBindings() { return _maxInlineUniformBlockBindingsAt(0L); }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _maxInlineUniformBlockBindingsAt(long index, MemorySegment src) { _maxInlineUniformBlockBindingsAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolInlineUniformBlockCreateInfo _maxInlineUniformBlockBindings(MemorySegment src) { return _maxInlineUniformBlockBindingsAt(0L, src); }
}
