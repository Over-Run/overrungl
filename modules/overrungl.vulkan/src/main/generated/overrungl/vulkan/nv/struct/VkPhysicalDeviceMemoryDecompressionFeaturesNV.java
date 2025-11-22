// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryDecompressionFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryDecompressionFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 memoryDecompression;
/// }
/// ```
public final class VkPhysicalDeviceMemoryDecompressionFeaturesNV extends GroupType {
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

    public VkPhysicalDeviceMemoryDecompressionFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV copyFrom(VkPhysicalDeviceMemoryDecompressionFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV at(long index, Consumer<VkPhysicalDeviceMemoryDecompressionFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryDecompressionAt(long index) { return (int) VH_memoryDecompression.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryDecompression() { return (int) VH_memoryDecompression.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV memoryDecompressionAt(long index, int value) { VH_memoryDecompression.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV memoryDecompression(int value) { VH_memoryDecompression.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryDecompressionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryDecompression, index), LAYOUT_memoryDecompression); }
    public MemorySegment _memoryDecompression() { return _memoryDecompressionAt(0L); }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _memoryDecompressionAt(long index, MemorySegment src) { _memoryDecompressionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV _memoryDecompression(MemorySegment src) { return _memoryDecompressionAt(0L, src); }
}
