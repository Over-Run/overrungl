// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkSurfaceTransformFlagBitsKHR transform;
///     VkRect2D renderArea;
/// }
/// ```
public final class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    public static final VarHandle VH_renderArea$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_renderArea$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_renderArea$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_renderArea$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("height"));

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM); }
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM);
        return s;
    }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM copyFrom(VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM reinterpret(long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM asSlice(long index) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM asSlice(long index, long count) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM at(long index, Consumer<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int transformAt(long index) { return (int) VH_transform.get(this.segment(), 0L, index); }
    public int renderArea$offset$xAt(long index) { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, index); }
    public int renderArea$offset$yAt(long index) { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, index); }
    public int renderArea$extent$widthAt(long index) { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, index); }
    public int renderArea$extent$heightAt(long index) { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int transform() { return (int) VH_transform.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$x() { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$y() { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$width() { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$height() { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, 0L); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transformAt(long index, int value) { VH_transform.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$offset$xAt(long index, int value) { VH_renderArea$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$offset$yAt(long index, int value) { VH_renderArea$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$extent$widthAt(long index, int value) { VH_renderArea$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$extent$heightAt(long index, int value) { VH_renderArea$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(int value) { VH_transform.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$offset$x(int value) { VH_renderArea$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$offset$y(int value) { VH_renderArea$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$extent$width(int value) { VH_renderArea$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea$extent$height(int value) { VH_renderArea$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _transformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform); }
    public MemorySegment _transform() { return _transformAt(0L); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _transformAt(long index, MemorySegment src) { _transformAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _transform(MemorySegment src) { return _transformAt(0L, src); }
    public MemorySegment _renderAreaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea); }
    public MemorySegment _renderArea() { return _renderAreaAt(0L); }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _renderAreaAt(long index, MemorySegment src) { _renderAreaAt(index).copyFrom(src); return this; }
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM _renderArea(MemorySegment src) { return _renderAreaAt(0L, src); }
}
