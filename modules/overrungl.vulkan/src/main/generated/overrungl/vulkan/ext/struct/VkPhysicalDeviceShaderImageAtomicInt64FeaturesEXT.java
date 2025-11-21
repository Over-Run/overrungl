// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderImageInt64Atomics;
///     VkBool32 sparseImageInt64Atomics;
/// }
/// ```
public final class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderImageInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderImageInt64Atomics"));
    public static final long OFFSET_sparseImageInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("sparseImageInt64Atomics"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderImageInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderImageInt64Atomics"));
    public static final MemoryLayout LAYOUT_sparseImageInt64Atomics = LAYOUT.select(PathElement.groupElement("sparseImageInt64Atomics"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageInt64Atomics"));
    public static final VarHandle VH_sparseImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageInt64Atomics"));

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT copyFrom(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderImageInt64AtomicsAt(long index) { return (int) VH_shaderImageInt64Atomics.get(this.segment(), 0L, index); }
    public int sparseImageInt64AtomicsAt(long index) { return (int) VH_sparseImageInt64Atomics.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderImageInt64Atomics() { return (int) VH_shaderImageInt64Atomics.get(this.segment(), 0L, 0L); }
    public int sparseImageInt64Atomics() { return (int) VH_sparseImageInt64Atomics.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64AtomicsAt(long index, int value) { VH_shaderImageInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64AtomicsAt(long index, int value) { VH_sparseImageInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(int value) { VH_shaderImageInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(int value) { VH_sparseImageInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderImageInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderImageInt64Atomics, index), LAYOUT_shaderImageInt64Atomics); }
    public MemorySegment _shaderImageInt64Atomics() { return _shaderImageInt64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _shaderImageInt64AtomicsAt(long index, MemorySegment src) { _shaderImageInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _shaderImageInt64Atomics(MemorySegment src) { return _shaderImageInt64AtomicsAt(0L, src); }
    public MemorySegment _sparseImageInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseImageInt64Atomics, index), LAYOUT_sparseImageInt64Atomics); }
    public MemorySegment _sparseImageInt64Atomics() { return _sparseImageInt64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _sparseImageInt64AtomicsAt(long index, MemorySegment src) { _sparseImageInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT _sparseImageInt64Atomics(MemorySegment src) { return _sparseImageInt64AtomicsAt(0L, src); }
}
