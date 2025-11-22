// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerYcbcrConversionInfoKHR`.
/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSamplerYcbcrConversion conversion;
/// }
/// ```
public final class VkSamplerYcbcrConversionInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("conversion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_conversion = LAYOUT.byteOffset(PathElement.groupElement("conversion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_conversion = LAYOUT.select(PathElement.groupElement("conversion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_conversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conversion"));

    public VkSamplerYcbcrConversionInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerYcbcrConversionInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerYcbcrConversionInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerYcbcrConversionInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerYcbcrConversionInfoKHR alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerYcbcrConversionInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerYcbcrConversionInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO); }
    public static VkSamplerYcbcrConversionInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO);
        return s;
    }
    public VkSamplerYcbcrConversionInfoKHR copyFrom(VkSamplerYcbcrConversionInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerYcbcrConversionInfoKHR reinterpret(long count) { return new VkSamplerYcbcrConversionInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerYcbcrConversionInfoKHR asSlice(long index) { return new VkSamplerYcbcrConversionInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerYcbcrConversionInfoKHR asSlice(long index, long count) { return new VkSamplerYcbcrConversionInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerYcbcrConversionInfoKHR at(long index, Consumer<VkSamplerYcbcrConversionInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long conversionAt(long index) { return (long) VH_conversion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long conversion() { return (long) VH_conversion.get(this.segment(), 0L, 0L); }
    public VkSamplerYcbcrConversionInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionInfoKHR conversionAt(long index, long value) { VH_conversion.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionInfoKHR conversion(long value) { VH_conversion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerYcbcrConversionInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerYcbcrConversionInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _conversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conversion, index), LAYOUT_conversion); }
    public MemorySegment _conversion() { return _conversionAt(0L); }
    public VkSamplerYcbcrConversionInfoKHR _conversionAt(long index, MemorySegment src) { _conversionAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionInfoKHR _conversion(MemorySegment src) { return _conversionAt(0L, src); }
}
