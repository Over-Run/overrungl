// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1FrameSizeKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1FrameSizeKHR {
///     uint32_t intraFrameSize;
///     uint32_t predictiveFrameSize;
///     uint32_t bipredictiveFrameSize;
/// }
/// ```
public final class VkVideoEncodeAV1FrameSizeKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraFrameSize"),
        ValueLayout.JAVA_INT.withName("predictiveFrameSize"),
        ValueLayout.JAVA_INT.withName("bipredictiveFrameSize")
    );
    public static final long OFFSET_intraFrameSize = LAYOUT.byteOffset(PathElement.groupElement("intraFrameSize"));
    public static final long OFFSET_predictiveFrameSize = LAYOUT.byteOffset(PathElement.groupElement("predictiveFrameSize"));
    public static final long OFFSET_bipredictiveFrameSize = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveFrameSize"));
    public static final MemoryLayout LAYOUT_intraFrameSize = LAYOUT.select(PathElement.groupElement("intraFrameSize"));
    public static final MemoryLayout LAYOUT_predictiveFrameSize = LAYOUT.select(PathElement.groupElement("predictiveFrameSize"));
    public static final MemoryLayout LAYOUT_bipredictiveFrameSize = LAYOUT.select(PathElement.groupElement("bipredictiveFrameSize"));
    public static final VarHandle VH_intraFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraFrameSize"));
    public static final VarHandle VH_predictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveFrameSize"));
    public static final VarHandle VH_bipredictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveFrameSize"));

    public VkVideoEncodeAV1FrameSizeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1FrameSizeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1FrameSizeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1FrameSizeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1FrameSizeKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1FrameSizeKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1FrameSizeKHR(allocator.allocate(LAYOUT, count), count); }
    public VkVideoEncodeAV1FrameSizeKHR copyFrom(VkVideoEncodeAV1FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1FrameSizeKHR reinterpret(long count) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1FrameSizeKHR asSlice(long index) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1FrameSizeKHR asSlice(long index, long count) { return new VkVideoEncodeAV1FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1FrameSizeKHR at(long index, Consumer<VkVideoEncodeAV1FrameSizeKHR> func) { func.accept(asSlice(index)); return this; }
    public int intraFrameSizeAt(long index) { return (int) VH_intraFrameSize.get(this.segment(), 0L, index); }
    public int predictiveFrameSizeAt(long index) { return (int) VH_predictiveFrameSize.get(this.segment(), 0L, index); }
    public int bipredictiveFrameSizeAt(long index) { return (int) VH_bipredictiveFrameSize.get(this.segment(), 0L, index); }
    public int intraFrameSize() { return (int) VH_intraFrameSize.get(this.segment(), 0L, 0L); }
    public int predictiveFrameSize() { return (int) VH_predictiveFrameSize.get(this.segment(), 0L, 0L); }
    public int bipredictiveFrameSize() { return (int) VH_bipredictiveFrameSize.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSizeAt(long index, int value) { VH_intraFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSizeAt(long index, int value) { VH_predictiveFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSizeAt(long index, int value) { VH_bipredictiveFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(int value) { VH_intraFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(int value) { VH_predictiveFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(int value) { VH_bipredictiveFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _intraFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraFrameSize, index), LAYOUT_intraFrameSize); }
    public MemorySegment _intraFrameSize() { return _intraFrameSizeAt(0L); }
    public VkVideoEncodeAV1FrameSizeKHR _intraFrameSizeAt(long index, MemorySegment src) { _intraFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1FrameSizeKHR _intraFrameSize(MemorySegment src) { return _intraFrameSizeAt(0L, src); }
    public MemorySegment _predictiveFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_predictiveFrameSize, index), LAYOUT_predictiveFrameSize); }
    public MemorySegment _predictiveFrameSize() { return _predictiveFrameSizeAt(0L); }
    public VkVideoEncodeAV1FrameSizeKHR _predictiveFrameSizeAt(long index, MemorySegment src) { _predictiveFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1FrameSizeKHR _predictiveFrameSize(MemorySegment src) { return _predictiveFrameSizeAt(0L, src); }
    public MemorySegment _bipredictiveFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bipredictiveFrameSize, index), LAYOUT_bipredictiveFrameSize); }
    public MemorySegment _bipredictiveFrameSize() { return _bipredictiveFrameSizeAt(0L); }
    public VkVideoEncodeAV1FrameSizeKHR _bipredictiveFrameSizeAt(long index, MemorySegment src) { _bipredictiveFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1FrameSizeKHR _bipredictiveFrameSize(MemorySegment src) { return _bipredictiveFrameSizeAt(0L, src); }
}
