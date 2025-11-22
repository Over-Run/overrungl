// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferBeginInfo`.
/// ## Layout
/// ```
/// struct VkCommandBufferBeginInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandBufferUsageFlags flags;
///     const VkCommandBufferInheritanceInfo* pInheritanceInfo;
/// }
/// ```
public final class VkCommandBufferBeginInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pInheritanceInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pInheritanceInfo = LAYOUT.byteOffset(PathElement.groupElement("pInheritanceInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pInheritanceInfo = LAYOUT.select(PathElement.groupElement("pInheritanceInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pInheritanceInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInheritanceInfo"));

    public VkCommandBufferBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferBeginInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferBeginInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferBeginInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferBeginInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO); }
    public static VkCommandBufferBeginInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
        return s;
    }
    public VkCommandBufferBeginInfo copyFrom(VkCommandBufferBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferBeginInfo reinterpret(long count) { return new VkCommandBufferBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferBeginInfo asSlice(long index) { return new VkCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferBeginInfo asSlice(long index, long count) { return new VkCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferBeginInfo at(long index, Consumer<VkCommandBufferBeginInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pInheritanceInfoAt(long index) { return (MemorySegment) VH_pInheritanceInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pInheritanceInfo() { return (MemorySegment) VH_pInheritanceInfo.get(this.segment(), 0L, 0L); }
    public VkCommandBufferBeginInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferBeginInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferBeginInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferBeginInfo pInheritanceInfoAt(long index, MemorySegment value) { VH_pInheritanceInfo.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferBeginInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferBeginInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferBeginInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferBeginInfo pInheritanceInfo(MemorySegment value) { VH_pInheritanceInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferBeginInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferBeginInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferBeginInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferBeginInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkCommandBufferBeginInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkCommandBufferBeginInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pInheritanceInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInheritanceInfo, index), LAYOUT_pInheritanceInfo); }
    public MemorySegment _pInheritanceInfo() { return _pInheritanceInfoAt(0L); }
    public VkCommandBufferBeginInfo _pInheritanceInfoAt(long index, MemorySegment src) { _pInheritanceInfoAt(index).copyFrom(src); return this; }
    public VkCommandBufferBeginInfo _pInheritanceInfo(MemorySegment src) { return _pInheritanceInfoAt(0L, src); }
}
