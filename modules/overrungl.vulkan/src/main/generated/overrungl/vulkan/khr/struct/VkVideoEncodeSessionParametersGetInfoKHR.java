// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionParametersGetInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionParametersGetInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoSessionParametersKHR videoSessionParameters;
/// }
/// ```
public final class VkVideoEncodeSessionParametersGetInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("videoSessionParameters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoSessionParameters = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParameters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoSessionParameters = LAYOUT.select(PathElement.groupElement("videoSessionParameters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoSessionParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParameters"));

    public VkVideoEncodeSessionParametersGetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeSessionParametersGetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeSessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeSessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeSessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionParametersGetInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeSessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeSessionParametersGetInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR); }
    public static VkVideoEncodeSessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR);
        return s;
    }
    public VkVideoEncodeSessionParametersGetInfoKHR copyFrom(VkVideoEncodeSessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR reinterpret(long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeSessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeSessionParametersGetInfoKHR asSlice(long index, long count) { return new VkVideoEncodeSessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeSessionParametersGetInfoKHR at(long index, Consumer<VkVideoEncodeSessionParametersGetInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long videoSessionParametersAt(long index) { return (long) VH_videoSessionParameters.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long videoSessionParameters() { return (long) VH_videoSessionParameters.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeSessionParametersGetInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR videoSessionParametersAt(long index, long value) { VH_videoSessionParameters.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR videoSessionParameters(long value) { VH_videoSessionParameters.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeSessionParametersGetInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeSessionParametersGetInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoSessionParametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoSessionParameters, index), LAYOUT_videoSessionParameters); }
    public MemorySegment _videoSessionParameters() { return _videoSessionParametersAt(0L); }
    public VkVideoEncodeSessionParametersGetInfoKHR _videoSessionParametersAt(long index, MemorySegment src) { _videoSessionParametersAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersGetInfoKHR _videoSessionParameters(MemorySegment src) { return _videoSessionParametersAt(0L, src); }
}
