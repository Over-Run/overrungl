// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImagelessFramebufferFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImagelessFramebufferFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imagelessFramebuffer;
/// }
/// ```
public final class VkPhysicalDeviceImagelessFramebufferFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imagelessFramebuffer")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imagelessFramebuffer = LAYOUT.byteOffset(PathElement.groupElement("imagelessFramebuffer"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imagelessFramebuffer = LAYOUT.select(PathElement.groupElement("imagelessFramebuffer"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagelessFramebuffer"));

    public VkPhysicalDeviceImagelessFramebufferFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImagelessFramebufferFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImagelessFramebufferFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImagelessFramebufferFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImagelessFramebufferFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImagelessFramebufferFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES); }
    public static VkPhysicalDeviceImagelessFramebufferFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES);
        return s;
    }
    public VkPhysicalDeviceImagelessFramebufferFeatures copyFrom(VkPhysicalDeviceImagelessFramebufferFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures reinterpret(long count) { return new VkPhysicalDeviceImagelessFramebufferFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImagelessFramebufferFeatures asSlice(long index) { return new VkPhysicalDeviceImagelessFramebufferFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImagelessFramebufferFeatures asSlice(long index, long count) { return new VkPhysicalDeviceImagelessFramebufferFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImagelessFramebufferFeatures at(long index, Consumer<VkPhysicalDeviceImagelessFramebufferFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imagelessFramebufferAt(long index) { return (int) VH_imagelessFramebuffer.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imagelessFramebuffer() { return (int) VH_imagelessFramebuffer.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImagelessFramebufferFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures imagelessFramebufferAt(long index, int value) { VH_imagelessFramebuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures imagelessFramebuffer(int value) { VH_imagelessFramebuffer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImagelessFramebufferFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImagelessFramebufferFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imagelessFramebufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imagelessFramebuffer, index), LAYOUT_imagelessFramebuffer); }
    public MemorySegment _imagelessFramebuffer() { return _imagelessFramebufferAt(0L); }
    public VkPhysicalDeviceImagelessFramebufferFeatures _imagelessFramebufferAt(long index, MemorySegment src) { _imagelessFramebufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImagelessFramebufferFeatures _imagelessFramebuffer(MemorySegment src) { return _imagelessFramebufferAt(0L, src); }
}
