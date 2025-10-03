// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionBindPointRequirementARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionBindPointRequirementARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDataGraphPipelineSessionBindPointARM bindPoint;
///     (int) VkDataGraphPipelineSessionBindPointTypeARM bindPointType;
///     uint32_t numObjects;
/// };
/// ```
public final class VkDataGraphPipelineSessionBindPointRequirementARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineSessionBindPointRequirementARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("bindPointType"),
        ValueLayout.JAVA_INT.withName("numObjects")
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
    /// The byte offset of `bindPoint`.
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    /// The memory layout of `bindPoint`.
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    /// The [VarHandle] of `bindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    /// The byte offset of `bindPointType`.
    public static final long OFFSET_bindPointType = LAYOUT.byteOffset(PathElement.groupElement("bindPointType"));
    /// The memory layout of `bindPointType`.
    public static final MemoryLayout LAYOUT_bindPointType = LAYOUT.select(PathElement.groupElement("bindPointType"));
    /// The [VarHandle] of `bindPointType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPointType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPointType"));
    /// The byte offset of `numObjects`.
    public static final long OFFSET_numObjects = LAYOUT.byteOffset(PathElement.groupElement("numObjects"));
    /// The memory layout of `numObjects`.
    public static final MemoryLayout LAYOUT_numObjects = LAYOUT.select(PathElement.groupElement("numObjects"));
    /// The [VarHandle] of `numObjects` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numObjects"));

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineSessionBindPointRequirementARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionBindPointRequirementARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM copyFrom(VkDataGraphPipelineSessionBindPointRequirementARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineSessionBindPointRequirementARM reinterpret(long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineSessionBindPointRequirementARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineSessionBindPointRequirementARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPoint(MemorySegment segment, long index) { return (int) VH_bindPoint.get(segment, 0L, index); }
    /// {@return `bindPoint`}
    public int bindPoint() { return bindPoint(this.segment(), 0L); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPoint(MemorySegment segment, long index, int value) { VH_bindPoint.set(segment, 0L, index, value); }
    /// Sets `bindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPoint(int value) { bindPoint(this.segment(), 0L, value); return this; }

    /// {@return `bindPointType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPointType(MemorySegment segment, long index) { return (int) VH_bindPointType.get(segment, 0L, index); }
    /// {@return `bindPointType`}
    public int bindPointType() { return bindPointType(this.segment(), 0L); }
    /// Sets `bindPointType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPointType(MemorySegment segment, long index, int value) { VH_bindPointType.set(segment, 0L, index, value); }
    /// Sets `bindPointType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointType(int value) { bindPointType(this.segment(), 0L, value); return this; }

    /// {@return `numObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numObjects(MemorySegment segment, long index) { return (int) VH_numObjects.get(segment, 0L, index); }
    /// {@return `numObjects`}
    public int numObjects() { return numObjects(this.segment(), 0L); }
    /// Sets `numObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numObjects(MemorySegment segment, long index, int value) { VH_numObjects.set(segment, 0L, index, value); }
    /// Sets `numObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjects(int value) { numObjects(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementARM`
    public VkDataGraphPipelineSessionBindPointRequirementARM asSlice(long index) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementARM`
    public VkDataGraphPipelineSessionBindPointRequirementARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineSessionBindPointRequirementARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM at(long index, Consumer<VkDataGraphPipelineSessionBindPointRequirementARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int bindPointAt(long index) { return bindPoint(this.segment(), index); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointAt(long index, int value) { bindPoint(this.segment(), index, value); return this; }

    /// {@return `bindPointType` at the given index}
    /// @param index the index of the struct buffer
    public int bindPointTypeAt(long index) { return bindPointType(this.segment(), index); }
    /// Sets `bindPointType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointTypeAt(long index, int value) { bindPointType(this.segment(), index, value); return this; }

    /// {@return `numObjects` at the given index}
    /// @param index the index of the struct buffer
    public int numObjectsAt(long index) { return numObjects(this.segment(), index); }
    /// Sets `numObjects` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjectsAt(long index, int value) { numObjects(this.segment(), index, value); return this; }

}
