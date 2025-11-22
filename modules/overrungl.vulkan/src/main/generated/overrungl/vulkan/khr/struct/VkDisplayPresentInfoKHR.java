// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPresentInfoKHR`.
/// ## Layout
/// ```
/// struct VkDisplayPresentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkRect2D srcRect;
///     VkRect2D dstRect;
///     VkBool32 persistent;
/// }
/// ```
public final class VkDisplayPresentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("srcRect"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("dstRect"),
        ValueLayout.JAVA_INT.withName("persistent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcRect = LAYOUT.byteOffset(PathElement.groupElement("srcRect"));
    public static final long OFFSET_dstRect = LAYOUT.byteOffset(PathElement.groupElement("dstRect"));
    public static final long OFFSET_persistent = LAYOUT.byteOffset(PathElement.groupElement("persistent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcRect = LAYOUT.select(PathElement.groupElement("srcRect"));
    public static final MemoryLayout LAYOUT_dstRect = LAYOUT.select(PathElement.groupElement("dstRect"));
    public static final MemoryLayout LAYOUT_persistent = LAYOUT.select(PathElement.groupElement("persistent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcRect$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcRect"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_srcRect$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcRect"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_srcRect$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcRect"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_srcRect$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcRect"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_dstRect$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstRect"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_dstRect$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstRect"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_dstRect$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstRect"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_dstRect$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstRect"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_persistent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistent"));

    public VkDisplayPresentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPresentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPresentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplayPresentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPresentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR); }
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR);
        return s;
    }
    public VkDisplayPresentInfoKHR copyFrom(VkDisplayPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPresentInfoKHR reinterpret(long count) { return new VkDisplayPresentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPresentInfoKHR asSlice(long index) { return new VkDisplayPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPresentInfoKHR asSlice(long index, long count) { return new VkDisplayPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPresentInfoKHR at(long index, Consumer<VkDisplayPresentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcRect$offset$xAt(long index) { return (int) VH_srcRect$offset$x.get(this.segment(), 0L, index); }
    public int srcRect$offset$yAt(long index) { return (int) VH_srcRect$offset$y.get(this.segment(), 0L, index); }
    public int srcRect$extent$widthAt(long index) { return (int) VH_srcRect$extent$width.get(this.segment(), 0L, index); }
    public int srcRect$extent$heightAt(long index) { return (int) VH_srcRect$extent$height.get(this.segment(), 0L, index); }
    public int dstRect$offset$xAt(long index) { return (int) VH_dstRect$offset$x.get(this.segment(), 0L, index); }
    public int dstRect$offset$yAt(long index) { return (int) VH_dstRect$offset$y.get(this.segment(), 0L, index); }
    public int dstRect$extent$widthAt(long index) { return (int) VH_dstRect$extent$width.get(this.segment(), 0L, index); }
    public int dstRect$extent$heightAt(long index) { return (int) VH_dstRect$extent$height.get(this.segment(), 0L, index); }
    public int persistentAt(long index) { return (int) VH_persistent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcRect$offset$x() { return (int) VH_srcRect$offset$x.get(this.segment(), 0L, 0L); }
    public int srcRect$offset$y() { return (int) VH_srcRect$offset$y.get(this.segment(), 0L, 0L); }
    public int srcRect$extent$width() { return (int) VH_srcRect$extent$width.get(this.segment(), 0L, 0L); }
    public int srcRect$extent$height() { return (int) VH_srcRect$extent$height.get(this.segment(), 0L, 0L); }
    public int dstRect$offset$x() { return (int) VH_dstRect$offset$x.get(this.segment(), 0L, 0L); }
    public int dstRect$offset$y() { return (int) VH_dstRect$offset$y.get(this.segment(), 0L, 0L); }
    public int dstRect$extent$width() { return (int) VH_dstRect$extent$width.get(this.segment(), 0L, 0L); }
    public int dstRect$extent$height() { return (int) VH_dstRect$extent$height.get(this.segment(), 0L, 0L); }
    public int persistent() { return (int) VH_persistent.get(this.segment(), 0L, 0L); }
    public VkDisplayPresentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$offset$xAt(long index, int value) { VH_srcRect$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$offset$yAt(long index, int value) { VH_srcRect$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$extent$widthAt(long index, int value) { VH_srcRect$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$extent$heightAt(long index, int value) { VH_srcRect$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$offset$xAt(long index, int value) { VH_dstRect$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$offset$yAt(long index, int value) { VH_dstRect$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$extent$widthAt(long index, int value) { VH_dstRect$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$extent$heightAt(long index, int value) { VH_dstRect$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR persistentAt(long index, int value) { VH_persistent.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPresentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$offset$x(int value) { VH_srcRect$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$offset$y(int value) { VH_srcRect$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$extent$width(int value) { VH_srcRect$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR srcRect$extent$height(int value) { VH_srcRect$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$offset$x(int value) { VH_dstRect$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$offset$y(int value) { VH_dstRect$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$extent$width(int value) { VH_dstRect$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR dstRect$extent$height(int value) { VH_dstRect$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPresentInfoKHR persistent(int value) { VH_persistent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayPresentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayPresentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayPresentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayPresentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcRectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcRect, index), LAYOUT_srcRect); }
    public MemorySegment _srcRect() { return _srcRectAt(0L); }
    public VkDisplayPresentInfoKHR _srcRectAt(long index, MemorySegment src) { _srcRectAt(index).copyFrom(src); return this; }
    public VkDisplayPresentInfoKHR _srcRect(MemorySegment src) { return _srcRectAt(0L, src); }
    public MemorySegment _dstRectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstRect, index), LAYOUT_dstRect); }
    public MemorySegment _dstRect() { return _dstRectAt(0L); }
    public VkDisplayPresentInfoKHR _dstRectAt(long index, MemorySegment src) { _dstRectAt(index).copyFrom(src); return this; }
    public VkDisplayPresentInfoKHR _dstRect(MemorySegment src) { return _dstRectAt(0L, src); }
    public MemorySegment _persistentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_persistent, index), LAYOUT_persistent); }
    public MemorySegment _persistent() { return _persistentAt(0L); }
    public VkDisplayPresentInfoKHR _persistentAt(long index, MemorySegment src) { _persistentAt(index).copyFrom(src); return this; }
    public VkDisplayPresentInfoKHR _persistent(MemorySegment src) { return _persistentAt(0L, src); }
}
