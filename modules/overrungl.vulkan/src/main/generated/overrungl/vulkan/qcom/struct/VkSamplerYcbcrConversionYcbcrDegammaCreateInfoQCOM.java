// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 enableYDegamma;
///     VkBool32 enableCbCrDegamma;
/// }
/// ```
public final class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_enableYDegamma = LAYOUT.byteOffset(PathElement.groupElement("enableYDegamma"));
    public static final long OFFSET_enableCbCrDegamma = LAYOUT.byteOffset(PathElement.groupElement("enableCbCrDegamma"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_enableYDegamma = LAYOUT.select(PathElement.groupElement("enableYDegamma"));
    public static final MemoryLayout LAYOUT_enableCbCrDegamma = LAYOUT.select(PathElement.groupElement("enableCbCrDegamma"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_enableYDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableYDegamma"));
    public static final VarHandle VH_enableCbCrDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableCbCrDegamma"));

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM); }
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
        return s;
    }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM copyFrom(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM reinterpret(long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM asSlice(long index) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM asSlice(long index, long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM at(long index, Consumer<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int enableYDegammaAt(long index) { return (int) VH_enableYDegamma.get(this.segment(), 0L, index); }
    public int enableCbCrDegammaAt(long index) { return (int) VH_enableCbCrDegamma.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int enableYDegamma() { return (int) VH_enableYDegamma.get(this.segment(), 0L, 0L); }
    public int enableCbCrDegamma() { return (int) VH_enableCbCrDegamma.get(this.segment(), 0L, 0L); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegammaAt(long index, int value) { VH_enableYDegamma.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegammaAt(long index, int value) { VH_enableCbCrDegamma.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(int value) { VH_enableYDegamma.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(int value) { VH_enableCbCrDegamma.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _enableYDegammaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enableYDegamma, index), LAYOUT_enableYDegamma); }
    public MemorySegment _enableYDegamma() { return _enableYDegammaAt(0L); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _enableYDegammaAt(long index, MemorySegment src) { _enableYDegammaAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _enableYDegamma(MemorySegment src) { return _enableYDegammaAt(0L, src); }
    public MemorySegment _enableCbCrDegammaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enableCbCrDegamma, index), LAYOUT_enableCbCrDegamma); }
    public MemorySegment _enableCbCrDegamma() { return _enableCbCrDegammaAt(0L); }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _enableCbCrDegammaAt(long index, MemorySegment src) { _enableCbCrDegammaAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM _enableCbCrDegamma(MemorySegment src) { return _enableCbCrDegammaAt(0L, src); }
}
