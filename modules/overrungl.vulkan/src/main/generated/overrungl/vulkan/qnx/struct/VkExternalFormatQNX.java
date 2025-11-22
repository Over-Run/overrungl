// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalFormatQNX`.
/// ## Layout
/// ```
/// struct VkExternalFormatQNX {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t externalFormat;
/// }
/// ```
public final class VkExternalFormatQNX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("externalFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));

    public VkExternalFormatQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalFormatQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalFormatQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalFormatQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT), 1); }
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator, long count) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalFormatQNX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_QNX); }
    public static VkExternalFormatQNX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_QNX);
        return s;
    }
    public VkExternalFormatQNX copyFrom(VkExternalFormatQNX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalFormatQNX reinterpret(long count) { return new VkExternalFormatQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalFormatQNX asSlice(long index) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalFormatQNX asSlice(long index, long count) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalFormatQNX at(long index, Consumer<VkExternalFormatQNX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long externalFormatAt(long index) { return (long) VH_externalFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long externalFormat() { return (long) VH_externalFormat.get(this.segment(), 0L, 0L); }
    public VkExternalFormatQNX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatQNX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatQNX externalFormatAt(long index, long value) { VH_externalFormat.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatQNX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatQNX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatQNX externalFormat(long value) { VH_externalFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalFormatQNX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalFormatQNX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalFormatQNX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalFormatQNX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormat, index), LAYOUT_externalFormat); }
    public MemorySegment _externalFormat() { return _externalFormatAt(0L); }
    public VkExternalFormatQNX _externalFormatAt(long index, MemorySegment src) { _externalFormatAt(index).copyFrom(src); return this; }
    public VkExternalFormatQNX _externalFormat(MemorySegment src) { return _externalFormatAt(0L, src); }
}
