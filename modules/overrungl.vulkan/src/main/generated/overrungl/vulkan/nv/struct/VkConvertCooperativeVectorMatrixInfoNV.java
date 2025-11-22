// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkConvertCooperativeVectorMatrixInfoNV`.
/// ## Layout
/// ```
/// struct VkConvertCooperativeVectorMatrixInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     size_t srcSize;
///     VkDeviceOrHostAddressConstKHR srcData;
///     size_t* pDstSize;
///     VkDeviceOrHostAddressKHR dstData;
///     VkComponentTypeKHR srcComponentType;
///     VkComponentTypeKHR dstComponentType;
///     uint32_t numRows;
///     uint32_t numColumns;
///     VkCooperativeVectorMatrixLayoutNV srcLayout;
///     size_t srcStride;
///     VkCooperativeVectorMatrixLayoutNV dstLayout;
///     size_t dstStride;
/// }
/// ```
public final class VkConvertCooperativeVectorMatrixInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("srcSize"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("srcData"),
        ValueLayout.ADDRESS.withName("pDstSize"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("dstData"),
        ValueLayout.JAVA_INT.withName("srcComponentType"),
        ValueLayout.JAVA_INT.withName("dstComponentType"),
        ValueLayout.JAVA_INT.withName("numRows"),
        ValueLayout.JAVA_INT.withName("numColumns"),
        ValueLayout.JAVA_INT.withName("srcLayout"),
        CanonicalTypes.SIZE_T.withName("srcStride"),
        ValueLayout.JAVA_INT.withName("dstLayout"),
        CanonicalTypes.SIZE_T.withName("dstStride")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcSize = LAYOUT.byteOffset(PathElement.groupElement("srcSize"));
    public static final long OFFSET_srcData = LAYOUT.byteOffset(PathElement.groupElement("srcData"));
    public static final long OFFSET_pDstSize = LAYOUT.byteOffset(PathElement.groupElement("pDstSize"));
    public static final long OFFSET_dstData = LAYOUT.byteOffset(PathElement.groupElement("dstData"));
    public static final long OFFSET_srcComponentType = LAYOUT.byteOffset(PathElement.groupElement("srcComponentType"));
    public static final long OFFSET_dstComponentType = LAYOUT.byteOffset(PathElement.groupElement("dstComponentType"));
    public static final long OFFSET_numRows = LAYOUT.byteOffset(PathElement.groupElement("numRows"));
    public static final long OFFSET_numColumns = LAYOUT.byteOffset(PathElement.groupElement("numColumns"));
    public static final long OFFSET_srcLayout = LAYOUT.byteOffset(PathElement.groupElement("srcLayout"));
    public static final long OFFSET_srcStride = LAYOUT.byteOffset(PathElement.groupElement("srcStride"));
    public static final long OFFSET_dstLayout = LAYOUT.byteOffset(PathElement.groupElement("dstLayout"));
    public static final long OFFSET_dstStride = LAYOUT.byteOffset(PathElement.groupElement("dstStride"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcSize = LAYOUT.select(PathElement.groupElement("srcSize"));
    public static final MemoryLayout LAYOUT_srcData = LAYOUT.select(PathElement.groupElement("srcData"));
    public static final MemoryLayout LAYOUT_pDstSize = LAYOUT.select(PathElement.groupElement("pDstSize"));
    public static final MemoryLayout LAYOUT_dstData = LAYOUT.select(PathElement.groupElement("dstData"));
    public static final MemoryLayout LAYOUT_srcComponentType = LAYOUT.select(PathElement.groupElement("srcComponentType"));
    public static final MemoryLayout LAYOUT_dstComponentType = LAYOUT.select(PathElement.groupElement("dstComponentType"));
    public static final MemoryLayout LAYOUT_numRows = LAYOUT.select(PathElement.groupElement("numRows"));
    public static final MemoryLayout LAYOUT_numColumns = LAYOUT.select(PathElement.groupElement("numColumns"));
    public static final MemoryLayout LAYOUT_srcLayout = LAYOUT.select(PathElement.groupElement("srcLayout"));
    public static final MemoryLayout LAYOUT_srcStride = LAYOUT.select(PathElement.groupElement("srcStride"));
    public static final MemoryLayout LAYOUT_dstLayout = LAYOUT.select(PathElement.groupElement("dstLayout"));
    public static final MemoryLayout LAYOUT_dstStride = LAYOUT.select(PathElement.groupElement("dstStride"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSize"));
    public static final VarHandle VH_srcData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_srcData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_pDstSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDstSize"));
    public static final VarHandle VH_dstData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_dstData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_srcComponentType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcComponentType"));
    public static final VarHandle VH_dstComponentType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstComponentType"));
    public static final VarHandle VH_numRows = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numRows"));
    public static final VarHandle VH_numColumns = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numColumns"));
    public static final VarHandle VH_srcLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcLayout"));
    public static final VarHandle VH_srcStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStride"));
    public static final VarHandle VH_dstLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstLayout"));
    public static final VarHandle VH_dstStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStride"));

    public VkConvertCooperativeVectorMatrixInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkConvertCooperativeVectorMatrixInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConvertCooperativeVectorMatrixInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkConvertCooperativeVectorMatrixInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConvertCooperativeVectorMatrixInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkConvertCooperativeVectorMatrixInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConvertCooperativeVectorMatrixInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkConvertCooperativeVectorMatrixInfoNV alloc(SegmentAllocator allocator) { return new VkConvertCooperativeVectorMatrixInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkConvertCooperativeVectorMatrixInfoNV alloc(SegmentAllocator allocator, long count) { return new VkConvertCooperativeVectorMatrixInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV); }
    public static VkConvertCooperativeVectorMatrixInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
        return s;
    }
    public VkConvertCooperativeVectorMatrixInfoNV copyFrom(VkConvertCooperativeVectorMatrixInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV reinterpret(long count) { return new VkConvertCooperativeVectorMatrixInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkConvertCooperativeVectorMatrixInfoNV asSlice(long index) { return new VkConvertCooperativeVectorMatrixInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkConvertCooperativeVectorMatrixInfoNV asSlice(long index, long count) { return new VkConvertCooperativeVectorMatrixInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkConvertCooperativeVectorMatrixInfoNV at(long index, Consumer<VkConvertCooperativeVectorMatrixInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcSizeAt(long index) { return (long) VH_srcSize.get(this.segment(), 0L, index); }
    public long srcData$deviceAddressAt(long index) { return (long) VH_srcData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment srcData$hostAddressAt(long index) { return (MemorySegment) VH_srcData$hostAddress.get(this.segment(), 0L, index); }
    public MemorySegment pDstSizeAt(long index) { return (MemorySegment) VH_pDstSize.get(this.segment(), 0L, index); }
    public long dstData$deviceAddressAt(long index) { return (long) VH_dstData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment dstData$hostAddressAt(long index) { return (MemorySegment) VH_dstData$hostAddress.get(this.segment(), 0L, index); }
    public int srcComponentTypeAt(long index) { return (int) VH_srcComponentType.get(this.segment(), 0L, index); }
    public int dstComponentTypeAt(long index) { return (int) VH_dstComponentType.get(this.segment(), 0L, index); }
    public int numRowsAt(long index) { return (int) VH_numRows.get(this.segment(), 0L, index); }
    public int numColumnsAt(long index) { return (int) VH_numColumns.get(this.segment(), 0L, index); }
    public int srcLayoutAt(long index) { return (int) VH_srcLayout.get(this.segment(), 0L, index); }
    public long srcStrideAt(long index) { return (long) VH_srcStride.get(this.segment(), 0L, index); }
    public int dstLayoutAt(long index) { return (int) VH_dstLayout.get(this.segment(), 0L, index); }
    public long dstStrideAt(long index) { return (long) VH_dstStride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcSize() { return (long) VH_srcSize.get(this.segment(), 0L, 0L); }
    public long srcData$deviceAddress() { return (long) VH_srcData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment srcData$hostAddress() { return (MemorySegment) VH_srcData$hostAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment pDstSize() { return (MemorySegment) VH_pDstSize.get(this.segment(), 0L, 0L); }
    public long dstData$deviceAddress() { return (long) VH_dstData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment dstData$hostAddress() { return (MemorySegment) VH_dstData$hostAddress.get(this.segment(), 0L, 0L); }
    public int srcComponentType() { return (int) VH_srcComponentType.get(this.segment(), 0L, 0L); }
    public int dstComponentType() { return (int) VH_dstComponentType.get(this.segment(), 0L, 0L); }
    public int numRows() { return (int) VH_numRows.get(this.segment(), 0L, 0L); }
    public int numColumns() { return (int) VH_numColumns.get(this.segment(), 0L, 0L); }
    public int srcLayout() { return (int) VH_srcLayout.get(this.segment(), 0L, 0L); }
    public long srcStride() { return (long) VH_srcStride.get(this.segment(), 0L, 0L); }
    public int dstLayout() { return (int) VH_dstLayout.get(this.segment(), 0L, 0L); }
    public long dstStride() { return (long) VH_dstStride.get(this.segment(), 0L, 0L); }
    public VkConvertCooperativeVectorMatrixInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcSizeAt(long index, long value) { VH_srcSize.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcData$deviceAddressAt(long index, long value) { VH_srcData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcData$hostAddressAt(long index, MemorySegment value) { VH_srcData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV pDstSizeAt(long index, MemorySegment value) { VH_pDstSize.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstData$deviceAddressAt(long index, long value) { VH_dstData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstData$hostAddressAt(long index, MemorySegment value) { VH_dstData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcComponentTypeAt(long index, int value) { VH_srcComponentType.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstComponentTypeAt(long index, int value) { VH_dstComponentType.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV numRowsAt(long index, int value) { VH_numRows.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV numColumnsAt(long index, int value) { VH_numColumns.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcLayoutAt(long index, int value) { VH_srcLayout.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcStrideAt(long index, long value) { VH_srcStride.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstLayoutAt(long index, int value) { VH_dstLayout.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstStrideAt(long index, long value) { VH_dstStride.set(this.segment(), 0L, index, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcSize(long value) { VH_srcSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcData$deviceAddress(long value) { VH_srcData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcData$hostAddress(MemorySegment value) { VH_srcData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV pDstSize(MemorySegment value) { VH_pDstSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstData$deviceAddress(long value) { VH_dstData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstData$hostAddress(MemorySegment value) { VH_dstData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcComponentType(int value) { VH_srcComponentType.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstComponentType(int value) { VH_dstComponentType.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV numRows(int value) { VH_numRows.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV numColumns(int value) { VH_numColumns.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcLayout(int value) { VH_srcLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV srcStride(long value) { VH_srcStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstLayout(int value) { VH_dstLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV dstStride(long value) { VH_dstStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSize, index), LAYOUT_srcSize); }
    public MemorySegment _srcSize() { return _srcSizeAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _srcSizeAt(long index, MemorySegment src) { _srcSizeAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _srcSize(MemorySegment src) { return _srcSizeAt(0L, src); }
    public MemorySegment _srcDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcData, index), LAYOUT_srcData); }
    public MemorySegment _srcData() { return _srcDataAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _srcDataAt(long index, MemorySegment src) { _srcDataAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _srcData(MemorySegment src) { return _srcDataAt(0L, src); }
    public MemorySegment _pDstSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDstSize, index), LAYOUT_pDstSize); }
    public MemorySegment _pDstSize() { return _pDstSizeAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _pDstSizeAt(long index, MemorySegment src) { _pDstSizeAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _pDstSize(MemorySegment src) { return _pDstSizeAt(0L, src); }
    public MemorySegment _dstDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstData, index), LAYOUT_dstData); }
    public MemorySegment _dstData() { return _dstDataAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _dstDataAt(long index, MemorySegment src) { _dstDataAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _dstData(MemorySegment src) { return _dstDataAt(0L, src); }
    public MemorySegment _srcComponentTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcComponentType, index), LAYOUT_srcComponentType); }
    public MemorySegment _srcComponentType() { return _srcComponentTypeAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _srcComponentTypeAt(long index, MemorySegment src) { _srcComponentTypeAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _srcComponentType(MemorySegment src) { return _srcComponentTypeAt(0L, src); }
    public MemorySegment _dstComponentTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstComponentType, index), LAYOUT_dstComponentType); }
    public MemorySegment _dstComponentType() { return _dstComponentTypeAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _dstComponentTypeAt(long index, MemorySegment src) { _dstComponentTypeAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _dstComponentType(MemorySegment src) { return _dstComponentTypeAt(0L, src); }
    public MemorySegment _numRowsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numRows, index), LAYOUT_numRows); }
    public MemorySegment _numRows() { return _numRowsAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _numRowsAt(long index, MemorySegment src) { _numRowsAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _numRows(MemorySegment src) { return _numRowsAt(0L, src); }
    public MemorySegment _numColumnsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numColumns, index), LAYOUT_numColumns); }
    public MemorySegment _numColumns() { return _numColumnsAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _numColumnsAt(long index, MemorySegment src) { _numColumnsAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _numColumns(MemorySegment src) { return _numColumnsAt(0L, src); }
    public MemorySegment _srcLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcLayout, index), LAYOUT_srcLayout); }
    public MemorySegment _srcLayout() { return _srcLayoutAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _srcLayoutAt(long index, MemorySegment src) { _srcLayoutAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _srcLayout(MemorySegment src) { return _srcLayoutAt(0L, src); }
    public MemorySegment _srcStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcStride, index), LAYOUT_srcStride); }
    public MemorySegment _srcStride() { return _srcStrideAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _srcStrideAt(long index, MemorySegment src) { _srcStrideAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _srcStride(MemorySegment src) { return _srcStrideAt(0L, src); }
    public MemorySegment _dstLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstLayout, index), LAYOUT_dstLayout); }
    public MemorySegment _dstLayout() { return _dstLayoutAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _dstLayoutAt(long index, MemorySegment src) { _dstLayoutAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _dstLayout(MemorySegment src) { return _dstLayoutAt(0L, src); }
    public MemorySegment _dstStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstStride, index), LAYOUT_dstStride); }
    public MemorySegment _dstStride() { return _dstStrideAt(0L); }
    public VkConvertCooperativeVectorMatrixInfoNV _dstStrideAt(long index, MemorySegment src) { _dstStrideAt(index).copyFrom(src); return this; }
    public VkConvertCooperativeVectorMatrixInfoNV _dstStride(MemorySegment src) { return _dstStrideAt(0L, src); }
}
