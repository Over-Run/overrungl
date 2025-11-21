// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1SessionCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1SessionCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useMaxLevel;
///     StdVideoAV1Level maxLevel;
/// }
/// ```
public final class VkVideoEncodeAV1SessionCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevel"),
        ValueLayout.JAVA_INT.withName("maxLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_useMaxLevel = LAYOUT.byteOffset(PathElement.groupElement("useMaxLevel"));
    public static final long OFFSET_maxLevel = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_useMaxLevel = LAYOUT.select(PathElement.groupElement("useMaxLevel"));
    public static final MemoryLayout LAYOUT_maxLevel = LAYOUT.select(PathElement.groupElement("maxLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_useMaxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxLevel"));
    public static final VarHandle VH_maxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel"));

    public VkVideoEncodeAV1SessionCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR); }
    public static VkVideoEncodeAV1SessionCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1SessionCreateInfoKHR copyFrom(VkVideoEncodeAV1SessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1SessionCreateInfoKHR asSlice(long index) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1SessionCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1SessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1SessionCreateInfoKHR at(long index, Consumer<VkVideoEncodeAV1SessionCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int useMaxLevelAt(long index) { return (int) VH_useMaxLevel.get(this.segment(), 0L, index); }
    public int maxLevelAt(long index) { return (int) VH_maxLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int useMaxLevel() { return (int) VH_useMaxLevel.get(this.segment(), 0L, 0L); }
    public int maxLevel() { return (int) VH_maxLevel.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1SessionCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevelAt(long index, int value) { VH_useMaxLevel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevelAt(long index, int value) { VH_maxLevel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevel(int value) { VH_useMaxLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevel(int value) { VH_maxLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1SessionCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1SessionCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _useMaxLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMaxLevel, index), LAYOUT_useMaxLevel); }
    public MemorySegment _useMaxLevel() { return _useMaxLevelAt(0L); }
    public VkVideoEncodeAV1SessionCreateInfoKHR _useMaxLevelAt(long index, MemorySegment src) { _useMaxLevelAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR _useMaxLevel(MemorySegment src) { return _useMaxLevelAt(0L, src); }
    public MemorySegment _maxLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevel, index), LAYOUT_maxLevel); }
    public MemorySegment _maxLevel() { return _maxLevelAt(0L); }
    public VkVideoEncodeAV1SessionCreateInfoKHR _maxLevelAt(long index, MemorySegment src) { _maxLevelAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionCreateInfoKHR _maxLevel(MemorySegment src) { return _maxLevelAt(0L, src); }
}
