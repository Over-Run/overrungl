// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFloatControls2FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloatControls2FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloatControls2;
/// }
/// ```
public final class VkPhysicalDeviceShaderFloatControls2FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderFloatControls2 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloatControls2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderFloatControls2 = LAYOUT.select(PathElement.groupElement("shaderFloatControls2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderFloatControls2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloatControls2"));

    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES); }
    public static VkPhysicalDeviceShaderFloatControls2FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR copyFrom(VkPhysicalDeviceShaderFloatControls2FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloatControls2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderFloatControls2FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderFloatControls2At(long index) { return (int) VH_shaderFloatControls2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderFloatControls2() { return (int) VH_shaderFloatControls2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR shaderFloatControls2At(long index, int value) { VH_shaderFloatControls2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR shaderFloatControls2(int value) { VH_shaderFloatControls2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderFloatControls2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloatControls2, index), LAYOUT_shaderFloatControls2); }
    public MemorySegment _shaderFloatControls2() { return _shaderFloatControls2At(0L); }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _shaderFloatControls2At(long index, MemorySegment src) { _shaderFloatControls2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderFloatControls2FeaturesKHR _shaderFloatControls2(MemorySegment src) { return _shaderFloatControls2At(0L, src); }
}
