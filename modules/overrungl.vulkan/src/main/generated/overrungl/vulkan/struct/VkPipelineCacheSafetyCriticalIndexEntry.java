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

/// Represents `VkPipelineCacheSafetyCriticalIndexEntry`.
/// ## Layout
/// ```
/// struct VkPipelineCacheSafetyCriticalIndexEntry {
///     uint8_t pipelineIdentifier[16];
///     uint64_t pipelineMemorySize;
///     uint64_t jsonSize;
///     uint64_t jsonOffset;
///     uint32_t stageIndexCount;
///     uint32_t stageIndexStride;
///     uint64_t stageIndexOffset;
/// };
/// ```
public final class VkPipelineCacheSafetyCriticalIndexEntry extends GroupType {
    /// The struct layout of `VkPipelineCacheSafetyCriticalIndexEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier"),
        ValueLayout.JAVA_LONG.withName("pipelineMemorySize"),
        ValueLayout.JAVA_LONG.withName("jsonSize"),
        ValueLayout.JAVA_LONG.withName("jsonOffset"),
        ValueLayout.JAVA_INT.withName("stageIndexCount"),
        ValueLayout.JAVA_INT.withName("stageIndexStride"),
        ValueLayout.JAVA_LONG.withName("stageIndexOffset")
    );
    /// The byte offset of `pipelineIdentifier`.
    public static final long OFFSET_pipelineIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout LAYOUT_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    /// The [VarHandle] of `pipelineIdentifier` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_pipelineIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());
    /// The byte offset of `pipelineMemorySize`.
    public static final long OFFSET_pipelineMemorySize = LAYOUT.byteOffset(PathElement.groupElement("pipelineMemorySize"));
    /// The memory layout of `pipelineMemorySize`.
    public static final MemoryLayout LAYOUT_pipelineMemorySize = LAYOUT.select(PathElement.groupElement("pipelineMemorySize"));
    /// The [VarHandle] of `pipelineMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineMemorySize"));
    /// The byte offset of `jsonSize`.
    public static final long OFFSET_jsonSize = LAYOUT.byteOffset(PathElement.groupElement("jsonSize"));
    /// The memory layout of `jsonSize`.
    public static final MemoryLayout LAYOUT_jsonSize = LAYOUT.select(PathElement.groupElement("jsonSize"));
    /// The [VarHandle] of `jsonSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_jsonSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("jsonSize"));
    /// The byte offset of `jsonOffset`.
    public static final long OFFSET_jsonOffset = LAYOUT.byteOffset(PathElement.groupElement("jsonOffset"));
    /// The memory layout of `jsonOffset`.
    public static final MemoryLayout LAYOUT_jsonOffset = LAYOUT.select(PathElement.groupElement("jsonOffset"));
    /// The [VarHandle] of `jsonOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_jsonOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("jsonOffset"));
    /// The byte offset of `stageIndexCount`.
    public static final long OFFSET_stageIndexCount = LAYOUT.byteOffset(PathElement.groupElement("stageIndexCount"));
    /// The memory layout of `stageIndexCount`.
    public static final MemoryLayout LAYOUT_stageIndexCount = LAYOUT.select(PathElement.groupElement("stageIndexCount"));
    /// The [VarHandle] of `stageIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexCount"));
    /// The byte offset of `stageIndexStride`.
    public static final long OFFSET_stageIndexStride = LAYOUT.byteOffset(PathElement.groupElement("stageIndexStride"));
    /// The memory layout of `stageIndexStride`.
    public static final MemoryLayout LAYOUT_stageIndexStride = LAYOUT.select(PathElement.groupElement("stageIndexStride"));
    /// The [VarHandle] of `stageIndexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageIndexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexStride"));
    /// The byte offset of `stageIndexOffset`.
    public static final long OFFSET_stageIndexOffset = LAYOUT.byteOffset(PathElement.groupElement("stageIndexOffset"));
    /// The memory layout of `stageIndexOffset`.
    public static final MemoryLayout LAYOUT_stageIndexOffset = LAYOUT.select(PathElement.groupElement("stageIndexOffset"));
    /// The [VarHandle] of `stageIndexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexOffset"));

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCacheSafetyCriticalIndexEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheSafetyCriticalIndexEntry`
    public static VkPipelineCacheSafetyCriticalIndexEntry alloc(SegmentAllocator allocator) { return new VkPipelineCacheSafetyCriticalIndexEntry(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheSafetyCriticalIndexEntry`
    public static VkPipelineCacheSafetyCriticalIndexEntry alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheSafetyCriticalIndexEntry(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry copyFrom(VkPipelineCacheSafetyCriticalIndexEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCacheSafetyCriticalIndexEntry reinterpret(long count) { return new VkPipelineCacheSafetyCriticalIndexEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pipelineIdentifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte pipelineIdentifier(MemorySegment segment, long index, long index0) { return (byte) VH_pipelineIdentifier.get(segment, 0L, index, index0); }
    /// {@return `pipelineIdentifier`}
    public MemorySegment pipelineIdentifier() { return pipelineIdentifier(this.segment(), 0L); }
    /// {@return `pipelineIdentifier`}
    /// @param index0 the Index 0 of the array
    public byte pipelineIdentifier(long index0) { return pipelineIdentifier(this.segment(), 0L, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier.byteSize()); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, long index0, byte value) { VH_pipelineIdentifier.set(segment, 0L, index, index0, value); }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifier(MemorySegment value) { pipelineIdentifier(this.segment(), 0L, value); return this; }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifier(long index0, byte value) { pipelineIdentifier(this.segment(), 0L, index0, value); return this; }

    /// {@return `pipelineMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineMemorySize(MemorySegment segment, long index) { return (long) VH_pipelineMemorySize.get(segment, 0L, index); }
    /// {@return `pipelineMemorySize`}
    public long pipelineMemorySize() { return pipelineMemorySize(this.segment(), 0L); }
    /// Sets `pipelineMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineMemorySize(MemorySegment segment, long index, long value) { VH_pipelineMemorySize.set(segment, 0L, index, value); }
    /// Sets `pipelineMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineMemorySize(long value) { pipelineMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `jsonSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long jsonSize(MemorySegment segment, long index) { return (long) VH_jsonSize.get(segment, 0L, index); }
    /// {@return `jsonSize`}
    public long jsonSize() { return jsonSize(this.segment(), 0L); }
    /// Sets `jsonSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void jsonSize(MemorySegment segment, long index, long value) { VH_jsonSize.set(segment, 0L, index, value); }
    /// Sets `jsonSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonSize(long value) { jsonSize(this.segment(), 0L, value); return this; }

    /// {@return `jsonOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long jsonOffset(MemorySegment segment, long index) { return (long) VH_jsonOffset.get(segment, 0L, index); }
    /// {@return `jsonOffset`}
    public long jsonOffset() { return jsonOffset(this.segment(), 0L); }
    /// Sets `jsonOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void jsonOffset(MemorySegment segment, long index, long value) { VH_jsonOffset.set(segment, 0L, index, value); }
    /// Sets `jsonOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonOffset(long value) { jsonOffset(this.segment(), 0L, value); return this; }

    /// {@return `stageIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageIndexCount(MemorySegment segment, long index) { return (int) VH_stageIndexCount.get(segment, 0L, index); }
    /// {@return `stageIndexCount`}
    public int stageIndexCount() { return stageIndexCount(this.segment(), 0L); }
    /// Sets `stageIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageIndexCount(MemorySegment segment, long index, int value) { VH_stageIndexCount.set(segment, 0L, index, value); }
    /// Sets `stageIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexCount(int value) { stageIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `stageIndexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageIndexStride(MemorySegment segment, long index) { return (int) VH_stageIndexStride.get(segment, 0L, index); }
    /// {@return `stageIndexStride`}
    public int stageIndexStride() { return stageIndexStride(this.segment(), 0L); }
    /// Sets `stageIndexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageIndexStride(MemorySegment segment, long index, int value) { VH_stageIndexStride.set(segment, 0L, index, value); }
    /// Sets `stageIndexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexStride(int value) { stageIndexStride(this.segment(), 0L, value); return this; }

    /// {@return `stageIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stageIndexOffset(MemorySegment segment, long index) { return (long) VH_stageIndexOffset.get(segment, 0L, index); }
    /// {@return `stageIndexOffset`}
    public long stageIndexOffset() { return stageIndexOffset(this.segment(), 0L); }
    /// Sets `stageIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageIndexOffset(MemorySegment segment, long index, long value) { VH_stageIndexOffset.set(segment, 0L, index, value); }
    /// Sets `stageIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexOffset(long value) { stageIndexOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCacheSafetyCriticalIndexEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheSafetyCriticalIndexEntry`
    public VkPipelineCacheSafetyCriticalIndexEntry asSlice(long index) { return new VkPipelineCacheSafetyCriticalIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCacheSafetyCriticalIndexEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheSafetyCriticalIndexEntry`
    public VkPipelineCacheSafetyCriticalIndexEntry asSlice(long index, long count) { return new VkPipelineCacheSafetyCriticalIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCacheSafetyCriticalIndexEntry` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry at(long index, Consumer<VkPipelineCacheSafetyCriticalIndexEntry> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pipelineIdentifierAt(long index) { return pipelineIdentifier(this.segment(), index); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte pipelineIdentifierAt(long index, long index0) { return pipelineIdentifier(this.segment(), index, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifierAt(long index, MemorySegment value) { pipelineIdentifier(this.segment(), index, value); return this; }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifierAt(long index, long index0, byte value) { pipelineIdentifier(this.segment(), index, index0, value); return this; }

    /// {@return `pipelineMemorySize` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineMemorySizeAt(long index) { return pipelineMemorySize(this.segment(), index); }
    /// Sets `pipelineMemorySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineMemorySizeAt(long index, long value) { pipelineMemorySize(this.segment(), index, value); return this; }

    /// {@return `jsonSize` at the given index}
    /// @param index the index of the struct buffer
    public long jsonSizeAt(long index) { return jsonSize(this.segment(), index); }
    /// Sets `jsonSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonSizeAt(long index, long value) { jsonSize(this.segment(), index, value); return this; }

    /// {@return `jsonOffset` at the given index}
    /// @param index the index of the struct buffer
    public long jsonOffsetAt(long index) { return jsonOffset(this.segment(), index); }
    /// Sets `jsonOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonOffsetAt(long index, long value) { jsonOffset(this.segment(), index, value); return this; }

    /// {@return `stageIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int stageIndexCountAt(long index) { return stageIndexCount(this.segment(), index); }
    /// Sets `stageIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexCountAt(long index, int value) { stageIndexCount(this.segment(), index, value); return this; }

    /// {@return `stageIndexStride` at the given index}
    /// @param index the index of the struct buffer
    public int stageIndexStrideAt(long index) { return stageIndexStride(this.segment(), index); }
    /// Sets `stageIndexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexStrideAt(long index, int value) { stageIndexStride(this.segment(), index, value); return this; }

    /// {@return `stageIndexOffset` at the given index}
    /// @param index the index of the struct buffer
    public long stageIndexOffsetAt(long index) { return stageIndexOffset(this.segment(), index); }
    /// Sets `stageIndexOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexOffsetAt(long index, long value) { stageIndexOffset(this.segment(), index, value); return this; }

}
