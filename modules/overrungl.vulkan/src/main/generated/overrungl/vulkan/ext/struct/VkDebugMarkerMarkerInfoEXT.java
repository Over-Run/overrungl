// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugMarkerMarkerInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugMarkerMarkerInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pMarkerName;
///     float color[4];
/// }
/// ```
public final class VkDebugMarkerMarkerInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pMarkerName = LAYOUT.byteOffset(PathElement.groupElement("pMarkerName"));
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pMarkerName = LAYOUT.select(PathElement.groupElement("pMarkerName"));
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pMarkerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMarkerName"));
    public static final VarHandle VH_color = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.sequenceElement());

    public VkDebugMarkerMarkerInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugMarkerMarkerInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugMarkerMarkerInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugMarkerMarkerInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugMarkerMarkerInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerMarkerInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugMarkerMarkerInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerMarkerInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugMarkerMarkerInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT); }
    public static VkDebugMarkerMarkerInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
        return s;
    }
    public VkDebugMarkerMarkerInfoEXT copyFrom(VkDebugMarkerMarkerInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugMarkerMarkerInfoEXT reinterpret(long count) { return new VkDebugMarkerMarkerInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugMarkerMarkerInfoEXT asSlice(long index) { return new VkDebugMarkerMarkerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugMarkerMarkerInfoEXT asSlice(long index, long count) { return new VkDebugMarkerMarkerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugMarkerMarkerInfoEXT at(long index, Consumer<VkDebugMarkerMarkerInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pMarkerNameAt(long index) { return (MemorySegment) VH_pMarkerName.get(this.segment(), 0L, index); }
    public float colorAt(long index, long index0) { return (float) VH_color.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pMarkerName() { return (MemorySegment) VH_pMarkerName.get(this.segment(), 0L, 0L); }
    public float color(long index0) { return (float) VH_color.get(this.segment(), 0L, 0L, index0); }
    public VkDebugMarkerMarkerInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerMarkerInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerMarkerInfoEXT pMarkerNameAt(long index, MemorySegment value) { VH_pMarkerName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugMarkerMarkerInfoEXT colorAt(long index, long index0, float value) { VH_color.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDebugMarkerMarkerInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerMarkerInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerMarkerInfoEXT pMarkerName(MemorySegment value) { VH_pMarkerName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugMarkerMarkerInfoEXT color(long index0, float value) { VH_color.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugMarkerMarkerInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugMarkerMarkerInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugMarkerMarkerInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugMarkerMarkerInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pMarkerNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMarkerName, index), LAYOUT_pMarkerName); }
    public MemorySegment _pMarkerName() { return _pMarkerNameAt(0L); }
    public VkDebugMarkerMarkerInfoEXT _pMarkerNameAt(long index, MemorySegment src) { _pMarkerNameAt(index).copyFrom(src); return this; }
    public VkDebugMarkerMarkerInfoEXT _pMarkerName(MemorySegment src) { return _pMarkerNameAt(0L, src); }
    public MemorySegment _colorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_color, index), LAYOUT_color); }
    public MemorySegment _color() { return _colorAt(0L); }
    public VkDebugMarkerMarkerInfoEXT _colorAt(long index, MemorySegment src) { _colorAt(index).copyFrom(src); return this; }
    public VkDebugMarkerMarkerInfoEXT _color(MemorySegment src) { return _colorAt(0L, src); }
}
