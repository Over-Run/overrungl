// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCoarseSampleLocationNV`.
/// ## Layout
/// ```
/// struct VkCoarseSampleLocationNV {
///     uint32_t pixelX;
///     uint32_t pixelY;
///     uint32_t sample;
/// }
/// ```
public final class VkCoarseSampleLocationNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("pixelX"),
        ValueLayout.JAVA_INT.withName("pixelY"),
        ValueLayout.JAVA_INT.withName("sample")
    );
    public static final long OFFSET_pixelX = LAYOUT.byteOffset(PathElement.groupElement("pixelX"));
    public static final long OFFSET_pixelY = LAYOUT.byteOffset(PathElement.groupElement("pixelY"));
    public static final long OFFSET_sample = LAYOUT.byteOffset(PathElement.groupElement("sample"));
    public static final MemoryLayout LAYOUT_pixelX = LAYOUT.select(PathElement.groupElement("pixelX"));
    public static final MemoryLayout LAYOUT_pixelY = LAYOUT.select(PathElement.groupElement("pixelY"));
    public static final MemoryLayout LAYOUT_sample = LAYOUT.select(PathElement.groupElement("sample"));
    public static final VarHandle VH_pixelX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelX"));
    public static final VarHandle VH_pixelY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelY"));
    public static final VarHandle VH_sample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sample"));

    public VkCoarseSampleLocationNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCoarseSampleLocationNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCoarseSampleLocationNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCoarseSampleLocationNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT), 1); }
    public static VkCoarseSampleLocationNV alloc(SegmentAllocator allocator, long count) { return new VkCoarseSampleLocationNV(allocator.allocate(LAYOUT, count), count); }
    public VkCoarseSampleLocationNV copyFrom(VkCoarseSampleLocationNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCoarseSampleLocationNV reinterpret(long count) { return new VkCoarseSampleLocationNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCoarseSampleLocationNV asSlice(long index) { return new VkCoarseSampleLocationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCoarseSampleLocationNV asSlice(long index, long count) { return new VkCoarseSampleLocationNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCoarseSampleLocationNV at(long index, Consumer<VkCoarseSampleLocationNV> func) { func.accept(asSlice(index)); return this; }
    public int pixelXAt(long index) { return (int) VH_pixelX.get(this.segment(), 0L, index); }
    public int pixelYAt(long index) { return (int) VH_pixelY.get(this.segment(), 0L, index); }
    public int sampleAt(long index) { return (int) VH_sample.get(this.segment(), 0L, index); }
    public int pixelX() { return (int) VH_pixelX.get(this.segment(), 0L, 0L); }
    public int pixelY() { return (int) VH_pixelY.get(this.segment(), 0L, 0L); }
    public int sample() { return (int) VH_sample.get(this.segment(), 0L, 0L); }
    public VkCoarseSampleLocationNV pixelXAt(long index, int value) { VH_pixelX.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleLocationNV pixelYAt(long index, int value) { VH_pixelY.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleLocationNV sampleAt(long index, int value) { VH_sample.set(this.segment(), 0L, index, value); return this; }
    public VkCoarseSampleLocationNV pixelX(int value) { VH_pixelX.set(this.segment(), 0L, 0L, value); return this; }
    public VkCoarseSampleLocationNV pixelY(int value) { VH_pixelY.set(this.segment(), 0L, 0L, value); return this; }
    public VkCoarseSampleLocationNV sample(int value) { VH_sample.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pixelXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pixelX, index), LAYOUT_pixelX); }
    public MemorySegment _pixelX() { return _pixelXAt(0L); }
    public VkCoarseSampleLocationNV _pixelXAt(long index, MemorySegment src) { _pixelXAt(index).copyFrom(src); return this; }
    public VkCoarseSampleLocationNV _pixelX(MemorySegment src) { return _pixelXAt(0L, src); }
    public MemorySegment _pixelYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pixelY, index), LAYOUT_pixelY); }
    public MemorySegment _pixelY() { return _pixelYAt(0L); }
    public VkCoarseSampleLocationNV _pixelYAt(long index, MemorySegment src) { _pixelYAt(index).copyFrom(src); return this; }
    public VkCoarseSampleLocationNV _pixelY(MemorySegment src) { return _pixelYAt(0L, src); }
    public MemorySegment _sampleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sample, index), LAYOUT_sample); }
    public MemorySegment _sample() { return _sampleAt(0L); }
    public VkCoarseSampleLocationNV _sampleAt(long index, MemorySegment src) { _sampleAt(index).copyFrom(src); return this; }
    public VkCoarseSampleLocationNV _sample(MemorySegment src) { return _sampleAt(0L, src); }
}
