// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSparseProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSparseProperties {
///     VkBool32 residencyStandard2DBlockShape;
///     VkBool32 residencyStandard2DMultisampleBlockShape;
///     VkBool32 residencyStandard3DBlockShape;
///     VkBool32 residencyAlignedMipSize;
///     VkBool32 residencyNonResidentStrict;
/// }
/// ```
public final class VkPhysicalDeviceSparseProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );
    public static final long OFFSET_residencyStandard2DBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DBlockShape"));
    public static final long OFFSET_residencyStandard2DMultisampleBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    public static final long OFFSET_residencyStandard3DBlockShape = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard3DBlockShape"));
    public static final long OFFSET_residencyAlignedMipSize = LAYOUT.byteOffset(PathElement.groupElement("residencyAlignedMipSize"));
    public static final long OFFSET_residencyNonResidentStrict = LAYOUT.byteOffset(PathElement.groupElement("residencyNonResidentStrict"));
    public static final MemoryLayout LAYOUT_residencyStandard2DBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard2DBlockShape"));
    public static final MemoryLayout LAYOUT_residencyStandard2DMultisampleBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    public static final MemoryLayout LAYOUT_residencyStandard3DBlockShape = LAYOUT.select(PathElement.groupElement("residencyStandard3DBlockShape"));
    public static final MemoryLayout LAYOUT_residencyAlignedMipSize = LAYOUT.select(PathElement.groupElement("residencyAlignedMipSize"));
    public static final MemoryLayout LAYOUT_residencyNonResidentStrict = LAYOUT.select(PathElement.groupElement("residencyNonResidentStrict"));
    public static final VarHandle VH_residencyStandard2DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DBlockShape"));
    public static final VarHandle VH_residencyStandard2DMultisampleBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    public static final VarHandle VH_residencyStandard3DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyStandard3DBlockShape"));
    public static final VarHandle VH_residencyAlignedMipSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyAlignedMipSize"));
    public static final VarHandle VH_residencyNonResidentStrict = LAYOUT.arrayElementVarHandle(PathElement.groupElement("residencyNonResidentStrict"));

    public VkPhysicalDeviceSparseProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSparseProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSparseProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSparseProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseProperties(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceSparseProperties copyFrom(VkPhysicalDeviceSparseProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSparseProperties reinterpret(long count) { return new VkPhysicalDeviceSparseProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSparseProperties asSlice(long index) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSparseProperties asSlice(long index, long count) { return new VkPhysicalDeviceSparseProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSparseProperties at(long index, Consumer<VkPhysicalDeviceSparseProperties> func) { func.accept(asSlice(index)); return this; }
    public int residencyStandard2DBlockShapeAt(long index) { return (int) VH_residencyStandard2DBlockShape.get(this.segment(), 0L, index); }
    public int residencyStandard2DMultisampleBlockShapeAt(long index) { return (int) VH_residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, index); }
    public int residencyStandard3DBlockShapeAt(long index) { return (int) VH_residencyStandard3DBlockShape.get(this.segment(), 0L, index); }
    public int residencyAlignedMipSizeAt(long index) { return (int) VH_residencyAlignedMipSize.get(this.segment(), 0L, index); }
    public int residencyNonResidentStrictAt(long index) { return (int) VH_residencyNonResidentStrict.get(this.segment(), 0L, index); }
    public int residencyStandard2DBlockShape() { return (int) VH_residencyStandard2DBlockShape.get(this.segment(), 0L, 0L); }
    public int residencyStandard2DMultisampleBlockShape() { return (int) VH_residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, 0L); }
    public int residencyStandard3DBlockShape() { return (int) VH_residencyStandard3DBlockShape.get(this.segment(), 0L, 0L); }
    public int residencyAlignedMipSize() { return (int) VH_residencyAlignedMipSize.get(this.segment(), 0L, 0L); }
    public int residencyNonResidentStrict() { return (int) VH_residencyNonResidentStrict.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShapeAt(long index, int value) { VH_residencyStandard2DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShapeAt(long index, int value) { VH_residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShapeAt(long index, int value) { VH_residencyStandard3DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSizeAt(long index, int value) { VH_residencyAlignedMipSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrictAt(long index, int value) { VH_residencyNonResidentStrict.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShape(int value) { VH_residencyStandard2DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShape(int value) { VH_residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShape(int value) { VH_residencyStandard3DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSize(int value) { VH_residencyAlignedMipSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrict(int value) { VH_residencyNonResidentStrict.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _residencyStandard2DBlockShapeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_residencyStandard2DBlockShape, index), LAYOUT_residencyStandard2DBlockShape); }
    public MemorySegment _residencyStandard2DBlockShape() { return _residencyStandard2DBlockShapeAt(0L); }
    public VkPhysicalDeviceSparseProperties _residencyStandard2DBlockShapeAt(long index, MemorySegment src) { _residencyStandard2DBlockShapeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseProperties _residencyStandard2DBlockShape(MemorySegment src) { return _residencyStandard2DBlockShapeAt(0L, src); }
    public MemorySegment _residencyStandard2DMultisampleBlockShapeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_residencyStandard2DMultisampleBlockShape, index), LAYOUT_residencyStandard2DMultisampleBlockShape); }
    public MemorySegment _residencyStandard2DMultisampleBlockShape() { return _residencyStandard2DMultisampleBlockShapeAt(0L); }
    public VkPhysicalDeviceSparseProperties _residencyStandard2DMultisampleBlockShapeAt(long index, MemorySegment src) { _residencyStandard2DMultisampleBlockShapeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseProperties _residencyStandard2DMultisampleBlockShape(MemorySegment src) { return _residencyStandard2DMultisampleBlockShapeAt(0L, src); }
    public MemorySegment _residencyStandard3DBlockShapeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_residencyStandard3DBlockShape, index), LAYOUT_residencyStandard3DBlockShape); }
    public MemorySegment _residencyStandard3DBlockShape() { return _residencyStandard3DBlockShapeAt(0L); }
    public VkPhysicalDeviceSparseProperties _residencyStandard3DBlockShapeAt(long index, MemorySegment src) { _residencyStandard3DBlockShapeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseProperties _residencyStandard3DBlockShape(MemorySegment src) { return _residencyStandard3DBlockShapeAt(0L, src); }
    public MemorySegment _residencyAlignedMipSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_residencyAlignedMipSize, index), LAYOUT_residencyAlignedMipSize); }
    public MemorySegment _residencyAlignedMipSize() { return _residencyAlignedMipSizeAt(0L); }
    public VkPhysicalDeviceSparseProperties _residencyAlignedMipSizeAt(long index, MemorySegment src) { _residencyAlignedMipSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseProperties _residencyAlignedMipSize(MemorySegment src) { return _residencyAlignedMipSizeAt(0L, src); }
    public MemorySegment _residencyNonResidentStrictAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_residencyNonResidentStrict, index), LAYOUT_residencyNonResidentStrict); }
    public MemorySegment _residencyNonResidentStrict() { return _residencyNonResidentStrictAt(0L); }
    public VkPhysicalDeviceSparseProperties _residencyNonResidentStrictAt(long index, MemorySegment src) { _residencyNonResidentStrictAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSparseProperties _residencyNonResidentStrict(MemorySegment src) { return _residencyNonResidentStrictAt(0L, src); }
}
