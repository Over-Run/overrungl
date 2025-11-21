// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 attachmentFeedbackLoopLayout;
/// }
/// ```
public final class VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentFeedbackLoopLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentFeedbackLoopLayout = LAYOUT.byteOffset(PathElement.groupElement("attachmentFeedbackLoopLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentFeedbackLoopLayout = LAYOUT.select(PathElement.groupElement("attachmentFeedbackLoopLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentFeedbackLoopLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFeedbackLoopLayout"));

    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTAttachmentFeedbackLoopLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT); }
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTAttachmentFeedbackLoopLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT copyFrom(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT at(long index, Consumer<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentFeedbackLoopLayoutAt(long index) { return (int) VH_attachmentFeedbackLoopLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentFeedbackLoopLayout() { return (int) VH_attachmentFeedbackLoopLayout.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayoutAt(long index, int value) { VH_attachmentFeedbackLoopLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayout(int value) { VH_attachmentFeedbackLoopLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentFeedbackLoopLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentFeedbackLoopLayout, index), LAYOUT_attachmentFeedbackLoopLayout); }
    public MemorySegment _attachmentFeedbackLoopLayout() { return _attachmentFeedbackLoopLayoutAt(0L); }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _attachmentFeedbackLoopLayoutAt(long index, MemorySegment src) { _attachmentFeedbackLoopLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT _attachmentFeedbackLoopLayout(MemorySegment src) { return _attachmentFeedbackLoopLayoutAt(0L, src); }
}
