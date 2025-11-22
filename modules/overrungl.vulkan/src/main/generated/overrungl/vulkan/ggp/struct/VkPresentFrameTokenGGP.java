// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ggp.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentFrameTokenGGP`.
/// ## Layout
/// ```
/// struct VkPresentFrameTokenGGP {
///     VkStructureType sType;
///     const void* pNext;
///     GgpFrameToken frameToken;
/// }
/// ```
public final class VkPresentFrameTokenGGP extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("frameToken")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_frameToken = LAYOUT.byteOffset(PathElement.groupElement("frameToken"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_frameToken = LAYOUT.select(PathElement.groupElement("frameToken"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_frameToken = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameToken"));

    public VkPresentFrameTokenGGP(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentFrameTokenGGP of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentFrameTokenGGP ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentFrameTokenGGP ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentFrameTokenGGP alloc(SegmentAllocator allocator) { return new VkPresentFrameTokenGGP(allocator.allocate(LAYOUT), 1); }
    public static VkPresentFrameTokenGGP alloc(SegmentAllocator allocator, long count) { return new VkPresentFrameTokenGGP(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentFrameTokenGGP allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ggp.VKGGPFrameToken.VK_STRUCTURE_TYPE_PRESENT_FRAME_TOKEN_GGP); }
    public static VkPresentFrameTokenGGP allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ggp.VKGGPFrameToken.VK_STRUCTURE_TYPE_PRESENT_FRAME_TOKEN_GGP);
        return s;
    }
    public VkPresentFrameTokenGGP copyFrom(VkPresentFrameTokenGGP src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentFrameTokenGGP reinterpret(long count) { return new VkPresentFrameTokenGGP(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentFrameTokenGGP asSlice(long index) { return new VkPresentFrameTokenGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentFrameTokenGGP asSlice(long index, long count) { return new VkPresentFrameTokenGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentFrameTokenGGP at(long index, Consumer<VkPresentFrameTokenGGP> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int frameTokenAt(long index) { return (int) VH_frameToken.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int frameToken() { return (int) VH_frameToken.get(this.segment(), 0L, 0L); }
    public VkPresentFrameTokenGGP sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentFrameTokenGGP pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentFrameTokenGGP frameTokenAt(long index, int value) { VH_frameToken.set(this.segment(), 0L, index, value); return this; }
    public VkPresentFrameTokenGGP sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentFrameTokenGGP pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentFrameTokenGGP frameToken(int value) { VH_frameToken.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentFrameTokenGGP _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentFrameTokenGGP _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentFrameTokenGGP _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentFrameTokenGGP _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _frameTokenAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameToken, index), LAYOUT_frameToken); }
    public MemorySegment _frameToken() { return _frameTokenAt(0L); }
    public VkPresentFrameTokenGGP _frameTokenAt(long index, MemorySegment src) { _frameTokenAt(index).copyFrom(src); return this; }
    public VkPresentFrameTokenGGP _frameToken(MemorySegment src) { return _frameTokenAt(0L, src); }
}
