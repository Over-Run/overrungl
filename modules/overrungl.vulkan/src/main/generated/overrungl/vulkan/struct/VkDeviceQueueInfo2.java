// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceQueueInfo2`.
/// ## Layout
/// ```
/// struct VkDeviceQueueInfo2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceQueueCreateFlags flags;
///     uint32_t queueFamilyIndex;
///     uint32_t queueIndex;
/// }
/// ```
public final class VkDeviceQueueInfo2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final long OFFSET_queueIndex = LAYOUT.byteOffset(PathElement.groupElement("queueIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_queueIndex = LAYOUT.select(PathElement.groupElement("queueIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_queueIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueIndex"));

    public VkDeviceQueueInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceQueueInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceQueueInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceQueueInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceQueueInfo2 alloc(SegmentAllocator allocator) { return new VkDeviceQueueInfo2(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceQueueInfo2 alloc(SegmentAllocator allocator, long count) { return new VkDeviceQueueInfo2(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceQueueInfo2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2); }
    public static VkDeviceQueueInfo2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2);
        return s;
    }
    public VkDeviceQueueInfo2 copyFrom(VkDeviceQueueInfo2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceQueueInfo2 reinterpret(long count) { return new VkDeviceQueueInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceQueueInfo2 asSlice(long index) { return new VkDeviceQueueInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceQueueInfo2 asSlice(long index, long count) { return new VkDeviceQueueInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceQueueInfo2 at(long index, Consumer<VkDeviceQueueInfo2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int queueIndexAt(long index) { return (int) VH_queueIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int queueIndex() { return (int) VH_queueIndex.get(this.segment(), 0L, 0L); }
    public VkDeviceQueueInfo2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueInfo2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueInfo2 flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueInfo2 queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueInfo2 queueIndexAt(long index, int value) { VH_queueIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueInfo2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueInfo2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueInfo2 flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueInfo2 queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueInfo2 queueIndex(int value) { VH_queueIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceQueueInfo2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceQueueInfo2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceQueueInfo2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceQueueInfo2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceQueueInfo2 _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceQueueInfo2 _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkDeviceQueueInfo2 _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkDeviceQueueInfo2 _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
    public MemorySegment _queueIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueIndex, index), LAYOUT_queueIndex); }
    public MemorySegment _queueIndex() { return _queueIndexAt(0L); }
    public VkDeviceQueueInfo2 _queueIndexAt(long index, MemorySegment src) { _queueIndexAt(index).copyFrom(src); return this; }
    public VkDeviceQueueInfo2 _queueIndex(MemorySegment src) { return _queueIndexAt(0L, src); }
}
