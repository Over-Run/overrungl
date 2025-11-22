// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTensorFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTensorFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 tensorNonPacked;
///     VkBool32 shaderTensorAccess;
///     VkBool32 shaderStorageTensorArrayDynamicIndexing;
///     VkBool32 shaderStorageTensorArrayNonUniformIndexing;
///     VkBool32 descriptorBindingStorageTensorUpdateAfterBind;
///     VkBool32 tensors;
/// }
/// ```
public final class VkPhysicalDeviceTensorFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorNonPacked"),
        ValueLayout.JAVA_INT.withName("shaderTensorAccess"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTensorUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("tensors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensorNonPacked = LAYOUT.byteOffset(PathElement.groupElement("tensorNonPacked"));
    public static final long OFFSET_shaderTensorAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorAccess"));
    public static final long OFFSET_shaderStorageTensorArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    public static final long OFFSET_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    public static final long OFFSET_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    public static final long OFFSET_tensors = LAYOUT.byteOffset(PathElement.groupElement("tensors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensorNonPacked = LAYOUT.select(PathElement.groupElement("tensorNonPacked"));
    public static final MemoryLayout LAYOUT_shaderTensorAccess = LAYOUT.select(PathElement.groupElement("shaderTensorAccess"));
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_tensors = LAYOUT.select(PathElement.groupElement("tensors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensorNonPacked = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorNonPacked"));
    public static final VarHandle VH_shaderTensorAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTensorAccess"));
    public static final VarHandle VH_shaderStorageTensorArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    public static final VarHandle VH_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    public static final VarHandle VH_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    public static final VarHandle VH_tensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensors"));

    public VkPhysicalDeviceTensorFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTensorFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTensorFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTensorFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTensorFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTensorFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTensorFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTensorFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTensorFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM); }
    public static VkPhysicalDeviceTensorFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceTensorFeaturesARM copyFrom(VkPhysicalDeviceTensorFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTensorFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTensorFeaturesARM asSlice(long index) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTensorFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTensorFeaturesARM at(long index, Consumer<VkPhysicalDeviceTensorFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tensorNonPackedAt(long index) { return (int) VH_tensorNonPacked.get(this.segment(), 0L, index); }
    public int shaderTensorAccessAt(long index) { return (int) VH_shaderTensorAccess.get(this.segment(), 0L, index); }
    public int shaderStorageTensorArrayDynamicIndexingAt(long index) { return (int) VH_shaderStorageTensorArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageTensorArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageTensorArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageTensorUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageTensorUpdateAfterBind.get(this.segment(), 0L, index); }
    public int tensorsAt(long index) { return (int) VH_tensors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tensorNonPacked() { return (int) VH_tensorNonPacked.get(this.segment(), 0L, 0L); }
    public int shaderTensorAccess() { return (int) VH_shaderTensorAccess.get(this.segment(), 0L, 0L); }
    public int shaderStorageTensorArrayDynamicIndexing() { return (int) VH_shaderStorageTensorArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageTensorArrayNonUniformIndexing() { return (int) VH_shaderStorageTensorArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageTensorUpdateAfterBind() { return (int) VH_descriptorBindingStorageTensorUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int tensors() { return (int) VH_tensors.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTensorFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPackedAt(long index, int value) { VH_tensorNonPacked.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccessAt(long index, int value) { VH_shaderTensorAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexingAt(long index, int value) { VH_shaderStorageTensorArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageTensorArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageTensorUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM tensorsAt(long index, int value) { VH_tensors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPacked(int value) { VH_tensorNonPacked.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccess(int value) { VH_shaderTensorAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexing(int value) { VH_shaderStorageTensorArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexing(int value) { VH_shaderStorageTensorArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBind(int value) { VH_descriptorBindingStorageTensorUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorFeaturesARM tensors(int value) { VH_tensors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorNonPackedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorNonPacked, index), LAYOUT_tensorNonPacked); }
    public MemorySegment _tensorNonPacked() { return _tensorNonPackedAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _tensorNonPackedAt(long index, MemorySegment src) { _tensorNonPackedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _tensorNonPacked(MemorySegment src) { return _tensorNonPackedAt(0L, src); }
    public MemorySegment _shaderTensorAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTensorAccess, index), LAYOUT_shaderTensorAccess); }
    public MemorySegment _shaderTensorAccess() { return _shaderTensorAccessAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _shaderTensorAccessAt(long index, MemorySegment src) { _shaderTensorAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _shaderTensorAccess(MemorySegment src) { return _shaderTensorAccessAt(0L, src); }
    public MemorySegment _shaderStorageTensorArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTensorArrayDynamicIndexing, index), LAYOUT_shaderStorageTensorArrayDynamicIndexing); }
    public MemorySegment _shaderStorageTensorArrayDynamicIndexing() { return _shaderStorageTensorArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _shaderStorageTensorArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderStorageTensorArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _shaderStorageTensorArrayDynamicIndexing(MemorySegment src) { return _shaderStorageTensorArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderStorageTensorArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTensorArrayNonUniformIndexing, index), LAYOUT_shaderStorageTensorArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageTensorArrayNonUniformIndexing() { return _shaderStorageTensorArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _shaderStorageTensorArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageTensorArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _shaderStorageTensorArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageTensorArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _descriptorBindingStorageTensorUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageTensorUpdateAfterBind, index), LAYOUT_descriptorBindingStorageTensorUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageTensorUpdateAfterBind() { return _descriptorBindingStorageTensorUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _descriptorBindingStorageTensorUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageTensorUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _descriptorBindingStorageTensorUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageTensorUpdateAfterBindAt(0L, src); }
    public MemorySegment _tensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensors, index), LAYOUT_tensors); }
    public MemorySegment _tensors() { return _tensorsAt(0L); }
    public VkPhysicalDeviceTensorFeaturesARM _tensorsAt(long index, MemorySegment src) { _tensorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorFeaturesARM _tensors(MemorySegment src) { return _tensorsAt(0L, src); }
}
