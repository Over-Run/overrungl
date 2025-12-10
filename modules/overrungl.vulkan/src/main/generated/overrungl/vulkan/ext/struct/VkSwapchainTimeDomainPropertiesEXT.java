// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainTimeDomainPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainTimeDomainPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t timeDomainCount;
///     VkTimeDomainKHR* pTimeDomains;
///     uint64_t* pTimeDomainIds;
/// }
/// ```
public final class VkSwapchainTimeDomainPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timeDomainCount"),
        ValueLayout.ADDRESS.withName("pTimeDomains"),
        ValueLayout.ADDRESS.withName("pTimeDomainIds")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_timeDomainCount = LAYOUT.byteOffset(PathElement.groupElement("timeDomainCount"));
    public static final long OFFSET_pTimeDomains = LAYOUT.byteOffset(PathElement.groupElement("pTimeDomains"));
    public static final long OFFSET_pTimeDomainIds = LAYOUT.byteOffset(PathElement.groupElement("pTimeDomainIds"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_timeDomainCount = LAYOUT.select(PathElement.groupElement("timeDomainCount"));
    public static final MemoryLayout LAYOUT_pTimeDomains = LAYOUT.select(PathElement.groupElement("pTimeDomains"));
    public static final MemoryLayout LAYOUT_pTimeDomainIds = LAYOUT.select(PathElement.groupElement("pTimeDomainIds"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_timeDomainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomainCount"));
    public static final VarHandle VH_pTimeDomains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimeDomains"));
    public static final VarHandle VH_pTimeDomainIds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimeDomainIds"));

    public VkSwapchainTimeDomainPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainTimeDomainPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimeDomainPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainTimeDomainPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimeDomainPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainTimeDomainPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimeDomainPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainTimeDomainPropertiesEXT alloc(SegmentAllocator allocator) { return new VkSwapchainTimeDomainPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainTimeDomainPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainTimeDomainPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainTimeDomainPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT); }
    public static VkSwapchainTimeDomainPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT);
        return s;
    }
    public VkSwapchainTimeDomainPropertiesEXT copyFrom(VkSwapchainTimeDomainPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainTimeDomainPropertiesEXT reinterpret(long count) { return new VkSwapchainTimeDomainPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainTimeDomainPropertiesEXT asSlice(long index) { return new VkSwapchainTimeDomainPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainTimeDomainPropertiesEXT asSlice(long index, long count) { return new VkSwapchainTimeDomainPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainTimeDomainPropertiesEXT at(long index, Consumer<VkSwapchainTimeDomainPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int timeDomainCountAt(long index) { return (int) VH_timeDomainCount.get(this.segment(), 0L, index); }
    public MemorySegment pTimeDomainsAt(long index) { return (MemorySegment) VH_pTimeDomains.get(this.segment(), 0L, index); }
    public MemorySegment pTimeDomainIdsAt(long index) { return (MemorySegment) VH_pTimeDomainIds.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int timeDomainCount() { return (int) VH_timeDomainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTimeDomains() { return (MemorySegment) VH_pTimeDomains.get(this.segment(), 0L, 0L); }
    public MemorySegment pTimeDomainIds() { return (MemorySegment) VH_pTimeDomainIds.get(this.segment(), 0L, 0L); }
    public VkSwapchainTimeDomainPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT timeDomainCountAt(long index, int value) { VH_timeDomainCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomainsAt(long index, MemorySegment value) { VH_pTimeDomains.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomainIdsAt(long index, MemorySegment value) { VH_pTimeDomainIds.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT timeDomainCount(int value) { VH_timeDomainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomains(MemorySegment value) { VH_pTimeDomains.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomainIds(MemorySegment value) { VH_pTimeDomainIds.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainTimeDomainPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainTimeDomainPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainTimeDomainPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainTimeDomainPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timeDomainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomainCount, index), LAYOUT_timeDomainCount); }
    public MemorySegment _timeDomainCount() { return _timeDomainCountAt(0L); }
    public VkSwapchainTimeDomainPropertiesEXT _timeDomainCountAt(long index, MemorySegment src) { _timeDomainCountAt(index).copyFrom(src); return this; }
    public VkSwapchainTimeDomainPropertiesEXT _timeDomainCount(MemorySegment src) { return _timeDomainCountAt(0L, src); }
    public MemorySegment _pTimeDomainsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTimeDomains, index), LAYOUT_pTimeDomains); }
    public MemorySegment _pTimeDomains() { return _pTimeDomainsAt(0L); }
    public VkSwapchainTimeDomainPropertiesEXT _pTimeDomainsAt(long index, MemorySegment src) { _pTimeDomainsAt(index).copyFrom(src); return this; }
    public VkSwapchainTimeDomainPropertiesEXT _pTimeDomains(MemorySegment src) { return _pTimeDomainsAt(0L, src); }
    public MemorySegment _pTimeDomainIdsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTimeDomainIds, index), LAYOUT_pTimeDomainIds); }
    public MemorySegment _pTimeDomainIds() { return _pTimeDomainIdsAt(0L); }
    public VkSwapchainTimeDomainPropertiesEXT _pTimeDomainIdsAt(long index, MemorySegment src) { _pTimeDomainIdsAt(index).copyFrom(src); return this; }
    public VkSwapchainTimeDomainPropertiesEXT _pTimeDomainIds(MemorySegment src) { return _pTimeDomainIdsAt(0L, src); }
}
