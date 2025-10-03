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

/// Represents `VkVideoEncodeAV1SessionCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1SessionCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 useMaxLevel;
///     (int) StdVideoAV1Level maxLevel;
/// };
/// ```
public final class VkVideoEncodeAV1SessionCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1SessionCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevel"),
        ValueLayout.JAVA_INT.withName("maxLevel")
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
    /// The byte offset of `useMaxLevel`.
    public static final long OFFSET_useMaxLevel = LAYOUT.byteOffset(PathElement.groupElement("useMaxLevel"));
    /// The memory layout of `useMaxLevel`.
    public static final MemoryLayout LAYOUT_useMaxLevel = LAYOUT.select(PathElement.groupElement("useMaxLevel"));
    /// The [VarHandle] of `useMaxLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_useMaxLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxLevel")));
    /// The byte offset of `maxLevel`.
    public static final long OFFSET_maxLevel = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
    /// The memory layout of `maxLevel`.
    public static final MemoryLayout LAYOUT_maxLevel = LAYOUT.select(PathElement.groupElement("maxLevel"));
    /// The [VarHandle] of `maxLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel")));

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1SessionCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1SessionCreateInfoKHR`
    public static VkVideoEncodeAV1SessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1SessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1SessionCreateInfoKHR`
    public static VkVideoEncodeAV1SessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR copyFrom(VkVideoEncodeAV1SessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1SessionCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeAV1SessionCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1SessionCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `useMaxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMaxLevel(MemorySegment segment, long index) { return (int) VH_useMaxLevel.get().get(segment, 0L, index); }
    /// {@return `useMaxLevel`}
    public int useMaxLevel() { return useMaxLevel(this.segment(), 0L); }
    /// Sets `useMaxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMaxLevel(MemorySegment segment, long index, int value) { VH_useMaxLevel.get().set(segment, 0L, index, value); }
    /// Sets `useMaxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevel(int value) { useMaxLevel(this.segment(), 0L, value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevel(MemorySegment segment, long index) { return (int) VH_maxLevel.get().get(segment, 0L, index); }
    /// {@return `maxLevel`}
    public int maxLevel() { return maxLevel(this.segment(), 0L); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevel(MemorySegment segment, long index, int value) { VH_maxLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevel(int value) { maxLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1SessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1SessionCreateInfoKHR`
    public VkVideoEncodeAV1SessionCreateInfoKHR asSlice(long index) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1SessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1SessionCreateInfoKHR`
    public VkVideoEncodeAV1SessionCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1SessionCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR at(long index, Consumer<VkVideoEncodeAV1SessionCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `useMaxLevel` at the given index}
    /// @param index the index of the struct buffer
    public int useMaxLevelAt(long index) { return useMaxLevel(this.segment(), index); }
    /// Sets `useMaxLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevelAt(long index, int value) { useMaxLevel(this.segment(), index, value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxLevelAt(long index) { return maxLevel(this.segment(), index); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevelAt(long index, int value) { maxLevel(this.segment(), index, value); return this; }

}
