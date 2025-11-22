// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSparseImageFormatInfo2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSparseImageFormatInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat format;
///     VkImageType type;
///     VkSampleCountFlagBits samples;
///     VkImageUsageFlags usage;
///     VkImageTiling tiling;
/// }
/// ```
public final class VkPhysicalDeviceSparseImageFormatInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("tiling")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));

    public VkPhysicalDeviceSparseImageFormatInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseImageFormatInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseImageFormatInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2); }
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2);
        return s;
    }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR copyFrom(VkPhysicalDeviceSparseImageFormatInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR reinterpret(long count) { return new VkPhysicalDeviceSparseImageFormatInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR asSlice(long index) { return new VkPhysicalDeviceSparseImageFormatInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR asSlice(long index, long count) { return new VkPhysicalDeviceSparseImageFormatInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR at(long index, Consumer<VkPhysicalDeviceSparseImageFormatInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int samplesAt(long index) { return (int) VH_samples.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int tilingAt(long index) { return (int) VH_tiling.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int samples() { return (int) VH_samples.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int tiling() { return (int) VH_tiling.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR samplesAt(long index, int value) { VH_samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR tilingAt(long index, int value) { VH_tiling.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR samples(int value) { VH_samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR tiling(int value) { VH_tiling.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _samplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samples, index), LAYOUT_samples); }
    public MemorySegment _samples() { return _samplesAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _samplesAt(long index, MemorySegment src) { _samplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _samples(MemorySegment src) { return _samplesAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _tilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tiling, index), LAYOUT_tiling); }
    public MemorySegment _tiling() { return _tilingAt(0L); }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _tilingAt(long index, MemorySegment src) { _tilingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseImageFormatInfo2KHR _tiling(MemorySegment src) { return _tilingAt(0L, src); }
}
