// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderBfloat16FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderBfloat16FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderBFloat16Type;
///     VkBool32 shaderBFloat16DotProduct;
///     VkBool32 shaderBFloat16CooperativeMatrix;
/// }
/// ```
public final class VkPhysicalDeviceShaderBfloat16FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16Type"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16DotProduct"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16CooperativeMatrix")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderBFloat16Type = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16Type"));
    public static final long OFFSET_shaderBFloat16DotProduct = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16DotProduct"));
    public static final long OFFSET_shaderBFloat16CooperativeMatrix = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderBFloat16Type = LAYOUT.select(PathElement.groupElement("shaderBFloat16Type"));
    public static final MemoryLayout LAYOUT_shaderBFloat16DotProduct = LAYOUT.select(PathElement.groupElement("shaderBFloat16DotProduct"));
    public static final MemoryLayout LAYOUT_shaderBFloat16CooperativeMatrix = LAYOUT.select(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderBFloat16Type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16Type"));
    public static final VarHandle VH_shaderBFloat16DotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16DotProduct"));
    public static final VarHandle VH_shaderBFloat16CooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderBfloat16.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderBfloat16.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR copyFrom(VkPhysicalDeviceShaderBfloat16FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderBfloat16FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderBFloat16TypeAt(long index) { return (int) VH_shaderBFloat16Type.get(this.segment(), 0L, index); }
    public int shaderBFloat16DotProductAt(long index) { return (int) VH_shaderBFloat16DotProduct.get(this.segment(), 0L, index); }
    public int shaderBFloat16CooperativeMatrixAt(long index) { return (int) VH_shaderBFloat16CooperativeMatrix.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderBFloat16Type() { return (int) VH_shaderBFloat16Type.get(this.segment(), 0L, 0L); }
    public int shaderBFloat16DotProduct() { return (int) VH_shaderBFloat16DotProduct.get(this.segment(), 0L, 0L); }
    public int shaderBFloat16CooperativeMatrix() { return (int) VH_shaderBFloat16CooperativeMatrix.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16TypeAt(long index, int value) { VH_shaderBFloat16Type.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProductAt(long index, int value) { VH_shaderBFloat16DotProduct.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrixAt(long index, int value) { VH_shaderBFloat16CooperativeMatrix.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16Type(int value) { VH_shaderBFloat16Type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProduct(int value) { VH_shaderBFloat16DotProduct.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrix(int value) { VH_shaderBFloat16CooperativeMatrix.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderBFloat16TypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBFloat16Type, index), LAYOUT_shaderBFloat16Type); }
    public MemorySegment _shaderBFloat16Type() { return _shaderBFloat16TypeAt(0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16TypeAt(long index, MemorySegment src) { _shaderBFloat16TypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16Type(MemorySegment src) { return _shaderBFloat16TypeAt(0L, src); }
    public MemorySegment _shaderBFloat16DotProductAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBFloat16DotProduct, index), LAYOUT_shaderBFloat16DotProduct); }
    public MemorySegment _shaderBFloat16DotProduct() { return _shaderBFloat16DotProductAt(0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16DotProductAt(long index, MemorySegment src) { _shaderBFloat16DotProductAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16DotProduct(MemorySegment src) { return _shaderBFloat16DotProductAt(0L, src); }
    public MemorySegment _shaderBFloat16CooperativeMatrixAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBFloat16CooperativeMatrix, index), LAYOUT_shaderBFloat16CooperativeMatrix); }
    public MemorySegment _shaderBFloat16CooperativeMatrix() { return _shaderBFloat16CooperativeMatrixAt(0L); }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16CooperativeMatrixAt(long index, MemorySegment src) { _shaderBFloat16CooperativeMatrixAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR _shaderBFloat16CooperativeMatrix(MemorySegment src) { return _shaderBFloat16CooperativeMatrixAt(0L, src); }
}
