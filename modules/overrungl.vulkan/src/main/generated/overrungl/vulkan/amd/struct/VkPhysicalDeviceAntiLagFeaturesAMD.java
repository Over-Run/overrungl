// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAntiLagFeaturesAMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAntiLagFeaturesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 antiLag;
/// }
/// ```
public final class VkPhysicalDeviceAntiLagFeaturesAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("antiLag")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_antiLag = LAYOUT.byteOffset(PathElement.groupElement("antiLag"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_antiLag = LAYOUT.select(PathElement.groupElement("antiLag"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_antiLag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("antiLag"));

    public VkPhysicalDeviceAntiLagFeaturesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAntiLagFeaturesAMD(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD); }
    public static VkPhysicalDeviceAntiLagFeaturesAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
        return s;
    }
    public VkPhysicalDeviceAntiLagFeaturesAMD copyFrom(VkPhysicalDeviceAntiLagFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD reinterpret(long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAntiLagFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAntiLagFeaturesAMD asSlice(long index, long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAntiLagFeaturesAMD at(long index, Consumer<VkPhysicalDeviceAntiLagFeaturesAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int antiLagAt(long index) { return (int) VH_antiLag.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int antiLag() { return (int) VH_antiLag.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAntiLagFeaturesAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLagAt(long index, int value) { VH_antiLag.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(int value) { VH_antiLag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAntiLagFeaturesAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAntiLagFeaturesAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _antiLagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_antiLag, index), LAYOUT_antiLag); }
    public MemorySegment _antiLag() { return _antiLagAt(0L); }
    public VkPhysicalDeviceAntiLagFeaturesAMD _antiLagAt(long index, MemorySegment src) { _antiLagAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAntiLagFeaturesAMD _antiLag(MemorySegment src) { return _antiLagAt(0L, src); }
}
