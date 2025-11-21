// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
/// ## Layout
/// ```
/// struct VkBindDescriptorBufferEmbeddedSamplersInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t set;
/// }
/// ```
public final class VkBindDescriptorBufferEmbeddedSamplersInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT alloc(SegmentAllocator allocator) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT); }
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT);
        return s;
    }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT copyFrom(VkBindDescriptorBufferEmbeddedSamplersInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT reinterpret(long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT asSlice(long index) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT asSlice(long index, long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT at(long index, Consumer<VkBindDescriptorBufferEmbeddedSamplersInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int setAt(long index) { return (int) VH_set.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int set() { return (int) VH_set.get(this.segment(), 0L, 0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT setAt(long index, int value) { VH_set.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(int value) { VH_set.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _setAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_set, index), LAYOUT_set); }
    public MemorySegment _set() { return _setAt(0L); }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _setAt(long index, MemorySegment src) { _setAt(index).copyFrom(src); return this; }
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT _set(MemorySegment src) { return _setAt(0L, src); }
}
