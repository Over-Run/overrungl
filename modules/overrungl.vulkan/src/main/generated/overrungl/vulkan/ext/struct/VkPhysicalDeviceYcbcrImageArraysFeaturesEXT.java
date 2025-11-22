// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceYcbcrImageArraysFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceYcbcrImageArraysFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 ycbcrImageArrays;
/// }
/// ```
public final class VkPhysicalDeviceYcbcrImageArraysFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrImageArrays")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_ycbcrImageArrays = LAYOUT.byteOffset(PathElement.groupElement("ycbcrImageArrays"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_ycbcrImageArrays = LAYOUT.select(PathElement.groupElement("ycbcrImageArrays"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_ycbcrImageArrays = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrImageArrays"));

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTYcbcrImageArrays.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT); }
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTYcbcrImageArrays.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT copyFrom(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT at(long index, Consumer<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int ycbcrImageArraysAt(long index) { return (int) VH_ycbcrImageArrays.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int ycbcrImageArrays() { return (int) VH_ycbcrImageArrays.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArraysAt(long index, int value) { VH_ycbcrImageArrays.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT ycbcrImageArrays(int value) { VH_ycbcrImageArrays.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _ycbcrImageArraysAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycbcrImageArrays, index), LAYOUT_ycbcrImageArrays); }
    public MemorySegment _ycbcrImageArrays() { return _ycbcrImageArraysAt(0L); }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _ycbcrImageArraysAt(long index, MemorySegment src) { _ycbcrImageArraysAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT _ycbcrImageArrays(MemorySegment src) { return _ycbcrImageArraysAt(0L, src); }
}
