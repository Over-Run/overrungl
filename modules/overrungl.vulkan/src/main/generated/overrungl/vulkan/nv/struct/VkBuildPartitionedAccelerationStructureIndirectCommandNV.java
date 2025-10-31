// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBuildPartitionedAccelerationStructureIndirectCommandNV {
///     (int) VkPartitionedAccelerationStructureOpTypeNV opType;
///     uint32_t argCount;
///     (struct VkStridedDeviceAddressNV) VkStridedDeviceAddressNV argData;
/// };
/// ```
public final class VkBuildPartitionedAccelerationStructureIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("argCount"),
        overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.LAYOUT.withName("argData")
    );
    /// The byte offset of `opType`.
    public static final long OFFSET_opType = LAYOUT.byteOffset(PathElement.groupElement("opType"));
    /// The memory layout of `opType`.
    public static final MemoryLayout LAYOUT_opType = LAYOUT.select(PathElement.groupElement("opType"));
    /// The [VarHandle] of `opType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opType"));
    /// The byte offset of `argCount`.
    public static final long OFFSET_argCount = LAYOUT.byteOffset(PathElement.groupElement("argCount"));
    /// The memory layout of `argCount`.
    public static final MemoryLayout LAYOUT_argCount = LAYOUT.select(PathElement.groupElement("argCount"));
    /// The [VarHandle] of `argCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_argCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("argCount"));
    /// The byte offset of `argData`.
    public static final long OFFSET_argData = LAYOUT.byteOffset(PathElement.groupElement("argData"));
    /// The memory layout of `argData`.
    public static final MemoryLayout LAYOUT_argData = LAYOUT.select(PathElement.groupElement("argData"));

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV copyFrom(VkBuildPartitionedAccelerationStructureIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV reinterpret(long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `opType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int opType(MemorySegment segment, long index) { return (int) VH_opType.get(segment, 0L, index); }
    /// {@return `opType`}
    public int opType() { return opType(this.segment(), 0L); }
    /// Sets `opType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opType(MemorySegment segment, long index, int value) { VH_opType.set(segment, 0L, index, value); }
    /// Sets `opType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(int value) { opType(this.segment(), 0L, value); return this; }

    /// {@return `argCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int argCount(MemorySegment segment, long index) { return (int) VH_argCount.get(segment, 0L, index); }
    /// {@return `argCount`}
    public int argCount() { return argCount(this.segment(), 0L); }
    /// Sets `argCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void argCount(MemorySegment segment, long index, int value) { VH_argCount.set(segment, 0L, index, value); }
    /// Sets `argCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(int value) { argCount(this.segment(), 0L, value); return this; }

    /// {@return `argData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment argData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_argData, index), LAYOUT_argData); }
    /// {@return `argData`}
    public MemorySegment argData() { return argData(this.segment(), 0L); }
    /// Sets `argData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void argData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_argData, index), LAYOUT_argData.byteSize()); }
    /// Sets `argData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(MemorySegment value) { argData(this.segment(), 0L, value); return this; }
    /// Accepts `argData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(Consumer<overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV> func) { func.accept(overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.of(argData())); return this; }

    /// Creates a slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV asSlice(long index) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV asSlice(long index, long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBuildPartitionedAccelerationStructureIndirectCommandNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV at(long index, Consumer<VkBuildPartitionedAccelerationStructureIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `opType` at the given index}
    /// @param index the index of the struct buffer
    public int opTypeAt(long index) { return opType(this.segment(), index); }
    /// Sets `opType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opTypeAt(long index, int value) { opType(this.segment(), index, value); return this; }

    /// {@return `argCount` at the given index}
    /// @param index the index of the struct buffer
    public int argCountAt(long index) { return argCount(this.segment(), index); }
    /// Sets `argCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCountAt(long index, int value) { argCount(this.segment(), index, value); return this; }

    /// {@return `argData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment argDataAt(long index) { return argData(this.segment(), index); }
    /// Sets `argData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argDataAt(long index, MemorySegment value) { argData(this.segment(), index, value); return this; }
    /// Accepts `argData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argDataAt(long index, Consumer<overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV> func) { func.accept(overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.of(argDataAt(index))); return this; }

}
