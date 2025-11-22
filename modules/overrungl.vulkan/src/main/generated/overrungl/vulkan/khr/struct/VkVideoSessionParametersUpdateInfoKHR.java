// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionParametersUpdateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionParametersUpdateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t updateSequenceCount;
/// }
/// ```
public final class VkVideoSessionParametersUpdateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("updateSequenceCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_updateSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("updateSequenceCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_updateSequenceCount = LAYOUT.select(PathElement.groupElement("updateSequenceCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_updateSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateSequenceCount"));

    public VkVideoSessionParametersUpdateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoSessionParametersUpdateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoSessionParametersUpdateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoSessionParametersUpdateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoSessionParametersUpdateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionParametersUpdateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoSessionParametersUpdateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionParametersUpdateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoSessionParametersUpdateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR); }
    public static VkVideoSessionParametersUpdateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR);
        return s;
    }
    public VkVideoSessionParametersUpdateInfoKHR copyFrom(VkVideoSessionParametersUpdateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoSessionParametersUpdateInfoKHR reinterpret(long count) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoSessionParametersUpdateInfoKHR asSlice(long index) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoSessionParametersUpdateInfoKHR asSlice(long index, long count) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoSessionParametersUpdateInfoKHR at(long index, Consumer<VkVideoSessionParametersUpdateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int updateSequenceCountAt(long index) { return (int) VH_updateSequenceCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int updateSequenceCount() { return (int) VH_updateSequenceCount.get(this.segment(), 0L, 0L); }
    public VkVideoSessionParametersUpdateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersUpdateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersUpdateInfoKHR updateSequenceCountAt(long index, int value) { VH_updateSequenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersUpdateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersUpdateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersUpdateInfoKHR updateSequenceCount(int value) { VH_updateSequenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoSessionParametersUpdateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersUpdateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoSessionParametersUpdateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersUpdateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _updateSequenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_updateSequenceCount, index), LAYOUT_updateSequenceCount); }
    public MemorySegment _updateSequenceCount() { return _updateSequenceCountAt(0L); }
    public VkVideoSessionParametersUpdateInfoKHR _updateSequenceCountAt(long index, MemorySegment src) { _updateSequenceCountAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersUpdateInfoKHR _updateSequenceCount(MemorySegment src) { return _updateSequenceCountAt(0L, src); }
}
