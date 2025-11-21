// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceGeneratedCompute;
///     VkBool32 deviceGeneratedComputePipelines;
///     VkBool32 deviceGeneratedComputeCaptureReplay;
/// }
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCompute"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceGeneratedCompute = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCompute"));
    public static final long OFFSET_deviceGeneratedComputePipelines = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputePipelines"));
    public static final long OFFSET_deviceGeneratedComputeCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceGeneratedCompute = LAYOUT.select(PathElement.groupElement("deviceGeneratedCompute"));
    public static final MemoryLayout LAYOUT_deviceGeneratedComputePipelines = LAYOUT.select(PathElement.groupElement("deviceGeneratedComputePipelines"));
    public static final MemoryLayout LAYOUT_deviceGeneratedComputeCaptureReplay = LAYOUT.select(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceGeneratedCompute = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCompute"));
    public static final VarHandle VH_deviceGeneratedComputePipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputePipelines"));
    public static final VarHandle VH_deviceGeneratedComputeCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceGeneratedComputeAt(long index) { return (int) VH_deviceGeneratedCompute.get(this.segment(), 0L, index); }
    public int deviceGeneratedComputePipelinesAt(long index) { return (int) VH_deviceGeneratedComputePipelines.get(this.segment(), 0L, index); }
    public int deviceGeneratedComputeCaptureReplayAt(long index) { return (int) VH_deviceGeneratedComputeCaptureReplay.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedCompute() { return (int) VH_deviceGeneratedCompute.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedComputePipelines() { return (int) VH_deviceGeneratedComputePipelines.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedComputeCaptureReplay() { return (int) VH_deviceGeneratedComputeCaptureReplay.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeAt(long index, int value) { VH_deviceGeneratedCompute.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelinesAt(long index, int value) { VH_deviceGeneratedComputePipelines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplayAt(long index, int value) { VH_deviceGeneratedComputeCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(int value) { VH_deviceGeneratedCompute.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(int value) { VH_deviceGeneratedComputePipelines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(int value) { VH_deviceGeneratedComputeCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceGeneratedComputeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedCompute, index), LAYOUT_deviceGeneratedCompute); }
    public MemorySegment _deviceGeneratedCompute() { return _deviceGeneratedComputeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedComputeAt(long index, MemorySegment src) { _deviceGeneratedComputeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedCompute(MemorySegment src) { return _deviceGeneratedComputeAt(0L, src); }
    public MemorySegment _deviceGeneratedComputePipelinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedComputePipelines, index), LAYOUT_deviceGeneratedComputePipelines); }
    public MemorySegment _deviceGeneratedComputePipelines() { return _deviceGeneratedComputePipelinesAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedComputePipelinesAt(long index, MemorySegment src) { _deviceGeneratedComputePipelinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedComputePipelines(MemorySegment src) { return _deviceGeneratedComputePipelinesAt(0L, src); }
    public MemorySegment _deviceGeneratedComputeCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedComputeCaptureReplay, index), LAYOUT_deviceGeneratedComputeCaptureReplay); }
    public MemorySegment _deviceGeneratedComputeCaptureReplay() { return _deviceGeneratedComputeCaptureReplayAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedComputeCaptureReplayAt(long index, MemorySegment src) { _deviceGeneratedComputeCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV _deviceGeneratedComputeCaptureReplay(MemorySegment src) { return _deviceGeneratedComputeCaptureReplayAt(0L, src); }
}
