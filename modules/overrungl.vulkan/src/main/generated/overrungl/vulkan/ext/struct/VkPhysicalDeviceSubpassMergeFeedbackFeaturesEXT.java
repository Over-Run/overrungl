// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 subpassMergeFeedback;
/// }
/// ```
public final class VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassMergeFeedback")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subpassMergeFeedback = LAYOUT.byteOffset(PathElement.groupElement("subpassMergeFeedback"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subpassMergeFeedback = LAYOUT.select(PathElement.groupElement("subpassMergeFeedback"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subpassMergeFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassMergeFeedback"));

    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT); }
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT copyFrom(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT at(long index, Consumer<VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subpassMergeFeedbackAt(long index) { return (int) VH_subpassMergeFeedback.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subpassMergeFeedback() { return (int) VH_subpassMergeFeedback.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT subpassMergeFeedbackAt(long index, int value) { VH_subpassMergeFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT subpassMergeFeedback(int value) { VH_subpassMergeFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subpassMergeFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassMergeFeedback, index), LAYOUT_subpassMergeFeedback); }
    public MemorySegment _subpassMergeFeedback() { return _subpassMergeFeedbackAt(0L); }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _subpassMergeFeedbackAt(long index, MemorySegment src) { _subpassMergeFeedbackAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT _subpassMergeFeedback(MemorySegment src) { return _subpassMergeFeedbackAt(0L, src); }
}
