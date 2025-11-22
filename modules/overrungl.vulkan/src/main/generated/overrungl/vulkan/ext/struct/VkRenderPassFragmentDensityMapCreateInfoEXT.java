// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassFragmentDensityMapCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassFragmentDensityMapCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkAttachmentReference fragmentDensityMapAttachment;
/// }
/// ```
public final class VkRenderPassFragmentDensityMapCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMapAttachment = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapAttachment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapAttachment = LAYOUT.select(PathElement.groupElement("fragmentDensityMapAttachment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMapAttachment$attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapAttachment"), PathElement.groupElement("attachment"));
    public static final VarHandle VH_fragmentDensityMapAttachment$layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapAttachment"), PathElement.groupElement("layout"));

    public VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT); }
    public static VkRenderPassFragmentDensityMapCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
        return s;
    }
    public VkRenderPassFragmentDensityMapCreateInfoEXT copyFrom(VkRenderPassFragmentDensityMapCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT reinterpret(long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT asSlice(long index) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT asSlice(long index, long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT at(long index, Consumer<VkRenderPassFragmentDensityMapCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapAttachment$attachmentAt(long index) { return (int) VH_fragmentDensityMapAttachment$attachment.get(this.segment(), 0L, index); }
    public int fragmentDensityMapAttachment$layoutAt(long index) { return (int) VH_fragmentDensityMapAttachment$layout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapAttachment$attachment() { return (int) VH_fragmentDensityMapAttachment$attachment.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapAttachment$layout() { return (int) VH_fragmentDensityMapAttachment$layout.get(this.segment(), 0L, 0L); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment$attachmentAt(long index, int value) { VH_fragmentDensityMapAttachment$attachment.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment$layoutAt(long index, int value) { VH_fragmentDensityMapAttachment$layout.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment$attachment(int value) { VH_fragmentDensityMapAttachment$attachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment$layout(int value) { VH_fragmentDensityMapAttachment$layout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapAttachment, index), LAYOUT_fragmentDensityMapAttachment); }
    public MemorySegment _fragmentDensityMapAttachment() { return _fragmentDensityMapAttachmentAt(0L); }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _fragmentDensityMapAttachmentAt(long index, MemorySegment src) { _fragmentDensityMapAttachmentAt(index).copyFrom(src); return this; }
    public VkRenderPassFragmentDensityMapCreateInfoEXT _fragmentDensityMapAttachment(MemorySegment src) { return _fragmentDensityMapAttachmentAt(0L, src); }
}
