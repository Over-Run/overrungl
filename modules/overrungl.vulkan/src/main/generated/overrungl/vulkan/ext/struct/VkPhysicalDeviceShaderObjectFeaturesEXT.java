// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderObjectFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderObjectFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderObject;
/// }
/// ```
public final class VkPhysicalDeviceShaderObjectFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderObject")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderObject = LAYOUT.byteOffset(PathElement.groupElement("shaderObject"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderObject = LAYOUT.select(PathElement.groupElement("shaderObject"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderObject = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderObject"));

    public VkPhysicalDeviceShaderObjectFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderObjectFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderObjectFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderObjectFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderObjectFeaturesEXT copyFrom(VkPhysicalDeviceShaderObjectFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderObjectFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderObjectFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderObjectFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderObjectFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderObjectAt(long index) { return (int) VH_shaderObject.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderObject() { return (int) VH_shaderObject.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT shaderObjectAt(long index, int value) { VH_shaderObject.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT shaderObject(int value) { VH_shaderObject.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderObjectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderObject, index), LAYOUT_shaderObject); }
    public MemorySegment _shaderObject() { return _shaderObjectAt(0L); }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _shaderObjectAt(long index, MemorySegment src) { _shaderObjectAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectFeaturesEXT _shaderObject(MemorySegment src) { return _shaderObjectAt(0L, src); }
}
