// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViewportWScalingNV`.
/// ## Layout
/// ```
/// struct VkViewportWScalingNV {
///     float xcoeff;
///     float ycoeff;
/// }
/// ```
public final class VkViewportWScalingNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    public static final long OFFSET_xcoeff = LAYOUT.byteOffset(PathElement.groupElement("xcoeff"));
    public static final long OFFSET_ycoeff = LAYOUT.byteOffset(PathElement.groupElement("ycoeff"));
    public static final MemoryLayout LAYOUT_xcoeff = LAYOUT.select(PathElement.groupElement("xcoeff"));
    public static final MemoryLayout LAYOUT_ycoeff = LAYOUT.select(PathElement.groupElement("ycoeff"));
    public static final VarHandle VH_xcoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xcoeff"));
    public static final VarHandle VH_ycoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycoeff"));

    public VkViewportWScalingNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkViewportWScalingNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkViewportWScalingNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkViewportWScalingNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT), 1); }
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator, long count) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT, count), count); }
    public VkViewportWScalingNV copyFrom(VkViewportWScalingNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkViewportWScalingNV reinterpret(long count) { return new VkViewportWScalingNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkViewportWScalingNV asSlice(long index) { return new VkViewportWScalingNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkViewportWScalingNV asSlice(long index, long count) { return new VkViewportWScalingNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkViewportWScalingNV at(long index, Consumer<VkViewportWScalingNV> func) { func.accept(asSlice(index)); return this; }
    public float xcoeffAt(long index) { return (float) VH_xcoeff.get(this.segment(), 0L, index); }
    public float ycoeffAt(long index) { return (float) VH_ycoeff.get(this.segment(), 0L, index); }
    public float xcoeff() { return (float) VH_xcoeff.get(this.segment(), 0L, 0L); }
    public float ycoeff() { return (float) VH_ycoeff.get(this.segment(), 0L, 0L); }
    public VkViewportWScalingNV xcoeffAt(long index, float value) { VH_xcoeff.set(this.segment(), 0L, index, value); return this; }
    public VkViewportWScalingNV ycoeffAt(long index, float value) { VH_ycoeff.set(this.segment(), 0L, index, value); return this; }
    public VkViewportWScalingNV xcoeff(float value) { VH_xcoeff.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewportWScalingNV ycoeff(float value) { VH_ycoeff.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xcoeffAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_xcoeff, index), LAYOUT_xcoeff); }
    public MemorySegment _xcoeff() { return _xcoeffAt(0L); }
    public VkViewportWScalingNV _xcoeffAt(long index, MemorySegment src) { _xcoeffAt(index).copyFrom(src); return this; }
    public VkViewportWScalingNV _xcoeff(MemorySegment src) { return _xcoeffAt(0L, src); }
    public MemorySegment _ycoeffAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycoeff, index), LAYOUT_ycoeff); }
    public MemorySegment _ycoeff() { return _ycoeffAt(0L); }
    public VkViewportWScalingNV _ycoeffAt(long index, MemorySegment src) { _ycoeffAt(index).copyFrom(src); return this; }
    public VkViewportWScalingNV _ycoeff(MemorySegment src) { return _ycoeffAt(0L, src); }
}
