// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFmaFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFmaFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFmaFloat16;
///     VkBool32 shaderFmaFloat32;
///     VkBool32 shaderFmaFloat64;
/// }
/// ```
public final class VkPhysicalDeviceShaderFmaFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFmaFloat16"),
        ValueLayout.JAVA_INT.withName("shaderFmaFloat32"),
        ValueLayout.JAVA_INT.withName("shaderFmaFloat64")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderFmaFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat16"));
    public static final long OFFSET_shaderFmaFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat32"));
    public static final long OFFSET_shaderFmaFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat64"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderFmaFloat16 = LAYOUT.select(PathElement.groupElement("shaderFmaFloat16"));
    public static final MemoryLayout LAYOUT_shaderFmaFloat32 = LAYOUT.select(PathElement.groupElement("shaderFmaFloat32"));
    public static final MemoryLayout LAYOUT_shaderFmaFloat64 = LAYOUT.select(PathElement.groupElement("shaderFmaFloat64"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderFmaFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFmaFloat16"));
    public static final VarHandle VH_shaderFmaFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFmaFloat32"));
    public static final VarHandle VH_shaderFmaFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFmaFloat64"));

    public VkPhysicalDeviceShaderFmaFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFmaFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFmaFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFmaFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFmaFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFmaFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderFmaFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderFma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FMA_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderFmaFeaturesKHR copyFrom(VkPhysicalDeviceShaderFmaFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderFmaFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderFmaFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderFmaFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderFmaFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFmaFloat16At(long index) { return (int) VH_shaderFmaFloat16.get(this.segment(), 0L, index); }
    public int shaderFmaFloat32At(long index) { return (int) VH_shaderFmaFloat32.get(this.segment(), 0L, index); }
    public int shaderFmaFloat64At(long index) { return (int) VH_shaderFmaFloat64.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFmaFloat16() { return (int) VH_shaderFmaFloat16.get(this.segment(), 0L, 0L); }
    public int shaderFmaFloat32() { return (int) VH_shaderFmaFloat32.get(this.segment(), 0L, 0L); }
    public int shaderFmaFloat64() { return (int) VH_shaderFmaFloat64.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat16At(long index, int value) { VH_shaderFmaFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat32At(long index, int value) { VH_shaderFmaFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat64At(long index, int value) { VH_shaderFmaFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat16(int value) { VH_shaderFmaFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat32(int value) { VH_shaderFmaFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat64(int value) { VH_shaderFmaFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFmaFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFmaFloat16, index), LAYOUT_shaderFmaFloat16); }
    public MemorySegment _shaderFmaFloat16() { return _shaderFmaFloat16At(0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat16At(long index, MemorySegment src) { _shaderFmaFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat16(MemorySegment src) { return _shaderFmaFloat16At(0L, src); }
    public MemorySegment _shaderFmaFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFmaFloat32, index), LAYOUT_shaderFmaFloat32); }
    public MemorySegment _shaderFmaFloat32() { return _shaderFmaFloat32At(0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat32At(long index, MemorySegment src) { _shaderFmaFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat32(MemorySegment src) { return _shaderFmaFloat32At(0L, src); }
    public MemorySegment _shaderFmaFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFmaFloat64, index), LAYOUT_shaderFmaFloat64); }
    public MemorySegment _shaderFmaFloat64() { return _shaderFmaFloat64At(0L); }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat64At(long index, MemorySegment src) { _shaderFmaFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFmaFeaturesKHR _shaderFmaFloat64(MemorySegment src) { return _shaderFmaFloat64At(0L, src); }
}
