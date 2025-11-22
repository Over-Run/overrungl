// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerCustomBorderColorCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkSamplerCustomBorderColorCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkClearColorValue customBorderColor;
///     VkFormat format;
/// }
/// ```
public final class VkSamplerCustomBorderColorCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("customBorderColor"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_customBorderColor = LAYOUT.byteOffset(PathElement.groupElement("customBorderColor"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_customBorderColor = LAYOUT.select(PathElement.groupElement("customBorderColor"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_customBorderColor$float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColor"), PathElement.groupElement("float32"), PathElement.sequenceElement());
    public static final VarHandle VH_customBorderColor$int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColor"), PathElement.groupElement("int32"), PathElement.sequenceElement());
    public static final VarHandle VH_customBorderColor$uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColor"), PathElement.groupElement("uint32"), PathElement.sequenceElement());
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerCustomBorderColorCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerCustomBorderColorCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerCustomBorderColorCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerCustomBorderColorCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCustomBorderColorCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerCustomBorderColorCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT); }
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT);
        return s;
    }
    public VkSamplerCustomBorderColorCreateInfoEXT copyFrom(VkSamplerCustomBorderColorCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT reinterpret(long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerCustomBorderColorCreateInfoEXT asSlice(long index) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerCustomBorderColorCreateInfoEXT asSlice(long index, long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerCustomBorderColorCreateInfoEXT at(long index, Consumer<VkSamplerCustomBorderColorCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public float customBorderColor$float32At(long index, long index0) { return (float) VH_customBorderColor$float32.get(this.segment(), 0L, index, index0); }
    public int customBorderColor$int32At(long index, long index0) { return (int) VH_customBorderColor$int32.get(this.segment(), 0L, index, index0); }
    public int customBorderColor$uint32At(long index, long index0) { return (int) VH_customBorderColor$uint32.get(this.segment(), 0L, index, index0); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public float customBorderColor$float32(long index0) { return (float) VH_customBorderColor$float32.get(this.segment(), 0L, 0L, index0); }
    public int customBorderColor$int32(long index0) { return (int) VH_customBorderColor$int32.get(this.segment(), 0L, 0L, index0); }
    public int customBorderColor$uint32(long index0) { return (int) VH_customBorderColor$uint32.get(this.segment(), 0L, 0L, index0); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkSamplerCustomBorderColorCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$float32At(long index, long index0, float value) { VH_customBorderColor$float32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$int32At(long index, long index0, int value) { VH_customBorderColor$int32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$uint32At(long index, long index0, int value) { VH_customBorderColor$uint32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$float32(long index0, float value) { VH_customBorderColor$float32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$int32(long index0, int value) { VH_customBorderColor$int32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor$uint32(long index0, int value) { VH_customBorderColor$uint32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerCustomBorderColorCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerCustomBorderColorCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _customBorderColorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customBorderColor, index), LAYOUT_customBorderColor); }
    public MemorySegment _customBorderColor() { return _customBorderColorAt(0L); }
    public VkSamplerCustomBorderColorCreateInfoEXT _customBorderColorAt(long index, MemorySegment src) { _customBorderColorAt(index).copyFrom(src); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT _customBorderColor(MemorySegment src) { return _customBorderColorAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkSamplerCustomBorderColorCreateInfoEXT _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkSamplerCustomBorderColorCreateInfoEXT _format(MemorySegment src) { return _formatAt(0L, src); }
}
