// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineLibraryCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineLibraryCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t libraryCount;
///     const VkPipeline* pLibraries;
/// }
/// ```
public final class VkPipelineLibraryCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withName("pLibraries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_libraryCount = LAYOUT.byteOffset(PathElement.groupElement("libraryCount"));
    public static final long OFFSET_pLibraries = LAYOUT.byteOffset(PathElement.groupElement("pLibraries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_libraryCount = LAYOUT.select(PathElement.groupElement("libraryCount"));
    public static final MemoryLayout LAYOUT_pLibraries = LAYOUT.select(PathElement.groupElement("pLibraries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_libraryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("libraryCount"));
    public static final VarHandle VH_pLibraries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraries"));

    public VkPipelineLibraryCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineLibraryCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineLibraryCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLibraryCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineLibraryCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineLibraryCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR); }
    public static VkPipelineLibraryCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR);
        return s;
    }
    public VkPipelineLibraryCreateInfoKHR copyFrom(VkPipelineLibraryCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineLibraryCreateInfoKHR reinterpret(long count) { return new VkPipelineLibraryCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineLibraryCreateInfoKHR asSlice(long index) { return new VkPipelineLibraryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineLibraryCreateInfoKHR asSlice(long index, long count) { return new VkPipelineLibraryCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineLibraryCreateInfoKHR at(long index, Consumer<VkPipelineLibraryCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int libraryCountAt(long index) { return (int) VH_libraryCount.get(this.segment(), 0L, index); }
    public MemorySegment pLibrariesAt(long index) { return (MemorySegment) VH_pLibraries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int libraryCount() { return (int) VH_libraryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pLibraries() { return (MemorySegment) VH_pLibraries.get(this.segment(), 0L, 0L); }
    public VkPipelineLibraryCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLibraryCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLibraryCreateInfoKHR libraryCountAt(long index, int value) { VH_libraryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLibraryCreateInfoKHR pLibrariesAt(long index, MemorySegment value) { VH_pLibraries.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLibraryCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLibraryCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLibraryCreateInfoKHR libraryCount(int value) { VH_libraryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLibraryCreateInfoKHR pLibraries(MemorySegment value) { VH_pLibraries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineLibraryCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineLibraryCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineLibraryCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineLibraryCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _libraryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_libraryCount, index), LAYOUT_libraryCount); }
    public MemorySegment _libraryCount() { return _libraryCountAt(0L); }
    public VkPipelineLibraryCreateInfoKHR _libraryCountAt(long index, MemorySegment src) { _libraryCountAt(index).copyFrom(src); return this; }
    public VkPipelineLibraryCreateInfoKHR _libraryCount(MemorySegment src) { return _libraryCountAt(0L, src); }
    public MemorySegment _pLibrariesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLibraries, index), LAYOUT_pLibraries); }
    public MemorySegment _pLibraries() { return _pLibrariesAt(0L); }
    public VkPipelineLibraryCreateInfoKHR _pLibrariesAt(long index, MemorySegment src) { _pLibrariesAt(index).copyFrom(src); return this; }
    public VkPipelineLibraryCreateInfoKHR _pLibraries(MemorySegment src) { return _pLibrariesAt(0L, src); }
}
