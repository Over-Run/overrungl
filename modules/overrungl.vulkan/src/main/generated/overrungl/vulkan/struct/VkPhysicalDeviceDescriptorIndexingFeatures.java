// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorIndexingFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorIndexingFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderInputAttachmentArrayDynamicIndexing;
///     VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
///     VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
///     VkBool32 shaderUniformBufferArrayNonUniformIndexing;
///     VkBool32 shaderSampledImageArrayNonUniformIndexing;
///     VkBool32 shaderStorageBufferArrayNonUniformIndexing;
///     VkBool32 shaderStorageImageArrayNonUniformIndexing;
///     VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
///     VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
///     VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
///     VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
///     VkBool32 descriptorBindingSampledImageUpdateAfterBind;
///     VkBool32 descriptorBindingStorageImageUpdateAfterBind;
///     VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
///     VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
///     VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
///     VkBool32 descriptorBindingUpdateUnusedWhilePending;
///     VkBool32 descriptorBindingPartiallyBound;
///     VkBool32 descriptorBindingVariableDescriptorCount;
///     VkBool32 runtimeDescriptorArray;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorIndexingFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
        ValueLayout.JAVA_INT.withName("descriptorBindingPartiallyBound"),
        ValueLayout.JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
        ValueLayout.JAVA_INT.withName("runtimeDescriptorArray")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final long OFFSET_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final long OFFSET_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final long OFFSET_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingUpdateUnusedWhilePending = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final long OFFSET_descriptorBindingPartiallyBound = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final long OFFSET_descriptorBindingVariableDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final long OFFSET_runtimeDescriptorArray = LAYOUT.byteOffset(PathElement.groupElement("runtimeDescriptorArray"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingUpdateUnusedWhilePending = LAYOUT.select(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final MemoryLayout LAYOUT_descriptorBindingPartiallyBound = LAYOUT.select(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final MemoryLayout LAYOUT_descriptorBindingVariableDescriptorCount = LAYOUT.select(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final MemoryLayout LAYOUT_runtimeDescriptorArray = LAYOUT.select(PathElement.groupElement("runtimeDescriptorArray"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final VarHandle VH_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingUpdateUnusedWhilePending = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final VarHandle VH_descriptorBindingPartiallyBound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final VarHandle VH_descriptorBindingVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final VarHandle VH_runtimeDescriptorArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("runtimeDescriptorArray"));

    public VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorIndexingFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES); }
    public static VkPhysicalDeviceDescriptorIndexingFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES);
        return s;
    }
    public VkPhysicalDeviceDescriptorIndexingFeatures copyFrom(VkPhysicalDeviceDescriptorIndexingFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures reinterpret(long count) { return new VkPhysicalDeviceDescriptorIndexingFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorIndexingFeatures asSlice(long index) { return new VkPhysicalDeviceDescriptorIndexingFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorIndexingFeatures asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorIndexingFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorIndexingFeatures at(long index, Consumer<VkPhysicalDeviceDescriptorIndexingFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderSampledImageArrayNonUniformIndexingAt(long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageImageArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(this.segment(), 0L, index); }
    public int descriptorBindingPartiallyBoundAt(long index) { return (int) VH_descriptorBindingPartiallyBound.get(this.segment(), 0L, index); }
    public int descriptorBindingVariableDescriptorCountAt(long index) { return (int) VH_descriptorBindingVariableDescriptorCount.get(this.segment(), 0L, index); }
    public int runtimeDescriptorArrayAt(long index) { return (int) VH_runtimeDescriptorArray.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayDynamicIndexing() { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformTexelBufferArrayDynamicIndexing() { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageTexelBufferArrayDynamicIndexing() { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferArrayNonUniformIndexing() { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderSampledImageArrayNonUniformIndexing() { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageBufferArrayNonUniformIndexing() { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageArrayNonUniformIndexing() { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayNonUniformIndexing() { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformTexelBufferArrayNonUniformIndexing() { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageTexelBufferArrayNonUniformIndexing() { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUniformBufferUpdateAfterBind() { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingSampledImageUpdateAfterBind() { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageImageUpdateAfterBind() { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageBufferUpdateAfterBind() { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUniformTexelBufferUpdateAfterBind() { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageTexelBufferUpdateAfterBind() { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUpdateUnusedWhilePending() { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(this.segment(), 0L, 0L); }
    public int descriptorBindingPartiallyBound() { return (int) VH_descriptorBindingPartiallyBound.get(this.segment(), 0L, 0L); }
    public int descriptorBindingVariableDescriptorCount() { return (int) VH_descriptorBindingVariableDescriptorCount.get(this.segment(), 0L, 0L); }
    public int runtimeDescriptorArray() { return (int) VH_runtimeDescriptorArray.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexingAt(long index, int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexingAt(long index, int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexingAt(long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBindAt(long index, int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePendingAt(long index, int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBoundAt(long index, int value) { VH_descriptorBindingPartiallyBound.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCountAt(long index, int value) { VH_descriptorBindingVariableDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArrayAt(long index, int value) { VH_runtimeDescriptorArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(int value) { VH_descriptorBindingPartiallyBound.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(int value) { VH_descriptorBindingVariableDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(int value) { VH_runtimeDescriptorArray.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayDynamicIndexing, index), LAYOUT_shaderInputAttachmentArrayDynamicIndexing); }
    public MemorySegment _shaderInputAttachmentArrayDynamicIndexing() { return _shaderInputAttachmentArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderInputAttachmentArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderInputAttachmentArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderInputAttachmentArrayDynamicIndexing(MemorySegment src) { return _shaderInputAttachmentArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformTexelBufferArrayDynamicIndexing, index), LAYOUT_shaderUniformTexelBufferArrayDynamicIndexing); }
    public MemorySegment _shaderUniformTexelBufferArrayDynamicIndexing() { return _shaderUniformTexelBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformTexelBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderUniformTexelBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment src) { return _shaderUniformTexelBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTexelBufferArrayDynamicIndexing, index), LAYOUT_shaderStorageTexelBufferArrayDynamicIndexing); }
    public MemorySegment _shaderStorageTexelBufferArrayDynamicIndexing() { return _shaderStorageTexelBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageTexelBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderStorageTexelBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment src) { return _shaderStorageTexelBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferArrayNonUniformIndexing, index), LAYOUT_shaderUniformBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexing() { return _shaderUniformBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderUniformBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderUniformBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampledImageArrayNonUniformIndexing, index), LAYOUT_shaderSampledImageArrayNonUniformIndexing); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexing() { return _shaderSampledImageArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderSampledImageArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderSampledImageArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderSampledImageArrayNonUniformIndexing(MemorySegment src) { return _shaderSampledImageArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageBufferArrayNonUniformIndexing, index), LAYOUT_shaderStorageBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexing() { return _shaderStorageBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageArrayNonUniformIndexing, index), LAYOUT_shaderStorageImageArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexing() { return _shaderStorageImageArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageImageArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageImageArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageImageArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageImageArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayNonUniformIndexing, index), LAYOUT_shaderInputAttachmentArrayNonUniformIndexing); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexing() { return _shaderInputAttachmentArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderInputAttachmentArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderInputAttachmentArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderInputAttachmentArrayNonUniformIndexing(MemorySegment src) { return _shaderInputAttachmentArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformTexelBufferArrayNonUniformIndexing, index), LAYOUT_shaderUniformTexelBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderUniformTexelBufferArrayNonUniformIndexing() { return _shaderUniformTexelBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderUniformTexelBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderUniformTexelBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTexelBufferArrayNonUniformIndexing, index), LAYOUT_shaderStorageTexelBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageTexelBufferArrayNonUniformIndexing() { return _shaderStorageTexelBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageTexelBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageTexelBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUniformBufferUpdateAfterBind, index), LAYOUT_descriptorBindingUniformBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingUniformBufferUpdateAfterBind() { return _descriptorBindingUniformBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUniformBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingUniformBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUniformBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingUniformBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingSampledImageUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingSampledImageUpdateAfterBind, index), LAYOUT_descriptorBindingSampledImageUpdateAfterBind); }
    public MemorySegment _descriptorBindingSampledImageUpdateAfterBind() { return _descriptorBindingSampledImageUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingSampledImageUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingSampledImageUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingSampledImageUpdateAfterBind(MemorySegment src) { return _descriptorBindingSampledImageUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageImageUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageImageUpdateAfterBind, index), LAYOUT_descriptorBindingStorageImageUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageImageUpdateAfterBind() { return _descriptorBindingStorageImageUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageImageUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageImageUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageImageUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageImageUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageBufferUpdateAfterBind, index), LAYOUT_descriptorBindingStorageBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageBufferUpdateAfterBind() { return _descriptorBindingStorageBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUniformTexelBufferUpdateAfterBind, index), LAYOUT_descriptorBindingUniformTexelBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingUniformTexelBufferUpdateAfterBind() { return _descriptorBindingUniformTexelBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingUniformTexelBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingUniformTexelBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageTexelBufferUpdateAfterBind, index), LAYOUT_descriptorBindingStorageTexelBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageTexelBufferUpdateAfterBind() { return _descriptorBindingStorageTexelBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageTexelBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageTexelBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingUpdateUnusedWhilePendingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUpdateUnusedWhilePending, index), LAYOUT_descriptorBindingUpdateUnusedWhilePending); }
    public MemorySegment _descriptorBindingUpdateUnusedWhilePending() { return _descriptorBindingUpdateUnusedWhilePendingAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUpdateUnusedWhilePendingAt(long index, MemorySegment src) { _descriptorBindingUpdateUnusedWhilePendingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingUpdateUnusedWhilePending(MemorySegment src) { return _descriptorBindingUpdateUnusedWhilePendingAt(0L, src); }
    public MemorySegment _descriptorBindingPartiallyBoundAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingPartiallyBound, index), LAYOUT_descriptorBindingPartiallyBound); }
    public MemorySegment _descriptorBindingPartiallyBound() { return _descriptorBindingPartiallyBoundAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingPartiallyBoundAt(long index, MemorySegment src) { _descriptorBindingPartiallyBoundAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingPartiallyBound(MemorySegment src) { return _descriptorBindingPartiallyBoundAt(0L, src); }
    public MemorySegment _descriptorBindingVariableDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingVariableDescriptorCount, index), LAYOUT_descriptorBindingVariableDescriptorCount); }
    public MemorySegment _descriptorBindingVariableDescriptorCount() { return _descriptorBindingVariableDescriptorCountAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingVariableDescriptorCountAt(long index, MemorySegment src) { _descriptorBindingVariableDescriptorCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _descriptorBindingVariableDescriptorCount(MemorySegment src) { return _descriptorBindingVariableDescriptorCountAt(0L, src); }
    public MemorySegment _runtimeDescriptorArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_runtimeDescriptorArray, index), LAYOUT_runtimeDescriptorArray); }
    public MemorySegment _runtimeDescriptorArray() { return _runtimeDescriptorArrayAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingFeatures _runtimeDescriptorArrayAt(long index, MemorySegment src) { _runtimeDescriptorArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingFeatures _runtimeDescriptorArray(MemorySegment src) { return _runtimeDescriptorArrayAt(0L, src); }
}
