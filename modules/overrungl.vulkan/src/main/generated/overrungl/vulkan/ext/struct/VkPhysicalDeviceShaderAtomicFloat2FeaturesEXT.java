// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderBufferFloat16Atomics;
///     VkBool32 shaderBufferFloat16AtomicAdd;
///     VkBool32 shaderBufferFloat16AtomicMinMax;
///     VkBool32 shaderBufferFloat32AtomicMinMax;
///     VkBool32 shaderBufferFloat64AtomicMinMax;
///     VkBool32 shaderSharedFloat16Atomics;
///     VkBool32 shaderSharedFloat16AtomicAdd;
///     VkBool32 shaderSharedFloat16AtomicMinMax;
///     VkBool32 shaderSharedFloat32AtomicMinMax;
///     VkBool32 shaderSharedFloat64AtomicMinMax;
///     VkBool32 shaderImageFloat32AtomicMinMax;
///     VkBool32 sparseImageFloat32AtomicMinMax;
/// }
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicMinMax")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderBufferFloat16Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16Atomics"));
    public static final long OFFSET_shaderBufferFloat16AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    public static final long OFFSET_shaderBufferFloat16AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    public static final long OFFSET_shaderBufferFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    public static final long OFFSET_shaderBufferFloat64AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    public static final long OFFSET_shaderSharedFloat16Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16Atomics"));
    public static final long OFFSET_shaderSharedFloat16AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    public static final long OFFSET_shaderSharedFloat16AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    public static final long OFFSET_shaderSharedFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    public static final long OFFSET_shaderSharedFloat64AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    public static final long OFFSET_shaderImageFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    public static final long OFFSET_sparseImageFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat16Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16Atomics"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat16AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat16AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat64AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat16Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16Atomics"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat16AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat16AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat64AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    public static final MemoryLayout LAYOUT_shaderImageFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    public static final MemoryLayout LAYOUT_sparseImageFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderBufferFloat16Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16Atomics"));
    public static final VarHandle VH_shaderBufferFloat16AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    public static final VarHandle VH_shaderBufferFloat16AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    public static final VarHandle VH_shaderBufferFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    public static final VarHandle VH_shaderBufferFloat64AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    public static final VarHandle VH_shaderSharedFloat16Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16Atomics"));
    public static final VarHandle VH_shaderSharedFloat16AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    public static final VarHandle VH_shaderSharedFloat16AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    public static final VarHandle VH_shaderSharedFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    public static final VarHandle VH_shaderSharedFloat64AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    public static final VarHandle VH_shaderImageFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    public static final VarHandle VH_sparseImageFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT copyFrom(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderBufferFloat16AtomicsAt(long index) { return (int) VH_shaderBufferFloat16Atomics.get(this.segment(), 0L, index); }
    public int shaderBufferFloat16AtomicAddAt(long index) { return (int) VH_shaderBufferFloat16AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderBufferFloat16AtomicMinMaxAt(long index) { return (int) VH_shaderBufferFloat16AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderBufferFloat32AtomicMinMaxAt(long index) { return (int) VH_shaderBufferFloat32AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderBufferFloat64AtomicMinMaxAt(long index) { return (int) VH_shaderBufferFloat64AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderSharedFloat16AtomicsAt(long index) { return (int) VH_shaderSharedFloat16Atomics.get(this.segment(), 0L, index); }
    public int shaderSharedFloat16AtomicAddAt(long index) { return (int) VH_shaderSharedFloat16AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderSharedFloat16AtomicMinMaxAt(long index) { return (int) VH_shaderSharedFloat16AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderSharedFloat32AtomicMinMaxAt(long index) { return (int) VH_shaderSharedFloat32AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderSharedFloat64AtomicMinMaxAt(long index) { return (int) VH_shaderSharedFloat64AtomicMinMax.get(this.segment(), 0L, index); }
    public int shaderImageFloat32AtomicMinMaxAt(long index) { return (int) VH_shaderImageFloat32AtomicMinMax.get(this.segment(), 0L, index); }
    public int sparseImageFloat32AtomicMinMaxAt(long index) { return (int) VH_sparseImageFloat32AtomicMinMax.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat16Atomics() { return (int) VH_shaderBufferFloat16Atomics.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat16AtomicAdd() { return (int) VH_shaderBufferFloat16AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat16AtomicMinMax() { return (int) VH_shaderBufferFloat16AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat32AtomicMinMax() { return (int) VH_shaderBufferFloat32AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat64AtomicMinMax() { return (int) VH_shaderBufferFloat64AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat16Atomics() { return (int) VH_shaderSharedFloat16Atomics.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat16AtomicAdd() { return (int) VH_shaderSharedFloat16AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat16AtomicMinMax() { return (int) VH_shaderSharedFloat16AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat32AtomicMinMax() { return (int) VH_shaderSharedFloat32AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat64AtomicMinMax() { return (int) VH_shaderSharedFloat64AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int shaderImageFloat32AtomicMinMax() { return (int) VH_shaderImageFloat32AtomicMinMax.get(this.segment(), 0L, 0L); }
    public int sparseImageFloat32AtomicMinMax() { return (int) VH_sparseImageFloat32AtomicMinMax.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicsAt(long index, int value) { VH_shaderBufferFloat16Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAddAt(long index, int value) { VH_shaderBufferFloat16AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMaxAt(long index, int value) { VH_shaderBufferFloat16AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMaxAt(long index, int value) { VH_shaderBufferFloat32AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMaxAt(long index, int value) { VH_shaderBufferFloat64AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicsAt(long index, int value) { VH_shaderSharedFloat16Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAddAt(long index, int value) { VH_shaderSharedFloat16AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMaxAt(long index, int value) { VH_shaderSharedFloat16AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMaxAt(long index, int value) { VH_shaderSharedFloat32AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMaxAt(long index, int value) { VH_shaderSharedFloat64AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMaxAt(long index, int value) { VH_shaderImageFloat32AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMaxAt(long index, int value) { VH_sparseImageFloat32AtomicMinMax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(int value) { VH_shaderBufferFloat16Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(int value) { VH_shaderBufferFloat16AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(int value) { VH_shaderBufferFloat16AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(int value) { VH_shaderBufferFloat32AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(int value) { VH_shaderBufferFloat64AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(int value) { VH_shaderSharedFloat16Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(int value) { VH_shaderSharedFloat16AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(int value) { VH_shaderSharedFloat16AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(int value) { VH_shaderSharedFloat32AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(int value) { VH_shaderSharedFloat64AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(int value) { VH_shaderImageFloat32AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(int value) { VH_sparseImageFloat32AtomicMinMax.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderBufferFloat16AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat16Atomics, index), LAYOUT_shaderBufferFloat16Atomics); }
    public MemorySegment _shaderBufferFloat16Atomics() { return _shaderBufferFloat16AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16AtomicsAt(long index, MemorySegment src) { _shaderBufferFloat16AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16Atomics(MemorySegment src) { return _shaderBufferFloat16AtomicsAt(0L, src); }
    public MemorySegment _shaderBufferFloat16AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat16AtomicAdd, index), LAYOUT_shaderBufferFloat16AtomicAdd); }
    public MemorySegment _shaderBufferFloat16AtomicAdd() { return _shaderBufferFloat16AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16AtomicAddAt(long index, MemorySegment src) { _shaderBufferFloat16AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16AtomicAdd(MemorySegment src) { return _shaderBufferFloat16AtomicAddAt(0L, src); }
    public MemorySegment _shaderBufferFloat16AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat16AtomicMinMax, index), LAYOUT_shaderBufferFloat16AtomicMinMax); }
    public MemorySegment _shaderBufferFloat16AtomicMinMax() { return _shaderBufferFloat16AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16AtomicMinMaxAt(long index, MemorySegment src) { _shaderBufferFloat16AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat16AtomicMinMax(MemorySegment src) { return _shaderBufferFloat16AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderBufferFloat32AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat32AtomicMinMax, index), LAYOUT_shaderBufferFloat32AtomicMinMax); }
    public MemorySegment _shaderBufferFloat32AtomicMinMax() { return _shaderBufferFloat32AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat32AtomicMinMaxAt(long index, MemorySegment src) { _shaderBufferFloat32AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat32AtomicMinMax(MemorySegment src) { return _shaderBufferFloat32AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderBufferFloat64AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat64AtomicMinMax, index), LAYOUT_shaderBufferFloat64AtomicMinMax); }
    public MemorySegment _shaderBufferFloat64AtomicMinMax() { return _shaderBufferFloat64AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat64AtomicMinMaxAt(long index, MemorySegment src) { _shaderBufferFloat64AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderBufferFloat64AtomicMinMax(MemorySegment src) { return _shaderBufferFloat64AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderSharedFloat16AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat16Atomics, index), LAYOUT_shaderSharedFloat16Atomics); }
    public MemorySegment _shaderSharedFloat16Atomics() { return _shaderSharedFloat16AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16AtomicsAt(long index, MemorySegment src) { _shaderSharedFloat16AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16Atomics(MemorySegment src) { return _shaderSharedFloat16AtomicsAt(0L, src); }
    public MemorySegment _shaderSharedFloat16AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat16AtomicAdd, index), LAYOUT_shaderSharedFloat16AtomicAdd); }
    public MemorySegment _shaderSharedFloat16AtomicAdd() { return _shaderSharedFloat16AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16AtomicAddAt(long index, MemorySegment src) { _shaderSharedFloat16AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16AtomicAdd(MemorySegment src) { return _shaderSharedFloat16AtomicAddAt(0L, src); }
    public MemorySegment _shaderSharedFloat16AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat16AtomicMinMax, index), LAYOUT_shaderSharedFloat16AtomicMinMax); }
    public MemorySegment _shaderSharedFloat16AtomicMinMax() { return _shaderSharedFloat16AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16AtomicMinMaxAt(long index, MemorySegment src) { _shaderSharedFloat16AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat16AtomicMinMax(MemorySegment src) { return _shaderSharedFloat16AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderSharedFloat32AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat32AtomicMinMax, index), LAYOUT_shaderSharedFloat32AtomicMinMax); }
    public MemorySegment _shaderSharedFloat32AtomicMinMax() { return _shaderSharedFloat32AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat32AtomicMinMaxAt(long index, MemorySegment src) { _shaderSharedFloat32AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat32AtomicMinMax(MemorySegment src) { return _shaderSharedFloat32AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderSharedFloat64AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat64AtomicMinMax, index), LAYOUT_shaderSharedFloat64AtomicMinMax); }
    public MemorySegment _shaderSharedFloat64AtomicMinMax() { return _shaderSharedFloat64AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat64AtomicMinMaxAt(long index, MemorySegment src) { _shaderSharedFloat64AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderSharedFloat64AtomicMinMax(MemorySegment src) { return _shaderSharedFloat64AtomicMinMaxAt(0L, src); }
    public MemorySegment _shaderImageFloat32AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderImageFloat32AtomicMinMax, index), LAYOUT_shaderImageFloat32AtomicMinMax); }
    public MemorySegment _shaderImageFloat32AtomicMinMax() { return _shaderImageFloat32AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderImageFloat32AtomicMinMaxAt(long index, MemorySegment src) { _shaderImageFloat32AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _shaderImageFloat32AtomicMinMax(MemorySegment src) { return _shaderImageFloat32AtomicMinMaxAt(0L, src); }
    public MemorySegment _sparseImageFloat32AtomicMinMaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseImageFloat32AtomicMinMax, index), LAYOUT_sparseImageFloat32AtomicMinMax); }
    public MemorySegment _sparseImageFloat32AtomicMinMax() { return _sparseImageFloat32AtomicMinMaxAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _sparseImageFloat32AtomicMinMaxAt(long index, MemorySegment src) { _sparseImageFloat32AtomicMinMaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT _sparseImageFloat32AtomicMinMax(MemorySegment src) { return _sparseImageFloat32AtomicMinMaxAt(0L, src); }
}
