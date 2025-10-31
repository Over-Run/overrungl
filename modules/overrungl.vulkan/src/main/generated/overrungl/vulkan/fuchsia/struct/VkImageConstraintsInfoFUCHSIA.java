// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageConstraintsInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImageConstraintsInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t formatConstraintsCount;
///     const VkImageFormatConstraintsInfoFUCHSIA* pFormatConstraints;
///     (struct VkBufferCollectionConstraintsInfoFUCHSIA) VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
///     ((uint32_t) VkFlags) VkImageConstraintsInfoFlagsFUCHSIA flags;
/// };
/// ```
public final class VkImageConstraintsInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkImageConstraintsInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatConstraintsCount"),
        ValueLayout.ADDRESS.withName("pFormatConstraints"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `formatConstraintsCount`.
    public static final long OFFSET_formatConstraintsCount = LAYOUT.byteOffset(PathElement.groupElement("formatConstraintsCount"));
    /// The memory layout of `formatConstraintsCount`.
    public static final MemoryLayout LAYOUT_formatConstraintsCount = LAYOUT.select(PathElement.groupElement("formatConstraintsCount"));
    /// The [VarHandle] of `formatConstraintsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatConstraintsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatConstraintsCount"));
    /// The byte offset of `pFormatConstraints`.
    public static final long OFFSET_pFormatConstraints = LAYOUT.byteOffset(PathElement.groupElement("pFormatConstraints"));
    /// The memory layout of `pFormatConstraints`.
    public static final MemoryLayout LAYOUT_pFormatConstraints = LAYOUT.select(PathElement.groupElement("pFormatConstraints"));
    /// The [VarHandle] of `pFormatConstraints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFormatConstraints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFormatConstraints"));
    /// The byte offset of `bufferCollectionConstraints`.
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    /// The memory layout of `bufferCollectionConstraints`.
    public static final MemoryLayout LAYOUT_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageConstraintsInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageConstraintsInfoFUCHSIA`
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageConstraintsInfoFUCHSIA`
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA copyFrom(VkImageConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageConstraintsInfoFUCHSIA reinterpret(long count) { return new VkImageConstraintsInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `formatConstraintsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int formatConstraintsCount(MemorySegment segment, long index) { return (int) VH_formatConstraintsCount.get(segment, 0L, index); }
    /// {@return `formatConstraintsCount`}
    public int formatConstraintsCount() { return formatConstraintsCount(this.segment(), 0L); }
    /// Sets `formatConstraintsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatConstraintsCount(MemorySegment segment, long index, int value) { VH_formatConstraintsCount.set(segment, 0L, index, value); }
    /// Sets `formatConstraintsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCount(int value) { formatConstraintsCount(this.segment(), 0L, value); return this; }

    /// {@return `pFormatConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFormatConstraints(MemorySegment segment, long index) { return (MemorySegment) VH_pFormatConstraints.get(segment, 0L, index); }
    /// {@return `pFormatConstraints`}
    public MemorySegment pFormatConstraints() { return pFormatConstraints(this.segment(), 0L); }
    /// Sets `pFormatConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFormatConstraints(MemorySegment segment, long index, MemorySegment value) { VH_pFormatConstraints.set(segment, 0L, index, value); }
    /// Sets `pFormatConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pFormatConstraints(MemorySegment value) { pFormatConstraints(this.segment(), 0L, value); return this; }

    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment bufferCollectionConstraints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints); }
    /// {@return `bufferCollectionConstraints`}
    public MemorySegment bufferCollectionConstraints() { return bufferCollectionConstraints(this.segment(), 0L); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferCollectionConstraints(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints.byteSize()); }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints(MemorySegment value) { bufferCollectionConstraints(this.segment(), 0L, value); return this; }
    /// Accepts `bufferCollectionConstraints` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints(Consumer<overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA> func) { func.accept(overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.of(bufferCollectionConstraints())); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageConstraintsInfoFUCHSIA`
    public VkImageConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageConstraintsInfoFUCHSIA`
    public VkImageConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageConstraintsInfoFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA at(long index, Consumer<VkImageConstraintsInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `formatConstraintsCount` at the given index}
    /// @param index the index of the struct buffer
    public int formatConstraintsCountAt(long index) { return formatConstraintsCount(this.segment(), index); }
    /// Sets `formatConstraintsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCountAt(long index, int value) { formatConstraintsCount(this.segment(), index, value); return this; }

    /// {@return `pFormatConstraints` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pFormatConstraintsAt(long index) { return pFormatConstraints(this.segment(), index); }
    /// Sets `pFormatConstraints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pFormatConstraintsAt(long index, MemorySegment value) { pFormatConstraints(this.segment(), index, value); return this; }

    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment bufferCollectionConstraintsAt(long index) { return bufferCollectionConstraints(this.segment(), index); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraintsAt(long index, MemorySegment value) { bufferCollectionConstraints(this.segment(), index, value); return this; }
    /// Accepts `bufferCollectionConstraints` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraintsAt(long index, Consumer<overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA> func) { func.accept(overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.of(bufferCollectionConstraintsAt(index))); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}
