// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputBindingDescription2EXT`.
/// ## Layout
/// ```
/// struct VkVertexInputBindingDescription2EXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
///     uint32_t divisor;
/// }
/// ```
public final class VkVertexInputBindingDescription2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final long OFFSET_inputRate = LAYOUT.byteOffset(PathElement.groupElement("inputRate"));
    public static final long OFFSET_divisor = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_inputRate = LAYOUT.select(PathElement.groupElement("inputRate"));
    public static final MemoryLayout LAYOUT_divisor = LAYOUT.select(PathElement.groupElement("divisor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    public static final VarHandle VH_inputRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputRate"));
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    public VkVertexInputBindingDescription2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVertexInputBindingDescription2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkVertexInputBindingDescription2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVertexInputBindingDescription2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVertexInputBindingDescription2EXT alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDescription2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkVertexInputBindingDescription2EXT alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDescription2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkVertexInputBindingDescription2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT); }
    public static VkVertexInputBindingDescription2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT);
        return s;
    }
    public VkVertexInputBindingDescription2EXT copyFrom(VkVertexInputBindingDescription2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVertexInputBindingDescription2EXT reinterpret(long count) { return new VkVertexInputBindingDescription2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVertexInputBindingDescription2EXT asSlice(long index) { return new VkVertexInputBindingDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVertexInputBindingDescription2EXT asSlice(long index, long count) { return new VkVertexInputBindingDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVertexInputBindingDescription2EXT at(long index, Consumer<VkVertexInputBindingDescription2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public int inputRateAt(long index) { return (int) VH_inputRate.get(this.segment(), 0L, index); }
    public int divisorAt(long index) { return (int) VH_divisor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public int inputRate() { return (int) VH_inputRate.get(this.segment(), 0L, 0L); }
    public int divisor() { return (int) VH_divisor.get(this.segment(), 0L, 0L); }
    public VkVertexInputBindingDescription2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT inputRateAt(long index, int value) { VH_inputRate.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT divisorAt(long index, int value) { VH_divisor.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription2EXT binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription2EXT stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription2EXT inputRate(int value) { VH_inputRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription2EXT divisor(int value) { VH_divisor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVertexInputBindingDescription2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVertexInputBindingDescription2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkVertexInputBindingDescription2EXT _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkVertexInputBindingDescription2EXT _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _stride(MemorySegment src) { return _strideAt(0L, src); }
    public MemorySegment _inputRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputRate, index), LAYOUT_inputRate); }
    public MemorySegment _inputRate() { return _inputRateAt(0L); }
    public VkVertexInputBindingDescription2EXT _inputRateAt(long index, MemorySegment src) { _inputRateAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _inputRate(MemorySegment src) { return _inputRateAt(0L, src); }
    public MemorySegment _divisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_divisor, index), LAYOUT_divisor); }
    public MemorySegment _divisor() { return _divisorAt(0L); }
    public VkVertexInputBindingDescription2EXT _divisorAt(long index, MemorySegment src) { _divisorAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription2EXT _divisor(MemorySegment src) { return _divisorAt(0L, src); }
}
