// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCacheHeaderVersionOne`.
/// ## Layout
/// ```
/// struct VkPipelineCacheHeaderVersionOne {
///     uint32_t headerSize;
///     VkPipelineCacheHeaderVersion headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
/// }
/// ```
public final class VkPipelineCacheHeaderVersionOne extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID")
    );
    public static final long OFFSET_headerSize = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
    public static final long OFFSET_headerVersion = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    public static final MemoryLayout LAYOUT_headerSize = LAYOUT.select(PathElement.groupElement("headerSize"));
    public static final MemoryLayout LAYOUT_headerVersion = LAYOUT.select(PathElement.groupElement("headerVersion"));
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());

    public VkPipelineCacheHeaderVersionOne(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCacheHeaderVersionOne of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCacheHeaderVersionOne ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCacheHeaderVersionOne ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCacheHeaderVersionOne alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionOne(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCacheHeaderVersionOne alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheHeaderVersionOne(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineCacheHeaderVersionOne copyFrom(VkPipelineCacheHeaderVersionOne src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCacheHeaderVersionOne reinterpret(long count) { return new VkPipelineCacheHeaderVersionOne(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCacheHeaderVersionOne asSlice(long index) { return new VkPipelineCacheHeaderVersionOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCacheHeaderVersionOne asSlice(long index, long count) { return new VkPipelineCacheHeaderVersionOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCacheHeaderVersionOne at(long index, Consumer<VkPipelineCacheHeaderVersionOne> func) { func.accept(asSlice(index)); return this; }
    public int headerSizeAt(long index) { return (int) VH_headerSize.get(this.segment(), 0L, index); }
    public int headerVersionAt(long index) { return (int) VH_headerVersion.get(this.segment(), 0L, index); }
    public int vendorIDAt(long index) { return (int) VH_vendorID.get(this.segment(), 0L, index); }
    public int deviceIDAt(long index) { return (int) VH_deviceID.get(this.segment(), 0L, index); }
    public byte pipelineCacheUUIDAt(long index, long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, index, index0); }
    public int headerSize() { return (int) VH_headerSize.get(this.segment(), 0L, 0L); }
    public int headerVersion() { return (int) VH_headerVersion.get(this.segment(), 0L, 0L); }
    public int vendorID() { return (int) VH_vendorID.get(this.segment(), 0L, 0L); }
    public int deviceID() { return (int) VH_deviceID.get(this.segment(), 0L, 0L); }
    public byte pipelineCacheUUID(long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineCacheHeaderVersionOne headerSizeAt(long index, int value) { VH_headerSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionOne headerVersionAt(long index, int value) { VH_headerVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionOne vendorIDAt(long index, int value) { VH_vendorID.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionOne deviceIDAt(long index, int value) { VH_deviceID.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUIDAt(long index, long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineCacheHeaderVersionOne headerSize(int value) { VH_headerSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionOne headerVersion(int value) { VH_headerVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionOne vendorID(int value) { VH_vendorID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionOne deviceID(int value) { VH_deviceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _headerSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerSize, index), LAYOUT_headerSize); }
    public MemorySegment _headerSize() { return _headerSizeAt(0L); }
    public VkPipelineCacheHeaderVersionOne _headerSizeAt(long index, MemorySegment src) { _headerSizeAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionOne _headerSize(MemorySegment src) { return _headerSizeAt(0L, src); }
    public MemorySegment _headerVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerVersion, index), LAYOUT_headerVersion); }
    public MemorySegment _headerVersion() { return _headerVersionAt(0L); }
    public VkPipelineCacheHeaderVersionOne _headerVersionAt(long index, MemorySegment src) { _headerVersionAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionOne _headerVersion(MemorySegment src) { return _headerVersionAt(0L, src); }
    public MemorySegment _vendorIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorID, index), LAYOUT_vendorID); }
    public MemorySegment _vendorID() { return _vendorIDAt(0L); }
    public VkPipelineCacheHeaderVersionOne _vendorIDAt(long index, MemorySegment src) { _vendorIDAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionOne _vendorID(MemorySegment src) { return _vendorIDAt(0L, src); }
    public MemorySegment _deviceIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceID, index), LAYOUT_deviceID); }
    public MemorySegment _deviceID() { return _deviceIDAt(0L); }
    public VkPipelineCacheHeaderVersionOne _deviceIDAt(long index, MemorySegment src) { _deviceIDAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionOne _deviceID(MemorySegment src) { return _deviceIDAt(0L, src); }
    public MemorySegment _pipelineCacheUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), LAYOUT_pipelineCacheUUID); }
    public MemorySegment _pipelineCacheUUID() { return _pipelineCacheUUIDAt(0L); }
    public VkPipelineCacheHeaderVersionOne _pipelineCacheUUIDAt(long index, MemorySegment src) { _pipelineCacheUUIDAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionOne _pipelineCacheUUID(MemorySegment src) { return _pipelineCacheUUIDAt(0L, src); }
}
