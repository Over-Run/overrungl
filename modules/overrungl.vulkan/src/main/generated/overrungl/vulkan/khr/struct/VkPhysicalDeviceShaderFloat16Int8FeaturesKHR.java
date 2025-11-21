// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloat16Int8FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat16;
///     VkBool32 shaderInt8;
/// }
/// ```
public final class VkPhysicalDeviceShaderFloat16Int8FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
    public static final long OFFSET_shaderInt8 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderFloat16 = LAYOUT.select(PathElement.groupElement("shaderFloat16"));
    public static final MemoryLayout LAYOUT_shaderInt8 = LAYOUT.select(PathElement.groupElement("shaderInt8"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));

    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR copyFrom(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderFloat16Int8FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFloat16At(long index) { return (int) VH_shaderFloat16.get(this.segment(), 0L, index); }
    public int shaderInt8At(long index) { return (int) VH_shaderInt8.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFloat16() { return (int) VH_shaderFloat16.get(this.segment(), 0L, 0L); }
    public int shaderInt8() { return (int) VH_shaderInt8.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderFloat16At(long index, int value) { VH_shaderFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderInt8At(long index, int value) { VH_shaderInt8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderFloat16(int value) { VH_shaderFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderInt8(int value) { VH_shaderInt8.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat16, index), LAYOUT_shaderFloat16); }
    public MemorySegment _shaderFloat16() { return _shaderFloat16At(0L); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _shaderFloat16At(long index, MemorySegment src) { _shaderFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _shaderFloat16(MemorySegment src) { return _shaderFloat16At(0L, src); }
    public MemorySegment _shaderInt8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInt8, index), LAYOUT_shaderInt8); }
    public MemorySegment _shaderInt8() { return _shaderInt8At(0L); }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _shaderInt8At(long index, MemorySegment src) { _shaderInt8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR _shaderInt8(MemorySegment src) { return _shaderInt8At(0L, src); }
}
