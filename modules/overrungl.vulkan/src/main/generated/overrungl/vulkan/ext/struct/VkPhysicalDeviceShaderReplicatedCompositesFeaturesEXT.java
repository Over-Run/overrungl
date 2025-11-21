// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderReplicatedComposites;
/// }
/// ```
public final class VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderReplicatedComposites")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderReplicatedComposites = LAYOUT.byteOffset(PathElement.groupElement("shaderReplicatedComposites"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderReplicatedComposites = LAYOUT.select(PathElement.groupElement("shaderReplicatedComposites"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderReplicatedComposites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderReplicatedComposites"));

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderReplicatedComposites.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT copyFrom(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderReplicatedCompositesAt(long index) { return (int) VH_shaderReplicatedComposites.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderReplicatedComposites() { return (int) VH_shaderReplicatedComposites.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT shaderReplicatedCompositesAt(long index, int value) { VH_shaderReplicatedComposites.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT shaderReplicatedComposites(int value) { VH_shaderReplicatedComposites.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderReplicatedCompositesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderReplicatedComposites, index), LAYOUT_shaderReplicatedComposites); }
    public MemorySegment _shaderReplicatedComposites() { return _shaderReplicatedCompositesAt(0L); }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _shaderReplicatedCompositesAt(long index, MemorySegment src) { _shaderReplicatedCompositesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT _shaderReplicatedComposites(MemorySegment src) { return _shaderReplicatedCompositesAt(0L, src); }
}
