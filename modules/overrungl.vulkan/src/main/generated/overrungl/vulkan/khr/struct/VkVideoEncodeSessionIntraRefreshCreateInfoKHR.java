// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionIntraRefreshCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionIntraRefreshCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeIntraRefreshModeFlagBitsKHR intraRefreshMode;
/// }
/// ```
public final class VkVideoEncodeSessionIntraRefreshCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("intraRefreshMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_intraRefreshMode = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_intraRefreshMode = LAYOUT.select(PathElement.groupElement("intraRefreshMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_intraRefreshMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshMode"));

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR); }
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR copyFrom(VkVideoEncodeSessionIntraRefreshCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR asSlice(long index) { return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR at(long index, Consumer<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int intraRefreshModeAt(long index) { return (int) VH_intraRefreshMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int intraRefreshMode() { return (int) VH_intraRefreshMode.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR intraRefreshModeAt(long index, int value) { VH_intraRefreshMode.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR intraRefreshMode(int value) { VH_intraRefreshMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _intraRefreshModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraRefreshMode, index), LAYOUT_intraRefreshMode); }
    public MemorySegment _intraRefreshMode() { return _intraRefreshModeAt(0L); }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _intraRefreshModeAt(long index, MemorySegment src) { _intraRefreshModeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR _intraRefreshMode(MemorySegment src) { return _intraRefreshModeAt(0L, src); }
}
