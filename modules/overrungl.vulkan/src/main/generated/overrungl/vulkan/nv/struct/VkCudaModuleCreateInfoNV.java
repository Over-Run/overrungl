// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCudaModuleCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkCudaModuleCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     size_t dataSize;
///     const void* pData;
/// }
/// ```
public final class VkCudaModuleCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkCudaModuleCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCudaModuleCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaModuleCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCudaModuleCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaModuleCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCudaModuleCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaModuleCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCudaModuleCreateInfoNV alloc(SegmentAllocator allocator) { return new VkCudaModuleCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkCudaModuleCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkCudaModuleCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCudaModuleCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV); }
    public static VkCudaModuleCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV);
        return s;
    }
    public VkCudaModuleCreateInfoNV copyFrom(VkCudaModuleCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCudaModuleCreateInfoNV reinterpret(long count) { return new VkCudaModuleCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCudaModuleCreateInfoNV asSlice(long index) { return new VkCudaModuleCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCudaModuleCreateInfoNV asSlice(long index, long count) { return new VkCudaModuleCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCudaModuleCreateInfoNV at(long index, Consumer<VkCudaModuleCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkCudaModuleCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCudaModuleCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCudaModuleCreateInfoNV dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkCudaModuleCreateInfoNV pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkCudaModuleCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaModuleCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaModuleCreateInfoNV dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCudaModuleCreateInfoNV pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCudaModuleCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCudaModuleCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCudaModuleCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCudaModuleCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkCudaModuleCreateInfoNV _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkCudaModuleCreateInfoNV _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkCudaModuleCreateInfoNV _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkCudaModuleCreateInfoNV _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
