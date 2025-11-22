// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageFormatInfo2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageFormatInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat format;
///     VkImageType type;
///     VkImageTiling tiling;
///     VkImageUsageFlags usage;
///     VkImageCreateFlags flags;
/// }
/// ```
public final class VkPhysicalDeviceImageFormatInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkPhysicalDeviceImageFormatInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageFormatInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageFormatInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageFormatInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageFormatInfo2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageFormatInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageFormatInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageFormatInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageFormatInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
    public static VkPhysicalDeviceImageFormatInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2);
        return s;
    }
    public VkPhysicalDeviceImageFormatInfo2KHR copyFrom(VkPhysicalDeviceImageFormatInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR reinterpret(long count) { return new VkPhysicalDeviceImageFormatInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageFormatInfo2KHR asSlice(long index) { return new VkPhysicalDeviceImageFormatInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageFormatInfo2KHR asSlice(long index, long count) { return new VkPhysicalDeviceImageFormatInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageFormatInfo2KHR at(long index, Consumer<VkPhysicalDeviceImageFormatInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int tilingAt(long index) { return (int) VH_tiling.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int tiling() { return (int) VH_tiling.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR tilingAt(long index, int value) { VH_tiling.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR tiling(int value) { VH_tiling.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _tilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tiling, index), LAYOUT_tiling); }
    public MemorySegment _tiling() { return _tilingAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _tilingAt(long index, MemorySegment src) { _tilingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _tiling(MemorySegment src) { return _tilingAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPhysicalDeviceImageFormatInfo2KHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageFormatInfo2KHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
