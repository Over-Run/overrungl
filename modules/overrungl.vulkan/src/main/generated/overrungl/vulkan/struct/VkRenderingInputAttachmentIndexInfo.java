// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingInputAttachmentIndexInfo`.
/// ## Layout
/// ```
/// struct VkRenderingInputAttachmentIndexInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const uint32_t* pColorAttachmentInputIndices;
///     const uint32_t* pDepthInputAttachmentIndex;
///     const uint32_t* pStencilInputAttachmentIndex;
/// }
/// ```
public final class VkRenderingInputAttachmentIndexInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentInputIndices"),
        ValueLayout.ADDRESS.withName("pDepthInputAttachmentIndex"),
        ValueLayout.ADDRESS.withName("pStencilInputAttachmentIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachmentInputIndices = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentInputIndices"));
    public static final long OFFSET_pDepthInputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("pDepthInputAttachmentIndex"));
    public static final long OFFSET_pStencilInputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("pStencilInputAttachmentIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachmentInputIndices = LAYOUT.select(PathElement.groupElement("pColorAttachmentInputIndices"));
    public static final MemoryLayout LAYOUT_pDepthInputAttachmentIndex = LAYOUT.select(PathElement.groupElement("pDepthInputAttachmentIndex"));
    public static final MemoryLayout LAYOUT_pStencilInputAttachmentIndex = LAYOUT.select(PathElement.groupElement("pStencilInputAttachmentIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachmentInputIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentInputIndices"));
    public static final VarHandle VH_pDepthInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthInputAttachmentIndex"));
    public static final VarHandle VH_pStencilInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilInputAttachmentIndex"));

    public VkRenderingInputAttachmentIndexInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingInputAttachmentIndexInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingInputAttachmentIndexInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingInputAttachmentIndexInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingInputAttachmentIndexInfo alloc(SegmentAllocator allocator) { return new VkRenderingInputAttachmentIndexInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingInputAttachmentIndexInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingInputAttachmentIndexInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingInputAttachmentIndexInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO); }
    public static VkRenderingInputAttachmentIndexInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO);
        return s;
    }
    public VkRenderingInputAttachmentIndexInfo copyFrom(VkRenderingInputAttachmentIndexInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingInputAttachmentIndexInfo reinterpret(long count) { return new VkRenderingInputAttachmentIndexInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingInputAttachmentIndexInfo asSlice(long index) { return new VkRenderingInputAttachmentIndexInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingInputAttachmentIndexInfo asSlice(long index, long count) { return new VkRenderingInputAttachmentIndexInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingInputAttachmentIndexInfo at(long index, Consumer<VkRenderingInputAttachmentIndexInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentInputIndicesAt(long index) { return (MemorySegment) VH_pColorAttachmentInputIndices.get(this.segment(), 0L, index); }
    public MemorySegment pDepthInputAttachmentIndexAt(long index) { return (MemorySegment) VH_pDepthInputAttachmentIndex.get(this.segment(), 0L, index); }
    public MemorySegment pStencilInputAttachmentIndexAt(long index) { return (MemorySegment) VH_pStencilInputAttachmentIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachmentInputIndices() { return (MemorySegment) VH_pColorAttachmentInputIndices.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthInputAttachmentIndex() { return (MemorySegment) VH_pDepthInputAttachmentIndex.get(this.segment(), 0L, 0L); }
    public MemorySegment pStencilInputAttachmentIndex() { return (MemorySegment) VH_pStencilInputAttachmentIndex.get(this.segment(), 0L, 0L); }
    public VkRenderingInputAttachmentIndexInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndicesAt(long index, MemorySegment value) { VH_pColorAttachmentInputIndices.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndexAt(long index, MemorySegment value) { VH_pDepthInputAttachmentIndex.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndexAt(long index, MemorySegment value) { VH_pStencilInputAttachmentIndex.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInputAttachmentIndexInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(MemorySegment value) { VH_pColorAttachmentInputIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(MemorySegment value) { VH_pDepthInputAttachmentIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(MemorySegment value) { VH_pStencilInputAttachmentIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentInputIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentInputIndices, index), LAYOUT_pColorAttachmentInputIndices); }
    public MemorySegment _pColorAttachmentInputIndices() { return _pColorAttachmentInputIndicesAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _pColorAttachmentInputIndicesAt(long index, MemorySegment src) { _pColorAttachmentInputIndicesAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _pColorAttachmentInputIndices(MemorySegment src) { return _pColorAttachmentInputIndicesAt(0L, src); }
    public MemorySegment _pDepthInputAttachmentIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthInputAttachmentIndex, index), LAYOUT_pDepthInputAttachmentIndex); }
    public MemorySegment _pDepthInputAttachmentIndex() { return _pDepthInputAttachmentIndexAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _pDepthInputAttachmentIndexAt(long index, MemorySegment src) { _pDepthInputAttachmentIndexAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _pDepthInputAttachmentIndex(MemorySegment src) { return _pDepthInputAttachmentIndexAt(0L, src); }
    public MemorySegment _pStencilInputAttachmentIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStencilInputAttachmentIndex, index), LAYOUT_pStencilInputAttachmentIndex); }
    public MemorySegment _pStencilInputAttachmentIndex() { return _pStencilInputAttachmentIndexAt(0L); }
    public VkRenderingInputAttachmentIndexInfo _pStencilInputAttachmentIndexAt(long index, MemorySegment src) { _pStencilInputAttachmentIndexAt(index).copyFrom(src); return this; }
    public VkRenderingInputAttachmentIndexInfo _pStencilInputAttachmentIndex(MemorySegment src) { return _pStencilInputAttachmentIndexAt(0L, src); }
}
