// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageCompressionPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkImageCompressionPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkImageCompressionFlagsEXT imageCompressionFlags;
///     VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags;
/// }
/// ```
public final class VkImageCompressionPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionFlags"),
        ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageCompressionFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFlags"));
    public static final long OFFSET_imageCompressionFixedRateFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFixedRateFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageCompressionFlags = LAYOUT.select(PathElement.groupElement("imageCompressionFlags"));
    public static final MemoryLayout LAYOUT_imageCompressionFixedRateFlags = LAYOUT.select(PathElement.groupElement("imageCompressionFixedRateFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageCompressionFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFlags"));
    public static final VarHandle VH_imageCompressionFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFixedRateFlags"));

    public VkImageCompressionPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageCompressionPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageCompressionPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageCompressionPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageCompressionPropertiesEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageCompressionPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkImageCompressionPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageCompressionPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT); }
    public static VkImageCompressionPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT);
        return s;
    }
    public VkImageCompressionPropertiesEXT copyFrom(VkImageCompressionPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageCompressionPropertiesEXT reinterpret(long count) { return new VkImageCompressionPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageCompressionPropertiesEXT asSlice(long index) { return new VkImageCompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageCompressionPropertiesEXT asSlice(long index, long count) { return new VkImageCompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageCompressionPropertiesEXT at(long index, Consumer<VkImageCompressionPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageCompressionFlagsAt(long index) { return (int) VH_imageCompressionFlags.get(this.segment(), 0L, index); }
    public int imageCompressionFixedRateFlagsAt(long index) { return (int) VH_imageCompressionFixedRateFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageCompressionFlags() { return (int) VH_imageCompressionFlags.get(this.segment(), 0L, 0L); }
    public int imageCompressionFixedRateFlags() { return (int) VH_imageCompressionFixedRateFlags.get(this.segment(), 0L, 0L); }
    public VkImageCompressionPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionPropertiesEXT imageCompressionFlagsAt(long index, int value) { VH_imageCompressionFlags.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionPropertiesEXT imageCompressionFixedRateFlagsAt(long index, int value) { VH_imageCompressionFixedRateFlags.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionPropertiesEXT imageCompressionFlags(int value) { VH_imageCompressionFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionPropertiesEXT imageCompressionFixedRateFlags(int value) { VH_imageCompressionFixedRateFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageCompressionPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageCompressionPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageCompressionPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageCompressionPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageCompressionFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCompressionFlags, index), LAYOUT_imageCompressionFlags); }
    public MemorySegment _imageCompressionFlags() { return _imageCompressionFlagsAt(0L); }
    public VkImageCompressionPropertiesEXT _imageCompressionFlagsAt(long index, MemorySegment src) { _imageCompressionFlagsAt(index).copyFrom(src); return this; }
    public VkImageCompressionPropertiesEXT _imageCompressionFlags(MemorySegment src) { return _imageCompressionFlagsAt(0L, src); }
    public MemorySegment _imageCompressionFixedRateFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCompressionFixedRateFlags, index), LAYOUT_imageCompressionFixedRateFlags); }
    public MemorySegment _imageCompressionFixedRateFlags() { return _imageCompressionFixedRateFlagsAt(0L); }
    public VkImageCompressionPropertiesEXT _imageCompressionFixedRateFlagsAt(long index, MemorySegment src) { _imageCompressionFixedRateFlagsAt(index).copyFrom(src); return this; }
    public VkImageCompressionPropertiesEXT _imageCompressionFixedRateFlags(MemorySegment src) { return _imageCompressionFixedRateFlagsAt(0L, src); }
}
