// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 nestedCommandBuffer;
///     VkBool32 nestedCommandBufferRendering;
///     VkBool32 nestedCommandBufferSimultaneousUse;
/// }
/// ```
public final class VkPhysicalDeviceNestedCommandBufferFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nestedCommandBuffer"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferRendering"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferSimultaneousUse")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_nestedCommandBuffer = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBuffer"));
    public static final long OFFSET_nestedCommandBufferRendering = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferRendering"));
    public static final long OFFSET_nestedCommandBufferSimultaneousUse = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_nestedCommandBuffer = LAYOUT.select(PathElement.groupElement("nestedCommandBuffer"));
    public static final MemoryLayout LAYOUT_nestedCommandBufferRendering = LAYOUT.select(PathElement.groupElement("nestedCommandBufferRendering"));
    public static final MemoryLayout LAYOUT_nestedCommandBufferSimultaneousUse = LAYOUT.select(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_nestedCommandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBuffer"));
    public static final VarHandle VH_nestedCommandBufferRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferRendering"));
    public static final VarHandle VH_nestedCommandBufferSimultaneousUse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT); }
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT copyFrom(VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT at(long index, Consumer<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int nestedCommandBufferAt(long index) { return (int) VH_nestedCommandBuffer.get(this.segment(), 0L, index); }
    public int nestedCommandBufferRenderingAt(long index) { return (int) VH_nestedCommandBufferRendering.get(this.segment(), 0L, index); }
    public int nestedCommandBufferSimultaneousUseAt(long index) { return (int) VH_nestedCommandBufferSimultaneousUse.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int nestedCommandBuffer() { return (int) VH_nestedCommandBuffer.get(this.segment(), 0L, 0L); }
    public int nestedCommandBufferRendering() { return (int) VH_nestedCommandBufferRendering.get(this.segment(), 0L, 0L); }
    public int nestedCommandBufferSimultaneousUse() { return (int) VH_nestedCommandBufferSimultaneousUse.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferAt(long index, int value) { VH_nestedCommandBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRenderingAt(long index, int value) { VH_nestedCommandBufferRendering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUseAt(long index, int value) { VH_nestedCommandBufferSimultaneousUse.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(int value) { VH_nestedCommandBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(int value) { VH_nestedCommandBufferRendering.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(int value) { VH_nestedCommandBufferSimultaneousUse.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nestedCommandBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nestedCommandBuffer, index), LAYOUT_nestedCommandBuffer); }
    public MemorySegment _nestedCommandBuffer() { return _nestedCommandBufferAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBufferAt(long index, MemorySegment src) { _nestedCommandBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBuffer(MemorySegment src) { return _nestedCommandBufferAt(0L, src); }
    public MemorySegment _nestedCommandBufferRenderingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nestedCommandBufferRendering, index), LAYOUT_nestedCommandBufferRendering); }
    public MemorySegment _nestedCommandBufferRendering() { return _nestedCommandBufferRenderingAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBufferRenderingAt(long index, MemorySegment src) { _nestedCommandBufferRenderingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBufferRendering(MemorySegment src) { return _nestedCommandBufferRenderingAt(0L, src); }
    public MemorySegment _nestedCommandBufferSimultaneousUseAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nestedCommandBufferSimultaneousUse, index), LAYOUT_nestedCommandBufferSimultaneousUse); }
    public MemorySegment _nestedCommandBufferSimultaneousUse() { return _nestedCommandBufferSimultaneousUseAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBufferSimultaneousUseAt(long index, MemorySegment src) { _nestedCommandBufferSimultaneousUseAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT _nestedCommandBufferSimultaneousUse(MemorySegment src) { return _nestedCommandBufferSimultaneousUseAt(0L, src); }
}
