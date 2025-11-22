// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDecompressMemoryRegionEXT`.
/// ## Layout
/// ```
/// struct VkDecompressMemoryRegionEXT {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize compressedSize;
///     VkDeviceSize decompressedSize;
/// }
/// ```
public final class VkDecompressMemoryRegionEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize")
    );
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    public static final long OFFSET_compressedSize = LAYOUT.byteOffset(PathElement.groupElement("compressedSize"));
    public static final long OFFSET_decompressedSize = LAYOUT.byteOffset(PathElement.groupElement("decompressedSize"));
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    public static final MemoryLayout LAYOUT_compressedSize = LAYOUT.select(PathElement.groupElement("compressedSize"));
    public static final MemoryLayout LAYOUT_decompressedSize = LAYOUT.select(PathElement.groupElement("decompressedSize"));
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    public static final VarHandle VH_compressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedSize"));
    public static final VarHandle VH_decompressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressedSize"));

    public VkDecompressMemoryRegionEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDecompressMemoryRegionEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDecompressMemoryRegionEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDecompressMemoryRegionEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDecompressMemoryRegionEXT alloc(SegmentAllocator allocator) { return new VkDecompressMemoryRegionEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDecompressMemoryRegionEXT alloc(SegmentAllocator allocator, long count) { return new VkDecompressMemoryRegionEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDecompressMemoryRegionEXT copyFrom(VkDecompressMemoryRegionEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDecompressMemoryRegionEXT reinterpret(long count) { return new VkDecompressMemoryRegionEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDecompressMemoryRegionEXT asSlice(long index) { return new VkDecompressMemoryRegionEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDecompressMemoryRegionEXT asSlice(long index, long count) { return new VkDecompressMemoryRegionEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDecompressMemoryRegionEXT at(long index, Consumer<VkDecompressMemoryRegionEXT> func) { func.accept(asSlice(index)); return this; }
    public long srcAddressAt(long index) { return (long) VH_srcAddress.get(this.segment(), 0L, index); }
    public long dstAddressAt(long index) { return (long) VH_dstAddress.get(this.segment(), 0L, index); }
    public long compressedSizeAt(long index) { return (long) VH_compressedSize.get(this.segment(), 0L, index); }
    public long decompressedSizeAt(long index) { return (long) VH_decompressedSize.get(this.segment(), 0L, index); }
    public long srcAddress() { return (long) VH_srcAddress.get(this.segment(), 0L, 0L); }
    public long dstAddress() { return (long) VH_dstAddress.get(this.segment(), 0L, 0L); }
    public long compressedSize() { return (long) VH_compressedSize.get(this.segment(), 0L, 0L); }
    public long decompressedSize() { return (long) VH_decompressedSize.get(this.segment(), 0L, 0L); }
    public VkDecompressMemoryRegionEXT srcAddressAt(long index, long value) { VH_srcAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionEXT dstAddressAt(long index, long value) { VH_dstAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionEXT compressedSizeAt(long index, long value) { VH_compressedSize.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionEXT decompressedSizeAt(long index, long value) { VH_decompressedSize.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionEXT srcAddress(long value) { VH_srcAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionEXT dstAddress(long value) { VH_dstAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionEXT compressedSize(long value) { VH_compressedSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionEXT decompressedSize(long value) { VH_decompressedSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAddress, index), LAYOUT_srcAddress); }
    public MemorySegment _srcAddress() { return _srcAddressAt(0L); }
    public VkDecompressMemoryRegionEXT _srcAddressAt(long index, MemorySegment src) { _srcAddressAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionEXT _srcAddress(MemorySegment src) { return _srcAddressAt(0L, src); }
    public MemorySegment _dstAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAddress, index), LAYOUT_dstAddress); }
    public MemorySegment _dstAddress() { return _dstAddressAt(0L); }
    public VkDecompressMemoryRegionEXT _dstAddressAt(long index, MemorySegment src) { _dstAddressAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionEXT _dstAddress(MemorySegment src) { return _dstAddressAt(0L, src); }
    public MemorySegment _compressedSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compressedSize, index), LAYOUT_compressedSize); }
    public MemorySegment _compressedSize() { return _compressedSizeAt(0L); }
    public VkDecompressMemoryRegionEXT _compressedSizeAt(long index, MemorySegment src) { _compressedSizeAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionEXT _compressedSize(MemorySegment src) { return _compressedSizeAt(0L, src); }
    public MemorySegment _decompressedSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressedSize, index), LAYOUT_decompressedSize); }
    public MemorySegment _decompressedSize() { return _decompressedSizeAt(0L); }
    public VkDecompressMemoryRegionEXT _decompressedSizeAt(long index, MemorySegment src) { _decompressedSizeAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionEXT _decompressedSize(MemorySegment src) { return _decompressedSizeAt(0L, src); }
}
