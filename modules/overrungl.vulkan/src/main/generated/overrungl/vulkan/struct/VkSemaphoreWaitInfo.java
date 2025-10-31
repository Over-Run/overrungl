// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreWaitInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreWaitInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSemaphoreWaitFlags flags;
///     uint32_t semaphoreCount;
///     const VkSemaphore* pSemaphores;
///     const uint64_t* pValues;
/// };
/// ```
public final class VkSemaphoreWaitInfo extends GroupType {
    /// The struct layout of `VkSemaphoreWaitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withName("pSemaphores"),
        ValueLayout.ADDRESS.withName("pValues")
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
    /// The byte offset of `semaphoreCount`.
    public static final long OFFSET_semaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("semaphoreCount"));
    /// The memory layout of `semaphoreCount`.
    public static final MemoryLayout LAYOUT_semaphoreCount = LAYOUT.select(PathElement.groupElement("semaphoreCount"));
    /// The [VarHandle] of `semaphoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreCount"));
    /// The byte offset of `pSemaphores`.
    public static final long OFFSET_pSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pSemaphores"));
    /// The memory layout of `pSemaphores`.
    public static final MemoryLayout LAYOUT_pSemaphores = LAYOUT.select(PathElement.groupElement("pSemaphores"));
    /// The [VarHandle] of `pSemaphores` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSemaphores"));
    /// The byte offset of `pValues`.
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    /// The memory layout of `pValues`.
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreWaitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreWaitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreWaitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreWaitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreWaitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreWaitInfo`
    public static VkSemaphoreWaitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreWaitInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreWaitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreWaitInfo`
    public static VkSemaphoreWaitInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreWaitInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreWaitInfo copyFrom(VkSemaphoreWaitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreWaitInfo reinterpret(long count) { return new VkSemaphoreWaitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreWaitInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreWaitInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreWaitInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `semaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int semaphoreCount(MemorySegment segment, long index) { return (int) VH_semaphoreCount.get(segment, 0L, index); }
    /// {@return `semaphoreCount`}
    public int semaphoreCount() { return semaphoreCount(this.segment(), 0L); }
    /// Sets `semaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphoreCount(MemorySegment segment, long index, int value) { VH_semaphoreCount.set(segment, 0L, index, value); }
    /// Sets `semaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo semaphoreCount(int value) { semaphoreCount(this.segment(), 0L, value); return this; }

    /// {@return `pSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSemaphores(MemorySegment segment, long index) { return (MemorySegment) VH_pSemaphores.get(segment, 0L, index); }
    /// {@return `pSemaphores`}
    public MemorySegment pSemaphores() { return pSemaphores(this.segment(), 0L); }
    /// Sets `pSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSemaphores(MemorySegment segment, long index, MemorySegment value) { VH_pSemaphores.set(segment, 0L, index, value); }
    /// Sets `pSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pSemaphores(MemorySegment value) { pSemaphores(this.segment(), 0L, value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pValues(MemorySegment segment, long index) { return (MemorySegment) VH_pValues.get(segment, 0L, index); }
    /// {@return `pValues`}
    public MemorySegment pValues() { return pValues(this.segment(), 0L); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pValues(MemorySegment segment, long index, MemorySegment value) { VH_pValues.set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pValues(MemorySegment value) { pValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreWaitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreWaitInfo`
    public VkSemaphoreWaitInfo asSlice(long index) { return new VkSemaphoreWaitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreWaitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreWaitInfo`
    public VkSemaphoreWaitInfo asSlice(long index, long count) { return new VkSemaphoreWaitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreWaitInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreWaitInfo at(long index, Consumer<VkSemaphoreWaitInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `semaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int semaphoreCountAt(long index) { return semaphoreCount(this.segment(), index); }
    /// Sets `semaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo semaphoreCountAt(long index, int value) { semaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pSemaphores` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSemaphoresAt(long index) { return pSemaphores(this.segment(), index); }
    /// Sets `pSemaphores` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pSemaphoresAt(long index, MemorySegment value) { pSemaphores(this.segment(), index, value); return this; }

    /// {@return `pValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pValuesAt(long index) { return pValues(this.segment(), index); }
    /// Sets `pValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pValuesAt(long index, MemorySegment value) { pValues(this.segment(), index, value); return this; }

}
