// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassStripeInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassStripeInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkRect2D stripeArea;
/// }
/// ```
public final class VkRenderPassStripeInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("stripeArea")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stripeArea = LAYOUT.byteOffset(PathElement.groupElement("stripeArea"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stripeArea = LAYOUT.select(PathElement.groupElement("stripeArea"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stripeArea$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeArea"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_stripeArea$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeArea"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_stripeArea$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeArea"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_stripeArea$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeArea"), PathElement.groupElement("extent"), PathElement.groupElement("height"));

    public VkRenderPassStripeInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassStripeInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassStripeInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassStripeInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassStripeInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassStripeInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassStripeInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM); }
    public static VkRenderPassStripeInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM);
        return s;
    }
    public VkRenderPassStripeInfoARM copyFrom(VkRenderPassStripeInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassStripeInfoARM reinterpret(long count) { return new VkRenderPassStripeInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassStripeInfoARM asSlice(long index) { return new VkRenderPassStripeInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassStripeInfoARM asSlice(long index, long count) { return new VkRenderPassStripeInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassStripeInfoARM at(long index, Consumer<VkRenderPassStripeInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stripeArea$offset$xAt(long index) { return (int) VH_stripeArea$offset$x.get(this.segment(), 0L, index); }
    public int stripeArea$offset$yAt(long index) { return (int) VH_stripeArea$offset$y.get(this.segment(), 0L, index); }
    public int stripeArea$extent$widthAt(long index) { return (int) VH_stripeArea$extent$width.get(this.segment(), 0L, index); }
    public int stripeArea$extent$heightAt(long index) { return (int) VH_stripeArea$extent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stripeArea$offset$x() { return (int) VH_stripeArea$offset$x.get(this.segment(), 0L, 0L); }
    public int stripeArea$offset$y() { return (int) VH_stripeArea$offset$y.get(this.segment(), 0L, 0L); }
    public int stripeArea$extent$width() { return (int) VH_stripeArea$extent$width.get(this.segment(), 0L, 0L); }
    public int stripeArea$extent$height() { return (int) VH_stripeArea$extent$height.get(this.segment(), 0L, 0L); }
    public VkRenderPassStripeInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$offset$xAt(long index, int value) { VH_stripeArea$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$offset$yAt(long index, int value) { VH_stripeArea$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$extent$widthAt(long index, int value) { VH_stripeArea$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$extent$heightAt(long index, int value) { VH_stripeArea$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassStripeInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$offset$x(int value) { VH_stripeArea$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$offset$y(int value) { VH_stripeArea$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$extent$width(int value) { VH_stripeArea$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassStripeInfoARM stripeArea$extent$height(int value) { VH_stripeArea$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassStripeInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassStripeInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stripeAreaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stripeArea, index), LAYOUT_stripeArea); }
    public MemorySegment _stripeArea() { return _stripeAreaAt(0L); }
    public VkRenderPassStripeInfoARM _stripeAreaAt(long index, MemorySegment src) { _stripeAreaAt(index).copyFrom(src); return this; }
    public VkRenderPassStripeInfoARM _stripeArea(MemorySegment src) { return _stripeAreaAt(0L, src); }
}
