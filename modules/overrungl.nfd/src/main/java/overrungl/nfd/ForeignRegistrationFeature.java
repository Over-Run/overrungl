/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

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
