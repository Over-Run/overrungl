// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreationFeedbackCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassCreationFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPassCreationFeedbackInfoEXT* pRenderPassFeedback;
/// }
/// ```
public final class VkRenderPassCreationFeedbackCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pRenderPassFeedback")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pRenderPassFeedback = LAYOUT.byteOffset(PathElement.groupElement("pRenderPassFeedback"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pRenderPassFeedback = LAYOUT.select(PathElement.groupElement("pRenderPassFeedback"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pRenderPassFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRenderPassFeedback"));

    public VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT); }
    public static VkRenderPassCreationFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
        return s;
    }
    public VkRenderPassCreationFeedbackCreateInfoEXT copyFrom(VkRenderPassCreationFeedbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT reinterpret(long count) { return new VkRenderPassCreationFeedbackCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassCreationFeedbackCreateInfoEXT asSlice(long index) { return new VkRenderPassCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassCreationFeedbackCreateInfoEXT asSlice(long index, long count) { return new VkRenderPassCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassCreationFeedbackCreateInfoEXT at(long index, Consumer<VkRenderPassCreationFeedbackCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pRenderPassFeedbackAt(long index) { return (MemorySegment) VH_pRenderPassFeedback.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pRenderPassFeedback() { return (MemorySegment) VH_pRenderPassFeedback.get(this.segment(), 0L, 0L); }
    public VkRenderPassCreationFeedbackCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT pRenderPassFeedbackAt(long index, MemorySegment value) { VH_pRenderPassFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT pRenderPassFeedback(MemorySegment value) { VH_pRenderPassFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassCreationFeedbackCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassCreationFeedbackCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pRenderPassFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRenderPassFeedback, index), LAYOUT_pRenderPassFeedback); }
    public MemorySegment _pRenderPassFeedback() { return _pRenderPassFeedbackAt(0L); }
    public VkRenderPassCreationFeedbackCreateInfoEXT _pRenderPassFeedbackAt(long index, MemorySegment src) { _pRenderPassFeedbackAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationFeedbackCreateInfoEXT _pRenderPassFeedback(MemorySegment src) { return _pRenderPassFeedbackAt(0L, src); }
}
