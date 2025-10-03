// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputBindingDescription`.
/// ## Layout
/// ```
/// struct VkVertexInputBindingDescription {
///     uint32_t binding;
///     uint32_t stride;
///     (int) VkVertexInputRate inputRate;
/// };
/// ```
public final class VkVertexInputBindingDescription extends GroupType {
    /// The struct layout of `VkVertexInputBindingDescription`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The byte offset of `inputRate`.
    public static final long OFFSET_inputRate = LAYOUT.byteOffset(PathElement.groupElement("inputRate"));
    /// The memory layout of `inputRate`.
    public static final MemoryLayout LAYOUT_inputRate = LAYOUT.select(PathElement.groupElement("inputRate"));
    /// The [VarHandle] of `inputRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputRate"));

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVertexInputBindingDescription(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVertexInputBindingDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDescription ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVertexInputBindingDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDescription`
    public static VkVertexInputBindingDescription alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDescription(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVertexInputBindingDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDescription`
    public static VkVertexInputBindingDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDescription(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDescription copyFrom(VkVertexInputBindingDescription src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVertexInputBindingDescription reinterpret(long count) { return new VkVertexInputBindingDescription(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// {@return `inputRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputRate(MemorySegment segment, long index) { return (int) VH_inputRate.get(segment, 0L, index); }
    /// {@return `inputRate`}
    public int inputRate() { return inputRate(this.segment(), 0L); }
    /// Sets `inputRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputRate(MemorySegment segment, long index, int value) { VH_inputRate.set(segment, 0L, index, value); }
    /// Sets `inputRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription inputRate(int value) { inputRate(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVertexInputBindingDescription`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVertexInputBindingDescription`
    public VkVertexInputBindingDescription asSlice(long index) { return new VkVertexInputBindingDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVertexInputBindingDescription`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVertexInputBindingDescription`
    public VkVertexInputBindingDescription asSlice(long index, long count) { return new VkVertexInputBindingDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVertexInputBindingDescription` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVertexInputBindingDescription at(long index, Consumer<VkVertexInputBindingDescription> func) { func.accept(asSlice(index)); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public int strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

    /// {@return `inputRate` at the given index}
    /// @param index the index of the struct buffer
    public int inputRateAt(long index) { return inputRate(this.segment(), index); }
    /// Sets `inputRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDescription inputRateAt(long index, int value) { inputRate(this.segment(), index, value); return this; }

}
