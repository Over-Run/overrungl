// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilities2EXT`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilities2EXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t minImageCount;
///     uint32_t maxImageCount;
///     VkExtent2D currentExtent;
///     VkExtent2D minImageExtent;
///     VkExtent2D maxImageExtent;
///     uint32_t maxImageArrayLayers;
///     VkSurfaceTransformFlagsKHR supportedTransforms;
///     VkSurfaceTransformFlagBitsKHR currentTransform;
///     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
///     VkImageUsageFlags supportedUsageFlags;
///     VkSurfaceCounterFlagsEXT supportedSurfaceCounters;
/// }
/// ```
public final class VkSurfaceCapabilities2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("currentExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags"),
        ValueLayout.JAVA_INT.withName("supportedSurfaceCounters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minImageCount = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
    public static final long OFFSET_maxImageCount = LAYOUT.byteOffset(PathElement.groupElement("maxImageCount"));
    public static final long OFFSET_currentExtent = LAYOUT.byteOffset(PathElement.groupElement("currentExtent"));
    public static final long OFFSET_minImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minImageExtent"));
    public static final long OFFSET_maxImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxImageExtent"));
    public static final long OFFSET_maxImageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
    public static final long OFFSET_supportedTransforms = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
    public static final long OFFSET_currentTransform = LAYOUT.byteOffset(PathElement.groupElement("currentTransform"));
    public static final long OFFSET_supportedCompositeAlpha = LAYOUT.byteOffset(PathElement.groupElement("supportedCompositeAlpha"));
    public static final long OFFSET_supportedUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("supportedUsageFlags"));
    public static final long OFFSET_supportedSurfaceCounters = LAYOUT.byteOffset(PathElement.groupElement("supportedSurfaceCounters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minImageCount = LAYOUT.select(PathElement.groupElement("minImageCount"));
    public static final MemoryLayout LAYOUT_maxImageCount = LAYOUT.select(PathElement.groupElement("maxImageCount"));
    public static final MemoryLayout LAYOUT_currentExtent = LAYOUT.select(PathElement.groupElement("currentExtent"));
    public static final MemoryLayout LAYOUT_minImageExtent = LAYOUT.select(PathElement.groupElement("minImageExtent"));
    public static final MemoryLayout LAYOUT_maxImageExtent = LAYOUT.select(PathElement.groupElement("maxImageExtent"));
    public static final MemoryLayout LAYOUT_maxImageArrayLayers = LAYOUT.select(PathElement.groupElement("maxImageArrayLayers"));
    public static final MemoryLayout LAYOUT_supportedTransforms = LAYOUT.select(PathElement.groupElement("supportedTransforms"));
    public static final MemoryLayout LAYOUT_currentTransform = LAYOUT.select(PathElement.groupElement("currentTransform"));
    public static final MemoryLayout LAYOUT_supportedCompositeAlpha = LAYOUT.select(PathElement.groupElement("supportedCompositeAlpha"));
    public static final MemoryLayout LAYOUT_supportedUsageFlags = LAYOUT.select(PathElement.groupElement("supportedUsageFlags"));
    public static final MemoryLayout LAYOUT_supportedSurfaceCounters = LAYOUT.select(PathElement.groupElement("supportedSurfaceCounters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    public static final VarHandle VH_maxImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageCount"));
    public static final VarHandle VH_currentExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_currentExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_minImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_minImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers"));
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    public static final VarHandle VH_currentTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentTransform"));
    public static final VarHandle VH_supportedCompositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedCompositeAlpha"));
    public static final VarHandle VH_supportedUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedUsageFlags"));
    public static final VarHandle VH_supportedSurfaceCounters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedSurfaceCounters"));

    public VkSurfaceCapabilities2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilities2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilities2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilities2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilities2EXT alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilities2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilities2EXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilities2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDisplaySurfaceCounter.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT); }
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDisplaySurfaceCounter.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT);
        return s;
    }
    public VkSurfaceCapabilities2EXT copyFrom(VkSurfaceCapabilities2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilities2EXT reinterpret(long count) { return new VkSurfaceCapabilities2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilities2EXT asSlice(long index) { return new VkSurfaceCapabilities2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilities2EXT asSlice(long index, long count) { return new VkSurfaceCapabilities2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilities2EXT at(long index, Consumer<VkSurfaceCapabilities2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minImageCountAt(long index) { return (int) VH_minImageCount.get(this.segment(), 0L, index); }
    public int maxImageCountAt(long index) { return (int) VH_maxImageCount.get(this.segment(), 0L, index); }
    public int currentExtent$widthAt(long index) { return (int) VH_currentExtent$width.get(this.segment(), 0L, index); }
    public int currentExtent$heightAt(long index) { return (int) VH_currentExtent$height.get(this.segment(), 0L, index); }
    public int minImageExtent$widthAt(long index) { return (int) VH_minImageExtent$width.get(this.segment(), 0L, index); }
    public int minImageExtent$heightAt(long index) { return (int) VH_minImageExtent$height.get(this.segment(), 0L, index); }
    public int maxImageExtent$widthAt(long index) { return (int) VH_maxImageExtent$width.get(this.segment(), 0L, index); }
    public int maxImageExtent$heightAt(long index) { return (int) VH_maxImageExtent$height.get(this.segment(), 0L, index); }
    public int maxImageArrayLayersAt(long index) { return (int) VH_maxImageArrayLayers.get(this.segment(), 0L, index); }
    public int supportedTransformsAt(long index) { return (int) VH_supportedTransforms.get(this.segment(), 0L, index); }
    public int currentTransformAt(long index) { return (int) VH_currentTransform.get(this.segment(), 0L, index); }
    public int supportedCompositeAlphaAt(long index) { return (int) VH_supportedCompositeAlpha.get(this.segment(), 0L, index); }
    public int supportedUsageFlagsAt(long index) { return (int) VH_supportedUsageFlags.get(this.segment(), 0L, index); }
    public int supportedSurfaceCountersAt(long index) { return (int) VH_supportedSurfaceCounters.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minImageCount() { return (int) VH_minImageCount.get(this.segment(), 0L, 0L); }
    public int maxImageCount() { return (int) VH_maxImageCount.get(this.segment(), 0L, 0L); }
    public int currentExtent$width() { return (int) VH_currentExtent$width.get(this.segment(), 0L, 0L); }
    public int currentExtent$height() { return (int) VH_currentExtent$height.get(this.segment(), 0L, 0L); }
    public int minImageExtent$width() { return (int) VH_minImageExtent$width.get(this.segment(), 0L, 0L); }
    public int minImageExtent$height() { return (int) VH_minImageExtent$height.get(this.segment(), 0L, 0L); }
    public int maxImageExtent$width() { return (int) VH_maxImageExtent$width.get(this.segment(), 0L, 0L); }
    public int maxImageExtent$height() { return (int) VH_maxImageExtent$height.get(this.segment(), 0L, 0L); }
    public int maxImageArrayLayers() { return (int) VH_maxImageArrayLayers.get(this.segment(), 0L, 0L); }
    public int supportedTransforms() { return (int) VH_supportedTransforms.get(this.segment(), 0L, 0L); }
    public int currentTransform() { return (int) VH_currentTransform.get(this.segment(), 0L, 0L); }
    public int supportedCompositeAlpha() { return (int) VH_supportedCompositeAlpha.get(this.segment(), 0L, 0L); }
    public int supportedUsageFlags() { return (int) VH_supportedUsageFlags.get(this.segment(), 0L, 0L); }
    public int supportedSurfaceCounters() { return (int) VH_supportedSurfaceCounters.get(this.segment(), 0L, 0L); }
    public VkSurfaceCapabilities2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT minImageCountAt(long index, int value) { VH_minImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageCountAt(long index, int value) { VH_maxImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT currentExtent$widthAt(long index, int value) { VH_currentExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT currentExtent$heightAt(long index, int value) { VH_currentExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT minImageExtent$widthAt(long index, int value) { VH_minImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT minImageExtent$heightAt(long index, int value) { VH_minImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageExtent$widthAt(long index, int value) { VH_maxImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageExtent$heightAt(long index, int value) { VH_maxImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageArrayLayersAt(long index, int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT supportedTransformsAt(long index, int value) { VH_supportedTransforms.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT currentTransformAt(long index, int value) { VH_currentTransform.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT supportedCompositeAlphaAt(long index, int value) { VH_supportedCompositeAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT supportedUsageFlagsAt(long index, int value) { VH_supportedUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT supportedSurfaceCountersAt(long index, int value) { VH_supportedSurfaceCounters.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilities2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT minImageCount(int value) { VH_minImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageCount(int value) { VH_maxImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT currentExtent$width(int value) { VH_currentExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT currentExtent$height(int value) { VH_currentExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT minImageExtent$width(int value) { VH_minImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT minImageExtent$height(int value) { VH_minImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageExtent$width(int value) { VH_maxImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageExtent$height(int value) { VH_maxImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT maxImageArrayLayers(int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT supportedTransforms(int value) { VH_supportedTransforms.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT currentTransform(int value) { VH_currentTransform.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT supportedCompositeAlpha(int value) { VH_supportedCompositeAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT supportedUsageFlags(int value) { VH_supportedUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilities2EXT supportedSurfaceCounters(int value) { VH_supportedSurfaceCounters.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceCapabilities2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceCapabilities2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minImageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageCount, index), LAYOUT_minImageCount); }
    public MemorySegment _minImageCount() { return _minImageCountAt(0L); }
    public VkSurfaceCapabilities2EXT _minImageCountAt(long index, MemorySegment src) { _minImageCountAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _minImageCount(MemorySegment src) { return _minImageCountAt(0L, src); }
    public MemorySegment _maxImageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageCount, index), LAYOUT_maxImageCount); }
    public MemorySegment _maxImageCount() { return _maxImageCountAt(0L); }
    public VkSurfaceCapabilities2EXT _maxImageCountAt(long index, MemorySegment src) { _maxImageCountAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _maxImageCount(MemorySegment src) { return _maxImageCountAt(0L, src); }
    public MemorySegment _currentExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentExtent, index), LAYOUT_currentExtent); }
    public MemorySegment _currentExtent() { return _currentExtentAt(0L); }
    public VkSurfaceCapabilities2EXT _currentExtentAt(long index, MemorySegment src) { _currentExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _currentExtent(MemorySegment src) { return _currentExtentAt(0L, src); }
    public MemorySegment _minImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageExtent, index), LAYOUT_minImageExtent); }
    public MemorySegment _minImageExtent() { return _minImageExtentAt(0L); }
    public VkSurfaceCapabilities2EXT _minImageExtentAt(long index, MemorySegment src) { _minImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _minImageExtent(MemorySegment src) { return _minImageExtentAt(0L, src); }
    public MemorySegment _maxImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageExtent, index), LAYOUT_maxImageExtent); }
    public MemorySegment _maxImageExtent() { return _maxImageExtentAt(0L); }
    public VkSurfaceCapabilities2EXT _maxImageExtentAt(long index, MemorySegment src) { _maxImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _maxImageExtent(MemorySegment src) { return _maxImageExtentAt(0L, src); }
    public MemorySegment _maxImageArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageArrayLayers, index), LAYOUT_maxImageArrayLayers); }
    public MemorySegment _maxImageArrayLayers() { return _maxImageArrayLayersAt(0L); }
    public VkSurfaceCapabilities2EXT _maxImageArrayLayersAt(long index, MemorySegment src) { _maxImageArrayLayersAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _maxImageArrayLayers(MemorySegment src) { return _maxImageArrayLayersAt(0L, src); }
    public MemorySegment _supportedTransformsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedTransforms, index), LAYOUT_supportedTransforms); }
    public MemorySegment _supportedTransforms() { return _supportedTransformsAt(0L); }
    public VkSurfaceCapabilities2EXT _supportedTransformsAt(long index, MemorySegment src) { _supportedTransformsAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _supportedTransforms(MemorySegment src) { return _supportedTransformsAt(0L, src); }
    public MemorySegment _currentTransformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentTransform, index), LAYOUT_currentTransform); }
    public MemorySegment _currentTransform() { return _currentTransformAt(0L); }
    public VkSurfaceCapabilities2EXT _currentTransformAt(long index, MemorySegment src) { _currentTransformAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _currentTransform(MemorySegment src) { return _currentTransformAt(0L, src); }
    public MemorySegment _supportedCompositeAlphaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedCompositeAlpha, index), LAYOUT_supportedCompositeAlpha); }
    public MemorySegment _supportedCompositeAlpha() { return _supportedCompositeAlphaAt(0L); }
    public VkSurfaceCapabilities2EXT _supportedCompositeAlphaAt(long index, MemorySegment src) { _supportedCompositeAlphaAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _supportedCompositeAlpha(MemorySegment src) { return _supportedCompositeAlphaAt(0L, src); }
    public MemorySegment _supportedUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedUsageFlags, index), LAYOUT_supportedUsageFlags); }
    public MemorySegment _supportedUsageFlags() { return _supportedUsageFlagsAt(0L); }
    public VkSurfaceCapabilities2EXT _supportedUsageFlagsAt(long index, MemorySegment src) { _supportedUsageFlagsAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _supportedUsageFlags(MemorySegment src) { return _supportedUsageFlagsAt(0L, src); }
    public MemorySegment _supportedSurfaceCountersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedSurfaceCounters, index), LAYOUT_supportedSurfaceCounters); }
    public MemorySegment _supportedSurfaceCounters() { return _supportedSurfaceCountersAt(0L); }
    public VkSurfaceCapabilities2EXT _supportedSurfaceCountersAt(long index, MemorySegment src) { _supportedSurfaceCountersAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilities2EXT _supportedSurfaceCounters(MemorySegment src) { return _supportedSurfaceCountersAt(0L, src); }
}
