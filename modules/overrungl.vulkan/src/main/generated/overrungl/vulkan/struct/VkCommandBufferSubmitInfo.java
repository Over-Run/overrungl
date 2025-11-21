// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandBufferSubmitInfo`.
/// ## Layout
/// ```
/// struct VkCommandBufferSubmitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandBuffer commandBuffer;
///     uint32_t deviceMask;
/// }
/// ```
public final class VkCommandBufferSubmitInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandBuffer"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_commandBuffer = LAYOUT.byteOffset(PathElement.groupElement("commandBuffer"));
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_commandBuffer = LAYOUT.select(PathElement.groupElement("commandBuffer"));
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_commandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBuffer"));
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    public VkCommandBufferSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCommandBufferSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCommandBufferSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCommandBufferSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCommandBufferSubmitInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferSubmitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCommandBufferSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferSubmitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCommandBufferSubmitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO); }
    public static VkCommandBufferSubmitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO);
        return s;
    }
    public VkCommandBufferSubmitInfo copyFrom(VkCommandBufferSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCommandBufferSubmitInfo reinterpret(long count) { return new VkCommandBufferSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCommandBufferSubmitInfo asSlice(long index) { return new VkCommandBufferSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCommandBufferSubmitInfo asSlice(long index, long count) { return new VkCommandBufferSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCommandBufferSubmitInfo at(long index, Consumer<VkCommandBufferSubmitInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment commandBufferAt(long index) { return (MemorySegment) VH_commandBuffer.get(this.segment(), 0L, index); }
    public int deviceMaskAt(long index) { return (int) VH_deviceMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment commandBuffer() { return (MemorySegment) VH_commandBuffer.get(this.segment(), 0L, 0L); }
    public int deviceMask() { return (int) VH_deviceMask.get(this.segment(), 0L, 0L); }
    public VkCommandBufferSubmitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferSubmitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferSubmitInfo commandBufferAt(long index, MemorySegment value) { VH_commandBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferSubmitInfo deviceMaskAt(long index, int value) { VH_deviceMask.set(this.segment(), 0L, index, value); return this; }
    public VkCommandBufferSubmitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferSubmitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferSubmitInfo commandBuffer(MemorySegment value) { VH_commandBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkCommandBufferSubmitInfo deviceMask(int value) { VH_deviceMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCommandBufferSubmitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCommandBufferSubmitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCommandBufferSubmitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCommandBufferSubmitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _commandBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandBuffer, index), LAYOUT_commandBuffer); }
    public MemorySegment _commandBuffer() { return _commandBufferAt(0L); }
    public VkCommandBufferSubmitInfo _commandBufferAt(long index, MemorySegment src) { _commandBufferAt(index).copyFrom(src); return this; }
    public VkCommandBufferSubmitInfo _commandBuffer(MemorySegment src) { return _commandBufferAt(0L, src); }
    public MemorySegment _deviceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMask, index), LAYOUT_deviceMask); }
    public MemorySegment _deviceMask() { return _deviceMaskAt(0L); }
    public VkCommandBufferSubmitInfo _deviceMaskAt(long index, MemorySegment src) { _deviceMaskAt(index).copyFrom(src); return this; }
    public VkCommandBufferSubmitInfo _deviceMask(MemorySegment src) { return _deviceMaskAt(0L, src); }
}
