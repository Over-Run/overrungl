// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryKeyKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryKeyKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t keySize;
///     uint8_t key[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR];
/// }
/// ```
public final class VkPipelineBinaryKeyKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("keySize"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR, ValueLayout.JAVA_BYTE).withName("key")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_keySize = LAYOUT.byteOffset(PathElement.groupElement("keySize"));
    public static final long OFFSET_key = LAYOUT.byteOffset(PathElement.groupElement("key"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_keySize = LAYOUT.select(PathElement.groupElement("keySize"));
    public static final MemoryLayout LAYOUT_key = LAYOUT.select(PathElement.groupElement("key"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_keySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("keySize"));
    public static final VarHandle VH_key = LAYOUT.arrayElementVarHandle(PathElement.groupElement("key"), PathElement.sequenceElement());

    public VkPipelineBinaryKeyKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryKeyKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryKeyKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryKeyKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryKeyKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeyKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryKeyKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryKeyKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineBinaryKeyKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR); }
    public static VkPipelineBinaryKeyKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR);
        return s;
    }
    public VkPipelineBinaryKeyKHR copyFrom(VkPipelineBinaryKeyKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryKeyKHR reinterpret(long count) { return new VkPipelineBinaryKeyKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryKeyKHR asSlice(long index) { return new VkPipelineBinaryKeyKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryKeyKHR asSlice(long index, long count) { return new VkPipelineBinaryKeyKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryKeyKHR at(long index, Consumer<VkPipelineBinaryKeyKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int keySizeAt(long index) { return (int) VH_keySize.get(this.segment(), 0L, index); }
    public byte keyAt(long index, long index0) { return (byte) VH_key.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int keySize() { return (int) VH_keySize.get(this.segment(), 0L, 0L); }
    public byte key(long index0) { return (byte) VH_key.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineBinaryKeyKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeyKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeyKHR keySizeAt(long index, int value) { VH_keySize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeyKHR keyAt(long index, long index0, byte value) { VH_key.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineBinaryKeyKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryKeyKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryKeyKHR keySize(int value) { VH_keySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryKeyKHR key(long index0, byte value) { VH_key.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineBinaryKeyKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeyKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineBinaryKeyKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeyKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _keySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_keySize, index), LAYOUT_keySize); }
    public MemorySegment _keySize() { return _keySizeAt(0L); }
    public VkPipelineBinaryKeyKHR _keySizeAt(long index, MemorySegment src) { _keySizeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeyKHR _keySize(MemorySegment src) { return _keySizeAt(0L, src); }
    public MemorySegment _keyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_key, index), LAYOUT_key); }
    public MemorySegment _key() { return _keyAt(0L); }
    public VkPipelineBinaryKeyKHR _keyAt(long index, MemorySegment src) { _keyAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeyKHR _key(MemorySegment src) { return _keyAt(0L, src); }
}
