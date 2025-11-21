// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVariablePointerFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVariablePointerFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
/// }
/// ```
public final class VkPhysicalDeviceVariablePointerFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_variablePointersStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final long OFFSET_variablePointers = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_variablePointersStorageBuffer = LAYOUT.select(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final MemoryLayout LAYOUT_variablePointers = LAYOUT.select(PathElement.groupElement("variablePointers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));

    public VkPhysicalDeviceVariablePointerFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVariablePointerFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVariablePointerFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVariablePointerFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVariablePointerFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVariablePointerFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVariablePointerFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVariablePointerFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES); }
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVariablePointerFeatures copyFrom(VkPhysicalDeviceVariablePointerFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVariablePointerFeatures reinterpret(long count) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVariablePointerFeatures asSlice(long index) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVariablePointerFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVariablePointerFeatures at(long index, Consumer<VkPhysicalDeviceVariablePointerFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int variablePointersStorageBufferAt(long index) { return (int) VH_variablePointersStorageBuffer.get(this.segment(), 0L, index); }
    public int variablePointersAt(long index) { return (int) VH_variablePointers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int variablePointersStorageBuffer() { return (int) VH_variablePointersStorageBuffer.get(this.segment(), 0L, 0L); }
    public int variablePointers() { return (int) VH_variablePointers.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVariablePointerFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBufferAt(long index, int value) { VH_variablePointersStorageBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures variablePointersAt(long index, int value) { VH_variablePointers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBuffer(int value) { VH_variablePointersStorageBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVariablePointerFeatures variablePointers(int value) { VH_variablePointers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVariablePointerFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVariablePointerFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVariablePointerFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVariablePointerFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _variablePointersStorageBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variablePointersStorageBuffer, index), LAYOUT_variablePointersStorageBuffer); }
    public MemorySegment _variablePointersStorageBuffer() { return _variablePointersStorageBufferAt(0L); }
    public VkPhysicalDeviceVariablePointerFeatures _variablePointersStorageBufferAt(long index, MemorySegment src) { _variablePointersStorageBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVariablePointerFeatures _variablePointersStorageBuffer(MemorySegment src) { return _variablePointersStorageBufferAt(0L, src); }
    public MemorySegment _variablePointersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variablePointers, index), LAYOUT_variablePointers); }
    public MemorySegment _variablePointers() { return _variablePointersAt(0L); }
    public VkPhysicalDeviceVariablePointerFeatures _variablePointersAt(long index, MemorySegment src) { _variablePointersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVariablePointerFeatures _variablePointers(MemorySegment src) { return _variablePointersAt(0L, src); }
}
