// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlaneInfo2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplayModeKHR mode;
///     uint32_t planeIndex;
/// }
/// ```
public final class VkDisplayPlaneInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("mode"),
        ValueLayout.JAVA_INT.withName("planeIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final long OFFSET_planeIndex = LAYOUT.byteOffset(PathElement.groupElement("planeIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_planeIndex = LAYOUT.select(PathElement.groupElement("planeIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    public static final VarHandle VH_planeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeIndex"));

    public VkDisplayPlaneInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPlaneInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPlaneInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPlaneInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPlaneInfo2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPlaneInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayPlaneInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR); }
    public static VkDisplayPlaneInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR);
        return s;
    }
    public VkDisplayPlaneInfo2KHR copyFrom(VkDisplayPlaneInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPlaneInfo2KHR reinterpret(long count) { return new VkDisplayPlaneInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPlaneInfo2KHR asSlice(long index) { return new VkDisplayPlaneInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPlaneInfo2KHR asSlice(long index, long count) { return new VkDisplayPlaneInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPlaneInfo2KHR at(long index, Consumer<VkDisplayPlaneInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long modeAt(long index) { return (long) VH_mode.get(this.segment(), 0L, index); }
    public int planeIndexAt(long index) { return (int) VH_planeIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long mode() { return (long) VH_mode.get(this.segment(), 0L, 0L); }
    public int planeIndex() { return (int) VH_planeIndex.get(this.segment(), 0L, 0L); }
    public VkDisplayPlaneInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneInfo2KHR modeAt(long index, long value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneInfo2KHR planeIndexAt(long index, int value) { VH_planeIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlaneInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneInfo2KHR mode(long value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlaneInfo2KHR planeIndex(int value) { VH_planeIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayPlaneInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayPlaneInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkDisplayPlaneInfo2KHR _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneInfo2KHR _mode(MemorySegment src) { return _modeAt(0L, src); }
    public MemorySegment _planeIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_planeIndex, index), LAYOUT_planeIndex); }
    public MemorySegment _planeIndex() { return _planeIndexAt(0L); }
    public VkDisplayPlaneInfo2KHR _planeIndexAt(long index, MemorySegment src) { _planeIndexAt(index).copyFrom(src); return this; }
    public VkDisplayPlaneInfo2KHR _planeIndex(MemorySegment src) { return _planeIndexAt(0L, src); }
}
