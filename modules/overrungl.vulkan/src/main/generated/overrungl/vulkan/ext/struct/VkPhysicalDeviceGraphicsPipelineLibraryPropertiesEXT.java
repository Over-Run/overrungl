// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 graphicsPipelineLibraryFastLinking;
///     VkBool32 graphicsPipelineLibraryIndependentInterpolationDecoration;
/// }
/// ```
public final class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_graphicsPipelineLibraryFastLinking = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    public static final long OFFSET_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_graphicsPipelineLibraryFastLinking = LAYOUT.select(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    public static final MemoryLayout LAYOUT_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.select(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_graphicsPipelineLibraryFastLinking = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    public static final VarHandle VH_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT); }
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT copyFrom(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT at(long index, Consumer<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int graphicsPipelineLibraryFastLinkingAt(long index) { return (int) VH_graphicsPipelineLibraryFastLinking.get(this.segment(), 0L, index); }
    public int graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index) { return (int) VH_graphicsPipelineLibraryIndependentInterpolationDecoration.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int graphicsPipelineLibraryFastLinking() { return (int) VH_graphicsPipelineLibraryFastLinking.get(this.segment(), 0L, 0L); }
    public int graphicsPipelineLibraryIndependentInterpolationDecoration() { return (int) VH_graphicsPipelineLibraryIndependentInterpolationDecoration.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinkingAt(long index, int value) { VH_graphicsPipelineLibraryFastLinking.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index, int value) { VH_graphicsPipelineLibraryIndependentInterpolationDecoration.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinking(int value) { VH_graphicsPipelineLibraryFastLinking.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecoration(int value) { VH_graphicsPipelineLibraryIndependentInterpolationDecoration.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _graphicsPipelineLibraryFastLinkingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_graphicsPipelineLibraryFastLinking, index), LAYOUT_graphicsPipelineLibraryFastLinking); }
    public MemorySegment _graphicsPipelineLibraryFastLinking() { return _graphicsPipelineLibraryFastLinkingAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _graphicsPipelineLibraryFastLinkingAt(long index, MemorySegment src) { _graphicsPipelineLibraryFastLinkingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _graphicsPipelineLibraryFastLinking(MemorySegment src) { return _graphicsPipelineLibraryFastLinkingAt(0L, src); }
    public MemorySegment _graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_graphicsPipelineLibraryIndependentInterpolationDecoration, index), LAYOUT_graphicsPipelineLibraryIndependentInterpolationDecoration); }
    public MemorySegment _graphicsPipelineLibraryIndependentInterpolationDecoration() { return _graphicsPipelineLibraryIndependentInterpolationDecorationAt(0L); }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index, MemorySegment src) { _graphicsPipelineLibraryIndependentInterpolationDecorationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT _graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment src) { return _graphicsPipelineLibraryIndependentInterpolationDecorationAt(0L, src); }
}
