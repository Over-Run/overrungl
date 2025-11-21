// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderMaximalReconvergence;
/// }
/// ```
public final class VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderMaximalReconvergence")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderMaximalReconvergence = LAYOUT.byteOffset(PathElement.groupElement("shaderMaximalReconvergence"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderMaximalReconvergence = LAYOUT.select(PathElement.groupElement("shaderMaximalReconvergence"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderMaximalReconvergence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderMaximalReconvergence"));

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR copyFrom(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderMaximalReconvergenceAt(long index) { return (int) VH_shaderMaximalReconvergence.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderMaximalReconvergence() { return (int) VH_shaderMaximalReconvergence.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR shaderMaximalReconvergenceAt(long index, int value) { VH_shaderMaximalReconvergence.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR shaderMaximalReconvergence(int value) { VH_shaderMaximalReconvergence.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderMaximalReconvergenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderMaximalReconvergence, index), LAYOUT_shaderMaximalReconvergence); }
    public MemorySegment _shaderMaximalReconvergence() { return _shaderMaximalReconvergenceAt(0L); }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _shaderMaximalReconvergenceAt(long index, MemorySegment src) { _shaderMaximalReconvergenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR _shaderMaximalReconvergence(MemorySegment src) { return _shaderMaximalReconvergenceAt(0L, src); }
}
