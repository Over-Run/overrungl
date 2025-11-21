// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.sec.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAmigoProfilingSubmitInfoSEC`.
/// ## Layout
/// ```
/// struct VkAmigoProfilingSubmitInfoSEC {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t firstDrawTimestamp;
///     uint64_t swapBufferTimestamp;
/// }
/// ```
public final class VkAmigoProfilingSubmitInfoSEC extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("firstDrawTimestamp"),
        ValueLayout.JAVA_LONG.withName("swapBufferTimestamp")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_firstDrawTimestamp = LAYOUT.byteOffset(PathElement.groupElement("firstDrawTimestamp"));
    public static final long OFFSET_swapBufferTimestamp = LAYOUT.byteOffset(PathElement.groupElement("swapBufferTimestamp"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_firstDrawTimestamp = LAYOUT.select(PathElement.groupElement("firstDrawTimestamp"));
    public static final MemoryLayout LAYOUT_swapBufferTimestamp = LAYOUT.select(PathElement.groupElement("swapBufferTimestamp"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_firstDrawTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstDrawTimestamp"));
    public static final VarHandle VH_swapBufferTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapBufferTimestamp"));

    public VkAmigoProfilingSubmitInfoSEC(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAmigoProfilingSubmitInfoSEC of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment, estimateCount(segment, LAYOUT)); }
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT), 1); }
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator, long count) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT, count), count); }
    public static VkAmigoProfilingSubmitInfoSEC allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.sec.VKSECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC); }
    public static VkAmigoProfilingSubmitInfoSEC allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.sec.VKSECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC);
        return s;
    }
    public VkAmigoProfilingSubmitInfoSEC copyFrom(VkAmigoProfilingSubmitInfoSEC src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAmigoProfilingSubmitInfoSEC reinterpret(long count) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index, long count) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAmigoProfilingSubmitInfoSEC at(long index, Consumer<VkAmigoProfilingSubmitInfoSEC> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long firstDrawTimestampAt(long index) { return (long) VH_firstDrawTimestamp.get(this.segment(), 0L, index); }
    public long swapBufferTimestampAt(long index) { return (long) VH_swapBufferTimestamp.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long firstDrawTimestamp() { return (long) VH_firstDrawTimestamp.get(this.segment(), 0L, 0L); }
    public long swapBufferTimestamp() { return (long) VH_swapBufferTimestamp.get(this.segment(), 0L, 0L); }
    public VkAmigoProfilingSubmitInfoSEC sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestampAt(long index, long value) { VH_firstDrawTimestamp.set(this.segment(), 0L, index, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestampAt(long index, long value) { VH_swapBufferTimestamp.set(this.segment(), 0L, index, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(long value) { VH_firstDrawTimestamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(long value) { VH_swapBufferTimestamp.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAmigoProfilingSubmitInfoSEC _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAmigoProfilingSubmitInfoSEC _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAmigoProfilingSubmitInfoSEC _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAmigoProfilingSubmitInfoSEC _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _firstDrawTimestampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstDrawTimestamp, index), LAYOUT_firstDrawTimestamp); }
    public MemorySegment _firstDrawTimestamp() { return _firstDrawTimestampAt(0L); }
    public VkAmigoProfilingSubmitInfoSEC _firstDrawTimestampAt(long index, MemorySegment src) { _firstDrawTimestampAt(index).copyFrom(src); return this; }
    public VkAmigoProfilingSubmitInfoSEC _firstDrawTimestamp(MemorySegment src) { return _firstDrawTimestampAt(0L, src); }
    public MemorySegment _swapBufferTimestampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapBufferTimestamp, index), LAYOUT_swapBufferTimestamp); }
    public MemorySegment _swapBufferTimestamp() { return _swapBufferTimestampAt(0L); }
    public VkAmigoProfilingSubmitInfoSEC _swapBufferTimestampAt(long index, MemorySegment src) { _swapBufferTimestampAt(index).copyFrom(src); return this; }
    public VkAmigoProfilingSubmitInfoSEC _swapBufferTimestamp(MemorySegment src) { return _swapBufferTimestampAt(0L, src); }
}
