// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphOperationSupportARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphOperationSupportARM {
///     VkPhysicalDeviceDataGraphOperationTypeARM operationType;
///     char name[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM];
///     uint32_t version;
/// }
/// ```
public final class VkPhysicalDeviceDataGraphOperationSupportARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("operationType"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.arm.VKARMDataGraph.VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM, ValueLayout.JAVA_BYTE).withName("name"),
        ValueLayout.JAVA_INT.withName("version")
    );
    public static final long OFFSET_operationType = LAYOUT.byteOffset(PathElement.groupElement("operationType"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_version = LAYOUT.byteOffset(PathElement.groupElement("version"));
    public static final MemoryLayout LAYOUT_operationType = LAYOUT.select(PathElement.groupElement("operationType"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_version = LAYOUT.select(PathElement.groupElement("version"));
    public static final VarHandle VH_operationType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operationType"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_version = LAYOUT.arrayElementVarHandle(PathElement.groupElement("version"));

    public VkPhysicalDeviceDataGraphOperationSupportARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDataGraphOperationSupportARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDataGraphOperationSupportARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDataGraphOperationSupportARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDataGraphOperationSupportARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphOperationSupportARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDataGraphOperationSupportARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceDataGraphOperationSupportARM copyFrom(VkPhysicalDeviceDataGraphOperationSupportARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDataGraphOperationSupportARM asSlice(long index) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDataGraphOperationSupportARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphOperationSupportARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDataGraphOperationSupportARM at(long index, Consumer<VkPhysicalDeviceDataGraphOperationSupportARM> func) { func.accept(asSlice(index)); return this; }
    public int operationTypeAt(long index) { return (int) VH_operationType.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public int versionAt(long index) { return (int) VH_version.get(this.segment(), 0L, index); }
    public int operationType() { return (int) VH_operationType.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public int version() { return (int) VH_version.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDataGraphOperationSupportARM operationTypeAt(long index, int value) { VH_operationType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM versionAt(long index, int value) { VH_version.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM operationType(int value) { VH_operationType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM version(int value) { VH_version.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _operationTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_operationType, index), LAYOUT_operationType); }
    public MemorySegment _operationType() { return _operationTypeAt(0L); }
    public VkPhysicalDeviceDataGraphOperationSupportARM _operationTypeAt(long index, MemorySegment src) { _operationTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM _operationType(MemorySegment src) { return _operationTypeAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPhysicalDeviceDataGraphOperationSupportARM _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _versionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_version, index), LAYOUT_version); }
    public MemorySegment _version() { return _versionAt(0L); }
    public VkPhysicalDeviceDataGraphOperationSupportARM _versionAt(long index, MemorySegment src) { _versionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphOperationSupportARM _version(MemorySegment src) { return _versionAt(0L, src); }
}
