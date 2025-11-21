// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingValidationFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingValidationFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingValidation;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingValidationFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingValidation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingValidation = LAYOUT.byteOffset(PathElement.groupElement("rayTracingValidation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingValidation = LAYOUT.select(PathElement.groupElement("rayTracingValidation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingValidation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingValidation"));

    public VkPhysicalDeviceRayTracingValidationFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingValidationFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingValidationFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingValidationFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingValidationFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingValidationFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV); }
    public static VkPhysicalDeviceRayTracingValidationFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV copyFrom(VkPhysicalDeviceRayTracingValidationFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingValidationFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingValidationFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingValidationFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV at(long index, Consumer<VkPhysicalDeviceRayTracingValidationFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingValidationAt(long index) { return (int) VH_rayTracingValidation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingValidation() { return (int) VH_rayTracingValidation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV rayTracingValidationAt(long index, int value) { VH_rayTracingValidation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV rayTracingValidation(int value) { VH_rayTracingValidation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingValidationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingValidation, index), LAYOUT_rayTracingValidation); }
    public MemorySegment _rayTracingValidation() { return _rayTracingValidationAt(0L); }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _rayTracingValidationAt(long index, MemorySegment src) { _rayTracingValidationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingValidationFeaturesNV _rayTracingValidation(MemorySegment src) { return _rayTracingValidationAt(0L, src); }
}
