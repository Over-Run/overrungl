// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 nonSeamlessCubeMap;
/// }
/// ```
public final class VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nonSeamlessCubeMap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_nonSeamlessCubeMap = LAYOUT.byteOffset(PathElement.groupElement("nonSeamlessCubeMap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_nonSeamlessCubeMap = LAYOUT.select(PathElement.groupElement("nonSeamlessCubeMap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_nonSeamlessCubeMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonSeamlessCubeMap"));

    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT); }
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT copyFrom(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT at(long index, Consumer<VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int nonSeamlessCubeMapAt(long index) { return (int) VH_nonSeamlessCubeMap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int nonSeamlessCubeMap() { return (int) VH_nonSeamlessCubeMap.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT nonSeamlessCubeMapAt(long index, int value) { VH_nonSeamlessCubeMap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT nonSeamlessCubeMap(int value) { VH_nonSeamlessCubeMap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nonSeamlessCubeMapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonSeamlessCubeMap, index), LAYOUT_nonSeamlessCubeMap); }
    public MemorySegment _nonSeamlessCubeMap() { return _nonSeamlessCubeMapAt(0L); }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _nonSeamlessCubeMapAt(long index, MemorySegment src) { _nonSeamlessCubeMapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT _nonSeamlessCubeMap(MemorySegment src) { return _nonSeamlessCubeMapAt(0L, src); }
}
