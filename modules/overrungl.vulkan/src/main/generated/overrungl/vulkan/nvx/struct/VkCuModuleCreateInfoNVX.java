// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nvx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCuModuleCreateInfoNVX`.
/// ## Layout
/// ```
/// struct VkCuModuleCreateInfoNVX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     size_t dataSize;
///     const void* pData;
/// };
/// ```
public final class VkCuModuleCreateInfoNVX extends GroupType {
    /// The struct layout of `VkCuModuleCreateInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
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
    /// The byte offset of `dataSize`.
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    /// The memory layout of `dataSize`.
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize")));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData")));

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCuModuleCreateInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleCreateInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleCreateInfoNVX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleCreateInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleCreateInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCuModuleCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleCreateInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleCreateInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCuModuleCreateInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuModuleCreateInfoNVX`
    public static VkCuModuleCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuModuleCreateInfoNVX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCuModuleCreateInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCuModuleCreateInfoNVX`
    public static VkCuModuleCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuModuleCreateInfoNVX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCuModuleCreateInfoNVX copyFrom(VkCuModuleCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCuModuleCreateInfoNVX reinterpret(long count) { return new VkCuModuleCreateInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCuModuleCreateInfoNVX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCuModuleCreateInfoNVX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dataSize.get().get(segment, 0L, index)); }
    /// {@return `dataSize`}
    public long dataSize() { return dataSize(this.segment(), 0L); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataSize(MemorySegment segment, long index, long value) { VH_dataSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX dataSize(long value) { dataSize(this.segment(), 0L, value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get().get(segment, 0L, index); }
    /// {@return `pData`}
    public MemorySegment pData() { return pData(this.segment(), 0L); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pData(MemorySegment segment, long index, MemorySegment value) { VH_pData.get().set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCuModuleCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCuModuleCreateInfoNVX`
    public VkCuModuleCreateInfoNVX asSlice(long index) { return new VkCuModuleCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCuModuleCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCuModuleCreateInfoNVX`
    public VkCuModuleCreateInfoNVX asSlice(long index, long count) { return new VkCuModuleCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCuModuleCreateInfoNVX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCuModuleCreateInfoNVX at(long index, Consumer<VkCuModuleCreateInfoNVX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param index the index of the struct buffer
    public long dataSizeAt(long index) { return dataSize(this.segment(), index); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX dataSizeAt(long index, long value) { dataSize(this.segment(), index, value); return this; }

    /// {@return `pData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleCreateInfoNVX pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

}
