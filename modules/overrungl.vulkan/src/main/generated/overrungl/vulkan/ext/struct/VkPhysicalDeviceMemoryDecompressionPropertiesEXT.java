// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryDecompressionPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryDecompressionPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkMemoryDecompressionMethodFlagsEXT decompressionMethods;
///     uint64_t maxDecompressionIndirectCount;
/// }
/// ```
public final class VkPhysicalDeviceMemoryDecompressionPropertiesEXT extends GroupType {
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

    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMemoryDecompressionPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT copyFrom(VkPhysicalDeviceMemoryDecompressionPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMemoryDecompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT at(long index, Consumer<VkPhysicalDeviceMemoryDecompressionPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long decompressionMethodsAt(long index) { return (long) VH_decompressionMethods.get(this.segment(), 0L, index); }
    public long maxDecompressionIndirectCountAt(long index) { return (long) VH_maxDecompressionIndirectCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long decompressionMethods() { return (long) VH_decompressionMethods.get(this.segment(), 0L, 0L); }
    public long maxDecompressionIndirectCount() { return (long) VH_maxDecompressionIndirectCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT decompressionMethodsAt(long index, long value) { VH_decompressionMethods.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT maxDecompressionIndirectCountAt(long index, long value) { VH_maxDecompressionIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT decompressionMethods(long value) { VH_decompressionMethods.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT maxDecompressionIndirectCount(long value) { VH_maxDecompressionIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _decompressionMethodsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressionMethods, index), LAYOUT_decompressionMethods); }
    public MemorySegment _decompressionMethods() { return _decompressionMethodsAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _decompressionMethodsAt(long index, MemorySegment src) { _decompressionMethodsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _decompressionMethods(MemorySegment src) { return _decompressionMethodsAt(0L, src); }
    public MemorySegment _maxDecompressionIndirectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDecompressionIndirectCount, index), LAYOUT_maxDecompressionIndirectCount); }
    public MemorySegment _maxDecompressionIndirectCount() { return _maxDecompressionIndirectCountAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _maxDecompressionIndirectCountAt(long index, MemorySegment src) { _maxDecompressionIndirectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionPropertiesEXT _maxDecompressionIndirectCount(MemorySegment src) { return _maxDecompressionIndirectCountAt(0L, src); }
}
