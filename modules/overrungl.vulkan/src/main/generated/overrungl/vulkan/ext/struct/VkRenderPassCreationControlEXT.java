// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreationControlEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassCreationControlEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 disallowMerging;
/// }
/// ```
public final class VkRenderPassCreationControlEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disallowMerging")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_disallowMerging = LAYOUT.byteOffset(PathElement.groupElement("disallowMerging"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_disallowMerging = LAYOUT.select(PathElement.groupElement("disallowMerging"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_disallowMerging = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disallowMerging"));

    public VkRenderPassCreationControlEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassCreationControlEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassCreationControlEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassCreationControlEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassCreationControlEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationControlEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassCreationControlEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreationControlEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT); }
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT);
        return s;
    }
    public VkRenderPassCreationControlEXT copyFrom(VkRenderPassCreationControlEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassCreationControlEXT reinterpret(long count) { return new VkRenderPassCreationControlEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassCreationControlEXT asSlice(long index) { return new VkRenderPassCreationControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassCreationControlEXT asSlice(long index, long count) { return new VkRenderPassCreationControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassCreationControlEXT at(long index, Consumer<VkRenderPassCreationControlEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int disallowMergingAt(long index) { return (int) VH_disallowMerging.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int disallowMerging() { return (int) VH_disallowMerging.get(this.segment(), 0L, 0L); }
    public VkRenderPassCreationControlEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationControlEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationControlEXT disallowMergingAt(long index, int value) { VH_disallowMerging.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationControlEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreationControlEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreationControlEXT disallowMerging(int value) { VH_disallowMerging.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassCreationControlEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationControlEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassCreationControlEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationControlEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _disallowMergingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_disallowMerging, index), LAYOUT_disallowMerging); }
    public MemorySegment _disallowMerging() { return _disallowMergingAt(0L); }
    public VkRenderPassCreationControlEXT _disallowMergingAt(long index, MemorySegment src) { _disallowMergingAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationControlEXT _disallowMerging(MemorySegment src) { return _disallowMergingAt(0L, src); }
}
