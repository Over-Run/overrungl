// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDevicePipelineBinaryInternalCacheControlKHR`.
/// ## Layout
/// ```
/// struct VkDevicePipelineBinaryInternalCacheControlKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 disableInternalCache;
/// }
/// ```
public final class VkDevicePipelineBinaryInternalCacheControlKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disableInternalCache")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_disableInternalCache = LAYOUT.byteOffset(PathElement.groupElement("disableInternalCache"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_disableInternalCache = LAYOUT.select(PathElement.groupElement("disableInternalCache"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_disableInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disableInternalCache"));

    public VkDevicePipelineBinaryInternalCacheControlKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePipelineBinaryInternalCacheControlKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePipelineBinaryInternalCacheControlKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePipelineBinaryInternalCacheControlKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR alloc(SegmentAllocator allocator) { return new VkDevicePipelineBinaryInternalCacheControlKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR alloc(SegmentAllocator allocator, long count) { return new VkDevicePipelineBinaryInternalCacheControlKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR); }
    public static VkDevicePipelineBinaryInternalCacheControlKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR);
        return s;
    }
    public VkDevicePipelineBinaryInternalCacheControlKHR copyFrom(VkDevicePipelineBinaryInternalCacheControlKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR reinterpret(long count) { return new VkDevicePipelineBinaryInternalCacheControlKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDevicePipelineBinaryInternalCacheControlKHR asSlice(long index) { return new VkDevicePipelineBinaryInternalCacheControlKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDevicePipelineBinaryInternalCacheControlKHR asSlice(long index, long count) { return new VkDevicePipelineBinaryInternalCacheControlKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDevicePipelineBinaryInternalCacheControlKHR at(long index, Consumer<VkDevicePipelineBinaryInternalCacheControlKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int disableInternalCacheAt(long index) { return (int) VH_disableInternalCache.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int disableInternalCache() { return (int) VH_disableInternalCache.get(this.segment(), 0L, 0L); }
    public VkDevicePipelineBinaryInternalCacheControlKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR disableInternalCacheAt(long index, int value) { VH_disableInternalCache.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR disableInternalCache(int value) { VH_disableInternalCache.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDevicePipelineBinaryInternalCacheControlKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDevicePipelineBinaryInternalCacheControlKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _disableInternalCacheAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_disableInternalCache, index), LAYOUT_disableInternalCache); }
    public MemorySegment _disableInternalCache() { return _disableInternalCacheAt(0L); }
    public VkDevicePipelineBinaryInternalCacheControlKHR _disableInternalCacheAt(long index, MemorySegment src) { _disableInternalCacheAt(index).copyFrom(src); return this; }
    public VkDevicePipelineBinaryInternalCacheControlKHR _disableInternalCache(MemorySegment src) { return _disableInternalCacheAt(0L, src); }
}
