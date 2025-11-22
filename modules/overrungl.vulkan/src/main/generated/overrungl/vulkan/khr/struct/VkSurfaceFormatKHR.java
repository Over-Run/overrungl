// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceFormatKHR`.
/// ## Layout
/// ```
/// struct VkSurfaceFormatKHR {
///     VkFormat format;
///     VkColorSpaceKHR colorSpace;
/// }
/// ```
public final class VkSurfaceFormatKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_colorSpace = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_colorSpace = LAYOUT.select(PathElement.groupElement("colorSpace"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace"));

    public VkSurfaceFormatKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceFormatKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceFormatKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormatKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceFormatKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFormatKHR(allocator.allocate(LAYOUT, count), count); }
    public VkSurfaceFormatKHR copyFrom(VkSurfaceFormatKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceFormatKHR reinterpret(long count) { return new VkSurfaceFormatKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceFormatKHR asSlice(long index) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceFormatKHR asSlice(long index, long count) { return new VkSurfaceFormatKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceFormatKHR at(long index, Consumer<VkSurfaceFormatKHR> func) { func.accept(asSlice(index)); return this; }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int colorSpaceAt(long index) { return (int) VH_colorSpace.get(this.segment(), 0L, index); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int colorSpace() { return (int) VH_colorSpace.get(this.segment(), 0L, 0L); }
    public VkSurfaceFormatKHR formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormatKHR colorSpaceAt(long index, int value) { VH_colorSpace.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFormatKHR format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFormatKHR colorSpace(int value) { VH_colorSpace.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkSurfaceFormatKHR _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkSurfaceFormatKHR _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _colorSpaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorSpace, index), LAYOUT_colorSpace); }
    public MemorySegment _colorSpace() { return _colorSpaceAt(0L); }
    public VkSurfaceFormatKHR _colorSpaceAt(long index, MemorySegment src) { _colorSpaceAt(index).copyFrom(src); return this; }
    public VkSurfaceFormatKHR _colorSpace(MemorySegment src) { return _colorSpaceAt(0L, src); }
}
