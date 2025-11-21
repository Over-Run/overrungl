// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlanePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlanePropertiesKHR {
///     VkDisplayKHR currentDisplay;
///     uint32_t currentStackIndex;
/// }
/// ```
public final class VkDisplayPlanePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );
    public static final long OFFSET_currentDisplay = LAYOUT.byteOffset(PathElement.groupElement("currentDisplay"));
    public static final long OFFSET_currentStackIndex = LAYOUT.byteOffset(PathElement.groupElement("currentStackIndex"));
    public static final MemoryLayout LAYOUT_currentDisplay = LAYOUT.select(PathElement.groupElement("currentDisplay"));
    public static final MemoryLayout LAYOUT_currentStackIndex = LAYOUT.select(PathElement.groupElement("currentStackIndex"));
    public static final VarHandle VH_currentDisplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentDisplay"));
    public static final VarHandle VH_currentStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentStackIndex"));

    public VkDisplayPlanePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPlanePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPlanePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPlanePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlanePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPlanePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlanePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPlanePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlanePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDisplayPlanePropertiesKHR copyFrom(VkDisplayPlanePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPlanePropertiesKHR reinterpret(long count) { return new VkDisplayPlanePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPlanePropertiesKHR asSlice(long index) { return new VkDisplayPlanePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPlanePropertiesKHR asSlice(long index, long count) { return new VkDisplayPlanePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPlanePropertiesKHR at(long index, Consumer<VkDisplayPlanePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public long currentDisplayAt(long index) { return (long) VH_currentDisplay.get(this.segment(), 0L, index); }
    public int currentStackIndexAt(long index) { return (int) VH_currentStackIndex.get(this.segment(), 0L, index); }
    public long currentDisplay() { return (long) VH_currentDisplay.get(this.segment(), 0L, 0L); }
    public int currentStackIndex() { return (int) VH_currentStackIndex.get(this.segment(), 0L, 0L); }
    public VkDisplayPlanePropertiesKHR currentDisplayAt(long index, long value) { VH_currentDisplay.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlanePropertiesKHR currentStackIndexAt(long index, int value) { VH_currentStackIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPlanePropertiesKHR currentDisplay(long value) { VH_currentDisplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPlanePropertiesKHR currentStackIndex(int value) { VH_currentStackIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _currentDisplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentDisplay, index), LAYOUT_currentDisplay); }
    public MemorySegment _currentDisplay() { return _currentDisplayAt(0L); }
    public VkDisplayPlanePropertiesKHR _currentDisplayAt(long index, MemorySegment src) { _currentDisplayAt(index).copyFrom(src); return this; }
    public VkDisplayPlanePropertiesKHR _currentDisplay(MemorySegment src) { return _currentDisplayAt(0L, src); }
    public MemorySegment _currentStackIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_currentStackIndex, index), LAYOUT_currentStackIndex); }
    public MemorySegment _currentStackIndex() { return _currentStackIndexAt(0L); }
    public VkDisplayPlanePropertiesKHR _currentStackIndexAt(long index, MemorySegment src) { _currentStackIndexAt(index).copyFrom(src); return this; }
    public VkDisplayPlanePropertiesKHR _currentStackIndex(MemorySegment src) { return _currentStackIndexAt(0L, src); }
}
