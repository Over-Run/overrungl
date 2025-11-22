// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearColorValue`.
/// ## Layout
/// ```
/// union VkClearColorValue {
///     float float32[4];
///     int32_t int32[4];
///     uint32_t uint32[4];
/// }
/// ```
public final class VkClearColorValue extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("float32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("uint32")
    );
    public static final long OFFSET_float32 = LAYOUT.byteOffset(PathElement.groupElement("float32"));
    public static final long OFFSET_int32 = LAYOUT.byteOffset(PathElement.groupElement("int32"));
    public static final long OFFSET_uint32 = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
    public static final MemoryLayout LAYOUT_float32 = LAYOUT.select(PathElement.groupElement("float32"));
    public static final MemoryLayout LAYOUT_int32 = LAYOUT.select(PathElement.groupElement("int32"));
    public static final MemoryLayout LAYOUT_uint32 = LAYOUT.select(PathElement.groupElement("uint32"));
    public static final VarHandle VH_float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("float32"), PathElement.sequenceElement());
    public static final VarHandle VH_int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("int32"), PathElement.sequenceElement());
    public static final VarHandle VH_uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uint32"), PathElement.sequenceElement());

    public VkClearColorValue(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClearColorValue of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment, estimateCount(segment, LAYOUT)); }
    public static VkClearColorValue ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClearColorValue ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearColorValue(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClearColorValue alloc(SegmentAllocator allocator) { return new VkClearColorValue(allocator.allocate(LAYOUT), 1); }
    public static VkClearColorValue alloc(SegmentAllocator allocator, long count) { return new VkClearColorValue(allocator.allocate(LAYOUT, count), count); }
    public VkClearColorValue copyFrom(VkClearColorValue src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClearColorValue reinterpret(long count) { return new VkClearColorValue(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClearColorValue asSlice(long index) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClearColorValue asSlice(long index, long count) { return new VkClearColorValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClearColorValue at(long index, Consumer<VkClearColorValue> func) { func.accept(asSlice(index)); return this; }
    public float float32At(long index, long index0) { return (float) VH_float32.get(this.segment(), 0L, index, index0); }
    public int int32At(long index, long index0) { return (int) VH_int32.get(this.segment(), 0L, index, index0); }
    public int uint32At(long index, long index0) { return (int) VH_uint32.get(this.segment(), 0L, index, index0); }
    public float float32(long index0) { return (float) VH_float32.get(this.segment(), 0L, 0L, index0); }
    public int int32(long index0) { return (int) VH_int32.get(this.segment(), 0L, 0L, index0); }
    public int uint32(long index0) { return (int) VH_uint32.get(this.segment(), 0L, 0L, index0); }
    public VkClearColorValue float32At(long index, long index0, float value) { VH_float32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearColorValue int32At(long index, long index0, int value) { VH_int32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearColorValue uint32At(long index, long index0, int value) { VH_uint32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearColorValue float32(long index0, float value) { VH_float32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearColorValue int32(long index0, int value) { VH_int32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearColorValue uint32(long index0, int value) { VH_uint32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _float32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_float32, index), LAYOUT_float32); }
    public MemorySegment _float32() { return _float32At(0L); }
    public VkClearColorValue _float32At(long index, MemorySegment src) { _float32At(index).copyFrom(src); return this; }
    public VkClearColorValue _float32(MemorySegment src) { return _float32At(0L, src); }
    public MemorySegment _int32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_int32, index), LAYOUT_int32); }
    public MemorySegment _int32() { return _int32At(0L); }
    public VkClearColorValue _int32At(long index, MemorySegment src) { _int32At(index).copyFrom(src); return this; }
    public VkClearColorValue _int32(MemorySegment src) { return _int32At(0L, src); }
    public MemorySegment _uint32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uint32, index), LAYOUT_uint32); }
    public MemorySegment _uint32() { return _uint32At(0L); }
    public VkClearColorValue _uint32At(long index, MemorySegment src) { _uint32At(index).copyFrom(src); return this; }
    public VkClearColorValue _uint32(MemorySegment src) { return _uint32At(0L, src); }
}
