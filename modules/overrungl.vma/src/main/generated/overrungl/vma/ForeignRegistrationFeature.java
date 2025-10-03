// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;
import java.lang.foreign.*;
import overrungl.util.*;
import org.graalvm.nativeimage.hosted.Feature;
import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
class ForeignRegistrationFeature implements Feature {
    @Override public void duringSetup(DuringSetupAccess access) {
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        registerForUpcall(overrungl.vma.VmaAllocateDeviceMemoryFunction.DESCRIPTOR);
        registerForUpcall(overrungl.vma.VmaFreeDeviceMemoryFunction.DESCRIPTOR);
        registerForUpcall(overrungl.vma.VmaCheckDefragmentationBreakFunction.DESCRIPTOR);
    }
}
