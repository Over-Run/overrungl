// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewMinLodCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageViewMinLodCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     float minLod;
/// }
/// ```
public final class VkImageViewMinLodCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("minLod")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minLod = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minLod = LAYOUT.select(PathElement.groupElement("minLod"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLod"));

    public VkImageViewMinLodCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewMinLodCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewMinLodCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewMinLodCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewMinLodCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewMinLodCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewMinLodCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewMinLodCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewMinLodCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewMinLodCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewMinLodCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewMinLodCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT); }
    public static VkImageViewMinLodCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT);
        return s;
    }
    public VkImageViewMinLodCreateInfoEXT copyFrom(VkImageViewMinLodCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewMinLodCreateInfoEXT reinterpret(long count) { return new VkImageViewMinLodCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewMinLodCreateInfoEXT asSlice(long index) { return new VkImageViewMinLodCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewMinLodCreateInfoEXT asSlice(long index, long count) { return new VkImageViewMinLodCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewMinLodCreateInfoEXT at(long index, Consumer<VkImageViewMinLodCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public float minLodAt(long index) { return (float) VH_minLod.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public float minLod() { return (float) VH_minLod.get(this.segment(), 0L, 0L); }
    public VkImageViewMinLodCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewMinLodCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewMinLodCreateInfoEXT minLodAt(long index, float value) { VH_minLod.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewMinLodCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewMinLodCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewMinLodCreateInfoEXT minLod(float value) { VH_minLod.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewMinLodCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewMinLodCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewMinLodCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewMinLodCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minLod, index), LAYOUT_minLod); }
    public MemorySegment _minLod() { return _minLodAt(0L); }
    public VkImageViewMinLodCreateInfoEXT _minLodAt(long index, MemorySegment src) { _minLodAt(index).copyFrom(src); return this; }
    public VkImageViewMinLodCreateInfoEXT _minLod(MemorySegment src) { return _minLodAt(0L, src); }
}
