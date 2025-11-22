// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyAccelerationStructureInfoKHR`.
/// ## Layout
/// ```
/// struct VkCopyAccelerationStructureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureKHR src;
///     VkAccelerationStructureKHR dst;
///     VkCopyAccelerationStructureModeKHR mode;
/// }
/// ```
public final class VkCopyAccelerationStructureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("src"),
        ValueLayout.JAVA_LONG.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    public static final long OFFSET_dst = LAYOUT.byteOffset(PathElement.groupElement("dst"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_src = LAYOUT.select(PathElement.groupElement("src"));
    public static final MemoryLayout LAYOUT_dst = LAYOUT.select(PathElement.groupElement("dst"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_src = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"));
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    public VkCopyAccelerationStructureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyAccelerationStructureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyAccelerationStructureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyAccelerationStructureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyAccelerationStructureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyAccelerationStructureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyAccelerationStructureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyAccelerationStructureInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyAccelerationStructureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCopyAccelerationStructureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyAccelerationStructureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyAccelerationStructureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR); }
    public static VkCopyAccelerationStructureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR);
        return s;
    }
    public VkCopyAccelerationStructureInfoKHR copyFrom(VkCopyAccelerationStructureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyAccelerationStructureInfoKHR reinterpret(long count) { return new VkCopyAccelerationStructureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyAccelerationStructureInfoKHR asSlice(long index) { return new VkCopyAccelerationStructureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyAccelerationStructureInfoKHR asSlice(long index, long count) { return new VkCopyAccelerationStructureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyAccelerationStructureInfoKHR at(long index, Consumer<VkCopyAccelerationStructureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcAt(long index) { return (long) VH_src.get(this.segment(), 0L, index); }
    public long dstAt(long index) { return (long) VH_dst.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long src() { return (long) VH_src.get(this.segment(), 0L, 0L); }
    public long dst() { return (long) VH_dst.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public VkCopyAccelerationStructureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyAccelerationStructureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyAccelerationStructureInfoKHR srcAt(long index, long value) { VH_src.set(this.segment(), 0L, index, value); return this; }
    public VkCopyAccelerationStructureInfoKHR dstAt(long index, long value) { VH_dst.set(this.segment(), 0L, index, value); return this; }
    public VkCopyAccelerationStructureInfoKHR modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkCopyAccelerationStructureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyAccelerationStructureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyAccelerationStructureInfoKHR src(long value) { VH_src.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyAccelerationStructureInfoKHR dst(long value) { VH_dst.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyAccelerationStructureInfoKHR mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyAccelerationStructureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyAccelerationStructureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyAccelerationStructureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyAccelerationStructureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_src, index), LAYOUT_src); }
    public MemorySegment _src() { return _srcAt(0L); }
    public VkCopyAccelerationStructureInfoKHR _srcAt(long index, MemorySegment src) { _srcAt(index).copyFrom(src); return this; }
    public VkCopyAccelerationStructureInfoKHR _src(MemorySegment src) { return _srcAt(0L, src); }
    public MemorySegment _dstAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dst, index), LAYOUT_dst); }
    public MemorySegment _dst() { return _dstAt(0L); }
    public VkCopyAccelerationStructureInfoKHR _dstAt(long index, MemorySegment src) { _dstAt(index).copyFrom(src); return this; }
    public VkCopyAccelerationStructureInfoKHR _dst(MemorySegment src) { return _dstAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkCopyAccelerationStructureInfoKHR _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkCopyAccelerationStructureInfoKHR _mode(MemorySegment src) { return _modeAt(0L, src); }
}
