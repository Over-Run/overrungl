// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputBindingDescription`.
/// ## Layout
/// ```
/// struct VkVertexInputBindingDescription {
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
/// }
/// ```
public final class VkVertexInputBindingDescription extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final long OFFSET_inputRate = LAYOUT.byteOffset(PathElement.groupElement("inputRate"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_inputRate = LAYOUT.select(PathElement.groupElement("inputRate"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    public static final VarHandle VH_inputRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputRate"));

    public VkVertexInputBindingDescription(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVertexInputBindingDescription of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment, estimateCount(segment, LAYOUT)); }
    public static VkVertexInputBindingDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVertexInputBindingDescription ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDescription(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVertexInputBindingDescription alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDescription(allocator.allocate(LAYOUT), 1); }
    public static VkVertexInputBindingDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDescription(allocator.allocate(LAYOUT, count), count); }
    public VkVertexInputBindingDescription copyFrom(VkVertexInputBindingDescription src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVertexInputBindingDescription reinterpret(long count) { return new VkVertexInputBindingDescription(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVertexInputBindingDescription asSlice(long index) { return new VkVertexInputBindingDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVertexInputBindingDescription asSlice(long index, long count) { return new VkVertexInputBindingDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVertexInputBindingDescription at(long index, Consumer<VkVertexInputBindingDescription> func) { func.accept(asSlice(index)); return this; }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public int inputRateAt(long index) { return (int) VH_inputRate.get(this.segment(), 0L, index); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public int inputRate() { return (int) VH_inputRate.get(this.segment(), 0L, 0L); }
    public VkVertexInputBindingDescription bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription inputRateAt(long index, int value) { VH_inputRate.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDescription binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDescription inputRate(int value) { VH_inputRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkVertexInputBindingDescription _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkVertexInputBindingDescription _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription _stride(MemorySegment src) { return _strideAt(0L, src); }
    public MemorySegment _inputRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputRate, index), LAYOUT_inputRate); }
    public MemorySegment _inputRate() { return _inputRateAt(0L); }
    public VkVertexInputBindingDescription _inputRateAt(long index, MemorySegment src) { _inputRateAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDescription _inputRate(MemorySegment src) { return _inputRateAt(0L, src); }
}
