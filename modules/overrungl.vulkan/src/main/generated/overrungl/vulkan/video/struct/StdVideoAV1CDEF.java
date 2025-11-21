// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1CDEF`.
/// ## Layout
/// ```
/// struct StdVideoAV1CDEF {
///     uint8_t cdef_damping_minus_3;
///     uint8_t cdef_bits;
///     uint8_t cdef_y_pri_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
///     uint8_t cdef_y_sec_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
///     uint8_t cdef_uv_pri_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
///     uint8_t cdef_uv_sec_strength[STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS];
/// }
/// ```
public final class StdVideoAV1CDEF extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cdef_damping_minus_3"),
        ValueLayout.JAVA_BYTE.withName("cdef_bits"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS, ValueLayout.JAVA_BYTE).withName("cdef_y_pri_strength"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS, ValueLayout.JAVA_BYTE).withName("cdef_y_sec_strength"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS, ValueLayout.JAVA_BYTE).withName("cdef_uv_pri_strength"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecAv1std.STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS, ValueLayout.JAVA_BYTE).withName("cdef_uv_sec_strength")
    );
    public static final long OFFSET_cdef_damping_minus_3 = LAYOUT.byteOffset(PathElement.groupElement("cdef_damping_minus_3"));
    public static final long OFFSET_cdef_bits = LAYOUT.byteOffset(PathElement.groupElement("cdef_bits"));
    public static final long OFFSET_cdef_y_pri_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_pri_strength"));
    public static final long OFFSET_cdef_y_sec_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_sec_strength"));
    public static final long OFFSET_cdef_uv_pri_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_pri_strength"));
    public static final long OFFSET_cdef_uv_sec_strength = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_sec_strength"));
    public static final MemoryLayout LAYOUT_cdef_damping_minus_3 = LAYOUT.select(PathElement.groupElement("cdef_damping_minus_3"));
    public static final MemoryLayout LAYOUT_cdef_bits = LAYOUT.select(PathElement.groupElement("cdef_bits"));
    public static final MemoryLayout LAYOUT_cdef_y_pri_strength = LAYOUT.select(PathElement.groupElement("cdef_y_pri_strength"));
    public static final MemoryLayout LAYOUT_cdef_y_sec_strength = LAYOUT.select(PathElement.groupElement("cdef_y_sec_strength"));
    public static final MemoryLayout LAYOUT_cdef_uv_pri_strength = LAYOUT.select(PathElement.groupElement("cdef_uv_pri_strength"));
    public static final MemoryLayout LAYOUT_cdef_uv_sec_strength = LAYOUT.select(PathElement.groupElement("cdef_uv_sec_strength"));
    public static final VarHandle VH_cdef_damping_minus_3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_damping_minus_3"));
    public static final VarHandle VH_cdef_bits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_bits"));
    public static final VarHandle VH_cdef_y_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_pri_strength"), PathElement.sequenceElement());
    public static final VarHandle VH_cdef_y_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_sec_strength"), PathElement.sequenceElement());
    public static final VarHandle VH_cdef_uv_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_pri_strength"), PathElement.sequenceElement());
    public static final VarHandle VH_cdef_uv_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_sec_strength"), PathElement.sequenceElement());

    public StdVideoAV1CDEF(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoAV1CDEF of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoAV1CDEF ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoAV1CDEF ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoAV1CDEF alloc(SegmentAllocator allocator) { return new StdVideoAV1CDEF(allocator.allocate(LAYOUT), 1); }
    public static StdVideoAV1CDEF alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1CDEF(allocator.allocate(LAYOUT, count), count); }
    public StdVideoAV1CDEF copyFrom(StdVideoAV1CDEF src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoAV1CDEF reinterpret(long count) { return new StdVideoAV1CDEF(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoAV1CDEF asSlice(long index) { return new StdVideoAV1CDEF(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoAV1CDEF asSlice(long index, long count) { return new StdVideoAV1CDEF(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoAV1CDEF at(long index, Consumer<StdVideoAV1CDEF> func) { func.accept(asSlice(index)); return this; }
    public byte cdef_damping_minus_3At(long index) { return (byte) VH_cdef_damping_minus_3.get(this.segment(), 0L, index); }
    public byte cdef_bitsAt(long index) { return (byte) VH_cdef_bits.get(this.segment(), 0L, index); }
    public byte cdef_y_pri_strengthAt(long index, long index0) { return (byte) VH_cdef_y_pri_strength.get(this.segment(), 0L, index, index0); }
    public byte cdef_y_sec_strengthAt(long index, long index0) { return (byte) VH_cdef_y_sec_strength.get(this.segment(), 0L, index, index0); }
    public byte cdef_uv_pri_strengthAt(long index, long index0) { return (byte) VH_cdef_uv_pri_strength.get(this.segment(), 0L, index, index0); }
    public byte cdef_uv_sec_strengthAt(long index, long index0) { return (byte) VH_cdef_uv_sec_strength.get(this.segment(), 0L, index, index0); }
    public byte cdef_damping_minus_3() { return (byte) VH_cdef_damping_minus_3.get(this.segment(), 0L, 0L); }
    public byte cdef_bits() { return (byte) VH_cdef_bits.get(this.segment(), 0L, 0L); }
    public byte cdef_y_pri_strength(long index0) { return (byte) VH_cdef_y_pri_strength.get(this.segment(), 0L, 0L, index0); }
    public byte cdef_y_sec_strength(long index0) { return (byte) VH_cdef_y_sec_strength.get(this.segment(), 0L, 0L, index0); }
    public byte cdef_uv_pri_strength(long index0) { return (byte) VH_cdef_uv_pri_strength.get(this.segment(), 0L, 0L, index0); }
    public byte cdef_uv_sec_strength(long index0) { return (byte) VH_cdef_uv_sec_strength.get(this.segment(), 0L, 0L, index0); }
    public StdVideoAV1CDEF cdef_damping_minus_3At(long index, byte value) { VH_cdef_damping_minus_3.set(this.segment(), 0L, index, value); return this; }
    public StdVideoAV1CDEF cdef_bitsAt(long index, byte value) { VH_cdef_bits.set(this.segment(), 0L, index, value); return this; }
    public StdVideoAV1CDEF cdef_y_pri_strengthAt(long index, long index0, byte value) { VH_cdef_y_pri_strength.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1CDEF cdef_y_sec_strengthAt(long index, long index0, byte value) { VH_cdef_y_sec_strength.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1CDEF cdef_uv_pri_strengthAt(long index, long index0, byte value) { VH_cdef_uv_pri_strength.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1CDEF cdef_uv_sec_strengthAt(long index, long index0, byte value) { VH_cdef_uv_sec_strength.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoAV1CDEF cdef_damping_minus_3(byte value) { VH_cdef_damping_minus_3.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoAV1CDEF cdef_bits(byte value) { VH_cdef_bits.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoAV1CDEF cdef_y_pri_strength(long index0, byte value) { VH_cdef_y_pri_strength.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1CDEF cdef_y_sec_strength(long index0, byte value) { VH_cdef_y_sec_strength.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1CDEF cdef_uv_pri_strength(long index0, byte value) { VH_cdef_uv_pri_strength.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoAV1CDEF cdef_uv_sec_strength(long index0, byte value) { VH_cdef_uv_sec_strength.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _cdef_damping_minus_3At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_damping_minus_3, index), LAYOUT_cdef_damping_minus_3); }
    public MemorySegment _cdef_damping_minus_3() { return _cdef_damping_minus_3At(0L); }
    public StdVideoAV1CDEF _cdef_damping_minus_3At(long index, MemorySegment src) { _cdef_damping_minus_3At(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_damping_minus_3(MemorySegment src) { return _cdef_damping_minus_3At(0L, src); }
    public MemorySegment _cdef_bitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_bits, index), LAYOUT_cdef_bits); }
    public MemorySegment _cdef_bits() { return _cdef_bitsAt(0L); }
    public StdVideoAV1CDEF _cdef_bitsAt(long index, MemorySegment src) { _cdef_bitsAt(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_bits(MemorySegment src) { return _cdef_bitsAt(0L, src); }
    public MemorySegment _cdef_y_pri_strengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_y_pri_strength, index), LAYOUT_cdef_y_pri_strength); }
    public MemorySegment _cdef_y_pri_strength() { return _cdef_y_pri_strengthAt(0L); }
    public StdVideoAV1CDEF _cdef_y_pri_strengthAt(long index, MemorySegment src) { _cdef_y_pri_strengthAt(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_y_pri_strength(MemorySegment src) { return _cdef_y_pri_strengthAt(0L, src); }
    public MemorySegment _cdef_y_sec_strengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_y_sec_strength, index), LAYOUT_cdef_y_sec_strength); }
    public MemorySegment _cdef_y_sec_strength() { return _cdef_y_sec_strengthAt(0L); }
    public StdVideoAV1CDEF _cdef_y_sec_strengthAt(long index, MemorySegment src) { _cdef_y_sec_strengthAt(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_y_sec_strength(MemorySegment src) { return _cdef_y_sec_strengthAt(0L, src); }
    public MemorySegment _cdef_uv_pri_strengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_uv_pri_strength, index), LAYOUT_cdef_uv_pri_strength); }
    public MemorySegment _cdef_uv_pri_strength() { return _cdef_uv_pri_strengthAt(0L); }
    public StdVideoAV1CDEF _cdef_uv_pri_strengthAt(long index, MemorySegment src) { _cdef_uv_pri_strengthAt(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_uv_pri_strength(MemorySegment src) { return _cdef_uv_pri_strengthAt(0L, src); }
    public MemorySegment _cdef_uv_sec_strengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cdef_uv_sec_strength, index), LAYOUT_cdef_uv_sec_strength); }
    public MemorySegment _cdef_uv_sec_strength() { return _cdef_uv_sec_strengthAt(0L); }
    public StdVideoAV1CDEF _cdef_uv_sec_strengthAt(long index, MemorySegment src) { _cdef_uv_sec_strengthAt(index).copyFrom(src); return this; }
    public StdVideoAV1CDEF _cdef_uv_sec_strength(MemorySegment src) { return _cdef_uv_sec_strengthAt(0L, src); }
}
