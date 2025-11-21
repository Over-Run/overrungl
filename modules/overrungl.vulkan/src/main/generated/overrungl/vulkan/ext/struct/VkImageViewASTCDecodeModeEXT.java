// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewASTCDecodeModeEXT`.
/// ## Layout
/// ```
/// struct VkImageViewASTCDecodeModeEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat decodeMode;
/// }
/// ```
public final class VkImageViewASTCDecodeModeEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_decodeMode = LAYOUT.byteOffset(PathElement.groupElement("decodeMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_decodeMode = LAYOUT.select(PathElement.groupElement("decodeMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_decodeMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decodeMode"));

    public VkImageViewASTCDecodeModeEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewASTCDecodeModeEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewASTCDecodeModeEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewASTCDecodeModeEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewASTCDecodeModeEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewASTCDecodeModeEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewASTCDecodeModeEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewASTCDecodeModeEXT alloc(SegmentAllocator allocator) { return new VkImageViewASTCDecodeModeEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewASTCDecodeModeEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewASTCDecodeModeEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewASTCDecodeModeEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT); }
    public static VkImageViewASTCDecodeModeEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTAstcDecodeMode.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
        return s;
    }
    public VkImageViewASTCDecodeModeEXT copyFrom(VkImageViewASTCDecodeModeEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewASTCDecodeModeEXT reinterpret(long count) { return new VkImageViewASTCDecodeModeEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewASTCDecodeModeEXT asSlice(long index) { return new VkImageViewASTCDecodeModeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewASTCDecodeModeEXT asSlice(long index, long count) { return new VkImageViewASTCDecodeModeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewASTCDecodeModeEXT at(long index, Consumer<VkImageViewASTCDecodeModeEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int decodeModeAt(long index) { return (int) VH_decodeMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int decodeMode() { return (int) VH_decodeMode.get(this.segment(), 0L, 0L); }
    public VkImageViewASTCDecodeModeEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewASTCDecodeModeEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewASTCDecodeModeEXT decodeModeAt(long index, int value) { VH_decodeMode.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewASTCDecodeModeEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewASTCDecodeModeEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewASTCDecodeModeEXT decodeMode(int value) { VH_decodeMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewASTCDecodeModeEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewASTCDecodeModeEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewASTCDecodeModeEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewASTCDecodeModeEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _decodeModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decodeMode, index), LAYOUT_decodeMode); }
    public MemorySegment _decodeMode() { return _decodeModeAt(0L); }
    public VkImageViewASTCDecodeModeEXT _decodeModeAt(long index, MemorySegment src) { _decodeModeAt(index).copyFrom(src); return this; }
    public VkImageViewASTCDecodeModeEXT _decodeMode(MemorySegment src) { return _decodeModeAt(0L, src); }
}
