// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugMarkerObjectNameInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugMarkerObjectNameInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     const char* pObjectName;
/// }
/// ```
public final class VkDebugMarkerObjectNameInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withName("pObjectName")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    public static final long OFFSET_object = LAYOUT.byteOffset(PathElement.groupElement("object"));
    public static final long OFFSET_pObjectName = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    public static final MemoryLayout LAYOUT_object = LAYOUT.select(PathElement.groupElement("object"));
    public static final MemoryLayout LAYOUT_pObjectName = LAYOUT.select(PathElement.groupElement("pObjectName"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugMarkerObjectNameInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugMarkerObjectNameInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT); }
    public static VkDebugMarkerObjectNameInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
        return s;
    }
    public VkDebugMarkerObjectNameInfoEXT copyFrom(VkDebugMarkerObjectNameInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugMarkerObjectNameInfoEXT reinterpret(long count) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index, long count) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugMarkerObjectNameInfoEXT at(long index, Consumer<VkDebugMarkerObjectNameInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int objectTypeAt(long index) { return (int) VH_objectType.get(this.segment(), 0L, index); }
    public long objectAt(long index) { return (long) VH_object.get(this.segment(), 0L, index); }
    public MemorySegment pObjectNameAt(long index) { return (MemorySegment) VH_pObjectName.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int objectType() { return (int) VH_objectType.get(this.segment(), 0L, 0L); }
    public long object() { return (long) VH_object.get(this.segment(), 0L, 0L); }
    public MemorySegment pObjectName() { return (MemorySegment) VH_pObjectName.get(this.segment(), 0L, 0L); }
    public VkDebugMarkerObjectNameInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT objectTypeAt(long index, int value) { VH_objectType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT objectAt(long index, long value) { VH_object.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT pObjectNameAt(long index, MemorySegment value) { VH_pObjectName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT objectType(int value) { VH_objectType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT object(long value) { VH_object.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerObjectNameInfoEXT pObjectName(MemorySegment value) { VH_pObjectName.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugMarkerObjectNameInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectNameInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugMarkerObjectNameInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectNameInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _objectTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectType, index), LAYOUT_objectType); }
    public MemorySegment _objectType() { return _objectTypeAt(0L); }
    public VkDebugMarkerObjectNameInfoEXT _objectTypeAt(long index, MemorySegment src) { _objectTypeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectNameInfoEXT _objectType(MemorySegment src) { return _objectTypeAt(0L, src); }
    public MemorySegment _objectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_object, index), LAYOUT_object); }
    public MemorySegment _object() { return _objectAt(0L); }
    public VkDebugMarkerObjectNameInfoEXT _objectAt(long index, MemorySegment src) { _objectAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectNameInfoEXT _object(MemorySegment src) { return _objectAt(0L, src); }
    public MemorySegment _pObjectNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pObjectName, index), LAYOUT_pObjectName); }
    public MemorySegment _pObjectName() { return _pObjectNameAt(0L); }
    public VkDebugMarkerObjectNameInfoEXT _pObjectNameAt(long index, MemorySegment src) { _pObjectNameAt(index).copyFrom(src); return this; }
    public VkDebugMarkerObjectNameInfoEXT _pObjectName(MemorySegment src) { return _pObjectNameAt(0L, src); }
}
