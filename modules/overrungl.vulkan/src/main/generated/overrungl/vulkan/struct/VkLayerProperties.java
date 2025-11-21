// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLayerProperties`.
/// ## Layout
/// ```
/// struct VkLayerProperties {
///     char layerName[VK_MAX_EXTENSION_NAME_SIZE];
///     uint32_t specVersion;
///     uint32_t implementationVersion;
///     char description[VK_MAX_DESCRIPTION_SIZE];
/// }
/// ```
public final class VkLayerProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    public static final long OFFSET_layerName = LAYOUT.byteOffset(PathElement.groupElement("layerName"));
    public static final long OFFSET_specVersion = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
    public static final long OFFSET_implementationVersion = LAYOUT.byteOffset(PathElement.groupElement("implementationVersion"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_layerName = LAYOUT.select(PathElement.groupElement("layerName"));
    public static final MemoryLayout LAYOUT_specVersion = LAYOUT.select(PathElement.groupElement("specVersion"));
    public static final MemoryLayout LAYOUT_implementationVersion = LAYOUT.select(PathElement.groupElement("implementationVersion"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final VarHandle VH_layerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerName"), PathElement.sequenceElement());
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));
    public static final VarHandle VH_implementationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationVersion"));
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());

    public VkLayerProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLayerProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkLayerProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLayerProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLayerProperties alloc(SegmentAllocator allocator) { return new VkLayerProperties(allocator.allocate(LAYOUT), 1); }
    public static VkLayerProperties alloc(SegmentAllocator allocator, long count) { return new VkLayerProperties(allocator.allocate(LAYOUT, count), count); }
    public VkLayerProperties copyFrom(VkLayerProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLayerProperties reinterpret(long count) { return new VkLayerProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLayerProperties asSlice(long index) { return new VkLayerProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLayerProperties asSlice(long index, long count) { return new VkLayerProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLayerProperties at(long index, Consumer<VkLayerProperties> func) { func.accept(asSlice(index)); return this; }
    public byte layerNameAt(long index, long index0) { return (byte) VH_layerName.get(this.segment(), 0L, index, index0); }
    public int specVersionAt(long index) { return (int) VH_specVersion.get(this.segment(), 0L, index); }
    public int implementationVersionAt(long index) { return (int) VH_implementationVersion.get(this.segment(), 0L, index); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public byte layerName(long index0) { return (byte) VH_layerName.get(this.segment(), 0L, 0L, index0); }
    public int specVersion() { return (int) VH_specVersion.get(this.segment(), 0L, 0L); }
    public int implementationVersion() { return (int) VH_implementationVersion.get(this.segment(), 0L, 0L); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public VkLayerProperties layerNameAt(long index, long index0, byte value) { VH_layerName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkLayerProperties specVersionAt(long index, int value) { VH_specVersion.set(this.segment(), 0L, index, value); return this; }
    public VkLayerProperties implementationVersionAt(long index, int value) { VH_implementationVersion.set(this.segment(), 0L, index, value); return this; }
    public VkLayerProperties descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkLayerProperties layerName(long index0, byte value) { VH_layerName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkLayerProperties specVersion(int value) { VH_specVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerProperties implementationVersion(int value) { VH_implementationVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkLayerProperties description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _layerNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerName, index), LAYOUT_layerName); }
    public MemorySegment _layerName() { return _layerNameAt(0L); }
    public VkLayerProperties _layerNameAt(long index, MemorySegment src) { _layerNameAt(index).copyFrom(src); return this; }
    public VkLayerProperties _layerName(MemorySegment src) { return _layerNameAt(0L, src); }
    public MemorySegment _specVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_specVersion, index), LAYOUT_specVersion); }
    public MemorySegment _specVersion() { return _specVersionAt(0L); }
    public VkLayerProperties _specVersionAt(long index, MemorySegment src) { _specVersionAt(index).copyFrom(src); return this; }
    public VkLayerProperties _specVersion(MemorySegment src) { return _specVersionAt(0L, src); }
    public MemorySegment _implementationVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_implementationVersion, index), LAYOUT_implementationVersion); }
    public MemorySegment _implementationVersion() { return _implementationVersionAt(0L); }
    public VkLayerProperties _implementationVersionAt(long index, MemorySegment src) { _implementationVersionAt(index).copyFrom(src); return this; }
    public VkLayerProperties _implementationVersion(MemorySegment src) { return _implementationVersionAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkLayerProperties _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkLayerProperties _description(MemorySegment src) { return _descriptionAt(0L, src); }
}
