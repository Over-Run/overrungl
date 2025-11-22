// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeVP9CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeVP9CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     StdVideoVP9Level maxLevel;
/// }
/// ```
public final class VkVideoDecodeVP9CapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxLevel = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxLevel = LAYOUT.select(PathElement.groupElement("maxLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel"));

    public VkVideoDecodeVP9CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeVP9CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeVP9CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeVP9CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeVP9CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeVP9CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeVP9CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeVP9CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeVP9CapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR); }
    public static VkVideoDecodeVP9CapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoDecodeVP9CapabilitiesKHR copyFrom(VkVideoDecodeVP9CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR reinterpret(long count) { return new VkVideoDecodeVP9CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeVP9CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeVP9CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeVP9CapabilitiesKHR asSlice(long index, long count) { return new VkVideoDecodeVP9CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeVP9CapabilitiesKHR at(long index, Consumer<VkVideoDecodeVP9CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxLevelAt(long index) { return (int) VH_maxLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxLevel() { return (int) VH_maxLevel.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeVP9CapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR maxLevelAt(long index, int value) { VH_maxLevel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR maxLevel(int value) { VH_maxLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeVP9CapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeVP9CapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLevel, index), LAYOUT_maxLevel); }
    public MemorySegment _maxLevel() { return _maxLevelAt(0L); }
    public VkVideoDecodeVP9CapabilitiesKHR _maxLevelAt(long index, MemorySegment src) { _maxLevelAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9CapabilitiesKHR _maxLevel(MemorySegment src) { return _maxLevelAt(0L, src); }
}
