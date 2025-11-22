// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCorePropertiesAMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCorePropertiesAMD {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderEngineCount;
///     uint32_t shaderArraysPerEngineCount;
///     uint32_t computeUnitsPerShaderArray;
///     uint32_t simdPerComputeUnit;
///     uint32_t wavefrontsPerSimd;
///     uint32_t wavefrontSize;
///     uint32_t sgprsPerSimd;
///     uint32_t minSgprAllocation;
///     uint32_t maxSgprAllocation;
///     uint32_t sgprAllocationGranularity;
///     uint32_t vgprsPerSimd;
///     uint32_t minVgprAllocation;
///     uint32_t maxVgprAllocation;
///     uint32_t vgprAllocationGranularity;
/// }
/// ```
public final class VkPhysicalDeviceShaderCorePropertiesAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEngineCount"),
        ValueLayout.JAVA_INT.withName("shaderArraysPerEngineCount"),
        ValueLayout.JAVA_INT.withName("computeUnitsPerShaderArray"),
        ValueLayout.JAVA_INT.withName("simdPerComputeUnit"),
        ValueLayout.JAVA_INT.withName("wavefrontsPerSimd"),
        ValueLayout.JAVA_INT.withName("wavefrontSize"),
        ValueLayout.JAVA_INT.withName("sgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minSgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxSgprAllocation"),
        ValueLayout.JAVA_INT.withName("sgprAllocationGranularity"),
        ValueLayout.JAVA_INT.withName("vgprsPerSimd"),
        ValueLayout.JAVA_INT.withName("minVgprAllocation"),
        ValueLayout.JAVA_INT.withName("maxVgprAllocation"),
        ValueLayout.JAVA_INT.withName("vgprAllocationGranularity")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderEngineCount = LAYOUT.byteOffset(PathElement.groupElement("shaderEngineCount"));
    public static final long OFFSET_shaderArraysPerEngineCount = LAYOUT.byteOffset(PathElement.groupElement("shaderArraysPerEngineCount"));
    public static final long OFFSET_computeUnitsPerShaderArray = LAYOUT.byteOffset(PathElement.groupElement("computeUnitsPerShaderArray"));
    public static final long OFFSET_simdPerComputeUnit = LAYOUT.byteOffset(PathElement.groupElement("simdPerComputeUnit"));
    public static final long OFFSET_wavefrontsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("wavefrontsPerSimd"));
    public static final long OFFSET_wavefrontSize = LAYOUT.byteOffset(PathElement.groupElement("wavefrontSize"));
    public static final long OFFSET_sgprsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("sgprsPerSimd"));
    public static final long OFFSET_minSgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("minSgprAllocation"));
    public static final long OFFSET_maxSgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("maxSgprAllocation"));
    public static final long OFFSET_sgprAllocationGranularity = LAYOUT.byteOffset(PathElement.groupElement("sgprAllocationGranularity"));
    public static final long OFFSET_vgprsPerSimd = LAYOUT.byteOffset(PathElement.groupElement("vgprsPerSimd"));
    public static final long OFFSET_minVgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("minVgprAllocation"));
    public static final long OFFSET_maxVgprAllocation = LAYOUT.byteOffset(PathElement.groupElement("maxVgprAllocation"));
    public static final long OFFSET_vgprAllocationGranularity = LAYOUT.byteOffset(PathElement.groupElement("vgprAllocationGranularity"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderEngineCount = LAYOUT.select(PathElement.groupElement("shaderEngineCount"));
    public static final MemoryLayout LAYOUT_shaderArraysPerEngineCount = LAYOUT.select(PathElement.groupElement("shaderArraysPerEngineCount"));
    public static final MemoryLayout LAYOUT_computeUnitsPerShaderArray = LAYOUT.select(PathElement.groupElement("computeUnitsPerShaderArray"));
    public static final MemoryLayout LAYOUT_simdPerComputeUnit = LAYOUT.select(PathElement.groupElement("simdPerComputeUnit"));
    public static final MemoryLayout LAYOUT_wavefrontsPerSimd = LAYOUT.select(PathElement.groupElement("wavefrontsPerSimd"));
    public static final MemoryLayout LAYOUT_wavefrontSize = LAYOUT.select(PathElement.groupElement("wavefrontSize"));
    public static final MemoryLayout LAYOUT_sgprsPerSimd = LAYOUT.select(PathElement.groupElement("sgprsPerSimd"));
    public static final MemoryLayout LAYOUT_minSgprAllocation = LAYOUT.select(PathElement.groupElement("minSgprAllocation"));
    public static final MemoryLayout LAYOUT_maxSgprAllocation = LAYOUT.select(PathElement.groupElement("maxSgprAllocation"));
    public static final MemoryLayout LAYOUT_sgprAllocationGranularity = LAYOUT.select(PathElement.groupElement("sgprAllocationGranularity"));
    public static final MemoryLayout LAYOUT_vgprsPerSimd = LAYOUT.select(PathElement.groupElement("vgprsPerSimd"));
    public static final MemoryLayout LAYOUT_minVgprAllocation = LAYOUT.select(PathElement.groupElement("minVgprAllocation"));
    public static final MemoryLayout LAYOUT_maxVgprAllocation = LAYOUT.select(PathElement.groupElement("maxVgprAllocation"));
    public static final MemoryLayout LAYOUT_vgprAllocationGranularity = LAYOUT.select(PathElement.groupElement("vgprAllocationGranularity"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEngineCount"));
    public static final VarHandle VH_shaderArraysPerEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderArraysPerEngineCount"));
    public static final VarHandle VH_computeUnitsPerShaderArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeUnitsPerShaderArray"));
    public static final VarHandle VH_simdPerComputeUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simdPerComputeUnit"));
    public static final VarHandle VH_wavefrontsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontsPerSimd"));
    public static final VarHandle VH_wavefrontSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wavefrontSize"));
    public static final VarHandle VH_sgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprsPerSimd"));
    public static final VarHandle VH_minSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSgprAllocation"));
    public static final VarHandle VH_maxSgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSgprAllocation"));
    public static final VarHandle VH_sgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sgprAllocationGranularity"));
    public static final VarHandle VH_vgprsPerSimd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprsPerSimd"));
    public static final VarHandle VH_minVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minVgprAllocation"));
    public static final VarHandle VH_maxVgprAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVgprAllocation"));
    public static final VarHandle VH_vgprAllocationGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vgprAllocationGranularity"));

    public VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesAMD(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCorePropertiesAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD); }
    public static VkPhysicalDeviceShaderCorePropertiesAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD);
        return s;
    }
    public VkPhysicalDeviceShaderCorePropertiesAMD copyFrom(VkPhysicalDeviceShaderCorePropertiesAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD reinterpret(long count) { return new VkPhysicalDeviceShaderCorePropertiesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderCorePropertiesAMD asSlice(long index) { return new VkPhysicalDeviceShaderCorePropertiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderCorePropertiesAMD asSlice(long index, long count) { return new VkPhysicalDeviceShaderCorePropertiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderCorePropertiesAMD at(long index, Consumer<VkPhysicalDeviceShaderCorePropertiesAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderEngineCountAt(long index) { return (int) VH_shaderEngineCount.get(this.segment(), 0L, index); }
    public int shaderArraysPerEngineCountAt(long index) { return (int) VH_shaderArraysPerEngineCount.get(this.segment(), 0L, index); }
    public int computeUnitsPerShaderArrayAt(long index) { return (int) VH_computeUnitsPerShaderArray.get(this.segment(), 0L, index); }
    public int simdPerComputeUnitAt(long index) { return (int) VH_simdPerComputeUnit.get(this.segment(), 0L, index); }
    public int wavefrontsPerSimdAt(long index) { return (int) VH_wavefrontsPerSimd.get(this.segment(), 0L, index); }
    public int wavefrontSizeAt(long index) { return (int) VH_wavefrontSize.get(this.segment(), 0L, index); }
    public int sgprsPerSimdAt(long index) { return (int) VH_sgprsPerSimd.get(this.segment(), 0L, index); }
    public int minSgprAllocationAt(long index) { return (int) VH_minSgprAllocation.get(this.segment(), 0L, index); }
    public int maxSgprAllocationAt(long index) { return (int) VH_maxSgprAllocation.get(this.segment(), 0L, index); }
    public int sgprAllocationGranularityAt(long index) { return (int) VH_sgprAllocationGranularity.get(this.segment(), 0L, index); }
    public int vgprsPerSimdAt(long index) { return (int) VH_vgprsPerSimd.get(this.segment(), 0L, index); }
    public int minVgprAllocationAt(long index) { return (int) VH_minVgprAllocation.get(this.segment(), 0L, index); }
    public int maxVgprAllocationAt(long index) { return (int) VH_maxVgprAllocation.get(this.segment(), 0L, index); }
    public int vgprAllocationGranularityAt(long index) { return (int) VH_vgprAllocationGranularity.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderEngineCount() { return (int) VH_shaderEngineCount.get(this.segment(), 0L, 0L); }
    public int shaderArraysPerEngineCount() { return (int) VH_shaderArraysPerEngineCount.get(this.segment(), 0L, 0L); }
    public int computeUnitsPerShaderArray() { return (int) VH_computeUnitsPerShaderArray.get(this.segment(), 0L, 0L); }
    public int simdPerComputeUnit() { return (int) VH_simdPerComputeUnit.get(this.segment(), 0L, 0L); }
    public int wavefrontsPerSimd() { return (int) VH_wavefrontsPerSimd.get(this.segment(), 0L, 0L); }
    public int wavefrontSize() { return (int) VH_wavefrontSize.get(this.segment(), 0L, 0L); }
    public int sgprsPerSimd() { return (int) VH_sgprsPerSimd.get(this.segment(), 0L, 0L); }
    public int minSgprAllocation() { return (int) VH_minSgprAllocation.get(this.segment(), 0L, 0L); }
    public int maxSgprAllocation() { return (int) VH_maxSgprAllocation.get(this.segment(), 0L, 0L); }
    public int sgprAllocationGranularity() { return (int) VH_sgprAllocationGranularity.get(this.segment(), 0L, 0L); }
    public int vgprsPerSimd() { return (int) VH_vgprsPerSimd.get(this.segment(), 0L, 0L); }
    public int minVgprAllocation() { return (int) VH_minVgprAllocation.get(this.segment(), 0L, 0L); }
    public int maxVgprAllocation() { return (int) VH_maxVgprAllocation.get(this.segment(), 0L, 0L); }
    public int vgprAllocationGranularity() { return (int) VH_vgprAllocationGranularity.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCountAt(long index, int value) { VH_shaderEngineCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCountAt(long index, int value) { VH_shaderArraysPerEngineCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArrayAt(long index, int value) { VH_computeUnitsPerShaderArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnitAt(long index, int value) { VH_simdPerComputeUnit.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimdAt(long index, int value) { VH_wavefrontsPerSimd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSizeAt(long index, int value) { VH_wavefrontSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimdAt(long index, int value) { VH_sgprsPerSimd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocationAt(long index, int value) { VH_minSgprAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocationAt(long index, int value) { VH_maxSgprAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularityAt(long index, int value) { VH_sgprAllocationGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimdAt(long index, int value) { VH_vgprsPerSimd.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocationAt(long index, int value) { VH_minVgprAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocationAt(long index, int value) { VH_maxVgprAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularityAt(long index, int value) { VH_vgprAllocationGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCount(int value) { VH_shaderEngineCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCount(int value) { VH_shaderArraysPerEngineCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArray(int value) { VH_computeUnitsPerShaderArray.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnit(int value) { VH_simdPerComputeUnit.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimd(int value) { VH_wavefrontsPerSimd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSize(int value) { VH_wavefrontSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimd(int value) { VH_sgprsPerSimd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocation(int value) { VH_minSgprAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocation(int value) { VH_maxSgprAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularity(int value) { VH_sgprAllocationGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimd(int value) { VH_vgprsPerSimd.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocation(int value) { VH_minVgprAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocation(int value) { VH_maxVgprAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularity(int value) { VH_vgprAllocationGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderEngineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderEngineCount, index), LAYOUT_shaderEngineCount); }
    public MemorySegment _shaderEngineCount() { return _shaderEngineCountAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _shaderEngineCountAt(long index, MemorySegment src) { _shaderEngineCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _shaderEngineCount(MemorySegment src) { return _shaderEngineCountAt(0L, src); }
    public MemorySegment _shaderArraysPerEngineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderArraysPerEngineCount, index), LAYOUT_shaderArraysPerEngineCount); }
    public MemorySegment _shaderArraysPerEngineCount() { return _shaderArraysPerEngineCountAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _shaderArraysPerEngineCountAt(long index, MemorySegment src) { _shaderArraysPerEngineCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _shaderArraysPerEngineCount(MemorySegment src) { return _shaderArraysPerEngineCountAt(0L, src); }
    public MemorySegment _computeUnitsPerShaderArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeUnitsPerShaderArray, index), LAYOUT_computeUnitsPerShaderArray); }
    public MemorySegment _computeUnitsPerShaderArray() { return _computeUnitsPerShaderArrayAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _computeUnitsPerShaderArrayAt(long index, MemorySegment src) { _computeUnitsPerShaderArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _computeUnitsPerShaderArray(MemorySegment src) { return _computeUnitsPerShaderArrayAt(0L, src); }
    public MemorySegment _simdPerComputeUnitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_simdPerComputeUnit, index), LAYOUT_simdPerComputeUnit); }
    public MemorySegment _simdPerComputeUnit() { return _simdPerComputeUnitAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _simdPerComputeUnitAt(long index, MemorySegment src) { _simdPerComputeUnitAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _simdPerComputeUnit(MemorySegment src) { return _simdPerComputeUnitAt(0L, src); }
    public MemorySegment _wavefrontsPerSimdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_wavefrontsPerSimd, index), LAYOUT_wavefrontsPerSimd); }
    public MemorySegment _wavefrontsPerSimd() { return _wavefrontsPerSimdAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _wavefrontsPerSimdAt(long index, MemorySegment src) { _wavefrontsPerSimdAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _wavefrontsPerSimd(MemorySegment src) { return _wavefrontsPerSimdAt(0L, src); }
    public MemorySegment _wavefrontSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_wavefrontSize, index), LAYOUT_wavefrontSize); }
    public MemorySegment _wavefrontSize() { return _wavefrontSizeAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _wavefrontSizeAt(long index, MemorySegment src) { _wavefrontSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _wavefrontSize(MemorySegment src) { return _wavefrontSizeAt(0L, src); }
    public MemorySegment _sgprsPerSimdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sgprsPerSimd, index), LAYOUT_sgprsPerSimd); }
    public MemorySegment _sgprsPerSimd() { return _sgprsPerSimdAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sgprsPerSimdAt(long index, MemorySegment src) { _sgprsPerSimdAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sgprsPerSimd(MemorySegment src) { return _sgprsPerSimdAt(0L, src); }
    public MemorySegment _minSgprAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSgprAllocation, index), LAYOUT_minSgprAllocation); }
    public MemorySegment _minSgprAllocation() { return _minSgprAllocationAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _minSgprAllocationAt(long index, MemorySegment src) { _minSgprAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _minSgprAllocation(MemorySegment src) { return _minSgprAllocationAt(0L, src); }
    public MemorySegment _maxSgprAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSgprAllocation, index), LAYOUT_maxSgprAllocation); }
    public MemorySegment _maxSgprAllocation() { return _maxSgprAllocationAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _maxSgprAllocationAt(long index, MemorySegment src) { _maxSgprAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _maxSgprAllocation(MemorySegment src) { return _maxSgprAllocationAt(0L, src); }
    public MemorySegment _sgprAllocationGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sgprAllocationGranularity, index), LAYOUT_sgprAllocationGranularity); }
    public MemorySegment _sgprAllocationGranularity() { return _sgprAllocationGranularityAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sgprAllocationGranularityAt(long index, MemorySegment src) { _sgprAllocationGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _sgprAllocationGranularity(MemorySegment src) { return _sgprAllocationGranularityAt(0L, src); }
    public MemorySegment _vgprsPerSimdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vgprsPerSimd, index), LAYOUT_vgprsPerSimd); }
    public MemorySegment _vgprsPerSimd() { return _vgprsPerSimdAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _vgprsPerSimdAt(long index, MemorySegment src) { _vgprsPerSimdAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _vgprsPerSimd(MemorySegment src) { return _vgprsPerSimdAt(0L, src); }
    public MemorySegment _minVgprAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minVgprAllocation, index), LAYOUT_minVgprAllocation); }
    public MemorySegment _minVgprAllocation() { return _minVgprAllocationAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _minVgprAllocationAt(long index, MemorySegment src) { _minVgprAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _minVgprAllocation(MemorySegment src) { return _minVgprAllocationAt(0L, src); }
    public MemorySegment _maxVgprAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVgprAllocation, index), LAYOUT_maxVgprAllocation); }
    public MemorySegment _maxVgprAllocation() { return _maxVgprAllocationAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _maxVgprAllocationAt(long index, MemorySegment src) { _maxVgprAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _maxVgprAllocation(MemorySegment src) { return _maxVgprAllocationAt(0L, src); }
    public MemorySegment _vgprAllocationGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vgprAllocationGranularity, index), LAYOUT_vgprAllocationGranularity); }
    public MemorySegment _vgprAllocationGranularity() { return _vgprAllocationGranularityAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesAMD _vgprAllocationGranularityAt(long index, MemorySegment src) { _vgprAllocationGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesAMD _vgprAllocationGranularity(MemorySegment src) { return _vgprAllocationGranularityAt(0L, src); }
}
