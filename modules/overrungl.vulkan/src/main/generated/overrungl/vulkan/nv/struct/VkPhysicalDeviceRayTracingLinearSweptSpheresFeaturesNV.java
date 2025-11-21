// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 spheres;
///     VkBool32 linearSweptSpheres;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("spheres"),
        ValueLayout.JAVA_INT.withName("linearSweptSpheres")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_spheres = LAYOUT.byteOffset(PathElement.groupElement("spheres"));
    public static final long OFFSET_linearSweptSpheres = LAYOUT.byteOffset(PathElement.groupElement("linearSweptSpheres"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_spheres = LAYOUT.select(PathElement.groupElement("spheres"));
    public static final MemoryLayout LAYOUT_linearSweptSpheres = LAYOUT.select(PathElement.groupElement("linearSweptSpheres"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_spheres = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spheres"));
    public static final VarHandle VH_linearSweptSpheres = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearSweptSpheres"));

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV); }
    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV copyFrom(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV at(long index, Consumer<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int spheresAt(long index) { return (int) VH_spheres.get(this.segment(), 0L, index); }
    public int linearSweptSpheresAt(long index) { return (int) VH_linearSweptSpheres.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int spheres() { return (int) VH_spheres.get(this.segment(), 0L, 0L); }
    public int linearSweptSpheres() { return (int) VH_linearSweptSpheres.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV spheresAt(long index, int value) { VH_spheres.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV linearSweptSpheresAt(long index, int value) { VH_linearSweptSpheres.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV spheres(int value) { VH_spheres.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV linearSweptSpheres(int value) { VH_linearSweptSpheres.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _spheresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_spheres, index), LAYOUT_spheres); }
    public MemorySegment _spheres() { return _spheresAt(0L); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _spheresAt(long index, MemorySegment src) { _spheresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _spheres(MemorySegment src) { return _spheresAt(0L, src); }
    public MemorySegment _linearSweptSpheresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_linearSweptSpheres, index), LAYOUT_linearSweptSpheres); }
    public MemorySegment _linearSweptSpheres() { return _linearSweptSpheresAt(0L); }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _linearSweptSpheresAt(long index, MemorySegment src) { _linearSweptSpheresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV _linearSweptSpheres(MemorySegment src) { return _linearSweptSpheresAt(0L, src); }
}
