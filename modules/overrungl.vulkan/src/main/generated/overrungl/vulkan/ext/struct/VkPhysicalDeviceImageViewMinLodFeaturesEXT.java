// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageViewMinLodFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageViewMinLodFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 minLod;
/// }
/// ```
public final class VkPhysicalDeviceImageViewMinLodFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minLod")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minLod = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minLod = LAYOUT.select(PathElement.groupElement("minLod"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLod"));

    public VkPhysicalDeviceImageViewMinLodFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewMinLodFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewMinLodFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewMinLodFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageViewMinLod.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT); }
    public static VkPhysicalDeviceImageViewMinLodFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageViewMinLod.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT copyFrom(VkPhysicalDeviceImageViewMinLodFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageViewMinLodFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageViewMinLodFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minLodAt(long index) { return (int) VH_minLod.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minLod() { return (int) VH_minLod.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT minLodAt(long index, int value) { VH_minLod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT minLod(int value) { VH_minLod.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minLod, index), LAYOUT_minLod); }
    public MemorySegment _minLod() { return _minLodAt(0L); }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _minLodAt(long index, MemorySegment src) { _minLodAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewMinLodFeaturesEXT _minLod(MemorySegment src) { return _minLodAt(0L, src); }
}
