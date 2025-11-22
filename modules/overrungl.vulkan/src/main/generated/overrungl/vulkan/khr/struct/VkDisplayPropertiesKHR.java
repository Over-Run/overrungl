// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayPropertiesKHR {
///     VkDisplayKHR display;
///     const char* displayName;
///     VkExtent2D physicalDimensions;
///     VkExtent2D physicalResolution;
///     VkSurfaceTransformFlagsKHR supportedTransforms;
///     VkBool32 planeReorderPossible;
///     VkBool32 persistentContent;
/// }
/// ```
public final class VkDisplayPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("display"),
        ValueLayout.ADDRESS.withName("displayName"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalDimensions"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalResolution"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("planeReorderPossible"),
        ValueLayout.JAVA_INT.withName("persistentContent")
    );
    public static final long OFFSET_display = LAYOUT.byteOffset(PathElement.groupElement("display"));
    public static final long OFFSET_displayName = LAYOUT.byteOffset(PathElement.groupElement("displayName"));
    public static final long OFFSET_physicalDimensions = LAYOUT.byteOffset(PathElement.groupElement("physicalDimensions"));
    public static final long OFFSET_physicalResolution = LAYOUT.byteOffset(PathElement.groupElement("physicalResolution"));
    public static final long OFFSET_supportedTransforms = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
    public static final long OFFSET_planeReorderPossible = LAYOUT.byteOffset(PathElement.groupElement("planeReorderPossible"));
    public static final long OFFSET_persistentContent = LAYOUT.byteOffset(PathElement.groupElement("persistentContent"));
    public static final MemoryLayout LAYOUT_display = LAYOUT.select(PathElement.groupElement("display"));
    public static final MemoryLayout LAYOUT_displayName = LAYOUT.select(PathElement.groupElement("displayName"));
    public static final MemoryLayout LAYOUT_physicalDimensions = LAYOUT.select(PathElement.groupElement("physicalDimensions"));
    public static final MemoryLayout LAYOUT_physicalResolution = LAYOUT.select(PathElement.groupElement("physicalResolution"));
    public static final MemoryLayout LAYOUT_supportedTransforms = LAYOUT.select(PathElement.groupElement("supportedTransforms"));
    public static final MemoryLayout LAYOUT_planeReorderPossible = LAYOUT.select(PathElement.groupElement("planeReorderPossible"));
    public static final MemoryLayout LAYOUT_persistentContent = LAYOUT.select(PathElement.groupElement("persistentContent"));
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    public static final VarHandle VH_displayName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayName"));
    public static final VarHandle VH_physicalDimensions$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDimensions"), PathElement.groupElement("width"));
    public static final VarHandle VH_physicalDimensions$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDimensions"), PathElement.groupElement("height"));
    public static final VarHandle VH_physicalResolution$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalResolution"), PathElement.groupElement("width"));
    public static final VarHandle VH_physicalResolution$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalResolution"), PathElement.groupElement("height"));
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    public static final VarHandle VH_planeReorderPossible = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeReorderPossible"));
    public static final VarHandle VH_persistentContent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistentContent"));

    public VkDisplayPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDisplayPropertiesKHR copyFrom(VkDisplayPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPropertiesKHR reinterpret(long count) { return new VkDisplayPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPropertiesKHR asSlice(long index) { return new VkDisplayPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPropertiesKHR asSlice(long index, long count) { return new VkDisplayPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPropertiesKHR at(long index, Consumer<VkDisplayPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public long displayAt(long index) { return (long) VH_display.get(this.segment(), 0L, index); }
    public MemorySegment displayNameAt(long index) { return (MemorySegment) VH_displayName.get(this.segment(), 0L, index); }
    public int physicalDimensions$widthAt(long index) { return (int) VH_physicalDimensions$width.get(this.segment(), 0L, index); }
    public int physicalDimensions$heightAt(long index) { return (int) VH_physicalDimensions$height.get(this.segment(), 0L, index); }
    public int physicalResolution$widthAt(long index) { return (int) VH_physicalResolution$width.get(this.segment(), 0L, index); }
    public int physicalResolution$heightAt(long index) { return (int) VH_physicalResolution$height.get(this.segment(), 0L, index); }
    public int supportedTransformsAt(long index) { return (int) VH_supportedTransforms.get(this.segment(), 0L, index); }
    public int planeReorderPossibleAt(long index) { return (int) VH_planeReorderPossible.get(this.segment(), 0L, index); }
    public int persistentContentAt(long index) { return (int) VH_persistentContent.get(this.segment(), 0L, index); }
    public long display() { return (long) VH_display.get(this.segment(), 0L, 0L); }
    public MemorySegment displayName() { return (MemorySegment) VH_displayName.get(this.segment(), 0L, 0L); }
    public int physicalDimensions$width() { return (int) VH_physicalDimensions$width.get(this.segment(), 0L, 0L); }
    public int physicalDimensions$height() { return (int) VH_physicalDimensions$height.get(this.segment(), 0L, 0L); }
    public int physicalResolution$width() { return (int) VH_physicalResolution$width.get(this.segment(), 0L, 0L); }
    public int physicalResolution$height() { return (int) VH_physicalResolution$height.get(this.segment(), 0L, 0L); }
    public int supportedTransforms() { return (int) VH_supportedTransforms.get(this.segment(), 0L, 0L); }
    public int planeReorderPossible() { return (int) VH_planeReorderPossible.get(this.segment(), 0L, 0L); }
    public int persistentContent() { return (int) VH_persistentContent.get(this.segment(), 0L, 0L); }
    public VkDisplayPropertiesKHR displayAt(long index, long value) { VH_display.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR displayNameAt(long index, MemorySegment value) { VH_displayName.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR physicalDimensions$widthAt(long index, int value) { VH_physicalDimensions$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR physicalDimensions$heightAt(long index, int value) { VH_physicalDimensions$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR physicalResolution$widthAt(long index, int value) { VH_physicalResolution$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR physicalResolution$heightAt(long index, int value) { VH_physicalResolution$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR supportedTransformsAt(long index, int value) { VH_supportedTransforms.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR planeReorderPossibleAt(long index, int value) { VH_planeReorderPossible.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR persistentContentAt(long index, int value) { VH_persistentContent.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPropertiesKHR display(long value) { VH_display.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR displayName(MemorySegment value) { VH_displayName.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR physicalDimensions$width(int value) { VH_physicalDimensions$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR physicalDimensions$height(int value) { VH_physicalDimensions$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR physicalResolution$width(int value) { VH_physicalResolution$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR physicalResolution$height(int value) { VH_physicalResolution$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR supportedTransforms(int value) { VH_supportedTransforms.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR planeReorderPossible(int value) { VH_planeReorderPossible.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPropertiesKHR persistentContent(int value) { VH_persistentContent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _displayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_display, index), LAYOUT_display); }
    public MemorySegment _display() { return _displayAt(0L); }
    public VkDisplayPropertiesKHR _displayAt(long index, MemorySegment src) { _displayAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _display(MemorySegment src) { return _displayAt(0L, src); }
    public MemorySegment _displayNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayName, index), LAYOUT_displayName); }
    public MemorySegment _displayName() { return _displayNameAt(0L); }
    public VkDisplayPropertiesKHR _displayNameAt(long index, MemorySegment src) { _displayNameAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _displayName(MemorySegment src) { return _displayNameAt(0L, src); }
    public MemorySegment _physicalDimensionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDimensions, index), LAYOUT_physicalDimensions); }
    public MemorySegment _physicalDimensions() { return _physicalDimensionsAt(0L); }
    public VkDisplayPropertiesKHR _physicalDimensionsAt(long index, MemorySegment src) { _physicalDimensionsAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _physicalDimensions(MemorySegment src) { return _physicalDimensionsAt(0L, src); }
    public MemorySegment _physicalResolutionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalResolution, index), LAYOUT_physicalResolution); }
    public MemorySegment _physicalResolution() { return _physicalResolutionAt(0L); }
    public VkDisplayPropertiesKHR _physicalResolutionAt(long index, MemorySegment src) { _physicalResolutionAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _physicalResolution(MemorySegment src) { return _physicalResolutionAt(0L, src); }
    public MemorySegment _supportedTransformsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedTransforms, index), LAYOUT_supportedTransforms); }
    public MemorySegment _supportedTransforms() { return _supportedTransformsAt(0L); }
    public VkDisplayPropertiesKHR _supportedTransformsAt(long index, MemorySegment src) { _supportedTransformsAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _supportedTransforms(MemorySegment src) { return _supportedTransformsAt(0L, src); }
    public MemorySegment _planeReorderPossibleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_planeReorderPossible, index), LAYOUT_planeReorderPossible); }
    public MemorySegment _planeReorderPossible() { return _planeReorderPossibleAt(0L); }
    public VkDisplayPropertiesKHR _planeReorderPossibleAt(long index, MemorySegment src) { _planeReorderPossibleAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _planeReorderPossible(MemorySegment src) { return _planeReorderPossibleAt(0L, src); }
    public MemorySegment _persistentContentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_persistentContent, index), LAYOUT_persistentContent); }
    public MemorySegment _persistentContent() { return _persistentContentAt(0L); }
    public VkDisplayPropertiesKHR _persistentContentAt(long index, MemorySegment src) { _persistentContentAt(index).copyFrom(src); return this; }
    public VkDisplayPropertiesKHR _persistentContent(MemorySegment src) { return _persistentContentAt(0L, src); }
}
