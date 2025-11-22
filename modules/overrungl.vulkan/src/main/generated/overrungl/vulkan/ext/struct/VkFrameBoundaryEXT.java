// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFrameBoundaryEXT`.
/// ## Layout
/// ```
/// struct VkFrameBoundaryEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkFrameBoundaryFlagsEXT flags;
///     uint64_t frameID;
///     uint32_t imageCount;
///     const VkImage* pImages;
///     uint32_t bufferCount;
///     const VkBuffer* pBuffers;
///     uint64_t tagName;
///     size_t tagSize;
///     const void* pTag;
/// }
/// ```
public final class VkFrameBoundaryEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("frameID"),
        ValueLayout.JAVA_INT.withName("imageCount"),
        ValueLayout.ADDRESS.withName("pImages"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.ADDRESS.withName("pBuffers"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        CanonicalTypes.SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_frameID = LAYOUT.byteOffset(PathElement.groupElement("frameID"));
    public static final long OFFSET_imageCount = LAYOUT.byteOffset(PathElement.groupElement("imageCount"));
    public static final long OFFSET_pImages = LAYOUT.byteOffset(PathElement.groupElement("pImages"));
    public static final long OFFSET_bufferCount = LAYOUT.byteOffset(PathElement.groupElement("bufferCount"));
    public static final long OFFSET_pBuffers = LAYOUT.byteOffset(PathElement.groupElement("pBuffers"));
    public static final long OFFSET_tagName = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
    public static final long OFFSET_tagSize = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
    public static final long OFFSET_pTag = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_frameID = LAYOUT.select(PathElement.groupElement("frameID"));
    public static final MemoryLayout LAYOUT_imageCount = LAYOUT.select(PathElement.groupElement("imageCount"));
    public static final MemoryLayout LAYOUT_pImages = LAYOUT.select(PathElement.groupElement("pImages"));
    public static final MemoryLayout LAYOUT_bufferCount = LAYOUT.select(PathElement.groupElement("bufferCount"));
    public static final MemoryLayout LAYOUT_pBuffers = LAYOUT.select(PathElement.groupElement("pBuffers"));
    public static final MemoryLayout LAYOUT_tagName = LAYOUT.select(PathElement.groupElement("tagName"));
    public static final MemoryLayout LAYOUT_tagSize = LAYOUT.select(PathElement.groupElement("tagSize"));
    public static final MemoryLayout LAYOUT_pTag = LAYOUT.select(PathElement.groupElement("pTag"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_frameID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameID"));
    public static final VarHandle VH_imageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCount"));
    public static final VarHandle VH_pImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImages"));
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    public static final VarHandle VH_pBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBuffers"));
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    public VkFrameBoundaryEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFrameBoundaryEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkFrameBoundaryEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFrameBoundaryEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFrameBoundaryEXT alloc(SegmentAllocator allocator) { return new VkFrameBoundaryEXT(allocator.allocate(LAYOUT), 1); }
    public static VkFrameBoundaryEXT alloc(SegmentAllocator allocator, long count) { return new VkFrameBoundaryEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkFrameBoundaryEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT); }
    public static VkFrameBoundaryEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT);
        return s;
    }
    public VkFrameBoundaryEXT copyFrom(VkFrameBoundaryEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFrameBoundaryEXT reinterpret(long count) { return new VkFrameBoundaryEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFrameBoundaryEXT asSlice(long index) { return new VkFrameBoundaryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFrameBoundaryEXT asSlice(long index, long count) { return new VkFrameBoundaryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFrameBoundaryEXT at(long index, Consumer<VkFrameBoundaryEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long frameIDAt(long index) { return (long) VH_frameID.get(this.segment(), 0L, index); }
    public int imageCountAt(long index) { return (int) VH_imageCount.get(this.segment(), 0L, index); }
    public MemorySegment pImagesAt(long index) { return (MemorySegment) VH_pImages.get(this.segment(), 0L, index); }
    public int bufferCountAt(long index) { return (int) VH_bufferCount.get(this.segment(), 0L, index); }
    public MemorySegment pBuffersAt(long index) { return (MemorySegment) VH_pBuffers.get(this.segment(), 0L, index); }
    public long tagNameAt(long index) { return (long) VH_tagName.get(this.segment(), 0L, index); }
    public long tagSizeAt(long index) { return (long) VH_tagSize.get(this.segment(), 0L, index); }
    public MemorySegment pTagAt(long index) { return (MemorySegment) VH_pTag.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long frameID() { return (long) VH_frameID.get(this.segment(), 0L, 0L); }
    public int imageCount() { return (int) VH_imageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pImages() { return (MemorySegment) VH_pImages.get(this.segment(), 0L, 0L); }
    public int bufferCount() { return (int) VH_bufferCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBuffers() { return (MemorySegment) VH_pBuffers.get(this.segment(), 0L, 0L); }
    public long tagName() { return (long) VH_tagName.get(this.segment(), 0L, 0L); }
    public long tagSize() { return (long) VH_tagSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pTag() { return (MemorySegment) VH_pTag.get(this.segment(), 0L, 0L); }
    public VkFrameBoundaryEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT frameIDAt(long index, long value) { VH_frameID.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT imageCountAt(long index, int value) { VH_imageCount.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT pImagesAt(long index, MemorySegment value) { VH_pImages.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT bufferCountAt(long index, int value) { VH_bufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT pBuffersAt(long index, MemorySegment value) { VH_pBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT tagNameAt(long index, long value) { VH_tagName.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT tagSizeAt(long index, long value) { VH_tagSize.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT pTagAt(long index, MemorySegment value) { VH_pTag.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT frameID(long value) { VH_frameID.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT imageCount(int value) { VH_imageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT pImages(MemorySegment value) { VH_pImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT bufferCount(int value) { VH_bufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT pBuffers(MemorySegment value) { VH_pBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT tagName(long value) { VH_tagName.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT tagSize(long value) { VH_tagSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryEXT pTag(MemorySegment value) { VH_pTag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFrameBoundaryEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFrameBoundaryEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkFrameBoundaryEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _frameIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameID, index), LAYOUT_frameID); }
    public MemorySegment _frameID() { return _frameIDAt(0L); }
    public VkFrameBoundaryEXT _frameIDAt(long index, MemorySegment src) { _frameIDAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _frameID(MemorySegment src) { return _frameIDAt(0L, src); }
    public MemorySegment _imageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCount, index), LAYOUT_imageCount); }
    public MemorySegment _imageCount() { return _imageCountAt(0L); }
    public VkFrameBoundaryEXT _imageCountAt(long index, MemorySegment src) { _imageCountAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _imageCount(MemorySegment src) { return _imageCountAt(0L, src); }
    public MemorySegment _pImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImages, index), LAYOUT_pImages); }
    public MemorySegment _pImages() { return _pImagesAt(0L); }
    public VkFrameBoundaryEXT _pImagesAt(long index, MemorySegment src) { _pImagesAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _pImages(MemorySegment src) { return _pImagesAt(0L, src); }
    public MemorySegment _bufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferCount, index), LAYOUT_bufferCount); }
    public MemorySegment _bufferCount() { return _bufferCountAt(0L); }
    public VkFrameBoundaryEXT _bufferCountAt(long index, MemorySegment src) { _bufferCountAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _bufferCount(MemorySegment src) { return _bufferCountAt(0L, src); }
    public MemorySegment _pBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBuffers, index), LAYOUT_pBuffers); }
    public MemorySegment _pBuffers() { return _pBuffersAt(0L); }
    public VkFrameBoundaryEXT _pBuffersAt(long index, MemorySegment src) { _pBuffersAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _pBuffers(MemorySegment src) { return _pBuffersAt(0L, src); }
    public MemorySegment _tagNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tagName, index), LAYOUT_tagName); }
    public MemorySegment _tagName() { return _tagNameAt(0L); }
    public VkFrameBoundaryEXT _tagNameAt(long index, MemorySegment src) { _tagNameAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _tagName(MemorySegment src) { return _tagNameAt(0L, src); }
    public MemorySegment _tagSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tagSize, index), LAYOUT_tagSize); }
    public MemorySegment _tagSize() { return _tagSizeAt(0L); }
    public VkFrameBoundaryEXT _tagSizeAt(long index, MemorySegment src) { _tagSizeAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _tagSize(MemorySegment src) { return _tagSizeAt(0L, src); }
    public MemorySegment _pTagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTag, index), LAYOUT_pTag); }
    public MemorySegment _pTag() { return _pTagAt(0L); }
    public VkFrameBoundaryEXT _pTagAt(long index, MemorySegment src) { _pTagAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryEXT _pTag(MemorySegment src) { return _pTagAt(0L, src); }
}
