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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The OpenAL context binding.
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
    ///Capture extension
    public static final int ALC_EXT_CAPTURE = 1;
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
    public static final int ALC_CAPTURE_SAMPLES = 0x312;
    public static final int ALC_ENUMERATE_ALL_EXT = 1;
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
    public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcCreateContext`.
        public static final MethodHandle MH_alcCreateContext = RuntimeHelper.downcall(ALInternal.lookup(), "alcCreateContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcMakeContextCurrent`.
        public static final MethodHandle MH_alcMakeContextCurrent = RuntimeHelper.downcall(ALInternal.lookup(), "alcMakeContextCurrent", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcProcessContext`.
        public static final MethodHandle MH_alcProcessContext = RuntimeHelper.downcall(ALInternal.lookup(), "alcProcessContext", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcSuspendContext`.
        public static final MethodHandle MH_alcSuspendContext = RuntimeHelper.downcall(ALInternal.lookup(), "alcSuspendContext", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcDestroyContext`.
        public static final MethodHandle MH_alcDestroyContext = RuntimeHelper.downcall(ALInternal.lookup(), "alcDestroyContext", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcGetCurrentContext`.
        public static final MethodHandle MH_alcGetCurrentContext = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetCurrentContext", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `alcGetContextsDevice`.
        public static final MethodHandle MH_alcGetContextsDevice = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetContextsDevice", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcOpenDevice`.
        public static final MethodHandle MH_alcOpenDevice = RuntimeHelper.downcall(ALInternal.lookup(), "alcOpenDevice", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcCloseDevice`.
        public static final MethodHandle MH_alcCloseDevice = RuntimeHelper.downcall(ALInternal.lookup(), "alcCloseDevice", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcGetError`.
        public static final MethodHandle MH_alcGetError = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcIsExtensionPresent`.
        public static final MethodHandle MH_alcIsExtensionPresent = RuntimeHelper.downcall(ALInternal.lookup(), "alcIsExtensionPresent", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetProcAddress`.
        public static final MethodHandle MH_alcGetProcAddress = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetEnumValue`.
        public static final MethodHandle MH_alcGetEnumValue = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetEnumValue", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alcGetString`.
        public static final MethodHandle MH_alcGetString = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alcGetIntegerv`.
        public static final MethodHandle MH_alcGetIntegerv = RuntimeHelper.downcall(ALInternal.lookup(), "alcGetIntegerv", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureOpenDevice`.
        public static final MethodHandle MH_alcCaptureOpenDevice = RuntimeHelper.downcall(ALInternal.lookup(), "alcCaptureOpenDevice", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alcCaptureCloseDevice`.
        public static final MethodHandle MH_alcCaptureCloseDevice = RuntimeHelper.downcall(ALInternal.lookup(), "alcCaptureCloseDevice", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStart`.
        public static final MethodHandle MH_alcCaptureStart = RuntimeHelper.downcall(ALInternal.lookup(), "alcCaptureStart", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStop`.
        public static final MethodHandle MH_alcCaptureStop = RuntimeHelper.downcall(ALInternal.lookup(), "alcCaptureStop", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureSamples`.
        public static final MethodHandle MH_alcCaptureSamples = RuntimeHelper.downcall(ALInternal.lookup(), "alcCaptureSamples", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    }
    //endregion

    public static @CType("ALCcontext *") java.lang.foreign.MemorySegment alcCreateContext(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCint *") java.lang.foreign.MemorySegment attrlist) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcCreateContext.invokeExact(device, attrlist);
        } catch (Throwable e) { throw new RuntimeException("error in alcCreateContext", e); }
    }

    public static @CType("ALCboolean") boolean alcMakeContextCurrent(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        try {
            return (boolean) Handles.MH_alcMakeContextCurrent.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcMakeContextCurrent", e); }
    }

    public static void alcProcessContext(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        try {
            Handles.MH_alcProcessContext.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcProcessContext", e); }
    }

    public static void alcSuspendContext(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        try {
            Handles.MH_alcSuspendContext.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcSuspendContext", e); }
    }

    public static void alcDestroyContext(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        try {
            Handles.MH_alcDestroyContext.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcDestroyContext", e); }
    }

    public static @CType("ALCcontext *") java.lang.foreign.MemorySegment alcGetCurrentContext() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetCurrentContext.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alcGetCurrentContext", e); }
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcGetContextsDevice(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetContextsDevice.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetContextsDevice", e); }
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcOpenDevice(@CType("const ALCchar*") java.lang.foreign.MemorySegment devicename) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcOpenDevice.invokeExact(devicename);
        } catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcOpenDevice(@CType("const ALCchar*") java.lang.String devicename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcOpenDevice.invokeExact(Marshal.marshal(__overrungl_stack, devicename));
        } catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    public static @CType("ALCboolean") boolean alcCloseDevice(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        try {
            return (boolean) Handles.MH_alcCloseDevice.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCloseDevice", e); }
    }

    public static @CType("ALCenum") int alcGetError(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        try {
            return (int) Handles.MH_alcGetError.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetError", e); }
    }

    public static @CType("ALCboolean") boolean alcIsExtensionPresent(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.foreign.MemorySegment extname) {
        try {
            return (boolean) Handles.MH_alcIsExtensionPresent.invokeExact(device, extname);
        } catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    public static @CType("ALCboolean") boolean alcIsExtensionPresent(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.String extname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_alcIsExtensionPresent.invokeExact(device, Marshal.marshal(__overrungl_stack, extname));
        } catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    public static @CType("ALCvoid *") java.lang.foreign.MemorySegment alcGetProcAddress(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.foreign.MemorySegment funcname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetProcAddress.invokeExact(device, funcname);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    public static @CType("ALCvoid *") java.lang.foreign.MemorySegment alcGetProcAddress(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.String funcname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetProcAddress.invokeExact(device, Marshal.marshal(__overrungl_stack, funcname));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    public static @CType("ALCenum") int alcGetEnumValue(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.foreign.MemorySegment enumname) {
        try {
            return (int) Handles.MH_alcGetEnumValue.invokeExact(device, enumname);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    public static @CType("ALCenum") int alcGetEnumValue(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.String enumname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_alcGetEnumValue.invokeExact(device, Marshal.marshal(__overrungl_stack, enumname));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    public static @CType("const ALCchar*") java.lang.foreign.MemorySegment alcGetString_(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCenum") int param) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetString.invokeExact(device, param);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    public static @CType("const ALCchar*") java.lang.String alcGetString(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCenum") int param) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_alcGetString.invokeExact(device, param));
        } catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    public static void alcGetIntegerv(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCenum") int param, @CType("ALCsizei") int size, @CType("ALCint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alcGetIntegerv.invokeExact(device, param, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetIntegerv", e); }
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcCaptureOpenDevice(@CType("const ALCchar*") java.lang.foreign.MemorySegment devicename, @CType("ALCuint") int frequency, @CType("ALCenum") int format, @CType("ALCsizei") int buffersize) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcCaptureOpenDevice.invokeExact(devicename, frequency, format, buffersize);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcCaptureOpenDevice(@CType("const ALCchar*") java.lang.String devicename, @CType("ALCuint") int frequency, @CType("ALCenum") int format, @CType("ALCsizei") int buffersize) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcCaptureOpenDevice.invokeExact(Marshal.marshal(__overrungl_stack, devicename), frequency, format, buffersize);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    public static @CType("ALCboolean") boolean alcCaptureCloseDevice(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        try {
            return (boolean) Handles.MH_alcCaptureCloseDevice.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureCloseDevice", e); }
    }

    public static void alcCaptureStart(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        try {
            Handles.MH_alcCaptureStart.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureStart", e); }
    }

    public static void alcCaptureStop(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        try {
            Handles.MH_alcCaptureStop.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureStop", e); }
    }

    public static void alcCaptureSamples(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCvoid *") java.lang.foreign.MemorySegment buffer, @CType("ALCsizei") int samples) {
        try {
            Handles.MH_alcCaptureSamples.invokeExact(device, buffer, samples);
        } catch (Throwable e) { throw new RuntimeException("error in alcCaptureSamples", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALC() {
    }
}
