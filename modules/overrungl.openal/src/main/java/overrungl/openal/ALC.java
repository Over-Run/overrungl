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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.openal;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

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
        /// The method handle of [`alcCreateContext`][#alcCreateContext].
        public static final Supplier<MethodHandle> MH_alcCreateContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcMakeContextCurrent`][#alcMakeContextCurrent].
        public static final Supplier<MethodHandle> MH_alcMakeContextCurrent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        /// The method handle of [`alcProcessContext`][#alcProcessContext].
        public static final Supplier<MethodHandle> MH_alcProcessContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`alcSuspendContext`][#alcSuspendContext].
        public static final Supplier<MethodHandle> MH_alcSuspendContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`alcDestroyContext`][#alcDestroyContext].
        public static final Supplier<MethodHandle> MH_alcDestroyContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetCurrentContext`][#alcGetCurrentContext].
        public static final Supplier<MethodHandle> MH_alcGetCurrentContext = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetContextsDevice`][#alcGetContextsDevice].
        public static final Supplier<MethodHandle> MH_alcGetContextsDevice = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcOpenDevice`][#alcOpenDevice].
        public static final Supplier<MethodHandle> MH_alcOpenDevice = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcCloseDevice`][#alcCloseDevice].
        public static final Supplier<MethodHandle> MH_alcCloseDevice = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetError`][#alcGetError].
        public static final Supplier<MethodHandle> MH_alcGetError = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alcIsExtensionPresent`][#alcIsExtensionPresent].
        public static final Supplier<MethodHandle> MH_alcIsExtensionPresent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetProcAddress`][#alcGetProcAddress].
        public static final Supplier<MethodHandle> MH_alcGetProcAddress = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetEnumValue`][#alcGetEnumValue].
        public static final Supplier<MethodHandle> MH_alcGetEnumValue = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alcGetString`][#alcGetString].
        public static final Supplier<MethodHandle> MH_alcGetString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`alcGetIntegerv`][#alcGetIntegerv].
        public static final Supplier<MethodHandle> MH_alcGetIntegerv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alcCaptureOpenDevice`][#alcCaptureOpenDevice].
        public static final Supplier<MethodHandle> MH_alcCaptureOpenDevice = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alcCaptureCloseDevice`][#alcCaptureCloseDevice].
        public static final Supplier<MethodHandle> MH_alcCaptureCloseDevice = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        /// The method handle of [`alcCaptureStart`][#alcCaptureStart].
        public static final Supplier<MethodHandle> MH_alcCaptureStart = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`alcCaptureStop`][#alcCaptureStop].
        public static final Supplier<MethodHandle> MH_alcCaptureStop = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`alcCaptureSamples`][#alcCaptureSamples].
        public static final Supplier<MethodHandle> MH_alcCaptureSamples = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The function address of [`alcCreateContext`][#alcCreateContext].
        public final MemorySegment PFN_alcCreateContext;
        /// The function address of [`alcMakeContextCurrent`][#alcMakeContextCurrent].
        public final MemorySegment PFN_alcMakeContextCurrent;
        /// The function address of [`alcProcessContext`][#alcProcessContext].
        public final MemorySegment PFN_alcProcessContext;
        /// The function address of [`alcSuspendContext`][#alcSuspendContext].
        public final MemorySegment PFN_alcSuspendContext;
        /// The function address of [`alcDestroyContext`][#alcDestroyContext].
        public final MemorySegment PFN_alcDestroyContext;
        /// The function address of [`alcGetCurrentContext`][#alcGetCurrentContext].
        public final MemorySegment PFN_alcGetCurrentContext;
        /// The function address of [`alcGetContextsDevice`][#alcGetContextsDevice].
        public final MemorySegment PFN_alcGetContextsDevice;
        /// The function address of [`alcOpenDevice`][#alcOpenDevice].
        public final MemorySegment PFN_alcOpenDevice;
        /// The function address of [`alcCloseDevice`][#alcCloseDevice].
        public final MemorySegment PFN_alcCloseDevice;
        /// The function address of [`alcGetError`][#alcGetError].
        public final MemorySegment PFN_alcGetError;
        /// The function address of [`alcIsExtensionPresent`][#alcIsExtensionPresent].
        public final MemorySegment PFN_alcIsExtensionPresent;
        /// The function address of [`alcGetProcAddress`][#alcGetProcAddress].
        public final MemorySegment PFN_alcGetProcAddress;
        /// The function address of [`alcGetEnumValue`][#alcGetEnumValue].
        public final MemorySegment PFN_alcGetEnumValue;
        /// The function address of [`alcGetString`][#alcGetString].
        public final MemorySegment PFN_alcGetString;
        /// The function address of [`alcGetIntegerv`][#alcGetIntegerv].
        public final MemorySegment PFN_alcGetIntegerv;
        /// The function address of [`alcCaptureOpenDevice`][#alcCaptureOpenDevice].
        public final MemorySegment PFN_alcCaptureOpenDevice;
        /// The function address of [`alcCaptureCloseDevice`][#alcCaptureCloseDevice].
        public final MemorySegment PFN_alcCaptureCloseDevice;
        /// The function address of [`alcCaptureStart`][#alcCaptureStart].
        public final MemorySegment PFN_alcCaptureStart;
        /// The function address of [`alcCaptureStop`][#alcCaptureStop].
        public final MemorySegment PFN_alcCaptureStop;
        /// The function address of [`alcCaptureSamples`][#alcCaptureSamples].
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

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `alcCreateContext`.
    /// ```
    /// ALCcontext* alcCreateContext(ALCdevice* device, const ALCint* attrlist);
    /// ```
    public static @NonNull MemorySegment alcCreateContext(@NonNull MemorySegment device, @NonNull MemorySegment attrlist) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCreateContext", device, attrlist); }
        return (MemorySegment) Handles.MH_alcCreateContext.get().invokeExact(Handles.get().PFN_alcCreateContext, device, attrlist); }
        catch (Throwable e) { throw new RuntimeException("error in alcCreateContext", e); }
    }

    /// Invokes `alcMakeContextCurrent`.
    /// ```
    /// ALCboolean alcMakeContextCurrent(ALCcontext* context);
    /// ```
    public static boolean alcMakeContextCurrent(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcMakeContextCurrent", context); }
        return (((byte) Handles.MH_alcMakeContextCurrent.get().invokeExact(Handles.get().PFN_alcMakeContextCurrent, context)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcMakeContextCurrent", e); }
    }

    /// Invokes `alcProcessContext`.
    /// ```
    /// void alcProcessContext(ALCcontext* context);
    /// ```
    public static void alcProcessContext(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcProcessContext", context); }
        Handles.MH_alcProcessContext.get().invokeExact(Handles.get().PFN_alcProcessContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcProcessContext", e); }
    }

    /// Invokes `alcSuspendContext`.
    /// ```
    /// void alcSuspendContext(ALCcontext* context);
    /// ```
    public static void alcSuspendContext(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcSuspendContext", context); }
        Handles.MH_alcSuspendContext.get().invokeExact(Handles.get().PFN_alcSuspendContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcSuspendContext", e); }
    }

    /// Invokes `alcDestroyContext`.
    /// ```
    /// void alcDestroyContext(ALCcontext* context);
    /// ```
    public static void alcDestroyContext(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcDestroyContext", context); }
        Handles.MH_alcDestroyContext.get().invokeExact(Handles.get().PFN_alcDestroyContext, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcDestroyContext", e); }
    }

    /// Invokes `alcGetCurrentContext`.
    /// ```
    /// ALCcontext* alcGetCurrentContext();
    /// ```
    public static @NonNull MemorySegment alcGetCurrentContext() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetCurrentContext"); }
        return (MemorySegment) Handles.MH_alcGetCurrentContext.get().invokeExact(Handles.get().PFN_alcGetCurrentContext); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetCurrentContext", e); }
    }

    /// Invokes `alcGetContextsDevice`.
    /// ```
    /// ALCdevice* alcGetContextsDevice(ALCcontext* context);
    /// ```
    public static @NonNull MemorySegment alcGetContextsDevice(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetContextsDevice", context); }
        return (MemorySegment) Handles.MH_alcGetContextsDevice.get().invokeExact(Handles.get().PFN_alcGetContextsDevice, context); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetContextsDevice", e); }
    }

    /// Invokes `alcOpenDevice`.
    /// ```
    /// ALCdevice* alcOpenDevice(const ALCchar* devicename);
    /// ```
    public static @NonNull MemorySegment alcOpenDevice(@NonNull MemorySegment devicename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcOpenDevice", devicename); }
        return (MemorySegment) Handles.MH_alcOpenDevice.get().invokeExact(Handles.get().PFN_alcOpenDevice, devicename); }
        catch (Throwable e) { throw new RuntimeException("error in alcOpenDevice", e); }
    }

    /// Invokes `alcCloseDevice`.
    /// ```
    /// ALCboolean alcCloseDevice(ALCdevice* device);
    /// ```
    public static boolean alcCloseDevice(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCloseDevice", device); }
        return (((byte) Handles.MH_alcCloseDevice.get().invokeExact(Handles.get().PFN_alcCloseDevice, device)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcCloseDevice", e); }
    }

    /// Invokes `alcGetError`.
    /// ```
    /// (int) ALCenum alcGetError(ALCdevice* device);
    /// ```
    public static int alcGetError(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetError", device); }
        return (int) Handles.MH_alcGetError.get().invokeExact(Handles.get().PFN_alcGetError, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetError", e); }
    }

    /// Invokes `alcIsExtensionPresent`.
    /// ```
    /// ALCboolean alcIsExtensionPresent(ALCdevice* device, const ALCchar* extname);
    /// ```
    public static boolean alcIsExtensionPresent(@NonNull MemorySegment device, @NonNull MemorySegment extname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcIsExtensionPresent", device, extname); }
        return (((byte) Handles.MH_alcIsExtensionPresent.get().invokeExact(Handles.get().PFN_alcIsExtensionPresent, device, extname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcIsExtensionPresent", e); }
    }

    /// Invokes `alcGetProcAddress`.
    /// ```
    /// ALCvoid* alcGetProcAddress(ALCdevice* device, const ALCchar* funcname);
    /// ```
    public static @NonNull MemorySegment alcGetProcAddress(@NonNull MemorySegment device, @NonNull MemorySegment funcname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetProcAddress", device, funcname); }
        return (MemorySegment) Handles.MH_alcGetProcAddress.get().invokeExact(Handles.get().PFN_alcGetProcAddress, device, funcname); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress", e); }
    }

    /// Invokes `alcGetEnumValue`.
    /// ```
    /// (int) ALCenum alcGetEnumValue(ALCdevice* device, const ALCchar* enumname);
    /// ```
    public static int alcGetEnumValue(@NonNull MemorySegment device, @NonNull MemorySegment enumname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetEnumValue", device, enumname); }
        return (int) Handles.MH_alcGetEnumValue.get().invokeExact(Handles.get().PFN_alcGetEnumValue, device, enumname); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetEnumValue", e); }
    }

    /// Invokes `alcGetString`.
    /// ```
    /// const ALCchar* alcGetString(ALCdevice* device, (int) ALCenum param);
    /// ```
    public static @NonNull MemorySegment alcGetString(@NonNull MemorySegment device, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetString", device, param); }
        return (MemorySegment) Handles.MH_alcGetString.get().invokeExact(Handles.get().PFN_alcGetString, device, param); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetString", e); }
    }

    /// Invokes `alcGetIntegerv`.
    /// ```
    /// void alcGetIntegerv(ALCdevice* device, (int) ALCenum param, (int) ALCsizei size, ALCint* values);
    /// ```
    public static void alcGetIntegerv(@NonNull MemorySegment device, int param, int size, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetIntegerv", device, param, size, values); }
        Handles.MH_alcGetIntegerv.get().invokeExact(Handles.get().PFN_alcGetIntegerv, device, param, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetIntegerv", e); }
    }

    /// Invokes `alcCaptureOpenDevice`.
    /// ```
    /// ALCdevice* alcCaptureOpenDevice(const ALCchar* devicename, (unsigned int) ALCuint frequency, (int) ALCenum format, (int) ALCsizei buffersize);
    /// ```
    public static @NonNull MemorySegment alcCaptureOpenDevice(@NonNull MemorySegment devicename, int frequency, int format, int buffersize) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureOpenDevice", devicename, frequency, format, buffersize); }
        return (MemorySegment) Handles.MH_alcCaptureOpenDevice.get().invokeExact(Handles.get().PFN_alcCaptureOpenDevice, devicename, frequency, format, buffersize); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureOpenDevice", e); }
    }

    /// Invokes `alcCaptureCloseDevice`.
    /// ```
    /// ALCboolean alcCaptureCloseDevice(ALCdevice* device);
    /// ```
    public static boolean alcCaptureCloseDevice(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureCloseDevice", device); }
        return (((byte) Handles.MH_alcCaptureCloseDevice.get().invokeExact(Handles.get().PFN_alcCaptureCloseDevice, device)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureCloseDevice", e); }
    }

    /// Invokes `alcCaptureStart`.
    /// ```
    /// void alcCaptureStart(ALCdevice* device);
    /// ```
    public static void alcCaptureStart(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureStart", device); }
        Handles.MH_alcCaptureStart.get().invokeExact(Handles.get().PFN_alcCaptureStart, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureStart", e); }
    }

    /// Invokes `alcCaptureStop`.
    /// ```
    /// void alcCaptureStop(ALCdevice* device);
    /// ```
    public static void alcCaptureStop(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureStop", device); }
        Handles.MH_alcCaptureStop.get().invokeExact(Handles.get().PFN_alcCaptureStop, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureStop", e); }
    }

    /// Invokes `alcCaptureSamples`.
    /// ```
    /// void alcCaptureSamples(ALCdevice* device, ALCvoid* buffer, (int) ALCsizei samples);
    /// ```
    public static void alcCaptureSamples(@NonNull MemorySegment device, @NonNull MemorySegment buffer, int samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcCaptureSamples", device, buffer, samples); }
        Handles.MH_alcCaptureSamples.get().invokeExact(Handles.get().PFN_alcCaptureSamples, device, buffer, samples); }
        catch (Throwable e) { throw new RuntimeException("error in alcCaptureSamples", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALC() {
    }
}
