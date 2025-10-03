// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalBufferInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalBufferInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceMemory memory;
///     (void*) MTLBuffer_id mtlBuffer;
/// };
/// ```
public final class VkExportMetalBufferInfoEXT extends GroupType {
    /// The struct layout of `VkExportMetalBufferInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
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
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memory = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory")));
    /// The byte offset of `mtlBuffer`.
    public static final long OFFSET_mtlBuffer = LAYOUT.byteOffset(PathElement.groupElement("mtlBuffer"));
    /// The memory layout of `mtlBuffer`.
    public static final MemoryLayout LAYOUT_mtlBuffer = LAYOUT.select(PathElement.groupElement("mtlBuffer"));
    /// The [VarHandle] of `mtlBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_mtlBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlBuffer")));

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportMetalBufferInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMetalBufferInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalBufferInfoEXT`
    public static VkExportMetalBufferInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalBufferInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportMetalBufferInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalBufferInfoEXT`
    public static VkExportMetalBufferInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalBufferInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalBufferInfoEXT copyFrom(VkExportMetalBufferInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportMetalBufferInfoEXT reinterpret(long count) { return new VkExportMetalBufferInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportMetalBufferInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMetalBufferInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get().get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.get().set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_mtlBuffer.get().get(segment, 0L, index); }
    /// {@return `mtlBuffer`}
    public MemorySegment mtlBuffer() { return mtlBuffer(this.segment(), 0L); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlBuffer(MemorySegment segment, long index, MemorySegment value) { VH_mtlBuffer.get().set(segment, 0L, index, value); }
    /// Sets `mtlBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT mtlBuffer(MemorySegment value) { mtlBuffer(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMetalBufferInfoEXT`
    public VkExportMetalBufferInfoEXT asSlice(long index) { return new VkExportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMetalBufferInfoEXT`
    public VkExportMetalBufferInfoEXT asSlice(long index, long count) { return new VkExportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportMetalBufferInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportMetalBufferInfoEXT at(long index, Consumer<VkExportMetalBufferInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment mtlBufferAt(long index) { return mtlBuffer(this.segment(), index); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT mtlBufferAt(long index, MemorySegment value) { mtlBuffer(this.segment(), index, value); return this; }

}
