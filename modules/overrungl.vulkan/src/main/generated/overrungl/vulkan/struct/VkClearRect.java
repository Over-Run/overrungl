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
///     (struct VkRect2D) VkRect2D rect;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// };
/// ```
public final class VkClearRect extends GroupType {
    /// The struct layout of `VkClearRect`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("rect"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    /// The byte offset of `rect`.
    public static final long OFFSET_rect = LAYOUT.byteOffset(PathElement.groupElement("rect"));
    /// The memory layout of `rect`.
    public static final MemoryLayout LAYOUT_rect = LAYOUT.select(PathElement.groupElement("rect"));
    /// The byte offset of `baseArrayLayer`.
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    /// The memory layout of `baseArrayLayer`.
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The byte offset of `layerCount`.
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    /// The memory layout of `layerCount`.
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkClearRect` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClearRect(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClearRect` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClearRect` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearRect ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearRect(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClearRect` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearRect`
    public static VkClearRect alloc(SegmentAllocator allocator) { return new VkClearRect(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClearRect` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearRect`
    public static VkClearRect alloc(SegmentAllocator allocator, long count) { return new VkClearRect(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearRect copyFrom(VkClearRect src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClearRect reinterpret(long count) { return new VkClearRect(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `rect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment rect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_rect, index), LAYOUT_rect); }
    /// {@return `rect`}
    public MemorySegment rect() { return rect(this.segment(), 0L); }
    /// Sets `rect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rect(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_rect, index), LAYOUT_rect.byteSize()); }
    /// Sets `rect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect rect(MemorySegment value) { rect(this.segment(), 0L, value); return this; }
    /// Accepts `rect` with the given function.
    /// @param func the function
    /// @return `this`
    public VkClearRect rect(Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(rect())); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    public int baseArrayLayer() { return baseArrayLayer(this.segment(), 0L); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseArrayLayer(MemorySegment segment, long index, int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect baseArrayLayer(int value) { baseArrayLayer(this.segment(), 0L, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    public int layerCount() { return layerCount(this.segment(), 0L); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerCount(MemorySegment segment, long index, int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearRect layerCount(int value) { layerCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClearRect`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClearRect`
    public VkClearRect asSlice(long index) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClearRect`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClearRect`
    public VkClearRect asSlice(long index, long count) { return new VkClearRect(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClearRect` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClearRect at(long index, Consumer<VkClearRect> func) { func.accept(asSlice(index)); return this; }

    /// {@return `rect` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment rectAt(long index) { return rect(this.segment(), index); }
    /// Sets `rect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearRect rectAt(long index, MemorySegment value) { rect(this.segment(), index, value); return this; }
    /// Accepts `rect` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkClearRect rectAt(long index, Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(rectAt(index))); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index of the struct buffer
    public int baseArrayLayerAt(long index) { return baseArrayLayer(this.segment(), index); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearRect baseArrayLayerAt(long index, int value) { baseArrayLayer(this.segment(), index, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param index the index of the struct buffer
    public int layerCountAt(long index) { return layerCount(this.segment(), index); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearRect layerCountAt(long index, int value) { layerCount(this.segment(), index, value); return this; }

}
