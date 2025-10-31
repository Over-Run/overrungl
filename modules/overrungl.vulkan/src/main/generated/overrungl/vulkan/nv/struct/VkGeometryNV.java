// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeometryNV`.
/// ## Layout
/// ```
/// struct VkGeometryNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkGeometryTypeKHR geometryType;
///     (struct VkGeometryDataNV) VkGeometryDataNV geometry;
///     ((uint32_t) VkFlags) VkGeometryFlagsKHR flags;
/// };
/// ```
public final class VkGeometryNV extends GroupType {
    /// The struct layout of `VkGeometryNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        overrungl.vulkan.nv.struct.VkGeometryDataNV.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
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
    /// The byte offset of `geometryType`.
    public static final long OFFSET_geometryType = LAYOUT.byteOffset(PathElement.groupElement("geometryType"));
    /// The memory layout of `geometryType`.
    public static final MemoryLayout LAYOUT_geometryType = LAYOUT.select(PathElement.groupElement("geometryType"));
    /// The [VarHandle] of `geometryType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryType"));
    /// The byte offset of `geometry`.
    public static final long OFFSET_geometry = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
    /// The memory layout of `geometry`.
    public static final MemoryLayout LAYOUT_geometry = LAYOUT.select(PathElement.groupElement("geometry"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkGeometryNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeometryNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeometryNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeometryNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeometryNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeometryNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryNV`
    public static VkGeometryNV alloc(SegmentAllocator allocator) { return new VkGeometryNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeometryNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryNV`
    public static VkGeometryNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeometryNV copyFrom(VkGeometryNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeometryNV reinterpret(long count) { return new VkGeometryNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeometryNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeometryNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `geometryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int geometryType(MemorySegment segment, long index) { return (int) VH_geometryType.get(segment, 0L, index); }
    /// {@return `geometryType`}
    public int geometryType() { return geometryType(this.segment(), 0L); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryType(MemorySegment segment, long index, int value) { VH_geometryType.set(segment, 0L, index, value); }
    /// Sets `geometryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryType(int value) { geometryType(this.segment(), 0L, value); return this; }

    /// {@return `geometry` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment geometry(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry); }
    /// {@return `geometry`}
    public MemorySegment geometry() { return geometry(this.segment(), 0L); }
    /// Sets `geometry` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometry(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry.byteSize()); }
    /// Sets `geometry` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometry(MemorySegment value) { geometry(this.segment(), 0L, value); return this; }
    /// Accepts `geometry` with the given function.
    /// @param func the function
    /// @return `this`
    public VkGeometryNV geometry(Consumer<overrungl.vulkan.nv.struct.VkGeometryDataNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryDataNV.of(geometry())); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeometryNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeometryNV`
    public VkGeometryNV asSlice(long index) { return new VkGeometryNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeometryNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeometryNV`
    public VkGeometryNV asSlice(long index, long count) { return new VkGeometryNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeometryNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeometryNV at(long index, Consumer<VkGeometryNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `geometryType` at the given index}
    /// @param index the index of the struct buffer
    public int geometryTypeAt(long index) { return geometryType(this.segment(), index); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryTypeAt(long index, int value) { geometryType(this.segment(), index, value); return this; }

    /// {@return `geometry` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment geometryAt(long index) { return geometry(this.segment(), index); }
    /// Sets `geometry` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryAt(long index, MemorySegment value) { geometry(this.segment(), index, value); return this; }
    /// Accepts `geometry` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkGeometryNV geometryAt(long index, Consumer<overrungl.vulkan.nv.struct.VkGeometryDataNV> func) { func.accept(overrungl.vulkan.nv.struct.VkGeometryDataNV.of(geometryAt(index))); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeometryNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}
