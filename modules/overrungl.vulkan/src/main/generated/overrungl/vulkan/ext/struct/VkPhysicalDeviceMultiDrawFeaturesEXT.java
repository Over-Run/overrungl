// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiDrawFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiDrawFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiDraw;
/// }
/// ```
public final class VkPhysicalDeviceMultiDrawFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiDraw")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multiDraw = LAYOUT.byteOffset(PathElement.groupElement("multiDraw"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multiDraw = LAYOUT.select(PathElement.groupElement("multiDraw"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multiDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiDraw"));

    public VkPhysicalDeviceMultiDrawFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiDrawFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiDrawFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiDrawFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT); }
    public static VkPhysicalDeviceMultiDrawFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMultiDrawFeaturesEXT copyFrom(VkPhysicalDeviceMultiDrawFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMultiDrawFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMultiDrawFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMultiDrawFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMultiDrawFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multiDrawAt(long index) { return (int) VH_multiDraw.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multiDraw() { return (int) VH_multiDraw.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT multiDrawAt(long index, int value) { VH_multiDraw.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT multiDraw(int value) { VH_multiDraw.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multiDrawAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiDraw, index), LAYOUT_multiDraw); }
    public MemorySegment _multiDraw() { return _multiDrawAt(0L); }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _multiDrawAt(long index, MemorySegment src) { _multiDrawAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiDrawFeaturesEXT _multiDraw(MemorySegment src) { return _multiDrawAt(0L, src); }
}
