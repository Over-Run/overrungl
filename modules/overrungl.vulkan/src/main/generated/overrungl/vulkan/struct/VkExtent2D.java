// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExtent2D`.
/// ## Layout
/// ```
/// struct VkExtent2D {
///     uint32_t width;
///     uint32_t height;
/// }
/// ```
public final class VkExtent2D extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    );
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));

    public VkExtent2D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExtent2D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent2D(segment, estimateCount(segment, LAYOUT)); }
    public static VkExtent2D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent2D(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExtent2D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtent2D(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExtent2D alloc(SegmentAllocator allocator) { return new VkExtent2D(allocator.allocate(LAYOUT), 1); }
    public static VkExtent2D alloc(SegmentAllocator allocator, long count) { return new VkExtent2D(allocator.allocate(LAYOUT, count), count); }
    public VkExtent2D copyFrom(VkExtent2D src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExtent2D reinterpret(long count) { return new VkExtent2D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExtent2D asSlice(long index) { return new VkExtent2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExtent2D asSlice(long index, long count) { return new VkExtent2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExtent2D at(long index, Consumer<VkExtent2D> func) { func.accept(asSlice(index)); return this; }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public VkExtent2D widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkExtent2D heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkExtent2D width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkExtent2D height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkExtent2D _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkExtent2D _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkExtent2D _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkExtent2D _height(MemorySegment src) { return _heightAt(0L, src); }
}
