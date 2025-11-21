// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderEnqueueFeaturesAMDX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderEnqueue;
///     VkBool32 shaderMeshEnqueue;
/// }
/// ```
public final class VkPhysicalDeviceShaderEnqueueFeaturesAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEnqueue"),
        ValueLayout.JAVA_INT.withName("shaderMeshEnqueue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderEnqueue = LAYOUT.byteOffset(PathElement.groupElement("shaderEnqueue"));
    public static final long OFFSET_shaderMeshEnqueue = LAYOUT.byteOffset(PathElement.groupElement("shaderMeshEnqueue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderEnqueue = LAYOUT.select(PathElement.groupElement("shaderEnqueue"));
    public static final MemoryLayout LAYOUT_shaderMeshEnqueue = LAYOUT.select(PathElement.groupElement("shaderMeshEnqueue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderEnqueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEnqueue"));
    public static final VarHandle VH_shaderMeshEnqueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderMeshEnqueue"));

    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX); }
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX);
        return s;
    }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX copyFrom(VkPhysicalDeviceShaderEnqueueFeaturesAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX reinterpret(long count) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX asSlice(long index) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX asSlice(long index, long count) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX at(long index, Consumer<VkPhysicalDeviceShaderEnqueueFeaturesAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderEnqueueAt(long index) { return (int) VH_shaderEnqueue.get(this.segment(), 0L, index); }
    public int shaderMeshEnqueueAt(long index) { return (int) VH_shaderMeshEnqueue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderEnqueue() { return (int) VH_shaderEnqueue.get(this.segment(), 0L, 0L); }
    public int shaderMeshEnqueue() { return (int) VH_shaderMeshEnqueue.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderEnqueueAt(long index, int value) { VH_shaderEnqueue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderMeshEnqueueAt(long index, int value) { VH_shaderMeshEnqueue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderEnqueue(int value) { VH_shaderEnqueue.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderMeshEnqueue(int value) { VH_shaderMeshEnqueue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderEnqueueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderEnqueue, index), LAYOUT_shaderEnqueue); }
    public MemorySegment _shaderEnqueue() { return _shaderEnqueueAt(0L); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _shaderEnqueueAt(long index, MemorySegment src) { _shaderEnqueueAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _shaderEnqueue(MemorySegment src) { return _shaderEnqueueAt(0L, src); }
    public MemorySegment _shaderMeshEnqueueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderMeshEnqueue, index), LAYOUT_shaderMeshEnqueue); }
    public MemorySegment _shaderMeshEnqueue() { return _shaderMeshEnqueueAt(0L); }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _shaderMeshEnqueueAt(long index, MemorySegment src) { _shaderMeshEnqueueAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX _shaderMeshEnqueue(MemorySegment src) { return _shaderMeshEnqueueAt(0L, src); }
}
