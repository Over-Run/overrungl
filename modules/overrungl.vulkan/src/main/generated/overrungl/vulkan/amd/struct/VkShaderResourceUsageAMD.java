// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderResourceUsageAMD`.
/// ## Layout
/// ```
/// struct VkShaderResourceUsageAMD {
///     uint32_t numUsedVgprs;
///     uint32_t numUsedSgprs;
///     uint32_t ldsSizePerLocalWorkGroup;
///     size_t ldsUsageSizeInBytes;
///     size_t scratchMemUsageInBytes;
/// }
/// ```
public final class VkShaderResourceUsageAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        CanonicalTypes.SIZE_T.withName("ldsUsageSizeInBytes"),
        CanonicalTypes.SIZE_T.withName("scratchMemUsageInBytes")
    );
    public static final long OFFSET_numUsedVgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedVgprs"));
    public static final long OFFSET_numUsedSgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedSgprs"));
    public static final long OFFSET_ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    public static final long OFFSET_ldsUsageSizeInBytes = LAYOUT.byteOffset(PathElement.groupElement("ldsUsageSizeInBytes"));
    public static final long OFFSET_scratchMemUsageInBytes = LAYOUT.byteOffset(PathElement.groupElement("scratchMemUsageInBytes"));
    public static final MemoryLayout LAYOUT_numUsedVgprs = LAYOUT.select(PathElement.groupElement("numUsedVgprs"));
    public static final MemoryLayout LAYOUT_numUsedSgprs = LAYOUT.select(PathElement.groupElement("numUsedSgprs"));
    public static final MemoryLayout LAYOUT_ldsSizePerLocalWorkGroup = LAYOUT.select(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    public static final MemoryLayout LAYOUT_ldsUsageSizeInBytes = LAYOUT.select(PathElement.groupElement("ldsUsageSizeInBytes"));
    public static final MemoryLayout LAYOUT_scratchMemUsageInBytes = LAYOUT.select(PathElement.groupElement("scratchMemUsageInBytes"));
    public static final VarHandle VH_numUsedVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedVgprs"));
    public static final VarHandle VH_numUsedSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedSgprs"));
    public static final VarHandle VH_ldsSizePerLocalWorkGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    public static final VarHandle VH_ldsUsageSizeInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsUsageSizeInBytes"));
    public static final VarHandle VH_scratchMemUsageInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchMemUsageInBytes"));

    public VkShaderResourceUsageAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderResourceUsageAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT), 1); }
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator, long count) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT, count), count); }
    public VkShaderResourceUsageAMD copyFrom(VkShaderResourceUsageAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderResourceUsageAMD reinterpret(long count) { return new VkShaderResourceUsageAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderResourceUsageAMD asSlice(long index) { return new VkShaderResourceUsageAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderResourceUsageAMD asSlice(long index, long count) { return new VkShaderResourceUsageAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderResourceUsageAMD at(long index, Consumer<VkShaderResourceUsageAMD> func) { func.accept(asSlice(index)); return this; }
    public int numUsedVgprsAt(long index) { return (int) VH_numUsedVgprs.get(this.segment(), 0L, index); }
    public int numUsedSgprsAt(long index) { return (int) VH_numUsedSgprs.get(this.segment(), 0L, index); }
    public int ldsSizePerLocalWorkGroupAt(long index) { return (int) VH_ldsSizePerLocalWorkGroup.get(this.segment(), 0L, index); }
    public long ldsUsageSizeInBytesAt(long index) { return (long) VH_ldsUsageSizeInBytes.get(this.segment(), 0L, index); }
    public long scratchMemUsageInBytesAt(long index) { return (long) VH_scratchMemUsageInBytes.get(this.segment(), 0L, index); }
    public int numUsedVgprs() { return (int) VH_numUsedVgprs.get(this.segment(), 0L, 0L); }
    public int numUsedSgprs() { return (int) VH_numUsedSgprs.get(this.segment(), 0L, 0L); }
    public int ldsSizePerLocalWorkGroup() { return (int) VH_ldsSizePerLocalWorkGroup.get(this.segment(), 0L, 0L); }
    public long ldsUsageSizeInBytes() { return (long) VH_ldsUsageSizeInBytes.get(this.segment(), 0L, 0L); }
    public long scratchMemUsageInBytes() { return (long) VH_scratchMemUsageInBytes.get(this.segment(), 0L, 0L); }
    public VkShaderResourceUsageAMD numUsedVgprsAt(long index, int value) { VH_numUsedVgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderResourceUsageAMD numUsedSgprsAt(long index, int value) { VH_numUsedSgprs.set(this.segment(), 0L, index, value); return this; }
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroupAt(long index, int value) { VH_ldsSizePerLocalWorkGroup.set(this.segment(), 0L, index, value); return this; }
    public VkShaderResourceUsageAMD ldsUsageSizeInBytesAt(long index, long value) { VH_ldsUsageSizeInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkShaderResourceUsageAMD scratchMemUsageInBytesAt(long index, long value) { VH_scratchMemUsageInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkShaderResourceUsageAMD numUsedVgprs(int value) { VH_numUsedVgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderResourceUsageAMD numUsedSgprs(int value) { VH_numUsedSgprs.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroup(int value) { VH_ldsSizePerLocalWorkGroup.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderResourceUsageAMD ldsUsageSizeInBytes(long value) { VH_ldsUsageSizeInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderResourceUsageAMD scratchMemUsageInBytes(long value) { VH_scratchMemUsageInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _numUsedVgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numUsedVgprs, index), LAYOUT_numUsedVgprs); }
    public MemorySegment _numUsedVgprs() { return _numUsedVgprsAt(0L); }
    public VkShaderResourceUsageAMD _numUsedVgprsAt(long index, MemorySegment src) { _numUsedVgprsAt(index).copyFrom(src); return this; }
    public VkShaderResourceUsageAMD _numUsedVgprs(MemorySegment src) { return _numUsedVgprsAt(0L, src); }
    public MemorySegment _numUsedSgprsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numUsedSgprs, index), LAYOUT_numUsedSgprs); }
    public MemorySegment _numUsedSgprs() { return _numUsedSgprsAt(0L); }
    public VkShaderResourceUsageAMD _numUsedSgprsAt(long index, MemorySegment src) { _numUsedSgprsAt(index).copyFrom(src); return this; }
    public VkShaderResourceUsageAMD _numUsedSgprs(MemorySegment src) { return _numUsedSgprsAt(0L, src); }
    public MemorySegment _ldsSizePerLocalWorkGroupAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ldsSizePerLocalWorkGroup, index), LAYOUT_ldsSizePerLocalWorkGroup); }
    public MemorySegment _ldsSizePerLocalWorkGroup() { return _ldsSizePerLocalWorkGroupAt(0L); }
    public VkShaderResourceUsageAMD _ldsSizePerLocalWorkGroupAt(long index, MemorySegment src) { _ldsSizePerLocalWorkGroupAt(index).copyFrom(src); return this; }
    public VkShaderResourceUsageAMD _ldsSizePerLocalWorkGroup(MemorySegment src) { return _ldsSizePerLocalWorkGroupAt(0L, src); }
    public MemorySegment _ldsUsageSizeInBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ldsUsageSizeInBytes, index), LAYOUT_ldsUsageSizeInBytes); }
    public MemorySegment _ldsUsageSizeInBytes() { return _ldsUsageSizeInBytesAt(0L); }
    public VkShaderResourceUsageAMD _ldsUsageSizeInBytesAt(long index, MemorySegment src) { _ldsUsageSizeInBytesAt(index).copyFrom(src); return this; }
    public VkShaderResourceUsageAMD _ldsUsageSizeInBytes(MemorySegment src) { return _ldsUsageSizeInBytesAt(0L, src); }
    public MemorySegment _scratchMemUsageInBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scratchMemUsageInBytes, index), LAYOUT_scratchMemUsageInBytes); }
    public MemorySegment _scratchMemUsageInBytes() { return _scratchMemUsageInBytesAt(0L); }
    public VkShaderResourceUsageAMD _scratchMemUsageInBytesAt(long index, MemorySegment src) { _scratchMemUsageInBytesAt(index).copyFrom(src); return this; }
    public VkShaderResourceUsageAMD _scratchMemUsageInBytes(MemorySegment src) { return _scratchMemUsageInBytesAt(0L, src); }
}
