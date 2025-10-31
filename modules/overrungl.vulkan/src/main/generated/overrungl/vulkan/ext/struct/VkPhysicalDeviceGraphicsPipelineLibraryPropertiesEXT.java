// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 graphicsPipelineLibraryFastLinking;
///     (uint32_t) VkBool32 graphicsPipelineLibraryIndependentInterpolationDecoration;
/// };
/// ```
public final class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
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
    /// The byte offset of `graphicsPipelineLibraryFastLinking`.
    public static final long OFFSET_graphicsPipelineLibraryFastLinking = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    /// The memory layout of `graphicsPipelineLibraryFastLinking`.
    public static final MemoryLayout LAYOUT_graphicsPipelineLibraryFastLinking = LAYOUT.select(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    /// The [VarHandle] of `graphicsPipelineLibraryFastLinking` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_graphicsPipelineLibraryFastLinking = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    /// The byte offset of `graphicsPipelineLibraryIndependentInterpolationDecoration`.
    public static final long OFFSET_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
    /// The memory layout of `graphicsPipelineLibraryIndependentInterpolationDecoration`.
    public static final MemoryLayout LAYOUT_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.select(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
    /// The [VarHandle] of `graphicsPipelineLibraryIndependentInterpolationDecoration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT copyFrom(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `graphicsPipelineLibraryFastLinking` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int graphicsPipelineLibraryFastLinking(MemorySegment segment, long index) { return (int) VH_graphicsPipelineLibraryFastLinking.get(segment, 0L, index); }
    /// {@return `graphicsPipelineLibraryFastLinking`}
    public int graphicsPipelineLibraryFastLinking() { return graphicsPipelineLibraryFastLinking(this.segment(), 0L); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void graphicsPipelineLibraryFastLinking(MemorySegment segment, long index, int value) { VH_graphicsPipelineLibraryFastLinking.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinking(int value) { graphicsPipelineLibraryFastLinking(this.segment(), 0L, value); return this; }

    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment, long index) { return (int) VH_graphicsPipelineLibraryIndependentInterpolationDecoration.get(segment, 0L, index); }
    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration`}
    public int graphicsPipelineLibraryIndependentInterpolationDecoration() { return graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), 0L); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment, long index, int value) { VH_graphicsPipelineLibraryIndependentInterpolationDecoration.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecoration(int value) { graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT at(long index, Consumer<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `graphicsPipelineLibraryFastLinking` at the given index}
    /// @param index the index of the struct buffer
    public int graphicsPipelineLibraryFastLinkingAt(long index) { return graphicsPipelineLibraryFastLinking(this.segment(), index); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinkingAt(long index, int value) { graphicsPipelineLibraryFastLinking(this.segment(), index, value); return this; }

    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration` at the given index}
    /// @param index the index of the struct buffer
    public int graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index) { return graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), index); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index, int value) { graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), index, value); return this; }

}
