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
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDeviceCreateFlags flags;
///     uint32_t queueCreateInfoCount;
///     const VkDeviceQueueCreateInfo* pQueueCreateInfos;
///     uint32_t enabledLayerCount;
///     const char* const * ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char* const * ppEnabledExtensionNames;
///     const VkPhysicalDeviceFeatures* pEnabledFeatures;
/// };
/// ```
public final class VkDeviceCreateInfo extends GroupType {
    /// The struct layout of `VkDeviceCreateInfo`.
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `queueCreateInfoCount`.
    public static final long OFFSET_queueCreateInfoCount = LAYOUT.byteOffset(PathElement.groupElement("queueCreateInfoCount"));
    /// The memory layout of `queueCreateInfoCount`.
    public static final MemoryLayout LAYOUT_queueCreateInfoCount = LAYOUT.select(PathElement.groupElement("queueCreateInfoCount"));
    /// The [VarHandle] of `queueCreateInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueCreateInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCreateInfoCount"));
    /// The byte offset of `pQueueCreateInfos`.
    public static final long OFFSET_pQueueCreateInfos = LAYOUT.byteOffset(PathElement.groupElement("pQueueCreateInfos"));
    /// The memory layout of `pQueueCreateInfos`.
    public static final MemoryLayout LAYOUT_pQueueCreateInfos = LAYOUT.select(PathElement.groupElement("pQueueCreateInfos"));
    /// The [VarHandle] of `pQueueCreateInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueueCreateInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueCreateInfos"));
    /// The byte offset of `enabledLayerCount`.
    public static final long OFFSET_enabledLayerCount = LAYOUT.byteOffset(PathElement.groupElement("enabledLayerCount"));
    /// The memory layout of `enabledLayerCount`.
    public static final MemoryLayout LAYOUT_enabledLayerCount = LAYOUT.select(PathElement.groupElement("enabledLayerCount"));
    /// The [VarHandle] of `enabledLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    /// The byte offset of `ppEnabledLayerNames`.
    public static final long OFFSET_ppEnabledLayerNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledLayerNames"));
    /// The memory layout of `ppEnabledLayerNames`.
    public static final MemoryLayout LAYOUT_ppEnabledLayerNames = LAYOUT.select(PathElement.groupElement("ppEnabledLayerNames"));
    /// The [VarHandle] of `ppEnabledLayerNames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    /// The byte offset of `enabledExtensionCount`.
    public static final long OFFSET_enabledExtensionCount = LAYOUT.byteOffset(PathElement.groupElement("enabledExtensionCount"));
    /// The memory layout of `enabledExtensionCount`.
    public static final MemoryLayout LAYOUT_enabledExtensionCount = LAYOUT.select(PathElement.groupElement("enabledExtensionCount"));
    /// The [VarHandle] of `enabledExtensionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    /// The byte offset of `ppEnabledExtensionNames`.
    public static final long OFFSET_ppEnabledExtensionNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The memory layout of `ppEnabledExtensionNames`.
    public static final MemoryLayout LAYOUT_ppEnabledExtensionNames = LAYOUT.select(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The [VarHandle] of `ppEnabledExtensionNames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The byte offset of `pEnabledFeatures`.
    public static final long OFFSET_pEnabledFeatures = LAYOUT.byteOffset(PathElement.groupElement("pEnabledFeatures"));
    /// The memory layout of `pEnabledFeatures`.
    public static final MemoryLayout LAYOUT_pEnabledFeatures = LAYOUT.select(PathElement.groupElement("pEnabledFeatures"));
    /// The [VarHandle] of `pEnabledFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pEnabledFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledFeatures"));

    /// Creates `VkDeviceCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceCreateInfo`
    public static VkDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceCreateInfo`
    public static VkDeviceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceCreateInfo copyFrom(VkDeviceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceCreateInfo reinterpret(long count) { return new VkDeviceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `queueCreateInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueCreateInfoCount(MemorySegment segment, long index) { return (int) VH_queueCreateInfoCount.get(segment, 0L, index); }
    /// {@return `queueCreateInfoCount`}
    public int queueCreateInfoCount() { return queueCreateInfoCount(this.segment(), 0L); }
    /// Sets `queueCreateInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueCreateInfoCount(MemorySegment segment, long index, int value) { VH_queueCreateInfoCount.set(segment, 0L, index, value); }
    /// Sets `queueCreateInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo queueCreateInfoCount(int value) { queueCreateInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueueCreateInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueueCreateInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pQueueCreateInfos.get(segment, 0L, index); }
    /// {@return `pQueueCreateInfos`}
    public MemorySegment pQueueCreateInfos() { return pQueueCreateInfos(this.segment(), 0L); }
    /// Sets `pQueueCreateInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueueCreateInfos(MemorySegment segment, long index, MemorySegment value) { VH_pQueueCreateInfos.set(segment, 0L, index, value); }
    /// Sets `pQueueCreateInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pQueueCreateInfos(MemorySegment value) { pQueueCreateInfos(this.segment(), 0L, value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enabledLayerCount(MemorySegment segment, long index) { return (int) VH_enabledLayerCount.get(segment, 0L, index); }
    /// {@return `enabledLayerCount`}
    public int enabledLayerCount() { return enabledLayerCount(this.segment(), 0L); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enabledLayerCount(MemorySegment segment, long index, int value) { VH_enabledLayerCount.set(segment, 0L, index, value); }
    /// Sets `enabledLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledLayerCount(int value) { enabledLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppEnabledLayerNames(MemorySegment segment, long index) { return (MemorySegment) VH_ppEnabledLayerNames.get(segment, 0L, index); }
    /// {@return `ppEnabledLayerNames`}
    public MemorySegment ppEnabledLayerNames() { return ppEnabledLayerNames(this.segment(), 0L); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppEnabledLayerNames(MemorySegment segment, long index, MemorySegment value) { VH_ppEnabledLayerNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledLayerNames(MemorySegment value) { ppEnabledLayerNames(this.segment(), 0L, value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enabledExtensionCount(MemorySegment segment, long index) { return (int) VH_enabledExtensionCount.get(segment, 0L, index); }
    /// {@return `enabledExtensionCount`}
    public int enabledExtensionCount() { return enabledExtensionCount(this.segment(), 0L); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enabledExtensionCount(MemorySegment segment, long index, int value) { VH_enabledExtensionCount.set(segment, 0L, index, value); }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledExtensionCount(int value) { enabledExtensionCount(this.segment(), 0L, value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppEnabledExtensionNames(MemorySegment segment, long index) { return (MemorySegment) VH_ppEnabledExtensionNames.get(segment, 0L, index); }
    /// {@return `ppEnabledExtensionNames`}
    public MemorySegment ppEnabledExtensionNames() { return ppEnabledExtensionNames(this.segment(), 0L); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppEnabledExtensionNames(MemorySegment segment, long index, MemorySegment value) { VH_ppEnabledExtensionNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledExtensionNames(MemorySegment value) { ppEnabledExtensionNames(this.segment(), 0L, value); return this; }

    /// {@return `pEnabledFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pEnabledFeatures(MemorySegment segment, long index) { return (MemorySegment) VH_pEnabledFeatures.get(segment, 0L, index); }
    /// {@return `pEnabledFeatures`}
    public MemorySegment pEnabledFeatures() { return pEnabledFeatures(this.segment(), 0L); }
    /// Sets `pEnabledFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pEnabledFeatures(MemorySegment segment, long index, MemorySegment value) { VH_pEnabledFeatures.set(segment, 0L, index, value); }
    /// Sets `pEnabledFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pEnabledFeatures(MemorySegment value) { pEnabledFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceCreateInfo`
    public VkDeviceCreateInfo asSlice(long index) { return new VkDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceCreateInfo`
    public VkDeviceCreateInfo asSlice(long index, long count) { return new VkDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceCreateInfo at(long index, Consumer<VkDeviceCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `queueCreateInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int queueCreateInfoCountAt(long index) { return queueCreateInfoCount(this.segment(), index); }
    /// Sets `queueCreateInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo queueCreateInfoCountAt(long index, int value) { queueCreateInfoCount(this.segment(), index, value); return this; }

    /// {@return `pQueueCreateInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pQueueCreateInfosAt(long index) { return pQueueCreateInfos(this.segment(), index); }
    /// Sets `pQueueCreateInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pQueueCreateInfosAt(long index, MemorySegment value) { pQueueCreateInfos(this.segment(), index, value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int enabledLayerCountAt(long index) { return enabledLayerCount(this.segment(), index); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledLayerCountAt(long index, int value) { enabledLayerCount(this.segment(), index, value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppEnabledLayerNamesAt(long index) { return ppEnabledLayerNames(this.segment(), index); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledLayerNamesAt(long index, MemorySegment value) { ppEnabledLayerNames(this.segment(), index, value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param index the index of the struct buffer
    public int enabledExtensionCountAt(long index) { return enabledExtensionCount(this.segment(), index); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledExtensionCountAt(long index, int value) { enabledExtensionCount(this.segment(), index, value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppEnabledExtensionNamesAt(long index) { return ppEnabledExtensionNames(this.segment(), index); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledExtensionNamesAt(long index, MemorySegment value) { ppEnabledExtensionNames(this.segment(), index, value); return this; }

    /// {@return `pEnabledFeatures` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pEnabledFeaturesAt(long index) { return pEnabledFeatures(this.segment(), index); }
    /// Sets `pEnabledFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pEnabledFeaturesAt(long index, MemorySegment value) { pEnabledFeatures(this.segment(), index, value); return this; }

}
