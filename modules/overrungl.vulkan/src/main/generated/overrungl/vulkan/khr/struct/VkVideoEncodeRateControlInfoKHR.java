// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeRateControlInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeRateControlInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeRateControlFlagsKHR flags;
///     VkVideoEncodeRateControlModeFlagBitsKHR rateControlMode;
///     uint32_t layerCount;
///     const VkVideoEncodeRateControlLayerInfoKHR* pLayers;
///     uint32_t virtualBufferSizeInMs;
///     uint32_t initialVirtualBufferSizeInMs;
/// }
/// ```
public final class VkVideoEncodeRateControlInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlMode"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.ADDRESS.withName("pLayers"),
        ValueLayout.JAVA_INT.withName("virtualBufferSizeInMs"),
        ValueLayout.JAVA_INT.withName("initialVirtualBufferSizeInMs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_rateControlMode = LAYOUT.byteOffset(PathElement.groupElement("rateControlMode"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final long OFFSET_pLayers = LAYOUT.byteOffset(PathElement.groupElement("pLayers"));
    public static final long OFFSET_virtualBufferSizeInMs = LAYOUT.byteOffset(PathElement.groupElement("virtualBufferSizeInMs"));
    public static final long OFFSET_initialVirtualBufferSizeInMs = LAYOUT.byteOffset(PathElement.groupElement("initialVirtualBufferSizeInMs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_rateControlMode = LAYOUT.select(PathElement.groupElement("rateControlMode"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_pLayers = LAYOUT.select(PathElement.groupElement("pLayers"));
    public static final MemoryLayout LAYOUT_virtualBufferSizeInMs = LAYOUT.select(PathElement.groupElement("virtualBufferSizeInMs"));
    public static final MemoryLayout LAYOUT_initialVirtualBufferSizeInMs = LAYOUT.select(PathElement.groupElement("initialVirtualBufferSizeInMs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_rateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlMode"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_pLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayers"));
    public static final VarHandle VH_virtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("virtualBufferSizeInMs"));
    public static final VarHandle VH_initialVirtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialVirtualBufferSizeInMs"));

    public VkVideoEncodeRateControlInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeRateControlInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeRateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeRateControlInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeRateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeRateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRateControlInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeRateControlInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR); }
    public static VkVideoEncodeRateControlInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR);
        return s;
    }
    public VkVideoEncodeRateControlInfoKHR copyFrom(VkVideoEncodeRateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeRateControlInfoKHR reinterpret(long count) { return new VkVideoEncodeRateControlInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeRateControlInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeRateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeRateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeRateControlInfoKHR at(long index, Consumer<VkVideoEncodeRateControlInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int rateControlModeAt(long index) { return (int) VH_rateControlMode.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public MemorySegment pLayersAt(long index) { return (MemorySegment) VH_pLayers.get(this.segment(), 0L, index); }
    public int virtualBufferSizeInMsAt(long index) { return (int) VH_virtualBufferSizeInMs.get(this.segment(), 0L, index); }
    public int initialVirtualBufferSizeInMsAt(long index) { return (int) VH_initialVirtualBufferSizeInMs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int rateControlMode() { return (int) VH_rateControlMode.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pLayers() { return (MemorySegment) VH_pLayers.get(this.segment(), 0L, 0L); }
    public int virtualBufferSizeInMs() { return (int) VH_virtualBufferSizeInMs.get(this.segment(), 0L, 0L); }
    public int initialVirtualBufferSizeInMs() { return (int) VH_initialVirtualBufferSizeInMs.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeRateControlInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR rateControlModeAt(long index, int value) { VH_rateControlMode.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR pLayersAt(long index, MemorySegment value) { VH_pLayers.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMsAt(long index, int value) { VH_virtualBufferSizeInMs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMsAt(long index, int value) { VH_initialVirtualBufferSizeInMs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR rateControlMode(int value) { VH_rateControlMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR pLayers(MemorySegment value) { VH_pLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(int value) { VH_virtualBufferSizeInMs.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(int value) { VH_initialVirtualBufferSizeInMs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _rateControlModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rateControlMode, index), LAYOUT_rateControlMode); }
    public MemorySegment _rateControlMode() { return _rateControlModeAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _rateControlModeAt(long index, MemorySegment src) { _rateControlModeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _rateControlMode(MemorySegment src) { return _rateControlModeAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
    public MemorySegment _pLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLayers, index), LAYOUT_pLayers); }
    public MemorySegment _pLayers() { return _pLayersAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _pLayersAt(long index, MemorySegment src) { _pLayersAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _pLayers(MemorySegment src) { return _pLayersAt(0L, src); }
    public MemorySegment _virtualBufferSizeInMsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_virtualBufferSizeInMs, index), LAYOUT_virtualBufferSizeInMs); }
    public MemorySegment _virtualBufferSizeInMs() { return _virtualBufferSizeInMsAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _virtualBufferSizeInMsAt(long index, MemorySegment src) { _virtualBufferSizeInMsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _virtualBufferSizeInMs(MemorySegment src) { return _virtualBufferSizeInMsAt(0L, src); }
    public MemorySegment _initialVirtualBufferSizeInMsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialVirtualBufferSizeInMs, index), LAYOUT_initialVirtualBufferSizeInMs); }
    public MemorySegment _initialVirtualBufferSizeInMs() { return _initialVirtualBufferSizeInMsAt(0L); }
    public VkVideoEncodeRateControlInfoKHR _initialVirtualBufferSizeInMsAt(long index, MemorySegment src) { _initialVirtualBufferSizeInMsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlInfoKHR _initialVirtualBufferSizeInMs(MemorySegment src) { return _initialVirtualBufferSizeInMsAt(0L, src); }
}
