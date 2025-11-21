// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplaySurfaceStereoCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkDisplaySurfaceStereoCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplaySurfaceStereoTypeNV stereoType;
/// }
/// ```
public final class VkDisplaySurfaceStereoCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stereoType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stereoType = LAYOUT.byteOffset(PathElement.groupElement("stereoType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stereoType = LAYOUT.select(PathElement.groupElement("stereoType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stereoType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stereoType"));

    public VkDisplaySurfaceStereoCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplaySurfaceStereoCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplaySurfaceStereoCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplaySurfaceStereoCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplaySurfaceStereoCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDisplaySurfaceStereoCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkDisplaySurfaceStereoCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDisplaySurfaceStereoCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplaySurfaceStereoCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV); }
    public static VkDisplaySurfaceStereoCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV);
        return s;
    }
    public VkDisplaySurfaceStereoCreateInfoNV copyFrom(VkDisplaySurfaceStereoCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV reinterpret(long count) { return new VkDisplaySurfaceStereoCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplaySurfaceStereoCreateInfoNV asSlice(long index) { return new VkDisplaySurfaceStereoCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplaySurfaceStereoCreateInfoNV asSlice(long index, long count) { return new VkDisplaySurfaceStereoCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplaySurfaceStereoCreateInfoNV at(long index, Consumer<VkDisplaySurfaceStereoCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stereoTypeAt(long index) { return (int) VH_stereoType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stereoType() { return (int) VH_stereoType.get(this.segment(), 0L, 0L); }
    public VkDisplaySurfaceStereoCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV stereoTypeAt(long index, int value) { VH_stereoType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV stereoType(int value) { VH_stereoType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplaySurfaceStereoCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplaySurfaceStereoCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stereoTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stereoType, index), LAYOUT_stereoType); }
    public MemorySegment _stereoType() { return _stereoTypeAt(0L); }
    public VkDisplaySurfaceStereoCreateInfoNV _stereoTypeAt(long index, MemorySegment src) { _stereoTypeAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceStereoCreateInfoNV _stereoType(MemorySegment src) { return _stereoTypeAt(0L, src); }
}
