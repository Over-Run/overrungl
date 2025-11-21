// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLegacyDitheringFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLegacyDitheringFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 legacyDithering;
/// }
/// ```
public final class VkPhysicalDeviceLegacyDitheringFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyDithering")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_legacyDithering = LAYOUT.byteOffset(PathElement.groupElement("legacyDithering"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_legacyDithering = LAYOUT.select(PathElement.groupElement("legacyDithering"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_legacyDithering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("legacyDithering"));

    public VkPhysicalDeviceLegacyDitheringFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyDitheringFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyDitheringFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyDitheringFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTLegacyDithering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT); }
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTLegacyDithering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT copyFrom(VkPhysicalDeviceLegacyDitheringFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT at(long index, Consumer<VkPhysicalDeviceLegacyDitheringFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int legacyDitheringAt(long index) { return (int) VH_legacyDithering.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int legacyDithering() { return (int) VH_legacyDithering.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT legacyDitheringAt(long index, int value) { VH_legacyDithering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT legacyDithering(int value) { VH_legacyDithering.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _legacyDitheringAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_legacyDithering, index), LAYOUT_legacyDithering); }
    public MemorySegment _legacyDithering() { return _legacyDitheringAt(0L); }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _legacyDitheringAt(long index, MemorySegment src) { _legacyDitheringAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT _legacyDithering(MemorySegment src) { return _legacyDitheringAt(0L, src); }
}
