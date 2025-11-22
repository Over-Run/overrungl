// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExtensionProperties`.
/// ## Layout
/// ```
/// struct VkExtensionProperties {
///     char extensionName[VK_MAX_EXTENSION_NAME_SIZE];
///     uint32_t specVersion;
/// }
/// ```
public final class VkExtensionProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    public static final long OFFSET_extensionName = LAYOUT.byteOffset(PathElement.groupElement("extensionName"));
    public static final long OFFSET_specVersion = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
    public static final MemoryLayout LAYOUT_extensionName = LAYOUT.select(PathElement.groupElement("extensionName"));
    public static final MemoryLayout LAYOUT_specVersion = LAYOUT.select(PathElement.groupElement("specVersion"));
    public static final VarHandle VH_extensionName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extensionName"), PathElement.sequenceElement());
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));

    public VkExtensionProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExtensionProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkExtensionProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExtensionProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExtensionProperties alloc(SegmentAllocator allocator) { return new VkExtensionProperties(allocator.allocate(LAYOUT), 1); }
    public static VkExtensionProperties alloc(SegmentAllocator allocator, long count) { return new VkExtensionProperties(allocator.allocate(LAYOUT, count), count); }
    public VkExtensionProperties copyFrom(VkExtensionProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExtensionProperties reinterpret(long count) { return new VkExtensionProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExtensionProperties asSlice(long index) { return new VkExtensionProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExtensionProperties asSlice(long index, long count) { return new VkExtensionProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExtensionProperties at(long index, Consumer<VkExtensionProperties> func) { func.accept(asSlice(index)); return this; }
    public byte extensionNameAt(long index, long index0) { return (byte) VH_extensionName.get(this.segment(), 0L, index, index0); }
    public int specVersionAt(long index) { return (int) VH_specVersion.get(this.segment(), 0L, index); }
    public byte extensionName(long index0) { return (byte) VH_extensionName.get(this.segment(), 0L, 0L, index0); }
    public int specVersion() { return (int) VH_specVersion.get(this.segment(), 0L, 0L); }
    public VkExtensionProperties extensionNameAt(long index, long index0, byte value) { VH_extensionName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkExtensionProperties specVersionAt(long index, int value) { VH_specVersion.set(this.segment(), 0L, index, value); return this; }
    public VkExtensionProperties extensionName(long index0, byte value) { VH_extensionName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkExtensionProperties specVersion(int value) { VH_specVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _extensionNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extensionName, index), LAYOUT_extensionName); }
    public MemorySegment _extensionName() { return _extensionNameAt(0L); }
    public VkExtensionProperties _extensionNameAt(long index, MemorySegment src) { _extensionNameAt(index).copyFrom(src); return this; }
    public VkExtensionProperties _extensionName(MemorySegment src) { return _extensionNameAt(0L, src); }
    public MemorySegment _specVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_specVersion, index), LAYOUT_specVersion); }
    public MemorySegment _specVersion() { return _specVersionAt(0L); }
    public VkExtensionProperties _specVersionAt(long index, MemorySegment src) { _specVersionAt(index).copyFrom(src); return this; }
    public VkExtensionProperties _specVersion(MemorySegment src) { return _specVersionAt(0L, src); }
}
