// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorFormatPropertiesARM`.
/// ## Layout
/// ```
/// struct VkTensorFormatPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkFormatFeatureFlags2 optimalTilingTensorFeatures;
///     VkFormatFeatureFlags2 linearTilingTensorFeatures;
/// }
/// ```
public final class VkTensorFormatPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("optimalTilingTensorFeatures"),
        ValueLayout.JAVA_LONG.withName("linearTilingTensorFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_optimalTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingTensorFeatures"));
    public static final long OFFSET_linearTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingTensorFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_optimalTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingTensorFeatures"));
    public static final MemoryLayout LAYOUT_linearTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("linearTilingTensorFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_optimalTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingTensorFeatures"));
    public static final VarHandle VH_linearTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingTensorFeatures"));

    public VkTensorFormatPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorFormatPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorFormatPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorFormatPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorFormatPropertiesARM alloc(SegmentAllocator allocator) { return new VkTensorFormatPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorFormatPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkTensorFormatPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM); }
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM);
        return s;
    }
    public VkTensorFormatPropertiesARM copyFrom(VkTensorFormatPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorFormatPropertiesARM reinterpret(long count) { return new VkTensorFormatPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorFormatPropertiesARM asSlice(long index) { return new VkTensorFormatPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorFormatPropertiesARM asSlice(long index, long count) { return new VkTensorFormatPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorFormatPropertiesARM at(long index, Consumer<VkTensorFormatPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long optimalTilingTensorFeaturesAt(long index) { return (long) VH_optimalTilingTensorFeatures.get(this.segment(), 0L, index); }
    public long linearTilingTensorFeaturesAt(long index) { return (long) VH_linearTilingTensorFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long optimalTilingTensorFeatures() { return (long) VH_optimalTilingTensorFeatures.get(this.segment(), 0L, 0L); }
    public long linearTilingTensorFeatures() { return (long) VH_linearTilingTensorFeatures.get(this.segment(), 0L, 0L); }
    public VkTensorFormatPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorFormatPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorFormatPropertiesARM optimalTilingTensorFeaturesAt(long index, long value) { VH_optimalTilingTensorFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkTensorFormatPropertiesARM linearTilingTensorFeaturesAt(long index, long value) { VH_linearTilingTensorFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkTensorFormatPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorFormatPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorFormatPropertiesARM optimalTilingTensorFeatures(long value) { VH_optimalTilingTensorFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorFormatPropertiesARM linearTilingTensorFeatures(long value) { VH_linearTilingTensorFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorFormatPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorFormatPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorFormatPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorFormatPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _optimalTilingTensorFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalTilingTensorFeatures, index), LAYOUT_optimalTilingTensorFeatures); }
    public MemorySegment _optimalTilingTensorFeatures() { return _optimalTilingTensorFeaturesAt(0L); }
    public VkTensorFormatPropertiesARM _optimalTilingTensorFeaturesAt(long index, MemorySegment src) { _optimalTilingTensorFeaturesAt(index).copyFrom(src); return this; }
    public VkTensorFormatPropertiesARM _optimalTilingTensorFeatures(MemorySegment src) { return _optimalTilingTensorFeaturesAt(0L, src); }
    public MemorySegment _linearTilingTensorFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_linearTilingTensorFeatures, index), LAYOUT_linearTilingTensorFeatures); }
    public MemorySegment _linearTilingTensorFeatures() { return _linearTilingTensorFeaturesAt(0L); }
    public VkTensorFormatPropertiesARM _linearTilingTensorFeaturesAt(long index, MemorySegment src) { _linearTilingTensorFeaturesAt(index).copyFrom(src); return this; }
    public VkTensorFormatPropertiesARM _linearTilingTensorFeatures(MemorySegment src) { return _linearTilingTensorFeaturesAt(0L, src); }
}
