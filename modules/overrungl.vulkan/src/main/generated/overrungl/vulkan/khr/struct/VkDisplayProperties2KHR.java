// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayProperties2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDisplayPropertiesKHR displayProperties;
/// }
/// ```
public final class VkDisplayProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPropertiesKHR.LAYOUT.withName("displayProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_displayProperties = LAYOUT.byteOffset(PathElement.groupElement("displayProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_displayProperties = LAYOUT.select(PathElement.groupElement("displayProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_displayProperties$display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("display"));
    public static final VarHandle VH_displayProperties$displayName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("displayName"));
    public static final VarHandle VH_displayProperties$physicalDimensions$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("physicalDimensions"), PathElement.groupElement("width"));
    public static final VarHandle VH_displayProperties$physicalDimensions$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("physicalDimensions"), PathElement.groupElement("height"));
    public static final VarHandle VH_displayProperties$physicalResolution$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("physicalResolution"), PathElement.groupElement("width"));
    public static final VarHandle VH_displayProperties$physicalResolution$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("physicalResolution"), PathElement.groupElement("height"));
    public static final VarHandle VH_displayProperties$supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("supportedTransforms"));
    public static final VarHandle VH_displayProperties$planeReorderPossible = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("planeReorderPossible"));
    public static final VarHandle VH_displayProperties$persistentContent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayProperties"), PathElement.groupElement("persistentContent"));

    public VkDisplayProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR); }
    public static VkDisplayProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR);
        return s;
    }
    public VkDisplayProperties2KHR copyFrom(VkDisplayProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayProperties2KHR reinterpret(long count) { return new VkDisplayProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayProperties2KHR asSlice(long index) { return new VkDisplayProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayProperties2KHR asSlice(long index, long count) { return new VkDisplayProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayProperties2KHR at(long index, Consumer<VkDisplayProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long displayProperties$displayAt(long index) { return (long) VH_displayProperties$display.get(this.segment(), 0L, index); }
    public MemorySegment displayProperties$displayNameAt(long index) { return (MemorySegment) VH_displayProperties$displayName.get(this.segment(), 0L, index); }
    public int displayProperties$physicalDimensions$widthAt(long index) { return (int) VH_displayProperties$physicalDimensions$width.get(this.segment(), 0L, index); }
    public int displayProperties$physicalDimensions$heightAt(long index) { return (int) VH_displayProperties$physicalDimensions$height.get(this.segment(), 0L, index); }
    public int displayProperties$physicalResolution$widthAt(long index) { return (int) VH_displayProperties$physicalResolution$width.get(this.segment(), 0L, index); }
    public int displayProperties$physicalResolution$heightAt(long index) { return (int) VH_displayProperties$physicalResolution$height.get(this.segment(), 0L, index); }
    public int displayProperties$supportedTransformsAt(long index) { return (int) VH_displayProperties$supportedTransforms.get(this.segment(), 0L, index); }
    public int displayProperties$planeReorderPossibleAt(long index) { return (int) VH_displayProperties$planeReorderPossible.get(this.segment(), 0L, index); }
    public int displayProperties$persistentContentAt(long index) { return (int) VH_displayProperties$persistentContent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long displayProperties$display() { return (long) VH_displayProperties$display.get(this.segment(), 0L, 0L); }
    public MemorySegment displayProperties$displayName() { return (MemorySegment) VH_displayProperties$displayName.get(this.segment(), 0L, 0L); }
    public int displayProperties$physicalDimensions$width() { return (int) VH_displayProperties$physicalDimensions$width.get(this.segment(), 0L, 0L); }
    public int displayProperties$physicalDimensions$height() { return (int) VH_displayProperties$physicalDimensions$height.get(this.segment(), 0L, 0L); }
    public int displayProperties$physicalResolution$width() { return (int) VH_displayProperties$physicalResolution$width.get(this.segment(), 0L, 0L); }
    public int displayProperties$physicalResolution$height() { return (int) VH_displayProperties$physicalResolution$height.get(this.segment(), 0L, 0L); }
    public int displayProperties$supportedTransforms() { return (int) VH_displayProperties$supportedTransforms.get(this.segment(), 0L, 0L); }
    public int displayProperties$planeReorderPossible() { return (int) VH_displayProperties$planeReorderPossible.get(this.segment(), 0L, 0L); }
    public int displayProperties$persistentContent() { return (int) VH_displayProperties$persistentContent.get(this.segment(), 0L, 0L); }
    public VkDisplayProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$displayAt(long index, long value) { VH_displayProperties$display.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$displayNameAt(long index, MemorySegment value) { VH_displayProperties$displayName.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalDimensions$widthAt(long index, int value) { VH_displayProperties$physicalDimensions$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalDimensions$heightAt(long index, int value) { VH_displayProperties$physicalDimensions$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalResolution$widthAt(long index, int value) { VH_displayProperties$physicalResolution$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalResolution$heightAt(long index, int value) { VH_displayProperties$physicalResolution$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$supportedTransformsAt(long index, int value) { VH_displayProperties$supportedTransforms.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$planeReorderPossibleAt(long index, int value) { VH_displayProperties$planeReorderPossible.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR displayProperties$persistentContentAt(long index, int value) { VH_displayProperties$persistentContent.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$display(long value) { VH_displayProperties$display.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$displayName(MemorySegment value) { VH_displayProperties$displayName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalDimensions$width(int value) { VH_displayProperties$physicalDimensions$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalDimensions$height(int value) { VH_displayProperties$physicalDimensions$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalResolution$width(int value) { VH_displayProperties$physicalResolution$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$physicalResolution$height(int value) { VH_displayProperties$physicalResolution$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$supportedTransforms(int value) { VH_displayProperties$supportedTransforms.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$planeReorderPossible(int value) { VH_displayProperties$planeReorderPossible.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayProperties2KHR displayProperties$persistentContent(int value) { VH_displayProperties$persistentContent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displayPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayProperties, index), LAYOUT_displayProperties); }
    public MemorySegment _displayProperties() { return _displayPropertiesAt(0L); }
    public VkDisplayProperties2KHR _displayPropertiesAt(long index, MemorySegment src) { _displayPropertiesAt(index).copyFrom(src); return this; }
    public VkDisplayProperties2KHR _displayProperties(MemorySegment src) { return _displayPropertiesAt(0L, src); }
}
