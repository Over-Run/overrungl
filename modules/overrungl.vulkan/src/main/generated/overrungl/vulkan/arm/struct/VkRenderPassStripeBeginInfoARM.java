// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassStripeBeginInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassStripeBeginInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeInfoCount;
///     const VkRenderPassStripeInfoARM* pStripeInfos;
/// }
/// ```
public final class VkRenderPassStripeBeginInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeInfos")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stripeInfoCount = LAYOUT.byteOffset(PathElement.groupElement("stripeInfoCount"));
    public static final long OFFSET_pStripeInfos = LAYOUT.byteOffset(PathElement.groupElement("pStripeInfos"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stripeInfoCount = LAYOUT.select(PathElement.groupElement("stripeInfoCount"));
    public static final MemoryLayout LAYOUT_pStripeInfos = LAYOUT.select(PathElement.groupElement("pStripeInfos"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stripeInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeInfoCount"));
    public static final VarHandle VH_pStripeInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeInfos"));

    public VkRenderPassStripeBeginInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassStripeBeginInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassStripeBeginInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM); }
    public static VkRenderPassStripeBeginInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM);
        return s;
    }
    public VkRenderPassStripeBeginInfoARM copyFrom(VkRenderPassStripeBeginInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassStripeBeginInfoARM reinterpret(long count) { return new VkRenderPassStripeBeginInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassStripeBeginInfoARM asSlice(long index) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassStripeBeginInfoARM asSlice(long index, long count) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassStripeBeginInfoARM at(long index, Consumer<VkRenderPassStripeBeginInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stripeInfoCountAt(long index) { return (int) VH_stripeInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pStripeInfosAt(long index) { return (MemorySegment) VH_pStripeInfos.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stripeInfoCount() { return (int) VH_stripeInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStripeInfos() { return (MemorySegment) VH_pStripeInfos.get(this.segment(), 0L, 0L); }
    public VkRenderPassStripeBeginInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeBeginInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeBeginInfoARM stripeInfoCountAt(long index, int value) { VH_stripeInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeBeginInfoARM pStripeInfosAt(long index, MemorySegment value) { VH_pStripeInfos.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeBeginInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeBeginInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeBeginInfoARM stripeInfoCount(int value) { VH_stripeInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeBeginInfoARM pStripeInfos(MemorySegment value) { VH_pStripeInfos.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassStripeBeginInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeBeginInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassStripeBeginInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeBeginInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stripeInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stripeInfoCount, index), LAYOUT_stripeInfoCount); }
    public MemorySegment _stripeInfoCount() { return _stripeInfoCountAt(0L); }
    public VkRenderPassStripeBeginInfoARM _stripeInfoCountAt(long index, MemorySegment src) { _stripeInfoCountAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeBeginInfoARM _stripeInfoCount(MemorySegment src) { return _stripeInfoCountAt(0L, src); }
    public MemorySegment _pStripeInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStripeInfos, index), LAYOUT_pStripeInfos); }
    public MemorySegment _pStripeInfos() { return _pStripeInfosAt(0L); }
    public VkRenderPassStripeBeginInfoARM _pStripeInfosAt(long index, MemorySegment src) { _pStripeInfosAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeBeginInfoARM _pStripeInfos(MemorySegment src) { return _pStripeInfosAt(0L, src); }
}
