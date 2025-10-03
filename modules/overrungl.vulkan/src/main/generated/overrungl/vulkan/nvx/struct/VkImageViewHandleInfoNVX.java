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

/// Represents `VkImageViewHandleInfoNVX`.
/// ## Layout
/// ```
/// struct VkImageViewHandleInfoNVX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView imageView;
///     (int) VkDescriptorType descriptorType;
///     (uint64_t) VkSampler sampler;
/// };
/// ```
public final class VkImageViewHandleInfoNVX extends GroupType {
    /// The struct layout of `VkImageViewHandleInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_LONG.withName("sampler")
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
    /// The byte offset of `imageView`.
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    /// The memory layout of `imageView`.
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_imageView = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView")));
    /// The byte offset of `descriptorType`.
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    /// The memory layout of `descriptorType`.
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_descriptorType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType")));
    /// The byte offset of `sampler`.
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    /// The memory layout of `sampler`.
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampler = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler")));

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageViewHandleInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewHandleInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewHandleInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewHandleInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageViewHandleInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewHandleInfoNVX`
    public static VkImageViewHandleInfoNVX alloc(SegmentAllocator allocator) { return new VkImageViewHandleInfoNVX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageViewHandleInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewHandleInfoNVX`
    public static VkImageViewHandleInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkImageViewHandleInfoNVX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewHandleInfoNVX copyFrom(VkImageViewHandleInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageViewHandleInfoNVX reinterpret(long count) { return new VkImageViewHandleInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageViewHandleInfoNVX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageViewHandleInfoNVX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageView(MemorySegment segment, long index) { return (long) VH_imageView.get().get(segment, 0L, index); }
    /// {@return `imageView`}
    public long imageView() { return imageView(this.segment(), 0L); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageView(MemorySegment segment, long index, long value) { VH_imageView.get().set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX imageView(long value) { imageView(this.segment(), 0L, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get().get(segment, 0L, index); }
    /// {@return `descriptorType`}
    public int descriptorType() { return descriptorType(this.segment(), 0L); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorType(MemorySegment segment, long index, int value) { VH_descriptorType.get().set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX descriptorType(int value) { descriptorType(this.segment(), 0L, value); return this; }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sampler(MemorySegment segment, long index) { return (long) VH_sampler.get().get(segment, 0L, index); }
    /// {@return `sampler`}
    public long sampler() { return sampler(this.segment(), 0L); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampler(MemorySegment segment, long index, long value) { VH_sampler.get().set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX sampler(long value) { sampler(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageViewHandleInfoNVX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageViewHandleInfoNVX`
    public VkImageViewHandleInfoNVX asSlice(long index) { return new VkImageViewHandleInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageViewHandleInfoNVX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageViewHandleInfoNVX`
    public VkImageViewHandleInfoNVX asSlice(long index, long count) { return new VkImageViewHandleInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageViewHandleInfoNVX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageViewHandleInfoNVX at(long index, Consumer<VkImageViewHandleInfoNVX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewAt(long index) { return imageView(this.segment(), index); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorTypeAt(long index) { return descriptorType(this.segment(), index); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX descriptorTypeAt(long index, int value) { descriptorType(this.segment(), index, value); return this; }

    /// {@return `sampler` at the given index}
    /// @param index the index of the struct buffer
    public long samplerAt(long index) { return sampler(this.segment(), index); }
    /// Sets `sampler` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX samplerAt(long index, long value) { sampler(this.segment(), index, value); return this; }

}
