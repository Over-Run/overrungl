// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderModuleIdentifier;
/// }
/// ```
public final class VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderModuleIdentifier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderModuleIdentifier = LAYOUT.byteOffset(PathElement.groupElement("shaderModuleIdentifier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderModuleIdentifier = LAYOUT.select(PathElement.groupElement("shaderModuleIdentifier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderModuleIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderModuleIdentifier"));

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT copyFrom(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderModuleIdentifierAt(long index) { return (int) VH_shaderModuleIdentifier.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderModuleIdentifier() { return (int) VH_shaderModuleIdentifier.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT shaderModuleIdentifierAt(long index, int value) { VH_shaderModuleIdentifier.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT shaderModuleIdentifier(int value) { VH_shaderModuleIdentifier.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderModuleIdentifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderModuleIdentifier, index), LAYOUT_shaderModuleIdentifier); }
    public MemorySegment _shaderModuleIdentifier() { return _shaderModuleIdentifierAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _shaderModuleIdentifierAt(long index, MemorySegment src) { _shaderModuleIdentifierAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT _shaderModuleIdentifier(MemorySegment src) { return _shaderModuleIdentifierAt(0L, src); }
}
