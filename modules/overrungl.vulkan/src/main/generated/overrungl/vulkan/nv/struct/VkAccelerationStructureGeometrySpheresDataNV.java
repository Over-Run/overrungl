// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometrySpheresDataNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometrySpheresDataNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkFormat vertexFormat;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR vertexData;
///     (uint64_t) VkDeviceSize vertexStride;
///     (int) VkFormat radiusFormat;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR radiusData;
///     (uint64_t) VkDeviceSize radiusStride;
///     (int) VkIndexType indexType;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR indexData;
///     (uint64_t) VkDeviceSize indexStride;
/// };
/// ```
public final class VkAccelerationStructureGeometrySpheresDataNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureGeometrySpheresDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("radiusFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("radiusData"),
        ValueLayout.JAVA_LONG.withName("radiusStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexStride")
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
    /// The byte offset of `vertexData`.
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    /// The memory layout of `vertexData`.
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    /// The byte offset of `vertexStride`.
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    /// The memory layout of `vertexStride`.
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    /// The [VarHandle] of `vertexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    /// The byte offset of `radiusFormat`.
    public static final long OFFSET_radiusFormat = LAYOUT.byteOffset(PathElement.groupElement("radiusFormat"));
    /// The memory layout of `radiusFormat`.
    public static final MemoryLayout LAYOUT_radiusFormat = LAYOUT.select(PathElement.groupElement("radiusFormat"));
    /// The [VarHandle] of `radiusFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_radiusFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusFormat"));
    /// The byte offset of `radiusData`.
    public static final long OFFSET_radiusData = LAYOUT.byteOffset(PathElement.groupElement("radiusData"));
    /// The memory layout of `radiusData`.
    public static final MemoryLayout LAYOUT_radiusData = LAYOUT.select(PathElement.groupElement("radiusData"));
    /// The byte offset of `radiusStride`.
    public static final long OFFSET_radiusStride = LAYOUT.byteOffset(PathElement.groupElement("radiusStride"));
    /// The memory layout of `radiusStride`.
    public static final MemoryLayout LAYOUT_radiusStride = LAYOUT.select(PathElement.groupElement("radiusStride"));
    /// The [VarHandle] of `radiusStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_radiusStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusStride"));
    /// The byte offset of `indexType`.
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    /// The memory layout of `indexType`.
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    /// The [VarHandle] of `indexType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    /// The byte offset of `indexData`.
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    /// The memory layout of `indexData`.
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    /// The byte offset of `indexStride`.
    public static final long OFFSET_indexStride = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
    /// The memory layout of `indexStride`.
    public static final MemoryLayout LAYOUT_indexStride = LAYOUT.select(PathElement.groupElement("indexStride"));
    /// The [VarHandle] of `indexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));

    /// Creates `VkAccelerationStructureGeometrySpheresDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureGeometrySpheresDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureGeometrySpheresDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometrySpheresDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometrySpheresDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometrySpheresDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureGeometrySpheresDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometrySpheresDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureGeometrySpheresDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometrySpheresDataNV`
    public static VkAccelerationStructureGeometrySpheresDataNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometrySpheresDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureGeometrySpheresDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometrySpheresDataNV`
    public static VkAccelerationStructureGeometrySpheresDataNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometrySpheresDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV copyFrom(VkAccelerationStructureGeometrySpheresDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureGeometrySpheresDataNV reinterpret(long count) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureGeometrySpheresDataNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureGeometrySpheresDataNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormat(int value) { vertexFormat(this.segment(), 0L, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vertexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    /// {@return `vertexData`}
    public MemorySegment vertexData() { return vertexData(this.segment(), 0L); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData.byteSize()); }
    /// Sets `vertexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(MemorySegment value) { vertexData(this.segment(), 0L, value); return this; }
    /// Accepts `vertexData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(vertexData())); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vertexStride(MemorySegment segment, long index) { return (long) VH_vertexStride.get(segment, 0L, index); }
    /// {@return `vertexStride`}
    public long vertexStride() { return vertexStride(this.segment(), 0L); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexStride(MemorySegment segment, long index, long value) { VH_vertexStride.set(segment, 0L, index, value); }
    /// Sets `vertexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexStride(long value) { vertexStride(this.segment(), 0L, value); return this; }

    /// {@return `radiusFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int radiusFormat(MemorySegment segment, long index) { return (int) VH_radiusFormat.get(segment, 0L, index); }
    /// {@return `radiusFormat`}
    public int radiusFormat() { return radiusFormat(this.segment(), 0L); }
    /// Sets `radiusFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void radiusFormat(MemorySegment segment, long index, int value) { VH_radiusFormat.set(segment, 0L, index, value); }
    /// Sets `radiusFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormat(int value) { radiusFormat(this.segment(), 0L, value); return this; }

    /// {@return `radiusData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment radiusData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_radiusData, index), LAYOUT_radiusData); }
    /// {@return `radiusData`}
    public MemorySegment radiusData() { return radiusData(this.segment(), 0L); }
    /// Sets `radiusData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void radiusData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_radiusData, index), LAYOUT_radiusData.byteSize()); }
    /// Sets `radiusData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(MemorySegment value) { radiusData(this.segment(), 0L, value); return this; }
    /// Accepts `radiusData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(radiusData())); return this; }

    /// {@return `radiusStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long radiusStride(MemorySegment segment, long index) { return (long) VH_radiusStride.get(segment, 0L, index); }
    /// {@return `radiusStride`}
    public long radiusStride() { return radiusStride(this.segment(), 0L); }
    /// Sets `radiusStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void radiusStride(MemorySegment segment, long index, long value) { VH_radiusStride.set(segment, 0L, index, value); }
    /// Sets `radiusStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusStride(long value) { radiusStride(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureGeometrySpheresDataNV indexType(int value) { indexType(this.segment(), 0L, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment indexData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    /// {@return `indexData`}
    public MemorySegment indexData() { return indexData(this.segment(), 0L); }
    /// Sets `indexData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData.byteSize()); }
    /// Sets `indexData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexData(MemorySegment value) { indexData(this.segment(), 0L, value); return this; }
    /// Accepts `indexData` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexData(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexData())); return this; }

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
    public VkAccelerationStructureGeometrySpheresDataNV indexStride(long value) { indexStride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureGeometrySpheresDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureGeometrySpheresDataNV`
    public VkAccelerationStructureGeometrySpheresDataNV asSlice(long index) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureGeometrySpheresDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureGeometrySpheresDataNV`
    public VkAccelerationStructureGeometrySpheresDataNV asSlice(long index, long count) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureGeometrySpheresDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV at(long index, Consumer<VkAccelerationStructureGeometrySpheresDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexFormat` at the given index}
    /// @param index the index of the struct buffer
    public int vertexFormatAt(long index) { return vertexFormat(this.segment(), index); }
    /// Sets `vertexFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormatAt(long index, int value) { vertexFormat(this.segment(), index, value); return this; }

    /// {@return `vertexData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vertexDataAt(long index) { return vertexData(this.segment(), index); }
    /// Sets `vertexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexDataAt(long index, MemorySegment value) { vertexData(this.segment(), index, value); return this; }
    /// Accepts `vertexData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(vertexDataAt(index))); return this; }

    /// {@return `vertexStride` at the given index}
    /// @param index the index of the struct buffer
    public long vertexStrideAt(long index) { return vertexStride(this.segment(), index); }
    /// Sets `vertexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV vertexStrideAt(long index, long value) { vertexStride(this.segment(), index, value); return this; }

    /// {@return `radiusFormat` at the given index}
    /// @param index the index of the struct buffer
    public int radiusFormatAt(long index) { return radiusFormat(this.segment(), index); }
    /// Sets `radiusFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormatAt(long index, int value) { radiusFormat(this.segment(), index, value); return this; }

    /// {@return `radiusData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment radiusDataAt(long index) { return radiusData(this.segment(), index); }
    /// Sets `radiusData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusDataAt(long index, MemorySegment value) { radiusData(this.segment(), index, value); return this; }
    /// Accepts `radiusData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(radiusDataAt(index))); return this; }

    /// {@return `radiusStride` at the given index}
    /// @param index the index of the struct buffer
    public long radiusStrideAt(long index) { return radiusStride(this.segment(), index); }
    /// Sets `radiusStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV radiusStrideAt(long index, long value) { radiusStride(this.segment(), index, value); return this; }

    /// {@return `indexType` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeAt(long index) { return indexType(this.segment(), index); }
    /// Sets `indexType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexTypeAt(long index, int value) { indexType(this.segment(), index, value); return this; }

    /// {@return `indexData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment indexDataAt(long index) { return indexData(this.segment(), index); }
    /// Sets `indexData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexDataAt(long index, MemorySegment value) { indexData(this.segment(), index, value); return this; }
    /// Accepts `indexData` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexDataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(indexDataAt(index))); return this; }

    /// {@return `indexStride` at the given index}
    /// @param index the index of the struct buffer
    public long indexStrideAt(long index) { return indexStride(this.segment(), index); }
    /// Sets `indexStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometrySpheresDataNV indexStrideAt(long index, long value) { indexStride(this.segment(), index, value); return this; }

}
