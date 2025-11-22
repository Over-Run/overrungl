// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyQueryResultStatusPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyQueryResultStatusPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 queryResultStatusSupport;
/// }
/// ```
public final class VkQueueFamilyQueryResultStatusPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queryResultStatusSupport")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queryResultStatusSupport = LAYOUT.byteOffset(PathElement.groupElement("queryResultStatusSupport"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queryResultStatusSupport = LAYOUT.select(PathElement.groupElement("queryResultStatusSupport"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queryResultStatusSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryResultStatusSupport"));

    public VkQueueFamilyQueryResultStatusPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR); }
    public static VkQueueFamilyQueryResultStatusPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR);
        return s;
    }
    public VkQueueFamilyQueryResultStatusPropertiesKHR copyFrom(VkQueueFamilyQueryResultStatusPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR reinterpret(long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR asSlice(long index) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR at(long index, Consumer<VkQueueFamilyQueryResultStatusPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queryResultStatusSupportAt(long index) { return (int) VH_queryResultStatusSupport.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queryResultStatusSupport() { return (int) VH_queryResultStatusSupport.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR queryResultStatusSupportAt(long index, int value) { VH_queryResultStatusSupport.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR queryResultStatusSupport(int value) { VH_queryResultStatusSupport.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queryResultStatusSupportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryResultStatusSupport, index), LAYOUT_queryResultStatusSupport); }
    public MemorySegment _queryResultStatusSupport() { return _queryResultStatusSupportAt(0L); }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _queryResultStatusSupportAt(long index, MemorySegment src) { _queryResultStatusSupportAt(index).copyFrom(src); return this; }
    public VkQueueFamilyQueryResultStatusPropertiesKHR _queryResultStatusSupport(MemorySegment src) { return _queryResultStatusSupportAt(0L, src); }
}
