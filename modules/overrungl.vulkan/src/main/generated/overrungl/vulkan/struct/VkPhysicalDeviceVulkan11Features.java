// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan11Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan11Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 storageBuffer16BitAccess;
///     VkBool32 uniformAndStorageBuffer16BitAccess;
///     VkBool32 storagePushConstant16;
///     VkBool32 storageInputOutput16;
///     VkBool32 multiview;
///     VkBool32 multiviewGeometryShader;
///     VkBool32 multiviewTessellationShader;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
///     VkBool32 protectedMemory;
///     VkBool32 samplerYcbcrConversion;
///     VkBool32 shaderDrawParameters;
/// }
/// ```
public final class VkPhysicalDeviceVulkan11Features extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers"),
        ValueLayout.JAVA_INT.withName("protectedMemory"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_storageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final long OFFSET_uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final long OFFSET_storagePushConstant16 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
    public static final long OFFSET_storageInputOutput16 = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
    public static final long OFFSET_multiview = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
    public static final long OFFSET_multiviewGeometryShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
    public static final long OFFSET_multiviewTessellationShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
    public static final long OFFSET_variablePointersStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final long OFFSET_variablePointers = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
    public static final long OFFSET_protectedMemory = LAYOUT.byteOffset(PathElement.groupElement("protectedMemory"));
    public static final long OFFSET_samplerYcbcrConversion = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversion"));
    public static final long OFFSET_shaderDrawParameters = LAYOUT.byteOffset(PathElement.groupElement("shaderDrawParameters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_storageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final MemoryLayout LAYOUT_storagePushConstant16 = LAYOUT.select(PathElement.groupElement("storagePushConstant16"));
    public static final MemoryLayout LAYOUT_storageInputOutput16 = LAYOUT.select(PathElement.groupElement("storageInputOutput16"));
    public static final MemoryLayout LAYOUT_multiview = LAYOUT.select(PathElement.groupElement("multiview"));
    public static final MemoryLayout LAYOUT_multiviewGeometryShader = LAYOUT.select(PathElement.groupElement("multiviewGeometryShader"));
    public static final MemoryLayout LAYOUT_multiviewTessellationShader = LAYOUT.select(PathElement.groupElement("multiviewTessellationShader"));
    public static final MemoryLayout LAYOUT_variablePointersStorageBuffer = LAYOUT.select(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final MemoryLayout LAYOUT_variablePointers = LAYOUT.select(PathElement.groupElement("variablePointers"));
    public static final MemoryLayout LAYOUT_protectedMemory = LAYOUT.select(PathElement.groupElement("protectedMemory"));
    public static final MemoryLayout LAYOUT_samplerYcbcrConversion = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversion"));
    public static final MemoryLayout LAYOUT_shaderDrawParameters = LAYOUT.select(PathElement.groupElement("shaderDrawParameters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));
    public static final VarHandle VH_protectedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedMemory"));
    public static final VarHandle VH_samplerYcbcrConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversion"));
    public static final VarHandle VH_shaderDrawParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDrawParameters"));

    public VkPhysicalDeviceVulkan11Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan11Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan11Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES); }
    public static VkPhysicalDeviceVulkan11Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVulkan11Features copyFrom(VkPhysicalDeviceVulkan11Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan11Features reinterpret(long count) { return new VkPhysicalDeviceVulkan11Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan11Features asSlice(long index) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan11Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan11Features at(long index, Consumer<VkPhysicalDeviceVulkan11Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int storageBuffer16BitAccessAt(long index) { return (int) VH_storageBuffer16BitAccess.get(this.segment(), 0L, index); }
    public int uniformAndStorageBuffer16BitAccessAt(long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(this.segment(), 0L, index); }
    public int storagePushConstant16At(long index) { return (int) VH_storagePushConstant16.get(this.segment(), 0L, index); }
    public int storageInputOutput16At(long index) { return (int) VH_storageInputOutput16.get(this.segment(), 0L, index); }
    public int multiviewAt(long index) { return (int) VH_multiview.get(this.segment(), 0L, index); }
    public int multiviewGeometryShaderAt(long index) { return (int) VH_multiviewGeometryShader.get(this.segment(), 0L, index); }
    public int multiviewTessellationShaderAt(long index) { return (int) VH_multiviewTessellationShader.get(this.segment(), 0L, index); }
    public int variablePointersStorageBufferAt(long index) { return (int) VH_variablePointersStorageBuffer.get(this.segment(), 0L, index); }
    public int variablePointersAt(long index) { return (int) VH_variablePointers.get(this.segment(), 0L, index); }
    public int protectedMemoryAt(long index) { return (int) VH_protectedMemory.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionAt(long index) { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, index); }
    public int shaderDrawParametersAt(long index) { return (int) VH_shaderDrawParameters.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int storageBuffer16BitAccess() { return (int) VH_storageBuffer16BitAccess.get(this.segment(), 0L, 0L); }
    public int uniformAndStorageBuffer16BitAccess() { return (int) VH_uniformAndStorageBuffer16BitAccess.get(this.segment(), 0L, 0L); }
    public int storagePushConstant16() { return (int) VH_storagePushConstant16.get(this.segment(), 0L, 0L); }
    public int storageInputOutput16() { return (int) VH_storageInputOutput16.get(this.segment(), 0L, 0L); }
    public int multiview() { return (int) VH_multiview.get(this.segment(), 0L, 0L); }
    public int multiviewGeometryShader() { return (int) VH_multiviewGeometryShader.get(this.segment(), 0L, 0L); }
    public int multiviewTessellationShader() { return (int) VH_multiviewTessellationShader.get(this.segment(), 0L, 0L); }
    public int variablePointersStorageBuffer() { return (int) VH_variablePointersStorageBuffer.get(this.segment(), 0L, 0L); }
    public int variablePointers() { return (int) VH_variablePointers.get(this.segment(), 0L, 0L); }
    public int protectedMemory() { return (int) VH_protectedMemory.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversion() { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, 0L); }
    public int shaderDrawParameters() { return (int) VH_shaderDrawParameters.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan11Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccessAt(long index, int value) { VH_storageBuffer16BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccessAt(long index, int value) { VH_uniformAndStorageBuffer16BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features storagePushConstant16At(long index, int value) { VH_storagePushConstant16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features storageInputOutput16At(long index, int value) { VH_storageInputOutput16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiviewAt(long index, int value) { VH_multiview.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShaderAt(long index, int value) { VH_multiviewGeometryShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShaderAt(long index, int value) { VH_multiviewTessellationShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBufferAt(long index, int value) { VH_variablePointersStorageBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features variablePointersAt(long index, int value) { VH_variablePointers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features protectedMemoryAt(long index, int value) { VH_protectedMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversionAt(long index, int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features shaderDrawParametersAt(long index, int value) { VH_shaderDrawParameters.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan11Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(int value) { VH_storageBuffer16BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(int value) { VH_uniformAndStorageBuffer16BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(int value) { VH_storagePushConstant16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(int value) { VH_storageInputOutput16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiview(int value) { VH_multiview.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(int value) { VH_multiviewGeometryShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(int value) { VH_multiviewTessellationShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(int value) { VH_variablePointersStorageBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features variablePointers(int value) { VH_variablePointers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features protectedMemory(int value) { VH_protectedMemory.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(int value) { VH_shaderDrawParameters.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan11Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan11Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _storageBuffer16BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBuffer16BitAccess, index), LAYOUT_storageBuffer16BitAccess); }
    public MemorySegment _storageBuffer16BitAccess() { return _storageBuffer16BitAccessAt(0L); }
    public VkPhysicalDeviceVulkan11Features _storageBuffer16BitAccessAt(long index, MemorySegment src) { _storageBuffer16BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _storageBuffer16BitAccess(MemorySegment src) { return _storageBuffer16BitAccessAt(0L, src); }
    public MemorySegment _uniformAndStorageBuffer16BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformAndStorageBuffer16BitAccess, index), LAYOUT_uniformAndStorageBuffer16BitAccess); }
    public MemorySegment _uniformAndStorageBuffer16BitAccess() { return _uniformAndStorageBuffer16BitAccessAt(0L); }
    public VkPhysicalDeviceVulkan11Features _uniformAndStorageBuffer16BitAccessAt(long index, MemorySegment src) { _uniformAndStorageBuffer16BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _uniformAndStorageBuffer16BitAccess(MemorySegment src) { return _uniformAndStorageBuffer16BitAccessAt(0L, src); }
    public MemorySegment _storagePushConstant16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storagePushConstant16, index), LAYOUT_storagePushConstant16); }
    public MemorySegment _storagePushConstant16() { return _storagePushConstant16At(0L); }
    public VkPhysicalDeviceVulkan11Features _storagePushConstant16At(long index, MemorySegment src) { _storagePushConstant16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _storagePushConstant16(MemorySegment src) { return _storagePushConstant16At(0L, src); }
    public MemorySegment _storageInputOutput16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageInputOutput16, index), LAYOUT_storageInputOutput16); }
    public MemorySegment _storageInputOutput16() { return _storageInputOutput16At(0L); }
    public VkPhysicalDeviceVulkan11Features _storageInputOutput16At(long index, MemorySegment src) { _storageInputOutput16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _storageInputOutput16(MemorySegment src) { return _storageInputOutput16At(0L, src); }
    public MemorySegment _multiviewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiview, index), LAYOUT_multiview); }
    public MemorySegment _multiview() { return _multiviewAt(0L); }
    public VkPhysicalDeviceVulkan11Features _multiviewAt(long index, MemorySegment src) { _multiviewAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _multiview(MemorySegment src) { return _multiviewAt(0L, src); }
    public MemorySegment _multiviewGeometryShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewGeometryShader, index), LAYOUT_multiviewGeometryShader); }
    public MemorySegment _multiviewGeometryShader() { return _multiviewGeometryShaderAt(0L); }
    public VkPhysicalDeviceVulkan11Features _multiviewGeometryShaderAt(long index, MemorySegment src) { _multiviewGeometryShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _multiviewGeometryShader(MemorySegment src) { return _multiviewGeometryShaderAt(0L, src); }
    public MemorySegment _multiviewTessellationShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewTessellationShader, index), LAYOUT_multiviewTessellationShader); }
    public MemorySegment _multiviewTessellationShader() { return _multiviewTessellationShaderAt(0L); }
    public VkPhysicalDeviceVulkan11Features _multiviewTessellationShaderAt(long index, MemorySegment src) { _multiviewTessellationShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _multiviewTessellationShader(MemorySegment src) { return _multiviewTessellationShaderAt(0L, src); }
    public MemorySegment _variablePointersStorageBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variablePointersStorageBuffer, index), LAYOUT_variablePointersStorageBuffer); }
    public MemorySegment _variablePointersStorageBuffer() { return _variablePointersStorageBufferAt(0L); }
    public VkPhysicalDeviceVulkan11Features _variablePointersStorageBufferAt(long index, MemorySegment src) { _variablePointersStorageBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _variablePointersStorageBuffer(MemorySegment src) { return _variablePointersStorageBufferAt(0L, src); }
    public MemorySegment _variablePointersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variablePointers, index), LAYOUT_variablePointers); }
    public MemorySegment _variablePointers() { return _variablePointersAt(0L); }
    public VkPhysicalDeviceVulkan11Features _variablePointersAt(long index, MemorySegment src) { _variablePointersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _variablePointers(MemorySegment src) { return _variablePointersAt(0L, src); }
    public MemorySegment _protectedMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_protectedMemory, index), LAYOUT_protectedMemory); }
    public MemorySegment _protectedMemory() { return _protectedMemoryAt(0L); }
    public VkPhysicalDeviceVulkan11Features _protectedMemoryAt(long index, MemorySegment src) { _protectedMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _protectedMemory(MemorySegment src) { return _protectedMemoryAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversion, index), LAYOUT_samplerYcbcrConversion); }
    public MemorySegment _samplerYcbcrConversion() { return _samplerYcbcrConversionAt(0L); }
    public VkPhysicalDeviceVulkan11Features _samplerYcbcrConversionAt(long index, MemorySegment src) { _samplerYcbcrConversionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _samplerYcbcrConversion(MemorySegment src) { return _samplerYcbcrConversionAt(0L, src); }
    public MemorySegment _shaderDrawParametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDrawParameters, index), LAYOUT_shaderDrawParameters); }
    public MemorySegment _shaderDrawParameters() { return _shaderDrawParametersAt(0L); }
    public VkPhysicalDeviceVulkan11Features _shaderDrawParametersAt(long index, MemorySegment src) { _shaderDrawParametersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan11Features _shaderDrawParameters(MemorySegment src) { return _shaderDrawParametersAt(0L, src); }
}
