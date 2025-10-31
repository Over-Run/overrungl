// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaDefragmentationInfo`.
/// ## Layout
/// ```
/// struct VmaDefragmentationInfo {
///     ((uint32_t) VkFlags) VmaDefragmentationFlags flags;
///     (struct VmaPool *) VmaPool pool;
///     (uint64_t) VkDeviceSize maxBytesPerPass;
///     uint32_t maxAllocationsPerPass;
///     ((uint32_t) VkBool32 (*VmaCheckDefragmentationBreakFunction)(void* pUserData)) PFN_vmaCheckDefragmentationBreakFunction pfnBreakCallback;
///     void* pBreakCallbackUserData;
/// };
/// ```
public final class VmaDefragmentationInfo extends GroupType {
    /// The struct layout of `VmaDefragmentationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pool"),
        ValueLayout.JAVA_LONG.withName("maxBytesPerPass"),
        ValueLayout.JAVA_INT.withName("maxAllocationsPerPass"),
        ValueLayout.ADDRESS.withName("pfnBreakCallback"),
        ValueLayout.ADDRESS.withName("pBreakCallbackUserData")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pool`.
    public static final long OFFSET_pool = LAYOUT.byteOffset(PathElement.groupElement("pool"));
    /// The memory layout of `pool`.
    public static final MemoryLayout LAYOUT_pool = LAYOUT.select(PathElement.groupElement("pool"));
    /// The [VarHandle] of `pool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pool"));
    /// The byte offset of `maxBytesPerPass`.
    public static final long OFFSET_maxBytesPerPass = LAYOUT.byteOffset(PathElement.groupElement("maxBytesPerPass"));
    /// The memory layout of `maxBytesPerPass`.
    public static final MemoryLayout LAYOUT_maxBytesPerPass = LAYOUT.select(PathElement.groupElement("maxBytesPerPass"));
    /// The [VarHandle] of `maxBytesPerPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBytesPerPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBytesPerPass"));
    /// The byte offset of `maxAllocationsPerPass`.
    public static final long OFFSET_maxAllocationsPerPass = LAYOUT.byteOffset(PathElement.groupElement("maxAllocationsPerPass"));
    /// The memory layout of `maxAllocationsPerPass`.
    public static final MemoryLayout LAYOUT_maxAllocationsPerPass = LAYOUT.select(PathElement.groupElement("maxAllocationsPerPass"));
    /// The [VarHandle] of `maxAllocationsPerPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxAllocationsPerPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAllocationsPerPass"));
    /// The byte offset of `pfnBreakCallback`.
    public static final long OFFSET_pfnBreakCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnBreakCallback"));
    /// The memory layout of `pfnBreakCallback`.
    public static final MemoryLayout LAYOUT_pfnBreakCallback = LAYOUT.select(PathElement.groupElement("pfnBreakCallback"));
    /// The [VarHandle] of `pfnBreakCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnBreakCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnBreakCallback"));
    /// The byte offset of `pBreakCallbackUserData`.
    public static final long OFFSET_pBreakCallbackUserData = LAYOUT.byteOffset(PathElement.groupElement("pBreakCallbackUserData"));
    /// The memory layout of `pBreakCallbackUserData`.
    public static final MemoryLayout LAYOUT_pBreakCallbackUserData = LAYOUT.select(PathElement.groupElement("pBreakCallbackUserData"));
    /// The [VarHandle] of `pBreakCallbackUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBreakCallbackUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBreakCallbackUserData"));

    /// Creates `VmaDefragmentationInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaDefragmentationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaDefragmentationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDefragmentationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaDefragmentationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDefragmentationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDefragmentationInfo`
    public static VmaDefragmentationInfo alloc(SegmentAllocator allocator) { return new VmaDefragmentationInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaDefragmentationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDefragmentationInfo`
    public static VmaDefragmentationInfo alloc(SegmentAllocator allocator, long count) { return new VmaDefragmentationInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDefragmentationInfo copyFrom(VmaDefragmentationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaDefragmentationInfo reinterpret(long count) { return new VmaDefragmentationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VmaDefragmentationInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pool(MemorySegment segment, long index) { return (MemorySegment) VH_pool.get(segment, 0L, index); }
    /// {@return `pool`}
    public MemorySegment pool() { return pool(this.segment(), 0L); }
    /// Sets `pool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pool(MemorySegment segment, long index, MemorySegment value) { VH_pool.set(segment, 0L, index, value); }
    /// Sets `pool` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo pool(MemorySegment value) { pool(this.segment(), 0L, value); return this; }

    /// {@return `maxBytesPerPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBytesPerPass(MemorySegment segment, long index) { return (long) VH_maxBytesPerPass.get(segment, 0L, index); }
    /// {@return `maxBytesPerPass`}
    public long maxBytesPerPass() { return maxBytesPerPass(this.segment(), 0L); }
    /// Sets `maxBytesPerPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBytesPerPass(MemorySegment segment, long index, long value) { VH_maxBytesPerPass.set(segment, 0L, index, value); }
    /// Sets `maxBytesPerPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo maxBytesPerPass(long value) { maxBytesPerPass(this.segment(), 0L, value); return this; }

    /// {@return `maxAllocationsPerPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxAllocationsPerPass(MemorySegment segment, long index) { return (int) VH_maxAllocationsPerPass.get(segment, 0L, index); }
    /// {@return `maxAllocationsPerPass`}
    public int maxAllocationsPerPass() { return maxAllocationsPerPass(this.segment(), 0L); }
    /// Sets `maxAllocationsPerPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxAllocationsPerPass(MemorySegment segment, long index, int value) { VH_maxAllocationsPerPass.set(segment, 0L, index, value); }
    /// Sets `maxAllocationsPerPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo maxAllocationsPerPass(int value) { maxAllocationsPerPass(this.segment(), 0L, value); return this; }

    /// {@return `pfnBreakCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnBreakCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnBreakCallback.get(segment, 0L, index); }
    /// {@return `pfnBreakCallback`}
    public MemorySegment pfnBreakCallback() { return pfnBreakCallback(this.segment(), 0L); }
    /// Sets `pfnBreakCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnBreakCallback(MemorySegment segment, long index, MemorySegment value) { VH_pfnBreakCallback.set(segment, 0L, index, value); }
    /// Sets `pfnBreakCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo pfnBreakCallback(MemorySegment value) { pfnBreakCallback(this.segment(), 0L, value); return this; }

    /// {@return `pBreakCallbackUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBreakCallbackUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pBreakCallbackUserData.get(segment, 0L, index); }
    /// {@return `pBreakCallbackUserData`}
    public MemorySegment pBreakCallbackUserData() { return pBreakCallbackUserData(this.segment(), 0L); }
    /// Sets `pBreakCallbackUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBreakCallbackUserData(MemorySegment segment, long index, MemorySegment value) { VH_pBreakCallbackUserData.set(segment, 0L, index, value); }
    /// Sets `pBreakCallbackUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo pBreakCallbackUserData(MemorySegment value) { pBreakCallbackUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaDefragmentationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaDefragmentationInfo`
    public VmaDefragmentationInfo asSlice(long index) { return new VmaDefragmentationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaDefragmentationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaDefragmentationInfo`
    public VmaDefragmentationInfo asSlice(long index, long count) { return new VmaDefragmentationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaDefragmentationInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaDefragmentationInfo at(long index, Consumer<VmaDefragmentationInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pool` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment poolAt(long index) { return pool(this.segment(), index); }
    /// Sets `pool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo poolAt(long index, MemorySegment value) { pool(this.segment(), index, value); return this; }

    /// {@return `maxBytesPerPass` at the given index}
    /// @param index the index of the struct buffer
    public long maxBytesPerPassAt(long index) { return maxBytesPerPass(this.segment(), index); }
    /// Sets `maxBytesPerPass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo maxBytesPerPassAt(long index, long value) { maxBytesPerPass(this.segment(), index, value); return this; }

    /// {@return `maxAllocationsPerPass` at the given index}
    /// @param index the index of the struct buffer
    public int maxAllocationsPerPassAt(long index) { return maxAllocationsPerPass(this.segment(), index); }
    /// Sets `maxAllocationsPerPass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo maxAllocationsPerPassAt(long index, int value) { maxAllocationsPerPass(this.segment(), index, value); return this; }

    /// {@return `pfnBreakCallback` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnBreakCallbackAt(long index) { return pfnBreakCallback(this.segment(), index); }
    /// Sets `pfnBreakCallback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo pfnBreakCallbackAt(long index, MemorySegment value) { pfnBreakCallback(this.segment(), index, value); return this; }

    /// {@return `pBreakCallbackUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBreakCallbackUserDataAt(long index) { return pBreakCallbackUserData(this.segment(), index); }
    /// Sets `pBreakCallbackUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationInfo pBreakCallbackUserDataAt(long index, MemorySegment value) { pBreakCallbackUserData(this.segment(), index, value); return this; }

}
