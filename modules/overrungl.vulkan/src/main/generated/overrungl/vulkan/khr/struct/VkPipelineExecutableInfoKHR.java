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

/// Represents `VkPipelineExecutableInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineExecutableInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkPipeline pipeline;
///     uint32_t executableIndex;
/// };
/// ```
public final class VkPipelineExecutableInfoKHR extends GroupType {
    /// The struct layout of `VkPipelineExecutableInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
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
    /// The byte offset of `pipeline`.
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    /// The memory layout of `pipeline`.
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));
    /// The byte offset of `executableIndex`.
    public static final long OFFSET_executableIndex = LAYOUT.byteOffset(PathElement.groupElement("executableIndex"));
    /// The memory layout of `executableIndex`.
    public static final MemoryLayout LAYOUT_executableIndex = LAYOUT.select(PathElement.groupElement("executableIndex"));
    /// The [VarHandle] of `executableIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_executableIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executableIndex"));

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineExecutableInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineExecutableInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineExecutableInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableInfoKHR`
    public static VkPipelineExecutableInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableInfoKHR copyFrom(VkPipelineExecutableInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineExecutableInfoKHR reinterpret(long count) { return new VkPipelineExecutableInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineExecutableInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineExecutableInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipeline(MemorySegment segment, long index) { return (long) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    public long pipeline() { return pipeline(this.segment(), 0L); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipeline(MemorySegment segment, long index, long value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pipeline(long value) { pipeline(this.segment(), 0L, value); return this; }

    /// {@return `executableIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int executableIndex(MemorySegment segment, long index) { return (int) VH_executableIndex.get(segment, 0L, index); }
    /// {@return `executableIndex`}
    public int executableIndex() { return executableIndex(this.segment(), 0L); }
    /// Sets `executableIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void executableIndex(MemorySegment segment, long index, int value) { VH_executableIndex.set(segment, 0L, index, value); }
    /// Sets `executableIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR executableIndex(int value) { executableIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineExecutableInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineExecutableInfoKHR`
    public VkPipelineExecutableInfoKHR asSlice(long index) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineExecutableInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineExecutableInfoKHR`
    public VkPipelineExecutableInfoKHR asSlice(long index, long count) { return new VkPipelineExecutableInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineExecutableInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineExecutableInfoKHR at(long index, Consumer<VkPipelineExecutableInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineAt(long index) { return pipeline(this.segment(), index); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR pipelineAt(long index, long value) { pipeline(this.segment(), index, value); return this; }

    /// {@return `executableIndex` at the given index}
    /// @param index the index of the struct buffer
    public int executableIndexAt(long index) { return executableIndex(this.segment(), index); }
    /// Sets `executableIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableInfoKHR executableIndexAt(long index, int value) { executableIndex(this.segment(), index, value); return this; }

}
