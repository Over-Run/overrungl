// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkValidationFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkValidationFeaturesEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t enabledValidationFeatureCount;
///     const VkValidationFeatureEnableEXT* pEnabledValidationFeatures;
///     uint32_t disabledValidationFeatureCount;
///     const VkValidationFeatureDisableEXT* pDisabledValidationFeatures;
/// }
/// ```
public final class VkValidationFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pEnabledValidationFeatures"),
        ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_enabledValidationFeatureCount = LAYOUT.byteOffset(PathElement.groupElement("enabledValidationFeatureCount"));
    public static final long OFFSET_pEnabledValidationFeatures = LAYOUT.byteOffset(PathElement.groupElement("pEnabledValidationFeatures"));
    public static final long OFFSET_disabledValidationFeatureCount = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationFeatureCount"));
    public static final long OFFSET_pDisabledValidationFeatures = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_enabledValidationFeatureCount = LAYOUT.select(PathElement.groupElement("enabledValidationFeatureCount"));
    public static final MemoryLayout LAYOUT_pEnabledValidationFeatures = LAYOUT.select(PathElement.groupElement("pEnabledValidationFeatures"));
    public static final MemoryLayout LAYOUT_disabledValidationFeatureCount = LAYOUT.select(PathElement.groupElement("disabledValidationFeatureCount"));
    public static final MemoryLayout LAYOUT_pDisabledValidationFeatures = LAYOUT.select(PathElement.groupElement("pDisabledValidationFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_enabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledValidationFeatureCount"));
    public static final VarHandle VH_pEnabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledValidationFeatures"));
    public static final VarHandle VH_disabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationFeatureCount"));
    public static final VarHandle VH_pDisabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationFeatures"));

    public VkValidationFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkValidationFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkValidationFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkValidationFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkValidationFeaturesEXT alloc(SegmentAllocator allocator) { return new VkValidationFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkValidationFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkValidationFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT); }
    public static VkValidationFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
        return s;
    }
    public VkValidationFeaturesEXT copyFrom(VkValidationFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkValidationFeaturesEXT reinterpret(long count) { return new VkValidationFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkValidationFeaturesEXT asSlice(long index) { return new VkValidationFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkValidationFeaturesEXT asSlice(long index, long count) { return new VkValidationFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkValidationFeaturesEXT at(long index, Consumer<VkValidationFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int enabledValidationFeatureCountAt(long index) { return (int) VH_enabledValidationFeatureCount.get(this.segment(), 0L, index); }
    public MemorySegment pEnabledValidationFeaturesAt(long index) { return (MemorySegment) VH_pEnabledValidationFeatures.get(this.segment(), 0L, index); }
    public int disabledValidationFeatureCountAt(long index) { return (int) VH_disabledValidationFeatureCount.get(this.segment(), 0L, index); }
    public MemorySegment pDisabledValidationFeaturesAt(long index) { return (MemorySegment) VH_pDisabledValidationFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int enabledValidationFeatureCount() { return (int) VH_enabledValidationFeatureCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pEnabledValidationFeatures() { return (MemorySegment) VH_pEnabledValidationFeatures.get(this.segment(), 0L, 0L); }
    public int disabledValidationFeatureCount() { return (int) VH_disabledValidationFeatureCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDisabledValidationFeatures() { return (MemorySegment) VH_pDisabledValidationFeatures.get(this.segment(), 0L, 0L); }
    public VkValidationFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT enabledValidationFeatureCountAt(long index, int value) { VH_enabledValidationFeatureCount.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT pEnabledValidationFeaturesAt(long index, MemorySegment value) { VH_pEnabledValidationFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT disabledValidationFeatureCountAt(long index, int value) { VH_disabledValidationFeatureCount.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT pDisabledValidationFeaturesAt(long index, MemorySegment value) { VH_pDisabledValidationFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFeaturesEXT enabledValidationFeatureCount(int value) { VH_enabledValidationFeatureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFeaturesEXT pEnabledValidationFeatures(MemorySegment value) { VH_pEnabledValidationFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFeaturesEXT disabledValidationFeatureCount(int value) { VH_disabledValidationFeatureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFeaturesEXT pDisabledValidationFeatures(MemorySegment value) { VH_pDisabledValidationFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkValidationFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkValidationFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _enabledValidationFeatureCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enabledValidationFeatureCount, index), LAYOUT_enabledValidationFeatureCount); }
    public MemorySegment _enabledValidationFeatureCount() { return _enabledValidationFeatureCountAt(0L); }
    public VkValidationFeaturesEXT _enabledValidationFeatureCountAt(long index, MemorySegment src) { _enabledValidationFeatureCountAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _enabledValidationFeatureCount(MemorySegment src) { return _enabledValidationFeatureCountAt(0L, src); }
    public MemorySegment _pEnabledValidationFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pEnabledValidationFeatures, index), LAYOUT_pEnabledValidationFeatures); }
    public MemorySegment _pEnabledValidationFeatures() { return _pEnabledValidationFeaturesAt(0L); }
    public VkValidationFeaturesEXT _pEnabledValidationFeaturesAt(long index, MemorySegment src) { _pEnabledValidationFeaturesAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _pEnabledValidationFeatures(MemorySegment src) { return _pEnabledValidationFeaturesAt(0L, src); }
    public MemorySegment _disabledValidationFeatureCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_disabledValidationFeatureCount, index), LAYOUT_disabledValidationFeatureCount); }
    public MemorySegment _disabledValidationFeatureCount() { return _disabledValidationFeatureCountAt(0L); }
    public VkValidationFeaturesEXT _disabledValidationFeatureCountAt(long index, MemorySegment src) { _disabledValidationFeatureCountAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _disabledValidationFeatureCount(MemorySegment src) { return _disabledValidationFeatureCountAt(0L, src); }
    public MemorySegment _pDisabledValidationFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDisabledValidationFeatures, index), LAYOUT_pDisabledValidationFeatures); }
    public MemorySegment _pDisabledValidationFeatures() { return _pDisabledValidationFeaturesAt(0L); }
    public VkValidationFeaturesEXT _pDisabledValidationFeaturesAt(long index, MemorySegment src) { _pDisabledValidationFeaturesAt(index).copyFrom(src); return this; }
    public VkValidationFeaturesEXT _pDisabledValidationFeatures(MemorySegment src) { return _pDisabledValidationFeaturesAt(0L, src); }
}
