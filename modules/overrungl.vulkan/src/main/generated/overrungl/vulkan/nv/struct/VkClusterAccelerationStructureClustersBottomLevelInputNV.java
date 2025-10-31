// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureClustersBottomLevelInputNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxTotalClusterCount;
///     uint32_t maxClusterCountPerAccelerationStructure;
/// };
/// ```
public final class VkClusterAccelerationStructureClustersBottomLevelInputNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTotalClusterCount"),
        ValueLayout.JAVA_INT.withName("maxClusterCountPerAccelerationStructure")
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
    /// The byte offset of `maxTotalClusterCount`.
    public static final long OFFSET_maxTotalClusterCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalClusterCount"));
    /// The memory layout of `maxTotalClusterCount`.
    public static final MemoryLayout LAYOUT_maxTotalClusterCount = LAYOUT.select(PathElement.groupElement("maxTotalClusterCount"));
    /// The [VarHandle] of `maxTotalClusterCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTotalClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalClusterCount"));
    /// The byte offset of `maxClusterCountPerAccelerationStructure`.
    public static final long OFFSET_maxClusterCountPerAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    /// The memory layout of `maxClusterCountPerAccelerationStructure`.
    public static final MemoryLayout LAYOUT_maxClusterCountPerAccelerationStructure = LAYOUT.select(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    /// The [VarHandle] of `maxClusterCountPerAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterCountPerAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureClustersBottomLevelInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureClustersBottomLevelInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV copyFrom(VkClusterAccelerationStructureClustersBottomLevelInputNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureClustersBottomLevelInputNV reinterpret(long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTotalClusterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTotalClusterCount(MemorySegment segment, long index) { return (int) VH_maxTotalClusterCount.get(segment, 0L, index); }
    /// {@return `maxTotalClusterCount`}
    public int maxTotalClusterCount() { return maxTotalClusterCount(this.segment(), 0L); }
    /// Sets `maxTotalClusterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTotalClusterCount(MemorySegment segment, long index, int value) { VH_maxTotalClusterCount.set(segment, 0L, index, value); }
    /// Sets `maxTotalClusterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(int value) { maxTotalClusterCount(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterCountPerAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterCountPerAccelerationStructure(MemorySegment segment, long index) { return (int) VH_maxClusterCountPerAccelerationStructure.get(segment, 0L, index); }
    /// {@return `maxClusterCountPerAccelerationStructure`}
    public int maxClusterCountPerAccelerationStructure() { return maxClusterCountPerAccelerationStructure(this.segment(), 0L); }
    /// Sets `maxClusterCountPerAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterCountPerAccelerationStructure(MemorySegment segment, long index, int value) { VH_maxClusterCountPerAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `maxClusterCountPerAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(int value) { maxClusterCountPerAccelerationStructure(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV asSlice(long index) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureClustersBottomLevelInputNV`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureClustersBottomLevelInputNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV at(long index, Consumer<VkClusterAccelerationStructureClustersBottomLevelInputNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxTotalClusterCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTotalClusterCountAt(long index) { return maxTotalClusterCount(this.segment(), index); }
    /// Sets `maxTotalClusterCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCountAt(long index, int value) { maxTotalClusterCount(this.segment(), index, value); return this; }

    /// {@return `maxClusterCountPerAccelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public int maxClusterCountPerAccelerationStructureAt(long index) { return maxClusterCountPerAccelerationStructure(this.segment(), index); }
    /// Sets `maxClusterCountPerAccelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructureAt(long index, int value) { maxClusterCountPerAccelerationStructure(this.segment(), index, value); return this; }

}
