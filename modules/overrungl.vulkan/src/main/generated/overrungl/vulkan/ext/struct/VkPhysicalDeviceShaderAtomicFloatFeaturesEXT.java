// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderBufferFloat32Atomics;
///     VkBool32 shaderBufferFloat32AtomicAdd;
///     VkBool32 shaderBufferFloat64Atomics;
///     VkBool32 shaderBufferFloat64AtomicAdd;
///     VkBool32 shaderSharedFloat32Atomics;
///     VkBool32 shaderSharedFloat32AtomicAdd;
///     VkBool32 shaderSharedFloat64Atomics;
///     VkBool32 shaderSharedFloat64AtomicAdd;
///     VkBool32 shaderImageFloat32Atomics;
///     VkBool32 shaderImageFloat32AtomicAdd;
///     VkBool32 sparseImageFloat32Atomics;
///     VkBool32 sparseImageFloat32AtomicAdd;
/// }
/// ```
public final class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderBufferFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32Atomics"));
    public static final long OFFSET_shaderBufferFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    public static final long OFFSET_shaderBufferFloat64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64Atomics"));
    public static final long OFFSET_shaderBufferFloat64AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    public static final long OFFSET_shaderSharedFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32Atomics"));
    public static final long OFFSET_shaderSharedFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    public static final long OFFSET_shaderSharedFloat64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64Atomics"));
    public static final long OFFSET_shaderSharedFloat64AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    public static final long OFFSET_shaderImageFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32Atomics"));
    public static final long OFFSET_shaderImageFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    public static final long OFFSET_sparseImageFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32Atomics"));
    public static final long OFFSET_sparseImageFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32Atomics"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64Atomics"));
    public static final MemoryLayout LAYOUT_shaderBufferFloat64AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32Atomics"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64Atomics"));
    public static final MemoryLayout LAYOUT_shaderSharedFloat64AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    public static final MemoryLayout LAYOUT_shaderImageFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderImageFloat32Atomics"));
    public static final MemoryLayout LAYOUT_shaderImageFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    public static final MemoryLayout LAYOUT_sparseImageFloat32Atomics = LAYOUT.select(PathElement.groupElement("sparseImageFloat32Atomics"));
    public static final MemoryLayout LAYOUT_sparseImageFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderBufferFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32Atomics"));
    public static final VarHandle VH_shaderBufferFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    public static final VarHandle VH_shaderBufferFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64Atomics"));
    public static final VarHandle VH_shaderBufferFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    public static final VarHandle VH_shaderSharedFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32Atomics"));
    public static final VarHandle VH_shaderSharedFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    public static final VarHandle VH_shaderSharedFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64Atomics"));
    public static final VarHandle VH_shaderSharedFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    public static final VarHandle VH_shaderImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32Atomics"));
    public static final VarHandle VH_shaderImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    public static final VarHandle VH_sparseImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32Atomics"));
    public static final VarHandle VH_sparseImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicAdd"));

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT copyFrom(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderBufferFloat32AtomicsAt(long index) { return (int) VH_shaderBufferFloat32Atomics.get(this.segment(), 0L, index); }
    public int shaderBufferFloat32AtomicAddAt(long index) { return (int) VH_shaderBufferFloat32AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderBufferFloat64AtomicsAt(long index) { return (int) VH_shaderBufferFloat64Atomics.get(this.segment(), 0L, index); }
    public int shaderBufferFloat64AtomicAddAt(long index) { return (int) VH_shaderBufferFloat64AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderSharedFloat32AtomicsAt(long index) { return (int) VH_shaderSharedFloat32Atomics.get(this.segment(), 0L, index); }
    public int shaderSharedFloat32AtomicAddAt(long index) { return (int) VH_shaderSharedFloat32AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderSharedFloat64AtomicsAt(long index) { return (int) VH_shaderSharedFloat64Atomics.get(this.segment(), 0L, index); }
    public int shaderSharedFloat64AtomicAddAt(long index) { return (int) VH_shaderSharedFloat64AtomicAdd.get(this.segment(), 0L, index); }
    public int shaderImageFloat32AtomicsAt(long index) { return (int) VH_shaderImageFloat32Atomics.get(this.segment(), 0L, index); }
    public int shaderImageFloat32AtomicAddAt(long index) { return (int) VH_shaderImageFloat32AtomicAdd.get(this.segment(), 0L, index); }
    public int sparseImageFloat32AtomicsAt(long index) { return (int) VH_sparseImageFloat32Atomics.get(this.segment(), 0L, index); }
    public int sparseImageFloat32AtomicAddAt(long index) { return (int) VH_sparseImageFloat32AtomicAdd.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat32Atomics() { return (int) VH_shaderBufferFloat32Atomics.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat32AtomicAdd() { return (int) VH_shaderBufferFloat32AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat64Atomics() { return (int) VH_shaderBufferFloat64Atomics.get(this.segment(), 0L, 0L); }
    public int shaderBufferFloat64AtomicAdd() { return (int) VH_shaderBufferFloat64AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat32Atomics() { return (int) VH_shaderSharedFloat32Atomics.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat32AtomicAdd() { return (int) VH_shaderSharedFloat32AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat64Atomics() { return (int) VH_shaderSharedFloat64Atomics.get(this.segment(), 0L, 0L); }
    public int shaderSharedFloat64AtomicAdd() { return (int) VH_shaderSharedFloat64AtomicAdd.get(this.segment(), 0L, 0L); }
    public int shaderImageFloat32Atomics() { return (int) VH_shaderImageFloat32Atomics.get(this.segment(), 0L, 0L); }
    public int shaderImageFloat32AtomicAdd() { return (int) VH_shaderImageFloat32AtomicAdd.get(this.segment(), 0L, 0L); }
    public int sparseImageFloat32Atomics() { return (int) VH_sparseImageFloat32Atomics.get(this.segment(), 0L, 0L); }
    public int sparseImageFloat32AtomicAdd() { return (int) VH_sparseImageFloat32AtomicAdd.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicsAt(long index, int value) { VH_shaderBufferFloat32Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAddAt(long index, int value) { VH_shaderBufferFloat32AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicsAt(long index, int value) { VH_shaderBufferFloat64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAddAt(long index, int value) { VH_shaderBufferFloat64AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicsAt(long index, int value) { VH_shaderSharedFloat32Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAddAt(long index, int value) { VH_shaderSharedFloat32AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicsAt(long index, int value) { VH_shaderSharedFloat64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAddAt(long index, int value) { VH_shaderSharedFloat64AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicsAt(long index, int value) { VH_shaderImageFloat32Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAddAt(long index, int value) { VH_shaderImageFloat32AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicsAt(long index, int value) { VH_sparseImageFloat32Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAddAt(long index, int value) { VH_sparseImageFloat32AtomicAdd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(int value) { VH_shaderBufferFloat32Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(int value) { VH_shaderBufferFloat32AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(int value) { VH_shaderBufferFloat64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(int value) { VH_shaderBufferFloat64AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(int value) { VH_shaderSharedFloat32Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(int value) { VH_shaderSharedFloat32AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(int value) { VH_shaderSharedFloat64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(int value) { VH_shaderSharedFloat64AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(int value) { VH_shaderImageFloat32Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(int value) { VH_shaderImageFloat32AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(int value) { VH_sparseImageFloat32Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(int value) { VH_sparseImageFloat32AtomicAdd.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderBufferFloat32AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat32Atomics, index), LAYOUT_shaderBufferFloat32Atomics); }
    public MemorySegment _shaderBufferFloat32Atomics() { return _shaderBufferFloat32AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat32AtomicsAt(long index, MemorySegment src) { _shaderBufferFloat32AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat32Atomics(MemorySegment src) { return _shaderBufferFloat32AtomicsAt(0L, src); }
    public MemorySegment _shaderBufferFloat32AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat32AtomicAdd, index), LAYOUT_shaderBufferFloat32AtomicAdd); }
    public MemorySegment _shaderBufferFloat32AtomicAdd() { return _shaderBufferFloat32AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat32AtomicAddAt(long index, MemorySegment src) { _shaderBufferFloat32AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat32AtomicAdd(MemorySegment src) { return _shaderBufferFloat32AtomicAddAt(0L, src); }
    public MemorySegment _shaderBufferFloat64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat64Atomics, index), LAYOUT_shaderBufferFloat64Atomics); }
    public MemorySegment _shaderBufferFloat64Atomics() { return _shaderBufferFloat64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat64AtomicsAt(long index, MemorySegment src) { _shaderBufferFloat64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat64Atomics(MemorySegment src) { return _shaderBufferFloat64AtomicsAt(0L, src); }
    public MemorySegment _shaderBufferFloat64AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferFloat64AtomicAdd, index), LAYOUT_shaderBufferFloat64AtomicAdd); }
    public MemorySegment _shaderBufferFloat64AtomicAdd() { return _shaderBufferFloat64AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat64AtomicAddAt(long index, MemorySegment src) { _shaderBufferFloat64AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderBufferFloat64AtomicAdd(MemorySegment src) { return _shaderBufferFloat64AtomicAddAt(0L, src); }
    public MemorySegment _shaderSharedFloat32AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat32Atomics, index), LAYOUT_shaderSharedFloat32Atomics); }
    public MemorySegment _shaderSharedFloat32Atomics() { return _shaderSharedFloat32AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat32AtomicsAt(long index, MemorySegment src) { _shaderSharedFloat32AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat32Atomics(MemorySegment src) { return _shaderSharedFloat32AtomicsAt(0L, src); }
    public MemorySegment _shaderSharedFloat32AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat32AtomicAdd, index), LAYOUT_shaderSharedFloat32AtomicAdd); }
    public MemorySegment _shaderSharedFloat32AtomicAdd() { return _shaderSharedFloat32AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat32AtomicAddAt(long index, MemorySegment src) { _shaderSharedFloat32AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat32AtomicAdd(MemorySegment src) { return _shaderSharedFloat32AtomicAddAt(0L, src); }
    public MemorySegment _shaderSharedFloat64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat64Atomics, index), LAYOUT_shaderSharedFloat64Atomics); }
    public MemorySegment _shaderSharedFloat64Atomics() { return _shaderSharedFloat64AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat64AtomicsAt(long index, MemorySegment src) { _shaderSharedFloat64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat64Atomics(MemorySegment src) { return _shaderSharedFloat64AtomicsAt(0L, src); }
    public MemorySegment _shaderSharedFloat64AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedFloat64AtomicAdd, index), LAYOUT_shaderSharedFloat64AtomicAdd); }
    public MemorySegment _shaderSharedFloat64AtomicAdd() { return _shaderSharedFloat64AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat64AtomicAddAt(long index, MemorySegment src) { _shaderSharedFloat64AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderSharedFloat64AtomicAdd(MemorySegment src) { return _shaderSharedFloat64AtomicAddAt(0L, src); }
    public MemorySegment _shaderImageFloat32AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderImageFloat32Atomics, index), LAYOUT_shaderImageFloat32Atomics); }
    public MemorySegment _shaderImageFloat32Atomics() { return _shaderImageFloat32AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderImageFloat32AtomicsAt(long index, MemorySegment src) { _shaderImageFloat32AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderImageFloat32Atomics(MemorySegment src) { return _shaderImageFloat32AtomicsAt(0L, src); }
    public MemorySegment _shaderImageFloat32AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderImageFloat32AtomicAdd, index), LAYOUT_shaderImageFloat32AtomicAdd); }
    public MemorySegment _shaderImageFloat32AtomicAdd() { return _shaderImageFloat32AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderImageFloat32AtomicAddAt(long index, MemorySegment src) { _shaderImageFloat32AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _shaderImageFloat32AtomicAdd(MemorySegment src) { return _shaderImageFloat32AtomicAddAt(0L, src); }
    public MemorySegment _sparseImageFloat32AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseImageFloat32Atomics, index), LAYOUT_sparseImageFloat32Atomics); }
    public MemorySegment _sparseImageFloat32Atomics() { return _sparseImageFloat32AtomicsAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sparseImageFloat32AtomicsAt(long index, MemorySegment src) { _sparseImageFloat32AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sparseImageFloat32Atomics(MemorySegment src) { return _sparseImageFloat32AtomicsAt(0L, src); }
    public MemorySegment _sparseImageFloat32AtomicAddAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseImageFloat32AtomicAdd, index), LAYOUT_sparseImageFloat32AtomicAdd); }
    public MemorySegment _sparseImageFloat32AtomicAdd() { return _sparseImageFloat32AtomicAddAt(0L); }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sparseImageFloat32AtomicAddAt(long index, MemorySegment src) { _sparseImageFloat32AtomicAddAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT _sparseImageFloat32AtomicAdd(MemorySegment src) { return _sparseImageFloat32AtomicAddAt(0L, src); }
}
