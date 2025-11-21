// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFormatProperties3`.
/// ## Layout
/// ```
/// struct VkFormatProperties3 {
///     VkStructureType sType;
///     void* pNext;
///     VkFormatFeatureFlags2 linearTilingFeatures;
///     VkFormatFeatureFlags2 optimalTilingFeatures;
///     VkFormatFeatureFlags2 bufferFeatures;
/// }
/// ```
public final class VkFormatProperties3 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("linearTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("bufferFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_linearTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
    public static final long OFFSET_optimalTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
    public static final long OFFSET_bufferFeatures = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_linearTilingFeatures = LAYOUT.select(PathElement.groupElement("linearTilingFeatures"));
    public static final MemoryLayout LAYOUT_optimalTilingFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingFeatures"));
    public static final MemoryLayout LAYOUT_bufferFeatures = LAYOUT.select(PathElement.groupElement("bufferFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    public VkFormatProperties3(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFormatProperties3 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment, estimateCount(segment, LAYOUT)); }
    public static VkFormatProperties3 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFormatProperties3 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFormatProperties3 alloc(SegmentAllocator allocator) { return new VkFormatProperties3(allocator.allocate(LAYOUT), 1); }
    public static VkFormatProperties3 alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties3(allocator.allocate(LAYOUT, count), count); }
    public static VkFormatProperties3 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3); }
    public static VkFormatProperties3 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3);
        return s;
    }
    public VkFormatProperties3 copyFrom(VkFormatProperties3 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFormatProperties3 reinterpret(long count) { return new VkFormatProperties3(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFormatProperties3 asSlice(long index) { return new VkFormatProperties3(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFormatProperties3 asSlice(long index, long count) { return new VkFormatProperties3(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFormatProperties3 at(long index, Consumer<VkFormatProperties3> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long linearTilingFeaturesAt(long index) { return (long) VH_linearTilingFeatures.get(this.segment(), 0L, index); }
    public long optimalTilingFeaturesAt(long index) { return (long) VH_optimalTilingFeatures.get(this.segment(), 0L, index); }
    public long bufferFeaturesAt(long index) { return (long) VH_bufferFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long linearTilingFeatures() { return (long) VH_linearTilingFeatures.get(this.segment(), 0L, 0L); }
    public long optimalTilingFeatures() { return (long) VH_optimalTilingFeatures.get(this.segment(), 0L, 0L); }
    public long bufferFeatures() { return (long) VH_bufferFeatures.get(this.segment(), 0L, 0L); }
    public VkFormatProperties3 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties3 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties3 linearTilingFeaturesAt(long index, long value) { VH_linearTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties3 optimalTilingFeaturesAt(long index, long value) { VH_optimalTilingFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties3 bufferFeaturesAt(long index, long value) { VH_bufferFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkFormatProperties3 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties3 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties3 linearTilingFeatures(long value) { VH_linearTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties3 optimalTilingFeatures(long value) { VH_optimalTilingFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkFormatProperties3 bufferFeatures(long value) { VH_bufferFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFormatProperties3 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFormatProperties3 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFormatProperties3 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFormatProperties3 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _linearTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_linearTilingFeatures, index), LAYOUT_linearTilingFeatures); }
    public MemorySegment _linearTilingFeatures() { return _linearTilingFeaturesAt(0L); }
    public VkFormatProperties3 _linearTilingFeaturesAt(long index, MemorySegment src) { _linearTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties3 _linearTilingFeatures(MemorySegment src) { return _linearTilingFeaturesAt(0L, src); }
    public MemorySegment _optimalTilingFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalTilingFeatures, index), LAYOUT_optimalTilingFeatures); }
    public MemorySegment _optimalTilingFeatures() { return _optimalTilingFeaturesAt(0L); }
    public VkFormatProperties3 _optimalTilingFeaturesAt(long index, MemorySegment src) { _optimalTilingFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties3 _optimalTilingFeatures(MemorySegment src) { return _optimalTilingFeaturesAt(0L, src); }
    public MemorySegment _bufferFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferFeatures, index), LAYOUT_bufferFeatures); }
    public MemorySegment _bufferFeatures() { return _bufferFeaturesAt(0L); }
    public VkFormatProperties3 _bufferFeaturesAt(long index, MemorySegment src) { _bufferFeaturesAt(index).copyFrom(src); return this; }
    public VkFormatProperties3 _bufferFeatures(MemorySegment src) { return _bufferFeaturesAt(0L, src); }
}
