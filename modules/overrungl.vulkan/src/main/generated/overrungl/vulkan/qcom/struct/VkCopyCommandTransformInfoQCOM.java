// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyCommandTransformInfoQCOM`.
/// ## Layout
/// ```
/// struct VkCopyCommandTransformInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkSurfaceTransformFlagBitsKHR transform;
/// }
/// ```
public final class VkCopyCommandTransformInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));

    public VkCopyCommandTransformInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyCommandTransformInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyCommandTransformInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyCommandTransformInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyCommandTransformInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyCommandTransformInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyCommandTransformInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyCommandTransformInfoQCOM alloc(SegmentAllocator allocator) { return new VkCopyCommandTransformInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkCopyCommandTransformInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkCopyCommandTransformInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyCommandTransformInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM); }
    public static VkCopyCommandTransformInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM);
        return s;
    }
    public VkCopyCommandTransformInfoQCOM copyFrom(VkCopyCommandTransformInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyCommandTransformInfoQCOM reinterpret(long count) { return new VkCopyCommandTransformInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyCommandTransformInfoQCOM asSlice(long index) { return new VkCopyCommandTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyCommandTransformInfoQCOM asSlice(long index, long count) { return new VkCopyCommandTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyCommandTransformInfoQCOM at(long index, Consumer<VkCopyCommandTransformInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int transformAt(long index) { return (int) VH_transform.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int transform() { return (int) VH_transform.get(this.segment(), 0L, 0L); }
    public VkCopyCommandTransformInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyCommandTransformInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyCommandTransformInfoQCOM transformAt(long index, int value) { VH_transform.set(this.segment(), 0L, index, value); return this; }
    public VkCopyCommandTransformInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyCommandTransformInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyCommandTransformInfoQCOM transform(int value) { VH_transform.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyCommandTransformInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyCommandTransformInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyCommandTransformInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyCommandTransformInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _transformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform); }
    public MemorySegment _transform() { return _transformAt(0L); }
    public VkCopyCommandTransformInfoQCOM _transformAt(long index, MemorySegment src) { _transformAt(index).copyFrom(src); return this; }
    public VkCopyCommandTransformInfoQCOM _transform(MemorySegment src) { return _transformAt(0L, src); }
}
