// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCacheHeaderVersionDataGraphQCOM`.
/// ## Layout
/// ```
/// struct VkPipelineCacheHeaderVersionDataGraphQCOM {
///     uint32_t headerSize;
///     VkPipelineCacheHeaderVersion headerVersion;
///     VkDataGraphModelCacheTypeQCOM cacheType;
///     uint32_t cacheVersion;
///     uint32_t toolchainVersion[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM];
/// }
/// ```
public final class VkPipelineCacheHeaderVersionDataGraphQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("cacheType"),
        ValueLayout.JAVA_INT.withName("cacheVersion"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.qcom.VKQCOMDataGraphModel.VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM, ValueLayout.JAVA_INT).withName("toolchainVersion")
    );
    public static final long OFFSET_headerSize = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
    public static final long OFFSET_headerVersion = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
    public static final long OFFSET_cacheType = LAYOUT.byteOffset(PathElement.groupElement("cacheType"));
    public static final long OFFSET_cacheVersion = LAYOUT.byteOffset(PathElement.groupElement("cacheVersion"));
    public static final long OFFSET_toolchainVersion = LAYOUT.byteOffset(PathElement.groupElement("toolchainVersion"));
    public static final MemoryLayout LAYOUT_headerSize = LAYOUT.select(PathElement.groupElement("headerSize"));
    public static final MemoryLayout LAYOUT_headerVersion = LAYOUT.select(PathElement.groupElement("headerVersion"));
    public static final MemoryLayout LAYOUT_cacheType = LAYOUT.select(PathElement.groupElement("cacheType"));
    public static final MemoryLayout LAYOUT_cacheVersion = LAYOUT.select(PathElement.groupElement("cacheVersion"));
    public static final MemoryLayout LAYOUT_toolchainVersion = LAYOUT.select(PathElement.groupElement("toolchainVersion"));
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
    public static final VarHandle VH_cacheType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cacheType"));
    public static final VarHandle VH_cacheVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cacheVersion"));
    public static final VarHandle VH_toolchainVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("toolchainVersion"), PathElement.sequenceElement());

    public VkPipelineCacheHeaderVersionDataGraphQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCacheHeaderVersionDataGraphQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionDataGraphQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCacheHeaderVersionDataGraphQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionDataGraphQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCacheHeaderVersionDataGraphQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionDataGraphQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCacheHeaderVersionDataGraphQCOM alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionDataGraphQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCacheHeaderVersionDataGraphQCOM alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheHeaderVersionDataGraphQCOM(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM copyFrom(VkPipelineCacheHeaderVersionDataGraphQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM reinterpret(long count) { return new VkPipelineCacheHeaderVersionDataGraphQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM asSlice(long index) { return new VkPipelineCacheHeaderVersionDataGraphQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM asSlice(long index, long count) { return new VkPipelineCacheHeaderVersionDataGraphQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM at(long index, Consumer<VkPipelineCacheHeaderVersionDataGraphQCOM> func) { func.accept(asSlice(index)); return this; }
    public int headerSizeAt(long index) { return (int) VH_headerSize.get(this.segment(), 0L, index); }
    public int headerVersionAt(long index) { return (int) VH_headerVersion.get(this.segment(), 0L, index); }
    public int cacheTypeAt(long index) { return (int) VH_cacheType.get(this.segment(), 0L, index); }
    public int cacheVersionAt(long index) { return (int) VH_cacheVersion.get(this.segment(), 0L, index); }
    public int toolchainVersionAt(long index, long index0) { return (int) VH_toolchainVersion.get(this.segment(), 0L, index, index0); }
    public int headerSize() { return (int) VH_headerSize.get(this.segment(), 0L, 0L); }
    public int headerVersion() { return (int) VH_headerVersion.get(this.segment(), 0L, 0L); }
    public int cacheType() { return (int) VH_cacheType.get(this.segment(), 0L, 0L); }
    public int cacheVersion() { return (int) VH_cacheVersion.get(this.segment(), 0L, 0L); }
    public int toolchainVersion(long index0) { return (int) VH_toolchainVersion.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerSizeAt(long index, int value) { VH_headerSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerVersionAt(long index, int value) { VH_headerVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheTypeAt(long index, int value) { VH_cacheType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheVersionAt(long index, int value) { VH_cacheVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersionAt(long index, long index0, int value) { VH_toolchainVersion.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerSize(int value) { VH_headerSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerVersion(int value) { VH_headerVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheType(int value) { VH_cacheType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheVersion(int value) { VH_cacheVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(long index0, int value) { VH_toolchainVersion.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _headerSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerSize, index), LAYOUT_headerSize); }
    public MemorySegment _headerSize() { return _headerSizeAt(0L); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _headerSizeAt(long index, MemorySegment src) { _headerSizeAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _headerSize(MemorySegment src) { return _headerSizeAt(0L, src); }
    public MemorySegment _headerVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerVersion, index), LAYOUT_headerVersion); }
    public MemorySegment _headerVersion() { return _headerVersionAt(0L); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _headerVersionAt(long index, MemorySegment src) { _headerVersionAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _headerVersion(MemorySegment src) { return _headerVersionAt(0L, src); }
    public MemorySegment _cacheTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cacheType, index), LAYOUT_cacheType); }
    public MemorySegment _cacheType() { return _cacheTypeAt(0L); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _cacheTypeAt(long index, MemorySegment src) { _cacheTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _cacheType(MemorySegment src) { return _cacheTypeAt(0L, src); }
    public MemorySegment _cacheVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cacheVersion, index), LAYOUT_cacheVersion); }
    public MemorySegment _cacheVersion() { return _cacheVersionAt(0L); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _cacheVersionAt(long index, MemorySegment src) { _cacheVersionAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _cacheVersion(MemorySegment src) { return _cacheVersionAt(0L, src); }
    public MemorySegment _toolchainVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_toolchainVersion, index), LAYOUT_toolchainVersion); }
    public MemorySegment _toolchainVersion() { return _toolchainVersionAt(0L); }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _toolchainVersionAt(long index, MemorySegment src) { _toolchainVersionAt(index).copyFrom(src); return this; }
    public VkPipelineCacheHeaderVersionDataGraphQCOM _toolchainVersion(MemorySegment src) { return _toolchainVersionAt(0L, src); }
}
