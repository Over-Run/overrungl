// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderTileImageCoherentReadAccelerated;
///     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
///     VkBool32 shaderTileImageReadFromHelperInvocation;
/// }
/// ```
public final class VkPhysicalDeviceShaderTileImagePropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderTileImageCoherentReadAccelerated = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    public static final long OFFSET_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    public static final long OFFSET_shaderTileImageReadFromHelperInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderTileImageCoherentReadAccelerated = LAYOUT.select(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    public static final MemoryLayout LAYOUT_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.select(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    public static final MemoryLayout LAYOUT_shaderTileImageReadFromHelperInvocation = LAYOUT.select(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderTileImageCoherentReadAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    public static final VarHandle VH_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    public static final VarHandle VH_shaderTileImageReadFromHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));

    public VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT); }
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT copyFrom(VkPhysicalDeviceShaderTileImagePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT at(long index, Consumer<VkPhysicalDeviceShaderTileImagePropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderTileImageCoherentReadAcceleratedAt(long index) { return (int) VH_shaderTileImageCoherentReadAccelerated.get(this.segment(), 0L, index); }
    public int shaderTileImageReadSampleFromPixelRateInvocationAt(long index) { return (int) VH_shaderTileImageReadSampleFromPixelRateInvocation.get(this.segment(), 0L, index); }
    public int shaderTileImageReadFromHelperInvocationAt(long index) { return (int) VH_shaderTileImageReadFromHelperInvocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderTileImageCoherentReadAccelerated() { return (int) VH_shaderTileImageCoherentReadAccelerated.get(this.segment(), 0L, 0L); }
    public int shaderTileImageReadSampleFromPixelRateInvocation() { return (int) VH_shaderTileImageReadSampleFromPixelRateInvocation.get(this.segment(), 0L, 0L); }
    public int shaderTileImageReadFromHelperInvocation() { return (int) VH_shaderTileImageReadFromHelperInvocation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAcceleratedAt(long index, int value) { VH_shaderTileImageCoherentReadAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocationAt(long index, int value) { VH_shaderTileImageReadSampleFromPixelRateInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocationAt(long index, int value) { VH_shaderTileImageReadFromHelperInvocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAccelerated(int value) { VH_shaderTileImageCoherentReadAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocation(int value) { VH_shaderTileImageReadSampleFromPixelRateInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocation(int value) { VH_shaderTileImageReadFromHelperInvocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderTileImageCoherentReadAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageCoherentReadAccelerated, index), LAYOUT_shaderTileImageCoherentReadAccelerated); }
    public MemorySegment _shaderTileImageCoherentReadAccelerated() { return _shaderTileImageCoherentReadAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageCoherentReadAcceleratedAt(long index, MemorySegment src) { _shaderTileImageCoherentReadAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageCoherentReadAccelerated(MemorySegment src) { return _shaderTileImageCoherentReadAcceleratedAt(0L, src); }
    public MemorySegment _shaderTileImageReadSampleFromPixelRateInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageReadSampleFromPixelRateInvocation, index), LAYOUT_shaderTileImageReadSampleFromPixelRateInvocation); }
    public MemorySegment _shaderTileImageReadSampleFromPixelRateInvocation() { return _shaderTileImageReadSampleFromPixelRateInvocationAt(0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageReadSampleFromPixelRateInvocationAt(long index, MemorySegment src) { _shaderTileImageReadSampleFromPixelRateInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment src) { return _shaderTileImageReadSampleFromPixelRateInvocationAt(0L, src); }
    public MemorySegment _shaderTileImageReadFromHelperInvocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageReadFromHelperInvocation, index), LAYOUT_shaderTileImageReadFromHelperInvocation); }
    public MemorySegment _shaderTileImageReadFromHelperInvocation() { return _shaderTileImageReadFromHelperInvocationAt(0L); }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageReadFromHelperInvocationAt(long index, MemorySegment src) { _shaderTileImageReadFromHelperInvocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImagePropertiesEXT _shaderTileImageReadFromHelperInvocation(MemorySegment src) { return _shaderTileImageReadFromHelperInvocationAt(0L, src); }
}
