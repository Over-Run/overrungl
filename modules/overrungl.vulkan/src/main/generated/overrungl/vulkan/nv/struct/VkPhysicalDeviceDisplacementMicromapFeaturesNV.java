// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDisplacementMicromapFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDisplacementMicromapFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 displacementMicromap;
/// }
/// ```
public final class VkPhysicalDeviceDisplacementMicromapFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementMicromap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_displacementMicromap = LAYOUT.byteOffset(PathElement.groupElement("displacementMicromap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_displacementMicromap = LAYOUT.select(PathElement.groupElement("displacementMicromap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_displacementMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementMicromap"));

    public VkPhysicalDeviceDisplacementMicromapFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_FEATURES_NV); }
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV copyFrom(VkPhysicalDeviceDisplacementMicromapFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV at(long index, Consumer<VkPhysicalDeviceDisplacementMicromapFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int displacementMicromapAt(long index) { return (int) VH_displacementMicromap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int displacementMicromap() { return (int) VH_displacementMicromap.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV displacementMicromapAt(long index, int value) { VH_displacementMicromap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV displacementMicromap(int value) { VH_displacementMicromap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displacementMicromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementMicromap, index), LAYOUT_displacementMicromap); }
    public MemorySegment _displacementMicromap() { return _displacementMicromapAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _displacementMicromapAt(long index, MemorySegment src) { _displacementMicromapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV _displacementMicromap(MemorySegment src) { return _displacementMicromapAt(0L, src); }
}
