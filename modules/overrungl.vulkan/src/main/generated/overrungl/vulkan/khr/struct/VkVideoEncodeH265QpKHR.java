// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265QpKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265QpKHR {
///     int32_t qpI;
///     int32_t qpP;
///     int32_t qpB;
/// }
/// ```
public final class VkVideoEncodeH265QpKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    public static final long OFFSET_qpI = LAYOUT.byteOffset(PathElement.groupElement("qpI"));
    public static final long OFFSET_qpP = LAYOUT.byteOffset(PathElement.groupElement("qpP"));
    public static final long OFFSET_qpB = LAYOUT.byteOffset(PathElement.groupElement("qpB"));
    public static final MemoryLayout LAYOUT_qpI = LAYOUT.select(PathElement.groupElement("qpI"));
    public static final MemoryLayout LAYOUT_qpP = LAYOUT.select(PathElement.groupElement("qpP"));
    public static final MemoryLayout LAYOUT_qpB = LAYOUT.select(PathElement.groupElement("qpB"));
    public static final VarHandle VH_qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpI"));
    public static final VarHandle VH_qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpP"));
    public static final VarHandle VH_qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpB"));

    public VkVideoEncodeH265QpKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265QpKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265QpKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265QpKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265QpKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QpKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265QpKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QpKHR(allocator.allocate(LAYOUT, count), count); }
    public VkVideoEncodeH265QpKHR copyFrom(VkVideoEncodeH265QpKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265QpKHR reinterpret(long count) { return new VkVideoEncodeH265QpKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265QpKHR asSlice(long index) { return new VkVideoEncodeH265QpKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265QpKHR asSlice(long index, long count) { return new VkVideoEncodeH265QpKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265QpKHR at(long index, Consumer<VkVideoEncodeH265QpKHR> func) { func.accept(asSlice(index)); return this; }
    public int qpIAt(long index) { return (int) VH_qpI.get(this.segment(), 0L, index); }
    public int qpPAt(long index) { return (int) VH_qpP.get(this.segment(), 0L, index); }
    public int qpBAt(long index) { return (int) VH_qpB.get(this.segment(), 0L, index); }
    public int qpI() { return (int) VH_qpI.get(this.segment(), 0L, 0L); }
    public int qpP() { return (int) VH_qpP.get(this.segment(), 0L, 0L); }
    public int qpB() { return (int) VH_qpB.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265QpKHR qpIAt(long index, int value) { VH_qpI.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QpKHR qpPAt(long index, int value) { VH_qpP.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QpKHR qpBAt(long index, int value) { VH_qpB.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QpKHR qpI(int value) { VH_qpI.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QpKHR qpP(int value) { VH_qpP.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QpKHR qpB(int value) { VH_qpB.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _qpIAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qpI, index), LAYOUT_qpI); }
    public MemorySegment _qpI() { return _qpIAt(0L); }
    public VkVideoEncodeH265QpKHR _qpIAt(long index, MemorySegment src) { _qpIAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QpKHR _qpI(MemorySegment src) { return _qpIAt(0L, src); }
    public MemorySegment _qpPAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qpP, index), LAYOUT_qpP); }
    public MemorySegment _qpP() { return _qpPAt(0L); }
    public VkVideoEncodeH265QpKHR _qpPAt(long index, MemorySegment src) { _qpPAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QpKHR _qpP(MemorySegment src) { return _qpPAt(0L, src); }
    public MemorySegment _qpBAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qpB, index), LAYOUT_qpB); }
    public MemorySegment _qpB() { return _qpBAt(0L); }
    public VkVideoEncodeH265QpKHR _qpBAt(long index, MemorySegment src) { _qpBAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QpKHR _qpB(MemorySegment src) { return _qpBAt(0L, src); }
}
