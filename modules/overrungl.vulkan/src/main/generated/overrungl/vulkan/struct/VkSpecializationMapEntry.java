// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSpecializationMapEntry`.
/// ## Layout
/// ```
/// struct VkSpecializationMapEntry {
///     uint32_t constantID;
///     uint32_t offset;
///     size_t size;
/// }
/// ```
public final class VkSpecializationMapEntry extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("constantID"),
        ValueLayout.JAVA_INT.withName("offset"),
        CanonicalTypes.SIZE_T.withName("size")
    );
    public static final long OFFSET_constantID = LAYOUT.byteOffset(PathElement.groupElement("constantID"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_constantID = LAYOUT.select(PathElement.groupElement("constantID"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_constantID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantID"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkSpecializationMapEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSpecializationMapEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment, estimateCount(segment, LAYOUT)); }
    public static VkSpecializationMapEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSpecializationMapEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSpecializationMapEntry alloc(SegmentAllocator allocator) { return new VkSpecializationMapEntry(allocator.allocate(LAYOUT), 1); }
    public static VkSpecializationMapEntry alloc(SegmentAllocator allocator, long count) { return new VkSpecializationMapEntry(allocator.allocate(LAYOUT, count), count); }
    public VkSpecializationMapEntry copyFrom(VkSpecializationMapEntry src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSpecializationMapEntry reinterpret(long count) { return new VkSpecializationMapEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSpecializationMapEntry asSlice(long index) { return new VkSpecializationMapEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSpecializationMapEntry asSlice(long index, long count) { return new VkSpecializationMapEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSpecializationMapEntry at(long index, Consumer<VkSpecializationMapEntry> func) { func.accept(asSlice(index)); return this; }
    public int constantIDAt(long index) { return (int) VH_constantID.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int constantID() { return (int) VH_constantID.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkSpecializationMapEntry constantIDAt(long index, int value) { VH_constantID.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationMapEntry offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationMapEntry sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationMapEntry constantID(int value) { VH_constantID.set(this.segment(), 0L, 0L, value); return this; }
    public VkSpecializationMapEntry offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSpecializationMapEntry size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _constantIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantID, index), LAYOUT_constantID); }
    public MemorySegment _constantID() { return _constantIDAt(0L); }
    public VkSpecializationMapEntry _constantIDAt(long index, MemorySegment src) { _constantIDAt(index).copyFrom(src); return this; }
    public VkSpecializationMapEntry _constantID(MemorySegment src) { return _constantIDAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkSpecializationMapEntry _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkSpecializationMapEntry _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkSpecializationMapEntry _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkSpecializationMapEntry _size(MemorySegment src) { return _sizeAt(0L, src); }
}
