// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCalibratedTimestampInfoKHR`.
/// ## Layout
/// ```
/// struct VkCalibratedTimestampInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkTimeDomainKHR timeDomain;
/// }
/// ```
public final class VkCalibratedTimestampInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timeDomain")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_timeDomain = LAYOUT.byteOffset(PathElement.groupElement("timeDomain"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_timeDomain = LAYOUT.select(PathElement.groupElement("timeDomain"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_timeDomain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomain"));

    public VkCalibratedTimestampInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCalibratedTimestampInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCalibratedTimestampInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCalibratedTimestampInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCalibratedTimestampInfoKHR alloc(SegmentAllocator allocator) { return new VkCalibratedTimestampInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCalibratedTimestampInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCalibratedTimestampInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCalibratedTimestampInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
    public static VkCalibratedTimestampInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR);
        return s;
    }
    public VkCalibratedTimestampInfoKHR copyFrom(VkCalibratedTimestampInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCalibratedTimestampInfoKHR reinterpret(long count) { return new VkCalibratedTimestampInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCalibratedTimestampInfoKHR asSlice(long index) { return new VkCalibratedTimestampInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCalibratedTimestampInfoKHR asSlice(long index, long count) { return new VkCalibratedTimestampInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCalibratedTimestampInfoKHR at(long index, Consumer<VkCalibratedTimestampInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int timeDomainAt(long index) { return (int) VH_timeDomain.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int timeDomain() { return (int) VH_timeDomain.get(this.segment(), 0L, 0L); }
    public VkCalibratedTimestampInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoKHR timeDomainAt(long index, int value) { VH_timeDomain.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCalibratedTimestampInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCalibratedTimestampInfoKHR timeDomain(int value) { VH_timeDomain.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCalibratedTimestampInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCalibratedTimestampInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timeDomainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomain, index), LAYOUT_timeDomain); }
    public MemorySegment _timeDomain() { return _timeDomainAt(0L); }
    public VkCalibratedTimestampInfoKHR _timeDomainAt(long index, MemorySegment src) { _timeDomainAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoKHR _timeDomain(MemorySegment src) { return _timeDomainAt(0L, src); }
}
