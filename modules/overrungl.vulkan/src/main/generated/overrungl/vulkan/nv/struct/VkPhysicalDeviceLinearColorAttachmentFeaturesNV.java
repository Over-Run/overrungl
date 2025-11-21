// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLinearColorAttachmentFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLinearColorAttachmentFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 linearColorAttachment;
/// }
/// ```
public final class VkPhysicalDeviceLinearColorAttachmentFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("linearColorAttachment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_linearColorAttachment = LAYOUT.byteOffset(PathElement.groupElement("linearColorAttachment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_linearColorAttachment = LAYOUT.select(PathElement.groupElement("linearColorAttachment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_linearColorAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearColorAttachment"));

    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLinearColorAttachment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV); }
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLinearColorAttachment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV copyFrom(VkPhysicalDeviceLinearColorAttachmentFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV asSlice(long index) { return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV at(long index, Consumer<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int linearColorAttachmentAt(long index) { return (int) VH_linearColorAttachment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int linearColorAttachment() { return (int) VH_linearColorAttachment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV linearColorAttachmentAt(long index, int value) { VH_linearColorAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV linearColorAttachment(int value) { VH_linearColorAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _linearColorAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_linearColorAttachment, index), LAYOUT_linearColorAttachment); }
    public MemorySegment _linearColorAttachment() { return _linearColorAttachmentAt(0L); }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _linearColorAttachmentAt(long index, MemorySegment src) { _linearColorAttachmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV _linearColorAttachment(MemorySegment src) { return _linearColorAttachmentAt(0L, src); }
}
