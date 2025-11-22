// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dynamicRenderingUnusedAttachments;
/// }
/// ```
public final class VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingUnusedAttachments")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dynamicRenderingUnusedAttachments = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingUnusedAttachments"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dynamicRenderingUnusedAttachments = LAYOUT.select(PathElement.groupElement("dynamicRenderingUnusedAttachments"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dynamicRenderingUnusedAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingUnusedAttachments"));

    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT); }
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT copyFrom(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dynamicRenderingUnusedAttachmentsAt(long index) { return (int) VH_dynamicRenderingUnusedAttachments.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dynamicRenderingUnusedAttachments() { return (int) VH_dynamicRenderingUnusedAttachments.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT dynamicRenderingUnusedAttachmentsAt(long index, int value) { VH_dynamicRenderingUnusedAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT dynamicRenderingUnusedAttachments(int value) { VH_dynamicRenderingUnusedAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dynamicRenderingUnusedAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRenderingUnusedAttachments, index), LAYOUT_dynamicRenderingUnusedAttachments); }
    public MemorySegment _dynamicRenderingUnusedAttachments() { return _dynamicRenderingUnusedAttachmentsAt(0L); }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _dynamicRenderingUnusedAttachmentsAt(long index, MemorySegment src) { _dynamicRenderingUnusedAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT _dynamicRenderingUnusedAttachments(MemorySegment src) { return _dynamicRenderingUnusedAttachmentsAt(0L, src); }
}
