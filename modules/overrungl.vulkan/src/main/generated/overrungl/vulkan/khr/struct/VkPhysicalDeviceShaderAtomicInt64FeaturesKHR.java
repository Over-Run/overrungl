// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderAtomicInt64FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicInt64FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderBufferInt64Atomics;
///     VkBool32 shaderSharedInt64Atomics;
/// }
/// ```
public final class VkPhysicalDeviceShaderAtomicInt64FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderBufferInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final long OFFSET_shaderSharedInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderBufferInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final MemoryLayout LAYOUT_shaderSharedInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedInt64Atomics"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));

    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR copyFrom(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderAtomicInt64FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderBufferInt64AtomicsAt(long index) { return (int) VH_shaderBufferInt64Atomics.get(this.segment(), 0L, index); }
    public int shaderSharedInt64AtomicsAt(long index) { return (int) VH_shaderSharedInt64Atomics.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderBufferInt64Atomics() { return (int) VH_shaderBufferInt64Atomics.get(this.segment(), 0L, 0L); }
    public int shaderSharedInt64Atomics() { return (int) VH_shaderSharedInt64Atomics.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderBufferInt64AtomicsAt(long index, int value) { VH_shaderBufferInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderSharedInt64AtomicsAt(long index, int value) { VH_shaderSharedInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderBufferInt64Atomics(int value) { VH_shaderBufferInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderSharedInt64Atomics(int value) { VH_shaderSharedInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderBufferInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferInt64Atomics, index), LAYOUT_shaderBufferInt64Atomics); }
    public MemorySegment _shaderBufferInt64Atomics() { return _shaderBufferInt64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _shaderBufferInt64AtomicsAt(long index, MemorySegment src) { _shaderBufferInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _shaderBufferInt64Atomics(MemorySegment src) { return _shaderBufferInt64AtomicsAt(0L, src); }
    public MemorySegment _shaderSharedInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedInt64Atomics, index), LAYOUT_shaderSharedInt64Atomics); }
    public MemorySegment _shaderSharedInt64Atomics() { return _shaderSharedInt64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _shaderSharedInt64AtomicsAt(long index, MemorySegment src) { _shaderSharedInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR _shaderSharedInt64Atomics(MemorySegment src) { return _shaderSharedInt64AtomicsAt(0L, src); }
}
