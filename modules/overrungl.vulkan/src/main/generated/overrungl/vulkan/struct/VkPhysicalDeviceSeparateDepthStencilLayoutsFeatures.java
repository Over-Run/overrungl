// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 separateDepthStencilLayouts;
/// }
/// ```
public final class VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilLayouts")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_separateDepthStencilLayouts = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_separateDepthStencilLayouts = LAYOUT.select(PathElement.groupElement("separateDepthStencilLayouts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_separateDepthStencilLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilLayouts"));

    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES); }
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES);
        return s;
    }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures copyFrom(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures reinterpret(long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures asSlice(long index) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures asSlice(long index, long count) { return new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures at(long index, Consumer<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int separateDepthStencilLayoutsAt(long index) { return (int) VH_separateDepthStencilLayouts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int separateDepthStencilLayouts() { return (int) VH_separateDepthStencilLayouts.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayoutsAt(long index, int value) { VH_separateDepthStencilLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayouts(int value) { VH_separateDepthStencilLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _separateDepthStencilLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_separateDepthStencilLayouts, index), LAYOUT_separateDepthStencilLayouts); }
    public MemorySegment _separateDepthStencilLayouts() { return _separateDepthStencilLayoutsAt(0L); }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _separateDepthStencilLayoutsAt(long index, MemorySegment src) { _separateDepthStencilLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures _separateDepthStencilLayouts(MemorySegment src) { return _separateDepthStencilLayoutsAt(0L, src); }
}
