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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

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
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
    public static final int ALC_CAPTURE_SAMPLES = 0x312;
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
    public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alcCreateContext`.
        public static final MethodHandle MH_alcCreateContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcMakeContextCurrent`.
        public static final MethodHandle MH_alcMakeContextCurrent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of `alcProcessContext`.
        public static final MethodHandle MH_alcProcessContext = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcSuspendContext`.
        public static final MethodHandle MH_alcSuspendContext = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcDestroyContext`.
        public static final MethodHandle MH_alcDestroyContext = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcGetCurrentContext`.
        public static final MethodHandle MH_alcGetCurrentContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `alcGetContextsDevice`.
        public static final MethodHandle MH_alcGetContextsDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcOpenDevice`.
        public static final MethodHandle MH_alcOpenDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcCloseDevice`.
        public static final MethodHandle MH_alcCloseDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of `alcGetError`.
        public static final MethodHandle MH_alcGetError = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcIsExtensionPresent`.
        public static final MethodHandle MH_alcIsExtensionPresent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcGetProcAddress`.
        public static final MethodHandle MH_alcGetProcAddress = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcGetEnumValue`.
        public static final MethodHandle MH_alcGetEnumValue = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alcGetString`.
        public static final MethodHandle MH_alcGetString = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alcGetIntegerv`.
        public static final MethodHandle MH_alcGetIntegerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureOpenDevice`.
        public static final MethodHandle MH_alcCaptureOpenDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alcCaptureCloseDevice`.
        public static final MethodHandle MH_alcCaptureCloseDevice = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStart`.
        public static final MethodHandle MH_alcCaptureStart = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureStop`.
        public static final MethodHandle MH_alcCaptureStop = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alcCaptureSamples`.
        public static final MethodHandle MH_alcCaptureSamples = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
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
            var _lookup = OpenALLibrary.lookup();
            PFN_alcCreateContext = _lookup.findOrThrow("alcCreateContext");
            PFN_alcMakeContextCurrent = _lookup.findOrThrow("alcMakeContextCurrent");
            PFN_alcProcessContext = _lookup.findOrThrow("alcProcessContext");
            PFN_alcSuspendContext = _lookup.findOrThrow("alcSuspendContext");
            PFN_alcDestroyContext = _lookup.findOrThrow("alcDestroyContext");
            PFN_alcGetCurrentContext = _lookup.findOrThrow("alcGetCurrentContext");
            PFN_alcGetContextsDevice = _lookup.findOrThrow("alcGetContextsDevice");
            PFN_alcOpenDevice = _lookup.findOrThrow("alcOpenDevice");
            PFN_alcCloseDevice = _lookup.findOrThrow("alcCloseDevice");
            PFN_alcGetError = _lookup.findOrThrow("alcGetError");
            PFN_alcIsExtensionPresent = _lookup.findOrThrow("alcIsExtensionPresent");
            PFN_alcGetProcAddress = _lookup.findOrThrow("alcGetProcAddress");
            PFN_alcGetEnumValue = _lookup.findOrThrow("alcGetEnumValue");
            PFN_alcGetString = _lookup.findOrThrow("alcGetString");
            PFN_alcGetIntegerv = _lookup.findOrThrow("alcGetIntegerv");
            PFN_alcCaptureOpenDevice = _lookup.findOrThrow("alcCaptureOpenDevice");
            PFN_alcCaptureCloseDevice = _lookup.findOrThrow("alcCaptureCloseDevice");
            PFN_alcCaptureStart = _lookup.findOrThrow("alcCaptureStart");
            PFN_alcCaptureStop = _lookup.findOrThrow("alcCaptureStop");
            PFN_alcCaptureSamples = _lookup.findOrThrow("alcCaptureSamples");
        }
        private static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// ALCcontext* alcCreateContext(ALCdevice* device, const ALCint* attrlist);
    /// ```
    public static MemorySegment alcCreateContext(MemorySegment device, MemorySegment attrlist) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCreateContext", device, attrlist); }
        return (MemorySegment) Handles.MH_alcCreateContext.invokeExact(Handles.get().PFN_alcCreateContext, device, attrlist); }
        catch (Throwable e) { throw new RuntimeException("error in alcCreateContext", e); }
    }

    /// ```
    /// ALCboolean alcMakeContextCurrent(ALCcontext* context);
    /// ```
    public static boolean alcMakeContextCurrent(MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcMakeContextCurrent", context); }
        return (((byte) Handles.MH_alcMakeContextCurrent.invokeExact(Handles.get().PFN_alcMakeContextCurrent, context)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcMakeContextCurrent", e); }
    }

    /// ```
    /// void alcProcessContext(ALCcontext* context);
    /// ```
    public static void alcProcessContext(MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcProcessContext", context); }
        Handles.MH_alcProcessContext.invokeExact(Handles.get().PFN_alcProcessContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcProcessContext", e); }
    }

    /// ```
    /// void alcSuspendContext(ALCcontext* context);
    /// ```
    public static void alcSuspendContext(MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcSuspendContext", context); }
        Handles.MH_alcSuspendContext.invokeExact(Handles.get().PFN_alcSuspendContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcSuspendContext", e); }
    }

    /// ```
    /// void alcDestroyContext(ALCcontext* context);
    /// ```
    public static void alcDestroyContext(MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcDestroyContext", context); }
        Handles.MH_alcDestroyContext.invokeExact(Handles.get().PFN_alcDestroyContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcDestroyContext", e); }
    }

    /// ```
    /// ALCcontext* alcGetCurrentContext();
    /// ```
    public static MemorySegment alcGetCurrentContext() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetCurrentContext"); }
        return (MemorySegment) Handles.MH_alcGetCurrentContext.invokeExact(Handles.get().PFN_alcGetCurrentContext); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetCurrentContext", e); }
    }

    /// ```
    /// ALCdevice* alcGetContextsDevice(ALCcontext* context);
    /// ```
    public static MemorySegment alcGetContextsDevice(MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetContextsDevice", context); }
        return (MemorySegment) Handles.MH_alcGetContextsDevice.invokeExact(Handles.get().PFN_alcGetContextsDevice, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetContextsDevice", e); }
    }

    /// ```
    /// ALCdevice* alcOpenDevice(const ALCchar* devicename);
    /// ```
    public static MemorySegment alcOpenDevice(MemorySegment devicename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcOpenDevice", devicename); }
        return (MemorySegment) Handles.MH_alcOpenDevice.invokeExact(Handles.get().PFN_alcOpenDevice, devicename); }
        catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    /// ```
    /// ALCboolean alcCloseDevice(ALCdevice* device);
    /// ```
    public static boolean alcCloseDevice(MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCloseDevice", device); }
        return (((byte) Handles.MH_alcCloseDevice.invokeExact(Handles.get().PFN_alcCloseDevice, device)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcCloseDevice", e); }
    }

    /// ```
    /// (int) ALCenum alcGetError(ALCdevice* device);
    /// ```
    public static int alcGetError(MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetError", device); }
        return (int) Handles.MH_alcGetError.invokeExact(Handles.get().PFN_alcGetError, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetError", e); }
    }

    /// ```
    /// ALCboolean alcIsExtensionPresent(ALCdevice* device, const ALCchar* extname);
    /// ```
    public static boolean alcIsExtensionPresent(MemorySegment device, MemorySegment extname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcIsExtensionPresent", device, extname); }
        return (((byte) Handles.MH_alcIsExtensionPresent.invokeExact(Handles.get().PFN_alcIsExtensionPresent, device, extname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    /// ```
    /// ALCvoid* alcGetProcAddress(ALCdevice* device, const ALCchar* funcname);
    /// ```
    public static MemorySegment alcGetProcAddress(MemorySegment device, MemorySegment funcname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetProcAddress", device, funcname); }
        return (MemorySegment) Handles.MH_alcGetProcAddress.invokeExact(Handles.get().PFN_alcGetProcAddress, device, funcname); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    /// ```
    /// (int) ALCenum alcGetEnumValue(ALCdevice* device, const ALCchar* enumname);
    /// ```
    public static int alcGetEnumValue(MemorySegment device, MemorySegment enumname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetEnumValue", device, enumname); }
        return (int) Handles.MH_alcGetEnumValue.invokeExact(Handles.get().PFN_alcGetEnumValue, device, enumname); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    /// ```
    /// const ALCchar* alcGetString(ALCdevice* device, (int) ALCenum param);
    /// ```
    public static MemorySegment alcGetString(MemorySegment device, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetString", device, param); }
        return (MemorySegment) Handles.MH_alcGetString.invokeExact(Handles.get().PFN_alcGetString, device, param); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    /// ```
    /// void alcGetIntegerv(ALCdevice* device, (int) ALCenum param, (int) ALCsizei size, ALCint* values);
    /// ```
    public static void alcGetIntegerv(MemorySegment device, int param, int size, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetIntegerv", device, param, size, values); }
        Handles.MH_alcGetIntegerv.invokeExact(Handles.get().PFN_alcGetIntegerv, device, param, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetIntegerv", e); }
    }

    /// ```
    /// ALCdevice* alcCaptureOpenDevice(const ALCchar* devicename, (unsigned int) ALCuint frequency, (int) ALCenum format, (int) ALCsizei buffersize);
    /// ```
    public static MemorySegment alcCaptureOpenDevice(MemorySegment devicename, int frequency, int format, int buffersize) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureOpenDevice", devicename, frequency, format, buffersize); }
        return (MemorySegment) Handles.MH_alcCaptureOpenDevice.invokeExact(Handles.get().PFN_alcCaptureOpenDevice, devicename, frequency, format, buffersize); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    /// ```
    /// ALCboolean alcCaptureCloseDevice(ALCdevice* device);
    /// ```
    public static boolean alcCaptureCloseDevice(MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureCloseDevice", device); }
        return (((byte) Handles.MH_alcCaptureCloseDevice.invokeExact(Handles.get().PFN_alcCaptureCloseDevice, device)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureCloseDevice", e); }
    }

    /// ```
    /// void alcCaptureStart(ALCdevice* device);
    /// ```
    public static void alcCaptureStart(MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureStart", device); }
        Handles.MH_alcCaptureStart.invokeExact(Handles.get().PFN_alcCaptureStart, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureStart", e); }
    }

    /// ```
    /// void alcCaptureStop(ALCdevice* device);
    /// ```
    public static void alcCaptureStop(MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureStop", device); }
        Handles.MH_alcCaptureStop.invokeExact(Handles.get().PFN_alcCaptureStop, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureStop", e); }
    }

    /// ```
    /// void alcCaptureSamples(ALCdevice* device, ALCvoid* buffer, (int) ALCsizei samples);
    /// ```
    public static void alcCaptureSamples(MemorySegment device, MemorySegment buffer, int samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureSamples", device, buffer, samples); }
        Handles.MH_alcCaptureSamples.invokeExact(Handles.get().PFN_alcCaptureSamples, device, buffer, samples); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureSamples", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALC() {
    }
}
