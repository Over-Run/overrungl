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

/// Represents `VkReleaseCapturedPipelineDataInfoKHR`.
/// ## Layout
/// ```
/// struct VkReleaseCapturedPipelineDataInfoKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkPipeline pipeline;
/// };
/// ```
public final class VkReleaseCapturedPipelineDataInfoKHR extends GroupType {
    /// The struct layout of `VkReleaseCapturedPipelineDataInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipeline")
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

    /// Creates `VkReleaseCapturedPipelineDataInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkReleaseCapturedPipelineDataInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkReleaseCapturedPipelineDataInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseCapturedPipelineDataInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkReleaseCapturedPipelineDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseCapturedPipelineDataInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkReleaseCapturedPipelineDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseCapturedPipelineDataInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseCapturedPipelineDataInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkReleaseCapturedPipelineDataInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkReleaseCapturedPipelineDataInfoKHR`
    public static VkReleaseCapturedPipelineDataInfoKHR alloc(SegmentAllocator allocator) { return new VkReleaseCapturedPipelineDataInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkReleaseCapturedPipelineDataInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkReleaseCapturedPipelineDataInfoKHR`
    public static VkReleaseCapturedPipelineDataInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkReleaseCapturedPipelineDataInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkReleaseCapturedPipelineDataInfoKHR copyFrom(VkReleaseCapturedPipelineDataInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkReleaseCapturedPipelineDataInfoKHR reinterpret(long count) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkReleaseCapturedPipelineDataInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkReleaseCapturedPipelineDataInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkReleaseCapturedPipelineDataInfoKHR pipeline(long value) { pipeline(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkReleaseCapturedPipelineDataInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkReleaseCapturedPipelineDataInfoKHR`
    public VkReleaseCapturedPipelineDataInfoKHR asSlice(long index) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkReleaseCapturedPipelineDataInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkReleaseCapturedPipelineDataInfoKHR`
    public VkReleaseCapturedPipelineDataInfoKHR asSlice(long index, long count) { return new VkReleaseCapturedPipelineDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkReleaseCapturedPipelineDataInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkReleaseCapturedPipelineDataInfoKHR at(long index, Consumer<VkReleaseCapturedPipelineDataInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseCapturedPipelineDataInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseCapturedPipelineDataInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineAt(long index) { return pipeline(this.segment(), index); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseCapturedPipelineDataInfoKHR pipelineAt(long index, long value) { pipeline(this.segment(), index, value); return this; }

}
