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

/// Represents `VkVertexInputBindingDivisorDescriptionKHR`.
/// ## Layout
/// ```
/// struct VkVertexInputBindingDivisorDescriptionKHR {
///     uint32_t binding;
///     uint32_t divisor;
/// };
/// ```
public final class VkVertexInputBindingDivisorDescriptionKHR extends GroupType {
    /// The struct layout of `VkVertexInputBindingDivisorDescriptionKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_binding = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding")));
    /// The byte offset of `divisor`.
    public static final long OFFSET_divisor = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
    /// The memory layout of `divisor`.
    public static final MemoryLayout LAYOUT_divisor = LAYOUT.select(PathElement.groupElement("divisor"));
    /// The [VarHandle] of `divisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_divisor = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor")));

    /// Creates `VkVertexInputBindingDivisorDescriptionKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVertexInputBindingDivisorDescriptionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputBindingDivisorDescriptionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVertexInputBindingDivisorDescriptionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputBindingDivisorDescriptionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionKHR`
    public static VkVertexInputBindingDivisorDescriptionKHR alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDivisorDescriptionKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVertexInputBindingDivisorDescriptionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputBindingDivisorDescriptionKHR`
    public static VkVertexInputBindingDivisorDescriptionKHR alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDivisorDescriptionKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR copyFrom(VkVertexInputBindingDivisorDescriptionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVertexInputBindingDivisorDescriptionKHR reinterpret(long count) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get().get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.get().set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `divisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int divisor(MemorySegment segment, long index) { return (int) VH_divisor.get().get(segment, 0L, index); }
    /// {@return `divisor`}
    public int divisor() { return divisor(this.segment(), 0L); }
    /// Sets `divisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void divisor(MemorySegment segment, long index, int value) { VH_divisor.get().set(segment, 0L, index, value); }
    /// Sets `divisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR divisor(int value) { divisor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVertexInputBindingDivisorDescriptionKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVertexInputBindingDivisorDescriptionKHR`
    public VkVertexInputBindingDivisorDescriptionKHR asSlice(long index) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVertexInputBindingDivisorDescriptionKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVertexInputBindingDivisorDescriptionKHR`
    public VkVertexInputBindingDivisorDescriptionKHR asSlice(long index, long count) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVertexInputBindingDivisorDescriptionKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR at(long index, Consumer<VkVertexInputBindingDivisorDescriptionKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `divisor` at the given index}
    /// @param index the index of the struct buffer
    public int divisorAt(long index) { return divisor(this.segment(), index); }
    /// Sets `divisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputBindingDivisorDescriptionKHR divisorAt(long index, int value) { divisor(this.segment(), index, value); return this; }

}
