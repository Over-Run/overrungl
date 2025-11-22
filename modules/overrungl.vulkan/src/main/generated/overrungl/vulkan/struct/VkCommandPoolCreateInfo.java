// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandPoolCreateInfo`.
/// ## Layout
/// ```
/// struct VkCommandPoolCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandPoolCreateFlags flags;
///     uint32_t queueFamilyIndex;
/// }
/// ```
public final class VkCommandPoolCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));

    public VkCommandPoolCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandPoolCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandPoolCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkCommandPoolCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCommandPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandPoolCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandPoolCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO); }
    public static VkCommandPoolCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO);
        return s;
    }
    public VkCommandPoolCreateInfo copyFrom(VkCommandPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandPoolCreateInfo reinterpret(long count) { return new VkCommandPoolCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandPoolCreateInfo asSlice(long index) { return new VkCommandPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandPoolCreateInfo asSlice(long index, long count) { return new VkCommandPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandPoolCreateInfo at(long index, Consumer<VkCommandPoolCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public VkCommandPoolCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandPoolCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandPoolCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkCommandPoolCreateInfo queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkCommandPoolCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandPoolCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandPoolCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandPoolCreateInfo queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandPoolCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandPoolCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandPoolCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandPoolCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkCommandPoolCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkCommandPoolCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkCommandPoolCreateInfo _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkCommandPoolCreateInfo _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
}
