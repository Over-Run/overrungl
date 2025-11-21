// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlaneCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneCapabilitiesKHR {
///     VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
///     VkOffset2D minSrcPosition;
///     VkOffset2D maxSrcPosition;
///     VkExtent2D minSrcExtent;
///     VkExtent2D maxSrcExtent;
///     VkOffset2D minDstPosition;
///     VkOffset2D maxDstPosition;
///     VkExtent2D minDstExtent;
///     VkExtent2D maxDstExtent;
/// }
/// ```
public final class VkDisplayPlaneCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("supportedAlpha"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minSrcPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxSrcPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minSrcExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSrcExtent"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minDstPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxDstPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minDstExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxDstExtent")
    );
    public static final long OFFSET_supportedAlpha = LAYOUT.byteOffset(PathElement.groupElement("supportedAlpha"));
    public static final long OFFSET_minSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("minSrcPosition"));
    public static final long OFFSET_maxSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("maxSrcPosition"));
    public static final long OFFSET_minSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("minSrcExtent"));
    public static final long OFFSET_maxSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("maxSrcExtent"));
    public static final long OFFSET_minDstPosition = LAYOUT.byteOffset(PathElement.groupElement("minDstPosition"));
    public static final long OFFSET_maxDstPosition = LAYOUT.byteOffset(PathElement.groupElement("maxDstPosition"));
    public static final long OFFSET_minDstExtent = LAYOUT.byteOffset(PathElement.groupElement("minDstExtent"));
    public static final long OFFSET_maxDstExtent = LAYOUT.byteOffset(PathElement.groupElement("maxDstExtent"));
    public static final MemoryLayout LAYOUT_supportedAlpha = LAYOUT.select(PathElement.groupElement("supportedAlpha"));
    public static final MemoryLayout LAYOUT_minSrcPosition = LAYOUT.select(PathElement.groupElement("minSrcPosition"));
    public static final MemoryLayout LAYOUT_maxSrcPosition = LAYOUT.select(PathElement.groupElement("maxSrcPosition"));
    public static final MemoryLayout LAYOUT_minSrcExtent = LAYOUT.select(PathElement.groupElement("minSrcExtent"));
    public static final MemoryLayout LAYOUT_maxSrcExtent = LAYOUT.select(PathElement.groupElement("maxSrcExtent"));
    public static final MemoryLayout LAYOUT_minDstPosition = LAYOUT.select(PathElement.groupElement("minDstPosition"));
    public static final MemoryLayout LAYOUT_maxDstPosition = LAYOUT.select(PathElement.groupElement("maxDstPosition"));
    public static final MemoryLayout LAYOUT_minDstExtent = LAYOUT.select(PathElement.groupElement("minDstExtent"));
    public static final MemoryLayout LAYOUT_maxDstExtent = LAYOUT.select(PathElement.groupElement("maxDstExtent"));
    public static final VarHandle VH_supportedAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedAlpha"));
    public static final VarHandle VH_minSrcPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSrcPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_minSrcPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSrcPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_maxSrcPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSrcPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_maxSrcPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSrcPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_minSrcExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSrcExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_minSrcExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSrcExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxSrcExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSrcExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxSrcExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSrcExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_minDstPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDstPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_minDstPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDstPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_maxDstPosition$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDstPosition"), PathElement.groupElement("x"));
    public static final VarHandle VH_maxDstPosition$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDstPosition"), PathElement.groupElement("y"));
    public static final VarHandle VH_minDstExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDstExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_minDstExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDstExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxDstExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDstExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxDstExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDstExtent"), PathElement.groupElement("height"));

    public VkDisplayPlaneCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPlaneCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPlaneCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPlaneCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPlaneCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPlaneCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDisplayPlaneCapabilitiesKHR copyFrom(VkDisplayPlaneCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPlaneCapabilitiesKHR reinterpret(long count) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPlaneCapabilitiesKHR asSlice(long index) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPlaneCapabilitiesKHR asSlice(long index, long count) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPlaneCapabilitiesKHR at(long index, Consumer<VkDisplayPlaneCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int supportedAlphaAt(long index) { return (int) VH_supportedAlpha.get(this.segment(), 0L, index); }
    public int minSrcPosition$xAt(long index) { return (int) VH_minSrcPosition$x.get(this.segment(), 0L, index); }
    public int minSrcPosition$yAt(long index) { return (int) VH_minSrcPosition$y.get(this.segment(), 0L, index); }
    public int maxSrcPosition$xAt(long index) { return (int) VH_maxSrcPosition$x.get(this.segment(), 0L, index); }
    public int maxSrcPosition$yAt(long index) { return (int) VH_maxSrcPosition$y.get(this.segment(), 0L, index); }
    public int minSrcExtent$widthAt(long index) { return (int) VH_minSrcExtent$width.get(this.segment(), 0L, index); }
    public int minSrcExtent$heightAt(long index) { return (int) VH_minSrcExtent$height.get(this.segment(), 0L, index); }
    public int maxSrcExtent$widthAt(long index) { return (int) VH_maxSrcExtent$width.get(this.segment(), 0L, index); }
    public int maxSrcExtent$heightAt(long index) { return (int) VH_maxSrcExtent$height.get(this.segment(), 0L, index); }
    public int minDstPosition$xAt(long index) { return (int) VH_minDstPosition$x.get(this.segment(), 0L, index); }
    public int minDstPosition$yAt(long index) { return (int) VH_minDstPosition$y.get(this.segment(), 0L, index); }
    public int maxDstPosition$xAt(long index) { return (int) VH_maxDstPosition$x.get(this.segment(), 0L, index); }
    public int maxDstPosition$yAt(long index) { return (int) VH_maxDstPosition$y.get(this.segment(), 0L, index); }
    public int minDstExtent$widthAt(long index) { return (int) VH_minDstExtent$width.get(this.segment(), 0L, index); }
    public int minDstExtent$heightAt(long index) { return (int) VH_minDstExtent$height.get(this.segment(), 0L, index); }
    public int maxDstExtent$widthAt(long index) { return (int) VH_maxDstExtent$width.get(this.segment(), 0L, index); }
    public int maxDstExtent$heightAt(long index) { return (int) VH_maxDstExtent$height.get(this.segment(), 0L, index); }
    public int supportedAlpha() { return (int) VH_supportedAlpha.get(this.segment(), 0L, 0L); }
    public int minSrcPosition$x() { return (int) VH_minSrcPosition$x.get(this.segment(), 0L, 0L); }
    public int minSrcPosition$y() { return (int) VH_minSrcPosition$y.get(this.segment(), 0L, 0L); }
    public int maxSrcPosition$x() { return (int) VH_maxSrcPosition$x.get(this.segment(), 0L, 0L); }
    public int maxSrcPosition$y() { return (int) VH_maxSrcPosition$y.get(this.segment(), 0L, 0L); }
    public int minSrcExtent$width() { return (int) VH_minSrcExtent$width.get(this.segment(), 0L, 0L); }
    public int minSrcExtent$height() { return (int) VH_minSrcExtent$height.get(this.segment(), 0L, 0L); }
    public int maxSrcExtent$width() { return (int) VH_maxSrcExtent$width.get(this.segment(), 0L, 0L); }
    public int maxSrcExtent$height() { return (int) VH_maxSrcExtent$height.get(this.segment(), 0L, 0L); }
    public int minDstPosition$x() { return (int) VH_minDstPosition$x.get(this.segment(), 0L, 0L); }
    public int minDstPosition$y() { return (int) VH_minDstPosition$y.get(this.segment(), 0L, 0L); }
    public int maxDstPosition$x() { return (int) VH_maxDstPosition$x.get(this.segment(), 0L, 0L); }
    public int maxDstPosition$y() { return (int) VH_maxDstPosition$y.get(this.segment(), 0L, 0L); }
    public int minDstExtent$width() { return (int) VH_minDstExtent$width.get(this.segment(), 0L, 0L); }
    public int minDstExtent$height() { return (int) VH_minDstExtent$height.get(this.segment(), 0L, 0L); }
    public int maxDstExtent$width() { return (int) VH_maxDstExtent$width.get(this.segment(), 0L, 0L); }
    public int maxDstExtent$height() { return (int) VH_maxDstExtent$height.get(this.segment(), 0L, 0L); }
    public VkDisplayPlaneCapabilitiesKHR supportedAlphaAt(long index, int value) { VH_supportedAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition$xAt(long index, int value) { VH_minSrcPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition$yAt(long index, int value) { VH_minSrcPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition$xAt(long index, int value) { VH_maxSrcPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition$yAt(long index, int value) { VH_maxSrcPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent$widthAt(long index, int value) { VH_minSrcExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent$heightAt(long index, int value) { VH_minSrcExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent$widthAt(long index, int value) { VH_maxSrcExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent$heightAt(long index, int value) { VH_maxSrcExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstPosition$xAt(long index, int value) { VH_minDstPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstPosition$yAt(long index, int value) { VH_minDstPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition$xAt(long index, int value) { VH_maxDstPosition$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition$yAt(long index, int value) { VH_maxDstPosition$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstExtent$widthAt(long index, int value) { VH_minDstExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstExtent$heightAt(long index, int value) { VH_minDstExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent$widthAt(long index, int value) { VH_maxDstExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent$heightAt(long index, int value) { VH_maxDstExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR supportedAlpha(int value) { VH_supportedAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition$x(int value) { VH_minSrcPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition$y(int value) { VH_minSrcPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition$x(int value) { VH_maxSrcPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition$y(int value) { VH_maxSrcPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent$width(int value) { VH_minSrcExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent$height(int value) { VH_minSrcExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent$width(int value) { VH_maxSrcExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent$height(int value) { VH_maxSrcExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstPosition$x(int value) { VH_minDstPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstPosition$y(int value) { VH_minDstPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition$x(int value) { VH_maxDstPosition$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition$y(int value) { VH_maxDstPosition$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstExtent$width(int value) { VH_minDstExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR minDstExtent$height(int value) { VH_minDstExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent$width(int value) { VH_maxDstExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent$height(int value) { VH_maxDstExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _supportedAlphaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedAlpha, index), LAYOUT_supportedAlpha); }
    public MemorySegment _supportedAlpha() { return _supportedAlphaAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _supportedAlphaAt(long index, MemorySegment src) { _supportedAlphaAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _supportedAlpha(MemorySegment src) { return _supportedAlphaAt(0L, src); }
    public MemorySegment _minSrcPositionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSrcPosition, index), LAYOUT_minSrcPosition); }
    public MemorySegment _minSrcPosition() { return _minSrcPositionAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _minSrcPositionAt(long index, MemorySegment src) { _minSrcPositionAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _minSrcPosition(MemorySegment src) { return _minSrcPositionAt(0L, src); }
    public MemorySegment _maxSrcPositionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSrcPosition, index), LAYOUT_maxSrcPosition); }
    public MemorySegment _maxSrcPosition() { return _maxSrcPositionAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _maxSrcPositionAt(long index, MemorySegment src) { _maxSrcPositionAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _maxSrcPosition(MemorySegment src) { return _maxSrcPositionAt(0L, src); }
    public MemorySegment _minSrcExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSrcExtent, index), LAYOUT_minSrcExtent); }
    public MemorySegment _minSrcExtent() { return _minSrcExtentAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _minSrcExtentAt(long index, MemorySegment src) { _minSrcExtentAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _minSrcExtent(MemorySegment src) { return _minSrcExtentAt(0L, src); }
    public MemorySegment _maxSrcExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSrcExtent, index), LAYOUT_maxSrcExtent); }
    public MemorySegment _maxSrcExtent() { return _maxSrcExtentAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _maxSrcExtentAt(long index, MemorySegment src) { _maxSrcExtentAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _maxSrcExtent(MemorySegment src) { return _maxSrcExtentAt(0L, src); }
    public MemorySegment _minDstPositionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minDstPosition, index), LAYOUT_minDstPosition); }
    public MemorySegment _minDstPosition() { return _minDstPositionAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _minDstPositionAt(long index, MemorySegment src) { _minDstPositionAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _minDstPosition(MemorySegment src) { return _minDstPositionAt(0L, src); }
    public MemorySegment _maxDstPositionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDstPosition, index), LAYOUT_maxDstPosition); }
    public MemorySegment _maxDstPosition() { return _maxDstPositionAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _maxDstPositionAt(long index, MemorySegment src) { _maxDstPositionAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _maxDstPosition(MemorySegment src) { return _maxDstPositionAt(0L, src); }
    public MemorySegment _minDstExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minDstExtent, index), LAYOUT_minDstExtent); }
    public MemorySegment _minDstExtent() { return _minDstExtentAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _minDstExtentAt(long index, MemorySegment src) { _minDstExtentAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _minDstExtent(MemorySegment src) { return _minDstExtentAt(0L, src); }
    public MemorySegment _maxDstExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDstExtent, index), LAYOUT_maxDstExtent); }
    public MemorySegment _maxDstExtent() { return _maxDstExtentAt(0L); }
    public VkDisplayPlaneCapabilitiesKHR _maxDstExtentAt(long index, MemorySegment src) { _maxDstExtentAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneCapabilitiesKHR _maxDstExtent(MemorySegment src) { return _maxDstExtentAt(0L, src); }
}
