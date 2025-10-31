// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureTriangleClusterInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureTriangleClusterInputNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFormat vertexFormat;
///     uint32_t maxGeometryIndexValue;
///     uint32_t maxClusterUniqueGeometryCount;
///     uint32_t maxClusterTriangleCount;
///     uint32_t maxClusterVertexCount;
///     uint32_t maxTotalTriangleCount;
///     uint32_t maxTotalVertexCount;
///     uint32_t minPositionTruncateBitCount;
/// };
/// ```
public final class VkClusterAccelerationStructureTriangleClusterInputNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureTriangleClusterInputNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.JAVA_INT.withName("maxGeometryIndexValue"),
        ValueLayout.JAVA_INT.withName("maxClusterUniqueGeometryCount"),
        ValueLayout.JAVA_INT.withName("maxClusterTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxClusterVertexCount"),
        ValueLayout.JAVA_INT.withName("maxTotalTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxTotalVertexCount"),
        ValueLayout.JAVA_INT.withName("minPositionTruncateBitCount")
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
    /// The byte offset of `vertexFormat`.
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    /// The memory layout of `vertexFormat`.
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    /// The [VarHandle] of `vertexFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    /// The byte offset of `maxGeometryIndexValue`.
    public static final long OFFSET_maxGeometryIndexValue = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryIndexValue"));
    /// The memory layout of `maxGeometryIndexValue`.
    public static final MemoryLayout LAYOUT_maxGeometryIndexValue = LAYOUT.select(PathElement.groupElement("maxGeometryIndexValue"));
    /// The [VarHandle] of `maxGeometryIndexValue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxGeometryIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryIndexValue"));
    /// The byte offset of `maxClusterUniqueGeometryCount`.
    public static final long OFFSET_maxClusterUniqueGeometryCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    /// The memory layout of `maxClusterUniqueGeometryCount`.
    public static final MemoryLayout LAYOUT_maxClusterUniqueGeometryCount = LAYOUT.select(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    /// The [VarHandle] of `maxClusterUniqueGeometryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterUniqueGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    /// The byte offset of `maxClusterTriangleCount`.
    public static final long OFFSET_maxClusterTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterTriangleCount"));
    /// The memory layout of `maxClusterTriangleCount`.
    public static final MemoryLayout LAYOUT_maxClusterTriangleCount = LAYOUT.select(PathElement.groupElement("maxClusterTriangleCount"));
    /// The [VarHandle] of `maxClusterTriangleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterTriangleCount"));
    /// The byte offset of `maxClusterVertexCount`.
    public static final long OFFSET_maxClusterVertexCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterVertexCount"));
    /// The memory layout of `maxClusterVertexCount`.
    public static final MemoryLayout LAYOUT_maxClusterVertexCount = LAYOUT.select(PathElement.groupElement("maxClusterVertexCount"));
    /// The [VarHandle] of `maxClusterVertexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxClusterVertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterVertexCount"));
    /// The byte offset of `maxTotalTriangleCount`.
    public static final long OFFSET_maxTotalTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalTriangleCount"));
    /// The memory layout of `maxTotalTriangleCount`.
    public static final MemoryLayout LAYOUT_maxTotalTriangleCount = LAYOUT.select(PathElement.groupElement("maxTotalTriangleCount"));
    /// The [VarHandle] of `maxTotalTriangleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTotalTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalTriangleCount"));
    /// The byte offset of `maxTotalVertexCount`.
    public static final long OFFSET_maxTotalVertexCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalVertexCount"));
    /// The memory layout of `maxTotalVertexCount`.
    public static final MemoryLayout LAYOUT_maxTotalVertexCount = LAYOUT.select(PathElement.groupElement("maxTotalVertexCount"));
    /// The [VarHandle] of `maxTotalVertexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTotalVertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalVertexCount"));
    /// The byte offset of `minPositionTruncateBitCount`.
    public static final long OFFSET_minPositionTruncateBitCount = LAYOUT.byteOffset(PathElement.groupElement("minPositionTruncateBitCount"));
    /// The memory layout of `minPositionTruncateBitCount`.
    public static final MemoryLayout LAYOUT_minPositionTruncateBitCount = LAYOUT.select(PathElement.groupElement("minPositionTruncateBitCount"));
    /// The [VarHandle] of `minPositionTruncateBitCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minPositionTruncateBitCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minPositionTruncateBitCount"));

    /// Creates `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureTriangleClusterInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureTriangleClusterInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureTriangleClusterInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureTriangleClusterInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureTriangleClusterInputNV`
    public static VkClusterAccelerationStructureTriangleClusterInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureTriangleClusterInputNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureTriangleClusterInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureTriangleClusterInputNV`
    public static VkClusterAccelerationStructureTriangleClusterInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV copyFrom(VkClusterAccelerationStructureTriangleClusterInputNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureTriangleClusterInputNV reinterpret(long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkClusterAccelerationStructureTriangleClusterInputNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureTriangleClusterInputNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexFormat(MemorySegment segment, long index) { return (int) VH_vertexFormat.get(segment, 0L, index); }
    /// {@return `vertexFormat`}
    public int vertexFormat() { return vertexFormat(this.segment(), 0L); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexFormat(MemorySegment segment, long index, int value) { VH_vertexFormat.set(segment, 0L, index, value); }
    /// Sets `vertexFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormat(int value) { vertexFormat(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryIndexValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryIndexValue(MemorySegment segment, long index) { return (int) VH_maxGeometryIndexValue.get(segment, 0L, index); }
    /// {@return `maxGeometryIndexValue`}
    public int maxGeometryIndexValue() { return maxGeometryIndexValue(this.segment(), 0L); }
    /// Sets `maxGeometryIndexValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryIndexValue(MemorySegment segment, long index, int value) { VH_maxGeometryIndexValue.set(segment, 0L, index, value); }
    /// Sets `maxGeometryIndexValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValue(int value) { maxGeometryIndexValue(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterUniqueGeometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterUniqueGeometryCount(MemorySegment segment, long index) { return (int) VH_maxClusterUniqueGeometryCount.get(segment, 0L, index); }
    /// {@return `maxClusterUniqueGeometryCount`}
    public int maxClusterUniqueGeometryCount() { return maxClusterUniqueGeometryCount(this.segment(), 0L); }
    /// Sets `maxClusterUniqueGeometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterUniqueGeometryCount(MemorySegment segment, long index, int value) { VH_maxClusterUniqueGeometryCount.set(segment, 0L, index, value); }
    /// Sets `maxClusterUniqueGeometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCount(int value) { maxClusterUniqueGeometryCount(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterTriangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterTriangleCount(MemorySegment segment, long index) { return (int) VH_maxClusterTriangleCount.get(segment, 0L, index); }
    /// {@return `maxClusterTriangleCount`}
    public int maxClusterTriangleCount() { return maxClusterTriangleCount(this.segment(), 0L); }
    /// Sets `maxClusterTriangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterTriangleCount(MemorySegment segment, long index, int value) { VH_maxClusterTriangleCount.set(segment, 0L, index, value); }
    /// Sets `maxClusterTriangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCount(int value) { maxClusterTriangleCount(this.segment(), 0L, value); return this; }

    /// {@return `maxClusterVertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClusterVertexCount(MemorySegment segment, long index) { return (int) VH_maxClusterVertexCount.get(segment, 0L, index); }
    /// {@return `maxClusterVertexCount`}
    public int maxClusterVertexCount() { return maxClusterVertexCount(this.segment(), 0L); }
    /// Sets `maxClusterVertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClusterVertexCount(MemorySegment segment, long index, int value) { VH_maxClusterVertexCount.set(segment, 0L, index, value); }
    /// Sets `maxClusterVertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCount(int value) { maxClusterVertexCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTotalTriangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTotalTriangleCount(MemorySegment segment, long index) { return (int) VH_maxTotalTriangleCount.get(segment, 0L, index); }
    /// {@return `maxTotalTriangleCount`}
    public int maxTotalTriangleCount() { return maxTotalTriangleCount(this.segment(), 0L); }
    /// Sets `maxTotalTriangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTotalTriangleCount(MemorySegment segment, long index, int value) { VH_maxTotalTriangleCount.set(segment, 0L, index, value); }
    /// Sets `maxTotalTriangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCount(int value) { maxTotalTriangleCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTotalVertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTotalVertexCount(MemorySegment segment, long index) { return (int) VH_maxTotalVertexCount.get(segment, 0L, index); }
    /// {@return `maxTotalVertexCount`}
    public int maxTotalVertexCount() { return maxTotalVertexCount(this.segment(), 0L); }
    /// Sets `maxTotalVertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTotalVertexCount(MemorySegment segment, long index, int value) { VH_maxTotalVertexCount.set(segment, 0L, index, value); }
    /// Sets `maxTotalVertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCount(int value) { maxTotalVertexCount(this.segment(), 0L, value); return this; }

    /// {@return `minPositionTruncateBitCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minPositionTruncateBitCount(MemorySegment segment, long index) { return (int) VH_minPositionTruncateBitCount.get(segment, 0L, index); }
    /// {@return `minPositionTruncateBitCount`}
    public int minPositionTruncateBitCount() { return minPositionTruncateBitCount(this.segment(), 0L); }
    /// Sets `minPositionTruncateBitCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minPositionTruncateBitCount(MemorySegment segment, long index, int value) { VH_minPositionTruncateBitCount.set(segment, 0L, index, value); }
    /// Sets `minPositionTruncateBitCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCount(int value) { minPositionTruncateBitCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureTriangleClusterInputNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureTriangleClusterInputNV`
    public VkClusterAccelerationStructureTriangleClusterInputNV asSlice(long index) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureTriangleClusterInputNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureTriangleClusterInputNV`
    public VkClusterAccelerationStructureTriangleClusterInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureTriangleClusterInputNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV at(long index, Consumer<VkClusterAccelerationStructureTriangleClusterInputNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param index the index of the struct buffer
    public int vertexFormatAt(long index) { return vertexFormat(this.segment(), index); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormatAt(long index, int value) { vertexFormat(this.segment(), index, value); return this; }

    /// {@return `maxGeometryIndexValue` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryIndexValueAt(long index) { return maxGeometryIndexValue(this.segment(), index); }
    /// Sets `maxGeometryIndexValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValueAt(long index, int value) { maxGeometryIndexValue(this.segment(), index, value); return this; }

    /// {@return `maxClusterUniqueGeometryCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxClusterUniqueGeometryCountAt(long index) { return maxClusterUniqueGeometryCount(this.segment(), index); }
    /// Sets `maxClusterUniqueGeometryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCountAt(long index, int value) { maxClusterUniqueGeometryCount(this.segment(), index, value); return this; }

    /// {@return `maxClusterTriangleCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxClusterTriangleCountAt(long index) { return maxClusterTriangleCount(this.segment(), index); }
    /// Sets `maxClusterTriangleCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCountAt(long index, int value) { maxClusterTriangleCount(this.segment(), index, value); return this; }

    /// {@return `maxClusterVertexCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxClusterVertexCountAt(long index) { return maxClusterVertexCount(this.segment(), index); }
    /// Sets `maxClusterVertexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCountAt(long index, int value) { maxClusterVertexCount(this.segment(), index, value); return this; }

    /// {@return `maxTotalTriangleCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTotalTriangleCountAt(long index) { return maxTotalTriangleCount(this.segment(), index); }
    /// Sets `maxTotalTriangleCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCountAt(long index, int value) { maxTotalTriangleCount(this.segment(), index, value); return this; }

    /// {@return `maxTotalVertexCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTotalVertexCountAt(long index) { return maxTotalVertexCount(this.segment(), index); }
    /// Sets `maxTotalVertexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCountAt(long index, int value) { maxTotalVertexCount(this.segment(), index, value); return this; }

    /// {@return `minPositionTruncateBitCount` at the given index}
    /// @param index the index of the struct buffer
    public int minPositionTruncateBitCountAt(long index) { return minPositionTruncateBitCount(this.segment(), index); }
    /// Sets `minPositionTruncateBitCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCountAt(long index, int value) { minPositionTruncateBitCount(this.segment(), index, value); return this; }

}
