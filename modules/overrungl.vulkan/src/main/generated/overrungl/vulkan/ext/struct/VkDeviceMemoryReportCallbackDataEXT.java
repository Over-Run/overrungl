// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceMemoryReportCallbackDataEXT`.
/// ## Layout
/// ```
/// struct VkDeviceMemoryReportCallbackDataEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkDeviceMemoryReportFlagsEXT flags;
///     (int) VkDeviceMemoryReportEventTypeEXT type;
///     uint64_t memoryObjectId;
///     (uint64_t) VkDeviceSize size;
///     (int) VkObjectType objectType;
///     uint64_t objectHandle;
///     uint32_t heapIndex;
/// };
/// ```
public final class VkDeviceMemoryReportCallbackDataEXT extends GroupType {
    /// The struct layout of `VkDeviceMemoryReportCallbackDataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("memoryObjectId"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("heapIndex")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `memoryObjectId`.
    public static final long OFFSET_memoryObjectId = LAYOUT.byteOffset(PathElement.groupElement("memoryObjectId"));
    /// The memory layout of `memoryObjectId`.
    public static final MemoryLayout LAYOUT_memoryObjectId = LAYOUT.select(PathElement.groupElement("memoryObjectId"));
    /// The [VarHandle] of `memoryObjectId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryObjectId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryObjectId"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The byte offset of `objectHandle`.
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    /// The memory layout of `objectHandle`.
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The byte offset of `heapIndex`.
    public static final long OFFSET_heapIndex = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
    /// The memory layout of `heapIndex`.
    public static final MemoryLayout LAYOUT_heapIndex = LAYOUT.select(PathElement.groupElement("heapIndex"));
    /// The [VarHandle] of `heapIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceMemoryReportCallbackDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceMemoryReportCallbackDataEXT`
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceMemoryReportCallbackDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceMemoryReportCallbackDataEXT`
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT copyFrom(VkDeviceMemoryReportCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceMemoryReportCallbackDataEXT reinterpret(long count) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceMemoryReportCallbackDataEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceMemoryReportCallbackDataEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `memoryObjectId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memoryObjectId(MemorySegment segment, long index) { return (long) VH_memoryObjectId.get(segment, 0L, index); }
    /// {@return `memoryObjectId`}
    public long memoryObjectId() { return memoryObjectId(this.segment(), 0L); }
    /// Sets `memoryObjectId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryObjectId(MemorySegment segment, long index, long value) { VH_memoryObjectId.set(segment, 0L, index, value); }
    /// Sets `memoryObjectId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectId(long value) { memoryObjectId(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    public long objectHandle() { return objectHandle(this.segment(), 0L); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectHandle(MemorySegment segment, long index, long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectHandle(long value) { objectHandle(this.segment(), 0L, value); return this; }

    /// {@return `heapIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int heapIndex(MemorySegment segment, long index) { return (int) VH_heapIndex.get(segment, 0L, index); }
    /// {@return `heapIndex`}
    public int heapIndex() { return heapIndex(this.segment(), 0L); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void heapIndex(MemorySegment segment, long index, int value) { VH_heapIndex.set(segment, 0L, index, value); }
    /// Sets `heapIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT heapIndex(int value) { heapIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceMemoryReportCallbackDataEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceMemoryReportCallbackDataEXT`
    public VkDeviceMemoryReportCallbackDataEXT asSlice(long index) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceMemoryReportCallbackDataEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceMemoryReportCallbackDataEXT`
    public VkDeviceMemoryReportCallbackDataEXT asSlice(long index, long count) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceMemoryReportCallbackDataEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT at(long index, Consumer<VkDeviceMemoryReportCallbackDataEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `memoryObjectId` at the given index}
    /// @param index the index of the struct buffer
    public long memoryObjectIdAt(long index) { return memoryObjectId(this.segment(), index); }
    /// Sets `memoryObjectId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectIdAt(long index, long value) { memoryObjectId(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param index the index of the struct buffer
    public int objectTypeAt(long index) { return objectType(this.segment(), index); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param index the index of the struct buffer
    public long objectHandleAt(long index) { return objectHandle(this.segment(), index); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectHandleAt(long index, long value) { objectHandle(this.segment(), index, value); return this; }

    /// {@return `heapIndex` at the given index}
    /// @param index the index of the struct buffer
    public int heapIndexAt(long index) { return heapIndex(this.segment(), index); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT heapIndexAt(long index, int value) { heapIndex(this.segment(), index, value); return this; }

}
