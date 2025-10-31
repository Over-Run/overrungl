// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupSizeControlFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 subgroupSizeControl;
///     (uint32_t) VkBool32 computeFullSubgroups;
/// };
/// ```
public final class VkPhysicalDeviceSubgroupSizeControlFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups")
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
    /// The byte offset of `subgroupSizeControl`.
    public static final long OFFSET_subgroupSizeControl = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
    /// The memory layout of `subgroupSizeControl`.
    public static final MemoryLayout LAYOUT_subgroupSizeControl = LAYOUT.select(PathElement.groupElement("subgroupSizeControl"));
    /// The [VarHandle] of `subgroupSizeControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    /// The byte offset of `computeFullSubgroups`.
    public static final long OFFSET_computeFullSubgroups = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
    /// The memory layout of `computeFullSubgroups`.
    public static final MemoryLayout LAYOUT_computeFullSubgroups = LAYOUT.select(PathElement.groupElement("computeFullSubgroups"));
    /// The [VarHandle] of `computeFullSubgroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT copyFrom(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSizeControl(MemorySegment segment, long index) { return (int) VH_subgroupSizeControl.get(segment, 0L, index); }
    /// {@return `subgroupSizeControl`}
    public int subgroupSizeControl() { return subgroupSizeControl(this.segment(), 0L); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSizeControl(MemorySegment segment, long index, int value) { VH_subgroupSizeControl.set(segment, 0L, index, value); }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT subgroupSizeControl(int value) { subgroupSizeControl(this.segment(), 0L, value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeFullSubgroups(MemorySegment segment, long index) { return (int) VH_computeFullSubgroups.get(segment, 0L, index); }
    /// {@return `computeFullSubgroups`}
    public int computeFullSubgroups() { return computeFullSubgroups(this.segment(), 0L); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeFullSubgroups(MemorySegment segment, long index, int value) { VH_computeFullSubgroups.set(segment, 0L, index, value); }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT computeFullSubgroups(int value) { computeFullSubgroups(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSubgroupSizeControlFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT at(long index, Consumer<VkPhysicalDeviceSubgroupSizeControlFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param index the index of the struct buffer
    public int subgroupSizeControlAt(long index) { return subgroupSizeControl(this.segment(), index); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT subgroupSizeControlAt(long index, int value) { subgroupSizeControl(this.segment(), index, value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param index the index of the struct buffer
    public int computeFullSubgroupsAt(long index) { return computeFullSubgroups(this.segment(), index); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT computeFullSubgroupsAt(long index, int value) { computeFullSubgroups(this.segment(), index, value); return this; }

}
