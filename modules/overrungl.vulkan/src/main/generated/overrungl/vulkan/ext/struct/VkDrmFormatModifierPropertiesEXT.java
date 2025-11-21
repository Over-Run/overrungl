// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrmFormatModifierPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkDrmFormatModifierPropertiesEXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags drmFormatModifierTilingFeatures;
/// }
/// ```
public final class VkDrmFormatModifierPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierTilingFeatures")
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

    public VkDrmFormatModifierPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrmFormatModifierPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrmFormatModifierPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrmFormatModifierPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrmFormatModifierPropertiesEXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDrmFormatModifierPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkDrmFormatModifierPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDrmFormatModifierPropertiesEXT copyFrom(VkDrmFormatModifierPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrmFormatModifierPropertiesEXT reinterpret(long count) { return new VkDrmFormatModifierPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrmFormatModifierPropertiesEXT asSlice(long index) { return new VkDrmFormatModifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrmFormatModifierPropertiesEXT asSlice(long index, long count) { return new VkDrmFormatModifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrmFormatModifierPropertiesEXT at(long index, Consumer<VkDrmFormatModifierPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public long drmFormatModifierAt(long index) { return (long) VH_drmFormatModifier.get(this.segment(), 0L, index); }
    public int drmFormatModifierPlaneCountAt(long index) { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, index); }
    public int drmFormatModifierTilingFeaturesAt(long index) { return (int) VH_drmFormatModifierTilingFeatures.get(this.segment(), 0L, index); }
    public long drmFormatModifier() { return (long) VH_drmFormatModifier.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierPlaneCount() { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierTilingFeatures() { return (int) VH_drmFormatModifierTilingFeatures.get(this.segment(), 0L, 0L); }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierAt(long index, long value) { VH_drmFormatModifier.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierPlaneCountAt(long index, int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierTilingFeaturesAt(long index, int value) { VH_drmFormatModifierTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifier(long value) { VH_drmFormatModifier.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierPlaneCount(int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierTilingFeatures(int value) { VH_drmFormatModifierTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _drmFormatModifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifier, index), LAYOUT_drmFormatModifier); }
    public MemorySegment _drmFormatModifier() { return _drmFormatModifierAt(0L); }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifierAt(long index, MemorySegment src) { _drmFormatModifierAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifier(MemorySegment src) { return _drmFormatModifierAt(0L, src); }
    public MemorySegment _drmFormatModifierPlaneCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierPlaneCount, index), LAYOUT_drmFormatModifierPlaneCount); }
    public MemorySegment _drmFormatModifierPlaneCount() { return _drmFormatModifierPlaneCountAt(0L); }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifierPlaneCountAt(long index, MemorySegment src) { _drmFormatModifierPlaneCountAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifierPlaneCount(MemorySegment src) { return _drmFormatModifierPlaneCountAt(0L, src); }
    public MemorySegment _drmFormatModifierTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierTilingFeatures, index), LAYOUT_drmFormatModifierTilingFeatures); }
    public MemorySegment _drmFormatModifierTilingFeatures() { return _drmFormatModifierTilingFeaturesAt(0L); }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifierTilingFeaturesAt(long index, MemorySegment src) { _drmFormatModifierTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesEXT _drmFormatModifierTilingFeatures(MemorySegment src) { return _drmFormatModifierTilingFeaturesAt(0L, src); }
}
