// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDriverPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDriverPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDriverId driverID;
///     char driverName[VK_MAX_DRIVER_NAME_SIZE];
///     char driverInfo[VK_MAX_DRIVER_INFO_SIZE];
///     VkConformanceVersion conformanceVersion;
/// }
/// ```
public final class VkPhysicalDeviceDriverPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK12.VK_MAX_DRIVER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK12.VK_MAX_DRIVER_INFO_SIZE, ValueLayout.JAVA_BYTE).withName("driverInfo"),
        overrungl.vulkan.struct.VkConformanceVersion.LAYOUT.withName("conformanceVersion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_driverID = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_driverID = LAYOUT.select(PathElement.groupElement("driverID"));
    public static final MemoryLayout LAYOUT_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    public static final MemoryLayout LAYOUT_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    public static final MemoryLayout LAYOUT_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    public static final VarHandle VH_driverName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
    public static final VarHandle VH_driverInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
    public static final VarHandle VH_conformanceVersion$major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("major"));
    public static final VarHandle VH_conformanceVersion$minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("minor"));
    public static final VarHandle VH_conformanceVersion$subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("subminor"));
    public static final VarHandle VH_conformanceVersion$patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("patch"));

    public VkPhysicalDeviceDriverPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDriverPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDriverPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDriverPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDriverPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDriverPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDriverPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDriverPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDriverPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES); }
    public static VkPhysicalDeviceDriverPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceDriverPropertiesKHR copyFrom(VkPhysicalDeviceDriverPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDriverPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDriverPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceDriverPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDriverPropertiesKHR at(long index, Consumer<VkPhysicalDeviceDriverPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int driverIDAt(long index) { return (int) VH_driverID.get(this.segment(), 0L, index); }
    public byte driverNameAt(long index, long index0) { return (byte) VH_driverName.get(this.segment(), 0L, index, index0); }
    public byte driverInfoAt(long index, long index0) { return (byte) VH_driverInfo.get(this.segment(), 0L, index, index0); }
    public byte conformanceVersion$majorAt(long index) { return (byte) VH_conformanceVersion$major.get(this.segment(), 0L, index); }
    public byte conformanceVersion$minorAt(long index) { return (byte) VH_conformanceVersion$minor.get(this.segment(), 0L, index); }
    public byte conformanceVersion$subminorAt(long index) { return (byte) VH_conformanceVersion$subminor.get(this.segment(), 0L, index); }
    public byte conformanceVersion$patchAt(long index) { return (byte) VH_conformanceVersion$patch.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int driverID() { return (int) VH_driverID.get(this.segment(), 0L, 0L); }
    public byte driverName(long index0) { return (byte) VH_driverName.get(this.segment(), 0L, 0L, index0); }
    public byte driverInfo(long index0) { return (byte) VH_driverInfo.get(this.segment(), 0L, 0L, index0); }
    public byte conformanceVersion$major() { return (byte) VH_conformanceVersion$major.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$minor() { return (byte) VH_conformanceVersion$minor.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$subminor() { return (byte) VH_conformanceVersion$subminor.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$patch() { return (byte) VH_conformanceVersion$patch.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDriverPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverIDAt(long index, int value) { VH_driverID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverNameAt(long index, long index0, byte value) { VH_driverName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverInfoAt(long index, long index0, byte value) { VH_driverInfo.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$majorAt(long index, byte value) { VH_conformanceVersion$major.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$minorAt(long index, byte value) { VH_conformanceVersion$minor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$subminorAt(long index, byte value) { VH_conformanceVersion$subminor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$patchAt(long index, byte value) { VH_conformanceVersion$patch.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverID(int value) { VH_driverID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverName(long index0, byte value) { VH_driverName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR driverInfo(long index0, byte value) { VH_driverInfo.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$major(byte value) { VH_conformanceVersion$major.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$minor(byte value) { VH_conformanceVersion$minor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$subminor(byte value) { VH_conformanceVersion$subminor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion$patch(byte value) { VH_conformanceVersion$patch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _driverIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverID, index), LAYOUT_driverID); }
    public MemorySegment _driverID() { return _driverIDAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _driverIDAt(long index, MemorySegment src) { _driverIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _driverID(MemorySegment src) { return _driverIDAt(0L, src); }
    public MemorySegment _driverNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName); }
    public MemorySegment _driverName() { return _driverNameAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _driverNameAt(long index, MemorySegment src) { _driverNameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _driverName(MemorySegment src) { return _driverNameAt(0L, src); }
    public MemorySegment _driverInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo); }
    public MemorySegment _driverInfo() { return _driverInfoAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _driverInfoAt(long index, MemorySegment src) { _driverInfoAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _driverInfo(MemorySegment src) { return _driverInfoAt(0L, src); }
    public MemorySegment _conformanceVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion); }
    public MemorySegment _conformanceVersion() { return _conformanceVersionAt(0L); }
    public VkPhysicalDeviceDriverPropertiesKHR _conformanceVersionAt(long index, MemorySegment src) { _conformanceVersionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDriverPropertiesKHR _conformanceVersion(MemorySegment src) { return _conformanceVersionAt(0L, src); }
}
