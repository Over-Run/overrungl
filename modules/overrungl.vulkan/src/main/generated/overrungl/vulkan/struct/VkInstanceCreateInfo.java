// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkInstanceCreateInfo`.
/// ## Layout
/// ```
/// struct VkInstanceCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkInstanceCreateFlags flags;
///     const VkApplicationInfo* pApplicationInfo;
///     uint32_t enabledLayerCount;
///     const char* const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char* const* ppEnabledExtensionNames;
/// }
/// ```
public final class VkInstanceCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pApplicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withName("ppEnabledExtensionNames")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pApplicationInfo = LAYOUT.byteOffset(PathElement.groupElement("pApplicationInfo"));
    public static final long OFFSET_enabledLayerCount = LAYOUT.byteOffset(PathElement.groupElement("enabledLayerCount"));
    public static final long OFFSET_ppEnabledLayerNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledLayerNames"));
    public static final long OFFSET_enabledExtensionCount = LAYOUT.byteOffset(PathElement.groupElement("enabledExtensionCount"));
    public static final long OFFSET_ppEnabledExtensionNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledExtensionNames"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pApplicationInfo = LAYOUT.select(PathElement.groupElement("pApplicationInfo"));
    public static final MemoryLayout LAYOUT_enabledLayerCount = LAYOUT.select(PathElement.groupElement("enabledLayerCount"));
    public static final MemoryLayout LAYOUT_ppEnabledLayerNames = LAYOUT.select(PathElement.groupElement("ppEnabledLayerNames"));
    public static final MemoryLayout LAYOUT_enabledExtensionCount = LAYOUT.select(PathElement.groupElement("enabledExtensionCount"));
    public static final MemoryLayout LAYOUT_ppEnabledExtensionNames = LAYOUT.select(PathElement.groupElement("ppEnabledExtensionNames"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pApplicationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationInfo"));
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));

    public VkInstanceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkInstanceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkInstanceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkInstanceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO); }
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
        return s;
    }
    public VkInstanceCreateInfo copyFrom(VkInstanceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkInstanceCreateInfo reinterpret(long count) { return new VkInstanceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkInstanceCreateInfo asSlice(long index) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkInstanceCreateInfo asSlice(long index, long count) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkInstanceCreateInfo at(long index, Consumer<VkInstanceCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pApplicationInfoAt(long index) { return (MemorySegment) VH_pApplicationInfo.get(this.segment(), 0L, index); }
    public int enabledLayerCountAt(long index) { return (int) VH_enabledLayerCount.get(this.segment(), 0L, index); }
    public MemorySegment ppEnabledLayerNamesAt(long index) { return (MemorySegment) VH_ppEnabledLayerNames.get(this.segment(), 0L, index); }
    public int enabledExtensionCountAt(long index) { return (int) VH_enabledExtensionCount.get(this.segment(), 0L, index); }
    public MemorySegment ppEnabledExtensionNamesAt(long index) { return (MemorySegment) VH_ppEnabledExtensionNames.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pApplicationInfo() { return (MemorySegment) VH_pApplicationInfo.get(this.segment(), 0L, 0L); }
    public int enabledLayerCount() { return (int) VH_enabledLayerCount.get(this.segment(), 0L, 0L); }
    public MemorySegment ppEnabledLayerNames() { return (MemorySegment) VH_ppEnabledLayerNames.get(this.segment(), 0L, 0L); }
    public int enabledExtensionCount() { return (int) VH_enabledExtensionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment ppEnabledExtensionNames() { return (MemorySegment) VH_ppEnabledExtensionNames.get(this.segment(), 0L, 0L); }
    public VkInstanceCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo pApplicationInfoAt(long index, MemorySegment value) { VH_pApplicationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo enabledLayerCountAt(long index, int value) { VH_enabledLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo ppEnabledLayerNamesAt(long index, MemorySegment value) { VH_ppEnabledLayerNames.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo enabledExtensionCountAt(long index, int value) { VH_enabledExtensionCount.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo ppEnabledExtensionNamesAt(long index, MemorySegment value) { VH_ppEnabledExtensionNames.set(this.segment(), 0L, index, value); return this; }
    public VkInstanceCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo pApplicationInfo(MemorySegment value) { VH_pApplicationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo enabledLayerCount(int value) { VH_enabledLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo ppEnabledLayerNames(MemorySegment value) { VH_ppEnabledLayerNames.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo enabledExtensionCount(int value) { VH_enabledExtensionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkInstanceCreateInfo ppEnabledExtensionNames(MemorySegment value) { VH_ppEnabledExtensionNames.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkInstanceCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkInstanceCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkInstanceCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pApplicationInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pApplicationInfo, index), LAYOUT_pApplicationInfo); }
    public MemorySegment _pApplicationInfo() { return _pApplicationInfoAt(0L); }
    public VkInstanceCreateInfo _pApplicationInfoAt(long index, MemorySegment src) { _pApplicationInfoAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _pApplicationInfo(MemorySegment src) { return _pApplicationInfoAt(0L, src); }
    public MemorySegment _enabledLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enabledLayerCount, index), LAYOUT_enabledLayerCount); }
    public MemorySegment _enabledLayerCount() { return _enabledLayerCountAt(0L); }
    public VkInstanceCreateInfo _enabledLayerCountAt(long index, MemorySegment src) { _enabledLayerCountAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _enabledLayerCount(MemorySegment src) { return _enabledLayerCountAt(0L, src); }
    public MemorySegment _ppEnabledLayerNamesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppEnabledLayerNames, index), LAYOUT_ppEnabledLayerNames); }
    public MemorySegment _ppEnabledLayerNames() { return _ppEnabledLayerNamesAt(0L); }
    public VkInstanceCreateInfo _ppEnabledLayerNamesAt(long index, MemorySegment src) { _ppEnabledLayerNamesAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _ppEnabledLayerNames(MemorySegment src) { return _ppEnabledLayerNamesAt(0L, src); }
    public MemorySegment _enabledExtensionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enabledExtensionCount, index), LAYOUT_enabledExtensionCount); }
    public MemorySegment _enabledExtensionCount() { return _enabledExtensionCountAt(0L); }
    public VkInstanceCreateInfo _enabledExtensionCountAt(long index, MemorySegment src) { _enabledExtensionCountAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _enabledExtensionCount(MemorySegment src) { return _enabledExtensionCountAt(0L, src); }
    public MemorySegment _ppEnabledExtensionNamesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppEnabledExtensionNames, index), LAYOUT_ppEnabledExtensionNames); }
    public MemorySegment _ppEnabledExtensionNames() { return _ppEnabledExtensionNamesAt(0L); }
    public VkInstanceCreateInfo _ppEnabledExtensionNamesAt(long index, MemorySegment src) { _ppEnabledExtensionNamesAt(index).copyFrom(src); return this; }
    public VkInstanceCreateInfo _ppEnabledExtensionNames(MemorySegment src) { return _ppEnabledExtensionNamesAt(0L, src); }
}
