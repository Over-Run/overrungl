// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkMemoryDecompressionMethodFlagsEXT decompressionMethods;
///     uint64_t maxDecompressionIndirectCount;
/// }
/// ```
public final class VkPhysicalDeviceMemoryDecompressionPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("decompressionMethods"),
        ValueLayout.JAVA_LONG.withName("maxDecompressionIndirectCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_decompressionMethods = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethods"));
    public static final long OFFSET_maxDecompressionIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("maxDecompressionIndirectCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_decompressionMethods = LAYOUT.select(PathElement.groupElement("decompressionMethods"));
    public static final MemoryLayout LAYOUT_maxDecompressionIndirectCount = LAYOUT.select(PathElement.groupElement("maxDecompressionIndirectCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_decompressionMethods = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethods"));
    public static final VarHandle VH_maxDecompressionIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDecompressionIndirectCount"));

    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV copyFrom(VkPhysicalDeviceMemoryDecompressionPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV at(long index, Consumer<VkPhysicalDeviceMemoryDecompressionPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long decompressionMethodsAt(long index) { return (long) VH_decompressionMethods.get(this.segment(), 0L, index); }
    public long maxDecompressionIndirectCountAt(long index) { return (long) VH_maxDecompressionIndirectCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long decompressionMethods() { return (long) VH_decompressionMethods.get(this.segment(), 0L, 0L); }
    public long maxDecompressionIndirectCount() { return (long) VH_maxDecompressionIndirectCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV decompressionMethodsAt(long index, long value) { VH_decompressionMethods.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV maxDecompressionIndirectCountAt(long index, long value) { VH_maxDecompressionIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV decompressionMethods(long value) { VH_decompressionMethods.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV maxDecompressionIndirectCount(long value) { VH_maxDecompressionIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _decompressionMethodsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressionMethods, index), LAYOUT_decompressionMethods); }
    public MemorySegment _decompressionMethods() { return _decompressionMethodsAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _decompressionMethodsAt(long index, MemorySegment src) { _decompressionMethodsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _decompressionMethods(MemorySegment src) { return _decompressionMethodsAt(0L, src); }
    public MemorySegment _maxDecompressionIndirectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDecompressionIndirectCount, index), LAYOUT_maxDecompressionIndirectCount); }
    public MemorySegment _maxDecompressionIndirectCount() { return _maxDecompressionIndirectCountAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _maxDecompressionIndirectCountAt(long index, MemorySegment src) { _maxDecompressionIndirectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV _maxDecompressionIndirectCount(MemorySegment src) { return _maxDecompressionIndirectCountAt(0L, src); }
}
