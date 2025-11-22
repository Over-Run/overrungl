// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCudaLaunchInfoNV`.
/// ## Layout
/// ```
/// struct VkCudaLaunchInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkCudaFunctionNV function;
///     uint32_t gridDimX;
///     uint32_t gridDimY;
///     uint32_t gridDimZ;
///     uint32_t blockDimX;
///     uint32_t blockDimY;
///     uint32_t blockDimZ;
///     uint32_t sharedMemBytes;
///     size_t paramCount;
///     const void* const * pParams;
///     size_t extraCount;
///     const void* const * pExtras;
/// }
/// ```
public final class VkCudaLaunchInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("function"),
        ValueLayout.JAVA_INT.withName("gridDimX"),
        ValueLayout.JAVA_INT.withName("gridDimY"),
        ValueLayout.JAVA_INT.withName("gridDimZ"),
        ValueLayout.JAVA_INT.withName("blockDimX"),
        ValueLayout.JAVA_INT.withName("blockDimY"),
        ValueLayout.JAVA_INT.withName("blockDimZ"),
        ValueLayout.JAVA_INT.withName("sharedMemBytes"),
        CanonicalTypes.SIZE_T.withName("paramCount"),
        ValueLayout.ADDRESS.withName("pParams"),
        CanonicalTypes.SIZE_T.withName("extraCount"),
        ValueLayout.ADDRESS.withName("pExtras")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_function = LAYOUT.byteOffset(PathElement.groupElement("function"));
    public static final long OFFSET_gridDimX = LAYOUT.byteOffset(PathElement.groupElement("gridDimX"));
    public static final long OFFSET_gridDimY = LAYOUT.byteOffset(PathElement.groupElement("gridDimY"));
    public static final long OFFSET_gridDimZ = LAYOUT.byteOffset(PathElement.groupElement("gridDimZ"));
    public static final long OFFSET_blockDimX = LAYOUT.byteOffset(PathElement.groupElement("blockDimX"));
    public static final long OFFSET_blockDimY = LAYOUT.byteOffset(PathElement.groupElement("blockDimY"));
    public static final long OFFSET_blockDimZ = LAYOUT.byteOffset(PathElement.groupElement("blockDimZ"));
    public static final long OFFSET_sharedMemBytes = LAYOUT.byteOffset(PathElement.groupElement("sharedMemBytes"));
    public static final long OFFSET_paramCount = LAYOUT.byteOffset(PathElement.groupElement("paramCount"));
    public static final long OFFSET_pParams = LAYOUT.byteOffset(PathElement.groupElement("pParams"));
    public static final long OFFSET_extraCount = LAYOUT.byteOffset(PathElement.groupElement("extraCount"));
    public static final long OFFSET_pExtras = LAYOUT.byteOffset(PathElement.groupElement("pExtras"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_function = LAYOUT.select(PathElement.groupElement("function"));
    public static final MemoryLayout LAYOUT_gridDimX = LAYOUT.select(PathElement.groupElement("gridDimX"));
    public static final MemoryLayout LAYOUT_gridDimY = LAYOUT.select(PathElement.groupElement("gridDimY"));
    public static final MemoryLayout LAYOUT_gridDimZ = LAYOUT.select(PathElement.groupElement("gridDimZ"));
    public static final MemoryLayout LAYOUT_blockDimX = LAYOUT.select(PathElement.groupElement("blockDimX"));
    public static final MemoryLayout LAYOUT_blockDimY = LAYOUT.select(PathElement.groupElement("blockDimY"));
    public static final MemoryLayout LAYOUT_blockDimZ = LAYOUT.select(PathElement.groupElement("blockDimZ"));
    public static final MemoryLayout LAYOUT_sharedMemBytes = LAYOUT.select(PathElement.groupElement("sharedMemBytes"));
    public static final MemoryLayout LAYOUT_paramCount = LAYOUT.select(PathElement.groupElement("paramCount"));
    public static final MemoryLayout LAYOUT_pParams = LAYOUT.select(PathElement.groupElement("pParams"));
    public static final MemoryLayout LAYOUT_extraCount = LAYOUT.select(PathElement.groupElement("extraCount"));
    public static final MemoryLayout LAYOUT_pExtras = LAYOUT.select(PathElement.groupElement("pExtras"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_function = LAYOUT.arrayElementVarHandle(PathElement.groupElement("function"));
    public static final VarHandle VH_gridDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimX"));
    public static final VarHandle VH_gridDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimY"));
    public static final VarHandle VH_gridDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimZ"));
    public static final VarHandle VH_blockDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimX"));
    public static final VarHandle VH_blockDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimY"));
    public static final VarHandle VH_blockDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimZ"));
    public static final VarHandle VH_sharedMemBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedMemBytes"));
    public static final VarHandle VH_paramCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("paramCount"));
    public static final VarHandle VH_pParams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParams"));
    public static final VarHandle VH_extraCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraCount"));
    public static final VarHandle VH_pExtras = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtras"));

    public VkCudaLaunchInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCudaLaunchInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCudaLaunchInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCudaLaunchInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCudaLaunchInfoNV alloc(SegmentAllocator allocator) { return new VkCudaLaunchInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkCudaLaunchInfoNV alloc(SegmentAllocator allocator, long count) { return new VkCudaLaunchInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCudaLaunchInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV); }
    public static VkCudaLaunchInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV);
        return s;
    }
    public VkCudaLaunchInfoNV copyFrom(VkCudaLaunchInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCudaLaunchInfoNV reinterpret(long count) { return new VkCudaLaunchInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCudaLaunchInfoNV asSlice(long index) { return new VkCudaLaunchInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCudaLaunchInfoNV asSlice(long index, long count) { return new VkCudaLaunchInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCudaLaunchInfoNV at(long index, Consumer<VkCudaLaunchInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long functionAt(long index) { return (long) VH_function.get(this.segment(), 0L, index); }
    public int gridDimXAt(long index) { return (int) VH_gridDimX.get(this.segment(), 0L, index); }
    public int gridDimYAt(long index) { return (int) VH_gridDimY.get(this.segment(), 0L, index); }
    public int gridDimZAt(long index) { return (int) VH_gridDimZ.get(this.segment(), 0L, index); }
    public int blockDimXAt(long index) { return (int) VH_blockDimX.get(this.segment(), 0L, index); }
    public int blockDimYAt(long index) { return (int) VH_blockDimY.get(this.segment(), 0L, index); }
    public int blockDimZAt(long index) { return (int) VH_blockDimZ.get(this.segment(), 0L, index); }
    public int sharedMemBytesAt(long index) { return (int) VH_sharedMemBytes.get(this.segment(), 0L, index); }
    public long paramCountAt(long index) { return (long) VH_paramCount.get(this.segment(), 0L, index); }
    public MemorySegment pParamsAt(long index) { return (MemorySegment) VH_pParams.get(this.segment(), 0L, index); }
    public long extraCountAt(long index) { return (long) VH_extraCount.get(this.segment(), 0L, index); }
    public MemorySegment pExtrasAt(long index) { return (MemorySegment) VH_pExtras.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long function() { return (long) VH_function.get(this.segment(), 0L, 0L); }
    public int gridDimX() { return (int) VH_gridDimX.get(this.segment(), 0L, 0L); }
    public int gridDimY() { return (int) VH_gridDimY.get(this.segment(), 0L, 0L); }
    public int gridDimZ() { return (int) VH_gridDimZ.get(this.segment(), 0L, 0L); }
    public int blockDimX() { return (int) VH_blockDimX.get(this.segment(), 0L, 0L); }
    public int blockDimY() { return (int) VH_blockDimY.get(this.segment(), 0L, 0L); }
    public int blockDimZ() { return (int) VH_blockDimZ.get(this.segment(), 0L, 0L); }
    public int sharedMemBytes() { return (int) VH_sharedMemBytes.get(this.segment(), 0L, 0L); }
    public long paramCount() { return (long) VH_paramCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pParams() { return (MemorySegment) VH_pParams.get(this.segment(), 0L, 0L); }
    public long extraCount() { return (long) VH_extraCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pExtras() { return (MemorySegment) VH_pExtras.get(this.segment(), 0L, 0L); }
    public VkCudaLaunchInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV functionAt(long index, long value) { VH_function.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV gridDimXAt(long index, int value) { VH_gridDimX.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV gridDimYAt(long index, int value) { VH_gridDimY.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV gridDimZAt(long index, int value) { VH_gridDimZ.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV blockDimXAt(long index, int value) { VH_blockDimX.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV blockDimYAt(long index, int value) { VH_blockDimY.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV blockDimZAt(long index, int value) { VH_blockDimZ.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV sharedMemBytesAt(long index, int value) { VH_sharedMemBytes.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV paramCountAt(long index, long value) { VH_paramCount.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV pParamsAt(long index, MemorySegment value) { VH_pParams.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV extraCountAt(long index, long value) { VH_extraCount.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV pExtrasAt(long index, MemorySegment value) { VH_pExtras.set(this.segment(), 0L, index, value); return this; }
    public VkCudaLaunchInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV function(long value) { VH_function.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV gridDimX(int value) { VH_gridDimX.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV gridDimY(int value) { VH_gridDimY.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV gridDimZ(int value) { VH_gridDimZ.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV blockDimX(int value) { VH_blockDimX.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV blockDimY(int value) { VH_blockDimY.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV blockDimZ(int value) { VH_blockDimZ.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV sharedMemBytes(int value) { VH_sharedMemBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV paramCount(long value) { VH_paramCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV pParams(MemorySegment value) { VH_pParams.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV extraCount(long value) { VH_extraCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaLaunchInfoNV pExtras(MemorySegment value) { VH_pExtras.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCudaLaunchInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCudaLaunchInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _functionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_function, index), LAYOUT_function); }
    public MemorySegment _function() { return _functionAt(0L); }
    public VkCudaLaunchInfoNV _functionAt(long index, MemorySegment src) { _functionAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _function(MemorySegment src) { return _functionAt(0L, src); }
    public MemorySegment _gridDimXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gridDimX, index), LAYOUT_gridDimX); }
    public MemorySegment _gridDimX() { return _gridDimXAt(0L); }
    public VkCudaLaunchInfoNV _gridDimXAt(long index, MemorySegment src) { _gridDimXAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _gridDimX(MemorySegment src) { return _gridDimXAt(0L, src); }
    public MemorySegment _gridDimYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gridDimY, index), LAYOUT_gridDimY); }
    public MemorySegment _gridDimY() { return _gridDimYAt(0L); }
    public VkCudaLaunchInfoNV _gridDimYAt(long index, MemorySegment src) { _gridDimYAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _gridDimY(MemorySegment src) { return _gridDimYAt(0L, src); }
    public MemorySegment _gridDimZAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gridDimZ, index), LAYOUT_gridDimZ); }
    public MemorySegment _gridDimZ() { return _gridDimZAt(0L); }
    public VkCudaLaunchInfoNV _gridDimZAt(long index, MemorySegment src) { _gridDimZAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _gridDimZ(MemorySegment src) { return _gridDimZAt(0L, src); }
    public MemorySegment _blockDimXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blockDimX, index), LAYOUT_blockDimX); }
    public MemorySegment _blockDimX() { return _blockDimXAt(0L); }
    public VkCudaLaunchInfoNV _blockDimXAt(long index, MemorySegment src) { _blockDimXAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _blockDimX(MemorySegment src) { return _blockDimXAt(0L, src); }
    public MemorySegment _blockDimYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blockDimY, index), LAYOUT_blockDimY); }
    public MemorySegment _blockDimY() { return _blockDimYAt(0L); }
    public VkCudaLaunchInfoNV _blockDimYAt(long index, MemorySegment src) { _blockDimYAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _blockDimY(MemorySegment src) { return _blockDimYAt(0L, src); }
    public MemorySegment _blockDimZAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blockDimZ, index), LAYOUT_blockDimZ); }
    public MemorySegment _blockDimZ() { return _blockDimZAt(0L); }
    public VkCudaLaunchInfoNV _blockDimZAt(long index, MemorySegment src) { _blockDimZAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _blockDimZ(MemorySegment src) { return _blockDimZAt(0L, src); }
    public MemorySegment _sharedMemBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharedMemBytes, index), LAYOUT_sharedMemBytes); }
    public MemorySegment _sharedMemBytes() { return _sharedMemBytesAt(0L); }
    public VkCudaLaunchInfoNV _sharedMemBytesAt(long index, MemorySegment src) { _sharedMemBytesAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _sharedMemBytes(MemorySegment src) { return _sharedMemBytesAt(0L, src); }
    public MemorySegment _paramCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_paramCount, index), LAYOUT_paramCount); }
    public MemorySegment _paramCount() { return _paramCountAt(0L); }
    public VkCudaLaunchInfoNV _paramCountAt(long index, MemorySegment src) { _paramCountAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _paramCount(MemorySegment src) { return _paramCountAt(0L, src); }
    public MemorySegment _pParamsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pParams, index), LAYOUT_pParams); }
    public MemorySegment _pParams() { return _pParamsAt(0L); }
    public VkCudaLaunchInfoNV _pParamsAt(long index, MemorySegment src) { _pParamsAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _pParams(MemorySegment src) { return _pParamsAt(0L, src); }
    public MemorySegment _extraCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extraCount, index), LAYOUT_extraCount); }
    public MemorySegment _extraCount() { return _extraCountAt(0L); }
    public VkCudaLaunchInfoNV _extraCountAt(long index, MemorySegment src) { _extraCountAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _extraCount(MemorySegment src) { return _extraCountAt(0L, src); }
    public MemorySegment _pExtrasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pExtras, index), LAYOUT_pExtras); }
    public MemorySegment _pExtras() { return _pExtrasAt(0L); }
    public VkCudaLaunchInfoNV _pExtrasAt(long index, MemorySegment src) { _pExtrasAt(index).copyFrom(src); return this; }
    public VkCudaLaunchInfoNV _pExtras(MemorySegment src) { return _pExtrasAt(0L, src); }
}
