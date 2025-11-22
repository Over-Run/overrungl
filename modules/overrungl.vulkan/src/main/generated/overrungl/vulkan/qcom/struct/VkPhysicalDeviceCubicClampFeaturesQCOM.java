// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCubicClampFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCubicClampFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cubicRangeClamp;
/// }
/// ```
public final class VkPhysicalDeviceCubicClampFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicRangeClamp")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cubicRangeClamp = LAYOUT.byteOffset(PathElement.groupElement("cubicRangeClamp"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cubicRangeClamp = LAYOUT.select(PathElement.groupElement("cubicRangeClamp"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cubicRangeClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cubicRangeClamp"));

    public VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMFilterCubicClamp.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM); }
    public static VkPhysicalDeviceCubicClampFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMFilterCubicClamp.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceCubicClampFeaturesQCOM copyFrom(VkPhysicalDeviceCubicClampFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceCubicClampFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cubicRangeClampAt(long index) { return (int) VH_cubicRangeClamp.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cubicRangeClamp() { return (int) VH_cubicRangeClamp.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM cubicRangeClampAt(long index, int value) { VH_cubicRangeClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM cubicRangeClamp(int value) { VH_cubicRangeClamp.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cubicRangeClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cubicRangeClamp, index), LAYOUT_cubicRangeClamp); }
    public MemorySegment _cubicRangeClamp() { return _cubicRangeClampAt(0L); }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _cubicRangeClampAt(long index, MemorySegment src) { _cubicRangeClampAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCubicClampFeaturesQCOM _cubicRangeClamp(MemorySegment src) { return _cubicRangeClampAt(0L, src); }
}
