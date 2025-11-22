// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorViewCaptureDescriptorDataInfoARM`.
/// ## Layout
/// ```
/// struct VkTensorViewCaptureDescriptorDataInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorViewARM tensorView;
/// }
/// ```
public final class VkTensorViewCaptureDescriptorDataInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("tensorView")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensorView = LAYOUT.byteOffset(PathElement.groupElement("tensorView"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensorView = LAYOUT.select(PathElement.groupElement("tensorView"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensorView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorView"));

    public VkTensorViewCaptureDescriptorDataInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorViewCaptureDescriptorDataInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCaptureDescriptorDataInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorViewCaptureDescriptorDataInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCaptureDescriptorDataInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorViewCaptureDescriptorDataInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCaptureDescriptorDataInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorViewCaptureDescriptorDataInfoARM alloc(SegmentAllocator allocator) { return new VkTensorViewCaptureDescriptorDataInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorViewCaptureDescriptorDataInfoARM alloc(SegmentAllocator allocator, long count) { return new VkTensorViewCaptureDescriptorDataInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorViewCaptureDescriptorDataInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM); }
    public static VkTensorViewCaptureDescriptorDataInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM);
        return s;
    }
    public VkTensorViewCaptureDescriptorDataInfoARM copyFrom(VkTensorViewCaptureDescriptorDataInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM reinterpret(long count) { return new VkTensorViewCaptureDescriptorDataInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorViewCaptureDescriptorDataInfoARM asSlice(long index) { return new VkTensorViewCaptureDescriptorDataInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorViewCaptureDescriptorDataInfoARM asSlice(long index, long count) { return new VkTensorViewCaptureDescriptorDataInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorViewCaptureDescriptorDataInfoARM at(long index, Consumer<VkTensorViewCaptureDescriptorDataInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long tensorViewAt(long index) { return (long) VH_tensorView.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long tensorView() { return (long) VH_tensorView.get(this.segment(), 0L, 0L); }
    public VkTensorViewCaptureDescriptorDataInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM tensorViewAt(long index, long value) { VH_tensorView.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM tensorView(long value) { VH_tensorView.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorViewCaptureDescriptorDataInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorViewCaptureDescriptorDataInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorView, index), LAYOUT_tensorView); }
    public MemorySegment _tensorView() { return _tensorViewAt(0L); }
    public VkTensorViewCaptureDescriptorDataInfoARM _tensorViewAt(long index, MemorySegment src) { _tensorViewAt(index).copyFrom(src); return this; }
    public VkTensorViewCaptureDescriptorDataInfoARM _tensorView(MemorySegment src) { return _tensorViewAt(0L, src); }
}
