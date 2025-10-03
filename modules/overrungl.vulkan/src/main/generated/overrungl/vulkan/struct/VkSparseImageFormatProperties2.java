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

/// Represents `VkSparseImageFormatProperties2`.
/// ## Layout
/// ```
/// struct VkSparseImageFormatProperties2 {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkSparseImageFormatProperties) VkSparseImageFormatProperties properties;
/// };
/// ```
public final class VkSparseImageFormatProperties2 extends GroupType {
    /// The struct layout of `VkSparseImageFormatProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("properties")
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
    /// The byte offset of `properties`.
    public static final long OFFSET_properties = LAYOUT.byteOffset(PathElement.groupElement("properties"));
    /// The memory layout of `properties`.
    public static final MemoryLayout LAYOUT_properties = LAYOUT.select(PathElement.groupElement("properties"));

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSparseImageFormatProperties2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSparseImageFormatProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageFormatProperties2`
    public static VkSparseImageFormatProperties2 alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSparseImageFormatProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageFormatProperties2`
    public static VkSparseImageFormatProperties2 alloc(SegmentAllocator allocator, long count) { return new VkSparseImageFormatProperties2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageFormatProperties2 copyFrom(VkSparseImageFormatProperties2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSparseImageFormatProperties2 reinterpret(long count) { return new VkSparseImageFormatProperties2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSparseImageFormatProperties2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSparseImageFormatProperties2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `properties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment properties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties); }
    /// {@return `properties`}
    public MemorySegment properties() { return properties(this.segment(), 0L); }
    /// Sets `properties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void properties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties.byteSize()); }
    /// Sets `properties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 properties(MemorySegment value) { properties(this.segment(), 0L, value); return this; }
    /// Accepts `properties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSparseImageFormatProperties2 properties(Consumer<overrungl.vulkan.struct.VkSparseImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkSparseImageFormatProperties.of(properties())); return this; }

    /// Creates a slice of `VkSparseImageFormatProperties2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseImageFormatProperties2`
    public VkSparseImageFormatProperties2 asSlice(long index) { return new VkSparseImageFormatProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSparseImageFormatProperties2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseImageFormatProperties2`
    public VkSparseImageFormatProperties2 asSlice(long index, long count) { return new VkSparseImageFormatProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSparseImageFormatProperties2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSparseImageFormatProperties2 at(long index, Consumer<VkSparseImageFormatProperties2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `properties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment propertiesAt(long index) { return properties(this.segment(), index); }
    /// Sets `properties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 propertiesAt(long index, MemorySegment value) { properties(this.segment(), index, value); return this; }
    /// Accepts `properties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSparseImageFormatProperties2 propertiesAt(long index, Consumer<overrungl.vulkan.struct.VkSparseImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkSparseImageFormatProperties.of(propertiesAt(index))); return this; }

}
