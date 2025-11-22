// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     size_t combinedImageSamplerDensityMapDescriptorSize;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("combinedImageSamplerDensityMapDescriptorSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_combinedImageSamplerDensityMapDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_combinedImageSamplerDensityMapDescriptorSize = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_combinedImageSamplerDensityMapDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT); }
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT copyFrom(VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT at(long index, Consumer<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long combinedImageSamplerDensityMapDescriptorSizeAt(long index) { return (long) VH_combinedImageSamplerDensityMapDescriptorSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long combinedImageSamplerDensityMapDescriptorSize() { return (long) VH_combinedImageSamplerDensityMapDescriptorSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT combinedImageSamplerDensityMapDescriptorSizeAt(long index, long value) { VH_combinedImageSamplerDensityMapDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT combinedImageSamplerDensityMapDescriptorSize(long value) { VH_combinedImageSamplerDensityMapDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _combinedImageSamplerDensityMapDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinedImageSamplerDensityMapDescriptorSize, index), LAYOUT_combinedImageSamplerDensityMapDescriptorSize); }
    public MemorySegment _combinedImageSamplerDensityMapDescriptorSize() { return _combinedImageSamplerDensityMapDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _combinedImageSamplerDensityMapDescriptorSizeAt(long index, MemorySegment src) { _combinedImageSamplerDensityMapDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT _combinedImageSamplerDensityMapDescriptorSize(MemorySegment src) { return _combinedImageSamplerDensityMapDescriptorSizeAt(0L, src); }
}
