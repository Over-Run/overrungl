// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan13Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan13Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 robustImageAccess;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
///     VkBool32 pipelineCreationCacheControl;
///     VkBool32 privateData;
///     VkBool32 shaderDemoteToHelperInvocation;
///     VkBool32 shaderTerminateInvocation;
///     VkBool32 subgroupSizeControl;
///     VkBool32 computeFullSubgroups;
///     VkBool32 synchronization2;
///     VkBool32 textureCompressionASTC_HDR;
///     VkBool32 shaderZeroInitializeWorkgroupMemory;
///     VkBool32 dynamicRendering;
///     VkBool32 shaderIntegerDotProduct;
///     VkBool32 maintenance4;
/// }
/// ```
public final class VkPhysicalDeviceVulkan13Features extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustImageAccess"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("pipelineCreationCacheControl"),
        ValueLayout.JAVA_INT.withName("privateData"),
        ValueLayout.JAVA_INT.withName("shaderDemoteToHelperInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTerminateInvocation"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups"),
        ValueLayout.JAVA_INT.withName("synchronization2"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_HDR"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory"),
        ValueLayout.JAVA_INT.withName("dynamicRendering"),
        ValueLayout.JAVA_INT.withName("shaderIntegerDotProduct"),
        ValueLayout.JAVA_INT.withName("maintenance4")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_robustImageAccess = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess"));
    public static final long OFFSET_inlineUniformBlock = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
    public static final long OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    public static final long OFFSET_pipelineCreationCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineCreationCacheControl"));
    public static final long OFFSET_privateData = LAYOUT.byteOffset(PathElement.groupElement("privateData"));
    public static final long OFFSET_shaderDemoteToHelperInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    public static final long OFFSET_shaderTerminateInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTerminateInvocation"));
    public static final long OFFSET_subgroupSizeControl = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
    public static final long OFFSET_computeFullSubgroups = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
    public static final long OFFSET_synchronization2 = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
    public static final long OFFSET_textureCompressionASTC_HDR = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_HDR"));
    public static final long OFFSET_shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    public static final long OFFSET_dynamicRendering = LAYOUT.byteOffset(PathElement.groupElement("dynamicRendering"));
    public static final long OFFSET_shaderIntegerDotProduct = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerDotProduct"));
    public static final long OFFSET_maintenance4 = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_robustImageAccess = LAYOUT.select(PathElement.groupElement("robustImageAccess"));
    public static final MemoryLayout LAYOUT_inlineUniformBlock = LAYOUT.select(PathElement.groupElement("inlineUniformBlock"));
    public static final MemoryLayout LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_pipelineCreationCacheControl = LAYOUT.select(PathElement.groupElement("pipelineCreationCacheControl"));
    public static final MemoryLayout LAYOUT_privateData = LAYOUT.select(PathElement.groupElement("privateData"));
    public static final MemoryLayout LAYOUT_shaderDemoteToHelperInvocation = LAYOUT.select(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    public static final MemoryLayout LAYOUT_shaderTerminateInvocation = LAYOUT.select(PathElement.groupElement("shaderTerminateInvocation"));
    public static final MemoryLayout LAYOUT_subgroupSizeControl = LAYOUT.select(PathElement.groupElement("subgroupSizeControl"));
    public static final MemoryLayout LAYOUT_computeFullSubgroups = LAYOUT.select(PathElement.groupElement("computeFullSubgroups"));
    public static final MemoryLayout LAYOUT_synchronization2 = LAYOUT.select(PathElement.groupElement("synchronization2"));
    public static final MemoryLayout LAYOUT_textureCompressionASTC_HDR = LAYOUT.select(PathElement.groupElement("textureCompressionASTC_HDR"));
    public static final MemoryLayout LAYOUT_shaderZeroInitializeWorkgroupMemory = LAYOUT.select(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    public static final MemoryLayout LAYOUT_dynamicRendering = LAYOUT.select(PathElement.groupElement("dynamicRendering"));
    public static final MemoryLayout LAYOUT_shaderIntegerDotProduct = LAYOUT.select(PathElement.groupElement("shaderIntegerDotProduct"));
    public static final MemoryLayout LAYOUT_maintenance4 = LAYOUT.select(PathElement.groupElement("maintenance4"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_robustImageAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess"));
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    public static final VarHandle VH_pipelineCreationCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCreationCacheControl"));
    public static final VarHandle VH_privateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateData"));
    public static final VarHandle VH_shaderDemoteToHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    public static final VarHandle VH_shaderTerminateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTerminateInvocation"));
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));
    public static final VarHandle VH_synchronization2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("synchronization2"));
    public static final VarHandle VH_textureCompressionASTC_HDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_HDR"));
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    public static final VarHandle VH_dynamicRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRendering"));
    public static final VarHandle VH_shaderIntegerDotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderIntegerDotProduct"));
    public static final VarHandle VH_maintenance4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance4"));

    public VkPhysicalDeviceVulkan13Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan13Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan13Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES); }
    public static VkPhysicalDeviceVulkan13Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVulkan13Features copyFrom(VkPhysicalDeviceVulkan13Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan13Features reinterpret(long count) { return new VkPhysicalDeviceVulkan13Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan13Features asSlice(long index) { return new VkPhysicalDeviceVulkan13Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan13Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan13Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan13Features at(long index, Consumer<VkPhysicalDeviceVulkan13Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int robustImageAccessAt(long index) { return (int) VH_robustImageAccess.get(this.segment(), 0L, index); }
    public int inlineUniformBlockAt(long index) { return (int) VH_inlineUniformBlock.get(this.segment(), 0L, index); }
    public int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(this.segment(), 0L, index); }
    public int pipelineCreationCacheControlAt(long index) { return (int) VH_pipelineCreationCacheControl.get(this.segment(), 0L, index); }
    public int privateDataAt(long index) { return (int) VH_privateData.get(this.segment(), 0L, index); }
    public int shaderDemoteToHelperInvocationAt(long index) { return (int) VH_shaderDemoteToHelperInvocation.get(this.segment(), 0L, index); }
    public int shaderTerminateInvocationAt(long index) { return (int) VH_shaderTerminateInvocation.get(this.segment(), 0L, index); }
    public int subgroupSizeControlAt(long index) { return (int) VH_subgroupSizeControl.get(this.segment(), 0L, index); }
    public int computeFullSubgroupsAt(long index) { return (int) VH_computeFullSubgroups.get(this.segment(), 0L, index); }
    public int synchronization2At(long index) { return (int) VH_synchronization2.get(this.segment(), 0L, index); }
    public int textureCompressionASTC_HDRAt(long index) { return (int) VH_textureCompressionASTC_HDR.get(this.segment(), 0L, index); }
    public int shaderZeroInitializeWorkgroupMemoryAt(long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(this.segment(), 0L, index); }
    public int dynamicRenderingAt(long index) { return (int) VH_dynamicRendering.get(this.segment(), 0L, index); }
    public int shaderIntegerDotProductAt(long index) { return (int) VH_shaderIntegerDotProduct.get(this.segment(), 0L, index); }
    public int maintenance4At(long index) { return (int) VH_maintenance4.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int robustImageAccess() { return (int) VH_robustImageAccess.get(this.segment(), 0L, 0L); }
    public int inlineUniformBlock() { return (int) VH_inlineUniformBlock.get(this.segment(), 0L, 0L); }
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int pipelineCreationCacheControl() { return (int) VH_pipelineCreationCacheControl.get(this.segment(), 0L, 0L); }
    public int privateData() { return (int) VH_privateData.get(this.segment(), 0L, 0L); }
    public int shaderDemoteToHelperInvocation() { return (int) VH_shaderDemoteToHelperInvocation.get(this.segment(), 0L, 0L); }
    public int shaderTerminateInvocation() { return (int) VH_shaderTerminateInvocation.get(this.segment(), 0L, 0L); }
    public int subgroupSizeControl() { return (int) VH_subgroupSizeControl.get(this.segment(), 0L, 0L); }
    public int computeFullSubgroups() { return (int) VH_computeFullSubgroups.get(this.segment(), 0L, 0L); }
    public int synchronization2() { return (int) VH_synchronization2.get(this.segment(), 0L, 0L); }
    public int textureCompressionASTC_HDR() { return (int) VH_textureCompressionASTC_HDR.get(this.segment(), 0L, 0L); }
    public int shaderZeroInitializeWorkgroupMemory() { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(this.segment(), 0L, 0L); }
    public int dynamicRendering() { return (int) VH_dynamicRendering.get(this.segment(), 0L, 0L); }
    public int shaderIntegerDotProduct() { return (int) VH_shaderIntegerDotProduct.get(this.segment(), 0L, 0L); }
    public int maintenance4() { return (int) VH_maintenance4.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan13Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features robustImageAccessAt(long index, int value) { VH_robustImageAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features inlineUniformBlockAt(long index, int value) { VH_inlineUniformBlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControlAt(long index, int value) { VH_pipelineCreationCacheControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features privateDataAt(long index, int value) { VH_privateData.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocationAt(long index, int value) { VH_shaderDemoteToHelperInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocationAt(long index, int value) { VH_shaderTerminateInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features subgroupSizeControlAt(long index, int value) { VH_subgroupSizeControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features computeFullSubgroupsAt(long index, int value) { VH_computeFullSubgroups.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features synchronization2At(long index, int value) { VH_synchronization2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDRAt(long index, int value) { VH_textureCompressionASTC_HDR.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemoryAt(long index, int value) { VH_shaderZeroInitializeWorkgroupMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features dynamicRenderingAt(long index, int value) { VH_dynamicRendering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProductAt(long index, int value) { VH_shaderIntegerDotProduct.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features maintenance4At(long index, int value) { VH_maintenance4.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features robustImageAccess(int value) { VH_robustImageAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(int value) { VH_inlineUniformBlock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(int value) { VH_pipelineCreationCacheControl.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features privateData(int value) { VH_privateData.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(int value) { VH_shaderDemoteToHelperInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(int value) { VH_shaderTerminateInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(int value) { VH_subgroupSizeControl.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(int value) { VH_computeFullSubgroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features synchronization2(int value) { VH_synchronization2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(int value) { VH_textureCompressionASTC_HDR.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(int value) { VH_shaderZeroInitializeWorkgroupMemory.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features dynamicRendering(int value) { VH_dynamicRendering.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(int value) { VH_shaderIntegerDotProduct.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Features maintenance4(int value) { VH_maintenance4.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan13Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan13Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _robustImageAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustImageAccess, index), LAYOUT_robustImageAccess); }
    public MemorySegment _robustImageAccess() { return _robustImageAccessAt(0L); }
    public VkPhysicalDeviceVulkan13Features _robustImageAccessAt(long index, MemorySegment src) { _robustImageAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _robustImageAccess(MemorySegment src) { return _robustImageAccessAt(0L, src); }
    public MemorySegment _inlineUniformBlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inlineUniformBlock, index), LAYOUT_inlineUniformBlock); }
    public MemorySegment _inlineUniformBlock() { return _inlineUniformBlockAt(0L); }
    public VkPhysicalDeviceVulkan13Features _inlineUniformBlockAt(long index, MemorySegment src) { _inlineUniformBlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _inlineUniformBlock(MemorySegment src) { return _inlineUniformBlockAt(0L, src); }
    public MemorySegment _descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind, index), LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind); }
    public MemorySegment _descriptorBindingInlineUniformBlockUpdateAfterBind() { return _descriptorBindingInlineUniformBlockUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan13Features _descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingInlineUniformBlockUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment src) { return _descriptorBindingInlineUniformBlockUpdateAfterBindAt(0L, src); }
    public MemorySegment _pipelineCreationCacheControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCreationCacheControl, index), LAYOUT_pipelineCreationCacheControl); }
    public MemorySegment _pipelineCreationCacheControl() { return _pipelineCreationCacheControlAt(0L); }
    public VkPhysicalDeviceVulkan13Features _pipelineCreationCacheControlAt(long index, MemorySegment src) { _pipelineCreationCacheControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _pipelineCreationCacheControl(MemorySegment src) { return _pipelineCreationCacheControlAt(0L, src); }
    public MemorySegment _privateDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_privateData, index), LAYOUT_privateData); }
    public MemorySegment _privateData() { return _privateDataAt(0L); }
    public VkPhysicalDeviceVulkan13Features _privateDataAt(long index, MemorySegment src) { _privateDataAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _privateData(MemorySegment src) { return _privateDataAt(0L, src); }
    public MemorySegment _shaderDemoteToHelperInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDemoteToHelperInvocation, index), LAYOUT_shaderDemoteToHelperInvocation); }
    public MemorySegment _shaderDemoteToHelperInvocation() { return _shaderDemoteToHelperInvocationAt(0L); }
    public VkPhysicalDeviceVulkan13Features _shaderDemoteToHelperInvocationAt(long index, MemorySegment src) { _shaderDemoteToHelperInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _shaderDemoteToHelperInvocation(MemorySegment src) { return _shaderDemoteToHelperInvocationAt(0L, src); }
    public MemorySegment _shaderTerminateInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTerminateInvocation, index), LAYOUT_shaderTerminateInvocation); }
    public MemorySegment _shaderTerminateInvocation() { return _shaderTerminateInvocationAt(0L); }
    public VkPhysicalDeviceVulkan13Features _shaderTerminateInvocationAt(long index, MemorySegment src) { _shaderTerminateInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _shaderTerminateInvocation(MemorySegment src) { return _shaderTerminateInvocationAt(0L, src); }
    public MemorySegment _subgroupSizeControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSizeControl, index), LAYOUT_subgroupSizeControl); }
    public MemorySegment _subgroupSizeControl() { return _subgroupSizeControlAt(0L); }
    public VkPhysicalDeviceVulkan13Features _subgroupSizeControlAt(long index, MemorySegment src) { _subgroupSizeControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _subgroupSizeControl(MemorySegment src) { return _subgroupSizeControlAt(0L, src); }
    public MemorySegment _computeFullSubgroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeFullSubgroups, index), LAYOUT_computeFullSubgroups); }
    public MemorySegment _computeFullSubgroups() { return _computeFullSubgroupsAt(0L); }
    public VkPhysicalDeviceVulkan13Features _computeFullSubgroupsAt(long index, MemorySegment src) { _computeFullSubgroupsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _computeFullSubgroups(MemorySegment src) { return _computeFullSubgroupsAt(0L, src); }
    public MemorySegment _synchronization2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_synchronization2, index), LAYOUT_synchronization2); }
    public MemorySegment _synchronization2() { return _synchronization2At(0L); }
    public VkPhysicalDeviceVulkan13Features _synchronization2At(long index, MemorySegment src) { _synchronization2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _synchronization2(MemorySegment src) { return _synchronization2At(0L, src); }
    public MemorySegment _textureCompressionASTC_HDRAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureCompressionASTC_HDR, index), LAYOUT_textureCompressionASTC_HDR); }
    public MemorySegment _textureCompressionASTC_HDR() { return _textureCompressionASTC_HDRAt(0L); }
    public VkPhysicalDeviceVulkan13Features _textureCompressionASTC_HDRAt(long index, MemorySegment src) { _textureCompressionASTC_HDRAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _textureCompressionASTC_HDR(MemorySegment src) { return _textureCompressionASTC_HDRAt(0L, src); }
    public MemorySegment _shaderZeroInitializeWorkgroupMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderZeroInitializeWorkgroupMemory, index), LAYOUT_shaderZeroInitializeWorkgroupMemory); }
    public MemorySegment _shaderZeroInitializeWorkgroupMemory() { return _shaderZeroInitializeWorkgroupMemoryAt(0L); }
    public VkPhysicalDeviceVulkan13Features _shaderZeroInitializeWorkgroupMemoryAt(long index, MemorySegment src) { _shaderZeroInitializeWorkgroupMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _shaderZeroInitializeWorkgroupMemory(MemorySegment src) { return _shaderZeroInitializeWorkgroupMemoryAt(0L, src); }
    public MemorySegment _dynamicRenderingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRendering, index), LAYOUT_dynamicRendering); }
    public MemorySegment _dynamicRendering() { return _dynamicRenderingAt(0L); }
    public VkPhysicalDeviceVulkan13Features _dynamicRenderingAt(long index, MemorySegment src) { _dynamicRenderingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _dynamicRendering(MemorySegment src) { return _dynamicRenderingAt(0L, src); }
    public MemorySegment _shaderIntegerDotProductAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderIntegerDotProduct, index), LAYOUT_shaderIntegerDotProduct); }
    public MemorySegment _shaderIntegerDotProduct() { return _shaderIntegerDotProductAt(0L); }
    public VkPhysicalDeviceVulkan13Features _shaderIntegerDotProductAt(long index, MemorySegment src) { _shaderIntegerDotProductAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _shaderIntegerDotProduct(MemorySegment src) { return _shaderIntegerDotProductAt(0L, src); }
    public MemorySegment _maintenance4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance4, index), LAYOUT_maintenance4); }
    public MemorySegment _maintenance4() { return _maintenance4At(0L); }
    public VkPhysicalDeviceVulkan13Features _maintenance4At(long index, MemorySegment src) { _maintenance4At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Features _maintenance4(MemorySegment src) { return _maintenance4At(0L, src); }
}
