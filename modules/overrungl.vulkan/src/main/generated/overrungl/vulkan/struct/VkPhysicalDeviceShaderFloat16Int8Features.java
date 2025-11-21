// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFloat16Int8Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloat16Int8Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat16;
///     VkBool32 shaderInt8;
/// }
/// ```
public final class VkPhysicalDeviceShaderFloat16Int8Features extends GroupType {
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

    public VkPhysicalDeviceShaderFloat16Int8Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderFloat16Int8Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderFloat16Int8Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderFloat16Int8Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderFloat16Int8Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat16Int8Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderFloat16Int8Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat16Int8Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderFloat16Int8Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
    public static VkPhysicalDeviceShaderFloat16Int8Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderFloat16Int8Features copyFrom(VkPhysicalDeviceShaderFloat16Int8Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features reinterpret(long count) { return new VkPhysicalDeviceShaderFloat16Int8Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderFloat16Int8Features asSlice(long index) { return new VkPhysicalDeviceShaderFloat16Int8Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderFloat16Int8Features asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloat16Int8Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderFloat16Int8Features at(long index, Consumer<VkPhysicalDeviceShaderFloat16Int8Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFloat16At(long index) { return (int) VH_shaderFloat16.get(this.segment(), 0L, index); }
    public int shaderInt8At(long index) { return (int) VH_shaderInt8.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFloat16() { return (int) VH_shaderFloat16.get(this.segment(), 0L, 0L); }
    public int shaderInt8() { return (int) VH_shaderInt8.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderFloat16Int8Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16At(long index, int value) { VH_shaderFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8At(long index, int value) { VH_shaderInt8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(int value) { VH_shaderFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(int value) { VH_shaderInt8.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderFloat16Int8Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderFloat16Int8Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat16, index), LAYOUT_shaderFloat16); }
    public MemorySegment _shaderFloat16() { return _shaderFloat16At(0L); }
    public VkPhysicalDeviceShaderFloat16Int8Features _shaderFloat16At(long index, MemorySegment src) { _shaderFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features _shaderFloat16(MemorySegment src) { return _shaderFloat16At(0L, src); }
    public MemorySegment _shaderInt8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInt8, index), LAYOUT_shaderInt8); }
    public MemorySegment _shaderInt8() { return _shaderInt8At(0L); }
    public VkPhysicalDeviceShaderFloat16Int8Features _shaderInt8At(long index, MemorySegment src) { _shaderInt8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloat16Int8Features _shaderInt8(MemorySegment src) { return _shaderInt8At(0L, src); }
}
