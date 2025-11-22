// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDecompressMemoryRegionNV`.
/// ## Layout
/// ```
/// struct VkDecompressMemoryRegionNV {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize compressedSize;
///     VkDeviceSize decompressedSize;
///     VkMemoryDecompressionMethodFlagsNV decompressionMethod;
/// }
/// ```
public final class VkDecompressMemoryRegionNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod")
    );
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    public static final long OFFSET_compressedSize = LAYOUT.byteOffset(PathElement.groupElement("compressedSize"));
    public static final long OFFSET_decompressedSize = LAYOUT.byteOffset(PathElement.groupElement("decompressedSize"));
    public static final long OFFSET_decompressionMethod = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethod"));
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    public static final MemoryLayout LAYOUT_compressedSize = LAYOUT.select(PathElement.groupElement("compressedSize"));
    public static final MemoryLayout LAYOUT_decompressedSize = LAYOUT.select(PathElement.groupElement("decompressedSize"));
    public static final MemoryLayout LAYOUT_decompressionMethod = LAYOUT.select(PathElement.groupElement("decompressionMethod"));
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    public static final VarHandle VH_compressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedSize"));
    public static final VarHandle VH_decompressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressedSize"));
    public static final VarHandle VH_decompressionMethod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethod"));

    public VkDecompressMemoryRegionNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDecompressMemoryRegionNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDecompressMemoryRegionNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDecompressMemoryRegionNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDecompressMemoryRegionNV alloc(SegmentAllocator allocator) { return new VkDecompressMemoryRegionNV(allocator.allocate(LAYOUT), 1); }
    public static VkDecompressMemoryRegionNV alloc(SegmentAllocator allocator, long count) { return new VkDecompressMemoryRegionNV(allocator.allocate(LAYOUT, count), count); }
    public VkDecompressMemoryRegionNV copyFrom(VkDecompressMemoryRegionNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDecompressMemoryRegionNV reinterpret(long count) { return new VkDecompressMemoryRegionNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDecompressMemoryRegionNV asSlice(long index) { return new VkDecompressMemoryRegionNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDecompressMemoryRegionNV asSlice(long index, long count) { return new VkDecompressMemoryRegionNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDecompressMemoryRegionNV at(long index, Consumer<VkDecompressMemoryRegionNV> func) { func.accept(asSlice(index)); return this; }
    public long srcAddressAt(long index) { return (long) VH_srcAddress.get(this.segment(), 0L, index); }
    public long dstAddressAt(long index) { return (long) VH_dstAddress.get(this.segment(), 0L, index); }
    public long compressedSizeAt(long index) { return (long) VH_compressedSize.get(this.segment(), 0L, index); }
    public long decompressedSizeAt(long index) { return (long) VH_decompressedSize.get(this.segment(), 0L, index); }
    public long decompressionMethodAt(long index) { return (long) VH_decompressionMethod.get(this.segment(), 0L, index); }
    public long srcAddress() { return (long) VH_srcAddress.get(this.segment(), 0L, 0L); }
    public long dstAddress() { return (long) VH_dstAddress.get(this.segment(), 0L, 0L); }
    public long compressedSize() { return (long) VH_compressedSize.get(this.segment(), 0L, 0L); }
    public long decompressedSize() { return (long) VH_decompressedSize.get(this.segment(), 0L, 0L); }
    public long decompressionMethod() { return (long) VH_decompressionMethod.get(this.segment(), 0L, 0L); }
    public VkDecompressMemoryRegionNV srcAddressAt(long index, long value) { VH_srcAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionNV dstAddressAt(long index, long value) { VH_dstAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionNV compressedSizeAt(long index, long value) { VH_compressedSize.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionNV decompressedSizeAt(long index, long value) { VH_decompressedSize.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionNV decompressionMethodAt(long index, long value) { VH_decompressionMethod.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryRegionNV srcAddress(long value) { VH_srcAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionNV dstAddress(long value) { VH_dstAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionNV compressedSize(long value) { VH_compressedSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionNV decompressedSize(long value) { VH_decompressedSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryRegionNV decompressionMethod(long value) { VH_decompressionMethod.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAddress, index), LAYOUT_srcAddress); }
    public MemorySegment _srcAddress() { return _srcAddressAt(0L); }
    public VkDecompressMemoryRegionNV _srcAddressAt(long index, MemorySegment src) { _srcAddressAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionNV _srcAddress(MemorySegment src) { return _srcAddressAt(0L, src); }
    public MemorySegment _dstAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAddress, index), LAYOUT_dstAddress); }
    public MemorySegment _dstAddress() { return _dstAddressAt(0L); }
    public VkDecompressMemoryRegionNV _dstAddressAt(long index, MemorySegment src) { _dstAddressAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionNV _dstAddress(MemorySegment src) { return _dstAddressAt(0L, src); }
    public MemorySegment _compressedSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compressedSize, index), LAYOUT_compressedSize); }
    public MemorySegment _compressedSize() { return _compressedSizeAt(0L); }
    public VkDecompressMemoryRegionNV _compressedSizeAt(long index, MemorySegment src) { _compressedSizeAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionNV _compressedSize(MemorySegment src) { return _compressedSizeAt(0L, src); }
    public MemorySegment _decompressedSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressedSize, index), LAYOUT_decompressedSize); }
    public MemorySegment _decompressedSize() { return _decompressedSizeAt(0L); }
    public VkDecompressMemoryRegionNV _decompressedSizeAt(long index, MemorySegment src) { _decompressedSizeAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionNV _decompressedSize(MemorySegment src) { return _decompressedSizeAt(0L, src); }
    public MemorySegment _decompressionMethodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressionMethod, index), LAYOUT_decompressionMethod); }
    public MemorySegment _decompressionMethod() { return _decompressionMethodAt(0L); }
    public VkDecompressMemoryRegionNV _decompressionMethodAt(long index, MemorySegment src) { _decompressionMethodAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryRegionNV _decompressionMethod(MemorySegment src) { return _decompressionMethodAt(0L, src); }
}
