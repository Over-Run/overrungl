// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMapOffset;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMapOffset = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapOffset = LAYOUT.select(PathElement.groupElement("fragmentDensityMapOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMapOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapOffset"));

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM copyFrom(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapOffsetAt(long index) { return (int) VH_fragmentDensityMapOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapOffset() { return (int) VH_fragmentDensityMapOffset.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffsetAt(long index, int value) { VH_fragmentDensityMapOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(int value) { VH_fragmentDensityMapOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapOffset, index), LAYOUT_fragmentDensityMapOffset); }
    public MemorySegment _fragmentDensityMapOffset() { return _fragmentDensityMapOffsetAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _fragmentDensityMapOffsetAt(long index, MemorySegment src) { _fragmentDensityMapOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM _fragmentDensityMapOffset(MemorySegment src) { return _fragmentDensityMapOffsetAt(0L, src); }
}
