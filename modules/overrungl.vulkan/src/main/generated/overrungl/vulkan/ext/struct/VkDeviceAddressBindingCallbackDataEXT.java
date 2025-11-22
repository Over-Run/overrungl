// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceAddressBindingCallbackDataEXT`.
/// ## Layout
/// ```
/// struct VkDeviceAddressBindingCallbackDataEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceAddressBindingFlagsEXT flags;
///     VkDeviceAddress baseAddress;
///     VkDeviceSize size;
///     VkDeviceAddressBindingTypeEXT bindingType;
/// }
/// ```
public final class VkDeviceAddressBindingCallbackDataEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("baseAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("bindingType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_baseAddress = LAYOUT.byteOffset(PathElement.groupElement("baseAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_bindingType = LAYOUT.byteOffset(PathElement.groupElement("bindingType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_baseAddress = LAYOUT.select(PathElement.groupElement("baseAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_bindingType = LAYOUT.select(PathElement.groupElement("bindingType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_baseAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_bindingType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingType"));

    public VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceAddressBindingCallbackDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceAddressBindingCallbackDataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceAddressBindingCallbackDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceAddressBindingCallbackDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceAddressBindingCallbackDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceAddressBindingCallbackDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceAddressBindingCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDeviceAddressBindingCallbackDataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceAddressBindingCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceAddressBindingCallbackDataEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceAddressBindingCallbackDataEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT); }
    public static VkDeviceAddressBindingCallbackDataEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT);
        return s;
    }
    public VkDeviceAddressBindingCallbackDataEXT copyFrom(VkDeviceAddressBindingCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceAddressBindingCallbackDataEXT reinterpret(long count) { return new VkDeviceAddressBindingCallbackDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceAddressBindingCallbackDataEXT asSlice(long index) { return new VkDeviceAddressBindingCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceAddressBindingCallbackDataEXT asSlice(long index, long count) { return new VkDeviceAddressBindingCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceAddressBindingCallbackDataEXT at(long index, Consumer<VkDeviceAddressBindingCallbackDataEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long baseAddressAt(long index) { return (long) VH_baseAddress.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int bindingTypeAt(long index) { return (int) VH_bindingType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long baseAddress() { return (long) VH_baseAddress.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public int bindingType() { return (int) VH_bindingType.get(this.segment(), 0L, 0L); }
    public VkDeviceAddressBindingCallbackDataEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT baseAddressAt(long index, long value) { VH_baseAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT bindingTypeAt(long index, int value) { VH_bindingType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT baseAddress(long value) { VH_baseAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceAddressBindingCallbackDataEXT bindingType(int value) { VH_bindingType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _baseAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseAddress, index), LAYOUT_baseAddress); }
    public MemorySegment _baseAddress() { return _baseAddressAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _baseAddressAt(long index, MemorySegment src) { _baseAddressAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _baseAddress(MemorySegment src) { return _baseAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _bindingTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindingType, index), LAYOUT_bindingType); }
    public MemorySegment _bindingType() { return _bindingTypeAt(0L); }
    public VkDeviceAddressBindingCallbackDataEXT _bindingTypeAt(long index, MemorySegment src) { _bindingTypeAt(index).copyFrom(src); return this; }
    public VkDeviceAddressBindingCallbackDataEXT _bindingType(MemorySegment src) { return _bindingTypeAt(0L, src); }
}
