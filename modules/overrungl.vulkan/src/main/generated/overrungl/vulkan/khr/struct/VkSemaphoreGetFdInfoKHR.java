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

/// Represents `VkSemaphoreGetFdInfoKHR`.
/// ## Layout
/// ```
/// struct VkSemaphoreGetFdInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphore semaphore;
///     (int) VkExternalSemaphoreHandleTypeFlagBits handleType;
/// };
/// ```
public final class VkSemaphoreGetFdInfoKHR extends GroupType {
    /// The struct layout of `VkSemaphoreGetFdInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType")
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
    /// The byte offset of `semaphore`.
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    /// The memory layout of `semaphore`.
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    /// Creates `VkSemaphoreGetFdInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreGetFdInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreGetFdInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetFdInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreGetFdInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreGetFdInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetFdInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreGetFdInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreGetFdInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreGetFdInfoKHR`
    public static VkSemaphoreGetFdInfoKHR alloc(SegmentAllocator allocator) { return new VkSemaphoreGetFdInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreGetFdInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreGetFdInfoKHR`
    public static VkSemaphoreGetFdInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreGetFdInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR copyFrom(VkSemaphoreGetFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreGetFdInfoKHR reinterpret(long count) { return new VkSemaphoreGetFdInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreGetFdInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreGetFdInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long semaphore(MemorySegment segment, long index) { return (long) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    public long semaphore() { return semaphore(this.segment(), 0L); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphore(MemorySegment segment, long index, long value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR semaphore(long value) { semaphore(this.segment(), 0L, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    public int handleType() { return handleType(this.segment(), 0L); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleType(MemorySegment segment, long index, int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreGetFdInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreGetFdInfoKHR`
    public VkSemaphoreGetFdInfoKHR asSlice(long index) { return new VkSemaphoreGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreGetFdInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreGetFdInfoKHR`
    public VkSemaphoreGetFdInfoKHR asSlice(long index, long count) { return new VkSemaphoreGetFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreGetFdInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR at(long index, Consumer<VkSemaphoreGetFdInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param index the index of the struct buffer
    public long semaphoreAt(long index) { return semaphore(this.segment(), index); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR semaphoreAt(long index, long value) { semaphore(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetFdInfoKHR handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

}
