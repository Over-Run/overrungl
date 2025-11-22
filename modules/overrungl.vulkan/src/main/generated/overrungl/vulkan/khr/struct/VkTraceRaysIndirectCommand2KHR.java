// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTraceRaysIndirectCommand2KHR`.
/// ## Layout
/// ```
/// struct VkTraceRaysIndirectCommand2KHR {
///     VkDeviceAddress raygenShaderRecordAddress;
///     VkDeviceSize raygenShaderRecordSize;
///     VkDeviceAddress missShaderBindingTableAddress;
///     VkDeviceSize missShaderBindingTableSize;
///     VkDeviceSize missShaderBindingTableStride;
///     VkDeviceAddress hitShaderBindingTableAddress;
///     VkDeviceSize hitShaderBindingTableSize;
///     VkDeviceSize hitShaderBindingTableStride;
///     VkDeviceAddress callableShaderBindingTableAddress;
///     VkDeviceSize callableShaderBindingTableSize;
///     VkDeviceSize callableShaderBindingTableStride;
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// }
/// ```
public final class VkTraceRaysIndirectCommand2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordAddress"),
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableStride"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    public static final long OFFSET_raygenShaderRecordAddress = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordAddress"));
    public static final long OFFSET_raygenShaderRecordSize = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordSize"));
    public static final long OFFSET_missShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableAddress"));
    public static final long OFFSET_missShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableSize"));
    public static final long OFFSET_missShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableStride"));
    public static final long OFFSET_hitShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableAddress"));
    public static final long OFFSET_hitShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableSize"));
    public static final long OFFSET_hitShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableStride"));
    public static final long OFFSET_callableShaderBindingTableAddress = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableAddress"));
    public static final long OFFSET_callableShaderBindingTableSize = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableSize"));
    public static final long OFFSET_callableShaderBindingTableStride = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableStride"));
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    public static final long OFFSET_depth = LAYOUT.byteOffset(PathElement.groupElement("depth"));
    public static final MemoryLayout LAYOUT_raygenShaderRecordAddress = LAYOUT.select(PathElement.groupElement("raygenShaderRecordAddress"));
    public static final MemoryLayout LAYOUT_raygenShaderRecordSize = LAYOUT.select(PathElement.groupElement("raygenShaderRecordSize"));
    public static final MemoryLayout LAYOUT_missShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("missShaderBindingTableAddress"));
    public static final MemoryLayout LAYOUT_missShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("missShaderBindingTableSize"));
    public static final MemoryLayout LAYOUT_missShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("missShaderBindingTableStride"));
    public static final MemoryLayout LAYOUT_hitShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableAddress"));
    public static final MemoryLayout LAYOUT_hitShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableSize"));
    public static final MemoryLayout LAYOUT_hitShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("hitShaderBindingTableStride"));
    public static final MemoryLayout LAYOUT_callableShaderBindingTableAddress = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableAddress"));
    public static final MemoryLayout LAYOUT_callableShaderBindingTableSize = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableSize"));
    public static final MemoryLayout LAYOUT_callableShaderBindingTableStride = LAYOUT.select(PathElement.groupElement("callableShaderBindingTableStride"));
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    public static final MemoryLayout LAYOUT_depth = LAYOUT.select(PathElement.groupElement("depth"));
    public static final VarHandle VH_raygenShaderRecordAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordAddress"));
    public static final VarHandle VH_raygenShaderRecordSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("raygenShaderRecordSize"));
    public static final VarHandle VH_missShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableAddress"));
    public static final VarHandle VH_missShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableSize"));
    public static final VarHandle VH_missShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("missShaderBindingTableStride"));
    public static final VarHandle VH_hitShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableAddress"));
    public static final VarHandle VH_hitShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableSize"));
    public static final VarHandle VH_hitShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hitShaderBindingTableStride"));
    public static final VarHandle VH_callableShaderBindingTableAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableAddress"));
    public static final VarHandle VH_callableShaderBindingTableSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableSize"));
    public static final VarHandle VH_callableShaderBindingTableStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("callableShaderBindingTableStride"));
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    public VkTraceRaysIndirectCommand2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTraceRaysIndirectCommand2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTraceRaysIndirectCommand2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommand2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkTraceRaysIndirectCommand2KHR alloc(SegmentAllocator allocator, long count) { return new VkTraceRaysIndirectCommand2KHR(allocator.allocate(LAYOUT, count), count); }
    public VkTraceRaysIndirectCommand2KHR copyFrom(VkTraceRaysIndirectCommand2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTraceRaysIndirectCommand2KHR reinterpret(long count) { return new VkTraceRaysIndirectCommand2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTraceRaysIndirectCommand2KHR asSlice(long index) { return new VkTraceRaysIndirectCommand2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTraceRaysIndirectCommand2KHR asSlice(long index, long count) { return new VkTraceRaysIndirectCommand2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTraceRaysIndirectCommand2KHR at(long index, Consumer<VkTraceRaysIndirectCommand2KHR> func) { func.accept(asSlice(index)); return this; }
    public long raygenShaderRecordAddressAt(long index) { return (long) VH_raygenShaderRecordAddress.get(this.segment(), 0L, index); }
    public long raygenShaderRecordSizeAt(long index) { return (long) VH_raygenShaderRecordSize.get(this.segment(), 0L, index); }
    public long missShaderBindingTableAddressAt(long index) { return (long) VH_missShaderBindingTableAddress.get(this.segment(), 0L, index); }
    public long missShaderBindingTableSizeAt(long index) { return (long) VH_missShaderBindingTableSize.get(this.segment(), 0L, index); }
    public long missShaderBindingTableStrideAt(long index) { return (long) VH_missShaderBindingTableStride.get(this.segment(), 0L, index); }
    public long hitShaderBindingTableAddressAt(long index) { return (long) VH_hitShaderBindingTableAddress.get(this.segment(), 0L, index); }
    public long hitShaderBindingTableSizeAt(long index) { return (long) VH_hitShaderBindingTableSize.get(this.segment(), 0L, index); }
    public long hitShaderBindingTableStrideAt(long index) { return (long) VH_hitShaderBindingTableStride.get(this.segment(), 0L, index); }
    public long callableShaderBindingTableAddressAt(long index) { return (long) VH_callableShaderBindingTableAddress.get(this.segment(), 0L, index); }
    public long callableShaderBindingTableSizeAt(long index) { return (long) VH_callableShaderBindingTableSize.get(this.segment(), 0L, index); }
    public long callableShaderBindingTableStrideAt(long index) { return (long) VH_callableShaderBindingTableStride.get(this.segment(), 0L, index); }
    public int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    public int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    public int depthAt(long index) { return (int) VH_depth.get(this.segment(), 0L, index); }
    public long raygenShaderRecordAddress() { return (long) VH_raygenShaderRecordAddress.get(this.segment(), 0L, 0L); }
    public long raygenShaderRecordSize() { return (long) VH_raygenShaderRecordSize.get(this.segment(), 0L, 0L); }
    public long missShaderBindingTableAddress() { return (long) VH_missShaderBindingTableAddress.get(this.segment(), 0L, 0L); }
    public long missShaderBindingTableSize() { return (long) VH_missShaderBindingTableSize.get(this.segment(), 0L, 0L); }
    public long missShaderBindingTableStride() { return (long) VH_missShaderBindingTableStride.get(this.segment(), 0L, 0L); }
    public long hitShaderBindingTableAddress() { return (long) VH_hitShaderBindingTableAddress.get(this.segment(), 0L, 0L); }
    public long hitShaderBindingTableSize() { return (long) VH_hitShaderBindingTableSize.get(this.segment(), 0L, 0L); }
    public long hitShaderBindingTableStride() { return (long) VH_hitShaderBindingTableStride.get(this.segment(), 0L, 0L); }
    public long callableShaderBindingTableAddress() { return (long) VH_callableShaderBindingTableAddress.get(this.segment(), 0L, 0L); }
    public long callableShaderBindingTableSize() { return (long) VH_callableShaderBindingTableSize.get(this.segment(), 0L, 0L); }
    public long callableShaderBindingTableStride() { return (long) VH_callableShaderBindingTableStride.get(this.segment(), 0L, 0L); }
    public int width() { return (int) VH_width.get(this.segment(), 0L, 0L); }
    public int height() { return (int) VH_height.get(this.segment(), 0L, 0L); }
    public int depth() { return (int) VH_depth.get(this.segment(), 0L, 0L); }
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddressAt(long index, long value) { VH_raygenShaderRecordAddress.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSizeAt(long index, long value) { VH_raygenShaderRecordSize.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddressAt(long index, long value) { VH_missShaderBindingTableAddress.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSizeAt(long index, long value) { VH_missShaderBindingTableSize.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStrideAt(long index, long value) { VH_missShaderBindingTableStride.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddressAt(long index, long value) { VH_hitShaderBindingTableAddress.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSizeAt(long index, long value) { VH_hitShaderBindingTableSize.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStrideAt(long index, long value) { VH_hitShaderBindingTableStride.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddressAt(long index, long value) { VH_callableShaderBindingTableAddress.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSizeAt(long index, long value) { VH_callableShaderBindingTableSize.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStrideAt(long index, long value) { VH_callableShaderBindingTableStride.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR widthAt(long index, int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR heightAt(long index, int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR depthAt(long index, int value) { VH_depth.set(this.segment(), 0L, index, value); return this; }
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(long value) { VH_raygenShaderRecordAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(long value) { VH_raygenShaderRecordSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(long value) { VH_missShaderBindingTableAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(long value) { VH_missShaderBindingTableSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(long value) { VH_missShaderBindingTableStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(long value) { VH_hitShaderBindingTableAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(long value) { VH_hitShaderBindingTableSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(long value) { VH_hitShaderBindingTableStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(long value) { VH_callableShaderBindingTableAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(long value) { VH_callableShaderBindingTableSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(long value) { VH_callableShaderBindingTableStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR width(int value) { VH_width.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR height(int value) { VH_height.set(this.segment(), 0L, 0L, value); return this; }
    public VkTraceRaysIndirectCommand2KHR depth(int value) { VH_depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _raygenShaderRecordAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_raygenShaderRecordAddress, index), LAYOUT_raygenShaderRecordAddress); }
    public MemorySegment _raygenShaderRecordAddress() { return _raygenShaderRecordAddressAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _raygenShaderRecordAddressAt(long index, MemorySegment src) { _raygenShaderRecordAddressAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _raygenShaderRecordAddress(MemorySegment src) { return _raygenShaderRecordAddressAt(0L, src); }
    public MemorySegment _raygenShaderRecordSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_raygenShaderRecordSize, index), LAYOUT_raygenShaderRecordSize); }
    public MemorySegment _raygenShaderRecordSize() { return _raygenShaderRecordSizeAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _raygenShaderRecordSizeAt(long index, MemorySegment src) { _raygenShaderRecordSizeAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _raygenShaderRecordSize(MemorySegment src) { return _raygenShaderRecordSizeAt(0L, src); }
    public MemorySegment _missShaderBindingTableAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_missShaderBindingTableAddress, index), LAYOUT_missShaderBindingTableAddress); }
    public MemorySegment _missShaderBindingTableAddress() { return _missShaderBindingTableAddressAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableAddressAt(long index, MemorySegment src) { _missShaderBindingTableAddressAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableAddress(MemorySegment src) { return _missShaderBindingTableAddressAt(0L, src); }
    public MemorySegment _missShaderBindingTableSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_missShaderBindingTableSize, index), LAYOUT_missShaderBindingTableSize); }
    public MemorySegment _missShaderBindingTableSize() { return _missShaderBindingTableSizeAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableSizeAt(long index, MemorySegment src) { _missShaderBindingTableSizeAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableSize(MemorySegment src) { return _missShaderBindingTableSizeAt(0L, src); }
    public MemorySegment _missShaderBindingTableStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_missShaderBindingTableStride, index), LAYOUT_missShaderBindingTableStride); }
    public MemorySegment _missShaderBindingTableStride() { return _missShaderBindingTableStrideAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableStrideAt(long index, MemorySegment src) { _missShaderBindingTableStrideAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _missShaderBindingTableStride(MemorySegment src) { return _missShaderBindingTableStrideAt(0L, src); }
    public MemorySegment _hitShaderBindingTableAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hitShaderBindingTableAddress, index), LAYOUT_hitShaderBindingTableAddress); }
    public MemorySegment _hitShaderBindingTableAddress() { return _hitShaderBindingTableAddressAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableAddressAt(long index, MemorySegment src) { _hitShaderBindingTableAddressAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableAddress(MemorySegment src) { return _hitShaderBindingTableAddressAt(0L, src); }
    public MemorySegment _hitShaderBindingTableSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hitShaderBindingTableSize, index), LAYOUT_hitShaderBindingTableSize); }
    public MemorySegment _hitShaderBindingTableSize() { return _hitShaderBindingTableSizeAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableSizeAt(long index, MemorySegment src) { _hitShaderBindingTableSizeAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableSize(MemorySegment src) { return _hitShaderBindingTableSizeAt(0L, src); }
    public MemorySegment _hitShaderBindingTableStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hitShaderBindingTableStride, index), LAYOUT_hitShaderBindingTableStride); }
    public MemorySegment _hitShaderBindingTableStride() { return _hitShaderBindingTableStrideAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableStrideAt(long index, MemorySegment src) { _hitShaderBindingTableStrideAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _hitShaderBindingTableStride(MemorySegment src) { return _hitShaderBindingTableStrideAt(0L, src); }
    public MemorySegment _callableShaderBindingTableAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_callableShaderBindingTableAddress, index), LAYOUT_callableShaderBindingTableAddress); }
    public MemorySegment _callableShaderBindingTableAddress() { return _callableShaderBindingTableAddressAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableAddressAt(long index, MemorySegment src) { _callableShaderBindingTableAddressAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableAddress(MemorySegment src) { return _callableShaderBindingTableAddressAt(0L, src); }
    public MemorySegment _callableShaderBindingTableSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_callableShaderBindingTableSize, index), LAYOUT_callableShaderBindingTableSize); }
    public MemorySegment _callableShaderBindingTableSize() { return _callableShaderBindingTableSizeAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableSizeAt(long index, MemorySegment src) { _callableShaderBindingTableSizeAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableSize(MemorySegment src) { return _callableShaderBindingTableSizeAt(0L, src); }
    public MemorySegment _callableShaderBindingTableStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_callableShaderBindingTableStride, index), LAYOUT_callableShaderBindingTableStride); }
    public MemorySegment _callableShaderBindingTableStride() { return _callableShaderBindingTableStrideAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableStrideAt(long index, MemorySegment src) { _callableShaderBindingTableStrideAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _callableShaderBindingTableStride(MemorySegment src) { return _callableShaderBindingTableStrideAt(0L, src); }
    public MemorySegment _widthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_width, index), LAYOUT_width); }
    public MemorySegment _width() { return _widthAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _widthAt(long index, MemorySegment src) { _widthAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _width(MemorySegment src) { return _widthAt(0L, src); }
    public MemorySegment _heightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_height, index), LAYOUT_height); }
    public MemorySegment _height() { return _heightAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _heightAt(long index, MemorySegment src) { _heightAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _height(MemorySegment src) { return _heightAt(0L, src); }
    public MemorySegment _depthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depth, index), LAYOUT_depth); }
    public MemorySegment _depth() { return _depthAt(0L); }
    public VkTraceRaysIndirectCommand2KHR _depthAt(long index, MemorySegment src) { _depthAt(index).copyFrom(src); return this; }
    public VkTraceRaysIndirectCommand2KHR _depth(MemorySegment src) { return _depthAt(0L, src); }
}
