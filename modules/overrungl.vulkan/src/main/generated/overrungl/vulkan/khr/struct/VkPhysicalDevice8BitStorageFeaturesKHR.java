// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevice8BitStorageFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevice8BitStorageFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 storageBuffer8BitAccess;
///     VkBool32 uniformAndStorageBuffer8BitAccess;
///     VkBool32 storagePushConstant8;
/// }
/// ```
public final class VkPhysicalDevice8BitStorageFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_storageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final long OFFSET_uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final long OFFSET_storagePushConstant8 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_storageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final MemoryLayout LAYOUT_storagePushConstant8 = LAYOUT.select(PathElement.groupElement("storagePushConstant8"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_storageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final VarHandle VH_uniformAndStorageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final VarHandle VH_storagePushConstant8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8"));

    public VkPhysicalDevice8BitStorageFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevice8BitStorageFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
    public static VkPhysicalDevice8BitStorageFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
        return s;
    }
    public VkPhysicalDevice8BitStorageFeaturesKHR copyFrom(VkPhysicalDevice8BitStorageFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR reinterpret(long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevice8BitStorageFeaturesKHR asSlice(long index) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevice8BitStorageFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevice8BitStorageFeaturesKHR at(long index, Consumer<VkPhysicalDevice8BitStorageFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int storageBuffer8BitAccessAt(long index) { return (int) VH_storageBuffer8BitAccess.get(this.segment(), 0L, index); }
    public int uniformAndStorageBuffer8BitAccessAt(long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get(this.segment(), 0L, index); }
    public int storagePushConstant8At(long index) { return (int) VH_storagePushConstant8.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int storageBuffer8BitAccess() { return (int) VH_storageBuffer8BitAccess.get(this.segment(), 0L, 0L); }
    public int uniformAndStorageBuffer8BitAccess() { return (int) VH_uniformAndStorageBuffer8BitAccess.get(this.segment(), 0L, 0L); }
    public int storagePushConstant8() { return (int) VH_storagePushConstant8.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccessAt(long index, int value) { VH_storageBuffer8BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccessAt(long index, int value) { VH_uniformAndStorageBuffer8BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8At(long index, int value) { VH_storagePushConstant8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccess(int value) { VH_storageBuffer8BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccess(int value) { VH_uniformAndStorageBuffer8BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8(int value) { VH_storagePushConstant8.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _storageBuffer8BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBuffer8BitAccess, index), LAYOUT_storageBuffer8BitAccess); }
    public MemorySegment _storageBuffer8BitAccess() { return _storageBuffer8BitAccessAt(0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR _storageBuffer8BitAccessAt(long index, MemorySegment src) { _storageBuffer8BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR _storageBuffer8BitAccess(MemorySegment src) { return _storageBuffer8BitAccessAt(0L, src); }
    public MemorySegment _uniformAndStorageBuffer8BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformAndStorageBuffer8BitAccess, index), LAYOUT_uniformAndStorageBuffer8BitAccess); }
    public MemorySegment _uniformAndStorageBuffer8BitAccess() { return _uniformAndStorageBuffer8BitAccessAt(0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR _uniformAndStorageBuffer8BitAccessAt(long index, MemorySegment src) { _uniformAndStorageBuffer8BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR _uniformAndStorageBuffer8BitAccess(MemorySegment src) { return _uniformAndStorageBuffer8BitAccessAt(0L, src); }
    public MemorySegment _storagePushConstant8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storagePushConstant8, index), LAYOUT_storagePushConstant8); }
    public MemorySegment _storagePushConstant8() { return _storagePushConstant8At(0L); }
    public VkPhysicalDevice8BitStorageFeaturesKHR _storagePushConstant8At(long index, MemorySegment src) { _storagePushConstant8At(index).copyFrom(src); return this; }
    public VkPhysicalDevice8BitStorageFeaturesKHR _storagePushConstant8(MemorySegment src) { return _storagePushConstant8At(0L, src); }
}
