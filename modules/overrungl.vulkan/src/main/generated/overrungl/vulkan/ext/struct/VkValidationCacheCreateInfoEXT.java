// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkValidationCacheCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkValidationCacheCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkValidationCacheCreateFlagsEXT flags;
///     size_t initialDataSize;
///     const void* pInitialData;
/// }
/// ```
public final class VkValidationCacheCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        CanonicalTypes.SIZE_T.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_initialDataSize = LAYOUT.byteOffset(PathElement.groupElement("initialDataSize"));
    public static final long OFFSET_pInitialData = LAYOUT.byteOffset(PathElement.groupElement("pInitialData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_initialDataSize = LAYOUT.select(PathElement.groupElement("initialDataSize"));
    public static final MemoryLayout LAYOUT_pInitialData = LAYOUT.select(PathElement.groupElement("pInitialData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_initialDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialDataSize"));
    public static final VarHandle VH_pInitialData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialData"));

    public VkValidationCacheCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkValidationCacheCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkValidationCacheCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkValidationCacheCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkValidationCacheCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTValidationCache.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT); }
    public static VkValidationCacheCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTValidationCache.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT);
        return s;
    }
    public VkValidationCacheCreateInfoEXT copyFrom(VkValidationCacheCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkValidationCacheCreateInfoEXT reinterpret(long count) { return new VkValidationCacheCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkValidationCacheCreateInfoEXT asSlice(long index) { return new VkValidationCacheCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkValidationCacheCreateInfoEXT asSlice(long index, long count) { return new VkValidationCacheCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkValidationCacheCreateInfoEXT at(long index, Consumer<VkValidationCacheCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long initialDataSizeAt(long index) { return (long) VH_initialDataSize.get(this.segment(), 0L, index); }
    public MemorySegment pInitialDataAt(long index) { return (MemorySegment) VH_pInitialData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long initialDataSize() { return (long) VH_initialDataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pInitialData() { return (MemorySegment) VH_pInitialData.get(this.segment(), 0L, 0L); }
    public VkValidationCacheCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkValidationCacheCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkValidationCacheCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkValidationCacheCreateInfoEXT initialDataSizeAt(long index, long value) { VH_initialDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkValidationCacheCreateInfoEXT pInitialDataAt(long index, MemorySegment value) { VH_pInitialData.set(this.segment(), 0L, index, value); return this; }
    public VkValidationCacheCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationCacheCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationCacheCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationCacheCreateInfoEXT initialDataSize(long value) { VH_initialDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationCacheCreateInfoEXT pInitialData(MemorySegment value) { VH_pInitialData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkValidationCacheCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkValidationCacheCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkValidationCacheCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkValidationCacheCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkValidationCacheCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkValidationCacheCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _initialDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialDataSize, index), LAYOUT_initialDataSize); }
    public MemorySegment _initialDataSize() { return _initialDataSizeAt(0L); }
    public VkValidationCacheCreateInfoEXT _initialDataSizeAt(long index, MemorySegment src) { _initialDataSizeAt(index).copyFrom(src); return this; }
    public VkValidationCacheCreateInfoEXT _initialDataSize(MemorySegment src) { return _initialDataSizeAt(0L, src); }
    public MemorySegment _pInitialDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInitialData, index), LAYOUT_pInitialData); }
    public MemorySegment _pInitialData() { return _pInitialDataAt(0L); }
    public VkValidationCacheCreateInfoEXT _pInitialDataAt(long index, MemorySegment src) { _pInitialDataAt(index).copyFrom(src); return this; }
    public VkValidationCacheCreateInfoEXT _pInitialData(MemorySegment src) { return _pInitialDataAt(0L, src); }
}
