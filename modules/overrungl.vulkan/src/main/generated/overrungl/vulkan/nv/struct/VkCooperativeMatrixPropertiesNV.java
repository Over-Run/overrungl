// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCooperativeMatrixPropertiesNV`.
/// ## Layout
/// ```
/// struct VkCooperativeMatrixPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     VkComponentTypeNV AType;
///     VkComponentTypeNV BType;
///     VkComponentTypeNV CType;
///     VkComponentTypeNV DType;
///     VkScopeNV scope;
/// }
/// ```
public final class VkCooperativeMatrixPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("DType"),
        ValueLayout.JAVA_INT.withName("scope")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_MSize = LAYOUT.byteOffset(PathElement.groupElement("MSize"));
    public static final long OFFSET_NSize = LAYOUT.byteOffset(PathElement.groupElement("NSize"));
    public static final long OFFSET_KSize = LAYOUT.byteOffset(PathElement.groupElement("KSize"));
    public static final long OFFSET_AType = LAYOUT.byteOffset(PathElement.groupElement("AType"));
    public static final long OFFSET_BType = LAYOUT.byteOffset(PathElement.groupElement("BType"));
    public static final long OFFSET_CType = LAYOUT.byteOffset(PathElement.groupElement("CType"));
    public static final long OFFSET_DType = LAYOUT.byteOffset(PathElement.groupElement("DType"));
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_MSize = LAYOUT.select(PathElement.groupElement("MSize"));
    public static final MemoryLayout LAYOUT_NSize = LAYOUT.select(PathElement.groupElement("NSize"));
    public static final MemoryLayout LAYOUT_KSize = LAYOUT.select(PathElement.groupElement("KSize"));
    public static final MemoryLayout LAYOUT_AType = LAYOUT.select(PathElement.groupElement("AType"));
    public static final MemoryLayout LAYOUT_BType = LAYOUT.select(PathElement.groupElement("BType"));
    public static final MemoryLayout LAYOUT_CType = LAYOUT.select(PathElement.groupElement("CType"));
    public static final MemoryLayout LAYOUT_DType = LAYOUT.select(PathElement.groupElement("DType"));
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_MSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MSize"));
    public static final VarHandle VH_NSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NSize"));
    public static final VarHandle VH_KSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KSize"));
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    public static final VarHandle VH_DType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DType"));
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));

    public VkCooperativeMatrixPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCooperativeMatrixPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCooperativeMatrixPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
    public static VkCooperativeMatrixPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
        return s;
    }
    public VkCooperativeMatrixPropertiesNV copyFrom(VkCooperativeMatrixPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCooperativeMatrixPropertiesNV reinterpret(long count) { return new VkCooperativeMatrixPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCooperativeMatrixPropertiesNV asSlice(long index) { return new VkCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCooperativeMatrixPropertiesNV asSlice(long index, long count) { return new VkCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCooperativeMatrixPropertiesNV at(long index, Consumer<VkCooperativeMatrixPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int MSizeAt(long index) { return (int) VH_MSize.get(this.segment(), 0L, index); }
    public int NSizeAt(long index) { return (int) VH_NSize.get(this.segment(), 0L, index); }
    public int KSizeAt(long index) { return (int) VH_KSize.get(this.segment(), 0L, index); }
    public int ATypeAt(long index) { return (int) VH_AType.get(this.segment(), 0L, index); }
    public int BTypeAt(long index) { return (int) VH_BType.get(this.segment(), 0L, index); }
    public int CTypeAt(long index) { return (int) VH_CType.get(this.segment(), 0L, index); }
    public int DTypeAt(long index) { return (int) VH_DType.get(this.segment(), 0L, index); }
    public int scopeAt(long index) { return (int) VH_scope.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int MSize() { return (int) VH_MSize.get(this.segment(), 0L, 0L); }
    public int NSize() { return (int) VH_NSize.get(this.segment(), 0L, 0L); }
    public int KSize() { return (int) VH_KSize.get(this.segment(), 0L, 0L); }
    public int AType() { return (int) VH_AType.get(this.segment(), 0L, 0L); }
    public int BType() { return (int) VH_BType.get(this.segment(), 0L, 0L); }
    public int CType() { return (int) VH_CType.get(this.segment(), 0L, 0L); }
    public int DType() { return (int) VH_DType.get(this.segment(), 0L, 0L); }
    public int scope() { return (int) VH_scope.get(this.segment(), 0L, 0L); }
    public VkCooperativeMatrixPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV MSizeAt(long index, int value) { VH_MSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV NSizeAt(long index, int value) { VH_NSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV KSizeAt(long index, int value) { VH_KSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV ATypeAt(long index, int value) { VH_AType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV BTypeAt(long index, int value) { VH_BType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV CTypeAt(long index, int value) { VH_CType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV DTypeAt(long index, int value) { VH_DType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV scopeAt(long index, int value) { VH_scope.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV MSize(int value) { VH_MSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV NSize(int value) { VH_NSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV KSize(int value) { VH_KSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV AType(int value) { VH_AType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV BType(int value) { VH_BType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV CType(int value) { VH_CType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV DType(int value) { VH_DType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesNV scope(int value) { VH_scope.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCooperativeMatrixPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _MSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_MSize, index), LAYOUT_MSize); }
    public MemorySegment _MSize() { return _MSizeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _MSizeAt(long index, MemorySegment src) { _MSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _MSize(MemorySegment src) { return _MSizeAt(0L, src); }
    public MemorySegment _NSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_NSize, index), LAYOUT_NSize); }
    public MemorySegment _NSize() { return _NSizeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _NSizeAt(long index, MemorySegment src) { _NSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _NSize(MemorySegment src) { return _NSizeAt(0L, src); }
    public MemorySegment _KSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_KSize, index), LAYOUT_KSize); }
    public MemorySegment _KSize() { return _KSizeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _KSizeAt(long index, MemorySegment src) { _KSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _KSize(MemorySegment src) { return _KSizeAt(0L, src); }
    public MemorySegment _ATypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_AType, index), LAYOUT_AType); }
    public MemorySegment _AType() { return _ATypeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _ATypeAt(long index, MemorySegment src) { _ATypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _AType(MemorySegment src) { return _ATypeAt(0L, src); }
    public MemorySegment _BTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_BType, index), LAYOUT_BType); }
    public MemorySegment _BType() { return _BTypeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _BTypeAt(long index, MemorySegment src) { _BTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _BType(MemorySegment src) { return _BTypeAt(0L, src); }
    public MemorySegment _CTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_CType, index), LAYOUT_CType); }
    public MemorySegment _CType() { return _CTypeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _CTypeAt(long index, MemorySegment src) { _CTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _CType(MemorySegment src) { return _CTypeAt(0L, src); }
    public MemorySegment _DTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_DType, index), LAYOUT_DType); }
    public MemorySegment _DType() { return _DTypeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _DTypeAt(long index, MemorySegment src) { _DTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _DType(MemorySegment src) { return _DTypeAt(0L, src); }
    public MemorySegment _scopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scope, index), LAYOUT_scope); }
    public MemorySegment _scope() { return _scopeAt(0L); }
    public VkCooperativeMatrixPropertiesNV _scopeAt(long index, MemorySegment src) { _scopeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesNV _scope(MemorySegment src) { return _scopeAt(0L, src); }
}
