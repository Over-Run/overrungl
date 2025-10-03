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

/// Represents `VkSubpassBeginInfo`.
/// ## Layout
/// ```
/// struct VkSubpassBeginInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSubpassContents contents;
/// };
/// ```
public final class VkSubpassBeginInfo extends GroupType {
    /// The struct layout of `VkSubpassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("contents")
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
    /// The byte offset of `contents`.
    public static final long OFFSET_contents = LAYOUT.byteOffset(PathElement.groupElement("contents"));
    /// The memory layout of `contents`.
    public static final MemoryLayout LAYOUT_contents = LAYOUT.select(PathElement.groupElement("contents"));
    /// The [VarHandle] of `contents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_contents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("contents"));

    /// Creates `VkSubpassBeginInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubpassBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubpassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassBeginInfo`
    public static VkSubpassBeginInfo alloc(SegmentAllocator allocator) { return new VkSubpassBeginInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubpassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassBeginInfo`
    public static VkSubpassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkSubpassBeginInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassBeginInfo copyFrom(VkSubpassBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubpassBeginInfo reinterpret(long count) { return new VkSubpassBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSubpassBeginInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubpassBeginInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `contents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int contents(MemorySegment segment, long index) { return (int) VH_contents.get(segment, 0L, index); }
    /// {@return `contents`}
    public int contents() { return contents(this.segment(), 0L); }
    /// Sets `contents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void contents(MemorySegment segment, long index, int value) { VH_contents.set(segment, 0L, index, value); }
    /// Sets `contents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo contents(int value) { contents(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubpassBeginInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubpassBeginInfo`
    public VkSubpassBeginInfo asSlice(long index) { return new VkSubpassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubpassBeginInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubpassBeginInfo`
    public VkSubpassBeginInfo asSlice(long index, long count) { return new VkSubpassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubpassBeginInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubpassBeginInfo at(long index, Consumer<VkSubpassBeginInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `contents` at the given index}
    /// @param index the index of the struct buffer
    public int contentsAt(long index) { return contents(this.segment(), index); }
    /// Sets `contents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo contentsAt(long index, int value) { contents(this.segment(), index, value); return this; }

}
