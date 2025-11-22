// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionMemoryRequirementsKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionMemoryRequirementsKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t memoryBindIndex;
///     VkMemoryRequirements memoryRequirements;
/// }
/// ```
public final class VkVideoSessionMemoryRequirementsKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryBindIndex"),
        overrungl.vulkan.struct.VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryBindIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryBindIndex"));
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryBindIndex = LAYOUT.select(PathElement.groupElement("memoryBindIndex"));
    public static final MemoryLayout LAYOUT_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryBindIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBindIndex"));
    public static final VarHandle VH_memoryRequirements$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("size"));
    public static final VarHandle VH_memoryRequirements$alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("alignment"));
    public static final VarHandle VH_memoryRequirements$memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("memoryTypeBits"));

    public VkVideoSessionMemoryRequirementsKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoSessionMemoryRequirementsKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoSessionMemoryRequirementsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoSessionMemoryRequirementsKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoSessionMemoryRequirementsKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionMemoryRequirementsKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoSessionMemoryRequirementsKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionMemoryRequirementsKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoSessionMemoryRequirementsKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR); }
    public static VkVideoSessionMemoryRequirementsKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR);
        return s;
    }
    public VkVideoSessionMemoryRequirementsKHR copyFrom(VkVideoSessionMemoryRequirementsKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoSessionMemoryRequirementsKHR reinterpret(long count) { return new VkVideoSessionMemoryRequirementsKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoSessionMemoryRequirementsKHR asSlice(long index) { return new VkVideoSessionMemoryRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoSessionMemoryRequirementsKHR asSlice(long index, long count) { return new VkVideoSessionMemoryRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoSessionMemoryRequirementsKHR at(long index, Consumer<VkVideoSessionMemoryRequirementsKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryBindIndexAt(long index) { return (int) VH_memoryBindIndex.get(this.segment(), 0L, index); }
    public long memoryRequirements$sizeAt(long index) { return (long) VH_memoryRequirements$size.get(this.segment(), 0L, index); }
    public long memoryRequirements$alignmentAt(long index) { return (long) VH_memoryRequirements$alignment.get(this.segment(), 0L, index); }
    public int memoryRequirements$memoryTypeBitsAt(long index) { return (int) VH_memoryRequirements$memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryBindIndex() { return (int) VH_memoryBindIndex.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$size() { return (long) VH_memoryRequirements$size.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$alignment() { return (long) VH_memoryRequirements$alignment.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$memoryTypeBits() { return (int) VH_memoryRequirements$memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkVideoSessionMemoryRequirementsKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndexAt(long index, int value) { VH_memoryBindIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$sizeAt(long index, long value) { VH_memoryRequirements$size.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$alignmentAt(long index, long value) { VH_memoryRequirements$alignment.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$memoryTypeBitsAt(long index, int value) { VH_memoryRequirements$memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndex(int value) { VH_memoryBindIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$size(long value) { VH_memoryRequirements$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$alignment(long value) { VH_memoryRequirements$alignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements$memoryTypeBits(int value) { VH_memoryRequirements$memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoSessionMemoryRequirementsKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoSessionMemoryRequirementsKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoSessionMemoryRequirementsKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoSessionMemoryRequirementsKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryBindIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryBindIndex, index), LAYOUT_memoryBindIndex); }
    public MemorySegment _memoryBindIndex() { return _memoryBindIndexAt(0L); }
    public VkVideoSessionMemoryRequirementsKHR _memoryBindIndexAt(long index, MemorySegment src) { _memoryBindIndexAt(index).copyFrom(src); return this; }
    public VkVideoSessionMemoryRequirementsKHR _memoryBindIndex(MemorySegment src) { return _memoryBindIndexAt(0L, src); }
    public MemorySegment _memoryRequirementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements); }
    public MemorySegment _memoryRequirements() { return _memoryRequirementsAt(0L); }
    public VkVideoSessionMemoryRequirementsKHR _memoryRequirementsAt(long index, MemorySegment src) { _memoryRequirementsAt(index).copyFrom(src); return this; }
    public VkVideoSessionMemoryRequirementsKHR _memoryRequirements(MemorySegment src) { return _memoryRequirementsAt(0L, src); }
}
