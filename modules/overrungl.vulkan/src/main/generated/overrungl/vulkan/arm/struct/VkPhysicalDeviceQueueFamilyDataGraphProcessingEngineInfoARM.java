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

/// Represents `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     (int) VkPhysicalDeviceDataGraphProcessingEngineTypeARM engineType;
/// };
/// ```
public final class VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("engineType")
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
    /// The byte offset of `queueFamilyIndex`.
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    /// The memory layout of `queueFamilyIndex`.
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_queueFamilyIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex")));
    /// The byte offset of `engineType`.
    public static final long OFFSET_engineType = LAYOUT.byteOffset(PathElement.groupElement("engineType"));
    /// The memory layout of `engineType`.
    public static final MemoryLayout LAYOUT_engineType = LAYOUT.select(PathElement.groupElement("engineType"));
    /// The [VarHandle] of `engineType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_engineType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineType")));

    /// Creates `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM copyFrom(VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM reinterpret(long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get().get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    public int queueFamilyIndex() { return queueFamilyIndex(this.segment(), 0L); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndex(MemorySegment segment, long index, int value) { VH_queueFamilyIndex.get().set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndex(int value) { queueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `engineType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int engineType(MemorySegment segment, long index) { return (int) VH_engineType.get().get(segment, 0L, index); }
    /// {@return `engineType`}
    public int engineType() { return engineType(this.segment(), 0L); }
    /// Sets `engineType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void engineType(MemorySegment segment, long index, int value) { VH_engineType.get().set(segment, 0L, index, value); }
    /// Sets `engineType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineType(int value) { engineType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM asSlice(long index) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM asSlice(long index, long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM at(long index, Consumer<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int queueFamilyIndexAt(long index) { return queueFamilyIndex(this.segment(), index); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndexAt(long index, int value) { queueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `engineType` at the given index}
    /// @param index the index of the struct buffer
    public int engineTypeAt(long index) { return engineType(this.segment(), index); }
    /// Sets `engineType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineTypeAt(long index, int value) { engineType(this.segment(), index, value); return this; }

}
