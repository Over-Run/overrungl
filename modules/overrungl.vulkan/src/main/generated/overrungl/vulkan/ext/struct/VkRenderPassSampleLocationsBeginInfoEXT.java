// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassSampleLocationsBeginInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassSampleLocationsBeginInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentInitialSampleLocationsCount;
///     const VkAttachmentSampleLocationsEXT* pAttachmentInitialSampleLocations;
///     uint32_t postSubpassSampleLocationsCount;
///     const VkSubpassSampleLocationsEXT* pPostSubpassSampleLocations;
/// }
/// ```
public final class VkRenderPassSampleLocationsBeginInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pAttachmentInitialSampleLocations"),
        ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pPostSubpassSampleLocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentInitialSampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    public static final long OFFSET_pAttachmentInitialSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    public static final long OFFSET_postSubpassSampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("postSubpassSampleLocationsCount"));
    public static final long OFFSET_pPostSubpassSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pPostSubpassSampleLocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentInitialSampleLocationsCount = LAYOUT.select(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    public static final MemoryLayout LAYOUT_pAttachmentInitialSampleLocations = LAYOUT.select(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    public static final MemoryLayout LAYOUT_postSubpassSampleLocationsCount = LAYOUT.select(PathElement.groupElement("postSubpassSampleLocationsCount"));
    public static final MemoryLayout LAYOUT_pPostSubpassSampleLocations = LAYOUT.select(PathElement.groupElement("pPostSubpassSampleLocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentInitialSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    public static final VarHandle VH_pAttachmentInitialSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    public static final VarHandle VH_postSubpassSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postSubpassSampleLocationsCount"));
    public static final VarHandle VH_pPostSubpassSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPostSubpassSampleLocations"));

    public VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassSampleLocationsBeginInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassSampleLocationsBeginInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT); }
    public static VkRenderPassSampleLocationsBeginInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
        return s;
    }
    public VkRenderPassSampleLocationsBeginInfoEXT copyFrom(VkRenderPassSampleLocationsBeginInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT reinterpret(long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassSampleLocationsBeginInfoEXT at(long index, Consumer<VkRenderPassSampleLocationsBeginInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentInitialSampleLocationsCountAt(long index) { return (int) VH_attachmentInitialSampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentInitialSampleLocationsAt(long index) { return (MemorySegment) VH_pAttachmentInitialSampleLocations.get(this.segment(), 0L, index); }
    public int postSubpassSampleLocationsCountAt(long index) { return (int) VH_postSubpassSampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment pPostSubpassSampleLocationsAt(long index) { return (MemorySegment) VH_pPostSubpassSampleLocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentInitialSampleLocationsCount() { return (int) VH_attachmentInitialSampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachmentInitialSampleLocations() { return (MemorySegment) VH_pAttachmentInitialSampleLocations.get(this.segment(), 0L, 0L); }
    public int postSubpassSampleLocationsCount() { return (int) VH_postSubpassSampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPostSubpassSampleLocations() { return (MemorySegment) VH_pPostSubpassSampleLocations.get(this.segment(), 0L, 0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCountAt(long index, int value) { VH_attachmentInitialSampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocationsAt(long index, MemorySegment value) { VH_pAttachmentInitialSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCountAt(long index, int value) { VH_postSubpassSampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocationsAt(long index, MemorySegment value) { VH_pPostSubpassSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCount(int value) { VH_attachmentInitialSampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(MemorySegment value) { VH_pAttachmentInitialSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCount(int value) { VH_postSubpassSampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(MemorySegment value) { VH_pPostSubpassSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentInitialSampleLocationsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentInitialSampleLocationsCount, index), LAYOUT_attachmentInitialSampleLocationsCount); }
    public MemorySegment _attachmentInitialSampleLocationsCount() { return _attachmentInitialSampleLocationsCountAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _attachmentInitialSampleLocationsCountAt(long index, MemorySegment src) { _attachmentInitialSampleLocationsCountAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _attachmentInitialSampleLocationsCount(MemorySegment src) { return _attachmentInitialSampleLocationsCountAt(0L, src); }
    public MemorySegment _pAttachmentInitialSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachmentInitialSampleLocations, index), LAYOUT_pAttachmentInitialSampleLocations); }
    public MemorySegment _pAttachmentInitialSampleLocations() { return _pAttachmentInitialSampleLocationsAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _pAttachmentInitialSampleLocationsAt(long index, MemorySegment src) { _pAttachmentInitialSampleLocationsAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _pAttachmentInitialSampleLocations(MemorySegment src) { return _pAttachmentInitialSampleLocationsAt(0L, src); }
    public MemorySegment _postSubpassSampleLocationsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_postSubpassSampleLocationsCount, index), LAYOUT_postSubpassSampleLocationsCount); }
    public MemorySegment _postSubpassSampleLocationsCount() { return _postSubpassSampleLocationsCountAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _postSubpassSampleLocationsCountAt(long index, MemorySegment src) { _postSubpassSampleLocationsCountAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _postSubpassSampleLocationsCount(MemorySegment src) { return _postSubpassSampleLocationsCountAt(0L, src); }
    public MemorySegment _pPostSubpassSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPostSubpassSampleLocations, index), LAYOUT_pPostSubpassSampleLocations); }
    public MemorySegment _pPostSubpassSampleLocations() { return _pPostSubpassSampleLocationsAt(0L); }
    public VkRenderPassSampleLocationsBeginInfoEXT _pPostSubpassSampleLocationsAt(long index, MemorySegment src) { _pPostSubpassSampleLocationsAt(index).copyFrom(src); return this; }
    public VkRenderPassSampleLocationsBeginInfoEXT _pPostSubpassSampleLocations(MemorySegment src) { return _pPostSubpassSampleLocationsAt(0L, src); }
}
