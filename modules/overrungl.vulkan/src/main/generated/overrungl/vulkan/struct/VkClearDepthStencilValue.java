// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearDepthStencilValue`.
/// ## Layout
/// ```
/// struct VkClearDepthStencilValue {
///     float depth;
///     uint32_t stencil;
/// }
/// ```
public final class VkClearDepthStencilValue extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    public static final long OFFSET_stencil = LAYOUT.byteOffset(PathElement.groupElement("stencil"));
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    public static final MemoryLayout LAYOUT_stencil = LAYOUT.select(PathElement.groupElement("stencil"));
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));
    public static final VarHandle VH_stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencil"));

    public VkClearDepthStencilValue(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClearDepthStencilValue of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment, estimateCount(segment, LAYOUT)); }
    public static VkClearDepthStencilValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClearDepthStencilValue ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClearDepthStencilValue alloc(SegmentAllocator allocator) { return new VkClearDepthStencilValue(allocator.allocate(LAYOUT), 1); }
    public static VkClearDepthStencilValue alloc(SegmentAllocator allocator, long count) { return new VkClearDepthStencilValue(allocator.allocate(LAYOUT, count), count); }
    public VkClearDepthStencilValue copyFrom(VkClearDepthStencilValue src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClearDepthStencilValue reinterpret(long count) { return new VkClearDepthStencilValue(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClearDepthStencilValue asSlice(long index) { return new VkClearDepthStencilValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClearDepthStencilValue asSlice(long index, long count) { return new VkClearDepthStencilValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClearDepthStencilValue at(long index, Consumer<VkClearDepthStencilValue> func) { func.accept(asSlice(index)); return this; }
    public float depthAt(long index) { return (float) VH_depth.get(this.segment(), 0L, index); }
    public int stencilAt(long index) { return (int) VH_stencil.get(this.segment(), 0L, index); }
    public float depth() { return (float) VH_depth.get(this.segment(), 0L, 0L); }
    public int stencil() { return (int) VH_stencil.get(this.segment(), 0L, 0L); }
    public VkClearDepthStencilValue depthAt(long index, float value) { VH_depth.set(this.segment(), 0L, index, value); return this; }
    public VkClearDepthStencilValue stencilAt(long index, int value) { VH_stencil.set(this.segment(), 0L, index, value); return this; }
    public VkClearDepthStencilValue depth(float value) { VH_depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearDepthStencilValue stencil(int value) { VH_stencil.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _depthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depth, index), LAYOUT_depth); }
    public MemorySegment _depth() { return _depthAt(0L); }
    public VkClearDepthStencilValue _depthAt(long index, MemorySegment src) { _depthAt(index).copyFrom(src); return this; }
    public VkClearDepthStencilValue _depth(MemorySegment src) { return _depthAt(0L, src); }
    public MemorySegment _stencilAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencil, index), LAYOUT_stencil); }
    public MemorySegment _stencil() { return _stencilAt(0L); }
    public VkClearDepthStencilValue _stencilAt(long index, MemorySegment src) { _stencilAt(index).copyFrom(src); return this; }
    public VkClearDepthStencilValue _stencil(MemorySegment src) { return _stencilAt(0L, src); }
}
