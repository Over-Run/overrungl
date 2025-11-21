// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceCounterKHR`.
/// ## Layout
/// ```
/// struct VkPerformanceCounterKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPerformanceCounterUnitKHR unit;
///     VkPerformanceCounterScopeKHR scope;
///     VkPerformanceCounterStorageKHR storage;
///     uint8_t uuid[VK_UUID_SIZE];
/// }
/// ```
public final class VkPerformanceCounterKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("uuid")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_unit = LAYOUT.byteOffset(PathElement.groupElement("unit"));
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    public static final long OFFSET_storage = LAYOUT.byteOffset(PathElement.groupElement("storage"));
    public static final long OFFSET_uuid = LAYOUT.byteOffset(PathElement.groupElement("uuid"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_unit = LAYOUT.select(PathElement.groupElement("unit"));
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    public static final MemoryLayout LAYOUT_storage = LAYOUT.select(PathElement.groupElement("storage"));
    public static final MemoryLayout LAYOUT_uuid = LAYOUT.select(PathElement.groupElement("uuid"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_unit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unit"));
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    public static final VarHandle VH_storage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storage"));
    public static final VarHandle VH_uuid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uuid"), PathElement.sequenceElement());

    public VkPerformanceCounterKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceCounterKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceCounterKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceCounterKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceCounterKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR); }
    public static VkPerformanceCounterKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR);
        return s;
    }
    public VkPerformanceCounterKHR copyFrom(VkPerformanceCounterKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceCounterKHR reinterpret(long count) { return new VkPerformanceCounterKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceCounterKHR asSlice(long index) { return new VkPerformanceCounterKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceCounterKHR asSlice(long index, long count) { return new VkPerformanceCounterKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceCounterKHR at(long index, Consumer<VkPerformanceCounterKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int unitAt(long index) { return (int) VH_unit.get(this.segment(), 0L, index); }
    public int scopeAt(long index) { return (int) VH_scope.get(this.segment(), 0L, index); }
    public int storageAt(long index) { return (int) VH_storage.get(this.segment(), 0L, index); }
    public byte uuidAt(long index, long index0) { return (byte) VH_uuid.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int unit() { return (int) VH_unit.get(this.segment(), 0L, 0L); }
    public int scope() { return (int) VH_scope.get(this.segment(), 0L, 0L); }
    public int storage() { return (int) VH_storage.get(this.segment(), 0L, 0L); }
    public byte uuid(long index0) { return (byte) VH_uuid.get(this.segment(), 0L, 0L, index0); }
    public VkPerformanceCounterKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterKHR unitAt(long index, int value) { VH_unit.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterKHR scopeAt(long index, int value) { VH_scope.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterKHR storageAt(long index, int value) { VH_storage.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterKHR uuidAt(long index, long index0, byte value) { VH_uuid.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPerformanceCounterKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterKHR unit(int value) { VH_unit.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterKHR scope(int value) { VH_scope.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterKHR storage(int value) { VH_storage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterKHR uuid(long index0, byte value) { VH_uuid.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceCounterKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceCounterKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _unitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_unit, index), LAYOUT_unit); }
    public MemorySegment _unit() { return _unitAt(0L); }
    public VkPerformanceCounterKHR _unitAt(long index, MemorySegment src) { _unitAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _unit(MemorySegment src) { return _unitAt(0L, src); }
    public MemorySegment _scopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scope, index), LAYOUT_scope); }
    public MemorySegment _scope() { return _scopeAt(0L); }
    public VkPerformanceCounterKHR _scopeAt(long index, MemorySegment src) { _scopeAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _scope(MemorySegment src) { return _scopeAt(0L, src); }
    public MemorySegment _storageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storage, index), LAYOUT_storage); }
    public MemorySegment _storage() { return _storageAt(0L); }
    public VkPerformanceCounterKHR _storageAt(long index, MemorySegment src) { _storageAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _storage(MemorySegment src) { return _storageAt(0L, src); }
    public MemorySegment _uuidAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uuid, index), LAYOUT_uuid); }
    public MemorySegment _uuid() { return _uuidAt(0L); }
    public VkPerformanceCounterKHR _uuidAt(long index, MemorySegment src) { _uuidAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterKHR _uuid(MemorySegment src) { return _uuidAt(0L, src); }
}
