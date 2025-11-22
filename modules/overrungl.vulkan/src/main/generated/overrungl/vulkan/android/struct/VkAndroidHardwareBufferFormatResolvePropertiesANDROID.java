// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAndroidHardwareBufferFormatResolvePropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferFormatResolvePropertiesANDROID {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat colorAttachmentFormat;
/// }
/// ```
public final class VkAndroidHardwareBufferFormatResolvePropertiesANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorAttachmentFormat = LAYOUT.select(PathElement.groupElement("colorAttachmentFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentFormat"));

    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID); }
    public static VkAndroidHardwareBufferFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID);
        return s;
    }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID copyFrom(VkAndroidHardwareBufferFormatResolvePropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID reinterpret(long count) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID at(long index, Consumer<VkAndroidHardwareBufferFormatResolvePropertiesANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorAttachmentFormatAt(long index) { return (int) VH_colorAttachmentFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorAttachmentFormat() { return (int) VH_colorAttachmentFormat.get(this.segment(), 0L, 0L); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID colorAttachmentFormatAt(long index, int value) { VH_colorAttachmentFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID colorAttachmentFormat(int value) { VH_colorAttachmentFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorAttachmentFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentFormat, index), LAYOUT_colorAttachmentFormat); }
    public MemorySegment _colorAttachmentFormat() { return _colorAttachmentFormatAt(0L); }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _colorAttachmentFormatAt(long index, MemorySegment src) { _colorAttachmentFormatAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID _colorAttachmentFormat(MemorySegment src) { return _colorAttachmentFormatAt(0L, src); }
}
