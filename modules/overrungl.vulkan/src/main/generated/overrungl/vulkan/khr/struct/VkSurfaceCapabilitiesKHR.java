// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesKHR {
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
/// }
/// ```
public final class VkSurfaceCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("currentExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags")
    );
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

    public VkSurfaceCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public VkSurfaceCapabilitiesKHR copyFrom(VkSurfaceCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilitiesKHR reinterpret(long count) { return new VkSurfaceCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilitiesKHR asSlice(long index) { return new VkSurfaceCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilitiesKHR asSlice(long index, long count) { return new VkSurfaceCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilitiesKHR at(long index, Consumer<VkSurfaceCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
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
    public VkSurfaceCapabilitiesKHR minImageCountAt(long index, int value) { VH_minImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageCountAt(long index, int value) { VH_maxImageCount.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR currentExtent$widthAt(long index, int value) { VH_currentExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR currentExtent$heightAt(long index, int value) { VH_currentExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR minImageExtent$widthAt(long index, int value) { VH_minImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR minImageExtent$heightAt(long index, int value) { VH_minImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageExtent$widthAt(long index, int value) { VH_maxImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageExtent$heightAt(long index, int value) { VH_maxImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageArrayLayersAt(long index, int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedTransformsAt(long index, int value) { VH_supportedTransforms.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR currentTransformAt(long index, int value) { VH_currentTransform.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedCompositeAlphaAt(long index, int value) { VH_supportedCompositeAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedUsageFlagsAt(long index, int value) { VH_supportedUsageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesKHR minImageCount(int value) { VH_minImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageCount(int value) { VH_maxImageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR currentExtent$width(int value) { VH_currentExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR currentExtent$height(int value) { VH_currentExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR minImageExtent$width(int value) { VH_minImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR minImageExtent$height(int value) { VH_minImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageExtent$width(int value) { VH_maxImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageExtent$height(int value) { VH_maxImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR maxImageArrayLayers(int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedTransforms(int value) { VH_supportedTransforms.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR currentTransform(int value) { VH_currentTransform.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedCompositeAlpha(int value) { VH_supportedCompositeAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesKHR supportedUsageFlags(int value) { VH_supportedUsageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _minImageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageCount, index), LAYOUT_minImageCount); }
    public MemorySegment _minImageCount() { return _minImageCountAt(0L); }
    public VkSurfaceCapabilitiesKHR _minImageCountAt(long index, MemorySegment src) { _minImageCountAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _minImageCount(MemorySegment src) { return _minImageCountAt(0L, src); }
    public MemorySegment _maxImageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageCount, index), LAYOUT_maxImageCount); }
    public MemorySegment _maxImageCount() { return _maxImageCountAt(0L); }
    public VkSurfaceCapabilitiesKHR _maxImageCountAt(long index, MemorySegment src) { _maxImageCountAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _maxImageCount(MemorySegment src) { return _maxImageCountAt(0L, src); }
    public MemorySegment _currentExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentExtent, index), LAYOUT_currentExtent); }
    public MemorySegment _currentExtent() { return _currentExtentAt(0L); }
    public VkSurfaceCapabilitiesKHR _currentExtentAt(long index, MemorySegment src) { _currentExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _currentExtent(MemorySegment src) { return _currentExtentAt(0L, src); }
    public MemorySegment _minImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageExtent, index), LAYOUT_minImageExtent); }
    public MemorySegment _minImageExtent() { return _minImageExtentAt(0L); }
    public VkSurfaceCapabilitiesKHR _minImageExtentAt(long index, MemorySegment src) { _minImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _minImageExtent(MemorySegment src) { return _minImageExtentAt(0L, src); }
    public MemorySegment _maxImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageExtent, index), LAYOUT_maxImageExtent); }
    public MemorySegment _maxImageExtent() { return _maxImageExtentAt(0L); }
    public VkSurfaceCapabilitiesKHR _maxImageExtentAt(long index, MemorySegment src) { _maxImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _maxImageExtent(MemorySegment src) { return _maxImageExtentAt(0L, src); }
    public MemorySegment _maxImageArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageArrayLayers, index), LAYOUT_maxImageArrayLayers); }
    public MemorySegment _maxImageArrayLayers() { return _maxImageArrayLayersAt(0L); }
    public VkSurfaceCapabilitiesKHR _maxImageArrayLayersAt(long index, MemorySegment src) { _maxImageArrayLayersAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _maxImageArrayLayers(MemorySegment src) { return _maxImageArrayLayersAt(0L, src); }
    public MemorySegment _supportedTransformsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedTransforms, index), LAYOUT_supportedTransforms); }
    public MemorySegment _supportedTransforms() { return _supportedTransformsAt(0L); }
    public VkSurfaceCapabilitiesKHR _supportedTransformsAt(long index, MemorySegment src) { _supportedTransformsAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _supportedTransforms(MemorySegment src) { return _supportedTransformsAt(0L, src); }
    public MemorySegment _currentTransformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentTransform, index), LAYOUT_currentTransform); }
    public MemorySegment _currentTransform() { return _currentTransformAt(0L); }
    public VkSurfaceCapabilitiesKHR _currentTransformAt(long index, MemorySegment src) { _currentTransformAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _currentTransform(MemorySegment src) { return _currentTransformAt(0L, src); }
    public MemorySegment _supportedCompositeAlphaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedCompositeAlpha, index), LAYOUT_supportedCompositeAlpha); }
    public MemorySegment _supportedCompositeAlpha() { return _supportedCompositeAlphaAt(0L); }
    public VkSurfaceCapabilitiesKHR _supportedCompositeAlphaAt(long index, MemorySegment src) { _supportedCompositeAlphaAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _supportedCompositeAlpha(MemorySegment src) { return _supportedCompositeAlphaAt(0L, src); }
    public MemorySegment _supportedUsageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedUsageFlags, index), LAYOUT_supportedUsageFlags); }
    public MemorySegment _supportedUsageFlags() { return _supportedUsageFlagsAt(0L); }
    public VkSurfaceCapabilitiesKHR _supportedUsageFlagsAt(long index, MemorySegment src) { _supportedUsageFlagsAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesKHR _supportedUsageFlags(MemorySegment src) { return _supportedUsageFlagsAt(0L, src); }
}
