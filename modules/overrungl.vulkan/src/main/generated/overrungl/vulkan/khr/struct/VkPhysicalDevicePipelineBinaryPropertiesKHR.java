// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineBinaryPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineBinaryPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineBinaryInternalCache;
///     VkBool32 pipelineBinaryInternalCacheControl;
///     VkBool32 pipelineBinaryPrefersInternalCache;
///     VkBool32 pipelineBinaryPrecompiledInternalCache;
///     VkBool32 pipelineBinaryCompressedData;
/// }
/// ```
public final class VkPhysicalDevicePipelineBinaryPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBinaryInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCache"));
    public static final long OFFSET_pipelineBinaryInternalCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    public static final long OFFSET_pipelineBinaryPrefersInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    public static final long OFFSET_pipelineBinaryPrecompiledInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    public static final long OFFSET_pipelineBinaryCompressedData = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCompressedData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBinaryInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryInternalCache"));
    public static final MemoryLayout LAYOUT_pipelineBinaryInternalCacheControl = LAYOUT.select(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    public static final MemoryLayout LAYOUT_pipelineBinaryPrefersInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    public static final MemoryLayout LAYOUT_pipelineBinaryPrecompiledInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    public static final MemoryLayout LAYOUT_pipelineBinaryCompressedData = LAYOUT.select(PathElement.groupElement("pipelineBinaryCompressedData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBinaryInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCache"));
    public static final VarHandle VH_pipelineBinaryInternalCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    public static final VarHandle VH_pipelineBinaryPrefersInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    public static final VarHandle VH_pipelineBinaryPrecompiledInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    public static final VarHandle VH_pipelineBinaryCompressedData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryCompressedData"));

    public VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR); }
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR copyFrom(VkPhysicalDevicePipelineBinaryPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR reinterpret(long count) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR at(long index, Consumer<VkPhysicalDevicePipelineBinaryPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineBinaryInternalCacheAt(long index) { return (int) VH_pipelineBinaryInternalCache.get(this.segment(), 0L, index); }
    public int pipelineBinaryInternalCacheControlAt(long index) { return (int) VH_pipelineBinaryInternalCacheControl.get(this.segment(), 0L, index); }
    public int pipelineBinaryPrefersInternalCacheAt(long index) { return (int) VH_pipelineBinaryPrefersInternalCache.get(this.segment(), 0L, index); }
    public int pipelineBinaryPrecompiledInternalCacheAt(long index) { return (int) VH_pipelineBinaryPrecompiledInternalCache.get(this.segment(), 0L, index); }
    public int pipelineBinaryCompressedDataAt(long index) { return (int) VH_pipelineBinaryCompressedData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryInternalCache() { return (int) VH_pipelineBinaryInternalCache.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryInternalCacheControl() { return (int) VH_pipelineBinaryInternalCacheControl.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryPrefersInternalCache() { return (int) VH_pipelineBinaryPrefersInternalCache.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryPrecompiledInternalCache() { return (int) VH_pipelineBinaryPrecompiledInternalCache.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryCompressedData() { return (int) VH_pipelineBinaryCompressedData.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheAt(long index, int value) { VH_pipelineBinaryInternalCache.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControlAt(long index, int value) { VH_pipelineBinaryInternalCacheControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCacheAt(long index, int value) { VH_pipelineBinaryPrefersInternalCache.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCacheAt(long index, int value) { VH_pipelineBinaryPrecompiledInternalCache.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedDataAt(long index, int value) { VH_pipelineBinaryCompressedData.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCache(int value) { VH_pipelineBinaryInternalCache.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControl(int value) { VH_pipelineBinaryInternalCacheControl.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCache(int value) { VH_pipelineBinaryPrefersInternalCache.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCache(int value) { VH_pipelineBinaryPrecompiledInternalCache.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedData(int value) { VH_pipelineBinaryCompressedData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBinaryInternalCacheAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryInternalCache, index), LAYOUT_pipelineBinaryInternalCache); }
    public MemorySegment _pipelineBinaryInternalCache() { return _pipelineBinaryInternalCacheAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryInternalCacheAt(long index, MemorySegment src) { _pipelineBinaryInternalCacheAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryInternalCache(MemorySegment src) { return _pipelineBinaryInternalCacheAt(0L, src); }
    public MemorySegment _pipelineBinaryInternalCacheControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryInternalCacheControl, index), LAYOUT_pipelineBinaryInternalCacheControl); }
    public MemorySegment _pipelineBinaryInternalCacheControl() { return _pipelineBinaryInternalCacheControlAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryInternalCacheControlAt(long index, MemorySegment src) { _pipelineBinaryInternalCacheControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryInternalCacheControl(MemorySegment src) { return _pipelineBinaryInternalCacheControlAt(0L, src); }
    public MemorySegment _pipelineBinaryPrefersInternalCacheAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryPrefersInternalCache, index), LAYOUT_pipelineBinaryPrefersInternalCache); }
    public MemorySegment _pipelineBinaryPrefersInternalCache() { return _pipelineBinaryPrefersInternalCacheAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryPrefersInternalCacheAt(long index, MemorySegment src) { _pipelineBinaryPrefersInternalCacheAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryPrefersInternalCache(MemorySegment src) { return _pipelineBinaryPrefersInternalCacheAt(0L, src); }
    public MemorySegment _pipelineBinaryPrecompiledInternalCacheAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryPrecompiledInternalCache, index), LAYOUT_pipelineBinaryPrecompiledInternalCache); }
    public MemorySegment _pipelineBinaryPrecompiledInternalCache() { return _pipelineBinaryPrecompiledInternalCacheAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryPrecompiledInternalCacheAt(long index, MemorySegment src) { _pipelineBinaryPrecompiledInternalCacheAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryPrecompiledInternalCache(MemorySegment src) { return _pipelineBinaryPrecompiledInternalCacheAt(0L, src); }
    public MemorySegment _pipelineBinaryCompressedDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryCompressedData, index), LAYOUT_pipelineBinaryCompressedData); }
    public MemorySegment _pipelineBinaryCompressedData() { return _pipelineBinaryCompressedDataAt(0L); }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryCompressedDataAt(long index, MemorySegment src) { _pipelineBinaryCompressedDataAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineBinaryPropertiesKHR _pipelineBinaryCompressedData(MemorySegment src) { return _pipelineBinaryCompressedDataAt(0L, src); }
}
