// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileMemoryHeapPropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 queueSubmitBoundary;
///     (uint32_t) VkBool32 tileBufferTransfers;
/// };
/// ```
public final class VkPhysicalDeviceTileMemoryHeapPropertiesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueSubmitBoundary"),
        ValueLayout.JAVA_INT.withName("tileBufferTransfers")
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
    /// The byte offset of `queueSubmitBoundary`.
    public static final long OFFSET_queueSubmitBoundary = LAYOUT.byteOffset(PathElement.groupElement("queueSubmitBoundary"));
    /// The memory layout of `queueSubmitBoundary`.
    public static final MemoryLayout LAYOUT_queueSubmitBoundary = LAYOUT.select(PathElement.groupElement("queueSubmitBoundary"));
    /// The [VarHandle] of `queueSubmitBoundary` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_queueSubmitBoundary = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueSubmitBoundary")));
    /// The byte offset of `tileBufferTransfers`.
    public static final long OFFSET_tileBufferTransfers = LAYOUT.byteOffset(PathElement.groupElement("tileBufferTransfers"));
    /// The memory layout of `tileBufferTransfers`.
    public static final MemoryLayout LAYOUT_tileBufferTransfers = LAYOUT.select(PathElement.groupElement("tileBufferTransfers"));
    /// The [VarHandle] of `tileBufferTransfers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tileBufferTransfers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileBufferTransfers")));

    /// Creates `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM copyFrom(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queueSubmitBoundary` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueSubmitBoundary(MemorySegment segment, long index) { return (int) VH_queueSubmitBoundary.get().get(segment, 0L, index); }
    /// {@return `queueSubmitBoundary`}
    public int queueSubmitBoundary() { return queueSubmitBoundary(this.segment(), 0L); }
    /// Sets `queueSubmitBoundary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueSubmitBoundary(MemorySegment segment, long index, int value) { VH_queueSubmitBoundary.get().set(segment, 0L, index, value); }
    /// Sets `queueSubmitBoundary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundary(int value) { queueSubmitBoundary(this.segment(), 0L, value); return this; }

    /// {@return `tileBufferTransfers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileBufferTransfers(MemorySegment segment, long index) { return (int) VH_tileBufferTransfers.get().get(segment, 0L, index); }
    /// {@return `tileBufferTransfers`}
    public int tileBufferTransfers() { return tileBufferTransfers(this.segment(), 0L); }
    /// Sets `tileBufferTransfers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileBufferTransfers(MemorySegment segment, long index, int value) { VH_tileBufferTransfers.get().set(segment, 0L, index, value); }
    /// Sets `tileBufferTransfers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfers(int value) { tileBufferTransfers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queueSubmitBoundary` at the given index}
    /// @param index the index of the struct buffer
    public int queueSubmitBoundaryAt(long index) { return queueSubmitBoundary(this.segment(), index); }
    /// Sets `queueSubmitBoundary` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundaryAt(long index, int value) { queueSubmitBoundary(this.segment(), index, value); return this; }

    /// {@return `tileBufferTransfers` at the given index}
    /// @param index the index of the struct buffer
    public int tileBufferTransfersAt(long index) { return tileBufferTransfers(this.segment(), index); }
    /// Sets `tileBufferTransfers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfersAt(long index, int value) { tileBufferTransfers(this.segment(), index, value); return this; }

}
