// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportSemaphoreSciSyncInfoNV`.
/// ## Layout
/// ```
/// struct VkExportSemaphoreSciSyncInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct NvSciSyncAttrListRec *) NvSciSyncAttrList pAttributes;
/// };
/// ```
public final class VkExportSemaphoreSciSyncInfoNV extends GroupType {
    /// The struct layout of `VkExportSemaphoreSciSyncInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes")
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
    /// The byte offset of `pAttributes`.
    public static final long OFFSET_pAttributes = LAYOUT.byteOffset(PathElement.groupElement("pAttributes"));
    /// The memory layout of `pAttributes`.
    public static final MemoryLayout LAYOUT_pAttributes = LAYOUT.select(PathElement.groupElement("pAttributes"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportSemaphoreSciSyncInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportSemaphoreSciSyncInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportSemaphoreSciSyncInfoNV`
    public static VkExportSemaphoreSciSyncInfoNV alloc(SegmentAllocator allocator) { return new VkExportSemaphoreSciSyncInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportSemaphoreSciSyncInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportSemaphoreSciSyncInfoNV`
    public static VkExportSemaphoreSciSyncInfoNV alloc(SegmentAllocator allocator, long count) { return new VkExportSemaphoreSciSyncInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV copyFrom(VkExportSemaphoreSciSyncInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportSemaphoreSciSyncInfoNV reinterpret(long count) { return new VkExportSemaphoreSciSyncInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportSemaphoreSciSyncInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportSemaphoreSciSyncInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttributes(MemorySegment segment, long index) { return (MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    public MemorySegment pAttributes() { return pAttributes(this.segment(), 0L); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttributes(MemorySegment segment, long index, MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pAttributes(MemorySegment value) { pAttributes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportSemaphoreSciSyncInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportSemaphoreSciSyncInfoNV`
    public VkExportSemaphoreSciSyncInfoNV asSlice(long index) { return new VkExportSemaphoreSciSyncInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportSemaphoreSciSyncInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportSemaphoreSciSyncInfoNV`
    public VkExportSemaphoreSciSyncInfoNV asSlice(long index, long count) { return new VkExportSemaphoreSciSyncInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportSemaphoreSciSyncInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV at(long index, Consumer<VkExportSemaphoreSciSyncInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttributesAt(long index) { return pAttributes(this.segment(), index); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pAttributesAt(long index, MemorySegment value) { pAttributes(this.segment(), index, value); return this; }

}
