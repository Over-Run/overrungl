// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapTriangleEXT`.
/// ## Layout
/// ```
/// struct VkMicromapTriangleEXT {
///     uint32_t dataOffset;
///     uint16_t subdivisionLevel;
///     uint16_t format;
/// }
/// ```
public final class VkMicromapTriangleEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );
    public static final long OFFSET_dataOffset = LAYOUT.byteOffset(PathElement.groupElement("dataOffset"));
    public static final long OFFSET_subdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_dataOffset = LAYOUT.select(PathElement.groupElement("dataOffset"));
    public static final MemoryLayout LAYOUT_subdivisionLevel = LAYOUT.select(PathElement.groupElement("subdivisionLevel"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_dataOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataOffset"));
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkMicromapTriangleEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMicromapTriangleEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT, count), count); }
    public VkMicromapTriangleEXT copyFrom(VkMicromapTriangleEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMicromapTriangleEXT reinterpret(long count) { return new VkMicromapTriangleEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMicromapTriangleEXT asSlice(long index) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMicromapTriangleEXT asSlice(long index, long count) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMicromapTriangleEXT at(long index, Consumer<VkMicromapTriangleEXT> func) { func.accept(asSlice(index)); return this; }
    public int dataOffsetAt(long index) { return (int) VH_dataOffset.get(this.segment(), 0L, index); }
    public short subdivisionLevelAt(long index) { return (short) VH_subdivisionLevel.get(this.segment(), 0L, index); }
    public short formatAt(long index) { return (short) VH_format.get(this.segment(), 0L, index); }
    public int dataOffset() { return (int) VH_dataOffset.get(this.segment(), 0L, 0L); }
    public short subdivisionLevel() { return (short) VH_subdivisionLevel.get(this.segment(), 0L, 0L); }
    public short format() { return (short) VH_format.get(this.segment(), 0L, 0L); }
    public VkMicromapTriangleEXT dataOffsetAt(long index, int value) { VH_dataOffset.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapTriangleEXT subdivisionLevelAt(long index, short value) { VH_subdivisionLevel.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapTriangleEXT formatAt(long index, short value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapTriangleEXT dataOffset(int value) { VH_dataOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapTriangleEXT subdivisionLevel(short value) { VH_subdivisionLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapTriangleEXT format(short value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _dataOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataOffset, index), LAYOUT_dataOffset); }
    public MemorySegment _dataOffset() { return _dataOffsetAt(0L); }
    public VkMicromapTriangleEXT _dataOffsetAt(long index, MemorySegment src) { _dataOffsetAt(index).copyFrom(src); return this; }
    public VkMicromapTriangleEXT _dataOffset(MemorySegment src) { return _dataOffsetAt(0L, src); }
    public MemorySegment _subdivisionLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subdivisionLevel, index), LAYOUT_subdivisionLevel); }
    public MemorySegment _subdivisionLevel() { return _subdivisionLevelAt(0L); }
    public VkMicromapTriangleEXT _subdivisionLevelAt(long index, MemorySegment src) { _subdivisionLevelAt(index).copyFrom(src); return this; }
    public VkMicromapTriangleEXT _subdivisionLevel(MemorySegment src) { return _subdivisionLevelAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkMicromapTriangleEXT _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkMicromapTriangleEXT _format(MemorySegment src) { return _formatAt(0L, src); }
}
