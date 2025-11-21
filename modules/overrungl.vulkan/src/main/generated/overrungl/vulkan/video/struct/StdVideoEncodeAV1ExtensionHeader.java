// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeAV1ExtensionHeader`.
/// ## Layout
/// ```
/// struct StdVideoEncodeAV1ExtensionHeader {
///     uint8_t temporal_id;
///     uint8_t spatial_id;
/// }
/// ```
public final class StdVideoEncodeAV1ExtensionHeader extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("spatial_id")
    );
    public static final long OFFSET_temporal_id = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
    public static final long OFFSET_spatial_id = LAYOUT.byteOffset(PathElement.groupElement("spatial_id"));
    public static final MemoryLayout LAYOUT_temporal_id = LAYOUT.select(PathElement.groupElement("temporal_id"));
    public static final MemoryLayout LAYOUT_spatial_id = LAYOUT.select(PathElement.groupElement("spatial_id"));
    public static final VarHandle VH_temporal_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id"));
    public static final VarHandle VH_spatial_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spatial_id"));

    public StdVideoEncodeAV1ExtensionHeader(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeAV1ExtensionHeader of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeAV1ExtensionHeader ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ExtensionHeader(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeAV1ExtensionHeader alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1ExtensionHeader(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeAV1ExtensionHeader copyFrom(StdVideoEncodeAV1ExtensionHeader src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeAV1ExtensionHeader reinterpret(long count) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeAV1ExtensionHeader asSlice(long index, long count) { return new StdVideoEncodeAV1ExtensionHeader(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeAV1ExtensionHeader at(long index, Consumer<StdVideoEncodeAV1ExtensionHeader> func) { func.accept(asSlice(index)); return this; }
    public byte temporal_idAt(long index) { return (byte) VH_temporal_id.get(this.segment(), 0L, index); }
    public byte spatial_idAt(long index) { return (byte) VH_spatial_id.get(this.segment(), 0L, index); }
    public byte temporal_id() { return (byte) VH_temporal_id.get(this.segment(), 0L, 0L); }
    public byte spatial_id() { return (byte) VH_spatial_id.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeAV1ExtensionHeader temporal_idAt(long index, byte value) { VH_temporal_id.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1ExtensionHeader spatial_idAt(long index, byte value) { VH_spatial_id.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeAV1ExtensionHeader temporal_id(byte value) { VH_temporal_id.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeAV1ExtensionHeader spatial_id(byte value) { VH_spatial_id.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _temporal_idAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_temporal_id, index), LAYOUT_temporal_id); }
    public MemorySegment _temporal_id() { return _temporal_idAt(0L); }
    public StdVideoEncodeAV1ExtensionHeader _temporal_idAt(long index, MemorySegment src) { _temporal_idAt(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1ExtensionHeader _temporal_id(MemorySegment src) { return _temporal_idAt(0L, src); }
    public MemorySegment _spatial_idAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_spatial_id, index), LAYOUT_spatial_id); }
    public MemorySegment _spatial_id() { return _spatial_idAt(0L); }
    public StdVideoEncodeAV1ExtensionHeader _spatial_idAt(long index, MemorySegment src) { _spatial_idAt(index).copyFrom(src); return this; }
    public StdVideoEncodeAV1ExtensionHeader _spatial_id(MemorySegment src) { return _spatial_idAt(0L, src); }
}
