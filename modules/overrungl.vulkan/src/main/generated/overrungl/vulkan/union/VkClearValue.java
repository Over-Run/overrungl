// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearValue`.
/// ## Layout
/// ```
/// union VkClearValue {
///     VkClearColorValue color;
///     VkClearDepthStencilValue depthStencil;
/// }
/// ```
public final class VkClearValue extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("color"),
        overrungl.vulkan.struct.VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    public static final long OFFSET_depthStencil = LAYOUT.byteOffset(PathElement.groupElement("depthStencil"));
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    public static final MemoryLayout LAYOUT_depthStencil = LAYOUT.select(PathElement.groupElement("depthStencil"));
    public static final VarHandle VH_color$float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.groupElement("float32"), PathElement.sequenceElement());
    public static final VarHandle VH_color$int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.groupElement("int32"), PathElement.sequenceElement());
    public static final VarHandle VH_color$uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.groupElement("uint32"), PathElement.sequenceElement());
    public static final VarHandle VH_depthStencil$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencil"), PathElement.groupElement("depth"));
    public static final VarHandle VH_depthStencil$stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencil"), PathElement.groupElement("stencil"));

    public VkClearValue(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClearValue of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearValue(segment, estimateCount(segment, LAYOUT)); }
    public static VkClearValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearValue(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClearValue ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearValue(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClearValue alloc(SegmentAllocator allocator) { return new VkClearValue(allocator.allocate(LAYOUT), 1); }
    public static VkClearValue alloc(SegmentAllocator allocator, long count) { return new VkClearValue(allocator.allocate(LAYOUT, count), count); }
    public VkClearValue copyFrom(VkClearValue src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClearValue reinterpret(long count) { return new VkClearValue(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClearValue asSlice(long index) { return new VkClearValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClearValue asSlice(long index, long count) { return new VkClearValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClearValue at(long index, Consumer<VkClearValue> func) { func.accept(asSlice(index)); return this; }
    public float color$float32At(long index, long index0) { return (float) VH_color$float32.get(this.segment(), 0L, index, index0); }
    public int color$int32At(long index, long index0) { return (int) VH_color$int32.get(this.segment(), 0L, index, index0); }
    public int color$uint32At(long index, long index0) { return (int) VH_color$uint32.get(this.segment(), 0L, index, index0); }
    public float depthStencil$depthAt(long index) { return (float) VH_depthStencil$depth.get(this.segment(), 0L, index); }
    public int depthStencil$stencilAt(long index) { return (int) VH_depthStencil$stencil.get(this.segment(), 0L, index); }
    public float color$float32(long index0) { return (float) VH_color$float32.get(this.segment(), 0L, 0L, index0); }
    public int color$int32(long index0) { return (int) VH_color$int32.get(this.segment(), 0L, 0L, index0); }
    public int color$uint32(long index0) { return (int) VH_color$uint32.get(this.segment(), 0L, 0L, index0); }
    public float depthStencil$depth() { return (float) VH_depthStencil$depth.get(this.segment(), 0L, 0L); }
    public int depthStencil$stencil() { return (int) VH_depthStencil$stencil.get(this.segment(), 0L, 0L); }
    public VkClearValue color$float32At(long index, long index0, float value) { VH_color$float32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearValue color$int32At(long index, long index0, int value) { VH_color$int32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearValue color$uint32At(long index, long index0, int value) { VH_color$uint32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearValue depthStencil$depthAt(long index, float value) { VH_depthStencil$depth.set(this.segment(), 0L, index, value); return this; }
    public VkClearValue depthStencil$stencilAt(long index, int value) { VH_depthStencil$stencil.set(this.segment(), 0L, index, value); return this; }
    public VkClearValue color$float32(long index0, float value) { VH_color$float32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearValue color$int32(long index0, int value) { VH_color$int32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearValue color$uint32(long index0, int value) { VH_color$uint32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearValue depthStencil$depth(float value) { VH_depthStencil$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearValue depthStencil$stencil(int value) { VH_depthStencil$stencil.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _colorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_color, index), LAYOUT_color); }
    public MemorySegment _color() { return _colorAt(0L); }
    public VkClearValue _colorAt(long index, MemorySegment src) { _colorAt(index).copyFrom(src); return this; }
    public VkClearValue _color(MemorySegment src) { return _colorAt(0L, src); }
    public MemorySegment _depthStencilAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencil, index), LAYOUT_depthStencil); }
    public MemorySegment _depthStencil() { return _depthStencilAt(0L); }
    public VkClearValue _depthStencilAt(long index, MemorySegment src) { _depthStencilAt(index).copyFrom(src); return this; }
    public VkClearValue _depthStencil(MemorySegment src) { return _depthStencilAt(0L, src); }
}
