// This file is auto-generated. DO NOT EDIT!
package overrungl.nfd;
import java.lang.foreign.*;
import overrungl.util.*;
import org.graalvm.nativeimage.hosted.Feature;
import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
class ForeignRegistrationFeature implements Feature {
    @Override public void duringSetup(DuringSetupAccess access) {
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, NFDInternal.nfdpathsetsize_t, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid());
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    }
}
