// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayModeStereoPropertiesNV`.
/// ## Layout
/// ```
/// struct VkDisplayModeStereoPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hdmi3DSupported;
/// }
/// ```
public final class VkDisplayModeStereoPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hdmi3DSupported")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hdmi3DSupported = LAYOUT.byteOffset(PathElement.groupElement("hdmi3DSupported"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hdmi3DSupported = LAYOUT.select(PathElement.groupElement("hdmi3DSupported"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hdmi3DSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hdmi3DSupported"));

    public VkDisplayModeStereoPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayModeStereoPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayModeStereoPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayModeStereoPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayModeStereoPropertiesNV alloc(SegmentAllocator allocator) { return new VkDisplayModeStereoPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayModeStereoPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeStereoPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayModeStereoPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV); }
    public static VkDisplayModeStereoPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV);
        return s;
    }
    public VkDisplayModeStereoPropertiesNV copyFrom(VkDisplayModeStereoPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayModeStereoPropertiesNV reinterpret(long count) { return new VkDisplayModeStereoPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayModeStereoPropertiesNV asSlice(long index) { return new VkDisplayModeStereoPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayModeStereoPropertiesNV asSlice(long index, long count) { return new VkDisplayModeStereoPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayModeStereoPropertiesNV at(long index, Consumer<VkDisplayModeStereoPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hdmi3DSupportedAt(long index) { return (int) VH_hdmi3DSupported.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hdmi3DSupported() { return (int) VH_hdmi3DSupported.get(this.segment(), 0L, 0L); }
    public VkDisplayModeStereoPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeStereoPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeStereoPropertiesNV hdmi3DSupportedAt(long index, int value) { VH_hdmi3DSupported.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeStereoPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeStereoPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeStereoPropertiesNV hdmi3DSupported(int value) { VH_hdmi3DSupported.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayModeStereoPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayModeStereoPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayModeStereoPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayModeStereoPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hdmi3DSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hdmi3DSupported, index), LAYOUT_hdmi3DSupported); }
    public MemorySegment _hdmi3DSupported() { return _hdmi3DSupportedAt(0L); }
    public VkDisplayModeStereoPropertiesNV _hdmi3DSupportedAt(long index, MemorySegment src) { _hdmi3DSupportedAt(index).copyFrom(src); return this; }
    public VkDisplayModeStereoPropertiesNV _hdmi3DSupported(MemorySegment src) { return _hdmi3DSupportedAt(0L, src); }
}
