// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoSessionParametersCreateFlagsKHR flags;
///     VkVideoSessionParametersKHR videoSessionParametersTemplate;
///     VkVideoSessionKHR videoSession;
/// }
/// ```
public final class VkVideoSessionParametersCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("videoSessionParametersTemplate"),
        ValueLayout.JAVA_LONG.withName("videoSession")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_videoSessionParametersTemplate = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParametersTemplate"));
    public static final long OFFSET_videoSession = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_videoSessionParametersTemplate = LAYOUT.select(PathElement.groupElement("videoSessionParametersTemplate"));
    public static final MemoryLayout LAYOUT_videoSession = LAYOUT.select(PathElement.groupElement("videoSession"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_videoSessionParametersTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParametersTemplate"));
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));

    public VkVideoSessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoSessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoSessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoSessionParametersCreateInfoKHR copyFrom(VkVideoSessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoSessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoSessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoSessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoSessionParametersCreateInfoKHR at(long index, Consumer<VkVideoSessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long videoSessionParametersTemplateAt(long index) { return (long) VH_videoSessionParametersTemplate.get(this.segment(), 0L, index); }
    public long videoSessionAt(long index) { return (long) VH_videoSession.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long videoSessionParametersTemplate() { return (long) VH_videoSessionParametersTemplate.get(this.segment(), 0L, 0L); }
    public long videoSession() { return (long) VH_videoSession.get(this.segment(), 0L, 0L); }
    public VkVideoSessionParametersCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplateAt(long index, long value) { VH_videoSessionParametersTemplate.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR videoSessionAt(long index, long value) { VH_videoSession.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(long value) { VH_videoSessionParametersTemplate.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionParametersCreateInfoKHR videoSession(long value) { VH_videoSession.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoSessionParametersCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoSessionParametersCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoSessionParametersCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _videoSessionParametersTemplateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoSessionParametersTemplate, index), LAYOUT_videoSessionParametersTemplate); }
    public MemorySegment _videoSessionParametersTemplate() { return _videoSessionParametersTemplateAt(0L); }
    public VkVideoSessionParametersCreateInfoKHR _videoSessionParametersTemplateAt(long index, MemorySegment src) { _videoSessionParametersTemplateAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersCreateInfoKHR _videoSessionParametersTemplate(MemorySegment src) { return _videoSessionParametersTemplateAt(0L, src); }
    public MemorySegment _videoSessionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoSession, index), LAYOUT_videoSession); }
    public MemorySegment _videoSession() { return _videoSessionAt(0L); }
    public VkVideoSessionParametersCreateInfoKHR _videoSessionAt(long index, MemorySegment src) { _videoSessionAt(index).copyFrom(src); return this; }
    public VkVideoSessionParametersCreateInfoKHR _videoSession(MemorySegment src) { return _videoSessionAt(0L, src); }
}
