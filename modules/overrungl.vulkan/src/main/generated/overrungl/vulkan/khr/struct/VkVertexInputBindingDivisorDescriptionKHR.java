// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputBindingDivisorDescriptionKHR`.
/// ## Layout
/// ```
/// struct VkVertexInputBindingDivisorDescriptionKHR {
///     uint32_t binding;
///     uint32_t divisor;
/// }
/// ```
public final class VkVertexInputBindingDivisorDescriptionKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_divisor = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_divisor = LAYOUT.select(PathElement.groupElement("divisor"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_divisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("divisor"));

    public VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVertexInputBindingDivisorDescriptionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVertexInputBindingDivisorDescriptionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVertexInputBindingDivisorDescriptionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputBindingDivisorDescriptionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVertexInputBindingDivisorDescriptionKHR alloc(SegmentAllocator allocator) { return new VkVertexInputBindingDivisorDescriptionKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVertexInputBindingDivisorDescriptionKHR alloc(SegmentAllocator allocator, long count) { return new VkVertexInputBindingDivisorDescriptionKHR(allocator.allocate(LAYOUT, count), count); }
    public VkVertexInputBindingDivisorDescriptionKHR copyFrom(VkVertexInputBindingDivisorDescriptionKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR reinterpret(long count) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVertexInputBindingDivisorDescriptionKHR asSlice(long index) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVertexInputBindingDivisorDescriptionKHR asSlice(long index, long count) { return new VkVertexInputBindingDivisorDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVertexInputBindingDivisorDescriptionKHR at(long index, Consumer<VkVertexInputBindingDivisorDescriptionKHR> func) { func.accept(asSlice(index)); return this; }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int divisorAt(long index) { return (int) VH_divisor.get(this.segment(), 0L, index); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int divisor() { return (int) VH_divisor.get(this.segment(), 0L, 0L); }
    public VkVertexInputBindingDivisorDescriptionKHR bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR divisorAt(long index, int value) { VH_divisor.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR divisor(int value) { VH_divisor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkVertexInputBindingDivisorDescriptionKHR _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _divisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_divisor, index), LAYOUT_divisor); }
    public MemorySegment _divisor() { return _divisorAt(0L); }
    public VkVertexInputBindingDivisorDescriptionKHR _divisorAt(long index, MemorySegment src) { _divisorAt(index).copyFrom(src); return this; }
    public VkVertexInputBindingDivisorDescriptionKHR _divisor(MemorySegment src) { return _divisorAt(0L, src); }
}
