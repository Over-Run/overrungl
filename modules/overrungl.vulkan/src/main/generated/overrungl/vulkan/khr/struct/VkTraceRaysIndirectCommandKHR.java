// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTraceRaysIndirectCommandKHR`.
/// ## Layout
/// ```
/// struct VkTraceRaysIndirectCommandKHR {
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// };
/// ```
public final class VkTraceRaysIndirectCommandKHR extends GroupType {
    /// The struct layout of `VkTraceRaysIndirectCommandKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `depth`.
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    /// The memory layout of `depth`.
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTraceRaysIndirectCommandKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTraceRaysIndirectCommandKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTraceRaysIndirectCommandKHR`
    public static VkTraceRaysIndirectCommandKHR alloc(SegmentAllocator allocator) { return new VkTraceRaysIndirectCommandKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTraceRaysIndirectCommandKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTraceRaysIndirectCommandKHR`
    public static VkTraceRaysIndirectCommandKHR alloc(SegmentAllocator allocator, long count) { return new VkTraceRaysIndirectCommandKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR copyFrom(VkTraceRaysIndirectCommandKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTraceRaysIndirectCommandKHR reinterpret(long count) { return new VkTraceRaysIndirectCommandKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depth(MemorySegment segment, long index) { return (int) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    public int depth() { return depth(this.segment(), 0L); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depth(MemorySegment segment, long index, int value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR depth(int value) { depth(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTraceRaysIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTraceRaysIndirectCommandKHR`
    public VkTraceRaysIndirectCommandKHR asSlice(long index) { return new VkTraceRaysIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTraceRaysIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTraceRaysIndirectCommandKHR`
    public VkTraceRaysIndirectCommandKHR asSlice(long index, long count) { return new VkTraceRaysIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTraceRaysIndirectCommandKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR at(long index, Consumer<VkTraceRaysIndirectCommandKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `width` at the given index}
    /// @param index the index of the struct buffer
    public int widthAt(long index) { return width(this.segment(), index); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR widthAt(long index, int value) { width(this.segment(), index, value); return this; }

    /// {@return `height` at the given index}
    /// @param index the index of the struct buffer
    public int heightAt(long index) { return height(this.segment(), index); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR heightAt(long index, int value) { height(this.segment(), index, value); return this; }

    /// {@return `depth` at the given index}
    /// @param index the index of the struct buffer
    public int depthAt(long index) { return depth(this.segment(), index); }
    /// Sets `depth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR depthAt(long index, int value) { depth(this.segment(), index, value); return this; }

}
