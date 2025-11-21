// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMapLayered;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapLayered")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMapLayered = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapLayered"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapLayered = LAYOUT.select(PathElement.groupElement("fragmentDensityMapLayered"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMapLayered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapLayered"));

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE); }
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE copyFrom(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapLayeredAt(long index) { return (int) VH_fragmentDensityMapLayered.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapLayered() { return (int) VH_fragmentDensityMapLayered.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayeredAt(long index, int value) { VH_fragmentDensityMapLayered.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayered(int value) { VH_fragmentDensityMapLayered.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapLayeredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapLayered, index), LAYOUT_fragmentDensityMapLayered); }
    public MemorySegment _fragmentDensityMapLayered() { return _fragmentDensityMapLayeredAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _fragmentDensityMapLayeredAt(long index, MemorySegment src) { _fragmentDensityMapLayeredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE _fragmentDensityMapLayered(MemorySegment src) { return _fragmentDensityMapLayeredAt(0L, src); }
}
