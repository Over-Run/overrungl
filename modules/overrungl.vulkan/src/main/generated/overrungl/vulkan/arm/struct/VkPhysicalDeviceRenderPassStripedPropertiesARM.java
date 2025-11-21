// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRenderPassStripedPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRenderPassStripedPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D renderPassStripeGranularity;
///     uint32_t maxRenderPassStripes;
/// }
/// ```
public final class VkPhysicalDeviceRenderPassStripedPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("renderPassStripeGranularity"),
        ValueLayout.JAVA_INT.withName("maxRenderPassStripes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_renderPassStripeGranularity = LAYOUT.byteOffset(PathElement.groupElement("renderPassStripeGranularity"));
    public static final long OFFSET_maxRenderPassStripes = LAYOUT.byteOffset(PathElement.groupElement("maxRenderPassStripes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_renderPassStripeGranularity = LAYOUT.select(PathElement.groupElement("renderPassStripeGranularity"));
    public static final MemoryLayout LAYOUT_maxRenderPassStripes = LAYOUT.select(PathElement.groupElement("maxRenderPassStripes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_renderPassStripeGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassStripeGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_renderPassStripeGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassStripeGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxRenderPassStripes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassStripes"));

    public VkPhysicalDeviceRenderPassStripedPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM); }
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM copyFrom(VkPhysicalDeviceRenderPassStripedPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM asSlice(long index) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM at(long index, Consumer<VkPhysicalDeviceRenderPassStripedPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int renderPassStripeGranularity$widthAt(long index) { return (int) VH_renderPassStripeGranularity$width.get(this.segment(), 0L, index); }
    public int renderPassStripeGranularity$heightAt(long index) { return (int) VH_renderPassStripeGranularity$height.get(this.segment(), 0L, index); }
    public int maxRenderPassStripesAt(long index) { return (int) VH_maxRenderPassStripes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int renderPassStripeGranularity$width() { return (int) VH_renderPassStripeGranularity$width.get(this.segment(), 0L, 0L); }
    public int renderPassStripeGranularity$height() { return (int) VH_renderPassStripeGranularity$height.get(this.segment(), 0L, 0L); }
    public int maxRenderPassStripes() { return (int) VH_maxRenderPassStripes.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity$widthAt(long index, int value) { VH_renderPassStripeGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity$heightAt(long index, int value) { VH_renderPassStripeGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM maxRenderPassStripesAt(long index, int value) { VH_maxRenderPassStripes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity$width(int value) { VH_renderPassStripeGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity$height(int value) { VH_renderPassStripeGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM maxRenderPassStripes(int value) { VH_maxRenderPassStripes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _renderPassStripeGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPassStripeGranularity, index), LAYOUT_renderPassStripeGranularity); }
    public MemorySegment _renderPassStripeGranularity() { return _renderPassStripeGranularityAt(0L); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _renderPassStripeGranularityAt(long index, MemorySegment src) { _renderPassStripeGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _renderPassStripeGranularity(MemorySegment src) { return _renderPassStripeGranularityAt(0L, src); }
    public MemorySegment _maxRenderPassStripesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRenderPassStripes, index), LAYOUT_maxRenderPassStripes); }
    public MemorySegment _maxRenderPassStripes() { return _maxRenderPassStripesAt(0L); }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _maxRenderPassStripesAt(long index, MemorySegment src) { _maxRenderPassStripesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRenderPassStripedPropertiesARM _maxRenderPassStripes(MemorySegment src) { return _maxRenderPassStripesAt(0L, src); }
}
