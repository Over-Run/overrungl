// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferInheritanceConditionalRenderingInfoEXT`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceConditionalRenderingInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 conditionalRenderingEnable;
/// }
/// ```
public final class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRenderingEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_conditionalRenderingEnable = LAYOUT.byteOffset(PathElement.groupElement("conditionalRenderingEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_conditionalRenderingEnable = LAYOUT.select(PathElement.groupElement("conditionalRenderingEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_conditionalRenderingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conditionalRenderingEnable"));

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT); }
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT);
        return s;
    }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT copyFrom(VkCommandBufferInheritanceConditionalRenderingInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT reinterpret(long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT asSlice(long index) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT asSlice(long index, long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT at(long index, Consumer<VkCommandBufferInheritanceConditionalRenderingInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int conditionalRenderingEnableAt(long index) { return (int) VH_conditionalRenderingEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int conditionalRenderingEnable() { return (int) VH_conditionalRenderingEnable.get(this.segment(), 0L, 0L); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnableAt(long index, int value) { VH_conditionalRenderingEnable.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnable(int value) { VH_conditionalRenderingEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _conditionalRenderingEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conditionalRenderingEnable, index), LAYOUT_conditionalRenderingEnable); }
    public MemorySegment _conditionalRenderingEnable() { return _conditionalRenderingEnableAt(0L); }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _conditionalRenderingEnableAt(long index, MemorySegment src) { _conditionalRenderingEnableAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT _conditionalRenderingEnable(MemorySegment src) { return _conditionalRenderingEnableAt(0L, src); }
}
