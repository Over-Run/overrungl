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

/// Represents `VkSurfaceFormatKHR`.
/// ## Layout
/// ```
/// struct VkSurfaceFormatKHR {
///     (int) VkFormat format;
///     (int) VkColorSpaceKHR colorSpace;
/// };
/// ```
public final class VkSurfaceFormatKHR extends GroupType {
    /// The struct layout of `VkSurfaceFormatKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_format = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("format")));
    /// The byte offset of `colorSpace`.
    public static final long OFFSET_colorSpace = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
    /// The memory layout of `colorSpace`.
    public static final MemoryLayout LAYOUT_colorSpace = LAYOUT.select(PathElement.groupElement("colorSpace"));
    /// The [VarHandle] of `colorSpace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_colorSpace = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace")));

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfaceFormatKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfaceFormatKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFormatKHR`
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfaceFormatKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFormatKHR`
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceFormatKHR copyFrom(VkSurfaceFormatKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfaceFormatKHR reinterpret(long count) { return new VkSurfaceFormatKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get().get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.get().set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorSpace(MemorySegment segment, long index) { return (int) VH_colorSpace.get().get(segment, 0L, index); }
    /// {@return `colorSpace`}
    public int colorSpace() { return colorSpace(this.segment(), 0L); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorSpace(MemorySegment segment, long index, int value) { VH_colorSpace.get().set(segment, 0L, index, value); }
    /// Sets `colorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR colorSpace(int value) { colorSpace(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSurfaceFormatKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfaceFormatKHR`
    public VkSurfaceFormatKHR asSlice(long index) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfaceFormatKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfaceFormatKHR`
    public VkSurfaceFormatKHR asSlice(long index, long count) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfaceFormatKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfaceFormatKHR at(long index, Consumer<VkSurfaceFormatKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param index the index of the struct buffer
    public int colorSpaceAt(long index) { return colorSpace(this.segment(), index); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormatKHR colorSpaceAt(long index, int value) { colorSpace(this.segment(), index, value); return this; }

}
