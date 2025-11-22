// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDynamicRenderingLocalReadFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDynamicRenderingLocalReadFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 dynamicRenderingLocalRead;
/// }
/// ```
public final class VkPhysicalDeviceDynamicRenderingLocalReadFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dynamicRenderingLocalRead = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalRead = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalRead"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dynamicRenderingLocalRead = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalRead"));

    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES); }
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES);
        return s;
    }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures copyFrom(VkPhysicalDeviceDynamicRenderingLocalReadFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures reinterpret(long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures asSlice(long index) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures asSlice(long index, long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures at(long index, Consumer<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dynamicRenderingLocalReadAt(long index) { return (int) VH_dynamicRenderingLocalRead.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dynamicRenderingLocalRead() { return (int) VH_dynamicRenderingLocalRead.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures dynamicRenderingLocalReadAt(long index, int value) { VH_dynamicRenderingLocalRead.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures dynamicRenderingLocalRead(int value) { VH_dynamicRenderingLocalRead.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dynamicRenderingLocalReadAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRenderingLocalRead, index), LAYOUT_dynamicRenderingLocalRead); }
    public MemorySegment _dynamicRenderingLocalRead() { return _dynamicRenderingLocalReadAt(0L); }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _dynamicRenderingLocalReadAt(long index, MemorySegment src) { _dynamicRenderingLocalReadAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures _dynamicRenderingLocalRead(MemorySegment src) { return _dynamicRenderingLocalReadAt(0L, src); }
}
