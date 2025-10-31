// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDepthBiasRepresentationInfoEXT`.
/// ## Layout
/// ```
/// struct VkDepthBiasRepresentationInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDepthBiasRepresentationEXT depthBiasRepresentation;
///     (uint32_t) VkBool32 depthBiasExact;
/// };
/// ```
public final class VkDepthBiasRepresentationInfoEXT extends GroupType {
    /// The struct layout of `VkDepthBiasRepresentationInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
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
    /// The byte offset of `depthBiasRepresentation`.
    public static final long OFFSET_depthBiasRepresentation = LAYOUT.byteOffset(PathElement.groupElement("depthBiasRepresentation"));
    /// The memory layout of `depthBiasRepresentation`.
    public static final MemoryLayout LAYOUT_depthBiasRepresentation = LAYOUT.select(PathElement.groupElement("depthBiasRepresentation"));
    /// The [VarHandle] of `depthBiasRepresentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasRepresentation"));
    /// The byte offset of `depthBiasExact`.
    public static final long OFFSET_depthBiasExact = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
    /// The memory layout of `depthBiasExact`.
    public static final MemoryLayout LAYOUT_depthBiasExact = LAYOUT.select(PathElement.groupElement("depthBiasExact"));
    /// The [VarHandle] of `depthBiasExact` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDepthBiasRepresentationInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasRepresentationInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasRepresentationInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDepthBiasRepresentationInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasRepresentationInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDepthBiasRepresentationInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasRepresentationInfoEXT`
    public static VkDepthBiasRepresentationInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasRepresentationInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDepthBiasRepresentationInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthBiasRepresentationInfoEXT`
    public static VkDepthBiasRepresentationInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDepthBiasRepresentationInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT copyFrom(VkDepthBiasRepresentationInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDepthBiasRepresentationInfoEXT reinterpret(long count) { return new VkDepthBiasRepresentationInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDepthBiasRepresentationInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDepthBiasRepresentationInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasRepresentation(MemorySegment segment, long index) { return (int) VH_depthBiasRepresentation.get(segment, 0L, index); }
    /// {@return `depthBiasRepresentation`}
    public int depthBiasRepresentation() { return depthBiasRepresentation(this.segment(), 0L); }
    /// Sets `depthBiasRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasRepresentation(MemorySegment segment, long index, int value) { VH_depthBiasRepresentation.set(segment, 0L, index, value); }
    /// Sets `depthBiasRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(int value) { depthBiasRepresentation(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasExact` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasExact(MemorySegment segment, long index) { return (int) VH_depthBiasExact.get(segment, 0L, index); }
    /// {@return `depthBiasExact`}
    public int depthBiasExact() { return depthBiasExact(this.segment(), 0L); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasExact(MemorySegment segment, long index, int value) { VH_depthBiasExact.set(segment, 0L, index, value); }
    /// Sets `depthBiasExact` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasExact(int value) { depthBiasExact(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDepthBiasRepresentationInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDepthBiasRepresentationInfoEXT`
    public VkDepthBiasRepresentationInfoEXT asSlice(long index) { return new VkDepthBiasRepresentationInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDepthBiasRepresentationInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDepthBiasRepresentationInfoEXT`
    public VkDepthBiasRepresentationInfoEXT asSlice(long index, long count) { return new VkDepthBiasRepresentationInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDepthBiasRepresentationInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT at(long index, Consumer<VkDepthBiasRepresentationInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `depthBiasRepresentation` at the given index}
    /// @param index the index of the struct buffer
    public int depthBiasRepresentationAt(long index) { return depthBiasRepresentation(this.segment(), index); }
    /// Sets `depthBiasRepresentation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentationAt(long index, int value) { depthBiasRepresentation(this.segment(), index, value); return this; }

    /// {@return `depthBiasExact` at the given index}
    /// @param index the index of the struct buffer
    public int depthBiasExactAt(long index) { return depthBiasExact(this.segment(), index); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDepthBiasRepresentationInfoEXT depthBiasExactAt(long index, int value) { depthBiasExact(this.segment(), index, value); return this; }

}
