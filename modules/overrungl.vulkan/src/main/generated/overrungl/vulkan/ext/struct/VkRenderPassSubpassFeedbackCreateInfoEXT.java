// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassSubpassFeedbackCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassSubpassFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPassSubpassFeedbackInfoEXT* pSubpassFeedback;
/// }
/// ```
public final class VkRenderPassSubpassFeedbackCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pSubpassFeedback")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pSubpassFeedback = LAYOUT.byteOffset(PathElement.groupElement("pSubpassFeedback"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pSubpassFeedback = LAYOUT.select(PathElement.groupElement("pSubpassFeedback"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pSubpassFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubpassFeedback"));

    public VkRenderPassSubpassFeedbackCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSubpassFeedbackCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSubpassFeedbackCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT); }
    public static VkRenderPassSubpassFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT);
        return s;
    }
    public VkRenderPassSubpassFeedbackCreateInfoEXT copyFrom(VkRenderPassSubpassFeedbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT reinterpret(long count) { return new VkRenderPassSubpassFeedbackCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT asSlice(long index) { return new VkRenderPassSubpassFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT asSlice(long index, long count) { return new VkRenderPassSubpassFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT at(long index, Consumer<VkRenderPassSubpassFeedbackCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pSubpassFeedbackAt(long index) { return (MemorySegment) VH_pSubpassFeedback.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pSubpassFeedback() { return (MemorySegment) VH_pSubpassFeedback.get(this.segment(), 0L, 0L); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT pSubpassFeedbackAt(long index, MemorySegment value) { VH_pSubpassFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT pSubpassFeedback(MemorySegment value) { VH_pSubpassFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pSubpassFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSubpassFeedback, index), LAYOUT_pSubpassFeedback); }
    public MemorySegment _pSubpassFeedback() { return _pSubpassFeedbackAt(0L); }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _pSubpassFeedbackAt(long index, MemorySegment src) { _pSubpassFeedbackAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackCreateInfoEXT _pSubpassFeedback(MemorySegment src) { return _pSubpassFeedbackAt(0L, src); }
}
