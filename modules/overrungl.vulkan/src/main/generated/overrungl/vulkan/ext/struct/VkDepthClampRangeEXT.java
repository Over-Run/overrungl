// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDepthClampRangeEXT`.
/// ## Layout
/// ```
/// struct VkDepthClampRangeEXT {
///     float minDepthClamp;
///     float maxDepthClamp;
/// }
/// ```
public final class VkDepthClampRangeEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minDepthClamp"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthClamp")
    );
    public static final long OFFSET_minDepthClamp = LAYOUT.byteOffset(PathElement.groupElement("minDepthClamp"));
    public static final long OFFSET_maxDepthClamp = LAYOUT.byteOffset(PathElement.groupElement("maxDepthClamp"));
    public static final MemoryLayout LAYOUT_minDepthClamp = LAYOUT.select(PathElement.groupElement("minDepthClamp"));
    public static final MemoryLayout LAYOUT_maxDepthClamp = LAYOUT.select(PathElement.groupElement("maxDepthClamp"));
    public static final VarHandle VH_minDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthClamp"));
    public static final VarHandle VH_maxDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthClamp"));

    public VkDepthClampRangeEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDepthClampRangeEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDepthClampRangeEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDepthClampRangeEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDepthClampRangeEXT alloc(SegmentAllocator allocator) { return new VkDepthClampRangeEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDepthClampRangeEXT alloc(SegmentAllocator allocator, long count) { return new VkDepthClampRangeEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDepthClampRangeEXT copyFrom(VkDepthClampRangeEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDepthClampRangeEXT reinterpret(long count) { return new VkDepthClampRangeEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDepthClampRangeEXT asSlice(long index) { return new VkDepthClampRangeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDepthClampRangeEXT asSlice(long index, long count) { return new VkDepthClampRangeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDepthClampRangeEXT at(long index, Consumer<VkDepthClampRangeEXT> func) { func.accept(asSlice(index)); return this; }
    public float minDepthClampAt(long index) { return (float) VH_minDepthClamp.get(this.segment(), 0L, index); }
    public float maxDepthClampAt(long index) { return (float) VH_maxDepthClamp.get(this.segment(), 0L, index); }
    public float minDepthClamp() { return (float) VH_minDepthClamp.get(this.segment(), 0L, 0L); }
    public float maxDepthClamp() { return (float) VH_maxDepthClamp.get(this.segment(), 0L, 0L); }
    public VkDepthClampRangeEXT minDepthClampAt(long index, float value) { VH_minDepthClamp.set(this.segment(), 0L, index, value); return this; }
    public VkDepthClampRangeEXT maxDepthClampAt(long index, float value) { VH_maxDepthClamp.set(this.segment(), 0L, index, value); return this; }
    public VkDepthClampRangeEXT minDepthClamp(float value) { VH_minDepthClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthClampRangeEXT maxDepthClamp(float value) { VH_maxDepthClamp.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _minDepthClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minDepthClamp, index), LAYOUT_minDepthClamp); }
    public MemorySegment _minDepthClamp() { return _minDepthClampAt(0L); }
    public VkDepthClampRangeEXT _minDepthClampAt(long index, MemorySegment src) { _minDepthClampAt(index).copyFrom(src); return this; }
    public VkDepthClampRangeEXT _minDepthClamp(MemorySegment src) { return _minDepthClampAt(0L, src); }
    public MemorySegment _maxDepthClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDepthClamp, index), LAYOUT_maxDepthClamp); }
    public MemorySegment _maxDepthClamp() { return _maxDepthClampAt(0L); }
    public VkDepthClampRangeEXT _maxDepthClampAt(long index, MemorySegment src) { _maxDepthClampAt(index).copyFrom(src); return this; }
    public VkDepthClampRangeEXT _maxDepthClamp(MemorySegment src) { return _maxDepthClampAt(0L, src); }
}
