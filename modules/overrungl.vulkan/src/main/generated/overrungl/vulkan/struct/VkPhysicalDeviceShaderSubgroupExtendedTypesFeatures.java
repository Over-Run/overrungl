// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupExtendedTypes;
/// }
/// ```
public final class VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupExtendedTypes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSubgroupExtendedTypes = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSubgroupExtendedTypes = LAYOUT.select(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSubgroupExtendedTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupExtendedTypes"));

    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures copyFrom(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures reinterpret(long count) { return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures asSlice(long index, long count) { return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures at(long index, Consumer<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSubgroupExtendedTypesAt(long index) { return (int) VH_shaderSubgroupExtendedTypes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupExtendedTypes() { return (int) VH_shaderSubgroupExtendedTypes.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures shaderSubgroupExtendedTypesAt(long index, int value) { VH_shaderSubgroupExtendedTypes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures shaderSubgroupExtendedTypes(int value) { VH_shaderSubgroupExtendedTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSubgroupExtendedTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupExtendedTypes, index), LAYOUT_shaderSubgroupExtendedTypes); }
    public MemorySegment _shaderSubgroupExtendedTypes() { return _shaderSubgroupExtendedTypesAt(0L); }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _shaderSubgroupExtendedTypesAt(long index, MemorySegment src) { _shaderSubgroupExtendedTypesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures _shaderSubgroupExtendedTypes(MemorySegment src) { return _shaderSubgroupExtendedTypesAt(0L, src); }
}
