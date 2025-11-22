// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFloat8FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloat8FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat8;
///     VkBool32 shaderFloat8CooperativeMatrix;
/// }
/// ```
public final class VkPhysicalDeviceShaderFloat8FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat8"),
        ValueLayout.JAVA_INT.withName("shaderFloat8CooperativeMatrix")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderFloat8 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8"));
    public static final long OFFSET_shaderFloat8CooperativeMatrix = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderFloat8 = LAYOUT.select(PathElement.groupElement("shaderFloat8"));
    public static final MemoryLayout LAYOUT_shaderFloat8CooperativeMatrix = LAYOUT.select(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderFloat8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat8"));
    public static final VarHandle VH_shaderFloat8CooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat8CooperativeMatrix"));

    public VkPhysicalDeviceShaderFloat8FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderFloat8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT copyFrom(VkPhysicalDeviceShaderFloat8FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderFloat8FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFloat8At(long index) { return (int) VH_shaderFloat8.get(this.segment(), 0L, index); }
    public int shaderFloat8CooperativeMatrixAt(long index) { return (int) VH_shaderFloat8CooperativeMatrix.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFloat8() { return (int) VH_shaderFloat8.get(this.segment(), 0L, 0L); }
    public int shaderFloat8CooperativeMatrix() { return (int) VH_shaderFloat8CooperativeMatrix.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8At(long index, int value) { VH_shaderFloat8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrixAt(long index, int value) { VH_shaderFloat8CooperativeMatrix.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8(int value) { VH_shaderFloat8.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrix(int value) { VH_shaderFloat8CooperativeMatrix.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFloat8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat8, index), LAYOUT_shaderFloat8); }
    public MemorySegment _shaderFloat8() { return _shaderFloat8At(0L); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _shaderFloat8At(long index, MemorySegment src) { _shaderFloat8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _shaderFloat8(MemorySegment src) { return _shaderFloat8At(0L, src); }
    public MemorySegment _shaderFloat8CooperativeMatrixAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat8CooperativeMatrix, index), LAYOUT_shaderFloat8CooperativeMatrix); }
    public MemorySegment _shaderFloat8CooperativeMatrix() { return _shaderFloat8CooperativeMatrixAt(0L); }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _shaderFloat8CooperativeMatrixAt(long index, MemorySegment src) { _shaderFloat8CooperativeMatrixAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat8FeaturesEXT _shaderFloat8CooperativeMatrix(MemorySegment src) { return _shaderFloat8CooperativeMatrixAt(0L, src); }
}
