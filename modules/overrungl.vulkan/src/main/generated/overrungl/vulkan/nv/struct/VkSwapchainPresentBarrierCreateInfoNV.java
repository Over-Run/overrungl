// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentBarrierCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentBarrierCreateInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentBarrierEnable;
/// }
/// ```
public final class VkSwapchainPresentBarrierCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrierEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentBarrierEnable = LAYOUT.byteOffset(PathElement.groupElement("presentBarrierEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentBarrierEnable = LAYOUT.select(PathElement.groupElement("presentBarrierEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentBarrierEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentBarrierEnable"));

    public VkSwapchainPresentBarrierCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentBarrierCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentBarrierCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentBarrierCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentBarrierCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentBarrierCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentBarrierCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentBarrierCreateInfoNV alloc(SegmentAllocator allocator) { return new VkSwapchainPresentBarrierCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentBarrierCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentBarrierCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentBarrierCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV); }
    public static VkSwapchainPresentBarrierCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV);
        return s;
    }
    public VkSwapchainPresentBarrierCreateInfoNV copyFrom(VkSwapchainPresentBarrierCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV reinterpret(long count) { return new VkSwapchainPresentBarrierCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentBarrierCreateInfoNV asSlice(long index) { return new VkSwapchainPresentBarrierCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentBarrierCreateInfoNV asSlice(long index, long count) { return new VkSwapchainPresentBarrierCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentBarrierCreateInfoNV at(long index, Consumer<VkSwapchainPresentBarrierCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentBarrierEnableAt(long index) { return (int) VH_presentBarrierEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentBarrierEnable() { return (int) VH_presentBarrierEnable.get(this.segment(), 0L, 0L); }
    public VkSwapchainPresentBarrierCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV presentBarrierEnableAt(long index, int value) { VH_presentBarrierEnable.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV presentBarrierEnable(int value) { VH_presentBarrierEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentBarrierCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentBarrierCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentBarrierEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentBarrierEnable, index), LAYOUT_presentBarrierEnable); }
    public MemorySegment _presentBarrierEnable() { return _presentBarrierEnableAt(0L); }
    public VkSwapchainPresentBarrierCreateInfoNV _presentBarrierEnableAt(long index, MemorySegment src) { _presentBarrierEnableAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentBarrierCreateInfoNV _presentBarrierEnable(MemorySegment src) { return _presentBarrierEnableAt(0L, src); }
}
