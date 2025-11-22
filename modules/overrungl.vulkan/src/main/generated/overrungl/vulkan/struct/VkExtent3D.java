// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExtent3D`.
/// ## Layout
/// ```
/// struct VkExtent3D {
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// }
/// ```
public final class VkExtent3D extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    public VkExtent3D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExtent3D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent3D(segment, estimateCount(segment, LAYOUT)); }
    public static VkExtent3D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent3D(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExtent3D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent3D(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExtent3D alloc(SegmentAllocator allocator) { return new VkExtent3D(allocator.allocate(LAYOUT), 1); }
    public static VkExtent3D alloc(SegmentAllocator allocator, long count) { return new VkExtent3D(allocator.allocate(LAYOUT, count), count); }
    public VkExtent3D copyFrom(VkExtent3D src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExtent3D reinterpret(long count) { return new VkExtent3D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExtent3D asSlice(long index) { return new VkExtent3D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExtent3D asSlice(long index, long count) { return new VkExtent3D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExtent3D at(long index, Consumer<VkExtent3D> func) { func.accept(asSlice(index)); return this; }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int depthAt(long index) { return (int) VH_depth.get(this.segment(), 0L, index); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public int depth() { return (int) VH_depth.get(this.segment(), 0L, 0L); }
    public VkExtent3D widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkExtent3D heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkExtent3D depthAt(long index, int value) { VH_depth.set(this.segment(), 0L, index, value); return this; }
    public VkExtent3D width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkExtent3D height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkExtent3D depth(int value) { VH_depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkExtent3D _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkExtent3D _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkExtent3D _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkExtent3D _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _depthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depth, index), LAYOUT_depth); }
    public MemorySegment _depth() { return _depthAt(0L); }
    public VkExtent3D _depthAt(long index, MemorySegment src) { _depthAt(index).copyFrom(src); return this; }
    public VkExtent3D _depth(MemorySegment src) { return _depthAt(0L, src); }
}
