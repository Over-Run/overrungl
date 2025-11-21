// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainLatencyCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkSwapchainLatencyCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 latencyModeEnable;
/// }
/// ```
public final class VkSwapchainLatencyCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("latencyModeEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_latencyModeEnable = LAYOUT.byteOffset(PathElement.groupElement("latencyModeEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_latencyModeEnable = LAYOUT.select(PathElement.groupElement("latencyModeEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_latencyModeEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("latencyModeEnable"));

    public VkSwapchainLatencyCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainLatencyCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainLatencyCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainLatencyCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainLatencyCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainLatencyCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainLatencyCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainLatencyCreateInfoNV alloc(SegmentAllocator allocator) { return new VkSwapchainLatencyCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainLatencyCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSwapchainLatencyCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainLatencyCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV); }
    public static VkSwapchainLatencyCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV);
        return s;
    }
    public VkSwapchainLatencyCreateInfoNV copyFrom(VkSwapchainLatencyCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainLatencyCreateInfoNV reinterpret(long count) { return new VkSwapchainLatencyCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainLatencyCreateInfoNV asSlice(long index) { return new VkSwapchainLatencyCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainLatencyCreateInfoNV asSlice(long index, long count) { return new VkSwapchainLatencyCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainLatencyCreateInfoNV at(long index, Consumer<VkSwapchainLatencyCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int latencyModeEnableAt(long index) { return (int) VH_latencyModeEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int latencyModeEnable() { return (int) VH_latencyModeEnable.get(this.segment(), 0L, 0L); }
    public VkSwapchainLatencyCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainLatencyCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainLatencyCreateInfoNV latencyModeEnableAt(long index, int value) { VH_latencyModeEnable.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainLatencyCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainLatencyCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainLatencyCreateInfoNV latencyModeEnable(int value) { VH_latencyModeEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainLatencyCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainLatencyCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainLatencyCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainLatencyCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _latencyModeEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_latencyModeEnable, index), LAYOUT_latencyModeEnable); }
    public MemorySegment _latencyModeEnable() { return _latencyModeEnableAt(0L); }
    public VkSwapchainLatencyCreateInfoNV _latencyModeEnableAt(long index, MemorySegment src) { _latencyModeEnableAt(index).copyFrom(src); return this; }
    public VkSwapchainLatencyCreateInfoNV _latencyModeEnable(MemorySegment src) { return _latencyModeEnableAt(0L, src); }
}
