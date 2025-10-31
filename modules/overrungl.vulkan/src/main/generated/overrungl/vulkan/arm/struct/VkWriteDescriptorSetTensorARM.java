// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSetTensorARM`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetTensorARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t tensorViewCount;
///     const VkTensorViewARM* pTensorViews;
/// };
/// ```
public final class VkWriteDescriptorSetTensorARM extends GroupType {
    /// The struct layout of `VkWriteDescriptorSetTensorARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorViewCount"),
        ValueLayout.ADDRESS.withName("pTensorViews")
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
    /// The byte offset of `tensorViewCount`.
    public static final long OFFSET_tensorViewCount = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCount"));
    /// The memory layout of `tensorViewCount`.
    public static final MemoryLayout LAYOUT_tensorViewCount = LAYOUT.select(PathElement.groupElement("tensorViewCount"));
    /// The [VarHandle] of `tensorViewCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensorViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorViewCount"));
    /// The byte offset of `pTensorViews`.
    public static final long OFFSET_pTensorViews = LAYOUT.byteOffset(PathElement.groupElement("pTensorViews"));
    /// The memory layout of `pTensorViews`.
    public static final MemoryLayout LAYOUT_pTensorViews = LAYOUT.select(PathElement.groupElement("pTensorViews"));
    /// The [VarHandle] of `pTensorViews` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTensorViews = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTensorViews"));

    /// Creates `VkWriteDescriptorSetTensorARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWriteDescriptorSetTensorARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWriteDescriptorSetTensorARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetTensorARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSetTensorARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetTensorARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWriteDescriptorSetTensorARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetTensorARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWriteDescriptorSetTensorARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetTensorARM`
    public static VkWriteDescriptorSetTensorARM alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetTensorARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWriteDescriptorSetTensorARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetTensorARM`
    public static VkWriteDescriptorSetTensorARM alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetTensorARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSetTensorARM copyFrom(VkWriteDescriptorSetTensorARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWriteDescriptorSetTensorARM reinterpret(long count) { return new VkWriteDescriptorSetTensorARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWriteDescriptorSetTensorARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSetTensorARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tensorViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tensorViewCount(MemorySegment segment, long index) { return (int) VH_tensorViewCount.get(segment, 0L, index); }
    /// {@return `tensorViewCount`}
    public int tensorViewCount() { return tensorViewCount(this.segment(), 0L); }
    /// Sets `tensorViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorViewCount(MemorySegment segment, long index, int value) { VH_tensorViewCount.set(segment, 0L, index, value); }
    /// Sets `tensorViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM tensorViewCount(int value) { tensorViewCount(this.segment(), 0L, value); return this; }

    /// {@return `pTensorViews` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTensorViews(MemorySegment segment, long index) { return (MemorySegment) VH_pTensorViews.get(segment, 0L, index); }
    /// {@return `pTensorViews`}
    public MemorySegment pTensorViews() { return pTensorViews(this.segment(), 0L); }
    /// Sets `pTensorViews` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTensorViews(MemorySegment segment, long index, MemorySegment value) { VH_pTensorViews.set(segment, 0L, index, value); }
    /// Sets `pTensorViews` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM pTensorViews(MemorySegment value) { pTensorViews(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWriteDescriptorSetTensorARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteDescriptorSetTensorARM`
    public VkWriteDescriptorSetTensorARM asSlice(long index) { return new VkWriteDescriptorSetTensorARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWriteDescriptorSetTensorARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteDescriptorSetTensorARM`
    public VkWriteDescriptorSetTensorARM asSlice(long index, long count) { return new VkWriteDescriptorSetTensorARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWriteDescriptorSetTensorARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWriteDescriptorSetTensorARM at(long index, Consumer<VkWriteDescriptorSetTensorARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tensorViewCount` at the given index}
    /// @param index the index of the struct buffer
    public int tensorViewCountAt(long index) { return tensorViewCount(this.segment(), index); }
    /// Sets `tensorViewCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM tensorViewCountAt(long index, int value) { tensorViewCount(this.segment(), index, value); return this; }

    /// {@return `pTensorViews` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTensorViewsAt(long index) { return pTensorViews(this.segment(), index); }
    /// Sets `pTensorViews` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetTensorARM pTensorViewsAt(long index, MemorySegment value) { pTensorViews(this.segment(), index, value); return this; }

}
