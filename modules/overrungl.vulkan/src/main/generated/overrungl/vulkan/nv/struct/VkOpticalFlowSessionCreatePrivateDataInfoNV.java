// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t id;
///     uint32_t size;
///     const void* pPrivateData;
/// };
/// ```
public final class VkOpticalFlowSessionCreatePrivateDataInfoNV extends GroupType {
    /// The struct layout of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
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
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));
    /// The byte offset of `pPrivateData`.
    public static final long OFFSET_pPrivateData = LAYOUT.byteOffset(PathElement.groupElement("pPrivateData"));
    /// The memory layout of `pPrivateData`.
    public static final MemoryLayout LAYOUT_pPrivateData = LAYOUT.select(PathElement.groupElement("pPrivateData"));
    /// The [VarHandle] of `pPrivateData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pPrivateData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPrivateData")));

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV copyFrom(VkOpticalFlowSessionCreatePrivateDataInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkOpticalFlowSessionCreatePrivateDataInfoNV reinterpret(long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(int value) { id(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get().get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.get().set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pPrivateData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPrivateData(MemorySegment segment, long index) { return (MemorySegment) VH_pPrivateData.get().get(segment, 0L, index); }
    /// {@return `pPrivateData`}
    public MemorySegment pPrivateData() { return pPrivateData(this.segment(), 0L); }
    /// Sets `pPrivateData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPrivateData(MemorySegment segment, long index, MemorySegment value) { VH_pPrivateData.get().set(segment, 0L, index, value); }
    /// Sets `pPrivateData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(MemorySegment value) { pPrivateData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index, long count) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkOpticalFlowSessionCreatePrivateDataInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV at(long index, Consumer<VkOpticalFlowSessionCreatePrivateDataInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `id` at the given index}
    /// @param index the index of the struct buffer
    public int idAt(long index) { return id(this.segment(), index); }
    /// Sets `id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV idAt(long index, int value) { id(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public int sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

    /// {@return `pPrivateData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPrivateDataAt(long index) { return pPrivateData(this.segment(), index); }
    /// Sets `pPrivateData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateDataAt(long index, MemorySegment value) { pPrivateData(this.segment(), index, value); return this; }

}
