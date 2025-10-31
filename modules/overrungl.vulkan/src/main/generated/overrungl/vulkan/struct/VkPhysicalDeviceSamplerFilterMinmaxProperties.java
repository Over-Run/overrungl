// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 filterMinmaxSingleComponentFormats;
///     (uint32_t) VkBool32 filterMinmaxImageComponentMapping;
/// };
/// ```
public final class VkPhysicalDeviceSamplerFilterMinmaxProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
        ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping")
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
    /// The byte offset of `filterMinmaxSingleComponentFormats`.
    public static final long OFFSET_filterMinmaxSingleComponentFormats = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The memory layout of `filterMinmaxSingleComponentFormats`.
    public static final MemoryLayout LAYOUT_filterMinmaxSingleComponentFormats = LAYOUT.select(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The [VarHandle] of `filterMinmaxSingleComponentFormats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The byte offset of `filterMinmaxImageComponentMapping`.
    public static final long OFFSET_filterMinmaxImageComponentMapping = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The memory layout of `filterMinmaxImageComponentMapping`.
    public static final MemoryLayout LAYOUT_filterMinmaxImageComponentMapping = LAYOUT.select(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The [VarHandle] of `filterMinmaxImageComponentMapping` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties copyFrom(VkPhysicalDeviceSamplerFilterMinmaxProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSamplerFilterMinmaxProperties reinterpret(long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `filterMinmaxSingleComponentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterMinmaxSingleComponentFormats(MemorySegment segment, long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(segment, 0L, index); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    public int filterMinmaxSingleComponentFormats() { return filterMinmaxSingleComponentFormats(this.segment(), 0L); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterMinmaxSingleComponentFormats(MemorySegment segment, long index, int value) { VH_filterMinmaxSingleComponentFormats.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormats(int value) { filterMinmaxSingleComponentFormats(this.segment(), 0L, value); return this; }

    /// {@return `filterMinmaxImageComponentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterMinmaxImageComponentMapping(MemorySegment segment, long index) { return (int) VH_filterMinmaxImageComponentMapping.get(segment, 0L, index); }
    /// {@return `filterMinmaxImageComponentMapping`}
    public int filterMinmaxImageComponentMapping() { return filterMinmaxImageComponentMapping(this.segment(), 0L); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterMinmaxImageComponentMapping(MemorySegment segment, long index, int value) { VH_filterMinmaxImageComponentMapping.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMapping(int value) { filterMinmaxImageComponentMapping(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties asSlice(long index) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties asSlice(long index, long count) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSamplerFilterMinmaxProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties at(long index, Consumer<VkPhysicalDeviceSamplerFilterMinmaxProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `filterMinmaxSingleComponentFormats` at the given index}
    /// @param index the index of the struct buffer
    public int filterMinmaxSingleComponentFormatsAt(long index) { return filterMinmaxSingleComponentFormats(this.segment(), index); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormatsAt(long index, int value) { filterMinmaxSingleComponentFormats(this.segment(), index, value); return this; }

    /// {@return `filterMinmaxImageComponentMapping` at the given index}
    /// @param index the index of the struct buffer
    public int filterMinmaxImageComponentMappingAt(long index) { return filterMinmaxImageComponentMapping(this.segment(), index); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMappingAt(long index, int value) { filterMinmaxImageComponentMapping(this.segment(), index, value); return this; }

}
