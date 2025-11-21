// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsPushConstantTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsPushConstantTokenEXT {
///     VkPushConstantRange updateRange;
/// }
/// ```
public final class VkIndirectCommandsPushConstantTokenEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    public static final long OFFSET_updateRange = LAYOUT.byteOffset(PathElement.groupElement("updateRange"));
    public static final MemoryLayout LAYOUT_updateRange = LAYOUT.select(PathElement.groupElement("updateRange"));
    public static final VarHandle VH_updateRange$stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateRange"), PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_updateRange$offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateRange"), PathElement.groupElement("offset"));
    public static final VarHandle VH_updateRange$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateRange"), PathElement.groupElement("size"));

    public VkIndirectCommandsPushConstantTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsPushConstantTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsPushConstantTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsPushConstantTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsPushConstantTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsPushConstantTokenEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsPushConstantTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsPushConstantTokenEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsPushConstantTokenEXT copyFrom(VkIndirectCommandsPushConstantTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsPushConstantTokenEXT reinterpret(long count) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsPushConstantTokenEXT asSlice(long index) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsPushConstantTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsPushConstantTokenEXT at(long index, Consumer<VkIndirectCommandsPushConstantTokenEXT> func) { func.accept(asSlice(index)); return this; }
    public int updateRange$stageFlagsAt(long index) { return (int) VH_updateRange$stageFlags.get(this.segment(), 0L, index); }
    public int updateRange$offsetAt(long index) { return (int) VH_updateRange$offset.get(this.segment(), 0L, index); }
    public int updateRange$sizeAt(long index) { return (int) VH_updateRange$size.get(this.segment(), 0L, index); }
    public int updateRange$stageFlags() { return (int) VH_updateRange$stageFlags.get(this.segment(), 0L, 0L); }
    public int updateRange$offset() { return (int) VH_updateRange$offset.get(this.segment(), 0L, 0L); }
    public int updateRange$size() { return (int) VH_updateRange$size.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$stageFlagsAt(long index, int value) { VH_updateRange$stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$offsetAt(long index, int value) { VH_updateRange$offset.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$sizeAt(long index, int value) { VH_updateRange$size.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$stageFlags(int value) { VH_updateRange$stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$offset(int value) { VH_updateRange$offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsPushConstantTokenEXT updateRange$size(int value) { VH_updateRange$size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _updateRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_updateRange, index), LAYOUT_updateRange); }
    public MemorySegment _updateRange() { return _updateRangeAt(0L); }
    public VkIndirectCommandsPushConstantTokenEXT _updateRangeAt(long index, MemorySegment src) { _updateRangeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsPushConstantTokenEXT _updateRange(MemorySegment src) { return _updateRangeAt(0L, src); }
}
