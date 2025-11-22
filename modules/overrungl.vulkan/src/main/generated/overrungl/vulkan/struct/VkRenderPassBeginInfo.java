// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassBeginInfo`.
/// ## Layout
/// ```
/// struct VkRenderPassBeginInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPass renderPass;
///     VkFramebuffer framebuffer;
///     VkRect2D renderArea;
///     uint32_t clearValueCount;
///     const VkClearValue* pClearValues;
/// }
/// ```
public final class VkRenderPassBeginInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_LONG.withName("framebuffer"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withName("pClearValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    public static final long OFFSET_framebuffer = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    public static final long OFFSET_clearValueCount = LAYOUT.byteOffset(PathElement.groupElement("clearValueCount"));
    public static final long OFFSET_pClearValues = LAYOUT.byteOffset(PathElement.groupElement("pClearValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    public static final MemoryLayout LAYOUT_framebuffer = LAYOUT.select(PathElement.groupElement("framebuffer"));
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    public static final MemoryLayout LAYOUT_clearValueCount = LAYOUT.select(PathElement.groupElement("clearValueCount"));
    public static final MemoryLayout LAYOUT_pClearValues = LAYOUT.select(PathElement.groupElement("pClearValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    public static final VarHandle VH_renderArea$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_renderArea$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_renderArea$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_renderArea$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_clearValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValueCount"));
    public static final VarHandle VH_pClearValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pClearValues"));

    public VkRenderPassBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassBeginInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO); }
    public static VkRenderPassBeginInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
        return s;
    }
    public VkRenderPassBeginInfo copyFrom(VkRenderPassBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassBeginInfo reinterpret(long count) { return new VkRenderPassBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassBeginInfo asSlice(long index) { return new VkRenderPassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassBeginInfo asSlice(long index, long count) { return new VkRenderPassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassBeginInfo at(long index, Consumer<VkRenderPassBeginInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long renderPassAt(long index) { return (long) VH_renderPass.get(this.segment(), 0L, index); }
    public long framebufferAt(long index) { return (long) VH_framebuffer.get(this.segment(), 0L, index); }
    public int renderArea$offset$xAt(long index) { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, index); }
    public int renderArea$offset$yAt(long index) { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, index); }
    public int renderArea$extent$widthAt(long index) { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, index); }
    public int renderArea$extent$heightAt(long index) { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, index); }
    public int clearValueCountAt(long index) { return (int) VH_clearValueCount.get(this.segment(), 0L, index); }
    public MemorySegment pClearValuesAt(long index) { return (MemorySegment) VH_pClearValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long renderPass() { return (long) VH_renderPass.get(this.segment(), 0L, 0L); }
    public long framebuffer() { return (long) VH_framebuffer.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$x() { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$y() { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$width() { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$height() { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, 0L); }
    public int clearValueCount() { return (int) VH_clearValueCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pClearValues() { return (MemorySegment) VH_pClearValues.get(this.segment(), 0L, 0L); }
    public VkRenderPassBeginInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo renderPassAt(long index, long value) { VH_renderPass.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo framebufferAt(long index, long value) { VH_framebuffer.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo renderArea$offset$xAt(long index, int value) { VH_renderArea$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo renderArea$offset$yAt(long index, int value) { VH_renderArea$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo renderArea$extent$widthAt(long index, int value) { VH_renderArea$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo renderArea$extent$heightAt(long index, int value) { VH_renderArea$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo clearValueCountAt(long index, int value) { VH_clearValueCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo pClearValuesAt(long index, MemorySegment value) { VH_pClearValues.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassBeginInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo renderPass(long value) { VH_renderPass.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo framebuffer(long value) { VH_framebuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo renderArea$offset$x(int value) { VH_renderArea$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo renderArea$offset$y(int value) { VH_renderArea$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo renderArea$extent$width(int value) { VH_renderArea$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo renderArea$extent$height(int value) { VH_renderArea$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo clearValueCount(int value) { VH_clearValueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassBeginInfo pClearValues(MemorySegment value) { VH_pClearValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassBeginInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassBeginInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _renderPassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPass, index), LAYOUT_renderPass); }
    public MemorySegment _renderPass() { return _renderPassAt(0L); }
    public VkRenderPassBeginInfo _renderPassAt(long index, MemorySegment src) { _renderPassAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _renderPass(MemorySegment src) { return _renderPassAt(0L, src); }
    public MemorySegment _framebufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebuffer, index), LAYOUT_framebuffer); }
    public MemorySegment _framebuffer() { return _framebufferAt(0L); }
    public VkRenderPassBeginInfo _framebufferAt(long index, MemorySegment src) { _framebufferAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _framebuffer(MemorySegment src) { return _framebufferAt(0L, src); }
    public MemorySegment _renderAreaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea); }
    public MemorySegment _renderArea() { return _renderAreaAt(0L); }
    public VkRenderPassBeginInfo _renderAreaAt(long index, MemorySegment src) { _renderAreaAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _renderArea(MemorySegment src) { return _renderAreaAt(0L, src); }
    public MemorySegment _clearValueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clearValueCount, index), LAYOUT_clearValueCount); }
    public MemorySegment _clearValueCount() { return _clearValueCountAt(0L); }
    public VkRenderPassBeginInfo _clearValueCountAt(long index, MemorySegment src) { _clearValueCountAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _clearValueCount(MemorySegment src) { return _clearValueCountAt(0L, src); }
    public MemorySegment _pClearValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pClearValues, index), LAYOUT_pClearValues); }
    public MemorySegment _pClearValues() { return _pClearValuesAt(0L); }
    public VkRenderPassBeginInfo _pClearValuesAt(long index, MemorySegment src) { _pClearValuesAt(index).copyFrom(src); return this; }
    public VkRenderPassBeginInfo _pClearValues(MemorySegment src) { return _pClearValuesAt(0L, src); }
}
