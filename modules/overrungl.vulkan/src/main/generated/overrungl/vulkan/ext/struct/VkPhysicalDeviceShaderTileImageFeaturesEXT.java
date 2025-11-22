// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderTileImageFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderTileImageColorReadAccess;
///     VkBool32 shaderTileImageDepthReadAccess;
///     VkBool32 shaderTileImageStencilReadAccess;
/// }
/// ```
public final class VkPhysicalDeviceShaderTileImageFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderTileImageColorReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageColorReadAccess"));
    public static final long OFFSET_shaderTileImageDepthReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    public static final long OFFSET_shaderTileImageStencilReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageStencilReadAccess"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderTileImageColorReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageColorReadAccess"));
    public static final MemoryLayout LAYOUT_shaderTileImageDepthReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    public static final MemoryLayout LAYOUT_shaderTileImageStencilReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageStencilReadAccess"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderTileImageColorReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageColorReadAccess"));
    public static final VarHandle VH_shaderTileImageDepthReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    public static final VarHandle VH_shaderTileImageStencilReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageStencilReadAccess"));

    public VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT); }
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT copyFrom(VkPhysicalDeviceShaderTileImageFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderTileImageFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderTileImageColorReadAccessAt(long index) { return (int) VH_shaderTileImageColorReadAccess.get(this.segment(), 0L, index); }
    public int shaderTileImageDepthReadAccessAt(long index) { return (int) VH_shaderTileImageDepthReadAccess.get(this.segment(), 0L, index); }
    public int shaderTileImageStencilReadAccessAt(long index) { return (int) VH_shaderTileImageStencilReadAccess.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderTileImageColorReadAccess() { return (int) VH_shaderTileImageColorReadAccess.get(this.segment(), 0L, 0L); }
    public int shaderTileImageDepthReadAccess() { return (int) VH_shaderTileImageDepthReadAccess.get(this.segment(), 0L, 0L); }
    public int shaderTileImageStencilReadAccess() { return (int) VH_shaderTileImageStencilReadAccess.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccessAt(long index, int value) { VH_shaderTileImageColorReadAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccessAt(long index, int value) { VH_shaderTileImageDepthReadAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccessAt(long index, int value) { VH_shaderTileImageStencilReadAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(int value) { VH_shaderTileImageColorReadAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(int value) { VH_shaderTileImageDepthReadAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(int value) { VH_shaderTileImageStencilReadAccess.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderTileImageColorReadAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageColorReadAccess, index), LAYOUT_shaderTileImageColorReadAccess); }
    public MemorySegment _shaderTileImageColorReadAccess() { return _shaderTileImageColorReadAccessAt(0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageColorReadAccessAt(long index, MemorySegment src) { _shaderTileImageColorReadAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageColorReadAccess(MemorySegment src) { return _shaderTileImageColorReadAccessAt(0L, src); }
    public MemorySegment _shaderTileImageDepthReadAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageDepthReadAccess, index), LAYOUT_shaderTileImageDepthReadAccess); }
    public MemorySegment _shaderTileImageDepthReadAccess() { return _shaderTileImageDepthReadAccessAt(0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageDepthReadAccessAt(long index, MemorySegment src) { _shaderTileImageDepthReadAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageDepthReadAccess(MemorySegment src) { return _shaderTileImageDepthReadAccessAt(0L, src); }
    public MemorySegment _shaderTileImageStencilReadAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTileImageStencilReadAccess, index), LAYOUT_shaderTileImageStencilReadAccess); }
    public MemorySegment _shaderTileImageStencilReadAccess() { return _shaderTileImageStencilReadAccessAt(0L); }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageStencilReadAccessAt(long index, MemorySegment src) { _shaderTileImageStencilReadAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderTileImageFeaturesEXT _shaderTileImageStencilReadAccess(MemorySegment src) { return _shaderTileImageStencilReadAccessAt(0L, src); }
}
