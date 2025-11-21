// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiDrawPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiDrawPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiDrawCount;
/// }
/// ```
public final class VkPhysicalDeviceMultiDrawPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiDrawCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxMultiDrawCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiDrawCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxMultiDrawCount = LAYOUT.select(PathElement.groupElement("maxMultiDrawCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxMultiDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiDrawCount"));

    public VkPhysicalDeviceMultiDrawPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiDrawPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiDrawPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMultiDrawPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMultiDrawPropertiesEXT copyFrom(VkPhysicalDeviceMultiDrawPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceMultiDrawPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMultiDrawPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMultiDrawPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT at(long index, Consumer<VkPhysicalDeviceMultiDrawPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxMultiDrawCountAt(long index) { return (int) VH_maxMultiDrawCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxMultiDrawCount() { return (int) VH_maxMultiDrawCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT maxMultiDrawCountAt(long index, int value) { VH_maxMultiDrawCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT maxMultiDrawCount(int value) { VH_maxMultiDrawCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxMultiDrawCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMultiDrawCount, index), LAYOUT_maxMultiDrawCount); }
    public MemorySegment _maxMultiDrawCount() { return _maxMultiDrawCountAt(0L); }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _maxMultiDrawCountAt(long index, MemorySegment src) { _maxMultiDrawCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawPropertiesEXT _maxMultiDrawCount(MemorySegment src) { return _maxMultiDrawCountAt(0L, src); }
}
