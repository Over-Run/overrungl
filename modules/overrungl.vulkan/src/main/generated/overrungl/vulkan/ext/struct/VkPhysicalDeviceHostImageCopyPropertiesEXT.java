// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceHostImageCopyPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceHostImageCopyPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t copySrcLayoutCount;
///     VkImageLayout* pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout* pCopyDstLayouts;
///     uint8_t optimalTilingLayoutUUID[VK_UUID_SIZE];
///     VkBool32 identicalMemoryTypeRequirements;
/// }
/// ```
public final class VkPhysicalDeviceHostImageCopyPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_copySrcLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
    public static final long OFFSET_pCopySrcLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
    public static final long OFFSET_copyDstLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
    public static final long OFFSET_pCopyDstLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
    public static final long OFFSET_optimalTilingLayoutUUID = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
    public static final long OFFSET_identicalMemoryTypeRequirements = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_copySrcLayoutCount = LAYOUT.select(PathElement.groupElement("copySrcLayoutCount"));
    public static final MemoryLayout LAYOUT_pCopySrcLayouts = LAYOUT.select(PathElement.groupElement("pCopySrcLayouts"));
    public static final MemoryLayout LAYOUT_copyDstLayoutCount = LAYOUT.select(PathElement.groupElement("copyDstLayoutCount"));
    public static final MemoryLayout LAYOUT_pCopyDstLayouts = LAYOUT.select(PathElement.groupElement("pCopyDstLayouts"));
    public static final MemoryLayout LAYOUT_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    public static final MemoryLayout LAYOUT_identicalMemoryTypeRequirements = LAYOUT.select(PathElement.groupElement("identicalMemoryTypeRequirements"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    public static final VarHandle VH_optimalTilingLayoutUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    public VkPhysicalDeviceHostImageCopyPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHostImageCopyPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHostImageCopyPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES); }
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyFrom(VkPhysicalDeviceHostImageCopyPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceHostImageCopyPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceHostImageCopyPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceHostImageCopyPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT at(long index, Consumer<VkPhysicalDeviceHostImageCopyPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int copySrcLayoutCountAt(long index) { return (int) VH_copySrcLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pCopySrcLayoutsAt(long index) { return (MemorySegment) VH_pCopySrcLayouts.get(this.segment(), 0L, index); }
    public int copyDstLayoutCountAt(long index) { return (int) VH_copyDstLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pCopyDstLayoutsAt(long index) { return (MemorySegment) VH_pCopyDstLayouts.get(this.segment(), 0L, index); }
    public byte optimalTilingLayoutUUIDAt(long index, long index0) { return (byte) VH_optimalTilingLayoutUUID.get(this.segment(), 0L, index, index0); }
    public int identicalMemoryTypeRequirementsAt(long index) { return (int) VH_identicalMemoryTypeRequirements.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int copySrcLayoutCount() { return (int) VH_copySrcLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCopySrcLayouts() { return (MemorySegment) VH_pCopySrcLayouts.get(this.segment(), 0L, 0L); }
    public int copyDstLayoutCount() { return (int) VH_copyDstLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCopyDstLayouts() { return (MemorySegment) VH_pCopyDstLayouts.get(this.segment(), 0L, 0L); }
    public byte optimalTilingLayoutUUID(long index0) { return (byte) VH_optimalTilingLayoutUUID.get(this.segment(), 0L, 0L, index0); }
    public int identicalMemoryTypeRequirements() { return (int) VH_identicalMemoryTypeRequirements.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copySrcLayoutCountAt(long index, int value) { VH_copySrcLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopySrcLayoutsAt(long index, MemorySegment value) { VH_pCopySrcLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyDstLayoutCountAt(long index, int value) { VH_copyDstLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopyDstLayoutsAt(long index, MemorySegment value) { VH_pCopyDstLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUIDAt(long index, long index0, byte value) { VH_optimalTilingLayoutUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT identicalMemoryTypeRequirementsAt(long index, int value) { VH_identicalMemoryTypeRequirements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copySrcLayoutCount(int value) { VH_copySrcLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopySrcLayouts(MemorySegment value) { VH_pCopySrcLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyDstLayoutCount(int value) { VH_copyDstLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopyDstLayouts(MemorySegment value) { VH_pCopyDstLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(long index0, byte value) { VH_optimalTilingLayoutUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT identicalMemoryTypeRequirements(int value) { VH_identicalMemoryTypeRequirements.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _copySrcLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copySrcLayoutCount, index), LAYOUT_copySrcLayoutCount); }
    public MemorySegment _copySrcLayoutCount() { return _copySrcLayoutCountAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _copySrcLayoutCountAt(long index, MemorySegment src) { _copySrcLayoutCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _copySrcLayoutCount(MemorySegment src) { return _copySrcLayoutCountAt(0L, src); }
    public MemorySegment _pCopySrcLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCopySrcLayouts, index), LAYOUT_pCopySrcLayouts); }
    public MemorySegment _pCopySrcLayouts() { return _pCopySrcLayoutsAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pCopySrcLayoutsAt(long index, MemorySegment src) { _pCopySrcLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pCopySrcLayouts(MemorySegment src) { return _pCopySrcLayoutsAt(0L, src); }
    public MemorySegment _copyDstLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyDstLayoutCount, index), LAYOUT_copyDstLayoutCount); }
    public MemorySegment _copyDstLayoutCount() { return _copyDstLayoutCountAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _copyDstLayoutCountAt(long index, MemorySegment src) { _copyDstLayoutCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _copyDstLayoutCount(MemorySegment src) { return _copyDstLayoutCountAt(0L, src); }
    public MemorySegment _pCopyDstLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCopyDstLayouts, index), LAYOUT_pCopyDstLayouts); }
    public MemorySegment _pCopyDstLayouts() { return _pCopyDstLayoutsAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pCopyDstLayoutsAt(long index, MemorySegment src) { _pCopyDstLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _pCopyDstLayouts(MemorySegment src) { return _pCopyDstLayoutsAt(0L, src); }
    public MemorySegment _optimalTilingLayoutUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID); }
    public MemorySegment _optimalTilingLayoutUUID() { return _optimalTilingLayoutUUIDAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _optimalTilingLayoutUUIDAt(long index, MemorySegment src) { _optimalTilingLayoutUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _optimalTilingLayoutUUID(MemorySegment src) { return _optimalTilingLayoutUUIDAt(0L, src); }
    public MemorySegment _identicalMemoryTypeRequirementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identicalMemoryTypeRequirements, index), LAYOUT_identicalMemoryTypeRequirements); }
    public MemorySegment _identicalMemoryTypeRequirements() { return _identicalMemoryTypeRequirementsAt(0L); }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _identicalMemoryTypeRequirementsAt(long index, MemorySegment src) { _identicalMemoryTypeRequirementsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceHostImageCopyPropertiesEXT _identicalMemoryTypeRequirements(MemorySegment src) { return _identicalMemoryTypeRequirementsAt(0L, src); }
}
