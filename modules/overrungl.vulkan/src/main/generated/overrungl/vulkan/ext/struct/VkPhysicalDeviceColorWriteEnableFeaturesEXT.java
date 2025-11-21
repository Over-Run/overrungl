// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceColorWriteEnableFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceColorWriteEnableFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 colorWriteEnable;
/// }
/// ```
public final class VkPhysicalDeviceColorWriteEnableFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorWriteEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorWriteEnable = LAYOUT.byteOffset(PathElement.groupElement("colorWriteEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorWriteEnable = LAYOUT.select(PathElement.groupElement("colorWriteEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorWriteEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorWriteEnable"));

    public VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceColorWriteEnableFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceColorWriteEnableFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceColorWriteEnableFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTColorWriteEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT); }
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTColorWriteEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT copyFrom(VkPhysicalDeviceColorWriteEnableFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT at(long index, Consumer<VkPhysicalDeviceColorWriteEnableFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorWriteEnableAt(long index) { return (int) VH_colorWriteEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorWriteEnable() { return (int) VH_colorWriteEnable.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT colorWriteEnableAt(long index, int value) { VH_colorWriteEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT colorWriteEnable(int value) { VH_colorWriteEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorWriteEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorWriteEnable, index), LAYOUT_colorWriteEnable); }
    public MemorySegment _colorWriteEnable() { return _colorWriteEnableAt(0L); }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _colorWriteEnableAt(long index, MemorySegment src) { _colorWriteEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT _colorWriteEnable(MemorySegment src) { return _colorWriteEnableAt(0L, src); }
}
