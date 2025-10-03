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

/// Represents `VkSamplerYcbcrConversionImageFormatProperties`.
/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionImageFormatProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t combinedImageSamplerDescriptorCount;
/// };
/// ```
public final class VkSamplerYcbcrConversionImageFormatProperties extends GroupType {
    /// The struct layout of `VkSamplerYcbcrConversionImageFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorCount")
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
    /// The byte offset of `combinedImageSamplerDescriptorCount`.
    public static final long OFFSET_combinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    /// The memory layout of `combinedImageSamplerDescriptorCount`.
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_combinedImageSamplerDescriptorCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorCount")));

    /// Creates `VkSamplerYcbcrConversionImageFormatProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerYcbcrConversionImageFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerYcbcrConversionImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerYcbcrConversionImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerYcbcrConversionImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerYcbcrConversionImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionImageFormatProperties`
    public static VkSamplerYcbcrConversionImageFormatProperties alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionImageFormatProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerYcbcrConversionImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionImageFormatProperties`
    public static VkSamplerYcbcrConversionImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionImageFormatProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties copyFrom(VkSamplerYcbcrConversionImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerYcbcrConversionImageFormatProperties reinterpret(long count) { return new VkSamplerYcbcrConversionImageFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerYcbcrConversionImageFormatProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerYcbcrConversionImageFormatProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `combinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int combinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_combinedImageSamplerDescriptorCount.get().get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDescriptorCount`}
    public int combinedImageSamplerDescriptorCount() { return combinedImageSamplerDescriptorCount(this.segment(), 0L); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void combinedImageSamplerDescriptorCount(MemorySegment segment, long index, int value) { VH_combinedImageSamplerDescriptorCount.get().set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties combinedImageSamplerDescriptorCount(int value) { combinedImageSamplerDescriptorCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerYcbcrConversionImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerYcbcrConversionImageFormatProperties`
    public VkSamplerYcbcrConversionImageFormatProperties asSlice(long index) { return new VkSamplerYcbcrConversionImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerYcbcrConversionImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerYcbcrConversionImageFormatProperties`
    public VkSamplerYcbcrConversionImageFormatProperties asSlice(long index, long count) { return new VkSamplerYcbcrConversionImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerYcbcrConversionImageFormatProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties at(long index, Consumer<VkSamplerYcbcrConversionImageFormatProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `combinedImageSamplerDescriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int combinedImageSamplerDescriptorCountAt(long index) { return combinedImageSamplerDescriptorCount(this.segment(), index); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatProperties combinedImageSamplerDescriptorCountAt(long index, int value) { combinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }

}
