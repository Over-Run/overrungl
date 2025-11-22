// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRenderPassStripedFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRenderPassStripedFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 renderPassStriped;
/// }
/// ```
public final class VkPhysicalDeviceRenderPassStripedFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("renderPassStriped")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_renderPassStriped = LAYOUT.byteOffset(PathElement.groupElement("renderPassStriped"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_renderPassStriped = LAYOUT.select(PathElement.groupElement("renderPassStriped"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_renderPassStriped = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassStriped"));

    public VkPhysicalDeviceRenderPassStripedFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM); }
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM copyFrom(VkPhysicalDeviceRenderPassStripedFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM asSlice(long index) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM at(long index, Consumer<VkPhysicalDeviceRenderPassStripedFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int renderPassStripedAt(long index) { return (int) VH_renderPassStriped.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int renderPassStriped() { return (int) VH_renderPassStriped.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStripedAt(long index, int value) { VH_renderPassStriped.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStriped(int value) { VH_renderPassStriped.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _renderPassStripedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPassStriped, index), LAYOUT_renderPassStriped); }
    public MemorySegment _renderPassStriped() { return _renderPassStripedAt(0L); }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _renderPassStripedAt(long index, MemorySegment src) { _renderPassStripedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedFeaturesARM _renderPassStriped(MemorySegment src) { return _renderPassStripedAt(0L, src); }
}
