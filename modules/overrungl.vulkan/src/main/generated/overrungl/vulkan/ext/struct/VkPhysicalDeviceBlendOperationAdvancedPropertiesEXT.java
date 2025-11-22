// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t advancedBlendMaxColorAttachments;
///     VkBool32 advancedBlendIndependentBlend;
///     VkBool32 advancedBlendNonPremultipliedSrcColor;
///     VkBool32 advancedBlendNonPremultipliedDstColor;
///     VkBool32 advancedBlendCorrelatedOverlap;
///     VkBool32 advancedBlendAllOperations;
/// }
/// ```
public final class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments"),
        ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
        ValueLayout.JAVA_INT.withName("advancedBlendAllOperations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_advancedBlendMaxColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    public static final long OFFSET_advancedBlendIndependentBlend = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendIndependentBlend"));
    public static final long OFFSET_advancedBlendNonPremultipliedSrcColor = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    public static final long OFFSET_advancedBlendNonPremultipliedDstColor = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    public static final long OFFSET_advancedBlendCorrelatedOverlap = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    public static final long OFFSET_advancedBlendAllOperations = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendAllOperations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_advancedBlendMaxColorAttachments = LAYOUT.select(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    public static final MemoryLayout LAYOUT_advancedBlendIndependentBlend = LAYOUT.select(PathElement.groupElement("advancedBlendIndependentBlend"));
    public static final MemoryLayout LAYOUT_advancedBlendNonPremultipliedSrcColor = LAYOUT.select(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    public static final MemoryLayout LAYOUT_advancedBlendNonPremultipliedDstColor = LAYOUT.select(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    public static final MemoryLayout LAYOUT_advancedBlendCorrelatedOverlap = LAYOUT.select(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    public static final MemoryLayout LAYOUT_advancedBlendAllOperations = LAYOUT.select(PathElement.groupElement("advancedBlendAllOperations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_advancedBlendMaxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    public static final VarHandle VH_advancedBlendIndependentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendIndependentBlend"));
    public static final VarHandle VH_advancedBlendNonPremultipliedSrcColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    public static final VarHandle VH_advancedBlendNonPremultipliedDstColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    public static final VarHandle VH_advancedBlendCorrelatedOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    public static final VarHandle VH_advancedBlendAllOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendAllOperations"));

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT); }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT copyFrom(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT at(long index, Consumer<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int advancedBlendMaxColorAttachmentsAt(long index) { return (int) VH_advancedBlendMaxColorAttachments.get(this.segment(), 0L, index); }
    public int advancedBlendIndependentBlendAt(long index) { return (int) VH_advancedBlendIndependentBlend.get(this.segment(), 0L, index); }
    public int advancedBlendNonPremultipliedSrcColorAt(long index) { return (int) VH_advancedBlendNonPremultipliedSrcColor.get(this.segment(), 0L, index); }
    public int advancedBlendNonPremultipliedDstColorAt(long index) { return (int) VH_advancedBlendNonPremultipliedDstColor.get(this.segment(), 0L, index); }
    public int advancedBlendCorrelatedOverlapAt(long index) { return (int) VH_advancedBlendCorrelatedOverlap.get(this.segment(), 0L, index); }
    public int advancedBlendAllOperationsAt(long index) { return (int) VH_advancedBlendAllOperations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int advancedBlendMaxColorAttachments() { return (int) VH_advancedBlendMaxColorAttachments.get(this.segment(), 0L, 0L); }
    public int advancedBlendIndependentBlend() { return (int) VH_advancedBlendIndependentBlend.get(this.segment(), 0L, 0L); }
    public int advancedBlendNonPremultipliedSrcColor() { return (int) VH_advancedBlendNonPremultipliedSrcColor.get(this.segment(), 0L, 0L); }
    public int advancedBlendNonPremultipliedDstColor() { return (int) VH_advancedBlendNonPremultipliedDstColor.get(this.segment(), 0L, 0L); }
    public int advancedBlendCorrelatedOverlap() { return (int) VH_advancedBlendCorrelatedOverlap.get(this.segment(), 0L, 0L); }
    public int advancedBlendAllOperations() { return (int) VH_advancedBlendAllOperations.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachmentsAt(long index, int value) { VH_advancedBlendMaxColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlendAt(long index, int value) { VH_advancedBlendIndependentBlend.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColorAt(long index, int value) { VH_advancedBlendNonPremultipliedSrcColor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColorAt(long index, int value) { VH_advancedBlendNonPremultipliedDstColor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlapAt(long index, int value) { VH_advancedBlendCorrelatedOverlap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperationsAt(long index, int value) { VH_advancedBlendAllOperations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachments(int value) { VH_advancedBlendMaxColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlend(int value) { VH_advancedBlendIndependentBlend.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColor(int value) { VH_advancedBlendNonPremultipliedSrcColor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColor(int value) { VH_advancedBlendNonPremultipliedDstColor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlap(int value) { VH_advancedBlendCorrelatedOverlap.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperations(int value) { VH_advancedBlendAllOperations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _advancedBlendMaxColorAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendMaxColorAttachments, index), LAYOUT_advancedBlendMaxColorAttachments); }
    public MemorySegment _advancedBlendMaxColorAttachments() { return _advancedBlendMaxColorAttachmentsAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendMaxColorAttachmentsAt(long index, MemorySegment src) { _advancedBlendMaxColorAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendMaxColorAttachments(MemorySegment src) { return _advancedBlendMaxColorAttachmentsAt(0L, src); }
    public MemorySegment _advancedBlendIndependentBlendAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendIndependentBlend, index), LAYOUT_advancedBlendIndependentBlend); }
    public MemorySegment _advancedBlendIndependentBlend() { return _advancedBlendIndependentBlendAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendIndependentBlendAt(long index, MemorySegment src) { _advancedBlendIndependentBlendAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendIndependentBlend(MemorySegment src) { return _advancedBlendIndependentBlendAt(0L, src); }
    public MemorySegment _advancedBlendNonPremultipliedSrcColorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendNonPremultipliedSrcColor, index), LAYOUT_advancedBlendNonPremultipliedSrcColor); }
    public MemorySegment _advancedBlendNonPremultipliedSrcColor() { return _advancedBlendNonPremultipliedSrcColorAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendNonPremultipliedSrcColorAt(long index, MemorySegment src) { _advancedBlendNonPremultipliedSrcColorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendNonPremultipliedSrcColor(MemorySegment src) { return _advancedBlendNonPremultipliedSrcColorAt(0L, src); }
    public MemorySegment _advancedBlendNonPremultipliedDstColorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendNonPremultipliedDstColor, index), LAYOUT_advancedBlendNonPremultipliedDstColor); }
    public MemorySegment _advancedBlendNonPremultipliedDstColor() { return _advancedBlendNonPremultipliedDstColorAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendNonPremultipliedDstColorAt(long index, MemorySegment src) { _advancedBlendNonPremultipliedDstColorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendNonPremultipliedDstColor(MemorySegment src) { return _advancedBlendNonPremultipliedDstColorAt(0L, src); }
    public MemorySegment _advancedBlendCorrelatedOverlapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendCorrelatedOverlap, index), LAYOUT_advancedBlendCorrelatedOverlap); }
    public MemorySegment _advancedBlendCorrelatedOverlap() { return _advancedBlendCorrelatedOverlapAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendCorrelatedOverlapAt(long index, MemorySegment src) { _advancedBlendCorrelatedOverlapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendCorrelatedOverlap(MemorySegment src) { return _advancedBlendCorrelatedOverlapAt(0L, src); }
    public MemorySegment _advancedBlendAllOperationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendAllOperations, index), LAYOUT_advancedBlendAllOperations); }
    public MemorySegment _advancedBlendAllOperations() { return _advancedBlendAllOperationsAt(0L); }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendAllOperationsAt(long index, MemorySegment src) { _advancedBlendAllOperationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT _advancedBlendAllOperations(MemorySegment src) { return _advancedBlendAllOperationsAt(0L, src); }
}
