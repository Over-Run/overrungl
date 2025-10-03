// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugMarkerObjectNameInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugMarkerObjectNameInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     const char* pObjectName;
/// };
/// ```
public final class VkDebugMarkerObjectNameInfoEXT extends GroupType {
    /// The struct layout of `VkDebugMarkerObjectNameInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withName("pObjectName")
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
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The byte offset of `object`.
    public static final long OFFSET_object = LAYOUT.byteOffset(PathElement.groupElement("object"));
    /// The memory layout of `object`.
    public static final MemoryLayout LAYOUT_object = LAYOUT.select(PathElement.groupElement("object"));
    /// The [VarHandle] of `object` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    /// The byte offset of `pObjectName`.
    public static final long OFFSET_pObjectName = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
    /// The memory layout of `pObjectName`.
    public static final MemoryLayout LAYOUT_pObjectName = LAYOUT.select(PathElement.groupElement("pObjectName"));
    /// The [VarHandle] of `pObjectName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT copyFrom(VkDebugMarkerObjectNameInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDebugMarkerObjectNameInfoEXT reinterpret(long count) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDebugMarkerObjectNameInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugMarkerObjectNameInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `object` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long object(MemorySegment segment, long index) { return (long) VH_object.get(segment, 0L, index); }
    /// {@return `object`}
    public long object() { return object(this.segment(), 0L); }
    /// Sets `object` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void object(MemorySegment segment, long index, long value) { VH_object.set(segment, 0L, index, value); }
    /// Sets `object` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT object(long value) { object(this.segment(), 0L, value); return this; }

    /// {@return `pObjectName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pObjectName(MemorySegment segment, long index) { return (MemorySegment) VH_pObjectName.get(segment, 0L, index); }
    /// {@return `pObjectName`}
    public MemorySegment pObjectName() { return pObjectName(this.segment(), 0L); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pObjectName(MemorySegment segment, long index, MemorySegment value) { VH_pObjectName.set(segment, 0L, index, value); }
    /// Sets `pObjectName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pObjectName(MemorySegment value) { pObjectName(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index, long count) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDebugMarkerObjectNameInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT at(long index, Consumer<VkDebugMarkerObjectNameInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param index the index of the struct buffer
    public int objectTypeAt(long index) { return objectType(this.segment(), index); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

    /// {@return `object` at the given index}
    /// @param index the index of the struct buffer
    public long objectAt(long index) { return object(this.segment(), index); }
    /// Sets `object` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectAt(long index, long value) { object(this.segment(), index, value); return this; }

    /// {@return `pObjectName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pObjectNameAt(long index) { return pObjectName(this.segment(), index); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pObjectNameAt(long index, MemorySegment value) { pObjectName(this.segment(), index, value); return this; }

}
