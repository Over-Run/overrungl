// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderUniformBufferUnsizedArray;
/// }
/// ```
public final class VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferUnsizedArray")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderUniformBufferUnsizedArray = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferUnsizedArray"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferUnsizedArray = LAYOUT.select(PathElement.groupElement("shaderUniformBufferUnsizedArray"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderUniformBufferUnsizedArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferUnsizedArray"));

    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderUniformBufferUnsizedArray.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderUniformBufferUnsizedArray.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT copyFrom(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderUniformBufferUnsizedArrayAt(long index) { return (int) VH_shaderUniformBufferUnsizedArray.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferUnsizedArray() { return (int) VH_shaderUniformBufferUnsizedArray.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT shaderUniformBufferUnsizedArrayAt(long index, int value) { VH_shaderUniformBufferUnsizedArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT shaderUniformBufferUnsizedArray(int value) { VH_shaderUniformBufferUnsizedArray.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderUniformBufferUnsizedArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferUnsizedArray, index), LAYOUT_shaderUniformBufferUnsizedArray); }
    public MemorySegment _shaderUniformBufferUnsizedArray() { return _shaderUniformBufferUnsizedArrayAt(0L); }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _shaderUniformBufferUnsizedArrayAt(long index, MemorySegment src) { _shaderUniformBufferUnsizedArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT _shaderUniformBufferUnsizedArray(MemorySegment src) { return _shaderUniformBufferUnsizedArrayAt(0L, src); }
}
