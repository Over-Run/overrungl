// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSemaphoreSubmitInfo`.
/// ## Layout
/// ```
/// struct VkSemaphoreSubmitInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphore semaphore;
///     uint64_t value;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 stageMask;
///     uint32_t deviceIndex;
/// };
/// ```
public final class VkSemaphoreSubmitInfo extends GroupType {
    /// The struct layout of `VkSemaphoreSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value"),
        ValueLayout.JAVA_LONG.withName("stageMask"),
        ValueLayout.JAVA_INT.withName("deviceIndex")
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
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));
    /// The byte offset of `stageMask`.
    public static final long OFFSET_stageMask = LAYOUT.byteOffset(PathElement.groupElement("stageMask"));
    /// The memory layout of `stageMask`.
    public static final MemoryLayout LAYOUT_stageMask = LAYOUT.select(PathElement.groupElement("stageMask"));
    /// The [VarHandle] of `stageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageMask"));
    /// The byte offset of `deviceIndex`.
    public static final long OFFSET_deviceIndex = LAYOUT.byteOffset(PathElement.groupElement("deviceIndex"));
    /// The memory layout of `deviceIndex`.
    public static final MemoryLayout LAYOUT_deviceIndex = LAYOUT.select(PathElement.groupElement("deviceIndex"));
    /// The [VarHandle] of `deviceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndex"));

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreSubmitInfo`
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreSubmitInfo`
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreSubmitInfo copyFrom(VkSemaphoreSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreSubmitInfo reinterpret(long count) { return new VkSemaphoreSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreSubmitInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreSubmitInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreSubmitInfo semaphore(long value) { semaphore(this.segment(), 0L, value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public long value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo value(long value) { value(this.segment(), 0L, value); return this; }

    /// {@return `stageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stageMask(MemorySegment segment, long index) { return (long) VH_stageMask.get(segment, 0L, index); }
    /// {@return `stageMask`}
    public long stageMask() { return stageMask(this.segment(), 0L); }
    /// Sets `stageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageMask(MemorySegment segment, long index, long value) { VH_stageMask.set(segment, 0L, index, value); }
    /// Sets `stageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo stageMask(long value) { stageMask(this.segment(), 0L, value); return this; }

    /// {@return `deviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceIndex(MemorySegment segment, long index) { return (int) VH_deviceIndex.get(segment, 0L, index); }
    /// {@return `deviceIndex`}
    public int deviceIndex() { return deviceIndex(this.segment(), 0L); }
    /// Sets `deviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceIndex(MemorySegment segment, long index, int value) { VH_deviceIndex.set(segment, 0L, index, value); }
    /// Sets `deviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo deviceIndex(int value) { deviceIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreSubmitInfo`
    public VkSemaphoreSubmitInfo asSlice(long index) { return new VkSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreSubmitInfo`
    public VkSemaphoreSubmitInfo asSlice(long index, long count) { return new VkSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreSubmitInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreSubmitInfo at(long index, Consumer<VkSemaphoreSubmitInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param index the index of the struct buffer
    public long semaphoreAt(long index) { return semaphore(this.segment(), index); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo semaphoreAt(long index, long value) { semaphore(this.segment(), index, value); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public long valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo valueAt(long index, long value) { value(this.segment(), index, value); return this; }

    /// {@return `stageMask` at the given index}
    /// @param index the index of the struct buffer
    public long stageMaskAt(long index) { return stageMask(this.segment(), index); }
    /// Sets `stageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo stageMaskAt(long index, long value) { stageMask(this.segment(), index, value); return this; }

    /// {@return `deviceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIndexAt(long index) { return deviceIndex(this.segment(), index); }
    /// Sets `deviceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo deviceIndexAt(long index, int value) { deviceIndex(this.segment(), index, value); return this; }

}
