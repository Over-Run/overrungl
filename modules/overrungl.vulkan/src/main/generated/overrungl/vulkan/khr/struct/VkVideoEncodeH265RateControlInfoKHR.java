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

/// Represents `VkVideoEncodeH265RateControlInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265RateControlInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeH265RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t idrPeriod;
///     uint32_t consecutiveBFrameCount;
///     uint32_t subLayerCount;
/// };
/// ```
public final class VkVideoEncodeH265RateControlInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265RateControlInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("idrPeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("subLayerCount")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `gopFrameCount`.
    public static final long OFFSET_gopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
    /// The memory layout of `gopFrameCount`.
    public static final MemoryLayout LAYOUT_gopFrameCount = LAYOUT.select(PathElement.groupElement("gopFrameCount"));
    /// The [VarHandle] of `gopFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    /// The byte offset of `idrPeriod`.
    public static final long OFFSET_idrPeriod = LAYOUT.byteOffset(PathElement.groupElement("idrPeriod"));
    /// The memory layout of `idrPeriod`.
    public static final MemoryLayout LAYOUT_idrPeriod = LAYOUT.select(PathElement.groupElement("idrPeriod"));
    /// The [VarHandle] of `idrPeriod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_idrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idrPeriod"));
    /// The byte offset of `consecutiveBFrameCount`.
    public static final long OFFSET_consecutiveBFrameCount = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBFrameCount"));
    /// The memory layout of `consecutiveBFrameCount`.
    public static final MemoryLayout LAYOUT_consecutiveBFrameCount = LAYOUT.select(PathElement.groupElement("consecutiveBFrameCount"));
    /// The [VarHandle] of `consecutiveBFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_consecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBFrameCount"));
    /// The byte offset of `subLayerCount`.
    public static final long OFFSET_subLayerCount = LAYOUT.byteOffset(PathElement.groupElement("subLayerCount"));
    /// The memory layout of `subLayerCount`.
    public static final MemoryLayout LAYOUT_subLayerCount = LAYOUT.select(PathElement.groupElement("subLayerCount"));
    /// The [VarHandle] of `subLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subLayerCount"));

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265RateControlInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265RateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265RateControlInfoKHR`
    public static VkVideoEncodeH265RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265RateControlInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265RateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265RateControlInfoKHR`
    public static VkVideoEncodeH265RateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265RateControlInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR copyFrom(VkVideoEncodeH265RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265RateControlInfoKHR reinterpret(long count) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265RateControlInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265RateControlInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265RateControlInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `gopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gopFrameCount(MemorySegment segment, long index) { return (int) VH_gopFrameCount.get(segment, 0L, index); }
    /// {@return `gopFrameCount`}
    public int gopFrameCount() { return gopFrameCount(this.segment(), 0L); }
    /// Sets `gopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gopFrameCount(MemorySegment segment, long index, int value) { VH_gopFrameCount.set(segment, 0L, index, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCount(int value) { gopFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `idrPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int idrPeriod(MemorySegment segment, long index) { return (int) VH_idrPeriod.get(segment, 0L, index); }
    /// {@return `idrPeriod`}
    public int idrPeriod() { return idrPeriod(this.segment(), 0L); }
    /// Sets `idrPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void idrPeriod(MemorySegment segment, long index, int value) { VH_idrPeriod.set(segment, 0L, index, value); }
    /// Sets `idrPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR idrPeriod(int value) { idrPeriod(this.segment(), 0L, value); return this; }

    /// {@return `consecutiveBFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int consecutiveBFrameCount(MemorySegment segment, long index) { return (int) VH_consecutiveBFrameCount.get(segment, 0L, index); }
    /// {@return `consecutiveBFrameCount`}
    public int consecutiveBFrameCount() { return consecutiveBFrameCount(this.segment(), 0L); }
    /// Sets `consecutiveBFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void consecutiveBFrameCount(MemorySegment segment, long index, int value) { VH_consecutiveBFrameCount.set(segment, 0L, index, value); }
    /// Sets `consecutiveBFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCount(int value) { consecutiveBFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `subLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subLayerCount(MemorySegment segment, long index) { return (int) VH_subLayerCount.get(segment, 0L, index); }
    /// {@return `subLayerCount`}
    public int subLayerCount() { return subLayerCount(this.segment(), 0L); }
    /// Sets `subLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subLayerCount(MemorySegment segment, long index, int value) { VH_subLayerCount.set(segment, 0L, index, value); }
    /// Sets `subLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR subLayerCount(int value) { subLayerCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265RateControlInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265RateControlInfoKHR`
    public VkVideoEncodeH265RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265RateControlInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265RateControlInfoKHR`
    public VkVideoEncodeH265RateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265RateControlInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR at(long index, Consumer<VkVideoEncodeH265RateControlInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `gopFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int gopFrameCountAt(long index) { return gopFrameCount(this.segment(), index); }
    /// Sets `gopFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCountAt(long index, int value) { gopFrameCount(this.segment(), index, value); return this; }

    /// {@return `idrPeriod` at the given index}
    /// @param index the index of the struct buffer
    public int idrPeriodAt(long index) { return idrPeriod(this.segment(), index); }
    /// Sets `idrPeriod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR idrPeriodAt(long index, int value) { idrPeriod(this.segment(), index, value); return this; }

    /// {@return `consecutiveBFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int consecutiveBFrameCountAt(long index) { return consecutiveBFrameCount(this.segment(), index); }
    /// Sets `consecutiveBFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCountAt(long index, int value) { consecutiveBFrameCount(this.segment(), index, value); return this; }

    /// {@return `subLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int subLayerCountAt(long index) { return subLayerCount(this.segment(), index); }
    /// Sets `subLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR subLayerCountAt(long index, int value) { subLayerCount(this.segment(), index, value); return this; }

}
