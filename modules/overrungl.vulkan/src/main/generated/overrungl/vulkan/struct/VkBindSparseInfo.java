// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindSparseInfo`.
/// ## Layout
/// ```
/// struct VkBindSparseInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     uint32_t bufferBindCount;
///     const VkSparseBufferMemoryBindInfo* pBufferBinds;
///     uint32_t imageOpaqueBindCount;
///     const VkSparseImageOpaqueMemoryBindInfo* pImageOpaqueBinds;
///     uint32_t imageBindCount;
///     const VkSparseImageMemoryBindInfo* pImageBinds;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore* pSignalSemaphores;
/// }
/// ```
public final class VkBindSparseInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("bufferBindCount"),
        ValueLayout.ADDRESS.withName("pBufferBinds"),
        ValueLayout.JAVA_INT.withName("imageOpaqueBindCount"),
        ValueLayout.ADDRESS.withName("pImageOpaqueBinds"),
        ValueLayout.JAVA_INT.withName("imageBindCount"),
        ValueLayout.ADDRESS.withName("pImageBinds"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphores")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    public static final long OFFSET_pWaitSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
    public static final long OFFSET_bufferBindCount = LAYOUT.byteOffset(PathElement.groupElement("bufferBindCount"));
    public static final long OFFSET_pBufferBinds = LAYOUT.byteOffset(PathElement.groupElement("pBufferBinds"));
    public static final long OFFSET_imageOpaqueBindCount = LAYOUT.byteOffset(PathElement.groupElement("imageOpaqueBindCount"));
    public static final long OFFSET_pImageOpaqueBinds = LAYOUT.byteOffset(PathElement.groupElement("pImageOpaqueBinds"));
    public static final long OFFSET_imageBindCount = LAYOUT.byteOffset(PathElement.groupElement("imageBindCount"));
    public static final long OFFSET_pImageBinds = LAYOUT.byteOffset(PathElement.groupElement("pImageBinds"));
    public static final long OFFSET_signalSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
    public static final long OFFSET_pSignalSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphores"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphores = LAYOUT.select(PathElement.groupElement("pWaitSemaphores"));
    public static final MemoryLayout LAYOUT_bufferBindCount = LAYOUT.select(PathElement.groupElement("bufferBindCount"));
    public static final MemoryLayout LAYOUT_pBufferBinds = LAYOUT.select(PathElement.groupElement("pBufferBinds"));
    public static final MemoryLayout LAYOUT_imageOpaqueBindCount = LAYOUT.select(PathElement.groupElement("imageOpaqueBindCount"));
    public static final MemoryLayout LAYOUT_pImageOpaqueBinds = LAYOUT.select(PathElement.groupElement("pImageOpaqueBinds"));
    public static final MemoryLayout LAYOUT_imageBindCount = LAYOUT.select(PathElement.groupElement("imageBindCount"));
    public static final MemoryLayout LAYOUT_pImageBinds = LAYOUT.select(PathElement.groupElement("pImageBinds"));
    public static final MemoryLayout LAYOUT_signalSemaphoreCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pSignalSemaphores = LAYOUT.select(PathElement.groupElement("pSignalSemaphores"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    public static final VarHandle VH_bufferBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferBindCount"));
    public static final VarHandle VH_pBufferBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferBinds"));
    public static final VarHandle VH_imageOpaqueBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOpaqueBindCount"));
    public static final VarHandle VH_pImageOpaqueBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageOpaqueBinds"));
    public static final VarHandle VH_imageBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageBindCount"));
    public static final VarHandle VH_pImageBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageBinds"));
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    public static final VarHandle VH_pSignalSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphores"));

    public VkBindSparseInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindSparseInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindSparseInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindSparseInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindSparseInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindSparseInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindSparseInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindSparseInfo alloc(SegmentAllocator allocator) { return new VkBindSparseInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBindSparseInfo alloc(SegmentAllocator allocator, long count) { return new VkBindSparseInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO); }
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO);
        return s;
    }
    public VkBindSparseInfo copyFrom(VkBindSparseInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindSparseInfo reinterpret(long count) { return new VkBindSparseInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindSparseInfo asSlice(long index) { return new VkBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindSparseInfo asSlice(long index, long count) { return new VkBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindSparseInfo at(long index, Consumer<VkBindSparseInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreCountAt(long index) { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoresAt(long index) { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, index); }
    public int bufferBindCountAt(long index) { return (int) VH_bufferBindCount.get(this.segment(), 0L, index); }
    public MemorySegment pBufferBindsAt(long index) { return (MemorySegment) VH_pBufferBinds.get(this.segment(), 0L, index); }
    public int imageOpaqueBindCountAt(long index) { return (int) VH_imageOpaqueBindCount.get(this.segment(), 0L, index); }
    public MemorySegment pImageOpaqueBindsAt(long index) { return (MemorySegment) VH_pImageOpaqueBinds.get(this.segment(), 0L, index); }
    public int imageBindCountAt(long index) { return (int) VH_imageBindCount.get(this.segment(), 0L, index); }
    public MemorySegment pImageBindsAt(long index) { return (MemorySegment) VH_pImageBinds.get(this.segment(), 0L, index); }
    public int signalSemaphoreCountAt(long index) { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pSignalSemaphoresAt(long index) { return (MemorySegment) VH_pSignalSemaphores.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreCount() { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphores() { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, 0L); }
    public int bufferBindCount() { return (int) VH_bufferBindCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBufferBinds() { return (MemorySegment) VH_pBufferBinds.get(this.segment(), 0L, 0L); }
    public int imageOpaqueBindCount() { return (int) VH_imageOpaqueBindCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageOpaqueBinds() { return (MemorySegment) VH_pImageOpaqueBinds.get(this.segment(), 0L, 0L); }
    public int imageBindCount() { return (int) VH_imageBindCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageBinds() { return (MemorySegment) VH_pImageBinds.get(this.segment(), 0L, 0L); }
    public int signalSemaphoreCount() { return (int) VH_signalSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSignalSemaphores() { return (MemorySegment) VH_pSignalSemaphores.get(this.segment(), 0L, 0L); }
    public VkBindSparseInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo waitSemaphoreCountAt(long index, int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pWaitSemaphoresAt(long index, MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo bufferBindCountAt(long index, int value) { VH_bufferBindCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pBufferBindsAt(long index, MemorySegment value) { VH_pBufferBinds.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo imageOpaqueBindCountAt(long index, int value) { VH_imageOpaqueBindCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pImageOpaqueBindsAt(long index, MemorySegment value) { VH_pImageOpaqueBinds.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo imageBindCountAt(long index, int value) { VH_imageBindCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pImageBindsAt(long index, MemorySegment value) { VH_pImageBinds.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo signalSemaphoreCountAt(long index, int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo pSignalSemaphoresAt(long index, MemorySegment value) { VH_pSignalSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkBindSparseInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo waitSemaphoreCount(int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pWaitSemaphores(MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo bufferBindCount(int value) { VH_bufferBindCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pBufferBinds(MemorySegment value) { VH_pBufferBinds.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo imageOpaqueBindCount(int value) { VH_imageOpaqueBindCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pImageOpaqueBinds(MemorySegment value) { VH_pImageOpaqueBinds.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo imageBindCount(int value) { VH_imageBindCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pImageBinds(MemorySegment value) { VH_pImageBinds.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo signalSemaphoreCount(int value) { VH_signalSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindSparseInfo pSignalSemaphores(MemorySegment value) { VH_pSignalSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindSparseInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindSparseInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreCount, index), LAYOUT_waitSemaphoreCount); }
    public MemorySegment _waitSemaphoreCount() { return _waitSemaphoreCountAt(0L); }
    public VkBindSparseInfo _waitSemaphoreCountAt(long index, MemorySegment src) { _waitSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _waitSemaphoreCount(MemorySegment src) { return _waitSemaphoreCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphores, index), LAYOUT_pWaitSemaphores); }
    public MemorySegment _pWaitSemaphores() { return _pWaitSemaphoresAt(0L); }
    public VkBindSparseInfo _pWaitSemaphoresAt(long index, MemorySegment src) { _pWaitSemaphoresAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pWaitSemaphores(MemorySegment src) { return _pWaitSemaphoresAt(0L, src); }
    public MemorySegment _bufferBindCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferBindCount, index), LAYOUT_bufferBindCount); }
    public MemorySegment _bufferBindCount() { return _bufferBindCountAt(0L); }
    public VkBindSparseInfo _bufferBindCountAt(long index, MemorySegment src) { _bufferBindCountAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _bufferBindCount(MemorySegment src) { return _bufferBindCountAt(0L, src); }
    public MemorySegment _pBufferBindsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBufferBinds, index), LAYOUT_pBufferBinds); }
    public MemorySegment _pBufferBinds() { return _pBufferBindsAt(0L); }
    public VkBindSparseInfo _pBufferBindsAt(long index, MemorySegment src) { _pBufferBindsAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pBufferBinds(MemorySegment src) { return _pBufferBindsAt(0L, src); }
    public MemorySegment _imageOpaqueBindCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageOpaqueBindCount, index), LAYOUT_imageOpaqueBindCount); }
    public MemorySegment _imageOpaqueBindCount() { return _imageOpaqueBindCountAt(0L); }
    public VkBindSparseInfo _imageOpaqueBindCountAt(long index, MemorySegment src) { _imageOpaqueBindCountAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _imageOpaqueBindCount(MemorySegment src) { return _imageOpaqueBindCountAt(0L, src); }
    public MemorySegment _pImageOpaqueBindsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageOpaqueBinds, index), LAYOUT_pImageOpaqueBinds); }
    public MemorySegment _pImageOpaqueBinds() { return _pImageOpaqueBindsAt(0L); }
    public VkBindSparseInfo _pImageOpaqueBindsAt(long index, MemorySegment src) { _pImageOpaqueBindsAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pImageOpaqueBinds(MemorySegment src) { return _pImageOpaqueBindsAt(0L, src); }
    public MemorySegment _imageBindCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageBindCount, index), LAYOUT_imageBindCount); }
    public MemorySegment _imageBindCount() { return _imageBindCountAt(0L); }
    public VkBindSparseInfo _imageBindCountAt(long index, MemorySegment src) { _imageBindCountAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _imageBindCount(MemorySegment src) { return _imageBindCountAt(0L, src); }
    public MemorySegment _pImageBindsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageBinds, index), LAYOUT_pImageBinds); }
    public MemorySegment _pImageBinds() { return _pImageBindsAt(0L); }
    public VkBindSparseInfo _pImageBindsAt(long index, MemorySegment src) { _pImageBindsAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pImageBinds(MemorySegment src) { return _pImageBindsAt(0L, src); }
    public MemorySegment _signalSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_signalSemaphoreCount, index), LAYOUT_signalSemaphoreCount); }
    public MemorySegment _signalSemaphoreCount() { return _signalSemaphoreCountAt(0L); }
    public VkBindSparseInfo _signalSemaphoreCountAt(long index, MemorySegment src) { _signalSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _signalSemaphoreCount(MemorySegment src) { return _signalSemaphoreCountAt(0L, src); }
    public MemorySegment _pSignalSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSignalSemaphores, index), LAYOUT_pSignalSemaphores); }
    public MemorySegment _pSignalSemaphores() { return _pSignalSemaphoresAt(0L); }
    public VkBindSparseInfo _pSignalSemaphoresAt(long index, MemorySegment src) { _pSignalSemaphoresAt(index).copyFrom(src); return this; }
    public VkBindSparseInfo _pSignalSemaphores(MemorySegment src) { return _pSignalSemaphoresAt(0L, src); }
}
