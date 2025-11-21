// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceConditionalRenderingFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceConditionalRenderingFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 conditionalRendering;
///     VkBool32 inheritedConditionalRendering;
/// }
/// ```
public final class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRendering"),
        ValueLayout.JAVA_INT.withName("inheritedConditionalRendering")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_conditionalRendering = LAYOUT.byteOffset(PathElement.groupElement("conditionalRendering"));
    public static final long OFFSET_inheritedConditionalRendering = LAYOUT.byteOffset(PathElement.groupElement("inheritedConditionalRendering"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_conditionalRendering = LAYOUT.select(PathElement.groupElement("conditionalRendering"));
    public static final MemoryLayout LAYOUT_inheritedConditionalRendering = LAYOUT.select(PathElement.groupElement("inheritedConditionalRendering"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_conditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conditionalRendering"));
    public static final VarHandle VH_inheritedConditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedConditionalRendering"));

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT); }
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT copyFrom(VkPhysicalDeviceConditionalRenderingFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT at(long index, Consumer<VkPhysicalDeviceConditionalRenderingFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int conditionalRenderingAt(long index) { return (int) VH_conditionalRendering.get(this.segment(), 0L, index); }
    public int inheritedConditionalRenderingAt(long index) { return (int) VH_inheritedConditionalRendering.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int conditionalRendering() { return (int) VH_conditionalRendering.get(this.segment(), 0L, 0L); }
    public int inheritedConditionalRendering() { return (int) VH_inheritedConditionalRendering.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRenderingAt(long index, int value) { VH_conditionalRendering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRenderingAt(long index, int value) { VH_inheritedConditionalRendering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(int value) { VH_conditionalRendering.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(int value) { VH_inheritedConditionalRendering.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _conditionalRenderingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conditionalRendering, index), LAYOUT_conditionalRendering); }
    public MemorySegment _conditionalRendering() { return _conditionalRenderingAt(0L); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _conditionalRenderingAt(long index, MemorySegment src) { _conditionalRenderingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _conditionalRendering(MemorySegment src) { return _conditionalRenderingAt(0L, src); }
    public MemorySegment _inheritedConditionalRenderingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inheritedConditionalRendering, index), LAYOUT_inheritedConditionalRendering); }
    public MemorySegment _inheritedConditionalRendering() { return _inheritedConditionalRenderingAt(0L); }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _inheritedConditionalRenderingAt(long index, MemorySegment src) { _inheritedConditionalRenderingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT _inheritedConditionalRendering(MemorySegment src) { return _inheritedConditionalRenderingAt(0L, src); }
}
