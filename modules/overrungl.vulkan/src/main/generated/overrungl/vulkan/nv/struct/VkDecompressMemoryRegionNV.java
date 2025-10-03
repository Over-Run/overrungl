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

/// Represents `VkDecompressMemoryRegionNV`.
/// ## Layout
/// ```
/// struct VkDecompressMemoryRegionNV {
///     (uint64_t) VkDeviceAddress srcAddress;
///     (uint64_t) VkDeviceAddress dstAddress;
///     (uint64_t) VkDeviceSize compressedSize;
///     (uint64_t) VkDeviceSize decompressedSize;
///     ((uint64_t) VkFlags64) VkMemoryDecompressionMethodFlagsNV decompressionMethod;
/// };
/// ```
public final class VkDecompressMemoryRegionNV extends GroupType {
    /// The struct layout of `VkDecompressMemoryRegionNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod")
    );
    /// The byte offset of `srcAddress`.
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    /// The memory layout of `srcAddress`.
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress")));
    /// The byte offset of `dstAddress`.
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    /// The memory layout of `dstAddress`.
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    /// The [VarHandle] of `dstAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress")));
    /// The byte offset of `compressedSize`.
    public static final long OFFSET_compressedSize = LAYOUT.byteOffset(PathElement.groupElement("compressedSize"));
    /// The memory layout of `compressedSize`.
    public static final MemoryLayout LAYOUT_compressedSize = LAYOUT.select(PathElement.groupElement("compressedSize"));
    /// The [VarHandle] of `compressedSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_compressedSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedSize")));
    /// The byte offset of `decompressedSize`.
    public static final long OFFSET_decompressedSize = LAYOUT.byteOffset(PathElement.groupElement("decompressedSize"));
    /// The memory layout of `decompressedSize`.
    public static final MemoryLayout LAYOUT_decompressedSize = LAYOUT.select(PathElement.groupElement("decompressedSize"));
    /// The [VarHandle] of `decompressedSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_decompressedSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressedSize")));
    /// The byte offset of `decompressionMethod`.
    public static final long OFFSET_decompressionMethod = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethod"));
    /// The memory layout of `decompressionMethod`.
    public static final MemoryLayout LAYOUT_decompressionMethod = LAYOUT.select(PathElement.groupElement("decompressionMethod"));
    /// The [VarHandle] of `decompressionMethod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_decompressionMethod = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethod")));

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDecompressMemoryRegionNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDecompressMemoryRegionNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDecompressMemoryRegionNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDecompressMemoryRegionNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDecompressMemoryRegionNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDecompressMemoryRegionNV`
    public static VkDecompressMemoryRegionNV alloc(SegmentAllocator allocator) { return new VkDecompressMemoryRegionNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDecompressMemoryRegionNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDecompressMemoryRegionNV`
    public static VkDecompressMemoryRegionNV alloc(SegmentAllocator allocator, long count) { return new VkDecompressMemoryRegionNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDecompressMemoryRegionNV copyFrom(VkDecompressMemoryRegionNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDecompressMemoryRegionNV reinterpret(long count) { return new VkDecompressMemoryRegionNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get().get(segment, 0L, index); }
    /// {@return `srcAddress`}
    public long srcAddress() { return srcAddress(this.segment(), 0L); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAddress(MemorySegment segment, long index, long value) { VH_srcAddress.get().set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV srcAddress(long value) { srcAddress(this.segment(), 0L, value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAddress(MemorySegment segment, long index) { return (long) VH_dstAddress.get().get(segment, 0L, index); }
    /// {@return `dstAddress`}
    public long dstAddress() { return dstAddress(this.segment(), 0L); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAddress(MemorySegment segment, long index, long value) { VH_dstAddress.get().set(segment, 0L, index, value); }
    /// Sets `dstAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV dstAddress(long value) { dstAddress(this.segment(), 0L, value); return this; }

    /// {@return `compressedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long compressedSize(MemorySegment segment, long index) { return (long) VH_compressedSize.get().get(segment, 0L, index); }
    /// {@return `compressedSize`}
    public long compressedSize() { return compressedSize(this.segment(), 0L); }
    /// Sets `compressedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compressedSize(MemorySegment segment, long index, long value) { VH_compressedSize.get().set(segment, 0L, index, value); }
    /// Sets `compressedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV compressedSize(long value) { compressedSize(this.segment(), 0L, value); return this; }

    /// {@return `decompressedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long decompressedSize(MemorySegment segment, long index) { return (long) VH_decompressedSize.get().get(segment, 0L, index); }
    /// {@return `decompressedSize`}
    public long decompressedSize() { return decompressedSize(this.segment(), 0L); }
    /// Sets `decompressedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void decompressedSize(MemorySegment segment, long index, long value) { VH_decompressedSize.get().set(segment, 0L, index, value); }
    /// Sets `decompressedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressedSize(long value) { decompressedSize(this.segment(), 0L, value); return this; }

    /// {@return `decompressionMethod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long decompressionMethod(MemorySegment segment, long index) { return (long) VH_decompressionMethod.get().get(segment, 0L, index); }
    /// {@return `decompressionMethod`}
    public long decompressionMethod() { return decompressionMethod(this.segment(), 0L); }
    /// Sets `decompressionMethod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void decompressionMethod(MemorySegment segment, long index, long value) { VH_decompressionMethod.get().set(segment, 0L, index, value); }
    /// Sets `decompressionMethod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressionMethod(long value) { decompressionMethod(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDecompressMemoryRegionNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDecompressMemoryRegionNV`
    public VkDecompressMemoryRegionNV asSlice(long index) { return new VkDecompressMemoryRegionNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDecompressMemoryRegionNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDecompressMemoryRegionNV`
    public VkDecompressMemoryRegionNV asSlice(long index, long count) { return new VkDecompressMemoryRegionNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDecompressMemoryRegionNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDecompressMemoryRegionNV at(long index, Consumer<VkDecompressMemoryRegionNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcAddress` at the given index}
    /// @param index the index of the struct buffer
    public long srcAddressAt(long index) { return srcAddress(this.segment(), index); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV srcAddressAt(long index, long value) { srcAddress(this.segment(), index, value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param index the index of the struct buffer
    public long dstAddressAt(long index) { return dstAddress(this.segment(), index); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV dstAddressAt(long index, long value) { dstAddress(this.segment(), index, value); return this; }

    /// {@return `compressedSize` at the given index}
    /// @param index the index of the struct buffer
    public long compressedSizeAt(long index) { return compressedSize(this.segment(), index); }
    /// Sets `compressedSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV compressedSizeAt(long index, long value) { compressedSize(this.segment(), index, value); return this; }

    /// {@return `decompressedSize` at the given index}
    /// @param index the index of the struct buffer
    public long decompressedSizeAt(long index) { return decompressedSize(this.segment(), index); }
    /// Sets `decompressedSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressedSizeAt(long index, long value) { decompressedSize(this.segment(), index, value); return this; }

    /// {@return `decompressionMethod` at the given index}
    /// @param index the index of the struct buffer
    public long decompressionMethodAt(long index) { return decompressionMethod(this.segment(), index); }
    /// Sets `decompressionMethod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressionMethodAt(long index, long value) { decompressionMethod(this.segment(), index, value); return this; }

}
