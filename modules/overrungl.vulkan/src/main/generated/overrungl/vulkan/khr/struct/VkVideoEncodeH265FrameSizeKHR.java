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

/// Represents `VkVideoEncodeH265FrameSizeKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// };
/// ```
public final class VkVideoEncodeH265FrameSizeKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265FrameSizeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    /// The byte offset of `frameISize`.
    public static final long OFFSET_frameISize = LAYOUT.byteOffset(PathElement.groupElement("frameISize"));
    /// The memory layout of `frameISize`.
    public static final MemoryLayout LAYOUT_frameISize = LAYOUT.select(PathElement.groupElement("frameISize"));
    /// The [VarHandle] of `frameISize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_frameISize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameISize")));
    /// The byte offset of `framePSize`.
    public static final long OFFSET_framePSize = LAYOUT.byteOffset(PathElement.groupElement("framePSize"));
    /// The memory layout of `framePSize`.
    public static final MemoryLayout LAYOUT_framePSize = LAYOUT.select(PathElement.groupElement("framePSize"));
    /// The [VarHandle] of `framePSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_framePSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("framePSize")));
    /// The byte offset of `frameBSize`.
    public static final long OFFSET_frameBSize = LAYOUT.byteOffset(PathElement.groupElement("frameBSize"));
    /// The memory layout of `frameBSize`.
    public static final MemoryLayout LAYOUT_frameBSize = LAYOUT.select(PathElement.groupElement("frameBSize"));
    /// The [VarHandle] of `frameBSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_frameBSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameBSize")));

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265FrameSizeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265FrameSizeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265FrameSizeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265FrameSizeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265FrameSizeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265FrameSizeKHR`
    public static VkVideoEncodeH265FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265FrameSizeKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265FrameSizeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265FrameSizeKHR`
    public static VkVideoEncodeH265FrameSizeKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265FrameSizeKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR copyFrom(VkVideoEncodeH265FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265FrameSizeKHR reinterpret(long count) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `frameISize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameISize(MemorySegment segment, long index) { return (int) VH_frameISize.get().get(segment, 0L, index); }
    /// {@return `frameISize`}
    public int frameISize() { return frameISize(this.segment(), 0L); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameISize(MemorySegment segment, long index, int value) { VH_frameISize.get().set(segment, 0L, index, value); }
    /// Sets `frameISize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameISize(int value) { frameISize(this.segment(), 0L, value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framePSize(MemorySegment segment, long index) { return (int) VH_framePSize.get().get(segment, 0L, index); }
    /// {@return `framePSize`}
    public int framePSize() { return framePSize(this.segment(), 0L); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framePSize(MemorySegment segment, long index, int value) { VH_framePSize.get().set(segment, 0L, index, value); }
    /// Sets `framePSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR framePSize(int value) { framePSize(this.segment(), 0L, value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameBSize(MemorySegment segment, long index) { return (int) VH_frameBSize.get().get(segment, 0L, index); }
    /// {@return `frameBSize`}
    public int frameBSize() { return frameBSize(this.segment(), 0L); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameBSize(MemorySegment segment, long index, int value) { VH_frameBSize.get().set(segment, 0L, index, value); }
    /// Sets `frameBSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameBSize(int value) { frameBSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265FrameSizeKHR`
    public VkVideoEncodeH265FrameSizeKHR asSlice(long index) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265FrameSizeKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265FrameSizeKHR`
    public VkVideoEncodeH265FrameSizeKHR asSlice(long index, long count) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265FrameSizeKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR at(long index, Consumer<VkVideoEncodeH265FrameSizeKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `frameISize` at the given index}
    /// @param index the index of the struct buffer
    public int frameISizeAt(long index) { return frameISize(this.segment(), index); }
    /// Sets `frameISize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameISizeAt(long index, int value) { frameISize(this.segment(), index, value); return this; }

    /// {@return `framePSize` at the given index}
    /// @param index the index of the struct buffer
    public int framePSizeAt(long index) { return framePSize(this.segment(), index); }
    /// Sets `framePSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR framePSizeAt(long index, int value) { framePSize(this.segment(), index, value); return this; }

    /// {@return `frameBSize` at the given index}
    /// @param index the index of the struct buffer
    public int frameBSizeAt(long index) { return frameBSize(this.segment(), index); }
    /// Sets `frameBSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265FrameSizeKHR frameBSizeAt(long index, int value) { frameBSize(this.segment(), index, value); return this; }

}
