// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDynamicRenderingFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDynamicRenderingFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dynamicRendering;
/// }
/// ```
public final class VkPhysicalDeviceDynamicRenderingFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRendering")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dynamicRendering = LAYOUT.byteOffset(PathElement.groupElement("dynamicRendering"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dynamicRendering = LAYOUT.select(PathElement.groupElement("dynamicRendering"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dynamicRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRendering"));

    public VkPhysicalDeviceDynamicRenderingFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDynamicRenderingFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDynamicRenderingFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDynamicRenderingFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDynamicRenderingFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDynamicRenderingFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDynamicRenderingFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDynamicRenderingFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDynamicRenderingFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES); }
    public static VkPhysicalDeviceDynamicRenderingFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES);
        return s;
    }
    public VkPhysicalDeviceDynamicRenderingFeatures copyFrom(VkPhysicalDeviceDynamicRenderingFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures reinterpret(long count) { return new VkPhysicalDeviceDynamicRenderingFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDynamicRenderingFeatures asSlice(long index) { return new VkPhysicalDeviceDynamicRenderingFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDynamicRenderingFeatures asSlice(long index, long count) { return new VkPhysicalDeviceDynamicRenderingFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDynamicRenderingFeatures at(long index, Consumer<VkPhysicalDeviceDynamicRenderingFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dynamicRenderingAt(long index) { return (int) VH_dynamicRendering.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dynamicRendering() { return (int) VH_dynamicRendering.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDynamicRenderingFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures dynamicRenderingAt(long index, int value) { VH_dynamicRendering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures dynamicRendering(int value) { VH_dynamicRendering.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDynamicRenderingFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDynamicRenderingFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dynamicRenderingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRendering, index), LAYOUT_dynamicRendering); }
    public MemorySegment _dynamicRendering() { return _dynamicRenderingAt(0L); }
    public VkPhysicalDeviceDynamicRenderingFeatures _dynamicRenderingAt(long index, MemorySegment src) { _dynamicRenderingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingFeatures _dynamicRendering(MemorySegment src) { return _dynamicRenderingAt(0L, src); }
}
