// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderQuadControlFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderQuadControlFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderQuadControl;
/// }
/// ```
public final class VkPhysicalDeviceShaderQuadControlFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderQuadControl")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderQuadControl = LAYOUT.byteOffset(PathElement.groupElement("shaderQuadControl"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderQuadControl = LAYOUT.select(PathElement.groupElement("shaderQuadControl"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderQuadControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderQuadControl"));

    public VkPhysicalDeviceShaderQuadControlFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderQuadControlFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderQuadControlFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderQuadControlFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderQuadControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_QUAD_CONTROL_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderQuadControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_QUAD_CONTROL_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR copyFrom(VkPhysicalDeviceShaderQuadControlFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderQuadControlFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderQuadControlAt(long index) { return (int) VH_shaderQuadControl.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderQuadControl() { return (int) VH_shaderQuadControl.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR shaderQuadControlAt(long index, int value) { VH_shaderQuadControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR shaderQuadControl(int value) { VH_shaderQuadControl.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderQuadControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderQuadControl, index), LAYOUT_shaderQuadControl); }
    public MemorySegment _shaderQuadControl() { return _shaderQuadControlAt(0L); }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _shaderQuadControlAt(long index, MemorySegment src) { _shaderQuadControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR _shaderQuadControl(MemorySegment src) { return _shaderQuadControlAt(0L, src); }
}
