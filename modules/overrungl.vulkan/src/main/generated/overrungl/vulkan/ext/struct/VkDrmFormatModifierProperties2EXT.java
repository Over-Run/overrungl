// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrmFormatModifierProperties2EXT`.
/// ## Layout
/// ```
/// struct VkDrmFormatModifierProperties2EXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags2 drmFormatModifierTilingFeatures;
/// }
/// ```
public final class VkDrmFormatModifierProperties2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifierTilingFeatures")
    );
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    public static final long OFFSET_drmFormatModifierPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final long OFFSET_drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    public static final MemoryLayout LAYOUT_drmFormatModifierPlaneCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final MemoryLayout LAYOUT_drmFormatModifierTilingFeatures = LAYOUT.select(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final VarHandle VH_drmFormatModifierTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierTilingFeatures"));

    public VkDrmFormatModifierProperties2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrmFormatModifierProperties2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator, long count) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT, count), count); }
    public VkDrmFormatModifierProperties2EXT copyFrom(VkDrmFormatModifierProperties2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrmFormatModifierProperties2EXT reinterpret(long count) { return new VkDrmFormatModifierProperties2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrmFormatModifierProperties2EXT asSlice(long index) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrmFormatModifierProperties2EXT asSlice(long index, long count) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrmFormatModifierProperties2EXT at(long index, Consumer<VkDrmFormatModifierProperties2EXT> func) { func.accept(asSlice(index)); return this; }
    public long drmFormatModifierAt(long index) { return (long) VH_drmFormatModifier.get(this.segment(), 0L, index); }
    public int drmFormatModifierPlaneCountAt(long index) { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, index); }
    public long drmFormatModifierTilingFeaturesAt(long index) { return (long) VH_drmFormatModifierTilingFeatures.get(this.segment(), 0L, index); }
    public long drmFormatModifier() { return (long) VH_drmFormatModifier.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierPlaneCount() { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, 0L); }
    public long drmFormatModifierTilingFeatures() { return (long) VH_drmFormatModifierTilingFeatures.get(this.segment(), 0L, 0L); }
    public VkDrmFormatModifierProperties2EXT drmFormatModifierAt(long index, long value) { VH_drmFormatModifier.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCountAt(long index, int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeaturesAt(long index, long value) { VH_drmFormatModifierTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierProperties2EXT drmFormatModifier(long value) { VH_drmFormatModifier.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCount(int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeatures(long value) { VH_drmFormatModifierTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _drmFormatModifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifier, index), LAYOUT_drmFormatModifier); }
    public MemorySegment _drmFormatModifier() { return _drmFormatModifierAt(0L); }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifierAt(long index, MemorySegment src) { _drmFormatModifierAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifier(MemorySegment src) { return _drmFormatModifierAt(0L, src); }
    public MemorySegment _drmFormatModifierPlaneCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierPlaneCount, index), LAYOUT_drmFormatModifierPlaneCount); }
    public MemorySegment _drmFormatModifierPlaneCount() { return _drmFormatModifierPlaneCountAt(0L); }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifierPlaneCountAt(long index, MemorySegment src) { _drmFormatModifierPlaneCountAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifierPlaneCount(MemorySegment src) { return _drmFormatModifierPlaneCountAt(0L, src); }
    public MemorySegment _drmFormatModifierTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierTilingFeatures, index), LAYOUT_drmFormatModifierTilingFeatures); }
    public MemorySegment _drmFormatModifierTilingFeatures() { return _drmFormatModifierTilingFeaturesAt(0L); }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifierTilingFeaturesAt(long index, MemorySegment src) { _drmFormatModifierTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierProperties2EXT _drmFormatModifierTilingFeatures(MemorySegment src) { return _drmFormatModifierTilingFeaturesAt(0L, src); }
}
