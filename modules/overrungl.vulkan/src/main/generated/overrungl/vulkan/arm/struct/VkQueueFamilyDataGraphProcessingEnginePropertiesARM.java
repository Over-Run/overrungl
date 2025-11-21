// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`.
/// ## Layout
/// ```
/// struct VkQueueFamilyDataGraphProcessingEnginePropertiesARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalSemaphoreHandleTypeFlags foreignSemaphoreHandleTypes;
///     VkExternalMemoryHandleTypeFlags foreignMemoryHandleTypes;
/// }
/// ```
public final class VkQueueFamilyDataGraphProcessingEnginePropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("foreignSemaphoreHandleTypes"),
        ValueLayout.JAVA_INT.withName("foreignMemoryHandleTypes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_foreignSemaphoreHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    public static final long OFFSET_foreignMemoryHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("foreignMemoryHandleTypes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_foreignSemaphoreHandleTypes = LAYOUT.select(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    public static final MemoryLayout LAYOUT_foreignMemoryHandleTypes = LAYOUT.select(PathElement.groupElement("foreignMemoryHandleTypes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_foreignSemaphoreHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    public static final VarHandle VH_foreignMemoryHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("foreignMemoryHandleTypes"));

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM alloc(SegmentAllocator allocator) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM); }
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM);
        return s;
    }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM copyFrom(VkQueueFamilyDataGraphProcessingEnginePropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM reinterpret(long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM asSlice(long index) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM asSlice(long index, long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM at(long index, Consumer<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int foreignSemaphoreHandleTypesAt(long index) { return (int) VH_foreignSemaphoreHandleTypes.get(this.segment(), 0L, index); }
    public int foreignMemoryHandleTypesAt(long index) { return (int) VH_foreignMemoryHandleTypes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int foreignSemaphoreHandleTypes() { return (int) VH_foreignSemaphoreHandleTypes.get(this.segment(), 0L, 0L); }
    public int foreignMemoryHandleTypes() { return (int) VH_foreignMemoryHandleTypes.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignSemaphoreHandleTypesAt(long index, int value) { VH_foreignSemaphoreHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignMemoryHandleTypesAt(long index, int value) { VH_foreignMemoryHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignSemaphoreHandleTypes(int value) { VH_foreignSemaphoreHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignMemoryHandleTypes(int value) { VH_foreignMemoryHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _foreignSemaphoreHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_foreignSemaphoreHandleTypes, index), LAYOUT_foreignSemaphoreHandleTypes); }
    public MemorySegment _foreignSemaphoreHandleTypes() { return _foreignSemaphoreHandleTypesAt(0L); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _foreignSemaphoreHandleTypesAt(long index, MemorySegment src) { _foreignSemaphoreHandleTypesAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _foreignSemaphoreHandleTypes(MemorySegment src) { return _foreignSemaphoreHandleTypesAt(0L, src); }
    public MemorySegment _foreignMemoryHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_foreignMemoryHandleTypes, index), LAYOUT_foreignMemoryHandleTypes); }
    public MemorySegment _foreignMemoryHandleTypes() { return _foreignMemoryHandleTypesAt(0L); }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _foreignMemoryHandleTypesAt(long index, MemorySegment src) { _foreignMemoryHandleTypesAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM _foreignMemoryHandleTypes(MemorySegment src) { return _foreignMemoryHandleTypesAt(0L, src); }
}
