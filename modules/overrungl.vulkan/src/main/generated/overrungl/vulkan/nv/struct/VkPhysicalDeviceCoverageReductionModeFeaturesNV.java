// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCoverageReductionModeFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCoverageReductionModeFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 coverageReductionMode;
/// }
/// ```
public final class VkPhysicalDeviceCoverageReductionModeFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_coverageReductionMode = LAYOUT.byteOffset(PathElement.groupElement("coverageReductionMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_coverageReductionMode = LAYOUT.select(PathElement.groupElement("coverageReductionMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_coverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageReductionMode"));

    public VkPhysicalDeviceCoverageReductionModeFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCoverageReductionMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV); }
    public static VkPhysicalDeviceCoverageReductionModeFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCoverageReductionMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV copyFrom(VkPhysicalDeviceCoverageReductionModeFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCoverageReductionModeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV at(long index, Consumer<VkPhysicalDeviceCoverageReductionModeFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int coverageReductionModeAt(long index) { return (int) VH_coverageReductionMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int coverageReductionMode() { return (int) VH_coverageReductionMode.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV coverageReductionModeAt(long index, int value) { VH_coverageReductionMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV coverageReductionMode(int value) { VH_coverageReductionMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _coverageReductionModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageReductionMode, index), LAYOUT_coverageReductionMode); }
    public MemorySegment _coverageReductionMode() { return _coverageReductionModeAt(0L); }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _coverageReductionModeAt(long index, MemorySegment src) { _coverageReductionModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV _coverageReductionMode(MemorySegment src) { return _coverageReductionModeAt(0L, src); }
}
