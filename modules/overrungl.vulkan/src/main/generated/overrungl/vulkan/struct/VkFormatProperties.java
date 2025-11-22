// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFormatProperties`.
/// ## Layout
/// ```
/// struct VkFormatProperties {
///     VkFormatFeatureFlags linearTilingFeatures;
///     VkFormatFeatureFlags optimalTilingFeatures;
///     VkFormatFeatureFlags bufferFeatures;
/// }
/// ```
public final class VkFormatProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("linearTilingFeatures"),
        ValueLayout.JAVA_INT.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_INT.withName("bufferFeatures")
    );
    public static final long OFFSET_linearTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
    public static final long OFFSET_optimalTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
    public static final long OFFSET_bufferFeatures = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
    public static final MemoryLayout LAYOUT_linearTilingFeatures = LAYOUT.select(PathElement.groupElement("linearTilingFeatures"));
    public static final MemoryLayout LAYOUT_optimalTilingFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingFeatures"));
    public static final MemoryLayout LAYOUT_bufferFeatures = LAYOUT.select(PathElement.groupElement("bufferFeatures"));
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    public VkFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFormatProperties alloc(SegmentAllocator allocator) { return new VkFormatProperties(allocator.allocate(LAYOUT), 1); }
    public static VkFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties(allocator.allocate(LAYOUT, count), count); }
    public VkFormatProperties copyFrom(VkFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFormatProperties reinterpret(long count) { return new VkFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFormatProperties asSlice(long index) { return new VkFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFormatProperties asSlice(long index, long count) { return new VkFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFormatProperties at(long index, Consumer<VkFormatProperties> func) { func.accept(asSlice(index)); return this; }
    public int linearTilingFeaturesAt(long index) { return (int) VH_linearTilingFeatures.get(this.segment(), 0L, index); }
    public int optimalTilingFeaturesAt(long index) { return (int) VH_optimalTilingFeatures.get(this.segment(), 0L, index); }
    public int bufferFeaturesAt(long index) { return (int) VH_bufferFeatures.get(this.segment(), 0L, index); }
    public int linearTilingFeatures() { return (int) VH_linearTilingFeatures.get(this.segment(), 0L, 0L); }
    public int optimalTilingFeatures() { return (int) VH_optimalTilingFeatures.get(this.segment(), 0L, 0L); }
    public int bufferFeatures() { return (int) VH_bufferFeatures.get(this.segment(), 0L, 0L); }
    public VkFormatProperties linearTilingFeaturesAt(long index, int value) { VH_linearTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties optimalTilingFeaturesAt(long index, int value) { VH_optimalTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties bufferFeaturesAt(long index, int value) { VH_bufferFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties linearTilingFeatures(int value) { VH_linearTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties optimalTilingFeatures(int value) { VH_optimalTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties bufferFeatures(int value) { VH_bufferFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _linearTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_linearTilingFeatures, index), LAYOUT_linearTilingFeatures); }
    public MemorySegment _linearTilingFeatures() { return _linearTilingFeaturesAt(0L); }
    public VkFormatProperties _linearTilingFeaturesAt(long index, MemorySegment src) { _linearTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties _linearTilingFeatures(MemorySegment src) { return _linearTilingFeaturesAt(0L, src); }
    public MemorySegment _optimalTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalTilingFeatures, index), LAYOUT_optimalTilingFeatures); }
    public MemorySegment _optimalTilingFeatures() { return _optimalTilingFeaturesAt(0L); }
    public VkFormatProperties _optimalTilingFeaturesAt(long index, MemorySegment src) { _optimalTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties _optimalTilingFeatures(MemorySegment src) { return _optimalTilingFeaturesAt(0L, src); }
    public MemorySegment _bufferFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferFeatures, index), LAYOUT_bufferFeatures); }
    public MemorySegment _bufferFeatures() { return _bufferFeaturesAt(0L); }
    public VkFormatProperties _bufferFeaturesAt(long index, MemorySegment src) { _bufferFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties _bufferFeatures(MemorySegment src) { return _bufferFeaturesAt(0L, src); }
}
