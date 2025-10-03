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

/// Represents `VkTraceRaysIndirectCommand2KHR`.
/// ## Layout
/// ```
/// struct VkTraceRaysIndirectCommand2KHR {
///     (uint64_t) VkDeviceAddress raygenShaderRecordAddress;
///     (uint64_t) VkDeviceSize raygenShaderRecordSize;
///     (uint64_t) VkDeviceAddress missShaderBindingTableAddress;
///     (uint64_t) VkDeviceSize missShaderBindingTableSize;
///     (uint64_t) VkDeviceSize missShaderBindingTableStride;
///     (uint64_t) VkDeviceAddress hitShaderBindingTableAddress;
///     (uint64_t) VkDeviceSize hitShaderBindingTableSize;
///     (uint64_t) VkDeviceSize hitShaderBindingTableStride;
///     (uint64_t) VkDeviceAddress callableShaderBindingTableAddress;
///     (uint64_t) VkDeviceSize callableShaderBindingTableSize;
///     (uint64_t) VkDeviceSize callableShaderBindingTableStride;
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// };
/// ```
public final class VkTraceRaysIndirectCommand2KHR extends GroupType {
    /// The struct layout of `VkTraceRaysIndirectCommand2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordAddress"),
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableStride"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    /// The byte offset of `raygenShaderRecordAddress`.
    public static final long OFFSET_raygenShaderRecordAddress = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordAddress"));
    /// The memory layout of `raygenShaderRecordAddress`.
    public static final MemoryLayout LAYOUT_raygenShaderRecordAddress = LAYOUT.select(PathElement.groupElement("raygenShaderRecordAddress"));
    /// The [VarHandle] of `raygenShaderRecordAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_raygenShaderRecordAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordAddress")));
    /// The byte offset of `raygenShaderRecordSize`.
    public static final long OFFSET_raygenShaderRecordSize = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordSize"));
    /// The memory layout of `raygenShaderRecordSize`.
    public static final MemoryLayout LAYOUT_raygenShaderRecordSize = LAYOUT.select(PathElement.groupElement("raygenShaderRecordSize"));
    /// The [VarHandle] of `raygenShaderRecordSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_raygenShaderRecordSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordSize")));
    /// The byte offset of `missShaderBindingTableAddress`.
    public static final long OFFSET_missShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableAddress"));
    /// The memory layout of `missShaderBindingTableAddress`.
    public static final MemoryLayout LAYOUT_missShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("missShaderBindingTableAddress"));
    /// The [VarHandle] of `missShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_missShaderBindingTableAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableAddress")));
    /// The byte offset of `missShaderBindingTableSize`.
    public static final long OFFSET_missShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableSize"));
    /// The memory layout of `missShaderBindingTableSize`.
    public static final MemoryLayout LAYOUT_missShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("missShaderBindingTableSize"));
    /// The [VarHandle] of `missShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_missShaderBindingTableSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableSize")));
    /// The byte offset of `missShaderBindingTableStride`.
    public static final long OFFSET_missShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableStride"));
    /// The memory layout of `missShaderBindingTableStride`.
    public static final MemoryLayout LAYOUT_missShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("missShaderBindingTableStride"));
    /// The [VarHandle] of `missShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_missShaderBindingTableStride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableStride")));
    /// The byte offset of `hitShaderBindingTableAddress`.
    public static final long OFFSET_hitShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableAddress"));
    /// The memory layout of `hitShaderBindingTableAddress`.
    public static final MemoryLayout LAYOUT_hitShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableAddress"));
    /// The [VarHandle] of `hitShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hitShaderBindingTableAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableAddress")));
    /// The byte offset of `hitShaderBindingTableSize`.
    public static final long OFFSET_hitShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableSize"));
    /// The memory layout of `hitShaderBindingTableSize`.
    public static final MemoryLayout LAYOUT_hitShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableSize"));
    /// The [VarHandle] of `hitShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hitShaderBindingTableSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableSize")));
    /// The byte offset of `hitShaderBindingTableStride`.
    public static final long OFFSET_hitShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableStride"));
    /// The memory layout of `hitShaderBindingTableStride`.
    public static final MemoryLayout LAYOUT_hitShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableStride"));
    /// The [VarHandle] of `hitShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hitShaderBindingTableStride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableStride")));
    /// The byte offset of `callableShaderBindingTableAddress`.
    public static final long OFFSET_callableShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableAddress"));
    /// The memory layout of `callableShaderBindingTableAddress`.
    public static final MemoryLayout LAYOUT_callableShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableAddress"));
    /// The [VarHandle] of `callableShaderBindingTableAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_callableShaderBindingTableAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableAddress")));
    /// The byte offset of `callableShaderBindingTableSize`.
    public static final long OFFSET_callableShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableSize"));
    /// The memory layout of `callableShaderBindingTableSize`.
    public static final MemoryLayout LAYOUT_callableShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableSize"));
    /// The [VarHandle] of `callableShaderBindingTableSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_callableShaderBindingTableSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableSize")));
    /// The byte offset of `callableShaderBindingTableStride`.
    public static final long OFFSET_callableShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableStride"));
    /// The memory layout of `callableShaderBindingTableStride`.
    public static final MemoryLayout LAYOUT_callableShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableStride"));
    /// The [VarHandle] of `callableShaderBindingTableStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_callableShaderBindingTableStride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableStride")));
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_width = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("width")));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_height = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("height")));
    /// The byte offset of `depth`.
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    /// The memory layout of `depth`.
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_depth = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth")));

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTraceRaysIndirectCommand2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTraceRaysIndirectCommand2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTraceRaysIndirectCommand2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTraceRaysIndirectCommand2KHR`
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTraceRaysIndirectCommand2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTraceRaysIndirectCommand2KHR`
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator, long count) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR copyFrom(VkTraceRaysIndirectCommand2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTraceRaysIndirectCommand2KHR reinterpret(long count) { return new VkTraceRaysIndirectCommand2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `raygenShaderRecordAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long raygenShaderRecordAddress(MemorySegment segment, long index) { return (long) VH_raygenShaderRecordAddress.get().get(segment, 0L, index); }
    /// {@return `raygenShaderRecordAddress`}
    public long raygenShaderRecordAddress() { return raygenShaderRecordAddress(this.segment(), 0L); }
    /// Sets `raygenShaderRecordAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void raygenShaderRecordAddress(MemorySegment segment, long index, long value) { VH_raygenShaderRecordAddress.get().set(segment, 0L, index, value); }
    /// Sets `raygenShaderRecordAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(long value) { raygenShaderRecordAddress(this.segment(), 0L, value); return this; }

    /// {@return `raygenShaderRecordSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long raygenShaderRecordSize(MemorySegment segment, long index) { return (long) VH_raygenShaderRecordSize.get().get(segment, 0L, index); }
    /// {@return `raygenShaderRecordSize`}
    public long raygenShaderRecordSize() { return raygenShaderRecordSize(this.segment(), 0L); }
    /// Sets `raygenShaderRecordSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void raygenShaderRecordSize(MemorySegment segment, long index, long value) { VH_raygenShaderRecordSize.get().set(segment, 0L, index, value); }
    /// Sets `raygenShaderRecordSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(long value) { raygenShaderRecordSize(this.segment(), 0L, value); return this; }

    /// {@return `missShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long missShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableAddress.get().get(segment, 0L, index); }
    /// {@return `missShaderBindingTableAddress`}
    public long missShaderBindingTableAddress() { return missShaderBindingTableAddress(this.segment(), 0L); }
    /// Sets `missShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void missShaderBindingTableAddress(MemorySegment segment, long index, long value) { VH_missShaderBindingTableAddress.get().set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(long value) { missShaderBindingTableAddress(this.segment(), 0L, value); return this; }

    /// {@return `missShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long missShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableSize.get().get(segment, 0L, index); }
    /// {@return `missShaderBindingTableSize`}
    public long missShaderBindingTableSize() { return missShaderBindingTableSize(this.segment(), 0L); }
    /// Sets `missShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void missShaderBindingTableSize(MemorySegment segment, long index, long value) { VH_missShaderBindingTableSize.get().set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(long value) { missShaderBindingTableSize(this.segment(), 0L, value); return this; }

    /// {@return `missShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long missShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_missShaderBindingTableStride.get().get(segment, 0L, index); }
    /// {@return `missShaderBindingTableStride`}
    public long missShaderBindingTableStride() { return missShaderBindingTableStride(this.segment(), 0L); }
    /// Sets `missShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void missShaderBindingTableStride(MemorySegment segment, long index, long value) { VH_missShaderBindingTableStride.get().set(segment, 0L, index, value); }
    /// Sets `missShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(long value) { missShaderBindingTableStride(this.segment(), 0L, value); return this; }

    /// {@return `hitShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long hitShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableAddress.get().get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableAddress`}
    public long hitShaderBindingTableAddress() { return hitShaderBindingTableAddress(this.segment(), 0L); }
    /// Sets `hitShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hitShaderBindingTableAddress(MemorySegment segment, long index, long value) { VH_hitShaderBindingTableAddress.get().set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(long value) { hitShaderBindingTableAddress(this.segment(), 0L, value); return this; }

    /// {@return `hitShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long hitShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableSize.get().get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableSize`}
    public long hitShaderBindingTableSize() { return hitShaderBindingTableSize(this.segment(), 0L); }
    /// Sets `hitShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hitShaderBindingTableSize(MemorySegment segment, long index, long value) { VH_hitShaderBindingTableSize.get().set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(long value) { hitShaderBindingTableSize(this.segment(), 0L, value); return this; }

    /// {@return `hitShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long hitShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_hitShaderBindingTableStride.get().get(segment, 0L, index); }
    /// {@return `hitShaderBindingTableStride`}
    public long hitShaderBindingTableStride() { return hitShaderBindingTableStride(this.segment(), 0L); }
    /// Sets `hitShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hitShaderBindingTableStride(MemorySegment segment, long index, long value) { VH_hitShaderBindingTableStride.get().set(segment, 0L, index, value); }
    /// Sets `hitShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(long value) { hitShaderBindingTableStride(this.segment(), 0L, value); return this; }

    /// {@return `callableShaderBindingTableAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long callableShaderBindingTableAddress(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableAddress.get().get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableAddress`}
    public long callableShaderBindingTableAddress() { return callableShaderBindingTableAddress(this.segment(), 0L); }
    /// Sets `callableShaderBindingTableAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void callableShaderBindingTableAddress(MemorySegment segment, long index, long value) { VH_callableShaderBindingTableAddress.get().set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(long value) { callableShaderBindingTableAddress(this.segment(), 0L, value); return this; }

    /// {@return `callableShaderBindingTableSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long callableShaderBindingTableSize(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableSize.get().get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableSize`}
    public long callableShaderBindingTableSize() { return callableShaderBindingTableSize(this.segment(), 0L); }
    /// Sets `callableShaderBindingTableSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void callableShaderBindingTableSize(MemorySegment segment, long index, long value) { VH_callableShaderBindingTableSize.get().set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(long value) { callableShaderBindingTableSize(this.segment(), 0L, value); return this; }

    /// {@return `callableShaderBindingTableStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long callableShaderBindingTableStride(MemorySegment segment, long index) { return (long) VH_callableShaderBindingTableStride.get().get(segment, 0L, index); }
    /// {@return `callableShaderBindingTableStride`}
    public long callableShaderBindingTableStride() { return callableShaderBindingTableStride(this.segment(), 0L); }
    /// Sets `callableShaderBindingTableStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void callableShaderBindingTableStride(MemorySegment segment, long index, long value) { VH_callableShaderBindingTableStride.get().set(segment, 0L, index, value); }
    /// Sets `callableShaderBindingTableStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(long value) { callableShaderBindingTableStride(this.segment(), 0L, value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get().get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.get().set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get().get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.get().set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depth(MemorySegment segment, long index) { return (int) VH_depth.get().get(segment, 0L, index); }
    /// {@return `depth`}
    public int depth() { return depth(this.segment(), 0L); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depth(MemorySegment segment, long index, int value) { VH_depth.get().set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR depth(int value) { depth(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTraceRaysIndirectCommand2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTraceRaysIndirectCommand2KHR`
    public VkTraceRaysIndirectCommand2KHR asSlice(long index) { return new VkTraceRaysIndirectCommand2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTraceRaysIndirectCommand2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTraceRaysIndirectCommand2KHR`
    public VkTraceRaysIndirectCommand2KHR asSlice(long index, long count) { return new VkTraceRaysIndirectCommand2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTraceRaysIndirectCommand2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR at(long index, Consumer<VkTraceRaysIndirectCommand2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `raygenShaderRecordAddress` at the given index}
    /// @param index the index of the struct buffer
    public long raygenShaderRecordAddressAt(long index) { return raygenShaderRecordAddress(this.segment(), index); }
    /// Sets `raygenShaderRecordAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddressAt(long index, long value) { raygenShaderRecordAddress(this.segment(), index, value); return this; }

    /// {@return `raygenShaderRecordSize` at the given index}
    /// @param index the index of the struct buffer
    public long raygenShaderRecordSizeAt(long index) { return raygenShaderRecordSize(this.segment(), index); }
    /// Sets `raygenShaderRecordSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSizeAt(long index, long value) { raygenShaderRecordSize(this.segment(), index, value); return this; }

    /// {@return `missShaderBindingTableAddress` at the given index}
    /// @param index the index of the struct buffer
    public long missShaderBindingTableAddressAt(long index) { return missShaderBindingTableAddress(this.segment(), index); }
    /// Sets `missShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddressAt(long index, long value) { missShaderBindingTableAddress(this.segment(), index, value); return this; }

    /// {@return `missShaderBindingTableSize` at the given index}
    /// @param index the index of the struct buffer
    public long missShaderBindingTableSizeAt(long index) { return missShaderBindingTableSize(this.segment(), index); }
    /// Sets `missShaderBindingTableSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSizeAt(long index, long value) { missShaderBindingTableSize(this.segment(), index, value); return this; }

    /// {@return `missShaderBindingTableStride` at the given index}
    /// @param index the index of the struct buffer
    public long missShaderBindingTableStrideAt(long index) { return missShaderBindingTableStride(this.segment(), index); }
    /// Sets `missShaderBindingTableStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStrideAt(long index, long value) { missShaderBindingTableStride(this.segment(), index, value); return this; }

    /// {@return `hitShaderBindingTableAddress` at the given index}
    /// @param index the index of the struct buffer
    public long hitShaderBindingTableAddressAt(long index) { return hitShaderBindingTableAddress(this.segment(), index); }
    /// Sets `hitShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddressAt(long index, long value) { hitShaderBindingTableAddress(this.segment(), index, value); return this; }

    /// {@return `hitShaderBindingTableSize` at the given index}
    /// @param index the index of the struct buffer
    public long hitShaderBindingTableSizeAt(long index) { return hitShaderBindingTableSize(this.segment(), index); }
    /// Sets `hitShaderBindingTableSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSizeAt(long index, long value) { hitShaderBindingTableSize(this.segment(), index, value); return this; }

    /// {@return `hitShaderBindingTableStride` at the given index}
    /// @param index the index of the struct buffer
    public long hitShaderBindingTableStrideAt(long index) { return hitShaderBindingTableStride(this.segment(), index); }
    /// Sets `hitShaderBindingTableStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStrideAt(long index, long value) { hitShaderBindingTableStride(this.segment(), index, value); return this; }

    /// {@return `callableShaderBindingTableAddress` at the given index}
    /// @param index the index of the struct buffer
    public long callableShaderBindingTableAddressAt(long index) { return callableShaderBindingTableAddress(this.segment(), index); }
    /// Sets `callableShaderBindingTableAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddressAt(long index, long value) { callableShaderBindingTableAddress(this.segment(), index, value); return this; }

    /// {@return `callableShaderBindingTableSize` at the given index}
    /// @param index the index of the struct buffer
    public long callableShaderBindingTableSizeAt(long index) { return callableShaderBindingTableSize(this.segment(), index); }
    /// Sets `callableShaderBindingTableSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSizeAt(long index, long value) { callableShaderBindingTableSize(this.segment(), index, value); return this; }

    /// {@return `callableShaderBindingTableStride` at the given index}
    /// @param index the index of the struct buffer
    public long callableShaderBindingTableStrideAt(long index) { return callableShaderBindingTableStride(this.segment(), index); }
    /// Sets `callableShaderBindingTableStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStrideAt(long index, long value) { callableShaderBindingTableStride(this.segment(), index, value); return this; }

    /// {@return `width` at the given index}
    /// @param index the index of the struct buffer
    public int widthAt(long index) { return width(this.segment(), index); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR widthAt(long index, int value) { width(this.segment(), index, value); return this; }

    /// {@return `height` at the given index}
    /// @param index the index of the struct buffer
    public int heightAt(long index) { return height(this.segment(), index); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR heightAt(long index, int value) { height(this.segment(), index, value); return this; }

    /// {@return `depth` at the given index}
    /// @param index the index of the struct buffer
    public int depthAt(long index) { return depth(this.segment(), index); }
    /// Sets `depth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommand2KHR depthAt(long index, int value) { depth(this.segment(), index, value); return this; }

}
