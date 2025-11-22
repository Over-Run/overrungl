// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultisamplePropertiesEXT`.
/// ## Layout
/// ```
/// struct VkMultisamplePropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D maxSampleLocationGridSize;
/// }
/// ```
public final class VkMultisamplePropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxSampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxSampleLocationGridSize = LAYOUT.select(PathElement.groupElement("maxSampleLocationGridSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxSampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxSampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleLocationGridSize"), PathElement.groupElement("height"));

    public VkMultisamplePropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultisamplePropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultisamplePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultisamplePropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultisamplePropertiesEXT alloc(SegmentAllocator allocator) { return new VkMultisamplePropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMultisamplePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkMultisamplePropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMultisamplePropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT); }
    public static VkMultisamplePropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT);
        return s;
    }
    public VkMultisamplePropertiesEXT copyFrom(VkMultisamplePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultisamplePropertiesEXT reinterpret(long count) { return new VkMultisamplePropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultisamplePropertiesEXT asSlice(long index) { return new VkMultisamplePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultisamplePropertiesEXT asSlice(long index, long count) { return new VkMultisamplePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultisamplePropertiesEXT at(long index, Consumer<VkMultisamplePropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxSampleLocationGridSize$widthAt(long index) { return (int) VH_maxSampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int maxSampleLocationGridSize$heightAt(long index) { return (int) VH_maxSampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxSampleLocationGridSize$width() { return (int) VH_maxSampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int maxSampleLocationGridSize$height() { return (int) VH_maxSampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public VkMultisamplePropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMultisamplePropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize$widthAt(long index, int value) { VH_maxSampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize$heightAt(long index, int value) { VH_maxSampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkMultisamplePropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisamplePropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize$width(int value) { VH_maxSampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize$height(int value) { VH_maxSampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMultisamplePropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMultisamplePropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMultisamplePropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMultisamplePropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxSampleLocationGridSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), LAYOUT_maxSampleLocationGridSize); }
    public MemorySegment _maxSampleLocationGridSize() { return _maxSampleLocationGridSizeAt(0L); }
    public VkMultisamplePropertiesEXT _maxSampleLocationGridSizeAt(long index, MemorySegment src) { _maxSampleLocationGridSizeAt(index).copyFrom(src); return this; }
    public VkMultisamplePropertiesEXT _maxSampleLocationGridSize(MemorySegment src) { return _maxSampleLocationGridSizeAt(0L, src); }
}
