// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCalibratedTimestampInfoEXT`.
/// ## Layout
/// ```
/// struct VkCalibratedTimestampInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkTimeDomainKHR timeDomain;
/// }
/// ```
public final class VkCalibratedTimestampInfoEXT extends GroupType {
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

    public VkCalibratedTimestampInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCalibratedTimestampInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCalibratedTimestampInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCalibratedTimestampInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCalibratedTimestampInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCalibratedTimestampInfoEXT alloc(SegmentAllocator allocator) { return new VkCalibratedTimestampInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCalibratedTimestampInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCalibratedTimestampInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCalibratedTimestampInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
    public static VkCalibratedTimestampInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR);
        return s;
    }
    public VkCalibratedTimestampInfoEXT copyFrom(VkCalibratedTimestampInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCalibratedTimestampInfoEXT reinterpret(long count) { return new VkCalibratedTimestampInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCalibratedTimestampInfoEXT asSlice(long index) { return new VkCalibratedTimestampInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCalibratedTimestampInfoEXT asSlice(long index, long count) { return new VkCalibratedTimestampInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCalibratedTimestampInfoEXT at(long index, Consumer<VkCalibratedTimestampInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int timeDomainAt(long index) { return (int) VH_timeDomain.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int timeDomain() { return (int) VH_timeDomain.get(this.segment(), 0L, 0L); }
    public VkCalibratedTimestampInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoEXT timeDomainAt(long index, int value) { VH_timeDomain.set(this.segment(), 0L, index, value); return this; }
    public VkCalibratedTimestampInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCalibratedTimestampInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCalibratedTimestampInfoEXT timeDomain(int value) { VH_timeDomain.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCalibratedTimestampInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCalibratedTimestampInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timeDomainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomain, index), LAYOUT_timeDomain); }
    public MemorySegment _timeDomain() { return _timeDomainAt(0L); }
    public VkCalibratedTimestampInfoEXT _timeDomainAt(long index, MemorySegment src) { _timeDomainAt(index).copyFrom(src); return this; }
    public VkCalibratedTimestampInfoEXT _timeDomain(MemorySegment src) { return _timeDomainAt(0L, src); }
}
