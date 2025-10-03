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

/// Represents `VkDisplayModePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayModePropertiesKHR {
///     (uint64_t) VkDisplayModeKHR displayMode;
///     (struct VkDisplayModeParametersKHR) VkDisplayModeParametersKHR parameters;
/// };
/// ```
public final class VkDisplayModePropertiesKHR extends GroupType {
    /// The struct layout of `VkDisplayModePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("displayMode"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    /// The byte offset of `displayMode`.
    public static final long OFFSET_displayMode = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
    /// The memory layout of `displayMode`.
    public static final MemoryLayout LAYOUT_displayMode = LAYOUT.select(PathElement.groupElement("displayMode"));
    /// The [VarHandle] of `displayMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    /// The byte offset of `parameters`.
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    /// The memory layout of `parameters`.
    public static final MemoryLayout LAYOUT_parameters = LAYOUT.select(PathElement.groupElement("parameters"));

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayModePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModePropertiesKHR copyFrom(VkDisplayModePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayModePropertiesKHR reinterpret(long count) { return new VkDisplayModePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `displayMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displayMode(MemorySegment segment, long index) { return (long) VH_displayMode.get(segment, 0L, index); }
    /// {@return `displayMode`}
    public long displayMode() { return displayMode(this.segment(), 0L); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayMode(MemorySegment segment, long index, long value) { VH_displayMode.set(segment, 0L, index, value); }
    /// Sets `displayMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR displayMode(long value) { displayMode(this.segment(), 0L, value); return this; }

    /// {@return `parameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment parameters(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters); }
    /// {@return `parameters`}
    public MemorySegment parameters() { return parameters(this.segment(), 0L); }
    /// Sets `parameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void parameters(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters.byteSize()); }
    /// Sets `parameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR parameters(MemorySegment value) { parameters(this.segment(), 0L, value); return this; }
    /// Accepts `parameters` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayModePropertiesKHR parameters(Consumer<overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.of(parameters())); return this; }

    /// Creates a slice of `VkDisplayModePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayModePropertiesKHR`
    public VkDisplayModePropertiesKHR asSlice(long index) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayModePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayModePropertiesKHR`
    public VkDisplayModePropertiesKHR asSlice(long index, long count) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayModePropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayModePropertiesKHR at(long index, Consumer<VkDisplayModePropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `displayMode` at the given index}
    /// @param index the index of the struct buffer
    public long displayModeAt(long index) { return displayMode(this.segment(), index); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR displayModeAt(long index, long value) { displayMode(this.segment(), index, value); return this; }

    /// {@return `parameters` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment parametersAt(long index) { return parameters(this.segment(), index); }
    /// Sets `parameters` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR parametersAt(long index, MemorySegment value) { parameters(this.segment(), index, value); return this; }
    /// Accepts `parameters` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayModePropertiesKHR parametersAt(long index, Consumer<overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.of(parametersAt(index))); return this; }

}
