// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.img.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 relaxedLineRasterization;
/// }
/// ```
public final class VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("relaxedLineRasterization")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_relaxedLineRasterization = LAYOUT.byteOffset(PathElement.groupElement("relaxedLineRasterization"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_relaxedLineRasterization = LAYOUT.select(PathElement.groupElement("relaxedLineRasterization"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_relaxedLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("relaxedLineRasterization"));

    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.img.VKIMGRelaxedLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG); }
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.img.VKIMGRelaxedLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG);
        return s;
    }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG copyFrom(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG reinterpret(long count) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG asSlice(long index) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG asSlice(long index, long count) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG at(long index, Consumer<VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int relaxedLineRasterizationAt(long index) { return (int) VH_relaxedLineRasterization.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int relaxedLineRasterization() { return (int) VH_relaxedLineRasterization.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterizationAt(long index, int value) { VH_relaxedLineRasterization.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterization(int value) { VH_relaxedLineRasterization.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _relaxedLineRasterizationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_relaxedLineRasterization, index), LAYOUT_relaxedLineRasterization); }
    public MemorySegment _relaxedLineRasterization() { return _relaxedLineRasterizationAt(0L); }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _relaxedLineRasterizationAt(long index, MemorySegment src) { _relaxedLineRasterizationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG _relaxedLineRasterization(MemorySegment src) { return _relaxedLineRasterizationAt(0L, src); }
}
