// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTexelBufferAlignmentProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTexelBufferAlignmentProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// }
/// ```
public final class VkPhysicalDeviceTexelBufferAlignmentProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final long OFFSET_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final long OFFSET_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final long OFFSET_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));

    public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES); }
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceTexelBufferAlignmentProperties copyFrom(VkPhysicalDeviceTexelBufferAlignmentProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties reinterpret(long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties asSlice(long index) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties asSlice(long index, long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties at(long index, Consumer<VkPhysicalDeviceTexelBufferAlignmentProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long storageTexelBufferOffsetAlignmentBytesAt(long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, index); }
    public int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, index); }
    public long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, index); }
    public int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long storageTexelBufferOffsetAlignmentBytes() { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, 0L); }
    public int storageTexelBufferOffsetSingleTexelAlignment() { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, 0L); }
    public long uniformTexelBufferOffsetAlignmentBytes() { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, 0L); }
    public int uniformTexelBufferOffsetSingleTexelAlignment() { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytesAt(long index, long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytesAt(long index, long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytes(long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignment(int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytes(long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignment(int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _storageTexelBufferOffsetAlignmentBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageTexelBufferOffsetAlignmentBytes, index), LAYOUT_storageTexelBufferOffsetAlignmentBytes); }
    public MemorySegment _storageTexelBufferOffsetAlignmentBytes() { return _storageTexelBufferOffsetAlignmentBytesAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _storageTexelBufferOffsetAlignmentBytesAt(long index, MemorySegment src) { _storageTexelBufferOffsetAlignmentBytesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _storageTexelBufferOffsetAlignmentBytes(MemorySegment src) { return _storageTexelBufferOffsetAlignmentBytesAt(0L, src); }
    public MemorySegment _storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageTexelBufferOffsetSingleTexelAlignment, index), LAYOUT_storageTexelBufferOffsetSingleTexelAlignment); }
    public MemorySegment _storageTexelBufferOffsetSingleTexelAlignment() { return _storageTexelBufferOffsetSingleTexelAlignmentAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _storageTexelBufferOffsetSingleTexelAlignmentAt(long index, MemorySegment src) { _storageTexelBufferOffsetSingleTexelAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _storageTexelBufferOffsetSingleTexelAlignment(MemorySegment src) { return _storageTexelBufferOffsetSingleTexelAlignmentAt(0L, src); }
    public MemorySegment _uniformTexelBufferOffsetAlignmentBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformTexelBufferOffsetAlignmentBytes, index), LAYOUT_uniformTexelBufferOffsetAlignmentBytes); }
    public MemorySegment _uniformTexelBufferOffsetAlignmentBytes() { return _uniformTexelBufferOffsetAlignmentBytesAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _uniformTexelBufferOffsetAlignmentBytesAt(long index, MemorySegment src) { _uniformTexelBufferOffsetAlignmentBytesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _uniformTexelBufferOffsetAlignmentBytes(MemorySegment src) { return _uniformTexelBufferOffsetAlignmentBytesAt(0L, src); }
    public MemorySegment _uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformTexelBufferOffsetSingleTexelAlignment, index), LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment); }
    public MemorySegment _uniformTexelBufferOffsetSingleTexelAlignment() { return _uniformTexelBufferOffsetSingleTexelAlignmentAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, MemorySegment src) { _uniformTexelBufferOffsetSingleTexelAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentProperties _uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment src) { return _uniformTexelBufferOffsetSingleTexelAlignmentAt(0L, src); }
}
