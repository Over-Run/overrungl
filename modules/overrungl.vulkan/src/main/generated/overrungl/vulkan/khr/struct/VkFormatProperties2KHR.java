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

/// Represents `VkFormatProperties2KHR`.
/// ## Layout
/// ```
/// struct VkFormatProperties2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkFormatProperties) VkFormatProperties formatProperties;
/// };
/// ```
public final class VkFormatProperties2KHR extends GroupType {
    /// The struct layout of `VkFormatProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkFormatProperties.LAYOUT.withName("formatProperties")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `formatProperties`.
    public static final long OFFSET_formatProperties = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
    /// The memory layout of `formatProperties`.
    public static final MemoryLayout LAYOUT_formatProperties = LAYOUT.select(PathElement.groupElement("formatProperties"));

    /// Creates `VkFormatProperties2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFormatProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFormatProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFormatProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFormatProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFormatProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties2KHR`
    public static VkFormatProperties2KHR alloc(SegmentAllocator allocator) { return new VkFormatProperties2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFormatProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties2KHR`
    public static VkFormatProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFormatProperties2KHR copyFrom(VkFormatProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFormatProperties2KHR reinterpret(long count) { return new VkFormatProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `formatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment formatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_formatProperties, index), LAYOUT_formatProperties); }
    /// {@return `formatProperties`}
    public MemorySegment formatProperties() { return formatProperties(this.segment(), 0L); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_formatProperties, index), LAYOUT_formatProperties.byteSize()); }
    /// Sets `formatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR formatProperties(MemorySegment value) { formatProperties(this.segment(), 0L, value); return this; }
    /// Accepts `formatProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkFormatProperties2KHR formatProperties(Consumer<overrungl.vulkan.struct.VkFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkFormatProperties.of(formatProperties())); return this; }

    /// Creates a slice of `VkFormatProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFormatProperties2KHR`
    public VkFormatProperties2KHR asSlice(long index) { return new VkFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFormatProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFormatProperties2KHR`
    public VkFormatProperties2KHR asSlice(long index, long count) { return new VkFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFormatProperties2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFormatProperties2KHR at(long index, Consumer<VkFormatProperties2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `formatProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment formatPropertiesAt(long index) { return formatProperties(this.segment(), index); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties2KHR formatPropertiesAt(long index, MemorySegment value) { formatProperties(this.segment(), index, value); return this; }
    /// Accepts `formatProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkFormatProperties2KHR formatPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkFormatProperties.of(formatPropertiesAt(index))); return this; }

}
