// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearRect`.
/// ## Layout
/// ```
/// struct VkClearRect {
///     VkRect2D rect;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// }
/// ```
public final class VkClearRect extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("rect"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long OFFSET_rect = LAYOUT.byteOffset(PathElement.groupElement("rect"));
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_rect = LAYOUT.select(PathElement.groupElement("rect"));
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_rect$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rect"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_rect$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rect"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_rect$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rect"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_rect$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rect"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    public VkClearRect(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClearRect of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment, estimateCount(segment, LAYOUT)); }
    public static VkClearRect ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClearRect ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClearRect alloc(SegmentAllocator allocator) { return new VkClearRect(allocator.allocate(LAYOUT), 1); }
    public static VkClearRect alloc(SegmentAllocator allocator, long count) { return new VkClearRect(allocator.allocate(LAYOUT, count), count); }
    public VkClearRect copyFrom(VkClearRect src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClearRect reinterpret(long count) { return new VkClearRect(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClearRect asSlice(long index) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClearRect asSlice(long index, long count) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClearRect at(long index, Consumer<VkClearRect> func) { func.accept(asSlice(index)); return this; }
    public int rect$offset$xAt(long index) { return (int) VH_rect$offset$x.get(this.segment(), 0L, index); }
    public int rect$offset$yAt(long index) { return (int) VH_rect$offset$y.get(this.segment(), 0L, index); }
    public int rect$extent$widthAt(long index) { return (int) VH_rect$extent$width.get(this.segment(), 0L, index); }
    public int rect$extent$heightAt(long index) { return (int) VH_rect$extent$height.get(this.segment(), 0L, index); }
    public int baseArrayLayerAt(long index) { return (int) VH_baseArrayLayer.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public int rect$offset$x() { return (int) VH_rect$offset$x.get(this.segment(), 0L, 0L); }
    public int rect$offset$y() { return (int) VH_rect$offset$y.get(this.segment(), 0L, 0L); }
    public int rect$extent$width() { return (int) VH_rect$extent$width.get(this.segment(), 0L, 0L); }
    public int rect$extent$height() { return (int) VH_rect$extent$height.get(this.segment(), 0L, 0L); }
    public int baseArrayLayer() { return (int) VH_baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public VkClearRect rect$offset$xAt(long index, int value) { VH_rect$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect rect$offset$yAt(long index, int value) { VH_rect$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect rect$extent$widthAt(long index, int value) { VH_rect$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect rect$extent$heightAt(long index, int value) { VH_rect$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect baseArrayLayerAt(long index, int value) { VH_baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkClearRect rect$offset$x(int value) { VH_rect$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearRect rect$offset$y(int value) { VH_rect$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearRect rect$extent$width(int value) { VH_rect$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearRect rect$extent$height(int value) { VH_rect$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearRect baseArrayLayer(int value) { VH_baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearRect layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _rectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rect, index), LAYOUT_rect); }
    public MemorySegment _rect() { return _rectAt(0L); }
    public VkClearRect _rectAt(long index, MemorySegment src) { _rectAt(index).copyFrom(src); return this; }
    public VkClearRect _rect(MemorySegment src) { return _rectAt(0L, src); }
    public MemorySegment _baseArrayLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseArrayLayer, index), LAYOUT_baseArrayLayer); }
    public MemorySegment _baseArrayLayer() { return _baseArrayLayerAt(0L); }
    public VkClearRect _baseArrayLayerAt(long index, MemorySegment src) { _baseArrayLayerAt(index).copyFrom(src); return this; }
    public VkClearRect _baseArrayLayer(MemorySegment src) { return _baseArrayLayerAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkClearRect _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkClearRect _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
}
