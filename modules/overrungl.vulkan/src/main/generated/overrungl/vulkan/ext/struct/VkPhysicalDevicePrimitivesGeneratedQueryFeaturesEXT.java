// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 primitivesGeneratedQuery;
///     VkBool32 primitivesGeneratedQueryWithRasterizerDiscard;
///     VkBool32 primitivesGeneratedQueryWithNonZeroStreams;
/// }
/// ```
public final class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQuery"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_primitivesGeneratedQuery = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQuery"));
    public static final long OFFSET_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    public static final long OFFSET_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_primitivesGeneratedQuery = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQuery"));
    public static final MemoryLayout LAYOUT_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    public static final MemoryLayout LAYOUT_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.select(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_primitivesGeneratedQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQuery"));
    public static final VarHandle VH_primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
    public static final VarHandle VH_primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPrimitivesGeneratedQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT); }
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPrimitivesGeneratedQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT copyFrom(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT at(long index, Consumer<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int primitivesGeneratedQueryAt(long index) { return (int) VH_primitivesGeneratedQuery.get(this.segment(), 0L, index); }
    public int primitivesGeneratedQueryWithRasterizerDiscardAt(long index) { return (int) VH_primitivesGeneratedQueryWithRasterizerDiscard.get(this.segment(), 0L, index); }
    public int primitivesGeneratedQueryWithNonZeroStreamsAt(long index) { return (int) VH_primitivesGeneratedQueryWithNonZeroStreams.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int primitivesGeneratedQuery() { return (int) VH_primitivesGeneratedQuery.get(this.segment(), 0L, 0L); }
    public int primitivesGeneratedQueryWithRasterizerDiscard() { return (int) VH_primitivesGeneratedQueryWithRasterizerDiscard.get(this.segment(), 0L, 0L); }
    public int primitivesGeneratedQueryWithNonZeroStreams() { return (int) VH_primitivesGeneratedQueryWithNonZeroStreams.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryAt(long index, int value) { VH_primitivesGeneratedQuery.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscardAt(long index, int value) { VH_primitivesGeneratedQueryWithRasterizerDiscard.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreamsAt(long index, int value) { VH_primitivesGeneratedQueryWithNonZeroStreams.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(int value) { VH_primitivesGeneratedQuery.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(int value) { VH_primitivesGeneratedQueryWithRasterizerDiscard.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(int value) { VH_primitivesGeneratedQueryWithNonZeroStreams.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _primitivesGeneratedQueryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitivesGeneratedQuery, index), LAYOUT_primitivesGeneratedQuery); }
    public MemorySegment _primitivesGeneratedQuery() { return _primitivesGeneratedQueryAt(0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQueryAt(long index, MemorySegment src) { _primitivesGeneratedQueryAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQuery(MemorySegment src) { return _primitivesGeneratedQueryAt(0L, src); }
    public MemorySegment _primitivesGeneratedQueryWithRasterizerDiscardAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitivesGeneratedQueryWithRasterizerDiscard, index), LAYOUT_primitivesGeneratedQueryWithRasterizerDiscard); }
    public MemorySegment _primitivesGeneratedQueryWithRasterizerDiscard() { return _primitivesGeneratedQueryWithRasterizerDiscardAt(0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQueryWithRasterizerDiscardAt(long index, MemorySegment src) { _primitivesGeneratedQueryWithRasterizerDiscardAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQueryWithRasterizerDiscard(MemorySegment src) { return _primitivesGeneratedQueryWithRasterizerDiscardAt(0L, src); }
    public MemorySegment _primitivesGeneratedQueryWithNonZeroStreamsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitivesGeneratedQueryWithNonZeroStreams, index), LAYOUT_primitivesGeneratedQueryWithNonZeroStreams); }
    public MemorySegment _primitivesGeneratedQueryWithNonZeroStreams() { return _primitivesGeneratedQueryWithNonZeroStreamsAt(0L); }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQueryWithNonZeroStreamsAt(long index, MemorySegment src) { _primitivesGeneratedQueryWithNonZeroStreamsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT _primitivesGeneratedQueryWithNonZeroStreams(MemorySegment src) { return _primitivesGeneratedQueryWithNonZeroStreamsAt(0L, src); }
}
