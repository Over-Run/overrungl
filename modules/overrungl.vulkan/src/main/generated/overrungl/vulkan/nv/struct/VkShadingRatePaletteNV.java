// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShadingRatePaletteNV`.
/// ## Layout
/// ```
/// struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount;
///     const VkShadingRatePaletteEntryNV* pShadingRatePaletteEntries;
/// }
/// ```
public final class VkShadingRatePaletteNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePaletteEntries")
    );
    public static final long OFFSET_shadingRatePaletteEntryCount = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteEntryCount"));
    public static final long OFFSET_pShadingRatePaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePaletteEntries"));
    public static final MemoryLayout LAYOUT_shadingRatePaletteEntryCount = LAYOUT.select(PathElement.groupElement("shadingRatePaletteEntryCount"));
    public static final MemoryLayout LAYOUT_pShadingRatePaletteEntries = LAYOUT.select(PathElement.groupElement("pShadingRatePaletteEntries"));
    public static final VarHandle VH_shadingRatePaletteEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteEntryCount"));
    public static final VarHandle VH_pShadingRatePaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePaletteEntries"));

    public VkShadingRatePaletteNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShadingRatePaletteNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT), 1); }
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator, long count) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT, count), count); }
    public VkShadingRatePaletteNV copyFrom(VkShadingRatePaletteNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShadingRatePaletteNV reinterpret(long count) { return new VkShadingRatePaletteNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShadingRatePaletteNV asSlice(long index) { return new VkShadingRatePaletteNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShadingRatePaletteNV asSlice(long index, long count) { return new VkShadingRatePaletteNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShadingRatePaletteNV at(long index, Consumer<VkShadingRatePaletteNV> func) { func.accept(asSlice(index)); return this; }
    public int shadingRatePaletteEntryCountAt(long index) { return (int) VH_shadingRatePaletteEntryCount.get(this.segment(), 0L, index); }
    public MemorySegment pShadingRatePaletteEntriesAt(long index) { return (MemorySegment) VH_pShadingRatePaletteEntries.get(this.segment(), 0L, index); }
    public int shadingRatePaletteEntryCount() { return (int) VH_shadingRatePaletteEntryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pShadingRatePaletteEntries() { return (MemorySegment) VH_pShadingRatePaletteEntries.get(this.segment(), 0L, 0L); }
    public VkShadingRatePaletteNV shadingRatePaletteEntryCountAt(long index, int value) { VH_shadingRatePaletteEntryCount.set(this.segment(), 0L, index, value); return this; }
    public VkShadingRatePaletteNV pShadingRatePaletteEntriesAt(long index, MemorySegment value) { VH_pShadingRatePaletteEntries.set(this.segment(), 0L, index, value); return this; }
    public VkShadingRatePaletteNV shadingRatePaletteEntryCount(int value) { VH_shadingRatePaletteEntryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(MemorySegment value) { VH_pShadingRatePaletteEntries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _shadingRatePaletteEntryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRatePaletteEntryCount, index), LAYOUT_shadingRatePaletteEntryCount); }
    public MemorySegment _shadingRatePaletteEntryCount() { return _shadingRatePaletteEntryCountAt(0L); }
    public VkShadingRatePaletteNV _shadingRatePaletteEntryCountAt(long index, MemorySegment src) { _shadingRatePaletteEntryCountAt(index).copyFrom(src); return this; }
    public VkShadingRatePaletteNV _shadingRatePaletteEntryCount(MemorySegment src) { return _shadingRatePaletteEntryCountAt(0L, src); }
    public MemorySegment _pShadingRatePaletteEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pShadingRatePaletteEntries, index), LAYOUT_pShadingRatePaletteEntries); }
    public MemorySegment _pShadingRatePaletteEntries() { return _pShadingRatePaletteEntriesAt(0L); }
    public VkShadingRatePaletteNV _pShadingRatePaletteEntriesAt(long index, MemorySegment src) { _pShadingRatePaletteEntriesAt(index).copyFrom(src); return this; }
    public VkShadingRatePaletteNV _pShadingRatePaletteEntries(MemorySegment src) { return _pShadingRatePaletteEntriesAt(0L, src); }
}
