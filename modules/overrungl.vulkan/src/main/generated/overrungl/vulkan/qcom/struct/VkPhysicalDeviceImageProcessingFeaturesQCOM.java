// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageProcessingFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessingFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 textureSampleWeighted;
///     VkBool32 textureBoxFilter;
///     VkBool32 textureBlockMatch;
/// }
/// ```
public final class VkPhysicalDeviceImageProcessingFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureSampleWeighted"),
        ValueLayout.JAVA_INT.withName("textureBoxFilter"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_textureSampleWeighted = LAYOUT.byteOffset(PathElement.groupElement("textureSampleWeighted"));
    public static final long OFFSET_textureBoxFilter = LAYOUT.byteOffset(PathElement.groupElement("textureBoxFilter"));
    public static final long OFFSET_textureBlockMatch = LAYOUT.byteOffset(PathElement.groupElement("textureBlockMatch"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_textureSampleWeighted = LAYOUT.select(PathElement.groupElement("textureSampleWeighted"));
    public static final MemoryLayout LAYOUT_textureBoxFilter = LAYOUT.select(PathElement.groupElement("textureBoxFilter"));
    public static final MemoryLayout LAYOUT_textureBlockMatch = LAYOUT.select(PathElement.groupElement("textureBlockMatch"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_textureSampleWeighted = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureSampleWeighted"));
    public static final VarHandle VH_textureBoxFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBoxFilter"));
    public static final VarHandle VH_textureBlockMatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBlockMatch"));

    public VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM); }
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM copyFrom(VkPhysicalDeviceImageProcessingFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessingFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int textureSampleWeightedAt(long index) { return (int) VH_textureSampleWeighted.get(this.segment(), 0L, index); }
    public int textureBoxFilterAt(long index) { return (int) VH_textureBoxFilter.get(this.segment(), 0L, index); }
    public int textureBlockMatchAt(long index) { return (int) VH_textureBlockMatch.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int textureSampleWeighted() { return (int) VH_textureSampleWeighted.get(this.segment(), 0L, 0L); }
    public int textureBoxFilter() { return (int) VH_textureBoxFilter.get(this.segment(), 0L, 0L); }
    public int textureBlockMatch() { return (int) VH_textureBlockMatch.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeightedAt(long index, int value) { VH_textureSampleWeighted.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilterAt(long index, int value) { VH_textureBoxFilter.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatchAt(long index, int value) { VH_textureBlockMatch.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(int value) { VH_textureSampleWeighted.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(int value) { VH_textureBoxFilter.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(int value) { VH_textureBlockMatch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _textureSampleWeightedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureSampleWeighted, index), LAYOUT_textureSampleWeighted); }
    public MemorySegment _textureSampleWeighted() { return _textureSampleWeightedAt(0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureSampleWeightedAt(long index, MemorySegment src) { _textureSampleWeightedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureSampleWeighted(MemorySegment src) { return _textureSampleWeightedAt(0L, src); }
    public MemorySegment _textureBoxFilterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureBoxFilter, index), LAYOUT_textureBoxFilter); }
    public MemorySegment _textureBoxFilter() { return _textureBoxFilterAt(0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureBoxFilterAt(long index, MemorySegment src) { _textureBoxFilterAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureBoxFilter(MemorySegment src) { return _textureBoxFilterAt(0L, src); }
    public MemorySegment _textureBlockMatchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureBlockMatch, index), LAYOUT_textureBlockMatch); }
    public MemorySegment _textureBlockMatch() { return _textureBlockMatchAt(0L); }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureBlockMatchAt(long index, MemorySegment src) { _textureBlockMatchAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessingFeaturesQCOM _textureBlockMatch(MemorySegment src) { return _textureBlockMatchAt(0L, src); }
}
