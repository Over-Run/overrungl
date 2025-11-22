// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rasterizationOrderColorAttachmentAccess;
///     VkBool32 rasterizationOrderDepthAttachmentAccess;
///     VkBool32 rasterizationOrderStencilAttachmentAccess;
/// }
/// ```
public final class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rasterizationOrderColorAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    public static final long OFFSET_rasterizationOrderDepthAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    public static final long OFFSET_rasterizationOrderStencilAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rasterizationOrderColorAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    public static final MemoryLayout LAYOUT_rasterizationOrderDepthAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    public static final MemoryLayout LAYOUT_rasterizationOrderStencilAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rasterizationOrderColorAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    public static final VarHandle VH_rasterizationOrderDepthAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    public static final VarHandle VH_rasterizationOrderStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT); }
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM copyFrom(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM asSlice(long index) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM at(long index, Consumer<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rasterizationOrderColorAttachmentAccessAt(long index) { return (int) VH_rasterizationOrderColorAttachmentAccess.get(this.segment(), 0L, index); }
    public int rasterizationOrderDepthAttachmentAccessAt(long index) { return (int) VH_rasterizationOrderDepthAttachmentAccess.get(this.segment(), 0L, index); }
    public int rasterizationOrderStencilAttachmentAccessAt(long index) { return (int) VH_rasterizationOrderStencilAttachmentAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rasterizationOrderColorAttachmentAccess() { return (int) VH_rasterizationOrderColorAttachmentAccess.get(this.segment(), 0L, 0L); }
    public int rasterizationOrderDepthAttachmentAccess() { return (int) VH_rasterizationOrderDepthAttachmentAccess.get(this.segment(), 0L, 0L); }
    public int rasterizationOrderStencilAttachmentAccess() { return (int) VH_rasterizationOrderStencilAttachmentAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccessAt(long index, int value) { VH_rasterizationOrderColorAttachmentAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccessAt(long index, int value) { VH_rasterizationOrderDepthAttachmentAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccessAt(long index, int value) { VH_rasterizationOrderStencilAttachmentAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(int value) { VH_rasterizationOrderColorAttachmentAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(int value) { VH_rasterizationOrderDepthAttachmentAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(int value) { VH_rasterizationOrderStencilAttachmentAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rasterizationOrderColorAttachmentAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationOrderColorAttachmentAccess, index), LAYOUT_rasterizationOrderColorAttachmentAccess); }
    public MemorySegment _rasterizationOrderColorAttachmentAccess() { return _rasterizationOrderColorAttachmentAccessAt(0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderColorAttachmentAccessAt(long index, MemorySegment src) { _rasterizationOrderColorAttachmentAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderColorAttachmentAccess(MemorySegment src) { return _rasterizationOrderColorAttachmentAccessAt(0L, src); }
    public MemorySegment _rasterizationOrderDepthAttachmentAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationOrderDepthAttachmentAccess, index), LAYOUT_rasterizationOrderDepthAttachmentAccess); }
    public MemorySegment _rasterizationOrderDepthAttachmentAccess() { return _rasterizationOrderDepthAttachmentAccessAt(0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderDepthAttachmentAccessAt(long index, MemorySegment src) { _rasterizationOrderDepthAttachmentAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderDepthAttachmentAccess(MemorySegment src) { return _rasterizationOrderDepthAttachmentAccessAt(0L, src); }
    public MemorySegment _rasterizationOrderStencilAttachmentAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationOrderStencilAttachmentAccess, index), LAYOUT_rasterizationOrderStencilAttachmentAccess); }
    public MemorySegment _rasterizationOrderStencilAttachmentAccess() { return _rasterizationOrderStencilAttachmentAccessAt(0L); }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderStencilAttachmentAccessAt(long index, MemorySegment src) { _rasterizationOrderStencilAttachmentAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM _rasterizationOrderStencilAttachmentAccess(MemorySegment src) { return _rasterizationOrderStencilAttachmentAccessAt(0L, src); }
}
