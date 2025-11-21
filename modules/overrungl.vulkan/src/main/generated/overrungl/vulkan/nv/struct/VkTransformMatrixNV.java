// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTransformMatrixNV`.
/// ## Layout
/// ```
/// struct VkTransformMatrixNV {
///     float matrix[3][4];
/// }
/// ```
public final class VkTransformMatrixNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT)).withName("matrix")
    );
    public static final long OFFSET_matrix = LAYOUT.byteOffset(PathElement.groupElement("matrix"));
    public static final MemoryLayout LAYOUT_matrix = LAYOUT.select(PathElement.groupElement("matrix"));
    public static final VarHandle VH_matrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrix"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public VkTransformMatrixNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTransformMatrixNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTransformMatrixNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkTransformMatrixNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTransformMatrixNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTransformMatrixNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTransformMatrixNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTransformMatrixNV alloc(SegmentAllocator allocator) { return new VkTransformMatrixNV(allocator.allocate(LAYOUT), 1); }
    public static VkTransformMatrixNV alloc(SegmentAllocator allocator, long count) { return new VkTransformMatrixNV(allocator.allocate(LAYOUT, count), count); }
    public VkTransformMatrixNV copyFrom(VkTransformMatrixNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTransformMatrixNV reinterpret(long count) { return new VkTransformMatrixNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTransformMatrixNV asSlice(long index) { return new VkTransformMatrixNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTransformMatrixNV asSlice(long index, long count) { return new VkTransformMatrixNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTransformMatrixNV at(long index, Consumer<VkTransformMatrixNV> func) { func.accept(asSlice(index)); return this; }
    public float matrixAt(long index, long index0, long index1) { return (float) VH_matrix.get(this.segment(), 0L, index, index0, index1); }
    public float matrix(long index0, long index1) { return (float) VH_matrix.get(this.segment(), 0L, 0L, index0, index1); }
    public VkTransformMatrixNV matrixAt(long index, long index0, long index1, float value) { VH_matrix.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public VkTransformMatrixNV matrix(long index0, long index1, float value) { VH_matrix.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _matrixAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_matrix, index), LAYOUT_matrix); }
    public MemorySegment _matrix() { return _matrixAt(0L); }
    public VkTransformMatrixNV _matrixAt(long index, MemorySegment src) { _matrixAt(index).copyFrom(src); return this; }
    public VkTransformMatrixNV _matrix(MemorySegment src) { return _matrixAt(0L, src); }
}
