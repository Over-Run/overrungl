// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265FrameSizeKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265FrameSizeKHR {
///     uint32_t frameISize;
///     uint32_t framePSize;
///     uint32_t frameBSize;
/// }
/// ```
public final class VkVideoEncodeH265FrameSizeKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("frameISize"),
        ValueLayout.JAVA_INT.withName("framePSize"),
        ValueLayout.JAVA_INT.withName("frameBSize")
    );
    public static final long OFFSET_frameISize = LAYOUT.byteOffset(PathElement.groupElement("frameISize"));
    public static final long OFFSET_framePSize = LAYOUT.byteOffset(PathElement.groupElement("framePSize"));
    public static final long OFFSET_frameBSize = LAYOUT.byteOffset(PathElement.groupElement("frameBSize"));
    public static final MemoryLayout LAYOUT_frameISize = LAYOUT.select(PathElement.groupElement("frameISize"));
    public static final MemoryLayout LAYOUT_framePSize = LAYOUT.select(PathElement.groupElement("framePSize"));
    public static final MemoryLayout LAYOUT_frameBSize = LAYOUT.select(PathElement.groupElement("frameBSize"));
    public static final VarHandle VH_frameISize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameISize"));
    public static final VarHandle VH_framePSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framePSize"));
    public static final VarHandle VH_frameBSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameBSize"));

    public VkVideoEncodeH265FrameSizeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265FrameSizeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265FrameSizeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265FrameSizeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265FrameSizeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265FrameSizeKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265FrameSizeKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265FrameSizeKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265FrameSizeKHR(allocator.allocate(LAYOUT, count), count); }
    public VkVideoEncodeH265FrameSizeKHR copyFrom(VkVideoEncodeH265FrameSizeKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265FrameSizeKHR reinterpret(long count) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265FrameSizeKHR asSlice(long index) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265FrameSizeKHR asSlice(long index, long count) { return new VkVideoEncodeH265FrameSizeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265FrameSizeKHR at(long index, Consumer<VkVideoEncodeH265FrameSizeKHR> func) { func.accept(asSlice(index)); return this; }
    public int frameISizeAt(long index) { return (int) VH_frameISize.get(this.segment(), 0L, index); }
    public int framePSizeAt(long index) { return (int) VH_framePSize.get(this.segment(), 0L, index); }
    public int frameBSizeAt(long index) { return (int) VH_frameBSize.get(this.segment(), 0L, index); }
    public int frameISize() { return (int) VH_frameISize.get(this.segment(), 0L, 0L); }
    public int framePSize() { return (int) VH_framePSize.get(this.segment(), 0L, 0L); }
    public int frameBSize() { return (int) VH_frameBSize.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265FrameSizeKHR frameISizeAt(long index, int value) { VH_frameISize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265FrameSizeKHR framePSizeAt(long index, int value) { VH_framePSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265FrameSizeKHR frameBSizeAt(long index, int value) { VH_frameBSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265FrameSizeKHR frameISize(int value) { VH_frameISize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265FrameSizeKHR framePSize(int value) { VH_framePSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265FrameSizeKHR frameBSize(int value) { VH_frameBSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _frameISizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameISize, index), LAYOUT_frameISize); }
    public MemorySegment _frameISize() { return _frameISizeAt(0L); }
    public VkVideoEncodeH265FrameSizeKHR _frameISizeAt(long index, MemorySegment src) { _frameISizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265FrameSizeKHR _frameISize(MemorySegment src) { return _frameISizeAt(0L, src); }
    public MemorySegment _framePSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framePSize, index), LAYOUT_framePSize); }
    public MemorySegment _framePSize() { return _framePSizeAt(0L); }
    public VkVideoEncodeH265FrameSizeKHR _framePSizeAt(long index, MemorySegment src) { _framePSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265FrameSizeKHR _framePSize(MemorySegment src) { return _framePSizeAt(0L, src); }
    public MemorySegment _frameBSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameBSize, index), LAYOUT_frameBSize); }
    public MemorySegment _frameBSize() { return _frameBSizeAt(0L); }
    public VkVideoEncodeH265FrameSizeKHR _frameBSizeAt(long index, MemorySegment src) { _frameBSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265FrameSizeKHR _frameBSize(MemorySegment src) { return _frameBSizeAt(0L, src); }
}
