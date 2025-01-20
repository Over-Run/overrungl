/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

package overrungl.openal;

import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The OpenAL context related functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class ALC {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int ALC_FALSE = 0;
    public static final int ALC_TRUE = 1;
    public static final int ALC_FREQUENCY = 0x1007;
    public static final int ALC_REFRESH = 0x1008;
    public static final int ALC_SYNC = 0x1009;
    public static final int ALC_MONO_SOURCES = 0x1010;
    public static final int ALC_STEREO_SOURCES = 0x1011;
    public static final int ALC_NO_ERROR = 0;
    public static final int ALC_INVALID_DEVICE = 0xA001;
    public static final int ALC_INVALID_CONTEXT = 0xA002;
    public static final int ALC_INVALID_ENUM = 0xA003;
    public static final int ALC_INVALID_VALUE = 0xA004;
    public static final int ALC_OUT_OF_MEMORY = 0xA005;
    public static final int ALC_MAJOR_VERSION = 0x1000;
    public static final int ALC_MINOR_VERSION = 0x1001;
    public static final int ALC_ATTRIBUTES_SIZE = 0x1002;
    public static final int ALC_ALL_ATTRIBUTES = 0x1003;
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004;
    public static final int ALC_DEVICE_SPECIFIER = 0x1005;
    public static final int ALC_EXTENSIONS = 0x1006;
    public static final int ALC_EXT_CAPTURE = 1;
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
    public static final int ALC_CAPTURE_SAMPLES = 0x312;
    public static final int ALC_ENUMERATE_ALL_EXT = 1;
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
    public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alcCreateContext`.
        public static final MethodHandle MH_alcCreateContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcMakeContextCurrent`.
        public static final MethodHandle MH_alcMakeContextCurrent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcProcessContext`.
        public static final MethodHandle MH_alcProcessContext = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcSuspendContext`.
        public static final MethodHandle MH_alcSuspendContext = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcDestroyContext`.
        public static final MethodHandle MH_alcDestroyContext = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcGetCurrentContext`.
        public static final MethodHandle MH_alcGetCurrentContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `alcGetContextsDevice`.
        public static final MethodHandle MH_alcGetContextsDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcOpenDevice`.
        public static final MethodHandle MH_alcOpenDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcCloseDevice`.
        public static final MethodHandle MH_alcCloseDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcGetError`.
        public static final MethodHandle MH_alcGetError = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcIsExtensionPresent`.
        public static final MethodHandle MH_alcIsExtensionPresent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetProcAddress`.
        public static final MethodHandle MH_alcGetProcAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetEnumValue`.
        public static final MethodHandle MH_alcGetEnumValue = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetString`.
        public static final MethodHandle MH_alcGetString = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alcGetIntegerv`.
        public static final MethodHandle MH_alcGetIntegerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureOpenDevice`.
        public static final MethodHandle MH_alcCaptureOpenDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alcCaptureCloseDevice`.
        public static final MethodHandle MH_alcCaptureCloseDevice = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStart`.
        public static final MethodHandle MH_alcCaptureStart = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStop`.
        public static final MethodHandle MH_alcCaptureStop = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureSamples`.
        public static final MethodHandle MH_alcCaptureSamples = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The function address of `alcCreateContext`.
        public final MemorySegment PFN_alcCreateContext;
        /// The function address of `alcMakeContextCurrent`.
        public final MemorySegment PFN_alcMakeContextCurrent;
        /// The function address of `alcProcessContext`.
        public final MemorySegment PFN_alcProcessContext;
        /// The function address of `alcSuspendContext`.
        public final MemorySegment PFN_alcSuspendContext;
        /// The function address of `alcDestroyContext`.
        public final MemorySegment PFN_alcDestroyContext;
        /// The function address of `alcGetCurrentContext`.
        public final MemorySegment PFN_alcGetCurrentContext;
        /// The function address of `alcGetContextsDevice`.
        public final MemorySegment PFN_alcGetContextsDevice;
        /// The function address of `alcOpenDevice`.
        public final MemorySegment PFN_alcOpenDevice;
        /// The function address of `alcCloseDevice`.
        public final MemorySegment PFN_alcCloseDevice;
        /// The function address of `alcGetError`.
        public final MemorySegment PFN_alcGetError;
        /// The function address of `alcIsExtensionPresent`.
        public final MemorySegment PFN_alcIsExtensionPresent;
        /// The function address of `alcGetProcAddress`.
        public final MemorySegment PFN_alcGetProcAddress;
        /// The function address of `alcGetEnumValue`.
        public final MemorySegment PFN_alcGetEnumValue;
        /// The function address of `alcGetString`.
        public final MemorySegment PFN_alcGetString;
        /// The function address of `alcGetIntegerv`.
        public final MemorySegment PFN_alcGetIntegerv;
        /// The function address of `alcCaptureOpenDevice`.
        public final MemorySegment PFN_alcCaptureOpenDevice;
        /// The function address of `alcCaptureCloseDevice`.
        public final MemorySegment PFN_alcCaptureCloseDevice;
        /// The function address of `alcCaptureStart`.
        public final MemorySegment PFN_alcCaptureStart;
        /// The function address of `alcCaptureStop`.
        public final MemorySegment PFN_alcCaptureStop;
        /// The function address of `alcCaptureSamples`.
        public final MemorySegment PFN_alcCaptureSamples;
        private Handles() {
            PFN_alcCreateContext = ALInternal.lookup().findOrThrow("alcCreateContext");
            PFN_alcMakeContextCurrent = ALInternal.lookup().findOrThrow("alcMakeContextCurrent");
            PFN_alcProcessContext = ALInternal.lookup().findOrThrow("alcProcessContext");
            PFN_alcSuspendContext = ALInternal.lookup().findOrThrow("alcSuspendContext");
            PFN_alcDestroyContext = ALInternal.lookup().findOrThrow("alcDestroyContext");
            PFN_alcGetCurrentContext = ALInternal.lookup().findOrThrow("alcGetCurrentContext");
            PFN_alcGetContextsDevice = ALInternal.lookup().findOrThrow("alcGetContextsDevice");
            PFN_alcOpenDevice = ALInternal.lookup().findOrThrow("alcOpenDevice");
            PFN_alcCloseDevice = ALInternal.lookup().findOrThrow("alcCloseDevice");
            PFN_alcGetError = ALInternal.lookup().findOrThrow("alcGetError");
            PFN_alcIsExtensionPresent = ALInternal.lookup().findOrThrow("alcIsExtensionPresent");
            PFN_alcGetProcAddress = ALInternal.lookup().findOrThrow("alcGetProcAddress");
            PFN_alcGetEnumValue = ALInternal.lookup().findOrThrow("alcGetEnumValue");
            PFN_alcGetString = ALInternal.lookup().findOrThrow("alcGetString");
            PFN_alcGetIntegerv = ALInternal.lookup().findOrThrow("alcGetIntegerv");
            PFN_alcCaptureOpenDevice = ALInternal.lookup().findOrThrow("alcCaptureOpenDevice");
            PFN_alcCaptureCloseDevice = ALInternal.lookup().findOrThrow("alcCaptureCloseDevice");
            PFN_alcCaptureStart = ALInternal.lookup().findOrThrow("alcCaptureStart");
            PFN_alcCaptureStop = ALInternal.lookup().findOrThrow("alcCaptureStop");
            PFN_alcCaptureSamples = ALInternal.lookup().findOrThrow("alcCaptureSamples");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("ALCcontext *") MemorySegment alcCreateContext(@CType("ALCdevice *") MemorySegment device, @CType("const ALCint *") MemorySegment attrlist) {
        try {
            return (MemorySegment) Handles.MH_alcCreateContext.invokeExact(Handles.get().PFN_alcCreateContext, device, attrlist);
        } catch (Throwable e) { throw new RuntimeException("error in alcCreateContext", e); }
    }

    public static @CType("ALCboolean") boolean alcMakeContextCurrent(@CType("ALCcontext *") MemorySegment context) {
        try {
            return (boolean) Handles.MH_alcMakeContextCurrent.invokeExact(Handles.get().PFN_alcMakeContextCurrent, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcMakeContextCurrent", e); }
    }

    public static void alcProcessContext(@CType("ALCcontext *") MemorySegment context) {
        try {
            Handles.MH_alcProcessContext.invokeExact(Handles.get().PFN_alcProcessContext, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcProcessContext", e); }
    }

    public static void alcSuspendContext(@CType("ALCcontext *") MemorySegment context) {
        try {
            Handles.MH_alcSuspendContext.invokeExact(Handles.get().PFN_alcSuspendContext, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcSuspendContext", e); }
    }

    public static void alcDestroyContext(@CType("ALCcontext *") MemorySegment context) {
        try {
            Handles.MH_alcDestroyContext.invokeExact(Handles.get().PFN_alcDestroyContext, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcDestroyContext", e); }
    }

    public static @CType("ALCcontext *") MemorySegment alcGetCurrentContext() {
        try {
            return (MemorySegment) Handles.MH_alcGetCurrentContext.invokeExact(Handles.get().PFN_alcGetCurrentContext);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetCurrentContext", e); }
    }

    public static @CType("ALCdevice *") MemorySegment alcGetContextsDevice(@CType("ALCcontext *") MemorySegment context) {
        try {
            return (MemorySegment) Handles.MH_alcGetContextsDevice.invokeExact(Handles.get().PFN_alcGetContextsDevice, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetContextsDevice", e); }
    }

    public static @CType("ALCdevice *") MemorySegment alcOpenDevice(@CType("const ALCchar*") MemorySegment devicename) {
        try {
            return (MemorySegment) Handles.MH_alcOpenDevice.invokeExact(Handles.get().PFN_alcOpenDevice, devicename);
        } catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    public static @CType("ALCdevice *") MemorySegment alcOpenDevice(@CType("const ALCchar*") String devicename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_alcOpenDevice.invokeExact(Handles.get().PFN_alcOpenDevice, Marshal.marshal(__overrungl_stack, devicename));
        } catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    public static @CType("ALCboolean") boolean alcCloseDevice(@CType("ALCdevice *") MemorySegment device) {
        try {
            return (boolean) Handles.MH_alcCloseDevice.invokeExact(Handles.get().PFN_alcCloseDevice, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCloseDevice", e); }
    }

    public static @CType("ALCenum") int alcGetError(@CType("ALCdevice *") MemorySegment device) {
        try {
            return (int) Handles.MH_alcGetError.invokeExact(Handles.get().PFN_alcGetError, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetError", e); }
    }

    public static @CType("ALCboolean") boolean alcIsExtensionPresent(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") MemorySegment extname) {
        try {
            return (boolean) Handles.MH_alcIsExtensionPresent.invokeExact(Handles.get().PFN_alcIsExtensionPresent, device, extname);
        } catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    public static @CType("ALCboolean") boolean alcIsExtensionPresent(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") String extname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_alcIsExtensionPresent.invokeExact(Handles.get().PFN_alcIsExtensionPresent, device, Marshal.marshal(__overrungl_stack, extname));
        } catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    public static @CType("ALCvoid *") MemorySegment alcGetProcAddress(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") MemorySegment funcname) {
        try {
            return (MemorySegment) Handles.MH_alcGetProcAddress.invokeExact(Handles.get().PFN_alcGetProcAddress, device, funcname);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    public static @CType("ALCvoid *") MemorySegment alcGetProcAddress(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") String funcname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_alcGetProcAddress.invokeExact(Handles.get().PFN_alcGetProcAddress, device, Marshal.marshal(__overrungl_stack, funcname));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    public static @CType("ALCenum") int alcGetEnumValue(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") MemorySegment enumname) {
        try {
            return (int) Handles.MH_alcGetEnumValue.invokeExact(Handles.get().PFN_alcGetEnumValue, device, enumname);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    public static @CType("ALCenum") int alcGetEnumValue(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") String enumname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_alcGetEnumValue.invokeExact(Handles.get().PFN_alcGetEnumValue, device, Marshal.marshal(__overrungl_stack, enumname));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    public static @CType("const ALCchar*") MemorySegment alcGetString_(@CType("ALCdevice *") MemorySegment device, @CType("ALCenum") int param) {
        try {
            return (MemorySegment) Handles.MH_alcGetString.invokeExact(Handles.get().PFN_alcGetString, device, param);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    public static @CType("const ALCchar*") String alcGetString(@CType("ALCdevice *") MemorySegment device, @CType("ALCenum") int param) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_alcGetString.invokeExact(Handles.get().PFN_alcGetString, device, param));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    public static void alcGetIntegerv(@CType("ALCdevice *") MemorySegment device, @CType("ALCenum") int param, @CType("ALCsizei") int size, @CType("ALCint *") MemorySegment values) {
        try {
            Handles.MH_alcGetIntegerv.invokeExact(Handles.get().PFN_alcGetIntegerv, device, param, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetIntegerv", e); }
    }

    public static @CType("ALCdevice *") MemorySegment alcCaptureOpenDevice(@CType("const ALCchar*") MemorySegment devicename, @CType("ALCuint") int frequency, @CType("ALCenum") int format, @CType("ALCsizei") int buffersize) {
        try {
            return (MemorySegment) Handles.MH_alcCaptureOpenDevice.invokeExact(Handles.get().PFN_alcCaptureOpenDevice, devicename, frequency, format, buffersize);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    public static @CType("ALCdevice *") MemorySegment alcCaptureOpenDevice(@CType("const ALCchar*") String devicename, @CType("ALCuint") int frequency, @CType("ALCenum") int format, @CType("ALCsizei") int buffersize) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_alcCaptureOpenDevice.invokeExact(Handles.get().PFN_alcCaptureOpenDevice, Marshal.marshal(__overrungl_stack, devicename), frequency, format, buffersize);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    public static @CType("ALCboolean") boolean alcCaptureCloseDevice(@CType("ALCdevice *") MemorySegment device) {
        try {
            return (boolean) Handles.MH_alcCaptureCloseDevice.invokeExact(Handles.get().PFN_alcCaptureCloseDevice, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureCloseDevice", e); }
    }

    public static void alcCaptureStart(@CType("ALCdevice *") MemorySegment device) {
        try {
            Handles.MH_alcCaptureStart.invokeExact(Handles.get().PFN_alcCaptureStart, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureStart", e); }
    }

    public static void alcCaptureStop(@CType("ALCdevice *") MemorySegment device) {
        try {
            Handles.MH_alcCaptureStop.invokeExact(Handles.get().PFN_alcCaptureStop, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureStop", e); }
    }

    public static void alcCaptureSamples(@CType("ALCdevice *") MemorySegment device, @CType("ALCvoid *") MemorySegment buffer, @CType("ALCsizei") int samples) {
        try {
            Handles.MH_alcCaptureSamples.invokeExact(Handles.get().PFN_alcCaptureSamples, device, buffer, samples);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureSamples", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALC() {
    }
}
