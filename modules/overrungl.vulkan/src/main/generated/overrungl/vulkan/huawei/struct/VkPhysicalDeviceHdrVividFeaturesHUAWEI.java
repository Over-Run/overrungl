// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceHdrVividFeaturesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceHdrVividFeaturesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hdrVivid;
/// }
/// ```
public final class VkPhysicalDeviceHdrVividFeaturesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hdrVivid")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hdrVivid = LAYOUT.byteOffset(PathElement.groupElement("hdrVivid"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hdrVivid = LAYOUT.select(PathElement.groupElement("hdrVivid"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hdrVivid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hdrVivid"));

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI); }
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI copyFrom(VkPhysicalDeviceHdrVividFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI at(long index, Consumer<VkPhysicalDeviceHdrVividFeaturesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hdrVividAt(long index) { return (int) VH_hdrVivid.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hdrVivid() { return (int) VH_hdrVivid.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVividAt(long index, int value) { VH_hdrVivid.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVivid(int value) { VH_hdrVivid.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hdrVividAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hdrVivid, index), LAYOUT_hdrVivid); }
    public MemorySegment _hdrVivid() { return _hdrVividAt(0L); }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _hdrVividAt(long index, MemorySegment src) { _hdrVividAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI _hdrVivid(MemorySegment src) { return _hdrVividAt(0L, src); }
}
