// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1ProfileInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1ProfileInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     StdVideoAV1Profile stdProfile;
/// }
/// ```
public final class VkVideoEncodeAV1ProfileInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfile")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stdProfile = LAYOUT.byteOffset(PathElement.groupElement("stdProfile"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stdProfile = LAYOUT.select(PathElement.groupElement("stdProfile"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stdProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfile"));

    public VkVideoEncodeAV1ProfileInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1ProfileInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1ProfileInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1ProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1ProfileInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1ProfileInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1ProfileInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR); }
    public static VkVideoEncodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1ProfileInfoKHR copyFrom(VkVideoEncodeAV1ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1ProfileInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1ProfileInfoKHR asSlice(long index) { return new VkVideoEncodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1ProfileInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1ProfileInfoKHR at(long index, Consumer<VkVideoEncodeAV1ProfileInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stdProfileAt(long index) { return (int) VH_stdProfile.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stdProfile() { return (int) VH_stdProfile.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1ProfileInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR stdProfileAt(long index, int value) { VH_stdProfile.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR stdProfile(int value) { VH_stdProfile.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1ProfileInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1ProfileInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stdProfileAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdProfile, index), LAYOUT_stdProfile); }
    public MemorySegment _stdProfile() { return _stdProfileAt(0L); }
    public VkVideoEncodeAV1ProfileInfoKHR _stdProfileAt(long index, MemorySegment src) { _stdProfileAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1ProfileInfoKHR _stdProfile(MemorySegment src) { return _stdProfileAt(0L, src); }
}
