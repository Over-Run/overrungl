// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderIntegerDotProduct;
/// }
/// ```
public final class VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderIntegerDotProduct")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderIntegerDotProduct = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerDotProduct"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderIntegerDotProduct = LAYOUT.select(PathElement.groupElement("shaderIntegerDotProduct"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderIntegerDotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderIntegerDotProduct"));

    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES); }
    public static VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR copyFrom(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderIntegerDotProductAt(long index) { return (int) VH_shaderIntegerDotProduct.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderIntegerDotProduct() { return (int) VH_shaderIntegerDotProduct.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR shaderIntegerDotProductAt(long index, int value) { VH_shaderIntegerDotProduct.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR shaderIntegerDotProduct(int value) { VH_shaderIntegerDotProduct.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderIntegerDotProductAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderIntegerDotProduct, index), LAYOUT_shaderIntegerDotProduct); }
    public MemorySegment _shaderIntegerDotProduct() { return _shaderIntegerDotProductAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _shaderIntegerDotProductAt(long index, MemorySegment src) { _shaderIntegerDotProductAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR _shaderIntegerDotProduct(MemorySegment src) { return _shaderIntegerDotProductAt(0L, src); }
}
