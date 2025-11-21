// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFilterCubicImageViewImageFormatPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkFilterCubicImageViewImageFormatPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 filterCubic;
///     VkBool32 filterCubicMinmax;
/// }
/// ```
public final class VkFilterCubicImageViewImageFormatPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterCubic"),
        ValueLayout.JAVA_INT.withName("filterCubicMinmax")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_filterCubic = LAYOUT.byteOffset(PathElement.groupElement("filterCubic"));
    public static final long OFFSET_filterCubicMinmax = LAYOUT.byteOffset(PathElement.groupElement("filterCubicMinmax"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_filterCubic = LAYOUT.select(PathElement.groupElement("filterCubic"));
    public static final MemoryLayout LAYOUT_filterCubicMinmax = LAYOUT.select(PathElement.groupElement("filterCubicMinmax"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_filterCubic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubic"));
    public static final VarHandle VH_filterCubicMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubicMinmax"));

    public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT alloc(SegmentAllocator allocator) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT); }
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT);
        return s;
    }
    public VkFilterCubicImageViewImageFormatPropertiesEXT copyFrom(VkFilterCubicImageViewImageFormatPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT reinterpret(long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT asSlice(long index) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT asSlice(long index, long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT at(long index, Consumer<VkFilterCubicImageViewImageFormatPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int filterCubicAt(long index) { return (int) VH_filterCubic.get(this.segment(), 0L, index); }
    public int filterCubicMinmaxAt(long index) { return (int) VH_filterCubicMinmax.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int filterCubic() { return (int) VH_filterCubic.get(this.segment(), 0L, 0L); }
    public int filterCubicMinmax() { return (int) VH_filterCubicMinmax.get(this.segment(), 0L, 0L); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicAt(long index, int value) { VH_filterCubic.set(this.segment(), 0L, index, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmaxAt(long index, int value) { VH_filterCubicMinmax.set(this.segment(), 0L, index, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubic(int value) { VH_filterCubic.set(this.segment(), 0L, 0L, value); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmax(int value) { VH_filterCubicMinmax.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _filterCubicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterCubic, index), LAYOUT_filterCubic); }
    public MemorySegment _filterCubic() { return _filterCubicAt(0L); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _filterCubicAt(long index, MemorySegment src) { _filterCubicAt(index).copyFrom(src); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _filterCubic(MemorySegment src) { return _filterCubicAt(0L, src); }
    public MemorySegment _filterCubicMinmaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterCubicMinmax, index), LAYOUT_filterCubicMinmax); }
    public MemorySegment _filterCubicMinmax() { return _filterCubicMinmaxAt(0L); }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _filterCubicMinmaxAt(long index, MemorySegment src) { _filterCubicMinmaxAt(index).copyFrom(src); return this; }
    public VkFilterCubicImageViewImageFormatPropertiesEXT _filterCubicMinmax(MemorySegment src) { return _filterCubicMinmaxAt(0L, src); }
}
