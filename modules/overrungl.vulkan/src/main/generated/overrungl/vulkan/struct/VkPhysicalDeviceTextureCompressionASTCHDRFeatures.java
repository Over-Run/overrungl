// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTextureCompressionASTCHDRFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTextureCompressionASTCHDRFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 textureCompressionASTC_HDR;
/// }
/// ```
public final class VkPhysicalDeviceTextureCompressionASTCHDRFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_HDR")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_textureCompressionASTC_HDR = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_HDR"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_textureCompressionASTC_HDR = LAYOUT.select(PathElement.groupElement("textureCompressionASTC_HDR"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_textureCompressionASTC_HDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_HDR"));

    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES);
        return s;
    }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures copyFrom(VkPhysicalDeviceTextureCompressionASTCHDRFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures reinterpret(long count) { return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures asSlice(long index) { return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures asSlice(long index, long count) { return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures at(long index, Consumer<VkPhysicalDeviceTextureCompressionASTCHDRFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int textureCompressionASTC_HDRAt(long index) { return (int) VH_textureCompressionASTC_HDR.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int textureCompressionASTC_HDR() { return (int) VH_textureCompressionASTC_HDR.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures textureCompressionASTC_HDRAt(long index, int value) { VH_textureCompressionASTC_HDR.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures textureCompressionASTC_HDR(int value) { VH_textureCompressionASTC_HDR.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _textureCompressionASTC_HDRAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureCompressionASTC_HDR, index), LAYOUT_textureCompressionASTC_HDR); }
    public MemorySegment _textureCompressionASTC_HDR() { return _textureCompressionASTC_HDRAt(0L); }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _textureCompressionASTC_HDRAt(long index, MemorySegment src) { _textureCompressionASTC_HDRAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures _textureCompressionASTC_HDR(MemorySegment src) { return _textureCompressionASTC_HDRAt(0L, src); }
}
