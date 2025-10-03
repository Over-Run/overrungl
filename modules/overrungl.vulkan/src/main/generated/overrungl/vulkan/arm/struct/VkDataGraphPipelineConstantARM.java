// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineConstantARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineConstantARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t id;
///     const void* pConstantData;
/// };
/// ```
public final class VkDataGraphPipelineConstantARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineConstantARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.ADDRESS.withName("pConstantData")
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
    /// The byte offset of `id`.
    public static final long OFFSET_id = LAYOUT.byteOffset(PathElement.groupElement("id"));
    /// The memory layout of `id`.
    public static final MemoryLayout LAYOUT_id = LAYOUT.select(PathElement.groupElement("id"));
    /// The [VarHandle] of `id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_id = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("id")));
    /// The byte offset of `pConstantData`.
    public static final long OFFSET_pConstantData = LAYOUT.byteOffset(PathElement.groupElement("pConstantData"));
    /// The memory layout of `pConstantData`.
    public static final MemoryLayout LAYOUT_pConstantData = LAYOUT.select(PathElement.groupElement("pConstantData"));
    /// The [VarHandle] of `pConstantData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pConstantData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pConstantData")));

    /// Creates `VkDataGraphPipelineConstantARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineConstantARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineConstantARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineConstantARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineConstantARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineConstantARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineConstantARM`
    public static VkDataGraphPipelineConstantARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineConstantARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineConstantARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineConstantARM`
    public static VkDataGraphPipelineConstantARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineConstantARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineConstantARM copyFrom(VkDataGraphPipelineConstantARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineConstantARM reinterpret(long count) { return new VkDataGraphPipelineConstantARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineConstantARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineConstantARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int id(MemorySegment segment, long index) { return (int) VH_id.get().get(segment, 0L, index); }
    /// {@return `id`}
    public int id() { return id(this.segment(), 0L); }
    /// Sets `id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void id(MemorySegment segment, long index, int value) { VH_id.get().set(segment, 0L, index, value); }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM id(int value) { id(this.segment(), 0L, value); return this; }

    /// {@return `pConstantData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pConstantData(MemorySegment segment, long index) { return (MemorySegment) VH_pConstantData.get().get(segment, 0L, index); }
    /// {@return `pConstantData`}
    public MemorySegment pConstantData() { return pConstantData(this.segment(), 0L); }
    /// Sets `pConstantData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pConstantData(MemorySegment segment, long index, MemorySegment value) { VH_pConstantData.get().set(segment, 0L, index, value); }
    /// Sets `pConstantData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM pConstantData(MemorySegment value) { pConstantData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineConstantARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineConstantARM`
    public VkDataGraphPipelineConstantARM asSlice(long index) { return new VkDataGraphPipelineConstantARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineConstantARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineConstantARM`
    public VkDataGraphPipelineConstantARM asSlice(long index, long count) { return new VkDataGraphPipelineConstantARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineConstantARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineConstantARM at(long index, Consumer<VkDataGraphPipelineConstantARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `id` at the given index}
    /// @param index the index of the struct buffer
    public int idAt(long index) { return id(this.segment(), index); }
    /// Sets `id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM idAt(long index, int value) { id(this.segment(), index, value); return this; }

    /// {@return `pConstantData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pConstantDataAt(long index) { return pConstantData(this.segment(), index); }
    /// Sets `pConstantData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantARM pConstantDataAt(long index, MemorySegment value) { pConstantData(this.segment(), index, value); return this; }

}
