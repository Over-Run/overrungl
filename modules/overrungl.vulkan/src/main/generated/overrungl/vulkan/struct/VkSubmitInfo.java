// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubmitInfo`.
/// ## Layout
/// ```
/// struct VkSubmitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     const VkPipelineStageFlags* pWaitDstStageMask;
///     uint32_t commandBufferCount;
///     const VkCommandBuffer* pCommandBuffers;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore* pSignalSemaphores;
/// }
/// ```
public final class VkSubmitInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.ADDRESS.withName("pWaitDstStageMask"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withName("pCommandBuffers"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphores")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    public static final long OFFSET_pWaitSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
    public static final long OFFSET_pWaitDstStageMask = LAYOUT.byteOffset(PathElement.groupElement("pWaitDstStageMask"));
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    public static final long OFFSET_pCommandBuffers = LAYOUT.byteOffset(PathElement.groupElement("pCommandBuffers"));
    public static final long OFFSET_signalSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
    public static final long OFFSET_pSignalSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphores"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphores = LAYOUT.select(PathElement.groupElement("pWaitSemaphores"));
    public static final MemoryLayout LAYOUT_pWaitDstStageMask = LAYOUT.select(PathElement.groupElement("pWaitDstStageMask"));
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    public static final MemoryLayout LAYOUT_pCommandBuffers = LAYOUT.select(PathElement.groupElement("pCommandBuffers"));
    public static final MemoryLayout LAYOUT_signalSemaphoreCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphores = LAYOUT.select(PathElement.groupElement("pSignalSemaphores"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    public static final VarHandle VH_pWaitDstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitDstStageMask"));
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    public static final VarHandle VH_pCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBuffers"));
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    public static final VarHandle VH_pSignalSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphores"));

    public VkSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubmitInfo alloc(SegmentAllocator allocator) { return new VkSubmitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSubmitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSubmitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SUBMIT_INFO); }
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SUBMIT_INFO);
        return s;
    }
    public VkSubmitInfo copyFrom(VkSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubmitInfo reinterpret(long count) { return new VkSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubmitInfo asSlice(long index) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubmitInfo asSlice(long index, long count) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubmitInfo at(long index, Consumer<VkSubmitInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreCountAt(long index) { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoresAt(long index) { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, index); }
    public MemorySegment pWaitDstStageMaskAt(long index) { return (MemorySegment) VH_pWaitDstStageMask.get(this.segment(), 0L, index); }
    public int commandBufferCountAt(long index) { return (int) VH_commandBufferCount.get(this.segment(), 0L, index); }
    public MemorySegment pCommandBuffersAt(long index) { return (MemorySegment) VH_pCommandBuffers.get(this.segment(), 0L, index); }
    public int signalSemaphoreCountAt(long index) { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoresAt(long index) { return (MemorySegment) VH_pSignalSemaphores.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreCount() { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphores() { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitDstStageMask() { return (MemorySegment) VH_pWaitDstStageMask.get(this.segment(), 0L, 0L); }
    public int commandBufferCount() { return (int) VH_commandBufferCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCommandBuffers() { return (MemorySegment) VH_pCommandBuffers.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreCount() { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphores() { return (MemorySegment) VH_pSignalSemaphores.get(this.segment(), 0L, 0L); }
    public VkSubmitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo waitSemaphoreCountAt(long index, int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo pWaitSemaphoresAt(long index, MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo pWaitDstStageMaskAt(long index, MemorySegment value) { VH_pWaitDstStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo commandBufferCountAt(long index, int value) { VH_commandBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo pCommandBuffersAt(long index, MemorySegment value) { VH_pCommandBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo signalSemaphoreCountAt(long index, int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo pSignalSemaphoresAt(long index, MemorySegment value) { VH_pSignalSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkSubmitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo waitSemaphoreCount(int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo pWaitSemaphores(MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo pWaitDstStageMask(MemorySegment value) { VH_pWaitDstStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo commandBufferCount(int value) { VH_commandBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo pCommandBuffers(MemorySegment value) { VH_pCommandBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo signalSemaphoreCount(int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubmitInfo pSignalSemaphores(MemorySegment value) { VH_pSignalSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubmitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubmitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreCount, index), LAYOUT_waitSemaphoreCount); }
    public MemorySegment _waitSemaphoreCount() { return _waitSemaphoreCountAt(0L); }
    public VkSubmitInfo _waitSemaphoreCountAt(long index, MemorySegment src) { _waitSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _waitSemaphoreCount(MemorySegment src) { return _waitSemaphoreCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphores, index), LAYOUT_pWaitSemaphores); }
    public MemorySegment _pWaitSemaphores() { return _pWaitSemaphoresAt(0L); }
    public VkSubmitInfo _pWaitSemaphoresAt(long index, MemorySegment src) { _pWaitSemaphoresAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _pWaitSemaphores(MemorySegment src) { return _pWaitSemaphoresAt(0L, src); }
    public MemorySegment _pWaitDstStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitDstStageMask, index), LAYOUT_pWaitDstStageMask); }
    public MemorySegment _pWaitDstStageMask() { return _pWaitDstStageMaskAt(0L); }
    public VkSubmitInfo _pWaitDstStageMaskAt(long index, MemorySegment src) { _pWaitDstStageMaskAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _pWaitDstStageMask(MemorySegment src) { return _pWaitDstStageMaskAt(0L, src); }
    public MemorySegment _commandBufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBufferCount, index), LAYOUT_commandBufferCount); }
    public MemorySegment _commandBufferCount() { return _commandBufferCountAt(0L); }
    public VkSubmitInfo _commandBufferCountAt(long index, MemorySegment src) { _commandBufferCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _commandBufferCount(MemorySegment src) { return _commandBufferCountAt(0L, src); }
    public MemorySegment _pCommandBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCommandBuffers, index), LAYOUT_pCommandBuffers); }
    public MemorySegment _pCommandBuffers() { return _pCommandBuffersAt(0L); }
    public VkSubmitInfo _pCommandBuffersAt(long index, MemorySegment src) { _pCommandBuffersAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _pCommandBuffers(MemorySegment src) { return _pCommandBuffersAt(0L, src); }
    public MemorySegment _signalSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreCount, index), LAYOUT_signalSemaphoreCount); }
    public MemorySegment _signalSemaphoreCount() { return _signalSemaphoreCountAt(0L); }
    public VkSubmitInfo _signalSemaphoreCountAt(long index, MemorySegment src) { _signalSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _signalSemaphoreCount(MemorySegment src) { return _signalSemaphoreCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphores, index), LAYOUT_pSignalSemaphores); }
    public MemorySegment _pSignalSemaphores() { return _pSignalSemaphoresAt(0L); }
    public VkSubmitInfo _pSignalSemaphoresAt(long index, MemorySegment src) { _pSignalSemaphoresAt(index).copyFrom(src); return this; }
    public VkSubmitInfo _pSignalSemaphores(MemorySegment src) { return _pSignalSemaphoresAt(0L, src); }
}
