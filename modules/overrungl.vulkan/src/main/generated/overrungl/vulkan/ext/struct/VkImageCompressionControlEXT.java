// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageCompressionControlEXT`.
/// ## Layout
/// ```
/// struct VkImageCompressionControlEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCompressionFlagsEXT flags;
///     uint32_t compressionControlPlaneCount;
///     VkImageCompressionFixedRateFlagsEXT* pFixedRateFlags;
/// }
/// ```
public final class VkImageCompressionControlEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withName("pFixedRateFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_compressionControlPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("compressionControlPlaneCount"));
    public static final long OFFSET_pFixedRateFlags = LAYOUT.byteOffset(PathElement.groupElement("pFixedRateFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_compressionControlPlaneCount = LAYOUT.select(PathElement.groupElement("compressionControlPlaneCount"));
    public static final MemoryLayout LAYOUT_pFixedRateFlags = LAYOUT.select(PathElement.groupElement("pFixedRateFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_compressionControlPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressionControlPlaneCount"));
    public static final VarHandle VH_pFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFixedRateFlags"));

    public VkImageCompressionControlEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageCompressionControlEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator, long count) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageCompressionControlEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT); }
    public static VkImageCompressionControlEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT);
        return s;
    }
    public VkImageCompressionControlEXT copyFrom(VkImageCompressionControlEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageCompressionControlEXT reinterpret(long count) { return new VkImageCompressionControlEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageCompressionControlEXT asSlice(long index) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageCompressionControlEXT asSlice(long index, long count) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageCompressionControlEXT at(long index, Consumer<VkImageCompressionControlEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int compressionControlPlaneCountAt(long index) { return (int) VH_compressionControlPlaneCount.get(this.segment(), 0L, index); }
    public MemorySegment pFixedRateFlagsAt(long index) { return (MemorySegment) VH_pFixedRateFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int compressionControlPlaneCount() { return (int) VH_compressionControlPlaneCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFixedRateFlags() { return (MemorySegment) VH_pFixedRateFlags.get(this.segment(), 0L, 0L); }
    public VkImageCompressionControlEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionControlEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionControlEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionControlEXT compressionControlPlaneCountAt(long index, int value) { VH_compressionControlPlaneCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionControlEXT pFixedRateFlagsAt(long index, MemorySegment value) { VH_pFixedRateFlags.set(this.segment(), 0L, index, value); return this; }
    public VkImageCompressionControlEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionControlEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionControlEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionControlEXT compressionControlPlaneCount(int value) { VH_compressionControlPlaneCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCompressionControlEXT pFixedRateFlags(MemorySegment value) { VH_pFixedRateFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageCompressionControlEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageCompressionControlEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageCompressionControlEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageCompressionControlEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImageCompressionControlEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImageCompressionControlEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _compressionControlPlaneCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compressionControlPlaneCount, index), LAYOUT_compressionControlPlaneCount); }
    public MemorySegment _compressionControlPlaneCount() { return _compressionControlPlaneCountAt(0L); }
    public VkImageCompressionControlEXT _compressionControlPlaneCountAt(long index, MemorySegment src) { _compressionControlPlaneCountAt(index).copyFrom(src); return this; }
    public VkImageCompressionControlEXT _compressionControlPlaneCount(MemorySegment src) { return _compressionControlPlaneCountAt(0L, src); }
    public MemorySegment _pFixedRateFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFixedRateFlags, index), LAYOUT_pFixedRateFlags); }
    public MemorySegment _pFixedRateFlags() { return _pFixedRateFlagsAt(0L); }
    public VkImageCompressionControlEXT _pFixedRateFlagsAt(long index, MemorySegment src) { _pFixedRateFlagsAt(index).copyFrom(src); return this; }
    public VkImageCompressionControlEXT _pFixedRateFlags(MemorySegment src) { return _pFixedRateFlagsAt(0L, src); }
}
