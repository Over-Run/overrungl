// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferConstraintsInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkBufferConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCreateInfo createInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
/// }
/// ```
public final class VkBufferConstraintsInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkBufferCreateInfo.LAYOUT.withName("createInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_createInfo = LAYOUT.byteOffset(PathElement.groupElement("createInfo"));
    public static final long OFFSET_requiredFormatFeatures = LAYOUT.byteOffset(PathElement.groupElement("requiredFormatFeatures"));
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_createInfo = LAYOUT.select(PathElement.groupElement("createInfo"));
    public static final MemoryLayout LAYOUT_requiredFormatFeatures = LAYOUT.select(PathElement.groupElement("requiredFormatFeatures"));
    public static final MemoryLayout LAYOUT_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_createInfo$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("sType"));
    public static final VarHandle VH_createInfo$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_createInfo$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("flags"));
    public static final VarHandle VH_createInfo$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("size"));
    public static final VarHandle VH_createInfo$usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("usage"));
    public static final VarHandle VH_createInfo$sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_createInfo$queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_createInfo$pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfo"), PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    public static final VarHandle VH_bufferCollectionConstraints$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("sType"));
    public static final VarHandle VH_bufferCollectionConstraints$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCount"));
    public static final VarHandle VH_bufferCollectionConstraints$maxBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("maxBufferCount"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForCamping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForCamping"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForDedicatedSlack"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForSharedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForSharedSlack"));

    public VkBufferConstraintsInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferConstraintsInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkBufferConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_CONSTRAINTS_INFO_FUCHSIA); }
    public static VkBufferConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_CONSTRAINTS_INFO_FUCHSIA);
        return s;
    }
    public VkBufferConstraintsInfoFUCHSIA copyFrom(VkBufferConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferConstraintsInfoFUCHSIA reinterpret(long count) { return new VkBufferConstraintsInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkBufferConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferConstraintsInfoFUCHSIA at(long index, Consumer<VkBufferConstraintsInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int createInfo$sTypeAt(long index) { return (int) VH_createInfo$sType.get(this.segment(), 0L, index); }
    public MemorySegment createInfo$pNextAt(long index) { return (MemorySegment) VH_createInfo$pNext.get(this.segment(), 0L, index); }
    public int createInfo$flagsAt(long index) { return (int) VH_createInfo$flags.get(this.segment(), 0L, index); }
    public long createInfo$sizeAt(long index) { return (long) VH_createInfo$size.get(this.segment(), 0L, index); }
    public int createInfo$usageAt(long index) { return (int) VH_createInfo$usage.get(this.segment(), 0L, index); }
    public int createInfo$sharingModeAt(long index) { return (int) VH_createInfo$sharingMode.get(this.segment(), 0L, index); }
    public int createInfo$queueFamilyIndexCountAt(long index) { return (int) VH_createInfo$queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment createInfo$pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_createInfo$pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int requiredFormatFeaturesAt(long index) { return (int) VH_requiredFormatFeatures.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$sTypeAt(long index) { return (int) VH_bufferCollectionConstraints$sType.get(this.segment(), 0L, index); }
    public MemorySegment bufferCollectionConstraints$pNextAt(long index) { return (MemorySegment) VH_bufferCollectionConstraints$pNext.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCount.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$maxBufferCountAt(long index) { return (int) VH_bufferCollectionConstraints$maxBufferCount.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForCampingAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForCamping.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForDedicatedSlackAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForSharedSlackAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForSharedSlack.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int createInfo$sType() { return (int) VH_createInfo$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment createInfo$pNext() { return (MemorySegment) VH_createInfo$pNext.get(this.segment(), 0L, 0L); }
    public int createInfo$flags() { return (int) VH_createInfo$flags.get(this.segment(), 0L, 0L); }
    public long createInfo$size() { return (long) VH_createInfo$size.get(this.segment(), 0L, 0L); }
    public int createInfo$usage() { return (int) VH_createInfo$usage.get(this.segment(), 0L, 0L); }
    public int createInfo$sharingMode() { return (int) VH_createInfo$sharingMode.get(this.segment(), 0L, 0L); }
    public int createInfo$queueFamilyIndexCount() { return (int) VH_createInfo$queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment createInfo$pQueueFamilyIndices() { return (MemorySegment) VH_createInfo$pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public int requiredFormatFeatures() { return (int) VH_requiredFormatFeatures.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$sType() { return (int) VH_bufferCollectionConstraints$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment bufferCollectionConstraints$pNext() { return (MemorySegment) VH_bufferCollectionConstraints$pNext.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCount() { return (int) VH_bufferCollectionConstraints$minBufferCount.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$maxBufferCount() { return (int) VH_bufferCollectionConstraints$maxBufferCount.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForCamping() { return (int) VH_bufferCollectionConstraints$minBufferCountForCamping.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForDedicatedSlack() { return (int) VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForSharedSlack() { return (int) VH_bufferCollectionConstraints$minBufferCountForSharedSlack.get(this.segment(), 0L, 0L); }
    public VkBufferConstraintsInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$sTypeAt(long index, int value) { VH_createInfo$sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$pNextAt(long index, MemorySegment value) { VH_createInfo$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$flagsAt(long index, int value) { VH_createInfo$flags.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$sizeAt(long index, long value) { VH_createInfo$size.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$usageAt(long index, int value) { VH_createInfo$usage.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$sharingModeAt(long index, int value) { VH_createInfo$sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$queueFamilyIndexCountAt(long index, int value) { VH_createInfo$queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_createInfo$pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA requiredFormatFeaturesAt(long index, int value) { VH_requiredFormatFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$sTypeAt(long index, int value) { VH_bufferCollectionConstraints$sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$pNextAt(long index, MemorySegment value) { VH_bufferCollectionConstraints$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$maxBufferCountAt(long index, int value) { VH_bufferCollectionConstraints$maxBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForCampingAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForCamping.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForDedicatedSlackAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForSharedSlackAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForSharedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$sType(int value) { VH_createInfo$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$pNext(MemorySegment value) { VH_createInfo$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$flags(int value) { VH_createInfo$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$size(long value) { VH_createInfo$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$usage(int value) { VH_createInfo$usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$sharingMode(int value) { VH_createInfo$sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$queueFamilyIndexCount(int value) { VH_createInfo$queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA createInfo$pQueueFamilyIndices(MemorySegment value) { VH_createInfo$pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA requiredFormatFeatures(int value) { VH_requiredFormatFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$sType(int value) { VH_bufferCollectionConstraints$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$pNext(MemorySegment value) { VH_bufferCollectionConstraints$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCount(int value) { VH_bufferCollectionConstraints$minBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$maxBufferCount(int value) { VH_bufferCollectionConstraints$maxBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForCamping(int value) { VH_bufferCollectionConstraints$minBufferCountForCamping.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForDedicatedSlack(int value) { VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForSharedSlack(int value) { VH_bufferCollectionConstraints$minBufferCountForSharedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferConstraintsInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferConstraintsInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferConstraintsInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferConstraintsInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _createInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_createInfo, index), LAYOUT_createInfo); }
    public MemorySegment _createInfo() { return _createInfoAt(0L); }
    public VkBufferConstraintsInfoFUCHSIA _createInfoAt(long index, MemorySegment src) { _createInfoAt(index).copyFrom(src); return this; }
    public VkBufferConstraintsInfoFUCHSIA _createInfo(MemorySegment src) { return _createInfoAt(0L, src); }
    public MemorySegment _requiredFormatFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiredFormatFeatures, index), LAYOUT_requiredFormatFeatures); }
    public MemorySegment _requiredFormatFeatures() { return _requiredFormatFeaturesAt(0L); }
    public VkBufferConstraintsInfoFUCHSIA _requiredFormatFeaturesAt(long index, MemorySegment src) { _requiredFormatFeaturesAt(index).copyFrom(src); return this; }
    public VkBufferConstraintsInfoFUCHSIA _requiredFormatFeatures(MemorySegment src) { return _requiredFormatFeaturesAt(0L, src); }
    public MemorySegment _bufferCollectionConstraintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints); }
    public MemorySegment _bufferCollectionConstraints() { return _bufferCollectionConstraintsAt(0L); }
    public VkBufferConstraintsInfoFUCHSIA _bufferCollectionConstraintsAt(long index, MemorySegment src) { _bufferCollectionConstraintsAt(index).copyFrom(src); return this; }
    public VkBufferConstraintsInfoFUCHSIA _bufferCollectionConstraints(MemorySegment src) { return _bufferCollectionConstraintsAt(0L, src); }
}
