// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMetalIOSurfaceInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalIOSurfaceInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct __IOSurface *) IOSurfaceRef ioSurface;
/// };
/// ```
public final class VkImportMetalIOSurfaceInfoEXT extends GroupType {
    /// The struct layout of `VkImportMetalIOSurfaceInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("ioSurface")
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
    /// The byte offset of `ioSurface`.
    public static final long OFFSET_ioSurface = LAYOUT.byteOffset(PathElement.groupElement("ioSurface"));
    /// The memory layout of `ioSurface`.
    public static final MemoryLayout LAYOUT_ioSurface = LAYOUT.select(PathElement.groupElement("ioSurface"));
    /// The [VarHandle] of `ioSurface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ioSurface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ioSurface"));

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportMetalIOSurfaceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalIOSurfaceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportMetalIOSurfaceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalIOSurfaceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalIOSurfaceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportMetalIOSurfaceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalIOSurfaceInfoEXT`
    public static VkImportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportMetalIOSurfaceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalIOSurfaceInfoEXT`
    public static VkImportMetalIOSurfaceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalIOSurfaceInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT copyFrom(VkImportMetalIOSurfaceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportMetalIOSurfaceInfoEXT reinterpret(long count) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportMetalIOSurfaceInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportMetalIOSurfaceInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ioSurface(MemorySegment segment, long index) { return (MemorySegment) VH_ioSurface.get(segment, 0L, index); }
    /// {@return `ioSurface`}
    public MemorySegment ioSurface() { return ioSurface(this.segment(), 0L); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ioSurface(MemorySegment segment, long index, MemorySegment value) { VH_ioSurface.set(segment, 0L, index, value); }
    /// Sets `ioSurface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT ioSurface(MemorySegment value) { ioSurface(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportMetalIOSurfaceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportMetalIOSurfaceInfoEXT`
    public VkImportMetalIOSurfaceInfoEXT asSlice(long index) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportMetalIOSurfaceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportMetalIOSurfaceInfoEXT`
    public VkImportMetalIOSurfaceInfoEXT asSlice(long index, long count) { return new VkImportMetalIOSurfaceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportMetalIOSurfaceInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT at(long index, Consumer<VkImportMetalIOSurfaceInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `ioSurface` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ioSurfaceAt(long index) { return ioSurface(this.segment(), index); }
    /// Sets `ioSurface` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalIOSurfaceInfoEXT ioSurfaceAt(long index, MemorySegment value) { ioSurface(this.segment(), index, value); return this; }

}
