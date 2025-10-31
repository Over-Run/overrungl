// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFramebufferAttachmentsCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkFramebufferAttachmentsCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentImageInfoCount;
///     const VkFramebufferAttachmentImageInfo* pAttachmentImageInfos;
/// };
/// ```
public final class VkFramebufferAttachmentsCreateInfoKHR extends GroupType {
    /// The struct layout of `VkFramebufferAttachmentsCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withName("pAttachmentImageInfos")
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
    /// The byte offset of `attachmentImageInfoCount`.
    public static final long OFFSET_attachmentImageInfoCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentImageInfoCount"));
    /// The memory layout of `attachmentImageInfoCount`.
    public static final MemoryLayout LAYOUT_attachmentImageInfoCount = LAYOUT.select(PathElement.groupElement("attachmentImageInfoCount"));
    /// The [VarHandle] of `attachmentImageInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentImageInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentImageInfoCount"));
    /// The byte offset of `pAttachmentImageInfos`.
    public static final long OFFSET_pAttachmentImageInfos = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentImageInfos"));
    /// The memory layout of `pAttachmentImageInfos`.
    public static final MemoryLayout LAYOUT_pAttachmentImageInfos = LAYOUT.select(PathElement.groupElement("pAttachmentImageInfos"));
    /// The [VarHandle] of `pAttachmentImageInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachmentImageInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentImageInfos"));

    /// Creates `VkFramebufferAttachmentsCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFramebufferAttachmentsCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFramebufferAttachmentsCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFramebufferAttachmentsCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFramebufferAttachmentsCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferAttachmentsCreateInfoKHR`
    public static VkFramebufferAttachmentsCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentsCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferAttachmentsCreateInfoKHR`
    public static VkFramebufferAttachmentsCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkFramebufferAttachmentsCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR copyFrom(VkFramebufferAttachmentsCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFramebufferAttachmentsCreateInfoKHR reinterpret(long count) { return new VkFramebufferAttachmentsCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFramebufferAttachmentsCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFramebufferAttachmentsCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `attachmentImageInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentImageInfoCount(MemorySegment segment, long index) { return (int) VH_attachmentImageInfoCount.get(segment, 0L, index); }
    /// {@return `attachmentImageInfoCount`}
    public int attachmentImageInfoCount() { return attachmentImageInfoCount(this.segment(), 0L); }
    /// Sets `attachmentImageInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentImageInfoCount(MemorySegment segment, long index, int value) { VH_attachmentImageInfoCount.set(segment, 0L, index, value); }
    /// Sets `attachmentImageInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR attachmentImageInfoCount(int value) { attachmentImageInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachmentImageInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachmentImageInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachmentImageInfos.get(segment, 0L, index); }
    /// {@return `pAttachmentImageInfos`}
    public MemorySegment pAttachmentImageInfos() { return pAttachmentImageInfos(this.segment(), 0L); }
    /// Sets `pAttachmentImageInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachmentImageInfos(MemorySegment segment, long index, MemorySegment value) { VH_pAttachmentImageInfos.set(segment, 0L, index, value); }
    /// Sets `pAttachmentImageInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR pAttachmentImageInfos(MemorySegment value) { pAttachmentImageInfos(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFramebufferAttachmentsCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFramebufferAttachmentsCreateInfoKHR`
    public VkFramebufferAttachmentsCreateInfoKHR asSlice(long index) { return new VkFramebufferAttachmentsCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFramebufferAttachmentsCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFramebufferAttachmentsCreateInfoKHR`
    public VkFramebufferAttachmentsCreateInfoKHR asSlice(long index, long count) { return new VkFramebufferAttachmentsCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFramebufferAttachmentsCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR at(long index, Consumer<VkFramebufferAttachmentsCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `attachmentImageInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentImageInfoCountAt(long index) { return attachmentImageInfoCount(this.segment(), index); }
    /// Sets `attachmentImageInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR attachmentImageInfoCountAt(long index, int value) { attachmentImageInfoCount(this.segment(), index, value); return this; }

    /// {@return `pAttachmentImageInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentImageInfosAt(long index) { return pAttachmentImageInfos(this.segment(), index); }
    /// Sets `pAttachmentImageInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfoKHR pAttachmentImageInfosAt(long index, MemorySegment value) { pAttachmentImageInfos(this.segment(), index, value); return this; }

}
