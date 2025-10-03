// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureBuildSizesInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureBuildSizesInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize accelerationStructureSize;
///     (uint64_t) VkDeviceSize updateScratchSize;
///     (uint64_t) VkDeviceSize buildScratchSize;
/// };
/// ```
public final class VkAccelerationStructureBuildSizesInfoKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureBuildSizesInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
        ValueLayout.JAVA_LONG.withName("updateScratchSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `accelerationStructureSize`.
    public static final long OFFSET_accelerationStructureSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureSize"));
    /// The memory layout of `accelerationStructureSize`.
    public static final MemoryLayout LAYOUT_accelerationStructureSize = LAYOUT.select(PathElement.groupElement("accelerationStructureSize"));
    /// The [VarHandle] of `accelerationStructureSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_accelerationStructureSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureSize")));
    /// The byte offset of `updateScratchSize`.
    public static final long OFFSET_updateScratchSize = LAYOUT.byteOffset(PathElement.groupElement("updateScratchSize"));
    /// The memory layout of `updateScratchSize`.
    public static final MemoryLayout LAYOUT_updateScratchSize = LAYOUT.select(PathElement.groupElement("updateScratchSize"));
    /// The [VarHandle] of `updateScratchSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_updateScratchSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateScratchSize")));
    /// The byte offset of `buildScratchSize`.
    public static final long OFFSET_buildScratchSize = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
    /// The memory layout of `buildScratchSize`.
    public static final MemoryLayout LAYOUT_buildScratchSize = LAYOUT.select(PathElement.groupElement("buildScratchSize"));
    /// The [VarHandle] of `buildScratchSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_buildScratchSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize")));

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildSizesInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildSizesInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildSizesInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureBuildSizesInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildSizesInfoKHR`
    public static VkAccelerationStructureBuildSizesInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildSizesInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureBuildSizesInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildSizesInfoKHR`
    public static VkAccelerationStructureBuildSizesInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildSizesInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR copyFrom(VkAccelerationStructureBuildSizesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureBuildSizesInfoKHR reinterpret(long count) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureSize(MemorySegment segment, long index) { return (long) VH_accelerationStructureSize.get().get(segment, 0L, index); }
    /// {@return `accelerationStructureSize`}
    public long accelerationStructureSize() { return accelerationStructureSize(this.segment(), 0L); }
    /// Sets `accelerationStructureSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureSize(MemorySegment segment, long index, long value) { VH_accelerationStructureSize.get().set(segment, 0L, index, value); }
    /// Sets `accelerationStructureSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSize(long value) { accelerationStructureSize(this.segment(), 0L, value); return this; }

    /// {@return `updateScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long updateScratchSize(MemorySegment segment, long index) { return (long) VH_updateScratchSize.get().get(segment, 0L, index); }
    /// {@return `updateScratchSize`}
    public long updateScratchSize() { return updateScratchSize(this.segment(), 0L); }
    /// Sets `updateScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void updateScratchSize(MemorySegment segment, long index, long value) { VH_updateScratchSize.get().set(segment, 0L, index, value); }
    /// Sets `updateScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSize(long value) { updateScratchSize(this.segment(), 0L, value); return this; }

    /// {@return `buildScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long buildScratchSize(MemorySegment segment, long index) { return (long) VH_buildScratchSize.get().get(segment, 0L, index); }
    /// {@return `buildScratchSize`}
    public long buildScratchSize() { return buildScratchSize(this.segment(), 0L); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void buildScratchSize(MemorySegment segment, long index, long value) { VH_buildScratchSize.get().set(segment, 0L, index, value); }
    /// Sets `buildScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSize(long value) { buildScratchSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureBuildSizesInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureBuildSizesInfoKHR`
    public VkAccelerationStructureBuildSizesInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureBuildSizesInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureBuildSizesInfoKHR`
    public VkAccelerationStructureBuildSizesInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureBuildSizesInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR at(long index, Consumer<VkAccelerationStructureBuildSizesInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `accelerationStructureSize` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureSizeAt(long index) { return accelerationStructureSize(this.segment(), index); }
    /// Sets `accelerationStructureSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSizeAt(long index, long value) { accelerationStructureSize(this.segment(), index, value); return this; }

    /// {@return `updateScratchSize` at the given index}
    /// @param index the index of the struct buffer
    public long updateScratchSizeAt(long index) { return updateScratchSize(this.segment(), index); }
    /// Sets `updateScratchSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSizeAt(long index, long value) { updateScratchSize(this.segment(), index, value); return this; }

    /// {@return `buildScratchSize` at the given index}
    /// @param index the index of the struct buffer
    public long buildScratchSizeAt(long index) { return buildScratchSize(this.segment(), index); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSizeAt(long index, long value) { buildScratchSize(this.segment(), index, value); return this; }

}
