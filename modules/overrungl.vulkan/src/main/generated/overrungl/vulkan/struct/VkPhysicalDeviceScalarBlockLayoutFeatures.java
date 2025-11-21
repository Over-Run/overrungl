// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceScalarBlockLayoutFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceScalarBlockLayoutFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 scalarBlockLayout;
/// }
/// ```
public final class VkPhysicalDeviceScalarBlockLayoutFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalarBlockLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_scalarBlockLayout = LAYOUT.byteOffset(PathElement.groupElement("scalarBlockLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_scalarBlockLayout = LAYOUT.select(PathElement.groupElement("scalarBlockLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_scalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalarBlockLayout"));

    public VkPhysicalDeviceScalarBlockLayoutFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceScalarBlockLayoutFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceScalarBlockLayoutFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceScalarBlockLayoutFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceScalarBlockLayoutFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceScalarBlockLayoutFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES); }
    public static VkPhysicalDeviceScalarBlockLayoutFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES);
        return s;
    }
    public VkPhysicalDeviceScalarBlockLayoutFeatures copyFrom(VkPhysicalDeviceScalarBlockLayoutFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures reinterpret(long count) { return new VkPhysicalDeviceScalarBlockLayoutFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures asSlice(long index) { return new VkPhysicalDeviceScalarBlockLayoutFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures asSlice(long index, long count) { return new VkPhysicalDeviceScalarBlockLayoutFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures at(long index, Consumer<VkPhysicalDeviceScalarBlockLayoutFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int scalarBlockLayoutAt(long index) { return (int) VH_scalarBlockLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int scalarBlockLayout() { return (int) VH_scalarBlockLayout.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures scalarBlockLayoutAt(long index, int value) { VH_scalarBlockLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures scalarBlockLayout(int value) { VH_scalarBlockLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _scalarBlockLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scalarBlockLayout, index), LAYOUT_scalarBlockLayout); }
    public MemorySegment _scalarBlockLayout() { return _scalarBlockLayoutAt(0L); }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _scalarBlockLayoutAt(long index, MemorySegment src) { _scalarBlockLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceScalarBlockLayoutFeatures _scalarBlockLayout(MemorySegment src) { return _scalarBlockLayoutAt(0L, src); }
}
