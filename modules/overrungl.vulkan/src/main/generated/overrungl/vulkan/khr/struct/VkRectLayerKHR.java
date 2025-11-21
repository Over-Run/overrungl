// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRectLayerKHR`.
/// ## Layout
/// ```
/// struct VkRectLayerKHR {
///     VkOffset2D offset;
///     VkExtent2D extent;
///     uint32_t layer;
/// }
/// ```
public final class VkRectLayerKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    public static final long OFFSET_layer = LAYOUT.byteOffset(PathElement.groupElement("layer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    public static final MemoryLayout LAYOUT_layer = LAYOUT.select(PathElement.groupElement("layer"));
    public static final VarHandle VH_offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_layer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layer"));

    public VkRectLayerKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRectLayerKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRectLayerKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRectLayerKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRectLayerKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRectLayerKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRectLayerKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRectLayerKHR alloc(SegmentAllocator allocator) { return new VkRectLayerKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRectLayerKHR alloc(SegmentAllocator allocator, long count) { return new VkRectLayerKHR(allocator.allocate(LAYOUT, count), count); }
    public VkRectLayerKHR copyFrom(VkRectLayerKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRectLayerKHR reinterpret(long count) { return new VkRectLayerKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRectLayerKHR asSlice(long index) { return new VkRectLayerKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRectLayerKHR asSlice(long index, long count) { return new VkRectLayerKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRectLayerKHR at(long index, Consumer<VkRectLayerKHR> func) { func.accept(asSlice(index)); return this; }
    public int offset$xAt(long index) { return (int) VH_offset$x.get(this.segment(), 0L, index); }
    public int offset$yAt(long index) { return (int) VH_offset$y.get(this.segment(), 0L, index); }
    public int extent$widthAt(long index) { return (int) VH_extent$width.get(this.segment(), 0L, index); }
    public int extent$heightAt(long index) { return (int) VH_extent$height.get(this.segment(), 0L, index); }
    public int layerAt(long index) { return (int) VH_layer.get(this.segment(), 0L, index); }
    public int offset$x() { return (int) VH_offset$x.get(this.segment(), 0L, 0L); }
    public int offset$y() { return (int) VH_offset$y.get(this.segment(), 0L, 0L); }
    public int extent$width() { return (int) VH_extent$width.get(this.segment(), 0L, 0L); }
    public int extent$height() { return (int) VH_extent$height.get(this.segment(), 0L, 0L); }
    public int layer() { return (int) VH_layer.get(this.segment(), 0L, 0L); }
    public VkRectLayerKHR offset$xAt(long index, int value) { VH_offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkRectLayerKHR offset$yAt(long index, int value) { VH_offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkRectLayerKHR extent$widthAt(long index, int value) { VH_extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkRectLayerKHR extent$heightAt(long index, int value) { VH_extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkRectLayerKHR layerAt(long index, int value) { VH_layer.set(this.segment(), 0L, index, value); return this; }
    public VkRectLayerKHR offset$x(int value) { VH_offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkRectLayerKHR offset$y(int value) { VH_offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkRectLayerKHR extent$width(int value) { VH_extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRectLayerKHR extent$height(int value) { VH_extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkRectLayerKHR layer(int value) { VH_layer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkRectLayerKHR _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkRectLayerKHR _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _extentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    public MemorySegment _extent() { return _extentAt(0L); }
    public VkRectLayerKHR _extentAt(long index, MemorySegment src) { _extentAt(index).copyFrom(src); return this; }
    public VkRectLayerKHR _extent(MemorySegment src) { return _extentAt(0L, src); }
    public MemorySegment _layerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layer, index), LAYOUT_layer); }
    public MemorySegment _layer() { return _layerAt(0L); }
    public VkRectLayerKHR _layerAt(long index, MemorySegment src) { _layerAt(index).copyFrom(src); return this; }
    public VkRectLayerKHR _layer(MemorySegment src) { return _layerAt(0L, src); }
}
