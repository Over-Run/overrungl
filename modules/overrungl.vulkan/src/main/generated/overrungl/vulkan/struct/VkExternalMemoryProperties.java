// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalMemoryProperties`.
/// ## Layout
/// ```
/// struct VkExternalMemoryProperties {
///     VkExternalMemoryFeatureFlags externalMemoryFeatures;
///     VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
/// }
/// ```
public final class VkExternalMemoryProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    public static final long OFFSET_externalMemoryFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    public static final MemoryLayout LAYOUT_externalMemoryFeatures = LAYOUT.select(PathElement.groupElement("externalMemoryFeatures"));
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));

    public VkExternalMemoryProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalMemoryProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalMemoryProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT), 1); }
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT, count), count); }
    public VkExternalMemoryProperties copyFrom(VkExternalMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalMemoryProperties reinterpret(long count) { return new VkExternalMemoryProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalMemoryProperties asSlice(long index) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalMemoryProperties asSlice(long index, long count) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalMemoryProperties at(long index, Consumer<VkExternalMemoryProperties> func) { func.accept(asSlice(index)); return this; }
    public int externalMemoryFeaturesAt(long index) { return (int) VH_externalMemoryFeatures.get(this.segment(), 0L, index); }
    public int exportFromImportedHandleTypesAt(long index) { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, index); }
    public int compatibleHandleTypesAt(long index) { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, index); }
    public int externalMemoryFeatures() { return (int) VH_externalMemoryFeatures.get(this.segment(), 0L, 0L); }
    public int exportFromImportedHandleTypes() { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, 0L); }
    public int compatibleHandleTypes() { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, 0L); }
    public VkExternalMemoryProperties externalMemoryFeaturesAt(long index, int value) { VH_externalMemoryFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryProperties exportFromImportedHandleTypesAt(long index, int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryProperties compatibleHandleTypesAt(long index, int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryProperties externalMemoryFeatures(int value) { VH_externalMemoryFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryProperties exportFromImportedHandleTypes(int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryProperties compatibleHandleTypes(int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _externalMemoryFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalMemoryFeatures, index), LAYOUT_externalMemoryFeatures); }
    public MemorySegment _externalMemoryFeatures() { return _externalMemoryFeaturesAt(0L); }
    public VkExternalMemoryProperties _externalMemoryFeaturesAt(long index, MemorySegment src) { _externalMemoryFeaturesAt(index).copyFrom(src); return this; }
    public VkExternalMemoryProperties _externalMemoryFeatures(MemorySegment src) { return _externalMemoryFeaturesAt(0L, src); }
    public MemorySegment _exportFromImportedHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exportFromImportedHandleTypes, index), LAYOUT_exportFromImportedHandleTypes); }
    public MemorySegment _exportFromImportedHandleTypes() { return _exportFromImportedHandleTypesAt(0L); }
    public VkExternalMemoryProperties _exportFromImportedHandleTypesAt(long index, MemorySegment src) { _exportFromImportedHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalMemoryProperties _exportFromImportedHandleTypes(MemorySegment src) { return _exportFromImportedHandleTypesAt(0L, src); }
    public MemorySegment _compatibleHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleHandleTypes, index), LAYOUT_compatibleHandleTypes); }
    public MemorySegment _compatibleHandleTypes() { return _compatibleHandleTypesAt(0L); }
    public VkExternalMemoryProperties _compatibleHandleTypesAt(long index, MemorySegment src) { _compatibleHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalMemoryProperties _compatibleHandleTypes(MemorySegment src) { return _compatibleHandleTypesAt(0L, src); }
}
