// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindShaderGroupIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindShaderGroupIndirectCommandNV {
///     uint32_t groupIndex;
/// }
/// ```
public final class VkBindShaderGroupIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );
    public static final long OFFSET_groupIndex = LAYOUT.byteOffset(PathElement.groupElement("groupIndex"));
    public static final MemoryLayout LAYOUT_groupIndex = LAYOUT.select(PathElement.groupElement("groupIndex"));
    public static final VarHandle VH_groupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupIndex"));

    public VkBindShaderGroupIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindShaderGroupIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindShaderGroupIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindShaderGroupIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindShaderGroupIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindShaderGroupIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkBindShaderGroupIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindShaderGroupIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkBindShaderGroupIndirectCommandNV copyFrom(VkBindShaderGroupIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindShaderGroupIndirectCommandNV reinterpret(long count) { return new VkBindShaderGroupIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindShaderGroupIndirectCommandNV asSlice(long index) { return new VkBindShaderGroupIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindShaderGroupIndirectCommandNV asSlice(long index, long count) { return new VkBindShaderGroupIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindShaderGroupIndirectCommandNV at(long index, Consumer<VkBindShaderGroupIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public int groupIndexAt(long index) { return (int) VH_groupIndex.get(this.segment(), 0L, index); }
    public int groupIndex() { return (int) VH_groupIndex.get(this.segment(), 0L, 0L); }
    public VkBindShaderGroupIndirectCommandNV groupIndexAt(long index, int value) { VH_groupIndex.set(this.segment(), 0L, index, value); return this; }
    public VkBindShaderGroupIndirectCommandNV groupIndex(int value) { VH_groupIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _groupIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupIndex, index), LAYOUT_groupIndex); }
    public MemorySegment _groupIndex() { return _groupIndexAt(0L); }
    public VkBindShaderGroupIndirectCommandNV _groupIndexAt(long index, MemorySegment src) { _groupIndexAt(index).copyFrom(src); return this; }
    public VkBindShaderGroupIndirectCommandNV _groupIndex(MemorySegment src) { return _groupIndexAt(0L, src); }
}
