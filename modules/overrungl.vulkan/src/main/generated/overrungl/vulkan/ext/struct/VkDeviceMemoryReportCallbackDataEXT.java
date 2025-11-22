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
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceMemoryReportFlagsEXT flags;
///     VkDeviceMemoryReportEventTypeEXT type;
///     uint64_t memoryObjectId;
///     VkDeviceSize size;
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     uint32_t heapIndex;
/// }
/// ```
public final class VkDeviceMemoryReportCallbackDataEXT extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_memoryObjectId = LAYOUT.byteOffset(PathElement.groupElement("memoryObjectId"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    public static final long OFFSET_heapIndex = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_memoryObjectId = LAYOUT.select(PathElement.groupElement("memoryObjectId"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    public static final MemoryLayout LAYOUT_heapIndex = LAYOUT.select(PathElement.groupElement("heapIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_memoryObjectId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryObjectId"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    public VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceMemoryReportCallbackDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceMemoryReportCallbackDataEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT); }
    public static VkDeviceMemoryReportCallbackDataEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT);
        return s;
    }
    public VkDeviceMemoryReportCallbackDataEXT copyFrom(VkDeviceMemoryReportCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceMemoryReportCallbackDataEXT reinterpret(long count) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceMemoryReportCallbackDataEXT asSlice(long index) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceMemoryReportCallbackDataEXT asSlice(long index, long count) { return new VkDeviceMemoryReportCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceMemoryReportCallbackDataEXT at(long index, Consumer<VkDeviceMemoryReportCallbackDataEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public long memoryObjectIdAt(long index) { return (long) VH_memoryObjectId.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int objectTypeAt(long index) { return (int) VH_objectType.get(this.segment(), 0L, index); }
    public long objectHandleAt(long index) { return (long) VH_objectHandle.get(this.segment(), 0L, index); }
    public int heapIndexAt(long index) { return (int) VH_heapIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public long memoryObjectId() { return (long) VH_memoryObjectId.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public int objectType() { return (int) VH_objectType.get(this.segment(), 0L, 0L); }
    public long objectHandle() { return (long) VH_objectHandle.get(this.segment(), 0L, 0L); }
    public int heapIndex() { return (int) VH_heapIndex.get(this.segment(), 0L, 0L); }
    public VkDeviceMemoryReportCallbackDataEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectIdAt(long index, long value) { VH_memoryObjectId.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT objectTypeAt(long index, int value) { VH_objectType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT objectHandleAt(long index, long value) { VH_objectHandle.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT heapIndexAt(long index, int value) { VH_heapIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectId(long value) { VH_memoryObjectId.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT objectType(int value) { VH_objectType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT objectHandle(long value) { VH_objectHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryReportCallbackDataEXT heapIndex(int value) { VH_heapIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _memoryObjectIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryObjectId, index), LAYOUT_memoryObjectId); }
    public MemorySegment _memoryObjectId() { return _memoryObjectIdAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _memoryObjectIdAt(long index, MemorySegment src) { _memoryObjectIdAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _memoryObjectId(MemorySegment src) { return _memoryObjectIdAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _objectTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectType, index), LAYOUT_objectType); }
    public MemorySegment _objectType() { return _objectTypeAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _objectTypeAt(long index, MemorySegment src) { _objectTypeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _objectType(MemorySegment src) { return _objectTypeAt(0L, src); }
    public MemorySegment _objectHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectHandle, index), LAYOUT_objectHandle); }
    public MemorySegment _objectHandle() { return _objectHandleAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _objectHandleAt(long index, MemorySegment src) { _objectHandleAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _objectHandle(MemorySegment src) { return _objectHandleAt(0L, src); }
    public MemorySegment _heapIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_heapIndex, index), LAYOUT_heapIndex); }
    public MemorySegment _heapIndex() { return _heapIndexAt(0L); }
    public VkDeviceMemoryReportCallbackDataEXT _heapIndexAt(long index, MemorySegment src) { _heapIndexAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryReportCallbackDataEXT _heapIndex(MemorySegment src) { return _heapIndexAt(0L, src); }
}
