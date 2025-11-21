// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassStripeSubmitInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassStripeSubmitInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pStripeSemaphoreInfos;
/// }
/// ```
public final class VkRenderPassStripeSubmitInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeSemaphoreInfos")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stripeSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("stripeSemaphoreInfoCount"));
    public static final long OFFSET_pStripeSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pStripeSemaphoreInfos"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stripeSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("stripeSemaphoreInfoCount"));
    public static final MemoryLayout LAYOUT_pStripeSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pStripeSemaphoreInfos"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stripeSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeSemaphoreInfoCount"));
    public static final VarHandle VH_pStripeSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeSemaphoreInfos"));

    public VkRenderPassStripeSubmitInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassStripeSubmitInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassStripeSubmitInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassStripeSubmitInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassStripeSubmitInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeSubmitInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassStripeSubmitInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeSubmitInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassStripeSubmitInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM); }
    public static VkRenderPassStripeSubmitInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM);
        return s;
    }
    public VkRenderPassStripeSubmitInfoARM copyFrom(VkRenderPassStripeSubmitInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassStripeSubmitInfoARM reinterpret(long count) { return new VkRenderPassStripeSubmitInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassStripeSubmitInfoARM asSlice(long index) { return new VkRenderPassStripeSubmitInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassStripeSubmitInfoARM asSlice(long index, long count) { return new VkRenderPassStripeSubmitInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassStripeSubmitInfoARM at(long index, Consumer<VkRenderPassStripeSubmitInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stripeSemaphoreInfoCountAt(long index) { return (int) VH_stripeSemaphoreInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pStripeSemaphoreInfosAt(long index) { return (MemorySegment) VH_pStripeSemaphoreInfos.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stripeSemaphoreInfoCount() { return (int) VH_stripeSemaphoreInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStripeSemaphoreInfos() { return (MemorySegment) VH_pStripeSemaphoreInfos.get(this.segment(), 0L, 0L); }
    public VkRenderPassStripeSubmitInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeSubmitInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCountAt(long index, int value) { VH_stripeSemaphoreInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfosAt(long index, MemorySegment value) { VH_pStripeSemaphoreInfos.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeSubmitInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeSubmitInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCount(int value) { VH_stripeSemaphoreInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(MemorySegment value) { VH_pStripeSemaphoreInfos.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassStripeSubmitInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeSubmitInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassStripeSubmitInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeSubmitInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stripeSemaphoreInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stripeSemaphoreInfoCount, index), LAYOUT_stripeSemaphoreInfoCount); }
    public MemorySegment _stripeSemaphoreInfoCount() { return _stripeSemaphoreInfoCountAt(0L); }
    public VkRenderPassStripeSubmitInfoARM _stripeSemaphoreInfoCountAt(long index, MemorySegment src) { _stripeSemaphoreInfoCountAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeSubmitInfoARM _stripeSemaphoreInfoCount(MemorySegment src) { return _stripeSemaphoreInfoCountAt(0L, src); }
    public MemorySegment _pStripeSemaphoreInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStripeSemaphoreInfos, index), LAYOUT_pStripeSemaphoreInfos); }
    public MemorySegment _pStripeSemaphoreInfos() { return _pStripeSemaphoreInfosAt(0L); }
    public VkRenderPassStripeSubmitInfoARM _pStripeSemaphoreInfosAt(long index, MemorySegment src) { _pStripeSemaphoreInfosAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeSubmitInfoARM _pStripeSemaphoreInfos(MemorySegment src) { return _pStripeSemaphoreInfosAt(0L, src); }
}
