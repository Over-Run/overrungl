// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryDecompressionFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryDecompressionFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 memoryDecompression;
/// }
/// ```
public final class VkPhysicalDeviceMemoryDecompressionFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryDecompression")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryDecompression = LAYOUT.byteOffset(PathElement.groupElement("memoryDecompression"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryDecompression = LAYOUT.select(PathElement.groupElement("memoryDecompression"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryDecompression = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryDecompression"));

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT copyFrom(VkPhysicalDeviceMemoryDecompressionFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMemoryDecompressionFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryDecompressionAt(long index) { return (int) VH_memoryDecompression.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryDecompression() { return (int) VH_memoryDecompression.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT memoryDecompressionAt(long index, int value) { VH_memoryDecompression.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT memoryDecompression(int value) { VH_memoryDecompression.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryDecompressionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryDecompression, index), LAYOUT_memoryDecompression); }
    public MemorySegment _memoryDecompression() { return _memoryDecompressionAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _memoryDecompressionAt(long index, MemorySegment src) { _memoryDecompressionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT _memoryDecompression(MemorySegment src) { return _memoryDecompressionAt(0L, src); }
}
