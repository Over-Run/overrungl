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

/// Represents `VkSemaphoreTypeCreateInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreTypeCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSemaphoreType semaphoreType;
///     uint64_t initialValue;
/// };
/// ```
public final class VkSemaphoreTypeCreateInfo extends GroupType {
    /// The struct layout of `VkSemaphoreTypeCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreType"),
        ValueLayout.JAVA_LONG.withName("initialValue")
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
    /// The byte offset of `semaphoreType`.
    public static final long OFFSET_semaphoreType = LAYOUT.byteOffset(PathElement.groupElement("semaphoreType"));
    /// The memory layout of `semaphoreType`.
    public static final MemoryLayout LAYOUT_semaphoreType = LAYOUT.select(PathElement.groupElement("semaphoreType"));
    /// The [VarHandle] of `semaphoreType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphoreType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreType"));
    /// The byte offset of `initialValue`.
    public static final long OFFSET_initialValue = LAYOUT.byteOffset(PathElement.groupElement("initialValue"));
    /// The memory layout of `initialValue`.
    public static final MemoryLayout LAYOUT_initialValue = LAYOUT.select(PathElement.groupElement("initialValue"));
    /// The [VarHandle] of `initialValue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialValue"));

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreTypeCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreTypeCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreTypeCreateInfo`
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreTypeCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreTypeCreateInfo`
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreTypeCreateInfo copyFrom(VkSemaphoreTypeCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreTypeCreateInfo reinterpret(long count) { return new VkSemaphoreTypeCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreTypeCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreTypeCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphoreType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int semaphoreType(MemorySegment segment, long index) { return (int) VH_semaphoreType.get(segment, 0L, index); }
    /// {@return `semaphoreType`}
    public int semaphoreType() { return semaphoreType(this.segment(), 0L); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphoreType(MemorySegment segment, long index, int value) { VH_semaphoreType.set(segment, 0L, index, value); }
    /// Sets `semaphoreType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo semaphoreType(int value) { semaphoreType(this.segment(), 0L, value); return this; }

    /// {@return `initialValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long initialValue(MemorySegment segment, long index) { return (long) VH_initialValue.get(segment, 0L, index); }
    /// {@return `initialValue`}
    public long initialValue() { return initialValue(this.segment(), 0L); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialValue(MemorySegment segment, long index, long value) { VH_initialValue.set(segment, 0L, index, value); }
    /// Sets `initialValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo initialValue(long value) { initialValue(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreTypeCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreTypeCreateInfo`
    public VkSemaphoreTypeCreateInfo asSlice(long index) { return new VkSemaphoreTypeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreTypeCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreTypeCreateInfo`
    public VkSemaphoreTypeCreateInfo asSlice(long index, long count) { return new VkSemaphoreTypeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreTypeCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreTypeCreateInfo at(long index, Consumer<VkSemaphoreTypeCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphoreType` at the given index}
    /// @param index the index of the struct buffer
    public int semaphoreTypeAt(long index) { return semaphoreType(this.segment(), index); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo semaphoreTypeAt(long index, int value) { semaphoreType(this.segment(), index, value); return this; }

    /// {@return `initialValue` at the given index}
    /// @param index the index of the struct buffer
    public long initialValueAt(long index) { return initialValue(this.segment(), index); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo initialValueAt(long index, long value) { initialValue(this.segment(), index, value); return this; }

}
