// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceCreateInfo`.
/// ## Layout
/// ```
/// struct VkDeviceCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceCreateFlags flags;
///     uint32_t queueCreateInfoCount;
///     const VkDeviceQueueCreateInfo* pQueueCreateInfos;
///     uint32_t enabledLayerCount;
///     const char* const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char* const* ppEnabledExtensionNames;
///     const VkPhysicalDeviceFeatures* pEnabledFeatures;
/// }
/// ```
public final class VkDeviceCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueCreateInfoCount"),
        ValueLayout.ADDRESS.withName("pQueueCreateInfos"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withName("ppEnabledExtensionNames"),
        ValueLayout.ADDRESS.withName("pEnabledFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_queueCreateInfoCount = LAYOUT.byteOffset(PathElement.groupElement("queueCreateInfoCount"));
    public static final long OFFSET_pQueueCreateInfos = LAYOUT.byteOffset(PathElement.groupElement("pQueueCreateInfos"));
    public static final long OFFSET_enabledLayerCount = LAYOUT.byteOffset(PathElement.groupElement("enabledLayerCount"));
    public static final long OFFSET_ppEnabledLayerNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledLayerNames"));
    public static final long OFFSET_enabledExtensionCount = LAYOUT.byteOffset(PathElement.groupElement("enabledExtensionCount"));
    public static final long OFFSET_ppEnabledExtensionNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledExtensionNames"));
    public static final long OFFSET_pEnabledFeatures = LAYOUT.byteOffset(PathElement.groupElement("pEnabledFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_queueCreateInfoCount = LAYOUT.select(PathElement.groupElement("queueCreateInfoCount"));
    public static final MemoryLayout LAYOUT_pQueueCreateInfos = LAYOUT.select(PathElement.groupElement("pQueueCreateInfos"));
    public static final MemoryLayout LAYOUT_enabledLayerCount = LAYOUT.select(PathElement.groupElement("enabledLayerCount"));
    public static final MemoryLayout LAYOUT_ppEnabledLayerNames = LAYOUT.select(PathElement.groupElement("ppEnabledLayerNames"));
    public static final MemoryLayout LAYOUT_enabledExtensionCount = LAYOUT.select(PathElement.groupElement("enabledExtensionCount"));
    public static final MemoryLayout LAYOUT_ppEnabledExtensionNames = LAYOUT.select(PathElement.groupElement("ppEnabledExtensionNames"));
    public static final MemoryLayout LAYOUT_pEnabledFeatures = LAYOUT.select(PathElement.groupElement("pEnabledFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_queueCreateInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCreateInfoCount"));
    public static final VarHandle VH_pQueueCreateInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueCreateInfos"));
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));
    public static final VarHandle VH_pEnabledFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledFeatures"));

    public VkDeviceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO); }
    public static VkDeviceCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
        return s;
    }
    public VkDeviceCreateInfo copyFrom(VkDeviceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceCreateInfo reinterpret(long count) { return new VkDeviceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceCreateInfo asSlice(long index) { return new VkDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceCreateInfo asSlice(long index, long count) { return new VkDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceCreateInfo at(long index, Consumer<VkDeviceCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int queueCreateInfoCountAt(long index) { return (int) VH_queueCreateInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueCreateInfosAt(long index) { return (MemorySegment) VH_pQueueCreateInfos.get(this.segment(), 0L, index); }
    public int enabledLayerCountAt(long index) { return (int) VH_enabledLayerCount.get(this.segment(), 0L, index); }
    public MemorySegment ppEnabledLayerNamesAt(long index) { return (MemorySegment) VH_ppEnabledLayerNames.get(this.segment(), 0L, index); }
    public int enabledExtensionCountAt(long index) { return (int) VH_enabledExtensionCount.get(this.segment(), 0L, index); }
    public MemorySegment ppEnabledExtensionNamesAt(long index) { return (MemorySegment) VH_ppEnabledExtensionNames.get(this.segment(), 0L, index); }
    public MemorySegment pEnabledFeaturesAt(long index) { return (MemorySegment) VH_pEnabledFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int queueCreateInfoCount() { return (int) VH_queueCreateInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueCreateInfos() { return (MemorySegment) VH_pQueueCreateInfos.get(this.segment(), 0L, 0L); }
    public int enabledLayerCount() { return (int) VH_enabledLayerCount.get(this.segment(), 0L, 0L); }
    public MemorySegment ppEnabledLayerNames() { return (MemorySegment) VH_ppEnabledLayerNames.get(this.segment(), 0L, 0L); }
    public int enabledExtensionCount() { return (int) VH_enabledExtensionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment ppEnabledExtensionNames() { return (MemorySegment) VH_ppEnabledExtensionNames.get(this.segment(), 0L, 0L); }
    public MemorySegment pEnabledFeatures() { return (MemorySegment) VH_pEnabledFeatures.get(this.segment(), 0L, 0L); }
    public VkDeviceCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo queueCreateInfoCountAt(long index, int value) { VH_queueCreateInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo pQueueCreateInfosAt(long index, MemorySegment value) { VH_pQueueCreateInfos.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo enabledLayerCountAt(long index, int value) { VH_enabledLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo ppEnabledLayerNamesAt(long index, MemorySegment value) { VH_ppEnabledLayerNames.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo enabledExtensionCountAt(long index, int value) { VH_enabledExtensionCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo ppEnabledExtensionNamesAt(long index, MemorySegment value) { VH_ppEnabledExtensionNames.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo pEnabledFeaturesAt(long index, MemorySegment value) { VH_pEnabledFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo queueCreateInfoCount(int value) { VH_queueCreateInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo pQueueCreateInfos(MemorySegment value) { VH_pQueueCreateInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo enabledLayerCount(int value) { VH_enabledLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo ppEnabledLayerNames(MemorySegment value) { VH_ppEnabledLayerNames.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo enabledExtensionCount(int value) { VH_enabledExtensionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo ppEnabledExtensionNames(MemorySegment value) { VH_ppEnabledExtensionNames.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceCreateInfo pEnabledFeatures(MemorySegment value) { VH_pEnabledFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _queueCreateInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueCreateInfoCount, index), LAYOUT_queueCreateInfoCount); }
    public MemorySegment _queueCreateInfoCount() { return _queueCreateInfoCountAt(0L); }
    public VkDeviceCreateInfo _queueCreateInfoCountAt(long index, MemorySegment src) { _queueCreateInfoCountAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _queueCreateInfoCount(MemorySegment src) { return _queueCreateInfoCountAt(0L, src); }
    public MemorySegment _pQueueCreateInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueCreateInfos, index), LAYOUT_pQueueCreateInfos); }
    public MemorySegment _pQueueCreateInfos() { return _pQueueCreateInfosAt(0L); }
    public VkDeviceCreateInfo _pQueueCreateInfosAt(long index, MemorySegment src) { _pQueueCreateInfosAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _pQueueCreateInfos(MemorySegment src) { return _pQueueCreateInfosAt(0L, src); }
    public MemorySegment _enabledLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enabledLayerCount, index), LAYOUT_enabledLayerCount); }
    public MemorySegment _enabledLayerCount() { return _enabledLayerCountAt(0L); }
    public VkDeviceCreateInfo _enabledLayerCountAt(long index, MemorySegment src) { _enabledLayerCountAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _enabledLayerCount(MemorySegment src) { return _enabledLayerCountAt(0L, src); }
    public MemorySegment _ppEnabledLayerNamesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppEnabledLayerNames, index), LAYOUT_ppEnabledLayerNames); }
    public MemorySegment _ppEnabledLayerNames() { return _ppEnabledLayerNamesAt(0L); }
    public VkDeviceCreateInfo _ppEnabledLayerNamesAt(long index, MemorySegment src) { _ppEnabledLayerNamesAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _ppEnabledLayerNames(MemorySegment src) { return _ppEnabledLayerNamesAt(0L, src); }
    public MemorySegment _enabledExtensionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enabledExtensionCount, index), LAYOUT_enabledExtensionCount); }
    public MemorySegment _enabledExtensionCount() { return _enabledExtensionCountAt(0L); }
    public VkDeviceCreateInfo _enabledExtensionCountAt(long index, MemorySegment src) { _enabledExtensionCountAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _enabledExtensionCount(MemorySegment src) { return _enabledExtensionCountAt(0L, src); }
    public MemorySegment _ppEnabledExtensionNamesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppEnabledExtensionNames, index), LAYOUT_ppEnabledExtensionNames); }
    public MemorySegment _ppEnabledExtensionNames() { return _ppEnabledExtensionNamesAt(0L); }
    public VkDeviceCreateInfo _ppEnabledExtensionNamesAt(long index, MemorySegment src) { _ppEnabledExtensionNamesAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _ppEnabledExtensionNames(MemorySegment src) { return _ppEnabledExtensionNamesAt(0L, src); }
    public MemorySegment _pEnabledFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pEnabledFeatures, index), LAYOUT_pEnabledFeatures); }
    public MemorySegment _pEnabledFeatures() { return _pEnabledFeaturesAt(0L); }
    public VkDeviceCreateInfo _pEnabledFeaturesAt(long index, MemorySegment src) { _pEnabledFeaturesAt(index).copyFrom(src); return this; }
    public VkDeviceCreateInfo _pEnabledFeatures(MemorySegment src) { return _pEnabledFeaturesAt(0L, src); }
}
