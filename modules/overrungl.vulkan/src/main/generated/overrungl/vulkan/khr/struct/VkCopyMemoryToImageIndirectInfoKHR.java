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

/// Represents `VkCopyMemoryToImageIndirectInfoKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToImageIndirectInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkAddressCopyFlagsKHR srcCopyFlags;
///     uint32_t copyCount;
///     (struct VkStridedDeviceAddressRangeKHR) VkStridedDeviceAddressRangeKHR copyAddressRange;
///     (uint64_t) VkImage dstImage;
///     (int) VkImageLayout dstImageLayout;
///     const VkImageSubresourceLayers* pImageSubresources;
/// };
/// ```
public final class VkCopyMemoryToImageIndirectInfoKHR extends GroupType {
    /// The struct layout of `VkCopyMemoryToImageIndirectInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcCopyFlags"),
        ValueLayout.JAVA_INT.withName("copyCount"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR.LAYOUT.withName("copyAddressRange"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.ADDRESS.withName("pImageSubresources")
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
    /// The byte offset of `srcCopyFlags`.
    public static final long OFFSET_srcCopyFlags = LAYOUT.byteOffset(PathElement.groupElement("srcCopyFlags"));
    /// The memory layout of `srcCopyFlags`.
    public static final MemoryLayout LAYOUT_srcCopyFlags = LAYOUT.select(PathElement.groupElement("srcCopyFlags"));
    /// The [VarHandle] of `srcCopyFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcCopyFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcCopyFlags")));
    /// The byte offset of `copyCount`.
    public static final long OFFSET_copyCount = LAYOUT.byteOffset(PathElement.groupElement("copyCount"));
    /// The memory layout of `copyCount`.
    public static final MemoryLayout LAYOUT_copyCount = LAYOUT.select(PathElement.groupElement("copyCount"));
    /// The [VarHandle] of `copyCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_copyCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyCount")));
    /// The byte offset of `copyAddressRange`.
    public static final long OFFSET_copyAddressRange = LAYOUT.byteOffset(PathElement.groupElement("copyAddressRange"));
    /// The memory layout of `copyAddressRange`.
    public static final MemoryLayout LAYOUT_copyAddressRange = LAYOUT.select(PathElement.groupElement("copyAddressRange"));
    /// The byte offset of `dstImage`.
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    /// The memory layout of `dstImage`.
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstImage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage")));
    /// The byte offset of `dstImageLayout`.
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    /// The memory layout of `dstImageLayout`.
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstImageLayout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout")));
    /// The byte offset of `pImageSubresources`.
    public static final long OFFSET_pImageSubresources = LAYOUT.byteOffset(PathElement.groupElement("pImageSubresources"));
    /// The memory layout of `pImageSubresources`.
    public static final MemoryLayout LAYOUT_pImageSubresources = LAYOUT.select(PathElement.groupElement("pImageSubresources"));
    /// The [VarHandle] of `pImageSubresources` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pImageSubresources = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageSubresources")));

    /// Creates `VkCopyMemoryToImageIndirectInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyMemoryToImageIndirectInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyMemoryToImageIndirectInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryToImageIndirectInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyMemoryToImageIndirectInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMemoryToImageIndirectInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToImageIndirectInfoKHR`
    public static VkCopyMemoryToImageIndirectInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryToImageIndirectInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyMemoryToImageIndirectInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryToImageIndirectInfoKHR`
    public static VkCopyMemoryToImageIndirectInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToImageIndirectInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyFrom(VkCopyMemoryToImageIndirectInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyMemoryToImageIndirectInfoKHR reinterpret(long count) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyMemoryToImageIndirectInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyMemoryToImageIndirectInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcCopyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcCopyFlags(MemorySegment segment, long index) { return (int) VH_srcCopyFlags.get().get(segment, 0L, index); }
    /// {@return `srcCopyFlags`}
    public int srcCopyFlags() { return srcCopyFlags(this.segment(), 0L); }
    /// Sets `srcCopyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcCopyFlags(MemorySegment segment, long index, int value) { VH_srcCopyFlags.get().set(segment, 0L, index, value); }
    /// Sets `srcCopyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlags(int value) { srcCopyFlags(this.segment(), 0L, value); return this; }

    /// {@return `copyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int copyCount(MemorySegment segment, long index) { return (int) VH_copyCount.get().get(segment, 0L, index); }
    /// {@return `copyCount`}
    public int copyCount() { return copyCount(this.segment(), 0L); }
    /// Sets `copyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copyCount(MemorySegment segment, long index, int value) { VH_copyCount.get().set(segment, 0L, index, value); }
    /// Sets `copyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyCount(int value) { copyCount(this.segment(), 0L, value); return this; }

    /// {@return `copyAddressRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment copyAddressRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_copyAddressRange, index), LAYOUT_copyAddressRange); }
    /// {@return `copyAddressRange`}
    public MemorySegment copyAddressRange() { return copyAddressRange(this.segment(), 0L); }
    /// Sets `copyAddressRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copyAddressRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_copyAddressRange, index), LAYOUT_copyAddressRange.byteSize()); }
    /// Sets `copyAddressRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(MemorySegment value) { copyAddressRange(this.segment(), 0L, value); return this; }
    /// Accepts `copyAddressRange` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(Consumer<overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR.of(copyAddressRange())); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstImage(MemorySegment segment, long index) { return (long) VH_dstImage.get().get(segment, 0L, index); }
    /// {@return `dstImage`}
    public long dstImage() { return dstImage(this.segment(), 0L); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImage(MemorySegment segment, long index, long value) { VH_dstImage.get().set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR dstImage(long value) { dstImage(this.segment(), 0L, value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get().get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    public int dstImageLayout() { return dstImageLayout(this.segment(), 0L); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImageLayout(MemorySegment segment, long index, int value) { VH_dstImageLayout.get().set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayout(int value) { dstImageLayout(this.segment(), 0L, value); return this; }

    /// {@return `pImageSubresources` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageSubresources(MemorySegment segment, long index) { return (MemorySegment) VH_pImageSubresources.get().get(segment, 0L, index); }
    /// {@return `pImageSubresources`}
    public MemorySegment pImageSubresources() { return pImageSubresources(this.segment(), 0L); }
    /// Sets `pImageSubresources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageSubresources(MemorySegment segment, long index, MemorySegment value) { VH_pImageSubresources.get().set(segment, 0L, index, value); }
    /// Sets `pImageSubresources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresources(MemorySegment value) { pImageSubresources(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyMemoryToImageIndirectInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMemoryToImageIndirectInfoKHR`
    public VkCopyMemoryToImageIndirectInfoKHR asSlice(long index) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyMemoryToImageIndirectInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMemoryToImageIndirectInfoKHR`
    public VkCopyMemoryToImageIndirectInfoKHR asSlice(long index, long count) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyMemoryToImageIndirectInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR at(long index, Consumer<VkCopyMemoryToImageIndirectInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcCopyFlags` at the given index}
    /// @param index the index of the struct buffer
    public int srcCopyFlagsAt(long index) { return srcCopyFlags(this.segment(), index); }
    /// Sets `srcCopyFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlagsAt(long index, int value) { srcCopyFlags(this.segment(), index, value); return this; }

    /// {@return `copyCount` at the given index}
    /// @param index the index of the struct buffer
    public int copyCountAt(long index) { return copyCount(this.segment(), index); }
    /// Sets `copyCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyCountAt(long index, int value) { copyCount(this.segment(), index, value); return this; }

    /// {@return `copyAddressRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment copyAddressRangeAt(long index) { return copyAddressRange(this.segment(), index); }
    /// Sets `copyAddressRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRangeAt(long index, MemorySegment value) { copyAddressRange(this.segment(), index, value); return this; }
    /// Accepts `copyAddressRange` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRangeAt(long index, Consumer<overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR.of(copyAddressRangeAt(index))); return this; }

    /// {@return `dstImage` at the given index}
    /// @param index the index of the struct buffer
    public long dstImageAt(long index) { return dstImage(this.segment(), index); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR dstImageAt(long index, long value) { dstImage(this.segment(), index, value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int dstImageLayoutAt(long index) { return dstImageLayout(this.segment(), index); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayoutAt(long index, int value) { dstImageLayout(this.segment(), index, value); return this; }

    /// {@return `pImageSubresources` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImageSubresourcesAt(long index) { return pImageSubresources(this.segment(), index); }
    /// Sets `pImageSubresources` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresourcesAt(long index, MemorySegment value) { pImageSubresources(this.segment(), index, value); return this; }

}
