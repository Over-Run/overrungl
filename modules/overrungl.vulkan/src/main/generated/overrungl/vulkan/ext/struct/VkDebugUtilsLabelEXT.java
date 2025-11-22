// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsLabelEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsLabelEXT {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pLabelName;
///     float color[4];
/// }
/// ```
public final class VkDebugUtilsLabelEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pLabelName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pLabelName = LAYOUT.byteOffset(PathElement.groupElement("pLabelName"));
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pLabelName = LAYOUT.select(PathElement.groupElement("pLabelName"));
    public static final MemoryLayout LAYOUT_color = LAYOUT.select(PathElement.groupElement("color"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pLabelName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLabelName"));
    public static final VarHandle VH_color = LAYOUT.arrayElementVarHandle(PathElement.groupElement("color"), PathElement.sequenceElement());

    public VkDebugUtilsLabelEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDebugUtilsLabelEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDebugUtilsLabelEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDebugUtilsLabelEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsLabelEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDebugUtilsLabelEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsLabelEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDebugUtilsLabelEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsLabelEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT); }
    public static VkDebugUtilsLabelEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
        return s;
    }
    public VkDebugUtilsLabelEXT copyFrom(VkDebugUtilsLabelEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDebugUtilsLabelEXT reinterpret(long count) { return new VkDebugUtilsLabelEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDebugUtilsLabelEXT asSlice(long index) { return new VkDebugUtilsLabelEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDebugUtilsLabelEXT asSlice(long index, long count) { return new VkDebugUtilsLabelEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDebugUtilsLabelEXT at(long index, Consumer<VkDebugUtilsLabelEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pLabelNameAt(long index) { return (MemorySegment) VH_pLabelName.get(this.segment(), 0L, index); }
    public float colorAt(long index, long index0) { return (float) VH_color.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pLabelName() { return (MemorySegment) VH_pLabelName.get(this.segment(), 0L, 0L); }
    public float color(long index0) { return (float) VH_color.get(this.segment(), 0L, 0L, index0); }
    public VkDebugUtilsLabelEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsLabelEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsLabelEXT pLabelNameAt(long index, MemorySegment value) { VH_pLabelName.set(this.segment(), 0L, index, value); return this; }
    public VkDebugUtilsLabelEXT colorAt(long index, long index0, float value) { VH_color.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDebugUtilsLabelEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsLabelEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsLabelEXT pLabelName(MemorySegment value) { VH_pLabelName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDebugUtilsLabelEXT color(long index0, float value) { VH_color.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDebugUtilsLabelEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDebugUtilsLabelEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDebugUtilsLabelEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDebugUtilsLabelEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pLabelNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLabelName, index), LAYOUT_pLabelName); }
    public MemorySegment _pLabelName() { return _pLabelNameAt(0L); }
    public VkDebugUtilsLabelEXT _pLabelNameAt(long index, MemorySegment src) { _pLabelNameAt(index).copyFrom(src); return this; }
    public VkDebugUtilsLabelEXT _pLabelName(MemorySegment src) { return _pLabelNameAt(0L, src); }
    public MemorySegment _colorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_color, index), LAYOUT_color); }
    public MemorySegment _color() { return _colorAt(0L); }
    public VkDebugUtilsLabelEXT _colorAt(long index, MemorySegment src) { _colorAt(index).copyFrom(src); return this; }
    public VkDebugUtilsLabelEXT _color(MemorySegment src) { return _colorAt(0L, src); }
}
