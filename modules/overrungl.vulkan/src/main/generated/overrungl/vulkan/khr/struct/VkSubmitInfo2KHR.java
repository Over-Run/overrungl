// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubmitInfo2KHR`.
/// ## Layout
/// ```
/// struct VkSubmitInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSubmitFlags flags;
///     uint32_t waitSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount;
///     const VkCommandBufferSubmitInfo* pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pSignalSemaphoreInfos;
/// }
/// ```
public final class VkSubmitInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreInfos")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_waitSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreInfoCount"));
    public static final long OFFSET_pWaitSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreInfos"));
    public static final long OFFSET_commandBufferInfoCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInfoCount"));
    public static final long OFFSET_pCommandBufferInfos = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferInfos"));
    public static final long OFFSET_signalSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreInfoCount"));
    public static final long OFFSET_pSignalSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreInfos"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_waitSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreInfoCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreInfos"));
    public static final MemoryLayout LAYOUT_commandBufferInfoCount = LAYOUT.select(PathElement.groupElement("commandBufferInfoCount"));
    public static final MemoryLayout LAYOUT_pCommandBufferInfos = LAYOUT.select(PathElement.groupElement("pCommandBufferInfos"));
    public static final MemoryLayout LAYOUT_signalSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreInfoCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreInfos"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_waitSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreInfoCount"));
    public static final VarHandle VH_pWaitSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreInfos"));
    public static final VarHandle VH_commandBufferInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferInfoCount"));
    public static final VarHandle VH_pCommandBufferInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferInfos"));
    public static final VarHandle VH_signalSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreInfoCount"));
    public static final VarHandle VH_pSignalSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreInfos"));

    public VkSubmitInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubmitInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubmitInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubmitInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubmitInfo2KHR alloc(SegmentAllocator allocator) { return new VkSubmitInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSubmitInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkSubmitInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2);
        return s;
    }
    public VkSubmitInfo2KHR copyFrom(VkSubmitInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubmitInfo2KHR reinterpret(long count) { return new VkSubmitInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubmitInfo2KHR asSlice(long index) { return new VkSubmitInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubmitInfo2KHR asSlice(long index, long count) { return new VkSubmitInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubmitInfo2KHR at(long index, Consumer<VkSubmitInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int waitSemaphoreInfoCountAt(long index) { return (int) VH_waitSemaphoreInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoreInfosAt(long index) { return (MemorySegment) VH_pWaitSemaphoreInfos.get(this.segment(), 0L, index); }
    public int commandBufferInfoCountAt(long index) { return (int) VH_commandBufferInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pCommandBufferInfosAt(long index) { return (MemorySegment) VH_pCommandBufferInfos.get(this.segment(), 0L, index); }
    public int signalSemaphoreInfoCountAt(long index) { return (int) VH_signalSemaphoreInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoreInfosAt(long index) { return (MemorySegment) VH_pSignalSemaphoreInfos.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreInfoCount() { return (int) VH_waitSemaphoreInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphoreInfos() { return (MemorySegment) VH_pWaitSemaphoreInfos.get(this.segment(), 0L, 0L); }
    public int commandBufferInfoCount() { return (int) VH_commandBufferInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCommandBufferInfos() { return (MemorySegment) VH_pCommandBufferInfos.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreInfoCount() { return (int) VH_signalSemaphoreInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphoreInfos() { return (MemorySegment) VH_pSignalSemaphoreInfos.get(this.segment(), 0L, 0L); }
    public VkSubmitInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR waitSemaphoreInfoCountAt(long index, int value) { VH_waitSemaphoreInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR pWaitSemaphoreInfosAt(long index, MemorySegment value) { VH_pWaitSemaphoreInfos.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR commandBufferInfoCountAt(long index, int value) { VH_commandBufferInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR pCommandBufferInfosAt(long index, MemorySegment value) { VH_pCommandBufferInfos.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR signalSemaphoreInfoCountAt(long index, int value) { VH_signalSemaphoreInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR pSignalSemaphoreInfosAt(long index, MemorySegment value) { VH_pSignalSemaphoreInfos.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR waitSemaphoreInfoCount(int value) { VH_waitSemaphoreInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(MemorySegment value) { VH_pWaitSemaphoreInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR commandBufferInfoCount(int value) { VH_commandBufferInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR pCommandBufferInfos(MemorySegment value) { VH_pCommandBufferInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR signalSemaphoreInfoCount(int value) { VH_signalSemaphoreInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(MemorySegment value) { VH_pSignalSemaphoreInfos.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubmitInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubmitInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSubmitInfo2KHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _waitSemaphoreInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreInfoCount, index), LAYOUT_waitSemaphoreInfoCount); }
    public MemorySegment _waitSemaphoreInfoCount() { return _waitSemaphoreInfoCountAt(0L); }
    public VkSubmitInfo2KHR _waitSemaphoreInfoCountAt(long index, MemorySegment src) { _waitSemaphoreInfoCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _waitSemaphoreInfoCount(MemorySegment src) { return _waitSemaphoreInfoCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoreInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphoreInfos, index), LAYOUT_pWaitSemaphoreInfos); }
    public MemorySegment _pWaitSemaphoreInfos() { return _pWaitSemaphoreInfosAt(0L); }
    public VkSubmitInfo2KHR _pWaitSemaphoreInfosAt(long index, MemorySegment src) { _pWaitSemaphoreInfosAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _pWaitSemaphoreInfos(MemorySegment src) { return _pWaitSemaphoreInfosAt(0L, src); }
    public MemorySegment _commandBufferInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBufferInfoCount, index), LAYOUT_commandBufferInfoCount); }
    public MemorySegment _commandBufferInfoCount() { return _commandBufferInfoCountAt(0L); }
    public VkSubmitInfo2KHR _commandBufferInfoCountAt(long index, MemorySegment src) { _commandBufferInfoCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _commandBufferInfoCount(MemorySegment src) { return _commandBufferInfoCountAt(0L, src); }
    public MemorySegment _pCommandBufferInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCommandBufferInfos, index), LAYOUT_pCommandBufferInfos); }
    public MemorySegment _pCommandBufferInfos() { return _pCommandBufferInfosAt(0L); }
    public VkSubmitInfo2KHR _pCommandBufferInfosAt(long index, MemorySegment src) { _pCommandBufferInfosAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _pCommandBufferInfos(MemorySegment src) { return _pCommandBufferInfosAt(0L, src); }
    public MemorySegment _signalSemaphoreInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreInfoCount, index), LAYOUT_signalSemaphoreInfoCount); }
    public MemorySegment _signalSemaphoreInfoCount() { return _signalSemaphoreInfoCountAt(0L); }
    public VkSubmitInfo2KHR _signalSemaphoreInfoCountAt(long index, MemorySegment src) { _signalSemaphoreInfoCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _signalSemaphoreInfoCount(MemorySegment src) { return _signalSemaphoreInfoCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoreInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphoreInfos, index), LAYOUT_pSignalSemaphoreInfos); }
    public MemorySegment _pSignalSemaphoreInfos() { return _pSignalSemaphoreInfosAt(0L); }
    public VkSubmitInfo2KHR _pSignalSemaphoreInfosAt(long index, MemorySegment src) { _pSignalSemaphoreInfosAt(index).copyFrom(src); return this; }
    public VkSubmitInfo2KHR _pSignalSemaphoreInfos(MemorySegment src) { return _pSignalSemaphoreInfosAt(0L, src); }
}
