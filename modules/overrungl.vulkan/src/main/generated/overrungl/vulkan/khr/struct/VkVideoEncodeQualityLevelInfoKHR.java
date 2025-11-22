// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQualityLevelInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQualityLevelInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t qualityLevel;
/// }
/// ```
public final class VkVideoEncodeQualityLevelInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("qualityLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_qualityLevel = LAYOUT.byteOffset(PathElement.groupElement("qualityLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_qualityLevel = LAYOUT.select(PathElement.groupElement("qualityLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_qualityLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qualityLevel"));

    public VkVideoEncodeQualityLevelInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeQualityLevelInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR); }
    public static VkVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
        return s;
    }
    public VkVideoEncodeQualityLevelInfoKHR copyFrom(VkVideoEncodeQualityLevelInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeQualityLevelInfoKHR reinterpret(long count) { return new VkVideoEncodeQualityLevelInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeQualityLevelInfoKHR asSlice(long index) { return new VkVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeQualityLevelInfoKHR asSlice(long index, long count) { return new VkVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeQualityLevelInfoKHR at(long index, Consumer<VkVideoEncodeQualityLevelInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int qualityLevelAt(long index) { return (int) VH_qualityLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int qualityLevel() { return (int) VH_qualityLevel.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeQualityLevelInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelInfoKHR qualityLevelAt(long index, int value) { VH_qualityLevel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQualityLevelInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQualityLevelInfoKHR qualityLevel(int value) { VH_qualityLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeQualityLevelInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeQualityLevelInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _qualityLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qualityLevel, index), LAYOUT_qualityLevel); }
    public MemorySegment _qualityLevel() { return _qualityLevelAt(0L); }
    public VkVideoEncodeQualityLevelInfoKHR _qualityLevelAt(long index, MemorySegment src) { _qualityLevelAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelInfoKHR _qualityLevel(MemorySegment src) { return _qualityLevelAt(0L, src); }
}
