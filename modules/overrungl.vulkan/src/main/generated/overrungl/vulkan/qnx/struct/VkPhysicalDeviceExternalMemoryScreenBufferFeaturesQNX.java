// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 screenBufferImport;
/// }
/// ```
public final class VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("screenBufferImport")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_screenBufferImport = LAYOUT.byteOffset(PathElement.groupElement("screenBufferImport"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_screenBufferImport = LAYOUT.select(PathElement.groupElement("screenBufferImport"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_screenBufferImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("screenBufferImport"));

    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCREEN_BUFFER_FEATURES_QNX); }
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCREEN_BUFFER_FEATURES_QNX);
        return s;
    }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX copyFrom(VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX asSlice(long index) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX at(long index, Consumer<VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int screenBufferImportAt(long index) { return (int) VH_screenBufferImport.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int screenBufferImport() { return (int) VH_screenBufferImport.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX screenBufferImportAt(long index, int value) { VH_screenBufferImport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX screenBufferImport(int value) { VH_screenBufferImport.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _screenBufferImportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_screenBufferImport, index), LAYOUT_screenBufferImport); }
    public MemorySegment _screenBufferImport() { return _screenBufferImportAt(0L); }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _screenBufferImportAt(long index, MemorySegment src) { _screenBufferImportAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX _screenBufferImport(MemorySegment src) { return _screenBufferImportAt(0L, src); }
}
