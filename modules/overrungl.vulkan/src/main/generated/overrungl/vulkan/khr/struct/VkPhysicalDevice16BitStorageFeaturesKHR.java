// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevice16BitStorageFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevice16BitStorageFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 storageBuffer16BitAccess;
///     VkBool32 uniformAndStorageBuffer16BitAccess;
///     VkBool32 storagePushConstant16;
///     VkBool32 storageInputOutput16;
/// }
/// ```
public final class VkPhysicalDevice16BitStorageFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_storageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final long OFFSET_uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final long OFFSET_storagePushConstant16 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
    public static final long OFFSET_storageInputOutput16 = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_storageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final MemoryLayout LAYOUT_storagePushConstant16 = LAYOUT.select(PathElement.groupElement("storagePushConstant16"));
    public static final MemoryLayout LAYOUT_storageInputOutput16 = LAYOUT.select(PathElement.groupElement("storageInputOutput16"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));

    public VkPhysicalDevice16BitStorageFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevice16BitStorageFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevice16BitStorageFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES); }
    public static VkPhysicalDevice16BitStorageFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
        return s;
    }
    public VkPhysicalDevice16BitStorageFeaturesKHR copyFrom(VkPhysicalDevice16BitStorageFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR reinterpret(long count) { return new VkPhysicalDevice16BitStorageFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevice16BitStorageFeaturesKHR asSlice(long index) { return new VkPhysicalDevice16BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevice16BitStorageFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevice16BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevice16BitStorageFeaturesKHR at(long index, Consumer<VkPhysicalDevice16BitStorageFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int storageBuffer16BitAccessAt(long index) { return (int) VH_storageBuffer16BitAccess.get(this.segment(), 0L, index); }
    public int uniformAndStorageBuffer16BitAccessAt(long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(this.segment(), 0L, index); }
    public int storagePushConstant16At(long index) { return (int) VH_storagePushConstant16.get(this.segment(), 0L, index); }
    public int storageInputOutput16At(long index) { return (int) VH_storageInputOutput16.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int storageBuffer16BitAccess() { return (int) VH_storageBuffer16BitAccess.get(this.segment(), 0L, 0L); }
    public int uniformAndStorageBuffer16BitAccess() { return (int) VH_uniformAndStorageBuffer16BitAccess.get(this.segment(), 0L, 0L); }
    public int storagePushConstant16() { return (int) VH_storagePushConstant16.get(this.segment(), 0L, 0L); }
    public int storageInputOutput16() { return (int) VH_storageInputOutput16.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storageBuffer16BitAccessAt(long index, int value) { VH_storageBuffer16BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR uniformAndStorageBuffer16BitAccessAt(long index, int value) { VH_uniformAndStorageBuffer16BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storagePushConstant16At(long index, int value) { VH_storagePushConstant16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storageInputOutput16At(long index, int value) { VH_storageInputOutput16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storageBuffer16BitAccess(int value) { VH_storageBuffer16BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR uniformAndStorageBuffer16BitAccess(int value) { VH_uniformAndStorageBuffer16BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storagePushConstant16(int value) { VH_storagePushConstant16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR storageInputOutput16(int value) { VH_storageInputOutput16.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _storageBuffer16BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBuffer16BitAccess, index), LAYOUT_storageBuffer16BitAccess); }
    public MemorySegment _storageBuffer16BitAccess() { return _storageBuffer16BitAccessAt(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storageBuffer16BitAccessAt(long index, MemorySegment src) { _storageBuffer16BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storageBuffer16BitAccess(MemorySegment src) { return _storageBuffer16BitAccessAt(0L, src); }
    public MemorySegment _uniformAndStorageBuffer16BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformAndStorageBuffer16BitAccess, index), LAYOUT_uniformAndStorageBuffer16BitAccess); }
    public MemorySegment _uniformAndStorageBuffer16BitAccess() { return _uniformAndStorageBuffer16BitAccessAt(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _uniformAndStorageBuffer16BitAccessAt(long index, MemorySegment src) { _uniformAndStorageBuffer16BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _uniformAndStorageBuffer16BitAccess(MemorySegment src) { return _uniformAndStorageBuffer16BitAccessAt(0L, src); }
    public MemorySegment _storagePushConstant16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storagePushConstant16, index), LAYOUT_storagePushConstant16); }
    public MemorySegment _storagePushConstant16() { return _storagePushConstant16At(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storagePushConstant16At(long index, MemorySegment src) { _storagePushConstant16At(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storagePushConstant16(MemorySegment src) { return _storagePushConstant16At(0L, src); }
    public MemorySegment _storageInputOutput16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageInputOutput16, index), LAYOUT_storageInputOutput16); }
    public MemorySegment _storageInputOutput16() { return _storageInputOutput16At(0L); }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storageInputOutput16At(long index, MemorySegment src) { _storageInputOutput16At(index).copyFrom(src); return this; }
    public VkPhysicalDevice16BitStorageFeaturesKHR _storageInputOutput16(MemorySegment src) { return _storageInputOutput16At(0L, src); }
}
