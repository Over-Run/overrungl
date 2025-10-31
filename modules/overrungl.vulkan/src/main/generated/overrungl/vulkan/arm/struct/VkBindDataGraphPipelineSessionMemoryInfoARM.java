// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDataGraphPipelineSessionMemoryInfoARM`.
/// ## Layout
/// ```
/// struct VkBindDataGraphPipelineSessionMemoryInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDataGraphPipelineSessionARM session;
///     (int) VkDataGraphPipelineSessionBindPointARM bindPoint;
///     uint32_t objectIndex;
///     (uint64_t) VkDeviceMemory memory;
///     (uint64_t) VkDeviceSize memoryOffset;
/// };
/// ```
public final class VkBindDataGraphPipelineSessionMemoryInfoARM extends GroupType {
    /// The struct layout of `VkBindDataGraphPipelineSessionMemoryInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("objectIndex"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
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
    /// The byte offset of `session`.
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    /// The memory layout of `session`.
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    /// The [VarHandle] of `session` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));
    /// The byte offset of `bindPoint`.
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    /// The memory layout of `bindPoint`.
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    /// The [VarHandle] of `bindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    /// The byte offset of `objectIndex`.
    public static final long OFFSET_objectIndex = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
    /// The memory layout of `objectIndex`.
    public static final MemoryLayout LAYOUT_objectIndex = LAYOUT.select(PathElement.groupElement("objectIndex"));
    /// The [VarHandle] of `objectIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectIndex"));
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The byte offset of `memoryOffset`.
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    /// The memory layout of `memoryOffset`.
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));

    /// Creates `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindDataGraphPipelineSessionMemoryInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDataGraphPipelineSessionMemoryInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDataGraphPipelineSessionMemoryInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDataGraphPipelineSessionMemoryInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDataGraphPipelineSessionMemoryInfoARM`
    public static VkBindDataGraphPipelineSessionMemoryInfoARM alloc(SegmentAllocator allocator) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindDataGraphPipelineSessionMemoryInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindDataGraphPipelineSessionMemoryInfoARM`
    public static VkBindDataGraphPipelineSessionMemoryInfoARM alloc(SegmentAllocator allocator, long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM copyFrom(VkBindDataGraphPipelineSessionMemoryInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindDataGraphPipelineSessionMemoryInfoARM reinterpret(long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindDataGraphPipelineSessionMemoryInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `session` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long session(MemorySegment segment, long index) { return (long) VH_session.get(segment, 0L, index); }
    /// {@return `session`}
    public long session() { return session(this.segment(), 0L); }
    /// Sets `session` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void session(MemorySegment segment, long index, long value) { VH_session.set(segment, 0L, index, value); }
    /// Sets `session` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM session(long value) { session(this.segment(), 0L, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPoint(MemorySegment segment, long index) { return (int) VH_bindPoint.get(segment, 0L, index); }
    /// {@return `bindPoint`}
    public int bindPoint() { return bindPoint(this.segment(), 0L); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPoint(MemorySegment segment, long index, int value) { VH_bindPoint.set(segment, 0L, index, value); }
    /// Sets `bindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPoint(int value) { bindPoint(this.segment(), 0L, value); return this; }

    /// {@return `objectIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectIndex(MemorySegment segment, long index) { return (int) VH_objectIndex.get(segment, 0L, index); }
    /// {@return `objectIndex`}
    public int objectIndex() { return objectIndex(this.segment(), 0L); }
    /// Sets `objectIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectIndex(MemorySegment segment, long index, int value) { VH_objectIndex.set(segment, 0L, index, value); }
    /// Sets `objectIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndex(int value) { objectIndex(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    public long memoryOffset() { return memoryOffset(this.segment(), 0L); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryOffset(MemorySegment segment, long index, long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffset(long value) { memoryOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindDataGraphPipelineSessionMemoryInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindDataGraphPipelineSessionMemoryInfoARM`
    public VkBindDataGraphPipelineSessionMemoryInfoARM asSlice(long index) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindDataGraphPipelineSessionMemoryInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindDataGraphPipelineSessionMemoryInfoARM`
    public VkBindDataGraphPipelineSessionMemoryInfoARM asSlice(long index, long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindDataGraphPipelineSessionMemoryInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM at(long index, Consumer<VkBindDataGraphPipelineSessionMemoryInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `session` at the given index}
    /// @param index the index of the struct buffer
    public long sessionAt(long index) { return session(this.segment(), index); }
    /// Sets `session` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM sessionAt(long index, long value) { session(this.segment(), index, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int bindPointAt(long index) { return bindPoint(this.segment(), index); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPointAt(long index, int value) { bindPoint(this.segment(), index, value); return this; }

    /// {@return `objectIndex` at the given index}
    /// @param index the index of the struct buffer
    public int objectIndexAt(long index) { return objectIndex(this.segment(), index); }
    /// Sets `objectIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndexAt(long index, int value) { objectIndex(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param index the index of the struct buffer
    public long memoryOffsetAt(long index) { return memoryOffset(this.segment(), index); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffsetAt(long index, long value) { memoryOffset(this.segment(), index, value); return this; }

}
