// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentSampleLocationsEXT`.
/// ## Layout
/// ```
/// struct VkAttachmentSampleLocationsEXT {
///     uint32_t attachmentIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// }
/// ```
public final class VkAttachmentSampleLocationsEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long OFFSET_attachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("attachmentIndex"));
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    public static final MemoryLayout LAYOUT_attachmentIndex = LAYOUT.select(PathElement.groupElement("attachmentIndex"));
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));
    public static final VarHandle VH_attachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentIndex"));
    public static final VarHandle VH_sampleLocationsInfo$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sType"));
    public static final VarHandle VH_sampleLocationsInfo$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsPerPixel"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationGridSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationGridSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_sampleLocationsInfo$sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("sampleLocationsCount"));
    public static final VarHandle VH_sampleLocationsInfo$pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsInfo"), PathElement.groupElement("pSampleLocations"));

    public VkAttachmentSampleLocationsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentSampleLocationsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentSampleLocationsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentSampleLocationsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkAttachmentSampleLocationsEXT(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentSampleLocationsEXT alloc(SegmentAllocator allocator, long count) { return new VkAttachmentSampleLocationsEXT(allocator.allocate(LAYOUT, count), count); }
    public VkAttachmentSampleLocationsEXT copyFrom(VkAttachmentSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentSampleLocationsEXT reinterpret(long count) { return new VkAttachmentSampleLocationsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentSampleLocationsEXT asSlice(long index) { return new VkAttachmentSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentSampleLocationsEXT asSlice(long index, long count) { return new VkAttachmentSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentSampleLocationsEXT at(long index, Consumer<VkAttachmentSampleLocationsEXT> func) { func.accept(asSlice(index)); return this; }
    public int attachmentIndexAt(long index) { return (int) VH_attachmentIndex.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sTypeAt(long index) { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pNextAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsPerPixelAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$widthAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationGridSize$heightAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, index); }
    public int sampleLocationsInfo$sampleLocationsCountAt(long index) { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, index); }
    public MemorySegment sampleLocationsInfo$pSampleLocationsAt(long index) { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, index); }
    public int attachmentIndex() { return (int) VH_attachmentIndex.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sType() { return (int) VH_sampleLocationsInfo$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pNext() { return (MemorySegment) VH_sampleLocationsInfo$pNext.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsPerPixel() { return (int) VH_sampleLocationsInfo$sampleLocationsPerPixel.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$width() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$width.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationGridSize$height() { return (int) VH_sampleLocationsInfo$sampleLocationGridSize$height.get(this.segment(), 0L, 0L); }
    public int sampleLocationsInfo$sampleLocationsCount() { return (int) VH_sampleLocationsInfo$sampleLocationsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment sampleLocationsInfo$pSampleLocations() { return (MemorySegment) VH_sampleLocationsInfo$pSampleLocations.get(this.segment(), 0L, 0L); }
    public VkAttachmentSampleLocationsEXT attachmentIndexAt(long index, int value) { VH_attachmentIndex.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sTypeAt(long index, int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$pNextAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationsPerPixelAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$widthAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$heightAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationsCountAt(long index, int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$pSampleLocationsAt(long index, MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleLocationsEXT attachmentIndex(int value) { VH_attachmentIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sType(int value) { VH_sampleLocationsInfo$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$pNext(MemorySegment value) { VH_sampleLocationsInfo$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationsPerPixel(int value) { VH_sampleLocationsInfo$sampleLocationsPerPixel.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$width(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationGridSize$height(int value) { VH_sampleLocationsInfo$sampleLocationGridSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$sampleLocationsCount(int value) { VH_sampleLocationsInfo$sampleLocationsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo$pSampleLocations(MemorySegment value) { VH_sampleLocationsInfo$pSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _attachmentIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentIndex, index), LAYOUT_attachmentIndex); }
    public MemorySegment _attachmentIndex() { return _attachmentIndexAt(0L); }
    public VkAttachmentSampleLocationsEXT _attachmentIndexAt(long index, MemorySegment src) { _attachmentIndexAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleLocationsEXT _attachmentIndex(MemorySegment src) { return _attachmentIndexAt(0L, src); }
    public MemorySegment _sampleLocationsInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    public MemorySegment _sampleLocationsInfo() { return _sampleLocationsInfoAt(0L); }
    public VkAttachmentSampleLocationsEXT _sampleLocationsInfoAt(long index, MemorySegment src) { _sampleLocationsInfoAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleLocationsEXT _sampleLocationsInfo(MemorySegment src) { return _sampleLocationsInfoAt(0L, src); }
}
