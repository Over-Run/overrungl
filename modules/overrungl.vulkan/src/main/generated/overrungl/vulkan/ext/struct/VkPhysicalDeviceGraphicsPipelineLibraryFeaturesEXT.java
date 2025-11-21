// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 graphicsPipelineLibrary;
/// }
/// ```
public final class VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibrary")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_graphicsPipelineLibrary = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibrary"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_graphicsPipelineLibrary = LAYOUT.select(PathElement.groupElement("graphicsPipelineLibrary"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_graphicsPipelineLibrary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibrary"));

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT copyFrom(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT at(long index, Consumer<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int graphicsPipelineLibraryAt(long index) { return (int) VH_graphicsPipelineLibrary.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int graphicsPipelineLibrary() { return (int) VH_graphicsPipelineLibrary.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT graphicsPipelineLibraryAt(long index, int value) { VH_graphicsPipelineLibrary.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT graphicsPipelineLibrary(int value) { VH_graphicsPipelineLibrary.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _graphicsPipelineLibraryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_graphicsPipelineLibrary, index), LAYOUT_graphicsPipelineLibrary); }
    public MemorySegment _graphicsPipelineLibrary() { return _graphicsPipelineLibraryAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _graphicsPipelineLibraryAt(long index, MemorySegment src) { _graphicsPipelineLibraryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT _graphicsPipelineLibrary(MemorySegment src) { return _graphicsPipelineLibraryAt(0L, src); }
}
