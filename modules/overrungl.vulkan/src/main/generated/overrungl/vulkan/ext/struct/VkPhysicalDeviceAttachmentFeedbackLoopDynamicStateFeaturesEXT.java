// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 attachmentFeedbackLoopDynamicState;
/// }
/// ```
public final class VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentFeedbackLoopDynamicState")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentFeedbackLoopDynamicState = LAYOUT.byteOffset(PathElement.groupElement("attachmentFeedbackLoopDynamicState"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentFeedbackLoopDynamicState = LAYOUT.select(PathElement.groupElement("attachmentFeedbackLoopDynamicState"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentFeedbackLoopDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFeedbackLoopDynamicState"));

    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT copyFrom(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT at(long index, Consumer<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentFeedbackLoopDynamicStateAt(long index) { return (int) VH_attachmentFeedbackLoopDynamicState.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentFeedbackLoopDynamicState() { return (int) VH_attachmentFeedbackLoopDynamicState.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT attachmentFeedbackLoopDynamicStateAt(long index, int value) { VH_attachmentFeedbackLoopDynamicState.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT attachmentFeedbackLoopDynamicState(int value) { VH_attachmentFeedbackLoopDynamicState.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentFeedbackLoopDynamicStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentFeedbackLoopDynamicState, index), LAYOUT_attachmentFeedbackLoopDynamicState); }
    public MemorySegment _attachmentFeedbackLoopDynamicState() { return _attachmentFeedbackLoopDynamicStateAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _attachmentFeedbackLoopDynamicStateAt(long index, MemorySegment src) { _attachmentFeedbackLoopDynamicStateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT _attachmentFeedbackLoopDynamicState(MemorySegment src) { return _attachmentFeedbackLoopDynamicStateAt(0L, src); }
}
