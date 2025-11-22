// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugMarkerObjectTagInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugMarkerObjectTagInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     uint64_t tagName;
///     size_t tagSize;
///     const void* pTag;
/// }
/// ```
public final class VkDebugMarkerObjectTagInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        CanonicalTypes.SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    public static final long OFFSET_object = LAYOUT.byteOffset(PathElement.groupElement("object"));
    public static final long OFFSET_tagName = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
    public static final long OFFSET_tagSize = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
    public static final long OFFSET_pTag = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    public static final MemoryLayout LAYOUT_object = LAYOUT.select(PathElement.groupElement("object"));
    public static final MemoryLayout LAYOUT_tagName = LAYOUT.select(PathElement.groupElement("tagName"));
    public static final MemoryLayout LAYOUT_tagSize = LAYOUT.select(PathElement.groupElement("tagSize"));
    public static final MemoryLayout LAYOUT_pTag = LAYOUT.select(PathElement.groupElement("pTag"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    public VkDebugMarkerObjectTagInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugMarkerObjectTagInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugMarkerObjectTagInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugMarkerObjectTagInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugMarkerObjectTagInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectTagInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugMarkerObjectTagInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerObjectTagInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugMarkerObjectTagInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT); }
    public static VkDebugMarkerObjectTagInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT);
        return s;
    }
    public VkDebugMarkerObjectTagInfoEXT copyFrom(VkDebugMarkerObjectTagInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugMarkerObjectTagInfoEXT reinterpret(long count) { return new VkDebugMarkerObjectTagInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugMarkerObjectTagInfoEXT asSlice(long index) { return new VkDebugMarkerObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugMarkerObjectTagInfoEXT asSlice(long index, long count) { return new VkDebugMarkerObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugMarkerObjectTagInfoEXT at(long index, Consumer<VkDebugMarkerObjectTagInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int objectTypeAt(long index) { return (int) VH_objectType.get(this.segment(), 0L, index); }
    public long objectAt(long index) { return (long) VH_object.get(this.segment(), 0L, index); }
    public long tagNameAt(long index) { return (long) VH_tagName.get(this.segment(), 0L, index); }
    public long tagSizeAt(long index) { return (long) VH_tagSize.get(this.segment(), 0L, index); }
    public MemorySegment pTagAt(long index) { return (MemorySegment) VH_pTag.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int objectType() { return (int) VH_objectType.get(this.segment(), 0L, 0L); }
    public long object() { return (long) VH_object.get(this.segment(), 0L, 0L); }
    public long tagName() { return (long) VH_tagName.get(this.segment(), 0L, 0L); }
    public long tagSize() { return (long) VH_tagSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pTag() { return (MemorySegment) VH_pTag.get(this.segment(), 0L, 0L); }
    public VkDebugMarkerObjectTagInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT objectTypeAt(long index, int value) { VH_objectType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT objectAt(long index, long value) { VH_object.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT tagNameAt(long index, long value) { VH_tagName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT tagSizeAt(long index, long value) { VH_tagSize.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT pTagAt(long index, MemorySegment value) { VH_pTag.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT objectType(int value) { VH_objectType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT object(long value) { VH_object.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT tagName(long value) { VH_tagName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT tagSize(long value) { VH_tagSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectTagInfoEXT pTag(MemorySegment value) { VH_pTag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _objectTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectType, index), LAYOUT_objectType); }
    public MemorySegment _objectType() { return _objectTypeAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _objectTypeAt(long index, MemorySegment src) { _objectTypeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _objectType(MemorySegment src) { return _objectTypeAt(0L, src); }
    public MemorySegment _objectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_object, index), LAYOUT_object); }
    public MemorySegment _object() { return _objectAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _objectAt(long index, MemorySegment src) { _objectAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _object(MemorySegment src) { return _objectAt(0L, src); }
    public MemorySegment _tagNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tagName, index), LAYOUT_tagName); }
    public MemorySegment _tagName() { return _tagNameAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _tagNameAt(long index, MemorySegment src) { _tagNameAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _tagName(MemorySegment src) { return _tagNameAt(0L, src); }
    public MemorySegment _tagSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tagSize, index), LAYOUT_tagSize); }
    public MemorySegment _tagSize() { return _tagSizeAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _tagSizeAt(long index, MemorySegment src) { _tagSizeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _tagSize(MemorySegment src) { return _tagSizeAt(0L, src); }
    public MemorySegment _pTagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTag, index), LAYOUT_pTag); }
    public MemorySegment _pTag() { return _pTagAt(0L); }
    public VkDebugMarkerObjectTagInfoEXT _pTagAt(long index, MemorySegment src) { _pTagAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectTagInfoEXT _pTag(MemorySegment src) { return _pTagAt(0L, src); }
}
