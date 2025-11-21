// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkComputePipelineIndirectBufferInfoNV`.
/// ## Layout
/// ```
/// struct VkComputePipelineIndirectBufferInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize size;
///     VkDeviceAddress pipelineDeviceAddressCaptureReplay;
/// }
/// ```
public final class VkComputePipelineIndirectBufferInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_pipelineDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_pipelineDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_pipelineDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));

    public VkComputePipelineIndirectBufferInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkComputePipelineIndirectBufferInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator, long count) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV); }
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
        return s;
    }
    public VkComputePipelineIndirectBufferInfoNV copyFrom(VkComputePipelineIndirectBufferInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkComputePipelineIndirectBufferInfoNV reinterpret(long count) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index, long count) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkComputePipelineIndirectBufferInfoNV at(long index, Consumer<VkComputePipelineIndirectBufferInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long pipelineDeviceAddressCaptureReplayAt(long index) { return (long) VH_pipelineDeviceAddressCaptureReplay.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public long pipelineDeviceAddressCaptureReplay() { return (long) VH_pipelineDeviceAddressCaptureReplay.get(this.segment(), 0L, 0L); }
    public VkComputePipelineIndirectBufferInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplayAt(long index, long value) { VH_pipelineDeviceAddressCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplay(long value) { VH_pipelineDeviceAddressCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkComputePipelineIndirectBufferInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkComputePipelineIndirectBufferInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkComputePipelineIndirectBufferInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkComputePipelineIndirectBufferInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkComputePipelineIndirectBufferInfoNV _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkComputePipelineIndirectBufferInfoNV _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkComputePipelineIndirectBufferInfoNV _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkComputePipelineIndirectBufferInfoNV _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _pipelineDeviceAddressCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineDeviceAddressCaptureReplay, index), LAYOUT_pipelineDeviceAddressCaptureReplay); }
    public MemorySegment _pipelineDeviceAddressCaptureReplay() { return _pipelineDeviceAddressCaptureReplayAt(0L); }
    public VkComputePipelineIndirectBufferInfoNV _pipelineDeviceAddressCaptureReplayAt(long index, MemorySegment src) { _pipelineDeviceAddressCaptureReplayAt(index).copyFrom(src); return this; }
    public VkComputePipelineIndirectBufferInfoNV _pipelineDeviceAddressCaptureReplay(MemorySegment src) { return _pipelineDeviceAddressCaptureReplayAt(0L, src); }
}
