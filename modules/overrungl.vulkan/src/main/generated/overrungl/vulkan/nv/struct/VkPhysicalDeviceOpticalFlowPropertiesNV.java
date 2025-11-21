// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceOpticalFlowPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpticalFlowPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkOpticalFlowGridSizeFlagsNV supportedOutputGridSizes;
///     VkOpticalFlowGridSizeFlagsNV supportedHintGridSizes;
///     VkBool32 hintSupported;
///     VkBool32 costSupported;
///     VkBool32 bidirectionalFlowSupported;
///     VkBool32 globalFlowSupported;
///     uint32_t minWidth;
///     uint32_t minHeight;
///     uint32_t maxWidth;
///     uint32_t maxHeight;
///     uint32_t maxNumRegionsOfInterest;
/// }
/// ```
public final class VkPhysicalDeviceOpticalFlowPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedOutputGridSizes"),
        ValueLayout.JAVA_INT.withName("supportedHintGridSizes"),
        ValueLayout.JAVA_INT.withName("hintSupported"),
        ValueLayout.JAVA_INT.withName("costSupported"),
        ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported"),
        ValueLayout.JAVA_INT.withName("globalFlowSupported"),
        ValueLayout.JAVA_INT.withName("minWidth"),
        ValueLayout.JAVA_INT.withName("minHeight"),
        ValueLayout.JAVA_INT.withName("maxWidth"),
        ValueLayout.JAVA_INT.withName("maxHeight"),
        ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportedOutputGridSizes = LAYOUT.byteOffset(PathElement.groupElement("supportedOutputGridSizes"));
    public static final long OFFSET_supportedHintGridSizes = LAYOUT.byteOffset(PathElement.groupElement("supportedHintGridSizes"));
    public static final long OFFSET_hintSupported = LAYOUT.byteOffset(PathElement.groupElement("hintSupported"));
    public static final long OFFSET_costSupported = LAYOUT.byteOffset(PathElement.groupElement("costSupported"));
    public static final long OFFSET_bidirectionalFlowSupported = LAYOUT.byteOffset(PathElement.groupElement("bidirectionalFlowSupported"));
    public static final long OFFSET_globalFlowSupported = LAYOUT.byteOffset(PathElement.groupElement("globalFlowSupported"));
    public static final long OFFSET_minWidth = LAYOUT.byteOffset(PathElement.groupElement("minWidth"));
    public static final long OFFSET_minHeight = LAYOUT.byteOffset(PathElement.groupElement("minHeight"));
    public static final long OFFSET_maxWidth = LAYOUT.byteOffset(PathElement.groupElement("maxWidth"));
    public static final long OFFSET_maxHeight = LAYOUT.byteOffset(PathElement.groupElement("maxHeight"));
    public static final long OFFSET_maxNumRegionsOfInterest = LAYOUT.byteOffset(PathElement.groupElement("maxNumRegionsOfInterest"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportedOutputGridSizes = LAYOUT.select(PathElement.groupElement("supportedOutputGridSizes"));
    public static final MemoryLayout LAYOUT_supportedHintGridSizes = LAYOUT.select(PathElement.groupElement("supportedHintGridSizes"));
    public static final MemoryLayout LAYOUT_hintSupported = LAYOUT.select(PathElement.groupElement("hintSupported"));
    public static final MemoryLayout LAYOUT_costSupported = LAYOUT.select(PathElement.groupElement("costSupported"));
    public static final MemoryLayout LAYOUT_bidirectionalFlowSupported = LAYOUT.select(PathElement.groupElement("bidirectionalFlowSupported"));
    public static final MemoryLayout LAYOUT_globalFlowSupported = LAYOUT.select(PathElement.groupElement("globalFlowSupported"));
    public static final MemoryLayout LAYOUT_minWidth = LAYOUT.select(PathElement.groupElement("minWidth"));
    public static final MemoryLayout LAYOUT_minHeight = LAYOUT.select(PathElement.groupElement("minHeight"));
    public static final MemoryLayout LAYOUT_maxWidth = LAYOUT.select(PathElement.groupElement("maxWidth"));
    public static final MemoryLayout LAYOUT_maxHeight = LAYOUT.select(PathElement.groupElement("maxHeight"));
    public static final MemoryLayout LAYOUT_maxNumRegionsOfInterest = LAYOUT.select(PathElement.groupElement("maxNumRegionsOfInterest"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportedOutputGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOutputGridSizes"));
    public static final VarHandle VH_supportedHintGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedHintGridSizes"));
    public static final VarHandle VH_hintSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintSupported"));
    public static final VarHandle VH_costSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costSupported"));
    public static final VarHandle VH_bidirectionalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalFlowSupported"));
    public static final VarHandle VH_globalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalFlowSupported"));
    public static final VarHandle VH_minWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minWidth"));
    public static final VarHandle VH_minHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minHeight"));
    public static final VarHandle VH_maxWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWidth"));
    public static final VarHandle VH_maxHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxHeight"));
    public static final VarHandle VH_maxNumRegionsOfInterest = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxNumRegionsOfInterest"));

    public VkPhysicalDeviceOpticalFlowPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV); }
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceOpticalFlowPropertiesNV copyFrom(VkPhysicalDeviceOpticalFlowPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV at(long index, Consumer<VkPhysicalDeviceOpticalFlowPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedOutputGridSizesAt(long index) { return (int) VH_supportedOutputGridSizes.get(this.segment(), 0L, index); }
    public int supportedHintGridSizesAt(long index) { return (int) VH_supportedHintGridSizes.get(this.segment(), 0L, index); }
    public int hintSupportedAt(long index) { return (int) VH_hintSupported.get(this.segment(), 0L, index); }
    public int costSupportedAt(long index) { return (int) VH_costSupported.get(this.segment(), 0L, index); }
    public int bidirectionalFlowSupportedAt(long index) { return (int) VH_bidirectionalFlowSupported.get(this.segment(), 0L, index); }
    public int globalFlowSupportedAt(long index) { return (int) VH_globalFlowSupported.get(this.segment(), 0L, index); }
    public int minWidthAt(long index) { return (int) VH_minWidth.get(this.segment(), 0L, index); }
    public int minHeightAt(long index) { return (int) VH_minHeight.get(this.segment(), 0L, index); }
    public int maxWidthAt(long index) { return (int) VH_maxWidth.get(this.segment(), 0L, index); }
    public int maxHeightAt(long index) { return (int) VH_maxHeight.get(this.segment(), 0L, index); }
    public int maxNumRegionsOfInterestAt(long index) { return (int) VH_maxNumRegionsOfInterest.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportedOutputGridSizes() { return (int) VH_supportedOutputGridSizes.get(this.segment(), 0L, 0L); }
    public int supportedHintGridSizes() { return (int) VH_supportedHintGridSizes.get(this.segment(), 0L, 0L); }
    public int hintSupported() { return (int) VH_hintSupported.get(this.segment(), 0L, 0L); }
    public int costSupported() { return (int) VH_costSupported.get(this.segment(), 0L, 0L); }
    public int bidirectionalFlowSupported() { return (int) VH_bidirectionalFlowSupported.get(this.segment(), 0L, 0L); }
    public int globalFlowSupported() { return (int) VH_globalFlowSupported.get(this.segment(), 0L, 0L); }
    public int minWidth() { return (int) VH_minWidth.get(this.segment(), 0L, 0L); }
    public int minHeight() { return (int) VH_minHeight.get(this.segment(), 0L, 0L); }
    public int maxWidth() { return (int) VH_maxWidth.get(this.segment(), 0L, 0L); }
    public int maxHeight() { return (int) VH_maxHeight.get(this.segment(), 0L, 0L); }
    public int maxNumRegionsOfInterest() { return (int) VH_maxNumRegionsOfInterest.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizesAt(long index, int value) { VH_supportedOutputGridSizes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizesAt(long index, int value) { VH_supportedHintGridSizes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupportedAt(long index, int value) { VH_hintSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupportedAt(long index, int value) { VH_costSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupportedAt(long index, int value) { VH_bidirectionalFlowSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupportedAt(long index, int value) { VH_globalFlowSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidthAt(long index, int value) { VH_minWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeightAt(long index, int value) { VH_minHeight.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidthAt(long index, int value) { VH_maxWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeightAt(long index, int value) { VH_maxHeight.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterestAt(long index, int value) { VH_maxNumRegionsOfInterest.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizes(int value) { VH_supportedOutputGridSizes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizes(int value) { VH_supportedHintGridSizes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupported(int value) { VH_hintSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupported(int value) { VH_costSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupported(int value) { VH_bidirectionalFlowSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupported(int value) { VH_globalFlowSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidth(int value) { VH_minWidth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeight(int value) { VH_minHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidth(int value) { VH_maxWidth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeight(int value) { VH_maxHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterest(int value) { VH_maxNumRegionsOfInterest.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedOutputGridSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedOutputGridSizes, index), LAYOUT_supportedOutputGridSizes); }
    public MemorySegment _supportedOutputGridSizes() { return _supportedOutputGridSizesAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _supportedOutputGridSizesAt(long index, MemorySegment src) { _supportedOutputGridSizesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _supportedOutputGridSizes(MemorySegment src) { return _supportedOutputGridSizesAt(0L, src); }
    public MemorySegment _supportedHintGridSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedHintGridSizes, index), LAYOUT_supportedHintGridSizes); }
    public MemorySegment _supportedHintGridSizes() { return _supportedHintGridSizesAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _supportedHintGridSizesAt(long index, MemorySegment src) { _supportedHintGridSizesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _supportedHintGridSizes(MemorySegment src) { return _supportedHintGridSizesAt(0L, src); }
    public MemorySegment _hintSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hintSupported, index), LAYOUT_hintSupported); }
    public MemorySegment _hintSupported() { return _hintSupportedAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _hintSupportedAt(long index, MemorySegment src) { _hintSupportedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _hintSupported(MemorySegment src) { return _hintSupportedAt(0L, src); }
    public MemorySegment _costSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_costSupported, index), LAYOUT_costSupported); }
    public MemorySegment _costSupported() { return _costSupportedAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _costSupportedAt(long index, MemorySegment src) { _costSupportedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _costSupported(MemorySegment src) { return _costSupportedAt(0L, src); }
    public MemorySegment _bidirectionalFlowSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bidirectionalFlowSupported, index), LAYOUT_bidirectionalFlowSupported); }
    public MemorySegment _bidirectionalFlowSupported() { return _bidirectionalFlowSupportedAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _bidirectionalFlowSupportedAt(long index, MemorySegment src) { _bidirectionalFlowSupportedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _bidirectionalFlowSupported(MemorySegment src) { return _bidirectionalFlowSupportedAt(0L, src); }
    public MemorySegment _globalFlowSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_globalFlowSupported, index), LAYOUT_globalFlowSupported); }
    public MemorySegment _globalFlowSupported() { return _globalFlowSupportedAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _globalFlowSupportedAt(long index, MemorySegment src) { _globalFlowSupportedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _globalFlowSupported(MemorySegment src) { return _globalFlowSupportedAt(0L, src); }
    public MemorySegment _minWidthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minWidth, index), LAYOUT_minWidth); }
    public MemorySegment _minWidth() { return _minWidthAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _minWidthAt(long index, MemorySegment src) { _minWidthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _minWidth(MemorySegment src) { return _minWidthAt(0L, src); }
    public MemorySegment _minHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minHeight, index), LAYOUT_minHeight); }
    public MemorySegment _minHeight() { return _minHeightAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _minHeightAt(long index, MemorySegment src) { _minHeightAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _minHeight(MemorySegment src) { return _minHeightAt(0L, src); }
    public MemorySegment _maxWidthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxWidth, index), LAYOUT_maxWidth); }
    public MemorySegment _maxWidth() { return _maxWidthAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxWidthAt(long index, MemorySegment src) { _maxWidthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxWidth(MemorySegment src) { return _maxWidthAt(0L, src); }
    public MemorySegment _maxHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxHeight, index), LAYOUT_maxHeight); }
    public MemorySegment _maxHeight() { return _maxHeightAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxHeightAt(long index, MemorySegment src) { _maxHeightAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxHeight(MemorySegment src) { return _maxHeightAt(0L, src); }
    public MemorySegment _maxNumRegionsOfInterestAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxNumRegionsOfInterest, index), LAYOUT_maxNumRegionsOfInterest); }
    public MemorySegment _maxNumRegionsOfInterest() { return _maxNumRegionsOfInterestAt(0L); }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxNumRegionsOfInterestAt(long index, MemorySegment src) { _maxNumRegionsOfInterestAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowPropertiesNV _maxNumRegionsOfInterest(MemorySegment src) { return _maxNumRegionsOfInterestAt(0L, src); }
}
