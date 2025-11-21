// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D maxBlockMatchWindow;
/// }
/// ```
public final class VkPhysicalDeviceImageProcessing2PropertiesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxBlockMatchWindow = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchWindow"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxBlockMatchWindow = LAYOUT.select(PathElement.groupElement("maxBlockMatchWindow"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxBlockMatchWindow$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBlockMatchWindow"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxBlockMatchWindow$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBlockMatchWindow"), PathElement.groupElement("height"));

    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM); }
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
        return s;
    }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM copyFrom(VkPhysicalDeviceImageProcessing2PropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessing2PropertiesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxBlockMatchWindow$widthAt(long index) { return (int) VH_maxBlockMatchWindow$width.get(this.segment(), 0L, index); }
    public int maxBlockMatchWindow$heightAt(long index) { return (int) VH_maxBlockMatchWindow$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxBlockMatchWindow$width() { return (int) VH_maxBlockMatchWindow$width.get(this.segment(), 0L, 0L); }
    public int maxBlockMatchWindow$height() { return (int) VH_maxBlockMatchWindow$height.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow$widthAt(long index, int value) { VH_maxBlockMatchWindow$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow$heightAt(long index, int value) { VH_maxBlockMatchWindow$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow$width(int value) { VH_maxBlockMatchWindow$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow$height(int value) { VH_maxBlockMatchWindow$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxBlockMatchWindowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBlockMatchWindow, index), LAYOUT_maxBlockMatchWindow); }
    public MemorySegment _maxBlockMatchWindow() { return _maxBlockMatchWindowAt(0L); }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _maxBlockMatchWindowAt(long index, MemorySegment src) { _maxBlockMatchWindowAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM _maxBlockMatchWindow(MemorySegment src) { return _maxBlockMatchWindowAt(0L, src); }
}
