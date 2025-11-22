// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyDataGraphPropertiesARM`.
/// ## Layout
/// ```
/// struct VkQueueFamilyDataGraphPropertiesARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkPhysicalDeviceDataGraphProcessingEngineARM engine;
///     VkPhysicalDeviceDataGraphOperationSupportARM operation;
/// }
/// ```
public final class VkQueueFamilyDataGraphPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM.LAYOUT.withName("engine"),
        overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM.LAYOUT.withName("operation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_engine = LAYOUT.byteOffset(PathElement.groupElement("engine"));
    public static final long OFFSET_operation = LAYOUT.byteOffset(PathElement.groupElement("operation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_engine = LAYOUT.select(PathElement.groupElement("engine"));
    public static final MemoryLayout LAYOUT_operation = LAYOUT.select(PathElement.groupElement("operation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_engine$type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engine"), PathElement.groupElement("type"));
    public static final VarHandle VH_engine$isForeign = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engine"), PathElement.groupElement("isForeign"));
    public static final VarHandle VH_operation$operationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operation"), PathElement.groupElement("operationType"));
    public static final VarHandle VH_operation$name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operation"), PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_operation$version = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operation"), PathElement.groupElement("version"));

    public VkQueueFamilyDataGraphPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyDataGraphPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyDataGraphPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyDataGraphPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyDataGraphPropertiesARM alloc(SegmentAllocator allocator) { return new VkQueueFamilyDataGraphPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyDataGraphPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyDataGraphPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM); }
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM);
        return s;
    }
    public VkQueueFamilyDataGraphPropertiesARM copyFrom(VkQueueFamilyDataGraphPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyDataGraphPropertiesARM reinterpret(long count) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyDataGraphPropertiesARM asSlice(long index) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyDataGraphPropertiesARM asSlice(long index, long count) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyDataGraphPropertiesARM at(long index, Consumer<VkQueueFamilyDataGraphPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int engine$typeAt(long index) { return (int) VH_engine$type.get(this.segment(), 0L, index); }
    public int engine$isForeignAt(long index) { return (int) VH_engine$isForeign.get(this.segment(), 0L, index); }
    public int operation$operationTypeAt(long index) { return (int) VH_operation$operationType.get(this.segment(), 0L, index); }
    public byte operation$nameAt(long index, long index0) { return (byte) VH_operation$name.get(this.segment(), 0L, index, index0); }
    public int operation$versionAt(long index) { return (int) VH_operation$version.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int engine$type() { return (int) VH_engine$type.get(this.segment(), 0L, 0L); }
    public int engine$isForeign() { return (int) VH_engine$isForeign.get(this.segment(), 0L, 0L); }
    public int operation$operationType() { return (int) VH_operation$operationType.get(this.segment(), 0L, 0L); }
    public byte operation$name(long index0) { return (byte) VH_operation$name.get(this.segment(), 0L, 0L, index0); }
    public int operation$version() { return (int) VH_operation$version.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyDataGraphPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM engine$typeAt(long index, int value) { VH_engine$type.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM engine$isForeignAt(long index, int value) { VH_engine$isForeign.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$operationTypeAt(long index, int value) { VH_operation$operationType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$nameAt(long index, long index0, byte value) { VH_operation$name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$versionAt(long index, int value) { VH_operation$version.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM engine$type(int value) { VH_engine$type.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM engine$isForeign(int value) { VH_engine$isForeign.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$operationType(int value) { VH_operation$operationType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$name(long index0, byte value) { VH_operation$name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkQueueFamilyDataGraphPropertiesARM operation$version(int value) { VH_operation$version.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyDataGraphPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyDataGraphPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _engineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_engine, index), LAYOUT_engine); }
    public MemorySegment _engine() { return _engineAt(0L); }
    public VkQueueFamilyDataGraphPropertiesARM _engineAt(long index, MemorySegment src) { _engineAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphPropertiesARM _engine(MemorySegment src) { return _engineAt(0L, src); }
    public MemorySegment _operationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_operation, index), LAYOUT_operation); }
    public MemorySegment _operation() { return _operationAt(0L); }
    public VkQueueFamilyDataGraphPropertiesARM _operationAt(long index, MemorySegment src) { _operationAt(index).copyFrom(src); return this; }
    public VkQueueFamilyDataGraphPropertiesARM _operation(MemorySegment src) { return _operationAt(0L, src); }
}
