// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderDemoteToHelperInvocation;
/// }
/// ```
public final class VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderDemoteToHelperInvocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderDemoteToHelperInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderDemoteToHelperInvocation = LAYOUT.select(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderDemoteToHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDemoteToHelperInvocation"));

    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES); }
    public static VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures copyFrom(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures reinterpret(long count) { return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures asSlice(long index) { return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures asSlice(long index, long count) { return new VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures at(long index, Consumer<VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderDemoteToHelperInvocationAt(long index) { return (int) VH_shaderDemoteToHelperInvocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderDemoteToHelperInvocation() { return (int) VH_shaderDemoteToHelperInvocation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures shaderDemoteToHelperInvocationAt(long index, int value) { VH_shaderDemoteToHelperInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures shaderDemoteToHelperInvocation(int value) { VH_shaderDemoteToHelperInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderDemoteToHelperInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDemoteToHelperInvocation, index), LAYOUT_shaderDemoteToHelperInvocation); }
    public MemorySegment _shaderDemoteToHelperInvocation() { return _shaderDemoteToHelperInvocationAt(0L); }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _shaderDemoteToHelperInvocationAt(long index, MemorySegment src) { _shaderDemoteToHelperInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures _shaderDemoteToHelperInvocation(MemorySegment src) { return _shaderDemoteToHelperInvocationAt(0L, src); }
}
