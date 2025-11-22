// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViewport`.
/// ## Layout
/// ```
/// struct VkViewport {
///     float x;
///     float y;
///     float width;
///     float height;
///     float minDepth;
///     float maxDepth;
/// }
/// ```
public final class VkViewport extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth")
    );
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_minDepth = LAYOUT.byteOffset(PathElement.groupElement("minDepth"));
    public static final long OFFSET_maxDepth = LAYOUT.byteOffset(PathElement.groupElement("maxDepth"));
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_minDepth = LAYOUT.select(PathElement.groupElement("minDepth"));
    public static final MemoryLayout LAYOUT_maxDepth = LAYOUT.select(PathElement.groupElement("maxDepth"));
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_minDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepth"));
    public static final VarHandle VH_maxDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepth"));

    public VkViewport(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkViewport of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewport(segment, estimateCount(segment, LAYOUT)); }
    public static VkViewport ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewport(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkViewport ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewport(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkViewport alloc(SegmentAllocator allocator) { return new VkViewport(allocator.allocate(LAYOUT), 1); }
    public static VkViewport alloc(SegmentAllocator allocator, long count) { return new VkViewport(allocator.allocate(LAYOUT, count), count); }
    public VkViewport copyFrom(VkViewport src) { this.segment().copyFrom(src.segment()); return this; }
    public VkViewport reinterpret(long count) { return new VkViewport(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkViewport asSlice(long index) { return new VkViewport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkViewport asSlice(long index, long count) { return new VkViewport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkViewport at(long index, Consumer<VkViewport> func) { func.accept(asSlice(index)); return this; }
    public float xAt(long index) { return (float) VH_x.get(this.segment(), 0L, index); }
    public float yAt(long index) { return (float) VH_y.get(this.segment(), 0L, index); }
    public float widthAt(long index) { return (float) VH_width.get(this.segment(), 0L, index); }
    public float heightAt(long index) { return (float) VH_height.get(this.segment(), 0L, index); }
    public float minDepthAt(long index) { return (float) VH_minDepth.get(this.segment(), 0L, index); }
    public float maxDepthAt(long index) { return (float) VH_maxDepth.get(this.segment(), 0L, index); }
    public float x() { return (float) VH_x.get(this.segment(), 0L, 0L); }
    public float y() { return (float) VH_y.get(this.segment(), 0L, 0L); }
    public float width() { return (float) VH_width.get(this.segment(), 0L, 0L); }
    public float height() { return (float) VH_height.get(this.segment(), 0L, 0L); }
    public float minDepth() { return (float) VH_minDepth.get(this.segment(), 0L, 0L); }
    public float maxDepth() { return (float) VH_maxDepth.get(this.segment(), 0L, 0L); }
    public VkViewport xAt(long index, float value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    public VkViewport yAt(long index, float value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    public VkViewport widthAt(long index, float value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkViewport heightAt(long index, float value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkViewport minDepthAt(long index, float value) { VH_minDepth.set(this.segment(), 0L, index, value); return this; }
    public VkViewport maxDepthAt(long index, float value) { VH_maxDepth.set(this.segment(), 0L, index, value); return this; }
    public VkViewport x(float value) { VH_x.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewport y(float value) { VH_y.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewport width(float value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewport height(float value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewport minDepth(float value) { VH_minDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewport maxDepth(float value) { VH_maxDepth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_x, index), LAYOUT_x); }
    public MemorySegment _x() { return _xAt(0L); }
    public VkViewport _xAt(long index, MemorySegment src) { _xAt(index).copyFrom(src); return this; }
    public VkViewport _x(MemorySegment src) { return _xAt(0L, src); }
    public MemorySegment _yAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_y, index), LAYOUT_y); }
    public MemorySegment _y() { return _yAt(0L); }
    public VkViewport _yAt(long index, MemorySegment src) { _yAt(index).copyFrom(src); return this; }
    public VkViewport _y(MemorySegment src) { return _yAt(0L, src); }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkViewport _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkViewport _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkViewport _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkViewport _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _minDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minDepth, index), LAYOUT_minDepth); }
    public MemorySegment _minDepth() { return _minDepthAt(0L); }
    public VkViewport _minDepthAt(long index, MemorySegment src) { _minDepthAt(index).copyFrom(src); return this; }
    public VkViewport _minDepth(MemorySegment src) { return _minDepthAt(0L, src); }
    public MemorySegment _maxDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDepth, index), LAYOUT_maxDepth); }
    public MemorySegment _maxDepth() { return _maxDepthAt(0L); }
    public VkViewport _maxDepthAt(long index, MemorySegment src) { _maxDepthAt(index).copyFrom(src); return this; }
    public VkViewport _maxDepth(MemorySegment src) { return _maxDepthAt(0L, src); }
}
