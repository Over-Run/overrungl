// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureTrianglesOpacityMicromapEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkIndexType indexType;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR indexBuffer;
///     (uint64_t) VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const * ppUsageCounts;
///     (uint64_t) VkMicromapEXT micromap;
/// };
/// ```
public final class VkAccelerationStructureTrianglesOpacityMicromapEXT extends GroupType {
    /// The struct layout of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        ValueLayout.JAVA_LONG.withName("micromap")
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
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexBuffer`.
    public static final long OFFSET_indexBuffer = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
    /// The memory layout of `indexBuffer`.
    public static final MemoryLayout LAYOUT_indexBuffer = LAYOUT.select(PathElement.groupElement("indexBuffer"));
    /// The byte offset of `indexStride`.
    public static final long OFFSET_indexStride = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
    /// The memory layout of `indexStride`.
    public static final MemoryLayout LAYOUT_indexStride = LAYOUT.select(PathElement.groupElement("indexStride"));
    /// The [VarHandle] of `indexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));
    /// The byte offset of `baseTriangle`.
    public static final long OFFSET_baseTriangle = LAYOUT.byteOffset(PathElement.groupElement("baseTriangle"));
    /// The memory layout of `baseTriangle`.
    public static final MemoryLayout LAYOUT_baseTriangle = LAYOUT.select(PathElement.groupElement("baseTriangle"));
    /// The [VarHandle] of `baseTriangle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseTriangle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseTriangle"));
    /// The byte offset of `usageCountsCount`.
    public static final long OFFSET_usageCountsCount = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
    /// The memory layout of `usageCountsCount`.
    public static final MemoryLayout LAYOUT_usageCountsCount = LAYOUT.select(PathElement.groupElement("usageCountsCount"));
    /// The [VarHandle] of `usageCountsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    /// The byte offset of `pUsageCounts`.
    public static final long OFFSET_pUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
    /// The memory layout of `pUsageCounts`.
    public static final MemoryLayout LAYOUT_pUsageCounts = LAYOUT.select(PathElement.groupElement("pUsageCounts"));
    /// The [VarHandle] of `pUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    /// The byte offset of `ppUsageCounts`.
    public static final long OFFSET_ppUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
    /// The memory layout of `ppUsageCounts`.
    public static final MemoryLayout LAYOUT_ppUsageCounts = LAYOUT.select(PathElement.groupElement("ppUsageCounts"));
    /// The [VarHandle] of `ppUsageCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    /// The byte offset of `micromap`.
    public static final long OFFSET_micromap = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
    /// The memory layout of `micromap`.
    public static final MemoryLayout LAYOUT_micromap = LAYOUT.select(PathElement.groupElement("micromap"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureTrianglesOpacityMicromapEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureTrianglesOpacityMicromapEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT copyFrom(VkAccelerationStructureTrianglesOpacityMicromapEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureTrianglesOpacityMicromapEXT reinterpret(long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexType(MemorySegment segment, long index) { return (int) VH_indexType.get(segment, 0L, index); }
    /// {@return `indexType`}
    public int indexType() { return indexType(this.segment(), 0L); }
    /// Sets `indexType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexType(MemorySegment segment, long index, int value) { VH_indexType.set(segment, 0L, index, value); }
    /// Sets `indexType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment indexBuffer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer); }
    /// {@return `indexBuffer`}
    public MemorySegment indexBuffer() { return indexBuffer(this.segment(), 0L); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexBuffer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer.byteSize()); }
    /// Sets `indexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(MemorySegment value) { indexBuffer(this.segment(), 0L, value); return this; }
    /// Accepts `indexBuffer` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexBuffer())); return this; }

    /// {@return `indexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indexStride(MemorySegment segment, long index) { return (long) VH_indexStride.get(segment, 0L, index); }
    /// {@return `indexStride`}
    public long indexStride() { return indexStride(this.segment(), 0L); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexStride(MemorySegment segment, long index, long value) { VH_indexStride.set(segment, 0L, index, value); }
    /// Sets `indexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(long value) { indexStride(this.segment(), 0L, value); return this; }

    /// {@return `baseTriangle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseTriangle(MemorySegment segment, long index) { return (int) VH_baseTriangle.get(segment, 0L, index); }
    /// {@return `baseTriangle`}
    public int baseTriangle() { return baseTriangle(this.segment(), 0L); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseTriangle(MemorySegment segment, long index, int value) { VH_baseTriangle.set(segment, 0L, index, value); }
    /// Sets `baseTriangle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(int value) { baseTriangle(this.segment(), 0L, value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usageCountsCount(MemorySegment segment, long index) { return (int) VH_usageCountsCount.get(segment, 0L, index); }
    /// {@return `usageCountsCount`}
    public int usageCountsCount() { return usageCountsCount(this.segment(), 0L); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usageCountsCount(MemorySegment segment, long index, int value) { VH_usageCountsCount.set(segment, 0L, index, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(int value) { usageCountsCount(this.segment(), 0L, value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_pUsageCounts.get(segment, 0L, index); }
    /// {@return `pUsageCounts`}
    public MemorySegment pUsageCounts() { return pUsageCounts(this.segment(), 0L); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUsageCounts(MemorySegment segment, long index, MemorySegment value) { VH_pUsageCounts.set(segment, 0L, index, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(MemorySegment value) { pUsageCounts(this.segment(), 0L, value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppUsageCounts(MemorySegment segment, long index) { return (MemorySegment) VH_ppUsageCounts.get(segment, 0L, index); }
    /// {@return `ppUsageCounts`}
    public MemorySegment ppUsageCounts() { return ppUsageCounts(this.segment(), 0L); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppUsageCounts(MemorySegment segment, long index, MemorySegment value) { VH_ppUsageCounts.set(segment, 0L, index, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(MemorySegment value) { ppUsageCounts(this.segment(), 0L, value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long micromap(MemorySegment segment, long index) { return (long) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    public long micromap() { return micromap(this.segment(), 0L); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromap(MemorySegment segment, long index, long value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(long value) { micromap(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureTrianglesOpacityMicromapEXT`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureTrianglesOpacityMicromapEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT at(long index, Consumer<VkAccelerationStructureTrianglesOpacityMicromapEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeAt(long index) { return indexType(this.segment(), index); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment indexBufferAt(long index) { return indexBuffer(this.segment(), index); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBufferAt(long index, MemorySegment value) { indexBuffer(this.segment(), index, value); return this; }
    /// Accepts `indexBuffer` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBufferAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexBufferAt(index))); return this; }

    /// {@return `indexStride` at the given index}
    /// @param index the index of the struct buffer
    public long indexStrideAt(long index) { return indexStride(this.segment(), index); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStrideAt(long index, long value) { indexStride(this.segment(), index, value); return this; }

    /// {@return `baseTriangle` at the given index}
    /// @param index the index of the struct buffer
    public int baseTriangleAt(long index) { return baseTriangle(this.segment(), index); }
    /// Sets `baseTriangle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangleAt(long index, int value) { baseTriangle(this.segment(), index, value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param index the index of the struct buffer
    public int usageCountsCountAt(long index) { return usageCountsCount(this.segment(), index); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCountAt(long index, int value) { usageCountsCount(this.segment(), index, value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUsageCountsAt(long index) { return pUsageCounts(this.segment(), index); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCountsAt(long index, MemorySegment value) { pUsageCounts(this.segment(), index, value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppUsageCountsAt(long index) { return ppUsageCounts(this.segment(), index); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCountsAt(long index, MemorySegment value) { ppUsageCounts(this.segment(), index, value); return this; }

    /// {@return `micromap` at the given index}
    /// @param index the index of the struct buffer
    public long micromapAt(long index) { return micromap(this.segment(), index); }
    /// Sets `micromap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromapAt(long index, long value) { micromap(this.segment(), index, value); return this; }

}
