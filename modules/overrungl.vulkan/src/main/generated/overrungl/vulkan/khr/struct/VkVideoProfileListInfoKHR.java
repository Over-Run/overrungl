// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoProfileListInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoProfileListInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t profileCount;
///     const VkVideoProfileInfoKHR* pProfiles;
/// }
/// ```
public final class VkVideoProfileListInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("profileCount"),
        ValueLayout.ADDRESS.withName("pProfiles")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_profileCount = LAYOUT.byteOffset(PathElement.groupElement("profileCount"));
    public static final long OFFSET_pProfiles = LAYOUT.byteOffset(PathElement.groupElement("pProfiles"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_profileCount = LAYOUT.select(PathElement.groupElement("profileCount"));
    public static final MemoryLayout LAYOUT_pProfiles = LAYOUT.select(PathElement.groupElement("pProfiles"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_profileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profileCount"));
    public static final VarHandle VH_pProfiles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfiles"));

    public VkVideoProfileListInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoProfileListInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoProfileListInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoProfileListInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoProfileListInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileListInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoProfileListInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoProfileListInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR); }
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR);
        return s;
    }
    public VkVideoProfileListInfoKHR copyFrom(VkVideoProfileListInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoProfileListInfoKHR reinterpret(long count) { return new VkVideoProfileListInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoProfileListInfoKHR asSlice(long index) { return new VkVideoProfileListInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoProfileListInfoKHR asSlice(long index, long count) { return new VkVideoProfileListInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoProfileListInfoKHR at(long index, Consumer<VkVideoProfileListInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int profileCountAt(long index) { return (int) VH_profileCount.get(this.segment(), 0L, index); }
    public MemorySegment pProfilesAt(long index) { return (MemorySegment) VH_pProfiles.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int profileCount() { return (int) VH_profileCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pProfiles() { return (MemorySegment) VH_pProfiles.get(this.segment(), 0L, 0L); }
    public VkVideoProfileListInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileListInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileListInfoKHR profileCountAt(long index, int value) { VH_profileCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileListInfoKHR pProfilesAt(long index, MemorySegment value) { VH_pProfiles.set(this.segment(), 0L, index, value); return this; }
    public VkVideoProfileListInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileListInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileListInfoKHR profileCount(int value) { VH_profileCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoProfileListInfoKHR pProfiles(MemorySegment value) { VH_pProfiles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoProfileListInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoProfileListInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoProfileListInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoProfileListInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _profileCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_profileCount, index), LAYOUT_profileCount); }
    public MemorySegment _profileCount() { return _profileCountAt(0L); }
    public VkVideoProfileListInfoKHR _profileCountAt(long index, MemorySegment src) { _profileCountAt(index).copyFrom(src); return this; }
    public VkVideoProfileListInfoKHR _profileCount(MemorySegment src) { return _profileCountAt(0L, src); }
    public MemorySegment _pProfilesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pProfiles, index), LAYOUT_pProfiles); }
    public MemorySegment _pProfiles() { return _pProfilesAt(0L); }
    public VkVideoProfileListInfoKHR _pProfilesAt(long index, MemorySegment src) { _pProfilesAt(index).copyFrom(src); return this; }
    public VkVideoProfileListInfoKHR _pProfiles(MemorySegment src) { return _pProfilesAt(0L, src); }
}
