// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat16VectorAtomics;
/// }
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderFloat16VectorAtomics = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16VectorAtomics"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderFloat16VectorAtomics = LAYOUT.select(PathElement.groupElement("shaderFloat16VectorAtomics"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderFloat16VectorAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16VectorAtomics"));

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShaderAtomicFloat16Vector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV); }
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShaderAtomicFloat16Vector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV copyFrom(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV at(long index, Consumer<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFloat16VectorAtomicsAt(long index) { return (int) VH_shaderFloat16VectorAtomics.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFloat16VectorAtomics() { return (int) VH_shaderFloat16VectorAtomics.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomicsAt(long index, int value) { VH_shaderFloat16VectorAtomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomics(int value) { VH_shaderFloat16VectorAtomics.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFloat16VectorAtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat16VectorAtomics, index), LAYOUT_shaderFloat16VectorAtomics); }
    public MemorySegment _shaderFloat16VectorAtomics() { return _shaderFloat16VectorAtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _shaderFloat16VectorAtomicsAt(long index, MemorySegment src) { _shaderFloat16VectorAtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV _shaderFloat16VectorAtomics(MemorySegment src) { return _shaderFloat16VectorAtomicsAt(0L, src); }
}
