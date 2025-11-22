// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxWeightFilterPhases;
///     VkExtent2D maxWeightFilterDimension;
///     VkExtent2D maxBlockMatchRegion;
///     VkExtent2D maxBoxFilterBlockSize;
/// }
/// ```
public final class VkPhysicalDeviceImageProcessingPropertiesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWeightFilterPhases"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxWeightFilterPhases = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterPhases"));
    public static final long OFFSET_maxWeightFilterDimension = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterDimension"));
    public static final long OFFSET_maxBlockMatchRegion = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchRegion"));
    public static final long OFFSET_maxBoxFilterBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxBoxFilterBlockSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxWeightFilterPhases = LAYOUT.select(PathElement.groupElement("maxWeightFilterPhases"));
    public static final MemoryLayout LAYOUT_maxWeightFilterDimension = LAYOUT.select(PathElement.groupElement("maxWeightFilterDimension"));
    public static final MemoryLayout LAYOUT_maxBlockMatchRegion = LAYOUT.select(PathElement.groupElement("maxBlockMatchRegion"));
    public static final MemoryLayout LAYOUT_maxBoxFilterBlockSize = LAYOUT.select(PathElement.groupElement("maxBoxFilterBlockSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxWeightFilterPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWeightFilterPhases"));
    public static final VarHandle VH_maxWeightFilterDimension$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWeightFilterDimension"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxWeightFilterDimension$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWeightFilterDimension"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxBlockMatchRegion$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBlockMatchRegion"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxBlockMatchRegion$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBlockMatchRegion"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxBoxFilterBlockSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBoxFilterBlockSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxBoxFilterBlockSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBoxFilterBlockSize"), PathElement.groupElement("height"));

    public VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM); }
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM);
        return s;
    }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM copyFrom(VkPhysicalDeviceImageProcessingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessingPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxWeightFilterPhasesAt(long index) { return (int) VH_maxWeightFilterPhases.get(this.segment(), 0L, index); }
    public int maxWeightFilterDimension$widthAt(long index) { return (int) VH_maxWeightFilterDimension$width.get(this.segment(), 0L, index); }
    public int maxWeightFilterDimension$heightAt(long index) { return (int) VH_maxWeightFilterDimension$height.get(this.segment(), 0L, index); }
    public int maxBlockMatchRegion$widthAt(long index) { return (int) VH_maxBlockMatchRegion$width.get(this.segment(), 0L, index); }
    public int maxBlockMatchRegion$heightAt(long index) { return (int) VH_maxBlockMatchRegion$height.get(this.segment(), 0L, index); }
    public int maxBoxFilterBlockSize$widthAt(long index) { return (int) VH_maxBoxFilterBlockSize$width.get(this.segment(), 0L, index); }
    public int maxBoxFilterBlockSize$heightAt(long index) { return (int) VH_maxBoxFilterBlockSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxWeightFilterPhases() { return (int) VH_maxWeightFilterPhases.get(this.segment(), 0L, 0L); }
    public int maxWeightFilterDimension$width() { return (int) VH_maxWeightFilterDimension$width.get(this.segment(), 0L, 0L); }
    public int maxWeightFilterDimension$height() { return (int) VH_maxWeightFilterDimension$height.get(this.segment(), 0L, 0L); }
    public int maxBlockMatchRegion$width() { return (int) VH_maxBlockMatchRegion$width.get(this.segment(), 0L, 0L); }
    public int maxBlockMatchRegion$height() { return (int) VH_maxBlockMatchRegion$height.get(this.segment(), 0L, 0L); }
    public int maxBoxFilterBlockSize$width() { return (int) VH_maxBoxFilterBlockSize$width.get(this.segment(), 0L, 0L); }
    public int maxBoxFilterBlockSize$height() { return (int) VH_maxBoxFilterBlockSize$height.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhasesAt(long index, int value) { VH_maxWeightFilterPhases.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension$widthAt(long index, int value) { VH_maxWeightFilterDimension$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension$heightAt(long index, int value) { VH_maxWeightFilterDimension$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion$widthAt(long index, int value) { VH_maxBlockMatchRegion$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion$heightAt(long index, int value) { VH_maxBlockMatchRegion$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize$widthAt(long index, int value) { VH_maxBoxFilterBlockSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize$heightAt(long index, int value) { VH_maxBoxFilterBlockSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhases(int value) { VH_maxWeightFilterPhases.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension$width(int value) { VH_maxWeightFilterDimension$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension$height(int value) { VH_maxWeightFilterDimension$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion$width(int value) { VH_maxBlockMatchRegion$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion$height(int value) { VH_maxBlockMatchRegion$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize$width(int value) { VH_maxBoxFilterBlockSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize$height(int value) { VH_maxBoxFilterBlockSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxWeightFilterPhasesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxWeightFilterPhases, index), LAYOUT_maxWeightFilterPhases); }
    public MemorySegment _maxWeightFilterPhases() { return _maxWeightFilterPhasesAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxWeightFilterPhasesAt(long index, MemorySegment src) { _maxWeightFilterPhasesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxWeightFilterPhases(MemorySegment src) { return _maxWeightFilterPhasesAt(0L, src); }
    public MemorySegment _maxWeightFilterDimensionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxWeightFilterDimension, index), LAYOUT_maxWeightFilterDimension); }
    public MemorySegment _maxWeightFilterDimension() { return _maxWeightFilterDimensionAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxWeightFilterDimensionAt(long index, MemorySegment src) { _maxWeightFilterDimensionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxWeightFilterDimension(MemorySegment src) { return _maxWeightFilterDimensionAt(0L, src); }
    public MemorySegment _maxBlockMatchRegionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBlockMatchRegion, index), LAYOUT_maxBlockMatchRegion); }
    public MemorySegment _maxBlockMatchRegion() { return _maxBlockMatchRegionAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxBlockMatchRegionAt(long index, MemorySegment src) { _maxBlockMatchRegionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxBlockMatchRegion(MemorySegment src) { return _maxBlockMatchRegionAt(0L, src); }
    public MemorySegment _maxBoxFilterBlockSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBoxFilterBlockSize, index), LAYOUT_maxBoxFilterBlockSize); }
    public MemorySegment _maxBoxFilterBlockSize() { return _maxBoxFilterBlockSizeAt(0L); }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxBoxFilterBlockSizeAt(long index, MemorySegment src) { _maxBoxFilterBlockSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingPropertiesQCOM _maxBoxFilterBlockSize(MemorySegment src) { return _maxBoxFilterBlockSizeAt(0L, src); }
}
