// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderTerminateInvocation;
/// }
/// ```
public final class VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTerminateInvocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderTerminateInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTerminateInvocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderTerminateInvocation = LAYOUT.select(PathElement.groupElement("shaderTerminateInvocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderTerminateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTerminateInvocation"));

    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES); }
    public static VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR copyFrom(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderTerminateInvocationAt(long index) { return (int) VH_shaderTerminateInvocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderTerminateInvocation() { return (int) VH_shaderTerminateInvocation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR shaderTerminateInvocationAt(long index, int value) { VH_shaderTerminateInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR shaderTerminateInvocation(int value) { VH_shaderTerminateInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderTerminateInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTerminateInvocation, index), LAYOUT_shaderTerminateInvocation); }
    public MemorySegment _shaderTerminateInvocation() { return _shaderTerminateInvocationAt(0L); }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _shaderTerminateInvocationAt(long index, MemorySegment src) { _shaderTerminateInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR _shaderTerminateInvocation(MemorySegment src) { return _shaderTerminateInvocationAt(0L, src); }
}
