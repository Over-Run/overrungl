// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSysmemColorSpaceFUCHSIA`.
/// ## Layout
/// ```
/// struct VkSysmemColorSpaceFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorSpace;
/// }
/// ```
public final class VkSysmemColorSpaceFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorSpace = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorSpace = LAYOUT.select(PathElement.groupElement("colorSpace"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace"));

    public VkSysmemColorSpaceFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSysmemColorSpaceFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkSysmemColorSpaceFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSysmemColorSpaceFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSysmemColorSpaceFUCHSIA alloc(SegmentAllocator allocator) { return new VkSysmemColorSpaceFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkSysmemColorSpaceFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkSysmemColorSpaceFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkSysmemColorSpaceFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_SYSMEM_COLOR_SPACE_FUCHSIA); }
    public static VkSysmemColorSpaceFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_SYSMEM_COLOR_SPACE_FUCHSIA);
        return s;
    }
    public VkSysmemColorSpaceFUCHSIA copyFrom(VkSysmemColorSpaceFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSysmemColorSpaceFUCHSIA reinterpret(long count) { return new VkSysmemColorSpaceFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSysmemColorSpaceFUCHSIA asSlice(long index) { return new VkSysmemColorSpaceFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSysmemColorSpaceFUCHSIA asSlice(long index, long count) { return new VkSysmemColorSpaceFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSysmemColorSpaceFUCHSIA at(long index, Consumer<VkSysmemColorSpaceFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorSpaceAt(long index) { return (int) VH_colorSpace.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorSpace() { return (int) VH_colorSpace.get(this.segment(), 0L, 0L); }
    public VkSysmemColorSpaceFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSysmemColorSpaceFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSysmemColorSpaceFUCHSIA colorSpaceAt(long index, int value) { VH_colorSpace.set(this.segment(), 0L, index, value); return this; }
    public VkSysmemColorSpaceFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSysmemColorSpaceFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSysmemColorSpaceFUCHSIA colorSpace(int value) { VH_colorSpace.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSysmemColorSpaceFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSysmemColorSpaceFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSysmemColorSpaceFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSysmemColorSpaceFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorSpaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorSpace, index), LAYOUT_colorSpace); }
    public MemorySegment _colorSpace() { return _colorSpaceAt(0L); }
    public VkSysmemColorSpaceFUCHSIA _colorSpaceAt(long index, MemorySegment src) { _colorSpaceAt(index).copyFrom(src); return this; }
    public VkSysmemColorSpaceFUCHSIA _colorSpace(MemorySegment src) { return _colorSpaceAt(0L, src); }
}
