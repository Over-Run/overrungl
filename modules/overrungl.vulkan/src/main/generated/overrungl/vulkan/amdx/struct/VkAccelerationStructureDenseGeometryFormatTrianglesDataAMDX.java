// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR compressedData;
///     (uint64_t) VkDeviceSize dataSize;
///     uint32_t numTriangles;
///     uint32_t numVertices;
///     uint32_t maxPrimitiveIndex;
///     uint32_t maxGeometryIndex;
///     (int) VkCompressedTriangleFormatAMDX format;
/// };
/// ```
public final class VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX extends GroupType {
    /// The struct layout of `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("compressedData"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.JAVA_INT.withName("numTriangles"),
        ValueLayout.JAVA_INT.withName("numVertices"),
        ValueLayout.JAVA_INT.withName("maxPrimitiveIndex"),
        ValueLayout.JAVA_INT.withName("maxGeometryIndex"),
        ValueLayout.JAVA_INT.withName("format")
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
    /// The byte offset of `compressedData`.
    public static final long OFFSET_compressedData = LAYOUT.byteOffset(PathElement.groupElement("compressedData"));
    /// The memory layout of `compressedData`.
    public static final MemoryLayout LAYOUT_compressedData = LAYOUT.select(PathElement.groupElement("compressedData"));
    /// The byte offset of `dataSize`.
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    /// The memory layout of `dataSize`.
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize")));
    /// The byte offset of `numTriangles`.
    public static final long OFFSET_numTriangles = LAYOUT.byteOffset(PathElement.groupElement("numTriangles"));
    /// The memory layout of `numTriangles`.
    public static final MemoryLayout LAYOUT_numTriangles = LAYOUT.select(PathElement.groupElement("numTriangles"));
    /// The [VarHandle] of `numTriangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_numTriangles = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("numTriangles")));
    /// The byte offset of `numVertices`.
    public static final long OFFSET_numVertices = LAYOUT.byteOffset(PathElement.groupElement("numVertices"));
    /// The memory layout of `numVertices`.
    public static final MemoryLayout LAYOUT_numVertices = LAYOUT.select(PathElement.groupElement("numVertices"));
    /// The [VarHandle] of `numVertices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_numVertices = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("numVertices")));
    /// The byte offset of `maxPrimitiveIndex`.
    public static final long OFFSET_maxPrimitiveIndex = LAYOUT.byteOffset(PathElement.groupElement("maxPrimitiveIndex"));
    /// The memory layout of `maxPrimitiveIndex`.
    public static final MemoryLayout LAYOUT_maxPrimitiveIndex = LAYOUT.select(PathElement.groupElement("maxPrimitiveIndex"));
    /// The [VarHandle] of `maxPrimitiveIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPrimitiveIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPrimitiveIndex")));
    /// The byte offset of `maxGeometryIndex`.
    public static final long OFFSET_maxGeometryIndex = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryIndex"));
    /// The memory layout of `maxGeometryIndex`.
    public static final MemoryLayout LAYOUT_maxGeometryIndex = LAYOUT.select(PathElement.groupElement("maxGeometryIndex"));
    /// The [VarHandle] of `maxGeometryIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryIndex")));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_format = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("format")));

    /// Creates `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX alloc(SegmentAllocator allocator) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX copyFrom(VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX reinterpret(long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `compressedData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment compressedData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_compressedData, index), LAYOUT_compressedData); }
    /// {@return `compressedData`}
    public MemorySegment compressedData() { return compressedData(this.segment(), 0L); }
    /// Sets `compressedData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compressedData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_compressedData, index), LAYOUT_compressedData.byteSize()); }
    /// Sets `compressedData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(MemorySegment value) { compressedData(this.segment(), 0L, value); return this; }
    /// Accepts `compressedData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(compressedData())); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get().get(segment, 0L, index); }
    /// {@return `dataSize`}
    public long dataSize() { return dataSize(this.segment(), 0L); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataSize(MemorySegment segment, long index, long value) { VH_dataSize.get().set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSize(long value) { dataSize(this.segment(), 0L, value); return this; }

    /// {@return `numTriangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numTriangles(MemorySegment segment, long index) { return (int) VH_numTriangles.get().get(segment, 0L, index); }
    /// {@return `numTriangles`}
    public int numTriangles() { return numTriangles(this.segment(), 0L); }
    /// Sets `numTriangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numTriangles(MemorySegment segment, long index, int value) { VH_numTriangles.get().set(segment, 0L, index, value); }
    /// Sets `numTriangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTriangles(int value) { numTriangles(this.segment(), 0L, value); return this; }

    /// {@return `numVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numVertices(MemorySegment segment, long index) { return (int) VH_numVertices.get().get(segment, 0L, index); }
    /// {@return `numVertices`}
    public int numVertices() { return numVertices(this.segment(), 0L); }
    /// Sets `numVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numVertices(MemorySegment segment, long index, int value) { VH_numVertices.get().set(segment, 0L, index, value); }
    /// Sets `numVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVertices(int value) { numVertices(this.segment(), 0L, value); return this; }

    /// {@return `maxPrimitiveIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPrimitiveIndex(MemorySegment segment, long index) { return (int) VH_maxPrimitiveIndex.get().get(segment, 0L, index); }
    /// {@return `maxPrimitiveIndex`}
    public int maxPrimitiveIndex() { return maxPrimitiveIndex(this.segment(), 0L); }
    /// Sets `maxPrimitiveIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPrimitiveIndex(MemorySegment segment, long index, int value) { VH_maxPrimitiveIndex.get().set(segment, 0L, index, value); }
    /// Sets `maxPrimitiveIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndex(int value) { maxPrimitiveIndex(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryIndex(MemorySegment segment, long index) { return (int) VH_maxGeometryIndex.get().get(segment, 0L, index); }
    /// {@return `maxGeometryIndex`}
    public int maxGeometryIndex() { return maxGeometryIndex(this.segment(), 0L); }
    /// Sets `maxGeometryIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryIndex(MemorySegment segment, long index, int value) { VH_maxGeometryIndex.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndex(int value) { maxGeometryIndex(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get().get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.get().set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX format(int value) { format(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX asSlice(long index) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX asSlice(long index, long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX at(long index, Consumer<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `compressedData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment compressedDataAt(long index) { return compressedData(this.segment(), index); }
    /// Sets `compressedData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedDataAt(long index, MemorySegment value) { compressedData(this.segment(), index, value); return this; }
    /// Accepts `compressedData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(compressedDataAt(index))); return this; }

    /// {@return `dataSize` at the given index}
    /// @param index the index of the struct buffer
    public long dataSizeAt(long index) { return dataSize(this.segment(), index); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSizeAt(long index, long value) { dataSize(this.segment(), index, value); return this; }

    /// {@return `numTriangles` at the given index}
    /// @param index the index of the struct buffer
    public int numTrianglesAt(long index) { return numTriangles(this.segment(), index); }
    /// Sets `numTriangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTrianglesAt(long index, int value) { numTriangles(this.segment(), index, value); return this; }

    /// {@return `numVertices` at the given index}
    /// @param index the index of the struct buffer
    public int numVerticesAt(long index) { return numVertices(this.segment(), index); }
    /// Sets `numVertices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVerticesAt(long index, int value) { numVertices(this.segment(), index, value); return this; }

    /// {@return `maxPrimitiveIndex` at the given index}
    /// @param index the index of the struct buffer
    public int maxPrimitiveIndexAt(long index) { return maxPrimitiveIndex(this.segment(), index); }
    /// Sets `maxPrimitiveIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndexAt(long index, int value) { maxPrimitiveIndex(this.segment(), index, value); return this; }

    /// {@return `maxGeometryIndex` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryIndexAt(long index) { return maxGeometryIndex(this.segment(), index); }
    /// Sets `maxGeometryIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndexAt(long index, int value) { maxGeometryIndex(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX formatAt(long index, int value) { format(this.segment(), index, value); return this; }

}
