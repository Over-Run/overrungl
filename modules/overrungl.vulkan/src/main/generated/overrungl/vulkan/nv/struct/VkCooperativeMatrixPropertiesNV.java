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
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     ((int) VkComponentTypeKHR) VkComponentTypeNV AType;
///     ((int) VkComponentTypeKHR) VkComponentTypeNV BType;
///     ((int) VkComponentTypeKHR) VkComponentTypeNV CType;
///     ((int) VkComponentTypeKHR) VkComponentTypeNV DType;
///     ((int) VkScopeKHR) VkScopeNV scope;
/// };
/// ```
public final class VkCooperativeMatrixPropertiesNV extends GroupType {
    /// The struct layout of `VkCooperativeMatrixPropertiesNV`.
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `MSize`.
    public static final long OFFSET_MSize = LAYOUT.byteOffset(PathElement.groupElement("MSize"));
    /// The memory layout of `MSize`.
    public static final MemoryLayout LAYOUT_MSize = LAYOUT.select(PathElement.groupElement("MSize"));
    /// The [VarHandle] of `MSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_MSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MSize"));
    /// The byte offset of `NSize`.
    public static final long OFFSET_NSize = LAYOUT.byteOffset(PathElement.groupElement("NSize"));
    /// The memory layout of `NSize`.
    public static final MemoryLayout LAYOUT_NSize = LAYOUT.select(PathElement.groupElement("NSize"));
    /// The [VarHandle] of `NSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_NSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NSize"));
    /// The byte offset of `KSize`.
    public static final long OFFSET_KSize = LAYOUT.byteOffset(PathElement.groupElement("KSize"));
    /// The memory layout of `KSize`.
    public static final MemoryLayout LAYOUT_KSize = LAYOUT.select(PathElement.groupElement("KSize"));
    /// The [VarHandle] of `KSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_KSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KSize"));
    /// The byte offset of `AType`.
    public static final long OFFSET_AType = LAYOUT.byteOffset(PathElement.groupElement("AType"));
    /// The memory layout of `AType`.
    public static final MemoryLayout LAYOUT_AType = LAYOUT.select(PathElement.groupElement("AType"));
    /// The [VarHandle] of `AType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    /// The byte offset of `BType`.
    public static final long OFFSET_BType = LAYOUT.byteOffset(PathElement.groupElement("BType"));
    /// The memory layout of `BType`.
    public static final MemoryLayout LAYOUT_BType = LAYOUT.select(PathElement.groupElement("BType"));
    /// The [VarHandle] of `BType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    /// The byte offset of `CType`.
    public static final long OFFSET_CType = LAYOUT.byteOffset(PathElement.groupElement("CType"));
    /// The memory layout of `CType`.
    public static final MemoryLayout LAYOUT_CType = LAYOUT.select(PathElement.groupElement("CType"));
    /// The [VarHandle] of `CType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    /// The byte offset of `DType`.
    public static final long OFFSET_DType = LAYOUT.byteOffset(PathElement.groupElement("DType"));
    /// The memory layout of `DType`.
    public static final MemoryLayout LAYOUT_DType = LAYOUT.select(PathElement.groupElement("DType"));
    /// The [VarHandle] of `DType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_DType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DType"));
    /// The byte offset of `scope`.
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    /// The memory layout of `scope`.
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCooperativeMatrixPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCooperativeMatrixPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixPropertiesNV`
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCooperativeMatrixPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixPropertiesNV`
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV copyFrom(VkCooperativeMatrixPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCooperativeMatrixPropertiesNV reinterpret(long count) { return new VkCooperativeMatrixPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `MSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int MSize(MemorySegment segment, long index) { return (int) VH_MSize.get(segment, 0L, index); }
    /// {@return `MSize`}
    public int MSize() { return MSize(this.segment(), 0L); }
    /// Sets `MSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void MSize(MemorySegment segment, long index, int value) { VH_MSize.set(segment, 0L, index, value); }
    /// Sets `MSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV MSize(int value) { MSize(this.segment(), 0L, value); return this; }

    /// {@return `NSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int NSize(MemorySegment segment, long index) { return (int) VH_NSize.get(segment, 0L, index); }
    /// {@return `NSize`}
    public int NSize() { return NSize(this.segment(), 0L); }
    /// Sets `NSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void NSize(MemorySegment segment, long index, int value) { VH_NSize.set(segment, 0L, index, value); }
    /// Sets `NSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV NSize(int value) { NSize(this.segment(), 0L, value); return this; }

    /// {@return `KSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int KSize(MemorySegment segment, long index) { return (int) VH_KSize.get(segment, 0L, index); }
    /// {@return `KSize`}
    public int KSize() { return KSize(this.segment(), 0L); }
    /// Sets `KSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void KSize(MemorySegment segment, long index, int value) { VH_KSize.set(segment, 0L, index, value); }
    /// Sets `KSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV KSize(int value) { KSize(this.segment(), 0L, value); return this; }

    /// {@return `AType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int AType(MemorySegment segment, long index) { return (int) VH_AType.get(segment, 0L, index); }
    /// {@return `AType`}
    public int AType() { return AType(this.segment(), 0L); }
    /// Sets `AType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void AType(MemorySegment segment, long index, int value) { VH_AType.set(segment, 0L, index, value); }
    /// Sets `AType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV AType(int value) { AType(this.segment(), 0L, value); return this; }

    /// {@return `BType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int BType(MemorySegment segment, long index) { return (int) VH_BType.get(segment, 0L, index); }
    /// {@return `BType`}
    public int BType() { return BType(this.segment(), 0L); }
    /// Sets `BType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void BType(MemorySegment segment, long index, int value) { VH_BType.set(segment, 0L, index, value); }
    /// Sets `BType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV BType(int value) { BType(this.segment(), 0L, value); return this; }

    /// {@return `CType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int CType(MemorySegment segment, long index) { return (int) VH_CType.get(segment, 0L, index); }
    /// {@return `CType`}
    public int CType() { return CType(this.segment(), 0L); }
    /// Sets `CType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void CType(MemorySegment segment, long index, int value) { VH_CType.set(segment, 0L, index, value); }
    /// Sets `CType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV CType(int value) { CType(this.segment(), 0L, value); return this; }

    /// {@return `DType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int DType(MemorySegment segment, long index) { return (int) VH_DType.get(segment, 0L, index); }
    /// {@return `DType`}
    public int DType() { return DType(this.segment(), 0L); }
    /// Sets `DType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void DType(MemorySegment segment, long index, int value) { VH_DType.set(segment, 0L, index, value); }
    /// Sets `DType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV DType(int value) { DType(this.segment(), 0L, value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    public int scope() { return scope(this.segment(), 0L); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scope(MemorySegment segment, long index, int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV scope(int value) { scope(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCooperativeMatrixPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCooperativeMatrixPropertiesNV`
    public VkCooperativeMatrixPropertiesNV asSlice(long index) { return new VkCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCooperativeMatrixPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCooperativeMatrixPropertiesNV`
    public VkCooperativeMatrixPropertiesNV asSlice(long index, long count) { return new VkCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCooperativeMatrixPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV at(long index, Consumer<VkCooperativeMatrixPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `MSize` at the given index}
    /// @param index the index of the struct buffer
    public int MSizeAt(long index) { return MSize(this.segment(), index); }
    /// Sets `MSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV MSizeAt(long index, int value) { MSize(this.segment(), index, value); return this; }

    /// {@return `NSize` at the given index}
    /// @param index the index of the struct buffer
    public int NSizeAt(long index) { return NSize(this.segment(), index); }
    /// Sets `NSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV NSizeAt(long index, int value) { NSize(this.segment(), index, value); return this; }

    /// {@return `KSize` at the given index}
    /// @param index the index of the struct buffer
    public int KSizeAt(long index) { return KSize(this.segment(), index); }
    /// Sets `KSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV KSizeAt(long index, int value) { KSize(this.segment(), index, value); return this; }

    /// {@return `AType` at the given index}
    /// @param index the index of the struct buffer
    public int ATypeAt(long index) { return AType(this.segment(), index); }
    /// Sets `AType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV ATypeAt(long index, int value) { AType(this.segment(), index, value); return this; }

    /// {@return `BType` at the given index}
    /// @param index the index of the struct buffer
    public int BTypeAt(long index) { return BType(this.segment(), index); }
    /// Sets `BType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV BTypeAt(long index, int value) { BType(this.segment(), index, value); return this; }

    /// {@return `CType` at the given index}
    /// @param index the index of the struct buffer
    public int CTypeAt(long index) { return CType(this.segment(), index); }
    /// Sets `CType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV CTypeAt(long index, int value) { CType(this.segment(), index, value); return this; }

    /// {@return `DType` at the given index}
    /// @param index the index of the struct buffer
    public int DTypeAt(long index) { return DType(this.segment(), index); }
    /// Sets `DType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV DTypeAt(long index, int value) { DType(this.segment(), index, value); return this; }

    /// {@return `scope` at the given index}
    /// @param index the index of the struct buffer
    public int scopeAt(long index) { return scope(this.segment(), index); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV scopeAt(long index, int value) { scope(this.segment(), index, value); return this; }

}
