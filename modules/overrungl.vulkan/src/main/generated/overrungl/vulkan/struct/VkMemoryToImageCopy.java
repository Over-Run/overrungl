// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryToImageCopy`.
/// ## Layout
/// ```
/// struct VkMemoryToImageCopy {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const void* pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers imageSubresource;
///     (struct VkOffset3D) VkOffset3D imageOffset;
///     (struct VkExtent3D) VkExtent3D imageExtent;
/// };
/// ```
public final class VkMemoryToImageCopy extends GroupType {
    /// The struct layout of `VkMemoryToImageCopy`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
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
    /// The byte offset of `pHostPointer`.
    public static final long OFFSET_pHostPointer = LAYOUT.byteOffset(PathElement.groupElement("pHostPointer"));
    /// The memory layout of `pHostPointer`.
    public static final MemoryLayout LAYOUT_pHostPointer = LAYOUT.select(PathElement.groupElement("pHostPointer"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));
    /// The byte offset of `memoryRowLength`.
    public static final long OFFSET_memoryRowLength = LAYOUT.byteOffset(PathElement.groupElement("memoryRowLength"));
    /// The memory layout of `memoryRowLength`.
    public static final MemoryLayout LAYOUT_memoryRowLength = LAYOUT.select(PathElement.groupElement("memoryRowLength"));
    /// The [VarHandle] of `memoryRowLength` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRowLength"));
    /// The byte offset of `memoryImageHeight`.
    public static final long OFFSET_memoryImageHeight = LAYOUT.byteOffset(PathElement.groupElement("memoryImageHeight"));
    /// The memory layout of `memoryImageHeight`.
    public static final MemoryLayout LAYOUT_memoryImageHeight = LAYOUT.select(PathElement.groupElement("memoryImageHeight"));
    /// The [VarHandle] of `memoryImageHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryImageHeight"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkMemoryToImageCopy` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryToImageCopy(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryToImageCopy of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryToImageCopy(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryToImageCopy ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryToImageCopy(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryToImageCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryToImageCopy ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryToImageCopy(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryToImageCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryToImageCopy`
    public static VkMemoryToImageCopy alloc(SegmentAllocator allocator) { return new VkMemoryToImageCopy(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryToImageCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryToImageCopy`
    public static VkMemoryToImageCopy alloc(SegmentAllocator allocator, long count) { return new VkMemoryToImageCopy(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryToImageCopy copyFrom(VkMemoryToImageCopy src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryToImageCopy reinterpret(long count) { return new VkMemoryToImageCopy(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryToImageCopy sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryToImageCopy pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHostPointer(MemorySegment segment, long index) { return (MemorySegment) VH_pHostPointer.get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    public MemorySegment pHostPointer() { return pHostPointer(this.segment(), 0L); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHostPointer(MemorySegment segment, long index, MemorySegment value) { VH_pHostPointer.set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy pHostPointer(MemorySegment value) { pHostPointer(this.segment(), 0L, value); return this; }

    /// {@return `memoryRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryRowLength(MemorySegment segment, long index) { return (int) VH_memoryRowLength.get(segment, 0L, index); }
    /// {@return `memoryRowLength`}
    public int memoryRowLength() { return memoryRowLength(this.segment(), 0L); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryRowLength(MemorySegment segment, long index, int value) { VH_memoryRowLength.set(segment, 0L, index, value); }
    /// Sets `memoryRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryRowLength(int value) { memoryRowLength(this.segment(), 0L, value); return this; }

    /// {@return `memoryImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryImageHeight(MemorySegment segment, long index) { return (int) VH_memoryImageHeight.get(segment, 0L, index); }
    /// {@return `memoryImageHeight`}
    public int memoryImageHeight() { return memoryImageHeight(this.segment(), 0L); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryImageHeight(MemorySegment segment, long index, int value) { VH_memoryImageHeight.set(segment, 0L, index, value); }
    /// Sets `memoryImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryImageHeight(int value) { memoryImageHeight(this.segment(), 0L, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    /// {@return `imageSubresource`}
    public MemorySegment imageSubresource() { return imageSubresource(this.segment(), 0L); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageSubresource(MemorySegment value) { imageSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresource())); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    /// {@return `imageOffset`}
    public MemorySegment imageOffset() { return imageOffset(this.segment(), 0L); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageOffset(MemorySegment value) { imageOffset(this.segment(), 0L, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageOffset(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffset())); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageExtent(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtent())); return this; }

    /// Creates a slice of `VkMemoryToImageCopy`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryToImageCopy`
    public VkMemoryToImageCopy asSlice(long index) { return new VkMemoryToImageCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryToImageCopy`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryToImageCopy`
    public VkMemoryToImageCopy asSlice(long index, long count) { return new VkMemoryToImageCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryToImageCopy` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryToImageCopy at(long index, Consumer<VkMemoryToImageCopy> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHostPointerAt(long index) { return pHostPointer(this.segment(), index); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy pHostPointerAt(long index, MemorySegment value) { pHostPointer(this.segment(), index, value); return this; }

    /// {@return `memoryRowLength` at the given index}
    /// @param index the index of the struct buffer
    public int memoryRowLengthAt(long index) { return memoryRowLength(this.segment(), index); }
    /// Sets `memoryRowLength` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryRowLengthAt(long index, int value) { memoryRowLength(this.segment(), index, value); return this; }

    /// {@return `memoryImageHeight` at the given index}
    /// @param index the index of the struct buffer
    public int memoryImageHeightAt(long index) { return memoryImageHeight(this.segment(), index); }
    /// Sets `memoryImageHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy memoryImageHeightAt(long index, int value) { memoryImageHeight(this.segment(), index, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageSubresourceAt(long index) { return imageSubresource(this.segment(), index); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageSubresourceAt(long index, MemorySegment value) { imageSubresource(this.segment(), index, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresourceAt(index))); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageOffsetAt(long index) { return imageOffset(this.segment(), index); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageOffsetAt(long index, MemorySegment value) { imageOffset(this.segment(), index, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageOffsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffsetAt(index))); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryToImageCopy imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMemoryToImageCopy imageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtentAt(index))); return this; }

}
